package com.whatsapp.chatlock;

import X.AnonymousClass4SG;
import X.AnonymousClass5UK;
import X.AnonymousClass68W;
import X.C104115Ps;
import X.C105095To;
import X.C106995aW;
import X.C107695bk;
import X.C18270x1;
import X.C64333Db;
import X.C86654Ky;
import X.C89524d8;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockCreateSecretCodeActivity extends C89524d8 {
    public int A00;
    public C106995aW A01;
    public C104115Ps A02;
    public AnonymousClass5UK A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A02 = (C105095To) A2Y.A4r.get();
            this.A03 = (AnonymousClass5UK) A2Y.A4p.get();
            this.A02 = (C104115Ps) A2Y.A4s.get();
            this.A01 = C86654Ky.A0V(A2Y);
        }
    }

    public ChatLockCreateSecretCodeActivity(int i) {
        this.A04 = false;
        AnonymousClass68W.A00(this, 25);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2 = 0;
        this.A00 = getIntent().getIntExtra("entrypoint", 0);
        super.onCreate(bundle);
        if (A75().A03()) {
            setTitle(R.string.f11nameremoved);
            if (this.A00 == 2) {
                A74().requestFocus();
            }
            i = 3;
        } else {
            setTitle(R.string.f11nameremoved);
            A74().requestFocus();
            i = 0;
        }
        if (this.A00 != 2) {
            i2 = 1;
        }
        AnonymousClass5UK r2 = this.A03;
        if (r2 != null) {
            r2.A05(Integer.valueOf(i), Integer.valueOf(i2));
            A74().setHelperText(getString(R.string.f11nameremoved));
            return;
        }
        throw C18270x1.A0S("chatLockLogger");
    }

    public ChatLockCreateSecretCodeActivity() {
        this(0);
    }
}
