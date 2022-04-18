import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    
    public int getStreakGoal(){
        int sum=0;
        for (int i=1; i<=10; i++){
            sum+=i;
        }
        return sum;
        
    }

    public int getStreakGoal(int numWeeks){
        int sum=0;
        for (int i=1; i<=numWeeks; i++){
            sum+=i;
        }
        return sum;
        
    }

    public double getOrderTotal(double[] prices){
        double suma=0;
        for (int i=0; i<prices.length; i++){
            suma+=prices[i];
        }
        return suma;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0; i<menuItems.size();i++){
            System.out.println(i+" " + menuItems.get(i));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){

        DecimalFormat df = new DecimalFormat(" -- $###,###");

        if (menuItems.size()==prices.size()){
            for (int index = 0; index < menuItems.size(); index++) {
                System.out.println(index+" "+menuItems.get(index)+df.format(prices.get(index)));
            }

        }else{
            return  false;
        }


        return true;
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();
        System.out.println("¡Hola, "+userName+"!");
        System.out.println("Hay "+customers.size()+" personas frente a ti");
        customers.add(userName);
        System.out.println(customers);

    }

    public void addCustomers(ArrayList<String> customers){
        System.out.println("Por favor, ingresa un nombre o \"q\" para salir");
        String userName = System.console().readLine();

        while (!userName.equals("q")) {
            customers.add(userName);
            userName = System.console().readLine();            
        }

        

        System.out.println(customers);


    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        DecimalFormat df = new DecimalFormat(" - $###,###");
        for (int i = 1; i <=maxQuantity; i++) {
            System.out.println(i+(df.format((i*price)-((i-1)*400))));            
        }

    }
    
}
