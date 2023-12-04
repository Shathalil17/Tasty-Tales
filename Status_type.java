
package tastytales;

public class Status_type {
    
   public int ST_id;
   public String ST_desc;
   public String ent_date;
    
    public Status_type(int st_id, String st_desc, String Ent_date) {
        this.ST_id = st_id;
        this.ST_desc = st_desc;
        this.ent_date = Ent_date;
        
    }  
    public void Status_typePrint()
     {
         System.out.println( this.ST_id + "    "+this.ST_desc );
    } 
    
}
