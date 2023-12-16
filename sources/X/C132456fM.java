package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.6fM  reason: invalid class name and case insensitive filesystem */
public class C132456fM extends AnonymousClass6J5 {
    public final View A00;
    public final WDSButton A01;

    public C132456fM(View view, C87614Tz r5) {
        super(view);
        this.A00 = view;
        WDSButton wDSButton = (WDSButton) C06560Yg.A02(view, R.id.button_category_see_all);
        this.A01 = wDSButton;
        wDSButton.setOnClickListener(new C109685f1((Object) r5, 37));
    }
}
