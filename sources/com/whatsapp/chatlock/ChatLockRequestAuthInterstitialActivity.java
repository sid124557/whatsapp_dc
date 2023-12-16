package com.whatsapp.chatlock;

import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5AS;
import X.AnonymousClass66R;
import X.C106995aW;
import X.C107695bk;
import X.C154517dI;
import X.C18270x1;
import X.C18310x6;
import X.C64333Db;
import X.C77303tB;
import X.C86574Kq;
import X.C89644eZ;
import X.C91584kP;
import X.C91604kR;
import X.C95814uZ;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockRequestAuthInterstitialActivity extends C89644eZ {
    public C106995aW A00;
    public boolean A01;
    public final C86574Kq A02;
    public final AnonymousClass66R A03;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = (C106995aW) A002.A4q.get();
        }
    }

    public void onDestroy() {
        C106995aW r1 = this.A00;
        if (r1 != null) {
            r1.A00 = false;
            super.onDestroy();
            return;
        }
        throw C18270x1.A0S("chatLockManager");
    }

    public ChatLockRequestAuthInterstitialActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 30);
    }

    public final void A74() {
        AnonymousClass5AS r6;
        int i;
        boolean A1N = AnonymousClass0x9.A1N(getIntent(), "extra_open_chat_directly");
        C95814uZ r0 = (C95814uZ) this.A03.getValue();
        if (r0 != null) {
            r6 = new C91584kP(r0, A1N);
        } else {
            r6 = C91604kR.A00;
        }
        C106995aW r5 = this.A00;
        if (r5 != null) {
            C86574Kq r4 = this.A02;
            Intent intent = getIntent();
            boolean z = false;
            if (intent != null) {
                z = C18310x6.A1W(intent.hasExtra("extra_unlock_entry_point") ? 1 : 0);
            }
            int i2 = 8;
            if (z) {
                i2 = getIntent().getIntExtra("extra_unlock_entry_point", 8);
                i = 4;
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = 2;
                    } else if (i2 == 2) {
                        i = 6;
                    }
                }
                r5.A08(this, r6, r4, i);
                return;
            }
            if (i2 != 3) {
                i = 0;
                if (i2 != 4) {
                    i = 5;
                    if (i2 == 5) {
                        i = 3;
                    } else if (i2 == 7) {
                        i = 8;
                    } else if (i2 == 9) {
                        i = 9;
                    }
                }
            } else {
                i = 7;
            }
            r5.A08(this, r6, r4, i);
            return;
        }
        throw C18270x1.A0S("chatLockManager");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0x2.A0z(findViewById(R.id.back_btn), this, 9);
        AnonymousClass0x2.A0z(findViewById(R.id.unlock_btn), this, 10);
        A74();
    }

    public ChatLockRequestAuthInterstitialActivity() {
        this(0);
        this.A03 = C154517dI.A01(new C77303tB(this));
        this.A02 = new C86574Kq(this, 1);
    }
}
