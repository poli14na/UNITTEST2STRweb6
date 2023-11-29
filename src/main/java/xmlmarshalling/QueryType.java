package xmlmarshalling;

import javax.xml.bind.annotation.XmlEnumValue;

public enum QueryType {
    @XmlEnumValue("CREATE")
    CREATE,
    @XmlEnumValue("READ")
    READ,
    @XmlEnumValue("UPDATE")
    UPDATE,
    @XmlEnumValue("DELETE")
    DELETE
}

