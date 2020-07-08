package org.example.ttl;

import com.vucko.ttl.ExecutorServiceWrapper;

import java.util.concurrent.*;

public class ExecutorKit {

    private ExecutorKit() {}


    public static ExecutorService newFixedThreadPool(int i) {

        ExecutorService executorService = Executors.newFixedThreadPool(i);
        return new ExecutorServiceWrapper(executorService);
    }


}
