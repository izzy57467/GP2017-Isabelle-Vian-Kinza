import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
//import javax.sound.sampled.*; 

public class Everything
{
	public static void main(String [] args)
	{
	JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
	MyPanelb m = new MyPanelb();
	j.setSize(m.getSize());
	j.add(m); //adds the panel to the frame so that the picture will be drawn
	      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

	j.setVisible(true); //allows the frame to be shown.

	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

}

class MyPanelb extends JPanel implements ActionListener,KeyListener
{
	
	Timer time;
	int x,y,y2;
	int add;
	Image meerkat; 
//	private	Clip Muzak = null;

	private int startX, startY;
	String mystery="Mystery";
	int left;
	
	MyPanelb()
	{
	time = new Timer(15, this); //sets delay to 15 millis and calls the actionPerformed of this class.
	setSize(2000, 1500);
	setVisible(true); //it's like calling the repaint method.
	time.start();
	add=1;
	x=y=600;
	y2=0;
	
	startX = startY = 10;
	    left=0;
	setFocusable(true);
	addKeyListener(this);
	
	/*
	try
	{
	
	Muzak = AudioSystem.getClip();
	Muzak.open(AudioSystem.getAudioInputStream(new File("music.wav")));
	Muzak.loop(Clip.LOOP_CONTINUOUSLY);
	Muzak.start();
	}
	catch(Exception e){}
	*/
	
	try
	{
	meerkat= ImageIO.read(new File("meerkat-4.png"));
	}
	catch(Exception e){}
	
	}
	
	
	public void paintComponent(Graphics g)
	{
	g.setColor(Color.WHITE);
	g.fillRect(0,0,2000,1500);
	
	Color myNewBlue = new Color	(135,206,250); 
	g.setColor(myNewBlue);
	g.fillRect(0,0,2000,700);
	Color myNewGreen = new Color(154,205,80); 
	g.setColor(myNewGreen);
	g.fillRect(0,700,2000,1000);
	drawBob(g,x,y);
	drawElephant(g,x,y);
	drawDumbo(g,x,y);
	g.drawImage(meerkat, 1360,550,null);
	drawLeaves(g,x,y);
	thatTree(g,x,y);
	drawBirds(g,x,y);
	drawFallingLeaves(g,x,y);
	
	}
	
	public void drawLeaves(Graphics g, int x, int y)
	{
	Color TREE = new Color (107,142,35);
	Color Leaves = new Color (51,102,0);
	g.setColor(TREE);
	// bottomleaves

	g.fillOval(765,326,180,60);
	g.fillOval(805,326,180,60);
	g.fillOval(850,324,180,60);
	g.fillOval(895,328,180,60);
	g.fillOval(940,324,180,60);
	g.fillOval(985,324,180,60);
	g.fillOval(1030,320,180,60);
	g.fillOval(1075,325,180,60);
	g.fillOval(1120,328,180,60);
	g.fillOval(1165,328,180,60);
	g.fillOval(1205,328,180,60);
	g.fillOval(1250,328,180,60);
	g.fillOval(1295,324,180,60);
	
	//secondrow
	g.fillOval(805,294,180,60);
	g.fillOval(850,286,180,60);
	g.fillOval(895,282,180,60);
	g.fillOval(940,286,180,60);
	g.fillOval(985,286,180,60);
	g.fillOval(1030,290,180,60);
	g.fillOval(1075,285,180,60);
	g.fillOval(1120,284,180,60);
	g.fillOval(1165,282,180,60);
	g.fillOval(1205,284,180,60);
	g.fillOval(1250,282,180,60);
	
	
	//third row
	g.fillOval(850,266,180,60);
	g.fillOval(895,252,180,60);
	g.fillOval(940,256,180,60);
	g.fillOval(985,256,180,60);
	g.fillOval(1030,250,180,60);
	g.fillOval(1075,255,180,60);
	g.fillOval(1120,254,180,60);
	g.fillOval(1165,252,180,60);
	g.fillOval(1205,254,180,60);
	
	//fourthrow
	g.fillOval(895,252,180,60);
	g.fillOval(940,226,180,60);
	g.fillOval(985,226,180,60);
	g.fillOval(1030,220,180,60);
	g.fillOval(1075,225,180,60);
	g.fillOval(1120,224,180,60);
	g.fillOval(1165,222,180,60);
	
	//topbump
	g.fillOval(1030,200,180,60);
	
	//leafoutline
	g.setColor(Leaves);
	g.drawArc(1165, 282, 180, 60, 0, 180);
	g.drawArc(985, 226, 180, 60, 0, 180);
	g.drawArc(850, 324, 180, 60, 0, 180);
	
	}
	
