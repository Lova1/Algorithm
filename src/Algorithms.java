import java.util.Arrays;

public class Algorithms {

    public static class Binary_search {

        private int low;
        private int high;
        private int src;
        private int ar[];

        public Binary_search(int ar[], int src){
            this.ar = ar;
            this.low = 0;
            this.high = ar.length-1;
            this.src = src;
        }

        public int search(){

            int mid;
            Arrays.sort(ar);

            while (low <= high) {

                mid = (low + high) / 2;

                if (ar[mid] == src) {
                    //System.out.println("There is " + src + " in this array !");
                    return src;
                }
                if (src < ar[mid]) {
                    high = mid - 1;

                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int ar [] = new int[]{21,4,5,71,11,33,55,62,82,100,11};
        Binary_search bs = new Binary_search(ar, 21);
        System.out.println(bs.search());
    }
}
