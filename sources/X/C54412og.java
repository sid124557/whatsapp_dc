package X;

import android.content.SharedPreferences;

/* renamed from: X.2og  reason: invalid class name and case insensitive filesystem */
public class C54412og {
    public AnonymousClass33D A00 = AnonymousClass33D.A01;
    public final SharedPreferences A01;

    public static SharedPreferences.Editor A00(C54412og r0) {
        return r0.A01.edit();
    }

    public int A01() {
        AnonymousClass33D r3 = this.A00;
        SharedPreferences sharedPreferences = this.A01;
        int i = 1;
        if (C107385bE.A07()) {
            i = -1;
        }
        Object valueOf = Integer.valueOf(sharedPreferences.getInt("night_mode", i));
        Object obj = r3.A00;
        if (obj != null) {
            valueOf = obj;
        }
        return AnonymousClass001.A0K(valueOf);
    }

    public String A02() {
        return C18280x3.A0Z(this.A01, "forced_language");
    }

    public String A03() {
        return AnonymousClass0x9.A0v(this.A01, "push_name");
    }

    public boolean A04() {
        return C18280x3.A1W(this.A01, "run_on_connect_tasks_for_version_change");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        r2.put("version", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0075, code lost:
        r2.put("registration_state", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        r2.put("force_db_check", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        r2.put("companion_registration_state", r5);
        r2.put("registration_device_id", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008b, code lost:
        r2.put("forced_language", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0090, code lost:
        r2.put("profile_photo_thumb_id", r5);
        r2.put("profile_photo_full_id", r5);
        r2.put("push_name", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
        r2.put("async_tasks_pending_for_version_change", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a7, code lost:
        r2.put("night_mode", r5);
        r1 = X.AnonymousClass001.A0o();
        r1.append(X.AnonymousClass0x7.A0A("WaStartupSharedPreferences/added ", r1, r2));
        X.C18260x0.A1L(r1, " keys");
        r14 = X.AnonymousClass001.A0u(r2);
        r4 = null;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c9, code lost:
        if (r14.hasNext() == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
        r1 = X.AnonymousClass001.A0w(r14);
        r2 = X.C18310x6.A0q(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d7, code lost:
        if (r10.contains(r2) == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dd, code lost:
        if (r8.contains(r2) != false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00df, code lost:
        if (r4 != null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e1, code lost:
        r4 = r8.edit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e5, code lost:
        r13 = (java.lang.Class) r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ec, code lost:
        if (r13 != r7) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ee, code lost:
        r4.putBoolean(r2, r10.getBoolean(r2, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
        if (r13 != r5) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f8, code lost:
        r4.putInt(r2, r10.getInt(r2, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        if (r13 != java.lang.Float.class) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0104, code lost:
        r4.putFloat(r2, r10.getFloat(r2, 0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010f, code lost:
        if (r13 != java.lang.Long.class) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0111, code lost:
        r4.putLong(r2, X.AnonymousClass0x2.A0B(r10, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        if (r13 != r6) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011b, code lost:
        r4.putString(r2, r10.getString(r2, (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0129, code lost:
        if (java.util.Set.class.isAssignableFrom(r13) == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012b, code lost:
        r4.putStringSet(r2, r10.getStringSet(r2, (java.util.Set) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0132, code lost:
        if (r3 != null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0134, code lost:
        r3 = r10.edit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0138, code lost:
        r3.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013c, code lost:
        r0 = X.AnonymousClass000.A0E(r13, "Cannot access value of type ", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0148, code lost:
        if (r4 == null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014a, code lost:
        r4.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014d, code lost:
        if (r3 == null) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014f, code lost:
        r3.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0152, code lost:
        X.C18270x1.A0h(r8.edit(), "startup_migrated_version", 9);
        X.C18260x0.A0w("WaStartupSharedPreferences/migrated-to/", X.AnonymousClass001.A0o(), 9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54412og(X.C60152y5 r16) {
        /*
            r15 = this;
            java.lang.String r0 = "startup_prefs"
            r3 = r16
            android.content.SharedPreferences r1 = r3.A03(r0)
            r12 = 0
            r9 = 9
            r15.<init>()
            X.33D r0 = X.AnonymousClass33D.A01
            r15.A00 = r0
            r15.A01 = r1
            java.lang.String r11 = "startup_migrated_version"
            r2 = 0
            int r0 = r1.getInt(r11, r2)     // Catch:{ all -> 0x0168 }
            if (r0 >= r9) goto L_0x0162
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "WaStartupSharedPreferences/upgrade from: "
            r1.append(r0)     // Catch:{ all -> 0x0168 }
            android.content.SharedPreferences r0 = r15.A01     // Catch:{ all -> 0x0168 }
            int r0 = r0.getInt(r11, r2)     // Catch:{ all -> 0x0168 }
            r1.append(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = " to: "
            X.C18260x0.A0w(r0, r1, r9)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = X.AnonymousClass33p.A05     // Catch:{ all -> 0x0168 }
            android.content.SharedPreferences r10 = r3.A03(r0)     // Catch:{ all -> 0x0168 }
            if (r10 == 0) goto L_0x0162
            android.content.SharedPreferences r8 = r15.A01     // Catch:{ all -> 0x0168 }
            int r0 = r8.getInt(r11, r2)     // Catch:{ all -> 0x0168 }
            if (r0 >= r9) goto L_0x0162
            int r0 = r8.getInt(r11, r2)     // Catch:{ all -> 0x0168 }
            java.util.HashMap r2 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0168 }
            java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            switch(r0) {
                case 0: goto L_0x005e;
                case 1: goto L_0x006f;
                case 2: goto L_0x0075;
                case 3: goto L_0x007b;
                case 4: goto L_0x0080;
                case 5: goto L_0x008b;
                case 6: goto L_0x0090;
                case 7: goto L_0x00a2;
                case 8: goto L_0x00a7;
                default: goto L_0x0057;
            }     // Catch:{ all -> 0x0168 }
        L_0x0057:
            java.lang.String r0 = "Version bump required"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0168 }
        L_0x005d:
            throw r0     // Catch:{ all -> 0x0168 }
        L_0x005e:
            java.lang.String r0 = "client_server_time_diff"
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            r2.put(r0, r1)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "client_ntp_time_diff"
            r2.put(r0, r1)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "last_ntp_client_time"
            r2.put(r0, r1)     // Catch:{ all -> 0x0168 }
        L_0x006f:
            java.lang.String r0 = "version"
            r2.put(r0, r6)     // Catch:{ all -> 0x0168 }
        L_0x0075:
            java.lang.String r0 = "registration_state"
            r2.put(r0, r5)     // Catch:{ all -> 0x0168 }
        L_0x007b:
            java.lang.String r0 = "force_db_check"
            r2.put(r0, r7)     // Catch:{ all -> 0x0168 }
        L_0x0080:
            java.lang.String r0 = "companion_registration_state"
            r2.put(r0, r5)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "registration_device_id"
            r2.put(r0, r5)     // Catch:{ all -> 0x0168 }
        L_0x008b:
            java.lang.String r0 = "forced_language"
            r2.put(r0, r6)     // Catch:{ all -> 0x0168 }
        L_0x0090:
            java.lang.String r0 = "profile_photo_thumb_id"
            r2.put(r0, r5)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "profile_photo_full_id"
            r2.put(r0, r5)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "push_name"
            r2.put(r0, r6)     // Catch:{ all -> 0x0168 }
        L_0x00a2:
            java.lang.String r0 = "async_tasks_pending_for_version_change"
            r2.put(r0, r7)     // Catch:{ all -> 0x0168 }
        L_0x00a7:
            java.lang.String r0 = "night_mode"
            r2.put(r0, r5)     // Catch:{ all -> 0x0168 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "WaStartupSharedPreferences/added "
            int r0 = X.AnonymousClass0x7.A0A(r0, r1, r2)     // Catch:{ all -> 0x0168 }
            r1.append(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = " keys"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0168 }
            java.util.Iterator r14 = X.AnonymousClass001.A0u(r2)     // Catch:{ all -> 0x0168 }
            r4 = 0
            r3 = r12
        L_0x00c5:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0148
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r14)     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = X.C18310x6.A0q(r1)     // Catch:{ all -> 0x0168 }
            boolean r0 = r10.contains(r2)     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r8.contains(r2)     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x0132
            if (r4 != 0) goto L_0x00e5
            android.content.SharedPreferences$Editor r4 = r8.edit()     // Catch:{ all -> 0x0168 }
        L_0x00e5:
            java.lang.Object r13 = r1.getValue()     // Catch:{ all -> 0x0168 }
            java.lang.Class r13 = (java.lang.Class) r13     // Catch:{ all -> 0x0168 }
            r0 = 0
            if (r13 != r7) goto L_0x00f6
            boolean r0 = r10.getBoolean(r2, r0)     // Catch:{ all -> 0x0168 }
            r4.putBoolean(r2, r0)     // Catch:{ all -> 0x0168 }
            goto L_0x0132
        L_0x00f6:
            if (r13 != r5) goto L_0x0100
            int r0 = r10.getInt(r2, r0)     // Catch:{ all -> 0x0168 }
            r4.putInt(r2, r0)     // Catch:{ all -> 0x0168 }
            goto L_0x0132
        L_0x0100:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r13 != r0) goto L_0x010d
            r0 = 0
            float r0 = r10.getFloat(r2, r0)     // Catch:{ all -> 0x0168 }
            r4.putFloat(r2, r0)     // Catch:{ all -> 0x0168 }
            goto L_0x0132
        L_0x010d:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r13 != r0) goto L_0x0119
            long r0 = X.AnonymousClass0x2.A0B(r10, r2)     // Catch:{ all -> 0x0168 }
            r4.putLong(r2, r0)     // Catch:{ all -> 0x0168 }
            goto L_0x0132
        L_0x0119:
            if (r13 != r6) goto L_0x0123
            java.lang.String r0 = r10.getString(r2, r12)     // Catch:{ all -> 0x0168 }
            r4.putString(r2, r0)     // Catch:{ all -> 0x0168 }
            goto L_0x0132
        L_0x0123:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r13)     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x013c
            java.util.Set r0 = r10.getStringSet(r2, r12)     // Catch:{ all -> 0x0168 }
            r4.putStringSet(r2, r0)     // Catch:{ all -> 0x0168 }
        L_0x0132:
            if (r3 != 0) goto L_0x0138
            android.content.SharedPreferences$Editor r3 = r10.edit()     // Catch:{ all -> 0x0168 }
        L_0x0138:
            r3.remove(r2)     // Catch:{ all -> 0x0168 }
            goto L_0x00c5
        L_0x013c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "Cannot access value of type "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r13, r0, r1)     // Catch:{ all -> 0x0168 }
            goto L_0x005d
        L_0x0148:
            if (r4 == 0) goto L_0x014d
            r4.commit()     // Catch:{ all -> 0x0168 }
        L_0x014d:
            if (r3 == 0) goto L_0x0152
            r3.commit()     // Catch:{ all -> 0x0168 }
        L_0x0152:
            android.content.SharedPreferences$Editor r0 = r8.edit()     // Catch:{ all -> 0x0168 }
            X.C18270x1.A0h(r0, r11, r9)     // Catch:{ all -> 0x0168 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "WaStartupSharedPreferences/migrated-to/"
            X.C18260x0.A0w(r0, r1, r9)     // Catch:{ all -> 0x0168 }
        L_0x0162:
            java.lang.String r0 = "WaStartupSharedPreferences/initialized version: 9"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0168:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54412og.<init>(X.2y5):void");
    }
}
