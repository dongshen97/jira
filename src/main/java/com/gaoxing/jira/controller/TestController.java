package com.gaoxing.jira.controller;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

/**
 * Created by gaoxing on 2017/7/8.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/v1/test", method = RequestMethod.GET)
    public Callable<String> test() {
        return () -> {
            BasicCredentials creds = new BasicCredentials("jinsheng", "jinsheng");
            JiraClient jira = new JiraClient("http://j.kyee.com.cn/", creds);
            Issue issue = jira.getIssue("IOTBEDSIDE-123",null,"changelog");
            return "test";
        };
    }
}
