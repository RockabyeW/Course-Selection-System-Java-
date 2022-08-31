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
public class Course {  
    String courseID;
    private String coursename;
    private String teacherid;
    private String coursetime;
    private int maxstudents;
    private int selectedstudents;
    
    public Course()
    {
        
    }
    public Course(int courseID,String coursename,String teacherid)
    {   courseID=courseID;
        coursename=coursename;    
        teacherid=teacherid;
    }
    public void GetCourseInfo()
    {
        
    }
    public void DestroyCourse()
    {
        
    }
    public String getcourseName()
    {
        return coursename;
    }
    public void setcourseName(String coursename)
    {
        this.coursename=coursename;
    }
    public String GetcourseTime()
    {
        return coursetime;
    }
    public void setcourseTime(String coursetime)
    {
        this.coursetime=coursetime;
    }
    public String GetcourseID()
    {
        return courseID;
    }
    public void setcourseID(String courseID)
    {
        this.courseID=courseID;
    }
    public String GetTeacherID()
    {
        return teacherid;
    }
    public void SetTeacherID(String teacherid)
    {
        this.teacherid=teacherid;
    }
    public Integer GetmaxStudents()
    {
        return maxstudents;
    }
    public void SetmaxStudents(Integer maxstudents)
    {
        this.maxstudents=maxstudents;
    }
    
    public Integer GetSelectedStudents()
    {
        return selectedstudents;
    }
    public void SetSelectedStudents(Integer selectedstudents)
    {
        this.selectedstudents=selectedstudents;
    }
}

