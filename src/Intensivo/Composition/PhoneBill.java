package Intensivo.Composition;


public class PhoneBill {
    private Call[] calls;
    private double balance;
    private double pricePerSecond;
    private int nextFreeCall;

    public PhoneBill(double balance, double pricePerSecond) {
        this.calls = new Call[100];
        this.balance = balance;
        this.pricePerSecond = pricePerSecond;
        this.nextFreeCall = 0; // Initialize the index for the next free call
    }

    public Call[] getCalls() {
        return calls;
    }

    public double getBalance() {
        return balance;
    }

    public double getPricePerSecond() {
        return pricePerSecond;
    }

    public void setPricePerSecond(double pricePerSecond) {
        this.pricePerSecond = pricePerSecond;
    }

    public void registerCall(String phoneReference, double seconds) {
        if (nextFreeCall != -1) {
            this.calls[nextFreeCall] = new Call(phoneReference, seconds);
            nextFreeCall++; // Move to the next available slot
        }
    }

    public void chargeBalance(double amount) {
        if (amount < 100000) { // Make sure the amount is reasonable
            balance += amount;
        }
    }

    private int nextFreeCall() {
        for (int i = 0; i < calls.length; i++) {
            if (this.calls[i] == null) return i;
        }
        return -1; // Return -1 if no free slot is found
    }
}
