package com.whatsapp.community.communitysettings;

import X.AnonymousClass4K2;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C08310eF;
import X.C154517dI;
import X.C162457s7;
import X.C383026z;
import X.C77363tH;
import X.C80243xv;
import X.C85794Hq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.radio.RadioButtonWithSubtitle;

public final class AllowNonAdminMembersAddBottomSheet extends Hilt_AllowNonAdminMembersAddBottomSheet {
    public RadioGroup A00;
    public RadioButtonWithSubtitle A01;
    public RadioButtonWithSubtitle A02;
    public boolean A03;
    public final AnonymousClass66R A04 = C154517dI.A00(AnonymousClass58H.NONE, new C80243xv(this));
    public final AnonymousClass66R A05 = C154517dI.A01(new C77363tH(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A01 = (RadioButtonWithSubtitle) inflate.findViewById(R.id.non_admin_members_add_admin_only);
        this.A02 = (RadioButtonWithSubtitle) inflate.findViewById(R.id.non_admin_members_add_everyone);
        RadioButtonWithSubtitle radioButtonWithSubtitle = this.A01;
        if (radioButtonWithSubtitle != null) {
            radioButtonWithSubtitle.setTitle(C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        RadioButtonWithSubtitle radioButtonWithSubtitle2 = this.A01;
        if (radioButtonWithSubtitle2 != null) {
            radioButtonWithSubtitle2.setSubTitle(C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        RadioButtonWithSubtitle radioButtonWithSubtitle3 = this.A02;
        if (radioButtonWithSubtitle3 != null) {
            radioButtonWithSubtitle3.setTitle(C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        RadioButtonWithSubtitle radioButtonWithSubtitle4 = this.A02;
        if (radioButtonWithSubtitle4 != null) {
            radioButtonWithSubtitle4.setSubTitle(C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.allow_non_admin_add_members_radio_group);
        radioGroup.setOnCheckedChangeListener(new C85794Hq(radioGroup, 0, this));
        this.A00 = radioGroup;
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        AnonymousClass4K2.A00(A0V(), ((CommunitySettingsViewModel) this.A05.getValue()).A04, new C383026z(this, 11), 46);
    }

    public void A0a() {
        super.A0a();
        RadioGroup radioGroup = this.A00;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        }
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }
}
