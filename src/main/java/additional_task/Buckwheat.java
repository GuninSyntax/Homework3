package additional_task;

public class Buckwheat {

    public static void main(String[] args) {
        int priceForStorage = 100;
        int totalPriceForStorage = 0;
        int eatsKilogram = 6;
        int totalNumberKilogram = 0;
        int remainingKilograms;
        int monthsOfEating = 8;

        for (int i = monthsOfEating; i > 0; i--) {
            totalNumberKilogram += eatsKilogram;
        }

        remainingKilograms = totalNumberKilogram;

        for (int i = monthsOfEating; i > 0; i--) {
            totalPriceForStorage += priceForStorage * remainingKilograms;
            remainingKilograms -= eatsKilogram;
        }

        System.out.println("Василий расчитывает питаться гречкой " + monthsOfEating + " месяцев");
        System.out.println("Общее кол-во килограмм гречки: " + totalNumberKilogram);
        System.out.println(totalPriceForStorage + " рублей потребуется Василию, чтобы оплатить хранение гречки");
    }
}
