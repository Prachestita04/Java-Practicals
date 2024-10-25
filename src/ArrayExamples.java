import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        String s = new String("Mamuni1");
        System.out.println(s);

        int[] e=new int[0];
        System.out.println(e.length);

        //check output
        //int[] d=new int[-3];
       // int[] d1=new int[2147483647];
        //int[] d2=new int[2147483648];

        int[][][] a = {{{10}}, {{20}}, {{30}}};
        //System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[j].length;k++){
                    System.out.println(a[i][j][k]);
                }
            }
        }
        int[] a1 = {10, 20, 30};
        System.out.println(Arrays.toString(a1));
        int[] b = new int[3];
        b[0] = 40;
        b[1] = 50;
        b[2] = 60;
        System.out.println(Arrays.toString(b));
        int[] c = new int[3];
        c[0]= 70;
        c[1] = 80;
        c[2] = 90;
        for(int i=0;i<3;i++){
            System.out.println(c[i]);
        }
        String s1 = "[10, 20, 30]";
        System.out.println(s1);

        //int[] a2=new int[2147483647];
        //System.out.println(a2);
    }
}
