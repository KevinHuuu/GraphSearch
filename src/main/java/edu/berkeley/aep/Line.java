package edu.berkeley.aep;

import java.util.LinkedList;

public class Line {
    private LinkedList llist = new LinkedList();
    public void Line(){
        this.llist = new LinkedList();
    }
    public void addNewGroup(Group group){
        this.llist.add(group);
    }
    public int numOfGroups(){
        int res = 0;
        while(!llist.isEmpty()){
            int crtGuestNum = 0;
            for (Object obj: llist){
                Group crtGroup = (Group) obj;
                if (crtGuestNum < 4 && crtGroup.getNum() + crtGuestNum <=4){
                    crtGuestNum = crtGuestNum + crtGroup.getNum();
                    llist.remove(crtGroup);
                }
            }
            res = res + 1;
        }
        return res;
    }
}
