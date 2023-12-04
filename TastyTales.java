
package tastytales;

import java.util.Scanner;//for input
import java.util.ArrayList;//for store information
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;// for current time and date

public class TastyTales {
    
    static ArrayList<Recipes> RecL = new ArrayList<>();//store Recipes
    static ArrayList<Customer> CustL = new ArrayList<>();//store Customers
    static ArrayList<Administrator> AdminL = new ArrayList<>(); //store Administrators
    static ArrayList<Nationality> NatL = new ArrayList<>(); //store Nationality
    static ArrayList<Requests> ReqL = new ArrayList<>();//store Requests
    static ArrayList<Recipe_type> RTL = new ArrayList<>();//store Recipes type
    static ArrayList<Status_type> STL = new ArrayList<>();//store Status type
    
    
    public static void addnewCustomerM(String entdate)
    {
        int nat ;
        String usern, pass, fullname, pho, dobi, pobi, eml  ;
        
        Scanner choseObjS = new Scanner(System.in);
        Scanner choseObj = new Scanner(System.in);
        
      try 
        {
            System.out.println("Enter the full Information "); 
            System.out.println("Enter User Name "); 
            usern = choseObjS.nextLine();
            System.out.println("Enter  full name ");
            fullname = choseObjS.nextLine();
            System.out.println("Enter  Password");
            pass = choseObjS.nextLine();
            System.out.println("Enter  Phone");
            pho = choseObjS.nextLine();
            System.out.println("Enter  DOB");
            dobi = choseObj.nextLine();
            System.out.println("Enter  POB");
            pobi = choseObjS.nextLine();
             System.out.println("Enter Nationality "); 
            System.out.println("Nationality ID :   Nationality description : "  );
            for (int i=0 ; i<NatL.size();i++)
                {
                    NatL.get(i).NationalityPrint();
                }
            nat = choseObjS.nextInt();
            System.out.println("Enter  Email");
            eml = choseObj.nextLine();
            CustL.add(  new Customer (usern, fullname, pass,  eml, nat, pho, dobi, pobi));
            System.out.println("Customer add successful");
        } 
        catch (Exception e) 
            {
                System.out.println("An error occurred: " + e.getMessage());
            }  
    }
    
    
    
     
    
    public static void addnewRecipeM(String entdate)
    {
        int   Rec_id, Rec_type;
        String Rec_desc,Rec_img_sr,Rec_components, Rec_details;
        
        
        Scanner choseObjREC = new Scanner(System.in);
        Scanner choseObjREC2 = new Scanner(System.in);
      try 
            {
                
                
                Rec_id =RecL.size()+1;
                System.out.println("Enter Recipe Description ");
                Rec_desc = choseObjREC.nextLine();
                
                System.out.println("Enter Recipe image source ");
                Rec_img_sr = choseObjREC.nextLine();
                System.out.println("Enter Recipe type ");
                System.out.println("ID      Type ");
                for (int j=0 ; j<RTL.size();j++)
                {
                    RTL.get(j).Recipe_typePrint();
                }
                Rec_type = choseObjREC2.nextInt();
                System.out.println("Enter Recipe components ");
                Rec_components = choseObjREC.nextLine();
                System.out.println("Enter Recipe Details ");
                Rec_details = choseObjREC.nextLine();
                System.out.println("Done");
                RecL.add(new Recipes(Rec_id, Rec_desc ,entdate, Rec_img_sr, Rec_components, Rec_type, Rec_details));
                System.out.println("Add Recipe Successful");
            } 
            catch (Exception e) 
                {
                    System.out.println("An error occurred: " + e.getMessage());
                }
    }
    
