// Write your code here. Do not import any libraries
val fileName = "MyFile.txt"
val text = readLine()!!
val myFile = File(fileName)
repeat(2) {
    myFile.appendText(text)
}