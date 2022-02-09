/********************************************************************************
*This class will create circles objects when you click. the circles will be	*
* drawn recursively "every other line".						*
*										*
* @Author: Connor_Drummond							*
* @Version: September 29, 2019							*
********************************************************************************/

/********************************************************************************
*					Imports					*
********************************************************************************/
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/********************************************************************************
*					Main					*
********************************************************************************/

public class RecursiveCircles extends JPanel{

    static JFrame frame = new JFrame("Circles"); 		//Creates JFrame
    static ArrayList<Circle> circleList = new ArrayList<>();    //Array that stores circles

    public static void main(String[] args) {
        CircleGUI gui = new CircleGUI();                   	//Calls the method Assignment4
        frame.setBounds(200, 200, 800, 500);                    //Default boundaries for JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  	//Ends when window is closed
        frame.setVisible(true);                                 //Makes JFrame visible
    }

    /*Creates circle objects and draws them*/
    public class Circle {
        int coordX;						//X coordinate of mouse click
        int coordY;                                             //Y coordinate of mouse click
        int radius;                                             //Sets radius of the circle
        int red;                                                //Sets Red value of circle
        int grn;                                                //Sets green value of circle
        int blu;                                                //Sets blue value of circle

        public Circle(int x, int y, int rad){
            coordX = x;                                         //X coordinate of circle
            coordY = y;                                         //Y coordinate of circle
            radius = rad;                                       //Will be used for radius
            red = (int) (Math.random() * 255);                  //Generates random red value
            grn = (int) (Math.random() * 255);                  //Generates random green value
            blu = (int) (Math.random() * 255);                  //Generates random blue value
        }

        public void draw(Graphics g) {
            int currentX = coordX - radius;                     //X coordinate to center at click
            int currentY = coordY - radius;                     //Y coordinate to center at click
            int diameter = radius * 2;                          //Creates diameter for circle
            g.setColor(new Color(red, grn, blu));               //Circle's color to generated color
            g.fillOval(currentX, currentY, diameter, diameter); //Creates graphics for circle object
        }
    }

/***************************************************************************************************
*Recursive method that will draw circles on "every other line" that are offset by half the distance*
*of the previous drawn circles. Ends recursion when circles reach the bottom of the GUI or there is*
*no more room to draw in the GUI								   *
***************************************************************************************************/

    public void addCircles(int width, int height, int leftx, int rightx, int y, int rad){
        y = y + (rad * 4);					//Creates space in between circles
        
	if (y + rad > height - 65){
            return;						//Ends recursion when at bottom of GUI
        }

        leftx = leftx - leftx/2;                                //Offset of left circle
        rightx = rightx + leftx;                                //Offset of right circle
        Circle leftCircle = new Circle(leftx, y, rad);          //Creates new circle to the left
        Circle rightCircle = new Circle(rightx, y, rad);        //Creates new circle to the right
        circleList.add(leftCircle);                             //Adds circle object to array
        circleList.add(rightCircle);                            //Adds circle object to array
        addCircles(width, height, leftx, rightx, y, rad);       //Recursively calls addCircles
        addCircles(width, height, rightx, leftx, y, rad);       //Recursively calls addCircles
    }

    public CircleGUI() {
        frame.setJMenuBar(buildMenu());                         //Adds Menu Bar to the JFrame
        frame.add(this, BorderLayout.CENTER);                	//Adds this component

        this.addMouseListener(new MouseAdapter() {             	//Adds mouse click listener
            public void mouseClicked(MouseEvent e) {
                    int width = frame.getWidth();               //Gets GUI width
                    int height = frame.getHeight();             //Gets GUI height
                    int rad = ((width + height) / 80);          //Scales the radius based on GUI's square area
                    int x = width / 2;                          //Calculates half the GUI width
                    int y = rad;                                //Offsets circle height based on radius
                    circleList.clear();                         //Clears any circles on GUI
                    Circle myCircle = new Circle(x, y, rad);    //Creates new circle object
                    circleList.add(myCircle);                   //Adds circle object to array
                    addCircles(width, height, x, x, y, rad);    //Calls the add circle method
                    frame.repaint();                            //Repaints to add new circle
            }
        });
    }

    public JMenuBar buildMenu() {
        JMenuBar bar = new JMenuBar();                          //Creates menu bar for frame
        JButton reset = new JButton("RESET");                   //Creates button to reset
        
	reset.addActionListener(                                //Add action listener to button
                resetProgram -> {
                    circleList.clear();                         //Erases all circles in array
                    frame.repaint();                            //Repaints frame w/o graphics
                });

        bar.add(reset);                                         //Add button to menu bar
        return bar;                                             //Returns object
    }

    public void paintComponent(Graphics g) {
        /*for loop to draw all the circles in the circle array*/
        for (int i = 0; i < circleList.size(); i++) {
            circleList.get(i).draw(g);
        }
    }

}
