
package tastytales;

public class Requests {
    
    public int Req_id;
    public String Req_desc;
    public String Req_ent_date;
    public int Req_status;
    public String Req_answer;
    public String Req_customer;
    public int Rec_type;

    public Requests(int Req_id, String Req_desc, String Req_ent_date, int Req_status,
                    String Req_answer, String Req_customer, int Rec_type) {
        this.Req_id = Req_id;
        this.Req_desc = Req_desc;
        this.Req_ent_date = Req_ent_date;
        this.Req_status = Req_status;
        this.Req_answer = Req_answer;
        this.Req_customer = Req_customer;
        this.Rec_type = Rec_type;
    } 
    
    public void RequestsPrint()
    {
        System.out.println(this.Req_id + " | " + this.Req_desc + " | " + this.Req_ent_date + " | " + 
               this.Req_status  + " | " + this.Req_answer  + " | " + this.Req_customer  + " | " + this.Rec_type);
    
    }
    
}
