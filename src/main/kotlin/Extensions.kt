class Extensions {

    // example to prefix a Double with “$” in order to format it as dollars
    fun Double.toDollar(): String {
        return "$$this"
    }
}