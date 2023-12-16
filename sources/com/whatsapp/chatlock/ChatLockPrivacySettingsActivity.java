package com.whatsapp.chatlock;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5UK;
import X.C106995aW;
import X.C107695bk;
import X.C18290x4;
import X.C64333Db;
import X.C85804Hr;
import X.C86574Kq;
import X.C89644eZ;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockPrivacySettingsActivity extends C89644eZ {
    public C106995aW A00;
    public AnonymousClass5UK A01;
    public boolean A02;
    public final C86574Kq A03;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = (AnonymousClass5UK) A002.A4p.get();
            this.A00 = (C106995aW) A002.A4q.get();
        }
    }

    public ChatLockPrivacySettingsActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 29);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getString(R.string.f11nameremoved));
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        C18290x4.A1I(findViewById(R.id.enable_education_use_encryption_key_button), this, new C85804Hr(this, 35), 15);
    }

    public ChatLockPrivacySettingsActivity() {
        this(0);
        this.A03 = new C86574Kq(this, 0);
    }
}