	public void drawBob(Graphics g, int x, int y)
	{	
	if(x%30<15)
	{	g.setColor(Color.YELLOW);
	g.fillOval(1360,-80,275,275);
	g.setColor(Color.WHITE);
	g.setColor(Color.YELLOW);

	g.drawLine(1275,200,1350,155);//short one underneath^
	g.drawLine(1215,80,1300,70);//short one above first
	g.drawLine(1430,300,1450,210);
	
	g.drawLine(1550,230,1560,320);
	
	}
	else{
	g.setColor(Color.YELLOW);
	g.fillOval(1360,-80,275,275);
	g.setColor(Color.YELLOW);
	//hair

	//g.drawLine(500 + x,500,100 + x,170);
	g.drawLine(1200,145,1350,100);//long middle left one
	g.drawLine(1180,35,1330,30);//long top left one
	g.drawLine(1310,300,1400,190);//long fifth one
	g.drawLine(1500,230,1500,360);
	}
	
	
	//cloud2 
	g.setColor(Color.WHITE);
	g.fillOval(340+x,45,175,115);
	g.fillOval(430+x,25,175,115);
	g.fillOval(520+x,45,175,115);
	g.fillOval(410+x,60,175,115);
	//cloud1
	g.fillOval(100+x,125,120,85);
	g.fillOval(150+x,135,120,85);
	g.fillOval(40+x,145,120,85);
	g.fillOval(100+x,155,120,85);
	//cloud3
	g.fillOval(850+x,55,190,130);
	g.fillOval(950+x,85,190,130);
	g.fillOval(890+x,105,190,130);
	g.fillOval(770+x,95,190,130);
	
//	g.setColor(Color.BLACK);
//	g.setFont(new Font ("Arial", Font.BOLD,20));
//	g.drawString("It's a hard knock LIFE for us!", 100+x,100);

	//grass
	Color mg= new Color(154,205,80);
	g.setColor(mg);
	
	if(x%30<15)
	{
	for(int f =0 ;f< 1600;f+=15)
	{
	g.drawLine(f,700,f+5,650);
	}
	
	for(int r = 0;r< 1600;r+=15)
	{
	g.drawLine(r+5,650,r+10,700);
	}
	}
	else
	{
	for(int f =10 ;f< 1600;f+=15)
	{
	g.drawLine(f,700,f+5,650);
	}
	
	for(int r = 10;r< 1600;r+=15)
	{
	g.drawLine(r+5,650,r+10,700);
	}
	}
	
	if(x%30<15)
	{
	for(int f =0 ;f< 1600;f+=15)
	{
	int [] grassx1 = {f,f+5,f+10};	
	int [] grassy1 = {700,650,700};
	g.fillPolygon(grassx1,grassy1,3);
	
	}
	}
	else
	{
	for(int f =10 ;f< 1600;f+=15)
	{
	int [] grassx1 = {f,f+5,f+10};	
	int [] grassy1 = {700,650,700};
	g.fillPolygon(grassx1,grassy1,3);
	
	}
	}
	
	}
	
