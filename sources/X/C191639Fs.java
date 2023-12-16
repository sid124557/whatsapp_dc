package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9Fs  reason: invalid class name and case insensitive filesystem */
public class C191639Fs extends AnonymousClass9H3 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final /* synthetic */ C191589Fm A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C191639Fs(C191589Fm r2, String str, String str2, String str3, boolean z) {
        super(r2, (AnonymousClass2z0) null, str, z);
        this.A03 = r2;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public C193629Pj A0G() {
        long j;
        boolean equalsIgnoreCase;
        boolean equalsIgnoreCase2;
        if (this.A00 != null) {
            C193629Pj A0G = super.A0G();
            AnonymousClass1S4 r5 = A0G.A01.A0A;
            if (r5 instanceof AnonymousClass99L) {
                AnonymousClass99L r52 = (AnonymousClass99L) r5;
                if (r52.A0G != null) {
                    String str = this.A01;
                    C85204Fi r4 = C191589Fm.A0K;
                    AnonymousClass39Q A0B = C1899693i.A0B(r4, str);
                    C626936e.A06(A0B);
                    C191589Fm r2 = this.A03;
                    AnonymousClass39L A002 = r2.A01.A00(r4, A0B);
                    r52.A0G.A0C = new C195109Vz(A002, C161527pr.A00(str, "money"), r2.A02.A03(this.A02, false));
                }
            }
            return A0G;
        }
        C60042xu r6 = new C60042xu();
        C191589Fm r0 = this.A03;
        String str2 = r0.A0A;
        if (str2 != null) {
            j = ((long) Float.parseFloat(str2)) * 100;
        } else {
            j = 0;
        }
        r6.A01 = j;
        C85204Fi r14 = C191589Fm.A0K;
        r6.A02 = r14;
        r6.A00 = 100;
        AnonymousClass39L A012 = r6.A01();
        String str3 = ((AnonymousClass3H6) r14).A04;
        AnonymousClass39Q r15 = A012.A02;
        C56612sH r1 = r0.A00;
        C624034w r13 = new C624034w(r14, r15, (UserJid) null, (UserJid) null, str3, (String) null, (String) null, (String) null, (String) null, (String) null, "IN", 40, 115, 1, 1, 0, r1.A0H(), r1.A0H());
        AnonymousClass99L r62 = new AnonymousClass99L();
        r62.A0h(r0.A09);
        r62.A0O = r0.A0J;
        AnonymousClass9WN r7 = r0.A02;
        String str4 = r0.A0I;
        r62.A04 = r7.A03(str4, false);
        r62.A0M = r0.A08;
        String str5 = r0.A0E;
        if (str5 == null) {
            equalsIgnoreCase = true;
        } else {
            equalsIgnoreCase = "Y".equalsIgnoreCase(str5);
        }
        String str6 = r0.A0F;
        if (str6 == null) {
            equalsIgnoreCase2 = true;
        } else {
            equalsIgnoreCase2 = "Y".equalsIgnoreCase(str6);
        }
        long A032 = r7.A03(str4, true);
        long A033 = r7.A03(r0.A0H, false);
        String str7 = r0.A03;
        if (str7 == null) {
            str7 = "MAX";
        }
        r62.A0G = new AnonymousClass9W2(str7, r0.A0G, r0.A07, r0.A0B, str2, r0.A05, r0.A0D, r0.A0C, r0.A0D, r0.A06, A032, A033, equalsIgnoreCase, equalsIgnoreCase2);
        r13.A0A = r62;
        return new C193629Pj((C166587yw) null, r13, (C624134x) null, (C30791n7) null, false);
    }
}
