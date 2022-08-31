/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuankemis;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class FormObject {
    public ControlObject theControlObject;
    public Course theCourse[];
    
    public FormObject()
    {
        
    }
    public void GetCourseInfo()
    {
       
    }
    public void ShowInfo(Component com,String strinfo)
    {
        JOptionPane.showMessageDialog(com, strinfo);    
    }
    public void ShowSuccessInfo(Component com,String strinfo)
    {
        JOptionPane.showMessageDialog(com, strinfo);    
    }
   
    public void ShowConfirmPage(String strInfo)
    {
        
    }
    public void ConfirmDelete()
    {
                
    }
    public void SelectCommand()
    {
        
    }
    public void DisplayCourseList(Course[] courselist)
    {
        
    }
    
    public void QuerySelectedCourse(int studentID)
    {
        
    }
}
