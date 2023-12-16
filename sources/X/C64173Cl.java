package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Cl  reason: invalid class name and case insensitive filesystem */
public final class C64173Cl implements AnonymousClass4F2 {
    public final C55682qk A00;
    public final AnonymousClass1VX A01;
    public final C46482bh A02;
    public final CountDownLatch A03 = new CountDownLatch(1);
    public final AtomicBoolean A04 = C18280x3.A0l();
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06;
    public final AnonymousClass66R A07;
    public final C73693fv A08 = new C73693fv();
    public final C73693fv A09 = new C73693fv();

    public C64173Cl(C55682qk r3, AnonymousClass1VX r4, C46482bh r5, AnonymousClass4FS r6) {
        C162457s7.A0J(r6, 1);
        C18260x0.A0a(r4, r3, r5, 2);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A06 = C154517dI.A01(new C78843vf(r6));
        this.A05 = C154517dI.A01(new C78833ve(this));
        this.A07 = C154517dI.A01(new C78853vg(this));
    }

    public final Long A01(C52562lg r6) {
        C73693fv r4 = this.A08;
        int indexOf = r4.indexOf(r6);
        Long l = null;
        if (indexOf >= 0) {
            int i = indexOf + 1;
            for (int i2 = 0; i2 < i; i2++) {
                r4.A04();
            }
            C73693fv r1 = this.A09;
            C52562lg r0 = (C52562lg) r1.A03();
            if (r0 != null) {
                l = r0.A02;
            }
            r1.clear();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PreacksQueue/removeDeliveredPreacksFromNotSavedPreacks removed ");
            A0o.append(r1.size() + indexOf + 1);
            C18260x0.A19(" preacks, notSavedPreacks.size=", A0o, r4);
            C18260x0.A1J(A0o, " persistedPreacks.size=0");
        }
        return l;
    }

