package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.C08310eF;
import X.C106715a2;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C620633i;
import X.C635539r;
import X.C66433Lk;
import X.C70273aE;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class WfacUnbanDecisionFragment extends Hilt_WfacUnbanDecisionFragment {
    public C66433Lk A00;
    public WfacBanViewModel A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        A13(true);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        WfacBanViewModel wfacBanViewModel = (WfacBanViewModel) C18290x4.A0O(this).A01(WfacBanViewModel.class);
        this.A01 = wfacBanViewModel;
        if (wfacBanViewModel == null) {
            throw C18270x1.A0S("viewModel");
        }
        WfacBanViewModel.A00(A0R());
        WfacBanViewModel wfacBanViewModel2 = this.A01;
        if (wfacBanViewModel2 == null) {
            throw C18270x1.A0S("viewModel");
        }
        int A0D = wfacBanViewModel2.A0D();
        WfacBanViewModel wfacBanViewModel3 = this.A01;
        if (wfacBanViewModel3 == null) {
            throw C18270x1.A0S("viewModel");
        }
        int i = wfacBanViewModel3.A00;
        C18290x4.A1A(A0G(), (ImageView) C18280x3.A0E(view, R.id.ban_icon), R.drawable.icon_unbanned);
        AnonymousClass0x2.A0I(view, R.id.heading).setText(R.string.f11nameremoved);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18280x3.A0E(view, R.id.sub_heading);
        C106715a2 r7 = this.A03;
        if (r7 != null) {
            Context context = textEmojiLabel.getContext();
            String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
            String[] strArr = {"using-whatsapp-responsibly-link"};
            String[] strArr2 = new String[1];
            C66433Lk r5 = this.A00;
            if (r5 != null) {
                strArr2[0] = r5.A04("security-and-privacy", "how-to-use-whatsapp-responsibly").toString();
                SpannableString A04 = r7.A04(context, string, new Runnable[]{new C70273aE(this, A0D, i, 11)}, strArr, strArr2);
                C620633i r0 = this.A01;
                if (r0 != null) {
                    AnonymousClass0x2.A12(textEmojiLabel, r0);
                    AnonymousClass1VX r02 = this.A02;
                    if (r02 != null) {
                        AnonymousClass0x2.A14(r02, textEmojiLabel);
                        textEmojiLabel.setText(A04);
                        C18280x3.A0E(view, R.id.action_button).setVisibility(8);
                        TextView A0I = AnonymousClass0x2.A0I(view, R.id.action_button_2);
                        A0I.setVisibility(0);
                        A0I.setText(R.string.f11nameremoved);
                        A0I.setOnClickListener(new C635539r((Object) this, A0D, i, 3));
                        A1I().A01("show_ban_decision_screen", A0D, i);
                        return;
                    }
                    throw C18270x1.A0R();
                }
                throw C18270x1.A0S("systemServices");
            }
            throw C18270x1.A0S("faqLinkFactory");
        }
        throw C18270x1.A0S("linkifier");
    }
}
