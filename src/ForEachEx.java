public class ForEachEx {
//    public static void main(String[] args) {
//        int[] a = {10,20,30,40,50};
//        for(int x:a){
//            System.out.println(x);
//        }

    public static void main(String[] args) {
        int[][] a = {{10, 20, 30}, {40, 50}};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println(a[i][j]);
//            }
//
//        }
        
        for(int[] x:a){
            for(int y:x){
                System.out.println(y);
            }
        }

    }
}
