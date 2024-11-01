public class Array {
    public static void main(String[] args){
        int[][] arr=new int[][]{
            {11,22,33},
            {44,555,66,77,88}
        };
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+",");
        //     }
        //     System.out.println();
        // }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=getSum(arr[i]);
            System.out.println("第"+(i+1)+"个季度总营业额为:"+sum);
        }
    }
    public static int  getSum(int[] arr){
        int sum=0;
        for(int j=0;j<arr.length;j++){
                   sum=sum+arr[j];
             }
             return sum;
    }
}
