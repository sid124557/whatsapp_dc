package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.9R3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9R3 {
    public final /* synthetic */ C52792m3 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public final void A00(C133736hr r9, AnonymousClass34V r10, ArrayList arrayList, boolean z) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        C52792m3 r3 = this.A00;
        if (r10 == null) {
            brazilPayBloksActivity.A7D(r3, r9, (String) null, arrayList, z);
            return;
        }
        int i = r10.A01;
        HashMap A0t = AnonymousClass001.A0t();
        if (i >= 0) {
            A0t.put("remaining_retries", String.valueOf(i));
        }
        AnonymousClass9Bw.A0c(r3, A0t, r10.A00);
    }

    public /* synthetic */ AnonymousClass9R3(C52792m3 r1, BrazilPayBloksActivity brazilPayBloksActivity) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
    }
}
