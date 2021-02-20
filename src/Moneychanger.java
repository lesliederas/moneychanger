/*
  amount of money = 74.87
  convert amount into pennies
  show amount in pennies 
  convert amount in 20 dollars to pennies
  show new amount 
   convert amount in 10 dollars to pennies
  show new amount 
   convert amount in 5 dollars to pennies
  show new amount 
   convert amount in 1 dollars to pennies
  show new amount 
  convert amount in quarters to pennies 
  show new amount 
  convert amount in dimes to pennies 
  show new amount 
  convert amount in nickels to pennies 
  show new amount 
  convert amount to pennies
  show amount in numbers of twenty dollars bills, ten dollars bills , five dollar bills , one dollars bills, quarters, dimes, nickels, pennies 
 */
import java.util.Scanner;
public class Moneychanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter amount");
double amount = input.nextDouble();
int newamount = (int)(amount * 100);

int numberoftwentydollars = newamount / 2000;
newamount = newamount % 2000;

int numberoftendollars = newamount / 1000;
newamount = newamount % 1000;

int numberoffivedollars = newamount / 500;
newamount = newamount % 500;


int numberofonedollars = newamount / 100;
newamount = newamount % 100;

int numberofquarters = newamount / 25;
newamount = newamount % 25;

int numberofdimes = newamount / 10;
newamount = newamount % 10;

int numberofnickles = newamount / 5;
newamount = newamount % 5;

int numberofpennies = newamount;

System.out.println("your amonunt" + amount+ "in\n"+"\t"+ numberoftwentydollars +"twentydollars\n" +"\t"+ numberoftendollars +"tendollars\n"+"\t"+ numberoffivedollars+"fivedollars\n "+ "\t"+numberofonedollars +"dollars\n" + "\t" + numberofquarters +"quaters\n" +"\t" + numberofdimes + "dimes\n"+ "\t"+ numberofnickles + "nickles\n"+"\t"+ numberofpennies +"pennies\n"+"\t");








	}

}
