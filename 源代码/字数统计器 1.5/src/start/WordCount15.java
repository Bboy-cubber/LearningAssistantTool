package start;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WordCount15 {
	public static int countZH_CN(String text) {
	     String Reg="^[\u4e00-\u9fa5]{1}$";//中文正则表达式
	     int result = 0;
	     for(int i=0;i<text.length();i++){
	     String b=Character.toString(text.charAt(i));
	     if(b.matches(Reg))result++;
	     }
	     return result;
	   }
	public static int countEN_US(String text) {
	     String Reg1="^[A-Za-z]+$";//英文正则表达式
	     int result1 = 0;
	     for(int f=0;f<text.length();f++){
	     String a=Character.toString(text.charAt(f));
	     if(a.matches(Reg1))result1++;
	     }
	     return result1;
	   }
	public static int countPun(String text) {
	     String Reg2="[\\s\\p{P}\\n\\r=+$￥<>^`~|]";//标点符号正则表达式
	     int result2 = 0;
	     for(int c=0;c<text.length();c++){
	     String y=Character.toString(text.charAt(c));
	     if(y.matches(Reg2))result2++;
	     }
	     return result2;
	   }
	public static int countNum(String text) {
		String Reg3 = "^[0-9]$";//数字正则表达式
		int result3 = 0;
		for (int n = 0; n < text.length(); n++) {
		String h = Character.toString(text.charAt(n));
		if(h.matches(Reg3))result3++;
		}
		return result3;
	}
	   public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Scanner sc1 = new Scanner(System.in);
		 System.out.println("欢迎使用字数统计器1.5版本\n");
		 System.out.println("作者：邹子睿    制作时间：2023.4.12\n\n");
		 System.out.println("输入1查看软件说明，输入2开始主程序：");
		 int judge = sc1.nextInt();
		 switch(judge) {
		 case 1:
			 System.out.println("\n\n欢迎查看软件说明：\n\n");
			 System.out.println("欢迎使用 字数统计器1.5版本\n");
			 System.out.println("作者：邹子睿       制作时间：2023年4月12日\n");
			 System.out.println("应用程序类型：Console Application（控制台应用）\n");
			 System.out.println("修复Bug：无\n");
			 System.out.println("功能：\n#统计中文，英文，数字，标点符号个数，以及字符总个数\n");
			 System.out.println("感谢使用！！！\n\n");
			 String XM = "准备自动开始运行程序.........\n\n";
			 for (int n = 0; n < XM.length(); ++n) {
				 System.out.print(XM.charAt(n));
				 try {
					 TimeUnit.MILLISECONDS.sleep(300);//休眠几秒再输出
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			 break;
		 case 2:
			 String XM2 = "马上开始运行程序.........\n\n";
			 for (int n1 = 0; n1 < XM2.length(); ++n1) {
				 System.out.print(XM2.charAt(n1));
				 try {
					 TimeUnit.MILLISECONDS.sleep(100);//休眠几秒再输出
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			 break;
		 default:
			 System.out.println("没想到吧！我留了一手！惊不惊喜？意不意外？");
			 String XM3 = "马上开始自动运行程序.........\n\n";
			 for (int n2 = 0; n2 < XM3.length(); ++n2) {
				 System.out.print(XM3.charAt(n2));
				 try {
					 TimeUnit.MILLISECONDS.sleep(300);//休眠几秒再输出
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			 break;
		 }
		 System.out.println("\n请输入任意内容，进行字符数量统计：");
	     String text = sc.nextLine();
	     String Characterinput = text;
	     int stringLength = Characterinput.length();
	     System.out.println("\n一共有" + countZH_CN(text) + "个中文字符");
	     System.out.println("一共有" + countEN_US(text) + "个英文字符");
	     System.out.println("一共有" + countNum(text) + "个数字");
	     System.out.println("一共有" + countPun(text) + "个标点符号");
	     System.out.println("总共有" + stringLength + "个字符\n\n感谢使用！！！\n\n");
	     while (true) {
	    	 System.out.println("请继续输入任意内容，进行字符数量统计：");
	    	 text = sc.nextLine();
		     System.out.println("\n一共有" +countZH_CN(text) + "个中文字符");
		     System.out.println("一共有" +countEN_US(text) + "个英文字符");
		     System.out.println("一共有" + countNum(text) + "个数字");
		     System.out.println("一共有" +countPun(text) + "个标点符号");
		     System.out.println("总共有" + stringLength + "个字符\n\n感谢使用！！！\n\n");
		}
	   }
}
