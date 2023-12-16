package com.whatsapp.lastseen;

import X.AnonymousClass000;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass492;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C49232gC;
import X.C55912r7;
import X.C58422vE;
import X.C64333Db;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioButton;
import com.whatsapp.R;

public class PresencePrivacyActivity extends C89644eZ implements AnonymousClass492 {
    public int A00;
    public int A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public RadioButton A05;
    public RadioButton A06;
    public RadioButton A07;
    public C55912r7 A08;
    public boolean A09;
    public boolean A0A;
    public final C49232gC A0B;
    public final C49232gC A0C;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            if (!this.A0A) {
                this.A00 = 3;
            }
            A74();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A08 = (C55912r7) A002.ARR.get();
        }
    }

    public final void A74() {
        if (!this.A0A) {
            Intent A072 = C18320x8.A07();
            A072.putExtra("last_seen", this.A00);
            AnonymousClass1Ha.A1u(this, A072, "online", this.A01);
        }
        finish();
    }

    public final void A75() {
        boolean z = true;
        boolean z2 = true;
        if (this.A08.A07.get("last") == null) {
            z2 = false;
            this.A0B.A00();
        }
        A76(this.A03, 1, z2);
        A76(this.A02, 0, z2);
        A76(this.A05, 2, z2);
        A76(this.A04, 3, z2);
        if (this.A08.A07.get("online") == null) {
            z = false;
            this.A0C.A00();
        }
        RadioButton radioButton = this.A06;
        if (!this.A0A || this.A01 != 0 || !z) {
            radioButton.setChecked(AnonymousClass000.A1U(this.A01, 0));
        } else {
            this.A0C.A01(radioButton);
        }
        RadioButton radioButton2 = this.A07;
        if (!this.A0A || this.A01 != 4 || !z) {
            radioButton2.setChecked(AnonymousClass000.A1U(this.A01, 4));
        } else {
            this.A0C.A01(radioButton2);
        }
    }

    public final void A76(RadioButton radioButton, int i, boolean z) {
        if (!this.A0A || this.A00 != i || !z) {
            radioButton.setChecked(AnonymousClass000.A1U(this.A00, i));
        } else {
            this.A0B.A01(radioButton);
        }
    }

    public void BbP() {
        this.A00 = this.A08.A01("last");
        this.A01 = this.A08.A01("online");
        A75();
    }

    public PresencePrivacyActivity(int i) {
        this.A09 = false;
        AnonymousClass4HY.A00(this, 77);
    }

    public void onBackPressed() {
        A74();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0A = this.A0D.A0Y(C58422vE.A02, 5611);
        AnonymousClass1Ha.A1m(this, R.layout.f8nameremoved).A0B(R.string.f11nameremoved);
        this.A03 = (RadioButton) findViewById(R.id.my_contacts_button);
        this.A02 = (RadioButton) findViewById(R.id.everyone_btn);
        this.A04 = (RadioButton) findViewById(R.id.my_contacts_except_button);
        this.A05 = (RadioButton) findViewById(R.id.nobody_btn);
        this.A06 = (RadioButton) findViewById(R.id.child_everyone_button);
        this.A07 = (RadioButton) findViewById(R.id.child_match_parent_button);
        C18280x3.A1E(getString(R.string.f11nameremoved), C18310x6.A0L(this, R.id.reciprocity_description));
        this.A03.setText(R.string.f11nameremoved);
        this.A02.setText(R.string.f11nameremoved);
        this.A04.setText(R.string.f11nameremoved);
        this.A05.setText(R.string.f11nameremoved);
        this.A06.setText(R.string.f11nameremoved);
        this.A07.setText(R.string.f11nameremoved);
        C18290x4.A1F(this.A03, this, 5);
        C18290x4.A1F(this.A02, this, 6);
        C18290x4.A1F(this.A04, this, 7);
        C18290x4.A1F(this.A05, this, 8);
        C18290x4.A1F(this.A06, this, 9);
        C18290x4.A1F(this.A07, this, 10);
        if (!this.A0A) {
            this.A00 = AnonymousClass1Hf.A27(this).getInt("privacy_last_seen", 0);
            this.A01 = AnonymousClass1Hf.A27(this).getInt("privacy_online", 0);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A74();
        return false;
    }

    public void onPause() {
        super.onPause();
        this.A08.A08.remove(this);
    }

    public void onResume() {
        super.onResume();
        if (this.A0A) {
            this.A08.A08.add(this);
            this.A00 = this.A08.A01("last");
            this.A01 = this.A08.A01("online");
        }
        A75();
    }

    public PresencePrivacyActivity() {
        this(0);
        this.A0B = new C49232gC();
        this.A0C = new C49232gC();
        this.A0A = false;
    }
}
