package X;

import java.util.Arrays;

/* renamed from: X.0Tu  reason: invalid class name and case insensitive filesystem */
public final class C05510Tu {
    public final Object A00;
    public final Throwable A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C05510Tu) {
                C05510Tu r5 = (C05510Tu) obj;
                Object obj2 = this.A00;
                if (obj2 == null || !obj2.equals(r5.A00)) {
                    Throwable th = this.A01;
                    if (!(th == null || r5.A01 == null)) {
                        return th.toString().equals(th.toString());
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C05510Tu(Object obj) {
        this.A00 = obj;
        this.A01 = null;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A00;
        A0M[1] = this.A01;
        return Arrays.hashCode(A0M);
    }

    public C05510Tu(Throwable th) {
        this.A01 = th;
        this.A00 = null;
    }
}
