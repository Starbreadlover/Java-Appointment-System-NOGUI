import Group6Functions.*;
import java.util.Scanner;

public class Group6AppointmentSystem {
    public static void main (String [] args) {
        
        Scanner scanner = new Scanner (System.in);
        MakeAppointments make = new MakeAppointments();
        CheckAppointments check = new CheckAppointments();
        CancelAppointment cancel = new CancelAppointment();

        int choice;
        int sort;
        do  {
            
            System.out.println ("\n===== Welcome To Group6 Corp Appointment System =====");
            System.out.println ("[1] Book An Appointment");
            System.out.println ("[2] View Booked Appointments");
            System.out.println ("[3] Cancel Appointment");
     
            System.out.print ("Enter Choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 :
                    make.getInput(scanner);
                    break;
                    
                case 2:
                    check.viewAppointments(make.getAppointmentNames(), make.getAppointmentMonth(), make.getAppointmentDays(),
                    make.getstartHours(), make.getendHours(),make.getCount());

                    System.out.println("[1] Sort Alphabetically");
                    System.out.println("[2] Sort By Date");
                    System.out.println ("[3] Exit View Booked Appointments");
                    System.out.print("Choice: ");
                    sort = scanner.nextInt();

                    if (sort == 1) {
                        check.alphabeticalSort(make.getAppointmentNames(), make.getAppointmentMonth(), make.getAppointmentDays(), 
                        make.getstartHours(), make.getendHours(), make.getCount());
                    } else if (sort == 2) {
                        check.DateSort(make.getAppointmentNames(), make.getAppointmentMonth(), make.getAppointmentDays(), 
                        make.getstartHours(), make.getendHours(), make.getCount());
                    } else if (sort == 3) {
                        break;
                    }
                    break;
                    
                case 3:
                    cancel.cancel(scanner, make.getAppointmentNames(), make.getAppointmentMonth(), make.getAppointmentDays(), make.getstartHours(),
                            make.getendHours(), make.getCount());
                    
                    
                default :
                    break;
        }
            
            
        } while (choice != 6);
        
    }
    
}