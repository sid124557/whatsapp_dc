package X;

import android.os.Handler;
import android.view.View;
import java.util.List;

/* renamed from: X.54B  reason: invalid class name */
public final class AnonymousClass54B extends C109665ez {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AnonymousClass5JT A01;
    public final /* synthetic */ C105945Xa A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public AnonymousClass54B(Handler handler, AnonymousClass5JT r2, C105945Xa r3, Integer num, Runnable runnable, String str, List list) {
        this.A02 = r3;
        this.A00 = handler;
        this.A06 = list;
        this.A04 = runnable;
        this.A01 = r2;
        this.A03 = num;
        this.A05 = str;
    }

    public void A07(View view) {
        C105945Xa r4 = this.A02;
        Handler handler = this.A00;
        List list = this.A06;
        handler.removeCallbacks(this.A04);
        r4.A04.BkM(new C70163a3(r4, 5, list));
        AnonymousClass5JT r0 = this.A01;
        r0.A02.A07(r0.A01, r0.A03);
        ((C105695Wa) C18300x5.A0b(r4.A06)).A01((Boolean) null, this.A03, (Integer) null, (Integer) null, this.A05, list, 2, true);
        C183538qC r3 = r4.A09;
        C111135hb.A00(C86654Ky.A0g(r4.A07), C105945Xa.A0A, C86644Kx.A0c(r3));
        C86644Kx.A0c(r3).A04("TAP_UNDO");
    }
}
