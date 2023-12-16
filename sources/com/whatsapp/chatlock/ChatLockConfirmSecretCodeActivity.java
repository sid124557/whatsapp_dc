package com.whatsapp.chatlock;

import X.AnonymousClass0Y8;
import X.AnonymousClass4SG;
import X.AnonymousClass5UK;
import X.AnonymousClass68W;
import X.C104115Ps;
import X.C105095To;
import X.C107695bk;
import X.C1213060a;
import X.C18270x1;
import X.C64333Db;
import X.C86664Kz;
import X.C89524d8;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockConfirmSecretCodeActivity extends C89524d8 {
    public int A00;
    public C104115Ps A01;
    public AnonymousClass5UK A02;
    public String A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A02 = (C105095To) A2Y.A4r.get();
            this.A02 = (AnonymousClass5UK) A2Y.A4p.get();
            this.A01 = (C104115Ps) A2Y.A4s.get();
        }
    }

    public ChatLockConfirmSecretCodeActivity(int i) {
        this.A04 = false;
        AnonymousClass68W.A00(this, 24);
    }

    public void A78() {
        super.A78();
        String str = this.A03;
        if (str == null) {
            throw C18270x1.A0S("correctSecretCode");
        } else if (str.length() == 0) {
            A75().A01(A77(), new C1213060a(this));
        } else if (A7A()) {
            A7C();
        } else {
            A7B();
        }
    }

    public final void A7B() {
        A74().setEndIconMode(2);
        A74().setEndIconTintList(C86664Kz.A0V(this, R.color.f5nameremoved));
        A74().setHelperText("");
        A74().setHelperTextColor(AnonymousClass0Y8.A07(this, R.color.f5nameremoved));
    }

    public final void A7C() {
        A74().setError((CharSequence) null);
        A74().setEndIconMode(-1);
        A74().setEndIconDrawable((int) R.drawable.vec_ic_check_circle_24dp);
        A74().setEndIconContentDescription((int) R.string.f11nameremoved);
        A74().setEndIconTintList(C86664Kz.A0V(this, R.color.f5nameremoved));
        A74().setHelperText(getResources().getString(R.string.f11nameremoved));
        A74().setHelperTextColor(AnonymousClass0Y8.A07(this, R.color.f5nameremoved));
    }

    public void onCreate(Bundle bundle) {
        int i = 0;
        this.A00 = getIntent().getIntExtra("entrypoint", 0);
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        A74().requestFocus();
        String stringExtra = getIntent().getStringExtra("extra_secret_code");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.A03 = stringExtra;
        if (this.A00 != 2) {
            i = 1;
        }
        AnonymousClass5UK r2 = this.A02;
        if (r2 != null) {
            r2.A05(1, Integer.valueOf(i));
            return;
        }
        throw C18270x1.A0S("chatLockLogger");
    }

    public ChatLockConfirmSecretCodeActivity() {
        this(0);
    }
}
