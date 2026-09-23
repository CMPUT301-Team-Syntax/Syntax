class Square(
    override val x: Int,
    override val y: Int,
    val sideLength: Int
) : Shape() {

    val getArea: Double
        get() = sideLength * sideLength

}