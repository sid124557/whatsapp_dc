package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.C08310eF;
import X.C106715a2;
import X.C109395eY;
import X.C172578Lw;
import X.C18280x3;
import X.C18300x5;
import X.C620633i;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealBannedDecisionFragment extends Hilt_BanAppealBannedDecisionFragment {
    public C620633i A00;
    public BanAppealViewModel A01;
    public C106715a2 A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.A0K(bundle, layoutInflater, viewGroup);
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        this.A01 = C18280x3.A0P(this);
        BanAppealViewModel.A00(A0R(), false);
        AnonymousClass0x9.A0E(view, R.id.ban_icon).setImageDrawable(C08310eF.A09(this).getDrawable(R.drawable.icon_banned));
        C18300x5.A0G(view, R.id.heading).setText(R.string.f11nameremoved);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view, R.id.sub_heading);
        SpannableString A04 = this.A02.A04(A0K.getContext(), C08310eF.A09(this).getString(R.string.f11nameremoved), new Runnable[]{new C172578Lw(26)}, new String[]{"terms-of-service-link"}, new String[]{"https://www.whatsapp.com/legal/updates/terms-of-service"});
        AnonymousClass0x2.A12(A0K, this.A00);
        AnonymousClass0x2.A14(this.A05, A0K);
        A0K.setText(A04);
        TextView A0G = C18300x5.A0G(view, R.id.action_button);
        A0G.setText(R.string.f11nameremoved);
        A0G.setOnClickListener(new C109395eY(this, 24));
    }
}
