package com.gaoxing.jira.utils;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.JiraClient;

/**
 * Created by gaoxing on 2017/7/11.
 */
public class JiraUtil {

    public static JiraClient getJiraClient(){
        BasicCredentials creds = new BasicCredentials("jinsheng", "jinsheng");
        JiraClient jira = new JiraClient("http://j.kyee.com.cn/", creds);
        return jira;
    }
}
