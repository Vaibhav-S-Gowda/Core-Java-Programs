class Car{
    String name;
    int cost;

    void modifyCar(Car z)
    {
        z.name = "Audi Q8";
        z.cost = 8500000;
    }
}

class referenceTypeAssign
{
    public static void main(String...args)
    {
        Car x = new Car(); // Create a new Car object and assign it to reference variable 'x'
        // Initialize fields of 'x'
        x.name = "Mercedes Benz";
        x.cost = 15000000;

        System.out.println(x.name);
        System.out.println(x.cost);

        Car y; // Declare another reference variable 'y'
        y = x; // Assign 'y' to refer to the same object as 'x'

        System.out.println(y.name);
        System.out.println(y.cost);

        // Modify the object using reference 'y'
        y.name = "BMW M4";
        y.cost = 12700000;

        // Since both 'x' and 'y' point to the SAME object,
        // the changes made via 'y' are reflected when accessing via 'x'
        System.out.println(x.name);
        System.out.println(x.cost);

        x.modifyCar(x);
        
        System.out.println(x.name);
        System.out.println(x.cost);
    }
}