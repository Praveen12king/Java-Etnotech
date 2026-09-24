public class onedimen {
    public static void main(String[] args){
        int[] array={1,2,3,4};
        int sum=0;
        int max=array[0];
        int min=array[0];
        int evencount=0;
        int oddcount=0;

        for(int i=0;i<array.length;i++){
            sum+=array[i];
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
            if(array[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        int left=0;
        int right=array.length-1;
        while(left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        for(int num:array){
            System.out.println(num+" ");
        }
        System.out.println("sum: "+sum);
        System.out.println("max: "+max);
        System.out.println("min: "+min);
        System.out.println("even count: "+evencount+" odd count: "+oddcount);
        
    }
}
