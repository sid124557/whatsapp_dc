package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.P2mLitePaymentSettingsActivity;
import com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity;

/* renamed from: X.4xr  reason: invalid class name and case insensitive filesystem */
public final class C97224xr extends C197119cb {
    public final C85134Fb A00;
    public final C171658Hx A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97224xr(X.C64773Ex r9, X.AnonymousClass5ZU r10, X.C620633i r11, X.C54292oU r12, X.C85134Fb r13, X.AnonymousClass9U4 r14, X.C171658Hx r15, X.C195219Wq r16) {
        /*
            r8 = this;
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r16
            X.C18260x0.A0f(r12, r6, r10, r9, r11)
            r5 = r14
            X.C18260x0.A0W(r14, r15, r13)
            java.lang.String r7 = "P2M_LITE"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.A01 = r15
            r8.A00 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97224xr.<init>(X.3Ex, X.5ZU, X.33i, X.2oU, X.4Fb, X.9U4, X.8Hx, X.9Wq):void");
    }

    public Intent B7D(Context context, String str, String str2) {
        C162457s7.A0J(str, 1);
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.P2mLiteDyiReportActivity");
        A07.putExtra("extra_paymentProvider", str2);
        A07.putExtra("extra_paymentAccountType", str);
        return A07;
    }

    public C203499no B7b() {
        return this.A01;
    }

    public Class BAk() {
        return P2mLiteOrderDetailsActivity.class;
    }

    public String BAm() {
        return null;
    }

    public Class BB7() {
        return P2mLiteOrderDetailsActivity.class;
    }

    public Class BBA() {
        return P2mLitePaymentSettingsActivity.class;
    }

    public Class BBC() {
        return P2mLitePaymentTransactionDetailActivity.class;
    }

    public int BCt() {
        return 4;
    }

    public AnonymousClass1S4 BG4() {
        return new C133816hz();
    }

    public int BAp() {
        return R.string.f11nameremoved;
    }

    public C42902Py BE8(C133676hl r2, UserJid userJid, String str) {
        return null;
    }
}
