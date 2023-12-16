package X;

import java.util.Set;

/* renamed from: X.1oW  reason: invalid class name and case insensitive filesystem */
public class C31581oW extends C31891p1 {
    public int A00;
    public C27991fJ A01;
    public String A02 = "";
    public final Set A03 = AnonymousClass0x9.A17();

    public C31581oW(AnonymousClass2z0 r8, int i, long j) {
        super(r8, (AnonymousClass39T) null, i, j);
    }

    public void A1Z(String str) {
        synchronized (this.A1K) {
            this.A02 = str;
        }
    }

    public String A1x() {
        String str;
        synchronized (this.A1K) {
            str = this.A02;
        }
        return str;
    }
}
