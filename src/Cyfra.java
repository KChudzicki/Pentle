public class Cyfra {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 3, 4, 0, 2, 1, 1, 3, 2, 4, 4, 1, 2, 3, 4, 5, 6, 2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        int[] counters = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }
        for (int i : counters) {
            //System.out.println(i);
        }
        int mostFrequent = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;

            }
        }
        System.out.print("Najczęścieje wysępującą cyfrą jest cyfra: " + mostFrequent);
        System.out.println(", wystąpiła " + counters[mostFrequent] + " razy.");
    }
}
