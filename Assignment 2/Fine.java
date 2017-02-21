
public class Fine{
    public static void main(String[] args) {
    	
    	int fees = 0;
    	System.out.println("Enter the number of days the book is late");
    	int late = IO.readInt();
    	System.out.println("Enter the cost of the book");
    	int cost = IO.readInt();
    		
    		if(cost>0){
    		
    				if(late<=0){
    					IO.reportBadInput();
    					
    				}
    				else if(late>0 && late<=7){
    					fees = 10*late;
    				}
    				else if(late>7 && late<=90){
    					fees = ((late-7)*20)+70;
    				}
    				else if(late>90)
    				{
    					fees = cost+1000;
    				}
    				IO.outputIntAnswer(fees);
    		}
    		
    		else{
    			IO.reportBadInput();
    		}
   }
}
