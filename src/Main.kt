import java.io.File
import java.io.InputStream

fun main() {
    // 1 Задание
    val file1 = File("D://TEST1")
    file1.writeText("test text")
    println(file1.readText())
    // 2 Задание
    val file2 = File("D://TEST2")
    val number = 10
    for (i in 0..number) {
        if (i > 0 && i % 2 == 0){
            file2.appendText("\n $i")
        }
    }
    println(file2.readText())
    //3 Задание
    val file3 = File("D://TEST3")
    file3.writeText("1 2 3 4 5 6 7 8 9 10")
    val numbers: InputStream = file3.inputStream()
    val numbersList = mutableListOf<String>()
    numbers.bufferedReader().forEachLine { numbersList.add(it) }
    val numbersElements = numbersList[0]
    println(numbersElements)
    println("Первый элемент: ${numbersElements[0]}")
    println("Второй элемент: ${numbersElements[1]}")
    println("Предпоследний элемент: ${numbersElements[numbersElements.length-2]}")
    println("Последний элемент: ${numbersElements[numbersElements.length-1]}")



}