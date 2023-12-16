package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.53X  reason: invalid class name */
public final class AnonymousClass53X extends C88504Yz {
    public final View A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final C102335Il A03;
    public final UpdatesFragment A04;

    public AnonymousClass53X(View view, C102335Il r3, UpdatesFragment updatesFragment) {
        super(view);
        this.A04 = updatesFragment;
        this.A03 = r3;
        this.A00 = view.findViewById(R.id.advertise_banner_container);
        this.A02 = C86644Kx.A0O(view, R.id.title_text_view);
        this.A01 = C86644Kx.A0O(view, R.id.subtitle_text_view);
    }
}
