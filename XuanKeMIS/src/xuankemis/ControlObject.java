/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuankemis;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import xuankemis.StringUtil;
/**
 *
 * @author Administrator
 */
public class ControlObject {
    public DataBase database;
    public FormObject theFormObject;
    public Course theCourse[];
    Connection con = null;
    
    public ControlObject()
    {
        
    }
    
    public boolean VerifyCourse(Course course)
    {
     return true;    
    }     
    public Boolean CanAdd(Connection con,String tablename,String columnname,String sno) throws SQLException
    {
        
	String sql="select * from " + tablename + " where " + columnname  + " = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,sno);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return false;
        }
             else
             {
            return true;
            }
        }
       
    public Boolean CanModify(Connection con,String tablename,String columnname,String sno) throws SQLException
    {
        String sql="select * from " + tablename + " where " + columnname  + " = ? ";
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,sno);
        ResultSet rs=pstmt.executeQuery();       
        if (rs.next()){
             return true;
        }
             else
             {
            return false;
            }
    }
    
    public Boolean QueryCourseByID(int CourseID)
    {
      return true;  
    }
    public int ConfirmDelete(Component com,String str,String no)
    {
       int n= JOptionPane.showConfirmDialog(com, "确定要删除" + str + no +"吗？");  
       return n;
    }
    
    public ResultSet QueryList(Connection con,String tablename,String columnname,String pno) throws SQLException
    {
        String sql="";
        
    if (pno.isEmpty()){
        sql="select * from " + tablename;
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        return pstmt.executeQuery();
    }
        else 
    {
        sql="select * from " + tablename + " where " + columnname  + " = ? "; 
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,pno);
        return pstmt.executeQuery();
    }             
           
    }
    
    public Student VerifyStudent(Connection con,Student student) throws Exception{
        Student resultStu=null;
	String sql="select * from sinfo where Sno=? and Spassword=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        
        pstmt.setString(1,student.GetStudentID());
        pstmt.setString(2, student.GetSpassword());
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){
           
            resultStu=new Student();
            resultStu.setStudentID(rs.getString("Sno"));
            resultStu.setSpassword(rs.getString("Spassword"));     
        }
      
       return resultStu;
        }
    
    public Administrator VerifyAdministrator(Connection con, Administrator admin) throws Exception{
        Administrator resultAdmin=null;       
	String sql="select * from adminlogin where adminID=? and password=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,admin.GetAdministratorID());
        pstmt.setString(2, admin.GetAdpassword());
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){
            resultAdmin=new Administrator();
            resultAdmin.setAdministratorID(rs.getString("adminID"));
            resultAdmin.setAdpassword(rs.getString("password"));
        }
       return resultAdmin;
        }
   
    public int studentAdd(Connection con,Student student)throws Exception{
		String sql="insert into sinfo values(?,?,?,?,?,?)";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,student.GetStudentID());
		pstmt.setString(2,student.GetSpassword());
		pstmt.setString(3,student.GetName());
                pstmt.setString(4,student.Getssex());
                pstmt.setString(5,student.Getsmajor());
                pstmt.setString(6,student.Getstele());
		return pstmt.executeUpdate();
    }
    public int studentModify(Connection con, Student student)throws Exception{
		String sql="update sinfo set Spassword = ? ,Sname = ?, Ssex = ?, Smajor = ?,Stele = ? where Sno = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1,student.GetSpassword());
		pstmt.setString(2,student.GetName());
                pstmt.setString(3,student.Getssex());
                pstmt.setString(4,student.Getsmajor());
                pstmt.setString(5,student.Getstele());
                pstmt.setString(6,student.GetStudentID());
		return pstmt.executeUpdate();
	}
    public int studentDelete(Connection con, String Sno) throws SQLException {
       //To change body of generated methods, choose Tools | Templates.
        String sql = "delete from sinfo where sno=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, Sno);
        return pstmt.executeUpdate();
    }
    
    public ResultSet StudentList(Connection con, Student student) throws SQLException {
        /**StringBuffer sb = new StringBuffer("select * from slogin ");
        if (student.getSno() != "") {
            sb.append("where Sno='" + student.getSno() + "'");
        }
        PreparedStatement pstmt = con.prepareStatement(sb.toString());*/
        StringBuffer sb = new StringBuffer("select * from sinfo");
        /**if (student.getSno() != "") {
            sb.append(" and Sno=" + student.getSno());
        }*/
        if (StringUtil.isNotEmpty(student.GetStudentID())) {
            sb.append(" and Sno ='" + student.GetStudentID() + "'");
        }
        PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
        return pstmt.executeQuery();

    }
public ResultSet QueryCourse(Connection con,String searchCondition,String searchContent) throws SQLException
    {
        String sql="";
        if (searchContent.isEmpty()){
        sql="select * from t_course";       
        PreparedStatement pstmt=con.prepareStatement(sql);
        return pstmt.executeQuery();
    }
        else{
        sql ="select * from t_course where " +  searchCondition + "  = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql); 
        System.out.println(sql);
        pstmt.setString(1,searchContent);
         return pstmt.executeQuery();        
        }
    }
    public int AddCourse(Connection con,Course course) throws Exception
    {
        String sql="insert into t_course values(?,?,?,?,?,?)";
	PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,course.GetcourseID());
		pstmt.setString(2,course.getcourseName());
		pstmt.setString(3,course.GetTeacherID());
                pstmt.setString(4,course.GetcourseTime());
                pstmt.setInt(5,course.GetmaxStudents());
                pstmt.setInt(6,course.GetSelectedStudents());
                
		return pstmt.executeUpdate();     
    }
    public int DeleteCourse(Connection con, String CourseID) throws SQLException
    {
        String sql = "delete from t_course where courseId=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, CourseID);
        return pstmt.executeUpdate();    
    }
    public int ModifyCourse(Connection con,Course course)throws Exception{
		String sql="update t_course set courseName = ? ,TId = ?, courseTime = ?, capacity = ?, numselected = ? where courseId = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1,course.getcourseName());
		pstmt.setString(2,course.GetTeacherID());
                pstmt.setString(3,course.GetcourseTime());
                pstmt.setInt(4,course.GetmaxStudents());
                pstmt.setInt(5,course.GetSelectedStudents());
                pstmt.setString(6,course.GetcourseID());
		return pstmt.executeUpdate();

	}
    public  ResultSet QueryAllCourse(Connection con) throws SQLException
    {
    StringBuffer sb = new StringBuffer("select * from t_course");
    PreparedStatement pstmt = con.prepareStatement(sb.toString());
    return pstmt.executeQuery();  
    }
    
     public  ResultSet QueryUnderFullCourse(Connection con) throws SQLException
    {
    StringBuffer sb = new StringBuffer("select * from t_course where numselected < capacity");
    PreparedStatement pstmt = con.prepareStatement(sb.toString());
    return pstmt.executeQuery();  
    }
    
    public String QueryPasswd(Connection con,Student student) throws SQLException
    {
        String sql ="select Spassword from sinfo where sno = ? ";
        System.out.println(student.GetStudentID());
        PreparedStatement pstmt=con.prepareStatement(sql);
       
        pstmt.setString(1,student.GetStudentID());
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return rs.getString("Spassword");
        }
             else
            {
            return "";
            }    
    }
    public int ModifyPassword(Connection con,Student student)throws Exception{
		String sql="update sinfo set spassword = ?  where Sno = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1,student.GetSpassword());
		pstmt.setString(2,student.GetStudentID());
                
		return pstmt.executeUpdate();

	}

}
