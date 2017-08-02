package pack;

import java.util.ArrayList;

public class EnhancedForTest {
	public static void main(String[] args) {
		int[] arr = {5,4,7,1,9,8,0,3,2,6};	//배열
		
		for(int a:arr){
			System.out.print(arr[a] + " ");
		}
		
		System.out.println();
		String[] names = {"tom", "james", "oscar"};
		
		for(String s: names){
			System.out.println(s);
		}
		
		System.out.println();
		int[][] arr2 = {{3,4,5}, {7,8,9}, {1,2,3}};
		for(int[] a:arr2){
			//System.out.println(a);
			for(int b:a){
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("python");
		list.add("oracle");
		for(String s:list){
			System.out.print(s + " ");
		}
		
		System.out.println();
		System.out.println(Flower.ROSE);
		System.out.println();
		Flower flo = Flower.LILY;
		for(Flower f:Flower.values()){
			System.out.println(f);
		}
	}

}
