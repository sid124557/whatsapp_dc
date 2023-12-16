package X;

import android.os.Handler;

/* renamed from: X.8Mf  reason: invalid class name and case insensitive filesystem */
public class C172668Mf implements Runnable {
    public Object A00;
    public final int A01;

    public C172668Mf(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Handler handler, Object obj, int i) {
        handler.post(new C172668Mf(obj, i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r3v40 ?, r3v42 ?, r3v44 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final void run() {
        /*
            r20 = this;
            r3 = r20
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x06ef;
                case 1: goto L_0x0013;
                case 2: goto L_0x0042;
                case 3: goto L_0x0050;
                case 4: goto L_0x06f7;
                case 5: goto L_0x0944;
                case 6: goto L_0x0753;
                case 7: goto L_0x0789;
                case 8: goto L_0x0796;
                case 9: goto L_0x006c;
                case 10: goto L_0x07a1;
                case 11: goto L_0x0079;
                case 12: goto L_0x0397;
                case 13: goto L_0x03ab;
                case 14: goto L_0x03bf;
                case 15: goto L_0x03d3;
                case 16: goto L_0x03e7;
                case 17: goto L_0x03fb;
                case 18: goto L_0x07b2;
                case 19: goto L_0x04de;
                case 20: goto L_0x07bc;
                case 21: goto L_0x07ce;
                case 22: goto L_0x07d6;
                case 23: goto L_0x0533;
                case 24: goto L_0x07de;
                case 25: goto L_0x0544;
                case 26: goto L_0x080a;
                case 27: goto L_0x0812;
                case 28: goto L_0x0828;
                case 29: goto L_0x0838;
                case 30: goto L_0x084d;
                case 31: goto L_0x0859;
                case 32: goto L_0x089f;
                case 33: goto L_0x0564;
                case 34: goto L_0x08b0;
                case 35: goto L_0x0589;
                case 36: goto L_0x05ae;
                case 37: goto L_0x08c5;
                case 38: goto L_0x05fa;
                case 39: goto L_0x08ce;
                case 40: goto L_0x08d7;
                case 41: goto L_0x08e7;
                case 42: goto L_0x08f6;
                case 43: goto L_0x0900;
                case 44: goto L_0x0908;
                case 45: goto L_0x0925;
                case 46: goto L_0x068f;
                case 47: goto L_0x0930;
                case 48: goto L_0x069f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r3.A00
            X.7oM r1 = (X.C160817oM) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0012
            r1.A06()
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r4 = r3.A00
            X.812 r4 = (X.AnonymousClass812) r4
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x0012
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x0012
            X.8sP r0 = r4.A07
            if (r0 == 0) goto L_0x0012
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x0012
            X.818[] r3 = r4.A0K
            int r2 = r3.length
            r8 = 0
            r1 = 0
        L_0x002c:
            if (r1 >= r2) goto L_0x0a36
            r0 = r3[r1]
            X.7XN r9 = r0.A09
            monitor-enter(r9)
            boolean r0 = r9.A08     // Catch:{ all -> 0x0a93 }
            if (r0 == 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            X.7z1 r0 = r9.A07     // Catch:{ all -> 0x0a93 }
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            monitor-exit(r9)
            if (r0 == 0) goto L_0x0012
            int r1 = r1 + 1
            goto L_0x002c
        L_0x0042:
            java.lang.Object r1 = r3.A00
            X.812 r1 = (X.AnonymousClass812) r1
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0012
            X.8xA r0 = r1.A08
            r0.BQ7(r1)
            return
        L_0x0050:
            java.lang.Object r4 = r3.A00
            X.812 r4 = (X.AnonymousClass812) r4
            X.818[] r3 = r4.A0K
            int r2 = r3.length
            r1 = 0
        L_0x0058:
            if (r1 >= r2) goto L_0x0062
            r0 = r3[r1]
            r0.A03()
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0062:
            X.7Iv r1 = r4.A0R
            X.8tH r0 = r1.A00
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r1.A00 = r0
            return
        L_0x006c:
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            boolean r0 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ Exception -> 0x0ab3 }
            if (r0 == 0) goto L_0x0012
            com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeLoggerLoop()     // Catch:{ Exception -> 0x0ab3 }
            goto L_0x0ab2
        L_0x0079:
            java.lang.Object r0 = r3.A00
            X.6Nd r0 = (X.C126256Nd) r0
            X.7Lt r9 = r0.A01
            X.66R r0 = r9.A00
            java.lang.Object r4 = r0.getValue()
            X.851 r4 = (X.AnonymousClass851) r4
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            X.2oc r0 = r4.A02
            java.util.Map r0 = r0.A00()
            java.util.Iterator r14 = X.AnonymousClass000.A0q(r0)
        L_0x0095:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0122
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r14)
            java.lang.String r13 = X.C18310x6.A0q(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x0095
            java.lang.Object r5 = r1.getValue()
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.String r0 = "size_config"
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0120
            X.6Nj r6 = X.C126316Nj.A00(r0)
        L_0x00bc:
            java.lang.String r0 = "staleness_config"
            org.json.JSONObject r12 = r5.optJSONObject(r0)
            if (r12 == 0) goto L_0x011e
            java.lang.String r2 = "stale_age_s"
            r0 = -1
            long r0 = r12.optLong(r2, r0)
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0111
            r8 = r7
        L_0x00d3:
            if (r6 != 0) goto L_0x00d8
            if (r8 != 0) goto L_0x00d8
            goto L_0x0095
        L_0x00d8:
            java.lang.String r0 = "cache_name"
            java.lang.String r2 = r5.optString(r0)
            java.lang.String r1 = "eviction_type"
            java.lang.String r0 = "file"
            java.lang.String r1 = r5.optString(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00ed
            r7 = r2
        L_0x00ed:
            X.6Nl r2 = new X.6Nl
            r2.<init>(r6, r8, r1, r7)
            X.6Nh r0 = r2.A02
            if (r0 != 0) goto L_0x00fb
            X.6Nj r0 = r2.A01
            if (r0 != 0) goto L_0x00fb
            goto L_0x0095
        L_0x00fb:
            java.lang.String r0 = r2.A00
            if (r0 != 0) goto L_0x0109
            java.lang.String r1 = "feature_name"
            java.lang.String r0 = "n/a"
            java.lang.String r0 = r5.optString(r1, r0)
            r2.A00 = r0
        L_0x0109:
            java.io.File r0 = X.AnonymousClass002.A0B(r13)
            r3.put(r0, r2)
            goto L_0x0095
        L_0x0111:
            java.lang.String r8 = "is_itemized"
            r2 = 0
            boolean r2 = r12.optBoolean(r8, r2)
            X.6Nh r8 = new X.6Nh
            r8.<init>(r0, r2)
            goto L_0x00d3
        L_0x011e:
            r8 = r7
            goto L_0x00d3
        L_0x0120:
            r6 = r7
            goto L_0x00bc
        L_0x0122:
            java.util.Map r1 = r4.A04
            monitor-enter(r1)
            r3.putAll(r1)     // Catch:{ all -> 0x0abe }
            monitor-exit(r1)     // Catch:{ all -> 0x0abe }
            java.util.Iterator r3 = X.AnonymousClass001.A0u(r3)
        L_0x012d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x013f
            java.lang.Object r2 = r3.next()
            java.util.concurrent.Executor r1 = r4.A05
            r0 = 15
            X.AnonymousClass8MF.A01(r4, r2, r1, r0)
            goto L_0x012d
        L_0x013f:
            X.66R r0 = r9.A01
            java.lang.Object r8 = r0.getValue()
            X.852 r8 = (X.AnonymousClass852) r8
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
            X.2oc r6 = r8.A00
            java.util.Map r0 = r6.A00()
            java.util.Iterator r4 = X.AnonymousClass000.A0q(r0)
        L_0x0155:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0190
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r4)
            java.lang.String r3 = X.C18310x6.A0q(r0)
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0155
            X.6Nj r2 = X.C126316Nj.A00(r1)
            if (r2 != 0) goto L_0x0179
            r6.A02(r3)
            goto L_0x0155
        L_0x0179:
            java.lang.String r0 = "feature_name"
            java.lang.String r1 = r1.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0187
            java.lang.String r1 = "n/a"
        L_0x0187:
            X.6Ng r0 = new X.6Ng
            r0.<init>(r2, r1)
            r7.put(r3, r0)
            goto L_0x0155
        L_0x0190:
            int[] r5 = X.C159257lW.A01()
            int r10 = r5.length
            r4 = 0
        L_0x0196:
            if (r4 >= r10) goto L_0x0229
            r3 = r5[r4]
            java.lang.String r2 = X.C159257lW.A00(r3)
            switch(r3) {
                case 100: goto L_0x01a7;
                case 101: goto L_0x01a7;
                case 102: goto L_0x01a7;
                case 103: goto L_0x01a7;
                case 104: goto L_0x01a7;
                case 105: goto L_0x01a4;
                case 106: goto L_0x01d0;
                case 107: goto L_0x01dc;
                case 108: goto L_0x01dc;
                case 109: goto L_0x01c4;
                case 110: goto L_0x01a1;
                case 111: goto L_0x01b6;
                default: goto L_0x01a1;
            }
        L_0x01a1:
            int r4 = r4 + 1
            goto L_0x0196
        L_0x01a4:
            r12 = 8
            goto L_0x01a9
        L_0x01a7:
            r12 = 1024(0x400, double:5.06E-321)
        L_0x01a9:
            r18 = 0
            X.6Nj r11 = new X.6Nj
            r16 = r12
            r14 = r12
            r19 = r18
            r11.<init>(r12, r14, r16, r18, r19)
            goto L_0x01ed
        L_0x01b6:
            X.7Tl r11 = new X.7Tl
            r11.<init>()
            r0 = 12582912(0xc00000, double:6.2167845E-317)
            r11.A00 = r0
            r0 = 1
            r11.A04 = r0
            goto L_0x01e9
        L_0x01c4:
            X.7Tl r11 = new X.7Tl
            r11.<init>()
            r0 = 1
            r11.A04 = r0
            r0 = 10485760(0xa00000, double:5.180654E-317)
            goto L_0x01e7
        L_0x01d0:
            X.7Tl r11 = new X.7Tl
            r11.<init>()
            r0 = 1
            r11.A04 = r0
            r0 = 104857600(0x6400000, double:5.1806538E-316)
            goto L_0x01e7
        L_0x01dc:
            X.7Tl r11 = new X.7Tl
            r11.<init>()
            r0 = 1
            r11.A04 = r0
            r0 = 52428800(0x3200000, double:2.5903269E-316)
        L_0x01e7:
            r11.A00 = r0
        L_0x01e9:
            X.6Nj r11 = r11.A00()
        L_0x01ed:
            if (r11 == 0) goto L_0x01a1
            if (r2 == 0) goto L_0x01a1
            boolean r0 = r11.A04
            if (r0 != 0) goto L_0x01a1
            X.8lK r0 = r8.A01
            X.8lJ r0 = (X.C180588lJ) r0
            X.7jR r0 = r0.B4Y()
            java.util.Set r0 = r0.A02(r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x0205:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r0 = r3.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0216 }
            goto L_0x021a
        L_0x0216:
            java.lang.String r1 = r0.getAbsolutePath()
        L_0x021a:
            boolean r0 = r7.containsKey(r1)
            if (r0 != 0) goto L_0x0205
            X.6Ng r0 = new X.6Ng
            r0.<init>(r11, r2)
            r7.put(r1, r0)
            goto L_0x0205
        L_0x0229:
            java.util.Iterator r15 = X.AnonymousClass001.A0u(r7)
            r13 = 0
        L_0x022f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x027b
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r15)
            java.lang.String r10 = X.C18310x6.A0q(r0)
            java.lang.Object r11 = r0.getValue()
            X.6Ng r11 = (X.C126286Ng) r11
            X.7Qb r12 = r11.A00
            X.6Nj r12 = (X.C126316Nj) r12
            X.8lK r7 = r8.A01
            r0 = r7
            X.8qg r0 = (X.C183808qg) r0
            boolean r0 = r0.BI1()
            if (r0 == 0) goto L_0x0278
            long r3 = r12.A01
        L_0x0254:
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x022f
            java.io.File r5 = X.AnonymousClass002.A0B(r10)
            X.7JK r0 = X.C159247lV.A01(r5)
            long r1 = r0.A02
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x026a
            r8.A00(r11, r5, r1)
            goto L_0x022f
        L_0x026a:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x022f
            r7.B1O(r5)
            r6.A02(r10)
            r5.mkdirs()
            goto L_0x022f
        L_0x0278:
            long r3 = r12.A00
            goto L_0x0254
        L_0x027b:
            X.66R r0 = r9.A02
            java.lang.Object r7 = r0.getValue()
            X.84z r7 = (X.C1683284z) r7
            java.util.HashMap r13 = X.AnonymousClass001.A0t()
            X.2oc r6 = r7.A00
            java.util.Map r0 = r6.A00()
            java.util.Iterator r12 = X.AnonymousClass000.A0q(r0)
        L_0x0291:
            boolean r0 = r12.hasNext()
            r1 = -1
            if (r0 == 0) goto L_0x02e6
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r12)
            java.lang.String r8 = X.C18310x6.A0q(r0)
            java.lang.Object r9 = r0.getValue()
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0291
            java.lang.String r0 = "stale_age_s"
            long r3 = r9.optLong(r0, r1)
            r10 = 0
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x02bd
            r6.A02(r8)
            goto L_0x0291
        L_0x02bd:
            java.lang.String r5 = "is_itemized"
            r0 = 0
            boolean r0 = r9.optBoolean(r5, r0)
            X.6Nh r5 = new X.6Nh
            r5.<init>(r3, r0)
            java.lang.String r0 = "feature_name"
            java.lang.String r3 = r9.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x02d7
            java.lang.String r3 = "n/a"
        L_0x02d7:
            java.lang.String r0 = "usage_timestamp_s"
            long r1 = r9.optLong(r0, r1)
            X.15S r0 = new X.15S
            r0.<init>(r5, r3, r1)
            r13.put(r8, r0)
            goto L_0x0291
        L_0x02e6:
            int[] r12 = X.C159257lW.A01()
            int r11 = r12.length
            r10 = 0
        L_0x02ec:
            if (r10 >= r11) goto L_0x0344
            r3 = r12[r10]
            java.lang.String r5 = X.C159257lW.A00(r3)
            switch(r3) {
                case 100: goto L_0x02fa;
                case 101: goto L_0x02fa;
                case 102: goto L_0x02fa;
                case 103: goto L_0x02fa;
                case 104: goto L_0x02fa;
                case 105: goto L_0x02fa;
                case 106: goto L_0x02fc;
                case 107: goto L_0x02ff;
                case 108: goto L_0x02ff;
                case 109: goto L_0x02ff;
                case 110: goto L_0x0302;
                default: goto L_0x02f7;
            }
        L_0x02f7:
            int r10 = r10 + 1
            goto L_0x02ec
        L_0x02fa:
            r0 = 0
            goto L_0x0303
        L_0x02fc:
            r0 = 90
            goto L_0x0303
        L_0x02ff:
            r0 = 28
            goto L_0x0303
        L_0x0302:
            r0 = 1
        L_0x0303:
            long r8 = (long) r0
            r14 = 86400(0x15180, double:4.26873E-319)
            long r8 = r8 * r14
            r0 = 0
            X.6Nh r4 = new X.6Nh
            r4.<init>(r8, r0)
            if (r5 == 0) goto L_0x02f7
            X.8lK r0 = r7.A01
            X.8lJ r0 = (X.C180588lJ) r0
            X.7jR r0 = r0.B4Y()
            java.util.Set r0 = r0.A02(r3)
            java.util.Iterator r8 = r0.iterator()
        L_0x0320:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02f7
            java.lang.Object r0 = r8.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r3 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0331 }
            goto L_0x0335
        L_0x0331:
            java.lang.String r3 = r0.getAbsolutePath()
        L_0x0335:
            boolean r0 = r13.containsKey(r3)
            if (r0 != 0) goto L_0x0320
            X.15S r0 = new X.15S
            r0.<init>(r4, r5, r1)
            r13.put(r3, r0)
            goto L_0x0320
        L_0x0344:
            java.util.Iterator r14 = X.AnonymousClass001.A0u(r13)
            r12 = 0
        L_0x034a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0012
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r14)
            java.lang.String r5 = X.C18310x6.A0q(r0)
            java.lang.Object r1 = r0.getValue()
            X.15S r1 = (X.AnonymousClass15S) r1
            java.io.File r4 = X.AnonymousClass002.A0B(r5)
            long r10 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r8
            long r2 = r1.A00
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0374
            long r2 = r4.lastModified()
            long r2 = r2 / r8
        L_0x0374:
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x034a
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x034a
            X.7Qb r0 = r1.A00
            X.6Nh r0 = (X.C126296Nh) r0
            long r0 = r0.A00
            long r2 = r2 + r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x034a
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x034a
            X.8lK r0 = r7.A01
            r0.B1O(r4)
            r6.A02(r5)
            r4.mkdirs()
            goto L_0x034a
        L_0x0397:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r1 = X.AnonymousClass85C.A00(r0)
        L_0x039d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            X.8vW r0 = X.AnonymousClass6CA.A0K(r1)
            r0.BRg()
            goto L_0x039d
        L_0x03ab:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r1 = X.AnonymousClass85C.A00(r0)
        L_0x03b1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            X.8vW r0 = X.AnonymousClass6CA.A0K(r1)
            r0.BfP()
            goto L_0x03b1
        L_0x03bf:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r1 = X.AnonymousClass85C.A00(r0)
        L_0x03c5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            X.8vW r0 = X.AnonymousClass6CA.A0K(r1)
            r0.BfQ()
            goto L_0x03c5
        L_0x03d3:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r1 = X.AnonymousClass85C.A00(r0)
        L_0x03d9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            X.8vW r0 = X.AnonymousClass6CA.A0K(r1)
            r0.BYo()
            goto L_0x03d9
        L_0x03e7:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r1 = X.AnonymousClass85C.A00(r0)
        L_0x03ed:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            X.8vW r0 = X.AnonymousClass6CA.A0K(r1)
            r0.BYB()
            goto L_0x03ed
        L_0x03fb:
            java.lang.Object r1 = r3.A00
            X.7l9 r1 = (X.C159117l9) r1
            X.8LG r2 = r1.A0B
            boolean r0 = r2.preventPreallocateIfNotEmpty
            r3 = 1
            if (r0 == 0) goto L_0x0410
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0I
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 != 0) goto L_0x0410
            return
        L_0x0410:
            X.7QU r1 = new X.7QU
            r1.<init>()
            r1.A0L = r3
            r1.A0K = r3
            int r0 = r2.maxMediaCodecInstancesPerCodecName
            r1.A02 = r0
            int r0 = r2.maxMediaCodecInstancesTotal
            r1.A03 = r0
            boolean r0 = r2.skipMediaCodecStopOnRelease
            r1.A0P = r0
            boolean r0 = r2.skipAudioMediaCodecStopOnRelease
            r1.A0O = r0
            boolean r0 = r2.enableCodecDeadlockFix
            r1.A0B = r0
            boolean r0 = r2.enableAsynchronousBufferQueueing
            r1.A09 = r0
            boolean r0 = r2.enableSynchronizeCodecInteractionsWithQueueing
            r1.A0N = r0
            boolean r0 = r2.enableSeamlessAudioCodecAdaptation
            r1.A0M = r0
            boolean r0 = r2.enableDrmSessionStore
            r1.A0F = r0
            boolean r0 = r2.enableLowLatencyDecoding
            r1.A0G = r0
            boolean r0 = r2.enableLowLatencyDecodingOverrideSDKGating
            r1.A0H = r0
            boolean r0 = r2.enableMediaCodecReuseOptimizeLock
            r1.A0I = r0
            java.lang.String r0 = r2.useMediaCodecPoolingForCodecByName
            r1.A07 = r0
            boolean r0 = r2.enableMediaCodecReuseOptimizeRelease
            r1.A0J = r0
            boolean r0 = r2.useVersion2_18Workarounds
            r1.A0R = r0
            boolean r0 = r2.useCodecNeedsEosBufferTimestampWorkaround
            r1.A0Q = r0
            int r0 = r2.releaseThreadInterval
            r1.A04 = r0
            boolean r0 = r2.disablePoolingForDav1dMediaCodec
            r1.A08 = r0
            boolean r0 = r2.enableAudioTrackRetry
            r1.A0A = r0
            X.7QT r11 = new X.7QT
            r11.<init>(r1)
            boolean r0 = r2.enableVp9CodecPreallocation
            java.lang.String r1 = "video/avc"
            if (r0 == 0) goto L_0x0486
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            java.lang.String[] r7 = new java.lang.String[]{r1, r0}
        L_0x0476:
            boolean r1 = r11.A09
            r2 = 0
            boolean r0 = r11.A0N
            X.81D r3 = new X.81D
            r3.<init>(r1, r0)
            java.lang.String r6 = "audio/mp4a-latm"
            X.7kY r8 = X.C158787kY.A04
            monitor-enter(r8)
            goto L_0x048b
        L_0x0486:
            java.lang.String[] r7 = new java.lang.String[]{r1}
            goto L_0x0476
        L_0x048b:
            int r0 = r8.A00     // Catch:{ all -> 0x0ac2 }
            monitor-exit(r8)
            if (r0 > 0) goto L_0x0012
            boolean r0 = r11.A0L
            if (r0 == 0) goto L_0x0012
            int r5 = r7.length     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            r4 = 0
        L_0x0496:
            if (r4 >= r5) goto L_0x04bb
            r0 = r7[r4]     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            java.util.List r1 = X.C162317rh.A03(r0, r2)     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            boolean r0 = r1.isEmpty()     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            if (r0 != 0) goto L_0x04b8
            java.lang.Object r0 = r1.get(r2)     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            X.7nt r0 = (X.C160577nt) r0     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            if (r0 == 0) goto L_0x04b8
            r13 = 1
            X.6vG r10 = X.C141246vG.PREALLOCATE     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            java.lang.String r12 = r0.A02     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            X.8vT r9 = r8.A00(r3, r11, r12, r13)     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            r8.A01(r9, r10, r11, r12, r13)     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
        L_0x04b8:
            int r4 = r4 + 1
            goto L_0x0496
        L_0x04bb:
            java.util.List r1 = X.C162317rh.A03(r6, r2)     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            boolean r0 = r1.isEmpty()     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            if (r0 != 0) goto L_0x0012
            java.lang.Object r0 = r1.get(r2)     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            X.7nt r0 = (X.C160577nt) r0     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            if (r0 == 0) goto L_0x0012
            X.6vG r5 = X.C141246vG.PREALLOCATE     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            java.lang.String r0 = r0.A02     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            X.8vT r4 = r8.A00(r3, r11, r0, r2)     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            r3 = r8
            r6 = r11
            r7 = r0
            r8 = r2
            r3.A01(r4, r5, r6, r7, r8)     // Catch:{ 6yN | 6ys | IllegalStateException -> 0x0012 }
            goto L_0x0ac1
        L_0x04de:
            java.lang.Object r6 = r3.A00
            X.7Py r6 = (X.C150267Py) r6
            java.lang.Object[] r5 = X.AnonymousClass002.A0L()
            java.util.concurrent.ConcurrentLinkedQueue r4 = r6.A06
            int r2 = r4.size()
            java.util.Map r1 = r6.A05
            int r0 = r1.size()
            int r2 = r2 + r0
            X.AnonymousClass000.A1L(r5, r2)
            java.lang.String r3 = "PlayerWarmupScheduler"
            java.lang.String r0 = "processQueue, queueSize=%d"
            X.C161157p6.A01(r3, r0, r5)
            java.util.concurrent.atomic.AtomicReference r0 = r6.A07
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0511
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0012
        L_0x0511:
            boolean r0 = r6.A0A
            r2 = 0
            if (r0 == 0) goto L_0x0012
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x052f
            java.util.Iterator r0 = X.C18280x3.A0i(r1)
            java.lang.Object r0 = r0.next()
            r1.remove(r0)
        L_0x0527:
            java.lang.String r1 = "warmup queue is empty"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.C161157p6.A01(r3, r1, r0)
            return
        L_0x052f:
            r4.poll()
            goto L_0x0527
        L_0x0533:
            java.lang.Object r1 = r3.A00
            X.87m r1 = (X.C1689787m) r1
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x0012
            X.8xX r0 = r1.A09
            r0.getClass()
            r0.BQ8(r1)
            return
        L_0x0544:
            java.lang.Object r0 = r3.A00
            X.89d r0 = (X.C1693989d) r0
            android.content.Context r2 = r0.A0B
            java.util.concurrent.atomic.AtomicBoolean r1 = X.C162117rH.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "notification"
            java.lang.Object r1 = r2.getSystemService(r0)     // Catch:{  }
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1     // Catch:{  }
            if (r1 == 0) goto L_0x0012
            r0 = 10436(0x28c4, float:1.4624E-41)
            r1.cancel(r0)     // Catch:{  }
            goto L_0x0ac5
        L_0x0564:
            java.lang.Object r3 = r3.A00
            X.7TP r3 = (X.AnonymousClass7TP) r3
            r0 = 0
            r3.A01 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r3.A03
            X.0WM r1 = r2.A0S
            if (r1 == 0) goto L_0x057e
            r0 = 1
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x057e
            int r0 = r3.A00
            r3.A00(r0)
            return
        L_0x057e:
            int r1 = r2.A0O
            r0 = 2
            if (r1 != r0) goto L_0x0012
            int r0 = r3.A00
            r2.A0T(r0)
            return
        L_0x0589:
            java.lang.Object r3 = r3.A00
            X.7TQ r3 = (X.AnonymousClass7TQ) r3
            r0 = 0
            r3.A01 = r0
            com.google.android.material.sidesheet.SideSheetBehavior r2 = r3.A03
            X.0WM r1 = r2.A09
            if (r1 == 0) goto L_0x05a3
            r0 = 1
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x05a3
            int r0 = r3.A00
            r3.A00(r0)
            return
        L_0x05a3:
            int r1 = r2.A06
            r0 = 2
            if (r1 != r0) goto L_0x0012
            int r0 = r3.A00
            r2.A0L(r0)
            return
        L_0x05ae:
            java.lang.Object r5 = r3.A00
            X.7l7 r5 = (X.C159097l7) r5
            X.6FH r4 = r5.A0J
            if (r4 == 0) goto L_0x0012
            android.content.Context r1 = r5.A0G
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getRealMetrics(r1)
            int r3 = r1.heightPixels
            int[] r1 = X.C86664Kz.A1Z()
            r4.getLocationOnScreen(r1)
            r0 = 1
            r1 = r1[r0]
            int r0 = r4.getHeight()
            int r1 = r1 + r0
            int r3 = r3 - r1
            float r0 = r4.getTranslationY()
            int r0 = (int) r0
            int r3 = r3 + r0
            int r0 = r5.A02
            if (r3 >= r0) goto L_0x0012
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 != 0) goto L_0x0ac6
            java.lang.String r1 = X.C159097l7.A0Q
            java.lang.String r0 = "Unable to apply gesture inset because layout params are not MarginLayoutParams"
            android.util.Log.w(r1, r0)
            return
        L_0x05fa:
            java.lang.Object r3 = r3.A00
            X.7l7 r3 = (X.C159097l7) r3
            X.6FH r4 = r3.A0J
            if (r4 == 0) goto L_0x0012
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x060c
            r0 = 0
            r4.setVisibility(r0)
        L_0x060c:
            int r0 = r4.A00
            r5 = 1
            if (r0 != r5) goto L_0x0650
            r5 = 2
            float[] r0 = new float[r5]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.TimeInterpolator r0 = r3.A0D
            r2.setInterpolator(r0)
            r0 = 3
            X.C86604Kt.A0w(r2, r3, r0)
            float[] r0 = new float[r5]
            r0 = {1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.TimeInterpolator r0 = r3.A0E
            r1.setInterpolator(r0)
            r0 = 4
            X.C86604Kt.A0w(r1, r3, r0)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r5]
            X.AnonymousClass001.A1I(r2, r1, r0)
            r4.playTogether(r0)
            int r0 = r3.A0A
            long r0 = (long) r0
            r4.setDuration(r0)
            X.C86614Ku.A0z(r4, r3, r5)
        L_0x064c:
            r4.start()
            return
        L_0x0650:
            int r2 = r4.getHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0661
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.bottomMargin
            int r2 = r2 + r0
        L_0x0661:
            float r0 = (float) r2
            r4.setTranslationY(r0)
            android.animation.ValueAnimator r4 = new android.animation.ValueAnimator
            r4.<init>()
            int[] r1 = X.C86664Kz.A1Z()
            r0 = 0
            r1[r0] = r2
            r1[r5] = r0
            r4.setIntValues(r1)
            android.animation.TimeInterpolator r0 = r3.A0F
            r4.setInterpolator(r0)
            int r0 = r3.A0C
            long r0 = (long) r0
            r4.setDuration(r0)
            r1 = 0
            X.67L r0 = new X.67L
            r0.<init>(r3, r1)
            r4.addListener(r0)
            r0 = 5
            X.C86604Kt.A0w(r4, r3, r0)
            goto L_0x064c
        L_0x068f:
            java.lang.Object r1 = r3.A00
            com.google.firebase.iid.FirebaseInstanceId r1 = (com.google.firebase.iid.FirebaseInstanceId) r1
            X.7U4 r0 = r1.A02
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0012
            r1.A06()
            return
        L_0x069f:
            java.lang.Object r8 = r3.A00
            X.7id r8 = (X.C157637id) r8
            X.0ME r7 = r8.A04
            java.lang.ref.WeakReference r6 = r7.A03
            java.lang.Object r5 = r6.get()
            if (r5 == 0) goto L_0x06c4
            X.48t r4 = r7.A01
            X.7Xj r2 = new X.7Xj
            r2.<init>()
            r1 = 0
            java.lang.String r0 = r7.A02
            r2.A04(r0, r1)
            r0 = 1
            X.7jD r1 = X.C152057Xj.A01(r2, r5, r0)
            X.6dJ r0 = r7.A00
            X.C157157hp.A00(r0, r1, r4)
        L_0x06c4:
            boolean r0 = r8.A06
            if (r0 == 0) goto L_0x06d8
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0012
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x0012
            android.os.Handler r2 = r8.A03
            long r0 = r8.A02
            r2.postDelayed(r3, r0)
            return
        L_0x06d8:
            java.lang.Object r2 = r6.get()
            X.7bI r2 = (X.C153427bI) r2
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r7.A02
            r0 = 2131427999(0x7f0b029f, float:1.847763E38)
            java.lang.Object r0 = r2.A02(r0)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.remove(r1)
            return
        L_0x06ef:
            java.lang.Object r0 = r3.A00
            X.6DL r0 = (X.AnonymousClass6DL) r0
            X.AnonymousClass6DL.A00(r0)
            return
        L_0x06f7:
            java.lang.String r5 = "%s: worker finished; %d workers left"
            java.lang.Object r6 = r3.A00     // Catch:{ all -> 0x0730 }
            X.8Tx r6 = (X.C174348Tx) r6     // Catch:{ all -> 0x0730 }
            java.util.concurrent.BlockingQueue r4 = r6.A02     // Catch:{ all -> 0x0730 }
            java.lang.Object r0 = r4.poll()     // Catch:{ all -> 0x0730 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0730 }
            if (r0 == 0) goto L_0x070b
            r0.run()     // Catch:{ all -> 0x0730 }
            goto L_0x0714
        L_0x070b:
            java.lang.Class<X.8Tx> r2 = X.C174348Tx.class
            java.lang.String r1 = "%s: Worker has nothing to run"
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x0730 }
            X.C161577py.A02(r2, r0, r1)     // Catch:{ all -> 0x0730 }
        L_0x0714:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A05
            int r3 = r0.decrementAndGet()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0724
            r6.A00()
            return
        L_0x0724:
            java.lang.Class<X.8Tx> r2 = X.C174348Tx.class
            java.lang.String r1 = r6.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.C161577py.A01(r2, r1, r0, r5)
            return
        L_0x0730:
            r4 = move-exception
            java.lang.Object r1 = r3.A00
            X.8Tx r1 = (X.C174348Tx) r1
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A05
            int r3 = r0.decrementAndGet()
            java.util.concurrent.BlockingQueue r0 = r1.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0747
            r1.A00()
            throw r4
        L_0x0747:
            java.lang.Class<X.8Tx> r2 = X.C174348Tx.class
            java.lang.String r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.C161577py.A01(r2, r1, r0, r5)
            throw r4
        L_0x0753:
            java.lang.Object r5 = r3.A00
            X.82h r5 = (X.C1677282h) r5
            monitor-enter(r5)
            r0 = 0
            r5.A05 = r0     // Catch:{ all -> 0x0786 }
            X.8qV r0 = r5.A06     // Catch:{ all -> 0x0786 }
            long r3 = r0.now()     // Catch:{ all -> 0x0786 }
            long r0 = r5.A00     // Catch:{ all -> 0x0786 }
            long r3 = r3 - r0
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0781
            X.82i r1 = r5.A04     // Catch:{ all -> 0x0786 }
            if (r1 == 0) goto L_0x0779
            boolean r0 = r1.A0E     // Catch:{ all -> 0x0786 }
            if (r0 == 0) goto L_0x077b
            X.8tM r0 = r1.A0A     // Catch:{ all -> 0x0786 }
            if (r0 == 0) goto L_0x0779
            r0.Bcl()     // Catch:{ all -> 0x0786 }
        L_0x0779:
            monitor-exit(r5)     // Catch:{ all -> 0x0786 }
            goto L_0x0785
        L_0x077b:
            X.8ut r0 = r1.A09     // Catch:{ all -> 0x0786 }
            r0.clear()     // Catch:{ all -> 0x0786 }
            goto L_0x0779
        L_0x0781:
            r5.A00()     // Catch:{ all -> 0x0786 }
            goto L_0x0779
        L_0x0785:
            return
        L_0x0786:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0786 }
            throw r0
        L_0x0789:
            java.lang.Object r1 = r3.A00
            X.6D4 r1 = (X.AnonymousClass6D4) r1
            java.lang.Runnable r0 = r1.A0C
            r1.unscheduleSelf(r0)
            r1.invalidateSelf()
            return
        L_0x0796:
            java.lang.Object r0 = r3.A00
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.unscheduleSelf(r3)
            r0.invalidateSelf()
            return
        L_0x07a1:
            java.lang.Object r1 = r3.A00
            X.3cT r1 = (X.C71663cT) r1
            r1.run()
            java.lang.Class<X.7p5> r9 = X.C161147p5.class
            monitor-enter(r9)
            java.util.List r0 = X.C161147p5.A01     // Catch:{ all -> 0x0a93 }
            r0.remove(r1)     // Catch:{ all -> 0x0a93 }
            monitor-exit(r9)
            return
        L_0x07b2:
            java.lang.Object r0 = r3.A00
            X.6Nw r0 = (X.C126436Nw) r0
            X.85L r0 = r0.A00
            r0.BRg()
            return
        L_0x07bc:
            java.lang.Object r3 = r3.A00
            X.7Py r3 = (X.C150267Py) r3
            android.os.MessageQueue r2 = android.os.Looper.myQueue()
            r1 = 0
            X.92A r0 = new X.92A
            r0.<init>(r3, r1)
            r2.addIdleHandler(r0)
            return
        L_0x07ce:
            java.lang.Object r0 = r3.A00
            X.7kG r0 = (X.C158607kG) r0
            r0.A02()
            return
        L_0x07d6:
            java.lang.Object r0 = r3.A00
            X.87m r0 = (X.C1689787m) r0
            r0.A04()
            return
        L_0x07de:
            java.lang.Object r5 = r3.A00
            X.8hH r5 = (X.C178278hH) r5
            X.87m r5 = (X.C1689787m) r5
            X.86t[] r4 = r5.A0L
            int r3 = r4.length
            r2 = 0
        L_0x07e8:
            if (r2 >= r3) goto L_0x07fc
            r1 = r4[r2]
            r0 = 1
            r1.A04(r0)
            X.8gt r0 = r1.A0C
            if (r0 == 0) goto L_0x07f9
            r0 = 0
            r1.A0C = r0
            r1.A08 = r0
        L_0x07f9:
            int r2 = r2 + 1
            goto L_0x07e8
        L_0x07fc:
            X.8h3 r2 = r5.A0S
            X.882 r2 = (X.AnonymousClass882) r2
            X.8tT r1 = r2.A00
            r0 = 0
            if (r1 == 0) goto L_0x0807
            r2.A00 = r0
        L_0x0807:
            r2.A01 = r0
            return
        L_0x080a:
            java.lang.Object r0 = r3.A00
            X.89A r0 = (X.AnonymousClass89A) r0
            r0.A01()
            return
        L_0x0812:
            java.lang.Object r0 = r3.A00
            X.7BN r0 = (X.AnonymousClass7BN) r0
            X.89A r0 = r0.A00
            X.8xe r2 = r0.A04
            java.lang.String r1 = X.AnonymousClass000.A0O(r2)
            java.lang.String r0 = " disconnecting because it was signed out."
            java.lang.String r0 = r1.concat(r0)
            r2.B1m(r0)
            return
        L_0x0828:
            java.lang.Object r0 = r3.A00
            X.6YT r0 = (X.AnonymousClass6YT) r0
            X.8ln r2 = r0.A00
            r1 = 4
            X.6Tp r0 = new X.6Tp
            r0.<init>(r1)
            r2.Bt1(r0)
            return
        L_0x0838:
            java.lang.Object r0 = r3.A00
            X.89g r0 = (X.C1694289g) r0
            java.util.concurrent.locks.Lock r1 = r0.A0D
            r1.lock()
            X.C1694289g.A00(r0)     // Catch:{ all -> 0x0848 }
            r1.unlock()
            return
        L_0x0848:
            r0 = move-exception
            r1.unlock()
            throw r0
        L_0x084d:
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r3.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0859:
            java.lang.Object r4 = r3.A00
            X.7je r4 = (X.C158237je) r4
            java.lang.Object r3 = r4.A0A
            monitor-enter(r3)
            boolean r0 = r4.A01()     // Catch:{ all -> 0x089c }
            if (r0 == 0) goto L_0x089a
            java.lang.String r2 = "WakeLock"
            java.lang.String r0 = r4.A0B     // Catch:{ all -> 0x089c }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x089c }
            java.lang.String r0 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            X.AnonymousClass6C9.A14(r1, r0, r2)     // Catch:{ all -> 0x089c }
            java.util.Set r2 = r4.A0D     // Catch:{ all -> 0x089c }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x089c }
            if (r0 != 0) goto L_0x088e
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r2)     // Catch:{ all -> 0x089c }
            r2.clear()     // Catch:{ all -> 0x089c }
            int r0 = r1.size()     // Catch:{ all -> 0x089c }
            if (r0 <= 0) goto L_0x088e
            r0 = 0
            r1.get(r0)     // Catch:{ all -> 0x089c }
            r0 = 0
            throw r0     // Catch:{ all -> 0x089c }
        L_0x088e:
            boolean r0 = r4.A01()     // Catch:{ all -> 0x089c }
            if (r0 == 0) goto L_0x089a
            r0 = 1
            r4.A00 = r0     // Catch:{ all -> 0x089c }
            r4.A00()     // Catch:{ all -> 0x089c }
        L_0x089a:
            monitor-exit(r3)     // Catch:{ all -> 0x089c }
            return
        L_0x089c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x089c }
            throw r0
        L_0x089f:
            java.lang.Object r0 = r3.A00
            X.8BY r0 = (X.AnonymousClass8BY) r0
            java.lang.Object r1 = r0.A01
            monitor-enter(r1)
            X.8mE r0 = r0.A00     // Catch:{ all -> 0x08ad }
            r0.BOR()     // Catch:{ all -> 0x08ad }
            monitor-exit(r1)     // Catch:{ all -> 0x08ad }
            return
        L_0x08ad:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x08ad }
            throw r0
        L_0x08b0:
            java.lang.Object r2 = r3.A00
            android.view.View r2 = (android.view.View) r2
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r0 = 1
            r1.showSoftInput(r2, r0)
            return
        L_0x08c5:
            java.lang.Object r1 = r3.A00
            X.7l7 r1 = (X.C159097l7) r1
            r0 = 3
            r1.A09(r0)
            return
        L_0x08ce:
            java.lang.Object r1 = r3.A00
            X.6ZQ r1 = (X.AnonymousClass6ZQ) r1
            r0 = 1
            r1.A09(r0)
            return
        L_0x08d7:
            java.lang.Object r1 = r3.A00
            X.6ZR r1 = (X.AnonymousClass6ZR) r1
            android.widget.AutoCompleteTextView r0 = r1.A04
            boolean r0 = r0.isPopupShowing()
            r1.A0A(r0)
            r1.A05 = r0
            return
        L_0x08e7:
            java.lang.Object r0 = r3.A00
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            X.6Ff r0 = r0.A17
            com.google.android.material.internal.CheckableImageButton r0 = r0.A0H
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        L_0x08f6:
            java.lang.Object r0 = r3.A00
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            android.widget.EditText r0 = r0.A0b
            r0.requestLayout()
            return
        L_0x0900:
            java.lang.Object r0 = r3.A00
            X.4Ss r0 = (X.C87454Ss) r0
            r0.A05()
            return
        L_0x0908:
            java.lang.Object r0 = r3.A00
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            X.7Bd r0 = (X.C146667Bd) r0
            X.7U4 r1 = r0.A00
            monitor-enter(r1)
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0922 }
            if (r0 == 0) goto L_0x0920
            com.google.firebase.iid.FirebaseInstanceId r0 = r1.A05     // Catch:{ all -> 0x0922 }
            r0.A06()     // Catch:{ all -> 0x0922 }
        L_0x0920:
            monitor-exit(r1)     // Catch:{ all -> 0x0922 }
            return
        L_0x0922:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0922 }
            throw r0
        L_0x0925:
            java.lang.Object r2 = r3.A00
            X.7sh r2 = (X.C162757sh) r2
            r1 = 2
            java.lang.String r0 = "Service disconnected"
            r2.A01(r1, r0)
            return
        L_0x0930:
            java.lang.Object r2 = r3.A00
            X.7sh r2 = (X.C162757sh) r2
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0941 }
            r1 = 1
            if (r0 != r1) goto L_0x093f
            java.lang.String r0 = "Timed out while binding"
            r2.A01(r1, r0)     // Catch:{ all -> 0x0941 }
        L_0x093f:
            monitor-exit(r2)
            return
        L_0x0941:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0944:
            java.lang.Object r2 = r3.A00
            X.7UA r2 = (X.AnonymousClass7UA) r2
        L_0x0948:
            java.util.LinkedList r9 = r2.A05
            monitor-enter(r9)
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0a33 }
            if (r0 == 0) goto L_0x096b
            java.util.concurrent.atomic.AtomicInteger r5 = r2.A06     // Catch:{ all -> 0x0a33 }
            r5.incrementAndGet()     // Catch:{ all -> 0x0a33 }
            r0 = 600000(0x927c0, double:2.964394E-318)
            r9.wait(r0)     // Catch:{ InterruptedException -> 0x095d }
            goto L_0x0968
        L_0x095d:
            java.lang.String r4 = r2.A03     // Catch:{ all -> 0x0a33 }
            java.lang.String r1 = "killed worker after idle"
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0U()     // Catch:{ all -> 0x0a33 }
            X.C161157p6.A01(r4, r1, r0)     // Catch:{ all -> 0x0a33 }
        L_0x0968:
            r5.decrementAndGet()     // Catch:{ all -> 0x0a33 }
        L_0x096b:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0a33 }
            if (r0 == 0) goto L_0x0974
            monitor-exit(r9)     // Catch:{ all -> 0x0a33 }
            goto L_0x0a22
        L_0x0974:
            monitor-exit(r9)     // Catch:{ all -> 0x0a33 }
            monitor-enter(r9)
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0a30 }
            if (r0 == 0) goto L_0x097e
            monitor-exit(r9)     // Catch:{ all -> 0x0a30 }
            goto L_0x0948
        L_0x097e:
            java.util.List r0 = X.C141886wI.A00     // Catch:{ all -> 0x0a30 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0a30 }
        L_0x0984:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0a30 }
            if (r0 == 0) goto L_0x09b3
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0a30 }
            X.6wI r5 = (X.C141886wI) r5     // Catch:{ all -> 0x0a30 }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x0a30 }
        L_0x0994:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0a30 }
            if (r0 == 0) goto L_0x0984
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0a30 }
            r4.getClass()     // Catch:{ all -> 0x0a30 }
            X.7Xs r4 = (X.C152147Xs) r4     // Catch:{ all -> 0x0a30 }
            X.7bc r0 = r4.A00     // Catch:{ all -> 0x0a30 }
            X.6wI r0 = r0.A00     // Catch:{ all -> 0x0a30 }
            if (r0 != r5) goto L_0x0994
            r1.remove()     // Catch:{ all -> 0x0a30 }
        L_0x09ac:
            java.util.HashSet r1 = r2.A04     // Catch:{ all -> 0x0a30 }
            r1.add(r4)     // Catch:{ all -> 0x0a30 }
            monitor-exit(r9)     // Catch:{ all -> 0x0a30 }
            goto L_0x09ba
        L_0x09b3:
            java.lang.Object r4 = r9.removeFirst()     // Catch:{ all -> 0x0a30 }
            X.7Xs r4 = (X.C152147Xs) r4     // Catch:{ all -> 0x0a30 }
            goto L_0x09ac
        L_0x09ba:
            r8 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0a22
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.getId()
            X.7bc r6 = r4.A00
            r6.A02()     // Catch:{ all -> 0x09d7 }
            r6.A01()     // Catch:{ all -> 0x09d7 }
            monitor-enter(r9)     // Catch:{ Exception -> 0x09e1 }
            r1.remove(r4)     // Catch:{ all -> 0x09d4 }
            monitor-exit(r9)     // Catch:{ all -> 0x09d4 }
            goto L_0x0944
        L_0x09d4:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x09d4 }
            goto L_0x09e0
        L_0x09d7:
            r0 = move-exception
            monitor-enter(r9)     // Catch:{ Exception -> 0x09e1 }
            r1.remove(r4)     // Catch:{ all -> 0x09de }
        L_0x09dc:
            monitor-exit(r9)     // Catch:{ all -> 0x09de }
            goto L_0x09e0
        L_0x09de:
            r0 = move-exception
            goto L_0x09dc
        L_0x09e0:
            throw r0     // Catch:{ Exception -> 0x09e1 }
        L_0x09e1:
            r5 = move-exception
            boolean r0 = r5 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0a15
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A01
            int r0 = r1.decrementAndGet()
            if (r0 < 0) goto L_0x0a15
            r2.A01(r4, r7)
            java.lang.String r4 = r2.A03
            java.lang.String r2 = "Task failed. Remain retry %d, %s"
            java.lang.Object[] r1 = X.C18310x6.A1b(r1, r7)
            r1[r8] = r6
            boolean r0 = X.C161157p6.A00
            if (r0 == 0) goto L_0x0a08
            java.lang.String r0 = java.lang.String.format(r2, r1)
            android.util.Log.w(r4, r0, r5)
            goto L_0x0944
        L_0x0a08:
            boolean r0 = X.C161157p6.A01
            if (r0 != 0) goto L_0x0944
            java.lang.String r0 = java.lang.String.format(r2, r1)
            android.util.Log.d(r4, r0, r5)
            goto L_0x0944
        L_0x0a15:
            java.lang.String r2 = r2.A03
            java.lang.String r1 = "Task failed on fatal error or exceeded retry limit. %s"
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r6
            X.AnonymousClass6C9.A15(r1, r2, r5, r0)
            goto L_0x0944
        L_0x0a22:
            java.lang.Object r1 = r2.A02
            monitor-enter(r1)
            int r0 = r2.A00     // Catch:{ all -> 0x0a2d }
            int r0 = r0 + -1
            r2.A00 = r0     // Catch:{ all -> 0x0a2d }
            monitor-exit(r1)     // Catch:{ all -> 0x0a2d }
            return
        L_0x0a2d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0a2d }
            throw r0
        L_0x0a30:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0a30 }
            throw r0
        L_0x0a33:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0a33 }
            throw r0
        L_0x0a36:
            X.7jF r0 = r4.A0X
            r0.A00()
            X.818[] r0 = r4.A0K
            int r7 = r0.length
            X.7yz[] r6 = new X.C166617yz[r7]
            boolean[] r0 = new boolean[r7]
            r4.A0N = r0
            boolean[] r0 = new boolean[r7]
            r4.A0L = r0
            boolean[] r0 = new boolean[r7]
            r4.A0M = r0
            X.8sP r0 = r4.A07
            long r0 = r0.B7B()
            r4.A03 = r0
            r5 = 0
        L_0x0a55:
            r3 = 1
            if (r5 >= r7) goto L_0x0a96
            X.818[] r0 = r4.A0K
            r0 = r0[r5]
            X.7XN r9 = r0.A09
            monitor-enter(r9)
            boolean r0 = r9.A08     // Catch:{ all -> 0x0a93 }
            if (r0 == 0) goto L_0x0a64
            goto L_0x0a67
        L_0x0a64:
            X.7z1 r2 = r9.A07     // Catch:{ all -> 0x0a93 }
            goto L_0x0a68
        L_0x0a67:
            r2 = 0
        L_0x0a68:
            monitor-exit(r9)
            X.7z1[] r1 = new X.C166637z1[r3]
            r1[r8] = r2
            X.7yz r0 = new X.7yz
            r0.<init>(r1)
            r6[r5] = r0
            java.lang.String r1 = r2.A0S
            java.lang.String r0 = "video"
            boolean r0 = X.C162097rD.A07(r1, r0)
            if (r0 != 0) goto L_0x0a87
            java.lang.String r0 = "audio"
            boolean r0 = X.C162097rD.A07(r1, r0)
            if (r0 != 0) goto L_0x0a87
            r3 = 0
        L_0x0a87:
            boolean[] r0 = r4.A0N
            r0[r5] = r3
            boolean r0 = r4.A0A
            r3 = r3 | r0
            r4.A0A = r3
            int r5 = r5 + 1
            goto L_0x0a55
        L_0x0a93:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0a96:
            X.7yy r0 = new X.7yy
            r0.<init>(r6)
            r4.A09 = r0
            r4.A0F = r3
            X.6K0 r3 = r4.A0S
            long r1 = r4.A03
            X.8sP r0 = r4.A07
            boolean r0 = r0.BIq()
            r3.A03(r1, r0)
            X.8xA r0 = r4.A08
            r0.BYl(r4)
            return
        L_0x0ab2:
            return
        L_0x0ab3:
            r2 = move-exception
            java.lang.String r1 = "StackFrameThread"
            java.lang.String r0 = r2.getMessage()
            android.util.Log.e(r1, r0, r2)
            return
        L_0x0abe:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0abe }
            throw r0
        L_0x0ac1:
            return
        L_0x0ac2:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0ac5:
            return
        L_0x0ac6:
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r2.bottomMargin
            int r0 = r5.A02
            int r0 = r0 - r3
            int r1 = r1 + r0
            r2.bottomMargin = r1
            r4.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172668Mf.run():void");
    }

    public C172668Mf(Runnable runnable) {
        this.A01 = 30;
        this.A00 = runnable;
    }
}
