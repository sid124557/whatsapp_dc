package X;

import android.os.SystemClock;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* renamed from: X.1tW  reason: invalid class name and case insensitive filesystem */
public final class C33681tW extends AnonymousClass5ZM {
    public final int A00;
    public final int A01 = R.string.f11nameremoved;
    public final int A02;
    public final long A03;
    public final long A04;
    public final C69263Wi A05;
    public final C49712gy A06;
    public final AnonymousClass3FH A07;
    public final AnonymousClass33p A08;
    public final C620233e A09;
    public final C113995mK A0A;
    public final WeakReference A0B;
    public final Collection A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r6 != 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.33e r0 = r7.A09
            int r6 = r7.A00
            java.util.Collection r5 = r7.A0C
            r0.A0E(r5, r6)
            X.3FH r0 = r7.A07
            r0.A00()
            X.5mK r4 = r7.A0A
            X.1Wi r3 = new X.1Wi
            r3.<init>()
            r2 = 1
            if (r6 == 0) goto L_0x0042
            r1 = 3
            if (r6 == r2) goto L_0x003d
            r0 = 2
            if (r6 == r0) goto L_0x0047
            if (r6 == r1) goto L_0x0042
        L_0x0020:
            X.4FV r0 = r4.A08
            r0.BhD(r3)
            X.2gy r1 = r7.A06
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = new com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            r0.<init>(r5, r6)
            r1.A02(r0)
            X.33p r0 = r7.A08
            r0.A0z()
            long r2 = r7.A03
            long r0 = r7.A04
            X.C89654ea.A4P(r2, r0)
            r0 = 0
            return r0
        L_0x003d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x004b
        L_0x0042:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x004b
        L_0x0047:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x004b:
            r3.A00 = r0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33681tW.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C89654ea A0F2 = C18320x8.A0F(this.A0B);
        if (A0F2 != null && !A0F2.BHW()) {
            if (this.A0E) {
                A0F2.BjL();
            }
            int i = this.A02;
            if (i != -1) {
                this.A05.A0H(this.A01, i);
            }
            if (this.A0F) {
                A0F2.setResult(-1, C379524r.A00(A0F2.getIntent()));
            }
            if (this.A0D) {
                A0F2.finish();
            }
        } else if (this.A0E) {
            this.A05.A0D();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33681tW(C89654ea r3, C69263Wi r4, C49712gy r5, AnonymousClass3FH r6, C56612sH r7, AnonymousClass33p r8, C620233e r9, C113995mK r10, Collection collection, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        super(r3, z3);
        C18260x0.A0f(r3, r7, r4, r9, r5);
        C18260x0.A0W(r6, r10, r8);
        this.A05 = r4;
        this.A09 = r9;
        this.A06 = r5;
        this.A07 = r6;
        this.A0A = r10;
        this.A08 = r8;
        this.A00 = i;
        this.A0C = collection;
        this.A04 = j;
        this.A0E = z;
        this.A0F = z2;
        this.A02 = i2;
        this.A0D = z4;
        this.A0B = AnonymousClass0x9.A14(r3);
        this.A03 = SystemClock.elapsedRealtime();
    }
}
