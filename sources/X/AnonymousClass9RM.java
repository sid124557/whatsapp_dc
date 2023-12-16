package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.9RM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RM {
    public final /* synthetic */ C52792m3 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public final void A00(AnonymousClass34V r10) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        String str = this.A02;
        C52792m3 r4 = this.A00;
        if (r10 != null) {
            int i = r10.A01;
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("remaining_retries", String.valueOf(i));
            C1899693i.A0v(A0t, r10.A00);
            if (i >= 0) {
                C194569Tl A002 = AnonymousClass9U4.A00(brazilPayBloksActivity.A0F);
                AnonymousClass9NK r6 = new AnonymousClass9NK(i);
                AnonymousClass9WS r3 = new AnonymousClass9WS(A0t, 13, r4);
                AnonymousClass4FS r7 = A002.A03;
                C18270x1.A0w(new AnonymousClass99A(r3, A002.A01, A002.A02, r6, r7, str), r7);
                return;
            }
            r4.A01("on_failure", A0t);
            return;
        }
        r4.A00("on_success");
    }

    public /* synthetic */ AnonymousClass9RM(C52792m3 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = str;
        this.A00 = r1;
    }
}
