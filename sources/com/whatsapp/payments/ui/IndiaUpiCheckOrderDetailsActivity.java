package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0x7;
import X.AnonymousClass11I;
import X.AnonymousClass1VX;
import X.AnonymousClass213;
import X.AnonymousClass2BO;
import X.AnonymousClass2YZ;
import X.AnonymousClass2z0;
import X.AnonymousClass303;
import X.AnonymousClass32Y;
import X.AnonymousClass34V;
import X.AnonymousClass36F;
import X.AnonymousClass394;
import X.AnonymousClass39L;
import X.AnonymousClass39Q;
import X.AnonymousClass39U;
import X.AnonymousClass3SP;
import X.AnonymousClass4B3;
import X.AnonymousClass4DV;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass99D;
import X.AnonymousClass99L;
import X.AnonymousClass9Cs;
import X.AnonymousClass9DC;
import X.AnonymousClass9ER;
import X.AnonymousClass9G4;
import X.AnonymousClass9QL;
import X.AnonymousClass9U4;
import X.AnonymousClass9UM;
import X.AnonymousClass9W9;
import X.AnonymousClass9b0;
import X.C106715a2;
import X.C107395bF;
import X.C151007Tb;
import X.C18290x4;
import X.C1899593h;
import X.C1907099n;
import X.C191919Gy;
import X.C192769Lm;
import X.C194069Rl;
import X.C194229Sb;
import X.C195219Wq;
import X.C197389d3;
import X.C197419d8;
import X.C200299i6;
import X.C200319i8;
import X.C203469nk;
import X.C203999oe;
import X.C205119qS;
import X.C29271iY;
import X.C29431io;
import X.C46782cC;
import X.C47752dl;
import X.C52622lm;
import X.C55942rA;
import X.C56422rx;
import X.C56612sH;
import X.C56972sr;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import X.C63713Ai;
import X.C64773Ex;
import X.C66473Lo;
import X.C66543Lv;
import X.C69263Wi;
import X.C86624Kv;
import X.C95814uZ;
import X.C97204xo;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class IndiaUpiCheckOrderDetailsActivity extends AnonymousClass9Cs implements C203469nk {
    public C64773Ex A00;
    public C56422rx A01;
    public C620733j A02;
    public C29431io A03;
    public C97204xo A04;
    public AnonymousClass9b0 A05;
    public C191919Gy A06;
    public C197419d8 A07;
    public AnonymousClass9ER A08;
    public C194229Sb A09;
    public C55942rA A0A;
    public C106715a2 A0B;
    public List A0C;

    public final void A8b(AnonymousClass213 r16, AnonymousClass9QL r17, int i) {
        int i2;
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        int i3 = i;
        if (supportActionBar != null) {
            C47752dl r4 = AnonymousClass2BO.A00;
            Resources resources = getResources();
            AnonymousClass1VX r2 = this.A0D;
            int i4 = R.array.f2nameremoved;
            if (i3 == 1) {
                i4 = R.array.f2nameremoved;
            }
            supportActionBar.A0J(r4.A00(resources, r2, new Object[0], i4));
        }
        int i5 = 11;
        if (i3 == 1) {
            i5 = 4;
        }
        AnonymousClass9QL r10 = r17;
        this.A0A.A03(r10.A0B, this.A07.A0A, i5);
        if (AnonymousClass9UM.A01(this, this.A0D, this.A09).get(this.A07.A0A) == null) {
            i2 = 0;
        } else {
            i2 = 1;
            if (this.A0A) {
                i2 = 5;
            }
        }
        if (TextUtils.isEmpty(this.A07)) {
            this.A07 = this.A07.A0E;
        }
        C197419d8 r0 = this.A07;
        r0.A05.A02(this, this.A01, r16, r10, r0.A0A, this.A09, i2, i3);
    }

    public boolean BIW() {
        if (this instanceof IndiaUpiQuickBuyActivity) {
            return true;
        }
        return false;
    }

    public void BXS(AnonymousClass213 r5, AnonymousClass9QL r6) {
        if (!(this instanceof IndiaUpiQuickBuyActivity)) {
            A8b(r5, r6, r6.A00);
        } else if (this.A0A) {
            Objects.requireNonNull(this.A09);
            C626936e.A0B(!this.A09.isEmpty());
            AnonymousClass3SP r0 = (AnonymousClass3SP) ((AnonymousClass394) this.A09.get(0)).A00;
            Objects.requireNonNull(r0);
            String str = r0.A02;
            BpY(C192769Lm.A00(this, this.A0D, AnonymousClass32Y.A03(this.A04.A00), str), 0);
            A8R(false);
        } else {
            AnonymousClass0x7.A1B(new C203999oe(r6, 3, this), this.A04);
        }
    }

    public void BbI(AnonymousClass39L r4) {
        C56972sr r1 = this.A01;
        r1.A0P();
        if (r1.A0b(r1.A04)) {
            Bot(R.string.f11nameremoved);
        } else if (AnonymousClass9DC.A17(this)) {
            this.A04.BkM(new C200299i6(new C205119qS(r4, this, 1), this));
        } else {
            A8P(r4);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C56612sH r8 = this.A06;
        AnonymousClass1VX r7 = this.A0D;
        C106715a2 r6 = this.A0B;
        Resources resources = getResources();
        C195219Wq r5 = this.A0W;
        C620733j r4 = this.A02;
        AnonymousClass9U4 r3 = this.A0P;
        AnonymousClass9G4 r32 = new AnonymousClass9G4(resources, this.A01, r8, r4, this.A07, r7, this.A0O, r3, r5, r6);
        C56612sH r20 = this.A06;
        AnonymousClass1VX r38 = this.A0D;
        C69263Wi r14 = this.A05;
        C106715a2 r13 = this.A0B;
        AnonymousClass4FS r37 = this.A04;
        C195219Wq r12 = this.A0W;
        C620733j r11 = this.A02;
        C194229Sb r10 = this.A09;
        C64773Ex r82 = this.A00;
        AnonymousClass9U4 r72 = this.A0P;
        C66543Lv r62 = this.A08;
        C29431io r24 = this.A03;
        C56422rx r19 = this.A01;
        C1907099n r52 = this.A0O;
        AnonymousClass36F r42 = this.A07;
        AnonymousClass9b0 r33 = this.A05;
        C66473Lo r2 = this.A07;
        C55942rA r1 = this.A0A;
        C29271iY r27 = this.A0Q;
        C46782cC r15 = this.A0V;
        C620733j r21 = r11;
        C66473Lo r22 = r2;
        C66543Lv r23 = r62;
        C69263Wi r17 = r14;
        C64773Ex r18 = r82;
        this.A07 = new C197419d8(r17, r18, r19, r20, r21, r22, r23, r24, r42, r38, r27, r52, r72, r33, r15, r32, r10, r12, r1, r13, r37);
        C620633i r34 = this.A08;
        AnonymousClass2z0 A022 = C107395bF.A02(getIntent());
        Objects.requireNonNull(A022);
        boolean BIW = BIW();
        C195219Wq r25 = this.A0W;
        this.A07.A00(this, this, (AnonymousClass11I) AnonymousClass4L0.A0F(new C63713Ai(r19, r34, r20, r24, r38, (UserJid) null, r27, this.A0P, r15, r25, A022, r37, false, BIW), this).A01(AnonymousClass11I.class));
        if (!(this instanceof IndiaUpiQuickBuyActivity)) {
            AnonymousClass0R8 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0N(true);
            }
            setContentView((View) this.A07.A05);
        }
        C197419d8 r0 = this.A07;
        AnonymousClass2z0 r63 = r0.A09;
        this.A04 = r63;
        AnonymousClass99L r53 = this.A0O;
        String str = r0.A0D;
        if (str == null) {
            str = "";
        }
        r53.A02 = new AnonymousClass39U(r0.A00, str, r63.A01);
        if (this.A06 == null) {
            C191919Gy r16 = new C191919Gy(this, r63);
            this.A06 = r16;
            AnonymousClass0x7.A1B(r16, this.A04);
        }
        A7u();
    }

    public void A7O(Intent intent) {
        super.A7O(intent);
        intent.putExtra("extra_order_id", this.A07.A0D);
        intent.putExtra("extra_order_expiry_ts_in_sec", this.A07.A00);
        intent.putExtra("extra_payment_config_id", this.A07.A0E);
    }

    public void A83(AnonymousClass99D r4, AnonymousClass99D r5, AnonymousClass34V r6, String str, String str2, boolean z) {
        super.A83(r4, r5, r6, str, str2, z);
        if (r6 == null && r4 == null && r5 == null && str != null) {
            this.A04.BkM(new C200319i8(new C197389d3(str), this));
        }
    }

    public final void A8Z(AnonymousClass39Q r9, String str) {
        String str2;
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("action", "start");
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put("receiver_jid", this.A0E.getRawString());
        A0t2.put("receiver_vpa", str);
        A0t2.put("order_message_id", this.A07.A09.A01);
        C52622lm r5 = new C52622lm("upi_p2m_order_payment", (String) null, A0t);
        if (this instanceof IndiaUpiQuickBuyActivity) {
            str2 = "chat";
        } else {
            str2 = "order_details";
        }
        ((AnonymousClass2YZ) this.A0j.get()).A00((AnonymousClass4B3) null, new AnonymousClass9W9(r9, 1, this), r5, str2, A0t2);
    }

    public void A8a(AnonymousClass39L r14) {
        AnonymousClass303 A0K = C1899593h.A0K();
        C195219Wq r3 = this.A0W;
        C151007Tb A002 = r3.A0D.A0C("p2p_context").A00();
        boolean z = false;
        if (A002 != null) {
            String str = A002.A03;
            if ((str.equals("unset") || str.equals("tos_with_wallet") || str.equals("tos_no_wallet")) && !r3.A0A.A03().getBoolean("pref_p2m_hybrid_tos_accepted", false)) {
                z = true;
            }
        }
        A0K.A04("tos_displayed", z);
        this.A0S.BKF(A0K, AnonymousClass001.A0f(), C18290x4.A0c(), "order_details", "chat", this.A0i, this.A0h, false, true);
        this.A04.BkM(new C200299i6(new C205119qS(r14, this, 0), this));
    }

    public boolean BH6() {
        return !BIW();
    }

    public void BXT(AnonymousClass213 r2, AnonymousClass9QL r3) {
        if (BIW()) {
            finish();
        } else {
            A8b(r2, r3, 4);
        }
    }

    public void onStart() {
        super.onStart();
        if (BIW()) {
            overridePendingTransition(0, 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!BIW()) {
            return super.onTouchEvent(motionEvent);
        }
        C86624Kv.A0f(this);
        return true;
    }

    public void BPi(AnonymousClass39L r1, C95814uZ r2, C194069Rl r3, AnonymousClass4DV r4) {
    }
}
