
package tastytales;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class User {
    
    public String Username;
    public String Password;
    public int loginstatus;
    public String reg_date;
    public String email;
    
    
    
    
      public User(String username, String password,  String Email) 
      {
        this.Username = username;
        this.Password = password;
        this.loginstatus = 0; // Initial login status
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.reg_date = dtf.format(now); 
        this.email = Email;
    }
    
    public void login(String username,String ent_Password) 
    {
        
        if (loginstatus == 1) 
        {
            System.out.println("this user is already login as :  " + Username);
        }
        else
        {          
        if (Username.equals(username) && Password.equals(ent_Password)) 
        {
            System.out.println("Login successful for user: " + Username);
            
            this.loginstatus = 1;
        }
        else 
        {
            System.out.println("Login failed for user: " + Username);
            
        }
        }
        
    }
    
          
  
 public double calculateBMI(double weight, double height) {
        // BMI calculation logic
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Invalid height or weight for BMI calculation");
        }
        return (weight / (height * height))*10000;
    }
    
  public void addNewRecipe(int Rec_id, String Rec_desc, String Rec_ent_date, String Rec_img_sr, String Rec_components, int Rec_type, String Rec_details) 
  {
        // Add new recipe logic
       try 
       {
      int rec_id = Rec_id;
      String rec_desc = Rec_desc;
      String rec_ent_date = Rec_ent_date;
      String rec_img_sr = Rec_img_sr;
      String rec_components = Rec_components;
      int rec_type = Rec_type;
      String rec_details = Rec_details;
      Recipes rec_obj = new Recipes(rec_id, rec_desc, rec_ent_date, rec_img_sr, rec_components, rec_type, rec_details    );
  
       } 
       catch (Exception e) 
       {
            System.out.println("An error occurred: " + e.getMessage());
       }
  }
  
  public void View_Recipes() 
    {
      /* use an secreen to view all recipe that store in the class*/  
    }
     
  
  public void addNewRequest(int Req_id, String Req_desc, String Req_ent_date, int Req_status,
                    String Req_answer,  int Rec_type) 
  {
        // Add new request logic
       try 
       {
      int req_id = Req_id;
      String req_desc = Req_desc;
      String req_ent_date = Req_ent_date;
      int req_status = Req_status;
      String rec_components = Req_answer;
      int rec_type = Rec_type;
      Requests req_obj = new Requests( Req_id,  Req_desc,  Req_ent_date,  Req_status,  Req_answer, this.Username,  Rec_type);
  
       } 
       catch (Exception e) 
       {
            System.out.println("An error occurred: " + e.getMessage());
       }
      
   }
    
}
