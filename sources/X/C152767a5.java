package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.7a5  reason: invalid class name and case insensitive filesystem */
public class C152767a5 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final Uri A05;
    public final C150697Rv A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = (X.C150777Se) X.C18290x4.A0k(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A00() {
        /*
            r4 = this;
            java.util.List r1 = r4.A0A
            r3 = 0
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = X.C18290x4.A0k(r1)
            X.7Se r2 = (X.C150777Se) r2
            r0 = 2
            int r1 = r2.A01(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0023
            X.7PZ r0 = X.C150777Se.A00(r2, r1)
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r0.A03
            android.util.Pair r3 = X.AnonymousClass0x9.A0C(r1, r0)
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152767a5.A00():android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = (X.C150777Se) r1.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01() {
        /*
            r5 = this;
            java.util.List r1 = r5.A0A
            r4 = 0
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r2 = r1.get(r4)
            X.7Se r2 = (X.C150777Se) r2
            r3 = 1
            int r1 = r2.A01(r3)
            r0 = -1
            if (r1 == r0) goto L_0x0041
            X.7PZ r1 = X.C150777Se.A00(r2, r1)
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0041
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0041
            java.util.List r0 = r1.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r2.next()
            X.7aP r0 = (X.C152937aP) r0
            X.7z1 r0 = r0.A00
            java.lang.String r1 = "mp4a.40.42"
            java.lang.String r0 = r0.A0O
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0029
        L_0x0041:
            return r4
        L_0x0042:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152767a5.A01():boolean");
    }

    public C152767a5(Uri uri, C150697Rv r4, String str, String str2, String str3, List list, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A01 = j;
        this.A0B = z;
        this.A06 = r4;
        this.A05 = uri;
        this.A0A = list;
        this.A02 = j2;
        this.A00 = j3;
        this.A03 = j4;
        this.A04 = j5;
        this.A0E = z2;
        this.A0C = z3;
        this.A0G = z4;
        this.A0F = z5;
        this.A0H = z6;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A0D = z7;
    }
}
