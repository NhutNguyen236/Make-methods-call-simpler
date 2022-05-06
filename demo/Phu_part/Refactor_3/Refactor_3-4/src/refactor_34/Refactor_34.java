package refactor_34;

public class Refactor_34 {

    public static void main(String[] args) {
        Account account = new Account(1000);
        System.out.println(account.withdraw(500));
        try {
            account.withdrawE(500);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

    }

    public static class Account {

        private int _balance;
        final int w_threshold = 1000;

        public Account(int balance) {
            _balance = balance;
        }

        // method with return error code
        public int withdraw(int amount) {
            if (amount > _balance) {
                return -1;
            } else if (amount > w_threshold) {
                return -1;
            } else {
                _balance = _balance - amount;
                int newBalance = _balance;
                return newBalance;
            }
        }

        //method with exception 
        public int withdrawE(int amount) {
            if (amount > _balance) {
                throw new IllegalArgumentException("Amount too large");
            } else if (amount > w_threshold) {
                throw new IllegalArgumentException("Exceed withdraw threshold");
            } else {
                _balance = _balance - amount;
                int newBalance = _balance;
                return newBalance;
            }
        }
    }

}
