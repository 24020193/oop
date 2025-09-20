public class Introduction {
    public static void main(String[] args) {

        System.out.println("Trịnh Tiến Kiệt\t24020193\tINT_2024_4\t24020193\t24020193@vnu.edu.vn");


        for (int i = 20; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            System.out.println("Take one down, pass it around,");
            if (i - 1 <= 0) {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}
