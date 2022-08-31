/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuankemis;

/**
 *
 * @author Administrator
 */
public class Student extends People{
    private String studentID;
    private String spassword;
    private String ssex;
    private String smajor;
    private String stele;
    
    public Student()
    {
       super(); 
    }
    public Student(String studentID)
    {
        super();
        studentID=studentID;
    }
    public Student(String studentID,String spassword) {
        super();
        studentID=studentID;
        spassword=spassword;
    }
    
    public String GetStudentID(){
        return studentID;
    }
    public void setStudentID(String studentID)
    {
        this.studentID=studentID;
    }
    
    public String GetSpassword(){
        return spassword;
    }
    public void setSpassword(String spassword)
    {
        this.spassword=spassword;
    }
    public String Getssex(){
        return ssex;
    }
    public void setssex(String ssex)
    {
        this.ssex=ssex;
    }
 public String Getsmajor(){
        return smajor;
    }
    public void setsmajor(String smajor)
    {
        this.smajor=smajor;
    }
 public String Getstele(){
        return stele;
    }
    public void setstele(String stele)
    {
        this.stele=stele;
    }    
    
    
    
    
}
