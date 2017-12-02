import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.*;



class main9
 { public static void main(String[] args)
  
  { Wind www = new Wind();
    JMenuBarTest vvv;
   //new JMenuBarTest();
    
     //www.add(www1);
    JMenuBarTest me = new JMenuBarTest();
    //new JMenuBarTest();
     //add(menu);
   // JFrame.setDefaultLookAndFeelDecorated(true);
    www.setSize(800, 800);
       // www.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //додаємо меню
        add(new JMenuBarTest());
        www.setVisible(true);
    //add(vvv = new (JMenuBarTest())); 
    //www.setVisible(true);   
   }
 }
 

class JMenuBarTest  
{
    private static final long serialVersionUID = 1L;
    private  final  String[][]  menuFile = 
                                {{"Файл"     ,  "Ф",  "", ""}, 
                                 {"Открыть"  ,  "О", "O", ""},
                                 {"Сохранить",  "С", "S", ""}};
    private  final  String[][]  menuEdit = 
                                {{"Редактирование" , "Р",  "", ""}, 
                                 {"Вырезать"  , "В", "X", "images/cut.png"},
                                 {"Копировать", "К", "C", "images/copy.png"}};
    //--------------------------------------------------------
    /**
     * Функция создания выпадающего меню
     * @param items описание меню
     * @return JMenu выпадающее меню 
     */
    private JMenu createMenuItems(final String[][] items)
    {
        // Создание выпадающего меню
        JMenu menu = new JMenu(items[0][0]);
        menu.setMnemonic(items[0][1].charAt(0));
        for (int i = 1; i < items.length; i++) {
            // пункт меню "Открыть"
            JMenuItem item = new JMenuItem(items[i][0]);
            item.setMnemonic(items[i][1].charAt(0)); // русская буква
            // установим клавишу быстрого доступа (латинская буква)
            item.setAccelerator(KeyStroke.getKeyStroke(items[i][2].charAt(0), 
                                          KeyEvent.CTRL_MASK));
            if (items[i][3].length() > 0)
                item.setIcon(new ImageIcon(items[i][3]));
            menu.add(item);
        }
        return menu;
    }
    //--------------------------------------------------------
    public JMenuBarTest() {
        //super("Системное меню");
    //    Wind www = new Wind();
      //  www.setDefaultCloseOperation(EXIT_ON_CLOSE );
        // создаем строку главного меню
        JMenuBar menuBar = new JMenuBar();
        // Создание меню "Файл"
        menuBar.add(createMenuItems(menuFile));
        // Создание меню "Редактирование"
        menuBar.add(createMenuItems(menuEdit));

        //menuBar.add(createSubmenus());

        // JMenuBar использует блочное расположение (заполнитель вполне уместен)
        menuBar.add(Box.createHorizontalGlue());
        // Разместим в строке меню не выпадающее меню, а надпись со значком
        JLabel exit = new JLabel(new ImageIcon("images/exit.png"));
        exit.setText("Выход");
        exit.setBorder(BorderFactory.createEtchedBorder());
       //add(); 
     //  menuBar.add(exit);

        // поместим меню в наше окно
         
        //setJMenuBar(menuBar);
         //www.setJMenuBar(menuBar);
        // выводим окно на экран
          //setSize(300, 200);
        // setVisible(true);
    }
    //--------------------------------------------------------

}




 class Wind extends Frame implements KeyListener
  { char[][] a =new char[20][30];
 int x  = 2;
 int y  = 2;
 MyPanel b;
 JMenuBarTest vvv;
        Graphics buf; Image img;
 public Wind()
   { super("Games");

     new JMenuBarTest();
     //JMenuBar menuBar = new JMenuBar();
     //add(menuBar);
     //me.setJMenuBar(menuBar);
     //add(vvv = new JMenuBarTest());
   //  setJMenuBar(menuBar);
     setSize(920, 640);
  setLocation(50, 100);
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


     Image img=im1.getImage();
        // g.drawImage(img,0,0,null);
// g.drawImage(img,10,10,30,50,this); 

     //g.drawImage(img,j * 30 + 10, i * 30 + 30, 30,30,this); 


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
     { try
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
     { if (a[y + dy][x + dx] == ' ')
  { x += dx;
    y += dy;
     }
    b.setLocation(x * 30 + 10, y * 30 + 30);
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
    setLocation(30, 30);
    setBackground(Color.RED);
    setFocusable(false);
  }
 }

