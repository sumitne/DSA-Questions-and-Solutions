import java.util.Scanner;

public class MoneyChange {
    private static int getChange(int m) {
       	int coins = 0;
	int sum = 0;
	
	while(sum<m){
	if(m-sum>=10){
		sum+=10;
		coins++;
	   }
	else if(m-sum<10 && m-sum>=5){
	    sum+=5;
	    coins++;
		
	}	       
	else{
	 	sum+=1;
		coins++;
	        }
 	}
        return coins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

