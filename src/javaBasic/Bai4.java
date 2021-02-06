package javaBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 {
	    Scanner sc = new Scanner(System.in);

	    public void Bai4() {
	        String string;
	        System.out.println("nhap chuoi so");
	        string = sc.nextLine();
	        try{
	            ArrayList<Float> arrayList = array(string);
	        Boolean b = check(arrayList);
	        if (b == true) {
	            for (int i = 0; i < arrayList.size(); i++) {
	                System.out.println((double) Math.round(arrayList.get(i) * 100) / 100);
	            }
	        } else {
	            System.out.println("khong hop le");
	        }
	        }catch(Exception e){
	            
	        }
	    }

	    public Boolean check(ArrayList<Float> array) {

	        Boolean b = true;
	        for (int i = 0; i < array.size(); i++) {
	            int X = (int) (array.get(i) / 1.0);
	            X = (int) (X - array.get(i));

	            if (X == 0) {
	                b = true;
	            } else {
	                b = false;
	            }
	        }
	        return b;
	    }

	    public ArrayList<Float> array(String string) {
	        ArrayList<Float> list = new ArrayList<>();
	        string = string.trim();
	        String[] arr = string.split(" ");
	        for (int i = 0; i < arr.length; i++) {
	            try {
	                list.add(Float.parseFloat(arr[i]));
	            } catch (Exception e) {
	                System.out.println("khong hop le");
	                return null;
	            }
	        }
	        return list;
	    }	
}
