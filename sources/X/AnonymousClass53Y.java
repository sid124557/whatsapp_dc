package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;

/* renamed from: X.53Y  reason: invalid class name */
public final class AnonymousClass53Y extends C88504Yz {
    public final View A00;
    public final TextView A01;
    public final WaImageView A02;
    public final UpdatesAdapter A03;
    public final AnonymousClass4GQ A04;

    public AnonymousClass53Y(View view, UpdatesAdapter updatesAdapter, AnonymousClass4GQ r4) {
        super(view);
        this.A03 = updatesAdapter;
        this.A04 = r4;
        this.A01 = AnonymousClass002.A09(view, R.id.updates_banner_text);
        this.A00 = view.findViewById(R.id.btn_close);
        this.A02 = C86664Kz.A11(view, R.id.banner_icon);
    }
}
