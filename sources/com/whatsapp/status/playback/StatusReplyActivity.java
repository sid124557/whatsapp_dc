package com.whatsapp.status.playback;

import X.AnonymousClass001;
import X.AnonymousClass4FW;
import X.AnonymousClass4L0;
import X.AnonymousClass4Rn;
import X.AnonymousClass4SG;
import X.AnonymousClass5DN;
import X.AnonymousClass5Ul;
import X.AnonymousClass5ZC;
import X.AnonymousClass68W;
import X.AnonymousClass6BG;
import X.C06560Yg;
import X.C105895Wv;
import X.C113995mK;
import X.C114005mL;
import X.C124166Bf;
import X.C18320x8;
import X.C29431io;
import X.C58152un;
import X.C60862zI;
import X.C64333Db;
import X.C71293bs;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C88834as;
import X.C89214c6;
import X.C94264qq;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.inputmethod.EditorInfoCompat;

public class StatusReplyActivity extends MessageReplyActivity {
    public C60862zI A00;
    public C29431io A01;
    public C113995mK A02;
    public boolean A03;
    public final Rect A04;
    public final ViewTreeObserver.OnGlobalLayoutListener A05;
    public final AnonymousClass4FW A06;
    public final Runnable A07;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3X(r1, this, AnonymousClass4SG.A32(r1, this));
            AnonymousClass4SG.A3Y(r1, this, C86604Kt.A0V(r1));
            this.A0m = C86644Kx.A0V(r1);
            this.A0X = (C114005mL) r1.AMg.get();
            this.A0H = (AnonymousClass5Ul) r1.AUW.get();
            this.A0d = C86614Ku.A0X(r1);
            AnonymousClass4SG.A3b(r1, C86604Kt.A0Z(r1), this);
            this.A0f = C86604Kt.A0X(r1);
            this.A0T = C86604Kt.A0S(r1);
            this.A0q = C86614Ku.A0b(r1);
            this.A0Q = C86604Kt.A0P(r1);
            this.A1K = C86614Ku.A0n(r1);
            this.A0V = C86624Kv.A0Q(r1);
            this.A1P = C72343dZ.A00(r1.ASJ);
            AnonymousClass4SG.A3c(r1, this, C86614Ku.A0m(r1));
            AnonymousClass4SG.A3a(r1, C86604Kt.A0R(r1), this);
            this.A0P = C86614Ku.A0P(r1);
            this.A0g = AnonymousClass4SG.A2k(r1);
            AnonymousClass4SG.A3N(A2X, r1, C86614Ku.A0V(r1), this);
            this.A0y = C86614Ku.A0g(r1);
            this.A0W = C86604Kt.A0U(r1);
            AnonymousClass4SG.A3P(A2X, r1, this);
            this.A0G = (AnonymousClass5DN) A2X.A1I.get();
            this.A01 = C86634Kw.A0g(r1);
            this.A02 = (C113995mK) r1.AWt.get();
            this.A00 = (C60862zI) r1.AMd.get();
        }
    }

    public boolean A64() {
        return true;
    }

    public final void A7I() {
        int i;
        C89214c6 r0;
        AnonymousClass4Rn r02;
        int identifier;
        C94264qq r03;
        View view = this.A05;
        Rect rect = this.A04;
        view.getWindowVisibleDisplayFrame(rect);
        int[] A1Z = C86664Kz.A1Z();
        this.A05.getLocationOnScreen(A1Z);
        int A052 = AnonymousClass4L0.A05(this.A04, rect.bottom);
        if (!C105895Wv.A00(this.A05) && (r03 = this.A0k) != null && r03.isShowing()) {
            r02 = this.A0k;
        } else if (C105895Wv.A00(this.A05) || (r0 = this.A0U.A02) == null || !r0.isShowing()) {
            i = 0;
            int i2 = (A052 - i) - A1Z[1];
            if (Build.MANUFACTURER.equalsIgnoreCase("Essential Products") && Build.MODEL.equalsIgnoreCase("PH-1") && (identifier = getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                i2 -= C18320x8.A00(this, identifier);
            }
            View view2 = this.A04;
            C06560Yg.A0J(view2, i2 - view2.getTop());
        } else {
            r02 = this.A0U.A02;
        }
        i = r02.A01;
        int i22 = (A052 - i) - A1Z[1];
        i22 -= C18320x8.A00(this, identifier);
        View view22 = this.A04;
        C06560Yg.A0J(view22, i22 - view22.getTop());
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    public StatusReplyActivity(int i) {
        this.A03 = false;
        AnonymousClass68W.A00(this, 107);
    }

    public void onCreate(Bundle bundle) {
        getWindow().setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        getWindow().setFlags(134217728, 134217728);
        getWindow().setFlags(67108864, 67108864);
        super.onCreate(bundle);
        View view = this.A05;
        if (view != null) {
            view.setSystemUiVisibility(4);
            this.A05.getViewTreeObserver().addOnGlobalLayoutListener(this.A05);
            this.A01.A06(this.A06);
            AnonymousClass4SG.A3d(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01.A07(this.A06);
        View view = this.A05;
        if (view != null) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this.A05);
            this.A05.removeCallbacks(this.A07);
        }
    }

    public int A5t() {
        return 78318969;
    }

    public StatusReplyActivity() {
        this(0);
        this.A04 = AnonymousClass001.A0N();
        this.A07 = new C71293bs((Object) this, 49);
        this.A06 = new C124166Bf(this, 23);
        this.A05 = new AnonymousClass6BG((Object) this, 32);
    }
}
