/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuankemis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class selectcourse extends Course{
private String sno;
private String selectid;


public selectcourse()
{
    
}
public selectcourse(String courseId,String sno)
{
    sno=sno;
    courseId=courseId;
}
public String getsno()
    {
        return sno;
    }
public void setsno(String sno)
    {
        this.sno=sno;
    }
public String getselectid()
    {
        return selectid;
    }
public void setselectid(String selectid)
    {
        this.selectid=selectid;
    }


public  ResultSet isExisted(Connection con) throws SQLException{   /**   是否已经选过这门课程了*/

        String sql = "select * from t_selection where courseId=? and Sno=? ";
        PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1, courseID);
        pstmt.setString(2, sno);
        return pstmt.executeQuery();
}
public int SelectionAdd(Connection con)throws Exception{
		String sql="insert into t_selection (courseId,Sno) values(?,?)";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,courseID);
		pstmt.setString(2,sno);
		return pstmt.executeUpdate();
	}
public int NumSelectedAdd(Connection con)throws Exception{
		String sql="update t_course set numSelected = numSelected + 1 where courseId=?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1, courseID);
		return pstmt.executeUpdate();
	}

public ResultSet StudentList(Connection con, Student student) throws SQLException {
        StringBuffer sb = new StringBuffer("select t_course.courseId,courseName,courseTime,Tname from t_course, t_selection,tinfo where t_course.courseId=t_selection.courseId and tinfo.tno=t_course.tid");
        /**if (student.getSno() != "") {
            sb.append(" and Sno=" + student.getSno());
        }*/
        if (StringUtil.isNotEmpty(student.GetStudentID())) {
            sb.append(" and Sno = '" + student.GetStudentID() + "'");
        }
        System.out.println(sb.toString());
        PreparedStatement pstmt = con.prepareStatement(sb.toString());
        return pstmt.executeQuery();
    }
public int SelectionCancel(Connection con)throws Exception{
	String sql="delete from t_selection where courseId=? and Sno=?";
	PreparedStatement  pstmt=con.prepareStatement(sql);
	pstmt.setString(1,courseID);
	pstmt.setString(2, sno);
	return pstmt.executeUpdate();
	}
public int NumSelectedMinus(Connection con)throws Exception{
	String sql="update t_course set numSelected = numSelected - 1 where courseId=?";
	PreparedStatement  pstmt=con.prepareStatement(sql);
	pstmt.setString(1, courseID);
	return pstmt.executeUpdate();
	}

}