package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
    @Test
    void shouldComplementOfTheChance() {
        Chance chance = new Chance(0.2);
        assertEquals(new Chance(0.8), chance.complement());
    }

    @Test
    void shouldCombineTwoChances() {
        Chance chance1 = new Chance(0.5);
        Chance chance2 = new Chance(0.2);
        assertEquals(new Chance(0.1), chance1.and(chance2));
    }

    @Test
    void shouldComplementOfNever() {
        Chance chance = new Chance(0.4);
        assertEquals(new Chance(0.64), chance.or());
    }
}