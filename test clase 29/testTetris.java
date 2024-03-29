
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import battle2023.ucp.Entities.Soldier;


public class tetristest { 
    @Test
    public void existetetrisTest()
    {
        Tetris t = new Tetris();
        assertNotNull(t);
    }

}