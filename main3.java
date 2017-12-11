import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.*;

class main3
{ public static void main(String[] args)
{ new Wind();

}  
}

class Wind extends Frame implements KeyListener
{// char[][] a =new char[20][30];
 char[][] a22 =new char[21][30];
 char[][] a =new char[21][30];

//Label first = new Label();
Label second = new Label("Some text");
//Label third = new Label("Some text", Label.CENTER);
int propuskxoda=1;
int botnebot =0;
String date; 
String msg1;
String msg2;
String msg3;
String msg4;
String msg5;
int v5=0;
int[] a7 =new int[15];
int maxurovn=5;
int nomurovn=0;
int k99=1;  //-1
int nom7=0;
int m57 =0;
int m57_1 =0;
int vishenka=0;
int kamen1=551;
int nom55=0;
int x = 2;
int y = 2;

int pr51;

int bot1_x = 0;
int bot1_y = 0;

int bot1_dx;
int bot1_dy;
int bot1x = 0;
int bot1y = 0;
int bot1dx=0;
int bot1dy=1;


int z=0;
int k=0;
int p1=0;
//int ss1=0;
MyPanel b;
//vishn vishn1;
TextField1 tf1;
TextField1 tf2;
TextField1 tf3;
TextField1 tf4;
TextField1 tf5;
TextField1 tf6;
TextField1 tf7;
TextField1 tf8;



Bot bot1;
Bot b1;
Bot b2;
Bot b3;
Bot b4;
//Bot [] b2=NTW;

String t;
   public Wind()
{ super("Pakman");
  //setSize(920, 640);
  setSize(920, 690);
//  setSize(920, 720);
//setBackground(Colul.blue);
//  setBackground(new Color(200,100,100)); 
  
   setBackground(Color.YELLOW);
//                 setBackground(Color.green);
setLocation(0, 0);
addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
setLayout(null);
addKeyListener(this);
add(b = new MyPanel());
add(b1=new Bot());

add(b2=new Bot());
add(b3=new Bot());
add(b4=new Bot());

add(tf1=new TextField1(470,670));
add(tf2=new TextField1(370,670));
//add(tf3=new TextField1(470,670));
add(tf4=new TextField1(170,670));
add(tf5=new TextField1(70,670));
add(tf6=new TextField1(0,670));
add(tf8=new TextField1(770,670));
add(tf7=new TextField1(670,670));


//tf1.setText("1234567890");


//add(bot1=new Bot());
//add(vishn1=new vishn());
    //b1.x=5;
//Bot bot1;


//t="level_01.txt";
 nomurovn+=1;
t= "level_0"+nomurovn+".txt";   //
// nomurovn=1;
//String s3=Integer.toString(nomurovn);
//String s33 = s3.substring(1, 1); //1 2 3 
//t= "level_0"+s33+".txt";   


readArray(t);
//repaint(100);
setVisible(true);
  JOptionPane.showMessageDialog(null, "START!");
}  //
//********************************paint***********************************

public void paint(Graphics g)
{super.paint(g);
//if (5==3)
//{
//int rr51=200;
//int rr52=300;
//String s ="77";
//g.drawstring(String s,int rr51, int rr52); 
//  Color initColor = g.getColor();    
//  g.setColor(new Color(0, 0, 255)); а
                                    
//  g.fillRect(0, 0, getSize().width - 1, getSize().height - 1);  
//  g.setColor(initColor);                 


//  for (int i = 0; i < 20; i++)
//  for (int j = 0; j < 30; j++)
//      a[i][j] = ' ';
/*

//  public void paint(Graphics g) {
   Color c = new Color(
     (int)(Math.random()*255), 
  (int)(Math.random()*255), 
  (int)(Math.random()*255));
   g.setColor(c);
   //g.setClip(null);
   g.fillRect(0, 0, getWidth(), getHeight());




*/




 for (int i = 0; i <= 20; i++)
 for (int j = 0; j < 30; j++)
{

//if (a[i][j] == '.')
if (a22[i][j] == '.')
{ ImageIcon ii=new ImageIcon("flow.jpg");
 //ImageIcon ii=new ImageIcon("pak.jpg");
Image img=ii.getImage();
//g.drawImage(img,j * 30 + 10, i * 30 + 30, 10,10,this);    
if (k99==-1)
g.drawImage(img,j * 30 + 10, i * 30 + 30, 15,15,this);    
else
g.drawImage(img,j * 30 + 10, i * 30 + 30, 10,10,this);    
//repaint();
}





//{ x = j;
//  y = i;
// a[i][j] = ' ';

////                 setBackground(Color.red);
                 setBackground(Color.YELLOW);
//                 setBackground(Color.green);
////  g.fillRect(j * 30 + 10, i * 30 + 30, 30,30);
//}
//


if (a[i][j]=='$')
{ ImageIcon ii=new ImageIcon("flow.jpg");
 //ImageIcon ii=new ImageIcon("pak.jpg");
Image img=ii.getImage();
g.drawImage(img,j * 30 + 10, i * 30 + 30, 30,30,this);    
}

//**********


 if (a[i][j] == '#')


// { g.fillRect(j * 30 + 10, i * 30 + 30, 30,30);

{ g.setColor(new Color(0, 0, 255));
    //ss1+=1;
// g.fillRect(j * 30 + 10, i * 30 + 30, 30,30);

ImageIcon im1=new ImageIcon("1st.jpg");

// ImageIcon im1=new ImageIcon("1st.jpg");
// ImageIcon im1=new ImageIcon("2st.jpg");
// ImageIcon im1=new ImageIcon("3.jpg");
// ImageIcon im1=new ImageIcon("4st.jpg");
// ImageIcon im1=new ImageIcon("5st.jpg");

Image img=im1.getImage();

// g.drawImage(img,0,0,null);
// g.drawImage(img,10,10,30,50,this);

g.drawImage(img,j * 30 + 10, i * 30 + 30, 30,30,this);



//g.fillRect ( j * 30 + 10, i * 30 + 30, 30,30);
}



if (a[i][j]=='$')
{ ImageIcon ii=new ImageIcon("flow.jpg");
 //ImageIcon ii=new ImageIcon("pak.jpg");
Image img=ii.getImage();
g.drawImage(img,j * 30 + 10, i * 30 + 30, 30,30,this);    
}



if (a[i][j]=='1')
{ ImageIcon ii5= new ImageIcon("pak.jpg");
 //ImageIcon ii=new ImageIcon("pak.jpg");
Image img5=ii5.getImage();
//g.drawImage(img5,j * 30 + 10, i * 30 + 30, 30,30,this);    
g.drawImage(img5,j * 30 + 10, i * 30+30, 30,30,this);    
//a7[nom7]=i;
//a7[nom7+1]=j;


//a7[0]=i;
//a7[1]=j;

//  System.out.println(i+" i 8886777 ");
//System.out.println(j+" y   8886777");
//a[i+1][j]=' ';
  nom7+=2;  
}
 




//if (a[i][j]=='1')
//{ ImageIcon ii5=new ImageIcon("pak.jpg");
//Image img5=ii5.getImage();
//g.drawImage(img5,j * 30 + 10, i * 30 + 30, 30,30,this);    
//}

if (vishenka==0)
k99=1;

if ((a[i][j]=='V') && (vishenka==1))

{
 ImageIcon ii=new ImageIcon("straw1.jpg");
Image img=ii.getImage();
g.drawImage(img,j*30+10, i*30+30,30,30,this);    
//g.drawImage(img,0,0,30,30,this);
//k99=-1;
//System.out.println(vishenka+"   vishenka ");
//System.out.println(a[i][j]+"   a[i][j]");
 }

// ImageIcon ii1=new ImageIcon("flow.ipg");
//Image img1=ii1.getImage();
//g.drawImage(img1,j * 30 + 10, i * 30 + 30, 30,30,this);    



 /*

//zv1  next
//if(a[i][j] == '*')

{b1.x = j;
 b1.y = i;

// bot1_x = j;
// bot1_y = i;
 bot1_x = bot1.x;
 bot1_y = bot1.y;

//a[i][j] = ' ';
      //////                    setBackground(Color.RED); 

////////   b1.setLocation(b1.x * 30 + 10, b1.y * 30 + 30);
}
  */

//g.drawstring("Hello, XXI century World!", 20, 100); 
//g.drawstring("Hello, XXI century World!", 0, 0); 
//String s ="77";
//g.drawstring(String s, 400,400); 
} //for
//}               //for
//    System.out.print(ss1+"kkkk ");

//}   //5=3
//if (kamen1 >= 17)

// msg1=Integer.toString(kamen1+2);
//msg1=Integer.toString(54);
// msg1 ="77";

//msg1 =   new java.util.kamen1.toString(); 

date = new java.util.Date().toString(); 
//g.drawString(date, 670, 670); 


// msg1=Integer.toString(kamen1);
////g.drawString(msg1, 470, 670); 
//System.out.println(msg1+"  msg1 ");
//     tf1.setText(msg1);
           requestFocus();
msg3 = new java.util.Date().toString(); 
//     tf3.setText("  "+ msg3);


} 
//*******************************************readarray

public void readArray(String p)
{ try
{ Scanner sc = new Scanner(new File(p));
     nom55=0;
     kamen1=0;
     vishenka=0;
     k99=1;
     p1=0;
     z=0;
     v5=0;
//  for (int i = 0; i < 20; i++)
  for (int i = 0; i <= 20; i++)
{ String s = sc.nextLine();

for (int j = 0; j < 30; j++)
{ a[i][j] = s.charAt(j);
/*
if (a[i][j] == ' ')
{ x = j;
y = i;
//a[i][j] = ' ';
                 setBackground(Color.RED);
//  g.fillRect(j * 30 + 10, i * 30 + 30, 30,30);
//b.setLocation(x * 30 + 10, y * 30 + 30);
}
  */
  

if (a[i][j] == '@')
{ x = j;
y = i;
a[i][j] = ' ';
//                  setBackground(Color.GREEN);
                 setBackground(Color.YELLOW);
//                 setBackground(Color.green);         
    b.setLocation(x * 30 + 10, y * 30 + 30);  // pacman


}


if(a[i][j] == '*')
{ nom55+=1;
if (nom55==1)
 {b1.x = j;
 b1.y = i;
         bot1x=x;
         bot1y=y;


 bot1_x = b1.x;
 bot1_y = b1.y;

  b1.dx = 0;
  b1.dy = 1;

//zv1  next 
//a[i][j] = '*';

//a[i][j] = ' ';
      //////                    setBackground(Color.RED); 

   b1.setLocation(bot1_x * 30 + 10, bot1_y * 30 + 30);
}

if (nom55==2)
{b2.x = j;
 b2.y = i;
  b2.dx = 1;
  b2.dy = 0;
// bot1_x = j;
// bot1_y = i;
 bot1_x = b2.x;
 bot1_y = b2.y;

//zv1  next
//a[i][j] = '*';


      //////                    setBackground(Color.RED); 

   b2.setLocation(bot1_x * 30 + 10, bot1_y * 30 + 30);
}
if (nom55==3)
{b3.x = j;
 b3.y = i;
  b3.dx = -1;
  b3.dy = 0;
// bot1_x = j;
// bot1_y = i;
 bot1_x = b3.x;
 bot1_y = b3.y;

//zv1  next
//a[i][j] = '*';


      //////                    setBackground(Color.RED); 

   b3.setLocation(bot1_x * 30 + 10, bot1_y * 30 + 30);
}

if (nom55==4)
{b4.x = j;
 b4.y = i;
  b4.dx = 0;
  b4.dy = -1;
// bot1_x = j;
// bot1_y = i;
 bot1_x = b4.x;
 bot1_y = b4.y;

//zv1  next
//a[i][j] = '*';


      //////                    setBackground(Color.RED); 

   b4.setLocation(bot1_x * 30 + 10, bot1_y * 30 + 30);
}

}





if(a[i][j] == '$' )
{ z++;
//z+=1;
// System.out.println(z+" ");
}


if((a[i][j] == '1' ) && (m57_1 > 0))
{a[i][j] ='#';
m57_1 -=1;
repaint();
}



}

}
sc.close();



}


catch (Exception e)
{ System.out.println(e);
}

  for (int i = 0; i <= 20; i++)
  for (int j = 0; j <  30; j++)

{
    a22[i][j]= a[i][j];
if ((a[i][j]==' ')  ||  (a[i][j]=='*') ||  (a[i][j]=='V'))
a22[i][j] = '.';
}

} //


  
public void movePanel(int dx, int dy)
{  
 ////////////////////////////////////////////////// 
//dom7();


{// if (a[y + dy][x + dx] == ' ')   
//11

// if ((dy== '1')  &&   (dx== '1'))

//11

  /*

 if ((a[y + dy][x + dx]== ' ')  || 
  (a[y + dy][x + dx]== '.')     || 
  (a[y + dy][x + dx]== 'V')     ||      
 ((a[y + dy][x + dx]== '*') && (k99==-1))    ||      
  (a[y + dy][x + dx]== '$')) 
   */

 if (a[y + dy][x + dx]!= '#')   
{
 x += dx;
y += dy;

}
  if (k99==1)
   propuskxoda=1;
  if (k99==-1)
   propuskxoda=3-propuskxoda;



  if ((k99==-1) && (k99==-5)) 
 if ((a[y + dy][x + dx]== ' ')  || 
  (a[y + dy][x + dx]== '.')     || 
  (a[y + dy][x + dx]== 'V')     ||      
//  (a[y + dy][x + dx]== '*')     ||      
((a[y + dy][x + dx]== '*') && (k99==-1))    ||      
  (a[y + dy][x + dx]== '$')) 

{

 x += dx;
y += dy;
}

dom7();

//    if   (a[y][x]== ' ')

 if   (a22[y][x]== '.')

{    kamen1+=1;
     a22[y][x]= ' ';
     }
// msg1=Integer.toString(kamen1);
 msg1=Integer.toString(kamen1);
// msg4=Integer.toString(p1);
// msg4=Integer.toString(z);
// msg5=Integer.toString(v5);
//System.out.println(msg4+"msg4 ");
//System.out.println(msg5+"msg5 ");
// msg4 = msg4.substring(1, 2); 
// msg5 = msg5.substring(1, 1);  
//msg4="0"; 
// msg5 ="0";  

//     tf1.setText("GOLD  "+msg1+"   "+"M"+msg4+"   "+"V"+msg5);
     tf1.setText("GOLD  "+msg1+"   "+"M"+p1+"   "+"V"+v5);
//     tf1.setText("GOLD  "+msg1);

 msg2=Integer.toString(nomurovn);
     tf2.setText("uroven  "+ msg2);
    
    // tf4.setText("b4.x "+b4.x +"  b4.y "+b4.y);  //bot
    // tf5.setText("b3.x "+b3.x +"  b3.y "+b3.y);
    // tf7.setText("b1.x "+b1.x +"  b1.y "+b1.y);
    // tf8.setText("b2.x "+b2.x +"  b2.y "+b2.y);
   
    tf6.setText("x "+x +"  y "+y);  //pacm

  if ((kamen1==17) || (kamen1==110))
  {vishenka=1;
    repaint();}
 if ((kamen1==70)  || (kamen1==130))
{ vishenka=0;
  k99=1;
  repaint();
}

// if (kamen1==300)
//{ vishenka=0;
// k99=1;}

               int c5=y + dy;
                int c6 =x+dx;


             
b.setLocation (x*30+10,y*30+25);
//                     bot5(b1);

           if (propuskxoda==1)
{
           bot7(b1);
 b1.setLocation (bot1x*30+10,bot1y*30+30);
//  a[b1.y][b1.x] = '*';


           bot7(b2);
 b2.setLocation (bot1x*30+10,bot1y*30+30);
  //            a[b2.y][b2.x] = '*';
 
           bot7(b3);
 b3.setLocation (bot1x*30+10,bot1y*30+30);
 //             a[b3.y][b3.x] = '*';

 bot7(b4);
 b4.setLocation (bot1x*30+10,bot1y*30+30);
 //             a[b4.y][b4.x] = '*';

} //           if propuskxoda=1

     tf4.setText("b4.x "+b4.x +"  b4.y "+b4.y);  //bot
     tf5.setText("b3.x "+b3.x +"  b3.y "+b3.y);
     tf7.setText("b2.x "+b2.x +"  b2.y "+b2.y);
     tf8.setText("b1.x "+b1.x +"  b1.y "+b1.y);
//    repaint();
 

dom7();




//*/



if (a[y][x] == '$')
{ a[y][x]=' ';
p1++;
//kamen1+=50;
System.out.print(p1+" ");
}


 if   ((a[y][x]== 'V')   && (vishenka==1))         
{
// a[y][x]== ' ';            
 k99=-1;
//kamen1+=100;
v5+=1;
//repaint();
}

//77

/*
if (a[y][x]=='*')   //*

{
//a[y][x]=' ';


//*********************************bot ал
if (vishenka==0)
   k99=1;

 //liv2();
  dom7();
repaint(); 
}   //  if (a[y][x]=='*')   //*
*/

if (vishenka==0)
   k99=1;

  dom7();
//repaint();


//77


if(p1==z)
//if(p1==p1)
{//t= "n01.txt";   
 nomurovn+=1;
if (nomurovn<=maxurovn)
{
//String s3=Integer.toString(nomurovn);
//String s33 = s3.substring(1, 1); //1 2 3 
//t= "level_0"+s33+".txt";   
t= "level_0"+nomurovn+".txt";   //

//System.out.println(s33   +"s33***23456***");
//System.out.println(t   +"   **ttt***23456***");
//t= "level_02.txt";   
m57_1 =m57; 
readArray(t);
repaint();} 
}
// else
if (nomurovn>maxurovn)  
{  JOptionPane.showMessageDialog(null, " Pacman  vuigral  !!!!!!");
System.exit(0);  }

b.setLocation(x * 30 + 10, y * 30 + 30);
//bot(x,y,dx,dy);
            //////        bot5(bot1);
//
//////b1.setLocation (bot1_x*30+10,bot1_y*30+30);


}
}  // movepanel
public void bot6(int x,int y,int dx,int dy)
{ bot1_y=y;
bot1_x=x;
bot1dy=dy;
bot1dx=dx;

/*int p1=0;
int p2=0;
a[bot1y][bot1x] = ' ';
if ((a[bot1y+bot1dy][bot1x+bot1dx]==' ')&&(p2==0))
{ bot1y+=bot1dy;
bot1x+=bot1dx;
p1=1;
}
  */
}  



//..

//..
//...


//...

//..
// public void bot7(int x,int y,int dx,int dy)


