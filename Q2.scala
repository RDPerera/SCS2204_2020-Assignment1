object Question2 extends App {
  def volumeSphere(r : Double):Double={
    var v:Double=0
    v=4.0/3.0*math.Pi*(scala.math.pow(r,3))
    return v
  }
  print("Volume of a sphere with radius 5 : "+volumeSphere(5));
}