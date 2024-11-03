public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account() {
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setID(String id) {
        if (id.length() == 10)
            this.id = id;
        else
            System.out.println("ID must be 10 digits");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("Balance must be positive integer");
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        if (amount >= 0) {
            balance += amount;
            return amount;
        }
        System.out.println("Amount must be positive number");
        return amount;
    }

    public int debit(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        }
        System.out.println("You don't have enough money to debit this amount");
        return amount;
    }

    public int transferTo(Account another, int amount) {
        if (balance < amount) {
            System.out.println("You don't have enough money to transfer this amount to " + another.getName());
            return amount;
        }
        if (amount < 0) {
            System.out.println("Amount must be positive number");
            return amount;
        }
        balance -= amount;
        another.setBalance(another.getBalance() + amount);
        return amount;
    }

    public String toString() {
        return "Account ID: " + this.getID() + "\nAccount Name: " + this.getName() + "\nAccount Balance: "
                + this.getBalance();
    }
}
