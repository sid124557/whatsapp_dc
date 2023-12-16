package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass1HD;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass35B;
import X.AnonymousClass3DZ;
import X.AnonymousClass4D7;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C18320x8;
import X.C55912r7;
import X.C64333Db;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;

public class GroupAddPrivacyActivity extends AnonymousClass1HD implements AnonymousClass4D7 {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            this.A00 = 3;
            A79();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A04 = (C55912r7) A002.ARR.get();
        }
    }

    public final void A79() {
        if (!this.A05) {
            AnonymousClass1Ha.A1u(this, C18320x8.A07(), "groupadd", this.A00);
        }
        finish();
    }

    public void Ayg() {
        if (!this.A05) {
            this.A00 = 2;
        }
        A76();
    }

    public void Azf() {
        if (!this.A05) {
            A79();
        } else {
            this.A04.A05("groupadd", AnonymousClass35B.A03("groupadd", this.A01));
        }
    }

    public GroupAddPrivacyActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 63);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = AnonymousClass1Hf.A27(this).getInt("privacy_groupadd", 0);
        this.A00 = i;
        this.A03 = AnonymousClass000.A1U(i, 2);
        this.A03.setEnabled(false);
        boolean z = this.A03;
        RadioButton radioButton = this.A03;
        if (z) {
            radioButton.setVisibility(0);
        } else {
            radioButton.setVisibility(8);
        }
    }

    public GroupAddPrivacyActivity() {
        this(0);
        this.A03 = false;
    }
}
