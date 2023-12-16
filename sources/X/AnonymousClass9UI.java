package X;

import android.util.Pair;
import java.security.Key;

/* renamed from: X.9UI  reason: invalid class name */
public class AnonymousClass9UI implements C202989mw {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass9UI(C202699mR r1, AnonymousClass9VB r2, C193849Qh r3, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r1;
    }

    public void BS6(AnonymousClass34V r2) {
        ((C202699mR) this.A01).BaJ(r2);
    }

    public void BdD(String str) {
        String str2 = str;
        if (this.A03 != 0) {
            AnonymousClass9VB r11 = (AnonymousClass9VB) this.A00;
            C193849Qh r12 = (C193849Qh) this.A02;
            String A022 = r11.A09.A02(2);
            AnonymousClass9V6 r1 = r11.A01;
            C203949oZ r6 = new C203949oZ(r11.A04.A00, r11.A02, r11.A05, (C202699mR) this.A01, r11, r12, A022, 1);
            byte[] A012 = AnonymousClass9V6.A01(Boolean.TRUE, str2, "DELETEBIO", (String) null, (byte[]) null, new Object[0], C56612sH.A00(r1.A01));
            AnonymousClass39V[] r3 = new AnonymousClass39V[1];
            AnonymousClass39V.A0B("action", "delete-payment-bio", r3, 0);
            C193849Qh.A00(r12, r1, r6, A012, r3);
            return;
        }
        AnonymousClass9VB r10 = (AnonymousClass9VB) this.A00;
        C193849Qh r112 = (C193849Qh) this.A02;
        C202699mR r9 = (C202699mR) this.A01;
        AnonymousClass9W3 r2 = r10.A09;
        try {
            Pair A0C = AnonymousClass0x9.A0C(r2.A02(2), AnonymousClass9LM.A00());
            Object obj = A0C.second;
            if (obj != null) {
                r10.A08.A07("[Set Touch ID] success");
                AnonymousClass9V6 r0 = r10.A01;
                byte[] encoded = ((Key) obj).getEncoded();
                C203949oZ r5 = new C203949oZ(r10.A04.A00, r10.A02, r10.A05, r9, r10, r112, (String) A0C.first, 0);
                byte[] A013 = AnonymousClass9V6.A01(Boolean.TRUE, str2, "SETBIO", (String) null, encoded, new Object[0], C56612sH.A00(r0.A01));
                AnonymousClass39V[] r32 = new AnonymousClass39V[1];
                AnonymousClass39V.A0B("action", "set-payment-bio", r32, 0);
                C193849Qh.A00(r112, r0, r5, A013, r32);
                return;
            }
            r10.A08.A07("[Set Touch ID] failure");
        } catch (RuntimeException e) {
            r2.A02(0);
            throw e;
        }
    }
}
