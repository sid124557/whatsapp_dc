package X;

/* renamed from: X.4Jh  reason: invalid class name and case insensitive filesystem */
public class C86224Jh implements C84134Bd {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C86224Jh(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021f, code lost:
        if ((r1.A0A.A00() & 1) != 0) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0229, code lost:
        if (r3 != X.C633138t.A0b) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022b, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AwB(java.lang.Object r16) {
        /*
            r15 = this;
            r10 = r16
            int r0 = r15.A03
            switch(r0) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x01bd;
                case 2: goto L_0x01d2;
                case 3: goto L_0x027f;
                case 4: goto L_0x02af;
                case 5: goto L_0x02e8;
                case 6: goto L_0x0314;
                case 7: goto L_0x03dc;
                case 8: goto L_0x03fd;
                case 9: goto L_0x043f;
                case 10: goto L_0x046e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r13 = r15.A00
            X.2iO r13 = (X.C50572iO) r13
            java.lang.Object r12 = r15.A01
            X.34x r12 = (X.C624134x) r12
            java.lang.Object r11 = r15.A02
            X.2qb r11 = (X.C55592qb) r11
            X.2sk r10 = (X.C56902sk) r10
            r0 = 3
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r10, r0)
            java.lang.String r0 = "ThumbnailDownloadManager/generateThumbnail; message.key="
            X.2z0 r3 = X.C624134x.A08(r12, r0, r1)
            X.C18260x0.A0m(r3, r1)
            X.30w r0 = r12.A0y()
            if (r0 == 0) goto L_0x0061
            byte[] r0 = r10.A0H()
            if (r0 == 0) goto L_0x0061
            boolean r0 = r12 instanceof X.C30471mV
            if (r0 == 0) goto L_0x004a
            X.1sV r0 = r13.A0E
            r0.A0G(r12)
            X.30w r9 = r12.A0y()
            if (r9 == 0) goto L_0x004a
            X.2at r0 = r13.A09
            r14 = 12
            X.3c8 r8 = new X.3c8
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.A00(r9, r8)
        L_0x004a:
            X.35m r0 = r10.A01()
            if (r0 == 0) goto L_0x043e
            int r1 = r0.A01
            r0 = 5
            if (r1 != r0) goto L_0x043e
            X.2S9 r1 = r13.A07
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnail"
            X.C18260x0.A1P(r0, r5, r3)
            goto L_0x00a8
        L_0x0061:
            boolean r0 = r12 instanceof X.C30481mW
            r2 = -1
            if (r0 == 0) goto L_0x009e
            byte[] r0 = r10.A0H()
            if (r0 == 0) goto L_0x009e
            java.lang.String r1 = r11.A04
            if (r1 == 0) goto L_0x009e
            X.3Dh r0 = r13.A01
            java.io.File r4 = r0.A0T(r1)
            byte[] r0 = r10.A0H()     // Catch:{ IOException -> 0x0093 }
            X.C627536m.A0H(r4, r0)     // Catch:{ IOException -> 0x0093 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0093 }
            java.lang.String r0 = "ThumbnailDownloadMananger/whenDownloadComplete, created thumbnail file at "
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r4, r0, r1)     // Catch:{ IOException -> 0x0093 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ IOException -> 0x0093 }
            r0 = 1
            r11.A09 = r0     // Catch:{ IOException -> 0x0093 }
            X.3Lv r0 = r13.A04     // Catch:{ IOException -> 0x0093 }
            r0.A0b(r12, r2)     // Catch:{ IOException -> 0x0093 }
            goto L_0x004a
        L_0x0093:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ThumbnailDownloadMananger/whenDownloadComplete, exception when creating thumbnail file"
            X.C18260x0.A0k(r4, r0, r1, r2)
            goto L_0x004a
        L_0x009e:
            boolean r0 = r12 instanceof X.C30471mV
            if (r0 == 0) goto L_0x004a
            X.3Lv r0 = r13.A04
            r0.A0b(r12, r2)
            goto L_0x004a
        L_0x00a8:
            X.3dV r0 = r1.A03     // Catch:{ Exception -> 0x043a }
            X.4Fq r7 = r0.A04()     // Catch:{ Exception -> 0x043a }
            X.3Yo r6 = r7.Axl()     // Catch:{ all -> 0x00f3 }
            r0 = 0
            r12.A1W(r0)     // Catch:{ all -> 0x00e9 }
            X.2qz r1 = r1.A05     // Catch:{ all -> 0x00e9 }
            r0 = -1
            r1.A07(r12, r0)     // Catch:{ all -> 0x00e9 }
            long r0 = r12.A1L     // Catch:{ all -> 0x00e9 }
            r2 = r7
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x00e9 }
            X.2sg r4 = r2.A03     // Catch:{ all -> 0x00e9 }
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x00e9 }
            X.C18270x1.A1S(r3, r0)     // Catch:{ all -> 0x00e9 }
            java.lang.String r2 = "deleteMmsThumbnailMetadataOlderThan/DELETE_MMS_THUMBNAIL_METADATA_BY_MESSAGE_ID"
            java.lang.String r1 = "mms_thumbnail_metadata"
            java.lang.String r0 = "message_row_id = ?"
            int r2 = r4.A07(r1, r0, r2, r3)     // Catch:{ all -> 0x00e9 }
            r6.A00()     // Catch:{ all -> 0x00e9 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnail deleting rows:"
            X.C18260x0.A0y(r0, r1, r2)     // Catch:{ all -> 0x00e9 }
            r6.close()     // Catch:{ all -> 0x00f3 }
            r7.close()     // Catch:{ Exception -> 0x043a }
            return
        L_0x00e9:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00ee }
            goto L_0x00f2
        L_0x00ee:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f3 }
        L_0x00f2:
            throw r1     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00f8 }
            goto L_0x00fc
        L_0x00f8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x043a }
        L_0x00fc:
            throw r1     // Catch:{ Exception -> 0x043a }
        L_0x00fd:
            java.lang.Object r4 = r15.A00
            X.1hf r4 = (X.C28721hf) r4
            java.lang.Object r1 = r15.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r2 = r15.A02
            X.3XA r2 = (X.AnonymousClass3XA) r2
            java.util.List r10 = (java.util.List) r10
            X.4FS r0 = r4.A09
            r0.BjN(r1)
            java.util.Iterator r1 = r10.iterator()
            r10 = 1
        L_0x0115:
            r5 = 1
        L_0x0116:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x012b
            java.lang.Object r0 = r1.next()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r5 == 0) goto L_0x0129
            if (r0 == 0) goto L_0x0129
            goto L_0x0115
        L_0x0129:
            r5 = 0
            goto L_0x0116
        L_0x012b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompanionBootstrapManager/startCriticalBootstrap completed, success="
            X.C18260x0.A1D(r0, r1, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A05(r0)
            X.2q4 r0 = r4.A07
            android.content.SharedPreferences$Editor r3 = X.C55262q4.A00(r0)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "critical_bootstrap_completed_timestamp"
            X.C18270x1.A0i(r3, r0, r1)
            if (r5 == 0) goto L_0x043e
            X.2S4 r2 = r4.A02
            java.lang.String r0 = "CompanionSyncdBootstrapManager/startNonCriticalBootstrapPhase started"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2sr r0 = r2.A00
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x0161
            X.4FS r1 = r2.A05
            r0 = 5
            X.C69963Zi.A01(r1, r2, r0)
        L_0x0161:
            X.3Lq r1 = r4.A08
            r0 = 3
            r1.A0C(r0, r10)
            X.3Ex r0 = r4.A05
            java.util.ArrayList r0 = r0.A0F()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r0.iterator()
        L_0x0175:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0183
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A06(r1)
            r7.add(r0)
            goto L_0x0175
        L_0x0183:
            r6 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            X.C626936e.A0B(r10)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            int r2 = r7.size()
        L_0x0191:
            if (r5 >= r2) goto L_0x01a2
            int r1 = r5 + r6
            int r0 = java.lang.Math.min(r2, r1)
            java.util.List r0 = r7.subList(r5, r0)
            r3.add(r0)
            r5 = r1
            goto L_0x0191
        L_0x01a2:
            java.util.Iterator r1 = r3.iterator()
        L_0x01a6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x043e
            java.lang.Object r8 = r1.next()
            java.util.Collection r8 = (java.util.Collection) r8
            X.3Cq r5 = r4.A06
            X.227 r7 = X.AnonymousClass227.A0M
            X.2xW r6 = X.C59812xW.A0D
            r9 = 0
            r5.A02(r6, r7, r8, r9, r10)
            goto L_0x01a6
        L_0x01bd:
            java.lang.Object r3 = r15.A00
            X.3Gp r3 = (X.C65203Gp) r3
            java.lang.Object r2 = r15.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Object r1 = r15.A02
            X.4FS r0 = r3.A0h
            r0.BjN(r2)
            X.1i6 r0 = r3.A09
            r0.A07(r1)
            return
        L_0x01d2:
            java.lang.Object r5 = r15.A00
            X.33c r5 = (X.C620033c) r5
            java.lang.Object r4 = r15.A01
            X.3QO r4 = (X.AnonymousClass3QO) r4
            java.lang.Object r2 = r15.A02
            X.7PV r2 = (X.AnonymousClass7PV) r2
            X.7N0 r10 = (X.AnonymousClass7N0) r10
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/onFinishProcessMedia response for jobId="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " success="
            r1.append(r0)
            boolean r0 = r10.A02
            X.C18260x0.A1U(r1, r0)
            java.io.File r3 = r10.A00
            if (r3 == 0) goto L_0x0205
            r0 = 0
            X.2QG r1 = new X.2QG
            r1.<init>(r3, r0)
            X.3XB r0 = r4.A09
            r0.A05(r1)
        L_0x0205:
            X.3XB r0 = r4.A0F
            r0.A05(r10)
            X.2qZ r1 = r5.A0B
            X.38t r3 = X.C47592dV.A00(r4)
            boolean r0 = X.AnonymousClass36O.A04(r3)
            if (r0 == 0) goto L_0x0226
            X.2ay r0 = r1.A0A
            int r0 = r0.A00()
            r1 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x022b
        L_0x0221:
            X.33a r3 = r4.A0M
            monitor-enter(r3)
            r0 = 1
            goto L_0x022d
        L_0x0226:
            X.38t r0 = X.C633138t.A0b
            r1 = 1
            if (r3 == r0) goto L_0x0221
        L_0x022b:
            r1 = 0
            goto L_0x0221
        L_0x022d:
            r3.A0H = r0     // Catch:{ all -> 0x027c }
            monitor-exit(r3)
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x026f
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x026f
            if (r1 != 0) goto L_0x026f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/onFinishProcessMedia optimism unsafe, failing jobId="
            X.C18260x0.A1P(r1, r0, r4)
            X.2UL r0 = new X.2UL
            r0.<init>()
            r3.A0B(r0)
            r0 = 14
            r4.A00 = r0
            X.3XB r1 = r4.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05(r0)
        L_0x025a:
            X.3XB r0 = r2.A02
            r0.A02()
            X.3XB r0 = r2.A03
            r0.A02()
            X.3XB r0 = r2.A04
            r0.A02()
            X.3XB r0 = r2.A01
            r0.A02()
            return
        L_0x026f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/onFinishProcessMedia upload reason found, job cancelled or optimism enabled for jobId="
            X.C18260x0.A1P(r1, r0, r4)
            r5.A0C(r4, r10)
            goto L_0x025a
        L_0x027c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x027f:
            java.lang.Object r4 = r15.A00
            X.2re r4 = (X.C56232re) r4
            java.lang.Object r3 = r15.A01
            X.30M r3 = (X.AnonymousClass30M) r3
            java.lang.Object r2 = r15.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/thumbnail for "
            r1.append(r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.A02
            X.C18320x8.A1O(r1, r0)
            java.lang.String r0 = " messages ; job="
            X.C18260x0.A1P(r1, r0, r2)
            X.32i r2 = r4.A0E
            r1 = 2
            X.4Ja r0 = new X.4Ja
            r0.<init>(r2, r1)
            X.C618132i.A00(r3, r0, r10)
            X.3Wi r1 = r4.A01
            r0 = 25
            X.C69263Wi.A0A(r1, r4, r3, r0)
            return
        L_0x02af:
            java.lang.Object r6 = r15.A00
            X.2re r6 = (X.C56232re) r6
            java.lang.Object r0 = r15.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r15.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            java.util.Iterator r2 = r0.iterator()
        L_0x02bf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02e4
            X.1mV r5 = X.C18320x8.A0S(r2)
            r0 = 1
            boolean r0 = X.C618132i.A01(r5, r0)
            if (r0 == 0) goto L_0x02bf
            X.1io r1 = r6.A07
            r0 = -1
            r1.A0C(r5, r0)
            r7 = 7
            r9 = 0
            X.4FS r0 = r6.A0R
            r8 = 3
            X.3cT r4 = new X.3cT
            r4.<init>(r5, r6, r7, r8, r9)
            r0.BkM(r4)
            goto L_0x02bf
        L_0x02e4:
            r3.run()
            return
        L_0x02e8:
            java.lang.Object r5 = r15.A00
            X.2re r5 = (X.C56232re) r5
            java.lang.Object r4 = r15.A01
            X.30M r4 = (X.AnonymousClass30M) r4
            java.lang.Object r2 = r15.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/mediajob/uuid for "
            r1.append(r0)
            java.util.concurrent.CopyOnWriteArrayList r3 = r4.A02
            X.C18320x8.A1O(r1, r3)
            java.lang.String r0 = " messages: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; job="
            X.C18260x0.A1P(r1, r0, r2)
            X.32i r2 = r5.A0E
            r1 = 3
            goto L_0x045f
        L_0x0314:
            java.lang.Object r3 = r15.A00
            X.2re r3 = (X.C56232re) r3
            java.lang.Object r9 = r15.A01
            X.30M r9 = (X.AnonymousClass30M) r9
            java.lang.Object r2 = r15.A02
            X.2QG r10 = (X.AnonymousClass2QG) r10
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/mediajob/moved for "
            r1.append(r0)
            java.util.concurrent.CopyOnWriteArrayList r7 = r9.A02
            X.C18320x8.A1O(r1, r7)
            java.lang.String r0 = "; job="
            X.C18260x0.A1P(r1, r0, r2)
            X.32i r2 = r3.A0E
            java.io.File r8 = r10.A01
            X.1mV r1 = r9.A00()
            monitor-enter(r1)
            X.1mV r0 = r9.A00()     // Catch:{ all -> 0x03d9 }
            java.io.File r5 = X.C30471mV.A01(r0)     // Catch:{ all -> 0x03d9 }
            monitor-exit(r1)     // Catch:{ all -> 0x03d9 }
            int r6 = r7.size()
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A03
            r0.addAndGet(r6)
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L_0x035b
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.A02
            r0 = 1
            r1.set(r0)
            return
        L_0x035b:
            if (r6 != 0) goto L_0x0364
            java.lang.String r0 = "sendmediamessagemanager/applyMediaFileReference skip, uploadReason is empty"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0364:
            X.2rq r4 = r2.A01
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            r4.A04(r8, r6, r0)
            long r1 = r10.A00
            r10 = 0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0386
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendmediamessagemanager/applyMediaFileReference file size from reference is 0.  filesize computed from file is = "
            java.lang.String r0 = X.AnonymousClass000.A0N(r8, r0, r3)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0386:
            java.util.Iterator r7 = X.AnonymousClass0x7.A0x(r7)
        L_0x038a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03a2
            X.1mV r3 = X.C18320x8.A0S(r7)
            monitor-enter(r3)
            X.33C r0 = X.C30471mV.A00(r3)     // Catch:{ all -> 0x039f }
            r0.A0F = r8     // Catch:{ all -> 0x039f }
            r3.A00 = r1     // Catch:{ all -> 0x039f }
            monitor-exit(r3)     // Catch:{ all -> 0x039f }
            goto L_0x038a
        L_0x039f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x039f }
            throw r0
        L_0x03a2:
            if (r5 == 0) goto L_0x043e
            X.1mV r0 = r9.A00()
            byte r3 = r0.A1I
            r2 = 0
            X.3Dh r1 = r4.A00     // Catch:{ IOException -> 0x03c1 }
            boolean r0 = r1.A0e(r5)     // Catch:{ IOException -> 0x03c1 }
            if (r0 != 0) goto L_0x03bf
            boolean r0 = r1.A0d(r5)     // Catch:{ IOException -> 0x03c1 }
            if (r0 == 0) goto L_0x03c7
            boolean r0 = r1.A0f(r5)     // Catch:{ IOException -> 0x03c1 }
            if (r0 != 0) goto L_0x03c7
        L_0x03bf:
            r2 = 1
            goto L_0x03c7
        L_0x03c1:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/isPrivateManagedMediaFile "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03c7:
            boolean r0 = r4.A07(r5)
            if (r0 == 0) goto L_0x043e
            int r0 = r4.A00(r5, r6)
            if (r2 == 0) goto L_0x043e
            if (r0 >= 0) goto L_0x043e
            r4.A03(r5, r3)
            return
        L_0x03d9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03d9 }
            throw r0
        L_0x03dc:
            java.lang.Object r5 = r15.A00
            X.2re r5 = (X.C56232re) r5
            java.lang.Object r4 = r15.A01
            X.30M r4 = (X.AnonymousClass30M) r4
            java.lang.Object r2 = r15.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/processmedia/file downloaded for "
            r1.append(r0)
            java.util.concurrent.CopyOnWriteArrayList r3 = r4.A02
            X.C18320x8.A1O(r1, r3)
            java.lang.String r0 = " messages; job="
            X.C18260x0.A1P(r1, r0, r2)
            X.32i r2 = r5.A0E
            r1 = 0
            goto L_0x045f
        L_0x03fd:
            java.lang.Object r4 = r15.A00
            X.2re r4 = (X.C56232re) r4
            java.lang.Object r5 = r15.A01
            X.30M r5 = (X.AnonymousClass30M) r5
            java.lang.Object r2 = r15.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/processmedia/response for "
            r1.append(r0)
            java.util.concurrent.CopyOnWriteArrayList r3 = r5.A02
            X.C18320x8.A1O(r1, r3)
            java.lang.String r0 = " messages; job="
            X.C18260x0.A1P(r1, r0, r2)
            X.32i r2 = r4.A0E
            r1 = 3
            X.4Ja r0 = new X.4Ja
            r0.<init>(r2, r1)
            X.C618132i.A00(r5, r0, r10)
            java.util.Iterator r3 = X.AnonymousClass0x7.A0x(r3)
        L_0x0429:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x043e
            X.34x r2 = X.C18300x5.A0T(r3)
            X.3Lv r1 = r4.A06
            r0 = -1
            r1.A0b(r2, r0)
            goto L_0x0429
        L_0x043a:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
        L_0x043e:
            return
        L_0x043f:
            java.lang.Object r5 = r15.A00
            X.2re r5 = (X.C56232re) r5
            java.lang.Object r4 = r15.A01
            X.30M r4 = (X.AnonymousClass30M) r4
            java.lang.Object r2 = r15.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/upload/enqueued for "
            r1.append(r0)
            java.util.concurrent.CopyOnWriteArrayList r3 = r4.A02
            X.C18320x8.A1O(r1, r3)
            java.lang.String r0 = " messages; job="
            X.C18260x0.A1P(r1, r0, r2)
            X.32i r2 = r5.A0E
            r1 = 4
        L_0x045f:
            X.92T r0 = new X.92T
            r0.<init>(r2, r1)
            X.C618132i.A00(r4, r0, r10)
            X.1io r1 = r5.A07
            r0 = -1
            r1.A0E(r3, r0)
            return
        L_0x046e:
            java.lang.Object r6 = r15.A00
            X.33d r6 = (X.C620133d) r6
            java.lang.Object r5 = r15.A01
            X.1mV r5 = (X.C30471mV) r5
            java.lang.Object r4 = r15.A02
            byte[] r10 = (byte[]) r10
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/ProgressiveJpeg/Refresh thumbnail; message.key="
            X.C624134x.A0S(r5, r0, r1)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r5.A04
            X.C18260x0.A1J(r1, r0)
            X.30w r0 = r5.A0y()
            if (r0 == 0) goto L_0x04a8
            if (r10 == 0) goto L_0x04a8
            int r0 = r10.length
            if (r0 <= 0) goto L_0x04a8
            X.2at r3 = r6.A0M
            X.30w r2 = r5.A0y()
            r1 = 45
            X.3aL r0 = new X.3aL
            r0.<init>(r5, r10, r4, r1)
            r3.A00(r2, r0)
        L_0x04a8:
            X.3Wi r4 = r6.A06
            X.1io r3 = r6.A0H
            r2 = 12
            r1 = 2
            X.3cY r0 = new X.3cY
            r0.<init>(r3, r5, r2, r1)
            r4.A0S(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86224Jh.AwB(java.lang.Object):void");
    }
}
