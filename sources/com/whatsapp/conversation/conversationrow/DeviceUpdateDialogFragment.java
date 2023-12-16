package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass2z0;
import X.C30341mI;
import X.C31061ng;
import X.C31291o3;
import X.C49022fr;
import X.C626936e;
import X.C95814uZ;
import android.os.Bundle;

public class DeviceUpdateDialogFragment extends Hilt_DeviceUpdateDialogFragment {
    public C49022fr A00;

    public static SecurityNotificationDialogFragment A00(C30341mI r5) {
        DeviceUpdateDialogFragment deviceUpdateDialogFragment = new DeviceUpdateDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        C95814uZ A002 = AnonymousClass2z0.A00(r5);
        A08.putString("chat_jid", A002.getRawString());
        C626936e.A06(A002);
        C95814uZ A0n = r5.A0n();
        if (A0n != null) {
            A002 = A0n;
        }
        AnonymousClass0x2.A0v(A08, A002, "participant_jid");
        if (r5 instanceof C31291o3) {
            C31291o3 r52 = (C31291o3) r5;
            A08.putInt("device_added_count", r52.A00);
            A08.putInt("device_removed_count", r52.A01);
        } else {
            C626936e.A0B(r5 instanceof C31061ng);
            A08.putBoolean("device_update_failure", true);
        }
        deviceUpdateDialogFragment.A0u(A08);
        return deviceUpdateDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
        if (r6 != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0142, code lost:
        if (r9 != 0) goto L_0x0144;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r12) {
        /*
            r11 = this;
            android.os.Bundle r1 = r11.A0H()
            java.lang.String r0 = "chat_jid"
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r0 = "participant_jid"
            java.lang.String r7 = r1.getString(r0)
            java.lang.String r0 = "device_added_count"
            int r9 = r1.getInt(r0)
            java.lang.String r0 = "device_removed_count"
            int r10 = r1.getInt(r0)
            java.lang.String r0 = "device_update_failure"
            boolean r6 = r1.getBoolean(r0)
            if (r9 > 0) goto L_0x002a
            if (r10 > 0) goto L_0x002a
            r0 = 0
            if (r6 == 0) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            X.C626936e.A0B(r0)
            X.5Yw r2 = X.C95814uZ.A00
            X.4uZ r5 = r2.A05(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DeviceChangeDialogFragment/onCreateDialog/invalid chat jid="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            X.C626936e.A07(r5, r0)
            X.4uZ r4 = r2.A05(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DeviceChangeDialogFragment/onCreateDialog/invalid remote resource jid="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r7, r1)
            X.C626936e.A07(r4, r0)
            X.3Ex r0 = r11.A02
            X.3ZH r3 = r0.A0A(r5)
            X.3Ex r0 = r11.A02
            X.3ZH r8 = r0.A0A(r4)
            X.2sr r0 = r11.A01
            boolean r0 = X.C56972sr.A08(r0, r8)
            if (r0 == 0) goto L_0x0149
            boolean r0 = r3.A0U()
            if (r0 != 0) goto L_0x007f
            X.4uZ r0 = r3.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x007f
            com.whatsapp.jid.Jid r2 = X.AnonymousClass3ZH.A03(r3)
        L_0x0076:
            if (r2 == 0) goto L_0x007f
            X.4FS r1 = r11.A06
            r0 = 29
            X.C71333bw.A00(r1, r11, r2, r0)
        L_0x007f:
            android.content.Context r0 = r11.A1D()
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r0)
            if (r6 == 0) goto L_0x00d0
            r0 = 2131894646(0x7f122176, float:1.9424103E38)
        L_0x008d:
            java.lang.CharSequence r0 = r11.A1V(r8, r0)
        L_0x0091:
            android.app.AlertDialog$Builder r2 = r2.setMessage(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 0
            android.app.AlertDialog$Builder r8 = r2.setNegativeButton(r1, r0)
            r2 = 2131895973(0x7f1226a5, float:1.9426794E38)
            r1 = 0
            X.4I5 r0 = new X.4I5
            r0.<init>(r1, r11, r6)
            android.app.AlertDialog$Builder r2 = r8.setNeutralButton(r2, r0)
            X.2sr r0 = r11.A01
            boolean r0 = r0.A0a(r4)
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r3.A0U()
            if (r0 != 0) goto L_0x00be
            X.4uZ r0 = r3.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x00c3
        L_0x00be:
            android.app.AlertDialog r0 = r2.create()
            return r0
        L_0x00c3:
            r1 = 2131894951(0x7f1222a7, float:1.9424721E38)
            X.373 r0 = new X.373
            r0.<init>(r11, r4, r5, r7)
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r1, r0)
            goto L_0x00be
        L_0x00d0:
            X.2sr r0 = r11.A01
            boolean r1 = X.C56972sr.A08(r0, r8)
            r0 = 1
            if (r1 == 0) goto L_0x0134
            if (r9 != r0) goto L_0x00fc
            if (r10 != 0) goto L_0x00fc
            boolean r0 = r3.A0U()
            if (r0 == 0) goto L_0x00ef
            r1 = 2131893459(0x7f121cd3, float:1.9421695E38)
        L_0x00e6:
            android.content.res.Resources r0 = X.C08310eF.A09(r11)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0091
        L_0x00ef:
            X.4uZ r0 = r3.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            r1 = 2131893458(0x7f121cd2, float:1.9421693E38)
            if (r0 == 0) goto L_0x012e
            r1 = 2131893460(0x7f121cd4, float:1.9421697E38)
            goto L_0x00e6
        L_0x00fc:
            if (r10 != r0) goto L_0x0117
            if (r9 != 0) goto L_0x0117
            boolean r0 = r3.A0U()
            if (r0 == 0) goto L_0x010a
            r1 = 2131893462(0x7f121cd6, float:1.9421701E38)
            goto L_0x00e6
        L_0x010a:
            X.4uZ r0 = r3.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            r1 = 2131893461(0x7f121cd5, float:1.94217E38)
            if (r0 == 0) goto L_0x012e
            r1 = 2131893463(0x7f121cd7, float:1.9421703E38)
            goto L_0x00e6
        L_0x0117:
            boolean r0 = r3.A0U()
            if (r0 == 0) goto L_0x0121
            r1 = 2131893465(0x7f121cd9, float:1.9421707E38)
            goto L_0x00e6
        L_0x0121:
            X.4uZ r0 = r3.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            r1 = 2131893464(0x7f121cd8, float:1.9421705E38)
            if (r0 == 0) goto L_0x012e
            r1 = 2131893466(0x7f121cda, float:1.942171E38)
            goto L_0x00e6
        L_0x012e:
            java.lang.CharSequence r0 = r11.A1V(r3, r1)
            goto L_0x0091
        L_0x0134:
            if (r9 != r0) goto L_0x013d
            if (r10 != 0) goto L_0x013d
            r0 = 2131891555(0x7f121563, float:1.9417833E38)
            goto L_0x008d
        L_0x013d:
            if (r10 != r0) goto L_0x0144
            r0 = 2131891556(0x7f121564, float:1.9417835E38)
            if (r9 == 0) goto L_0x008d
        L_0x0144:
            r0 = 2131891557(0x7f121565, float:1.9417837E38)
            goto L_0x008d
        L_0x0149:
            com.whatsapp.jid.Jid r2 = X.AnonymousClass3ZH.A03(r8)
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }
}
