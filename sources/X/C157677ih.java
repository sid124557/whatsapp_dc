package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.7ih  reason: invalid class name and case insensitive filesystem */
public final class C157677ih {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final Map A06;
    public final byte[] A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C157677ih(android.net.Uri r14, long r15, long r17) {
        /*
            r13 = this;
            r2 = 0
            r6 = 0
            r5 = 1
            java.util.Map r3 = java.util.Collections.emptyMap()
            r9 = r15
            long r7 = r15 - r15
            r0 = r13
            r1 = r14
            r11 = r17
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157677ih.<init>(android.net.Uri, long, long):void");
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DataSpec[");
        if (this.A01 != 1) {
            str = "POST";
        } else {
            str = "GET";
        }
        A0o.append(str);
        AnonymousClass001.A1L(A0o);
        A0o.append(this.A04);
        A0o.append(", ");
        A0o.append(this.A03);
        A0o.append(", ");
        A0o.append(this.A02);
        A0o.append(", ");
        A0o.append(this.A05);
        A0o.append(", ");
        A0o.append(this.A00);
        return AnonymousClass000.A0f(A0o);
    }

    public C157677ih(Uri uri, String str, Map map, byte[] bArr, int i, int i2, long j, long j2, long j3) {
        boolean z = true;
        C161487pm.A03(AnonymousClass001.A1U(((j + j2) > 0 ? 1 : ((j + j2) == 0 ? 0 : -1))));
        C161487pm.A03(AnonymousClass001.A1U((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1))));
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C161487pm.A03(z);
        this.A04 = uri;
        this.A01 = i;
        this.A07 = (bArr == null || bArr.length == 0) ? null : bArr;
        this.A06 = AnonymousClass6C9.A0l(map);
        this.A03 = j2;
        this.A02 = j3;
        this.A05 = str;
        this.A00 = i2;
    }
}
