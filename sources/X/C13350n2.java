package X;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: X.0n2  reason: invalid class name and case insensitive filesystem */
public class C13350n2 implements Runnable {
    public static final String A06 = C06240Wu.A01("WorkForegroundRunnable");
    public final Context A00;
    public final C16130sW A01;
    public final AnonymousClass0QH A02;
    public final C06250Wv A03;
    public final AnonymousClass0BT A04 = AnonymousClass0BT.A00();
    public final C16180sb A05;

    /* access modifiers changed from: private */
    public /* synthetic */ void A01(AnonymousClass0BT r2) {
        if (!this.A04.isCancelled()) {
            r2.A08(this.A02.A08());
        } else {
            r2.cancel(true);
        }
    }

    public C188268yc A02() {
        return this.A04;
    }

    public void run() {
        if (!this.A03.A0H || Build.VERSION.SDK_INT >= 31) {
            this.A04.A09((Object) null);
            return;
        }
        AnonymousClass0BT A002 = AnonymousClass0BT.A00();
        Executor executor = ((C09160fk) this.A05).A02;
        executor.execute(new C12100ky(this, A002));
        A002.AwV(new C12110kz(this, A002), executor);
    }

    public C13350n2(Context context, C16130sW r3, AnonymousClass0QH r4, C06250Wv r5, C16180sb r6) {
        this.A00 = context;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r6;
    }
}
