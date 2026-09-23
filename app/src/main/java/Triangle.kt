class Triangle(
    override val x: Int,
    override val y: Int,
    val length: Float,
    val height: Float,
): Shape() {

    //Gets area
    fun getAreaTriangle(): Float {
        return ((length*height) / 2)
    }

}