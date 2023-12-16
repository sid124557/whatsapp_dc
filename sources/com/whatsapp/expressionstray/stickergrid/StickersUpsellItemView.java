package com.whatsapp.expressionstray.stickergrid;

import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass5Yj;
import X.C06560Yg;
import X.C162457s7;
import X.C175728Zm;
import X.C18290x4;
import X.C18300x5;
import X.C18330xA;
import X.C378924l;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;

public final class StickersUpsellItemView extends ConstraintLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickersUpsellItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        setBackgroundResource(R.drawable.stickers_upsell_ripple_background);
        C06560Yg.A02(this, R.id.stickers_upsell_close).setVisibility(0);
        C06560Yg.A02(this, R.id.stickers_upsell_image).setVisibility(8);
        C06560Yg.A02(this, R.id.stickers_upsell_new).setVisibility(8);
        C18300x5.A0G(this, R.id.stickers_upsell_title).setText(R.string.f11nameremoved);
        TextView A0G = C18300x5.A0G(this, R.id.stickers_upsell_subtitle);
        String A0l = C18290x4.A0l(A0G.getContext(), R.string.f11nameremoved);
        String A0X = AnonymousClass0x2.A0X(A0G.getContext(), A0l, 1, R.string.f11nameremoved);
        C162457s7.A0D(A0X);
        int A0G2 = C175728Zm.A0G(A0X, A0l, 0, false);
        SpannableStringBuilder A00 = C18330xA.A00(A0X);
        A00.setSpan(new ForegroundColorSpan(AnonymousClass0Y8.A04(A0G.getContext(), AnonymousClass5Yj.A02(A0G.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved))), A0G2, A0l.length() + A0G2, 33);
        A0G.setText(A00);
        A0G.setContentDescription(A0G.getText().toString());
        A0G.setPadding(A0G.getPaddingLeft(), A0G.getPaddingTop(), A0G.getPaddingRight(), A0G.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickersUpsellItemView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickersUpsellItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickersUpsellItemView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
