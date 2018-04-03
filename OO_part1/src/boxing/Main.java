package boxing;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("Tim");
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		
		for(int i=0; i< 10; i++){
			intArrayList.add(Integer.valueOf(i));
		}
		
		for(int i=0; i< 10; i++){
			System.out.println(i+ " --> "+ intArrayList.get(i).intValue());
		}
		
		ArrayList<Double> dbArrayList = new ArrayList<Double>();
		
		for(double i=0.0; i<= 10; i+=0.5){
			dbArrayList.add(Double.valueOf(i));
		}
		
		for(int i=0; i< dbArrayList.size(); i++){
			System.out.println(i+ " --> "+ dbArrayList.get(i).doubleValue());
		}
	}

}
