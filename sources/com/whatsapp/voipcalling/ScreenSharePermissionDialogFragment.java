package com.whatsapp.voipcalling;

import X.AnonymousClass043;
import X.AnonymousClass0x9;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C02890Hz;
import X.C06560Yg;
import X.C08310eF;
import X.C109395eY;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C19340zH;
import X.C79723x5;
import X.C79733x6;
import X.C81283zd;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;

public final class ScreenSharePermissionDialogFragment extends WaDialogFragment {
    public final AnonymousClass66R A00;

    public ScreenSharePermissionDialogFragment() {
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(ScreenShareViewModel.class);
        this.A00 = C18330xA.A02(new C79723x5(this), new C79733x6(this), new C81283zd(this), A1E);
    }

    public Dialog A1J(Bundle bundle) {
        Bundle A0H = A0H();
        View inflate = View.inflate(A0G(), R.layout.f8nameremoved, (ViewGroup) null);
        int i = 0;
        inflate.setPadding(0, inflate.getPaddingTop(), 0, inflate.getPaddingBottom());
        ImageView A0E = AnonymousClass0x9.A0E(inflate, R.id.permission_image_1);
        A0E.setImageResource(R.drawable.vec_ic_screen_share);
        int dimensionPixelSize = A0E.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        ViewGroup.LayoutParams layoutParams = A0E.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        C18300x5.A0G(inflate, R.id.permission_message).setText(C02890Hz.A00(C08310eF.A09(this).getString(A0H.getInt("BodyTextId", 0))));
        C06560Yg.A02(inflate, R.id.submit).setOnClickListener(new C109395eY(this, 49));
        TextView A0G = C18300x5.A0G(inflate, R.id.cancel);
        if (!A0H.getBoolean("CancelEnabled", true)) {
            i = 8;
        }
        A0G.setVisibility(i);
        A0G.setText(R.string.f11nameremoved);
        C18320x8.A14(A0G, this, 0);
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0a(inflate);
        A0K.A0i(true);
        AnonymousClass043 A0H2 = C18300x5.A0H(A0K);
        Window window = A0H2.getWindow();
        if (window != null) {
            C18310x6.A0x(A0G(), window, R.color.f5nameremoved);
        }
        return A0H2;
    }
}
