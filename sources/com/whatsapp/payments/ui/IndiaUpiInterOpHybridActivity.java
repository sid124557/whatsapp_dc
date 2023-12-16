package com.whatsapp.payments.ui;

import X.AnonymousClass1S3;
import X.AnonymousClass224;
import X.AnonymousClass281;
import X.AnonymousClass303;
import X.AnonymousClass32Y;
import X.AnonymousClass39L;
import X.AnonymousClass39Q;
import X.AnonymousClass3H6;
import X.AnonymousClass9Th;
import X.C106945aQ;
import X.C133696hn;
import X.C162457s7;
import X.C166557yt;
import X.C166587yw;
import X.C18270x1;
import X.C18280x3;
import X.C191139Cq;
import X.C195179Wl;
import X.C55502qS;
import X.C56422rx;
import X.C59942xk;
import X.C60042xu;
import X.C85204Fi;
import X.C95814uZ;
import android.content.Intent;
import android.os.Bundle;
import java.math.BigDecimal;

public final class IndiaUpiInterOpHybridActivity extends C191139Cq {
    public C56422rx A00;
    public AnonymousClass9Th A01;

    public String A8I(AnonymousClass39L r14) {
        Object obj;
        C162457s7.A0J(r14, 0);
        String A8H = A8H();
        String obj2 = r14.A02.A00.toString();
        String str = this.A0g;
        String str2 = this.A0Z;
        String str3 = this.A0o;
        String str4 = this.A0d;
        String str5 = this.A0c;
        String str6 = this.A0m;
        C166557yt r0 = this.A0I;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.A00;
        }
        String A06 = new C195179Wl(A8H, obj2, str, str2, str3, str4, "04", str5, str6, (String) obj, (String) null, "SCANNED_QR_CODE").A06();
        C162457s7.A0D(A06);
        return A06;
    }

    public void A8L(C133696hn r3, AnonymousClass39L r4, PaymentBottomSheet paymentBottomSheet) {
        C162457s7.A0J(r4, 0);
        A8M(r3, r4, (PaymentBottomSheet) null);
    }

    public void A8N(C166587yw r2, AnonymousClass39L r3, HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, PaymentBottomSheet paymentBottomSheet) {
        C162457s7.A0J(r3, 0);
        A8O(r2, r3, paymentBottomSheet);
    }

    public /* bridge */ /* synthetic */ void BKD(AnonymousClass303 r10, Integer num, Integer num2, String str) {
        AnonymousClass303 r4 = r10;
        int intValue = num.intValue();
        String str2 = str;
        C162457s7.A0J(str, 2);
        if (r10 == null) {
            r4 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
        }
        C95814uZ r0 = this.A0D;
        if (r0 != null) {
            C56422rx r1 = this.A00;
            if (r1 != null) {
                C55502qS A002 = r1.A00(AnonymousClass32Y.A03(r0));
                if (A002 != null) {
                    r4.A03("biz_platform", C18270x1.A0T(Integer.valueOf(C106945aQ.A00(A002))));
                }
            } else {
                throw C18270x1.A0S("verifiedNameManager");
            }
        }
        this.A0S.BKE(r4, Integer.valueOf(intValue), num2, str2, this.A0f);
    }

    public void A8K() {
        C95814uZ r2 = this.A0D;
        if (r2 != null) {
            String A0Z = C18280x3.A0Z(this.A0P.A03(), "pref_p2m_hybrid_last_used_payment_option");
            if (A0Z == null || A0Z.length() == 0) {
                A0Z = "other";
            }
            AnonymousClass224 A002 = AnonymousClass281.A00(A0Z);
            if (A002 != null) {
                AnonymousClass9Th r3 = this.A01;
                if (r3 != null) {
                    r3.A03(r2.user, A002.methodName, "QRC", 1);
                    return;
                }
                throw C18270x1.A0S("paymentDailyUsageManager");
            }
        }
    }

    public void A8P(AnonymousClass39L r2) {
        if (!this.A0I.A0C()) {
            A7w(this);
        }
    }

    public void A8R(boolean z) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1022) {
            super.onActivityResult(i, i2, intent);
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void A7c() {
    }

    public void A8J() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BigDecimal bigDecimal = new BigDecimal(0);
        String str = this.A0k;
        if (str != null) {
            bigDecimal = new BigDecimal(str);
        }
        C85204Fi r2 = AnonymousClass1S3.A05;
        AnonymousClass39Q r1 = new AnonymousClass39Q(bigDecimal, ((AnonymousClass3H6) r2).A01);
        C60042xu r0 = new C60042xu();
        r0.A02(r1);
        r0.A02 = r2;
        A8Q(r0.A01());
    }

    public void A89(C59942xk r1, boolean z) {
    }
}
