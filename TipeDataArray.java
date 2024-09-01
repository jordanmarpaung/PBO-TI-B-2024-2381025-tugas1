public class TipeDataArray {
    public static void main(String[] args) {
        int[] arrayInteger = new int[3];
        arrayInteger[0] = 30;
        arrayInteger[1] = 45;
        arrayInteger[2] = 65;

        int[] arrayInteger2 = new int[]{30, 45, 65};
        arrayInteger2[1] = 45;
        System.out.println(arrayInteger2);


        int[][] arrayInteger3 = new int[][] {{30, 45, 65}, {100, 110, 120}, {70, 80, 100}};
        System.out.println(arrayInteger3[0][2] + arrayInteger3[1][2]);

        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] =30;
        arrayOfObject[1] ="Jordan Marpaung";
        arrayOfObject[2] =30L;
        System.out.println(arrayOfObject[1]);
    }
}

