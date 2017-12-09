import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.*;



class main9
 { public static void main(String[] args)
  { new Wind();
  }
 }
 
 class Wind extends Frame implements KeyListener
  { char[][] a =new char[20][30];
 int x  = 2;
 int y  = 2;
 int bot1_x, bot1_y;
 int bot2_x, bot2_y;
 int bot3_x, bot3_y;
 int bot4_x, bot4_y;
 MyPanel b;
 TextField1 tf1;
 TextField1 tf2;
 Bot b1;
 Bot b2;
 Bot b3;
 Bot b4;
 Graphics buf; Image img;
   int nom55=0;
    
 public Wind()
   { super("Games");
  setSize(920, 720);
  setLocation(0, 0);
  add(tf1=new TextField1(470,670));
  add(tf2=new TextField1(370,670));
  add(b1=new Bot());
  add(b2=new Bot());
  add(b3=new Bot());
  add(b4=new Bot());

  addWindowListener(new WindowAdapter() {
   public void windowClosing(WindowEvent we) {
    System.exit(0);
   }
  });
  setLayout(null);
  addKeyListener(this);
  add(b = new MyPanel());
  readArray();
  setVisible(true);
   }



    public void paint(Graphics g)
    {super.paint(g); 
for (int i = 0; i < 20; i++)
  { for (int j = 0; j < 30; j++)
   { if (a[i][j] == '#')
//      { g.fillRect(j * 30 + 10, i * 30 + 30, 30,30);
      {  g.setColor(new Color(0, 0, 255));  
                               // g.setColor( Color.BLUE);
// g.fillRect(j * 30 + 10, i * 30 + 30, 30,30);

//      ImageIcon im1=new ImageIcon("straw1.jpg");
//      ImageIcon im1=new ImageIcon("1st.jpg");
//      ImageIcon im1=new ImageIcon("2st.jpg");
//      ImageIcon im1=new ImageIcon("3.jpg");
//      ImageIcon im1=new ImageIcon("4st.jpg");
      


   //  if (!isDoubleBuffered()) {
//       buffer = Image.createImage(j * 30 + 10, i * 30 + 30);
//   }
   
   // получаем возможность отрисовки в img
 //  buf = img.getGraphics();
     


     ImageIcon im1=new ImageIcon("5st.jpg");
   
     //msg2=Integer.toString(nomurovn);
     // tf2.setText("uroven  "+ msg2);
 

     Image img=im1.getImage();
        // g.drawImage(img,0,0,null);
// g.drawImage(img,10,10,30,50,this); 
g.drawImage(img,j * 30 + 10, i * 30 + 30, 30,30,this);
  
requestFocus();

//g.fillRect (    j * 30 + 10, i * 30 + 30, 30,30);
//g.drawImage(img,10,10,30,50,this); 
     }
      // g.setColor( Color.BLUE);

                   }
         }

    // draw(buf);
  }
      

   public void draw(Graphics g) {
      //g.setColor(0xffffff);
 //  g.fillRect(0,0,w,h);
 //  g.setColor(0x111111);
 //  g.fillRect(25,25,125,125);
 //  g.setColor(0xababab);
 //  g.fillRect(70,60,70,60);
  }

    public void readArray()
     {
      
      try
   { Scanner sc = new Scanner(new File("level_01.txt"));
     for (int i = 0; i < 20; i++)
      { String s = sc.nextLine();
     for (int j = 0; j < 30; j++)
    { a[i][j] = s.charAt(j);
      if (a[i][j] == '@')
       { x = j;
      y = i;
      a[i][j] = ' ';
     // b.setLocation(x * 30 + 10, y * 30 + 30);
 b.setLocation(x * 30 + 10, y * 30 + 30);
   setBackground(Color.YELLOW);
      }
      
      if(a[i][j] == '*')
{   nom55+=1;
if (nom55==1)
 {
   b1.setLocation(i * 30 + 10, j * 30 + 30);
   bot1_x=i;
   bot1_y=j;
}

if (nom55==2)
{  b2.setLocation(i * 30 + 10, j * 30 + 30);
   bot2_x=i;
   bot2_y=j;
}
if (nom55==3)
{  b3.setLocation(i * 30 + 10, j * 30 + 30);
   bot3_x=i;
   bot3_y=j;
}

if (nom55==4)
{
   bot4_x=i;
   bot4_y=j;
   b4.setLocation(i * 30 + 10, j * 30 + 30);
}

}


      
      
      
      
    }
   }
     sc.close();
   }
  catch (Exception e)
      { System.out.println(e);
   }
  }

    public void movePanel(int dx, int dy)
     { //if (a[y + dy][x + dx] == ' ')
       if (a[x + dx][y + dy] == ' ')

      { x += dx;
        y += dy;
    //System.out.println(a[y][x], " 1");
     }
    b.setLocation(x * 30 + 10, y * 30 + 30);
    b1.setLocation(bot1_x* 30 + 10, bot1_y * 30 + 30);
    b2.setLocation(bot2_x * 30 + 10, bot2_y * 30 + 30);
    b3.setLocation(bot3_x * 30 + 10, bot3_y * 30 + 30);
    b4.setLocation(bot4_x * 30 + 10, bot4_y * 30 + 30);
  }

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
  }
 
class MyPanel extends Panel
 { public MyPanel()
  { super();
    setSize(30, 30);
    //setLocation(10, 30);
    setBackground(Color.RED);
    setFocusable(false);
   
  }
 }
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

class Bot extends Panel
{Image img2;

public Bot()
{ super();
  setSize(30,30);
  //setLocation(10,30);
  ImageIcon ii2=new ImageIcon("hi.png");
  img2=ii2.getImage();
  setFocusable(false);
 }
public void paint(Graphics t)
 { super.paint(t);
   t.drawImage(img2,0,0,30,30,this);
 }
}


