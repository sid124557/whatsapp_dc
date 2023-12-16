package com.whatsapp.privacy.checkup;

import X.AnonymousClass002;
import X.AnonymousClass1kO;
import X.C18320x8;
import X.C86664Kz;
import android.os.Bundle;

public final class PrivacyCheckupDetailActivity extends AnonymousClass1kO {
    public PrivacyCheckupBaseFragment A74() {
        PrivacyCheckupBaseFragment privacyCheckupBaseFragment;
        int A07 = C86664Kz.A07(getIntent(), "ENTRY_POINT");
        int A01 = C18320x8.A01(getIntent(), "DETAIL_CATEGORY");
        if (A01 == 1) {
            privacyCheckupBaseFragment = new PrivacyCheckupContactFragment();
        } else if (A01 == 2) {
            privacyCheckupBaseFragment = new PrivacyCheckupAudienceFragment();
        } else if (A01 == 3) {
            privacyCheckupBaseFragment = new PrivacyCheckupMorePrivacyFragment();
        } else if (A01 != 4) {
            return null;
        } else {
            privacyCheckupBaseFragment = new PrivacyCheckupMoreSecurityFragment();
        }
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("extra_entry_point", A07);
        privacyCheckupBaseFragment.A0u(A08);
        return privacyCheckupBaseFragment;
    }

    public String A75() {
        int A01 = C18320x8.A01(getIntent(), "DETAIL_CATEGORY");
        if (A01 == 1) {
            return "PrivacyCheckupContactFragment";
        }
        if (A01 == 2) {
            return "PrivacyCheckupAudienceFragment";
        }
        if (A01 == 3) {
            return "PrivacyCheckupMorePrivacyFragment";
        }
        if (A01 != 4) {
            return "";
        }
        return "PrivacyCheckupMoreSecurityFragment";
    }
}
