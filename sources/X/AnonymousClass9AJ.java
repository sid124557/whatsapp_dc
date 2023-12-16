package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.9AJ  reason: invalid class name */
public class AnonymousClass9AJ extends AnonymousClass9OC {
    public C203029n0 A00;
    public final Context A01;
    public final C69263Wi A02;
    public final C617332a A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass31C A05;
    public final AnonymousClass9U1 A06;
    public final C40602Ha A07;
    public final AnonymousClass9U4 A08;
    public final C197109ca A09;
    public final AnonymousClass9B3 A0A;

    public AnonymousClass9AJ(Context context, C69263Wi r3, C617332a r4, AnonymousClass1VX r5, AnonymousClass31C r6, AnonymousClass9U1 r7, C40602Ha r8, AnonymousClass9U5 r9, AnonymousClass9U4 r10, C203029n0 r11, C197109ca r12, AnonymousClass9B3 r13) {
        super(r7.A04, r9);
        this.A04 = r5;
        this.A01 = context;
        this.A02 = r3;
        this.A05 = r6;
        this.A08 = r10;
        this.A06 = r7;
        this.A03 = r4;
        this.A09 = r12;
        this.A07 = r8;
        this.A0A = r13;
        this.A00 = r11;
    }

    public void A00(String str, String str2, boolean z, boolean z2) {
        Log.i("PAY: IndiaUpiPaymentSetup sendGetBanksList called");
        C197109ca r13 = this.A09;
        r13.A08((AnonymousClass34V) null, 4, 0);
        C153607bd r11 = this.A00;
        r11.A03("upi-get-banks");
        AnonymousClass31C r4 = this.A05;
        String A032 = r4.A03();
        boolean z3 = z;
        String A0Z = C1899693i.A0Z(z3 ? 1 : 0);
        C35371wl A0X = C1899693i.A0X(A032);
        AnonymousClass9B3 r14 = null;
        C56052rL A012 = C56052rL.A01();
        C56052rL.A0E(A012, "xmlns", "w:pay");
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-get-banks");
        C56052rL.A0D(A0U, "version", "2");
        String str3 = str2;
        if (str2 != null && C1899693i.A0z(str3, 1, true)) {
            C56052rL.A0D(A0U, "provider-type", str3);
        }
        A0U.A0K(A0Z, "popular-banks", C192129Ih.A01);
        A0U.A0K(str, "account-type", C192129Ih.A00);
        AnonymousClass36K A033 = C41032Ir.A03(A0U, A012, A0X);
        boolean A0X2 = this.A04.A0X(2227);
        String str4 = "in_upi_get_banks_tag";
        if (A0X2) {
            this.A0A.A02(185478219, str4);
        }
        Context context = this.A01;
        C69263Wi r9 = this.A02;
        C40602Ha r10 = this.A07;
        if (A0X2) {
            r14 = this.A0A;
        } else {
            str4 = null;
        }
        C1899593h.A1C(r4, new AnonymousClass9AR(context, r9, r10, r11, this, r13, r14, str4, z2, z3), A033, A032);
    }

    public void A01(String str, boolean z, String str2) {
        Log.i("PAY: IndiaUpiPaymentSetup createPaymentAccountBatch called");
        C197109ca r13 = this.A09;
        r13.A08((AnonymousClass34V) null, 3, 0);
        C153607bd r11 = this.A00;
        r11.A03("upi-batch");
        AnonymousClass31C r4 = this.A05;
        String A032 = r4.A03();
        boolean z2 = z;
        String A0Z = C1899693i.A0Z(z2 ? 1 : 0);
        AnonymousClass9IP r7 = new AnonymousClass9IP(A032);
        AnonymousClass9B3 r14 = null;
        C56052rL A012 = C56052rL.A01();
        C56052rL.A0E(A012, "xmlns", "w:pay");
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-batch");
        C56052rL.A0D(A0U, "version", "2");
        String str3 = str2;
        if (str2 != null && C1899693i.A0z(str3, 1, true)) {
            C56052rL.A0D(A0U, "provider-type", str3);
        }
        A0U.A0K(A0Z, "popular-banks", C192119Ig.A01);
        A0U.A0K(str, "account-type", C192119Ig.A00);
        AnonymousClass36K A033 = C41032Ir.A03(A0U, A012, r7);
        boolean A0X = this.A04.A0X(2227);
        String str4 = "in_upi_batch_tag";
        if (A0X) {
            this.A0A.A02(185468726, str4);
        }
        Context context = this.A01;
        C69263Wi r9 = this.A02;
        C40602Ha r10 = this.A07;
        if (A0X) {
            r14 = this.A0A;
        } else {
            str4 = null;
        }
        C1899593h.A1C(r4, new AnonymousClass9AQ(context, r9, r10, r11, this, r13, r14, str4, z2), A033, A032);
    }
}
