
import java.util.*;





public class Farm_management {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" please enter type of your animal: 1-cow 2-sheap 3- donkey");
        String animalType = input.next();
        switch (animalType ){
            case "cow":
                System.out.println(" please enter weight, age, color ");
                cow_details cow = new cow_details (  input.nextInt(),  input.nextInt(), input.next() );
                break;
            case "sheap":
                System.out.println (" please enter  weight, age, int weightwool ");
                sheap_details sheap = new sheap_details(  input.nextInt(), input.nextInt(), input.nextInt());
                 break;
            case " donkey":
                System.out.println (" please enter  weight ,age, color,height");
                donkey_details donkey = new donkey_details (  input.nextInt(),  input.nextInt(),input.next(), input.nextInt() );
                break;
            default:
                System.out.println (" your animal is not in this list");
        }
    }

}
   class cow_details{

           int weight;
           int age;
           String color;
           cow_details ( int weight, int age, String color ) {
               this.weight=weight;
               this.age=age;
               this.color=color;
           }
   }
class sheap_details{
               int weight;
               int age;
               int weightwool;
               sheap_details(int weight ,int age, int weightwool){
                   this. weight = weight;
                   this.age= age;
                   this. weightwool= weightwool;

               }

       }
class donkey_details{
       int weight;
       int age;
       String color;
       int height;
       donkey_details(int weight, int age, String color,int height){
           this.weight= weight;
           this. age=age;
           this.color = color;
           this.height=height;
       }


    }



