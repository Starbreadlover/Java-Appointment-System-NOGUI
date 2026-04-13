
import Group6Functions.*;
import java.util.Scanner;

public class Group6AppointmentSystem {
    public static void main (String [] args) {
        
        Scanner scanner = new Scanner (System.in);
        MakeAppointments make = new MakeAppointments();
        CheckAppointments check = new CheckAppointments();
        
        int choice;
        do  {
            
            System.out.println ("===== Welcome To Group6 Corp Appointment System =====");
            System.out.println ("[1] Book An Appointment");
            System.out.println ("[2] View Booked Appointments ");
     
            System.out.print ("Enter Choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 :
                    make.getInput(scanner);
                    break;
                    
                case 2:
                    check.viewAppointments(make.getAppointmentNames(), make.getAppointmentMonth(), make.getAppointmentDays(),
                            make.getstartHours(), make.getendHours(),make.getCount());
                    break;
                            
                    
                    
                default :
                    break;
        }
            
            
        } while (choice != 6);
        
    }
    
}
