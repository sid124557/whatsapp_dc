package X;

import java.util.Map;

/* renamed from: X.0Tf  reason: invalid class name and case insensitive filesystem */
public class C05410Tf {
    public static final String A04 = C06240Wu.A01("WorkTimer");
    public final C15340rB A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final Map A02 = AnonymousClass001.A0t();
    public final Map A03 = AnonymousClass001.A0t();

    public void A00(AnonymousClass0PL r6) {
        synchronized (this.A01) {
            if (((C12120l0) this.A03.remove(r6)) != null) {
                C06240Wu.A02(C06240Wu.A00(), r6, "Stopping timer for ", A04, AnonymousClass001.A0o());
                this.A02.remove(r6);
            }
        }
    }

    public C05410Tf(C15340rB r2) {
        this.A00 = r2;
    }
}
