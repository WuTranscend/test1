//编写代码，101-200之间有多少个素数，并输出所有素数
public class test2 {

	public static void main(String[] args) {
		
		
		for(int i=101;i<=200;i++) {
			boolean temp = true;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					temp=false;
					break;
				}
			}
			if(temp==true)
			System.out.println(i);
		}

	}

}
