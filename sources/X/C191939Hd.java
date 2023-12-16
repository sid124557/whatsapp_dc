package X;

import android.view.Window;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.9Hd  reason: invalid class name and case insensitive filesystem */
public class C191939Hd extends AnonymousClass9Hb {
    public C191939Hd(C620733j r4, WaBloksActivity waBloksActivity) {
        super(r4, waBloksActivity);
        Window window;
        int A00;
        if (C107385bE.A02() || !C1001059l.A03) {
            window = waBloksActivity.getWindow();
            A00 = AnonymousClass34K.A00(waBloksActivity);
        } else {
            window = waBloksActivity.getWindow();
            A00 = R.color.f5nameremoved;
        }
        AnonymousClass5CQ.A00(window, AnonymousClass0Y8.A04(waBloksActivity, A00), true);
    }
}
