import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class Clerk {
	public static void main(String[] args) throws InvalidAmountException, InSufficientFundException {
		try{
			Bank acc1 = new UnionBank();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String option = "";
			do{
				try{
				System.out.println("Choose one option");
				System.out.println("1.Deposite");
				System.out.println("2.Withdraw");
				System.out.println("3.Balance Enquiry");
				option = br.readLine();
				switch(option){
					case "1":
					{
						System.out.print("Enter deposite amount ::");
						String s = br.readLine();
						Double amt = Double.parseDouble(s);
						acc1.deposite(amt);
						acc1.balanceEnquiry();
						break;
					}
					case "2":
					{
						System.out.print("Enter withdraw amount ::");
						String s = br.readLine();
						Double amt = Double.parseDouble(s);
						double withDrawAmt = acc1.withdraw(amt);
						System.out.println("Withdraw amount ::" + withDrawAmt);
						acc1.balanceEnquiry();
						break;
					}
					case "3":
					{
						acc1.balanceEnquiry();
						break;
					}
					default:
					
						System.out.println("Invalid Option");
					}
				}
				//inner try close
				catch(InvalidAmountException iae){
					System.out.println(iae.getMessage());
				}
				catch(InSufficientFundException isf){
					System.out.println(isf.getMessage());
				}
				catch(NumberFormatException nfe){
					System.out.println("Please enter ONLY number");
				}
				System.out.println("\nDo you want to continue (yes/no)::");
				option = br.readLine();
			}while(option.equals("yes"));
		}//outer try close
		catch(IOException e){
			e.printStackTrace();
		}
	}
}