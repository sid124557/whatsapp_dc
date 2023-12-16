package com.whatsapp.settings.autoconf;

import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass3DZ;
import X.AnonymousClass3Q0;
import X.AnonymousClass48U;
import X.AnonymousClass4HY;
import X.AnonymousClass7J9;
import X.C107635bd;
import X.C107695bk;
import X.C111095hX;
import X.C18270x1;
import X.C18280x3;
import X.C49552gi;
import X.C620633i;
import X.C634139d;
import X.C64333Db;
import X.C67593Px;
import X.C69263Wi;
import X.C84614Da;
import X.C89644eZ;
import android.os.Bundle;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.infra.graphql.generated.autoconf.CheckAutoConfConsentQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.autoconf.CheckAutoConfConsentResponseImpl;
import com.whatsapp.util.Log;

public final class ShareAutoConfVerifierActivity extends C89644eZ implements C84614Da, AnonymousClass48U {
    public SwitchCompat A00;
    public C49552gi A01;
    public C67593Px A02;
    public AnonymousClass3Q0 A03;
    public boolean A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1VX r9 = this.A0D;
        C69263Wi r6 = this.A05;
        C111095hX r5 = this.A00;
        C620633i r8 = this.A08;
        C107635bd.A0E(this, this.A03.A00("https://faq.whatsapp.com"), r5, r6, AnonymousClass0x7.A0K(this.A00, R.id.description_with_learn_more), r8, r9, getString(R.string.f11nameremoved), "learn-more");
        C49552gi r1 = this.A01;
        if (r1 != null) {
            this.A02 = new C67593Px(r1);
            this.A03 = new AnonymousClass3Q0(r1);
            SwitchCompat switchCompat = (SwitchCompat) C18280x3.A0E(this.A00, R.id.consent_toggle_switch_compat);
            this.A00 = switchCompat;
            if (switchCompat == null) {
                throw C18270x1.A0S("consentSwitch");
            }
            switchCompat.setChecked(C18280x3.A1W(AnonymousClass1Hf.A27(this), "autoconf_consent_given"));
            C634139d.A00(C18280x3.A0E(this.A00, R.id.consent_toggle_layout), this, 33);
            return;
        }
        throw C18270x1.A0S("mexGraphQlClient");
    }

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = A002.Anh();
        }
    }

    public void Bex() {
        Log.i("ShareAutoConfVerifierActivity/onUpdateConsentFailure/");
    }

    public void Bey() {
        Log.i("ShareAutoConfVerifierActivity/onUpdateConsentSuccess/");
        SwitchCompat switchCompat = this.A00;
        if (switchCompat == null) {
            throw C18270x1.A0S("consentSwitch");
        }
        switchCompat.toggle();
        AnonymousClass33p r1 = this.A09;
        SwitchCompat switchCompat2 = this.A00;
        if (switchCompat2 == null) {
            throw C18270x1.A0S("consentSwitch");
        }
        C18270x1.A0l(C18270x1.A03(r1), "autoconf_consent_given", switchCompat2.isChecked());
    }

    public ShareAutoConfVerifierActivity(int i) {
        this.A04 = false;
        AnonymousClass4HY.A00(this, 115);
    }

    public void onResume() {
        super.onResume();
        C67593Px r4 = this.A02;
        if (r4 == null) {
            throw C18270x1.A0S("checkAutoConfConsentManager");
        }
        Log.i("CheckAutoConfConsentManager/checkAutoConfConsent");
        r4.A00 = this;
        r4.A01.A00(new AnonymousClass7J9(new CheckAutoConfConsentQueryImpl$Builder().A00, CheckAutoConfConsentResponseImpl.class, "CheckAutoConfConsent"), r4).A00();
    }

    public ShareAutoConfVerifierActivity() {
        this(0);
    }
}
