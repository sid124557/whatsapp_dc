package com.whatsapp.payments.ui;

import X.AnonymousClass1S3;
import X.AnonymousClass32Y;
import X.AnonymousClass39L;
import X.AnonymousClass39Q;
import X.AnonymousClass3H6;
import X.AnonymousClass3YM;
import X.AnonymousClass3Zd;
import X.AnonymousClass4IY;
import X.AnonymousClass99L;
import X.AnonymousClass9RI;
import X.C08310eF;
import X.C162457s7;
import X.C166207yJ;
import X.C166587yw;
import X.C18270x1;
import X.C191149Cr;
import X.C202749mW;
import X.C30481mW;
import X.C45022Yj;
import X.C59942xk;
import X.C60042xu;
import X.C624134x;
import X.C626936e;
import X.C68033Rp;
import X.C70053Zs;
import X.C85204Fi;
import X.C85824Ht;
import X.C95814uZ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MotionEvent;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class IndiaWebViewUpiP2mHybridActivity extends C191149Cr {
    public AnonymousClass39L A00;

    public void A6O(int i) {
        setResult(2, getIntent());
        super.A6O(i);
    }

    public void A8J() {
        setResult(0, getIntent());
        finish();
        overridePendingTransition(0, 0);
    }

    public void A8P(AnonymousClass39L r9) {
        AnonymousClass39L r2 = r9;
        C162457s7.A0J(r9, 0);
        if (this.A0B == null) {
            A7w(this);
            BjL();
        } else if (A8Y()) {
            A8U();
        } else {
            A8R(true);
            A8W(r2, (C202749mW) null, new C68033Rp(this), (PaymentBottomSheet) null, new C70053Zs(r9, this), new AnonymousClass3Zd(this));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        setResult(0, getIntent());
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    public C30481mW A7o() {
        C45022Yj r0 = this.A0b;
        C95814uZ r1 = this.A0E;
        C626936e.A06(r1);
        return r0.A00(r1, (C624134x) null, new AnonymousClass3YM(), "", (List) null, 0);
    }

    public void A7y(C08310eF r2) {
        if (r2 instanceof PaymentBottomSheet) {
            ((PaymentBottomSheet) r2).A1a((DialogInterface.OnDismissListener) null);
        }
    }

    public void A7z(C08310eF r3) {
        if (r3 instanceof PaymentBottomSheet) {
            PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) r3;
            paymentBottomSheet.A1a(new AnonymousClass4IY(this, 1));
            paymentBottomSheet.A1Z(new C85824Ht(this, 8));
        }
    }

    public void A89(C59942xk r30, boolean z) {
        C166207yJ r0 = this.A0U;
        String str = null;
        if (r0 != null) {
            str = r0.A00;
        }
        AnonymousClass9RI r6 = this.A0I;
        C166587yw r8 = this.A0B;
        UserJid userJid = this.A0E;
        AnonymousClass39Q r7 = this.A09;
        String str2 = this.A0p;
        AnonymousClass99L r11 = this.A0O;
        String str3 = this.A06;
        long j = this.A00;
        String str4 = this.A0i;
        r6.A00(r7, r8, userJid, this.A0G, r11, r30, str2, (String) null, str3, (String) null, (String) null, str4, this.A07, (String) null, str, (List) null, j, true, true, false, false);
    }

    public void A8R(boolean z) {
        if (z) {
            Bp9(R.string.f11nameremoved);
        } else {
            BjL();
        }
    }

    public void A7u() {
        UserJid A0A = AnonymousClass32Y.A0A(getIntent().getStringExtra("extra_receiver_jid"));
        this.A0E = A0A;
        this.A08 = this.A07.A01(A0A);
    }

    public void A8K() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A7u();
        String stringExtra = getIntent().getStringExtra("extra_p2m_amount");
        C85204Fi r2 = AnonymousClass1S3.A05;
        AnonymousClass39Q A002 = AnonymousClass39Q.A00(stringExtra, ((AnonymousClass3H6) r2).A01);
        if (A002 != null) {
            C60042xu r0 = new C60042xu();
            r0.A02 = r2;
            r0.A02(A002);
            this.A00 = r0.A01();
        }
    }

    public void onStart() {
        super.onStart();
        overridePendingTransition(0, 0);
        AnonymousClass39L r0 = this.A00;
        if (r0 != null) {
            A8Q(r0);
            return;
        }
        throw C18270x1.A0S("paymentMoney");
    }
}
