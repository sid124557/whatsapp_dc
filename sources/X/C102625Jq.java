package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5Jq  reason: invalid class name and case insensitive filesystem */
public class C102625Jq {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final ImageView A04;

    public C102625Jq(Context context, ViewGroup viewGroup) {
        this.A03 = viewGroup;
        this.A00 = context;
        this.A01 = C06560Yg.A02(viewGroup, R.id.sticker_onboarding_badge);
        this.A02 = C06560Yg.A02(viewGroup, R.id.sticker_tab);
        this.A04 = AnonymousClass0x9.A0E(viewGroup, R.id.sticker_tab_icon);
    }
}
