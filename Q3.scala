object Question3 extends App {
  def wholesaleCost(n : Double) : Double = {
    val coverPrice : Double =24.95
    val discount : Double = 0.4
    val shipCostFirst50 : Double = 3
    val shipCostAdditional : Double = 0.75
    var totalBookCost : Double =0
    var totalCost : Double =0
     totalBookCost = n * coverPrice * discount
    if (n <= 50){
      totalCost = n * shipCostFirst50 + totalBookCost
    }
    else {
      totalCost = (n - 50) * shipCostAdditional + shipCostFirst50 * 50 + totalBookCost
    }
    totalCost=(totalCost*100).round/100.toDouble// round to two decimal points
    return totalCost
  }
  print("Total wholesale cost for 60 copies : Rs."+wholesaleCost(60));
}