 public void bot7(Bot bot1)
{
//0===========================
//    pr51=0;

bot1y=bot1.y;
bot1x=bot1.x;
bot1dy=bot1.dy;
bot1dx=bot1.dx;

//0===========================
    pr51=0; 


//zv1  next
//    a[bot1y][bot1x] = ' ';

if ((bot1x > x)  && (a[bot1y][bot1x-1*k99]!='#')) 
{  bot1dx=-1*k99;
  bot1dy=0;}

else  
if ((bot1y > y)  && (a[bot1y-1*k99][bot1x]!='#')) 
{  bot1dx=0;
  bot1dy=-1*k99;}

else
if ((bot1y < y)  && (a[bot1y+1*k99][bot1x]!='#')) 
{  bot1dx=0;
  bot1dy=1*k99;}

if ((bot1x < x)  && (a[bot1y][bot1x+1*k99]!='#')) 
{  bot1dx=1*k99;
  bot1dy=0;}


//if((a[bot1y+bot1dy][bot1x+bot1dx]==' ')   ||(a[bot1y+bot1dy][bot1x+bot1dx]=='*'))




if(a[bot1y+bot1dy][bot1x+bot1dx]!='#') 

{ bot1y+=bot1dy;  
 bot1x+=bot1dx;
 pr51=1; } 
//else

//{
//1н======================================================


//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

 bot1.x=bot1x;
 bot1.y=bot1y;
 bot1.dx=bot1dx;
 bot1.dy=bot1dy;

  } 
//..







public void keyPressed(KeyEvent ke)                      
{ if (ke.VK_UP == ke.getKeyCode())
movePanel(0, -1);
if (ke.VK_DOWN == ke.getKeyCode())
movePanel(0, 1);
if (ke.VK_LEFT == ke.getKeyCode())
movePanel(-1, 0);
if (ke.VK_RIGHT == ke.getKeyCode())
movePanel(1, 0);
}

public void keyReleased(KeyEvent ke)
{
}

public void keyTyped(KeyEvent ke)
{
}



