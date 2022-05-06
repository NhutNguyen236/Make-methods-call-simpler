package refactor_35;

public class Refactor_35 {

    public static void main(String[] args) {
        Account account = new Account(3);
        System.out.println(account.getCardType());
        System.out.println(account.getCardTypeC());
    }

    public static class Account {

        private int type;
        final String[] types = {"regular", "gold", "platinum"};

        public Account(int type) {
            this.type = type;
        }

        // Instead of using exception...
        public String getCardType() {
            try {
                return types[type];
            } catch (Exception e) {
                return null;
            }
        }

        //...use conditional statement
        public String getCardTypeC() {
            if (type > types.length - 1) {
                System.out.println("Card not exist!");
                return null;
            }

            return types[type];
        }
    }
}
