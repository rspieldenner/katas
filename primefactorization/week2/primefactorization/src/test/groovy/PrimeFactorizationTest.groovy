import org.junit.Test

class PrimeFactorizationTest {
  PrimeFactorization factors = new PrimeFactorization()

  @Test
  void verifyFactorizationOf1IsEmptyList() {
    assert factors.calculate(1) == []
  }

  @Test
  void verifyFactorizationOf2Is2() {
    assert factors.calculate(2) == [2]
  }

  @Test
  void verify4is2Squared() {
    assert factors.calculate(4) == [2,2]
  }

  @Test
  void verifyFactorizationOf6() {
    assert factors.calculate(6) == [2,3]
  }

  @Test
  void verify() {
    assert factors.calculate(1300) == [2,2,5,5,13]
  }

  @Test
  void verifyLargerPrime() {
    assert factors.calculate(13) == [13]
  }
}

