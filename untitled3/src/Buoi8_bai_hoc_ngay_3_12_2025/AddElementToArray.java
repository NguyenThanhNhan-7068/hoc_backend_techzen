package Buoi8_bai_hoc_ngay_3_12_2025;

public class AddElementToArray {
    public static int[] themPhanTuCuoiMang(int[] arr,int e){
//        buoc 1: tao mang moi
        int[] newArr = new int[arr.length +1];
//        buoc 2: dan toan bo du lieu mang cu vao mang moi
        for (int i = 0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
//        buoc 3: gan e vao cuoi mang
        newArr[newArr.length -1] =e;
        return newArr;
    }
    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+ " ");
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        arr= themPhanTuCuoiMang(arr,8);
        System.out.println("xuat mang moi: " );
        xuatMang(arr);
    }
}
