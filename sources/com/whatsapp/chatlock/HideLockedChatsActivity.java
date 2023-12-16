package com.whatsapp.chatlock;

import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C105095To;
import X.C107695bk;
import X.C18270x1;
import X.C18290x4;
import X.C64333Db;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class HideLockedChatsActivity extends C89644eZ {
    public C105095To A00;
    public WDSButton A01;
    public WDSButton A02;
    public boolean A03;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = (C105095To) A002.A4r.get();
        }
    }

    public HideLockedChatsActivity(int i) {
        this.A03 = false;
        AnonymousClass4HY.A00(this, 32);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            if (i2 == -1) {
                i3 = 3;
            } else {
                return;
            }
        } else if (i == 1 && i2 == -1) {
            i3 = 4;
        } else {
            return;
        }
        setResult(i3);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass1Hf.A2E(this);
        setTitle(R.string.f11nameremoved);
        this.A01 = (WDSButton) C18290x4.A0N(this, R.id.chat_lock_primary_button);
        this.A02 = (WDSButton) C18290x4.A0N(this, R.id.chat_lock_secondary_button);
        C105095To r0 = this.A00;
        if (r0 != null) {
            boolean A032 = r0.A03();
            WDSButton wDSButton = this.A01;
            if (A032) {
                if (wDSButton == null) {
                    throw C18270x1.A0S("primaryButton");
                }
                wDSButton.setText(R.string.f11nameremoved);
                WDSButton wDSButton2 = this.A01;
                if (wDSButton2 == null) {
                    throw C18270x1.A0S("primaryButton");
                }
                AnonymousClass0x2.A0z(wDSButton2, this, 15);
                WDSButton wDSButton3 = this.A02;
                if (wDSButton3 == null) {
                    throw C18270x1.A0S("secondaryButton");
                }
                wDSButton3.setText(R.string.f11nameremoved);
                WDSButton wDSButton4 = this.A02;
                if (wDSButton4 == null) {
                    throw C18270x1.A0S("secondaryButton");
                }
                AnonymousClass0x2.A0z(wDSButton4, this, 16);
            } else if (wDSButton == null) {
                throw C18270x1.A0S("primaryButton");
            } else {
                wDSButton.setText(R.string.f11nameremoved);
                WDSButton wDSButton5 = this.A01;
                if (wDSButton5 == null) {
                    throw C18270x1.A0S("primaryButton");
                }
                AnonymousClass0x2.A0z(wDSButton5, this, 17);
                WDSButton wDSButton6 = this.A02;
                if (wDSButton6 == null) {
                    throw C18270x1.A0S("secondaryButton");
                }
                wDSButton6.setVisibility(8);
            }
        } else {
            throw C18270x1.A0S("passcodeManager");
        }
    }

    public HideLockedChatsActivity() {
        this(0);
    }
}
