class PrimeFactorization {
  BigInteger current

  def calculate(number) {
    (number < 2) ? [] : findFactors(number)
  }

  private findFactors(number) {
    def factors = []
    current = number

    addInstancesOfFactor(factors, 2)

    loopOverOddNumbersUntilBound(number / 2) { BigInteger candidate ->
      addInstancesOfFactor(factors, candidate)
    }
    factors ?: [number]
  }

  private void addInstancesOfFactor(factors, BigInteger candidate) {
    while (current % candidate == 0) {
      factors << candidate
      current /= candidate
    }
  }

  private loopOverOddNumbersUntilBound(bound, Closure closure) {
    if(bound > 2) {
      (3..bound).step(2, closure)
    }
  }
}
