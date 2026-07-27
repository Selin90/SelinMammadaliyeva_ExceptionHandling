import java.util.ArrayList;

public class Tapshiriq_6 {

    public static void main(String[] args) {
        // 1. ArrayList yarat, 5 əməliyyat məbləği əlavə et
        ArrayList<Integer> emeliyyatlar = new ArrayList<>();
        emeliyyatlar.add(150);
        emeliyyatlar.add(320);
        emeliyyatlar.add(75);
        emeliyyatlar.add(500);
        emeliyyatlar.add(240);

        // 2. for-each dövrü ilə ümumi cəmi hesabla
        int cem = 0;
        for (int meblegh : emeliyyatlar) {
            cem += meblegh;
        }
        System.out.println("Günün ümumi cəmi: " + cem);

        // 3. İş günü bağlanır - siyahını tam təmizlə
        emeliyyatlar.clear();

        // 4. Siyahının boş olub-olmadığını yoxla və çap et
        boolean bosdurmu = emeliyyatlar.isEmpty();
        System.out.println("Siyahı boşdur: " + bosdurmu);
    }
}