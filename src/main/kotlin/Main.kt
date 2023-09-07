data class Book (val name:String, val author:String,val year:Int,val price:Double,val stock:Int)

var books = mutableListOf<Book>()

fun main(args: Array<String>) {
    var choice = 0
    while (choice != 5) {
        printMenu()
        choice = readln().toInt()
        when (choice) {
            1 -> addBook()
            2 -> {
                print("Enter book name to delete: ")
                val name = readln()
                deleteBook(name)
            }
            3 -> listBooks()
            4 -> println("Total books: ${books.size}")
            5 -> println("Exiting...")
            else -> println("Invalid choice")
        }
        println()
    }
}

//  print menu
fun printMenu() {
    println("1. Add book")
    println("2. Delete book")
    println("3. List books")
    println("4. Total books")
    println("5. Exit")
    print("Enter choice: ")
}

//  take input and add book
fun addBook() {
    print("Enter book name: ")
    val name = readln()
    print("Enter author name: ")
    val author = readln()
    print("Enter year: ")
    val year = readln().toInt()
    print("Enter price: ")
    val price = readln().toDouble()
    print("Enter stock: ")
    val stock = readln().toInt()
    books.add(Book(name,author,year,price,stock))
//    println("Book added $books")
}

//  delete book by name
fun deleteBook(name: String) {
    books.removeIf { it.name == name }
}

//list books
fun listBooks() {
    println("\nBooks:")
    books.forEach { println("-\tname: ${it.name}, author: ${it.author}, year: ${it.year}, price: ${it.price}, stock: ${it.stock}") }
}