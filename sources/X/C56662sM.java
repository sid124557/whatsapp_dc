package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: X.2sM  reason: invalid class name and case insensitive filesystem */
public final class C56662sM {
    public final C28751hi A00;
    public final C58242uw A01;
    public final C623334p A02;
    public final AnonymousClass4FS A03;
    public final Object A04 = AnonymousClass002.A0D();
    public final Map A05;
    public final Map A06;

    public C27981fH A01(PhoneUserJid phoneUserJid) {
        Long l;
        Cursor A0E;
        long j;
        C162457s7.A0J(phoneUserJid, 0);
        C623334p r7 = this.A02;
        long A062 = r7.A06(phoneUserJid);
        if (A062 >= 0) {
            synchronized (this.A04) {
                SortedSet sortedSet = (SortedSet) C18280x3.A0W(this.A06, A062);
                if (sortedSet != null) {
                    Object obj = null;
                    if (!(sortedSet instanceof List)) {
                        Iterator it = sortedSet.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                obj = it.next();
                                if (!it.hasNext()) {
                                    break;
                                }
                            }
                        }
                    } else {
                        List list = (List) sortedSet;
                        if (!list.isEmpty()) {
                            obj = C18300x5.A0c(list);
                        }
                    }
                    l = (Long) obj;
                } else {
                    l = null;
                }
            }
            if (l == null) {
                AnonymousClass4GK A032 = this.A01.A00.get();
                try {
                    C56862sg r3 = ((AnonymousClass3H0) A032).A03;
                    String[] A1Y = AnonymousClass0x9.A1Y();
                    AnonymousClass0x2.A1S(A1Y, 0, A062);
                    A0E = r3.A0E("SELECT lid_row_id FROM jid_map WHERE jid_row_id = ? ORDER BY lid_row_id DESC LIMIT 1", "JidMapStore/GET_LID_BY_JID", A1Y);
                    int columnIndex = A0E.getColumnIndex("lid_row_id");
                    if (columnIndex < 0 || !A0E.moveToFirst()) {
                        A0E.close();
                        A032.close();
                        j = -1;
                    } else {
                        j = (long) A0E.getInt(columnIndex);
                        A0E.close();
                        A032.close();
                    }
                    l = Long.valueOf(j);
                } catch (Throwable th) {
                    try {
                        A032.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            long longValue = l.longValue();
            Jid A08 = r7.A08(longValue);
            if (A08 instanceof C27981fH) {
                C27981fH r6 = (C27981fH) A08;
                A08(longValue, A062);
                return r6;
            }
        }
        return null;
        throw th;
    }

    public PhoneUserJid A02(C27981fH r11) {
        Long l;
        Cursor A0E;
        long j;
        C162457s7.A0J(r11, 0);
        C623334p r7 = this.A02;
        long A052 = r7.A05(r11);
        if (A052 >= 0) {
            synchronized (this.A04) {
                l = (Long) C18280x3.A0W(this.A05, A052);
            }
            if (l == null) {
                AnonymousClass4GK A032 = this.A01.A00.get();
                try {
                    C56862sg r3 = ((AnonymousClass3H0) A032).A03;
                    String[] A1Y = AnonymousClass0x9.A1Y();
                    AnonymousClass0x2.A1S(A1Y, 0, A052);
                    A0E = r3.A0E("SELECT jid_row_id FROM jid_map WHERE lid_row_id = ?", "JidMapStore/GET_JID_BY_LID", A1Y);
                    int columnIndex = A0E.getColumnIndex("jid_row_id");
                    if (columnIndex < 0 || !A0E.moveToFirst()) {
                        A0E.close();
                        A032.close();
                        j = -1;
                    } else {
                        j = (long) A0E.getInt(columnIndex);
                        A0E.close();
                        A032.close();
                    }
                    l = Long.valueOf(j);
                } catch (Throwable th) {
                    try {
                        A032.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            long longValue = l.longValue();
            Jid A08 = r7.A08(longValue);
            if (A08 instanceof PhoneUserJid) {
                PhoneUserJid phoneUserJid = (PhoneUserJid) A08;
                A08(A052, longValue);
                return phoneUserJid;
            }
        }
        return null;
        throw th;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    public java.util.List A04(com.whatsapp.jid.PhoneUserJid r13) {
        /*
            r12 = this;
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.34p r7 = r12.A02
            long r10 = r7.A06(r13)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
            X.3d3 r8 = X.C72023d3.A00
        L_0x0012:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r8.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008c
            long r0 = X.C18270x1.A02(r2)
            com.whatsapp.jid.Jid r1 = r7.A08(r0)
            boolean r0 = r1 instanceof X.C27981fH
            if (r0 == 0) goto L_0x001a
            if (r1 == 0) goto L_0x001a
            r3.add(r1)
            goto L_0x001a
        L_0x0032:
            java.lang.Object r6 = r12.A04
            monitor-enter(r6)
            java.util.Map r5 = r12.A06     // Catch:{ all -> 0x00a3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r5.get(r4)     // Catch:{ all -> 0x00a3 }
            java.util.SortedSet r0 = (java.util.SortedSet) r0     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0048
            java.util.List r8 = X.C73723fy.A0F(r0)     // Catch:{ all -> 0x00a3 }
            goto L_0x008a
        L_0x0048:
            monitor-exit(r6)
            X.2uw r0 = r12.A01
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            X.3dV r0 = r0.A00
            X.4GK r9 = r0.get()
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0099 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = "SELECT lid_row_id FROM jid_map WHERE jid_row_id = ? ORDER BY lid_row_id DESC"
            java.lang.String[] r1 = X.C18260x0.A1b(r10)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "JidMapStore/GET_LIDS_BY_JID"
            android.database.Cursor r2 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "lid_row_id"
            int r1 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x008d }
            if (r1 < 0) goto L_0x0078
        L_0x006e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0078
            X.C18260x0.A0H(r2, r8, r1)     // Catch:{ all -> 0x008d }
            goto L_0x006e
        L_0x0078:
            r2.close()     // Catch:{ all -> 0x0099 }
            r9.close()
            monitor-enter(r6)
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch:{ all -> 0x00a3 }
            r0.<init>()     // Catch:{ all -> 0x00a3 }
            X.C73723fy.A0T(r8, r0)     // Catch:{ all -> 0x00a3 }
            r5.put(r4, r0)     // Catch:{ all -> 0x00a3 }
        L_0x008a:
            monitor-exit(r6)
            goto L_0x0012
        L_0x008c:
            return r3
        L_0x008d:
            r1 = move-exception
            if (r2 == 0) goto L_0x0098
            r2.close()     // Catch:{ all -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0099 }
        L_0x0098:
            throw r1     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x009e }
            throw r1
        L_0x009e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56662sM.A04(com.whatsapp.jid.PhoneUserJid):java.util.List");
    }

    public Set A07(UserJid userJid) {
        PhoneUserJid phoneUserJid;
        C162457s7.A0J(userJid, 0);
        if (userJid instanceof C27981fH) {
            phoneUserJid = A00(this, userJid);
        } else {
            if (userJid instanceof PhoneUserJid) {
                phoneUserJid = (PhoneUserJid) userJid;
            }
            return C18290x4.A13(userJid);
        }
        if (phoneUserJid != null) {
            LinkedHashSet A17 = AnonymousClass0x9.A17();
            A17.add(phoneUserJid);
            A17.addAll(A04(phoneUserJid));
            return A17;
        }
        return C18290x4.A13(userJid);
    }

    public void A09(C27981fH r13, PhoneUserJid phoneUserJid) {
        C85284Fq A042;
        C18270x1.A14(r13, phoneUserJid);
        C623334p r0 = this.A02;
        long A052 = r0.A05(r13);
        long A053 = r0.A05(phoneUserJid);
        if (A052 >= 0 && A053 >= 0 && A052 != A053 && !A0A(A052, A053)) {
            try {
                A042 = this.A01.A00.A04();
                ContentValues A062 = AnonymousClass0x9.A06();
                C18270x1.A0c(A062, "lid_row_id", A052);
                AnonymousClass3H0.A02(A062, A042, "jid_row_id", A053).A0C("jid_map", "JidMapStore/INSERT_MAPPING", A062, 5);
                A042.close();
                A08(A052, A053);
                this.A03.BkV(new C70253aC(this, 0, A052, A053), "WaJidMapRepository/setJidMapping");
                return;
            } catch (SQLException e) {
                Log.e("JidMapStore/upsertLidToJidMapping", e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    public boolean A0B(UserJid userJid, UserJid userJid2) {
        if (userJid == null) {
            return userJid2 == null;
        }
        if (!userJid.equals(userJid2)) {
            if ((!C627336j.A0M(userJid) || !C627336j.A0L(userJid2)) && (!C627336j.A0L(userJid) || !C627336j.A0M(userJid2))) {
                return false;
            }
            return C162457s7.A0P(A03(userJid), userJid2);
        }
    }

    public static PhoneUserJid A00(C56662sM r0, Object obj) {
        return r0.A02((C27981fH) obj);
    }

    public UserJid A03(UserJid userJid) {
        if (userJid == null) {
            return null;
        }
        if (C627336j.A0L(userJid)) {
            return A00(this, userJid);
        }
        return A01((PhoneUserJid) userJid);
    }

    public final void A08(long j, long j2) {
        synchronized (this.A04) {
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(j2);
            this.A05.put(valueOf, valueOf2);
            Map map = this.A06;
            Object obj = map.get(valueOf2);
            if (obj == null) {
                obj = new TreeSet();
                map.put(valueOf2, obj);
            }
            ((SortedSet) obj).add(valueOf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1 != 0) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(long r6, long r8) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.A04
            monitor-enter(r4)
            java.util.Map r0 = r5.A05     // Catch:{ all -> 0x0019 }
            java.lang.Object r0 = X.C18280x3.A0W(r0, r6)     // Catch:{ all -> 0x0019 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0016
            long r2 = r0.longValue()     // Catch:{ all -> 0x0019 }
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            monitor-exit(r4)
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56662sM.A0A(long, long):boolean");
    }

    public C56662sM(C28751hi r3, C58242uw r4, C623334p r5, AnonymousClass4FS r6) {
        C18260x0.A0Q(r5, r6);
        C162457s7.A0J(r3, 4);
        LinkedHashMap A0r = C18320x8.A0r();
        LinkedHashMap A0r2 = C18320x8.A0r();
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r4;
        this.A00 = r3;
        this.A05 = A0r;
        this.A06 = A0r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r0 == r2) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A05(java.util.Map r13) {
        /*
            r12 = this;
            java.util.ArrayList r4 = X.C18300x5.A0r(r13)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r11 = X.AnonymousClass000.A0q(r13)
        L_0x000c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0051
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r11)
            com.whatsapp.jid.Jid r7 = X.AnonymousClass0x9.A0R(r0)
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            X.34p r2 = r12.A02
            long r0 = r2.A05(r7)
            long r2 = r2.A05(r3)
            r9 = 0
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0039
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0039
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 1
            if (r6 != 0) goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            if (r5 == 0) goto L_0x000c
            boolean r5 = r12.A0A(r0, r2)
            if (r5 != 0) goto L_0x000c
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            X.AnonymousClass0x2.A1G(r1, r0, r8)
            r4.add(r7)
            goto L_0x000c
        L_0x0051:
            X.2uw r1 = r12.A01
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00b5
            X.3dV r0 = r1.A00     // Catch:{ SQLException -> 0x00ea }
            X.4Fq r7 = r0.A04()     // Catch:{ SQLException -> 0x00ea }
            X.3Yo r11 = r7.Axl()     // Catch:{ all -> 0x00ab }
            java.util.Iterator r10 = r8.iterator()     // Catch:{ all -> 0x00a1 }
        L_0x0067:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0097
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x00a1 }
            X.0PJ r1 = (X.AnonymousClass0PJ) r1     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x00a1 }
            long r5 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00a1 }
            long r1 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x00a1 }
            android.content.ContentValues r9 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "lid_row_id"
            X.C18270x1.A0c(r9, r0, r5)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "jid_row_id"
            X.2sg r3 = X.AnonymousClass3H0.A02(r9, r7, r0, r1)     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "jid_map"
            r1 = 5
            java.lang.String r0 = "JidMapStore/INSERT_MAPPING"
            r3.A0C(r2, r0, r9, r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x0067
        L_0x0097:
            r11.A00()     // Catch:{ all -> 0x00a1 }
            r11.close()     // Catch:{ all -> 0x00ab }
            r7.close()     // Catch:{ SQLException -> 0x00ea }
            goto L_0x00b5
        L_0x00a1:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ab }
        L_0x00aa:
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x00b4
        L_0x00b0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLException -> 0x00ea }
        L_0x00b4:
            throw r1     // Catch:{ SQLException -> 0x00ea }
        L_0x00b5:
            r6 = 1
            java.util.Iterator r5 = r8.iterator()
        L_0x00ba:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r1 = r5.next()
            X.0PJ r1 = (X.AnonymousClass0PJ) r1
            java.lang.Object r0 = r1.A00
            X.C162457s7.A0C(r0)
            long r2 = X.C18310x6.A0B(r0)
            java.lang.Object r0 = r1.A01
            X.C162457s7.A0C(r0)
            long r0 = X.C18310x6.A0B(r0)
            r12.A08(r2, r0)
            goto L_0x00ba
        L_0x00dc:
            X.4FS r2 = r12.A03
            r0 = 6
            X.3bx r1 = new X.3bx
            r1.<init>(r8, r0, r12)
            java.lang.String r0 = "WaJidMapRepository/setJidMapping"
            r2.BkV(r1, r0)
            goto L_0x00f1
        L_0x00ea:
            r1 = move-exception
            java.lang.String r0 = "JidMapStore/upsertLidToJidMapping"
            com.whatsapp.util.Log.e(r0, r1)
            r6 = 0
        L_0x00f1:
            if (r6 != 0) goto L_0x00f7
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
        L_0x00f7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56662sM.A05(java.util.Map):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r2.isEmpty() != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A06(java.util.Collection r12) {
        /*
            r11 = this;
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.LinkedHashMap r5 = X.C18320x8.A0r()
            java.util.Iterator r6 = r12.iterator()
        L_0x000c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004a
            com.whatsapp.jid.Jid r1 = X.AnonymousClass0x7.A0S(r6)
            X.34p r0 = r11.A02
            long r1 = r0.A05(r1)
            java.lang.Object r4 = r11.A04
            monitor-enter(r4)
            java.util.Map r0 = r11.A06     // Catch:{ all -> 0x0047 }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x0047 }
            java.util.SortedSet r2 = (java.util.SortedSet) r2     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0034
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x0047 }
            r0 = 0
            if (r1 == 0) goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            if (r0 == 0) goto L_0x003b
            r7.add(r3)     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x003b:
            java.lang.Object r0 = r2.last()     // Catch:{ all -> 0x0047 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0047 }
            r5.put(r3, r0)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r4)
            goto L_0x000c
        L_0x0047:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x004a:
            X.2uw r4 = r11.A01
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r7.iterator()
        L_0x0058:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006a
            long r0 = X.C18270x1.A02(r2)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r3.add(r0)
            goto L_0x0058
        L_0x006a:
            java.lang.String[] r0 = X.C58152un.A0N
            java.lang.Object[] r1 = r3.toArray(r0)
            X.3dV r0 = r4.A00
            X.4GK r10 = r0.get()
            r0 = 975(0x3cf, float:1.366E-42)
            X.3ct r9 = new X.3ct     // Catch:{ all -> 0x0141 }
            r9.<init>(r1, r0)     // Catch:{ all -> 0x0141 }
        L_0x007d:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String[] r4 = X.C71923ct.A01(r9)     // Catch:{ all -> 0x0141 }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0141 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0141 }
            int r2 = r4.length     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "SELECT lid_row_id, jid_row_id FROM jid_map WHERE jid_row_id IN "
            X.C57212tH.A02(r0, r1, r2)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = " ORDER BY lid_row_id DESC"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "GET_LIDS_BY_JIDS"
            android.database.Cursor r8 = r3.A0E(r1, r0, r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "lid_row_id"
            int r7 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "jid_row_id"
            int r4 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ca }
        L_0x00ae:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00c6
            long r2 = r8.getLong(r7)     // Catch:{ all -> 0x00ca }
            java.lang.Long r1 = X.C18280x3.A0T(r8, r4)     // Catch:{ all -> 0x00ca }
            boolean r0 = r6.containsKey(r1)     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x00ae
            X.AnonymousClass0x2.A1J(r1, r6, r2)     // Catch:{ all -> 0x00ca }
            goto L_0x00ae
        L_0x00c6:
            r8.close()     // Catch:{ all -> 0x0141 }
            goto L_0x007d
        L_0x00ca:
            r1 = move-exception
            if (r8 == 0) goto L_0x00d5
            r8.close()     // Catch:{ all -> 0x00d1 }
            goto L_0x00d5
        L_0x00d1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0141 }
        L_0x00d5:
            throw r1     // Catch:{ all -> 0x0141 }
        L_0x00d6:
            r10.close()
            java.util.Iterator r4 = X.AnonymousClass001.A0u(r6)
        L_0x00dd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0105
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r4)
            java.lang.Object r1 = r0.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            X.C162457s7.A0H(r0)
            long r2 = r0.longValue()
            X.C162457s7.A0H(r1)
            long r0 = r1.longValue()
            r11.A08(r2, r0)
            goto L_0x00dd
        L_0x0105:
            r5.putAll(r6)
            java.util.LinkedHashMap r7 = X.C18320x8.A0r()
            java.util.Iterator r6 = X.AnonymousClass000.A0q(r5)
        L_0x0110:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0140
            java.util.Map$Entry r5 = X.AnonymousClass001.A0w(r6)
            X.34p r4 = r11.A02
            java.lang.Class<X.1fH> r2 = X.C27981fH.class
            java.lang.Object r0 = r5.getValue()
            long r0 = X.C18310x6.A0B(r0)
            com.whatsapp.jid.Jid r3 = r4.A0B(r2, r0)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r2 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.Object r0 = r5.getKey()
            long r0 = X.C18310x6.A0B(r0)
            com.whatsapp.jid.Jid r0 = r4.A0B(r2, r0)
            if (r0 == 0) goto L_0x0110
            if (r3 == 0) goto L_0x0110
            r7.put(r0, r3)
            goto L_0x0110
        L_0x0140:
            return r7
        L_0x0141:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0146 }
            throw r1
        L_0x0146:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56662sM.A06(java.util.Collection):java.util.Map");
    }
}
