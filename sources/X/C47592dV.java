package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.2dV  reason: invalid class name and case insensitive filesystem */
public class C47592dV {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C151027Td A04;
    public final C633138t A05;
    public final AnonymousClass330 A06;
    public final File A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public File A01() {
        Uri parse;
        String str = this.A0B;
        if (str == null || (parse = Uri.parse(str)) == null || !parse.isAbsolute()) {
            return null;
        }
        return C627536m.A04(parse);
    }

    public C47592dV(C151027Td r4, C633138t r5, AnonymousClass330 r6, File file, String str, String str2, String str3, String str4, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        boolean z9 = z4;
        if (z4 && (r5 == C633138t.A0C || r5 == C633138t.A0j || r5 == C633138t.A0H || r5 == C633138t.A0Z || r5 == C633138t.A07 || r5 == C633138t.A0M || r5 == C633138t.A08 || r5 == C633138t.A0R || r5 == C633138t.A0F)) {
            C626936e.A0F(AnonymousClass000.A1W(r4), "Image transcoding should have quality settings");
        }
        this.A08 = str;
        this.A07 = file;
        this.A0B = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A05 = r5;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
        this.A0E = z;
        this.A0D = z2;
        this.A0J = z3;
        this.A0C = z9;
        this.A06 = r6;
        this.A04 = r4;
        this.A0H = z5;
        this.A0I = z6;
        this.A0F = z7;
        this.A0G = z8;
    }

    public static C633138t A00(AnonymousClass3QO r0) {
        C633138t r02 = r0.A01().A05;
        C162457s7.A0D(r02);
        return r02;
    }
}
