
package tastytales;

public class Recipe_type {
    
   public int RT_id;
   public String RT_desc;
   public String enter_date;
    
     public Recipe_type(int rt_id, String rt_desc, String Ent_date) {
        this.RT_id = rt_id;
        this.RT_desc = rt_desc;
        this.enter_date = Ent_date;
        
    } 
     
     public void Recipe_typePrint()
     {
         System.out.println( this.RT_id + "    "+this.RT_desc );
    }
    
}
