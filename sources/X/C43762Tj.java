package X;

import java.io.File;

/* renamed from: X.2Tj  reason: invalid class name and case insensitive filesystem */
public class C43762Tj {
    public final long A00;
    public final long A01;
    public final C42162Na A02;
    public final AnonymousClass8KT A03;
    public final AnonymousClass7US A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C43762Tj(C42162Na r7, AnonymousClass8KT r8, C633138t r9, AnonymousClass7US r10, File file, String str, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        long j2;
        this.A05 = str;
        this.A00 = j;
        this.A02 = r7;
        this.A07 = z;
        this.A03 = r8;
        this.A08 = z2;
        this.A04 = r10;
        this.A06 = str2;
        if (j <= 0 || file != null) {
            if (file == null || !(r9 == C633138t.A0C || r9 == C633138t.A0R || r9 == C633138t.A05 || r9 == C633138t.A0i || r9 == C633138t.A0g || r9 == C633138t.A09 || AnonymousClass36O.A06(r9))) {
                j2 = -1;
            } else {
                j2 = file.length();
                if (z3) {
                    j2 = (j2 - (j2 % 16)) + 16 + 10;
                }
            }
            this.A01 = j2;
            this.A09 = z4;
            return;
        }
        throw AnonymousClass001.A0c("Must provide file for upload continuation");
    }
}
