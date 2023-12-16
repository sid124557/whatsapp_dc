package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.30k  reason: invalid class name and case insensitive filesystem */
public final class C613630k {
    public final C54292oU A00;
    public final C183538qC A01;
    public final C183538qC A02;

    public final File A04(String str) {
        return AnonymousClass002.A0A(this.A00.A00.getDir("account_switching", 0), str);
    }

    public final synchronized boolean A08() {
        String str;
        Log.i("AccountSwitchingDataRepo/restoreBackup/");
        try {
            File A04 = A04("accounts.bak");
            if (!A04.exists()) {
                Log.e("AccountSwitchingDataRepo/restoreBackup/backup file does not exist");
            } else {
                File A042 = A04("accounts");
                if (A042.exists()) {
                    str = AnonymousClass000.A0b("AccountSwitchingDataRepo/restoreBackup/deleted previous accounts file: ", AnonymousClass001.A0o(), A042.delete());
                } else {
                    str = "AccountSwitchingDataRepo/restoreBackup/previous accounts file does not exist";
                }
                Log.i(str);
                boolean renameTo = A04.renameTo(A042);
                C18260x0.A1E("AccountSwitchingDataRepo/restoreBackup/restored accounts file from backup file: ", AnonymousClass001.A0o(), renameTo);
                return renameTo;
            }
        } catch (SecurityException e) {
            Log.e("AccountSwitchingDataRepo/restoreBackup/", e);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        X.C18260x0.A1Q(X.AnonymousClass001.A0o(), "AccountSwitchingDataRepo/setAccountSwitchingData/JSONException : ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09(X.AnonymousClass5SO r9) {
        /*
            r8 = this;
            r3 = 0
            org.json.JSONArray r4 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x00c4 }
            java.util.List r0 = r9.A01     // Catch:{ JSONException -> 0x00c4 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ JSONException -> 0x00c4 }
        L_0x000b:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x00c4 }
            if (r0 == 0) goto L_0x0067
            java.lang.Object r6 = r7.next()     // Catch:{ JSONException -> 0x00c4 }
            X.2nq r6 = (X.C53892nq) r6     // Catch:{ JSONException -> 0x00c4 }
            X.C162457s7.A0J(r6, r3)     // Catch:{ JSONException -> 0x00c4 }
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = r6.A07     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r0 = "lid"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = "jid"
            java.lang.String r0 = r6.A06     // Catch:{ JSONException -> 0x00c4 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = "name"
            java.lang.String r0 = r6.A08     // Catch:{ JSONException -> 0x00c4 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = "badge_count"
            int r0 = r6.A00     // Catch:{ JSONException -> 0x00c4 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = "is_logged_in"
            boolean r0 = r6.A03     // Catch:{ JSONException -> 0x00c4 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = "is_companion"
            boolean r0 = r6.A02     // Catch:{ JSONException -> 0x00c4 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = "unread_message_count"
            int r0 = r6.A01     // Catch:{ JSONException -> 0x00c4 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r2 = "last_active_timestamp_ms"
            long r0 = r6.A04     // Catch:{ JSONException -> 0x00c4 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r2 = "last_buzzed_timestamp_ms"
            long r0 = r6.A05     // Catch:{ JSONException -> 0x00c4 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r0 = X.C18290x4.A0o(r5)     // Catch:{ JSONException -> 0x00c4 }
            r4.put(r0)     // Catch:{ JSONException -> 0x00c4 }
            goto L_0x000b
        L_0x0067:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r0 = "inactiveAccounts"
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = r9.A00     // Catch:{ JSONException -> 0x00c4 }
            if (r1 == 0) goto L_0x0080
            int r0 = r1.length()     // Catch:{ JSONException -> 0x00c4 }
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = "paymentsOnboardedLid"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00c4 }
        L_0x0080:
            java.lang.String r1 = "shownMeTabMenuItemToolTip"
            boolean r0 = r9.A03     // Catch:{ JSONException -> 0x00c4 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = "isCompanionModeEnabled"
            boolean r0 = r9.A02     // Catch:{ JSONException -> 0x00c4 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r5 = X.C18290x4.A0o(r2)     // Catch:{ JSONException -> 0x00c4 }
            r4 = r8
            monitor-enter(r4)     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r0 = "accounts"
            java.io.File r1 = r8.A04(r0)     // Catch:{ IOException -> 0x00b4 }
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ IOException -> 0x00b4 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00b4 }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00b4 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00b4 }
            r2.write(r5)     // Catch:{ all -> 0x00ad }
            r2.close()     // Catch:{ IOException -> 0x00b4 }
            r0 = 1
            goto L_0x00bf
        L_0x00ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ IOException -> 0x00b4 }
            throw r0     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "AccountSwitchingDataRepo/writeJsonToFile/IOException : "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x00c1 }
            r0 = 0
        L_0x00bf:
            monitor-exit(r4)     // Catch:{ JSONException -> 0x00c4 }
            return r0
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ JSONException -> 0x00c4 }
            throw r0     // Catch:{ JSONException -> 0x00c4 }
        L_0x00c4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingDataRepo/setAccountSwitchingData/JSONException : "
            X.C18260x0.A1Q(r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613630k.A09(X.5SO):boolean");
    }

    public final boolean A0A(String str) {
        C57072t2.A04("AccountSwitchingDataRepo/removeAccount/", str, C18280x3.A0g(str, 0));
        AnonymousClass5SO A022 = A02();
        List list = A022.A01;
        if (!A01(str, list)) {
            Log.e("AccountSwitchingDataRepo/removeAccount/Account doesn't exist");
            return false;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            C18280x3.A18(((C53892nq) next).A07, str, next, A0s);
        }
        return A09(C18310x6.A0P(A022, A0s));
    }

    public static final boolean A01(String str, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object A002 : list) {
                if (C53892nq.A00(A002, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e9, code lost:
        X.C18260x0.A1Q(X.AnonymousClass001.A0o(), "AccountSwitchingDataRepo/getAccountSwitchingData/JSONException : ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fd, code lost:
        return new X.AnonymousClass5SO((java.lang.String) null, X.AnonymousClass001.A0s(), false, false);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5SO A02() {
        /*
            r18 = this;
            r4 = r18
            monitor-enter(r4)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "accounts"
            java.io.File r1 = r4.A04(r0)     // Catch:{ IOException -> 0x0037 }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x0037 }
            if (r0 != 0) goto L_0x0013
            java.lang.String r1 = "{}"
            goto L_0x0044
        L_0x0013:
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0037 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0037 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0037 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0037 }
            long r1 = r1.length()     // Catch:{ all -> 0x0030 }
            int r0 = (int) r1     // Catch:{ all -> 0x0030 }
            char[] r0 = new char[r0]     // Catch:{ all -> 0x0030 }
            r3.read(r0)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0030 }
            r1.<init>(r0)     // Catch:{ all -> 0x0030 }
            r3.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0044
        L_0x0030:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ IOException -> 0x0037 }
            throw r0     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "AccountSwitchingDataRepo/readJsonFromFile/IOException : "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = "{}"
        L_0x0044:
            monitor-exit(r4)     // Catch:{ JSONException -> 0x00e8 }
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "inactiveAccounts"
            org.json.JSONArray r2 = r3.optJSONArray(r0)     // Catch:{ JSONException -> 0x00e8 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x00e8 }
            if (r2 == 0) goto L_0x00c6
            int r0 = r2.length()     // Catch:{ JSONException -> 0x00e8 }
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "AccountSwitchingDataRepo/getAccountSwitchingData/accountsJsonArray length is 0"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ JSONException -> 0x00e8 }
        L_0x0060:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x00e8 }
            r0 = 0
            X.8Zj r0 = X.C175708Zk.A02(r0, r4)     // Catch:{ JSONException -> 0x00e8 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ JSONException -> 0x00e8 }
        L_0x006d:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x00e8 }
            if (r0 == 0) goto L_0x00cb
            r0 = r5
            X.3d2 r0 = (X.C72013d2) r0     // Catch:{ JSONException -> 0x00e8 }
            int r0 = r0.A00()     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ JSONException -> 0x00e8 }
            X.C162457s7.A0D(r0)     // Catch:{ JSONException -> 0x00e8 }
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "lid"
            java.lang.String r7 = X.C18290x4.A0r(r0, r4)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "jid"
            java.lang.String r8 = X.C18290x4.A0r(r0, r4)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "name"
            java.lang.String r9 = X.C18290x4.A0r(r0, r4)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "badge_count"
            int r10 = r4.optInt(r0)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "is_logged_in"
            boolean r16 = r4.getBoolean(r0)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "is_companion"
            boolean r17 = r4.optBoolean(r0)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "unread_message_count"
            int r11 = r4.getInt(r0)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "last_active_timestamp_ms"
            long r12 = r4.getLong(r0)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "last_buzzed_timestamp_ms"
            long r14 = r4.optLong(r0)     // Catch:{ JSONException -> 0x00e8 }
            X.2nq r6 = new X.2nq     // Catch:{ JSONException -> 0x00e8 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16, r17)     // Catch:{ JSONException -> 0x00e8 }
            r1.add(r6)     // Catch:{ JSONException -> 0x00e8 }
            goto L_0x006d
        L_0x00c6:
            java.lang.String r0 = "AccountSwitchingDataRepo/getAccountSwitchingData/accountsJsonArray is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ JSONException -> 0x00e8 }
        L_0x00cb:
            java.lang.String r0 = "paymentsOnboardedLid"
            java.lang.String r4 = r3.optString(r0)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "shownMeTabMenuItemToolTip"
            boolean r2 = r3.optBoolean(r0)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r0 = "isCompanionModeEnabled"
            boolean r0 = r3.optBoolean(r0)     // Catch:{ JSONException -> 0x00e8 }
            X.5SO r3 = new X.5SO     // Catch:{ JSONException -> 0x00e8 }
            r3.<init>(r4, r1, r2, r0)     // Catch:{ JSONException -> 0x00e8 }
            return r3
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ JSONException -> 0x00e8 }
            throw r0     // Catch:{ JSONException -> 0x00e8 }
        L_0x00e8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingDataRepo/getAccountSwitchingData/JSONException : "
            X.C18260x0.A1Q(r1, r0, r2)
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            r1 = 0
            r0 = 0
            X.5SO r3 = new X.5SO
            r3.<init>(r1, r2, r0, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613630k.A02():X.5SO");
    }

    public C613630k(C54292oU r1, C183538qC r2, C183538qC r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public static List A00(C183538qC r0) {
        return ((C613630k) r0.get()).A02().A01;
    }

    public final C53892nq A03(String str) {
        Object obj;
        Iterator it = A02().A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C53892nq.A00(obj, str)) {
                break;
            }
        }
        return (C53892nq) obj;
    }

    public final String A05() {
        Object next;
        List list = A02().A01;
        if (list.isEmpty()) {
            Log.e("AccountSwitchingDataRepo/getLastActiveLid/No inactive accounts");
        } else {
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    long j = ((C53892nq) next).A04;
                    do {
                        Object next2 = it.next();
                        long j2 = ((C53892nq) next2).A04;
                        if (j < j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
            }
            C53892nq r8 = (C53892nq) next;
            if (r8 != null) {
                return r8.A07;
            }
            Log.w("AccountSwitchingDataRepo/getLastActiveLid/cannot find last active account");
            ((C55682qk) this.A01.get()).A0A("AccountSwitchingDataRepo/getLastActiveLid/cannot find last active account", false, (String) null);
            C53892nq r0 = (C53892nq) C73723fy.A04(list);
            if (r0 != null) {
                return r0.A07;
            }
        }
        return null;
    }

    public final void A06(C53892nq r5) {
        StringBuilder A0X = C18270x1.A0X(r5);
        A0X.append("AccountSwitchingDataRepo/addAccount/");
        String str = r5.A07;
        C18260x0.A1L(A0X, C57072t2.A01(str));
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass5SO A022 = A02();
        A0s.addAll(A022.A01);
        if (A01(str, A0s)) {
            Log.e("AccountSwitchingDataRepo/addAccount/Account already exists");
            return;
        }
        A0s.add(r5);
        A09(C18310x6.A0P(A022, A0s));
    }

    public final void A07(String str) {
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountSwitchingDataRepo/setPaymentsOnboardedLid/");
        if (str != null) {
            str2 = C57072t2.A01(str);
        } else {
            str2 = null;
        }
        C18260x0.A1L(A0o, str2);
        AnonymousClass5SO A022 = A02();
        A09(new AnonymousClass5SO(str, A022.A01, A022.A03, A022.A02));
    }
}
