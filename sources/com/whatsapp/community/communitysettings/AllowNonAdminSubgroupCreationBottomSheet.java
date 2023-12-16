package com.whatsapp.community.communitysettings;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass4K2;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C08310eF;
import X.C106715a2;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C383026z;
import X.C44272Vj;
import X.C56942so;
import X.C56952sp;
import X.C620633i;
import X.C66433Lk;
import X.C77373tI;
import X.C80253xw;
import X.C85794Hq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.radio.RadioButtonWithSubtitle;

public final class AllowNonAdminSubgroupCreationBottomSheet extends Hilt_AllowNonAdminSubgroupCreationBottomSheet {
    public RadioGroup A00;
    public TextEmojiLabel A01;
    public C44272Vj A02;
    public C56942so A03;
    public C620633i A04;
    public AnonymousClass1VX A05;
    public RadioButtonWithSubtitle A06;
    public RadioButtonWithSubtitle A07;
    public C66433Lk A08;
    public C106715a2 A09;
    public boolean A0A;
    public final AnonymousClass66R A0B = C154517dI.A00(AnonymousClass58H.NONE, new C80253xw(this));
    public final AnonymousClass66R A0C = C154517dI.A01(new C77373tI(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A06 = (RadioButtonWithSubtitle) inflate.findViewById(R.id.non_admin_subgroup_creation_admin);
        this.A07 = (RadioButtonWithSubtitle) inflate.findViewById(R.id.non_admin_subgroup_creation_everyone);
        this.A01 = (TextEmojiLabel) inflate.findViewById(R.id.non_admin_subgroup_creation_subtext);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new C85794Hq(radioGroup, 1, this));
        this.A00 = radioGroup;
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        RadioButtonWithSubtitle radioButtonWithSubtitle;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        TextEmojiLabel textEmojiLabel = this.A01;
        if (textEmojiLabel != null) {
            C106715a2 r5 = this.A09;
            if (r5 != null) {
                Context context = textEmojiLabel.getContext();
                Object[] A0L = AnonymousClass002.A0L();
                C66433Lk r1 = this.A08;
                if (r1 != null) {
                    textEmojiLabel.setText(r5.A03(context, AnonymousClass0x7.A0n(this, r1.A03("205306122327447"), A0L, 0, R.string.f11nameremoved)));
                    C18270x1.A0q(textEmojiLabel, textEmojiLabel.getAbProps());
                    C620633i r0 = this.A04;
                    if (r0 != null) {
                        AnonymousClass0x2.A12(textEmojiLabel, r0);
                    } else {
                        throw C18270x1.A0S("systemServices");
                    }
                } else {
                    throw C18270x1.A0S("faqLinkFactory");
                }
            } else {
                throw C18270x1.A0S("linkifier");
            }
        }
        C44272Vj r02 = this.A02;
        if (r02 != null) {
            if (C56952sp.A0D(r02.A00) && (radioButtonWithSubtitle = this.A06) != null) {
                radioButtonWithSubtitle.setSubTitle(C08310eF.A09(this).getString(R.string.f11nameremoved));
            }
            AnonymousClass4K2.A00(A0V(), ((CommunitySettingsViewModel) this.A0C.getValue()).A0F, new C383026z(this, 12), 47);
            return;
        }
        throw C18270x1.A0S("communityABPropsManager");
    }

    public void A0a() {
        super.A0a();
        RadioGroup radioGroup = this.A00;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        }
        this.A00 = null;
        this.A06 = null;
        this.A07 = null;
        this.A01 = null;
    }
}
