package legoset;
import jaxb.JAXBHelper;

import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        LegoSet lego = new LegoSet();
        lego.setYear(Year.of(2018));
        lego.setPieces(519);
        lego.setName("Imperial TIE Fighter");
        lego.setTheme("Star Wars");
        lego.setSubtheme("Solo");
        //lego.setTags(Set.add("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        //lego.setTags(new HashSet<String>(Arrays.asList("Starfigter","Stormtrooper","Star Wars","Solo")));
        Set<String> tag = new HashSet<String>();
        tag.add("Starfigter");
        tag.add("Stromtrooper");
        tag.add("Star Wars");
        tag.add("Solo");
        lego.setTags(tag);
        lego.setNumber("75211");
        lego.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));
        lego.setMinifigs(minifigs);

        ArrayList<Weight> weights = new ArrayList<>();
        weights.add(new Weight(0.89, "kg"));
        lego.setWeights(weights);

        JAXBHelper.toXML(lego, System.out);
    }
}
