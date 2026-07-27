public class Tapshiriq_2 {
    static String kartSahibi;
    public static void main(String[]args) {
        kartSahibi = null;
        yoxla();
        kartSahibi = "Aziz Alimetov";
        yoxla();
    }
        public static void yoxla(){
            try{
                int uzunluq = kartSahibi.length();
                System.out.println("Kartın üzərindəki adın simvol sayı: " + uzunluq);
            }catch (NullPointerException e ){
                System.out.println("Kart məlumatı tapılmadı");
            }finally {
                System.out.println("Sessiya bağlandı");
            }
        }


    }


//Sinifdə String kartSahibi dəyişəni elan et. Kartın üzərindəki adın simvol sayını hesablayıb çap
// edən proqram yaz. Dəyişən null olduqda proqram dayanmamalı, "Kart məlumatı tapılmadı" mesajı
// verilməlidir. Nəticə necə olursa olsun, proqramın sonunda "Sessiya bağlandı" sətri mütləq çap
// olunmalıdır. Proqramı iki halda yoxla: əvvəl dəyişənə null, sonra real ad mənimsədilmiş vəziyyətdə
