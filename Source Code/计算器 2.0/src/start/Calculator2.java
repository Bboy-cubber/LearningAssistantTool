package start;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Calculator2 {
	public static void main(String[] args) {
		System.out.println("欢迎使用计算器2.0版本！\n");
		System.out.println("作者：邹子睿    制作时间：2023.4.12\n");
		System.out.println("更多信息请见“使用说明”\n\n");
		System.out.println("输入1查看使用说明，输入2直接开始程序：");
		Scanner sc = new Scanner(System.in);
		int judge = sc.nextInt();
		switch(judge) {
		case 1:
			System.out.println("\n欢迎查看计算器2.0版本的使用说明:\n\n");
			System.out.println("欢迎使用计算器2.0版本！\n");
			System.out.println("作者：邹子睿    制作时间：2023.4.12\n");
			System.out.println("功能：\n#进行基本类型计算，生活应用题计算，还有图形计算\n");
			String XM = "8秒后自动开始运行程序......";
			for (int i = 0; i < XM.length(); ++i) {
				System.out.print(XM.charAt(i));
				try {
					TimeUnit.MILLISECONDS.sleep(600);//休眠几秒再输出
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			break;
		case 2:
			String XM1 = "\n马上开始运行程序......";
			for (int o = 0; o < XM1.length(); ++o) {
				System.out.print(XM1.charAt(o));
				try {
					TimeUnit.MILLISECONDS.sleep(200);//休眠几秒再输出
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			break;
		default:
			String XM2 = "\n输入的数不在指定范围之内，马上自动开始运行程序......";
			for (int u = 0; u < XM2.length(); ++u) {
				System.out.print(XM2.charAt(u));
				try {
					TimeUnit.MILLISECONDS.sleep(200);//休眠几秒再输出
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			break;
		}
		while(true) {
		System.out.println("\n\n请选择要计算的项目：");
		System.out.println("输入1进行基本类型计算（例如加减乘除），输入2进行生活应用计算，输入3进行图形计算：");
		Scanner sc2 = new Scanner(System.in);
		int judge2 = sc2.nextInt();
		switch(judge2) {
		case 1:
			System.out.println("\n\n欢迎来到基本类型计算模块，请选择计算类型：");
			System.out.println("输入1计算加减乘除取余，输入2进行次方计算，输入3进行阶乘计算，输入4进行分数约分：");
			Scanner sc3 = new Scanner(System.in);
			int judge3 = sc3.nextInt();
			switch(judge3) {
			case 1:
				System.out.println("请输入第1个数（整数）：");
				Scanner sc4 = new Scanner(System.in);
				int num = sc4.nextInt();
				System.out.println("请输入第2个数（整数）：");
				Scanner sc5 = new Scanner(System.in);
				int num2 = sc5.nextInt();
				System.out.println(num + "和" + num2 + "的和是：" + (num + num2));
				System.out.println(num + "和" + num2 + "的差是：" + (num - num2));
				System.out.println(num + "和" + num2 + "的积是：" + (num * num2));
				System.out.println(num + "和" + num2 + "的商(取整)是：" + (num / num2));
				System.out.println(num + "和" + num2 + "的余数是：" + (num % num2));
				break;
			case 2:
				System.out.println("请输入1个数（整数或小数）");
				Scanner sc6 = new Scanner(System.in);
				double num3 = sc6.nextDouble();
				System.out.println("输入次方数：");
				Scanner sc7 = new Scanner(System.in);
				double num4 = sc7.nextDouble();
				double Power = Math.pow(num3, num4);
				System.out.println("结果得：" + Power);
				break;
			case 3:
				System.out.println("请输入1个参数(必须是整数)：");
				Scanner sc8 = new Scanner(System.in);
				int num5 = sc8.nextInt();
				int sum = 1;
				if (num5 < 0) {
					throw new IllegalArgumentException("需要计算的参数必须为正数！");
				}
				for (int y = 1; y <= num5; y++) {
					sum *= y;
				}
				System.out.println(num5 + "的阶乘为：" + sum);
				break;
			case 4:
				Scanner sc28 =new Scanner(System.in);
				System.out.println("输入分母：");
				int a=sc28.nextInt();
				System.out.println("输入分子：");
				int b=sc28.nextInt();
				int num0=a<b?a:b;
				int maxb=1;
				for (int i = num0; i >=2; i--) {
					if (a%i==0&&b%i==0) {
						maxb*=i;
						a=a/i;
						b=b/i;
					}
				}
				System.out.println("分母为"+a+"，分子为："+b);
				break;
			default:
				System.out.println("暂时还没有这个功能哦~");
				break;
			}
			break;
		case 2:
			System.out.println("\n\n欢迎来到生活应用计算模块，请选择计算类型：");
			System.out.println("输入1计算鸡兔同笼问题:");
			Scanner sc9 = new Scanner(System.in);
			int judge4 = sc9.nextInt();
			switch(judge4) {
			case 1:
				System.out.println("\n\n让我们来进行一些自定义设置吧（务必写入正确数值！）：");
				System.out.println("一共有多少角色（动物）：");
				Scanner sc14 = new Scanner(System.in);
				int num1 = sc14.nextInt();
				System.out.println("一共有多少条腿：");
				Scanner sc15 = new Scanner(System.in);
				int num2 = sc15.nextInt();
				System.out.println("请输入第1个角色的名称：");
				Scanner sc10 = new Scanner(System.in);
				String role1 = sc10.nextLine();
				System.out.println("请输入第1个角色的腿数：");
				Scanner sc11 = new Scanner(System.in);
				int leg1 = sc11.nextInt();
				System.out.println("请输入第2个角色的名称：");
				Scanner sc12 = new Scanner(System.in);
				String role2 = sc12.nextLine();
				System.out.println("请输入第2个角色的腿数：");
				Scanner sc13 = new Scanner(System.in);
				int leg2 = sc13.nextInt();
				System.out.println("原问题：一共有"+num1+"个动物，有"+num2+"条腿，"+role1+"有"+leg1+"条腿，"+role2+"有"+leg2+"条腿，问："+role1+"和"+role2+"各有多少个？");
				if (leg1 > leg2) {
					int NLN = leg1*num1;
					int D = NLN-num2;
					int R1 = D / (leg1-leg2);
					int R2 = num1 - R1;
					System.out.println("计算结果："+role1+"有"+R2+"只，"+role2+"有"+R1+"只。");
				} else if(leg1 < leg2) {
					int NLN2 = leg2*num1;
					int D2 = NLN2-num2;
					int R1 = D2 / (leg2-leg1);
					int R2 = num1 - R1;
					System.out.println("计算结果："+role1+"有"+R1+"只，"+role2+"有"+R2+"只。");
				} else {
					System.out.println("哎呀！出错了！");
					System.out.println("可能原因：1.角色腿数相等。");
				}
				break;
			}
			break;
		case 3:
			System.out.println("\n\n欢迎来到图形计算模块，请选择计算类型：");
			System.out.println("输入1计算圆柱体积，输入2计算圆柱表面积，输入3计算圆锥体积：");
			Scanner sc21 = new Scanner(System.in);
			int judge6 = sc21.nextInt();
			switch(judge6) {
			case 1:
				System.out.println("请输入圆柱的底面半径：");
				Scanner sc22 = new Scanner(System.in);
				double r1 = sc22.nextDouble();
				System.out.println("请输入圆柱的高：");
				Scanner sc23 = new Scanner(System.in);
			    double h1 = sc23.nextDouble();
				double V = r1*r1*3.14*h1;
				System.out.println("计算结果为："+V);
				break;
			case 2:
				System.out.println("请输入圆柱的底面半径：");
				Scanner sc24 = new Scanner(System.in);
				double r2 = sc24.nextDouble();
				System.out.println("请输入圆柱的高：");
				Scanner sc25 = new Scanner(System.in);
				double h2 = sc25.nextDouble();
				double ds2 = r2*r2*3.14*2;
				double cmj = r2*2*3.14;
				double bmj = ds2+cmj;
				System.out.println("计算结果为："+bmj);
				break;
			case 3:
				System.out.println("请输入圆锥的底面半径：");
				Scanner sc26 = new Scanner(System.in);
				double r3 = sc26.nextDouble();
				System.out.println("请输入圆锥的高：");
				Scanner sc27 = new Scanner(System.in);
			    double h3 = sc27.nextDouble();
				double V2 = (r3*r3*3.14*h3) / 3;
				System.out.println("计算结果为："+V2);
				break;
			default:
				System.out.println("\n更多功能请敬请期待！！！");
				break;
			}
			break;
		default:
			System.out.println("\n更多功能请敬请期待！！！");
			break;
		}
		}
     }
}
