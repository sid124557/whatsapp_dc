package X;

import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.3Li  reason: invalid class name and case insensitive filesystem */
public class C66413Li implements AnonymousClass485 {
    public C68403Ta A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final C48372en A03;
    public final C29441ip A04;
    public final C64773Ex A05;
    public final C50552iM A06;
    public final C56882si A07;
    public final C56612sH A08;
    public final C56662sM A09;
    public final AnonymousClass33Z A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass31C A0C;
    public final ConcurrentHashMap A0D = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A0E = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A0F = AnonymousClass0x9.A1D();

    public final synchronized C68403Ta A03() {
        C68403Ta r0;
        r0 = this.A00;
        if (r0 == null) {
            AnonymousClass1VX r4 = this.A0B;
            C55682qk r1 = this.A01;
            AnonymousClass31C r5 = this.A0C;
            r0 = new C68403Ta(r1, new AnonymousClass3F2(this), this.A09, r4, r5);
            this.A00 = r0;
        }
        return r0;
    }

    public C66413Li(C55682qk r2, C56972sr r3, C48372en r4, C29441ip r5, C64773Ex r6, C50552iM r7, C56882si r8, C56612sH r9, C56662sM r10, AnonymousClass33Z r11, AnonymousClass1VX r12, AnonymousClass31C r13) {
        this.A08 = r9;
        this.A0B = r12;
        this.A01 = r2;
        this.A02 = r3;
        this.A0C = r13;
        this.A05 = r6;
        this.A09 = r10;
        this.A03 = r4;
        this.A0A = r11;
        this.A06 = r7;
        this.A04 = r5;
        this.A07 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r9 == X.AnonymousClass227.A01) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A00(X.AnonymousClass227 r19, java.lang.String r20) {
        /*
            r18 = this;
            long r16 = android.os.SystemClock.elapsedRealtime()
            X.227 r0 = X.AnonymousClass227.A0D
            r5 = 0
            r7 = 1
            r9 = r19
            if (r9 == r0) goto L_0x0011
            X.227 r1 = X.AnonymousClass227.A01
            r0 = 0
            if (r9 != r1) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.C626936e.A0C(r0)
            r2 = r18
            X.1ip r0 = r2.A04
            boolean r0 = r0.A0F()
            r10 = 0
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.304 r0 = X.AnonymousClass304.A04
        L_0x0027:
            android.util.Pair r5 = android.util.Pair.create(r0, r10)
            return r5
        L_0x002c:
            java.util.concurrent.ConcurrentHashMap r4 = r2.A0E
            r11 = r20
            java.lang.Object r0 = r4.putIfAbsent(r11, r11)
            if (r0 == 0) goto L_0x0042
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: skip too frequent query for phone "
            X.C18260x0.A0q(r0, r11, r1)
            X.304 r0 = X.AnonymousClass304.A08
            goto L_0x0027
        L_0x0042:
            java.lang.String r0 = "sync_sid_query"
            java.lang.String r3 = X.C621733w.A00(r0)
            X.3Ta r6 = r2.A03()     // Catch:{ all -> 0x013b }
            X.2en r0 = r2.A03     // Catch:{ all -> 0x013b }
            int r12 = r0.A00()     // Catch:{ all -> 0x013b }
            X.1VX r1 = r2.A0B     // Catch:{ all -> 0x013b }
            r0 = 5290(0x14aa, float:7.413E-42)
            X.2vE r8 = X.C58422vE.A02     // Catch:{ all -> 0x013b }
            boolean r13 = r1.A0Y(r8, r0)     // Catch:{ all -> 0x013b }
            r0 = 5751(0x1677, float:8.059E-42)
            boolean r14 = r1.A0Y(r8, r0)     // Catch:{ all -> 0x013b }
            boolean r15 = X.C56952sp.A0F(r1)     // Catch:{ all -> 0x013b }
            X.2x2 r8 = X.C59512x2.A00(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x013b }
            r0 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.Future r8 = r6.A04(r8, r3, r0)     // Catch:{ all -> 0x013b }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x0127, ExecutionException -> 0x0119, InterruptedException -> 0x0108 }
            r8.get(r0, r6)     // Catch:{ TimeoutException -> 0x0127, ExecutionException -> 0x0119, InterruptedException -> 0x0108 }
            java.util.concurrent.ConcurrentHashMap r1 = r2.A0F     // Catch:{ all -> 0x013b }
            java.lang.Object r8 = r1.get(r3)     // Catch:{ all -> 0x013b }
            X.2Kc r8 = (X.C41402Kc) r8     // Catch:{ all -> 0x013b }
            if (r8 != 0) goto L_0x00a0
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: empty sync result for "
            r5.append(r0)     // Catch:{ all -> 0x013b }
            r5.append(r11)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = " (syncId is "
            r5.append(r0)     // Catch:{ all -> 0x013b }
            r5.append(r3)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = ")"
            X.C18260x0.A1K(r5, r0)     // Catch:{ all -> 0x013b }
            X.304 r0 = X.AnonymousClass304.A03     // Catch:{ all -> 0x013b }
            android.util.Pair r5 = android.util.Pair.create(r0, r10)     // Catch:{ all -> 0x013b }
            goto L_0x0101
        L_0x00a0:
            X.2UJ[] r6 = r8.A01     // Catch:{ all -> 0x013b }
            int r0 = r6.length     // Catch:{ all -> 0x013b }
            if (r0 != 0) goto L_0x00d7
            X.2Tz r0 = r8.A00     // Catch:{ all -> 0x013b }
            X.2al r0 = r0.A02     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x00c7
            java.lang.Integer r0 = r0.A00     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x00c7
            int r5 = r0.intValue()     // Catch:{ all -> 0x013b }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r5 != r0) goto L_0x00c7
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: rate-limit-error "
            X.C18260x0.A0r(r0, r11, r5)     // Catch:{ all -> 0x013b }
            X.304 r0 = X.AnonymousClass304.A05     // Catch:{ all -> 0x013b }
            android.util.Pair r5 = android.util.Pair.create(r0, r10)     // Catch:{ all -> 0x013b }
            goto L_0x0101
        L_0x00c7:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: no users for "
            X.C18260x0.A0r(r0, r11, r5)     // Catch:{ all -> 0x013b }
            X.304 r0 = X.AnonymousClass304.A03     // Catch:{ all -> 0x013b }
            android.util.Pair r5 = android.util.Pair.create(r0, r10)     // Catch:{ all -> 0x013b }
            goto L_0x0101
        L_0x00d7:
            r13 = r6[r5]     // Catch:{ all -> 0x013b }
            int r0 = r13.A04     // Catch:{ all -> 0x013b }
            if (r0 != r7) goto L_0x00ec
            X.3Ex r6 = r2.A05     // Catch:{ all -> 0x013b }
            com.whatsapp.jid.UserJid r0 = r13.A0D     // Catch:{ all -> 0x013b }
            X.3ZH r15 = X.C64773Ex.A00(r6, r0)     // Catch:{ all -> 0x013b }
            X.2iM r12 = r2.A06     // Catch:{ all -> 0x013b }
            X.2Tz r14 = r8.A00     // Catch:{ all -> 0x013b }
            r12.A00(r13, r14, r15, r16)     // Catch:{ all -> 0x013b }
        L_0x00ec:
            java.util.List r0 = r13.A0K     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x00fb
            int r0 = r0.size()     // Catch:{ all -> 0x013b }
            if (r0 <= 0) goto L_0x00fb
            java.util.List r0 = r13.A0K     // Catch:{ all -> 0x013b }
            r0.get(r5)     // Catch:{ all -> 0x013b }
        L_0x00fb:
            X.304 r0 = X.AnonymousClass304.A06     // Catch:{ all -> 0x013b }
            android.util.Pair r5 = android.util.Pair.create(r0, r13)     // Catch:{ all -> 0x013b }
        L_0x0101:
            r4.remove(r11)
            r1.remove(r3)
            return r5
        L_0x0108:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "ContactQuerySync/querySyncPhoneNumber: exception during Query Sync "
            X.C18260x0.A0u(r0, r11, r1, r5)     // Catch:{ all -> 0x013b }
            X.304 r0 = X.AnonymousClass304.A02     // Catch:{ all -> 0x013b }
            android.util.Pair r5 = android.util.Pair.create(r0, r10)     // Catch:{ all -> 0x013b }
            goto L_0x0132
        L_0x0119:
            r1 = move-exception
            java.lang.String r0 = "querySyncPhoneNumber"
            r2.A04(r0, r1)     // Catch:{ all -> 0x013b }
            X.304 r0 = X.AnonymousClass304.A03     // Catch:{ all -> 0x013b }
            android.util.Pair r5 = android.util.Pair.create(r0, r10)     // Catch:{ all -> 0x013b }
            goto L_0x0132
        L_0x0127:
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber/timeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x013b }
            X.304 r0 = X.AnonymousClass304.A03     // Catch:{ all -> 0x013b }
            android.util.Pair r5 = android.util.Pair.create(r0, r10)     // Catch:{ all -> 0x013b }
        L_0x0132:
            r4.remove(r11)
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0F
            r0.remove(r3)
            return r5
        L_0x013b:
            r1 = move-exception
            r4.remove(r11)
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0F
            r0.remove(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66413Li.A00(X.227, java.lang.String):android.util.Pair");
    }

    public Pair A01(AnonymousClass227 r18, List list) {
        String A002;
        List list2;
        Pair pair;
        Pair pair2;
        Integer num;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C626936e.A0C(true);
        if (!this.A04.A0F()) {
            Log.i("ContactQuerySyncManager/querySyncPhoneNumbers: network_unavailable");
            return Pair.create(AnonymousClass304.A04, (Object) null);
        }
        A002 = C621733w.A00("sync_sid_query");
        try {
            C68403Ta A032 = A03();
            int A003 = this.A03.A00();
            boolean A0F2 = C56952sp.A0F(this.A0B);
            C626936e.A0C(true);
            ArrayList A0s = AnonymousClass001.A0s();
            list2 = list;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C618832q r0 = new C618832q((UserJid) null, AnonymousClass001.A0m(it));
                r0.A0C = true;
                r0.A0L = true;
                r0.A0J = true;
                r0.A0B = true;
                r0.A0F = true;
                r0.A0H = true;
                r0.A0M = A0F2;
                C618832q.A02(r0, A0s);
            }
            A032.A04(new C59512x2(r18, A0s, A003, true), A002, 32000).get(32000, TimeUnit.MILLISECONDS);
            ConcurrentHashMap concurrentHashMap = this.A0F;
            C41402Kc r9 = (C41402Kc) concurrentHashMap.get(A002);
            if (r9 == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("ContactQuerySyncManager/querySyncPhoneNumbers: empty sync result for ");
                A0o.append(list2);
                A0o.append(" (syncId is ");
                A0o.append(A002);
                C18260x0.A1K(A0o, ")");
                pair2 = Pair.create(AnonymousClass304.A03, (Object) null);
            } else {
                if (r0 == 0) {
                    C45902al r02 = r9.A00.A02;
                    if (r02 == null || (num = r02.A00) == null || num.intValue() != 429) {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "ContactQuerySyncManager/querySyncPhoneNumbers: no users for ", list2);
                        pair2 = Pair.create(AnonymousClass304.A03, (Object) null);
                    } else {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "ContactQuerySyncManager/querySyncPhoneNumbers: rate-limit-error ", list2);
                        pair2 = Pair.create(AnonymousClass304.A05, (Object) null);
                    }
                } else {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    for (AnonymousClass2UJ r12 : r9.A01) {
                        if (r12.A04 == 1) {
                            this.A06.A00(r12, r9.A00, C64773Ex.A00(this.A05, r12.A0D), elapsedRealtime);
                            A0s2.add(r12);
                        }
                        List list3 = r12.A0K;
                        if (list3 != null && list3.size() > 0) {
                            r12.A0K.get(0);
                        }
                    }
                    pair2 = Pair.create(AnonymousClass304.A06, (AnonymousClass2UJ[]) A0s2.toArray(new AnonymousClass2UJ[0]));
                }
            }
            concurrentHashMap.remove(A002);
            return pair2;
        } catch (TimeoutException unused) {
            Log.e("ContactQuerySyncManager/querySyncPhoneNumbers/timeout");
            pair = Pair.create(AnonymousClass304.A03, (Object) null);
        } catch (ExecutionException e) {
            A04("querySyncPhoneNumber", e);
            pair = Pair.create(AnonymousClass304.A03, (Object) null);
        } catch (InterruptedException e2) {
            C18260x0.A0k(list2, "ContactQuerySync/querySyncPhoneNumbers: exception during Query Sync ", AnonymousClass001.A0o(), e2);
            pair = Pair.create(AnonymousClass304.A02, (Object) null);
        } catch (Throwable th) {
            this.A0F.remove(A002);
            throw th;
        }
        this.A0F.remove(A002);
        return pair;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r9 == X.AnonymousClass227.A01) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass304 A02(X.AnonymousClass227 r19, com.whatsapp.jid.UserJid r20) {
        /*
            r18 = this;
            long r16 = android.os.SystemClock.elapsedRealtime()
            X.227 r0 = X.AnonymousClass227.A0D
            r8 = 0
            r5 = 1
            r9 = r19
            if (r9 == r0) goto L_0x0011
            X.227 r1 = X.AnonymousClass227.A01
            r0 = 0
            if (r9 != r1) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.C626936e.A0C(r0)
            r1 = r18
            X.1ip r0 = r1.A04
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "ContactQuerySyncManager/querySyncJid: network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.304 r2 = X.AnonymousClass304.A04
            return r2
        L_0x0027:
            java.util.concurrent.ConcurrentHashMap r4 = r1.A0D
            r10 = r20
            java.lang.Object r0 = r4.putIfAbsent(r10, r10)
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactQuerySyncManager/querySyncJid: skip too frequent query for jid "
            X.C18260x0.A1P(r1, r0, r10)
            X.304 r2 = X.AnonymousClass304.A08
            return r2
        L_0x003d:
            java.lang.String r0 = "sync_sid_query"
            java.lang.String r0 = X.C621733w.A00(r0)
            X.3Ta r6 = r1.A03()     // Catch:{ Exception -> 0x00f7 }
            r11 = 0
            X.2en r2 = r1.A03     // Catch:{ Exception -> 0x00f7 }
            int r12 = r2.A00()     // Catch:{ Exception -> 0x00f7 }
            X.1VX r7 = r1.A0B     // Catch:{ Exception -> 0x00f7 }
            r2 = 5290(0x14aa, float:7.413E-42)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ Exception -> 0x00f7 }
            boolean r13 = r7.A0Y(r3, r2)     // Catch:{ Exception -> 0x00f7 }
            r2 = 5751(0x1677, float:8.059E-42)
            boolean r14 = r7.A0Y(r3, r2)     // Catch:{ Exception -> 0x00f7 }
            boolean r15 = X.C56952sp.A0F(r7)     // Catch:{ Exception -> 0x00f7 }
            X.2x2 r7 = X.C59512x2.A00(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00f7 }
            r2 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.Future r7 = r6.A04(r7, r0, r2)     // Catch:{ Exception -> 0x00f7 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x00ef, ExecutionException -> 0x00e5 }
            r7.get(r2, r6)     // Catch:{ TimeoutException -> 0x00ef, ExecutionException -> 0x00e5 }
            java.util.concurrent.ConcurrentHashMap r6 = r1.A0F     // Catch:{ Exception -> 0x00f7 }
            java.lang.Object r7 = r6.get(r0)     // Catch:{ Exception -> 0x00f7 }
            X.2Kc r7 = (X.C41402Kc) r7     // Catch:{ Exception -> 0x00f7 }
            if (r7 != 0) goto L_0x0098
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r2 = "ContactQuerySyncManager/querySyncJid: empty sync result for "
            r3.append(r2)     // Catch:{ Exception -> 0x00f7 }
            r3.append(r10)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r2 = " (syncId is "
            r3.append(r2)     // Catch:{ Exception -> 0x00f7 }
            r3.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r2 = ")"
            X.C18260x0.A1K(r3, r2)     // Catch:{ Exception -> 0x00f7 }
            X.304 r2 = X.AnonymousClass304.A03     // Catch:{ Exception -> 0x00f7 }
            goto L_0x00de
        L_0x0098:
            X.2UJ[] r3 = r7.A01     // Catch:{ Exception -> 0x00f7 }
            int r2 = r3.length     // Catch:{ Exception -> 0x00f7 }
            if (r2 != 0) goto L_0x00c7
            X.2Tz r2 = r7.A00     // Catch:{ Exception -> 0x00f7 }
            X.2al r2 = r2.A02     // Catch:{ Exception -> 0x00f7 }
            if (r2 == 0) goto L_0x00bb
            java.lang.Integer r2 = r2.A00     // Catch:{ Exception -> 0x00f7 }
            if (r2 == 0) goto L_0x00bb
            int r3 = r2.intValue()     // Catch:{ Exception -> 0x00f7 }
            r2 = 429(0x1ad, float:6.01E-43)
            if (r3 != r2) goto L_0x00bb
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r2 = "ContactQuerySyncManager/querySyncJid: rate-limit-error "
            X.C18260x0.A1Q(r3, r2, r10)     // Catch:{ Exception -> 0x00f7 }
            X.304 r2 = X.AnonymousClass304.A05     // Catch:{ Exception -> 0x00f7 }
            goto L_0x00de
        L_0x00bb:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r2 = "ContactQuerySyncManager/querySyncJid: no users for "
            X.C18260x0.A1Q(r3, r2, r10)     // Catch:{ Exception -> 0x00f7 }
            X.304 r2 = X.AnonymousClass304.A03     // Catch:{ Exception -> 0x00f7 }
            goto L_0x00de
        L_0x00c7:
            r13 = r3[r8]     // Catch:{ Exception -> 0x00f7 }
            int r2 = r13.A04     // Catch:{ Exception -> 0x00f7 }
            if (r2 != r5) goto L_0x00dc
            X.3Ex r3 = r1.A05     // Catch:{ Exception -> 0x00f7 }
            com.whatsapp.jid.UserJid r2 = r13.A0D     // Catch:{ Exception -> 0x00f7 }
            X.3ZH r15 = X.C64773Ex.A00(r3, r2)     // Catch:{ Exception -> 0x00f7 }
            X.2iM r12 = r1.A06     // Catch:{ Exception -> 0x00f7 }
            X.2Tz r14 = r7.A00     // Catch:{ Exception -> 0x00f7 }
            r12.A00(r13, r14, r15, r16)     // Catch:{ Exception -> 0x00f7 }
        L_0x00dc:
            X.304 r2 = X.AnonymousClass304.A06     // Catch:{ Exception -> 0x00f7 }
        L_0x00de:
            r4.remove(r10)
            r6.remove(r0)
            return r2
        L_0x00e5:
            r3 = move-exception
            java.lang.String r2 = "querySyncJid"
            r1.A04(r2, r3)     // Catch:{ Exception -> 0x00f7 }
            X.304 r2 = X.AnonymousClass304.A03     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0106
        L_0x00ef:
            java.lang.String r2 = "ContactQuerySyncManager/querySyncJid/timeout"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x00f7 }
            X.304 r2 = X.AnonymousClass304.A03     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0106
        L_0x00f7:
            r5 = move-exception
            java.lang.String r2 = "ContactQuerySync/querySyncJid/exception thrown"
            com.whatsapp.util.Log.e(r2, r5)     // Catch:{ all -> 0x010f }
            X.2qk r3 = r1.A01     // Catch:{ all -> 0x010f }
            java.lang.String r2 = "ContactQuerySync/querySyncJid"
            X.C55682qk.A05(r3, r2, r5)     // Catch:{ all -> 0x010f }
            X.304 r2 = X.AnonymousClass304.A02     // Catch:{ all -> 0x010f }
        L_0x0106:
            r4.remove(r10)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A0F
            r1.remove(r0)
            return r2
        L_0x010f:
            r2 = move-exception
            r4.remove(r10)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A0F
            r1.remove(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66413Li.A02(X.227, com.whatsapp.jid.UserJid):X.304");
    }

    public final void A04(String str, ExecutionException executionException) {
        if ((executionException.getCause() instanceof RuntimeException) || ((executionException.getCause() instanceof Error) && !(executionException.getCause() instanceof AssertionError) && !(executionException.getCause() instanceof OutOfMemoryError))) {
            C55682qk.A04(this.A01, AnonymousClass000.A0V("ContactQuerySync/", str, AnonymousClass001.A0o()), executionException);
        }
    }
}
