package epam.webapp.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyBeanTest {
    @Test
    public void table() throws Exception {
        String[][] strings = {{"1", "2", "3"}, {"4", "5", "6"}};
        MyBean myBean = new MyBean();
        myBean.setCols("2");
        myBean.setRows("3");
        assertArrayEquals(strings, myBean.getTable());
    }
}