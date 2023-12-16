package com.whatsapp.companiondevice;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2R8;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C116985rC;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C44742Xh;
import X.C64333Db;
import X.C89644eZ;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;

public final class CompanionHelloConfirmationActivity extends C89644eZ {
    public C116985rC A00;
    public C44742Xh A01;
    public AnonymousClass2R8 A02;
    public boolean A03;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = (C116985rC) A002.AOi.get();
            this.A02 = (AnonymousClass2R8) A002.AWC.get();
            this.A01 = A002.AiM();
        }
    }

    public CompanionHelloConfirmationActivity(int i) {
        this.A03 = false;
        AnonymousClass4HY.A00(this, 42);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        TextView A0I = AnonymousClass0x2.A0I(this.A00, R.id.description);
        String stringExtra = getIntent().getStringExtra("companion_platform_display");
        if (stringExtra == null) {
            stringExtra = getString(R.string.f11nameremoved);
        }
        C162457s7.A0H(stringExtra);
        C18280x3.A1E(AnonymousClass002.A0F(this, stringExtra, AnonymousClass002.A0L(), 0, R.string.f11nameremoved), A0I);
        C18310x6.A17(C18280x3.A0E(this.A00, R.id.confirm_button), this, 2);
        C18310x6.A17(C18280x3.A0E(this.A00, R.id.cancel_button), this, 3);
        C44742Xh r3 = this.A01;
        if (r3 != null) {
            r3.A00(11, getIntent().getStringExtra("pairing_ref"), getIntent().getStringExtra("companion_platform_id"));
            return;
        }
        throw C18270x1.A0S("altPairingPrimaryStepLogger");
    }

    public CompanionHelloConfirmationActivity() {
        this(0);
    }
}
