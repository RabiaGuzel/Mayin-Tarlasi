
package mayintarlasi;
import java.util.*;
public class Mayintarlasi {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
    System.out.println("satır ve sütun bilgisi giriniz: ");
   int m=scan.nextInt();
   int n=scan.nextInt();
   int dizi[][] = new int[m][n];
		for (int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                       Random rnd = new Random();
			dizi[i][j]=rnd.nextInt(2);
                         int a= dizi[i][j];
		}}
		for (int i=0;i<m;i++){
                for(int j=0;j<n;j++){
       System.out.println("Konum Değerlerini Girin: ");
                int a=scan.nextInt();
                int b=scan.nextInt();
                        a=i;
                        b=j;
                             if(dizi[a][b]!=0){

System.out.println("ÖldünüzXXX");
break;
}
else
System.out.println(" Hala hayatttasınız yola devam...");
}
break;
}}}
