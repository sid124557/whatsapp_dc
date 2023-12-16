package X;

import android.net.Uri;

/* renamed from: X.1hV  reason: invalid class name and case insensitive filesystem */
public class C28621hV extends C50692ic {
    public static final Uri A00 = Uri.parse("content://com.transsion.hilauncher.unreadprovider");
    public static final Uri A01 = Uri.parse("content://com.transsion.XOSLauncher.unreadprovider");

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00(android.content.Context r7) {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x005b
            android.content.pm.PackageManager r3 = r7.getPackageManager()
            r2 = 0
            if (r3 == 0) goto L_0x0049
            java.lang.String r0 = "android.intent.action.MAIN"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "android.intent.category.HOME"
            r1.addCategory(r0)
            android.content.pm.ResolveInfo r0 = r3.resolveActivity(r1, r2)     // Catch:{ NameNotFoundException -> 0x0047 }
            if (r0 == 0) goto L_0x0049
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ NameNotFoundException -> 0x0047 }
            java.lang.String r1 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0047 }
            r0 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0047 }
            android.content.pm.PermissionInfo[] r5 = r0.permissions     // Catch:{ NameNotFoundException -> 0x0047 }
            int r4 = r5.length     // Catch:{ NameNotFoundException -> 0x0047 }
            r3 = 0
        L_0x002c:
            if (r3 >= r4) goto L_0x004b
            r2 = r5[r3]     // Catch:{ NameNotFoundException -> 0x0047 }
            java.lang.String r1 = "com.transsion.hilauncher.permission.CHANGE_BADGE"
            java.lang.String r0 = r2.name     // Catch:{ NameNotFoundException -> 0x0047 }
            boolean r0 = r1.equals(r0)     // Catch:{ NameNotFoundException -> 0x0047 }
            if (r0 != 0) goto L_0x0049
            java.lang.String r1 = "com.transsion.XOSLauncher.permission.CHANGE_BADGE"
            java.lang.String r0 = r2.name     // Catch:{ NameNotFoundException -> 0x0047 }
            boolean r0 = r1.equals(r0)     // Catch:{ NameNotFoundException -> 0x0047 }
            if (r0 != 0) goto L_0x0049
            int r3 = r3 + 1
            goto L_0x002c
        L_0x0047:
            r0 = 0
            goto L_0x004c
        L_0x0049:
            r0 = 0
            goto L_0x004c
        L_0x004b:
            r0 = 1
        L_0x004c:
            if (r0 == 0) goto L_0x005b
            java.lang.String r1 = "com.transsion.XOSLauncher"
            java.lang.String r0 = "com.transsion.hilauncher"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
        L_0x005b:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28621hV.A00(android.content.Context):java.util.List");
    }
}
