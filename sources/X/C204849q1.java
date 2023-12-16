package X;

import java.util.ArrayList;

/* renamed from: X.9q1  reason: invalid class name and case insensitive filesystem */
public class C204849q1 implements C202689mQ {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public C204849q1(Object obj, Object obj2, String str, String str2, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = obj;
    }

    public final void BaK(C193849Qh r15) {
        if (this.A04 != 0) {
            AnonymousClass9VB r5 = (AnonymousClass9VB) this.A00;
            r5.A06.A00(new C196879bt(r5, r15, (C194189Rx) this.A01, this.A03), r15, this.A02);
            return;
        }
        AnonymousClass9VB r6 = (AnonymousClass9VB) this.A00;
        String str = this.A02;
        String str2 = this.A03;
        C194089Rn r3 = r6.A06;
        String[] strArr = new String[2];
        C18280x3.A19(str, str2, strArr);
        C196899bv r52 = new C196899bv((C202699mR) this.A01, r6, r15);
        if ("token".equals(r15.A00.A03)) {
            AnonymousClass9RT r8 = new AnonymousClass9RT(r52);
            int i = 0;
            do {
                ArrayList A0s = AnonymousClass001.A0s();
                AnonymousClass0x2.A1G("fbpay_pin", strArr[i], A0s);
                AnonymousClass4FS r0 = r3.A05;
                C193119Nf r10 = r3.A03;
                C620933l r62 = r3.A01;
                AnonymousClass28X r11 = r3.A04;
                AnonymousClass0x7.A1B(new C1908299z(r3.A00, r62, r3.A02, r8, (C202989mw) null, r10, r11, A0s, i), r0);
                i++;
            } while (i < 2);
            return;
        }
        r52.BdL(strArr);
    }
}
