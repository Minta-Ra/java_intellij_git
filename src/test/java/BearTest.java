import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    private Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.62, 'f');
    }

    // @ - annotation, everything after will be a test
    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(95.62, bear.getWeight(), 0.0);
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfLessThan80(){
        Bear thinBear = new Bear("Craig", 21, 65.44, 'm');
        assertEquals(false, thinBear.readyToHibernate());
    }


//    REPETETIVE, TO AVOID
//    @ - annotation, everything after will be a test
//    @Test
//    public void hasName(){
//        // Create a new bear
//        Bear bear = new Bear("Baloo", 25);
//        assertEquals("Baloo", bear.getName());
//    }
//
//    @Test
//    public void hasAge(){
//        Bear bear = new Bear("Baloo", 25);
//        assertEquals(25, bear.getAge());
//    }
//
//    @Test
//    public void hasWeight(){
//        Bear bear = new Bear("Baloo", 25, 95.62);
//        assertEquals(95.62, bear.getWeight(), 0.0);
//    }

}
