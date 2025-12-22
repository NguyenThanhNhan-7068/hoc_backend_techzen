package java_core.Buoi8_bai_tap_ngay_3_12_2025;

public class BaiTap1 {
    public static boolean isPrime(int n){
        if(n<2) return false;
        int count =0;
        for (int i = 1; i<= n;i++){
            if(n % i == 0) count++;
        }
        return count == 2;
    }
    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) System.out.print(a[i]+ " ");
    }
    public static int[] splitArray(int[] a){
        int count =0;
        for (int x : a){
            if(isPrime(x)) count++;
        }
        int[] b = new int[count];

        int index =0;
        for (int x : a) {
            if (isPrime(x)) b[index++] = x;
        }
        return b;

    }
    public static int[][] splitArrayAIntoArrayBAndC(int[] a){
        int countPositive =0;
        for(int x : a){
            if(x>0) countPositive++;
        }
        int[] b = new int[countPositive];
        int[] c = new int[a.length-countPositive];
        int indexB = 0;
        int indexC = 0;
        for(int x : a){
            if(x>0) b[indexB++] = x;
            else c[indexC++] = x;
        }
        return new int[][]{b,c};
    }

    public static int[] interchangeSort(int[] a){
        for(int i =0;i < a.length -1; i++){
            for (int j =i+1; j<a.length;j++){
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public static int[] descendingInterchangeSort(int[] a) {
        for(int i =0;i < a.length -1; i++){
            for (int j =i+1; j<a.length;j++){
                if(a[i]<a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[][] sortSpecial(int[] a) {
        int countDuong = 0;
        int countAm = 0;
        int count_0= 0 ;

        for(int x : a){
            if(x>0) countDuong++;
            else if (x<0) countAm++;
            else count_0++;
        }
        int[] am = new int[countAm];
        int[] duong = new int[countDuong];
        int[] zero = new int[count_0];
        int indexDuong = 0;
        int indexAm = 0;
        int indexZero =0;

        for(int x : a){
            if(x >0) duong[indexDuong++]=x;
            else if (x<0) am[indexAm++] = x;
            else zero[indexZero++] = x;
        }
        descendingInterchangeSort(duong);
        interchangeSort(am);
        return new int[][]{duong,am,zero};

    }
    public static void reverse(int[] a){
        int left =0;
        int right = a.length-1;
        while (left<right){
            int temp;
            temp= a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }

    }
    public static boolean checkSymmetry(int[] a){
        int left =0;
        int right = a.length-1;
        int count =0;
        while (left < right){
            if(a[left] == a[right]){
                count++;
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
    public static int countSymmetry(int[] a){
        int left =0;
        int right = a.length-1;
        int count =0;
        while (left < right){
            if(a[left] == a[right]) count++;
            left++;
            right--;
        }
        return count;

    }

    public static void main(String[] args) {
        int[] a = {-1,2,3,-4,5,6,7,0};
        int[] test = {1,2,3,2,1};
        int[] b = splitArray(a);

//        1a: Tách các số nguyên tố có trong mảng a đưa vào mảng b
        splitArray(a);
        System.out.print("\n1a.mang so nguyen to b: ");
        xuatMang(b);
        System.out.println("\n======================================");

//        1b: Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)
        int[][] bc  = splitArrayAIntoArrayBAndC(a);
        System.out.print("\n1b.mang duong b: ");
        xuatMang(bc[0]);
        System.out.print("\nmang so con lai: ");
        xuatMang(bc[1]);
        System.out.println("\n======================================");

//        1c: Sắp xếp mảng giảm dần
        interchangeSort(a);
        System.out.print("\n1c.xap xep mang tang dan: "  );
        xuatMang(a);
        System.out.println("\n======================================");

//        1d: Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0
        int[][] sortSpecial = sortSpecial(a);
        System.out.print("\n1d.sap xep mang theo yeu cau: ");
        xuatMang(sortSpecial[0]);
        xuatMang(sortSpecial[1]);
        xuatMang(sortSpecial[2]);
        System.out.println("\n======================================");


//        1e: Đảo thứ tự các phần tử của mảng a
        reverse(test);
        System.out.print("\n1e.Dao mang: ");
        xuatMang(test);
        System.out.println("\n======================================");

//        1f:Kiểm tra xem mảng a có phải là mảng đối xứng hay không
        System.out.println("kiem tra mang doi xung: "+ checkSymmetry(test));
        System.out.println("\n======================================");

//        1g: Đếm số cặp số đối xứng trong mảng
        System.out.print("\nCo "+ countSymmetry(test)+" cap doi xung trong mang.");



    }

}
