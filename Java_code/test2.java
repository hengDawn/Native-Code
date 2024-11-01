import java.util.Random;

public class test2 {
    public static void main(String[] args){
        char[] arr=new char[52];
        String result="";
        for(int i=0;i<arr.length;i++){
            if(i<=25) arr[i]=(char)(i+97);
            else arr[i]=(char)(i+39);
        }
        Random r=new Random();
        int random=0;
        for(int j=0;j<10;j++){
        result="";
        for(int i=0;i<4;i++){
            random=r.nextInt(arr.length);
            result=result+arr[random];
        }
        random=r.nextInt(10);
        result=result+random;
        System.out.println(result);
        }
    }
}
