public class Main {
    public static void main(String[] args) {
        Publikacja nowa = new Publikacja("Rewelacyjna Publikacja", 100.0, 2023, 1, 17);
        System.out.println(nowa);
        System.out.println(Publikacja.getIle());
        Publikacja stara = new Publikacja("Stara Publikacja",20,1970,12,12);
        System.out.println(stara);
        System.out.println(Publikacja.getIle());
        System.out.println(stara.equals(nowa));
    }
}

