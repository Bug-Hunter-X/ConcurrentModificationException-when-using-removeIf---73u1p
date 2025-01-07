fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list)
}
This version iterates through the list using an iterator and calls `iterator.remove()` to safely remove elements, preventing the exception.