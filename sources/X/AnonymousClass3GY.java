package X;

import android.content.ContentValues;

/* renamed from: X.3GY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GY implements C837149m {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C55622qe A01;
    public final /* synthetic */ C624134x A02;
    public final /* synthetic */ boolean A03;

    public final void BrV(C624134x r11) {
        C55622qe r3 = this.A01;
        C624134x r0 = this.A02;
        boolean z = this.A03;
        long j = this.A00;
        if (r11.A1J.equals(r0.A1J)) {
            r11.A1F = z;
            C66533Lu r4 = r3.A06;
            if (j != 1) {
                C85284Fq A04 = r4.A0F.A04();
                try {
                    ContentValues A07 = AnonymousClass0x9.A07(1);
                    C56862sg A032 = AnonymousClass3H0.A03(A07, A04, "fts_namespace", r4.A0E(r11));
                    String[] strArr = new String[1];
                    C18260x0.A1X(strArr, r11.A1L);
                    A032.A05(A07, "message_ftsv2", "docid = ?", "UPDATE_FTS_NAMESPACED", strArr);
                    A04.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ AnonymousClass3GY(C55622qe r1, C624134x r2, long j, boolean z) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = z;
        this.A00 = j;
    }
}
