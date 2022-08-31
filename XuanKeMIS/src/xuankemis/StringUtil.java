package xuankemis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class StringUtil {
public static boolean isEmpty(String str){
	if("".equals(str)||str==null){
		return true;
	}else{
		return false;
	}
}
public static boolean isNotEmpty(String str){
	if(!"".equals(str)&&str!=null){
		return true;
	}else{
		return false;
	}
}    
}