 public void dom7()
{ 
dom8();


//if (a[y][x]=='*')   //*
if (botnebot > 0)     //*
{

 if (k99==-1)
{
 a[y][x]=' ';
if ((y== b4.y) && (x==b4.x))
{// b4.x=2;
//b4.y=18;
 b4.x=23;
b4.y=6;
//k99=1;
b4.setLocation(b4.x * 30 + 10, b4.y * 30 + 30);
a[b4.y][b4.x]='*';
}

if ((x== b3.x) && (y==b3.y))
{ b3.x=22;
b3.y=6;
b3.setLocation(b4.x * 30 + 10, b3.y * 30 + 30);
a[b3.y][b3.x]='*';
}


if ((x== b2.x) && (y==b2.y))
{ b2.x=22;
b2.y=5;
b2.setLocation(b2.x * 30 + 10, b2.y * 30 + 30);
a[b2.y][b2.x]='*';
}

if ((x== b1.x) && (y==b1.y))
{ b1.x=22;
b1.y=4;
b1.setLocation(b1.x * 30 + 10, b1.y * 30 + 30);
a[b1.y][b1.x]='*';
}
} //k99        (k99==-1)

//1
//********************************
 if (k99 != -1)
{
a[y][x]=' ';
 if (m57<=4) 
{ 
  p1=0;
  int ri,ry;
m57+=1; 
m57_1 =m57;

tf2.setText("uroven  "+ nomurovn);
//  t="level_01.txt"; 
 readArray(t);
//repaint();
}
//else

 if (m57>4) 
{  JOptionPane.showMessageDialog(null, " Pacman proigral  !!!!!!");
System.exit(0);
//new Wind();
  }


}  //k99

//1

} //* botnebot

} 

//***********************


