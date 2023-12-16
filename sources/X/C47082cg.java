package X;

import com.whatsapp.jid.UserJid;
import java.io.File;

/* renamed from: X.2cg  reason: invalid class name and case insensitive filesystem */
public final class C47082cg {
    public final C44672Xa A00;
    public final C64773Ex A01;
    public final C56332ro A02;
    public final C64223Cq A03;
    public final C56612sH A04;
    public final AnonymousClass31C A05;
    public final C56452s0 A06;
    public final AnonymousClass4FS A07;

    public final boolean A00(UserJid userJid) {
        File A002;
        AnonymousClass3ZH A0A = this.A01.A0A(userJid);
        int i = A0A.A05;
        if (i < 0) {
            return false;
        }
        if (i == 0 || (A002 = this.A02.A00(A0A)) == null || !A002.exists() || A002.length() == 0) {
            return true;
        }
        return false;
    }

    public C47082cg(C44672Xa r1, C64773Ex r2, C56332ro r3, C64223Cq r4, C56612sH r5, AnonymousClass31C r6, C56452s0 r7, AnonymousClass4FS r8) {
        C18260x0.A0f(r5, r8, r6, r2, r1);
        C18260x0.A0W(r3, r7, r4);
        this.A04 = r5;
        this.A07 = r8;
        this.A05 = r6;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
    }
}
