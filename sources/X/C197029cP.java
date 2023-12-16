package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.9cP  reason: invalid class name and case insensitive filesystem */
public class C197029cP implements C203089n6 {
    public final /* synthetic */ C52792m3 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public C197029cP(C52792m3 r1, BrazilPayBloksActivity brazilPayBloksActivity) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
    }

    public void BS8(AnonymousClass9V4 r3) {
        AnonymousClass34V r0 = r3.A00;
        if (r0 == null) {
            r0 = C1899693i.A0M();
        }
        if (r0.A00 == 25554) {
            this.A01.A7A(this.A00);
        } else {
            this.A00.A00("on_failure");
        }
    }

    public void onResult(Object obj) {
        this.A01.A7A(this.A00);
    }
}
