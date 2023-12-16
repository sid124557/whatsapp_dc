package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.53U  reason: invalid class name */
public final class AnonymousClass53U extends C88504Yz {
    public WaTextView A00;
    public WaTextView A01;
    public UpdatesFragment A02;

    public AnonymousClass53U(View view, UpdatesFragment updatesFragment) {
        super(view);
        this.A02 = updatesFragment;
        this.A01 = C86644Kx.A0O(view, R.id.title);
        WaTextView A0O = C86644Kx.A0O(view, R.id.cta_line);
        if (A0O != null) {
            C106905aM.A04(A0O);
        } else {
            A0O = null;
        }
        this.A00 = A0O;
    }
}
