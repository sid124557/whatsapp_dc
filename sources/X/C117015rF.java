package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.5rF  reason: invalid class name and case insensitive filesystem */
public class C117015rF implements Comparable {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C56972sr A03;
    public final C95814uZ A04;
    public final String A05;

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A05;
        objArr[2] = Long.valueOf(this.A01);
        objArr[3] = Long.valueOf(this.A02);
        return C18310x6.A08(Long.valueOf(this.A00), objArr, 4);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C117015rF r7 = (C117015rF) obj;
        C56972sr r0 = this.A03;
        C95814uZ r5 = this.A04;
        boolean A0a = r0.A0a(r5);
        C95814uZ r4 = r7.A04;
        if (A0a == r0.A0a(r4)) {
            int compare = Long.compare(this.A02, r7.A02);
            if (compare != 0) {
                return compare;
            }
            int compareTo = r5.compareTo((Jid) r4);
            if (compareTo == 0) {
                return Long.compare(this.A00, r7.A00);
            }
            return compareTo;
        } else if (A0a) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C117015rF)) {
            return false;
        }
        C117015rF r7 = (C117015rF) obj;
        if (this.A01 == r7.A01 && this.A02 == r7.A02 && this.A00 == r7.A00 && this.A04.equals(r7.A04) && AnonymousClass75J.A00(this.A05, r7.A05)) {
            return true;
        }
        return false;
    }

    public C117015rF(C56972sr r1, C95814uZ r2, String str, long j, long j2, long j3) {
        this.A03 = r1;
        this.A04 = r2;
        this.A05 = str;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }
}
