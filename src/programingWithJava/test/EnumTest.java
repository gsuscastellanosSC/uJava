/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import programingWithJava.managementEnum.Days;
import programingWithJava.managementEnum.Continents;

/**
 *
 * @author sc
 */
public class EnumTest {

    public static void main(String[] args) {
        System.out.println("\nDays of the week:   ");
        dayOfWeek(Days.MONDAY);
        dayOfWeek(Days.OTHER);
        dayOfWeek(Days.TUESDAY);
        dayOfWeek(Days.WEDNESDAY);
        dayOfWeek(Days.THURSDAY);
        dayOfWeek(Days.FRIDAY);
        dayOfWeek(Days.SATURDAY);
        dayOfWeek(Days.SUNDAY);

        System.out.println("\nContinents:   ");
        System.out.println("    Continent: no.4 " + Continents.AMERICA + " with: " + Continents.AMERICA.getContries() + " Countries");
    }

    private static void dayOfWeek(Days days) {
        switch (days) {
            case MONDAY:
                System.out.println("    First day of the week " + Days.MONDAY);
                break;
            case TUESDAY:
                System.out.println("    Second day of week " + Days.TUESDAY);
                break;
            case WEDNESDAY:
                System.out.println("    Third day of week " + Days.WEDNESDAY);
                break;
            case THURSDAY:
                System.out.println("    Fourth day of week " + Days.THURSDAY);
                break;
            case FRIDAY:
                System.out.println("    Fifth day of week " + Days.FRIDAY);
                break;
            case SATURDAY:
                System.out.println("    Sixth day of week " + Days.SATURDAY);
                break;
            case SUNDAY:
                System.out.println("    Seventh day of week " + Days.SUNDAY);
                break;
            default:
                System.out.println("    #N/A");
                break;
        }
    }
}
