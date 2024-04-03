import java.lang.Math.pow


fun main(){
    while(true){
        println("Choose what you want to do ")
        println("1->Sum")
        println("2->Subtraction")
        println("3->Multiply")
        println("4->Division")
        println("5->Factorial")
        println("6->Finish")

        val wish= readlnOrNull()?.toIntOrNull()
        when(wish){
            1-> sum()
            2-> subtraction()
            3-> multiply()
            4-> division()
            5-> factorial()
            6-> {println("Finish")
                return
            }
            else-> println("Wrong, pls choose again:))")
        }
    }
}
fun sum(){
    while(true){
        println("Enter first number")
        val num1 = readlnOrNull()?.toDoubleOrNull()

        println("Enter second number")
        val num2 = readlnOrNull()?.toDoubleOrNull()
        if(num1 == null || num2 == null){
            println("Wrong, enter again")
            continue
        }
        val sum = num1 + num2
        println("Result: $sum")
        break
    }

}
fun subtraction(){
    while(true){
        println("Enter first  number")
        val num1 = readlnOrNull()?.toDoubleOrNull()

        println("Enter second number")
        val num2 = readlnOrNull()?.toDoubleOrNull()
        if(num1 == null || num2 == null){
            println("Wrong, enter again")
            continue
        }
        val sub = num1 - num2
        println("Result: $sub")

        break
    }
}
fun multiply(){
    while(true){
        println(" Enter first number")
        val num1 = readlnOrNull()?.toDoubleOrNull()

        println("Enter second number")
        val num2 = readlnOrNull()?.toDoubleOrNull()
        if(num1 == null || num2 == null){
            println("Wrong, enter again")
            continue

        }
        val multiply = num1 * num2
        println("Result: $multiply")
        break
    }
}
fun division(){
    while(true){
        println("Enter first number")
        val num1 = readlnOrNull()?.toDoubleOrNull()

        println("Enter second number")
        val num2 = readlnOrNull()?.toDoubleOrNull()
        if(num1 == null || num2 == null || num2==0.0){
            println("Wrong, enter again")
            continue
        }

        val remainder = num1 / num2
        println("Result: $remainder")
        break
    }
}
fun factorial(){
    var factor=1L
    while(true){
        println("Enter number")
        val num =
            readlnOrNull()?.toIntOrNull()
        if(num == null){
            println(" Wrong, pls enter again")
            continue
        }
        if(num<0){
            println(" Factorial can't be negative")
            continue
        }
        if(num==0||num==1) {
            println("Result = 1")
        }else{
            for (i in 1..num) {
                factor *= i
            }
            println("Result = $factor")
        }
        break

    }
}
