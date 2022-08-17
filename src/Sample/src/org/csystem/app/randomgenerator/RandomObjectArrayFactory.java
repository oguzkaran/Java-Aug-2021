package org.csystem.app.randomgenerator;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.math.geometry.MutablePoint;
import org.csystem.util.string.StringUtil;

import java.util.Random;

public class RandomObjectArrayFactory {
    private final Random m_random;

    //Integer, Double, Character, MutablePoint, String, int []
    private Object createObject()
    {
        return switch (m_random.nextInt(6)) {
            case 0 -> m_random.nextInt(-128, 128);
            case 1 -> m_random.nextDouble();
            case 2 -> (char)(m_random.nextInt(26) + (m_random.nextBoolean() ? 'A' : 'a'));
            case 3 -> new MutablePoint(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100));
            case 4 -> StringUtil.getRandomTextTR(m_random, m_random.nextInt(1, 10));
            default -> ArrayUtil.getRandomArray(m_random, m_random.nextInt(5, 15), 0, 99);
        };
    }

    private Object [] fillObjects(Object [] objects)
    {
        for (int i = 0; i < objects.length; ++i)
            objects[i] = createObject();

        return objects;
    }

    public RandomObjectArrayFactory(Random random)
    {
        m_random = random;
    }

    public Object [] getObject(int count)
    {
        return fillObjects(new Object[count]);
    }
}
