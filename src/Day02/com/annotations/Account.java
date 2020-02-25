package Day02.com.annotations;

public class Account {

    @Length(min = 15, max = 20)
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


}