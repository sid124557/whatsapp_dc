package X;

import android.os.Handler;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.54C  reason: invalid class name */
public final class AnonymousClass54C extends C109665ez {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C105945Xa A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public AnonymousClass54C(Handler handler, C105945Xa r2, Integer num, Runnable runnable, String str, String str2, List list) {
        this.A01 = r2;
        this.A00 = handler;
        this.A06 = list;
        this.A03 = runnable;
        this.A05 = str;
        this.A02 = num;
        this.A04 = str2;
    }

    public void A07(View view) {
        C105945Xa r9 = this.A01;
        Handler handler = this.A00;
        List list = this.A06;
        handler.removeCallbacks(this.A03);
        r9.A04.BkM(new C70163a3(r9, 5, list));
        r9.A01((C109665ez) null, this.A05, R.string.f11nameremoved, 0, false);
        ((C105695Wa) C18300x5.A0b(r9.A06)).A01((Boolean) null, this.A02, (Integer) null, (Integer) null, this.A04, list, 2, false);
        C183538qC r3 = r9.A09;
        C111135hb.A00(C86654Ky.A0g(r9.A07), C105945Xa.A0A, C86644Kx.A0c(r3));
        C86644Kx.A0c(r3).A04("TAP_UNDO");
    }
}
