package com.wisely.highlight_spring4.ch2.profile;

/**
 * Created by scofield on 17/2/28.
 */
public class DemoBean {
    private String content;
    public DemoBean(String content){
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
