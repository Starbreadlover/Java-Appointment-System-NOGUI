
package Group6Functions;

public class CheckAppointments {
    
    public void viewAppointments (String [] names, int [] month, int [] days, int [] startHours, int [] endHours, int count) {
       
        
        System.out.println ("=== Appointment List ===");
        if (count == 0) {
            System.out.println ("No Appointments found");
        }
        
        for (int i = 0; i < count; i++) {
        System.out.println ("Appointment by " + names[i]);
        System.out.println ("Month: " + month [i]);
        System.out.println ("Day: " + days [i]);
        System.out.println ("Time Start (24 Hour Format): " + startHours [i] + ":00");
        System.out.println ("Time End: (24 Hour Format)" + endHours [i] + ":00");
        System.out.println ("------------------------------");
        
        }
    }
    
}
