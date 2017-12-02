import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.applet.*;


class main9
 { public static void main(String[] args)
  { new Wind();
  }
 }
 
 class Wind extends 
   Frame implements KeyListener
  { char[][] a =new char[20][30];
    int x  = 2;
    int y  = 2;
    MyPanel b;
    int p = 0;
    Image buf = null;
    Image img ;
    Graphics grap;
    public Wind()
     { super("Games");
       setSize(920, 640);
       setLocation(50, 100);
       addWindowListener(new WindowAdapter()
       { public void windowClosing(WindowEvent we) 
        {System.exit(0);
        }
       });
      setLayout(null);
      addKeyListener(this);
      add(b = new MyPanel());
      readArray();
      setVisible(true);
     }



    public void paint(Graphics g)
    {
      Graphics screengc = null;Image ga=null;
     // try
     // { if(p==1)
       //{
       //  Graphics2D g2 = (Graphics2D},g;   
        int w = getSize().width, h = getSize().height; 
      //  System.out.println(w, h); 
      // System.out.println("111   "+ w +"   "+ h);
         
         screengc = g;
        buf = createImage(w,h);
         g =  buf.getGraphics();
         
      //}   
      //}
      //catch(Exception e)
      //{System.out.println("111");}

       for (int i = 0; i < 20; i++)
       { for (int j = 0; j < 30; j++)
         { if (a[i][j] == '#')
           { p=1;
             ImageIcon im1=new ImageIcon("5st.jpg");
             Image img=im1.getImage();
             g.drawImage(img,j * 30 + 10, i * 30 + 30, 30,30,this); 
           }
         }   
       }
      // g.drawImage(buf, 0, 0, null);  
      // draw(buf);
     screengc.drawImage(buf, 0, 0, null);
     }
      

  public void update(Graphics g) 
   { paint(g);
   }

    public void readArray()
     { try
       { Scanner sc = new Scanner(new File("level_01.txt"));
         for (int i = 0; i < 20; i++)
          { String s = sc.nextLine();
            for (int j = 0; j < 30; j++)
            { a[i][j] = s.charAt(j);
              if (a[i][j] == '@')
               { //buf = createImage(30,30);
                 x = j;
                 y = i;
                 a[i][j] = ' ';
                 b.setLocation(x * 30 + 10, y * 30 + 30);
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
     {if (a[y + dy][x + dx] == ' ')
       { x += dx;
         y += dy;
       }
         b.setLocation(x * 30 + 10, y * 30 + 30);
      
       // x += dx;
       // y += dy;
       // b.setLocation(x * 1 + 50, y * 1 + 50);
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
       {}

     public void keyTyped(KeyEvent ke)
       {}
  }
 
class MyPanel extends Panel
 { public MyPanel()
  { super();
    setSize(30, 30);
    setLocation(10, 30);
    setBackground(Color.RED);
    setFocusable(false);
  }
 }

