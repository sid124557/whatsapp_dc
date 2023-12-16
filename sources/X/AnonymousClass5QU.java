package X;

import android.content.Context;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5QU  reason: invalid class name */
public class AnonymousClass5QU {
    public final C111095hX A00;
    public final C55682qk A01;
    public final C64773Ex A02;
    public final C64223Cq A03;
    public final C56612sH A04;
    public final C53412n3 A05;

    public void A00(Context context, C109065e1 r11) {
        C64773Ex r6 = this.A02;
        String str = r11.A0F;
        C106405Yw r7 = C95814uZ.A00;
        AnonymousClass3ZH A002 = C64773Ex.A00(r6, r7.A05(str));
        try {
            if (AnonymousClass0x9.A1N(C111095hX.A03(context, BusinessApiSearchActivity.class).getIntent(), "directory_source")) {
                C53412n3.A00(this.A05, C86624Kv.A0U(str), "directory");
            } else {
                C53412n3.A00(this.A05, C86624Kv.A0U(str), "biz_search");
            }
        } catch (IllegalStateException e) {
            this.A01.A0A("ContactBusinessUtil/startMessageBusiness", true, e.getMessage());
            Log.e("This method is expected to be called from BusinessApiSearch context, therefore no entrypoint conversion is stored", e);
        }
        this.A03.A0A(C64773Ex.A00(r6, r7.A05(str)));
        this.A00.A0B(context, C627736r.A0N(context, A002));
    }

    public AnonymousClass5QU(C111095hX r1, C55682qk r2, C64773Ex r3, C64223Cq r4, C56612sH r5, C53412n3 r6) {
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
    }
}
