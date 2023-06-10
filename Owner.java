public class Owner {
  private String name;

  public Owner(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }

  public static void main(String[] args) {
      Cat cat = new Cat();
      cat.setName("Барсик");
      cat.setAge(3);
      cat.setOwnerName("Иван");

      cat.greet();
  }
}