    public static void addnewRequestM(String entdate)
    {
        int Rec_type, Req_id, Req_status;
        String Req_answer, Req_customer, Req_desc;
        
        Scanner choseObjREQ = new Scanner(System.in); 
        Scanner choseObjREQ2 = new Scanner(System.in);
        Scanner choseObjREQ3 = new Scanner(System.in);
        
       try 
         {
            Req_id = ReqL.size()+1;
            System.out.println("Enter Request Description");
            Req_desc = choseObjREQ2.nextLine();
            Req_status=1;
            System.out.println("Enter Request Customer");
            Req_customer = choseObjREQ3.nextLine();
            System.out.println("Enter Recipe type");
            System.out.println("ID      Type ");
                for (int j=0 ; j<RTL.size();j++)
                {
                    RTL.get(j).Recipe_typePrint();
                }
            Rec_type = choseObjREQ2.nextInt();
            System.out.println("Enter Request Answer");
            Req_answer = choseObjREQ3.nextLine();
            System.out.println("Done");
            ReqL.add(new Requests(Req_id, Req_desc,entdate,Req_status, Req_answer, Req_customer, Rec_type));
         }
        catch (Exception e) 
            {
                System.out.println("An error occurred: " + e.getMessage());
            } 
    }
    public static void main(String[] args) 
    {
        
        int chose,chose1,chose2, chose3, chose4, chose5, chose6,  naid, exitno, current;
        String usern, pass, fullname, pho,  eml, nadesc  ;
     
         
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String entdate = dtf.format(now);
        
        
        
        System.out.println("ArrayLists are Declared : ");
       
        // add 4 nationality 
        NatL.add(new Nationality(1, "KSA",  entdate));
        NatL.add(new Nationality(2, "UAE",  entdate));
        NatL.add(new Nationality(3, "JOR",  entdate));
        NatL.add(new Nationality(4, "Egypt",  entdate));
        
        //add recipe type
        RTL.add(new Recipe_type( 1,"Breakfast", entdate));
        RTL.add(new Recipe_type( 2,"Lunch", entdate));
        RTL.add(new Recipe_type( 3,"Dinner", entdate));
        RTL.add(new Recipe_type( 4,"Dessert", entdate));
        RTL.add(new Recipe_type( 5,"Snak", entdate));
        
        //add status type
        STL.add(new Status_type (1,"new Entered",entdate));
        STL.add(new Status_type (2,"in Progress",entdate));        
        STL.add(new Status_type (1,"Compleate",entdate));
        
        //add recipe
        RecL.add(new Recipes(1,"Salset al tomato",entdate,"c://","tomato",1,"tomato"));
        
        //add request
        ReqL.add(new Requests(1,"tomato",entdate,1,"not yet","hashim",1));
        
        //add demo administrator
        AdminL.add(new Administrator("Admin","123","Master","555","h@h.com"));
        
        //add demo customer
        CustL.add( new Customer("Cust","cust","123","email",3,"","",""));
        
        Scanner choseObj = new Scanner(System.in);
        Scanner choseObjS = new Scanner(System.in);
        Scanner choseObj1 = new Scanner(System.in);
        Scanner choseObj2 = new Scanner(System.in);
        Scanner choseObjC = new Scanner(System.in);
        Scanner choseObjN = new Scanner(System.in);
        Scanner choseObjL = new Scanner(System.in);
        Scanner choseObjCUST = new Scanner(System.in);
        Scanner exitcode = new Scanner(System.in);
        
        do {
            
            
        System.out.println("Choose one of the User type : ");
        System.out.println("1: Administrator ");
        System.out.println("2: Customer ");
        System.out.println("3: Claculate BMI");
        System.out.println("4: Visitor");
        
        chose  = choseObj.nextInt();
    switch (chose) 
    {
        case 1:
            {
                System.out.println("Administrator");
                System.out.println("you have full access");
                System.out.println("Choose one of the List : ");
                System.out.println("1: Login ");
                System.out.println("2: Register ");
                System.out.println("3: Customer Methods ");
                System.out.println("4: Recipe Methods ");
                System.out.println("5: Request Methods ");
                System.out.println("6: Nationality Methods ");
                chose1 = choseObj.nextInt();
                switch (chose1) 
                {
                case 1:
                    {
                        current=0;
                        System.out.println("User Name : ");
                        usern = choseObjL.nextLine();
                        System.out.println("Password :  ");
                        pass = choseObjL.nextLine();
                        for (int i =0; i<AdminL.size();i++)
                        {
                            if(AdminL.get(i).Username.equals(usern) )
                            {
                                current=i;
                            }
                        }
                        AdminL.get(current).login(usern, pass);
                        
                    }
                    break;
                case 2:
                    {
                        System.out.println("User Name : ");
                        usern = choseObj1.nextLine();
                        System.out.println("Password :  ");
                        pass = choseObj2.nextLine();
                        System.out.println("Admin full name :  ");
                        fullname = choseObj1.nextLine();
                        System.out.println("Phone :  ");
                        pho = choseObj2.nextLine();
                        System.out.println("Email :  ");
                        eml = choseObj1.nextLine();
                        AdminL.add( new Administrator(usern,pass,fullname,pho,eml));
                        System.out.println("Administrator Add Successful");
                        
                    }
                    break;
                case 3:
                    {
                        System.out.println("1: Add Customer ");
                        System.out.println("2: View Customer ");
                        chose5 = choseObjC.nextInt();
                        switch (chose5) 
                            {
                            case 1:
                                 {
                                     addnewCustomerM( entdate);
                                 }
                                 break;
                            case 2:
                                 {
                                    System.out.println("User Name  |  Password     |    Email    | "
                                            + "  Full Name  |  DOB  |   POB   |  Phone   | Nationality ");
                                    for (int i=0 ; i<CustL.size();i++)
                                        {
                                            CustL.get(i).Customerprint();
                                        }  
                                     
                                 }
                                 break;
                            default: 
                                    {
                                       System.out.println("the input is not in the list "); 
                                    }   
                            }
                    }
                    break;
                case 4:
                    {
                        System.out.println("1: Add Recipe ");
                        System.out.println("2: View Recipe "); 
                        chose6 = choseObjC.nextInt();
                        switch (chose6) 
                            {
                            case 1:
                                 {
                                     addnewRecipeM(entdate);
                                 }
                                 break;
                            case 2:
                                 {
                                   System.out.println("id  |  description     | type  |   img_sr  |  components  |   details");
                                    for (int i=0 ; i<RecL.size();i++)
                                        {
                                            RecL.get(i).RecipesPrint();
                                        }  
                                 }
                                 break;
                            default: 
                                    {
                                       System.out.println("the input is not in the list "); 
                                    }   
                            }
        
                        
                    }
                    break;
                case 5:
                    {
                         System.out.println("1: Add Request ");
                         System.out.println("2: View Request ");
                         chose4 = choseObjS.nextInt();
                         switch (chose4) 
                                    {
                                    case 1:
                                            { 
                                            addnewRequestM( entdate);
                                            }
                                            break;
                                    case 2:
                                            {
                                                System.out.println(" id  | Description |     Date   | Status   | Answer         | who make it    | recipe type");
                                                for (int i=0 ; i<ReqL.size();i++)
                                                    {
                                                        ReqL.get(i).RequestsPrint();
                                                    }
                                            }
                                            break;
                                    default: 
                                        {
                                            System.out.println("the input is not in the list "); 
                                        }       
                                            
                                    }
                    }
                    break;
                case 6:
                    {
                        System.out.println("1: Add Nationality ");
                        System.out.println("2: View Nationality ");
                        chose3 = choseObj.nextInt();
                        switch (chose3)
                            {
                            case 1:
                                {
                                    
                                    naid = NatL.size()+1;
                                    System.out.println("Enter the Nationality Description ");
                                    nadesc = choseObjN.nextLine();
                                    NatL.add(new Nationality(naid, nadesc,  entdate));             
                                }
                                break;
                            
                            case 2:
                                {
                                    System.out.println("Nationality ID :   Nationality description : "  );
                                    for (int i=0 ; i<NatL.size();i++)
                                    {
                                       NatL.get(i).NationalityPrint(); 
                                    }
                                }
                                break;
                            default: 
                                {
                                    System.out.println("the input is not in the list "); 
                                }
                            }
                    }
                    break;
                default: 
                    {
                        System.out.println("the input is not in the list "); 
                    }
                }
            break;    
            }
        case 2:
            {
                System.out.println("Customer");
                System.out.println("Choose one of the List : ");
                System.out.println("1: Login ");
                System.out.println("2: Register ");
                System.out.println("3: Add new Recipe ");
                System.out.println("4: Add new Request ");
                System.out.println("5: view Recipes ");
                chose2 = choseObj.nextInt();
                switch (chose2) 
                {
                    case 1:
                    {
                        current=0;
                        System.out.println("Enter  username  ");
                        usern = choseObjCUST.nextLine();
                        System.out.println("Enter  Password ");
                        pass = choseObjCUST.nextLine();
                        for (int i =0; i<CustL.size();i++)
                        {
                            if(CustL.get(i).Username.equals(usern) )
                            {
                                current=i;
                            }
                        }
                        CustL.get(current).login(usern, pass);
            
                    }
                    break;
                    case 2:
                        {
                        addnewCustomerM( entdate);
                        }
                        break;
                    case 3:
                        {
                        addnewRecipeM(entdate);
                        }
                        break;
                    case 4:
                    {
                        addnewRequestM( entdate);
                    }
                    break;
                    case 5:
                    {
                        System.out.println("id  |  description     | type  |   img_sr  |  components  |   details");
                        for (int i=0 ; i<RecL.size();i++)
                        {
                            RecL.get(i).RecipesPrint();
                        }
                    }
                    break;
                    default:
                        {
                            System.out.println("the input is not in the list ");  
                        }
                }
            }
             break;
        case 3://Calculate BMI
            {
                double w,h;
                System.out.println("Weight : " );
                w = choseObj.nextDouble();
                System.out.println("Height : " );
                h = choseObj.nextDouble();
                double BMI = CustL.get(0).calculateBMI(w, h);
                System.out.println("BMI =  " + BMI);
            }
            break;
        case 4:
            {
                System.out.println("Visitor");
                System.out.println("you can just view the list of recipes");
                System.out.println("id  |  description     | type  |   img_sr  |  components  |   details");
                for (int i=0 ; i<RecL.size();i++)
                    {
                        RecL.get(i).RecipesPrint();
                    }
            }
            break;
        default:
            {
                System.out.println("the input is not in the list "); 
            }
    }
            
    System.out.println(" Enter 99  For Exit Or Enter 1 to Continue");
            exitno  = exitcode.nextInt();
    }
while (exitno !=99);
    }
    
}