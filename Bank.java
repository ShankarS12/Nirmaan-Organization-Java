public class Bank {
    private int accNumber ;
    private String accName;
    private double accBalance;
    private int accPIN;

    public Bank() {
    }

    public Bank(int accNumber, String accName, double accBalance, int accPIN) {
        this.accNumber = accNumber;
        this.accName = accName;
        this.accBalance = accBalance;
        this.accPIN = accPIN;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public int getAccPIN() {
        return accPIN;
    }

    public void setAccPIN(int accPIN) {
        this.accPIN = accPIN;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accNumber=" + accNumber +
                ", accName='" + accName + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }
}
