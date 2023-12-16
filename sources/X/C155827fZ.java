package X;

import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: X.7fZ  reason: invalid class name and case insensitive filesystem */
public class C155827fZ {
    public Hashtable A00 = new Hashtable();

    public C155827fZ(Hashtable hashtable) {
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            this.A00.put(nextElement, hashtable.get(nextElement));
        }
    }

    public C155827fZ() {
    }
}
