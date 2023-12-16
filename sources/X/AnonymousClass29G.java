package X;

/* renamed from: X.29G  reason: invalid class name */
public class AnonymousClass29G {
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r12, android.content.Intent r13) {
        /*
            java.lang.ClassLoader r0 = r12.getClassLoader()
            r13.setExtrasClassLoader(r0)
            android.os.Bundle r4 = r13.getExtras()
            if (r4 != 0) goto L_0x0011
            android.os.Bundle r4 = X.AnonymousClass002.A08()
        L_0x0011:
            java.lang.ClassLoader r0 = r12.getClassLoader()
            r4.setClassLoader(r0)
            java.lang.String r3 = "_ci_"
            r5 = 0
            r9 = 0
            android.content.pm.PackageManager r1 = r12.getPackageManager()     // Catch:{ NameNotFoundException | RuntimeException -> 0x002c }
            if (r1 == 0) goto L_0x002c
            java.lang.String r0 = r12.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x002c }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r5)     // Catch:{ NameNotFoundException | RuntimeException -> 0x002c }
            java.lang.String r9 = r0.versionName     // Catch:{ NameNotFoundException | RuntimeException -> 0x002c }
        L_0x002c:
            long r10 = java.lang.System.currentTimeMillis()
            long r7 = android.os.SystemClock.elapsedRealtime()
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            r6 = 0
            java.lang.String r1 = "t"
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ JSONException -> 0x0065 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r1 = "r"
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ JSONException -> 0x0065 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0065 }
            if (r9 == 0) goto L_0x0055
            java.lang.String r0 = "v"
            r2.put(r0, r9)     // Catch:{ JSONException -> 0x0065 }
        L_0x0055:
            java.lang.String r1 = r2.toString()     // Catch:{  }
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch:{  }
            r0 = 11
            java.lang.String r6 = android.util.Base64.encodeToString(r1, r0)     // Catch:{  }
        L_0x0065:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "com.facebook.invalid_class.f4c3b00c"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r12, r1)
            android.content.Intent r0 = r2.setComponent(r0)
            android.content.Intent r1 = r0.setAction(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r0 = X.C624735e.A00(r12, r5, r1, r0)
            r4.putParcelable(r3, r0)
            r13.putExtras(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass29G.A00(android.content.Context, android.content.Intent):void");
    }
}
