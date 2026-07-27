public class Tapshiriq_3 {

    public static void kocurmeEt(double mebleg) {
        if (mebleg <= 0) {
            throw new IllegalArgumentException("Məbləğ sıfır və ya mənfi ola bilməz: " + mebleg);
        }
        System.out.println("Köçürüldü: " + mebleg);
    }

    public static void main(String[] args) {
        // 1-ci çağırış: müsbət məbləğ
        kocurmeEt(500.0);

        // 2-ci çağırış: mənfi məbləğ
        try {
            kocurmeEt(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}