	public void drawDumbo(Graphics g, int x, int y)
	{
	Color myNewGrey = new Color (153, 235, 255);
	Color myNewGreen = new Color (0, 102, 255);
	Color myNewYellow = new Color(255, 230, 128);
	Color myNewPurple = new Color(179, 128, 255);
	Color myNewBlue = new Color	(135,206,250); 
    Color mynewGreen = new Color(154,205,80); 
	
	if(x%30<15)
	{	
	g.setColor(myNewGrey);//lines
	
	g.fillRect(330,760, 20, 45);
	g.fillRect(215 ,765,105, 50);//fill the elephant//
	//fill the elephant
	g.fillRect(313 , 790 , 25, 20);//fill the elephant////
	g.fillRect(241 , 795 , 15, 55);//fill the elephant////
	g.fillRect(325 , 795 , 10, 55);//fill the elephant////
	g.fillRect(235 , 785 , 15, 55);//fill the elephant////
	g.fillRect(203 , 771 , 22, 70);//fill the elephant////
	g.fillRect(215 , 804 , 22, 30);//fill the elephant////
	g.fillRect(281 , 791 , 29, 50);//fill the elephant////
	g.fillRect(290 , 764 , 45, 70);//fill the elephant////
	g.fillRect(325 , 830 , 20, 20);//fill the elephant////
	g.fillRect(200 ,768,5, 20);//fill the elephant////
	
	g.fillArc(330 ,810,45,45, 127, 180);//fill the elephant////
	g.fillArc(326 ,805,45,45, 127, 180);//fill the elephant////
	g.fillArc(245 ,809,45,45, 125, 180);//fill the elephant////
	g.fillArc(216 ,821,25,25, 45, 200);//fill the elephant////
	g.fillArc(301 ,820,25,25, 45, 201);//fill the elephant////
	g.fillArc(223 ,830,25,25, -55, 180);//fill the elephant////
	g.fillArc(307 ,830,25,25, -53, 180);//fill the elephant////
	g.fillArc(186 ,793,22,53, 234, 180);//fill the elephant////
	g.fillArc(270 ,793,22,53, 234, 180);//fill the elephant////
	g.fillArc(183 ,775,30,30, -53, 180);//fill the elephant////
	
	
	g.drawArc(200 ,700,150,150, 0, 180); //elephant back////
	g.fillArc(200 ,700,150,150, 0, 180);//fills the elephant back////
	
	g.setColor(Color.WHITE);
	g.drawArc(270 ,705,50,50, 180, 180);//elephant ear////
	g.setColor(myNewGrey);
	
	g.drawLine(370 , 733, 385 ,733);//top of elephant's trunk//
	
	g.drawArc(356 ,732,20,60, 339, 90);//elephant trunk top of top curve//
	g.drawArc(350 ,715,40,100, 320, 80);//elephant trunk top of bottom curve////
	
	g.drawArc(343 ,775,44,38, 190, 160);//elephant trunk bottom curve////
	g.fillArc(343 ,775,44,38, 190, 160);//elephant trunk bottom curve filled////
	
	g.drawArc(350 ,755,25,38, 180, 180);//elephant trunk top curve////
	//g.setColor(mynewGreen);
	//g.fillArc(350 ,755,25,38, 180, 180);//elephant trunk top curve filled////
	g.setColor(myNewGrey);
	
	g.drawArc(182 ,768,18,30, 150, 180);//elephant tail bottom curve//////
	g.fillArc(182 ,768,18,30, 150, 180);//elephant tail bottom curve filled//////
	g.drawArc(182 ,760,18,30, 180, 180);//elephant tail top curve////
	g.setColor(mynewGreen);
	g.fillArc(182 ,760,18,30, 180, 180);//elephant tail top curve filled////
	g.setColor(myNewGrey);
	g.fillArc(240 ,842,40,15, 180, 180);//elephant foot pad filled////
	g.fillArc(325 ,842,40,15, 180, 180);//front foot pad filled////
	g.fillArc(190 ,833,35,15, 180, 180);//back left foot pad////
	g.fillArc(325 , 800, 22, 10, 275, 90);//elephant chin////
	g.fillArc(256 , 810, 43, 10,180, 180);//elephant belly filled////
	g.setColor(Color.WHITE);
	g.drawArc(256 , 810, 43, 10,180, 180);//elephant belly////
	g.setColor(myNewGrey);
	g.fillRect(370,733 , 20, 50);
	
	g.fillArc(344 ,760,45,50, -110, 180);
	g.fillArc(340,760,30,40, 120, 180);
	
	g.fillArc(275 ,833,35,15, 180, 180);//elephant pad left front//
	
	g.setColor(Color.WHITE);
	
	g.drawOval(325 , 750, 10, 10);//outline of elephant eye////
	g.fillOval(325 , 750, 10, 10);//outline of elephant eye filled white////
	
	g.setColor(myNewGrey);
	

	    
	    g.setColor(Color.WHITE);
	  
	    g.drawLine(299 , 815, 313 , 834);//white lines////
	    g.drawLine(320 , 790, 365 , 850);//white lines////
	    g.drawLine(203 , 797, 228 , 834);//white lines////
	    
	    g.setColor(myNewGrey);
	
	g.setColor(myNewGreen);
	g.drawOval(328 ,753,5,5);//
	g.fillOval(328 ,753,5,5);//
	
	}
	else
	{
	g.setColor(myNewGrey);//lines

	g.fillRect(370,733 , 20, 50);
	g.fillRect(215 ,765,105, 50);//fill the elephant*
	//fill the elephant
	
	g.fillArc(340,760,30,40, 120, 180);
	g.fillRect(330,760, 20, 45);
	g.fillRect(313 , 790 , 25, 20);//fill the elephant//*
	g.fillRect(241 , 795 , 15, 55);//fill the elephant//*
	g.fillRect(325 , 795 , 10, 55);//fill the elephant//*
	g.fillRect(235 , 785 , 15, 55);//fill the elephant//*
	g.fillRect(203 , 771 , 22, 70);//fill the elephant//*
	g.fillRect(215 , 804 , 22, 30);//fill the elephant//*
	g.fillRect(281 , 791 , 29, 50);//fill the elephant//*
	g.fillRect(290 , 764 , 45, 70);//fill the elephant//*
	g.fillRect(325 , 830 , 20, 20);//fill the elephant//*
	g.fillRect(200 ,768,5, 20);//fill the elephant//*
	
	g.fillArc(330 ,810,45,45, 127, 180);//fill the elephant////
	g.fillArc(326 ,805,45,45, 127, 180);//fill the elephant////
	g.fillArc(245 ,809,45,45, 125, 180);//fill the elephant////
	g.fillArc(316 ,821,25,25, 45, 200);//fill the elephant////
	g.fillArc(301 ,820,25,25, 45, 201);//fill the elephant////
	g.fillArc(223 ,830,25,25, -55, 180);//fill the elephant////
	g.fillArc(307 ,830,25,25, -53, 180);//fill the elephant////
	g.fillArc(186 ,793,22,53, 234, 180);//fill the elephant////
	g.fillArc(270 ,793,22,53, 234, 180);//fill the elephant////
	g.fillArc(183 ,775,30,30, -53, 180);//fill the elephant////
	
	
	g.drawArc(200 ,700,150,150, 0, 180); //elephant back//*
	g.fillArc(200 ,700,150,150, 0, 180);//fills the elephant back//*
	g.fillArc(344 ,760,45,50, -110, 180);
	
	g.setColor(Color.WHITE);
	g.drawArc(270 ,705,50,50, 180, 180);//elephant ear//*
	g.setColor(myNewGrey);
	
	g.drawLine(370 , 733, 385 ,733);//top of elephant's trunk//
	
	g.drawArc(356 ,732,20,60, 339, 90);//elephant trunk top of top curve//
	g.drawArc(350 ,715,40,100, 320, 80);//elephant trunk top of bottom curve////
	
	g.drawArc(343 ,775,44,38, 190, 160);//elephant trunk bottom curve//
	g.fillArc(343 ,775,44,38, 190, 160);//elephant trunk bottom curve filled//
	
	g.drawArc(350 ,755,25,38, 180, 180);//elephant trunk top curve//
	//g.setColor(mynewGreen);
	//g.fillArc(350 ,755,25,38, 180, 180);//elephant trunk top curve filled//
	g.setColor(myNewGrey);
	
	g.drawArc(182 ,768,18,30, 150, 180);//elephant tail bottom curve//
	g.fillArc(182 ,768,18,30, 150, 180);//elephant tail bottom curve filled//
	g.drawArc(182 ,760,18,30, 180, 180);//elephant tail top curve//
	g.setColor(mynewGreen);
	g.fillArc(182 ,760,18,30, 180, 180);//elephant tail top curve filled//
	g.setColor(myNewGrey);
	g.fillArc(240 ,842,40,15, 180, 180);//elephant foot pad filled//
	g.fillArc(325 ,842,40,15, 180, 180);//front foot pad filled//
	g.fillArc(190 ,833,35,15, 180, 180);//back left foot pad//
	g.fillArc(325 , 800, 22, 10, 275, 90);//elephant chin//
	g.fillArc(256 , 810, 43, 10,180, 180);//elephant belly filled//
	g.setColor(Color.WHITE);
	g.drawArc(256 , 810, 43, 10,180, 180);//elephant belly//
	g.setColor(myNewGrey);
	
	g.fillArc(275 ,833,35,15, 180, 180);//elephant pad left front//
	
	g.setColor(Color.WHITE);
	g.drawArc(325 , 750,10,10, 180, 180);
	

	    
	    g.setColor(Color.WHITE);
	  
	    g.drawLine(299 , 815, 313 , 834);//white lines//
	    g.drawLine(320 , 790, 365 , 850);//white lines//
	    g.drawLine(203 , 797, 228 , 834);//white lines//
	  
	    g.setColor(myNewYellow);
	    g.fillOval(271 ,710,10,10);
	    
	    g.setColor(myNewPurple);
	    g.fillArc(276 , 712, 10, 6,270, 180);
	 
	}
	}
	
