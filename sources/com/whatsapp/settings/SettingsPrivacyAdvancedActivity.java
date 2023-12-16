package com.whatsapp.settings;

import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C106155Xv;
import X.C106715a2;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C53602nM;
import X.C58422vE;
import X.C634139d;
import X.C64333Db;
import X.C65203Gp;
import X.C71293bs;
import X.C89644eZ;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class SettingsPrivacyAdvancedActivity extends C89644eZ {
    public SwitchCompat A00;
    public C106155Xv A01;
    public C65203Gp A02;
    public C53602nM A03;
    public C106715a2 A04;
    public boolean A05;
    public boolean A06;

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A04 = C18280x3.A0Q(r1);
            this.A02 = (C65203Gp) A002.AXm.get();
            this.A03 = C18280x3.A0L(r1);
            this.A01 = (C106155Xv) A002.Aa5.get();
        }
    }

    public SettingsPrivacyAdvancedActivity(int i) {
        this.A06 = false;
        AnonymousClass4HY.A00(this, 113);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C106155Xv r0 = this.A01;
        if (r0 != null) {
            this.A05 = C18280x3.A1W(r0.A03(), "privacy_always_relay");
            AnonymousClass1Ha.A1m(this, R.layout.f8nameremoved).A0B(R.string.f11nameremoved);
            this.A00 = (SwitchCompat) C18290x4.A0N(this, R.id.call_relaying_privacy_switch);
            if (!this.A0D.A0Y(C58422vE.A02, 3436)) {
                AnonymousClass1Ha.A20(this, R.id.call_relaying_layout);
            }
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0N(this, R.id.call_relaying_description);
            C106715a2 r3 = this.A04;
            if (r3 != null) {
                SpannableStringBuilder A062 = r3.A06(textEmojiLabel.getContext(), new C71293bs((Object) this, 16), getString(R.string.f11nameremoved), "call_relaying_help", R.color.f5nameremoved);
                AnonymousClass0x2.A14(this.A0D, textEmojiLabel);
                textEmojiLabel.setText(A062);
                SwitchCompat switchCompat = this.A00;
                if (switchCompat == null) {
                    throw C18270x1.A0S("callRelayingPrivacySwitch");
                }
                C634139d.A00(switchCompat, this, 26);
                return;
            }
            throw C18270x1.A0S("linkifier");
        }
        throw C18270x1.A0S("voipSharedPreferences");
    }

    public void onResume() {
        super.onResume();
        C106155Xv r0 = this.A01;
        if (r0 != null) {
            boolean A1W = C18280x3.A1W(r0.A03(), "privacy_always_relay");
            this.A05 = A1W;
            SwitchCompat switchCompat = this.A00;
            if (switchCompat == null) {
                throw C18270x1.A0S("callRelayingPrivacySwitch");
            }
            switchCompat.setChecked(A1W);
            return;
        }
        throw C18270x1.A0S("voipSharedPreferences");
    }

    public SettingsPrivacyAdvancedActivity() {
        this(0);
    }
}
