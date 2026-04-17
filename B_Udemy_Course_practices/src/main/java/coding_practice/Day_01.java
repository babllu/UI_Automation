package coding_practice;

public class Day_01 {

	public static void main(String[] args) {
	    int [] numbers = {1,3,54,67,43};
	    
        for (int j=numbers.length-1; j>=0; --j){
            
            System.out.println(numbers[j]);
        }
        
        System.out.println(numbers[0]+","+numbers[4]);
            
            System.out.println(numbers.length);
    }

}
