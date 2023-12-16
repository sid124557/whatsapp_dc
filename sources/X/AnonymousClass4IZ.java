package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4IZ  reason: invalid class name */
public class AnonymousClass4IZ implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4IZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r0 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r1.setElevation(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x004f;
                case 2: goto L_0x0038;
                case 3: goto L_0x0021;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r3.A00
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r2 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r2
            android.widget.ScrollView r0 = r2.A05
            X.AnonymousClass0x7.A16(r0, r3)
            android.widget.ScrollView r1 = r2.A05
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A03
            if (r0 == 0) goto L_0x007d
            int r0 = r2.A00
        L_0x001b:
            float r0 = (float) r0
        L_0x001c:
            r1.setElevation(r0)
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            java.lang.Object r1 = r3.A00
            com.whatsapp.registration.ChangeNumberOverview r1 = (com.whatsapp.registration.ChangeNumberOverview) r1
            android.widget.ScrollView r0 = r1.A02
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "scrollView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0031:
            X.AnonymousClass0x7.A16(r0, r3)
            r1.A74()
            goto L_0x001f
        L_0x0038:
            java.lang.Object r2 = r3.A00
            com.whatsapp.registration.ChangeNumberNotifyContacts r2 = (com.whatsapp.registration.ChangeNumberNotifyContacts) r2
            android.widget.ScrollView r0 = r2.A08
            X.AnonymousClass0x7.A16(r0, r3)
            android.widget.ScrollView r1 = r2.A08
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A02
            if (r0 == 0) goto L_0x007d
            int r0 = r2.A00
            goto L_0x001b
        L_0x004f:
            java.lang.Object r2 = r3.A00
            com.whatsapp.account.delete.DeleteAccountFeedback r2 = (com.whatsapp.account.delete.DeleteAccountFeedback) r2
            android.widget.ScrollView r0 = r2.A04
            X.AnonymousClass0x7.A16(r0, r3)
            android.widget.ScrollView r1 = r2.A04
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A02
            if (r0 == 0) goto L_0x007d
            int r0 = r2.A00
            goto L_0x001b
        L_0x0066:
            java.lang.Object r2 = r3.A00
            com.whatsapp.account.delete.DeleteAccountConfirmation r2 = (com.whatsapp.account.delete.DeleteAccountConfirmation) r2
            android.widget.ScrollView r0 = r2.A03
            X.AnonymousClass0x7.A16(r0, r3)
            android.widget.ScrollView r1 = r2.A03
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A02
            if (r0 == 0) goto L_0x007d
            int r0 = r2.A00
            goto L_0x001b
        L_0x007d:
            r0 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4IZ.onPreDraw():boolean");
    }
}
