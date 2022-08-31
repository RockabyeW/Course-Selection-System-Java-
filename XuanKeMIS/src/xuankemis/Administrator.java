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
public class Administrator extends People {
    private String AdministratorID;
    private String Adpassword;
    public FormObject theFormObject;
    public Administrator()
    {
     super();   
    }
    
    public  Administrator(String  AdministratorID)
    {
        super();
        AdministratorID= AdministratorID;
    }
    
    public Administrator(String AdminstratorID,String Adpassword)
    {
        super();
        AdministratorID= AdministratorID;
        Adpassword=Adpassword;
    }
    
    public String GetAdministratorID(){
        return AdministratorID;
    }
    public void setAdministratorID(String AdministratorID)
    {
        this.AdministratorID=AdministratorID;
    }
    public void GetAdministratorInfo()
            {
        
    }
    public String GetAdpassword(){
        return Adpassword;
    }
    public void setAdpassword(String Adpassword)
    {
        this.Adpassword=Adpassword;
    }
}
