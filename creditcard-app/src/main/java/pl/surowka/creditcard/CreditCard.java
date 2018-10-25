package pl.surowka.creditcard;

class CreditCard{
    private double balance; 
    private double cardLimit;
    
    private boolean status;
    
    public void assignLimit(double money){
    this.balance=money;
    this.cardLimit=money;
        
    }
    
    public double getLimit(){
        
        return 2000;
    }
    

    public void block(){
        this.status = true;
        
        
    }
    
    public boolean isBlocked(){
        return this.status;
        
    }

    public void withdraw(double money){
        this.balance-=money;
    }
    
    public double getBalance(){
        return this.balance;

    }
    
}