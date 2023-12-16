package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.6pB  reason: invalid class name and case insensitive filesystem */
public class C137736pB extends AnonymousClass6I6 {
    public final View A00;
    public final View A01;
    public final WaTextView A02;

    public C137736pB(View view) {
        super(view);
        this.A00 = C06560Yg.A02(view, R.id.wallpaper_header_chevron_view);
        WaTextView A0L = AnonymousClass0x7.A0L(view, R.id.wallpaper_header_title);
        this.A02 = A0L;
        this.A01 = C06560Yg.A02(view, R.id.wallpaper_header_description);
        C106905aM.A04(A0L);
    }
}
