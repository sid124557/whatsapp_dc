package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4Qr  reason: invalid class name and case insensitive filesystem */
public final class C87394Qr extends LinearLayout implements AnonymousClass4GJ {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public WaTextView A02;
    public C116855qy A03;
    public boolean A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public C87394Qr(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        setId(R.id.member_suggested_groups_container);
        C18310x6.A15(this);
        setBackgroundResource(R.drawable.selector_orange_gradient);
        setOrientation(0);
        C86614Ku.A15(getResources(), this, R.dimen.f6nameremoved);
        this.A01 = C86664Kz.A11(this, R.id.member_suggested_groups_icon);
        this.A02 = C86644Kx.A0O(this, R.id.member_suggested_groups_title);
        this.A00 = C86644Kx.A0M(this, R.id.member_suggested_groups_description);
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            waImageView.setImageResource(R.drawable.vec_ic_member_suggested_groups);
        }
    }
}
