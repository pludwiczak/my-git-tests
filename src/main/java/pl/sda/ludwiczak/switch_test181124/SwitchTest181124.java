package pl.sda.ludwiczak.switch_test181124;


import pl.sda.ludwiczak.loop.DaysOfMonths181124;




public class SwitchTest181124 {



    public static void main(String[] args) {
        final int a = 5; // final - tylko raz możemy ustawić wartość, final pieczętuje referencję!!

        changeInt(a);
        System.out.println("a after method call: " + a);

        final StringBuilder builder = new StringBuilder(); // StringBuilder - coś co możemy modyfikować, final pieczętuje refencję!! obiekt możemy modyfikować
        builder.append(1);
        builder.append(2);
        builder.reverse();
//        builder = new StringBuilder(); <- tego nie można!! bo jest final!! nie można referencji zmienić!!

        checkDaysOfMonths(DaysOfMonths181124.JUNE);
        checkMarkWithSwitch(6);

    }

    public static void changeInt (int a) {
        a = 6;
        System.out.println("a inside method: " + a);
    }

    public static void checkMarkWithSwitch(int mark) {

        switch (mark) {
            case 6:
            case 5:
                System.out.println("brawo!");
                break;
            case 4:
            case 3:
                System.out.println("ok");
                break;
                default:
                    System.out.println(":(");
        }
    }




    public static void checkDaysOfMonths(DaysOfMonths181124 currentMonth) {

        switch (currentMonth) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                System.out.println("31");
                break;

            case FEBRUARY:
                System.out.println("28");
                break;

                default:
                System.out.println("30");
        }
    }






    public static void checkMark (int mark) {
        if (mark == 6 || mark == 5) {
            System.out.println("brawo!");

        }

        else if (mark == 4 || mark == 3) {
            System.out.println("ok");
        }

        else {
            System.out.println(":(");
        }

    }

}
