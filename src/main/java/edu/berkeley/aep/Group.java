package edu.berkeley.aep;

public class Group {
    private String groupName;
    private int num;

    public Group(String groupName, int num){
        this.groupName = groupName;
        this.num = num;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public int getNum() {
        return this.num;
    }
}
