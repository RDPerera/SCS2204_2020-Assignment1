object Question2 extends App {
  def volumeSphere(r : Double):Double=4/3*math.Pi*(scala.math.pow(r,3))
  print("Volume of a sphere with radius 5 : "+volumeSphere(5));
}