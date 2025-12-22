package java_core.buoi4_bai_hoc_ngay24_11;

//NestedLoop: vong lap long nhau
public class NestedLoop {
    public static void veHinhChuNhatRong(){
        int hang = 5;
        int cot = 6;

        for(int i = 1; i <= hang;i++){
            for(int j =1; j<= cot;j++){
                if(i == 1 || i == hang || j ==1 || j == cot){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

//            if( i == 1 || i == hang){
//                for(int j =1;j <= cot; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            else{
//                for(int j =1;j <= cot; j++){
//                    if(j == 1 || j == cot) System.out.print("* ");
//                    else{
//                        System.out.print("  ");
//                    }
//                }
//                System.out.println();
//            }
        }
    }
    public static void veTamGiacVuongCan(){
        int canh =5;
        for(int i = 1;i <= canh;i++){
            for(int j =1;j <= i; j++) System.out.print("* ");
            System.out.println();

        }

    }
    public static void main(String[] args) {
//        for(int i=1; i<3;i++){
//            System.out.println("==== vong lap ngoai: "+ i + "=====");
//            for(int j=1;j <= 2;j++) System.out.println("-----vong lap trong: "+ j +"----------");
//        }
        veHinhChuNhatRong();
        System.out.println("=============================");
        veTamGiacVuongCan();
    }
}
