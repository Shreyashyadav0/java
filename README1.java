import java.util.*;
  public class README1{
      public static void main(String[]args){
          Scanner scn= new Scanner (System.in);
          int n= scn.nextInt();
          int a=0;
          int b=n;
          while(b!=0){
              b=b/10;
              a++;
          }
          int div=(int)Math.pow(10,a-1);
          while (div!=0){
              int q=n/div;
              System.out.println(q);
              n=n%div;
              div=div/10;
              scn.close();
          }
      }
  }