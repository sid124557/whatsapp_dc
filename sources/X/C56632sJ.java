package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.DeviceJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2sJ  reason: invalid class name and case insensitive filesystem */
public abstract class C56632sJ {
    public static int A06 = 200;
    public final C04840Qw A00 = new C04840Qw(250);
    public final C55682qk A01;
    public final C623334p A02;
    public final C55272q5 A03;
    public final C72303dV A04;
    public final C52382lO A05;

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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C40442Fv A01(X.C624134x r7) {
        /*
            r6 = this;
            r5 = r6
            boolean r0 = r6 instanceof X.AnonymousClass1R3
            if (r0 == 0) goto L_0x001c
            r4 = r6
            X.1R3 r4 = (X.AnonymousClass1R3) r4
            X.0Qw r3 = r4.A00
            X.2Fv r2 = A00(r3, r7)
            if (r2 != 0) goto L_0x0058
            long r1 = r7.A1L
            X.2z0 r0 = r7.A1J
            X.2Fv r2 = r4.A06(r0, r1)
            long r0 = r7.A1L
            monitor-enter(r5)
            goto L_0x0042
        L_0x001c:
            r1 = r6
            X.1R2 r1 = (X.AnonymousClass1R2) r1
            boolean r0 = r7 instanceof X.C30331mH
            X.C626936e.A0B(r0)
            X.0Qw r3 = r1.A00
            X.2Fv r2 = A00(r3, r7)
            if (r2 != 0) goto L_0x0058
            X.2z0 r0 = r7.A1J
            X.2Fv r2 = r1.A06(r0)
            long r0 = r7.A1L
            monitor-enter(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = r3.A04(r1)     // Catch:{ all -> 0x0055 }
            X.2Fv r0 = (X.C40442Fv) r0     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0053
            goto L_0x004e
        L_0x0042:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = r3.A04(r1)     // Catch:{ all -> 0x0055 }
            X.2Fv r0 = (X.C40442Fv) r0     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0053
        L_0x004e:
            r3.A08(r1, r2)     // Catch:{ all -> 0x0055 }
            monitor-exit(r5)
            return r2
        L_0x0053:
            monitor-exit(r5)
            return r0
        L_0x0055:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56632sJ.A01(X.34x):X.2Fv");
    }

    public static C40442Fv A00(C04840Qw r2, C624134x r3) {
        return (C40442Fv) r2.A04(Long.valueOf(r3.A1L));
    }

    public String A02(int i) {
        if (this instanceof AnonymousClass1R3) {
            C626936e.A0B(AnonymousClass001.A1W(i));
            StringBuilder A0A = C18330xA.A0A("INSERT INTO receipt_device (message_row_id, receipt_device_jid_row_id, primary_device_version) SELECT ?, ?, ?");
            for (int i2 = 1; i2 < i; i2++) {
                A0A.append(" UNION ALL SELECT ?,?,?");
            }
            return A0A.toString();
        }
        C626936e.A0B(AnonymousClass001.A1W(i));
        StringBuilder A0A2 = C18330xA.A0A("INSERT INTO message_add_on_receipt_device (message_add_on_row_id, receipt_device_jid_row_id, primary_device_version) SELECT ?, ?, ?");
        for (int i3 = 1; i3 < i; i3++) {
            A0A2.append(" UNION ALL SELECT ?,?,?");
        }
        return A0A2.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:37|38|81) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        A06 = java.lang.Math.max(10, A06 - 10);
        r4 = r4 / 2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C624134x r19, java.util.Set r20, boolean r21) {
        /*
            r18 = this;
            r4 = r20
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0173
            r10 = r19
            long r5 = r10.A1L
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0173
            r9 = r18
            X.0Qw r1 = r9.A00
            java.lang.Long r0 = X.C624134x.A0A(r10)
            java.lang.Object r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x003d
            X.2Fv r8 = new X.2Fv
            r8.<init>()
        L_0x0025:
            X.C626936e.A06(r8)
            X.2lO r3 = r9.A05
            X.2qk r2 = r9.A01
            int r1 = r4.size()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            X.C627336j.A0F(r2, r4, r0)
            java.util.Map r13 = r3.A01(r0)
            goto L_0x0042
        L_0x003d:
            X.2Fv r8 = A00(r1, r10)
            goto L_0x0025
        L_0x0042:
            X.3dV r0 = r9.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x016f }
            X.4Fq r7 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x016f }
            X.3Yo r17 = r7.Axl()     // Catch:{ all -> 0x0165 }
            r6 = 0
            r0 = 1
            if (r21 == 0) goto L_0x008e
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x015b }
            X.C624134x.A0Y(r10, r11, r6)     // Catch:{ all -> 0x015b }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x015b }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x015b }
            boolean r12 = r9 instanceof X.AnonymousClass1R3     // Catch:{ all -> 0x015b }
            if (r12 == 0) goto L_0x0066
            java.lang.String r3 = "receipt_device"
        L_0x0061:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x015b }
            goto L_0x0069
        L_0x0066:
            java.lang.String r3 = "message_add_on_receipt_device"
            goto L_0x0061
        L_0x0069:
            if (r12 == 0) goto L_0x006f
            java.lang.String r0 = "message_row_id"
            goto L_0x0071
        L_0x006f:
            java.lang.String r0 = "message_add_on_row_id"
        L_0x0071:
            r1.append(r0)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = " = ?"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x015b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x015b }
            if (r12 == 0) goto L_0x009f
            java.lang.String r0 = "MessageReceiptDeviceStore/"
        L_0x0082:
            r1.append(r0)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "addBlankReceiptsForTargetDevicesImpl/DELETE_RECEIPT_DEVICE"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x015b }
            r5.A07(r3, r2, r0, r11)     // Catch:{ all -> 0x015b }
        L_0x008e:
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r6]     // Catch:{ all -> 0x015b }
            java.lang.Object[] r11 = r4.toArray(r0)     // Catch:{ all -> 0x015b }
            com.whatsapp.jid.DeviceJid[] r11 = (com.whatsapp.jid.DeviceJid[]) r11     // Catch:{ all -> 0x015b }
            int r5 = r11.length     // Catch:{ all -> 0x015b }
            int r0 = A06     // Catch:{ all -> 0x015b }
            int r4 = java.lang.Math.min(r5, r0)     // Catch:{ all -> 0x015b }
            r3 = 0
            goto L_0x00a2
        L_0x009f:
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/"
            goto L_0x0082
        L_0x00a2:
            java.lang.String r12 = "INSERT_DEVICE_RECEIPT_SQL"
            if (r3 != 0) goto L_0x00d3
            java.lang.String r2 = r9.A02(r4)     // Catch:{ SQLiteException -> 0x00c5 }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ SQLiteException -> 0x00c5 }
            X.2sg r1 = r0.A03     // Catch:{ SQLiteException -> 0x00c5 }
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteException -> 0x00c5 }
            boolean r0 = r9 instanceof X.AnonymousClass1R3     // Catch:{ SQLiteException -> 0x00c5 }
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "MessageReceiptDeviceStore/"
        L_0x00b9:
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r12, r14)     // Catch:{ SQLiteException -> 0x00c5 }
            X.2sQ r3 = r1.A0G(r2, r0)     // Catch:{ SQLiteException -> 0x00c5 }
            goto L_0x00a2
        L_0x00c2:
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/"
            goto L_0x00b9
        L_0x00c5:
            int r1 = A06     // Catch:{ all -> 0x015b }
            r0 = 10
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x015b }
            A06 = r0     // Catch:{ all -> 0x015b }
            int r4 = r4 / 2
            goto L_0x00a2
        L_0x00d3:
            if (r5 <= 0) goto L_0x0147
            if (r4 <= r5) goto L_0x00f3
            java.lang.String r3 = r9.A02(r5)     // Catch:{ all -> 0x015b }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x015b }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x015b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x015b }
            boolean r0 = r9 instanceof X.AnonymousClass1R3     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = "MessageReceiptDeviceStore/"
        L_0x00ea:
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r12, r1)     // Catch:{ all -> 0x015b }
            X.2sQ r3 = r2.A0G(r3, r0)     // Catch:{ all -> 0x015b }
            r4 = r5
        L_0x00f3:
            r3.A02()     // Catch:{ all -> 0x015b }
            goto L_0x00fa
        L_0x00f7:
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/"
            goto L_0x00ea
        L_0x00fa:
            r16 = r6
            r2 = 1
        L_0x00fd:
            int r0 = r4 * 3
            if (r2 > r0) goto L_0x0141
            r15 = r11[r16]     // Catch:{ all -> 0x015b }
            r0 = 0
            X.2Vz r14 = new X.2Vz     // Catch:{ all -> 0x015b }
            r14.<init>(r0)     // Catch:{ all -> 0x015b }
            java.util.concurrent.ConcurrentHashMap r0 = r8.A00     // Catch:{ all -> 0x015b }
            r0.put(r15, r14)     // Catch:{ all -> 0x015b }
            long r0 = r10.A1L     // Catch:{ all -> 0x015b }
            r3.A06(r2, r0)     // Catch:{ all -> 0x015b }
            int r14 = r2 + 1
            X.34p r1 = r9.A02     // Catch:{ all -> 0x015b }
            r0 = r11[r16]     // Catch:{ all -> 0x015b }
            long r0 = r1.A05(r0)     // Catch:{ all -> 0x015b }
            r3.A06(r14, r0)     // Catch:{ all -> 0x015b }
            r0 = r11[r16]     // Catch:{ all -> 0x015b }
            com.whatsapp.jid.UserJid r0 = r0.userJid     // Catch:{ all -> 0x015b }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x015b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0133
            int r0 = r2 + 2
            r3.A05(r0)     // Catch:{ all -> 0x015b }
            goto L_0x013c
        L_0x0133:
            int r14 = r2 + 2
            long r0 = r0.longValue()     // Catch:{ all -> 0x015b }
            r3.A06(r14, r0)     // Catch:{ all -> 0x015b }
        L_0x013c:
            int r16 = r16 + 1
            int r2 = r2 + 3
            goto L_0x00fd
        L_0x0141:
            r3.A04()     // Catch:{ all -> 0x015b }
            int r6 = r6 + r4
            int r5 = r5 - r4
            goto L_0x00d3
        L_0x0147:
            r17.A00()     // Catch:{ all -> 0x015b }
            r1 = 48
            X.3aK r0 = new X.3aK     // Catch:{ all -> 0x015b }
            r0.<init>(r9, r10, r8, r1)     // Catch:{ all -> 0x015b }
            r7.B25(r0)     // Catch:{ all -> 0x015b }
            r17.close()     // Catch:{ all -> 0x0165 }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x016f }
            return
        L_0x015b:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0160 }
            goto L_0x0164
        L_0x0160:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0165 }
        L_0x0164:
            throw r1     // Catch:{ all -> 0x0165 }
        L_0x0165:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x016a }
            goto L_0x016e
        L_0x016a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x016f }
        L_0x016e:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x016f }
        L_0x016f:
            r0 = move-exception
            X.C55272q5.A00(r9, r0)
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56632sJ.A03(X.34x, java.util.Set, boolean):void");
    }

    public boolean A05(DeviceJid deviceJid, C624134x r10) {
        C40442Fv r0;
        Cursor A0E;
        Cursor A0E2;
        if (this instanceof AnonymousClass1R3) {
            r0 = A00(this.A00, r10);
            if (r0 == null) {
                String valueOf = String.valueOf(r10.A1L);
                String A042 = C623334p.A04(this.A02, deviceJid);
                String[] A1Z = AnonymousClass0x9.A1Z();
                C18280x3.A19(valueOf, A042, A1Z);
                try {
                    AnonymousClass4GK A032 = this.A04.get();
                    try {
                        A0E2 = ((AnonymousClass3H0) A032).A03.A0E("SELECT receipt_device_jid_row_id FROM receipt_device WHERE message_row_id = ? AND receipt_device_jid_row_id = ?", "MessageReceiptDeviceStore/GET_DEVICE_RECEIPT_SQL", A1Z);
                        boolean moveToNext = A0E2.moveToNext();
                        A0E2.close();
                        A032.close();
                        return moveToNext;
                    } catch (Throwable th) {
                        A032.close();
                        throw th;
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    C55272q5.A00(this, e);
                    return false;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } else {
            AnonymousClass1R2 r4 = (AnonymousClass1R2) this;
            r0 = A00(r4.A00, r10);
            if (r0 == null) {
                AnonymousClass2z0 r7 = r10.A1J;
                long A07 = r4.A00.A07(AnonymousClass2z0.A01(r7));
                String A043 = C623334p.A04(r4.A02, deviceJid);
                String[] strArr = new String[4];
                boolean A1W = AnonymousClass0x7.A1W(strArr, A07);
                strArr[1] = AnonymousClass2z0.A08(r7);
                strArr[2] = r7.A01;
                strArr[3] = A043;
                try {
                    AnonymousClass4GK A033 = r4.A04.get();
                    try {
                        A0E = ((AnonymousClass3H0) A033).A03.A0E("SELECT receipt_device_jid_row_id FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ? AND receipt_device_jid_row_id = ?", "MessageAddOnReceiptDeviceStore/GET_DEVICE_RECEIPT_SQL", strArr);
                        boolean moveToNext2 = A0E.moveToNext();
                        A0E.close();
                        A033.close();
                        return moveToNext2;
                    } catch (Throwable th3) {
                        A033.close();
                        throw th3;
                    }
                } catch (SQLiteDatabaseCorruptException e2) {
                    C55272q5.A00(r4, e2);
                    return A1W;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
        }
        return r0.A00.keySet().contains(deviceJid);
        throw th;
        throw th;
    }

    public C56632sJ(C55682qk r3, C623334p r4, C55272q5 r5, C72303dV r6, C52382lO r7) {
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
    }

    public void A04(Set set) {
        String str;
        String str2;
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DeviceJid A0R = AnonymousClass0x7.A0R(it);
            if (!AnonymousClass000.A1T(A0R.getDevice())) {
                hashSet.add(Long.toString(this.A02.A05(A0R)));
            }
        }
        if (!hashSet.isEmpty()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("receipt_device_jid_row_id");
            A0o.append(" IN ");
            A0o.append(C57212tH.A00(hashSet.size()));
            A0o.append(" AND ");
            A0o.append("receipt_device_timestamp");
            String A0X = AnonymousClass000.A0X(" IS NULL", A0o);
            C85284Fq A042 = this.A04.A04();
            try {
                C56862sg r5 = ((AnonymousClass3H0) A042).A03;
                boolean z = this instanceof AnonymousClass1R3;
                if (z) {
                    str = "receipt_device";
                } else {
                    str = "message_add_on_receipt_device";
                }
                String[] A1b = C18280x3.A1b(hashSet);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                if (z) {
                    str2 = "MessageReceiptDeviceStore/";
                } else {
                    str2 = "MessageAddOnReceiptDeviceStore/";
                }
                A0o2.append(str2);
                int A07 = r5.A07(str, A0X, AnonymousClass000.A0X("deleteCompanionReceiptsForUndeliveredMessages/DELETE_RECEIPT_DEVICE", A0o2), A1b);
                A042.close();
                if (A07 > 0) {
                    C18260x0.A1R(AnonymousClass000.A0l(str2), "deleteCompanionReceiptsForUndeliveredMessages/deviceIds = ", set);
                    this.A00.A07(-1);
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }
}
