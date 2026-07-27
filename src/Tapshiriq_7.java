import java.util.HashMap;
import java.util.Scanner;

public class Tapshiriq_7 {

    public static void main(String[] args) {
        // 1. HashMap yarat: müştəri kodu, müştəri adı
        HashMap<String, String> musteriler = new HashMap<>();
        musteriler.put("M001", "Elvin Memmedov");
        musteriler.put("M002", "Aygun Aliyeva");
        musteriler.put("M003", "Rashad Huseynov");
        musteriler.put("M004", "Nigar Qasimova");

        // 2. Scanner ilə istifadəçidən müştəri kodu al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Müştəri kodunu daxil edin: ");
        String kod = scanner.nextLine();

        // 3. Kod bazada varsa adı çap et, yoxdursa mesaj ver
        if (musteriler.containsKey(kod)) {
            System.out.println("Müştəri adı: " + musteriler.get(kod));
        } else {
            System.out.println("Belə müştəri tapılmadı");
        }

        scanner.close();
    }
}
