import java.util.Scanner;

class ATM{
    private double balance=10000;

    public void checkBalance(){
        System.out.println("Current balance : Rs="+balance);

    }
    public void deposit(double amount){
        if(amount>0){
         balance +=amount;
        System.out.println("Rs:"+amount+" Deposited successfully.");
        }
        else{
            System.out.println("Please enter the valid amount");
        }
        
    }

    public void withDraw(double amount){
        if(balance >=amount){
             balance -=amount;
        System.out.println("Rs:"+amount+" withdraw successfully.");
        }else{
            System.out.println("Insufficient balance.");
        }
       
    }

}


public class ATM_SystemProject{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         ATM atm=new ATM();

         int choice;
         do{
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice=sc.nextInt();

            switch(choice){
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double demositAmount=sc.nextDouble();
                    atm.deposit(demositAmount);
                    break;

                case 3:
                    System.out.println("Enter the withdraw amount: ");
                    double withDrawAmount=sc.nextDouble();
                    atm.withDraw(withDrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Innvelid choice!");

            }
         }while(choice !=4);
         sc.close();
    }

}
