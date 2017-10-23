package b;

import a.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    @Test
    public void speak() throws Exception {
        Animal animal = new Cat();
        Assert.assertEquals("speak1", animal.speak());
    }

    @Test
    public void eat() throws Exception {
        Animal animal = new Cat();
        Assert.assertEquals("eat1", animal.eat());
    }

    @Test
    public void play() throws Exception {
        Animal animal = new Cat();
        Assert.assertEquals("play1", animal.play());
    }

}