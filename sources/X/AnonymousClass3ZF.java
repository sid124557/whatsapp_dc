package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3ZF  reason: invalid class name */
public class AnonymousClass3ZF implements Cloneable {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public GroupJid A05;
    public AnonymousClass22I A06;
    public C53312mt A07;
    public String A08;
    public Map A09;
    public boolean A0A;
    public final long A0B;
    public final DeviceJid A0C;
    public final C30321mG A0D;
    public final AnonymousClass39J A0E;
    public final boolean A0F;
    public final boolean A0G;
    public volatile int A0H;
    public volatile C52222l8 A0I;
    public volatile C48292ef A0J;
    public volatile boolean A0K;
    public volatile boolean A0L;
    public transient boolean A0M;

    public synchronized long A05() {
        return this.A04;
    }

    public synchronized List A08() {
        return C18300x5.A0v(this.A09);
    }

    public synchronized Set A09() {
        return C18310x6.A0s(this.A09);
    }

    public synchronized void A0B() {
        this.A0M = false;
    }

    public synchronized void A0C(int i) {
        if (this.A00 != i) {
            this.A0M = true;
        }
        this.A00 = i;
    }

    public synchronized void A0D(int i) {
        if (this.A0H != i) {
            this.A0H = i;
            this.A0M = true;
        }
    }

