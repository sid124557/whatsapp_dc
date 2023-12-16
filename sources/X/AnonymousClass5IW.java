package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5IW  reason: invalid class name */
public class AnonymousClass5IW {
    public final View A00;
    public final View A01;
    public final ImageView A02;

    public AnonymousClass5IW(ViewGroup viewGroup) {
        ImageView A0E = AnonymousClass0x9.A0E(viewGroup, R.id.emoji_tab);
        this.A02 = A0E;
        this.A00 = C06560Yg.A02(viewGroup, R.id.emoji_group_layout);
        this.A01 = C06560Yg.A02(viewGroup, R.id.pager);
        A0E.setVisibility(0);
    }
}
