package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass3XG;
import X.AnonymousClass5Yj;
import X.AnonymousClass7YW;
import X.AnonymousClass7ZQ;
import X.C003203q;
import X.C02680He;
import X.C06560Yg;
import X.C08310eF;
import X.C107215at;
import X.C109315eQ;
import X.C140066t6;
import X.C140096t9;
import X.C141616vr;
import X.C141626vs;
import X.C152467Yz;
import X.C162457s7;
import X.C18270x1;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Iterator;

public final class VoiceChatIntroCardDialog extends Hilt_VoiceChatIntroCardDialog {
    public View.OnClickListener A00;
    public View A01;
    public AnonymousClass3XG A02;
    public boolean A03;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        this.A01 = view;
        A1Y();
        View A022 = C06560Yg.A02(view, R.id.content);
        C162457s7.A0K(A022, "null cannot be cast to non-null type com.whatsapp.wds.components.textlayout.WDSTextLayout");
        WDSTextLayout wDSTextLayout = (WDSTextLayout) A022;
        AnonymousClass7ZQ r7 = new AnonymousClass7ZQ(C02680He.A00((Resources.Theme) null, C08310eF.A09(this), R.drawable.vec_voice_chat_intro_header), C141616vr.MEDIUM, C08310eF.A09(this).getString(R.string.f11nameremoved), C08310eF.A09(this).getString(R.string.f11nameremoved));
        C141626vs r8 = C141626vs.FOOTER;
        C152467Yz[] r5 = new C152467Yz[2];
        r5[0] = new C152467Yz(C86624Kv.A0a(C08310eF.A09(this), R.string.f11nameremoved), C08310eF.A09(this).getString(R.string.f11nameremoved), R.drawable.vec_ic_lwc_mic_on);
        C140066t6 r9 = new C140066t6(AnonymousClass0x9.A19(new C152467Yz(C86624Kv.A0a(C08310eF.A09(this), R.string.f11nameremoved), C08310eF.A09(this).getString(R.string.f11nameremoved), R.drawable.ic_notifications_off), r5, 1));
        wDSTextLayout.setTextLayoutViewState(new C140096t9(new AnonymousClass7YW(new C109315eQ(this, 12), C86624Kv.A0a(C08310eF.A09(this), R.string.f11nameremoved)), new AnonymousClass7YW(new C109315eQ(this, 13), C86624Kv.A0a(C08310eF.A09(this), R.string.f11nameremoved)), r7, r8, r9, (CharSequence) null));
        View A023 = C06560Yg.A02(wDSTextLayout, R.id.content_container);
        C162457s7.A0K(A023, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) A023;
        C162457s7.A0J(viewGroup, 0);
        Iterator A11 = C86634Kw.A11(viewGroup);
        while (A11.hasNext()) {
            View A024 = C06560Yg.A02(C86654Ky.A0H(A11), R.id.bullet_icon);
            C162457s7.A0K(A024, "null cannot be cast to non-null type com.whatsapp.WaImageView");
            ImageView imageView = (ImageView) A024;
            imageView.setColorFilter(AnonymousClass5Yj.A03(imageView.getContext(), imageView.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        A1Y();
    }

    public void A0c() {
        super.A0c();
        if (!this.A03) {
            AnonymousClass3XG r2 = this.A02;
            if (r2 != null) {
                r2.A00(23, 38);
            } else {
                throw C18270x1.A0S("callUserJourneyLogger");
            }
        }
        this.A01 = null;
        this.A03 = false;
    }

    public final void A1Y() {
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            float f = 0.85f;
            if (C86604Kt.A0A(this).orientation == 2) {
                f = 1.0f;
            }
            View view = this.A01;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) (((float) C107215at.A00(A0Q)) * f);
                    view.setLayoutParams(layoutParams);
                    return;
                }
                throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