    public synchronized void A0E(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            this.A0M = true;
        }
    }

    public synchronized void A0F(long j) {
        this.A04 = j;
    }

    public synchronized void A0G(C52222l8 r2) {
        this.A0I = r2;
        this.A0M = true;
    }

    public synchronized void A0H(GroupJid groupJid) {
        if (this.A05 != groupJid) {
            this.A0M = true;
        }
        this.A05 = groupJid;
    }

    public synchronized void A0I(UserJid userJid, int i) {
        AnonymousClass3ZE r1 = (AnonymousClass3ZE) this.A09.get(userJid);
        if (r1 != null) {
            synchronized (r1) {
                if (r1.A00 != i) {
                    r1.A00 = i;
                    r1.A03 = true;
                }
            }
        } else {
            AnonymousClass3ZE r2 = new AnonymousClass3ZE(userJid, i, -1);
            this.A09.put(r2.A02, r2);
            this.A0M = true;
        }
    }

    public synchronized void A0J(C53312mt r2) {
        this.A0A = true;
        this.A0M = true;
        this.A07 = r2;
    }

    public synchronized void A0K(String str) {
        if (this.A08 != null) {
            C626936e.A0D(false, "CallRandomId cannot be set twice!");
        } else {
            this.A0M = true;
            this.A08 = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0R() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A0M     // Catch:{ all -> 0x002c }
            r5 = 1
            if (r0 != 0) goto L_0x002a
            long r3 = r6.A04     // Catch:{ all -> 0x002c }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            java.util.Map r0 = r6.A09     // Catch:{ all -> 0x002c }
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r0)     // Catch:{ all -> 0x002c }
        L_0x0014:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x002c }
            X.3ZE r0 = (X.AnonymousClass3ZE) r0     // Catch:{ all -> 0x002c }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0014
            goto L_0x002a
        L_0x0027:
            monitor-exit(r6)
            r0 = 0
            return r0
        L_0x002a:
            monitor-exit(r6)
            return r5
        L_0x002c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZF.A0R():boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3ZF r7 = (AnonymousClass3ZF) obj;
            if (!(this.A04 == r7.A04 && this.A0E.equals(r7.A0E) && this.A0B == r7.A0B && this.A0L == r7.A0L && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A06 == r7.A06 && this.A0G == r7.A0G && this.A0F == r7.A0F && AnonymousClass75J.A00(this.A05, r7.A05) && this.A0K == r7.A0K && this.A02 == r7.A02 && this.A09.equals(r7.A09) && AnonymousClass75J.A00(this.A0C, r7.A0C) && AnonymousClass75J.A00(this.A08, r7.A08) && AnonymousClass75J.A00(this.A0I, r7.A0I) && this.A0H == r7.A0H && AnonymousClass75J.A00(this.A0J, r7.A0J))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZF(DeviceJid deviceJid, AnonymousClass39J r27, List list, long j, boolean z) {
        this((C52222l8) null, deviceJid, (GroupJid) null, (C30321mG) null, r27, AnonymousClass22I.NONE, (C53312mt) null, (C48292ef) null, (String) null, list == null ? Collections.emptyList() : list, 0, 0, 0, 0, -1, j, 0, z, false, false, false);
    }

    public static AnonymousClass3ZF A00(C30321mG r27, int i, int i2, long j, boolean z, boolean z2) {
        C30321mG r7 = r27;
        AnonymousClass2z0 r0 = r7.A1J;
        C95814uZ r2 = r0.A00;
        UserJid A032 = AnonymousClass32Y.A03(r2);
        if (A032 == null) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "CallLog/fromFMessage Legacy bad UserJid: ", r2);
            return null;
        }
        AnonymousClass39J r8 = new AnonymousClass39J(-1, A032, r0.A01, r0.A02);
        long j2 = r7.A0K;
        return new AnonymousClass3ZF((C52222l8) null, A032.getPrimaryDevice(), (GroupJid) null, r7, r8, AnonymousClass22I.NONE, (C53312mt) null, (C48292ef) null, (String) null, Collections.emptyList(), i, i2, 0, 0, -1, j2, j, z, true, z2, false);
    }

    public int A04(UserJid userJid) {
        AnonymousClass3ZE r0 = (AnonymousClass3ZE) this.A09.get(userJid);
        if (r0 != null) {
            return r0.A00;
        }
        return 2;
    }

    public AnonymousClass39J A06() {
        AnonymousClass39J r0 = this.A0E;
        UserJid userJid = r0.A01;
        boolean z = r0.A03;
        return new AnonymousClass39J(r0.A00, userJid, r0.A02, z);
    }

    public AnonymousClass22I A07() {
        boolean z;
        AnonymousClass22I r3 = this.A06;
        if ((r3 instanceof C34251uU) || (r3 instanceof AnonymousClass1uT) || (r3 instanceof C34241uS)) {
            z = !this.A0E.A03;
        } else {
            z = true;
        }
        C626936e.A0D(z, AnonymousClass000.A0P(r3, "CallLog/getNotificationSilenceReason Invalid call log for ", AnonymousClass001.A0o()));
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (A0M() != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r2 = this;
            int r1 = r2.A02
            r0 = 2
            if (r1 != r0) goto L_0x001e
            boolean r0 = r2.A0L()
            if (r0 == 0) goto L_0x0011
            X.39J r0 = r2.A0E
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0018
        L_0x0011:
            boolean r0 = r2.A0M()
            r1 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            java.lang.String r0 = "CallLog/isMissedCallDueToCallingPrivacy A 1:1 call silenced for privacy reasons should be a missed call."
            X.C626936e.A0D(r1, r0)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZF.A0A():void");
    }

    public boolean A0L() {
        if (this.A09.size() < 2 && this.A0I == null && this.A05 == null) {
            return false;
        }
        return true;
    }

    public boolean A0M() {
        if (this.A0E.A03 || this.A00 != 2) {
            return false;
        }
        return true;
    }

    public boolean A0Q() {
        int i;
        if (this.A0E.A03 || (i = this.A00) == 5 || i == 6) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[20];
        C18280x3.A1S(objArr, this.A04);
        objArr[1] = this.A0E;
        AnonymousClass0x2.A1U(objArr, this.A0B);
        objArr[3] = Boolean.valueOf(this.A0L);
        C18280x3.A1P(objArr, this.A01);
        C18320x8.A1R(objArr, this.A03);
        C18290x4.A1U(objArr, this.A00);
        objArr[7] = this.A06;
        objArr[8] = Boolean.valueOf(this.A0G);
        objArr[9] = Boolean.valueOf(this.A0F);
        objArr[10] = this.A09;
        objArr[11] = this.A05;
        objArr[12] = Boolean.valueOf(this.A0K);
        objArr[13] = this.A0C;
        objArr[14] = this.A08;
        objArr[15] = this.A07;
        objArr[16] = this.A0I;
        objArr[17] = Integer.valueOf(this.A0H);
        objArr[18] = Integer.valueOf(this.A02);
        return C18310x6.A08(this.A0J, objArr, 19);
    }

    public static Iterator A01(AnonymousClass3ZF r0) {
        return r0.A08().iterator();
    }

    public int A02() {
        Iterator A012 = A01(this);
        int i = 0;
        while (A012.hasNext()) {
            int i2 = ((AnonymousClass3ZE) A012.next()).A00;
            if (i2 == 5 || i2 == 100) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.A07 == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(X.C56972sr r5) {
        /*
            r4 = this;
            boolean r0 = r4.A0L()
            if (r0 == 0) goto L_0x000b
            X.2mt r1 = r4.A07
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r3 = -1
            if (r0 == 0) goto L_0x002c
            java.util.Iterator r2 = A01(r4)
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r2.next()
            X.3ZE r0 = (X.AnonymousClass3ZE) r0
            com.whatsapp.jid.UserJid r1 = r0.A02
            boolean r0 = r5.A0a(r1)
            if (r0 == 0) goto L_0x0013
            int r0 = r4.A04(r1)
            return r0
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZF.A03(X.2sr):int");
    }

    public boolean A0N() {
        A0A();
        boolean A1U = AnonymousClass000.A1U(this.A02, 2);
        if (!A0M() || !A1U) {
            return false;
        }
        return true;
    }

    public boolean A0O() {
        if (!A0M() || A07() != AnonymousClass22I.A04) {
            return false;
        }
        return true;
    }

    public boolean A0P() {
        if (!A0M()) {
            return false;
        }
        if (A07() == AnonymousClass22I.A03 || A07() == AnonymousClass22I.A02) {
            return true;
        }
        return false;
    }

    public boolean A0S(C56972sr r5) {
        if (A0L() && this.A07 != null) {
            Iterator A012 = A01(this);
            while (A012.hasNext()) {
                UserJid userJid = ((AnonymousClass3ZE) A012.next()).A02;
                if (r5.A0a(userJid)) {
                    return A0T(userJid);
                }
            }
        }
        return false;
    }

    public boolean A0T(UserJid userJid) {
        int A042 = A04(userJid);
        if (A042 == 5 || A042 == 100) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        AnonymousClass3ZF r5 = (AnonymousClass3ZF) super.clone();
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator A0q = AnonymousClass000.A0q(this.A09);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            A0r.put(C18320x8.A0P(A0w).clone(), ((AnonymousClass3ZE) A0w.getValue()).clone());
        }
        r5.A09 = A0r;
        return r5;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallLog[rowId=");
        A0o.append(this.A04);
        A0o.append(", key=");
        C18310x6.A1J(this.A0E, A0o);
        A0o.append(this.A0B);
        A0o.append(", videoCall=");
        A0o.append(this.A0L);
        A0o.append(", duration=");
        A0o.append(this.A01);
        A0o.append(", bytesTransferred=");
        A0o.append(this.A03);
        A0o.append(", callResult=");
        A0o.append(this.A00);
        A0o.append(", notificationSilenceReason=");
        A0o.append(this.A06);
        A0o.append(", isLegacy=");
        A0o.append(this.A0G);
        A0o.append(", fromMissedCall=");
        A0o.append(this.A0F);
        A0o.append(", groupJid=");
        A0o.append(this.A05);
        A0o.append(", isJoinableGroupCall=");
        A0o.append(this.A0K);
        A0o.append(", participants.size=");
        AnonymousClass0x7.A1H(A0o, this.A09);
        A0o.append(", callCreatorDeviceJid=");
        A0o.append(this.A0C);
        A0o.append(", callRandomId=");
        A0o.append(this.A08);
        A0o.append(", offerSilenceReason=");
        A0o.append(this.A02);
        A0o.append(", joinableData=");
        A0o.append(this.A07);
        A0o.append(", callLinkData=");
        A0o.append(this.A0I);
        A0o.append(", callType=");
        A0o.append(this.A0H);
        A0o.append(", scheduledData=");
        return AnonymousClass000.A0S(this.A0J, A0o);
    }

    public AnonymousClass3ZF(C52222l8 r5, DeviceJid deviceJid, GroupJid groupJid, C30321mG r8, AnonymousClass39J r9, AnonymousClass22I r10, C53312mt r11, C48292ef r12, String str, Collection collection, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A09 = C18320x8.A0r();
        this.A0E = r9;
        this.A0D = r8;
        this.A04 = j;
        this.A0B = j2;
        this.A0L = z;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = r10;
        this.A03 = j3;
        this.A0G = z2;
        this.A0F = z3;
        this.A05 = groupJid;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZE r2 = (AnonymousClass3ZE) it.next();
            this.A09.put(r2.A02, r2);
        }
        this.A0K = z4;
        this.A0C = deviceJid;
        this.A08 = str;
        this.A02 = i3;
        this.A07 = r11;
        this.A0I = r5;
        this.A0H = i4;
        this.A0J = r12;
    }
}
