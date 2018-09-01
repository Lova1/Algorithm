package Algorithms;

public class Recursion {

    //todo move away SumArray subclass from Recursion() class
    static class SumArray {

        private int ar [];
        private int len, res;

        public SumArray(int ar[]) {
            this.ar = ar;
            len = ar.length-1;
            res = 0;
        }

        public int sum() {
            for (int i = 0; i <= len; i++) {
                res += ar[i];
            }
            return res;
        }
    }

    static class RecSum {

        //todo create constructor with parameters and reconstruct recsum() method
/*      private int num;

        public RecSum(int num){
            this.num = num;
        }*/

        public int recsum(int num){

            if (num == 1)
                return 1;
            else
                return recsum(num - 1) + num;
        }
    }

    public static void main(String[] args) {

        int arr [] = new int[]{1,2,3,4,5,5,100};
        SumArray sr = new SumArray(arr);
        System.out.println("The Sum of all array numbers = " + sr.sum());

        RecSum rs = new RecSum();
        System.out.println("The Sum using Recursion = " + rs.recsum(11));
    }
}
