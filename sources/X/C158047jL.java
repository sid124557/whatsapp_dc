package X;

import java.util.List;

/* renamed from: X.7jL  reason: invalid class name and case insensitive filesystem */
public class C158047jL {
    public final C180488l9 A00;
    public final Object A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C158047jL)) {
            return false;
        }
        C158047jL r4 = (C158047jL) obj;
        if (!C04880Ra.A01(this.A00, r4.A00) || !C04880Ra.A01(this.A01, r4.A01) || !C04880Ra.A01(this.A02, r4.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.A00.hashCode() ^ AnonymousClass000.A07(this.A01);
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode ^ i;
    }

    public C158047jL(C180488l9 r1, Object obj, List list) {
        this.A00 = r1;
        this.A01 = obj;
        this.A02 = list;
    }

    public C158047jL(C180488l9 r2) {
        this(r2, (Object) null, (List) null);
    }
}
