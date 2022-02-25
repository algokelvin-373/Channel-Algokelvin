import java.util.*

//TODO: Chapter 007: Array Data

//TODO: Example DataModel
data class DataModel(val name: String)

fun main() {
    //TODO: Using ArrayList<T> ( always use ) -> In JAVA, you can use in Kotlin
    //Todo: T is type data ( String, Int, Double, Model Data )

    //TODO: 1. ArrayList<String>()
    val arrayListString = ArrayList<String>()
    arrayListString.add("Kotlin")
    arrayListString.add("Java")
    arrayListString.add("Swift")

    //TODO: 2. ArrayList<Int>()
    val arrayListInt = ArrayList<Int>()
    arrayListInt.add(1)
    arrayListInt.add(2)
    arrayListInt.add(3)

    //TODO: 3. ArrayList<DataModel>()
    val arrayListDataModel = ArrayList<DataModel>()
    arrayListDataModel.add(DataModel("Kelvin"))
    arrayListDataModel.add(DataModel("Herwanda"))
    arrayListDataModel.add(DataModel("Tandrio"))

    //TODO: print ArrayList
    println("ArrayList: ")
    println("ArrayList String     : $arrayListString")
    println("ArrayList Int        : $arrayListInt")
    println("ArrayList Data Model : $arrayListDataModel")

    //TODO: using arrayListOf ( in Kotlin )

    //TODO: 1. arrayListOf<String>
    val arrayListOfString = arrayListOf<String>()
    arrayListOfString.add("Kotlin")
    arrayListOfString.add("Java")
    arrayListOfString.add("Swift")

    //TODO: 2. arrayListOf<Int>
    val arrayListOfInt = arrayListOf<Int>()
    arrayListOfInt.add(1)
    arrayListOfInt.add(2)
    arrayListOfInt.add(3)

    //TODO: 3. arrayListOf<DataModel>()
    val arrayListOfDataModel = arrayListOf<DataModel>()
    arrayListOfDataModel.add(DataModel("Kelvin"))
    arrayListOfDataModel.add(DataModel("Herwanda"))
    arrayListOfDataModel.add(DataModel("Tandrio"))

    //TODO: print ArrayList
    println("\narrayListOf: ")
    println("arrayListOf String     : $arrayListOfString")
    println("arrayListOf Int        : $arrayListOfInt")
    println("arrayListOf Data Model : $arrayListOfDataModel")

    //TODO: About Array (in JAVA) , arrayOf (in Kotlin)
    //TODO: arrayOf String
    val arrayString = arrayOf("Kotlin", "Java", "Swift")
    arrayString[2] = "Python"

    //TODO: arrayOf Int
    val arrayIntOne = arrayOf(1, 2, 3, 4, 5)
    val arrayIntTwo = intArrayOf(1, 2, 3)

    //TODO: arrayOf Double
    val arrayDoubleOne = arrayOf(1.1, 2.2, 3.3)
    val arrayDoubleTwo = doubleArrayOf(1.1, 2.2, 3.3)

    //TODO: arrayOf DataModel
    val arrayDataModel = arrayOf(DataModel("Kelvin"),
        DataModel("Herwanda"))

    //TODO: arrayOf can mix type
    val arrayMixData = arrayOf(1, 2.2, "Kotlin", true)
    arrayMixData[3] = DataModel("Kelvin")
    arrayMixData.plus(1000000000000)

    //TODO: print arrayOf
    println("\n arrayOf:")
    println("arrayOfString    : ${arrayString[0]}")
    println("arrayOfIntOne    : ${arrayIntOne[1]}")
    println("arrayOfIntTwo    : ${arrayIntTwo[2]}")
    println("arrayOfDoubleOne : $arrayDoubleOne")
    println("arrayOfDoubleTwo : $arrayDoubleTwo")
    println("arrayOfDataModel : $arrayDataModel")
    println("arrayOfMixData   : $arrayMixData")
}