 public void dom8()
{ 
botnebot=0;
if ((y== b4.y) && (x==b4.x))
botnebot=4;
if ((x== b3.x) && (y==b3.y))
botnebot=3;
if ((x== b2.x) && (y==b2.y))
botnebot=2;
if ((x== b1.x) && (y==b1.y))
botnebot=1;
} 



//********************************

//

 public void liv2 ()
{
 if (k99 != -1)
{
 if (m57<=4) 
{ 
  p1=0;
  int ri,ry;
m57+=1; 
m57_1 =m57;
//  t="level_01.txt"; 
 readArray(t);
//repaint();
}
//else

 if (m57>4) 
   System.exit(0);  


}  //k99
//******************************************************

//b4.setLocation(b4.x * 30 + 10, b4.y * 30 + 30);

  



} 
//***********************


} 

//***************************
class TextField1 extends TextField
{public TextField1(int x, int y)
{super("0");

//setSize(150,30);
setSize(100,30);
setLocation(x,y);
//setBackground(new Color(200,200,200));

        setBackground(Color.YELLOW);
}
}




//************************
class MyPanel extends Panel
{ Image img1;
public MyPanel()
{ super();
setSize(30,30);
setLocation(10, 30);
//setLocation(100, 100);
//ImageIcon ii1=new ImageIcon("pak.jpg");
ImageIcon ii1=new ImageIcon("pacman2.jpg");

img1=ii1.getImage();
setBackground(Color.blue);
//setBackground(Color.yellow);
setFocusable(false);
}
public void paint(Graphics r)
{ super.paint(r);
r.drawImage(img1,0,0,30,30,this);
}
}

