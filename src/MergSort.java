import java.util.Arrays;

public class MergSort {

    public static void main(String[] args){
        MergSort mergee = new MergSort();
        int[] arrat = new int[]{1,4,6,7,3,5,4,7,9,7,6,4};
        mergee.SplitArray(arrat,2);


    }

    public MergSort(){
        arrayy = new Object[9];
    }

    private Object[] arrayy;
/*
    public Object[] mergeSortt(Object[] data){
        if(data.length < 2){
            return data;
        }
        int middleIndex = (int)data.length / 2;
       


    }*/
        public void SplitArray(int[] a, int pos){
         int n = a.length;
         if (pos > 0 && pos < n){
             int[] b = new int[pos];
             int[] c = new int[n - pos];
             b = Arrays.copyOfRange(a,0,pos);
             c = Arrays.copyOfRange(a,pos,n);
             pprint(b);
             pprint(c);
         }
         else{
             System.out.println("Invalid position");
         }
        }

        static void pprint(int arr[]){
         DynamicArray dynamicArray = new DynamicArray();
          for(int var: arr){
           // System.out.print(var + " ");
            dynamicArray.add(var);


          }
         //System.out.println();
            System.out.println(dynamicArray.toString());
        }

}
