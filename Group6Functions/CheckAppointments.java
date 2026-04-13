
package Group6Functions;

public class CheckAppointments {
    
    public void viewAppointments (String [] names, int [] month, int [] days, int [] startHours, int [] endHours, int count) {
       
        
        System.out.println ("=== Appointment List ===\n");
        if (count == 0) {
            System.out.println ("No Appointments found");
        }
        
        for (int i = 0; i < count; i++) {
        System.out.println ("Appointment by " + names[i]);
        System.out.println ("Month: " + month [i]);
        System.out.println ("Day: " + days [i]);
        System.out.println ("Time Start (24 Hour Format): " + startHours [i] + ":00");
        System.out.println ("Time End: (24 Hour Format): " + endHours [i] + ":00");
        System.out.println ("\n------------------------------\n");
        
        }
    }
    

    public void alphabeticalSort (String [] names, int [] month, int [] days, int [] startHours, int [] endHours, int count ) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    int tempMonth = month[j];
                    month[j] = month[j + 1];
                    month[j + 1] = tempMonth;

                    int tempDay = days[j];
                    days[j] = days[j + 1];
                    days[j + 1] = tempDay;

                    int tempStart = startHours[j];
                    startHours[j] = startHours[j + 1];
                    startHours[j + 1] = tempStart;

                    int tempEnd = endHours[j];
                    endHours[j] = endHours[j + 1];
                    endHours[j + 1] = tempEnd;
                }

            }
        }

        System.out.println ("\n=== Sort By Name ===\n");

        for (int i = 0; i < count; i++) {
        System.out.println ("Appointment by " + names[i]);
        System.out.println ("Month: " + month [i]);
        System.out.println ("Day: " + days [i]);
        System.out.println ("Time Start (24 Hour Format): " + startHours [i] + ":00");
        System.out.println ("Time End: (24 Hour Format): " + endHours [i] + ":00");
        System.out.println ("\n------------------------------\n");
        
        }

        System.out.println("Sorted Alphabetically!");

    }

    public void DateSort (String [] names, int [] month, int [] days, int [] startHours, int [] endHours, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                boolean swap = false;

                if (month[j] > month[j + 1]) {
                    swap = true;
                } else if (month[j] == month[j + 1] && days[j] > days[j + 1]) {
                    swap = true;
                } else if (month[j] == month[j + 1] && days[j] == days[j + 1] && startHours[j] > startHours[j + 1]) {
                    swap = true;
                }

                if (swap) {
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    int tempMonth = month[j];
                    month[j] = month[j + 1];
                    month[j + 1] = tempMonth;

                    int tempDay = days[j];
                    days[j] = days[j + 1];
                    days[j + 1] = tempDay;

                    int tempStart = startHours[j];
                    startHours[j] = startHours[j + 1];
                    startHours[j + 1] = tempStart;

                    int tempEnd = endHours[j];
                    endHours[j] = endHours[j + 1];
                    endHours[j + 1] = tempEnd;
                }
            }
        }

        System.out.println ("\n=== Sort By Date ===\n");

        for (int i = 0; i < count; i++) {
        System.out.println ("Appointment by " + names[i]);
        System.out.println ("Month: " + month [i]);
        System.out.println ("Day: " + days [i]);
        System.out.println ("Time Start (24 Hour Format): " + startHours [i] + ":00");
        System.out.println ("Time End: (24 Hour Format): " + endHours [i] + ":00");
        System.out.println ("\n------------------------------\n");
        
        }

        System.out.println("Sorted By Date!");
    }
}
