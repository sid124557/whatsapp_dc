package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9RL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RL {
    public final /* synthetic */ C52792m3 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public final void A00(AnonymousClass34V r8, AnonymousClass99I r9) {
        int i;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        String str = this.A02;
        C52792m3 r4 = this.A00;
        if (r8 == null) {
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("remaining_validates", String.valueOf(1));
            C56612sH r1 = brazilPayBloksActivity.A06;
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            } else {
                i = 60;
            }
            A0t.put("next_resend_ts", String.valueOf((long) Math.ceil(((double) (r1.A0H() + ((long) (i * 1000)))) / 1000.0d)));
            if (r9 != null) {
                A0t.put("verified_state", C1899693i.A0Z(r9.A0a ? 1 : 0));
                AnonymousClass9U4.A00(brazilPayBloksActivity.A0F).A03(new AnonymousClass9WS(A0t, 14, r4), r9.A07());
                return;
            }
            r4.A01("on_success", A0t);
            return;
        }
        AnonymousClass9Bw.A0c(r4, (Map) null, r8.A00);
    }

    public /* synthetic */ AnonymousClass9RL(C52792m3 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = str;
        this.A00 = r1;
    }
}
