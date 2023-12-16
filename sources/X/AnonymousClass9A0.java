package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.9A0  reason: invalid class name */
public class AnonymousClass9A0 extends C191819Go {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final C69263Wi A03;
    public final C617332a A04;
    public final C40602Ha A05;
    public final AnonymousClass9U5 A06;
    public final AnonymousClass9U4 A07;
    public final AnonymousClass9TJ A08;
    public final AnonymousClass9R3 A09;
    public final AnonymousClass4FS A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public AnonymousClass9A0(Context context, C69263Wi r9, C29441ip r10, C617332a r11, C40602Ha r12, C620933l r13, AnonymousClass9U5 r14, AnonymousClass9U4 r15, AnonymousClass9TJ r16, AnonymousClass9R3 r17, C193119Nf r18, AnonymousClass28X r19, AnonymousClass4FS r20, String str, String str2, String str3, int i, int i2) {
        super(r10, r13, r14, r18, r19);
        this.A02 = context;
        this.A03 = r9;
        this.A0A = r20;
        this.A07 = r15;
        this.A08 = r16;
        this.A06 = r14;
        this.A04 = r11;
        this.A05 = r12;
        this.A0C = str;
        this.A0D = str2;
        this.A09 = r17;
        this.A0B = str3;
        this.A01 = i;
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass0PJ r0 = (AnonymousClass0PJ) obj;
        String str = (String) r0.A00;
        AnonymousClass34V r2 = (AnonymousClass34V) r0.A01;
        if (str == null) {
            this.A09.A00((C133736hr) null, r2, (ArrayList) null, false);
            return;
        }
        AnonymousClass9U5 r11 = this.A06;
        String A032 = r11.A07.A03();
        String str2 = this.A0B;
        String str3 = this.A0D;
        Locale locale = Locale.US;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1P(A0L, this.A00, 0);
        String format = String.format(locale, "%02d", A0L);
        String num = Integer.toString(this.A01);
        C35351wj r4 = new C35351wj(A032, 18);
        C56052rL A012 = C56052rL.A01();
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "retokenize-card");
        if (C1899593h.A1b(str2, false)) {
            C56052rL.A0D(A0U, "credential_id", str2);
        }
        C1899593h.A1N(A0U, str3);
        if (C626836d.A0M(format, 2, 2, false)) {
            C56052rL.A0D(A0U, "card_expiry_month", format);
        }
        if (C626836d.A0M(num, 4, 4, false)) {
            C56052rL.A0D(A0U, "card_expiry_year", num);
        }
        if (C1899693i.A10(str, 1, false)) {
            C56052rL.A0D(A0U, "token", str);
        }
        r11.A0F(new C203889oT(this.A02, this.A05, this.A03, this, 7), C41032Ir.A03(A0U, A012, r4), A032, C625635p.A0L);
    }
}
