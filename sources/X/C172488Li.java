package X;

import java.io.File;

/* renamed from: X.8Li  reason: invalid class name and case insensitive filesystem */
public class C172488Li implements Comparable {
    public static final String A0A = C172488Li.class.getSimpleName();
    public int A00;
    public long A01 = -1;
    public boolean A02 = false;
    public final long A03;
    public final long A04;
    public final long A05;
    public final File A06;
    public final String A07;
    public final boolean A08;
    public volatile long A09 = -1;

    public C172488Li(File file, String str, long j, long j2, long j3, boolean z) {
        this.A07 = str;
        this.A05 = j;
        this.A04 = j2;
        this.A08 = z;
        this.A06 = file;
        this.A03 = j3;
    }

    public void A01() {
        this.A02 = true;
    }

    /* renamed from: A00 */
    public int compareTo(C172488Li r6) {
        String str = this.A07;
        String str2 = r6.A07;
        if (!str.equals(str2)) {
            return str.compareTo(str2);
        }
        int i = ((this.A05 - r6.A05) > 0 ? 1 : ((this.A05 - r6.A05) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }

    public boolean A02() {
        return AnonymousClass000.A1T((this.A04 > -1 ? 1 : (this.A04 == -1 ? 0 : -1)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CacheSpan{");
        A0o.append(this.A07);
        A0o.append(" lat:");
        A0o.append(this.A03);
        A0o.append(" pos: ");
        A0o.append(this.A05);
        A0o.append(" size: ");
        A0o.append(this.A04);
        return AnonymousClass000.A0d(A0o);
    }
}
