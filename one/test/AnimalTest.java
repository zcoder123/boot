
import org.junit.Assert;
import org.junit.Test;
import a.Animal;

import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void speak() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals("speak", animal.speak());
    }

    @Test
    public void eat() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals("eat", animal.eat());
    }

    @Test
    public void play() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals("play", animal.play());
    }

}