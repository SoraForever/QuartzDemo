package com.jlyang.demo.spring;

import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MyCron extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) {
        String printTime = new SimpleDateFormat("yy-MM-dd HH-mm-ss").format(new Date());
        System.out.println("PrintWordsJob start at:" + printTime + ", prints: Hello Job-" + new Random().nextInt(100));
    }
}
