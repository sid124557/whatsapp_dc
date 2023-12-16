package com.whatsapp.settings;

import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass36l;
import X.AnonymousClass4FV;
import X.AnonymousClass4HY;
import X.AnonymousClass5RU;
import X.AnonymousClass5UY;
import X.C105265Uf;
import X.C107385bE;
import X.C107695bk;
import X.C116985rC;
import X.C18280x3;
import X.C40532Gt;
import X.C49842hB;
import X.C57012sv;
import X.C58422vE;
import X.C614930z;
import X.C627736r;
import X.C634339f;
import X.C64333Db;
import X.C88744aj;
import X.C88834as;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;

public class SettingsAccount extends C89644eZ {
    public C116985rC A00;
    public C116985rC A01;
    public C116985rC A02;
    public C57012sv A03;
    public C614930z A04;
    public C49842hB A05;
    public AnonymousClass4FV A06;
    public C40532Gt A07;
    public C105265Uf A08;
    public AnonymousClass5RU A09;
    public AnonymousClass5UY A0A;
    public boolean A0B;
    public boolean A0C;

    public void A5r() {
        if (!this.A0B) {
            this.A0B = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass1Ha.A23(r2, r1, r1, this);
            AnonymousClass1Ha.A24(r2, this);
            this.A03 = (C57012sv) r2.A0Z.get();
            this.A06 = C64333Db.A4H(r2);
            this.A04 = C64333Db.A0E(r2);
            this.A08 = r1.ANk();
            this.A09 = A0I.AD7();
            this.A05 = r2.AkP();
            C88744aj r0 = C88744aj.A00;
            this.A01 = r0;
            this.A00 = r0;
            this.A02 = r0;
            this.A07 = (C40532Gt) r2.AIJ.get();
        }
    }

    public SettingsAccount(int i) {
        this.A0B = false;
        AnonymousClass4HY.A00(this, 110);
    }