class Bot extends Panel
{Image img2;
 int x,y,dx,dy;

public Bot()
// public Bot(int x,int y,int dx,int dy) 
//int x, y, dx, dy;
{super();

setSize(30,30);
setLocation(10,30);
setBackground(Color.red);

//ImageIcon ii2=new ImageIcon("straw1.jpg");
ImageIcon ii2=new ImageIcon("hi.png");
img2=ii2.getImage();
setFocusable(false);
}
public void paint(Graphics t)
{ super.paint(t);
t.drawImage(img2,0,0,30,30,this);
}
}








////
//class  MyPanel  extends Panel 
//{ public MyPanel(int x,int y) 
//{ super();
//setSize(10,10);
//setLocation(x,y);
//setFocusable(false);
//}
//}



/*
System.out.println(y+" Y 888699222 ");
System.out.println(x+" x   888699222");

System.out.println(b4.y+"b4y99222 ");
System.out.println(b4.x+"b4x99222 ");

System.out.println(b3.y+"b3y99 ");
System.out.println(b3.x+"b3x99 ");

System.out.println(b2.y+"b2y99 ");
System.out.println(b2.x+"b2x99 ");


System.out.println(b1.y+"b1y99 ");
System.out.println(b1.x+"b1x99 ");

System.out.println(a[y][x]+"   a[y][x]k99k99=-1 ");
         
 */

