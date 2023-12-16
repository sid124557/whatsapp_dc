package com.whatsapp.permissions;

import X.AnonymousClass29z;
import X.AnonymousClass33p;
import X.AnonymousClass3DY;
import X.AnonymousClass4FV;
import X.AnonymousClass5IB;
import X.AnonymousClass5X8;
import X.AnonymousClass73U;
import X.C107695bk;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C56502s5;
import X.C56612sH;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_RequestPermissionsBottomSheet extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (this instanceof Hilt_NotificationPermissionBottomSheet) {
            Hilt_NotificationPermissionBottomSheet hilt_NotificationPermissionBottomSheet = (Hilt_NotificationPermissionBottomSheet) this;
            if (!hilt_NotificationPermissionBottomSheet.A02) {
                hilt_NotificationPermissionBottomSheet.A02 = true;
                AnonymousClass3DY A0O = C18310x6.A0O(hilt_NotificationPermissionBottomSheet);
                NotificationPermissionBottomSheet notificationPermissionBottomSheet = (NotificationPermissionBottomSheet) hilt_NotificationPermissionBottomSheet;
                C64333Db r3 = ((C88854au) A0O).A1B;
                C107695bk r1 = r3.A00;
                C18300x5.A1D(r1, notificationPermissionBottomSheet);
                AnonymousClass73U.A00(notificationPermissionBottomSheet, (AnonymousClass5IB) r1.A4i.get());
                notificationPermissionBottomSheet.A05 = C64333Db.A4B(r3);
                notificationPermissionBottomSheet.A01 = C64333Db.A04(r3);
                notificationPermissionBottomSheet.A06 = (C56502s5) r1.A5N.get();
                notificationPermissionBottomSheet.A00 = C64333Db.A00(r3);
                notificationPermissionBottomSheet.A02 = (AnonymousClass5X8) r3.Aac.get();
                notificationPermissionBottomSheet.A03 = C64333Db.A2o(r3);
                notificationPermissionBottomSheet.A04 = C64333Db.A2s(r3);
                C56612sH A2p = C64333Db.A2p(r3);
                C162457s7.A0J(A2p, 0);
                notificationPermissionBottomSheet.A00 = A2p;
                AnonymousClass4FV A4H = C64333Db.A4H(r3);
                C162457s7.A0J(A4H, 0);
                notificationPermissionBottomSheet.A02 = A4H;
                AnonymousClass33p A2s = C64333Db.A2s(r3);
                C162457s7.A0J(A2s, 0);
                notificationPermissionBottomSheet.A01 = A2s;
            }
        } else if (!this.A02) {
            this.A02 = true;
            RequestPermissionsBottomSheet requestPermissionsBottomSheet = (RequestPermissionsBottomSheet) this;
            C64333Db r2 = ((C88854au) C18310x6.A0O(this)).A1B;
            C107695bk r12 = r2.A00;
            C18260x0.A0J(r12, requestPermissionsBottomSheet);
            requestPermissionsBottomSheet.A05 = C64333Db.A4B(r2);
            requestPermissionsBottomSheet.A01 = C64333Db.A04(r2);
            requestPermissionsBottomSheet.A06 = (C56502s5) r12.A5N.get();
            requestPermissionsBottomSheet.A00 = C64333Db.A00(r2);
            requestPermissionsBottomSheet.A02 = (AnonymousClass5X8) r2.Aac.get();
            requestPermissionsBottomSheet.A03 = C64333Db.A2o(r2);
            requestPermissionsBottomSheet.A04 = C64333Db.A2s(r2);
        }
    }

    public final void A1Z() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1Z();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C18270x1.A06(super.A1E(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1F(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C116885r1.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass2A2.A01(r0)
            r2.A1Z()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.permissions.Hilt_RequestPermissionsBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1Z();
        A1R();
    }
}
