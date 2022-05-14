package kahveMakinesi;

public class KahveRunner {
    public static void main(String[] args) {

        KahveSecim.kahveListesiniOlustur();

        System.out.println(KahveSecim.kahveEkranListi.get(0));
    }
}
