
package tastytales;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Customer extends User{
    
  public String Cust_name;/**/
  public int Nationality;/**/
  public String Phone;/**/
  public String DOB;/**/
  public String POB; /**/
  public int User_type = 2;

    public Customer( String Userid, String cust_name, String Password,  String email, int nationality , String phone, String dob, String pob  ) 
    {
        /*this.User_type = 2;*/
        super(Userid,  Password, email);
        this.Cust_name = cust_name;
        this.Nationality = nationality;
        this.Phone = phone;
        this.DOB = dob;
        this.POB = pob;
    }
  public  void  Customerprint(  ) 
    {
        /*this.User_type = 2;*/
        System.out.print( this.Username + "    ");
        System.out.print( this.Password + "    ");
        System.out.print(this.email + "    ");
        System.out.print( this.Cust_name + "    ");
        System.out.print(this.DOB + "    ");
        System.out.print(this.POB + "    ");
        System.out.print(this.Phone + "    ");
        System.out.println( this.Nationality );
        
        
      
    }
    
}
