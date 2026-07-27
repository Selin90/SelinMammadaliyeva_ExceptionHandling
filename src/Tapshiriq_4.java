public class Tapshiriq_4 {
    static final double GUNDELIK_LIMIT = 2000;

    public static void nagdCixar(double mebleg) throws LimitKecildiException {
        if (mebleg > GUNDELIK_LIMIT) {
            throw new LimitKecildiException("Gündəlik limit aşıldı: " + mebleg + " AZN, icazə verilən maksimum " + GUNDELIK_LIMIT + " AZN-dir");
        }
        System.out.println("Nağd çıxarıldı: " + mebleg + " AZN");
    }

    public static void main(String[] args) {
        try {
            nagdCixar(1500);
        } catch (LimitKecildiException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        try {
            nagdCixar(2500);
        } catch (LimitKecildiException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}