    public final void A03() {
        if (C18270x1.A1V(this.A05)) {
            Log.d("PreacksQueue/ensureLoaded");
            A04();
            if (!this.A03.await(60, TimeUnit.SECONDS)) {
                this.A00.A0A("failed_to_load_pre_acks", false, PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            }
        }
    }

    public final void A04() {
        if (C18270x1.A1V(this.A05) && !this.A04.getAndSet(true)) {
            Log.i("PreacksQueue/startLoadingAsync");
            ((C72173dI) this.A06.getValue()).execute(new C70013Zn(this, 45));
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PreacksQueue/startLoadingAsync starting a periodic writer writerDelayMs=");
            AnonymousClass66R r2 = this.A07;
            C18260x0.A1I(A0o, C18290x4.A0D(r2));
            A06(C18290x4.A0D(r2));
        }
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A05() {
        /*
            r16 = this;
            r3 = r16
            monitor-enter(r3)
            X.3fv r4 = r3.A08     // Catch:{ all -> 0x010a }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "PreacksQueue/writeNotSavedPreacks no new preacks to save, returning early"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x010a }
            goto L_0x0108
        L_0x0012:
            java.util.ArrayList r5 = X.AnonymousClass002.A0J(r4)     // Catch:{ all -> 0x010a }
            monitor-exit(r3)
            X.2bh r7 = r3.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x009f }
            java.lang.String r0 = "PreacksStore/insertMany size="
            X.C18260x0.A1B(r0, r1, r5)     // Catch:{ Exception -> 0x009f }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x009f }
            r0 = 64
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x009f }
            r12.<init>(r0)     // Catch:{ Exception -> 0x009f }
            r7.A00()     // Catch:{ Exception -> 0x009f }
            X.8qC r0 = r7.A04     // Catch:{ Exception -> 0x009f }
            X.4Fq r8 = X.C18630y0.A08(r0)     // Catch:{ Exception -> 0x009f }
            X.3Yo r10 = r8.Axl()     // Catch:{ all -> 0x0098 }
            java.util.Iterator r15 = r5.iterator()     // Catch:{ all -> 0x0091 }
        L_0x003e:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0087
            java.lang.Object r6 = r15.next()     // Catch:{ all -> 0x0091 }
            X.2lg r6 = (X.C52562lg) r6     // Catch:{ all -> 0x0091 }
            android.content.ContentValues r14 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0091 }
            r12.reset()     // Catch:{ all -> 0x0091 }
            X.36K r11 = r6.A01     // Catch:{ all -> 0x0091 }
            X.C68543To.A01(r11, r12)     // Catch:{ all -> 0x0091 }
            r12.toByteArray()     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "ptn"
            byte[] r0 = r12.toByteArray()     // Catch:{ all -> 0x0091 }
            r14.put(r1, r0)     // Catch:{ all -> 0x0091 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0091 }
            X.2sg r13 = r0.A03     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "preacks"
            r1 = 3
            java.lang.String r0 = "PreacksStore/INSERT_MANY"
            long r13 = r13.A0C(r2, r0, r14, r1)     // Catch:{ all -> 0x0091 }
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            long r1 = r6.A00     // Catch:{ all -> 0x0091 }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0091 }
            X.2lg r0 = new X.2lg     // Catch:{ all -> 0x0091 }
            r0.<init>(r11, r6, r1)     // Catch:{ all -> 0x0091 }
            r9.add(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x003e
        L_0x0087:
            r10.A00()     // Catch:{ all -> 0x0091 }
            r10.close()     // Catch:{ all -> 0x0098 }
            r8.close()     // Catch:{ Exception -> 0x009f }
            goto L_0x00c8
        L_0x0091:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ all -> 0x0098 }
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ Exception -> 0x009f }
            throw r0     // Catch:{ Exception -> 0x009f }
        L_0x009f:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PreacksStore/insertManyCatchingErrors failed to persist "
            X.C18260x0.A19(r0, r1, r5)
            java.lang.String r0 = " pre-acks"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A08(r0, r6)
            X.2qk r2 = r7.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "count="
            X.C18260x0.A19(r0, r1, r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "failed_to_persist_pre_acks"
            r2.A09(r0, r1, r6)
            X.3d3 r9 = X.C72023d3.A00
        L_0x00c8:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0109
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PreacksQueue/writeNotSavedPreacks "
            X.AnonymousClass000.A1H(r0, r1, r9)
            java.lang.String r0 = " preacks are persisted"
            X.C18260x0.A1J(r1, r0)
            monitor-enter(r3)
            X.3fv r0 = r3.A09     // Catch:{ all -> 0x010a }
            r0.addAll(r9)     // Catch:{ all -> 0x010a }
            int r1 = r4.size()     // Catch:{ all -> 0x010a }
            int r0 = r5.size()     // Catch:{ all -> 0x010a }
            int r2 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x010a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "PreacksQueue/writeNotSavedPreacks removing "
            r1.append(r0)     // Catch:{ all -> 0x010a }
            r1.append(r2)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = " from notSavedPreacks"
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x010a }
            r0 = 0
        L_0x0100:
            if (r0 >= r2) goto L_0x0108
            r4.A04()     // Catch:{ all -> 0x010a }
            int r0 = r0 + 1
            goto L_0x0100
        L_0x0108:
            monitor-exit(r3)
        L_0x0109:
            return
        L_0x010a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64173Cl.A05():void");
    }

    public final void A06(long j) {
        C626936e.A0C(C18270x1.A1V(this.A05));
        C18260x0.A10("PreacksQueue/scheduleWriter delayMs=", AnonymousClass001.A0o(), j);
        ((C72173dI) this.A06.getValue()).A04(new C70013Zn(this, 43), j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r0 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C52562lg r3) {
        /*
            r2 = this;
            X.36K r0 = r3.A01
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "ack"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "receipt"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            java.lang.String r0 = "Only ack/receipt can be pre-acked."
            X.C626936e.A0E(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PreacksQueue/add a pending ack "
            X.C18260x0.A1P(r1, r0, r3)
            monitor-enter(r2)
            X.3fv r0 = r2.A08     // Catch:{ all -> 0x002d }
            r0.add(r3)     // Catch:{ all -> 0x002d }
            monitor-exit(r2)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64173Cl.A07(X.2lg):void");
    }

    public void BUD() {
        Log.d("PreacksQueue/onHandlerDisconnected");
        if (C18270x1.A1V(this.A05)) {
            ((C72173dI) this.A06.getValue()).execute(new C70013Zn(this, 44));
        }
    }

    public void BUE() {
        Log.d("PreacksQueue/onHandlerOfflineProcessComplete");
        if (C18270x1.A1V(this.A05)) {
            ((C72173dI) this.A06.getValue()).execute(new C70013Zn(this, 46));
        }
    }

    public final C52562lg A00() {
        C52562lg r0;
        A03();
        synchronized (this) {
            r0 = (C52562lg) this.A08.A03();
            if (r0 == null) {
                r0 = (C52562lg) this.A09.A03();
            }
        }
        return r0;
    }

    public final List A02() {
        ArrayList A0J;
        A03();
        synchronized (this) {
            A0J = AnonymousClass002.A0J(this.A09);
            A0J.addAll(this.A08);
        }
        return A0J;
    }

    public final void A08(C52562lg r4) {
        C18260x0.A1P(C18270x1.A0X(r4), "PreacksQueue/removeDeliveredPreacks older or equal than lastDeliveredPreack=", r4);
        if (!C18270x1.A1V(this.A05)) {
            synchronized (this) {
                A01(r4);
            }
            return;
        }
        ((C72173dI) this.A06.getValue()).execute(new C70113Zy(this, 5, r4));
    }

    public final boolean A09() {
        boolean z;
        A03();
        synchronized (this) {
            z = true;
            if (!(!this.A09.isEmpty()) && !AnonymousClass0x7.A1S(this.A08)) {
                z = false;
            }
        }
        return z;
    }

    public /* synthetic */ void BUB() {
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUF() {
    }
}
