package X;

import android.view.View;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;

/* renamed from: X.4Ta  reason: invalid class name and case insensitive filesystem */
public class C87464Ta extends AnonymousClass0AZ implements C181598n1 {
    public final C102095Hl[] A00 = new C102095Hl[2];
    public final /* synthetic */ C97654yv A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87464Ta(C08270df r2, C97654yv r3) {
        super(r2, 0);
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r5 != 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A04(int r5) {
        /*
            r4 = this;
            X.4yv r3 = r4.A01
            X.33j r0 = r3.A0H
            boolean r2 = X.C620733j.A04(r0)
            r1 = 1
            if (r5 == 0) goto L_0x0014
            if (r5 == r1) goto L_0x0016
        L_0x000d:
            java.lang.String r0 = "The item position should be less than: 2"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0014:
            r2 = r2 ^ 1
        L_0x0016:
            r0 = 2131888182(0x7f120836, float:1.9410992E38)
            if (r2 == 0) goto L_0x0020
            if (r2 != r1) goto L_0x000d
            r0 = 2131888192(0x7f120840, float:1.9411012E38)
        L_0x0020:
            java.lang.String r0 = r3.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87464Ta.A04(int):java.lang.CharSequence");
    }

    public int A0C() {
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r3 != 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C08310eF A0H(int r3) {
        /*
            r2 = this;
            X.4yv r0 = r2.A01
            X.33j r0 = r0.A0H
            boolean r1 = X.C620733j.A04(r0)
            r0 = 1
            if (r3 == 0) goto L_0x0014
            if (r3 == r0) goto L_0x0016
        L_0x000d:
            java.lang.String r0 = "The item position should be less than: 2"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0014:
            r1 = r1 ^ 1
        L_0x0016:
            if (r1 == 0) goto L_0x0020
            if (r1 != r0) goto L_0x000d
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r0 = new com.whatsapp.qrcode.contactqr.QrScanCodeFragment
            r0.<init>()
            return r0
        L_0x0020:
            com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment r0 = new com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87464Ta.A0H(int):X.0eF");
    }

    public View BAT(int i) {
        C102095Hl[] r3 = this.A00;
        if (r3[i] == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A01.A07;
            C102095Hl r2 = new C102095Hl(AnonymousClass001.A0R(C18280x3.A0D(pagerSlidingTabStrip), pagerSlidingTabStrip, R.layout.f8nameremoved));
            CharSequence A04 = A04(i);
            C626936e.A06(A04);
            r2.A01.setText(A04);
            r3[i] = r2;
        }
        return r3[i].A00;
    }
}
