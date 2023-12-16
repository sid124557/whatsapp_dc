package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4wm  reason: invalid class name and case insensitive filesystem */
public final class C96694wm extends AnonymousClass6mM {
    public final TextEmojiLabel A00;
    public final WaImageView A01;
    public final AnonymousClass5OH A02;
    public final WDSButton A03;
    public final WDSButton A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96694wm(View view, AnonymousClass5OH r3) {
        super(view);
        C162457s7.A0J(r3, 2);
        this.A02 = r3;
        this.A03 = (WDSButton) view.findViewById(R.id.allow_location_btn);
        this.A04 = (WDSButton) view.findViewById(R.id.more_options_btn);
        this.A00 = C86644Kx.A0M(view, R.id.privacy_description);
        this.A01 = C86664Kz.A11(view, R.id.icon);
    }

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C136106lr r5 = (C136106lr) obj;
        C162457s7.A0J(r5, 0);
        C18300x5.A18(this.A03, r5, 4);
        C18300x5.A18(this.A04, r5, 5);
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            Context A0T = C86664Kz.A0T(this);
            String str = r5.A01;
            if (str == null) {
                str = "";
            }
            C107335b8.A0C(A0T, waImageView, C154257cs.A01(str), R.color.f5nameremoved);
        }
        TextEmojiLabel textEmojiLabel = this.A00;
        if (textEmojiLabel != null) {
            AnonymousClass5V5.A01(textEmojiLabel, this.A02, C86664Kz.A0T(this).getString(R.string.f11nameremoved));
        }
    }
}
