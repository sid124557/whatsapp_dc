package com.whatsapp.privacy.checkup;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass1XW;
import X.AnonymousClass4FV;
import X.AnonymousClass5RV;
import X.C08310eF;
import X.C1001059l;
import X.C109665ez;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C19380zS;
import X.C57012sv;
import X.C86604Kt;
import X.C86614Ku;
import X.C94574rZ;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public abstract class PrivacyCheckupBaseFragment extends Hilt_PrivacyCheckupBaseFragment {
    public C57012sv A00;
    public AnonymousClass1VX A01;
    public AnonymousClass4FV A02;
    public AnonymousClass5RV A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        int i2;
        int i3;
        int i4;
        Resources resources;
        C162457s7.A0J(view, 0);
        ImageView A0J = C86604Kt.A0J(view, R.id.header_image);
        boolean z = this instanceof PrivacyCheckupMoreSecurityFragment;
        if (z) {
            i = R.drawable.vec_privacy_checkup_more_security_logo;
        } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
            i = R.drawable.vec_privacy_chekcup_more_privacy_logo;
        } else if (this instanceof PrivacyCheckupHomeFragment) {
            i = R.drawable.vec_privacy_checkup_home_logo;
        } else if (this instanceof PrivacyCheckupContactFragment) {
            i = R.drawable.vec_privacy_checkup_contact_logo;
        } else {
            i = R.drawable.vec_privacy_checkup_audience_logo;
        }
        A0J.setImageResource(i);
        Context A1D = A1D();
        if (!(A1D == null || (resources = A1D.getResources()) == null || !C1001059l.A04)) {
            C86614Ku.A15(resources, A0J, R.dimen.f6nameremoved);
        }
        ViewGroup.LayoutParams layoutParams = A0J.getLayoutParams();
        Resources A09 = C08310eF.A09(this);
        boolean z2 = this instanceof PrivacyCheckupHomeFragment;
        if (z2) {
            i2 = R.dimen.f6nameremoved;
        } else {
            i2 = R.dimen.f6nameremoved;
        }
        layoutParams.height = A09.getDimensionPixelSize(i2);
        TextView A0I = AnonymousClass0x2.A0I(view, R.id.title);
        if (z) {
            i3 = R.string.f11nameremoved;
        } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
            i3 = R.string.f11nameremoved;
        } else if (z2) {
            i3 = R.string.f11nameremoved;
        } else if (this instanceof PrivacyCheckupContactFragment) {
            i3 = R.string.f11nameremoved;
        } else {
            i3 = R.string.f11nameremoved;
        }
        A0I.setText(i3);
        TextView A0I2 = AnonymousClass0x2.A0I(view, R.id.description);
        if (z) {
            i4 = R.string.f11nameremoved;
        } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
            i4 = R.string.f11nameremoved;
        } else if (z2) {
            i4 = R.string.f11nameremoved;
        } else if (this instanceof PrivacyCheckupContactFragment) {
            i4 = R.string.f11nameremoved;
        } else {
            i4 = R.string.f11nameremoved;
        }
        A0I2.setText(i4);
        TextView A0I3 = AnonymousClass0x2.A0I(view, R.id.footer);
        C18280x3.A1E(C08310eF.A09(this).getString(R.string.f11nameremoved), A0I3);
        if (z || (this instanceof PrivacyCheckupMorePrivacyFragment) || !z2) {
            A0I3.setVisibility(8);
        } else {
            A0I3.setVisibility(0);
        }
    }

    public final void A1L(View view, C109665ez r10, int i, int i2, int i3) {
        ((ViewGroup) C18280x3.A0E(view, R.id.setting_options)).addView(new C19380zS(A0G(), r10, i, i2, i3), 0);
    }

    public final void A1J(int i, int i2) {
        AnonymousClass1XW r1 = new AnonymousClass1XW();
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = Integer.valueOf(i);
        AnonymousClass4FV r0 = this.A02;
        if (r0 != null) {
            r0.BhA(r1);
            return;
        }
        throw C18270x1.A0S("wamRuntime");
    }

    public final void A1K(int i, Integer num) {
        int i2;
        AnonymousClass5RV r2 = this.A03;
        if (r2 != null) {
            if (this instanceof PrivacyCheckupMoreSecurityFragment) {
                i2 = 4;
            } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
                i2 = 3;
            } else if (this instanceof PrivacyCheckupHomeFragment) {
                i2 = 0;
            } else if (this instanceof PrivacyCheckupContactFragment) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            C94574rZ A002 = r2.A00(Integer.valueOf(i2), num, i);
            A002.A00 = AnonymousClass001.A0f();
            r2.A00.BhA(A002);
            return;
        }
        throw C18270x1.A0S("privacyCheckupWamEventHelper");
    }
}
