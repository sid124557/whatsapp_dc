package X;

import android.content.Context;

/* renamed from: X.9A1  reason: invalid class name */
public class AnonymousClass9A1 extends C191819Go {
    public final int A00;
    public final Context A01;
    public final C69263Wi A02;
    public final C617332a A03;
    public final C40602Ha A04;
    public final AnonymousClass9U5 A05;
    public final AnonymousClass9U4 A06;
    public final C193869Qk A07;
    public final C194259Se A08;
    public final AnonymousClass4FS A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public AnonymousClass9A1(Context context, C69263Wi r9, C29441ip r10, C617332a r11, C40602Ha r12, C620933l r13, AnonymousClass9U5 r14, AnonymousClass9U4 r15, C193869Qk r16, C194259Se r17, C193119Nf r18, AnonymousClass28X r19, AnonymousClass4FS r20, String str, String str2, String str3, String str4, int i) {
        super(r10, r13, r14, r18, r19);
        this.A01 = context;
        this.A02 = r9;
        this.A09 = r20;
        this.A08 = r17;
        this.A06 = r15;
        this.A05 = r14;
        this.A03 = r11;
        this.A04 = r12;
        this.A0A = str;
        this.A0C = str2;
        this.A0B = str3;
        this.A00 = i;
        this.A0D = str4;
        this.A07 = r16;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass0PJ r14 = (AnonymousClass0PJ) obj;
        String str = (String) r14.A00;
        AnonymousClass34V r2 = (AnonymousClass34V) r14.A01;
        if (str == null) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: BrazilUpdateMerchantAccountAction token error: ", r2);
            this.A07.A00(r2);
            return;
        }
        AnonymousClass9U5 r7 = this.A05;
        AnonymousClass39V[] r3 = new AnonymousClass39V[7];
        AnonymousClass39V.A04("action", "br-update-merchant-account", r3);
        AnonymousClass39V.A05("bank-token", str, r3);
        AnonymousClass39V.A06("bank-code", this.A0C, r3);
        AnonymousClass39V.A07("bank-branch", this.A0B, r3);
        r3[4] = new AnonymousClass39V("bank-account-type", String.valueOf(this.A00));
        r3[5] = new AnonymousClass39V("device-id", this.A08.A01());
        r3[6] = new AnonymousClass39V("nonce", this.A0D);
        r7.A0G(new C203889oT(this.A01, this.A04, this.A02, this, 8), C1899693i.A0U(r3), "set", C625635p.A0L);
    }
}
