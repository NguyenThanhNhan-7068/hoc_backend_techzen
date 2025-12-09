package Buoi8_bai_hoc_ngay_3_12_2025;

public class DeleteElementArray {
    public static int[] xoaPhanTuMang(int[] arr, int index){
        int[] newArr = new int[arr.length-1];
        for (int i= 0;i<newArr.length;i++){
            if(i<index) newArr[i] = arr[i];
            else  newArr[i] =arr[i+1];

        }
        return newArr;
    }
    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+ " ");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        arr = xoaPhanTuMang(arr,2);
        System.out.print("xuat mang: ");
        xuatMang(arr);

    }
}
