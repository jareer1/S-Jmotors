package javaapplication5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class workshopmanager extends manager{
    int outletid;
   // staff* s;
    
    public workshopmanager(){
        super();
        outletid=0;
    };//code
    public workshopmanager(int staffid,int Outletid,String name,int managerid){
     super(name,managerid);
        outletid=Outletid;
        
   
    
    };//code
     public int get_outletid(){
        return outletid;
    };//Code}
     
     //setters
    public void set_outletid(int Outletid){
    outletid=Outletid;
    }//code}
    
    //functions
    public void createmaintainceschedule(){};
    
    public boolean approveleave(){
    boolean ans;
    //click button for ans then return ans
    ans=false;
    return ans;};
    public void managestaff(){};//staff*s){}
    public void annualreportview(){
    //create view report pop screen for employee working under staff
    
    }//code;
    public void monthlyreportview(){}//code;
    
}
