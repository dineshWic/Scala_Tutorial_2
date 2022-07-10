//------------Q4 part 1------

val payForNormelHour = 250.00f
val payForOTHour = 85.00f
val normalWorkingHourPerWeek = 40
val OTWorkingHourPerWeek = 30
val taxRate = 0.12f

def TotalSalary(normalWorkingHourPerWeek:Int, OTWorkingHourPerWeek:Int)= (normalWorkingHourPerWeek*payForNormelHour) + (OTWorkingHourPerWeek*payForOTHour)
def Tax(totalSalary:Float)=totalSalary * taxRate
def TakeHomeSalary(totalalSalary:Float,tax:Float)=totalalSalary-tax
def isValidTime(workingHours:Int,otHours:Int): Boolean = workingHours>= normalWorkingHourPerWeek && otHours>= normalWorkingHourPerWeek

def calculateTakeHomeSalary(workingHours:Int,otHours:Int):Float = if( isValidTime(workingHours,otHours) ){
    val total = TotalSalary(workingHours,otHours)
    val tax = Tax(total)
    TakeHomeSalary(total,tax)
    }
    else{
        print("Invalid Working Hours or OT Hours\n")
        0
    }
print(calculateTakeHomeSalary(45,35))
print(calculateTakeHomeSalary(50,40))
print(calculateTakeHomeSalary(55,55))



