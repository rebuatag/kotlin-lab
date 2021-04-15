import java.util.*
//Problem #1: Reverse a String
fun main() {
    print("Enter string: ")
    val strInput = readLine()                       //reads an array of characters entered by user
    var reversedWord: String = ""
    var lastIndex = strInput!!.lastIndex            //!! would return a non-null value else if strInput is null
                                                    //would return a Null Pointer Exception
    println("You Entered: $strInput")               //prints entered string by user

    while (lastIndex >= 0) {
        reversedWord += strInput[lastIndex]         //reverses the word entered
        lastIndex--
    }
    println("$reversedWord")
}

//------------------------------------------------------------
//Problem #2: Even Natural Numbers
/*fun main() {
    val read = Scanner(System.`in`)
    print("Enter Number of Terms: ")
    val numb = read.nextInt()
    var even = 0
    var sum = 0

    for(i in 1..numb) {
        even = i*2
        sum += i*2
        print("$even ")
    }
    println("\nThe sum of even natural number up to $numb terms is: $sum")
}*/

//----------------------------------------------------------
//Problem #3: Anagram
/*fun main() {
    print("Enter string1: ")
    val str1Input = readLine()
    print("Enter string2: ")
    val str2Input = readLine()

    val isAnagram: Boolean = Arrays.equals(
        str1Input!!.chars()!!.sorted()!!.toArray(),
        str2Input!!.chars()!!.sorted()!!.toArray())
    if(isAnagram)
        println("$str1Input and $str2Input are Anagram!")
    else
        println("$str1Input and $str2Input are not Anagram!")
}*/
