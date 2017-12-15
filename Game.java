import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.*;

class Game
{ public static void main(String[] args)
  { //new Wind();
    Wind Window = new Wind();
    Window.add(new Menu(Window));
    Window.setVisible(true);
  }  
}



class Fr extends JFrame{
  TextField111 tf111;
  public Fr(String tex){
       super("about_game");
       setSize(450, 350);
       setLocation(100, 100);
       add(tf111=new TextField111(470,670, tex));
       addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
           setVisible(false); 
         }
       });
            tf111.setText(tex);  
     }
 } 

class TextAreaDemo extends JFrame { 
public  TextAreaDemo(String tex) {
   setSize(450, 350); 
   TextArea text = new TextArea(tex, 40,40); add(text); 
   text.setBounds(0,0, 100, 50); 
            addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
           setVisible(false); 
         }
       });
  } 
}

class TextField111 extends TextField
{public TextField111(int x, int y, String text)
  {  setSize(500,500); 
     setLocation(x,y);
     setBackground(Color.YELLOW);
     setFocusable(false);
   }
 }

class Menu extends JMenuBar
 { public Menu(JFrame Win )
    {  JMenuBar menuBar = new JMenuBar();
       Win.setJMenuBar(menuBar);
       JMenu fileMenu = new JMenu("Game");
       menuBar.add(fileMenu);
       JMenuItem openItem = new JMenuItem ("New game");
       fileMenu.add(openItem);
       openItem.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) { 
             Win.setVisible(false);          
             Wind Window = new Wind();
             Window.add(new Menu(Window));
             Window.setVisible(true);
                
            }
        });

       fileMenu.addSeparator();
       JMenuItem saveItem = new JMenuItem ("Save");
       fileMenu.add(saveItem);
       JMenuItem closeItem = new JMenuItem ("Close", new ImageIcon(""));
       fileMenu.add(closeItem);
       closeItem.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) { System.exit(0); }
        });
       closeItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK));
       JMenu helpMenu = new JMenu("Help");
       menuBar.add(helpMenu);
        
       JMenuItem helpItem = helpMenu.add("How play");
       JMenuItem aboutItem = helpMenu.add("About game");
       
       aboutItem.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) { 
             String path = "about.txt";
             String text = "";
             File file = new File(path);
             try{
             Scanner scanner = new Scanner(file);
              while ( scanner.hasNextLine()){
                 text = text + scanner.nextLine()+"\n" ;
                 }
                System.out.println(text);
              TextAreaDemo qqq = new TextAreaDemo(text);
              qqq.setVisible(true);
              scanner.close();
             }catch(Exception ex){}
           }
        });
     }
 }



