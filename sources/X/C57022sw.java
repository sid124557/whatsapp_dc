package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.2sw  reason: invalid class name and case insensitive filesystem */
public final class C57022sw {
    public static final void A01(Bundle bundle, String str, String str2, Object[] objArr) {
        int i;
        if (objArr != null) {
            int length = objArr.length;
            int i2 = 0;
            if (length != 0) {
                ArrayList A0I = AnonymousClass002.A0I(length);
                ArrayList A0I2 = AnonymousClass002.A0I(length);
                do {
                    Object obj = objArr[i2];
                    C162457s7.A0J(obj, 0);
                    if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    A0I2.add(i);
                    AnonymousClass0x7.A1D(obj, A0I);
                    i2++;
                } while (i2 < length);
                bundle.putStringArrayList(str, A0I);
                bundle.putIntegerArrayList(str2, A0I2);
            }
        }
    }

    public static final Bundle A00(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        Bundle A08 = AnonymousClass002.A08();
        if (i != -1) {
            A08.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, i);
        }
        if (i2 != 0) {
            A08.putInt("title_res", i2);
        }
        if (i3 != 0) {
            A08.putInt("message_res", i3);
            A01(A08, "message_params_values", "message_params_types", objArr);
        }
        if (i4 != 0) {
            A08.putInt("primary_action_text_id_res", i4);
        }
        if (i5 != 0) {
            A08.putInt("secondary_action_text_res", i5);
        }
        if (i6 != -1) {
            A08.putInt("secondary_action_color_res", i6);
        }
        return A08;
    }
}
