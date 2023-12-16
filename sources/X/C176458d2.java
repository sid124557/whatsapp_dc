package X;

import java.util.Enumeration;

/* renamed from: X.8d2  reason: invalid class name and case insensitive filesystem */
public class C176458d2 extends AnonymousClass8Q0 {
    public static final C176528d9 A04 = new C176528d9(C176108cT.A00, C186938wB.A1E);
    public final C176748dV A00;
    public final C176748dV A01;
    public final C176778dY A02;
    public final C176528d9 A03;

    public C176458d2(byte[] bArr, int i) {
        this.A02 = new C176648dL(C161007oo.A02(bArr));
        this.A00 = new C176748dV((long) i);
        this.A01 = null;
        this.A03 = null;
    }

    public C176458d2(C176958dq r5) {
        Enumeration A0V = r5.A0V();
        this.A02 = (C176778dY) A0V.nextElement();
        this.A00 = (C176748dV) A0V.nextElement();
        if (A0V.hasMoreElements()) {
            Object nextElement = A0V.nextElement();
            if (nextElement instanceof C176748dV) {
                this.A01 = C176748dV.A0A(nextElement);
                nextElement = A0V.hasMoreElements() ? A0V.nextElement() : nextElement;
            } else {
                this.A01 = null;
            }
            if (nextElement != null) {
                this.A03 = C176528d9.A0A(nextElement);
                return;
            }
        } else {
            this.A01 = null;
        }
        this.A03 = null;
    }
}
