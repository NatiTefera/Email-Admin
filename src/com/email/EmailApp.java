package com.email;

import java.util.*;
public class EmailApp {
   private Scanner scan = new Scanner(System.in);
   private String firstName;
   private String lastName;
   private String email;
   private String password;
   private String department;
   private int passwordLength = 10;
   private int mailboxCapacity = 500;
   private String companySuffix = "company.com";
   private String alternateEmail;
   //Constructor to recieve first and last name
   public EmailApp(String fname, String lname){
       this.firstName = fname;
       this.lastName = lname;
       this.department = setDepartment();
       this.password = randomPassword(passwordLength);
       // Combine elements to generate email
       email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;

   }
    // Ask for the department
    private String setDepartment(){
        System.out.print("Enter the department\n1 for Sale\n2 for Development\n3 for Accounting\nChoice:");
        int input = scan. nextInt();
        if(input == 1){return "sales";}
        else if(input == 2){return "dev";}
        else if(input == 3){return "acct";}
        else{return "";}

   }
    // Generate a random password
    private String randomPassword(int length){
       // A set to choose a random character from
       String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
       char[]password = new char[length];
       for(int i=0;i<length;i++){
          int rand = (int)(Math.random()*passwordSet.length());
          password[i] = passwordSet.charAt(rand);
       }
       // Returning a string version of the array
       return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
       this.mailboxCapacity = capacity;
    }
    // Set the alternate email
    public void setAlternateEmail(String altmail){
       this.alternateEmail = altmail;
    }
    // Change the password
    public void changePassword(String password){
       this.password = password;
    }
    public void getMailBoxCapacity(){
        System.out.println(mailboxCapacity);
    }
    public void getAlternateEmail(){
        System.out.println(alternateEmail);
    }
    public void getPassword(){
        System.out.println(password);
    }
    public void showInfo(){
        System.out.println("NAME: "+this.firstName+" "+this.lastName);
        System.out.println("COMPANY EMAIL: "+this.email);
        System.out.println("MAILBOX CAPACITY: "+this.mailboxCapacity+"mb");
    }
}