class Wind extends JFrame implements KeyListener
{ char[][] a22 =new char[21][30];
  char[][] a =  new char[21][30];
  int propuskxoda=1;
  int botnebot =0;
  String date;  
  String msg1;
  String msg2;
  int v5=0;
  int maxurovn=5;
  int nomurovn=0;
  int k99=1;  //-1
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
  Image buf = null;
  Image img ;
  Graphics grap;
  int z=0;
  int k=0;
  int p1=0;
  MyPanel b;
  TextField1 tf1;
  TextField1 tf2;
  Bot bot1;
  Bot b1;
  Bot b2;
  Bot b3;
  Bot b4;
  String t;
   public Wind()
{ super("Pakman");
  setSize(920, 800);
  setBackground(Color.YELLOW);
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
  add(tf1=new TextField1(350,70));
  add(tf2=new TextField1(450,70));
  nomurovn+=1;
  t= "level_0"+nomurovn+".txt";   //
  readArray(t);
  setVisible(true);
  JOptionPane.showMessageDialog(null, "START!");
   }  //  wind

//********************************paint***********************************

public void paint(Graphics g)
{  Graphics screengc = null;Image ga=null;
   int w = getSize().width, h = getSize().height;
   buf = createImage(w,h);
   screengc = g;
   g =  buf.getGraphics();
   super.paint(g);
   for (int i = 0; i <= 20; i++)
     for (int j = 0; j < 30; j++)
   { if (a22[i][j] == '.')
     { ImageIcon ii=new ImageIcon("flow.jpg");
       Image img=ii.getImage();
       if (k99==-1)
         g.drawImage(img,j * 30 + 8, i * 30 + 123, 15,15,this);
       else
         g.drawImage(img,j * 30 + 8, i * 30 + 123, 10,10,this);
   }

   if (a[i][j]=='$')
   { ImageIcon ii=new ImageIcon("flow.jpg");
     Image img=ii.getImage();
     g.drawImage(img,j * 30 + 8, i * 30 + 123, 30,30,this);    
   }

   if (a[i][j] == '#')
   { g.setColor(new Color(0, 0, 255));
     ImageIcon im1=new ImageIcon("1st.jpg");
     Image img=im1.getImage();
     g.drawImage(img,j * 30 + 8, i * 30 + 123, 30,30,this);
   }

   if (a[i][j]=='$')
   { ImageIcon ii=new ImageIcon("flow.jpg");
     Image img=ii.getImage();
     g.drawImage(img,j * 30 + 8, i * 30 + 123, 30,30,this);    
   }

   if (a[i][j]=='1')
   { ImageIcon ii5= new ImageIcon("pak.jpg");
     Image img5=ii5.getImage();
     g.drawImage(img5,j*30 + 8, i*30 +123, 30,30,this);    
   }
 
   if (vishenka==0)
     k99=1;

   if ((a[i][j]=='V') && (vishenka==1))
   { ImageIcon ii=new ImageIcon("straw1.jpg");
     Image img=ii.getImage();
     g.drawImage(img,j*30+8, i*30+123,30,30,this);    
   }


   } //for
   requestFocus();
   screengc.drawImage(buf, 0, 0, null);
}  // paint
//*******************************************readarray*****************************************

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
     for (int i = 0; i <= 20; i++)
     { String s = sc.nextLine();
       for (int j = 0; j < 30; j++)
       { a[i][j] = s.charAt(j);
         if (a[i][j] == '@')
         { x = j;
           y = i;
           a[i][j] = ' ';
           //setBackground(Color.YELLOW);
           b.setLocation(x * 30 + 0, y * 30 + 70);
         }
         if(a[i][j] == '*')
         {     nom55+=1;
           if (nom55==1)
           {b1.x = j;
             b1.y = i;
             bot1x=x;
             bot1y=y;
             bot1_x = b1.x;
             bot1_y = b1.y;
             b1.dx = 0;
             b1.dy = 1;
             b1.setLocation(bot1_x * 30 + 0, bot1_y * 30 + 70);
           }

           if (nom55==2)
           {b2.x = j;
             b2.y = i;
             b2.dx = 1;
             b2.dy = 0;
             bot1_x = b2.x;
             bot1_y = b2.y;
             b2.setLocation(bot1_x * 30 + 0, bot1_y * 30 + 70);
           }
           if (nom55==3)
           {b3.x = j;
             b3.y = i;
             b3.dx = -1;
             b3.dy = 0;
             bot1_x = b3.x;
             bot1_y = b3.y;
             b3.setLocation(bot1_x * 30 + 0, bot1_y * 30 + 70);
           }
           if (nom55==4)
           {b4.x = j;
             b4.y = i;
             b4.dx = 0;
             b4.dy = -1;
             bot1_x = b4.x;
             bot1_y = b4.y;
             b4.setLocation(bot1_x * 30 + 0, bot1_y * 30 + 70);
           }

         }

         if(a[i][j] == '$' )
         { z++;
         }

         if((a[i][j] == '1' ) && (m57_1 > 0))
         { a[i][j] ='#';
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
 { a22[i][j]= a[i][j];
   if ((a[i][j]==' ')  ||  (a[i][j]=='*') ||  (a[i][j]=='V'))
   a22[i][j] = '.';
 }
} 



 /////////////////////////////////////////////////movePanel//////////////////////////////////// 
public void movePanel(int dx, int dy)
{dom7();
  {
    if (a[y + dy][x + dx]!= '#')   
    { x += dx;
      y += dy;
    }
    if (k99==1)
      propuskxoda=1;
    if (k99==-1)
      propuskxoda=3-propuskxoda;
    dom7();
    if   (a22[y][x]== '.')
    { kamen1+=1;
      a22[y][x]= ' ';
     }
    msg1=Integer.toString(kamen1);
    tf1.setText("GOLD  "+msg1+"   "+"M"+p1+"   "+"V"+v5);
    msg2=Integer.toString(nomurovn);
    tf2.setText("uroven  "+ msg2);
    
    if ((kamen1==17) || (kamen1==110))
      vishenka=1;
    repaint();
    if ((kamen1==70)  || (kamen1==130))
    { vishenka=0;
      k99=1;
      repaint();
    }
    int c5=y + dy;
    int c6 =x+dx;      
    b.setLocation (x*30+0,y*30+70);

    if (propuskxoda==1)
    { bot7(b1);
      b1.setLocation (bot1x*30+0,bot1y*30+70);
      bot7(b2);
      b2.setLocation (bot1x*30+0,bot1y*30+70);
      bot7(b3);
      b3.setLocation (bot1x*30+0,bot1y*30+70);
      bot7(b4);
      b4.setLocation (bot1x*30+0,bot1y*30+70);
    } 
   dom7();
    if (a[y][x] == '$')
    { a[y][x]=' ';
      p1++;
      System.out.print(p1+" ");
    }
  
    if   ((a[y][x]== 'V')   && (vishenka==1))         
    { k99=-1;
      v5+=1;
    }

    if (vishenka==0)
      k99=1;
    
    dom7();
    repaint();

    if(p1==z)
    { nomurovn+=1;
      if (nomurovn<=maxurovn)
      { t= "level_0"+nomurovn+".txt";   //
        m57_1 =m57; 
        readArray(t);
        repaint();} 
    }

    if (nomurovn>maxurovn)  
    {  JOptionPane.showMessageDialog(null, " Pacman  win!!! ");
      System.exit(0);  }
    b.setLocation(x * 30 + 0, y * 30 + 70);
  }
}  //movepanel



 public void bot7(Bot bot1)
 { bot1y=bot1.y;
   bot1x=bot1.x;
   bot1dy=bot1.dy;
   bot1dx=bot1.dx;
   pr51=0;
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
   if(a[bot1y+bot1dy][bot1x+bot1dx]!='#') 
   { bot1y+=bot1dy;  
     bot1x+=bot1dx;
     pr51=1; } 
   int pr52=0;
   int ddbot1dx=bot1dx; 
   int ddbot1dy=bot1dy; 
   if  ((bot1dx==0)  && (pr51==0))
   { pr52=1;
     bot1dy=0;
     bot1dx=-1*k99;  
     if(a[bot1y+bot1dy][bot1x+bot1dx]!='#') 
     { bot1y+=bot1dy;  
       bot1x+=bot1dx; 
       pr51=1;        } 
   }
   if ((pr51==0) && (pr52!=0)) 
   { bot1dy=0;
     bot1dx=1*k99;  
     if(a[bot1y+bot1dy][bot1x+bot1dx]!='#') 
     { bot1y+=bot1dy;  
       bot1x+=bot1dx; 
       pr51=1;    } 
   }                   
   if ((pr51==0) && (pr52!=0)) 
   { bot1dy=-1;
     bot1dx=0;  
     bot1dy=ddbot1dy-ddbot1dy-ddbot1dy;
     bot1dx=ddbot1dx-ddbot1dx-ddbot1dx;
     if(a[bot1y+bot1dy][bot1x+bot1dx]!='#') 
     { bot1y+=bot1dy;  
       bot1x+=bot1dx; 
       pr51=1;    } 
   }                   
   pr52=0;
   if  ((bot1dy==0)  && (pr51==0)) 
   { pr52=1;
     bot1dy=-1;
     bot1dx=0;  
     if(a[bot1y+bot1dy][bot1x+bot1dx]!='#') 
     { bot1y+=bot1dy;  
       bot1x+=bot1dx; 
       pr51=1;        } 
   }
   if ((pr51==0) && (pr52!=0)) 
   { bot1dy=1;
     bot1dx=0;  
   if(a[bot1y+bot1dy][bot1x+bot1dx]!='#') 
     { bot1y+=bot1dy;  
       bot1x+=bot1dx; 
       pr51=1;    } 
   }                   
   if ((pr51==0) && (pr52!=0)) 
   { bot1dy=0;
     bot1dx=-1;  
     bot1dy=ddbot1dy-ddbot1dy-ddbot1dy;
     bot1dx=ddbot1dx-ddbot1dx-ddbot1dx;
     if(a[bot1y+bot1dy][bot1x+bot1dx]!='#') 
     { bot1y+=bot1dy;  
       bot1x+=bot1dx; 
       pr51=1;    } 
   }                   
   bot1.x=bot1x;
   bot1.y=bot1y;
   bot1.dx=bot1dx;
   bot1.dy=bot1dy;
   
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



public void dom7()
{  dom8();
  if (botnebot > 0)  
  {if (k99==-1)
    { a[y][x]=' ';
      if ((y== b4.y) && (x==b4.x))
      { b4.x=23;
        b4.y=6;
        b4.setLocation(b4.x * 30 + 0, b4.y * 30 + 70);
        a[b4.y][b4.x]='*';
      }
     if ((x== b3.x) && (y==b3.y))
      { b3.x=22;
        b3.y=6;
        b3.setLocation(b4.x * 30 + 0, b3.y * 30 + 70);
        a[b3.y][b3.x]='*';
      }
      
      if ((x== b2.x) && (y==b2.y))
      { b2.x=22;
        b2.y=5;
        b2.setLocation(b2.x * 30 + 0, b2.y * 30 + 70);
        a[b2.y][b2.x]='*';
      }
      
      if ((x== b1.x) && (y==b1.y))
      { b1.x=22;
        b1.y=4;
        b1.setLocation(b1.x * 30 + 0, b1.y * 30 + 70);
        a[b1.y][b1.x]='*';
      }
    } 

  if (k99 != -1)
    { a[y][x]=' ';
      if (m57<=4) 
      { p1=0;
        int ri,ry;
        m57+=1; 
        m57_1 =m57;
        readArray(t);
      }

      if (m57>4) 
      {  JOptionPane.showMessageDialog(null, " Game over!!! ");
        System.exit(0);
      }
    } 
  } 
} 

//*************************************************************


 public void dom8()
 { botnebot=0;
   if ((y== b4.y) && (x==b4.x))
     botnebot=4;
   if ((x== b3.x) && (y==b3.y))
     botnebot=3;
   if ((x== b2.x) && (y==b2.y))
     botnebot=2;
   if ((x== b1.x) && (y==b1.y))
     botnebot=1;
 } 



 } 

//**********************************************************************
class TextField1 extends JTextField
  {public TextField1(int x, int y)
    {super("0");
     setSize(100,30);
     setLocation(x,y);
     setBackground(Color.YELLOW);
    }
  }

//**********************************************************************
class MyPanel extends JPanel
{ Image img1;
  public MyPanel()
  { super();
    setSize(30,30);
    setLocation(10, 30);
    ImageIcon ii1=new ImageIcon("pacman2.jpg");
    img1=ii1.getImage();
    setFocusable(false);
  }
  public void paint(Graphics r)
  { super.paint(r);
    r.drawImage(img1,0,0,30,30,this);
  }
}

class Bot extends JPanel
{ Image img2;
  int x,y,dx,dy;
  public Bot()
  { super();
    setSize(30,30);
    setLocation(10,30);
    setBackground(Color.red);
    ImageIcon ii2=new ImageIcon("hi.png");
    img2=ii2.getImage();
    setFocusable(false);
  }
  public void paint(Graphics t)
  { super.paint(t);
    t.drawImage(img2,0,0,30,30,this);
  }
}