import java.util.Arrays;
import java.util.*;


public class bank {
    private String id; 

private String name; 

private int balance=0; 



public bank (String id, String name, int balance) { 

    this.id = id; 
    
    this.name = name; 
    
    this.balance = balance; 

}
    public String getid() { 

        return id; 
        
        } 
        
        public String getname() { 
        
        return name; 
        
        } 
        
        public int getbalance() { 
        
        return balance; 
        
        } 
        public void credit(int amount){ 

            balance = balance + amount; 
            
            } 
            
            public void debit(int amount){ 
            
            if(amount<= balance){ 
            
            balance = balance - amount; 
            
            } 
            
            else{ 
            
            System.out.println("Low Balance"); 
            
            } 
            
            } 
            public void transferTo (bank acc, bank a1,int amount){ 

                if(amount <= balance){ 
                
               acc.balance = balance - amount; 
                a1.balance=+amount;
                
                } 
                
                else{ 
                
                System.out.println("Amount exceeded balance"); 
                
                } 
                
                } 
                public static void main(String[] args) { 

                    bank acc = new bank("6969805875","Thiru",0); 
                    
                    System.out.println("Account Id : "+ acc.getid()); 
                    
                    System.out.println("Account Name : " + acc.getname()); 
                      System.out.println("Account balance : " + acc.getbalance()); 

                    
                    bank a1 = new bank("9361472394","Tmb",1000); 
                    
                    System.out.println("Account Id : " +a1.getid()); 
                    
                    System.out.println("Account name : "+a1.getname()); 
                    
                    System.out.println("Account balance : "+a1.getbalance()); 
                    
                     
                     
                    
                    a1.credit(100); 
                    
                    System.out.println("Amount credited : "+a1.getbalance()); 
                    
                    a1.debit(50); 
                    
                    System.out.println("Amount debited : "+a1.getbalance()); 
                    
                     
                     
                    
                    a1.debit(2000); 
                    
                    System.out.println("Amount remaining in your account : " +a1.getbalance()); 
                    
                     
                   
                    
                    a1.transferTo(acc,a1,30); 
                    
                    System.out.println("Balance of a1 : "+a1.getbalance()); 
                    
                    System.out.println("balance of acc : "+acc.getbalance()); 

                    
                    Object[] personArray = {acc.getname(), acc.getid(),acc.getbalance()};
                    System.out.println("Account Summary for acc : " + Arrays.toString(personArray));
                    
                    } 
    } 

