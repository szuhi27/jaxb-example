package legoset;

import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name","theme","subtheme","year","pieces","tags","minifigs","weights","url"})
@Data
public class LegoSet {

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;
    private String name;
    private String theme;
    private String subtheme;
    private URL url;
    @XmlElement(name= "weight")
    private List<Weight> weights;
    @XmlElementWrapper(name="tags")
    @XmlElement(name="tag")
    private Set<String> tags;
    @XmlElementWrapper(name="minifigs")
    @XmlElement(name="minifig")
    private List<Minifig> minifigs;

    @XmlAttribute
    private String number;
}
