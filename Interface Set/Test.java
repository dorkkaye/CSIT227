public class Test 
{
    public static void main(String[] args)
    {
        //Test 1
        Set s1 = new Set();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(2);
        s1.display();
        
        /*  OUTPUT
            1
            2
            3
        */
        
        //Test 2
        Set s2 =  new Set();
        s2.add(10);
        s2.add(12);
        s2.add(13);
        s2.add(14);
        s2.add(15);
        s2.add(17);
        s2.add(16);
        s2.add(18);
        s2.add(20);
        s2.add(21);
        s2.add(22);
        System.out.println("Count: "+s2.count());
        s2.display();

        /*  OUTPUT
            Count: 10
            10
            12
            13
            14
            15
            17
            16
            18
            20
            21
        */
        
        //Test 3
        Set s3 = new Set();
        s3.add(1);
        s3.add(2);
        s3.add(3);
        s3.add(6);
        System.out.println(s3.isElementOf(2));
        System.out.println(s3.isElementOf(10));

        /*  OUTPUT
            true
            false
        */
        
        //Test 4
        Set s4 = new Set();
        Set s5 = new Set();
        Set union = null;
        s4.add(1);
        s4.add(2);
        s4.add(3);
        s4.add(4);
        s5.add(10);
        s5.add(2);
        s5.add(20);
        union = s4.union(s5);
        union.display();
        
        /*  OUTPUT
            1
            2
            3
            4
            10
            20
        */

        //Test 5
        Set s6 =  new Set();
        s6.add(10);
        s6.add(12);
        s6.add(13);
        s6.add(14);
        s6.add(15);
        s6.add(17);
        s6.add(16);
        s6.add(18);
        s6.add(20);
        s6.add(21);
        s6.add(22);
        Set s7 = new Set();
        s7.add(41);
        s7.add(42);
        s7.add(43);
        s7.add(44);
        s7.add(45);
        s7.add(46);
        s7.add(47);
        s7.add(48);
        s7.add(49);
        s7.add(50);
        Set union1 = s6.union(s7);
        union1.display();

        /*  OUTPUT
            10
            12
            13
            14
            15
            17
            16
            18
            20
            21
            41
            42
            43
            44
            45
            46
            47
            48
            49
            50
        */
    }
}
