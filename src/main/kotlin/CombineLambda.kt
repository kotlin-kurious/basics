class CombineLambda {


    // A function can return a lambda
    fun getConversionLambda(str: String): (Double) -> Double {
        if (str == "CentigradeToFahrenheit") {
            return { it * 1.8 + 32 }
        } else if (str == "KgsToPounds") {
            return { it * 2.204623 }
        } else if (str == "PoundsToUSTons") {
            return { it / 2000.0 }
        } else {
            return { it }
        }
    }

    // function that receives AND returns lambdas
    fun combine(lambda1: (Double) -> Double,
                lambda2: (Double) -> Double): (Double) -> Double {
        return { x: Double -> lambda2(lambda1(x)) }
    }

    // code to use it ^
    //Define two conversion lambdas
    val kgsToPounds = { x: Double -> x * 2.204623 }
    val poundsToUSTons = { x: Double -> x / 2000.0 }
    //Combine the two lambdas to create a new one
    val kgsToUSTons = combine(kgsToPounds, poundsToUSTons)
    //Invoke the kgsToUSTons lambda
    val usTons = kgsToUSTons(1000.0)




}