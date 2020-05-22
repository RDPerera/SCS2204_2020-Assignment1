object Question1 extends App {
  def CtoF(c : Double):Double={
    var f:Double=0
    f=c*1.8 + 32
    return f
  }
  print("Convert 35C temperature into Fahrenheit : "+CtoF(35));
}