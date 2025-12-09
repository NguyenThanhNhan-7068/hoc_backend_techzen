package Buoi8_bai_hoc_ngay_3_12_2025;

public class inputK {
    public static int[] themK(int[] arr,int index,int k){
        int[] newArr= new int[arr.length +1];
        for (int i=0;i< newArr.length;i++){
            if(i < index){
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[index] = k;
            }
            else {
                newArr[i] = arr[i-1];
            }
        }
        return newArr;
    }
    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+ " ");
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        arr = themK(arr,2,6);
        System.out.print("xuat mang: ");
        xuatMang(arr);


    }
}
