package airline;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Kumar Ajit
 */

public class Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public Mainframe() {
        super("AIRLINE RESERVATION SYSTEM");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/AirIndia.jpg")));
	NewLabel.setBounds(0, 0, 1950, 1000); 
	add(NewLabel); 
        
        JLabel AirlineManagementSystem = new JLabel("Welcome to Airline Reservation System");
	AirlineManagementSystem.setForeground(Color.WHITE);
        AirlineManagementSystem.setFont(new Font("poppins", Font.PLAIN, 36));
	AirlineManagementSystem.setBounds(400, 60,800, 55);
	NewLabel.add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("Airline System");
        AirlineSystem.setForeground(Color.BLUE);
        AirlineSystem.setFont(new Font("poppins", Font.PLAIN,15));
	menuBar.add(AirlineSystem);   
      
        JMenu bookFlight = new JMenu("Book Ticket");
        bookFlight.setForeground(Color.BLACK);
        bookFlight.setFont(new Font("poppins", Font.PLAIN,15));
        menuBar.add(bookFlight); 
        
       /** JMenuItem bookTicket = new JMenuItem("Book Ticket");
	bookTicket.add(bookTicket);
        **/
        

      
        JMenuItem FlightDetails = new JMenuItem("Flight Information");
	AirlineSystem.add(FlightDetails);
		
	JMenuItem ReservationDetails = new JMenuItem("Add Customer Details");
	AirlineSystem.add(ReservationDetails);
		
	JMenuItem PassengerDetails = new JMenuItem("Journey Details");
	AirlineSystem.add(PassengerDetails);
		
	JMenuItem SectorDetails_1 = new JMenuItem("Payment Details");
	AirlineSystem.add(SectorDetails_1);
		
	JMenuItem Cancellation = new JMenuItem("Cancellation");
	AirlineSystem.add(Cancellation);
        
        JMenu exit = new JMenu("Logout");
        exit.setForeground(Color.RED);
        exit.setFont(new Font("poppins", Font.PLAIN,15));
	menuBar.add(exit);
		
        JMenuItem logout = new JMenuItem("Logout");
	exit.add(logout);
        
		
	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
	});
        
	ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Add_Customer();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
		
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
	});
        
        logout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                setVisible(false);
                new Login().setVisible(true);
            }
	});
		
        setSize(1950,1090);
	setVisible(true);
    }
}
