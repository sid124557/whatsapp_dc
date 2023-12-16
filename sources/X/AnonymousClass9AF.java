package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.9AF  reason: invalid class name */
public class AnonymousClass9AF extends AnonymousClass9OC {
    public AnonymousClass99H A00;
    public C202629mK A01;
    public final Context A02;
    public final C69263Wi A03;
    public final C617332a A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass31C A06;
    public final C196629bS A07;
    public final C1906899l A08;
    public final C40602Ha A09;
    public final AnonymousClass9U4 A0A;
    public final C197109ca A0B;
    public final AnonymousClass9B3 A0C;
    public final C194259Se A0D;

    public AnonymousClass9AF(Context context, C69263Wi r3, C617332a r4, AnonymousClass1VX r5, AnonymousClass31C r6, AnonymousClass9U1 r7, C196629bS r8, C1906899l r9, C40602Ha r10, AnonymousClass9U5 r11, AnonymousClass9U4 r12, C202629mK r13, C197109ca r14, AnonymousClass9B3 r15, C194259Se r16) {
        super(r7.A04, r11);
        this.A02 = context;
        this.A05 = r5;
        this.A03 = r3;
        this.A06 = r6;
        this.A0D = r16;
        this.A0A = r12;
        this.A08 = r9;
        this.A04 = r4;
        this.A09 = r10;
        this.A07 = r8;
        this.A0B = r14;
        this.A0C = r15;
        this.A01 = r13;
    }

    public void A00(AnonymousClass99H r28, C202709mS r29, boolean z, boolean z2) {
        Log.i("PAY: IndiaUpiPaymentSetup registerVpa called");
        C153607bd r0 = this.A00;
        C153607bd r26 = r0;
        r0.A03("upi-register-vpa");
        AnonymousClass31C r25 = this.A06;
        String A032 = r25.A03();
        String A012 = this.A0D.A01();
        AnonymousClass99H r11 = r28;
        String str = (String) C1899593h.A0X(r11.A06);
        String A072 = this.A07.A07();
        String str2 = (String) C1899593h.A0X(r11.A09);
        String str3 = r11.A0F;
        String str4 = "1";
        String str5 = "0";
        if (z) {
            str5 = str4;
        }
        if (!z2) {
            str4 = "0";
        }
        AnonymousClass9IP r12 = new AnonymousClass9IP(A032);
        AnonymousClass9B3 r4 = null;
        C56052rL A013 = C56052rL.A01();
        C1899593h.A1M(A013);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-register-vpa");
        if (C1899593h.A1Z(A012, 1, false)) {
            C56052rL.A0D(A0U, "device-id", A012);
        }
        if (C626836d.A0M(str, 1, 100000, false)) {
            C56052rL.A0D(A0U, "upi-bank-info", str);
        }
        if (A072 != null && C1899693i.A0z(A072, 1, true)) {
            C56052rL.A0D(A0U, "provider-type", A072);
        }
        if (str2 != null && C1899593h.A1b(str2, true)) {
            C56052rL.A0D(A0U, "vpa", str2);
        }
        if (str3 != null && C1899593h.A1Y(str3, 1, true)) {
            C56052rL.A0D(A0U, "vpa-id", str3);
        }
        A0U.A0L(str5, "default-debit", C192159Ik.A02);
        A0U.A0L(str4, "default-credit", C192159Ik.A00);
        A0U.A0K("0", "default-debit-p2m", C192159Ik.A01);
        AnonymousClass36K A033 = C41032Ir.A03(A0U, A013, r12);
        this.A00 = r11;
        C197109ca r6 = this.A0B;
        r6.A08((AnonymousClass34V) null, 5, 0);
        boolean A0X = this.A05.A0X(2227);
        String str6 = "in_upi_register_tag";
        if (A0X) {
            this.A0C.A02(185475893, str6);
        }
        Context context = this.A02;
        C69263Wi r112 = this.A03;
        C40602Ha r02 = this.A09;
        if (A0X) {
            r4 = this.A0C;
        } else {
            str6 = null;
        }
        C1899593h.A1C(r25, new C203929oX(context, r112, r02, r26, this, r6, r29, r4, str6), A033, A032);
    }
}
