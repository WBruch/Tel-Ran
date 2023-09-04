package practice2.classwork.enums.task2;

enum Color {
    RED {
        @Override
        public void printName() {
            System.out.println("RED Color");
        }
    }, GREEN {
        @Override
        public void printName() {
            System.out.println("GREEN Color");
        }
    }, BLUE {
        @Override
        public void printName() {
            System.out.println("BLUE Color");
        }
    };

    private Color() {
        System.out.println("Constructor called for: " + name());
    }
    // not correct code for demonstrate abstract method!
    // 1. not good practice to print enum name with toString because toString will be override
    // 2. constructor not abstract method!

    // this is abstract method
    public abstract void printName();
}
