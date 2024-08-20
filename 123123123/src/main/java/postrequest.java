import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class postrequest {
	
	
	
	 private static void addinfo(String metin){
         try{
               File dosya = new File("C:\\Users\\halil\\Desktop\\deneme\\yeni.txt");
               FileWriter yazici = new FileWriter(dosya,true);
               BufferedWriter yaz = new BufferedWriter(yazici);
               yaz.write(metin);
               yaz.close();
               System.out.println("Ekleme İşlemi Başarılı");
         }
         catch (Exception hata){
               hata.printStackTrace();
         }
   }
	
public static void readinfo(String[] args)  throws IOException {   
        FileReader fr = new FileReader("C:\\Users\\halil\\Desktop\\deneme\\yeni.txt"); 
        BufferedReader br = new BufferedReader(fr); 
        char c[] = new char[20];      
        if (br.markSupported()) {            
            System.out.println( 
                "mark() method is supported");              
            br.mark(100); 
        }        
        br.skip(8);      
        if (br.ready()) {           
        	System.out.println(br.readLine());            
        	br.read(c);  
        	for (int i = 0; i < 20; i++) { 
        		System.out.print(c[i]); 
        	} 
        	System.out.println(); 
        	br.reset(); 
        	for (int i = 0; i < 8; i++) {                
        		System.out.print((char)br.read()); 
        	} 
        } 
    } 
}
  
        
  
