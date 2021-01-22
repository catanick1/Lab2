class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
  
  int totalMMCount = 55 * 11;
  double countRed = totalMMCount * .13;
  double countBlue = totalMMCount * .24;
  double countBrown = totalMMCount * .13;
  double countYellow = totalMMCount * .14;
  double countOrange = totalMMCount * .20;
  double countGreen = totalMMCount * .16;
  double sumColors = countRed + countBlue + countBrown + countYellow + countOrange + countGreen;

System.out.println(totalMMCount);

System.out.println("Red:" + countRed);
System.out.println("Blue:" + countBlue);
System.out.println("Brown:" + countBrown);
System.out.println("Yellow:" + countYellow);
System.out.println("Orange:" + countOrange);
System.out.println("Green:" + countGreen);

System.out.println("Sum:" + sumColors);


  if(countBlue > countBrown && countRed > countOrange)
  System.out.println("Blue over Brown and Red over Orange");


  if(countBrown <= countGreen)
  System.out.println("Brown is less than or equal to Green");

  if(sumColors == totalMMCount)
  System.out.println("Numbers Match");
}
}

