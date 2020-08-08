package src.main.java.org.crown.domain.enumeration;

import java.util.HashSet;

/**
 * Enumerator for various types of resources
 */
public enum ResourceTypeEnum {
    N95FACEMASK, HOMEMADEFACEMASK, FACESHIELDS, GOWNS, BOOTCOVERS, GOGGLES, SWABS, VENTILATORS, GLOVES, SURGICALFACEMASK;

    private static final Map<String, Element> BY_TYPE = new HashMap<>();

    public final String typename;

    private Element(String typename) {
        this.typename = typename;
    }

    static {
        for (Element e: values()) {
            BY_TYPE.put(e.typename, e);
        }
    }

    public static Boolean checkValidity(String typename) {
        return BY_TYPE.contains(typename);
    }
}
