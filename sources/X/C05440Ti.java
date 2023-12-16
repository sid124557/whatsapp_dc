package X;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.0Ti  reason: invalid class name and case insensitive filesystem */
public final class C05440Ti {
    public Uri A00;
    public Bundle A01 = AnonymousClass002.A08();
    public String A02;
    public final long A03;
    public final C04440Of A04;
    public final CharSequence A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.app.Person} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification.MessagingStyle.Message A01() {
        /*
            r7 = this;
            X.0Of r6 = r7.A04
            int r5 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            r3 = 0
            java.lang.CharSequence r2 = r7.A05
            long r0 = r7.A03
            if (r5 < r4) goto L_0x0021
            if (r6 == 0) goto L_0x0013
            android.app.Person r3 = r6.A00()
        L_0x0013:
            android.app.Notification$MessagingStyle$Message r2 = X.AnonymousClass0HM.A00(r3, r2, r0)
        L_0x0017:
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto L_0x0020
            android.net.Uri r0 = r7.A00
            X.AnonymousClass0RI.A01(r2, r0, r1)
        L_0x0020:
            return r2
        L_0x0021:
            if (r6 == 0) goto L_0x0025
            java.lang.CharSequence r3 = r6.A01
        L_0x0025:
            android.app.Notification$MessagingStyle$Message r2 = X.AnonymousClass0RI.A00(r2, r3, r0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05440Ti.A01():android.app.Notification$MessagingStyle$Message");
    }

    public C05440Ti(C04440Of r2, CharSequence charSequence, long j) {
        this.A05 = charSequence;
        this.A03 = j;
        this.A04 = r2;
    }

    public static Bundle[] A00(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C05440Ti r6 = (C05440Ti) list.get(i);
            Bundle A08 = AnonymousClass002.A08();
            CharSequence charSequence = r6.A05;
            if (charSequence != null) {
                A08.putCharSequence("text", charSequence);
            }
            A08.putLong("time", r6.A03);
            C04440Of r7 = r6.A04;
            if (r7 != null) {
                A08.putCharSequence("sender", r7.A01);
                if (Build.VERSION.SDK_INT >= 28) {
                    A08.putParcelable("sender_person", r7.A00());
                } else {
                    A08.putBundle("person", r7.A01());
                }
            }
            String str = r6.A02;
            if (str != null) {
                A08.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            }
            Uri uri = r6.A00;
            if (uri != null) {
                A08.putParcelable("uri", uri);
            }
            A08.putBundle("extras", r6.A01);
            bundleArr[i] = A08;
        }
        return bundleArr;
    }
}