	public void drawFallingLeaves(Graphics g, int x, int y)
	{	
	
	Color Leaves = new Color (51,102,0);
	Color TREE = new Color (107,142,35);
	
	g.setColor(TREE);
	
	
	int [] xlvs1 = {1000,1010,1000,990};
	int [] ylvs1 = {420+y,390+y,380+y,390+y};
	g.fillPolygon(xlvs1, ylvs1, 4);
	
	int [] xlvs2 = {1200,1210,1200,1190};
	int [] ylvs2 = {410+y,380+y,370+y,380+y};
	g.fillPolygon(xlvs2, ylvs2, 4);
	
	int [] xlvs3 = {1150,1160,1150,1140};
	int [] ylvs3 = {440+y,410+y,400+y,410+y};
	g.fillPolygon(xlvs3, ylvs3, 4);
	
	int [] xlvs4 = {900,910,900,890};
	int [] ylvs4 = {310+y,280+y,270+y,280+y};
	g.fillPolygon(xlvs4, ylvs4, 4);
	
	int [] xlvs7 = {1250,1260,1250,1220};
	int [] ylvs7 = {370+y,360+y,350+y,360+y};
	g.fillPolygon(xlvs7, ylvs7, 4);
	
	int [] xlvs5 = {1350,1360,1350,1340};
	int [] ylvs5 = {440+y2,410+y2,400+y2,410+y2};
	g.fillPolygon(xlvs5, ylvs5, 4);
	
	int [] xlvs6 = {1050,1060,1050,1020};
	int [] ylvs6 = {350+y2,340+y2,330+y2,340+y2};
	g.fillPolygon(xlvs6, ylvs6, 4);
	
	int [] xlvs8 = {1200,1210,1200,1170};
	int [] ylvs8 = {350+y2,340+y2,330+y2,340+y2};
	g.fillPolygon(xlvs8, ylvs8, 4);
	
	int [] xlvs9 = {950,960,950,940};
	int [] ylvs9 = {440+y2,410+y2,400+y2,410+y2};
	g.fillPolygon(xlvs9, ylvs9, 4);
	
	
	
	//midline
	g.setColor(Leaves);
	g.drawLine(1000, 380+y,1000, 420+y);
	g.drawLine(1200,370+y,1200,410+y);
	g.drawLine(1150,440+y,1150,400+y);
	g.drawLine(1060,340+y2,1020,340+y2);
	g.drawLine(1260,360+y,1220,360+y);
	g.drawLine(950,440+y2,950,400+y2);
	g.drawLine(1350, 440+y2, 1350, 400+y2);
	g.drawLine(1210,340+y2,1170,340+y2);
	g.drawLine(900,310+y,900,270+y);
	
	}
	
	
	public void drawElephant(Graphics g, int x, int y)
	{
	Color myNewBlue = new Color	(135,206,250); 
	Color myNewPurple = new Color (153, 153, 255);
	Color myNewGreen = new Color (0, 255, 204);
	
	if(x%30<15)
	{
	g.setColor(myNewPurple);//lines
	
	g.fillRect(743, 579, 30, 15);
	
	g.fillArc(680,520,60,80, 120, 180);
	
	g.fillArc(680 ,520,90,100, -110, 180);
	g.fillRect(740, 460, 40, 70);
	g.fillRect(430 ,530,210, 100);//fill the elephant////
	g.fillRect(626 , 580 , 50, 40);//fill the elephant////
	g.fillRect(481 , 590 , 30, 110);//fill the elephant////
	g.fillRect(650 , 590 , 20, 110);//fill the elephant////
	g.fillRect(470 , 570 , 30, 110);//fill the elephant////
	g.fillRect(406 , 541 , 44, 140);//fill the elephant////
	g.fillRect(430 , 608 , 44, 60);//fill the elephant////
	g.fillRect(562 , 582 , 58, 100);//fill the elephant////
	g.fillRect(580 , 528 , 90, 140);//fill the elephant////
	g.fillRect(650 , 660 , 40, 40);//fill the elephant////
	g.fillRect(655 , 550 , 40, 60);
	g.fillRect(660 , 550 , 40, 60);
	g.fillRect(400 ,535,10, 40);//fill the elephant////****
	
	g.fillArc(659 ,620,90,90, 127, 180);//fill the elephant////
	g.fillArc(652 ,610,90,90, 127, 180);//fill the elephant////
	g.fillArc(490 ,617,90,90, 125, 180);//fill the elephant////**
	g.fillArc(431 ,642,50,50, 45, 200);//fill the elephant////
	g.fillArc(602 ,640,50,50, 45, 201);//fill the elephant////
	g.fillArc(445 ,660,50,50, -55, 180);//fill the elephant////
	g.fillArc(614 ,660,50,50, -53, 180);//fill the elephant////
	g.fillArc(371 ,585,43,105, 234, 180);//fill the elephant////
	g.fillArc(540 ,585,43,105, 234, 180);//fill the elephant////
	g.fillArc(365 ,549,60,60, -53, 180);//fill the elephant////**
	
	g.setColor(Color.BLACK);
	g.drawArc(712 ,463,40,120, 339, 90);
	g.setColor(myNewPurple);
	
	g.drawArc(400 ,400,300,300, 0, 180); //elephant back////
	g.fillArc(400 ,400,300,300, 0, 180);//fills the elephant back////**
	
	g.setColor(Color.WHITE);
	g.drawArc(540 ,410,100,100, 180, 180);//elephant ear////**
	g.setColor(myNewPurple);
	
	g.drawLine(739 , 465, 770 ,465);//top of elephant's trunk////**
	
	g.setColor(myNewBlue);
	//g.fillArc(712 ,463,40,120, 339, 90);//elephant trunk top of top curve//////
	g.setColor(myNewPurple);
	
	g.drawArc(712 ,463,40,120, 339, 90);//elephant trunk top of top curve//////
	g.fillArc(700 ,430,80,200, 320, 80);//elephant trunk top of bottom curve//////**

	g.fillArc(685 ,550,87,75, 190, 160);//elephant trunk bottom curve filled//////**
	
	g.drawArc(685 ,550,87,75, 190, 160);//elephant trunk bottom curve//////
	
	
	g.drawArc(700 ,510,50,75, 180, 180);//elephant trunk top curve////**
	g.setColor(Color.WHITE);
	g.setColor(myNewPurple);
	
	g.drawArc(364, 535,36,60, 150, 180);//elephant tail bottom curve////
	g.fillArc(364 ,535,36,60, 150, 180);//elephant tail bottom curve filled////
	g.drawArc(364 ,520,36,60, 180, 180);//elephant tail top curve////
	g.setColor(myNewBlue);
	g.fillArc(364 ,520,36,60, 180, 180);//elephant tail top curve filled////
	g.setColor(myNewPurple);
	g.drawArc(480 ,685,80,30, 180, 180);//elephant foot pad////
	g.fillArc(480 ,685,80,30, 180, 180);//elephant foot pad filled////
	g.drawArc(650 ,685,80,30, 180, 180);//front foot pad////
	g.fillArc(650 ,685,80,30, 180, 180);//front foot pad filled////
	g.fillArc(380 ,666,70,30, 180, 180);//back left foot pad////
	g.fillArc(650 , 600, 44, 20, 275, 90);//elephant chin////
	g.fillArc(512 , 620, 85, 20,180, 180);//elephant belly filled////
	g.setColor(Color.WHITE);
	g.drawArc(512 , 620, 85, 20,180, 180);//elephant belly////**
	g.setColor(myNewPurple);
	
	g.fillArc(550 ,666,70,30, 180, 180);//elephant pad left front////**
	
	g.setColor(Color.WHITE);
	
	g.drawOval(650 , 500, 19, 19);//outline of elephant eye////
	g.fillOval(650 , 500, 19, 19);//outline of elephant eye filled white////**
	
	g.setColor(myNewPurple);
	
	g.drawLine(396 , 580, 480 , 700);//back elephant leg////
	g.drawLine(510 , 630, 560 , 700);//back-front elephant leg////
	g.drawLine(640 , 580, 730 , 700); //front elephant leg////
	g.drawLine(596 , 630, 650 , 700);//front-back elephant leg//
	    g.drawLine(405 , 595, 380 , 680);//back leg back line////
	    g.drawLine(450 , 680, 455 , 668);//back leg front line////
	    g.drawLine(621 , 680, 625 , 667);//front left leg line////
	    g.drawLine(550 , 680, 560 , 641);//back left leg line////**
	    
	    g.setColor(Color.WHITE);
	  
	    g.drawLine(598 , 630, 625 , 667);//white lines////
	    g.drawLine(640 , 580, 730 , 700);//white lines////
	    g.drawLine(406 , 594, 456 , 667);//white lines////**
	    
	    g.setColor(myNewPurple);
	    
	    g.drawLine(670 , 620, 730 , 700);////**
	
	g.setColor(myNewGreen);
	g.drawOval(655 ,505,10,10);////
	g.fillOval(655 ,505,10,10);////**
	
	g.setColor(myNewPurple);
	}
	
	else{
	g.setColor(myNewPurple);//lines
	
	g.fillRect(655 , 550 , 40, 60);
    g.fillRect(660 , 550 , 40, 60);
	g.fillRect(743, 579, 30, 15);
	
	g.fillArc(680 ,520,90,100, -110, 180);
	
	g.fillArc(680,520,60,80, 120, 180);
	
	g.fillRect(740, 460, 40, 70);
	g.fillRect(430 ,530,210, 100);//fill the elephant////
	g.fillRect(626 , 580 , 50, 40);//fill the elephant////
	g.fillRect(481 , 590 , 30, 110);//fill the elephant////
	g.fillRect(470 , 570 , 30, 110);//fill the elephant////
	g.fillRect(406 , 541 , 44, 140);//fill the elephant////
	g.fillRect(430 , 608 , 44, 60);//fill the elephant////
	g.fillRect(562 , 582 , 58, 100);//fill the elephant////
	g.fillRect(580 , 528 , 90, 140);//fill the elephant////
	g.fillRect(650 , 660 , 40, 40);//fill the elephant////
	g.fillRect(400 ,535,10, 40);//fill the elephant////**
	
	g.fillArc(659 ,620,90,90, 127, 180);//fill the elephant////
	g.fillArc(652 ,610,90,90, 127, 180);//fill the elephant////
	g.fillArc(490 ,617,90,90, 125, 180);//fill the elephant////
	g.fillArc(431 ,642,50,50, 45, 200);//fill the elephant////
	g.fillArc(602 ,640,50,50, 45, 201);//fill the elephant////
	g.fillArc(445 ,660,50,50, -55, 180);//fill the elephant////
	g.fillArc(614 ,660,50,50, -53, 180);//fill the elephant////
	g.fillArc(371 ,585,43,105, 234, 180);//fill the elephant////
	g.fillArc(365 ,549,60,60, -53, 180);
	g.fillArc(540 ,585,43,105, 234, 180);//fill the elephant////**
	
	g.drawArc(400 ,400,300,300, 0, 180); //elephant back////
	g.fillArc(400 ,400,300,300, 0, 180);//fills the elephant back////**
	
	g.setColor(Color.WHITE);
	g.drawArc(540 ,410,100,100, 180, 180);//elephant ear////**
	g.setColor(myNewPurple);
	
	g.drawLine(739 , 465, 770 ,465);//top of elephant's trunk////**
	
	g.setColor(myNewBlue);
	//g.fillArc(712 ,463,40,120, 339, 90);
	g.setColor(myNewPurple);
	
	g.drawArc(712 ,463,40,120, 339, 90);//elephant trunk top of top curve////
	g.fillArc(700 ,430,80,200, 320, 80);//elephant trunk top of bottom curve////**
	
	g.drawArc(685 ,550,87,75, 190, 160);//elephant trunk bottom curve filled////
	g.fillArc(685 ,550,87,75, 190, 160);//elephant trunk bottom curve filled////**
	
	
	g.setColor(myNewBlue);
	//g.fillArc(700 ,510,50,75, 180, 180);//elephant trunk top curve////**
	g.setColor(Color.WHITE);
	g.setColor(myNewPurple);
	g.drawArc(700 ,510,50,75, 180, 180);
	
	g.drawArc(364 ,535,36,60, 150, 180);//elephant tail bottom curve////
	g.fillArc(364 ,535,36,60, 150, 180);//elephant tail bottom curve filled////
	g.drawArc(364 ,520,36,60, 180, 180);//elephant tail top curve////
	g.setColor(myNewBlue);
	g.fillArc(364 ,520,36,60, 180, 180);//elephant tail top curve filled////
	g.setColor(myNewPurple);
	g.drawArc(480 ,685,80,30, 180, 180);//elephant foot pad////
	g.fillArc(480 ,685,80,30, 180, 180);//elephant foot pad filled////
	g.drawArc(650 ,685,80,30, 180, 180);//front foot pad////
	g.fillArc(650 ,685,80,30, 180, 180);//front foot pad filled////
	g.fillArc(380 ,666,70,30, 180, 180);//back left foot pad////
	g.fillArc(650 , 600, 44, 20, 275, 90);//elephant chin////
	g.fillArc(512 , 620, 85, 20,180, 180);//elephant belly filled////
	g.setColor(Color.WHITE);
	g.drawArc(512 , 620, 85, 20,180, 180);//elephant belly////**
	g.setColor(myNewPurple);
	
	g.fillArc(550 ,666,70,30, 180, 180);//elephant pad left front////**
	
	g.setColor(Color.WHITE);
	g.drawArc(650 , 500,20,20, 180, 180);////**
	
	g.setColor(myNewPurple);
	
	g.drawLine(396 , 580, 480 , 700);//back elephant leg////
	g.drawLine(510 , 630, 560 , 700);//back-front elephant leg////
	g.drawLine(640 , 580, 730 , 700); //front elephant leg////
	g.drawLine(596 , 630, 650 , 700);//front-back elephant leg////**
	
	    g.drawLine(405 , 595, 380 , 680);//back leg back line////
	    g.drawLine(450 , 680, 455 , 668);//back leg front line////
	    g.drawLine(621 , 680, 625 , 667);//front left leg line////
	    g.drawLine(550 , 680, 560 , 641);//back left leg line////**
	    
	    g.setColor(Color.WHITE);
	  
	    g.drawLine(598 , 630, 625 , 667);//white lines////
	    g.drawLine(640 , 580, 730 , 700);//white lines////
	    g.drawLine(406 , 594, 456 , 667);//white lines////**
	    
	    g.setColor(myNewPurple);
	    
	  g.drawLine(670 , 620, 730 , 700);	////	**
	}
	
	}
	
