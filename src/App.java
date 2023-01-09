public class App {
    public static void main(String[] args) throws Exception {
        int qtd = 10;
        int i = 1;
        while (i <= qtd) {
            int j = 1;
            String text = "";
            while (j <= i) {
                text += i;
                j++;
            }
            System.out.println(text);
            i++;
        }
    }
}
