public class Dog {
    public int age;
    public int nPaws;
    public int x, y;

    private String id;
    public String name;
    public String race;
    public String owner;
    public String color;
    public String size;

    public Dog() {
        this.id = genID();
        this.name = "Undefined";
        this.age = -1;
        this.nPaws = 4;
        this.race = "Undefined";
        this.owner = "Undefined";
        this.size = "Undefined";
        this.color = "Undefined";
    }

    public Dog(String name, int age, int nPaws, String race, String owner, String size, String color) {
        this.id = genID();
        this.name = name;
        this.age = age;
        this.nPaws = nPaws;
        this.race = race;
        this.owner = owner;
        this.size = size;
        this.color = color;
    }

    private String genID() {
        final String allowedChars = "QWERTYUIOPASDFGHJKLÑZXCVBNM1234567890";
        String id = "";

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * allowedChars.length());
            id += allowedChars.charAt(rand);
        }
        return id;
    }

    public String getID() {
        return this.id;
    }

    public String bark() {
        return "Woouf Woouf";
    }

    public void walkOneStep() {
        this.x++;
    }

    public void walkNSteps(int steps) {
        this.x += steps;
    }

    public void jump() {
        y += 10;
        y -= 10;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void happyBirthday() {
        this.age++;
    }
}
