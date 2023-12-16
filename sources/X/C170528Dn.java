package X;

import java.util.Objects;

/* renamed from: X.8Dn  reason: invalid class name and case insensitive filesystem */
public class C170528Dn implements C181498mr {
    public final AnonymousClass7TV A00;
    public final C151637Vo A01;
    public final Object A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C170528Dn r5 = (C170528Dn) obj;
            if (!Objects.equals(this.A01, r5.A01) || !this.A03.equals(r5.A03) || !Objects.equals(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public Object get() {
        return this.A02;
    }

    public C170528Dn(AnonymousClass7TV r2, C151637Vo r3, Object obj) {
        this.A01 = r3;
        this.A03 = obj.toString();
        this.A00 = r2;
        this.A02 = r3.A00(r2, obj, obj).A00();
    }
}
