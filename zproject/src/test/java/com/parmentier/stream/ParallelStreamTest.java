package com.parmentier.stream;

import org.junit.Test;

import java.util.concurrent.ForkJoinPool;

public class ParallelStreamTest {

    @Test
    public void testAmountOfAvailablePhysicalCPUt(){
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println(commonPool.getParallelism());    // 3
    }

}
