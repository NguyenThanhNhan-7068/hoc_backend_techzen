package Buoi8_bai_hoc_ngay_3_12_2025;

public class InterchangeShort {
    public static void sapXepMang(int[] arr){
        for(int i =0;i < arr.length -1; i++){
            for (int j =i+1; j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+ " ");
    }

    public static void main(String[] args) {
        int[] arr ={12,2,8,5,1,6,4,15};
        sapXepMang(arr);
        System.out.println("ket qua: ");
        xuatMang(arr);
    }
}
