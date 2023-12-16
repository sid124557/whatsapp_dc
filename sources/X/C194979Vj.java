package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Vj  reason: invalid class name and case insensitive filesystem */
public class C194979Vj {
    public static final C151007Tb A05 = new C151007Tb("unset", false, (String) null);
    public AnonymousClass30K A00;
    public C620933l A01;
    public C153087ae A02;
    public String A03;
    public final C160757oG A04 = C160757oG.A00("BasePaymentAccountSetup", "onboarding", "COMMON");

    public synchronized C151007Tb A00() {
        C151007Tb r0;
        List A032 = A03(A02());
        r0 = null;
        if (!A032.isEmpty()) {
            r0 = (C151007Tb) C18290x4.A0k(A032);
        }
        return r0;
    }

    public synchronized List A02() {
        ArrayList A0s;
        String string = this.A01.A03().getString(C620933l.A01(this.A03), "");
        A0s = AnonymousClass001.A0s();
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(string);
                Iterator<String> keys = A1H.keys();
                while (keys.hasNext()) {
                    String A0m = AnonymousClass001.A0m(keys);
                    String string2 = A1H.getString(A0m);
                    boolean equals = string2.equals("skipped");
                    if (equals) {
                        string2 = "-1";
                    }
                    C151007Tb r0 = new C151007Tb(A0m, false, string2);
                    r0.A02 = equals;
                    A0s.add(r0);
                }
            } catch (JSONException e) {
                this.A04.A0A("getCompletedStep threw: ", e);
            }
        }
        return A0s;
    }

    public synchronized List A03(List list) {
        ArrayList A0s;
        A0s = AnonymousClass001.A0s();
        C161357pU A022 = this.A02.A02();
        if (A022 != null) {
            for (C151007Tb r8 : A022.A02(this.A03)) {
                int i = 0;
                while (true) {
                    if (i < list.size()) {
                        if (((C151007Tb) list.get(i)).A03.equals(r8.A03)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0 || !((C151007Tb) list.get(i)).A00.equals(r8.A00) || (((C151007Tb) list.get(i)).A02 && !r8.A01)) {
                    A0s.add(new C151007Tb(r8.A03, r8.A01, r8.A00));
                }
            }
        }
        return A0s;
    }

    public synchronized void A05() {
        this.A01.A0H(this.A03);
        A04();
    }

    public synchronized void A06() {
        C620933l r5 = this.A01;
        String str = this.A03;
        String string = r5.A03().getString(C620933l.A01(str), "");
        boolean A1W = C18280x3.A1W(r5.A03(), "payments_sandbox");
        r5.A0H(str);
        A04();
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(string);
                Iterator<String> keys = A1H.keys();
                ArrayList A0s = AnonymousClass001.A0s();
                while (keys.hasNext()) {
                    String A0m = AnonymousClass001.A0m(keys);
                    if (!"tos_no_wallet".equals(A0m)) {
                        A0s.add(A0m);
                    } else if (A1W) {
                        C18270x1.A0l(C620933l.A00(r5), "payments_sandbox", A1W);
                    }
                }
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    A1H.remove(AnonymousClass001.A0m(it));
                }
                C18270x1.A0j(C620933l.A00(r5), C620933l.A01(str), A1H.toString());
            } catch (JSONException e) {
                this.A04.A0A("clearAllButTos threw: ", e);
            }
        }
        C160757oG r3 = this.A04;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("clearAllButTos ended with steps: ");
        A0o.append(r5.A03().getString(C620933l.A01(str), ""));
        A0o.append(" sandbox: ");
        C1899593h.A1L(r3, A0o, C18280x3.A1W(r5.A03(), "payments_sandbox"));
    }

    public synchronized void A07(C151007Tb r6) {
        if (r6 != null) {
            List A022 = A02();
            Iterator it = A022.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C151007Tb r2 = (C151007Tb) it.next();
                if (r2.A03.equals(r6.A03)) {
                    A022.remove(r2);
                    A0A(A022);
                    break;
                }
            }
        } else {
            C1899593h.A1H(this.A04, r6, "/removeCompletedStep step to remove cannot be null: ", AnonymousClass001.A0o());
        }
    }

    public synchronized void A08(C151007Tb r7) {
        if (r7 != null) {
            String str = r7.A03;
            if (!str.equals("unset")) {
                List A022 = A02();
                List A032 = A03(A022);
                Iterator it = A022.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C151007Tb) it.next()).A03.equals(str)) {
                            break;
                        }
                    } else {
                        A022.add(r7);
                        Iterator it2 = A032.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C151007Tb r1 = (C151007Tb) it2.next();
                            if (r1.A03.equals(str)) {
                                A032.remove(r1);
                                break;
                            }
                        }
                        C160757oG r2 = this.A04;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("setCompletedStep setting step: ");
                        A0o.append(r7);
                        A0o.append(" as complete making completed steps: ");
                        A0o.append(A022);
                        C1899593h.A1H(r2, A032, " incomplete steps: ", A0o);
                        A0A(A022);
                    }
                }
            }
        }
    }

    public synchronized void A09(String str) {
        A08(A01(str));
    }

    public final synchronized void A0A(List list) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C151007Tb r3 = (C151007Tb) it.next();
            String str = r3.A00;
            if (!TextUtils.isEmpty(str)) {
                try {
                    String str2 = r3.A03;
                    if (r3.A02) {
                        str = "skipped";
                    }
                    A1G.put(str2, str);
                } catch (JSONException e) {
                    this.A04.A0A("setCompletedStep threw: ", e);
                }
            }
        }
        C1899593h.A1H(this.A04, A1G, "storing steps: ", AnonymousClass001.A0o());
        C620933l r1 = this.A01;
        String str3 = this.A03;
        C18270x1.A0j(C620933l.A00(r1), C620933l.A01(str3), A1G.toString());
    }

    public synchronized boolean A0B() {
        boolean z;
        C161357pU A022 = this.A02.A02();
        z = false;
        if (A022 != null && !A022.A07 && (A0G("tos_no_wallet") || A0G("tos_with_wallet"))) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (A0E() != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0C() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0D()     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            boolean r1 = r2.A0E()     // Catch:{ all -> 0x0011 }
            r0 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194979Vj.A0C():boolean");
    }

    public synchronized boolean A0D() {
        return A0F(1);
    }

    public synchronized boolean A0E() {
        return A0F(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0F(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            X.33l r0 = r10.A01     // Catch:{ all -> 0x006e }
            android.content.SharedPreferences r1 = r0.A03()     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "has_p2mlite_account"
            boolean r0 = X.C18280x3.A1W(r1, r0)     // Catch:{ all -> 0x006e }
            r6 = 1
            if (r0 != 0) goto L_0x006c
            X.7ae r0 = r10.A02     // Catch:{ all -> 0x006e }
            X.7pU r1 = r0.A02()     // Catch:{ all -> 0x006e }
            r9 = 0
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = r10.A03     // Catch:{ all -> 0x006e }
            X.7Tb[] r5 = r1.A02(r0)     // Catch:{ all -> 0x006e }
            if (r5 == 0) goto L_0x006a
            int r4 = r5.length     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x006a
            java.util.List r3 = r10.A02()     // Catch:{ all -> 0x006e }
            r2 = 0
        L_0x0029:
            r7 = r5[r2]     // Catch:{ all -> 0x006e }
            r8 = 0
        L_0x002c:
            int r0 = r3.size()     // Catch:{ all -> 0x006e }
            if (r8 >= r0) goto L_0x0045
            java.lang.Object r0 = r3.get(r8)     // Catch:{ all -> 0x006e }
            X.7Tb r0 = (X.C151007Tb) r0     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x006e }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0046
            int r8 = r8 + 1
            goto L_0x002c
        L_0x0045:
            r8 = -1
        L_0x0046:
            if (r11 == r6) goto L_0x0052
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "2fa"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0065
        L_0x0052:
            if (r8 < 0) goto L_0x006a
            java.lang.Object r0 = r3.get(r8)     // Catch:{ all -> 0x006e }
            X.7Tb r0 = (X.C151007Tb) r0     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r7.A00     // Catch:{ all -> 0x006e }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            int r2 = r2 + 1
            if (r2 >= r4) goto L_0x006c
            goto L_0x0029
        L_0x006a:
            monitor-exit(r10)
            return r9
        L_0x006c:
            monitor-exit(r10)
            return r6
        L_0x006e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194979Vj.A0F(int):boolean");
    }

    public C151007Tb A01(String str) {
        C161357pU A022 = this.A02.A02();
        if (A022 == null) {
            return null;
        }
        for (C151007Tb r1 : A022.A02(this.A03)) {
            if (r1.A03.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public C194979Vj(AnonymousClass30K r4, C620933l r5, C153087ae r6, String str) {
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = str;
    }

    public final void A04() {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass30K r3 = this.A00;
        for (AnonymousClass3ZO r1 : r3.A02()) {
            if (r1.A03 != null) {
                A0s.add(r1.A06);
            }
        }
        if (A0s.size() > 0) {
            r3.A05(A0s);
        }
    }

    public boolean A0G(String str) {
        for (C151007Tb r0 : A02()) {
            if (r0.A03.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
