package X;

import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2pi  reason: invalid class name and case insensitive filesystem */
public class C55052pi {
    public final C116985rC A00;
    public final C48352el A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final C64773Ex A04;
    public final C29421in A05;
    public final C56332ro A06;
    public final C54412og A07;
    public final C66543Lv A08;
    public final C56152rV A09;
    public final C45602aH A0A;

    public void A00(AnonymousClass3ZH r3, int i, int i2) {
        boolean A082 = C56972sr.A08(this.A03, r3);
        r3.A05 = i;
        r3.A06 = i2;
        if (A082) {
            C18270x1.A0h(C54412og.A00(this.A07).putInt("profile_photo_full_id", i), "profile_photo_thumb_id", i2);
            return;
        }
        r3.A0C = System.currentTimeMillis();
        this.A04.A0P(r3);
    }

    public void A01(AnonymousClass3ZH r3, byte[] bArr, byte[] bArr2) {
        try {
            C56332ro r1 = this.A06;
            r1.A05(r3, bArr, true);
            r1.A05(r3, bArr2, false);
        } catch (IOException e) {
            Log.e("ContactPhotoUpdater/updatePhotoFiles", e);
        }
    }

    public void A02(C95814uZ r4) {
        this.A01.A01(new C70203a7(this, 17, r4));
    }

    public void A03(AnonymousClass2T0 r4) {
        this.A01.A01(new C70203a7(this, 19, r4));
    }

    public C55052pi(C116985rC r1, C48352el r2, C69263Wi r3, C56972sr r4, C64773Ex r5, C29421in r6, C56332ro r7, C54412og r8, C66543Lv r9, C56152rV r10, C45602aH r11) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A05 = r6;
        this.A0A = r11;
        this.A09 = r10;
        this.A00 = r1;
        this.A06 = r7;
        this.A08 = r9;
        this.A07 = r8;
    }
}
