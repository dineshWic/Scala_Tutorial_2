//------------Q4 part 2------
val costForOwner = 500.00f
val costForAttendee = 3.00f
val normalPrice = 15.00f
val change = 5

def NumOfPeople(change: Int): Int = -1 * (change * 20 / 5) + 120
def PriceOfTicket(change : Int)= normalPrice + change
def Income(numOfPeople: Int, priceOfTicket: Int)= numOfPeople*priceOfTicket
def CostForOwner(numOfPeople: Int,)= costForOwner + ( costForAttendee * numOfPeople )
def ProfitForOwner(income: Float, cost: Float)= income - cost

def BestPrice(priceIncrease: Int, priceDecrease: Int): Float={
    val increasedPeople = NumOfPeople(priceIncrease)
    val inceasedTicketPrice = PriceOfTicket(priceIncrease)

    val increasedProfit = ProfitForOwner( Income( increasedPeople,inceasedTicketPrice) , CostForOwner(increasedPeople) ) 

    val discreasedPeople = NumOfPeople(priceDecrease)
    val discreasedTicketPrice = PriceOfTicket(priceDecrease)

    val discreasedProfit = ProfitForOwner( Income( discreasedPeople, discreasedTicketPrice ), CostForOwner(discreasedTicketPrice) )

    if( increasedProfit >= discreasedProfit) inceasedTicketPrice else discreasedTicketPrice
}
BestPrice(5,-5)
print(BestPrice(5,-5))
