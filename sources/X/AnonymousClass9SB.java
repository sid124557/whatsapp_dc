package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9SB  reason: invalid class name */
public class AnonymousClass9SB {
    public final Context A00;
    public final C69263Wi A01;
    public final C40602Ha A02;
    public final AnonymousClass9U5 A03;
    public final C194089Rn A04;
    public final C194149Rt A05;
    public final AnonymousClass9VU A06;
    public final AnonymousClass9TR A07;
    public final AnonymousClass9V6 A08;
    public final C194259Se A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    public final void A00(C193849Qh r13, AnonymousClass9RM r14, String str) {
        C194089Rn r0 = this.A04;
        List list = this.A0D;
        AnonymousClass9RT r6 = new AnonymousClass9RT(new C196889bu(this, r13, r14));
        if ("token".equals(r13.A00.A03)) {
            AnonymousClass4FS r1 = r0.A05;
            C193119Nf r8 = r0.A03;
            C620933l r4 = r0.A01;
            AnonymousClass28X r9 = r0.A04;
            AnonymousClass9U5 r5 = r0.A02;
            C29441ip r3 = r0.A00;
            AnonymousClass0x7.A1B(new C1908299z(r3, r4, r5, r6, (C202989mw) null, r8, r9, list, 0), r1);
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass0x2.A1G("fbpay_pin", str, A0s);
            AnonymousClass0x7.A1B(new C1908299z(r3, r4, r5, r6, (C202989mw) null, r8, r9, A0s, 1), r1);
            return;
        }
        r6.A00(1, str);
        AnonymousClass4FS r12 = r0.A05;
        C193119Nf r82 = r0.A03;
        C620933l r42 = r0.A01;
        AnonymousClass28X r92 = r0.A04;
        AnonymousClass0x7.A1B(new C1908299z(r0.A00, r42, r0.A02, (AnonymousClass9RT) null, new AnonymousClass9W8(r6, 0, r0), r82, r92, list, -1), r12);
    }

    public AnonymousClass9SB(Context context, C69263Wi r14, C56972sr r15, C56612sH r16, C40602Ha r17, AnonymousClass9U5 r18, C194089Rn r19, AnonymousClass9VU r20, AnonymousClass9TR r21, C194259Se r22, String str, String str2, String str3, List list) {
        String str4 = str2;
        String str5 = str3;
        C626936e.A0B((TextUtils.isEmpty(str4) ^ true) != C18320x8.A1U(str5) ? false : true);
        this.A00 = context;
        this.A01 = r14;
        this.A04 = r19;
        this.A09 = r22;
        this.A07 = r21;
        AnonymousClass9U5 r9 = r18;
        this.A03 = r9;
        C40602Ha r8 = r17;
        this.A02 = r8;
        AnonymousClass9VU r10 = r20;
        this.A06 = r10;
        this.A08 = new AnonymousClass9V6(r15, r16, r9);
        this.A05 = new C194149Rt(context, r14, r8, r9, r10, "PIN");
        this.A0A = str;
        this.A0D = list;
        this.A0B = str4;
        this.A0C = str5;
    }
}
