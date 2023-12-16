package com.whatsapp.profile;

import X.AnonymousClass1HD;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C18280x3;
import X.C18320x8;
import X.C55912r7;
import X.C64333Db;
import android.content.Intent;
import android.os.Bundle;

public class AboutStatusPrivacyActivity extends AnonymousClass1HD {
    public int A00;
    public boolean A01;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            this.A00 = 3;
            if (!this.A05) {
                AnonymousClass1Ha.A1u(this, C18320x8.A07(), "about", 3);
            }
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A04 = (C55912r7) A002.ARR.get();
        }
    }

    public AboutStatusPrivacyActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 95);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = C18280x3.A02(AnonymousClass1Hf.A27(this), "privacy_status");
    }

    public AboutStatusPrivacyActivity() {
        this(0);
    }
}
