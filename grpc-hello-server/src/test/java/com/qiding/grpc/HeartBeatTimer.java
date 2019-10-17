package com.qiding.grpc;

import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.TimerTask;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class HeartBeatTimer {
    private final HashedWheelTimer heartBeatTimer = new HashedWheelTimer();

    @Test
    public void testTimeOut(){


        CountDownLatch countDownLatch=new CountDownLatch(2);

        AtomicInteger count=new AtomicInteger(1);
        TimerTask timerTask= t->{
            System.out.println("222");
            countDownLatch.countDown();
        };
        Timeout timeout = heartBeatTimer.newTimeout(t -> {
            System.out.println("11111");
            countDownLatch.countDown();
        },10, TimeUnit.SECONDS);
        try {
            //heartBeatTimer.start();
            heartBeatTimer.newTimeout(timerTask,20, TimeUnit.SECONDS);
            System.out.println("开始计时");
            System.out.println("xxxxxx"+heartBeatTimer.pendingTimeouts());
            countDownLatch.await();
            System.out.println("超时完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
