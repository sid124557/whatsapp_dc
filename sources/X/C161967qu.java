package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.7qu  reason: invalid class name and case insensitive filesystem */
public final class C161967qu {
    public static Locale A00;
    public static final C06290Wz A01 = new C06290Wz();

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.content.Context r5, java.lang.String r6) {
        /*
            X.0Wz r3 = A01
            monitor-enter(r3)
            android.content.res.Configuration r4 = X.AnonymousClass001.A0M(r5)     // Catch:{ all -> 0x008d }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x008d }
            r0 = 24
            if (r1 < r0) goto L_0x0032
            android.os.LocaleList r0 = X.C02830Ht.A00(r4)     // Catch:{ all -> 0x008d }
            X.0Wr r0 = X.C06210Wr.A00(r0)     // Catch:{ all -> 0x008d }
        L_0x0015:
            r1 = 0
            X.0te r0 = r0.A00     // Catch:{ all -> 0x008d }
            java.util.Locale r1 = r0.B3y(r1)     // Catch:{ all -> 0x008d }
            java.util.Locale r0 = A00     // Catch:{ all -> 0x008d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0029
            r3.clear()     // Catch:{ all -> 0x008d }
            A00 = r1     // Catch:{ all -> 0x008d }
        L_0x0029:
            java.lang.Object r4 = r3.get(r6)     // Catch:{ all -> 0x008d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x008d }
            if (r4 != 0) goto L_0x0069
            goto L_0x003f
        L_0x0032:
            r0 = 1
            java.util.Locale[] r2 = new java.util.Locale[r0]     // Catch:{ all -> 0x008d }
            r1 = 0
            java.util.Locale r0 = r4.locale     // Catch:{ all -> 0x008d }
            r2[r1] = r0     // Catch:{ all -> 0x008d }
            X.0Wr r0 = X.C06210Wr.A01(r2)     // Catch:{ all -> 0x008d }
            goto L_0x0015
        L_0x003f:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004a }
            java.lang.String r0 = "com.google.android.gms"
            android.content.res.Resources r2 = r1.getResourcesForApplication(r0)     // Catch:{ NameNotFoundException -> 0x004a }
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r4 = 0
            if (r2 == 0) goto L_0x0069
            java.lang.String r1 = "string"
            java.lang.String r0 = "com.google.android.gms"
            int r0 = r2.getIdentifier(r6, r1, r0)     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "Missing resource: "
            r1.append(r0)     // Catch:{ all -> 0x008d }
            r1.append(r6)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "GoogleApiAvailability"
            X.AnonymousClass6C7.A1A(r1, r0)     // Catch:{ all -> 0x008d }
        L_0x0069:
            monitor-exit(r3)     // Catch:{ all -> 0x008d }
            goto L_0x0087
        L_0x006b:
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x008d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0088
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "Got empty resource: "
            r1.append(r0)     // Catch:{ all -> 0x008d }
            r1.append(r6)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "GoogleApiAvailability"
            X.AnonymousClass6C7.A1A(r1, r0)     // Catch:{ all -> 0x008d }
            goto L_0x0069
        L_0x0087:
            return r4
        L_0x0088:
            r3.put(r6, r1)     // Catch:{ all -> 0x008d }
            monitor-exit(r3)     // Catch:{ all -> 0x008d }
            return r1
        L_0x008d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161967qu.A03(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String A00(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C159987mq.A00(context).A00;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String A01(Context context, int i) {
        int i2;
        String str;
        Resources resources = context.getResources();
        String A002 = A00(context);
        if (i == 1) {
            i2 = R.string.f11nameremoved;
        } else if (i != 2) {
            if (i != 3) {
                if (i == 5) {
                    str = "common_google_play_services_invalid_account_text";
                } else if (i == 7) {
                    str = "common_google_play_services_network_error_text";
                } else if (i == 9) {
                    i2 = R.string.f11nameremoved;
                } else if (i != 20) {
                    switch (i) {
                        case 16:
                            str = "common_google_play_services_api_unavailable_text";
                            break;
                        case 17:
                            str = "common_google_play_services_sign_in_failed_text";
                            break;
                        case 18:
                            i2 = R.string.f11nameremoved;
                            break;
                        default:
                            i2 = R.string.f11nameremoved;
                            break;
                    }
                } else {
                    str = "common_google_play_services_restricted_profile_text";
                }
                Resources resources2 = context.getResources();
                String A03 = A03(context, str);
                if (A03 == null) {
                    A03 = resources2.getString(R.string.f11nameremoved);
                }
                return String.format(resources2.getConfiguration().locale, A03, new Object[]{A002});
            }
            i2 = R.string.f11nameremoved;
        } else if (C155557f6.A00(context)) {
            return resources.getString(R.string.f11nameremoved);
        } else {
            i2 = R.string.f11nameremoved;
        }
        return resources.getString(i2, new Object[]{A002});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        return r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        return A03(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        android.util.Log.e("GoogleApiAvailability", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.content.Context r4, int r5) {
        /*
            android.content.res.Resources r1 = r4.getResources()
            r3 = 0
            java.lang.String r2 = "GoogleApiAvailability"
            switch(r5) {
                case 1: goto L_0x002b;
                case 2: goto L_0x002f;
                case 3: goto L_0x0027;
                case 4: goto L_0x0017;
                case 5: goto L_0x003f;
                case 6: goto L_0x0017;
                case 7: goto L_0x0047;
                case 8: goto L_0x0018;
                case 9: goto L_0x001b;
                case 10: goto L_0x001e;
                case 11: goto L_0x0021;
                case 12: goto L_0x000a;
                case 13: goto L_0x000a;
                case 14: goto L_0x000a;
                case 15: goto L_0x000a;
                case 16: goto L_0x0024;
                case 17: goto L_0x004f;
                case 18: goto L_0x0017;
                case 19: goto L_0x000a;
                case 20: goto L_0x0037;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected error code "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)
        L_0x0014:
            android.util.Log.e(r2, r0)
        L_0x0017:
            return r3
        L_0x0018:
            java.lang.String r0 = "Internal error occurred. Please see logs for detailed information"
            goto L_0x0014
        L_0x001b:
            java.lang.String r0 = "Google Play services is invalid. Cannot recover."
            goto L_0x0014
        L_0x001e:
            java.lang.String r0 = "Developer error occurred. Please see logs for detailed information"
            goto L_0x0014
        L_0x0021:
            java.lang.String r0 = "The application is not licensed to the user."
            goto L_0x0014
        L_0x0024:
            java.lang.String r0 = "One of the API components you attempted to connect to is not available."
            goto L_0x0014
        L_0x0027:
            r0 = 2131895756(0x7f1225cc, float:1.9426354E38)
            goto L_0x0032
        L_0x002b:
            r0 = 2131895759(0x7f1225cf, float:1.942636E38)
            goto L_0x0032
        L_0x002f:
            r0 = 2131895766(0x7f1225d6, float:1.9426374E38)
        L_0x0032:
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x0037:
            java.lang.String r0 = "The current user profile is restricted and could not use authenticated features."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_restricted_profile_title"
            goto L_0x0056
        L_0x003f:
            java.lang.String r0 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_invalid_account_title"
            goto L_0x0056
        L_0x0047:
            java.lang.String r0 = "Network error occurred. Please retry request later."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_network_error_title"
            goto L_0x0056
        L_0x004f:
            java.lang.String r0 = "The specified account could not be signed in."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_sign_in_failed_title"
        L_0x0056:
            java.lang.String r0 = A03(r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161967qu.A02(android.content.Context, int):java.lang.String");
    }
}
