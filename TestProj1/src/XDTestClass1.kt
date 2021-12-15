class XDTestClass1 {

    fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
        return a + b
    }
}

fun main(args: Array<String>){
    println("Hello World!")

    var a = XDTestClass1()
    println(a.sum(1,3))
}