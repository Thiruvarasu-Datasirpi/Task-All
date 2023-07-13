public class delivery extends slave {
    public void pack(){
        System.out.println("Response from delivery man : apple delivered");

    }
    public static void main(String[] args) { 

        delivery process = new delivery(); 
          process.order(); 
             process.response(); 
        
        
        process.pack(); 
        
     
      
        
        System.out.println(" "); 
    
}
}
