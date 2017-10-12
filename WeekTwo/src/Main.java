public class Main {
    public static void main(String[] args){
        CreateIntArray();
    }

    private static void CreateIntArray() {
        long startTime = System.nanoTime();
        int[] arr = new int[1000];
        for (int i =0; i<1000; i++){
            arr[i]= i*2;
        }
        long endTime = System.nanoTime();
        System.out.println("总执行时间："+(endTime-startTime));
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
