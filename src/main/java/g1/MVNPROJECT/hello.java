package g1.MVNPROJECT;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class hello {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		while(StringUtils.isNumeric(input)) {
			System.out.println("請輸入數字");
			input = s.nextLine();
		}
		//StringUtils.isNumeric("ASZS");
		System.out.println("OK");
	}
	
}
