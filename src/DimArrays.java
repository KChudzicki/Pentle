public class DimArrays {
    public static void main(String[] args) {
        int[][][] arr = {{{1, 2, 3}, {5}}, {{11}}, {{21, 22}}};

//        int[] a = {1, 2, 3};
//        int[] b = {11, 12, 13};
//        int[] c = {21, 22, 23};
//
//        int[][][] arr;
//        arr = new int[][][]{a, b, c};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + arr[i][j][k]);
                }

            }

        }
    }
}

