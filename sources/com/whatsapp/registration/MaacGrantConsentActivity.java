package com.whatsapp.registration;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass3DZ;
import X.AnonymousClass3Q0;
import X.AnonymousClass4HY;
import X.C107635bd;
import X.C107695bk;
import X.C111095hX;
import X.C138306q6;
import X.C18260x0;
import X.C18270x1;
import X.C18320x8;
import X.C49552gi;
import X.C52062kp;
import X.C54292oU;
import X.C56972sr;
import X.C620633i;
import X.C634339f;
import X.C64333Db;
import X.C69263Wi;
import X.C84614Da;
import X.C89644eZ;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class MaacGrantConsentActivity extends C89644eZ implements C84614Da {
    public C54292oU A00;
    public C49552gi A01;
    public boolean A02;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C54292oU r1 = this.A00;
        if (r1 != null) {
            C52062kp r2 = new C52062kp(r1, new C138306q6());
            if (Binder.getCallingUid() != Process.myUid()) {
                r2.A00().A00();
            }
            if (C56972sr.A00(this.A01) == null || !this.A09.A02()) {
                Log.e("MaacGrantConsentActivity/not logged in");
                A74(false);
            }
            setContentView((int) R.layout.f8nameremoved);
            AnonymousClass1Hf.A2A(this);
            AnonymousClass1VX r9 = this.A0D;
            C69263Wi r6 = this.A05;
            C111095hX r5 = this.A00;
            C620633i r8 = this.A08;
            C107635bd.A0E(this, this.A03.A00("https://faq.whatsapp.com"), r5, r6, AnonymousClass0x7.A0K(this.A00, R.id.description_with_learn_more), r8, r9, getString(R.string.f11nameremoved), "learn-more");
            C49552gi r0 = this.A01;
            if (r0 != null) {
                C634339f.A00(findViewById(R.id.give_consent_button), this, new AnonymousClass3Q0(r0), 13);
                AnonymousClass0x2.A0y(findViewById(R.id.do_not_give_consent_button), this, 22);
                AnonymousClass0x2.A0y(findViewById(R.id.close_button), this, 23);
                return;
            }
            throw C18270x1.A0S("mexGraphQlClient");
        }
        throw C18270x1.A0S("waContext");
    }

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = C64333Db.A2q(A002);
            this.A01 = A002.Anh();
        }
    }

    public void Bex() {
        Log.i("MaacGrantConsentActivity/onUpdateConsentFailure/");
        A74(false);
    }

    public void Bey() {
        Log.i("MaacGrantConsentActivity/onUpdateConsentSuccess/");
        A74(true);
    }

    public MaacGrantConsentActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 104);
    }

    public final void A74(boolean z) {
        C18260x0.A1E("MaacGrantConsentActivity/returnResult/", AnonymousClass001.A0o(), z);
        AnonymousClass0x2.A0m(this, C18320x8.A07().putExtra("result", z));
    }

    public MaacGrantConsentActivity() {
        this(0);
    }
}
