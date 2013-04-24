
class PrimeFactorization {
  def factorsOf(BigInteger number) {
    findFactors(potentialFactors(number), number)
  }

  def potentialFactors(BigInteger number) {
    [2] + oddPotentialFactors(number)
  }

  private oddPotentialFactors(BigInteger number) {
    (number / 2 >= 3) ? (3..(number/2)).step(2) : []
  }

  private findFactors(potentialFactors, BigInteger number) {
    if(number == 1) []
    else if(!potentialFactors) [number]
    else if(number % potentialFactors.head() == 0) [potentialFactors.head()] + findFactors(potentialFactors, (BigInteger) number / potentialFactors.head())
    else findFactors(potentialFactors.tail(), number)
  }
}
