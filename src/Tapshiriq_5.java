import java.util.ArrayList;

public class Tapshiriq_5 {

    public static void main(String[] args) {
        // 1. ArrayList yarat, 4 müştəri əlavə et
        ArrayList<String> novbe = new ArrayList<>();
        novbe.add("Elvin");
        novbe.add("Aygun");
        novbe.add("Rashad");
        novbe.add("Nigar");

        // 2. VIP müştəri növbənin başına əlavə olunur (0-cı indeksə)
        novbe.add(0, "VIP_Kamran");

        // 3. Konkret adın növbədə olub-olmadığını yoxla
        String axtarilanAd = "Rashad";
        boolean varMi = novbe.contains(axtarilanAd);
        System.out.println(axtarilanAd + " növbədədir: " + varMi);

        // 4. Bir müştərinin adını başqa adla əvəz et
        // Məsələn, "Nigar" adını "Leyla" ilə əvəz edək
        int index = novbe.indexOf("Nigar");
        if (index != -1) {
            novbe.set(index, "Leyla");
        }

        // 5. Siyahını adi for dövrü ilə "indeks: ad" formatında çap et
        for (int i = 0; i < novbe.size(); i++) {
            System.out.println(i + ": " + novbe.get(i));
        }
    }
}