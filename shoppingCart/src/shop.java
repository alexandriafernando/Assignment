public class shop {
    String name;
    int price, cost;

    public shop (String name, int price, int cost)
    {
        this.name = name;
        this.price = price;
        this.cost = cost;
    }

    public String getName()
    {
        return name;
    }

    public int getAmount()
    {
        return price;
    }

    public int getCost()
    {
        return cost;
    }

}
