package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Map;

/* renamed from: X.9Vl  reason: invalid class name and case insensitive filesystem */
public class C194999Vl implements C202839mf {
    public Object A00;
    public Object A01;
    public final int A02;

    public C194999Vl(C52792m3 r1, BrazilPayBloksActivity brazilPayBloksActivity, int i) {
        this.A02 = i;
        this.A00 = brazilPayBloksActivity;
        this.A01 = r1;
    }

    public final void BTe(int i) {
        int i2 = this.A02;
        C52792m3 r1 = (C52792m3) this.A01;
        if (i2 == 0 && i == 0) {
            r1.A00("on_success");
        } else {
            AnonymousClass9Bw.A0c(r1, (Map) null, i);
        }
    }
}
