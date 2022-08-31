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
public class People {
    private String name;
   
    
      public People()
      {
          
      }
        public People(String name)
        {
            super();
            name=name;
        }
        
    public String GetName() {
	return name;
}
    public void SetName(String name) {
	this.name = name;
}
    
}
