public class BinaryConverter {
    public static void main(String[] args) {

        String binary = "1010101001111110111111111010101";
        Long reult = 0L;

        for (int i = 0; i < binary.length(); i++) {
            int reversIdex = binary.length() - 1 - i;
            char c = binary.charAt(reversIdex);
            int bit = Character.getNumericValue(c);

            reult += bit * (long)Math.pow(2, i);

        }
        System.out.println("Binarnie "+ binary+ " to "+ reult +" dziesiętnie");

    }
}
