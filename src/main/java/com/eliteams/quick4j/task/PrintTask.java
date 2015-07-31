package com.eliteams.quick4j.task;

/**
 * Created by dengjianping on 2015/7/31.
 */
public class PrintTask extends java.util.TimerTask {
    private int index;
    @Override
    public void run() {
        System.out.println("========Task======="+index++);
    }
}
