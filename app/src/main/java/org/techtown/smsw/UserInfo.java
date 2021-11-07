package org.techtown.smsw;

public class UserInfo {
    private String name;
    private String occupation;
    private String status;

    public UserInfo(String name, String occupation, String status){
        this.name = name;
        this.occupation = occupation;
        this.status = status;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getOccupation(){
        return this.occupation;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
