import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_img=new JLabel();
    List<JLabel> list_bg=new ArrayList();
    //构造方法
    public App() {
        list_bg.add(new JLabel());
        list_bg.add(new JLabel());
        list_bg.add(new JLabel());

        URL imgURL = App.class.getResource("img/ball.png");
        list_bg.get(0).setIcon(new ImageIcon(imgURL));
        list_bg.get(0).setBounds(0,100,64,64);
        myPanel.add(list_bg.get(0));

        URL imgURL1 = App.class.getResource("img/ball.png");
        list_bg.get(1).setIcon(new ImageIcon(imgURL1));
        list_bg.get(1).setBounds(64,100,64,64);
        myPanel.add(list_bg.get(1));

        URL imgURL2 = App.class.getResource("img/ball.png");
        list_bg.get(2).setIcon(new ImageIcon(imgURL2));
        list_bg.get(2).setBounds(128,100,64,64);
        myPanel.add(list_bg.get(2));

    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1224,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
