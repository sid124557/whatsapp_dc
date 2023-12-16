package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9R5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9R5 {
    public final /* synthetic */ BrazilPayBloksActivity A00;
    public final /* synthetic */ String A01;

    public final void A00(AnonymousClass34V r5) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A00;
        String str = this.A01;
        C52792m3 r2 = brazilPayBloksActivity.A01;
        if (r2 == null) {
            Log.i("PAY: BrazilPayBloksActivity onActivityResult - appToAppBloksCallback is null!");
        } else if (r5 != null) {
            AnonymousClass9Bw.A0c(r2, (Map) null, r5.A00);
        } else {
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("app_to_app_authorization_code", str);
            brazilPayBloksActivity.A01.A01("on_success", A0t);
        }
    }

    public /* synthetic */ AnonymousClass9R5(BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A00 = brazilPayBloksActivity;
        this.A01 = str;
    }
}
