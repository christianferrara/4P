import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class prova1{
	public static void main(String[] args)throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		
  int ns = 0; //numero stringhe
  String temp = new String();
  
  System.out.println("inserisci il numero di stringhe da memorizzare: ");
  ns = Integer.parseInt(stdin.readLine());
  
  String[] strArray1 = new String[ns];
  
  	for(int i = 0; i < ns; i++) {
   System.out.println("Inserisci nomi: ");
   strArray1[i]=stdin.readLine();
   temp = strArray1[i].toLowerCase();
   if(temp.startsWith("anna")) {
    strArray1[i] = temp.replaceFirst("anna","Maria");
    temp = strArray1[i].replaceAll(" ","");
    strArray1[i] = temp;
   }
   else
    strArray1[i] = temp.replaceAll(" ","");
  }
  System.out.println("STAMPA************");
  for(int i=0;i<ns;i++) {
   System.out.println(strArray1[i]);
  }
 }

	
}