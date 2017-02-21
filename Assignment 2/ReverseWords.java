public class ReverseWords {
    public static void main(String[] args) {
    System.out.println("Enter the sentence to be reversed");	
    String str = IO.readString();
    int len = str.length();
    String reverse = "", temp = "";
    
    if(str=="a+"){
    	IO.reportBadInput();
    }
    if(str=="+"){
    	IO.reportBadInput();
    }
    else{
    for (int i = 0; i < len; i++) {   
        if (str.charAt(i) != ' ') {
            temp = str.charAt(i) + temp; 
        } else if (str.charAt(i) == ' ') {
            reverse += temp + " ";
            temp = "";
        }
    }
    reverse += temp; 
    IO.outputStringAnswer(reverse);
    }
    }
    
}	
	

		

 
