package X;

import android.content.SharedPreferences;

/* renamed from: X.2oT  reason: invalid class name and case insensitive filesystem */
public abstract class C54282oT {
    public volatile Object A00;

    public final synchronized void A01(Object obj, boolean z) {
        AnonymousClass7KQ r3;
        boolean z2;
        SharedPreferences.Editor editor;
        String str;
        long currentTimeMillis;
        SharedPreferences.Editor edit;
        String str2;
        if (z) {
            if (C162457s7.A0P(this.A00, obj)) {
            }
        }
        this.A00 = obj;
        AnonymousClass4H7 r1 = (AnonymousClass4H7) this;
        switch (r1.A01) {
            case 0:
                AnonymousClass21Y r6 = (AnonymousClass21Y) obj;
                C162457s7.A0J(r6, 0);
                r3 = ((C54862pP) r1.A00).A00;
                z2 = r6.value;
                editor = C18270x1.A04(r3.A02);
                str = "bonsai_agent_tos_accepted";
                break;
            case 1:
                AnonymousClass21Y r62 = (AnonymousClass21Y) obj;
                C162457s7.A0J(r62, 0);
                r3 = ((C54862pP) r1.A00).A00;
                z2 = r62.value;
                editor = C18270x1.A04(r3.A02);
                str = "bonsai_invoke_tos_accepted";
                break;
            case 2:
                C372121j r63 = (C372121j) obj;
                C162457s7.A0J(r63, 0);
                AnonymousClass7KQ r0 = ((C55382qG) r1.A00).A00;
                C18260x0.A0L(r0.A00, "bonsai_feature_state", r63.value);
                break;
            default:
                String str3 = (String) obj;
                C162457s7.A0J(str3, 0);
                if (str3.equals("no")) {
                    AnonymousClass2Z3 r02 = ((C43412Sa) r1.A00).A04;
                    currentTimeMillis = System.currentTimeMillis();
                    edit = r02.A00().edit();
                    edit.putString("consent_status", "no");
                    str2 = "consent_last_dismissed_timestamp";
                } else {
                    AnonymousClass2Z3 r03 = ((C43412Sa) r1.A00).A04;
                    currentTimeMillis = System.currentTimeMillis();
                    edit = r03.A00().edit();
                    edit.putString("consent_status", str3);
                    str2 = "consent_last_fetch_timestamp";
                }
                edit.putLong(str2, currentTimeMillis);
                edit.apply();
                break;
        }
        C18270x1.A0l(editor, str, z2);
        C18260x0.A0K(r3.A00, "bonsai_tos_state");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (X.C18280x3.A1W(r1, r0) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r6 = X.AnonymousClass21Y.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r6 = X.AnonymousClass21Y.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r7.A00 = r6;
        r6 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
            r7 = this;
            java.lang.Object r6 = r7.A00
            if (r6 != 0) goto L_0x008f
            monitor-enter(r7)
            java.lang.Object r6 = r7.A00     // Catch:{ all -> 0x008c }
            if (r6 != 0) goto L_0x008a
            r1 = r7
            X.4H7 r1 = (X.AnonymousClass4H7) r1     // Catch:{ all -> 0x008c }
            int r0 = r1.A01     // Catch:{ all -> 0x008c }
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x0037;
                case 2: goto L_0x0051;
                default: goto L_0x0011;
            }     // Catch:{ all -> 0x008c }
        L_0x0011:
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x008c }
            X.2Sa r0 = (X.C43412Sa) r0     // Catch:{ all -> 0x008c }
            X.2Z3 r0 = r0.A04     // Catch:{ all -> 0x008c }
            android.content.SharedPreferences r1 = r0.A00()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "consent_status"
            java.lang.String r6 = "unset"
            java.lang.String r0 = r1.getString(r0, r6)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0084
            r6 = r0
            goto L_0x0084
        L_0x0028:
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x008c }
            X.2pP r0 = (X.C54862pP) r0     // Catch:{ all -> 0x008c }
            X.7KQ r0 = r0.A00     // Catch:{ all -> 0x008c }
            X.66R r0 = r0.A02     // Catch:{ all -> 0x008c }
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "bonsai_agent_tos_accepted"
            goto L_0x0045
        L_0x0037:
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x008c }
            X.2pP r0 = (X.C54862pP) r0     // Catch:{ all -> 0x008c }
            X.7KQ r0 = r0.A00     // Catch:{ all -> 0x008c }
            X.66R r0 = r0.A02     // Catch:{ all -> 0x008c }
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "bonsai_invoke_tos_accepted"
        L_0x0045:
            boolean r0 = X.C18280x3.A1W(r1, r0)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x004e
            X.21Y r6 = X.AnonymousClass21Y.A02     // Catch:{ all -> 0x008c }
            goto L_0x0084
        L_0x004e:
            X.21Y r6 = X.AnonymousClass21Y.A03     // Catch:{ all -> 0x008c }
            goto L_0x0084
        L_0x0051:
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x008c }
            X.2qG r0 = (X.C55382qG) r0     // Catch:{ all -> 0x008c }
            X.7KQ r0 = r0.A00     // Catch:{ all -> 0x008c }
            X.33p r0 = r0.A00     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "bonsai_feature_state"
            r1 = -1
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x008c }
            int r0 = r0.getInt(r2, r1)     // Catch:{ all -> 0x008c }
            if (r0 != r1) goto L_0x0068
            r5 = 0
            goto L_0x006c
        L_0x0068:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008c }
        L_0x006c:
            X.21j[] r4 = X.C372121j.values()     // Catch:{ all -> 0x008c }
            int r3 = r4.length     // Catch:{ all -> 0x008c }
            r2 = 0
        L_0x0072:
            if (r2 >= r3) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            X.21j r6 = X.C372121j.BEFORE_WAITLIST     // Catch:{ all -> 0x008c }
            goto L_0x0084
        L_0x0078:
            r6 = r4[r2]     // Catch:{ all -> 0x008c }
            int r1 = r6.value     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x0087
            int r0 = r5.intValue()     // Catch:{ all -> 0x008c }
            if (r1 != r0) goto L_0x0087
        L_0x0084:
            r7.A00 = r6     // Catch:{ all -> 0x008c }
            goto L_0x008a
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x0072
        L_0x008a:
            monitor-exit(r7)
            return r6
        L_0x008c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x008f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54282oT.A00():java.lang.Object");
    }
}
