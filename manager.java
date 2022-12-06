package javaapplication5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class manager {
    String name;
    int mid; 
    public manager(){
    System.out.println("I am manager");
    name="";
    mid=0;
    };
    public manager(String Name,int managerid){
    
    System.out.println("I am manager");
    name=Name;
    mid=managerid;
    };
    public void Update_Name(String Name){
    name=Name;
    };
    public void UPDATE_id(int ID){
    mid=ID;
    };
    public String get_Name(){
    return name;
    };
    public int get_mid(){
    return mid; 
    };
   
}

