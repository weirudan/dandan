package life;
import  javax.swing.*;
import java.awt.*;
public class LIFEGAME extends JFrame {
	
	LIFEGAME()//���캯��
	{
		this.setSize(1000,820);  //������Ϸ�����С
        this.setTitle("������Ϸ����ϸ΢���ĶԱ�");  
        this.setBackground(new Color(0,0,0));//���ñ���ɫΪ��ɫ
        this.add(new MAP());  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);  
        this.setResizable(false);
	}
	public static void main(String[] args){  
        LIFEGAME game = new LIFEGAME();  
        game.setVisible(true);  
    }  
}
