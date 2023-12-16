package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.9dF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C197489dF implements C202809mc {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ AnonymousClass39L A01;
    public final /* synthetic */ AnonymousClass9dP A02;
    public final /* synthetic */ AnonymousClass4DV A03;
    public final /* synthetic */ String A04;

    public final void Avp(String str) {
        AnonymousClass9dP r3 = this.A02;
        AnonymousClass4DV r10 = this.A03;
        C89644eZ r7 = this.A00;
        AnonymousClass39L r2 = this.A01;
        String str2 = this.A04;
        C197419d8 r5 = r3.A02;
        r5.A0A = str;
        r5.A0W.A03(r10, str, 10);
        AnonymousClass9U0 r6 = r5.A08;
        AnonymousClass213 r9 = AnonymousClass213.NONE;
        r5.A01(r9, r6.A01(r7, (C624034w) null, r9, r10, (List) null));
        if ("WhatsappPay".equals(str) || "p2m_lite".equals(str)) {
            r7.Bp9(R.string.f11nameremoved);
            r3.A00(r2, r10, str2);
        }
    }

    public /* synthetic */ C197489dF(C89644eZ r1, AnonymousClass39L r2, AnonymousClass9dP r3, AnonymousClass4DV r4, String str) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = str;
    }
}
