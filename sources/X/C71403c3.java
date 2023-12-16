package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3c3  reason: invalid class name and case insensitive filesystem */
public class C71403c3 implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C71403c3(C43222Rg r2, AnonymousClass4DP r3, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        this.A01 = r3;
    }

    public static void A00(AnonymousClass4FS r1, Object obj, Object obj2, String str, int i) {
        r1.BkM(new C71403c3(obj, obj2, str, i));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.3MF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.3ME} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: X.3MF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: X.3MF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: X.4Fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: X.4Fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: X.4Fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: X.4Fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: X.4Fq} */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:243|244|245|246|(2:248|359)(2:250|360)|249) */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0732, code lost:
        r2.Bh4(new X.C86444Kd(r6, r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x073a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012b, code lost:
        if (r1.A04 == null) goto L_0x012d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:245:0x0668 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0671 A[Catch:{ IOException -> 0x06f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0688 A[Catch:{ IOException -> 0x06f2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r1 = r22
            int r0 = r1.A03
            switch(r0) {
                case 0: goto L_0x023a;
                case 1: goto L_0x02b0;
                case 2: goto L_0x02fa;
                case 3: goto L_0x032e;
                case 4: goto L_0x034d;
                case 5: goto L_0x038d;
                case 6: goto L_0x039d;
                case 7: goto L_0x03ad;
                case 8: goto L_0x03ca;
                case 9: goto L_0x03ef;
                case 10: goto L_0x048c;
                case 11: goto L_0x04ec;
                case 12: goto L_0x0530;
                case 13: goto L_0x0601;
                case 14: goto L_0x005f;
                case 15: goto L_0x009e;
                case 16: goto L_0x00c2;
                case 17: goto L_0x0707;
                case 18: goto L_0x071d;
                case 19: goto L_0x0172;
                case 20: goto L_0x018b;
                case 21: goto L_0x073b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r1.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r5 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r5
            java.lang.String r13 = r1.A02
            java.lang.Object r1 = r1.A01
            X.2fU r1 = (X.C48792fU) r1
            X.2Mf r4 = r5.A01
            if (r4 == 0) goto L_0x0232
            X.3Z6 r0 = r5.A07
            if (r0 == 0) goto L_0x022d
            java.lang.Object r12 = r0.first
            java.lang.String r12 = (java.lang.String) r12
            X.43y r3 = new X.43y
            r3.<init>(r5, r1)
            X.45R r2 = new X.45R
            r2.<init>(r5, r1)
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            X.2Cd r0 = r4.A00
            X.5sx r0 = r0.A00
            X.3Db r1 = r0.A03
            X.1VX r8 = X.C64333Db.A4B(r1)
            X.2s4 r6 = X.C64333Db.A07(r1)
            X.33p r7 = X.C64333Db.A2s(r1)
            X.8qC r11 = X.C64333Db.A9V(r1)
            X.4as r0 = r0.A01
            X.4C1 r14 = r0.A4U
            X.4C1 r15 = r1.Abx
            X.28T r9 = X.C64333Db.A7R(r1)
            X.29u r10 = new X.29u
            r10.<init>()
            X.1zd r5 = new X.1zd
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = 1
            X.4Kc r0 = new X.4Kc
            r0.<init>(r3, r4, r2, r1)
            r5.Bh4(r0)
        L_0x005e:
            return
        L_0x005f:
            java.lang.Object r3 = r1.A00
            X.30F r3 = (X.AnonymousClass30F) r3
            java.lang.String r2 = r1.A02
            java.lang.Object r1 = r1.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.2qK r0 = r3.A08
            X.2i6 r8 = r0.A02(r1, r2)
            if (r8 == 0) goto L_0x005e
            long r5 = r8.A03
            X.2oU r0 = r3.A06
            android.content.Context r7 = r0.A00
            java.lang.Class<com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver> r0 = com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver.class
            android.content.Intent r4 = X.AnonymousClass0x9.A08(r7, r0)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r5 = r5 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            java.lang.String r0 = "action_schedule_call_advance_alert"
        L_0x008b:
            r4.setAction(r0)
            long r2 = r8.A02
            int r1 = (int) r2
            r0 = 1610612736(0x60000000, float:3.6893488E19)
            android.app.PendingIntent r0 = X.C624735e.A01(r7, r1, r4, r0)
            if (r0 == 0) goto L_0x005e
            goto L_0x076f
        L_0x009b:
            java.lang.String r0 = "action_schedule_call"
            goto L_0x008b
        L_0x009e:
            java.lang.Object r0 = r1.A00
            X.2MK r0 = (X.AnonymousClass2MK) r0
            java.lang.String r2 = r1.A02
            java.lang.Object r1 = r1.A01
            X.2KW r1 = (X.AnonymousClass2KW) r1
            X.5Zz r0 = r0.A00
            java.util.ArrayList r11 = r0.A04(r2)
            X.2yA r9 = r1.A00
            X.34x r8 = r1.A01
            if (r11 == 0) goto L_0x005e
            X.2z0 r1 = r8.A1J
            X.4uZ r7 = X.AnonymousClass2z0.A01(r1)
            X.3dV r0 = r9.A01
            X.4Fq r6 = r0.A04()
            goto L_0x077b
        L_0x00c2:
            java.lang.Object r4 = r1.A00
            X.5TM r4 = (X.AnonymousClass5TM) r4
            java.lang.Object r5 = r1.A01
            X.7Fh r5 = (X.C147697Fh) r5
            java.lang.String r0 = r1.A02
            X.7Ei r3 = r4.A05
            if (r3 == 0) goto L_0x005e
            int r2 = r4.A09
            java.lang.String r11 = r4.A07
            java.lang.String r6 = ""
            if (r11 != 0) goto L_0x00d9
            r11 = r6
        L_0x00d9:
            long r13 = r4.A00
            r19 = 0
            if (r5 == 0) goto L_0x0155
            long r15 = r5.A01
            int r12 = r5.A00
        L_0x00e3:
            X.7t6 r1 = r4.A02
            if (r1 == 0) goto L_0x0152
            long r17 = r1.A02()
        L_0x00eb:
            X.7t6 r1 = r4.A02
            if (r1 == 0) goto L_0x00f3
            long r19 = r1.A03()
        L_0x00f3:
            X.7n4 r9 = r4.A03
            if (r9 != 0) goto L_0x00fc
            X.7n4 r9 = new X.7n4
            r9.<init>()
        L_0x00fc:
            if (r0 == 0) goto L_0x00ff
            r6 = r0
        L_0x00ff:
            r5 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompositeHeroPlayer - onVideoCompleted() - "
            X.C18260x0.A0w(r0, r1, r2)
            X.5Xn r1 = r3.A00
            java.util.Set r0 = r1.A0D
            java.util.Iterator r7 = r0.iterator()
        L_0x0111:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0159
            java.lang.Object r3 = r7.next()
            X.7RZ r3 = (X.AnonymousClass7RZ) r3
            java.lang.String r4 = r1.A04
            java.lang.String r0 = r1.A05
            boolean r0 = X.C162457s7.A0P(r4, r0)
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = r1.A04
            r21 = 1
            if (r0 != 0) goto L_0x012f
        L_0x012d:
            r21 = 0
        L_0x012f:
            X.5KS r0 = r3.A00
            X.7kH r0 = r0.A01
            if (r0 == 0) goto L_0x0111
            android.util.LruCache r3 = r0.A06
            java.lang.Object r10 = r3.get(r6)
            X.7a3 r10 = (X.C152747a3) r10
            X.2nr r8 = new X.2nr
            r8.<init>(r9, r10, r11, r12, r13, r15, r17, r19, r21)
            java.util.Set r0 = r0.A03
            java.util.Iterator r0 = r0.iterator()
        L_0x0148:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0111
            X.C25141a2.A00(r8, r0)
            goto L_0x0148
        L_0x0152:
            r17 = 0
            goto L_0x00eb
        L_0x0155:
            r15 = 0
            r12 = 0
            goto L_0x00e3
        L_0x0159:
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x005e
            java.lang.String r3 = r1.A04
            java.lang.String r0 = r1.A05
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x07d4
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x07d4
            r0 = 0
            r1.A09 = r0
            X.C106075Xn.A00(r1)
            return
        L_0x0172:
            java.lang.Object r0 = r1.A00
            X.3Ao r0 = (X.C63763Ao) r0
            java.lang.String r2 = r1.A02
            java.lang.Object r8 = r1.A01
            byte[] r8 = (byte[]) r8
            X.3Ap r0 = r0.A00
            java.util.Map r0 = r0.A09
            java.lang.Object r4 = r0.get(r2)
            X.2i4 r4 = (X.C50372i4) r4
            if (r4 == 0) goto L_0x005e
            r3 = 0
            goto L_0x07e8
        L_0x018b:
            java.lang.Object r3 = r1.A00
            X.2vR r3 = (X.C58552vR) r3
            java.lang.Object r6 = r1.A01
            android.content.Intent r6 = (android.content.Intent) r6
            java.lang.String r5 = r1.A02
            android.content.ComponentName r4 = r6.getComponent()
            if (r4 == 0) goto L_0x01a7
            java.util.List r1 = X.C58552vR.A02
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01c0
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01c0
        L_0x01a7:
            android.net.Uri r6 = r6.getData()
            if (r6 == 0) goto L_0x005e
            java.lang.String r4 = r6.getScheme()
            if (r4 == 0) goto L_0x005e
            java.util.List r1 = X.C58552vR.A03
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01e3
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01e3
            return
        L_0x01c0:
            java.util.Iterator r2 = r1.iterator()
        L_0x01c4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r4.getPackageName()
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x01c4
            android.content.ComponentName r0 = r6.getComponent()
            if (r0 == 0) goto L_0x005e
            java.lang.String r1 = r0.getPackageName()
            goto L_0x01fc
        L_0x01e3:
            java.util.Iterator r2 = r1.iterator()
        L_0x01e7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            r0 = 1
            boolean r0 = X.C175728Zm.A0S(r4, r1, r0)
            if (r0 == 0) goto L_0x01e7
            java.lang.String r1 = r6.getScheme()
        L_0x01fc:
            if (r1 == 0) goto L_0x005e
            java.util.Map r0 = X.C58552vR.A04
            java.lang.Object r4 = r0.get(r1)
            if (r4 == 0) goto L_0x005e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cross-app intent launch detected from origin class: '"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "' to destination app: '"
            r1.append(r0)
            r1.append(r4)
            r0 = 39
            X.C18270x1.A1E(r1, r0)
            X.5Mm r3 = r3.A01
            java.lang.String r2 = "START_ACTIVITY"
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "INTENT_LAUNCH"
            r3.A00(r0, r2, r5, r1)
            return
        L_0x022d:
            java.lang.IllegalStateException r1 = X.C18290x4.A0Y()
            throw r1
        L_0x0232:
            java.lang.String r0 = "webAuthAccessTokenFetcher"
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r0)
            throw r1
        L_0x023a:
            java.lang.Object r5 = r1.A00
            X.5Jv r5 = (X.C102675Jv) r5
            java.lang.String r13 = r1.A02
            java.lang.Object r4 = r1.A01
            X.668 r4 = (X.AnonymousClass668) r4
            r3 = 1
            java.lang.String r1 = X.C627236i.A04(r13)
            if (r1 == 0) goto L_0x02ab
            java.util.Map r2 = r5.A04
            monitor-enter(r2)
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x02a8 }
            X.1g0 r0 = (X.AnonymousClass1g0) r0     // Catch:{ all -> 0x02a8 }
            if (r0 == 0) goto L_0x0259
            boolean r0 = r0.A02     // Catch:{ all -> 0x02a8 }
            goto L_0x02a4
        L_0x0259:
            X.5Ff r0 = r5.A00     // Catch:{ all -> 0x02a8 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a8 }
            X.3RI r10 = new X.3RI     // Catch:{ all -> 0x02a8 }
            r10.<init>(r4, r5, r13)     // Catch:{ all -> 0x02a8 }
            X.5sy r0 = r0.A00     // Catch:{ all -> 0x02a8 }
            X.3Db r3 = r0.A01     // Catch:{ all -> 0x02a8 }
            X.2sH r5 = X.C64333Db.A2p(r3)     // Catch:{ all -> 0x02a8 }
            X.2s4 r4 = X.C64333Db.A07(r3)     // Catch:{ all -> 0x02a8 }
            X.4C1 r0 = r3.AXI     // Catch:{ all -> 0x02a8 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x02a8 }
            X.2zf r7 = (X.C61072zf) r7     // Catch:{ all -> 0x02a8 }
            X.4C1 r0 = r3.AU2     // Catch:{ all -> 0x02a8 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x02a8 }
            X.1i8 r12 = (X.C29011i8) r12     // Catch:{ all -> 0x02a8 }
            X.2pd r9 = r3.Anb()     // Catch:{ all -> 0x02a8 }
            X.1VX r8 = X.C64333Db.A4B(r3)     // Catch:{ all -> 0x02a8 }
            X.2oU r6 = X.C64333Db.A2q(r3)     // Catch:{ all -> 0x02a8 }
            X.5Mf r11 = r3.Aps()     // Catch:{ all -> 0x02a8 }
            X.1g0 r3 = new X.1g0     // Catch:{ all -> 0x02a8 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x02a8 }
            r2.put(r1, r3)     // Catch:{ all -> 0x02a8 }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x02a8 }
            X.1g0 r0 = (X.AnonymousClass1g0) r0     // Catch:{ all -> 0x02a8 }
            if (r0 == 0) goto L_0x02a6
            r0.A02()     // Catch:{ all -> 0x02a8 }
            goto L_0x02a6
        L_0x02a4:
            if (r0 != r3) goto L_0x0259
        L_0x02a6:
            monitor-exit(r2)
            return
        L_0x02a8:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x02ab:
            java.lang.IllegalArgumentException r1 = X.C18300x5.A0X()
            throw r1
        L_0x02b0:
            java.lang.Object r5 = r1.A00
            X.5Hh r5 = (X.C102055Hh) r5
            java.lang.String r0 = r1.A02
            java.lang.Object r4 = r1.A01
            X.8p1 r4 = (X.C182808p1) r4
            java.net.URL r0 = X.C18330xA.A0B(r0)     // Catch:{ MalformedURLException -> 0x02f1 }
            java.lang.String r0 = r0.getHost()     // Catch:{ MalformedURLException -> 0x02f1 }
            if (r0 == 0) goto L_0x02f1
            X.6aY r2 = X.C129586aY.of(r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckQueryImpl$Builder r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckQueryImpl$Builder
            r0.<init>()
            X.2ie r3 = r0.A00
            java.lang.String r1 = "url_domains"
            if (r2 == 0) goto L_0x02d9
            X.13M r0 = r3.A00
            r0.A07(r1, r2)
        L_0x02d9:
            java.lang.String r2 = "NewsletterLinkPreviewCheck"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckResponseImpl> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckResponseImpl.class
            X.7J9 r1 = new X.7J9
            r1.<init>(r3, r0, r2)
            X.2gi r0 = r5.A00
            X.2fG r1 = r0.A01(r1)
            X.620 r0 = new X.620
            r0.<init>(r4)
            r1.A01(r0)
            return
        L_0x02f1:
            java.lang.String r0 = "NewsletterLinkPreviewChecker/failed to parse the url"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r4.BJi()
            return
        L_0x02fa:
            java.lang.Object r2 = r1.A00
            com.whatsapp.notification.AndroidWear r2 = (com.whatsapp.notification.AndroidWear) r2
            java.lang.Object r0 = r1.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            java.lang.String r7 = r1.A02
            X.4uZ r12 = X.AnonymousClass3ZH.A01(r0)
            X.5mB r1 = r2.A04
            r0 = 2
            r1.A06(r12, r0)
            X.33m r3 = r2.A01
            X.C626936e.A06(r12)
            java.util.List r8 = java.util.Collections.singletonList(r12)
            r4 = 0
            r10 = 0
            r6 = r4
            r9 = r4
            r5 = r4
            r11 = r10
            r3.A0C(r4, r5, r6, r7, r8, r9, r10, r11)
            X.2oD r11 = r2.A03
            r13 = 1
            r15 = r13
            r16 = r13
            r14 = r13
            r11.A01(r12, r13, r14, r15, r16)
            r2.A05(r10)
            return
        L_0x032e:
            java.lang.Object r4 = r1.A00
            com.whatsapp.notification.AndroidWear r4 = (com.whatsapp.notification.AndroidWear) r4
            java.lang.String r3 = r1.A02
            java.lang.Object r1 = r1.A01
            X.2z0 r1 = (X.AnonymousClass2z0) r1
            X.33m r2 = r4.A01
            X.2qz r0 = r2.A1o     // Catch:{ all -> 0x034b }
            X.34x r1 = r0.A05(r1)     // Catch:{ all -> 0x034b }
            if (r1 == 0) goto L_0x0346
            r0 = 0
            r2.A0a(r1, r3, r0)
        L_0x0346:
            r0 = 0
            r4.A05(r0)
            return
        L_0x034b:
            r1 = move-exception
            throw r1
        L_0x034d:
            java.lang.Object r4 = r1.A00
            X.2ce r4 = (X.C47062ce) r4
            java.lang.String r3 = r1.A02
            java.lang.Object r11 = r1.A01
            java.util.Map r11 = (java.util.Map) r11
            X.31C r2 = r4.A02     // Catch:{ 23j -> 0x037d }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A08(r0)     // Catch:{ 23j -> 0x037d }
            X.7pg r5 = r4.A03     // Catch:{ 23j -> 0x037d }
            X.C162457s7.A0H(r3)     // Catch:{ 23j -> 0x037d }
            java.lang.String r0 = "DeepLink"
            X.2lm r8 = new X.2lm     // Catch:{ 23j -> 0x037d }
            r8.<init>(r3, r0, r11)     // Catch:{ 23j -> 0x037d }
            java.lang.String r9 = "deeplink"
            r10 = 0
            r0 = 1
            X.4KR r6 = new X.4KR     // Catch:{ 23j -> 0x037d }
            r6.<init>(r4, r0)     // Catch:{ 23j -> 0x037d }
            r0 = 0
            X.357 r7 = new X.357     // Catch:{ 23j -> 0x037d }
            r7.<init>(r4, r0)     // Catch:{ 23j -> 0x037d }
            r5.A07(r6, r7, r8, r9, r10, r11)     // Catch:{ 23j -> 0x037d }
            return
        L_0x037d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.3Wi r1 = r4.A01
            r1.A0D()
            r0 = 2131893926(0x7f121ea6, float:1.9422642E38)
            r1.A0E(r0)
            return
        L_0x038d:
            java.lang.Object r0 = r1.A00
            X.3CS r0 = (X.AnonymousClass3CS) r0
            java.lang.String r2 = r1.A02
            java.lang.Object r1 = r1.A01
            byte[] r1 = (byte[]) r1
            X.2gr r0 = r0.A01
            r0.A01(r2, r1)
            return
        L_0x039d:
            java.lang.Object r0 = r1.A00
            X.37J r0 = (X.AnonymousClass37J) r0
            java.lang.Object r2 = r1.A01
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r2 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r2
            java.lang.String r1 = r1.A02
            X.37K r0 = r0.A03
            r2.onSharedPreferenceChanged(r0, r1)
            return
        L_0x03ad:
            java.lang.Object r5 = r1.A00
            X.2Rg r5 = (X.C43222Rg) r5
            java.lang.String r4 = "user"
            java.lang.Object r3 = r1.A01
            X.4DP r3 = (X.AnonymousClass4DP) r3
            X.4C1 r0 = r5.A04
            java.lang.Object r2 = r0.get()
            X.2p0 r2 = (X.C54612p0) r2
            r1 = 1
            X.2tB r0 = new X.2tB
            r0.<init>(r5, r3, r1)
            r2.A02(r0, r4)
            return
        L_0x03ca:
            java.lang.Object r3 = r1.A00
            X.2Rg r3 = (X.C43222Rg) r3
            java.lang.String r2 = "user"
            java.lang.Object r1 = r1.A01
            X.4DP r1 = (X.AnonymousClass4DP) r1
            X.4C1 r0 = r3.A02
            java.lang.Object r0 = r0.get()
            X.1ig r0 = (X.C29351ig) r0
            r0.A09(r2)
            X.4C1 r0 = r3.A04
            java.lang.Object r0 = r0.get()
            X.2p0 r0 = (X.C54612p0) r0
            r0.A01()
            r1.onSuccess()
            return
        L_0x03ef:
            java.lang.Object r4 = r1.A00
            X.1gP r4 = (X.AnonymousClass1gP) r4
            java.lang.Object r3 = r1.A01
            X.39T r3 = (X.AnonymousClass39T) r3
            java.lang.String r8 = r1.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "recvmessagelistener/on-revoke-psa stanzaKey="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; campaignId="
            X.C18260x0.A0s(r0, r8, r1)
            X.2W5 r0 = r4.A08
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            X.3dV r0 = r0.A00
            X.4GK r6 = r0.get()
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07ca }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x07ca }
            java.lang.String r2 = "SELECT message_row_id FROM message_status_psa_campaign WHERE campaign_id = ?"
            java.lang.String[] r1 = X.C18270x1.A1b(r8)     // Catch:{ all -> 0x07ca }
            java.lang.String r0 = "GET_STATUS_PSA_CAMPAIGN_FROM_CAMPAIGN_ID"
            android.database.Cursor r2 = r5.A0E(r2, r0, r1)     // Catch:{ all -> 0x07ca }
            if (r2 != 0) goto L_0x0431
            r6.close()
            r4.A04(r3)
            return
        L_0x0431:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0486 }
            if (r0 == 0) goto L_0x0442
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0486 }
            X.C18260x0.A0H(r2, r7, r0)     // Catch:{ all -> 0x0486 }
            goto L_0x0431
        L_0x0442:
            r2.close()     // Catch:{ all -> 0x07ca }
            java.util.ArrayList r6 = X.C18320x8.A0n(r6)
            java.util.Iterator r5 = r7.iterator()
        L_0x044d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x046f
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            X.2qz r2 = r4.A0E
            long r0 = r0.longValue()
            X.34x r2 = X.C55122pp.A00(r2, r0)
            if (r2 == 0) goto L_0x044d
            r6.add(r2)
            X.3Lv r1 = r4.A05
            r0 = 1
            r1.A0d(r2, r0, r0)
            goto L_0x044d
        L_0x046f:
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x0482
            X.2hU r0 = r4.A06
            android.os.Handler r1 = r0.A01
            r0 = 32
            X.3a0 r0 = X.C70133a0.A00(r4, r6, r0)
            r1.post(r0)
        L_0x0482:
            r4.A03(r3)
            return
        L_0x0486:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x07c5 }
            goto L_0x07c9
        L_0x048c:
            java.lang.Object r4 = r1.A00
            X.317 r4 = (X.AnonymousClass317) r4
            java.lang.String r0 = r1.A02
            java.lang.Object r6 = r1.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r0)
            int r7 = r0.length()
            r8 = 2
            int r1 = r7 / r8
            r0 = 45
            r2.insert(r1, r0)
            java.lang.String r0 = "‪"
            r5 = 0
            r2.insert(r5, r0)
            java.lang.String r0 = "‬"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r2)
            X.1VX r2 = r4.A0m
            r1 = 3159(0xc57, float:4.427E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r2 = 1
            if (r0 == 0) goto L_0x04df
            r0 = 2131894942(0x7f12229e, float:1.9424703E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r6, r3, r2, r0)
        L_0x04c8:
            X.33T r2 = r4.A0b
            r0 = 2131894939(0x7f12229b, float:1.9424697E38)
            java.lang.String r0 = r6.getString(r0)
            X.0Ue r0 = r4.A02(r0, r1, r1)
            android.app.Notification r1 = r0.A01()
            r0 = 53
            r2.A04(r0, r1)
            return
        L_0x04df:
            r1 = 2131894941(0x7f12229d, float:1.94247E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            X.AnonymousClass000.A1P(r0, r7, r5)
            java.lang.String r1 = X.AnonymousClass002.A0F(r6, r3, r0, r2, r1)
            goto L_0x04c8
        L_0x04ec:
            java.lang.Object r5 = r1.A00
            X.317 r5 = (X.AnonymousClass317) r5
            java.lang.String r3 = r1.A02
            java.lang.Object r2 = r1.A01
            X.3Wi r0 = r5.A0H
            X.4FU r4 = r0.A00
            if (r4 == 0) goto L_0x0523
            boolean r0 = r4.BHW()
            if (r0 != 0) goto L_0x0523
            boolean r0 = r4 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0523
            java.lang.String r0 = "RegistrationManager/showVerificationCodeBottomSheetOrNotify/showing sheet for WAOldRegistrationNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.VerificationCodeBottomSheet r3 = com.whatsapp.registration.VerificationCodeBottomSheet.A00(r3)
            X.1VX r2 = r5.A0m
            r1 = 3159(0xc57, float:4.427E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x051f
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r3)
            r5.A00 = r0
        L_0x051f:
            r4.Boo(r3)
            return
        L_0x0523:
            java.lang.String r0 = "RegistrationManager/showVerificationCodeBottomSheetOrNotify/Couldn't show UI for WAOldRegistrationNotification - showing system notification instead"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r1 = r5.A0z
            r0 = 10
            A00(r1, r5, r2, r3, r0)
            return
        L_0x0530:
            java.lang.Object r5 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r5 = (com.whatsapp.registration.VerifyPhoneNumber) r5
            java.lang.Object r2 = r1.A01
            android.net.Network r2 = (android.net.Network) r2
            java.lang.String r1 = r1.A02
            java.lang.String r3 = "silent_auth_failed"
            if (r2 != 0) goto L_0x0540
            goto L_0x055c
        L_0x0540:
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/attempt request on cellular"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x05e5 }
            java.net.URL r0 = X.C18330xA.A0B(r1)     // Catch:{ IOException -> 0x05e5 }
            java.net.URLConnection r1 = r2.openConnection(r0)     // Catch:{ IOException -> 0x05e5 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x05e5 }
            X.C18270x1.A1J(r1)     // Catch:{ IOException -> 0x05e5 }
            r1.connect()     // Catch:{ IOException -> 0x05e5 }
            r0 = 0
            X.3PZ r4 = new X.3PZ     // Catch:{ IOException -> 0x05e5 }
            r4.<init>(r0, r1)     // Catch:{ IOException -> 0x05e5 }
            goto L_0x0567
        L_0x055c:
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/already on cellular"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x05e5 }
            X.33K r0 = r5.A0l     // Catch:{ IOException -> 0x05e5 }
            X.4GL r4 = r0.A03(r1)     // Catch:{ IOException -> 0x05e5 }
        L_0x0567:
            r0 = r4
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ IOException -> 0x05e5 }
            java.net.HttpURLConnection r2 = r0.A01     // Catch:{ IOException -> 0x05e5 }
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x05e5 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x05cf
            X.2s4 r2 = r5.A0V     // Catch:{ JSONException -> 0x05bf }
            java.lang.Integer r1 = X.AnonymousClass0x7.A0h()     // Catch:{ JSONException -> 0x05bf }
            r0 = 0
            java.io.InputStream r0 = r4.B47(r2, r0, r1)     // Catch:{ JSONException -> 0x05bf }
            org.json.JSONObject r1 = X.C624535b.A02(r0)     // Catch:{ JSONException -> 0x05bf }
            java.lang.String r0 = "available"
            boolean r0 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x05bf }
            if (r0 == 0) goto L_0x05b1
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/available"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ JSONException -> 0x05bf }
            X.33p r1 = r5.A09     // Catch:{ JSONException -> 0x05bf }
            java.lang.String r0 = "silent_auth_available"
            r1.A1X(r0)     // Catch:{ JSONException -> 0x05bf }
            r12 = 0
            java.lang.String r7 = r5.A1B     // Catch:{ JSONException -> 0x05bf }
            java.lang.String r8 = r5.A1E     // Catch:{ JSONException -> 0x05bf }
            java.lang.String r9 = "silent_auth"
            r10 = 0
            X.33p r0 = r5.A09     // Catch:{ JSONException -> 0x05bf }
            int r0 = r0.A0F()     // Catch:{ JSONException -> 0x05bf }
            X.4z5 r6 = new X.4z5     // Catch:{ JSONException -> 0x05bf }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x05bf }
            r11 = r10
            r5.A7r(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ JSONException -> 0x05bf }
            return
        L_0x05b1:
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/not available"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ JSONException -> 0x05bf }
            X.33p r1 = r5.A09     // Catch:{ JSONException -> 0x05bf }
            java.lang.String r0 = "silent_auth_unavailable"
            r1.A1X(r0)     // Catch:{ JSONException -> 0x05bf }
            goto L_0x05f4
        L_0x05bf:
            r2 = move-exception
            X.33p r0 = r5.A09     // Catch:{ IOException -> 0x05e5 }
            r0.A1X(r3)     // Catch:{ IOException -> 0x05e5 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x05e5 }
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/getJSONFromStream/JSONException: "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ IOException -> 0x05e5 }
            goto L_0x05f4
        L_0x05cf:
            X.33p r0 = r5.A09     // Catch:{ IOException -> 0x05e5 }
            r0.A1X(r3)     // Catch:{ IOException -> 0x05e5 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x05e5 }
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/returned code: "
            r1.append(r0)     // Catch:{ IOException -> 0x05e5 }
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x05e5 }
            X.C18270x1.A1F(r1, r0)     // Catch:{ IOException -> 0x05e5 }
            goto L_0x05f4
        L_0x05e5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/IOException : "
            X.C18260x0.A1Q(r1, r0, r2)
            X.33p r0 = r5.A09
            r0.A1X(r3)
        L_0x05f4:
            X.3Wi r2 = r5.A05
            r1 = 13
            X.3cH r0 = new X.3cH
            r0.<init>((com.whatsapp.registration.VerifyPhoneNumber) r5, (int) r1)
            r2.A0S(r0)
            return
        L_0x0601:
            java.lang.Object r10 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r10 = (com.whatsapp.registration.VerifyPhoneNumber) r10
            java.lang.Object r7 = r1.A01
            android.net.Network r7 = (android.net.Network) r7
            java.lang.String r2 = r1.A02
            java.lang.String r3 = "silent_auth_redirect_url_failed"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x06f2 }
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthUsingCarrierApi/network is null : "
            r1.append(r0)     // Catch:{ IOException -> 0x06f2 }
            boolean r0 = X.AnonymousClass000.A1X(r7)
            X.C18260x0.A1V(r1, r0)     // Catch:{ IOException -> 0x06f2 }
            X.33K r8 = r10.A0l     // Catch:{ IOException -> 0x06f2 }
            java.lang.String r6 = X.C58172up.A09     // Catch:{ IOException -> 0x06f2 }
            java.net.URL r0 = X.C18330xA.A0B(r2)     // Catch:{ IOException -> 0x06f2 }
            if (r7 != 0) goto L_0x068d
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ IOException -> 0x06f2 }
        L_0x062c:
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x06f2 }
            r0 = 0
            r5.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x06f2 }
            X.C18270x1.A1J(r5)     // Catch:{ IOException -> 0x06f2 }
            r5.connect()     // Catch:{ IOException -> 0x06f2 }
            int r0 = r5.getResponseCode()     // Catch:{ IOException -> 0x06f2 }
            r4 = 0
        L_0x063d:
            int r1 = r0 / 100
            r0 = 3
            if (r1 != r0) goto L_0x0692
            r0 = 10
            if (r4 >= r0) goto L_0x0692
            java.lang.String r0 = "Location"
            java.lang.String r9 = r5.getHeaderField(r0)     // Catch:{ IOException -> 0x06f2 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x06f2 }
            if (r0 != 0) goto L_0x0692
            boolean r0 = r9.matches(r6)     // Catch:{ IOException -> 0x06f2 }
            if (r0 != 0) goto L_0x0692
            X.2s4 r2 = r8.A00     // Catch:{ IOException -> 0x0668 }
            r0 = 23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0668 }
            r0 = 0
            X.1zz r0 = X.C36851zz.A00(r2, r0, r1, r5)     // Catch:{ IOException -> 0x0668 }
            X.C624535b.A03(r0)     // Catch:{ IOException -> 0x0668 }
        L_0x0668:
            r5.disconnect()     // Catch:{ IOException -> 0x06f2 }
            java.net.URL r0 = X.C18330xA.A0B(r9)     // Catch:{ IOException -> 0x06f2 }
            if (r7 != 0) goto L_0x0688
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ IOException -> 0x06f2 }
        L_0x0675:
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x06f2 }
            r0 = 0
            r5.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x06f2 }
            X.C18270x1.A1J(r5)     // Catch:{ IOException -> 0x06f2 }
            r5.connect()     // Catch:{ IOException -> 0x06f2 }
            int r0 = r5.getResponseCode()     // Catch:{ IOException -> 0x06f2 }
            int r4 = r4 + 1
            goto L_0x063d
        L_0x0688:
            java.net.URLConnection r5 = r7.openConnection(r0)     // Catch:{ IOException -> 0x06f2 }
            goto L_0x0675
        L_0x068d:
            java.net.URLConnection r5 = r7.openConnection(r0)     // Catch:{ IOException -> 0x06f2 }
            goto L_0x062c
        L_0x0692:
            r4 = 0
            X.3PZ r2 = new X.3PZ     // Catch:{ IOException -> 0x06f2 }
            r2.<init>(r4, r5)     // Catch:{ IOException -> 0x06f2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x06f2 }
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthUsingCarrierApi/returned code : "
            r1.append(r0)     // Catch:{ IOException -> 0x06f2 }
            java.net.HttpURLConnection r2 = r2.A01     // Catch:{ IOException -> 0x06f2 }
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x06f2 }
            X.C18260x0.A1G(r1, r0)     // Catch:{ IOException -> 0x06f2 }
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x06f2 }
            int r1 = r0 / 100
            r0 = 3
            if (r1 != r0) goto L_0x0701
            java.lang.String r0 = "Location"
            java.lang.String r2 = r2.getHeaderField(r0)     // Catch:{ IOException -> 0x06f2 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x06f2 }
            if (r0 != 0) goto L_0x06e7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x06f2 }
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthUsingCarrierApi/redirectUrl : "
            X.C18260x0.A0q(r0, r2, r1)     // Catch:{ IOException -> 0x06f2 }
            byte[] r0 = r2.getBytes()     // Catch:{ IOException -> 0x06f2 }
            r1 = 2
            java.lang.String r12 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ IOException -> 0x06f2 }
            java.lang.String r13 = r10.A1B     // Catch:{ IOException -> 0x06f2 }
            java.lang.String r14 = r10.A1E     // Catch:{ IOException -> 0x06f2 }
            java.lang.String r15 = "silent_auth"
            X.5rC r0 = r10.A0O     // Catch:{ IOException -> 0x06f2 }
            X.AnonymousClass5VK.A00(r0)     // Catch:{ IOException -> 0x06f2 }
            X.4z4 r11 = r10.A12     // Catch:{ IOException -> 0x06f2 }
            r16 = r4
            r17 = r1
            r10.A7t(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x06f2 }
            return
        L_0x06e7:
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthUsingCarrierApi/redirectUrl is null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x06f2 }
            X.33p r0 = r10.A09     // Catch:{ IOException -> 0x06f2 }
            r0.A1X(r3)     // Catch:{ IOException -> 0x06f2 }
            goto L_0x0701
        L_0x06f2:
            r2 = move-exception
            X.33p r0 = r10.A09
            r0.A1X(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthUsingCarrierApi/IOException : "
            X.C18260x0.A1Q(r1, r0, r2)
        L_0x0701:
            int r0 = r10.A04
            r10.A7U(r0)
            return
        L_0x0707:
            java.lang.Object r6 = r1.A00
            X.3ME r6 = (X.AnonymousClass3ME) r6
            java.lang.Object r5 = r1.A01
            java.lang.String r4 = r1.A02
            X.2wH r3 = r6.A01
            java.lang.String r2 = r6.A0C
            java.lang.String r1 = r6.A0B
            java.lang.String r0 = r6.A0A
            X.1de r2 = r3.A01(r2, r1, r0, r4)
            r1 = 5
            goto L_0x0732
        L_0x071d:
            java.lang.Object r6 = r1.A00
            X.3MF r6 = (X.AnonymousClass3MF) r6
            java.lang.Object r5 = r1.A01
            java.lang.String r4 = r1.A02
            X.2wH r3 = r6.A01
            java.lang.String r2 = r6.A0F
            java.lang.String r1 = r6.A0E
            java.lang.String r0 = r6.A0D
            X.1de r2 = r3.A01(r2, r1, r0, r4)
            r1 = 6
        L_0x0732:
            X.4Kd r0 = new X.4Kd
            r0.<init>(r6, r1, r5)
            r2.Bh4(r0)
            return
        L_0x073b:
            java.lang.String r2 = r1.A02
            java.lang.Object r4 = r1.A00
            X.4ea r4 = (X.C89654ea) r4
            java.lang.Object r3 = r1.A01
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            java.net.URL r0 = X.C18330xA.A0B(r2)     // Catch:{ MalformedURLException -> 0x0768, IOException -> 0x0764 }
            java.io.InputStream r0 = r0.openStream()     // Catch:{ MalformedURLException -> 0x0768, IOException -> 0x0764 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ MalformedURLException -> 0x0768, IOException -> 0x0764 }
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ MalformedURLException -> 0x0768, IOException -> 0x0764 }
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable     // Catch:{ MalformedURLException -> 0x0768, IOException -> 0x0764 }
            r2.<init>(r0, r1)     // Catch:{ MalformedURLException -> 0x0768, IOException -> 0x0764 }
            X.3Wi r1 = r4.A05     // Catch:{ MalformedURLException -> 0x0768, IOException -> 0x0764 }
            r0 = 48
            X.C69263Wi.A06(r1, r3, r2, r0)     // Catch:{ MalformedURLException -> 0x0768, IOException -> 0x0764 }
            return
        L_0x0764:
            r1 = move-exception
            java.lang.String r0 = "AccountLinkingNativeAuthActivity/initProfilePic Unable to download profile pic"
            goto L_0x076b
        L_0x0768:
            r1 = move-exception
            java.lang.String r0 = "AccountLinkingNativeAuthActivity/initProfilePic Invalid pic url"
        L_0x076b:
            X.C106245Ye.A02(r0, r1)
            return
        L_0x076f:
            r0.send()     // Catch:{ CanceledException -> 0x0773 }
            goto L_0x077a
        L_0x0773:
            r1 = move-exception
            java.lang.String r0 = "ScheduleCallManager/triggerScheduledCallReminderIfExists "
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x077a:
            return
        L_0x077b:
            X.3Yo r10 = r6.Axl()     // Catch:{ all -> 0x07ca }
            X.2qz r0 = r9.A04     // Catch:{ all -> 0x07c0 }
            X.34x r0 = r0.A05(r1)     // Catch:{ all -> 0x07c0 }
            if (r0 == 0) goto L_0x07b6
            boolean r0 = r0.A1N     // Catch:{ all -> 0x07c0 }
            if (r0 != 0) goto L_0x07b6
            r5 = 0
        L_0x078c:
            int r0 = r11.size()     // Catch:{ all -> 0x07c0 }
            if (r5 >= r0) goto L_0x07b6
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x07c0 }
            java.lang.String r2 = "chat_row_id"
            X.2sm r0 = r9.A00     // Catch:{ all -> 0x07c0 }
            long r0 = r0.A07(r7)     // Catch:{ all -> 0x07c0 }
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x07c0 }
            X.C624134x.A0H(r4, r8)     // Catch:{ all -> 0x07c0 }
            java.lang.String r0 = "link_index"
            X.2sg r3 = X.AnonymousClass3H0.A01(r4, r6, r0, r5)     // Catch:{ all -> 0x07c0 }
            java.lang.String r2 = "message_link"
            r1 = 4
            java.lang.String r0 = "INSERT_MESSAGE_LINK_TABLE"
            r3.A0C(r2, r0, r4, r1)     // Catch:{ all -> 0x07c0 }
            int r5 = r5 + 1
            goto L_0x078c
        L_0x07b6:
            r10.A00()     // Catch:{ all -> 0x07c0 }
            r10.close()     // Catch:{ all -> 0x07ca }
            r6.close()
            return
        L_0x07c0:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x07c5 }
            goto L_0x07c9
        L_0x07c5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07ca }
        L_0x07c9:
            throw r1     // Catch:{ all -> 0x07ca }
        L_0x07ca:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x07cf }
            throw r1
        L_0x07cf:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x07d4:
            r1.A09 = r5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompositeHeroPlayer - onVideoComplete() - "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " finished playback but next video is not yet prepared"
            X.C18260x0.A1J(r1, r0)
            return
        L_0x07e8:
            int r7 = r8.length     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            long r5 = r4.A00     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            long r0 = (long) r7     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            long r5 = r5 + r0
            r4.A00 = r5     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            r5 = 0
        L_0x07f0:
            if (r5 >= r7) goto L_0x0802
            java.io.BufferedOutputStream r2 = r4.A06     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            int r1 = r7 - r5
            r0 = 10240(0x2800, float:1.4349E-41)
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            r2.write(r8, r5, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            int r5 = r5 + 10240
            goto L_0x07f0
        L_0x0802:
            com.facebook.msys.mci.NetworkSession r8 = r4.A03     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            X.6Mo r0 = new X.6Mo     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            r0.<init>(r4, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            r7 = 3
            com.facebook.msys.mci.Execution.executeAsync(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            long r5 = r4.A00     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            long r1 = r4.A01     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x081e
            X.6Mn r0 = new X.6Mn     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            com.facebook.msys.mci.Execution.executeAsync(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
            return
        L_0x081e:
            java.io.ByteArrayOutputStream r9 = X.AnonymousClass0x9.A0e()     // Catch:{ IndexOutOfBoundsException -> 0x086e, IllegalArgumentException -> 0x086c, IOException -> 0x086a }
            r4.A00()     // Catch:{ all -> 0x0860 }
            X.3Ap r7 = r4.A08     // Catch:{ all -> 0x0860 }
            com.facebook.msys.mci.DataTask r0 = r4.A02     // Catch:{ all -> 0x0860 }
            java.lang.String r10 = r0.mTaskIdentifier     // Catch:{ all -> 0x0860 }
            java.net.HttpURLConnection r11 = r4.A07     // Catch:{ all -> 0x0860 }
            r12 = 1
            r7.A02(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0860 }
            com.facebook.msys.mci.UrlRequest r5 = r4.A04     // Catch:{ all -> 0x0860 }
            int r1 = r11.getResponseCode()     // Catch:{ all -> 0x0860 }
            java.util.Map r0 = r11.getHeaderFields()     // Catch:{ all -> 0x0860 }
            java.util.Map r0 = com.facebook.msys.mci.NetworkUtils.flattenHeaders((java.util.Map) r0)     // Catch:{ all -> 0x0860 }
            com.facebook.msys.mci.UrlResponse r2 = new com.facebook.msys.mci.UrlResponse     // Catch:{ all -> 0x0860 }
            r2.<init>(r5, r1, r0)     // Catch:{ all -> 0x0860 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0860 }
            java.lang.String r0 = "wa-msys/NetworkSession: Finish MSys system handleUpdateStreamingTask, "
            r1.append(r0)     // Catch:{ all -> 0x0860 }
            int r0 = r11.getResponseCode()     // Catch:{ all -> 0x0860 }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x0860 }
            byte[] r0 = r9.toByteArray()     // Catch:{ all -> 0x0860 }
            r4.A01(r2, r3, r0)     // Catch:{ all -> 0x0860 }
            r9.close()     // Catch:{ IndexOutOfBoundsException -> 0x086e, IllegalArgumentException -> 0x086c, IOException -> 0x086a }
            return
        L_0x0860:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0865 }
            goto L_0x0869
        L_0x0865:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IndexOutOfBoundsException -> 0x086e, IllegalArgumentException -> 0x086c, IOException -> 0x086a }
        L_0x0869:
            throw r1     // Catch:{ IndexOutOfBoundsException -> 0x086e, IllegalArgumentException -> 0x086c, IOException -> 0x086a }
        L_0x086a:
            r0 = move-exception
            goto L_0x086f
        L_0x086c:
            r0 = move-exception
            goto L_0x086f
        L_0x086e:
            r0 = move-exception
        L_0x086f:
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0872, IllegalArgumentException -> 0x0870, IOException -> 0x0874 }
        L_0x0870:
            r2 = move-exception
            goto L_0x0875
        L_0x0872:
            r2 = move-exception
            goto L_0x0875
        L_0x0874:
            r2 = move-exception
        L_0x0875:
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleUpdateStreamingTask"
            com.whatsapp.util.Log.e(r0, r2)
            com.facebook.msys.mci.UrlRequest r0 = r4.A04
            com.facebook.msys.mci.UrlResponse r1 = com.facebook.msys.mci.NetworkUtils.newErrorURLResponse(r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            r4.A01(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71403c3.run():void");
    }

    public C71403c3(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }
}
