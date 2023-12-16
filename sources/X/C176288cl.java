package X;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: X.8cl  reason: invalid class name and case insensitive filesystem */
public class C176288cl extends AnonymousClass8Q0 {
    public Hashtable A00 = new Hashtable();
    public Vector A01 = new Vector();

    public static C176548dB A0A(Object obj, C176288cl r2) {
        return (C176548dB) r2.A00.get(obj);
    }

    public static C176288cl A0B(Object obj) {
        if (obj instanceof C176288cl) {
            return (C176288cl) obj;
        }
        if (obj != null) {
            return new C176288cl(C176958dq.A0C(obj));
        }
        return null;
    }

    public C176288cl(C176958dq r5) {
        C176548dB r1;
        Enumeration A0V = r5.A0V();
        while (A0V.hasMoreElements()) {
            Object nextElement = A0V.nextElement();
            if (nextElement instanceof C176548dB) {
                r1 = (C176548dB) nextElement;
            } else if (nextElement != null) {
                r1 = new C176548dB(C176958dq.A0C(nextElement));
            } else {
                r1 = null;
            }
            Hashtable hashtable = this.A00;
            C176768dX r2 = r1.A00;
            if (!hashtable.containsKey(r2)) {
                this.A00.put(r2, r1);
                this.A01.addElement(r2);
            } else {
                throw AnonymousClass000.A0E(r2, "repeated extension found: ", AnonymousClass001.A0o());
            }
        }
    }
}
