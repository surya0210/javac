
class Variables
{
    public static void main(String a[]){
        int x=5;
        byte y = (byte) x;
        y++;
        System.out.println(++y); //3
        System.out.println(y++); //3
        System.out.println(y); //3

        float f =257.5f;
        byte z =(byte) f;


        if (x>20){
        System.out.println("mghnh");}
        else
        System.out.println("gfdsfg");

        int result = x%2==0?5:x%3==0?2:1;
System.out.println(result);
    }
}