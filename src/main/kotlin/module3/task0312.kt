package module3

fun main(args: Array<String>) {

    leapYear(2000)
}
fun leapYear (n: Int)
{
    if (n % 400 == 0)
    {
        println("Високосный, количество дней в году: 366");
    } else
    {
        if (n % 100 == 0)
        {
            println("Не високосный, количество дней в году: 365");
        } else
        {
            if (n % 4 == 0)
            {
               println("Високосный, количество дней в году: 366");
            }
            else {
                println("Не високосный,количество дней в году: 365");
            }
        }

    }
}