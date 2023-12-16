package com.whatsapp.info.views;

import X.C109665ez;
import X.C111095hX;
import X.C162457s7;
import X.C18290x4;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C89324cH;
import X.C89364cO;
import X.C89654ea;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class StarredMessageInfoView extends C89324cH {
    public final C89654ea A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredMessageInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        this.A00 = C111095hX.A05(context);
        setIcon(R.drawable.ic_action_star);
        C89364cO.A01(context, this, R.string.f11nameremoved);
    }

    public final void setupOnClickListener(C109665ez r2) {
        C162457s7.A0J(r2, 0);
        setOnClickListener(r2);
    }

    public final void A08(long j, boolean z) {
        if (j <= 0 || z) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        WaTextView waTextView = new WaTextView(C18290x4.A0F(this));
        C86624Kv.A0t(waTextView, -2);
        waTextView.setId(R.id.starred_messages_count);
        ViewGroup A0I = C86644Kx.A0I(this, R.id.right_view_container);
        View findViewById = A0I.findViewById(R.id.starred_messages_count);
        if (findViewById != null) {
            A0I.removeView(findViewById);
        }
        A0I.addView(waTextView);
        C86634Kw.A1K(waTextView, this.A04.A0M(), j);
    }

    public final C89654ea getActivity() {
        return this.A00;
    }
}
