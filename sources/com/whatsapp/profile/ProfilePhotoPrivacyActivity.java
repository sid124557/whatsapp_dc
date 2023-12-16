package com.whatsapp.profile;

import X.AnonymousClass0x2;
import X.AnonymousClass1HD;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C18280x3;
import X.C18320x8;
import X.C55912r7;
import X.C58422vE;
import X.C64333Db;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public class ProfilePhotoPrivacyActivity extends AnonymousClass1HD {
    public int A00;
    public View A01;
    public SettingsRowPhotoOrInitialText A02;
    public boolean A03;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            this.A00 = 3;
            if (!this.A05) {
                AnonymousClass1Ha.A1u(this, C18320x8.A07(), "profile_photo", this.A00);
            }
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A04 = (C55912r7) A002.ARR.get();
        }
    }

    public final void A79(int i) {
        View view;
        int i2;
        if (this.A0D.A0Y(C58422vE.A02, 6149)) {
            SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = this.A02;
            float f = 1.0f;
            if (i == 0) {
                f = 0.5f;
            }
            settingsRowPhotoOrInitialText.setAlpha(f);
            view = this.A01;
            i2 = 0;
        } else {
            view = this.A01;
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public ProfilePhotoPrivacyActivity(int i) {
        this.A03 = false;
        AnonymousClass4HY.A00(this, 96);
    }

    public final void A77(int i) {
        super.A77(i);
        A79(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = C18280x3.A02(AnonymousClass0x2.A0F(this.A09), "privacy_profile_photo");
        View findViewById = findViewById(R.id.alt_profile_view);
        this.A01 = findViewById;
        SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = (SettingsRowPhotoOrInitialText) findViewById.findViewById(R.id.alt_profile_row);
        this.A02 = settingsRowPhotoOrInitialText;
        settingsRowPhotoOrInitialText.setName(this.A01.A0D.A03());
        A79(this.A00);
    }

    public ProfilePhotoPrivacyActivity() {
        this(0);
    }
}
