public class Main {
        public static void main(String[] args) {

                Account acc1 = new Account();
                Account acc2 = new Account("1023456789", "Salim", 1000);
                System.out.println(acc1.toString());

                System.out.println("-------------------------------------------------------------------");

                System.out.println(acc2.toString());

                System.out.println("-------------------------------------------------------------------");

                acc1.setID("1234567890");
                acc1.setName("Nawaf");
                acc1.setBalance(500);
                System.out.println(acc1.toString());

                System.out.println("-------------------------------------------------------------------");

                System.out.println("Credit via Wallet" +
                                "\nAmount: " + acc2.credit(250));

                System.out.println("-------------------------------------------------------------------");

                System.out.println(acc2.toString());

                System.out.println("-------------------------------------------------------------------");

                System.out.println("Debit via Wallet" +
                                "\nFrom: " + acc2.getName() +
                                "\nAmount: " + acc2.transferTo(acc1, 750) +
                                "\nTo: " + acc1.getName());

                System.out.println("-------------------------------------------------------------------");

                System.out.println(acc2.toString());
                System.out.println("-------------------------------------------------------------------");
                System.out.println(acc1.toString());

                System.out.println("-------------------------------------------------------------------");

                System.out.println("Debit via Wallet" +
                                "\nFrom: " + acc1.getName() +
                                "\nAmount: " + acc1.debit(900));

                System.out.println(acc1.toString());

                System.out.println("-------------------------------------------------------------------");

                System.out.println("Trying some exceptions:");
                System.out.println(acc1.debit(10000));
                System.out.println(acc1.credit(-100));
                System.out.println(acc1.transferTo(acc2, 20000));
                System.out.println(acc2.transferTo(acc1, -100));
                acc2.setBalance(-10);
                System.out.println(acc2.toString());
                System.out.println(acc1.toString());
        }
}