/*
System.out.println("***23456***");
System.out.println(y+" Y ");
System.out.println(x+"X ");
System.out.println(vishenka+"vish");
System.out.println(k99+"k99");
System.out.println("**23456**");
System.out.println(c5+"C5  ");
System.out.println(c6+"C6  ");
System.out.println(a[y + dy][x + dx]+"simvol  ");
*/
/* 
 bot1.x=19;
 bot1.y=19;
           b1.setLocation (bot1.x*30+10,bot1/y*30+25);
 bot2.x=19;
 bot2.y=19;
           b2.setLocation (bot1.x*30+10,bot1/y*30+25);
 bot3.x=19;
 bot3.y=19;
           b3.setLocation (bot1.x*30+10,bot1/y*30+25);
 bot4.x=19;
 bot4.y=19;
           b4.setLocation (bot1.x*30+10,bot1/y*30+25);
          REPAINT(;)

   a[19][19]='*';
*/

//     int c7,c8;
////c7= m57*2

//  ri=a7[m57];
//  ry=a7[m57+1];

 // ri=a7[0];
 // ry=a7[1];
 // ri=a7[20];
 // ry=a7[6];



// a[ri][ry]=' '; 
// a[20][6]=' '; 
//repaint();
  //a[ry][ri]=' ';    


