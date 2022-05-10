public class accessMethod {
    public void suv() {
        System.out.println("my love for bmw x6 is unmatched");
    }

    public void myBmw(int max) {
        System.out.println("Max speed is: " + max);
    }

        public static void main(String[] args) {

            accessMethod car = new accessMethod();
            car.myBmw(200);
            car.suv();
        }
    }

