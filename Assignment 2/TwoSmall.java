public class TwoSmall{

    public static void main(String [] args){
    	int min;
    	int secondMin;
        int sentinel = -1;
        
        System.out.println("Enter atleast two numbers");	
        int input = IO.readInt();
        
        min = input;
        secondMin = input;

        do{

        		if(input < min){
        			secondMin = min; 
        			min = input;
        		}

        		else if (input < secondMin) {
        			secondMin = input; 
        		}
        		input = IO.readInt();
        	} while(input!=sentinel);

        	IO.outputIntAnswer(min);
        	IO.outputIntAnswer(secondMin);
    }

}
