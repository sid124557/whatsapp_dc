package X;

import java.util.Arrays;

/* renamed from: X.1RU  reason: invalid class name */
public class AnonymousClass1RU extends AnonymousClass33G {
    public boolean A00;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && this.A00 == ((AnonymousClass1RU) obj).A00;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1RU(X.AnonymousClass33G r16) {
        /*
            r15 = this;
            r0 = r16
            com.whatsapp.jid.DeviceJid r2 = r0.A07
            X.23P r3 = r0.A08
            java.lang.String r4 = r0.A09
            long r8 = r0.A00
            long r10 = r0.A05
            long r12 = r0.A01
            int r7 = r0.A04
            boolean r14 = r0.A0A
            java.lang.String r5 = r0.A03
            java.lang.String r6 = r0.A02
            X.2xO r1 = r0.A06
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RU.<init>(X.33G):void");
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, super.hashCode());
        AnonymousClass000.A1R(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(super.toString());
        A0o.append(", isSyncing: ");
        return C18300x5.A0m(A0o, this.A00);
    }
}
