
package tastytales;

public class Administrator extends User{
    
    public String Admin_name;
    public String Phone;
    public int User_type = 1;

    public Administrator(String Userid, String Password,  String Admin_name, String phone, String email) 
    {
         super(Userid,  Password, email);
        this.Admin_name = Admin_name;
        this.Phone = phone;
    }
        
 public void AdministratorPrint() 
    {
        System.out.println("Userid : " + this.Username);
        System.out.println("Password : " + this.Password);
        System.out.println("Email : " + this.email);
        System.out.println("Full Name : " + this.Admin_name);
        System.out.println("Phone : " + this.Phone);
        
    }
    
    public void View_Customers() 
    {
       /* use an secreen to view all customers that store in the class*/  
    }
    
   
     
      public void View_Request() 
    {
        /* use an secreen to view all requests that store in the class*/ 
    }
    
      public Customer Addnew_Customers(String Userid, String cust_name, String Password,  String email, int nationality, String phone, String datob, String placob ) 
    {
        try 
       {
           int usertype = 2;
           String userid = Userid;
           String Cust_name = cust_name;
           String password = Password;
           String Email = email;
           int Nationality = nationality;
           String Phone = phone;
           String DOB = datob;
           String POB = placob;
      
      Customer cust = new Customer(  userid,  Cust_name,  password, 
               Email,  Nationality ,  Phone,  DOB,  POB);
      System.out.println("Customer Add successful");
     return (cust);
       } 
       catch (Exception e) 
       {
            System.out.println("An error occurred: " + e.getMessage());
            return null;
       }
        
    }
    
 
      public void delete_Customers() 
    {
        /* use an secreen to delete customer that store in the class*/  
    }
    
     public void delete_Recipes() 
    {
        /* use an secreen to delete recipes that store in the class*/ 
    }
     
      public void delete_Request() 
    {
        /* use an secreen to delete request that store in the class*/ 
    }
      
      public void Modify_Customers() 
    {
        /* use an secreen to modify customer that store in the class*/ 
    }
    
     public void Modify_Recipes() 
    {
         /* use an secreen to modify recipes that store in the class*/ 
    }
     
      public void Modify_Request() 
    {
         /* use an secreen to modify request that store in the class*/ 
    }
    
}
