package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2nL  reason: invalid class name and case insensitive filesystem */
public class C53592nL {
    public Map A00;
    public final C56972sr A01;
    public final C56882si A02;
    public final C56612sH A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;
    public final AnonymousClass4FS A06;

    public final synchronized Map A00() {
        HashMap hashMap;
        Map map = this.A00;
        hashMap = map;
        if (map == null) {
            String A0Z = C18280x3.A0Z(this.A02.A02(), "out_contact_convert_time_in_msec_map");
            HashMap A0t = AnonymousClass001.A0t();
            if (!TextUtils.isEmpty(A0Z)) {
                try {
                    JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                    Iterator<String> keys = A1H.keys();
                    while (keys.hasNext()) {
                        String A0m = AnonymousClass001.A0m(keys);
                        AnonymousClass0x2.A1J(AnonymousClass32Y.A09(A0m), A0t, A1H.getLong(A0m));
                    }
                } catch (AnonymousClass24P | JSONException e) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "ContactDiscoveryLoggingHelper/loadJsonMap ex=", e);
                }
            }
            this.A00 = A0t;
            hashMap = A0t;
        }
        return hashMap;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    public final synchronized void A01(java.util.List r14, java.util.Set r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            X.2sH r0 = r13.A03     // Catch:{ all -> 0x00a9 }
            long r11 = r0.A0H()     // Catch:{ all -> 0x00a9 }
            r13.A00()     // Catch:{ all -> 0x00a9 }
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x00a9 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x00a9 }
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x00a9 }
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x00a9 }
            java.util.Iterator r10 = X.C18280x3.A0i(r0)     // Catch:{ all -> 0x00a9 }
            boolean r0 = r14.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0026
            boolean r0 = r15.isEmpty()     // Catch:{ all -> 0x00a9 }
            r9 = 0
            if (r0 != 0) goto L_0x0027
        L_0x0026:
            r9 = 1
        L_0x0027:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0062
            com.whatsapp.jid.UserJid r3 = X.C18310x6.A0T(r10)     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0052
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x00a9 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00a9 }
            long r7 = X.C18320x8.A04(r0)     // Catch:{ all -> 0x00a9 }
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            long r1 = r11 - r5
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004e
            boolean r0 = r15.contains(r3)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0052
        L_0x004e:
            r10.remove()     // Catch:{ all -> 0x00a9 }
            goto L_0x0026
        L_0x0052:
            java.lang.String r1 = r3.getRawString()     // Catch:{ all -> 0x00a9 }
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x00a9 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00a9 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x0027
        L_0x0062:
            java.util.Iterator r3 = r14.iterator()     // Catch:{ all -> 0x00a9 }
        L_0x0066:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0085
            com.whatsapp.jid.Jid r2 = X.AnonymousClass3ZH.A06(r3)     // Catch:{ all -> 0x00a9 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x0066
            java.lang.String r0 = r2.getRawString()     // Catch:{ all -> 0x00a9 }
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00a9 }
            r4.put(r0, r1)     // Catch:{ all -> 0x00a9 }
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x00a9 }
            r0.put(r2, r1)     // Catch:{ all -> 0x00a9 }
            goto L_0x0066
        L_0x0085:
            if (r9 == 0) goto L_0x00a7
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x009b
            X.2si r1 = r13.A02     // Catch:{ all -> 0x00a9 }
            r2 = 0
        L_0x0090:
            android.content.SharedPreferences$Editor r1 = X.C56882si.A01(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "out_contact_convert_time_in_msec_map"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a7
        L_0x009b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00a9 }
            r0.<init>(r4)     // Catch:{ all -> 0x00a9 }
            X.2si r1 = r13.A02     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x00a9 }
            goto L_0x0090
        L_0x00a7:
            monitor-exit(r13)
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53592nL.A01(java.util.List, java.util.Set):void");
    }

    public C53592nL(C56972sr r1, C56882si r2, C56612sH r3, AnonymousClass1VX r4, AnonymousClass4FV r5, AnonymousClass4FS r6) {
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r1;
        this.A06 = r6;
        this.A05 = r5;
        this.A02 = r2;
    }
}
