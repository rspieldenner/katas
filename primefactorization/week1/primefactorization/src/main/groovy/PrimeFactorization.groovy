class PrimeFactorization{

    int number
    PrimeFactorization(int number){
        this.number = number
    }

    def factorization(){
        if(number == 1)
            return []

        def factors = []

        int maxDivisible = getMaxDivisible()
        findFactors(maxDivisible, factors, number)

        if(!factors) {
            factors << number
        }

        return factors
    }

    private void findFactors(int maxDivisible, factors, int currentNumber){
        (2..maxDivisible).each{
            while (currentNumber % it == 0){
                factors << it
                currentNumber /= it
            }
        }
    }

    int getMaxDivisible(){
        number/2 + 1
    }
}

