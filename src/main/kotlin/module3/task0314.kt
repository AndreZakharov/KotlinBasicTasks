package module3

fun main(args: Array<String>) {

    employeeInformation("Petrov P.P.","middle")
    employeeInformation("Ivanov P.P.",25,"middle")
    employeeInformation("Ivanov S.S.","married","manager")
    employeeInformation("Ivanov S.S.",33,"single","manager")
}
fun employeeInformation(fullName:String,position:String)
{
println("Full name:"+fullName +"  "+"Age:"+"unknown"+"  "+"Position:"+position+"  "+"Marital status:"+"unknown")
}
fun employeeInformation(fullName:String,age:Int, position:String)
{
    println("Full name:"+fullName +"  "+"Age:"+age+"  "+"Position:"+position+"  "+"Marital status:"+"unknown")
}
fun employeeInformation(fullName:String,maritalStatus:String, position:String)
{
    println("Full name:"+fullName +"  "+"Age:"+"unknown"+"  "+"Position:"+position+"  "+"Marital status:"+maritalStatus)
}
fun employeeInformation(fullName:String,age: Int,maritalStatus:String, position:String)
{
    println("Full name:"+fullName +"  "+"Age:"+age+"  "+"Position:"+position+"  "+"Marital status:"+maritalStatus)
}