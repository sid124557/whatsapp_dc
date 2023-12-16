package X;

import java.util.Arrays;

/* renamed from: X.2z2  reason: invalid class name and case insensitive filesystem */
public final class C60712z2 {
    public static final long A03 = AnonymousClass0x7.A0C();
    public final long A00;
    public final C53982nz A01;
    public final String A02;

    public C60712z2(C53982nz r2, String str, long j) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C60712z2.class)) {
                return false;
            }
            C60712z2 r7 = (C60712z2) obj;
            if (!C162457s7.A0P(this.A02, r7.A02) || !C162457s7.A0P(this.A01, r7.A01) || this.A00 != r7.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A02;
        A1X[1] = this.A01;
        AnonymousClass0x2.A1U(A1X, this.A00);
        return Arrays.hashCode(A1X);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CtwaAdConsumerDCStateInfo(jid=");
        A0o.append(this.A02);
        A0o.append(", loggingTracker=");
        A0o.append(this.A01);
        A0o.append(", lastInteractionTsMs=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
