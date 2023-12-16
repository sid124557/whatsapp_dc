package X;

/* renamed from: X.4Ji  reason: invalid class name and case insensitive filesystem */
public class C86234Ji implements C84134Bd {
    public Object A00;
    public final int A01;

    public C86234Ji(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: X.2FS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: X.2FR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: X.2FS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: X.2FS} */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x034b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x034c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04b9, code lost:
        r0.A05(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04bc, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AwB(java.lang.Object r22) {
        /*
            r21 = this;
            r4 = r22
            r1 = r21
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0143;
                case 1: goto L_0x014c;
                case 2: goto L_0x017b;
                case 3: goto L_0x0181;
                case 4: goto L_0x018b;
                case 5: goto L_0x0289;
                case 6: goto L_0x0011;
                case 7: goto L_0x02d8;
                case 8: goto L_0x0042;
                case 9: goto L_0x0314;
                case 10: goto L_0x0336;
                case 11: goto L_0x0341;
                case 12: goto L_0x0350;
                case 13: goto L_0x0056;
                case 14: goto L_0x0094;
                case 15: goto L_0x0382;
                case 16: goto L_0x03af;
                case 17: goto L_0x03bb;
                case 18: goto L_0x03c4;
                case 19: goto L_0x00ed;
                case 20: goto L_0x03d4;
                case 21: goto L_0x0103;
                case 22: goto L_0x03e0;
                case 23: goto L_0x0441;
                case 24: goto L_0x04af;
                case 25: goto L_0x04bd;
                case 26: goto L_0x04d1;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.1uR r0 = (X.C34231uR) r0
            r0.A0f()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r1 = r1.A00
            X.1hf r1 = (X.C28721hf) r1
            boolean r0 = X.AnonymousClass001.A1Z(r4)
            if (r0 == 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A0A
            int r0 = r0.incrementAndGet()
            int r4 = r0 * 100
            r0 = 3
            int r4 = r4 / r0
            java.util.Iterator r3 = X.C61102zi.A03(r1)
        L_0x0029:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r3.next()
            X.2FV r0 = (X.AnonymousClass2FV) r0
            com.whatsapp.companionmode.registration.CompanionBootstrapActivity r2 = r0.A00
            r1 = 22
            X.5sM r0 = new X.5sM
            r0.<init>((java.lang.Object) r2, (int) r4, (int) r1)
            r2.runOnUiThread(r0)
            goto L_0x0029
        L_0x0042:
            java.lang.Object r1 = r1.A00
            com.whatsapp.companiondevice.sync.HistorySyncWorker r1 = (com.whatsapp.companiondevice.sync.HistorySyncWorker) r1
            java.util.Map r4 = (java.util.Map) r4
            r1.A02 = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r4.containsValue(r0)
            if (r0 == 0) goto L_0x0010
            r1.A0C()
            return
        L_0x0056:
            java.lang.Object r5 = r1.A00
            X.1iA r5 = (X.C29031iA) r5
            int r0 = X.AnonymousClass001.A0K(r4)
            long r3 = (long) r0
            r1 = 429(0x1ad, double:2.12E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0500
            java.util.Iterator r2 = X.C61102zi.A03(r5)
        L_0x0069:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r1 = r2.next()
            X.2rf r1 = (X.C56242rf) r1
            boolean r0 = r1 instanceof X.AnonymousClass4H8
            if (r0 == 0) goto L_0x0069
            X.4H8 r1 = (X.AnonymousClass4H8) r1
            int r0 = r1.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "companion/registration/link code too many attempts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 40
            X.3Zi r0 = X.C69963Zi.A00(r1, r0)
            r1.runOnUiThread(r0)
            goto L_0x0069
        L_0x0094:
            java.lang.Object r6 = r1.A00
            X.1iA r6 = (X.C29031iA) r6
            boolean r0 = X.AnonymousClass001.A1Z(r4)
            if (r0 == 0) goto L_0x0504
            r1 = 8
            X.2jr r0 = r6.A0S
            r0.A01(r1)
            X.3Wa r5 = r6.A0n
            r5.A00()
            X.1VX r2 = r6.A0g
            r1 = 877(0x36d, float:1.229E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00c1
            r3 = 0
            X.4FS r2 = r5.A0B
            java.lang.String r1 = "ToSGatingRepository/requestRefresh"
            java.lang.Runnable r0 = r5.A0C
            r2.Bkn(r0, r1, r3)
        L_0x00c1:
            java.util.Iterator r3 = X.C61102zi.A03(r6)
        L_0x00c5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r1 = r3.next()
            X.2rf r1 = (X.C56242rf) r1
            boolean r0 = r1 instanceof X.AnonymousClass4H8
            if (r0 == 0) goto L_0x00c5
            X.4H8 r1 = (X.AnonymousClass4H8) r1
            int r0 = r1.A01
            if (r0 != 0) goto L_0x00c5
            java.lang.Object r2 = r1.A00
            android.content.Context r2 = (android.content.Context) r2
            android.content.Intent r1 = X.C627736r.A03(r2)
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r1.addFlags(r0)
            r2.startActivity(r1)
            goto L_0x00c5
        L_0x00ed:
            java.lang.Object r1 = r1.A00
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            X.34x r4 = (X.C624134x) r4
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            boolean r0 = r4 instanceof X.C30471mV
            if (r0 != 0) goto L_0x0010
            X.2qb r0 = r4.A0l
            if (r0 == 0) goto L_0x0010
            r1.add(r4)
            return
        L_0x0103:
            java.lang.Object r8 = r1.A00
            X.3dF r8 = (X.C72143dF) r8
            long r2 = X.C18310x6.A0B(r4)
            long r4 = r8.A01
            long r4 = r4 + r2
            r8.A01 = r4
            long r6 = r8.A02
            r10 = 0
            r9 = 100
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x013b
            r1 = 100
        L_0x011c:
            int r0 = r8.A00
            int r0 = r0 + 5
            if (r1 >= r0) goto L_0x0124
            if (r1 != r9) goto L_0x012e
        L_0x0124:
            r8.A00 = r1
            X.8rr r0 = r8.A09
            r0.BRV(r4)
            r0.BRY(r1)
        L_0x012e:
            X.2sf r6 = r8.A07
            if (r6 == 0) goto L_0x0010
            long r4 = r8.A01
            long r0 = r8.A03
            long r4 = r4 - r0
            r6.A0A(r4, r2)
            return
        L_0x013b:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = (float) r4
            float r1 = r1 * r0
            float r0 = (float) r6
            float r1 = r1 / r0
            int r1 = (int) r1
            goto L_0x011c
        L_0x0143:
            java.lang.Object r1 = r1.A00
            X.33R r1 = (X.AnonymousClass33R) r1
            r0 = 1
            r1.A01(r0)
            return
        L_0x014c:
            java.lang.Object r3 = r1.A00
            X.3XA r3 = (X.AnonymousClass3XA) r3
            java.util.Collection r4 = (java.util.Collection) r4
            r2 = 1
            X.C162457s7.A0J(r4, r2)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x016a
            java.util.Iterator r1 = r4.iterator()
        L_0x0160:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016a
            r1.next()
            goto L_0x0160
        L_0x016a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BotProfileSyncManager/requestBotAllData result="
            X.C18260x0.A1D(r0, r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A05(r0)
            return
        L_0x017b:
            java.lang.Object r0 = r1.A00
            X.3XA r0 = (X.AnonymousClass3XA) r0
            goto L_0x04b9
        L_0x0181:
            java.lang.Object r0 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r0 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r0
            X.4UC r0 = r0.A0X
            r0.A0H(r4)
            return
        L_0x018b:
            java.lang.Object r15 = r1.A00
            X.3TQ r15 = (X.AnonymousClass3TQ) r15
            java.util.List r4 = (java.util.List) r4
            X.31C r14 = r15.A07
            java.lang.String r0 = r14.A03()
            X.2Qv r3 = new X.2Qv
            r3.<init>(r0)
            java.util.Iterator r13 = r4.iterator()
        L_0x01a0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0223
            java.lang.Object r1 = r13.next()
            X.2Pm r1 = (X.C42782Pm) r1
            if (r1 == 0) goto L_0x01a0
            java.lang.String r7 = r1.A01
            X.2ri r0 = r15.A06
            java.lang.Long r2 = r0.A00(r7)
            java.util.List r9 = r1.A02
            X.1Do r10 = r1.A00
            byte[] r8 = r1.A03
            X.2sr r0 = r15.A01
            boolean r5 = r0.A0Y()
            java.lang.String r0 = "collection"
            X.2rL r6 = X.C56052rL.A04(r0)
            java.lang.String r0 = "critical_unblock_low"
            boolean r0 = r0.equals(r7)
            r1 = r0 ^ 1
            java.lang.String r0 = "name"
            X.C56052rL.A0D(r6, r0, r7)
            java.lang.String r0 = "order"
            X.C56052rL.A0B(r6, r0, r1)
            if (r2 == 0) goto L_0x01e4
            java.lang.String r0 = "version"
            X.C56052rL.A0A(r6, r2, r0)
        L_0x01e4:
            if (r5 == 0) goto L_0x01fb
            if (r2 == 0) goto L_0x01f2
            long r11 = r2.longValue()
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01fb
        L_0x01f2:
            java.lang.String r1 = "return_snapshot"
            java.lang.String r0 = "true"
            X.C56052rL.A0D(r6, r1, r0)
        L_0x01fb:
            if (r10 == 0) goto L_0x0217
            r5 = 0
            byte[] r2 = r10.A0F()
            java.lang.String r1 = "patch"
            X.36K r0 = new X.36K
            r0.<init>((java.lang.String) r1, (byte[]) r2, (X.AnonymousClass39V[]) r5)
            r6.A0H(r0)
            java.util.Map r0 = r3.A03
            r0.put(r7, r9)
            java.util.Map r0 = r3.A02
            r0.put(r7, r8)
        L_0x0217:
            java.util.Set r0 = r3.A04
            r0.add(r7)
            X.2rL r0 = r3.A00
            X.C56052rL.A07(r6, r0)
            goto L_0x01a0
        L_0x0223:
            X.2rL r5 = X.C56052rL.A00()
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:sync:app:state"
            X.C56052rL.A0D(r5, r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C56052rL.A0D(r5, r1, r0)
            java.lang.String r0 = "id"
            java.lang.String r7 = r3.A01
            X.C56052rL.A0D(r5, r0, r7)
            X.2rL r2 = r3.A00
            java.util.List r0 = r2.A02
            r0.clear()
            java.lang.String r1 = "data_namespace"
            r0 = 3
            X.C56052rL.A0B(r2, r1, r0)
            X.C56052rL.A07(r2, r5)
            java.util.Set r10 = r3.A04
            X.36K r6 = r5.A0F()
            java.util.Map r8 = r3.A03
            java.util.Map r9 = r3.A02
            X.2h2 r5 = new X.2h2
            r5.<init>(r6, r7, r8, r9, r10)
            r15.A00 = r5
            X.3El r0 = r15.A05
            r0.A03(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sync-request-handler/sendIq iqId:"
            r1.append(r0)
            X.2h2 r0 = r15.A00
            java.lang.String r0 = r0.A02
            X.C18260x0.A1L(r1, r0)
            r18 = 238(0xee, float:3.34E-43)
            X.2h2 r0 = r15.A00
            java.lang.String r1 = r0.A02
            X.36K r0 = r0.A01
            r19 = 32000(0x7d00, double:1.581E-319)
            r17 = r1
            r16 = r0
            r14.A0E(r15, r16, r17, r18, r19)
            return
        L_0x0289:
            java.lang.Object r3 = r1.A00
            X.3TQ r3 = (X.AnonymousClass3TQ) r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sync-request-handler/sendRequest preparing request failed - "
            X.C18260x0.A16(r0, r1, r4)
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            boolean r0 = r4 instanceof X.AnonymousClass24L
            if (r0 == 0) goto L_0x02cb
            r0 = r4
            X.24L r0 = (X.AnonymousClass24L) r0
            java.util.List r0 = r0.throwables
            r1.addAll(r0)
        L_0x02a9:
            java.util.Iterator r2 = r1.iterator()
        L_0x02ad:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02cf
            java.lang.Object r1 = r2.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r0 = r1 instanceof X.C23321Sd
            if (r0 != 0) goto L_0x02c5
            boolean r0 = r1 instanceof X.C23331Se
            if (r0 != 0) goto L_0x02c5
            boolean r0 = r1 instanceof X.C23341Sf
            if (r0 == 0) goto L_0x02ad
        L_0x02c5:
            X.30i r0 = r3.A02
            r0.A05(r1)
            return
        L_0x02cb:
            r1.add(r4)
            goto L_0x02a9
        L_0x02cf:
            java.lang.String r1 = "sync-request-handler/sendRequest unexpected exception was caught! Only SyncdFailedException, SyncdRetriableException and SyncdFatalException are allowed here."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r4)
            throw r0
        L_0x02d8:
            java.lang.Object r3 = r1.A00
            X.2S4 r3 = (X.AnonymousClass2S4) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompanionSyncdBootstrapManager/startCriticalBootstrapPhase complete with success="
            X.C18260x0.A1P(r1, r0, r4)
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x02fa
            X.2q4 r0 = r3.A03
            r2 = 3
        L_0x02f0:
            android.content.SharedPreferences$Editor r1 = X.C55262q4.A00(r0)
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            X.C18270x1.A0h(r1, r0, r2)
            return
        L_0x02fa:
            java.util.Set r0 = X.AnonymousClass33W.A09
            java.util.Iterator r2 = r0.iterator()
        L_0x0300:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0310
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            X.2ri r0 = r3.A04
            r0.A02(r1)
            goto L_0x0300
        L_0x0310:
            X.2q4 r0 = r3.A03
            r2 = 0
            goto L_0x02f0
        L_0x0314:
            java.lang.Object r2 = r1.A00
            X.2yM r2 = (X.C60322yM) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ReceiveHistorySyncManager/receiveInitialBootstrap complete with success="
            X.C18260x0.A1P(r1, r0, r4)
            X.2sA r1 = r2.A08
            r0 = 0
            r1.A08(r0)
            X.3Gp r0 = r2.A04
            X.4FS r2 = r0.A0h
            X.2qH r1 = r0.A0N
            java.util.Objects.requireNonNull(r1)
            r0 = 17
            X.C69963Zi.A01(r2, r1, r0)
            return
        L_0x0336:
            java.lang.Object r0 = r1.A00
            X.2yM r0 = (X.C60322yM) r0
            X.2FR r1 = r0.A03
            monitor-enter(r1)
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x034d }
            goto L_0x034b
        L_0x0341:
            java.lang.Object r0 = r1.A00
            X.2Qw r0 = (X.C43122Qw) r0
            X.2FS r1 = r0.A01
            monitor-enter(r1)
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x034d }
        L_0x034b:
            monitor-exit(r1)
            return
        L_0x034d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0350:
            java.lang.Object r5 = r1.A00
            X.1iA r5 = (X.C29031iA) r5
            java.lang.String r0 = "companion/registration/companion-hello/received IQ response"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0t
            r0.set(r4)
            X.2jr r1 = r5.A0S
            r0 = 12
            r1.A01(r0)
            java.lang.Runnable r1 = r5.A0A
            if (r1 == 0) goto L_0x036e
            X.4FS r0 = r5.A0o
            r0.BjN(r1)
        L_0x036e:
            X.4FS r4 = r5.A0o
            r0 = 33
            X.3Zi r3 = X.C69963Zi.A00(r5, r0)
            r1 = 195000(0x2f9b8, double:9.6343E-319)
            java.lang.String r0 = "CompanionRegistrationManager/linkCodeRefTimeoutRunnable"
            java.lang.Runnable r0 = r4.Bkn(r3, r0, r1)
            r5.A0A = r0
            return
        L_0x0382:
            java.lang.Object r3 = r1.A00
            X.1I7 r3 = (X.AnonymousClass1I7) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/oncancelled; mediaHash="
            r1.append(r0)
            X.2dc r0 = r3.A0e
            java.lang.String r0 = r0.A0H
            r1.append(r0)
            java.lang.String r0 = " url="
            r1.append(r0)
            java.net.URL r0 = r3.A05
            X.C18260x0.A0o(r0, r1)
            r2 = 0
            r1 = 0
            r0 = 13
            X.35m r0 = X.C625435m.A00(r2, r0, r1)
            r3.A0G(r0)
            r3.A0D(r0)
            return
        L_0x03af:
            java.lang.Object r2 = r1.A00
            X.1I7 r2 = (X.AnonymousClass1I7) r2
            long r0 = X.C18310x6.A0B(r4)
            r2.A0C(r0)
            return
        L_0x03bb:
            java.lang.Object r1 = r1.A00
            X.1I7 r1 = (X.AnonymousClass1I7) r1
            r0 = 1
            r1.Ayd(r0)
            return
        L_0x03c4:
            java.lang.Object r1 = r1.A00
            X.1mV r1 = (X.C30471mV) r1
            java.lang.String r4 = (java.lang.String) r4
            X.33C r0 = r1.A01
            X.C626936e.A06(r0)
            X.33C r0 = r1.A01
            r0.A0I = r4
            return
        L_0x03d4:
            java.lang.Object r2 = r1.A00
            X.4EV r2 = (X.AnonymousClass4EV) r2
            long r0 = X.C18310x6.A0B(r4)
            r2.BRU(r0)
            return
        L_0x03e0:
            java.lang.Object r2 = r1.A00
            X.1I5 r2 = (X.AnonymousClass1I5) r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediaupload/oncancelled, request="
            r1.append(r0)
            X.2zt r0 = r2.A0V
            r1.append(r0)
            java.lang.String r0 = ", this="
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)
            com.whatsapp.util.Log.i(r0, r4)
            boolean r0 = r4 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L_0x040a
            r1 = 7
        L_0x0402:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A0D(r0)
            return
        L_0x040a:
            boolean r0 = r4 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0421
            X.2p6 r0 = r2.A0Q
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x0419
            r1 = 18
            goto L_0x0402
        L_0x0419:
            boolean r0 = r4 instanceof org.chromium.net.CronetException
            r1 = 3
            if (r0 == 0) goto L_0x0402
            r1 = 28
            goto L_0x0402
        L_0x0421:
            boolean r0 = r4 instanceof X.C143416yq
            if (r0 == 0) goto L_0x0428
            r1 = 21
            goto L_0x0402
        L_0x0428:
            boolean r0 = r4 instanceof java.security.NoSuchAlgorithmException
            if (r0 == 0) goto L_0x042f
            r1 = 16
            goto L_0x0402
        L_0x042f:
            java.util.concurrent.FutureTask r0 = r2.A02
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x0439
            r1 = 1
            goto L_0x0402
        L_0x0439:
            java.lang.String r0 = "MediaUpload/onError unknown"
            com.whatsapp.util.Log.e(r0, r4)
            r1 = 31
            goto L_0x0402
        L_0x0441:
            java.lang.Object r5 = r1.A00
            X.3RB r5 = (X.AnonymousClass3RB) r5
            java.lang.Number r4 = (java.lang.Number) r4
            long r8 = r5.A06
            long r0 = r4.longValue()
            long r8 = r8 + r0
            r5.A06 = r8
            int r10 = r5.A00
            long r6 = r5.A05
            X.1hx r4 = r5.A0I
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = (double) r8
            double r2 = r2 * r0
            double r0 = (double) r6
            double r2 = r2 / r0
            int r6 = (int) r2
            if (r10 == r6) goto L_0x04ac
            java.util.Iterator r7 = X.C61102zi.A03(r4)
        L_0x0463:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x04ac
            java.lang.Object r0 = r7.next()
            X.3R4 r0 = (X.AnonymousClass3R4) r0
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r4 = r0.A00
            r4.A00 = r6
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x049b
            r3 = 2131887735(0x7f120677, float:1.9410085E38)
            X.2rI r0 = r4.A0R
            boolean r1 = r0.A05()
            r0 = 50
            if (r1 == 0) goto L_0x0486
            r0 = 98
        L_0x0486:
            int r2 = 100 - r0
            r1 = 100
            int r1 = r1 - r2
        L_0x048b:
            int r0 = r6 * r1
            int r0 = r0 / 100
            int r2 = r2 + r0
            r4.A0K(r3, r2)
            int r1 = r4.A02
            r0 = 1
            if (r1 == r0) goto L_0x0463
            r4.A02 = r0
            goto L_0x0463
        L_0x049b:
            r3 = 2131887729(0x7f120671, float:1.9410073E38)
            X.2rI r0 = r4.A0R
            boolean r0 = r0.A05()
            r1 = 50
            if (r0 == 0) goto L_0x04aa
            r1 = 98
        L_0x04aa:
            r2 = 0
            goto L_0x048b
        L_0x04ac:
            r5.A00 = r6
            return
        L_0x04af:
            java.lang.Object r1 = r1.A00
            X.2IK r1 = (X.AnonymousClass2IK) r1
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.3XA r0 = r1.A00
        L_0x04b9:
            r0.A05(r4)
            return
        L_0x04bd:
            java.lang.Object r2 = r1.A00
            X.2IK r2 = (X.AnonymousClass2IK) r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            java.util.List r1 = X.C73783g4.A0e(r4)
            X.3XA r0 = r2.A00
            r0.A05(r1)
            return
        L_0x04d1:
            java.lang.Object r3 = r1.A00
            X.1uR r3 = (X.C34231uR) r3
            X.2kN r4 = (X.C51782kN) r4
            org.json.JSONObject r1 = r3.A06
            if (r1 == 0) goto L_0x04fc
            java.lang.String r0 = "playerVars"
            java.lang.Object r2 = r1.get(r0)     // Catch:{ ClassCastException | JSONException -> 0x04f6 }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ ClassCastException | JSONException -> 0x04f6 }
            java.lang.String r1 = "rctn"
            java.lang.String r0 = r4.A01     // Catch:{ ClassCastException | JSONException -> 0x04f6 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ ClassCastException | JSONException -> 0x04f6 }
            java.lang.String r1 = "rct"
            java.lang.String r0 = r4.A00     // Catch:{ ClassCastException | JSONException -> 0x04f6 }
            r2.put(r1, r0)     // Catch:{ ClassCastException | JSONException -> 0x04f6 }
            goto L_0x04fc
        L_0x04f6:
            r1 = move-exception
            java.lang.String r0 = "InlineYoutubeVideoPlayer/addCounterAbuseDataIfNeeded"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x04fc:
            r3.A0f()
            return
        L_0x0500:
            r5.A0B()
            return
        L_0x0504:
            java.lang.String r0 = "companion/registration/onRegistrationSuccess critical bootstrap fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "critical_sync_timeout"
            r0 = 1
            r6.A0G(r1, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86234Ji.AwB(java.lang.Object):void");
    }
}
