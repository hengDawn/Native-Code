// import java.util.Scanner;

// public class test1 {
//     public static void main(String[] args){
//         System.out.print("请输入月份: ");
//         Scanner sc=new Scanner(System.in);
//         int month=sc.nextInt();
//         System.out.print("请输入票价: ");
//         int ticket=sc.nextInt();
//         System.out.print("请输入舱型，0表示头等舱，1表示经济舱: ");
//         int seat=sc.nextInt();
//         if(month>=5 && month<=11){
//             if(seat==0) ticket*=0.9;
//             else if(seat==1) ticket*=0.85;
//             else System.out.println("不存在此舱型");
//         }else if(month==12 || (month>=1 && month<=4)){
//             if(seat==0) ticket*=0.7;
//             else  if(seat==1)ticket*=0.65;
//             else System.out.println("不存在此舱型");
//         }else System.out.println("月份不合法");
//         System.out.println("票价为:"+ticket);
//     }
// }
