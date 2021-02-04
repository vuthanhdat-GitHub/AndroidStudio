package javaBasic;

import java.util.Scanner;

public class Bai3 {
	Scanner sc = new Scanner(System.in);
    String string;
    float sum = 0;
    public void Bai3() {
        System.out.println("nhap chuoi n");
        do {
            string = sc.nextLine();
            if (isNumeric(string) == false) {
                System.out.println("khong hop le");
            }
        } while (isNumeric(string) == false);
        int size = string.length();
        float input = Float.valueOf(string);
        int input1 = Integer.valueOf(string);
        if (size > 4) {
            if (input1 < 0 && input < 0) {
                System.out.println("khong hop le");
            }
            System.out.println("ngoai vung tinh");
        }else{
            if(input < 0 && input1 < 0){
                System.out.println("khong hop le hoac ngoai vung tinh");
            }
            if(input>0&&input1>0){
                for(float i = 0; i <= input; i++){
                   sum += (i%2 == 0) ? i : 0;
                }
                System.out.println(sum);
            }   
        }
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
