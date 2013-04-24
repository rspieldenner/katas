import spock.lang.*

class PrimeFactorizationSpec extends Specification {
  PrimeFactorization factors = new PrimeFactorization()

  @Unroll
  def 'the factorization of #number is #result'() {
    expect:
    factors.factorsOf(number) == result

    where:
    number || result
    1      || []
    2      || [2]
    3      || [3]
    6      || [2,3]
    13     || [13]
    20     || [2,2,5]
    702    || [2,3,3,3,13]
  }

  @Unroll
  def 'potential factors of #number are #result'() {
    expect:
    factors.potentialFactors(number) == result

    where:
    number || result
    2      || [2]
    7      || [2,3]
    21     || [2,3,5,7,9]
  }
}
