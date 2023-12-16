package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.5Jl  reason: invalid class name and case insensitive filesystem */
public class C102595Jl {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass5YB A03;
    public final WDSButton A04;

    public C102595Jl(View view, AnonymousClass64J r4) {
        this.A01 = AnonymousClass0x9.A0E(view, R.id.photo);
        this.A00 = C06560Yg.A02(view, R.id.row_container);
        this.A04 = C86654Ky.A0f(view, R.id.invite_btn);
        this.A02 = AnonymousClass0x7.A0K(view, R.id.name);
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r4, R.id.name);
        this.A03 = A002;
        AnonymousClass5YB.A02(A002);
    }
}
