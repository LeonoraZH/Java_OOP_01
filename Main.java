public class Main {
  public static void main(String[] args) {
      Rectangle rectangle1 = new Rectangle();
      rectangle1.setWidth(5);
      rectangle1.setHeight(3);
      double area1 = rectangle1.calculateArea();
      double perimeter1 = rectangle1.calculatePerimeter();
      System.out.println("Прямоугольник 1: ширина = " + rectangle1.getWidth() + ", высота = " + rectangle1.getHeight());
      System.out.println("Площадь = " + area1);
      System.out.println("Периметр = " + perimeter1);

      Rectangle rectangle2 = new Rectangle(7, 4); 
      double area2 = rectangle2.calculateArea();
      double perimeter2 = rectangle2.calculatePerimeter();
      System.out.println("Прямоугольник 2: ширина = " + rectangle2.getWidth() + ", высота = " + rectangle2.getHeight());
      System.out.println("Площадь = " + area2);
      System.out.println("Периметр = " + perimeter2);
  }
}

