package com.whatsapp.permissions;

import X.AnonymousClass1WZ;
import X.AnonymousClass33p;
import X.AnonymousClass4FV;
import X.C18270x1;
import X.C56612sH;
import android.content.DialogInterface;

public final class NotificationPermissionBottomSheet extends Hilt_NotificationPermissionBottomSheet {
    public C56612sH A00;
    public AnonymousClass33p A01;
    public AnonymousClass4FV A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003e, code lost:
        if (r1 != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r6, android.view.View r7) {
        /*
            r5 = this;
            r4 = 0
            X.C162457s7.A0J(r7, r4)
            super.A0w(r6, r7)
            r0 = 2131432386(0x7f0b13c2, float:1.8486528E38)
            android.widget.TextView r2 = X.AnonymousClass002.A09(r7, r0)
            android.content.Context r1 = r7.getContext()
            r0 = 2131102351(0x7f060a8f, float:1.7817137E38)
            X.AnonymousClass0x2.A0q(r1, r2, r0)
            android.content.res.Resources r1 = X.C18290x4.A0G(r7)
            r0 = 2131168414(0x7f070c9e, float:1.795113E38)
            float r0 = r1.getDimension(r0)
            r2.setTextSize(r4, r0)
            r0 = 2131434077(0x7f0b1a5d, float:1.8489958E38)
            android.widget.TextView r2 = X.AnonymousClass0x2.A0I(r7, r0)
            boolean r0 = X.C107385bE.A0A()
            if (r0 == 0) goto L_0x0040
            X.33p r1 = r5.A01
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r1 = r1.A2O(r0)
            r0 = 2131888900(0x7f120b04, float:1.9412448E38)
            if (r1 == 0) goto L_0x0043
        L_0x0040:
            r0 = 2131892372(0x7f121894, float:1.941949E38)
        L_0x0043:
            r2.setText(r0)
            r0 = 7
            X.C633939b.A00(r2, r5, r0)
            r0 = 2131428506(0x7f0b049a, float:1.8478658E38)
            android.view.View r1 = X.C18280x3.A0E(r7, r0)
            r0 = 8
            X.C633939b.A00(r1, r5, r0)
            X.33p r1 = r5.A01
            X.2sH r0 = r5.A00
            if (r0 == 0) goto L_0x0084
            long r2 = r0.A0H()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "notification_nag_last_shown_time_key"
            X.C18270x1.A0i(r1, r0, r2)
            X.33p r3 = r5.A01
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r2 = "notification_nag_count_key"
            int r0 = r0.getInt(r2, r4)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r3)
            X.C18270x1.A0h(r0, r2, r1)
            r5.A1a(r4)
            return
        L_0x0084:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.permissions.NotificationPermissionBottomSheet.A0w(android.os.Bundle, android.view.View):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        A1a(1);
        A1L();
    }

    public final void A1a(int i) {
        AnonymousClass1WZ r1 = new AnonymousClass1WZ();
        r1.A00 = Integer.valueOf(i);
        AnonymousClass4FV r0 = this.A02;
        if (r0 != null) {
            r0.BhD(r1);
            return;
        }
        throw C18270x1.A0S("wamRuntime");
    }
}
