import java.util.ArrayList;
public class BankAccountArrayBeraksi {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount(1001));
        accounts.add(new BankAccount(1015));
        accounts.add(new BankAccount(1729));
        accounts.add(1, new BankAccount(1008));
        accounts.remove(0);
        System.out.println("Size: " + accounts.size());
        System.out.println("Expected: 3");
        BankAccount first = accounts.get(0);
        System.out.println("First account number: " + first.getAccountNumber());
        System.out.println("Expected: 1008");
        BankAccount last = accounts.get(accounts.size() - 1);
        System.out.println("Last account number: " + last.getAccountNumber());
        System.out.println("Expected: 1729");

        System.out.println("saldo setelah deposit");
        accounts.get(0).deposit(3000);
        accounts.get(1).deposit(2000);
        accounts.get(2).deposit(5000);
        for (int i = 0; i < accounts.size(); i++) {
            first= accounts.get(i);
            System.out.println("account number "+first.getAccountNumber());
            System.out.println("account balance "+first.getBalance());
        }
        System.out.println();
        accounts.get(2).withdraw(3000);
        accounts.get(1).withdraw(2000);
        System.out.println("saldo setelah withdraw");
        for (int i = 0; i < accounts.size(); i++) {
            first= accounts.get(i);
            System.out.println("account number "+first.getAccountNumber());
            System.out.println("account balance "+first.getBalance());
    }
  }
}
