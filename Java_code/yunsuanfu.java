// import java.util.Scanner;
//import java.util.Random;

public class yunsuanfu {
    public static void main(String[] args){
        // boolean result=20>30;
        // System.out.println(result);
        // System.out.println(true & true);
        // System.out.println(true & false);
        // System.out.println(false & true);
        // System.out.println(false & false);
        // System.out.println(true | true);
        // System.out.println(true | false);
        // System.out.println(false | true);
        // System.out.println(false | false);

        //异或^ 相同为false,不同为true
        // System.out.println(true ^ true);
        // System.out.println(true ^ false);
        // System.out.println(false ^ true);
        // System.out.println(false ^ false);

        // int a=10,b=20,c=15;
        // int tmp=a>b? a:b;
        // int max=tmp>c?tmp:c;
        // // boolean result=++a<5 && ++b>8;
        // // System.out.println(result);
        // // System.out.println(a);
        // // System.out.println(b);
        // System.out.println(max);
        // int a=300;
        // byte b=(byte)a;
        // System.out.println(b);
        // Scanner sc=new Scanner(System.in);
        // int i=sc.nextInt();
        // if(i>5) System.out.println("Yes");
        // else System.out.println("No");
        // int num=100;
        // switch(num){
        //     case 1,2,3,4,5 ->{
        //         System.out.println("1");
        //     }
        //     case 6,7 ->{
        //         System.out.println("2");
        //     }
        //     default ->{
        //         System.out.println("wu");
        //     }
        // }
        // for(int i=100;i>0;i--){
        //     if(i%5==0) System.out.println(i);
        // }
        // int a=1001,tmp=a;
        // int ans=0;
        // while(tmp>0){
        //     ans=ans*10+tmp%10;
        //     tmp/=10;
        // }
        // if(ans==a) System.out.println("Yes");
        // else System.out.println("No");
        // for(int i=100;i>0;i--){
        //     if(i%7==0 || i%10==7 || i/10==7) System.out.println(i);
        // }
        // Random r=new Random();
        // int num=0;
        // for(int i=20;i>0;i--){
        //     num=r.nextInt(10)+1;
        //     System.out.println(num);
        // } 
        // double[] arr1=new double[]{1.83,1.65,1.73};
        // int[] arr3=new int[]{1,2,3};
        // System.out.println(arr1[0]);
        // arr1[0]=20.0;
        // System.out.println(arr1[0]);
        // double[] arr1={1,2,3,4,5,6,7,8,9,10};
        // System.out.println(arr1.length);
        // for(int i=0;i<arr1.length;i++){
        //     if(arr1[i]%2!=0) arr1[i]=arr1[i]*2;
        //     else arr1[i]=arr1[i]/2;
        //     System.out.println(arr1[i]);
        // }
        // int[] arr1=new int[3];
        // // Scanner sc=new Scanner(System.in);
        // // int tmp=0;
        // // for(int i=0;i<arr1.length;i++){
        // //     tmp=sc.nextInt();
        // //     arr1[i]=tmp;
        // //     System.out.println(arr1[i]);
        // // }
        //  for(int i=0;i<arr1.length;i++){
        //     System.out.println(arr1[i]);
        // } 
        //int[] arr1={1,2,3,4,5,6,7,8,9,10};
        // int max=arr1[0],min=arr1[0];
        // for(int i=1;i<arr1.length;i++){
        //     if(arr1[i]>max) max=arr1[i];
        //     if(arr1[i]<min) min=arr1[i];
        // }
        // System.out.println("数组的最大值:"+max);
        // System.out.println("数组的最小值:"+min);
        // int left=0,right=arr1.length-1;
        // int tmp=0;
        // while(left<right){
        //     tmp=arr1[left];
        //     arr1[left]=arr1[right];
        //     arr1[right]=tmp;
        //     left++;
        //     right--;
        // }
        // for(int i=0;i<arr1.length;i++){
        //     System.out.println(arr1[i]);
        // }
        // Random r=new Random();
        // int random=0;
        // int tmp=0;
        // for(int i=0;i<arr1.length;i++){
        //     random=r.nextInt(arr1.length);
        //     tmp=arr1[random];
        //     arr1[random]=arr1[i];
        //     arr1[i]=tmp;
        // }
        //  for(int i=0;i<arr1.length;i++){
        //     System.out.println(arr1[i]);
        // }
        // int[] arr1={1,2,3};
        // int[] arr2=arr1;
        // System.out.println(arr1[0]);
        // System.out.println(arr1[1]);
        // System.out.println(arr2[0]);
        // System.out.println(arr2[1]);
        // arr2[1]=33;
        // System.out.println(arr2[1]);
        // int a=20,b=30;
        // int num=getSum(a,b);
        // System.out.println(num);
        //getSum(10,20);
        int[] arr={11,22,33,44,55,66,77,88,99,100};
        int[] copyArr=copyOfRange(arr,0,10);
        for(int i=0;i<copyArr.length-1;i++){
            System.out.print(copyArr[i]+",");
        }
        System.out.print(copyArr[copyArr.length-1]);
    }
    // public static int getSum(int num1,int num2){
    //     int result=num1+num2;
    //    return result;
    // }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] newArr=new int[to-from];
        for(int i=from;i<to;i++){
           newArr[i-from]=arr[i];
         }
         return newArr;
    }
}
