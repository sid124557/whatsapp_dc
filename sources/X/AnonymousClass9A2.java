package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.9A2  reason: invalid class name */
public class AnonymousClass9A2 extends C191819Go {
    public final Context A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C56612sH A03;
    public final C40602Ha A04;
    public final AnonymousClass9U5 A05;
    public final C193859Qj A06;
    public final C194259Se A07;
    public final AnonymousClass4FS A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass39V r4;
        AnonymousClass0PJ r15 = (AnonymousClass0PJ) obj;
        String str = (String) r15.A00;
        AnonymousClass34V r2 = (AnonymousClass34V) r15.A01;
        if (str != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass39V.A03("action", "br-prelink-merchant", A0s);
            String str2 = this.A0F;
            if ("PREPAID".equals(str2)) {
                C626936e.A05(str);
                r4 = new AnonymousClass39V("card-token", str);
            } else if ("BANK".equals(str2)) {
                C626936e.A05(str);
                AnonymousClass39V.A03("bank-token", str, A0s);
                String str3 = this.A0C;
                C626936e.A05(str3);
                AnonymousClass39V.A03("bank-code", str3, A0s);
                String str4 = this.A0B;
                C626936e.A05(str4);
                AnonymousClass39V.A03("bank-branch", str4, A0s);
                String str5 = this.A0A;
                C626936e.A05(str5);
                r4 = new AnonymousClass39V("bank-account-type", str5);
            } else {
                throw AnonymousClass001.A0e("Expecting card token or bank account!");
            }
            A0s.add(r4);
            AnonymousClass39V.A03("device-id", this.A07.A01(), A0s);
            AnonymousClass39V.A03("nonce", AnonymousClass35J.A02(this.A02, this.A03), A0s);
            AnonymousClass39V.A03("verify-type", str2, A0s);
            AnonymousClass39V.A03("verify-id", this.A0E, A0s);
            this.A05.A0G(new C203889oT(this.A00, this.A04, this.A01, this, 6), C1899593h.A0T(A0s), "set", C625635p.A0L);
            return;
        }
        C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: BrazilMerchantPreLinkAction token error: ", r2);
        this.A06.A00(r2, (C193709Pr) null);
    }

    public AnonymousClass9A2(Context context, C69263Wi r9, C56972sr r10, C29441ip r11, C56612sH r12, C40602Ha r13, C620933l r14, AnonymousClass9U5 r15, C193859Qj r16, C194259Se r17, C193119Nf r18, AnonymousClass28X r19, AnonymousClass4FS r20, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(r11, r14, r15, r18, r19);
        this.A00 = context;
        this.A03 = r12;
        this.A01 = r9;
        this.A02 = r10;
        this.A08 = r20;
        this.A07 = r17;
        this.A05 = r15;
        this.A04 = r13;
        this.A0F = str;
        this.A0E = str2;
        this.A0C = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A09 = str6;
        this.A0D = str7;
        this.A06 = r16;
    }
}
