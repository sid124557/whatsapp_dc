package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0Ed  reason: invalid class name and case insensitive filesystem */
public final class C02060Ed extends AnonymousClass0JM {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C02060Ed.class)) {
                return false;
            }
            C02060Ed r7 = (C02060Ed) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        int i;
        long j = this.A00;
        if (j > 0) {
            i = (int) ((((long) 100) * this.A01) / j);
        } else {
            i = 0;
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        AnonymousClass000.A1Q(objArr, 0, this.A01);
        AnonymousClass001.A1Q(objArr, j);
        AnonymousClass000.A1P(objArr, i, 2);
        String format = String.format(locale, "BackupProgressStatus/progress %d/%d (%d%%)", Arrays.copyOf(objArr, 3));
        C162457s7.A0D(format);
        return format;
    }

    public C02060Ed(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = Long.valueOf(this.A01);
        AnonymousClass001.A1Q(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }
}
