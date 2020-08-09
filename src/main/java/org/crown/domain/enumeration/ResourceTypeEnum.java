package src.main.java.org.crown.domain.enumeration;

import java.util.HashSet;

/**
 * Enumerator for various types of resources
 */
public enum ResourceTypeEnum {
    N95FACEMASK, HOMEMADEFACEMASK, FACESHIELDS, GOWNS, BOOTCOVERS, GOGGLES, SWABS, VENTILATORS, GLOVES, SURGICALFACEMASK;

    private static final Map<String, Element> RESOURCE_TYPES = new HashSet<>();

    public final String typeName;

    private Element(String typeName) {
        this.typeName = typeName;
    }

    static {
        for (Element e: values()) {
            RESOURCE_TYPES.put(e.typename, e);
        }
    }

    public static Boolean checkValidity(String typename) {
        return RESOURCE_TYPES.contains(typename);
    }
}
