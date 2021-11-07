package org.techtown.smsw;

class PostInfo {
    private String title;
    private String contents;
    private String publisher;
    private String time;


    public PostInfo(String title, String contents, String publisher, String time){
        this.title = title;
        this.contents = contents;
        this.publisher = publisher;
        this.time = time;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getContents(){
        return this.contents;
    }
    public void setContents(String contents){
        this.contents = contents;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public void setPublisher(String publisher){
        this.title = publisher;
    }
    public String getTime(){
        return this.time;
    }
    public void setTime(String title){
        this.time = time;
    }
}