    public void onCreate(Bundle bundle) {
        boolean A0Y;
        Intent A0v;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass1Ha.A1z(this);
        AnonymousClass1VX r1 = this.A0D;
        C58422vE r3 = C58422vE.A02;
        this.A0C = r1.A0Y(r3, 4023);
        findViewById(R.id.privacy_preference).setVisibility(8);
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.security_preference);
        AnonymousClass1Ha.A1x(settingsRowIconText, this, 13);
        View findViewById = findViewById(R.id.passkeys_preference);
        C105265Uf r12 = this.A08;
        if (!C107385bE.A06()) {
            A0Y = false;
        } else {
            A0Y = r12.A04.A0Y(r3, 5060);
        }
        View findViewById2 = findViewById(R.id.passkeys_preference);
        if (A0Y) {
            findViewById2.setVisibility(0);
        } else {
            findViewById2.setVisibility(8);
        }
        AnonymousClass1Ha.A1x(findViewById, this, 14);
        if (getIntent().getBooleanExtra("is_companion", false)) {
            AnonymousClass1Ha.A1x(findViewById(R.id.log_out_preference), this, 5);
            C18280x3.A0r(this, R.id.two_step_verification_preference, 8);
            C18280x3.A0r(this, R.id.coex_onboarding_preference, 8);
            C18280x3.A0r(this, R.id.change_number_preference, 8);
            C18280x3.A0r(this, R.id.delete_account_preference, 8);
        } else {
            C18280x3.A0r(this, R.id.log_out_preference, 8);
            if (this.A05.A00()) {
                AnonymousClass5UY A1p = AnonymousClass1Ha.A1p(this, R.id.email_verification_preference);
                A1p.A06(0);
                SettingsRowIconText settingsRowIconText2 = (SettingsRowIconText) A1p.A04();
                boolean isEmpty = TextUtils.isEmpty(C18280x3.A0Z(AnonymousClass0x2.A0F(this.A09), "settings_verification_email_address"));
                String A0Y2 = C18280x3.A0Y();
                if (isEmpty) {
                    A0v = C627736r.A0x(this, A0Y2, 0, 3);
                } else {
                    A0v = C627736r.A0v(this, A0Y2, 3);
                }
                C634339f.A00(settingsRowIconText2, this, A0v, 41);
                if (this.A0C) {
                    settingsRowIconText2.setIcon((int) R.drawable.vec_email_unfilled);
                }
            }
            SettingsRowIconText settingsRowIconText3 = (SettingsRowIconText) findViewById(R.id.two_step_verification_preference);
            AnonymousClass1Ha.A1x(settingsRowIconText3, this, 4);
            if (this.A0C) {
                settingsRowIconText3.setIcon((int) R.drawable.ic_settings_account_unfilled_two_step_verification);
            }
            C18280x3.A0r(this, R.id.coex_onboarding_preference, 8);
            SettingsRowIconText settingsRowIconText4 = (SettingsRowIconText) findViewById(R.id.change_number_preference);
            if (this.A0C) {
                settingsRowIconText4.setIcon((int) R.drawable.ic_settings_account_unfilled_change_number);
            }
            AnonymousClass1Ha.A1x(settingsRowIconText4, this, 10);
            SettingsRowIconText settingsRowIconText5 = (SettingsRowIconText) findViewById(R.id.delete_account_preference);
            if (this.A0C) {
                settingsRowIconText5.setIcon((int) R.drawable.ic_settings_account_unfilled_delete);
            }
            AnonymousClass1Ha.A1x(settingsRowIconText5, this, 9);
            if (this.A04.A07() && this.A04.A0A.A0C() + 1 < 2) {
                AnonymousClass5UY A1p2 = AnonymousClass1Ha.A1p(this, R.id.add_account);
                A1p2.A06(0);
                SettingsRowIconText settingsRowIconText6 = (SettingsRowIconText) A1p2.A04();
                AnonymousClass1Ha.A1x(settingsRowIconText6, this, 11);
                if (this.A0C) {
                    settingsRowIconText6.setIcon((int) R.drawable.vec_person_add_unfilled);
                }
            }
            if (this.A04.A06()) {
                AnonymousClass5UY A1p3 = AnonymousClass1Ha.A1p(this, R.id.remove_account);
                A1p3.A06(0);
                SettingsRowIconText settingsRowIconText7 = (SettingsRowIconText) A1p3.A04();
                AnonymousClass1Ha.A1x(settingsRowIconText7, this, 8);
                if (this.A0C) {
                    settingsRowIconText7.setIcon((int) R.drawable.vec_person_remove_unfilled);
                }
            }
            if (this.A0C) {
                settingsRowIconText.setIcon((int) R.drawable.ic_settings_account_unfilled_security);
            }
        }
        SettingsRowIconText settingsRowIconText8 = (SettingsRowIconText) findViewById(R.id.request_account_info_preference);
        AnonymousClass1Ha.A1x(settingsRowIconText8, this, 6);
        if (this.A0C) {
            settingsRowIconText8.setIcon((int) R.drawable.ic_settings_account_unfilled_description);
        }
        if (this.A0D.A0Y(r3, 6297)) {
            AnonymousClass5UY A1p4 = AnonymousClass1Ha.A1p(this, R.id.newsletter_reports_stub);
            A1p4.A06(0);
            AnonymousClass1Ha.A1x(A1p4.A04(), this, 7);
        }
        this.A01.A0Y();
        this.A0A = AnonymousClass1Ha.A1p(this, R.id.share_maac_phase_2_view_stub);
        if (AnonymousClass36l.A0R(this.A09, this.A0D)) {
            this.A0A.A06(0);
            AnonymousClass1Ha.A1x(this.A0A.A04(), this, 12);
        }
        this.A09.A02(this.A00, "account", AnonymousClass1Ha.A1q(this));
    }

    public void onResume() {
        super.onResume();
        if (!AnonymousClass36l.A0R(this.A09, this.A0D)) {
            this.A0A.A06(8);
        }
    }

    public SettingsAccount() {
        this(0);
    }
}
