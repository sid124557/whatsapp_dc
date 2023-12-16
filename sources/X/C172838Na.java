package X;

import java.util.Enumeration;

/* renamed from: X.8Na  reason: invalid class name and case insensitive filesystem */
public class C172838Na implements Enumeration {
    public final Enumeration A00;
    public final /* synthetic */ C176198cc A01;

    public C172838Na(Enumeration enumeration, C176198cc r2) {
        this.A01 = r2;
        this.A00 = enumeration;
    }

    public boolean hasMoreElements() {
        return this.A00.hasMoreElements();
    }

    public Object nextElement() {
        Object nextElement = this.A00.nextElement();
        if (nextElement instanceof C176248ch) {
            return nextElement;
        }
        if (nextElement != null) {
            return new C176248ch(C176958dq.A0C(nextElement));
        }
        return null;
    }
}
