public class gs1 {
public static void main(String [] args){
    gs s=new gs("thiru","5/70 rpt");
    System.out.println("Name: " + s.getname()); 

System.out.println("Address: " + s.getaddress()); 

s.setname("DATASIRPI"); 

s.setaddress("dinakaran office"); 

System.out.println("New name: " + s.getname()); 

System.out.println("New address: " + s.getaddress()); 
}    
}
