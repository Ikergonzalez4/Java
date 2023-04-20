package obj.objects;

import obj.Enum.Banned;
import obj.Interface.ClassSchedule;

import java.util.Date;

public class SpinningClass extends GymClass implements ClassSchedule {

    public SpinningClass(String name, String description, Date date, int duration, int maxCapacity, Banned banned) {
        super(name, description, date, duration, maxCapacity, banned);
    }

    public void printSchedulePump() {
        System.out.println("");
    }

    public static void printScheduleSpinning() {
        System.out.println(" ____________________________");
        System.out.println("/                            \\");
        System.out.println("|     Clases de Spinning     |");
        System.out.println("|____________________________|");
        System.out.println("|1:00  | 2:00 | 3:00 | 4:00 |");
        System.out.println("|______|______|______|______|");
        System.out.println("| 5:00 | 6:00 | 7:00 | 8:00 |");
        System.out.println("|______|______|______|______|");
        System.out.println("| 9:00 |10:00 |11:00 |12:00 |");
        System.out.println("|______|______|______|______|");
        System.out.println("|13:00 |14:00 |15:00 |16:00 |");
        System.out.println("|______|______|______|______|");
        System.out.println("|17:00 |18:00 |19:00 |20:00 |");
        System.out.println("|______|______|______|______|");
        System.out.println("|21:00 |22:00 |23:00 |24:00 |");
        System.out.println("|______|______|______|______|");
    }


}


