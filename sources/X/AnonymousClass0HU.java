package X;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.0HU  reason: invalid class name */
public class AnonymousClass0HU {
    public static Bundle A00(C05480Tm r10) {
        int i;
        Bundle[] bundleArr;
        Bundle A08 = AnonymousClass002.A08();
        IconCompat A00 = r10.A00();
        if (A00 != null) {
            i = A00.A04();
        } else {
            i = 0;
        }
        A08.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i);
        A08.putCharSequence("title", r10.A03);
        A08.putParcelable("actionIntent", r10.A01);
        Bundle bundle = new Bundle(r10.A07);
        bundle.putBoolean("android.support.allowGeneratedReplies", r10.A04);
        A08.putBundle("extras", bundle);
        C03950Me[] r7 = r10.A09;
        if (r7 == null) {
            bundleArr = null;
        } else {
            int length = r7.length;
            bundleArr = new Bundle[length];
            for (int i2 = 0; i2 < length; i2++) {
                C03950Me r2 = r7[i2];
                Bundle A082 = AnonymousClass002.A08();
                A082.putString("resultKey", r2.A02);
                A082.putCharSequence("label", r2.A01);
                A082.putCharSequenceArray("choices", r2.A05);
                A082.putBoolean("allowFreeFormInput", true);
                A082.putBundle("extras", r2.A00);
                Set<Object> set = r2.A03;
                if (set != null && !set.isEmpty()) {
                    ArrayList A0I = AnonymousClass002.A0I(set.size());
                    for (Object add : set) {
                        A0I.add(add);
                    }
                    A082.putStringArrayList("allowedDataTypes", A0I);
                }
                bundleArr[i2] = A082;
            }
        }
        A08.putParcelableArray("remoteInputs", bundleArr);
        A08.putBoolean("showsUserInterface", r10.A05);
        A08.putInt("semanticAction", r10.A06);
        return A08;
    }
}
