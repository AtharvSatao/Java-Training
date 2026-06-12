package DAY10.AbstractClasses.Example1;

abstract class Account {
    String name;
    double balance;

    Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    final void deposit(double amt){
        balance+= amt;
    } 
    abstract void withdraw(double amt);

    @Override
    public String toString(){
        return "Name is: "+ name +" Balance is " +balance;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
}
