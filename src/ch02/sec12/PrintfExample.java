package ch02.sec12;

public class PrintfExample {
   public static void main(String[] args) {
      System.out.println("날짜\t품목\t단가\t수량\t금액");
      System.out.println("3/7\t캬라멜\t2,000\t1\t2,000");
      System.out.println("12/15\t라떼\t1,000\t2\t2,000");
      System.out.println("4/8\t바닐라(샷추가)\t3,500\t1\t3,500");
      //      결과 = 줄이 안맞음
      
      
      System.out.printf("%-5s %-20s %-5s %-5s %-5s \n","날짜","품목","단가","수량","금액");
      System.out.printf("%02d/%02d %-20s %-5s %-5s %-5s \n",3,7,"캬라멜","2,000","1","2,000");
      System.out.printf("%02d/%02d %-20s %-5s %-5s %-5s \n",12,15,"라떼","1,000","2","2,000");
      System.out.printf("%02d/%02d %-20s %-5s %-5s %-5s \n",4,8,"바닐라샷추가","3,500","1","3,500");
   

   }
}
