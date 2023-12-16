package X;

import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1g2  reason: invalid class name */
public class AnonymousClass1g2 extends AnonymousClass1g3 implements AnonymousClass4EV, C84654De {
    public File A00;
    public final C55682qk A01;
    public final C64393Dh A02;
    public final C56352rq A03;
    public final AnonymousClass1VX A04;
    public final C620133d A05;
    public final AnonymousClass39M A06;
    public final C55732qp A07;
    public final WebpUtils A08;
    public final C72183dJ A09 = new C72183dJ();
    public final File A0A;
    public final boolean A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1g2(X.C55682qk r10, X.C64393Dh r11, X.C69263Wi r12, X.C56352rq r13, X.C56492s4 r14, X.C56612sH r15, X.C61072zf r16, X.AnonymousClass1VX r17, X.C55002pd r18, X.C620133d r19, X.C29011i8 r20, X.AnonymousClass39M r21, X.C55732qp r22, com.whatsapp.stickers.WebpUtils r23, java.io.File r24, boolean r25) {
        /*
            r9 = this;
            java.util.concurrent.Executor r8 = r12.A08
            r1 = r9
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.A04 = r5
            r0 = r21
            r9.A06 = r0
            r9.A01 = r10
            r0 = r23
            r9.A08 = r0
            r9.A02 = r11
            X.3dJ r0 = new X.3dJ
            r0.<init>()
            r9.A09 = r0
            r0 = r24
            r9.A0A = r0
            r0 = r25
            r9.A0B = r0
            r0 = r22
            r9.A07 = r0
            r0 = r19
            r9.A05 = r0
            r9.A03 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1g2.<init>(X.2qk, X.3Dh, X.3Wi, X.2rq, X.2s4, X.2sH, X.2zf, X.1VX, X.2pd, X.33d, X.1i8, X.39M, X.2qp, com.whatsapp.stickers.WebpUtils, java.io.File, boolean):void");
    }

    public C625435m B2B() {
        C620133d r2 = this.A05;
        C85904Ib r3 = new C85904Ib(this, 1);
        AnonymousClass39M r9 = this.A06;
        if (r2.A0F(r3, this, (C47662dc) null, (C30471mV) null, r9.A0D, false)) {
            try {
                return (C625435m) this.A09.get();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("DuplicateStickerDownloadListener/waitForResult ", e);
            }
        } else {
            AwR(this);
            C625435m r14 = A02().A00;
            if (AnonymousClass000.A1T(r14.A01)) {
                C55732qp r0 = this.A07;
                File file = this.A0A;
                AnonymousClass330 A022 = r0.A02(file, (String) null);
                if (!(A022 == null && (A022 = r9.A04) == null)) {
                    C106655Zv[] r15 = A022.A0B;
                    String str = A022.A02;
                    String str2 = A022.A03;
                    String str3 = A022.A05;
                    String str4 = A022.A04;
                    String str5 = A022.A01;
                    boolean z = A022.A09;
                    boolean z2 = A022.A0A;
                    String str6 = A022.A00;
                    boolean z3 = z2;
                    boolean z4 = z;
                    C106655Zv[] r23 = r15;
                    String str7 = str6;
                    String str8 = str5;
                    String str9 = str4;
                    String str10 = str3;
                    String str11 = str2;
                    String str12 = str;
                    this.A08.A03(file, new AnonymousClass330(str12, str11, str10, str9, str8, str7, r23, z4, z3, true, A022.A06, A022.A07).A02());
                }
                try {
                    String A002 = C615131b.A00(this.A01, file);
                    r9.A0A = A002;
                    r9.A0D = A002;
                    if (r9.A00 == 0) {
                        r9.A00 = (int) file.length();
                    }
                    if (!this.A0B) {
                        File A023 = this.A03.A02(r9.A0D);
                        this.A00 = A023;
                        this.A02.A0b(file, A023);
                        return r14;
                    }
                    this.A00 = file;
                    return r14;
                } catch (IOException unused) {
                    return new C625435m(9);
                }
            }
            return new C625435m(1);
        }
    }

    public /* synthetic */ void BRU(long j) {
    }

    public File B6y() {
        return this.A00;
    }

    public void BRW(boolean z) {
        C18260x0.A1D("AvatarStickerBitmapNetworkFetcher/cancelled transferred = ", AnonymousClass001.A0o(), z);
    }

    public void BRX(C625435m r3, C56902sk r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1J(A0o, C18300x5.A0k(r3, "AvatarStickerBitmapNetworkFetcher/completed result = ", A0o));
    }
}
