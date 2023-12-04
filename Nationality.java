
package tastytales;

public class Nationality {
    
   public int NA_id;
   public String NA_desc;
   public String ent_date;
    
      
    
     public Nationality(int na_id, String na_desc, String Ent_date) 
     {
        this.NA_id = na_id;
        this.NA_desc = na_desc;
        this.ent_date = Ent_date;
        
     } 
     
     public void NationalityPrint() 
     {
         
         System.out.println("      " +this.NA_id + "        " + this.NA_desc );
        
        
     }
    
}
