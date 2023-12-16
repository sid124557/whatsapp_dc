package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1fu  reason: invalid class name and case insensitive filesystem */
public class C28221fu extends AnonymousClass1fv implements AnonymousClass4EV, C84654De {
    public final C56352rq A00;
    public final C620133d A01;
    public final AnonymousClass39M A02;
    public final C72183dJ A03;
    public final File A04;

    public C625435m B2B() {
        if (this.A01.A0F(new C85904Ib(this, 2), this, (C47662dc) null, (C30471mV) null, this.A02.A0D, false)) {
            try {
                return (C625435m) this.A03.get();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("DuplicateStickerDownloadListener/waitForResult ", e);
                return new C625435m(1);
            }
        } else {
            AwR(this);
            return A02().A00;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r1.equals("application/was") == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28221fu(X.C69263Wi r12, X.C56352rq r13, X.C56492s4 r14, X.C56612sH r15, X.C61072zf r16, X.AnonymousClass1VX r17, X.C55002pd r18, X.C620133d r19, X.C29011i8 r20, X.AnonymousClass39M r21, java.io.File r22) {
        /*
            r11 = this;
            java.util.concurrent.Executor r10 = r12.A08
            r3 = r11
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = r21
            java.lang.String r1 = r2.A0C
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "application/was"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r2.A0L = r0
            r11.A02 = r2
            X.3dJ r0 = new X.3dJ
            r0.<init>()
            r11.A03 = r0
            r0 = r22
            r11.A04 = r0
            r0 = r19
            r11.A01 = r0
            r11.A00 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28221fu.<init>(X.3Wi, X.2rq, X.2s4, X.2sH, X.2zf, X.1VX, X.2pd, X.33d, X.1i8, X.39M, java.io.File):void");
    }

    public /* synthetic */ void BRU(long j) {
    }

    public File B6y() {
        return this.A04;
    }

    public void BRW(boolean z) {
        C18260x0.A1D("StickerBitmapNetworkFetcher/cancelled transferred = ", AnonymousClass001.A0o(), z);
    }

    public void BRX(C625435m r3, C56902sk r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1J(A0o, C18300x5.A0k(r3, "StickerBitmapNetworkFetcher/completed result = ", A0o));
    }
}
