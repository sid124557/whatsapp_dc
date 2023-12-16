package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0Ee  reason: invalid class name and case insensitive filesystem */
public final class C02070Ee extends AnonymousClass0JM {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C02070Ee.class)) {
                return false;
            }
            C02070Ee r7 = (C02070Ee) obj;
            if (!(this.A00 == r7.A00 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        int i;
        long j = this.A01;
        if (j > 0) {
            i = (int) ((((long) 100) * this.A00) / j);
        } else {
            i = 0;
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        AnonymousClass000.A1Q(objArr, 0, this.A00);
        AnonymousClass001.A1Q(objArr, j);
        AnonymousClass000.A1P(objArr, i, 2);
        String format = String.format(locale, "MediaRestoreProgressStatus/progress %d/%d (%d%%)", Arrays.copyOf(objArr, 3));
        C162457s7.A0D(format);
        return format;
    }

    public C02070Ee(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = Long.valueOf(this.A00);
        AnonymousClass001.A1Q(A0M, this.A01);
        return Arrays.hashCode(A0M);
    }
}
