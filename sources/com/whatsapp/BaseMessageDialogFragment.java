package com.whatsapp;

import X.AnonymousClass001;
import X.C003203q;
import X.C08270df;
import X.C08310eF;
import X.C162457s7;
import X.C18290x4;
import X.C18300x5;
import X.C89654ea;
import android.content.DialogInterface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseMessageDialogFragment extends Hilt_BaseMessageDialogFragment {
    public void A1O(C08270df r2, String str) {
        C162457s7.A0J(r2, 0);
        C18300x5.A1B(this, r2, str);
    }

    public final CharSequence A1V(String str, String str2, String str3) {
        Object obj;
        int i = A0H().getInt(str);
        if (i == 0) {
            return null;
        }
        AbstractList stringArrayList = A0H().getStringArrayList(str2);
        if (stringArrayList == null) {
            return C08310eF.A09(this).getString(i);
        }
        ArrayList<Integer> integerArrayList = A0H().getIntegerArrayList(str3);
        if (integerArrayList == null || integerArrayList.size() != stringArrayList.size()) {
            throw AnonymousClass001.A0c("Failed requirement.");
        }
        int size = stringArrayList.size();
        Object[] objArr = new Object[size];
        int size2 = stringArrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Number number = integerArrayList.get(i2);
            if (number == null || number.intValue() != 1) {
                obj = stringArrayList.get(i2);
            } else {
                Object obj2 = stringArrayList.get(i2);
                C162457s7.A0D(obj2);
                obj = C18290x4.A0h((String) obj2);
            }
            objArr[i2] = obj;
        }
        return C08310eF.A09(this).getString(i, Arrays.copyOf(objArr, size));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C08310eF r3 = this.A0E;
        if (r3 != null && (r3 instanceof MediaViewFragment)) {
            MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) r3;
            if (A0H().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, -1) == 101) {
                mediaViewBaseFragment.A1O();
                return;
            }
        }
        C003203q A0Q = A0Q();
        if (A0Q instanceof C89654ea) {
            ((C89654ea) A0Q).A6O(A0H().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, -1));
        }
    }

    public void A0g() {
        if (A0H().getInt("secondary_action_color_res", -1) != -1) {
            this.A00 = A0H().getInt("secondary_action_color_res", -1);
        }
        super.A0g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog A1J(android.os.Bundle r10) {
        /*
            r9 = this;
            X.0zH r4 = X.C18300x5.A0M(r9)
            r3 = 1
            r4.A0i(r3)
            boolean r7 = r9 instanceof com.whatsapp.LegacyMessageDialogFragment
            if (r7 == 0) goto L_0x00f6
            java.lang.String r6 = "title_params_values"
            java.lang.String r5 = "title_params_types"
            java.lang.String r2 = "title"
            java.lang.String r1 = "title_res"
            android.os.Bundle r0 = r9.A0H()
            java.lang.CharSequence r0 = r0.getCharSequence(r2)
            if (r0 != 0) goto L_0x0026
            java.lang.CharSequence r0 = r9.A1V(r1, r6, r5)
        L_0x0026:
            r4.setTitle(r0)
            r8 = r9
            if (r7 == 0) goto L_0x010e
            com.whatsapp.LegacyMessageDialogFragment r8 = (com.whatsapp.LegacyMessageDialogFragment) r8
            android.os.Bundle r1 = r8.A0H()
            java.lang.String r0 = "message_view_id"
            int r0 = r1.getInt(r0)
            if (r0 == 0) goto L_0x0126
            r4.A0C(r0)
        L_0x003e:
            r2 = r9
            boolean r0 = r9 instanceof com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment
            if (r0 == 0) goto L_0x005d
            r1 = 2131893105(0x7f121b71, float:1.9420977E38)
            r0 = 77
            X.C85804Hr.A01(r4, r9, r0, r1)
            r2 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1 = 14
        L_0x0050:
            X.4I1 r0 = new X.4I1
            r0.<init>(r1)
            r4.setNegativeButton(r2, r0)
        L_0x0058:
            X.043 r0 = X.C18300x5.A0H(r4)
            return r0
        L_0x005d:
            boolean r0 = r9 instanceof com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment
            if (r0 == 0) goto L_0x006f
            r1 = 2131895799(0x7f1225f7, float:1.9426441E38)
            r0 = 76
            X.C85804Hr.A01(r4, r9, r0, r1)
            r2 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1 = 13
            goto L_0x0050
        L_0x006f:
            boolean r0 = r9 instanceof com.whatsapp.MessageDialogFragment
            if (r0 == 0) goto L_0x00ae
            android.os.Bundle r0 = r9.A0H()
            java.lang.String r1 = "primary_action_text_id_res"
            int r0 = r0.getInt(r1)
            if (r0 != 0) goto L_0x0088
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 4
            X.C85804Hr.A01(r4, r9, r0, r1)
            goto L_0x0058
        L_0x0088:
            android.os.Bundle r0 = r9.A0H()
            int r1 = r0.getInt(r1)
            r0 = 5
            X.C85804Hr.A01(r4, r9, r0, r1)
            android.os.Bundle r0 = r9.A0H()
            java.lang.String r1 = "secondary_action_text_res"
            int r0 = r0.getInt(r1)
            if (r0 == 0) goto L_0x0058
            android.os.Bundle r0 = r9.A0H()
            int r1 = r0.getInt(r1)
            r0 = 6
            X.C85804Hr.A00(r4, r9, r0, r1)
            goto L_0x0058
        L_0x00ae:
            com.whatsapp.LegacyMessageDialogFragment r2 = (com.whatsapp.LegacyMessageDialogFragment) r2
            android.os.Bundle r0 = r2.A0H()
            java.lang.String r1 = "primary_action_text_id_res"
            int r0 = r0.getInt(r1)
            if (r0 == 0) goto L_0x00ee
            android.content.DialogInterface$OnClickListener r0 = r2.A00
            if (r0 == 0) goto L_0x00ee
            android.os.Bundle r0 = r2.A0H()
            int r1 = r0.getInt(r1)
            android.content.DialogInterface$OnClickListener r0 = r2.A00
            r4.setPositiveButton(r1, r0)
            android.os.Bundle r0 = r2.A0H()
            java.lang.String r1 = "secondary_action_text_res"
            int r0 = r0.getInt(r1)
            if (r0 == 0) goto L_0x0058
            android.content.DialogInterface$OnClickListener r0 = r2.A01
            if (r0 == 0) goto L_0x0058
            android.os.Bundle r0 = r2.A0H()
            int r1 = r0.getInt(r1)
            android.content.DialogInterface$OnClickListener r0 = r2.A01
            r4.setNegativeButton(r1, r0)
            goto L_0x0058
        L_0x00ee:
            r0 = 2131891392(0x7f1214c0, float:1.9417503E38)
            X.C85804Hr.A01(r4, r2, r3, r0)
            goto L_0x0058
        L_0x00f6:
            android.os.Bundle r0 = r9.A0H()
            java.lang.String r1 = "title_res"
            int r0 = r0.getInt(r1)
            if (r0 == 0) goto L_0x010e
            android.os.Bundle r0 = r9.A0H()
            int r0 = r0.getInt(r1)
            r4.A0B(r0)
        L_0x010e:
            android.os.Bundle r0 = r9.A0H()
            java.lang.String r2 = "message_res"
            int r0 = r0.getInt(r2)
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = "message_params_values"
            java.lang.String r0 = "message_params_types"
            java.lang.CharSequence r0 = r9.A1V(r2, r1, r0)
            goto L_0x014a
        L_0x0126:
            java.lang.String r7 = "message_params_values"
            java.lang.String r6 = "message_params_types"
            java.lang.String r2 = "message"
            java.lang.String r1 = "message_res"
            android.os.Bundle r0 = r8.A0H()
            java.lang.CharSequence r5 = r0.getCharSequence(r2)
            if (r5 != 0) goto L_0x013f
            java.lang.CharSequence r5 = r8.A1V(r1, r7, r6)
        L_0x013f:
            android.content.Context r2 = r8.A0G()
            r1 = 0
            X.5Y0 r0 = r8.A02
            java.lang.CharSequence r0 = X.C107345b9.A03(r2, r1, r0, r5)
        L_0x014a:
            r4.A0Q(r0)
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.BaseMessageDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }
}
