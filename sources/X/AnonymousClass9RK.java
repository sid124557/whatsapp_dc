package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.9RK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RK {
    public final /* synthetic */ C52792m3 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public final void A00(C133736hr r7, AnonymousClass34V r8) {
        int i;
        int i2;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        C52792m3 r5 = this.A00;
        String str = this.A02;
        if (r8 != null || r7 == null) {
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("remaining_validates", String.valueOf(1));
            C56612sH r1 = brazilPayBloksActivity.A06;
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            } else {
                i = 60;
            }
            A0t.put("next_resend_ts", String.valueOf((long) Math.ceil(((double) (r1.A0H() + ((long) (i * 1000)))) / 1000.0d)));
            if (r8 != null) {
                i2 = r8.A00;
            } else {
                i2 = 0;
            }
            AnonymousClass9Bw.A0c(r5, A0t, i2);
            return;
        }
        r5.A00("on_success");
    }

    public /* synthetic */ AnonymousClass9RK(C52792m3 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
        this.A02 = str;
    }
}