	public void thatTree(Graphics g, int x, int y)
	{

	Color BROWN = new Color (148,74,0);
	Color DARKTREE = new Color (132,66,0);
	g.setColor(BROWN);
	
	//trunk// 
	int [] xpts1 = {1075,1110,1175,1210};
	int [] ypts1 = {1000,550,550,1000};	
	g.fillPolygon(xpts1,ypts1, 4);

	//left branch base
	
	int [] xpts2 ={1110,1070,1110,1145};
	int [] ypts2 ={550,455,455,550};
	g.fillPolygon(xpts2, ypts2, 4);

	//leftbranch1
	
	//part 1
	int [] xpts3 = {1110,1028,1025,1070};
	int [] ypts3 ={455,430,444,455};
	g.fillPolygon(xpts3, ypts3, 4);

	//part 2
	int [] xpts4 = {1028,1016,990,1025};
	int [] ypts4 = {430,420,422,444};
	g.fillPolygon(xpts4, ypts4, 4);

	//part 3 yep this one is the next one
	int [] xpts5 = {990,995,1019,1016};
	int [] ypts5 = {422,410,395,420};
	g.fillPolygon(xpts5, ypts5, 4);
	
	//dareal part 4
	int [] xpts6 = {995,850,864,1019};
	int [] ypts6 = {410,400,385,395};
	g.fillPolygon(xpts6, ypts6, 4);

	// part 5
	
	g.setColor(DARKTREE);
	int [] xpts7 = {850,845,863,864};
	int [] ypts7 = {400,380,377,385};
	g.fillPolygon(xpts7, ypts7, 4);

	g.setColor(BROWN);
	
	//part 6 top nubin
	
	g.setColor(DARKTREE);
	int [] xpts8 = {975,979,959,955};
	int [] ypts8 = {392,360,360,392};
	g.fillPolygon(xpts8, ypts8, 4);

	g.setColor(BROWN);
	
	//part 7.1 over reaching branch
	
	g.setColor(DARKTREE);
	int [] xpts9 = {974,1080,977};
	int [] ypts9 = {386,378,366};
	g.fillPolygon(xpts9, ypts9, 3);
	
	
	
	g.setColor(BROWN);
	int [] xpts91 = {974,1080,1080};
	int [] ypts91 = {386,378,400};
	g.fillPolygon(xpts91, ypts91, 3);
	
	
	// part 7.2 overreaching
	int [] xpts10 = {1080,1100,1100,1080}; 
	int [] ypts10 = {400,420,392,378};
	g.fillPolygon(xpts10, ypts10, 4);

	//part 7.3 overreaching
	int [] xpts11 = {1100,1160,1182,1100};
	int [] ypts11 = {420,510,492,392};
	g.fillPolygon(xpts11, ypts11, 4);
	
	
	///////******//////right side branches
	
	
	//seperate branch
	int [] xpts12 = {1120,1294,1300,1138};
	int [] ypts12 = {420,393,410,437};
	g.fillPolygon(xpts12,ypts12,4);
	
	///branch right up
	int [] xpts13 = {1300,1311,1318,1300,1293};
	int [] ypts13 = {410,400,370,370,393};
	g.fillPolygon(xpts13,ypts13,5);
	
	
	int [] ypts131 = {395,365,365,388};
	int [] xpts131 = {1314,1321,1303,1296};
	g.setColor(DARKTREE);
	g.fillPolygon(xpts131,ypts131,4);
	g.setColor(BROWN);
	
	//seperate branch
	int [] xpts14 = {1175,1200,1200,1136,1145};	
	int [] ypts14 = {550,500,475,528,550};
	g.fillPolygon(xpts14,ypts14,5);

	
	//new branch
	int [] xpts15 = {1200,1480,1480,1200};
	int [] ypts15 = {475,425,450,500};
	g.fillPolygon(xpts15,ypts15,4);
	
	//seperate branch
	
	int [] xpts16 = {1250,1190,1175,1230};
	int [] ypts16 = {469,390,400,470};
	g.fillPolygon(xpts16,ypts16,4);

	//last one!!!11!1!!!1
	int [] xpts17 = {1195,1198,1178,1175};
	int [] ypts17 = {400,370,370,400};
	g.fillPolygon(xpts17,ypts17,4);
	
	g.setColor(DARKTREE);
	int [] xpts18 = {1198,1201,1181,1178};
	int [] ypts18 = {380,350,350,380};
	g.fillPolygon(xpts18,ypts18,4);

	
	}
	
