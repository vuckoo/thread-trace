package org.example.ttl;

import java.util.concurrent.Executor;

public class ExecutorWrapper implements Executor {

    private Executor executor;

    ExecutorWrapper(Executor executor){
        this.executor = executor;
    }

    @Override
    public void execute(Runnable command) {

        executor.execute(new RunnableWrapper(command));
    }
}
