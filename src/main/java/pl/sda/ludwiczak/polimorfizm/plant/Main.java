package pl.sda.ludwiczak.polimorfizm.plant;

import pl.sda.ludwiczak.data_type.enum_example.DaysOfAWeek;

public class Main {

    public static void main(String[] args) {

        Plant[] plants = makePlants();

        Gardener ogrodnik = new Gardener();
        Gardener lepszyOgrodnik = new BetterGardener();



        for (DaysOfAWeek weekDay : DaysOfAWeek.values()) { // .values - daj mi tablicę ze wszystkii elementami tablicy
//            for (int day = 0; day < 7; day++) {
            System.out.println(weekDay);
            for (Plant aaa : plants) {
                lepszyOgrodnik.waterPlant(aaa);
                lepszyOgrodnik.makePlantGrow(aaa);
            }

//            ogrodnik.makePlantGrow(cactus1);
//            ogrodnik.waterPlant(cactus1);
//
//            lepszyOgrodnik.makePlantGrow(cactus2);
//            lepszyOgrodnik.waterPlant(cactus2);
//
//            ogrodnik.makePlantGrow(rose1);
//            ogrodnik.waterPlant(rose1);
//
//            lepszyOgrodnik.makePlantGrow(rose2);
//            lepszyOgrodnik.waterPlant(rose2);
//
//            ogrodnik.makePlantGrow(opuncja1);
//            ogrodnik.waterPlant(opuncja1);
//
//            lepszyOgrodnik.makePlantGrow(opuncja2);
//            lepszyOgrodnik.waterPlant(opuncja2);


//            cactus1.increaseWaterLevel(3);
//            cactus1.grow();

        }




        for (Plant plant : plants) {
            System.out.println(plant);
        }


//        System.out.println(cactus1);
//        System.out.println(cactus2);
//
//        System.out.println(rose1);
//        System.out.println(rose2);
//
//        System.out.println(opuncja1);
//        System.out.println(opuncja2);




//        System.out.println("Current Water Level In Ml for Cactus1: " + cactus1.currentWaterLevelInMl);
//        System.out.println("Height In Cm for Cactus1: " + cactus1.heightInCm);
//
//        System.out.println("Current Water Level In Ml for Cactus2: " + cactus2.currentWaterLevelInMl);
//        System.out.println("Height In Cm for Cactus2: " + cactus2.heightInCm);
//
//        System.out.println("Current Water Level In Ml for Rose1: " + rose1.currentWaterLevelInMl);
//        System.out.println("Height In Cm for Rose1: " + rose1.heightInCm);


//        public static void printMyName (int frequency, String whatToShow) {
//            for (int i = 0; i <frequency; i++) {
//                System.out.println(whatToShow);
//            }


        }

        public static Plant[] makePlants() {
            Plant[] result = new Plant[6];

            Plant cactus1 = new Cactus(2, 1,0);
            result[0] = cactus1;
            result[1] = new Cactus(2, 1,0); // w porównaniu z dwoma liniami powyżej traci się referencję do cactus1
            result[2] = new Rose(30,3,0);
            result[3] = new Rose(30,3,0);
            result[4] = new Opuncja(10,5,0);
            result[5] = new Opuncja(10,5,0);

            return result;
        }
}



// 1) Main
// 2) 3 x 2 plant
// 3) 7 dni
// 4) efekt