import org.junit.Test

/*
 * ************************************************************************
 * Copyright (c), 2013 Next Century Corporation. All Rights Reserved.
 *
 * This software code is the exclusive property of Next Century Corporation and is
 * protected by United States and International laws relating to the protection
 * of intellectual property.  Distribution of this software code by or to an
 * unauthorized party, or removal of any of these notices, is strictly
 * prohibited and punishable by law.
 *
 * UNLESS PROVIDED OTHERWISE IN A LICENSE AGREEMENT GOVERNING THE USE OF THIS
 * SOFTWARE, TO WHICH YOU ARE AN AUTHORIZED PARTY, THIS SOFTWARE CODE HAS BEEN
 * ACQUIRED BY YOU "AS IS" AND WITHOUT WARRANTY OF ANY KIND.  ANY USE BY YOU OF
 * THIS SOFTWARE CODE IS AT YOUR OWN RISK.  ALL WARRANTIES OF ANY KIND, EITHER
 * EXPRESSED OR IMPLIED, INCLUDING, WITHOUT LIMITATION, IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE, ARE HEREBY EXPRESSLY
 * DISCLAIMED.
 *
 * PROPRIETARY AND CONFIDENTIAL TRADE SECRET MATERIAL NOT FOR DISCLOSURE OUTSIDE
 * OF NEXT CENTURY CORPORATION EXCEPT BY PRIOR WRITTEN PERMISSION AND WHEN
 * RECIPIENT IS UNDER OBLIGATION TO MAINTAIN SECRECY.
 *
 * 
 * @author tbrooks
 */

class PrimeFactorizationTest{

    @Test
    void test(){
        assert true
    }

    @Test
    void doesFactorizationWork() {
        def factorizer = new PrimeFactorization(7)
        assert factorizer.factorization() == [7]
    }

    @Test
    void doesFactorizationWorkWithMultipleNumbers() {
        def factorizer = new PrimeFactorization(4)
        assert factorizer.factorization() == [2,2]
    }

    @Test
    void doesFactorizationWorkWithComplex() {
        def factorizer = new PrimeFactorization(24)
        assert factorizer.factorization() == [2,2,2,3]
    }

    @Test
    void doesFactorizationWorkWithLargePrime() {
        def factorizer = new PrimeFactorization(31)
        assert factorizer.factorization() == [31]
    }

    @Test
    void doesFactorizationWorkWithOne() {
        def factorizer = new PrimeFactorization(1)
        assert factorizer.factorization() == []
    }

    @Test
    void doesFactorizationRootWorkSix() {
        def factorizer = new PrimeFactorization(6)
        assert factorizer.factorization() == [2,3]
    }

    @Test
    void doesFactorizationWorkLargePrime() {
        def factorizer = new PrimeFactorization(104729)
        assert factorizer.factorization() == [104729]
    }

}
