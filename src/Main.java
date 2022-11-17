public class Main {
    public static void main(String[] args) {
        int i = 1;
        byte b = 0;
        short s = 12;
        long l = 1213123;
        float f = 1234;
        double d = 1212.121212121;
        System.out.println("Значение переменной i с типом int = " + i);
        System.out.println("Значение переменной b с типом byte = " + b);
        System.out.println("Значение переменной s с типом short = " + s);
        System.out.println("Значение переменной l с типом long = " + l);        //the first task
        System.out.println("Значение переменной f с типом float = " + f);
        System.out.println("Значение переменной d с типом double = " + d);

        int ii = 569;
        boolean bb = false;
        float ff = 27.12F;
        long ll = 987678965549L;                                                //the second task
        double dd = 2.786;
        byte bb1 = 67;
        char cc = 27897;
        short ss = -159;

        int firstGroup = 23;
        int secondGroup = 27;                                                   //the third task
        int thirdGroup = 30;
        int paperAmount = 480;
        System.out.println("На каждого ученика рассчитано " + paperAmount/(firstGroup+secondGroup+thirdGroup) + " листов бумаги.");

        int productivityPerMinute = 16/2;
        System.out.println("За 20 минут машина произвела " + productivityPerMinute * 20 + " бутылок.");
        System.out.println("За сутки машина произвела " + productivityPerMinute * 60 * 24 + " бутылок.");           //the fourth task
        System.out.println("За 3 дня машина произвела " + productivityPerMinute * 60 * 24 * 3 + " бутылок.");
        System.out.println("За 30 дней машина произвела " + productivityPerMinute * 60 * 24 * 30 + " бутылок.");

        int amountCanOfPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;                                                                     //the fifth task
        int numberOfClasses = amountCanOfPaint / (whitePaint + brownPaint);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaint * numberOfClasses + " банок белой краски и " + brownPaint * numberOfClasses + " банок коричневой краски.");

        int numberOfBananas = 5;
        int bananaWeight = 80;
        int milkVolume = 200;
        int milkWeight = 105;
        int numberOfIceCream = 2;
        int iceCreamWeight = 100;                                                           //the sixth task
        int numberOfEggs = 4;
        int weightEgg = 70;
        int totalWeightInGrams = numberOfBananas * bananaWeight + milkWeight * (milkVolume/100) + numberOfIceCream * iceCreamWeight + numberOfEggs * weightEgg;
        float totalWeightInKilograms = totalWeightInGrams/1000;
        System.out.println("Вес блюда равняется " + totalWeightInKilograms + " килограмм.");

        int goal = 7000;
        int minWeight = 250;
        int maxWeight = 500;
        System.out.println("В лучшем случае спортсмен сбросит вес за " + goal / maxWeight + " дней.");      //the seventh task
        System.out.println("В худшем за " + goal / minWeight + " дней.");
        System.out.println("В среднем за " + goal / ((minWeight + maxWeight) / 2) + " дней.");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double newMashaSalary = mashaSalary * 1.1;
        double newDenisSalary = denisSalary * 1.1;                                          //the eighth task
        double newKristinaSalary = kristinaSalary * 1.1;
        System.out.println("Теперь Маша получает " + newMashaSalary + " рублей. Годовой доход вырос на " + (newMashaSalary * 12 - mashaSalary * 12) + " рублей.");
        System.out.println("Теперь Денис получает " + newDenisSalary + " рублей. Годовой доход вырос на " + (newDenisSalary * 12 - denisSalary * 12) + " рублей.");
        System.out.println("Теперь Кристина получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + (newKristinaSalary * 12 - kristinaSalary * 12) + " рублей.");
            }
}





