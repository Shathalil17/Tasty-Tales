
package tastytales;

public class Recipes {
    
    public int Rec_id;
    public String Rec_desc;
    public String Rec_ent_date;
    public String Rec_img_sr;
    public String Rec_components;
    public int Rec_type;
    public String Rec_details;

    public Recipes(int Rec_id, String Rec_desc, String Rec_ent_date, String Rec_img_sr,
                   String Rec_components, int Rec_type, String Rec_details) {
        this.Rec_id = Rec_id;
        this.Rec_desc = Rec_desc;
        this.Rec_ent_date = Rec_ent_date;
        this.Rec_img_sr = Rec_img_sr;
        this.Rec_components = Rec_components;
        this.Rec_type = Rec_type;
        this.Rec_details = Rec_details;
    }
    
        public void RecipesPrint()
        {
            
            System.out.println(this.Rec_id + " | " + this.Rec_desc + " |   " + this.Rec_type + "  |   " +
                    this.Rec_img_sr +  " | " + this.Rec_components + " | " + this.Rec_details);
        
    }
    
}
