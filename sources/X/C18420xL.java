package X;

import android.content.BroadcastReceiver;

/* renamed from: X.0xL  reason: invalid class name and case insensitive filesystem */
public abstract class C18420xL extends BroadcastReceiver {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (X.AnonymousClass35C.A03(r12, r3.getCreatorPackage()) == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            r2 = r11
            com.whatsapp.phoneid.PhoneIdRequestReceiver r2 = (com.whatsapp.phoneid.PhoneIdRequestReceiver) r2
            X.3Au r0 = r2.A01
            X.2XL r7 = r0.BBI()
            X.3At r0 = r2.A02
            X.2XL r6 = r0.BBI()
            java.lang.String r0 = "com.facebook.GET_PHONE_ID"
            boolean r0 = X.C18280x3.A1V(r13, r0)
            if (r0 == 0) goto L_0x007e
            r8 = 1
            android.os.Bundle r1 = r11.getResultExtras(r8)
            java.lang.String r0 = "auth"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            if (r3 == 0) goto L_0x008d
            boolean r0 = r3 instanceof android.app.PendingIntent
            if (r0 == 0) goto L_0x007e
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
        L_0x002a:
            java.lang.String r1 = r12.getPackageName()
            boolean r10 = X.C57762uA.A01(r12)
            if (r3 == 0) goto L_0x003f
            java.lang.String r0 = r3.getCreatorPackage()
            boolean r0 = X.AnonymousClass35C.A03(r12, r0)
            r9 = 1
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            android.content.pm.Signature r0 = X.AnonymousClass35C.A00(r0, r1)
            java.lang.String r1 = X.AnonymousClass35C.A02(r0)
            java.util.Set r0 = X.C57762uA.A00()
            boolean r5 = r0.contains(r1)
            X.1VX r2 = r2.A00
            if (r2 == 0) goto L_0x008b
            X.2vE r1 = X.C58422vE.A01
            r0 = 3651(0xe43, float:5.116E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x008b
        L_0x0062:
            r4 = -1
            java.lang.String r3 = "timestamp"
            if (r9 != 0) goto L_0x007f
            if (r10 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007e
            if (r6 == 0) goto L_0x007e
            if (r5 != 0) goto L_0x007e
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            long r0 = r6.A00
            r2.putLong(r3, r0)
            java.lang.String r0 = r6.A01
        L_0x007b:
            r11.setResult(r4, r0, r2)
        L_0x007e:
            return
        L_0x007f:
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            long r0 = r7.A00
            r2.putLong(r3, r0)
            java.lang.String r0 = r7.A01
            goto L_0x007b
        L_0x008b:
            r8 = 0
            goto L_0x0062
        L_0x008d:
            r3 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18420xL.onReceive(android.content.Context, android.content.Intent):void");
    }
}
