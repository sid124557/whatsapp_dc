package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.0mb  reason: invalid class name and case insensitive filesystem */
public final class C13080mb implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C153427bI A01;
    public final /* synthetic */ AnonymousClass84O A02;
    public final /* synthetic */ AnonymousClass84O A03;
    public final /* synthetic */ Runnable A04;

    public C13080mb(View view, C153427bI r2, AnonymousClass84O r3, AnonymousClass84O r4, Runnable runnable) {
        this.A00 = view;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = runnable;
    }

    public final void run() {
        this.A00.setTag(R.id.render_lifecycle_extension_runnable, (Object) null);
        AnonymousClass84O r4 = this.A02;
        C835248t A0L = this.A03.A0L(35);
        C152057Xj r2 = new C152057Xj();
        r2.A04(r4, 0);
        C153427bI r1 = this.A01;
        r2.A04(r1, 1);
        C159377lj.A01(r1, r4, r2.A03(), A0L);
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
