package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4Hy  reason: invalid class name and case insensitive filesystem */
public class C85874Hy implements ViewTreeObserver.OnScrollChangedListener {
    public Object A00;
    public final int A01;

    public C85874Hy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1.setElevation(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollChanged() {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0062;
                case 2: goto L_0x002d;
                case 3: goto L_0x001b;
                case 4: goto L_0x0088;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A00
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r2 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r2
            android.widget.ScrollView r1 = r2.A05
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A03
            if (r0 == 0) goto L_0x0086
            int r0 = r2.A00
        L_0x0016:
            float r0 = (float) r0
        L_0x0017:
            r1.setElevation(r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r2 = r5.A00
            com.whatsapp.registration.ChangeNumberNotifyContacts r2 = (com.whatsapp.registration.ChangeNumberNotifyContacts) r2
            android.widget.ScrollView r1 = r2.A08
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A02
            if (r0 == 0) goto L_0x0086
            int r0 = r2.A00
            goto L_0x0016
        L_0x002d:
            java.lang.Object r4 = r5.A00
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r4 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r4
            androidx.core.widget.NestedScrollView r0 = r4.A01
            if (r0 == 0) goto L_0x004f
            r1 = 1
            boolean r0 = r0.canScrollVertically(r1)
            if (r0 != r1) goto L_0x004f
            android.content.Context r3 = r4.A0G()
            r0 = 2131100307(0x7f060293, float:1.7812992E38)
        L_0x0043:
            int r1 = X.AnonymousClass0Y8.A04(r3, r0)
            android.widget.LinearLayout r0 = r4.A00
            if (r0 == 0) goto L_0x001a
            r0.setBackgroundColor(r1)
            return
        L_0x004f:
            android.content.Context r3 = r4.A0G()
            android.content.Context r2 = r4.A0G()
            r1 = 2130970370(0x7f040702, float:1.7549448E38)
            r0 = 2131102224(0x7f060a10, float:1.781688E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            goto L_0x0043
        L_0x0062:
            java.lang.Object r2 = r5.A00
            com.whatsapp.account.delete.DeleteAccountFeedback r2 = (com.whatsapp.account.delete.DeleteAccountFeedback) r2
            android.widget.ScrollView r1 = r2.A04
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A02
            if (r0 == 0) goto L_0x0086
            int r0 = r2.A00
            goto L_0x0016
        L_0x0074:
            java.lang.Object r2 = r5.A00
            com.whatsapp.account.delete.DeleteAccountConfirmation r2 = (com.whatsapp.account.delete.DeleteAccountConfirmation) r2
            android.widget.ScrollView r1 = r2.A03
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A02
            if (r0 == 0) goto L_0x0086
            int r0 = r2.A00
            goto L_0x0016
        L_0x0086:
            r0 = 0
            goto L_0x0017
        L_0x0088:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.ChangeNumberOverview r0 = (com.whatsapp.registration.ChangeNumberOverview) r0
            r0.A74()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85874Hy.onScrollChanged():void");
    }
}
