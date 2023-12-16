package X;

import android.os.Handler;
import android.view.View;

/* renamed from: X.1sd  reason: invalid class name and case insensitive filesystem */
public final class C33211sd extends C109665ez {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AnonymousClass228 A01;
    public final /* synthetic */ C52722lw A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;

    public C33211sd(Handler handler, AnonymousClass228 r2, C52722lw r3, Runnable runnable, Runnable runnable2, String str) {
        this.A00 = handler;
        this.A03 = runnable;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = str;
        this.A04 = runnable2;
    }

    public void A07(View view) {
        this.A00.removeCallbacks(this.A03);
        C52722lw r4 = this.A02;
        r4.A00((C109665ez) null, this.A05, this.A01.crosspostingUndoConfirmationText, 0);
        r4.A01.BkM(new C117105rO(this.A04, 41));
    }
}
