package X;

import java.util.Map;

/* renamed from: X.2gp  reason: invalid class name and case insensitive filesystem */
public class C49622gp {
    public final Map A00 = AnonymousClass001.A0t();
    public final Map A01 = AnonymousClass001.A0t();
    public final Map A02 = AnonymousClass001.A0t();
    public final Map A03 = AnonymousClass001.A0t();

    public synchronized void A00() {
        this.A02.clear();
        this.A01.clear();
        this.A03.clear();
        this.A00.clear();
    }

    public synchronized String toString() {
        StringBuilder A0o;
        A0o = AnonymousClass001.A0o();
        A0o.append("[localdata: ");
        AnonymousClass000.A1B(this.A01, A0o);
        A0o.append(" callbacks: ");
        AnonymousClass000.A1B(this.A00, A0o);
        return AnonymousClass000.A0f(A0o);
    }
}
