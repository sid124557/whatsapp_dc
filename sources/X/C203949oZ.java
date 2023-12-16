package X;

import android.content.Context;

/* renamed from: X.9oZ  reason: invalid class name and case insensitive filesystem */
public class C203949oZ extends C1907999w {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203949oZ(Context context, C69263Wi r2, C40602Ha r3, C202699mR r4, AnonymousClass9VB r5, C193849Qh r6, String str, int i) {
        super(context, r2, r3, r4);
        this.A03 = i;
        this.A00 = r5;
        this.A02 = str;
        this.A01 = r6;
    }

    public void A06(AnonymousClass34V r5) {
        int i = this.A03;
        AnonymousClass9VB r3 = (AnonymousClass9VB) this.A00;
        if (i != 0) {
            if (r5 == null) {
                r3.A08.A07("deleteFingerprint success");
                r3.A09.A03();
                return;
            }
            r3.A08.A07(AnonymousClass000.A0P(r5, "deleteFingerprint error: ", AnonymousClass001.A0o()));
            int i2 = r5.A00;
            if (i2 == 1441) {
                r3.A09.A04(this.A02);
                r3.A0A.A02(r5.A02);
                return;
            } else if (!(i2 == 1440 || i2 == 445)) {
                if (i2 == 1448) {
                    r3.A09.A04(this.A02);
                    r3.A07.A02(r5, ((C193849Qh) this.A01).A00.A05, "PIN");
                    return;
                }
                return;
            }
        } else if (r5 == null) {
            r3.A08.A07("setFingerprintFromPin success");
        } else {
            r3.A08.A07(AnonymousClass000.A0P(r5, "setFingerprintFromPin error: ", AnonymousClass001.A0o()));
            r3.A09.A03();
            int i3 = r5.A00;
            if (i3 != 1441) {
                if (i3 != 1448) {
                    return;
                }
                r3.A07.A02(r5, ((C193849Qh) this.A01).A00.A05, "PIN");
                return;
            }
            r3.A0A.A02(r5.A02);
            return;
        }
        r3.A09.A04(this.A02);
    }
}
