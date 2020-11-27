public class AnonInner {
    public static void main(String[] args) {
        Dog d1 = new Dog("fido");
        d1.speak();

        Dog d2 = new Dog("rex") {
            public void speak() {
                System.out.println(getName() + " says meow");
            }
        };
        d2.speak();
    }
}
