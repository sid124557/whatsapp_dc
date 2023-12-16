package X;

import android.content.Context;

/* renamed from: X.9AV  reason: invalid class name */
public class AnonymousClass9AV extends C1908099x {
    public final /* synthetic */ AnonymousClass9RG A00;
    public final /* synthetic */ AnonymousClass9A7 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AV(Context context, C69263Wi r8, AnonymousClass9RG r9, C40602Ha r10, C153607bd r11, AnonymousClass9A7 r12, String str, String str2, boolean z) {
        super(context, r8, r10, r11, str);
        this.A01 = r12;
        this.A00 = r9;
        this.A03 = z;
        this.A02 = str2;
    }

    public void A03(AnonymousClass34V r3) {
        super.A03(r3);
        this.A00.A00(r3, this.A03);
    }

    public void A04(AnonymousClass34V r3) {
        super.A04(r3);
        this.A00.A00(r3, this.A03);
    }

    public void A05(AnonymousClass36K r6) {
        super.A05(r6);
        C194619Tt r4 = this.A01.A03;
        C166557yt A0F = C1899693i.A0F(AnonymousClass3QD.A00(), String.class, this.A02, "upiHandle");
        boolean z = this.A03;
        r4.A03(A0F, z);
        AnonymousClass9RG r2 = this.A00;
        C18260x0.A1E("PAY: IndiaUpiBlockListManager/on-success blocked: ", AnonymousClass001.A0o(), z);
        r2.A01.A02.A0K((AnonymousClass4FU) r2.A00);
        r2.A02.BaJ((AnonymousClass34V) null);
    }
}
