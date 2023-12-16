package X;

import java.util.Set;

/* renamed from: X.304  reason: invalid class name */
public class AnonymousClass304 {
    public static final AnonymousClass304 A02 = new AnonymousClass304((Set) null, 6);
    public static final AnonymousClass304 A03 = new AnonymousClass304((Set) null, 4);
    public static final AnonymousClass304 A04 = new AnonymousClass304((Set) null, 0);
    public static final AnonymousClass304 A05 = new AnonymousClass304((Set) null, 5);
    public static final AnonymousClass304 A06 = new AnonymousClass304((Set) null, 3);
    public static final AnonymousClass304 A07 = new AnonymousClass304((Set) null, 2);
    public static final AnonymousClass304 A08 = new AnonymousClass304((Set) null, 1);
    public final int A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass304 r5 = (AnonymousClass304) obj;
            if (this.A00 != r5.A00 || !AnonymousClass75J.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public boolean A00() {
        int i = this.A00;
        if (i == 2 || i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public AnonymousClass304(Set set, int i) {
        this.A00 = i;
        this.A01 = set;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A00);
        return C18310x6.A08(this.A01, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncResult(resultType=");
        A0o.append(this.A00);
        return AnonymousClass000.A0e(A0o);
    }
}
