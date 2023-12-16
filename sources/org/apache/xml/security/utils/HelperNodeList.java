package org.apache.xml.security.utils;

import X.AnonymousClass002;
import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class HelperNodeList implements NodeList {
    public ArrayList a;
    public boolean b;

    public int getLength() {
        return this.a.size();
    }

    public Node item(int i) {
        return (Node) this.a.get(i);
    }

    public HelperNodeList(boolean z) {
        this.a = AnonymousClass002.A0I(20);
        this.b = z;
    }

    public HelperNodeList() {
        this(false);
    }
}
