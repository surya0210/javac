class Mobile{
    String brand;
    int price;
    String network;
    // static variable
    static String name;

    // static method
    static{
        name="Suyra";
        System.out.println("i came only once");
    }

    public Mobile(){
        brand="";
        price=200;
        network="dsdsds";
        System.out.println("i ma here");

    }
    public static void show(Mobile obj){
        System.out.println(obj.brand+obj.price+obj.network+name);
    }

}

public class Static{
    public static void main(String[] a) throws ClassNotFoundException{

        Mobile mobile1 =new Mobile();
        mobile1.brand=new StringBuffer("dfdfds").toString();
        mobile1.price=500;
        mobile1.network="Airtel";
        Mobile.name="Smart Phone"; 

        Class.forName("Mobile");
        Mobile.show(mobile1);
        // Mobile mobile2 =new Mobile();
        // mobile2.brand="Samsung";
        // mobile2.price=500;
        // mobile2.network="Airtel";
        // Mobile.name="Smart Phone"; 
        
        // Mobile mobile3 =new Mobile();
        // mobile3.brand="Nokia";
        // mobile3.price=500;
        // mobile3.network="Airtel";
        // Mobile.name="Smart Phone"; 

        // mobile1.show();
        // mobile2.show();
        // mobile3.show();
        

    }
}