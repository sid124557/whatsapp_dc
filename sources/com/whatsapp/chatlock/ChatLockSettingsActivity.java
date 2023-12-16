package com.whatsapp.chatlock;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5UK;
import X.AnonymousClass6FH;
import X.C104115Ps;
import X.C105095To;
import X.C106995aW;
import X.C107695bk;
import X.C109325eR;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C64333Db;
import X.C88694ab;
import X.C89644eZ;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class ChatLockSettingsActivity extends C89644eZ {
    public LinearLayout A00;
    public SwitchCompat A01;
    public WaTextView A02;
    public C106995aW A03;
    public C104115Ps A04;
    public AnonymousClass5UK A05;
    public C105095To A06;
    public boolean A07;

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A05 = (AnonymousClass5UK) A002.A4p.get();
            this.A03 = (C106995aW) A002.A4q.get();
            this.A06 = (C105095To) A002.A4r.get();
            this.A04 = (C104115Ps) A002.A4s.get();
        }
    }

    public final C106995aW A74() {
        C106995aW r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatLockManager");
    }

    public final void A75() {
        WaTextView waTextView = this.A02;
        if (waTextView == null) {
            throw C18270x1.A0S("secretCodeState");
        }
        C105095To r0 = this.A06;
        if (r0 != null) {
            boolean A032 = r0.A03();
            int i = R.string.f11nameremoved;
            if (A032) {
                i = R.string.f11nameremoved;
            }
            waTextView.setText(i);
            return;
        }
        throw C18270x1.A0S("passcodeManager");
    }

    public final void A76(int i) {
        C88694ab A002 = C88694ab.A00(this.A00, i, 0);
        AnonymousClass6FH r4 = A002.A0J;
        ViewGroup.LayoutParams layoutParams = r4.getLayoutParams();
        C162457s7.A0K(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        marginLayoutParams.setMargins(dimensionPixelSize, marginLayoutParams.topMargin, dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        r4.setLayoutParams(marginLayoutParams);
        A002.A0E(new C109325eR(A002, 14), R.string.f11nameremoved);
        A002.A05();
    }

    public ChatLockSettingsActivity(int i) {
        this.A07 = false;
        AnonymousClass4HY.A00(this, 31);
    }

    public final void A77(boolean z) {
        if (z != A74().A0G()) {
            AnonymousClass5UK r1 = this.A05;
            if (r1 != null) {
                r1.A00(C18280x3.A01(z ? 1 : 0));
            } else {
                throw C18270x1.A0S("chatLockLogger");
            }
        }
        A74().A0F(z);
        SwitchCompat switchCompat = this.A01;
        if (switchCompat == null) {
            throw C18270x1.A0S("hideLockedChatsSwitch");
        }
        switchCompat.setChecked(A74().A0G());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            if (i == 2) {
                int i3 = R.string.f11nameremoved;
                if (i2 != 3) {
                    if (i2 == 4) {
                        i3 = R.string.f11nameremoved;
                    }
                }
                A76(i3);
                A77(true);
            }
        } else if (i2 == -1) {
            A76(R.string.f11nameremoved);
        } else if (i2 == 2) {
            A76(R.string.f11nameremoved);
            A77(false);
        }
        A75();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004f, code lost:
        if (r2.A0Y(r1, 6243) == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            r0 = 2131887676(0x7f12063c, float:1.9409966E38)
            java.lang.String r0 = r3.getString(r0)
            r3.setTitle(r0)
            X.AnonymousClass1Hf.A2E(r3)
            r0 = 2131624342(0x7f0e0196, float:1.887586E38)
            r3.setContentView((int) r0)
            r0 = 2131433390(0x7f0b17ae, float:1.8488564E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 13
            X.AnonymousClass0x2.A0z(r1, r3, r0)
            r0 = 2131430616(0x7f0b0cd8, float:1.8482938E38)
            android.view.View r0 = X.C18290x4.A0N(r3, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.A00 = r0
            r0 = 2131430617(0x7f0b0cd9, float:1.848294E38)
            android.view.View r0 = X.C18290x4.A0N(r3, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r3.A01 = r0
            X.5aW r0 = r3.A74()
            X.1VX r2 = r0.A04
            r0 = 5854(0x16de, float:8.203E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0051
            r0 = 6243(0x1863, float:8.748E-42)
            boolean r1 = r2.A0Y(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            java.lang.String r2 = "hideLockedChatsSettingView"
            if (r0 == 0) goto L_0x007b
            androidx.appcompat.widget.SwitchCompat r1 = r3.A01
            if (r1 != 0) goto L_0x0061
            java.lang.String r0 = "hideLockedChatsSwitch"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0061:
            X.5aW r0 = r3.A74()
            boolean r0 = r0.A0G()
            r1.setChecked(r0)
            android.widget.LinearLayout r1 = r3.A00
            if (r1 != 0) goto L_0x0075
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0075:
            r0 = 12
            X.AnonymousClass0x2.A0z(r1, r3, r0)
            goto L_0x0089
        L_0x007b:
            android.widget.LinearLayout r1 = r3.A00
            if (r1 != 0) goto L_0x0084
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0084:
            r0 = 8
            r1.setVisibility(r0)
        L_0x0089:
            r0 = 2131433393(0x7f0b17b1, float:1.848857E38)
            android.view.View r0 = X.C18290x4.A0N(r3, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r3.A02 = r0
            r3.A75()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatlock.ChatLockSettingsActivity.onCreate(android.os.Bundle):void");
    }

    public ChatLockSettingsActivity() {
        this(0);
    }
}
