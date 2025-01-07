fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}
This code snippet uses removeIf() to remove even numbers from a list. However, the code will throw ConcurrentModificationException if the list is accessed while being modified in a loop or any other concurrent operations.