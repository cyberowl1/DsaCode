public class maxAnd{
    static int checkMaxAnd(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = arr[i]&arr[j];
                if(sum<temp)sum=temp;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr = {3,5,8,10,12};
        int result = checkMaxAnd(arr);
        System.out.println(result);

    }
}