// bot1.x=18;
// bot1.x=18;
//if (k99 ==987)
// if ((k99 != -1) && (m57<=4)) ;
// if ((m57<=4) && (vishenka==0))
// if (m57<=4) 
// if ((k99 != -1) 
//{



//}    //k99
//   m57=m57;}

//     for (int m56=m57; m56<3; m56++)

//   System.exit(0);


// if  (vishenka==1)




//System.out.println(vishenka+" vishenka 1");
//System.out.println(k99+" k99 1");


// if ((vishenka==1) && (k99==-1))


//System.out.println(y+" Y 888699222 ");
//System.out.println(x+" x   888699222");
//System.out.println(b4.y+"b4y99222 ");
//System.out.println(b4.x+"b4x99222 ");

//System.out.println(b3.y+"b3y99 ");
//System.out.println(b3.x+"b3x99 ");

//System.out.println(b2.y+"b2y99 ");
//System.out.println(b2.x+"b2x99 ");


//System.out.println(b1.y+"b1y99 ");
//System.out.println(b1.x+"b1x99 ");


 //**************************************

   
 //


// b2.x=8;
// b2.y=18;

// b3.x=18;
// b3.y=18;
 
//b4.x=28;
// b4.y=18;




//b2.setLocation(b2.x * 30 + 10, b2.y * 30 + 30);

//b3.setLocation(b3.x * 30 + 10, b3.y * 30 + 30);

