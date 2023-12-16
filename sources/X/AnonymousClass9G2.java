package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.9G2  reason: invalid class name */
public class AnonymousClass9G2 extends AnonymousClass94E {
    public C620633i A00;
    public AnonymousClass1VX A01;
    public C106715a2 A02;
    public final ImageButton A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextEmojiLabel A06;
    public final WDSButton A07;
    public final WDSButton A08;

    public AnonymousClass9G2(Context context) {
        super(context);
        View A0h = C86664Kz.A0h(LayoutInflater.from(context), this, getLayoutRes());
        this.A05 = AnonymousClass002.A09(A0h, R.id.nux_title);
        this.A07 = C86654Ky.A0f(A0h, R.id.nux_cta);
        this.A08 = C86654Ky.A0f(A0h, R.id.nux_cta2);
        this.A03 = (ImageButton) C06560Yg.A02(A0h, R.id.nux_close);
        this.A04 = AnonymousClass0x9.A0E(A0h, R.id.nux_icon);
        this.A06 = AnonymousClass0x7.A0K(A0h, R.id.nux_description);
    }

    public int getLayoutRes() {
        return R.layout.f8nameremoved;
    }
}
