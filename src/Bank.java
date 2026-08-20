public class Bank {
    private double account;

    public Bank(){
        account=1000;
    }

    public double getAccount(){
        return account;
    }

    public void printAccount(){
        System.out.println("Usted tiene "+getAccount()+" pesos guardados");
    }

    public void addMoney(double money){
        account+=money;
    }

    public void decreaseMoney(double money){
        if(money<=account){
            addMoney(money*-1);
        }else{
            System.out.println("Error, no tiene suficiente dinero");
        }
    }
}