	public void drawBirds(Graphics g, int x, int y)
	{
       	if(x%30<15)
	{   g.setColor(Color.BLACK);
	g.drawArc(200,200,60,35, 360, 170);
	g.setColor(Color.BLACK);
        	g.drawArc(260,200,60,35, 370, 170);
        	
        	g.setColor(Color.BLACK);
	g.drawArc(370,180,60,35, 360, 170);
	g.setColor(Color.BLACK);
        	g.drawArc(430,180,60,35, 370, 170);
        	
        	g.setColor(Color.BLACK);
	g.drawArc(300,300,60,35, 360, 170);
	g.setColor(Color.BLACK);
        	g.drawArc(360,300,60,35, 370, 170);
        	
	}
	else
	{
            g.setColor(Color.BLACK);
	g.drawArc(200,195,60,35, 180, 170);
	g.setColor(Color.BLACK);
        	g.drawArc(260,195,60,35, 170, 170);
        	
        	g.setColor(Color.BLACK);
	g.drawArc(370,180,60,35, 180, 170);
	g.setColor(Color.BLACK);
        	g.drawArc(430,180,60,35, 170, 170);
        	
        	g.setColor(Color.BLACK);
	g.drawArc(300,300,60,35, 180, 170);
	g.setColor(Color.BLACK);
        	g.drawArc(360,300,60,35, 170, 170);
	}

	}
	
	public void keyPressed(KeyEvent e)
	{
	if(e.getKeyCode()==KeyEvent.VK_UP)
	mystery="UP";
	else if(e.getKeyCode()==KeyEvent.VK_DOWN)
	mystery="DOWN";
	else if(e.getKeyCode()==KeyEvent.VK_LEFT)
	mystery="LEFT";
	else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
	mystery="RIGHT";
	repaint();
	}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
	
	public void actionPerformed(ActionEvent e)
	{
	
	y+=add;
	if (y >=400)
	y=0;
	
	
	if (y%2==0)	
	y2+=add;
	if (y2>=500)
	y2=0;
	
	x+=add;
	
	
	/*
	if (x >=1000)
	x=0;
	
	x+=add;
	y+=add;
	if(x==200 && y==200)
	add*=-1;
	if(x==10 && y==10)
	add*=-1;	
	*/	
	
	repaint();
	}
	
} 