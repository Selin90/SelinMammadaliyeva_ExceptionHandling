import java.util.HashMap;
import java.util.Map;

public class Tapshiriq_8 {

    public static void main(String[] args) {
        // 1. HashMap yarat: filial adı, günlük müştəri sayı
        HashMap<String, Integer> filiallar = new HashMap<>();
        filiallar.put("Nərimanov", 45);
        filiallar.put("Yasamal", 60);
        filiallar.put("Sebail", 30);
        filiallar.put("Xetai", 55);

        // 2. Cüt sayını çap et
        System.out.println("Cüt sayı: " + filiallar.size());

        // 3. Dövr ilə hər cütü "filial, say" formatında çap et
        for (Map.Entry<String, Integer> cut : filiallar.entrySet()) {
            System.out.println(cut.getKey() + " → " + cut.getValue());
        }

        // 4. Bir filial bağlanır - bazadan sil
        filiallar.remove("Sebail");

        // 5. Cüt sayını yenidən çap et
        System.out.println("Yeni cüt sayı: " + filiallar.size());
    }
}