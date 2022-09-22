public class Main {
    public static void main(String[] args) {

        int cost = 86;
        double shipCost = 0.02;
        double shipping = cost * shipCost;
        if (cost>= 100)
            System.out.println("You got free shipping! your total cost is " + cost);

        else
            System.out.println("Your total cost plus shipping is " + (cost + shipping));


    }
}