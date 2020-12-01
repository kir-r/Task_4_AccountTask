import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {

    public abstract class Transaction {
        int id;
        String owner;
        double balance;
        Date date;

        public Transaction(int id, String owner, Date date) {
            this.id = id;
            this.owner = owner;
            this.date = date;
        }

        @Override
        public String toString() {
            return "Transaction: " + getClass().getSimpleName() + "\n" +
                    "id: " + id + "\n" +
                    "owner: " + owner + "\n" +
                    "balance: " + balance + "\n" +
                    "date: " + new SimpleDateFormat("dd-MM-yyyy").format(date) + "\n";
        }
    }

    public class Withdrawal extends Transaction {
        public Withdrawal(int id, String owner, Date date) {
            super(id, owner, date);
            this.balance = balance - 100;
        }
    }
    public class Payment extends Transaction {
        public Payment(int id, String owner, Date date) {
            super(id, owner, date);
            this.balance = balance - 200;
        }
    }
    public class Receipt extends Transaction {
        public Receipt(int id, String owner, Date date) {
            super(id, owner, date);
            this.balance = balance + 300;
        }
    }


    Transaction withdrawal = new Withdrawal(123, "Bill Booth", new Date());
    Transaction payment = new Payment(123, "Bill Booth", new Date());
    Transaction receipt = new Receipt(123, "Bill Booth", new Date());

}