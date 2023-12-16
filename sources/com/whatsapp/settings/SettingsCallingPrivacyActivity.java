package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass35B;
import X.AnonymousClass3DZ;
import X.AnonymousClass492;
import X.AnonymousClass4HY;
import X.AnonymousClass66R;
import X.C107635bd;
import X.C107695bk;
import X.C111095hX;
import X.C154517dI;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C53602nM;
import X.C55912r7;
import X.C58422vE;
import X.C620633i;
import X.C64333Db;
import X.C66493Lq;
import X.C69263Wi;
import X.C79513wk;
import X.C89644eZ;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class SettingsCallingPrivacyActivity extends C89644eZ implements AnonymousClass492 {
    public int A00;
    public int A01;
    public ProgressBar A02;
    public SwitchCompat A03;
    public C55912r7 A04;
    public C53602nM A05;
    public C66493Lq A06;
    public SettingsRowPrivacyLinearLayout A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass66R A0A;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1Ha.A1m(this, R.layout.f8nameremoved).A0B(R.string.f11nameremoved);
        this.A07 = (SettingsRowPrivacyLinearLayout) C18290x4.A0N(this, R.id.silence_call_layout);
        this.A03 = (SwitchCompat) C18290x4.A0N(this, R.id.silence_switch);
        this.A02 = (ProgressBar) C18290x4.A0N(this, R.id.silence_progress_bar);
        if (!this.A0D.A0Y(C58422vE.A02, 1972)) {
            SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = this.A07;
            if (settingsRowPrivacyLinearLayout == null) {
                throw C18270x1.A0S("silenceCallLayout");
            }
            settingsRowPrivacyLinearLayout.setVisibility(8);
        }
        AnonymousClass1VX r9 = this.A0D;
        C69263Wi r6 = this.A05;
        C111095hX r5 = this.A00;
        C620633i r8 = this.A08;
        String string = getString(R.string.f11nameremoved);
        C107635bd.A0E(this, Uri.parse("https://faq.whatsapp.com/1238612517047244/"), r5, r6, (TextEmojiLabel) findViewById(R.id.description_view), r8, r9, string, "calling_privacy_help");
        SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout2 = this.A07;
        if (settingsRowPrivacyLinearLayout2 == null) {
            throw C18270x1.A0S("silenceCallLayout");
        }
        AnonymousClass1Ha.A1x(settingsRowPrivacyLinearLayout2, this, 15);
        if ("silence_unknown_caller".equals(getIntent().getStringExtra("target_setting"))) {
            SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout3 = this.A07;
            if (settingsRowPrivacyLinearLayout3 == null) {
                throw C18270x1.A0S("silenceCallLayout");
            }
            settingsRowPrivacyLinearLayout3.A00();
        }
    }

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A05 = C18280x3.A0L(r0);
            this.A04 = (C55912r7) A002.ARR.get();
            this.A06 = C64333Db.A5A(A002);
        }
    }

    public final void A74() {
        int i;
        SwitchCompat switchCompat;
        boolean z = true;
        if (!C18270x1.A1V(this.A0A)) {
            switchCompat = this.A03;
            if (switchCompat == null) {
                throw C18270x1.A0S("silenceCallPrivacySwitch");
            }
            i = this.A01;
        } else {
            C55912r7 r0 = this.A04;
            if (r0 != null) {
                i = r0.A01("calladd");
                this.A01 = i;
                C55912r7 r02 = this.A04;
                if (r02 != null) {
                    boolean A1W = AnonymousClass000.A1W(r02.A07.get("calladd"));
                    ProgressBar progressBar = this.A02;
                    if (A1W) {
                        if (progressBar == null) {
                            throw C18270x1.A0S("silenceCallPrivacySpinner");
                        }
                        progressBar.setVisibility(0);
                        SwitchCompat switchCompat2 = this.A03;
                        if (switchCompat2 == null) {
                            throw C18270x1.A0S("silenceCallPrivacySwitch");
                        }
                        switchCompat2.setVisibility(4);
                        return;
                    } else if (progressBar == null) {
                        throw C18270x1.A0S("silenceCallPrivacySpinner");
                    } else {
                        progressBar.setVisibility(4);
                        SwitchCompat switchCompat3 = this.A03;
                        if (switchCompat3 == null) {
                            throw C18270x1.A0S("silenceCallPrivacySwitch");
                        }
                        switchCompat3.setVisibility(0);
                        switchCompat = this.A03;
                        if (switchCompat == null) {
                            throw C18270x1.A0S("silenceCallPrivacySwitch");
                        }
                    }
                } else {
                    throw C18270x1.A0S("privacySettingManager");
                }
            } else {
                throw C18270x1.A0S("privacySettingManager");
            }
        }
        if (i != 5) {
            z = false;
        }
        switchCompat.setChecked(z);
    }

    public void onStop() {
        int i;
        if (!C18270x1.A1V(this.A0A) && (i = this.A01) != this.A00) {
            C55912r7 r2 = this.A04;
            if (r2 != null) {
                r2.A05("calladd", AnonymousClass35B.A03("calladd", i));
                if (this.A01 == 5) {
                    C66493Lq r1 = this.A06;
                    if (r1 != null) {
                        r1.A0C(0, false);
                    } else {
                        throw C18270x1.A0S("groupChatManager");
                    }
                }
            } else {
                throw C18270x1.A0S("privacySettingManager");
            }
        }
        super.onStop();
    }

    public SettingsCallingPrivacyActivity(int i) {
        this.A09 = false;
        AnonymousClass4HY.A00(this, 111);
    }

    public void BbP() {
        A74();
    }

    public void onPause() {
        super.onPause();
        C55912r7 r0 = this.A04;
        if (r0 != null) {
            r0.A08.remove(this);
            return;
        }
        throw C18270x1.A0S("privacySettingManager");
    }

    public void onResume() {
        super.onResume();
        C55912r7 r1 = this.A04;
        if (r1 != null) {
            int A012 = r1.A01("calladd");
            this.A00 = A012;
            this.A01 = A012;
            if (C18270x1.A1V(this.A0A)) {
                C55912r7 r0 = this.A04;
                if (r0 != null) {
                    r0.A08.add(this);
                } else {
                    throw C18270x1.A0S("privacySettingManager");
                }
            }
            A74();
            return;
        }
        throw C18270x1.A0S("privacySettingManager");
    }

    public SettingsCallingPrivacyActivity() {
        this(0);
        this.A0A = C154517dI.A01(new C79513wk(this));
    }
}
