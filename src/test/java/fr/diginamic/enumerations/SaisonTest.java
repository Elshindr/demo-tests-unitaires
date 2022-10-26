package fr.diginamic.enumerations;

import fr.diginamic.enumerations.Saison;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaisonTest {

    @Test
    void valueOfLibelle() {

        Assert.assertEquals(Saison.valueOfLibelle("Printemps"), Saison.PRINTEMPS);
        Assert.assertEquals(Saison.valueOfLibelle("Ete"), Saison.ETE);
        Assert.assertEquals(Saison.valueOfLibelle("Automne"), Saison.AUTOMNE);
        Assert.assertEquals(Saison.valueOfLibelle("Hiver"), Saison.HIVER);

        Assert.assertEquals(Saison.valueOfLibelle(""), null);
        Assert.assertEquals(Saison.valueOfLibelle("null"), null);
    }
}