package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.9fd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198879fd implements Runnable {
    public final /* synthetic */ C194479Ta A00;

    public final void run() {
        C194479Ta r4 = this.A00;
        if (r4.A05.A02.A0X(1458)) {
            Context context = r4.A00.A00;
            r4.A03(context.getString(R.string.f11nameremoved), context.getString(R.string.f11nameremoved), "ALIAS_DEREGISTER", (String) null);
        }
    }

    public /* synthetic */ C198879fd(C194479Ta r1) {
        this.A00 = r1;
    }
}
