//演示对象表达式

open class A(x: Int) {
    public open val y: Int = x
}

interface B {
    fun foo2(){}
}

fun main(args: Array<String>){

    val ab: A = object : A(1), B {
        override val y = 15

    }

    println(ab.y)

}



