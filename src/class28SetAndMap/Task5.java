package class28SetAndMap;

public class Task5 {


        /*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
Car class has it’s own attribute as carModel and Class Pet has petType attribute.

Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
         */
    }


    /*
    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("Geico","BMW"));
        insurances.add(new Pet("Pet love","Cat"));
        insurances.add(new Health("Allianz"));

        for (Insurance i:insurances){
            i.getQuote();
            i.cancelInsurance();
        }
        System.out.println("__");

       insurances.forEach(i->i.getQuote());
       insurances.forEach(i -> i.cancelInsurance());

        System.out.println("___");

        for (int i = 0; i < insurances.size(); i++) {
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
        }
     */


        abstract class Insurance {
            String insuranceName;

            abstract void getQuote();

            abstract void cancelInsurance();

            Insurance(String insuranceName) {
                this.insuranceName = insuranceName;
            }

        }
        class Car extends Insurance {
            String carModel;

            Car(String insuranceName, String carModel) {
                super(insuranceName);
                this.carModel = carModel;
            }


            @Override
            void getQuote() {
                System.out.println(insuranceName + " quote is 2000$ a year");
            }

            @Override
            void cancelInsurance() {
                System.out.println("You can cancel your car insurance any time you want without any penalty");

            }
        }
        class Pet extends Insurance {
            String petType;

            Pet(String insuranceName, String petType) {
                super(insuranceName);
                this.petType = petType;
            }

            @Override
            public void getQuote() {
                System.out.println(petType + "'s insurance 580$ a year");
            }

            @Override
            public void cancelInsurance() {
                System.out.println("You can cancel your " + insuranceName + " anytime");

            }
        }
        class Health extends Insurance {

            Health(String insuranceName) {
                super(insuranceName);
            }

            @Override
            public void getQuote() {
                System.out.println("Your health insurance is 3400$ per year");
            }

            @Override
            public void cancelInsurance() {
                System.out.println("You can cancel your " + insuranceName + " anytime with %7 fee");

            }
        }
