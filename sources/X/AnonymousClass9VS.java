package X;

import android.net.Uri;
import com.whatsapp.jid.UserJid;
import java.io.File;

/* renamed from: X.9VS  reason: invalid class name */
public class AnonymousClass9VS {
    public final C64393Dh A00;
    public final C29441ip A01;
    public final C56612sH A02;
    public final C55192px A03;
    public final AnonymousClass1VX A04;
    public final C55972rD A05;
    public final C620033c A06;
    public final C28131fk A07;
    public final AnonymousClass4FS A08;

    public static AnonymousClass32J A00(AnonymousClass39M r24, String str) {
        File file;
        Uri uri;
        AnonymousClass39M r3 = r24;
        String str2 = r3.A09;
        if (str2 != null) {
            if (r3.A01 == 3) {
                uri = Uri.parse(str2);
                file = null;
            } else {
                file = new File(str2);
                uri = null;
            }
            if (uri != null) {
                return AnonymousClass32J.A00(uri, (AnonymousClass32B) null, (C151027Td) null, new C157497iO(true, false, true), C633138t.A0b, r3.A04, str, 0, false, true, true);
            } else if (file != null) {
                C157497iO r0 = new C157497iO(true, false, true);
                C633138t r5 = C633138t.A0b;
                return new AnonymousClass32J(C154347d1.A00((AnonymousClass32B) null, r5, 0, true), new C47592dV((C151027Td) null, r5, r3.A04, file, (String) null, file.getName(), r3.A0D, r3.A0C, 0, 0, 0, 0, false, AnonymousClass36O.A05(r5), true, true, false, false, false, false), r0, (String) null, 0);
            }
        }
        return null;
    }

    public AnonymousClass3XA A01(AnonymousClass39R r11, C95814uZ r12, UserJid userJid, C624134x r14, AnonymousClass39M r15, Integer num) {
        AnonymousClass3XA r2 = new AnonymousClass3XA();
        if (!this.A01.A0F()) {
            r2.A05(new AnonymousClass9PL());
            return r2;
        }
        this.A08.BkM(new AnonymousClass9k5(r2, r11, r12, userJid, this, r14, r15, num));
        return r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1nE A02(X.C95814uZ r18, com.whatsapp.jid.UserJid r19, X.C624134x r20, X.AnonymousClass39M r21, java.lang.Integer r22) {
        /*
            r17 = this;
            X.33C r5 = new X.33C
            r5.<init>()
            r2 = r21
            java.lang.String r3 = r2.A09
            if (r3 == 0) goto L_0x005e
            int r1 = r2.A01
            r0 = 3
            if (r1 != r0) goto L_0x0057
            android.net.Uri r4 = android.net.Uri.parse(r3)
        L_0x0014:
            int r0 = r2.A03
            r5.A08 = r0
            int r0 = r2.A02
            r5.A06 = r0
            r0 = r17
            X.2rD r3 = r0.A05
            r14 = 0
            r13 = 20
            r6 = 0
            r10 = r6
            r11 = r6
            r12 = r6
            r16 = r14
            r7 = r18
            r8 = r20
            r9 = r6
            r15 = r14
            X.1mV r1 = r3.A04(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1nE r1 = (X.AnonymousClass1nE) r1
            boolean r0 = X.C627336j.A0K(r7)
            if (r0 == 0) goto L_0x0040
            r0 = r19
            r1.A1J(r0)
        L_0x0040:
            java.lang.String r0 = r2.A0D
            r1.A04 = r0
            java.lang.String r0 = r2.A0C
            r1.A05 = r0
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "image/webp"
            r1.A05 = r0
        L_0x004e:
            X.330 r0 = r2.A04
            r1.A04 = r0
            r0 = r22
            r1.A05 = r0
            return r1
        L_0x0057:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r5.A0F = r0
        L_0x005e:
            r4 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9VS.A02(X.4uZ, com.whatsapp.jid.UserJid, X.34x, X.39M, java.lang.Integer):X.1nE");
    }

    public void A03(AnonymousClass39R r27, C29341if r28) {
        C28131fk r8 = this.A07;
        C633138t r10 = C633138t.A0X;
        AnonymousClass39R r7 = r27;
        String str = r7.A0F;
        String str2 = r7.A04;
        String str3 = r7.A03;
        String str4 = r7.A02;
        String str5 = r7.A0G;
        byte[] bArr = r7.A08;
        byte[] bArr2 = bArr;
        String str6 = str5;
        String str7 = str4;
        r8.A08(new AnonymousClass9bC(r7, r28, this), r10, (C84134Bd) null, (C84134Bd) null, str, str2, str3, (String) null, str7, str6, bArr2, 3, 1, 1, 0, r7.A0E);
    }

    public AnonymousClass9VS(C64393Dh r1, C29441ip r2, C56612sH r3, C55192px r4, AnonymousClass1VX r5, C55972rD r6, C620033c r7, C28131fk r8, AnonymousClass4FS r9) {
        this.A02 = r3;
        this.A04 = r5;
        this.A08 = r9;
        this.A00 = r1;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = r4;
        this.A01 = r2;
    }
}
