package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5K7  reason: invalid class name */
public final class AnonymousClass5K7 {
    public final View A00;
    public final FrameLayout A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;

    public AnonymousClass5K7(View view) {
        C162457s7.A0J(view, 1);
        this.A05 = AnonymousClass0x2.A0I(view, R.id.banner_title);
        this.A04 = AnonymousClass0x2.A0I(view, R.id.banner_text);
        this.A02 = C86604Kt.A0J(view, R.id.banner_icon);
        this.A03 = C86604Kt.A0J(view, R.id.cancel);
        this.A00 = C18280x3.A0E(view, R.id.in_app_banner);
        this.A01 = (FrameLayout) C18280x3.A0E(view, R.id.banner_icon_frame);
    }
}
