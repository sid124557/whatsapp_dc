package X;

/* renamed from: X.3aY  reason: invalid class name and case insensitive filesystem */
public class C70473aY implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C70473aY(Object obj, Object obj2, String str, int i, int i2) {
        this.A04 = i2;
        this.A00 = i;
        this.A03 = str;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.1YZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.1Y3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: X.1YZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: X.1YZ} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0371, code lost:
        r4.A0S(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0374, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03d6, code lost:
        r0.BhD(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x032e, code lost:
        if (r2 != 4) goto L_0x0326;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A04
            switch(r0) {
                case 0: goto L_0x0270;
                case 1: goto L_0x0291;
                case 2: goto L_0x02a1;
                case 3: goto L_0x02b1;
                case 4: goto L_0x0331;
                case 5: goto L_0x034f;
                case 6: goto L_0x0375;
                case 7: goto L_0x0387;
                case 8: goto L_0x03b3;
                case 9: goto L_0x03da;
                case 10: goto L_0x0022;
                case 11: goto L_0x0454;
                case 12: goto L_0x048f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r14.A01
            X.2Tm r4 = (X.C43792Tm) r4
            java.lang.Object r3 = r14.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r2 = r14.A03
            int r1 = r14.A00
            X.3Wi r0 = r4.A00
            X.4FU r0 = r0.A00
            if (r0 != 0) goto L_0x025c
            java.lang.String r0 = "banmanager/startPermanentBanFlow/showLoginFailureNotificationIfNeeded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.317 r0 = r4.A07
            r0.A0A()
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r4 = r14.A01
            X.2sF r4 = (X.C56592sF) r4
            java.lang.String r5 = r14.A03
            int r2 = r14.A00
            java.lang.Object r3 = r14.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            int r1 = r4.A00
            r0 = -1
            if (r1 == r0) goto L_0x023a
            long r12 = android.os.SystemClock.elapsedRealtime()
            X.2vb r6 = r4.A0K
            long r0 = r6.A00
            long r12 = r12 - r0
            long r10 = android.os.SystemClock.uptimeMillis()
            long r0 = r6.A01
            long r10 = r10 - r0
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0080
            java.lang.Long r0 = r4.A07
            if (r0 == 0) goto L_0x006c
            r0 = 4
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>(r0)
            java.lang.String r1 = "from"
            java.lang.String r0 = r4.A08
            r7.put(r1, r0)
            java.lang.String r0 = "to"
            r7.put(r0, r5)
            X.2fN r6 = r4.A05
            java.lang.Long r1 = r4.A07
            int r0 = r4.A00
            r6.A01(r1, r7, r0)
            X.2g6 r0 = r4.A04
            r0.A00()
        L_0x006c:
            int r0 = r4.A00
            X.C159837mX.A00(r0)
            X.2oU r0 = r4.A0F
            android.content.Context r7 = r0.A00
            java.lang.Class<com.whatsapp.perf.profilo.ProfiloUploadService> r6 = com.whatsapp.perf.profilo.ProfiloUploadService.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r7, r6)
            r0 = 8
            X.AnonymousClass00W.A00(r7, r1, r6, r0)
        L_0x0080:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "startuptracker/startup completed/"
            r1.append(r0)
            java.lang.String r0 = r4.A08
            r1.append(r0)
            java.lang.String r0 = "/"
            X.C18260x0.A0q(r0, r5, r1)
            java.lang.Integer r0 = r4.A06
            if (r0 == 0) goto L_0x01a9
            X.2zT r6 = r4.A0H
            X.2n6 r5 = r6.A02()
            java.lang.Integer r0 = r4.A06
            if (r0 == 0) goto L_0x01a9
            X.1Zz r7 = new X.1Zz
            r7.<init>()
            int r0 = r4.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r7.A03 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r7.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.A00 = r0
            java.util.Map r0 = r5.A03
            java.lang.String r1 = "msgstore.db"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r7.A05 = r0
            java.util.Map r0 = r5.A04
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r7.A06 = r0
            X.66R r0 = r6.A05
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x00ea
            java.util.Map r0 = r5.A01
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r7.A04 = r0
        L_0x00ea:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x019e
            java.util.Map r6 = r5.A02
            java.lang.String r0 = "startuptracker/startup query counters:"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.Set r0 = r6.entrySet()
            java.util.ArrayList r5 = X.AnonymousClass002.A0J(r0)
            r1 = 7
            X.4IS r0 = new X.4IS
            r0.<init>((java.lang.Object) r4, (int) r1)
            java.util.Collections.sort(r5, r0)
            java.util.Iterator r8 = r5.iterator()
        L_0x010b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0133
            java.util.Map$Entry r5 = X.AnonymousClass001.A0w(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "startuptracker/startup "
            r1.append(r0)
            java.lang.String r0 = X.C18310x6.A0q(r5)
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.Object r0 = r5.getValue()
            X.C18260x0.A0m(r0, r1)
            goto L_0x010b
        L_0x0133:
            java.lang.String r0 = "startuptracker/startup end of query counters"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.1VX r5 = r4.A0I
            r1 = 4216(0x1078, float:5.908E-42)
            X.2vE r0 = X.C58422vE.A02
            int r1 = r5.A0O(r0, r1)
            if (r1 < 0) goto L_0x019e
            java.lang.Long r0 = r7.A06
            if (r0 == 0) goto L_0x019e
            long r8 = r0.longValue()
            long r0 = (long) r1
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x019e
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.util.Iterator r8 = X.AnonymousClass000.A0q(r6)
        L_0x015a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0191
            java.util.Map$Entry r6 = X.AnonymousClass001.A0w(r8)
            java.lang.String r1 = X.C18310x6.A0q(r6)
            java.lang.String r0 = "w-"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x017d
            java.lang.String r1 = X.C18310x6.A0q(r6)
            java.lang.String r0 = "m-"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x015a
        L_0x017d:
            java.lang.String r0 = X.C18310x6.A0q(r6)
            X.C18290x4.A1R(r5, r0)
            java.lang.Object r0 = r6.getValue()
            r5.append(r0)
            java.lang.String r0 = ";"
            r5.append(r0)
            goto L_0x015a
        L_0x0191:
            X.2qk r6 = r4.A0C
            java.lang.String r5 = r5.toString()
            r1 = 0
            java.lang.String r0 = "startup-db-writes"
            r6.A0A(r0, r1, r5)
        L_0x019e:
            X.4FV r1 = r4.A0J
            java.lang.Integer r0 = r4.A06
            int r0 = r0.intValue()
            r1.BhE(r7, r0)
        L_0x01a9:
            int r1 = r4.A01
            r0 = 1
            if (r1 != r0) goto L_0x01d9
            X.1VX r5 = r4.A0I
            r1 = 1626(0x65a, float:2.279E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r5.A0O(r0, r1)
            if (r0 <= 0) goto L_0x01d9
            long r5 = (long) r0
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x01d9
            X.1Y1 r1 = new X.1Y1
            r1.<init>()
            java.lang.String r0 = "app_launch"
            r1.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r1.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1.A01 = r0
            X.4FV r0 = r4.A0J
            r0.BhA(r1)
        L_0x01d9:
            X.1Z7 r8 = new X.1Z7
            r8.<init>()
            int r7 = r4.A01
            r6 = 1
            r5 = 3
            r1 = 2
            if (r7 == r1) goto L_0x025a
            r0 = 3
            if (r7 == r5) goto L_0x01e9
            r0 = 1
        L_0x01e9:
            if (r2 == r1) goto L_0x0258
            if (r2 != r5) goto L_0x01ee
            r6 = 3
        L_0x01ee:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r8.A03 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r8.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r8.A00 = r0
            X.4FV r1 = r4.A0J
            X.5ZC r0 = r4.A02
            r1.BhC(r8, r0)
            X.4FS r1 = r4.A0W
            r0 = 17
            X.3bp r0 = X.C71263bp.A00(r4, r0)
            r1.BkM(r0)
            X.316 r5 = r4.A03
            if (r5 == 0) goto L_0x022f
            r0 = 2
            if (r0 != r2) goto L_0x0240
            java.lang.String r2 = "chat"
        L_0x0221:
            r1 = 1
            java.lang.String r0 = "destination"
            r5.A0C(r0, r1, r2)
            X.316 r1 = r4.A03
            java.lang.String r0 = "render"
            r1.A0A(r0)
        L_0x022f:
            r0 = -1
            r4.A00 = r0
            r1 = 0
            r4.A08 = r1
            r0 = 0
            r4.A0A = r0
            r4.A07 = r1
        L_0x023a:
            if (r3 == 0) goto L_0x0021
            r3.run()
            return
        L_0x0240:
            r0 = 1
            if (r0 != r2) goto L_0x0246
            java.lang.String r2 = "chat_list"
            goto L_0x0221
        L_0x0246:
            r0 = 4
            if (r0 != r2) goto L_0x024c
            java.lang.String r2 = "call"
            goto L_0x0221
        L_0x024c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StartupLoggingNameConversionHelper/convertWamDestinationTypeToQplValues not support AppLaunchDestinationType "
            X.C18260x0.A0w(r0, r1, r2)
            java.lang.String r2 = ""
            goto L_0x0221
        L_0x0258:
            r6 = 2
            goto L_0x01ee
        L_0x025a:
            r0 = 2
            goto L_0x01e9
        L_0x025c:
            java.lang.String r0 = "banmanager/startPermanentBanFlow/launching-banappeals"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 3
            android.content.Intent r1 = X.C627736r.A0w(r3, r2, r1, r0)
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r1.setFlags(r0)
            r3.startActivity(r1)
            return
        L_0x0270:
            java.lang.Object r5 = r14.A01
            X.4IE r5 = (X.AnonymousClass4IE) r5
            java.lang.String r4 = r14.A03
            java.lang.Object r1 = r14.A02
            X.4uZ r1 = (X.C95814uZ) r1
            int r3 = r14.A00
            java.lang.Object r2 = r5.A00
            X.5XL r2 = (X.AnonymousClass5XL) r2
            X.2qK r0 = r2.A0I
            X.2i6 r1 = r0.A02(r1, r4)
            X.3Wi r4 = r2.A08
            r0 = 17
            X.3ca r2 = new X.3ca
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r5, (int) r3, (int) r0)
            goto L_0x0371
        L_0x0291:
            java.lang.Object r3 = r14.A01
            com.whatsapp.calling.service.VoiceServiceEventCallback r3 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r3
            java.lang.Object r2 = r14.A02
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r1 = r14.A00
            java.lang.String r0 = r14.A03
            r3.lambda$showCallNotAllowedActivity$8(r2, r1, r0)
            return
        L_0x02a1:
            java.lang.Object r3 = r14.A01
            X.2rd r3 = (X.C56222rd) r3
            java.lang.String r2 = r14.A03
            java.lang.Object r1 = r14.A02
            byte[] r1 = (byte[]) r1
            int r0 = r14.A00
            r3.A03(r2, r1, r0)
            return
        L_0x02b1:
            java.lang.Object r0 = r14.A01
            X.3TQ r0 = (X.AnonymousClass3TQ) r0
            int r4 = r14.A00
            java.lang.String r2 = r14.A03
            java.lang.Object r3 = r14.A02
            java.lang.Number r3 = (java.lang.Number) r3
            r0.A00()
            X.30i r5 = r0.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncResponseHandler/onGlobalError request failed with global error code="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", text="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", backoffMs="
            X.C18260x0.A1Q(r1, r0, r3)
            X.8OQ r2 = X.AnonymousClass30i.A0K
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r2.containsKey(r1)
            r6 = 0
            if (r0 == 0) goto L_0x02f5
            java.lang.Object r0 = r2.get(r1)
            X.C626936e.A06(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r5.A03(r0, r6)
            return
        L_0x02f5:
            int r2 = r4 / 100
            r0 = 5
            if (r2 != r0) goto L_0x032b
            r4 = 1
            X.2zM r0 = r5.A0J
            java.lang.Long r6 = r0.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncResponseHandler/onGlobalError request sync with delay based on the max of server provided "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " and client calculated delay "
            X.C18260x0.A1P(r1, r0, r6)
            if (r3 == 0) goto L_0x0326
            if (r6 == 0) goto L_0x0326
            long r2 = r3.longValue()
            long r0 = r6.longValue()
            long r0 = java.lang.Math.max(r2, r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        L_0x0326:
            r1 = 0
        L_0x0327:
            r5.A04(r6, r4, r1)
            return
        L_0x032b:
            r4 = 0
            r0 = 4
            r1 = 1
            if (r2 == r0) goto L_0x0327
            goto L_0x0326
        L_0x0331:
            java.lang.Object r0 = r14.A01
            X.32x r0 = (X.C619532x) r0
            java.lang.String r3 = r14.A03
            java.lang.Object r2 = r14.A02
            com.whatsapp.voipcalling.CallInfo r2 = (com.whatsapp.voipcalling.CallInfo) r2
            int r6 = r14.A00
            java.util.UUID r4 = java.util.UUID.randomUUID()
            X.C162457s7.A0D(r4)
            r5 = 16
            r7 = 1
            X.2ng r1 = new X.2ng
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.A00 = r1
            return
        L_0x034f:
            java.lang.String r4 = r14.A03
            java.lang.Object r1 = r14.A01
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            java.lang.Object r3 = r14.A02
            X.2mE r3 = (X.C52902mE) r3
            int r2 = r14.A00
            X.C162457s7.A0H(r1)
            X.5Y0 r0 = r3.A01
            android.graphics.drawable.Drawable r1 = X.AnonymousClass31U.A00(r1, r0, r4)
            r0 = 0
            r1.setBounds(r0, r0, r2, r2)
            X.3Wi r4 = r3.A00
            r0 = 38
            X.3bx r2 = new X.3bx
            r2.<init>(r3, r0, r1)
        L_0x0371:
            r4.A0S(r2)
            return
        L_0x0375:
            java.lang.Object r0 = r14.A01
            X.3TU r0 = (X.AnonymousClass3TU) r0
            java.lang.Object r3 = r14.A02
            X.4AT r3 = (X.AnonymousClass4AT) r3
            java.lang.String r2 = r14.A03
            int r1 = r14.A00
            boolean r0 = r0.A03
            r3.BV9(r1, r2, r0)
            return
        L_0x0387:
            int r4 = r14.A00
            java.lang.String r3 = r14.A03
            java.lang.Object r2 = r14.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r1 = r14.A02
            X.2gj r1 = (X.C49562gj) r1
            r0 = 1
            X.C162457s7.A0J(r3, r0)
            X.1Y3 r5 = new X.1Y3
            r5.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r5.A00 = r0
            r5.A01 = r3
            if (r2 == 0) goto L_0x03b1
            X.2sr r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass27U.A00(r0, r2)
        L_0x03ac:
            r5.A02 = r0
            X.4FV r0 = r1.A02
            goto L_0x03d6
        L_0x03b1:
            r0 = 0
            goto L_0x03ac
        L_0x03b3:
            int r0 = r14.A00
            java.lang.String r3 = r14.A03
            java.lang.Object r2 = r14.A01
            X.2p7 r2 = (X.C54682p7) r2
            java.lang.Object r1 = r14.A02
            X.4uZ r1 = (X.C95814uZ) r1
            X.1YZ r5 = new X.1YZ
            r5.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A00 = r0
            r5.A02 = r3
            X.2sr r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass27U.A00(r0, r1)
            r5.A01 = r0
            X.4FV r0 = r2.A02
        L_0x03d6:
            r0.BhD(r5)
            return
        L_0x03da:
            java.lang.Object r4 = r14.A01
            X.1qZ r4 = (X.C32471qZ) r4
            java.lang.String r7 = r14.A03
            int r3 = r14.A00
            java.lang.Object r2 = r14.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r6 = r4.A04
            r1.append(r6)
            java.lang.String r5 = "/"
            r1.append(r5)
            r1.append(r7)
            java.lang.String r0 = "; async task started, start_id="
            X.C18260x0.A0y(r0, r1, r3)
            r2.run()     // Catch:{ Exception -> 0x0400 }
            goto L_0x0423
        L_0x0400:
            r8 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0441 }
            X.AnonymousClass001.A1K(r6, r5, r7, r1)     // Catch:{ all -> 0x0441 }
            java.lang.String r0 = "; async task failed, start_id="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ all -> 0x0441 }
            com.whatsapp.util.Log.e(r0, r8)     // Catch:{ all -> 0x0441 }
            X.2qk r2 = r4.A01     // Catch:{ all -> 0x0441 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)     // Catch:{ all -> 0x0441 }
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass000.A0P(r8, r0, r1)     // Catch:{ all -> 0x0441 }
            java.lang.String r0 = "xpm-export-service-error"
            r2.A09(r0, r1, r8)     // Catch:{ all -> 0x0441 }
        L_0x0423:
            monitor-enter(r4)
            X.8yS r1 = r4.A03     // Catch:{ all -> 0x043e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x043e }
            r1.remove(r0)     // Catch:{ all -> 0x043e }
            r4.A00()     // Catch:{ all -> 0x043e }
            monitor-exit(r4)     // Catch:{ all -> 0x043e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.AnonymousClass001.A1K(r6, r5, r7, r1)
            java.lang.String r0 = "; async task completed, start_id="
            X.C18260x0.A0y(r0, r1, r3)
            return
        L_0x043e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x043e }
            throw r0
        L_0x0441:
            r2 = move-exception
            monitor-enter(r4)
            X.8yS r1 = r4.A03     // Catch:{ all -> 0x0451 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0451 }
            r1.remove(r0)     // Catch:{ all -> 0x0451 }
            r4.A00()     // Catch:{ all -> 0x0451 }
            monitor-exit(r4)     // Catch:{ all -> 0x0451 }
            throw r2
        L_0x0451:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0451 }
            throw r0
        L_0x0454:
            java.lang.Object r5 = r14.A01
            X.2mo r5 = (X.C53262mo) r5
            java.lang.Object r4 = r14.A02
            X.34x r4 = (X.C624134x) r4
            int r1 = r14.A00
            java.lang.String r3 = r14.A03
            X.2Yk r0 = r5.A03
            X.1ak r2 = r0.A00(r4, r1)
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "cta"
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x0470 }
            goto L_0x0475
        L_0x0470:
            java.lang.String r0 = "MessageWithLinkLogging/getEventAttributes failed to construct message class attributes"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0475:
            java.lang.String r0 = r1.toString()
            r2.A07 = r0
            boolean r0 = r4 instanceof X.AnonymousClass1p5
            if (r0 == 0) goto L_0x048d
            X.1p5 r4 = (X.AnonymousClass1p5) r4
            X.2cm r0 = r4.A00
            java.lang.String r0 = r0.A05
        L_0x0485:
            r2.A08 = r0
            X.4FV r0 = r5.A01
            r0.BhA(r2)
            return
        L_0x048d:
            r0 = 0
            goto L_0x0485
        L_0x048f:
            java.lang.Object r2 = r14.A01
            X.3Sv r2 = (X.C68353Sv) r2
            java.lang.Object r8 = r14.A02
            byte[] r8 = (byte[]) r8
            java.lang.String r7 = r14.A03
            int r9 = r14.A00
            X.2xS r1 = r2.A01     // Catch:{ IOException -> 0x04f1 }
            X.2sH r4 = r1.A01     // Catch:{ IOException -> 0x04f1 }
            X.2oU r0 = r1.A02     // Catch:{ IOException -> 0x04f1 }
            android.content.Context r3 = r0.A00     // Catch:{ IOException -> 0x04f1 }
            X.33p r5 = r1.A03     // Catch:{ IOException -> 0x04f1 }
            X.2I1 r6 = new X.2I1     // Catch:{ IOException -> 0x04f1 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x04f1 }
            X.AnonymousClass36Q.A01(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x04f1 }
            r0 = 2
            if (r9 != r0) goto L_0x04c4
            X.2M0 r1 = r1.A08     // Catch:{ IOException -> 0x04f1 }
            java.lang.String r0 = "FoaBackupTokenSender/sendFoaBackupToken"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x04f1 }
            X.2fQ r3 = r1.A01     // Catch:{ IOException -> 0x04f1 }
            boolean r0 = r3.A01()     // Catch:{ IOException -> 0x04f1 }
            if (r0 != 0) goto L_0x04ca
            java.lang.String r0 = "FoaBackupTokenSender/sendFoaBackupToken/not eligible"
        L_0x04c1:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x04f1 }
        L_0x04c4:
            java.lang.String r0 = "BackupTokenProtocolHelper/sendBackupTokenRequest/IQ success/encryptAndSaveToken"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x04f1 }
            goto L_0x04f0
        L_0x04ca:
            android.os.Bundle r2 = X.AnonymousClass002.A08()     // Catch:{ IOException -> 0x04f1 }
            X.2oU r0 = r1.A00     // Catch:{ IOException -> 0x04f1 }
            android.content.Context r1 = r0.A00     // Catch:{ IOException -> 0x04f1 }
            r0 = 2
            byte[] r0 = X.AnonymousClass36Q.A05(r1, r0)     // Catch:{ IOException -> 0x04f1 }
            if (r0 != 0) goto L_0x04dc
            java.lang.String r0 = "FoaBackupTokenSender/sendFoaBackupToken/foa backup token is null"
            goto L_0x04c1
        L_0x04dc:
            java.lang.String r1 = X.C18320x8.A0i(r0)     // Catch:{ IOException -> 0x04f1 }
            java.lang.String r0 = "foa_backup_token"
            r2.putString(r0, r1)     // Catch:{ IOException -> 0x04f1 }
            X.0xP r1 = new X.0xP     // Catch:{ IOException -> 0x04f1 }
            r1.<init>()     // Catch:{ IOException -> 0x04f1 }
            java.lang.String r0 = "com.facebook.SET_FOA_BACKUP_TOKEN"
            r3.A00(r1, r2, r0)     // Catch:{ IOException -> 0x04f1 }
            goto L_0x04c4
        L_0x04f0:
            return
        L_0x04f1:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenProtocolHelper/sendBackupTokenRequest/IQ success/encryptAndSaveToken/failed with IOException:"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70473aY.run():void");
    }
}
