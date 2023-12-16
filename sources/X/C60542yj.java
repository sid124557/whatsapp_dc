package X;

import android.util.Pair;

/* renamed from: X.2yj  reason: invalid class name and case insensitive filesystem */
public class C60542yj {
    public final C52402lQ A00;
    public final AnonymousClass33J A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60542yj)) {
            return false;
        }
        C60542yj r4 = (C60542yj) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public static Pair A00(AnonymousClass1BA r6) {
        C60542yj r1;
        AnonymousClass1AH r12 = r6.keyId_;
        if (r12 == null) {
            r12 = AnonymousClass1AH.DEFAULT_INSTANCE;
        }
        if ((r12.bitField0_ & 1) != 0) {
            AnonymousClass33J r5 = new AnonymousClass33J(r12.keyId_.A07());
            if ((r6.bitField0_ & 2) != 0) {
                C21471By r2 = r6.keyData_;
                if (r2 == null) {
                    r2 = C21471By.DEFAULT_INSTANCE;
                }
                int i = r2.bitField0_;
                if (!((i & 4) == 0 && (i & 2) == 0 && (i & 1) == 0)) {
                    C21511Cc r0 = r2.fingerprint_;
                    if (r0 == null) {
                        r0 = C21511Cc.DEFAULT_INSTANCE;
                    }
                    C61162zo A002 = C61162zo.A00(r0);
                    if (A002 != null) {
                        r1 = new C60542yj(new C52402lQ(A002, r2.keyData_.A07(), r2.timestamp_), r5);
                    }
                }
                throw C23341Sf.A00((String) null, 57);
            }
            r1 = null;
            return AnonymousClass0x9.A0C(r5, r1);
        }
        throw C23341Sf.A00((String) null, 53);
    }

    public C60542yj(C52402lQ r1, AnonymousClass33J r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        return C18310x6.A08(this.A00, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncdKey{keyId=");
        A0o.append(this.A01);
        A0o.append(", syncdKeyData=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
