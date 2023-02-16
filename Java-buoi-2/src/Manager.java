import java.util.*;
import java.util.regex.*;


public class Manager {
    public static Pattern p1 = Pattern.compile("[A-Z]{2}[0-9]{3}");
    public static Pattern p2 = Pattern.compile("\\w+");

    public static List <Vehicle> vehicles = new ArrayList<Vehicle>();

    public static Scanner sc = new Scanner(System.in);

    public static int menu()
    {
        System.out.println("-------Menu-------");
        System.out.println("1. Add new vehicle");
        System.out.println("2. Display vehicles list");
        System.out.println("3. Search by ID");
        System.out.println("4. Search by price range");
        System.out.println("5. Sort with price");
        System.out.println("6. End");
        int res = sc.nextInt();
        //sc.nextLine();
        return res;
    }

    public static void enter(Vehicle object)
    {
        while(true)
        {
            System.out.println("Enter ID:");
            String ID = sc.nextLine();
            if (p1.matcher(ID).matches()) {
                object.setID(ID);
                break;
            }
            else
            {
                System.out.println("Incorrect syntax!");
            }
        }
        while (true)
        {
            System.out.println("Enter vehicle's brand:");
            String brand = sc.nextLine();
            if (p2.matcher(brand).matches())
            {
                object.setBrand(brand);
                break;
            }
            else System.out.println("Incorrect syntax!");
        }
        while (true)
        {
            System.out.println("Enter produce year:");
            int year = sc.nextInt();
            sc.nextLine();
            if (year >= 1000 && year <= 9999)
            {
                object.setYear(year);
                break;
            }
            else System.out.println("Incorrect syntax!");
        }

        System.out.println("Enter price:");
        int price = sc.nextInt();
        sc.nextLine();
        object.setPrice(price);

        System.out.println("Enter color:");
        String color = sc.nextLine();
        object.setColor(color);
    }

    public static void input()
    {
        System.out.println("Choose vehicle type (1-motorbike, 2-car, 3-truck)");
        int option = sc.nextInt();
        sc.nextLine();
        switch (option)
        {
            case 1:
            {
                MotorBike motorBike = new MotorBike();
                enter(motorBike);

                System.out.println("Enter motorbike's power ");
                int power = sc.nextInt();
                sc.nextLine();
                motorBike.setPower(power);
                vehicles.add(motorBike);
                break;
            }
            case 2:
            {
                Car car = new Car();
                enter (car);

                System.out.println("Enter car's seat numbers:");
                int seatNumbers = sc.nextInt();
                sc.nextLine();
                car.setSeatNumbers(seatNumbers);
                System.out.println("Enter car's engines:");
                String carEngine = sc.nextLine();
                car.setEngineType(carEngine);
                vehicles.add(car);
                break;
            }
            case 3:
            {
                Truck truck = new Truck();
                enter(truck);
                System.out.println("Enter truck's weight:");
                int weight = sc.nextInt();
                sc.nextLine();
                truck.setWeight(weight);
                vehicles.add(truck);
                break;
            }
        }
    }


    public static void main(String[] args) {
        while (true)
        {
            int option = menu();
            switch (option)
            {
                case 1:
                    input();
                    break;
                case 2:
                {
                    for (Vehicle vehicle : vehicles)
                        vehicle.showInfo();
                    break;
                }
                case 3:
                {
                    System.out.println("Nhap ID: ");
                    String ID = sc.nextLine();
                    for (Vehicle vehicle : vehicles)
                        if (vehicle.getID().indexOf(ID) >= 0 )
                            vehicle.showInfo();
                    break;
                }
                case 4:
                {
                    System.out.println("Price from: ");
                    int minimumPrice = sc.nextInt();
                    System.out.println("To: ");
                    int maximumPrice = sc.nextInt();
                    for (Vehicle vehicle : vehicles)
                        if (vehicle.getPrice() >= minimumPrice && vehicle.getPrice() <= maximumPrice )
                            vehicle.showInfo();
                    break;
                }
                case 5:
                {
                    Collections.sort(vehicles, new Comparator<Vehicle>() {
                        @Override
                        public int compare(Vehicle o1, Vehicle o2) {
                            if(o1.getPrice() == o2.getPrice())
                                return 0;
                            else if(o1.getPrice() < o2.getPrice()){
                                return 1;
                            }
                            return -1;
                        }
                    });
                    break;
                }
                case 6:
                {
                    System.out.println("------END------");
                    return;
                }
            }
        }

    }

}
