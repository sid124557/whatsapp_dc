package X;

import android.text.TextUtils;

/* renamed from: X.1Rx  reason: invalid class name and case insensitive filesystem */
public class C23261Rx extends AnonymousClass31D {
    public final C56972sr A00;
    public final C50632iV A01;
    public final AnonymousClass1R3 A02;
    public final C43582Sr A03;
    public final C46692c3 A04;
    public final C55832qz A05;

    /* JADX WARNING: Removed duplicated region for block: B:160:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x034b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass32H A0D(android.database.Cursor r35) {
        /*
            r34 = this;
            r10 = r35
            int r32 = X.AnonymousClass0x7.A02(r10)
            java.lang.String r0 = "key_remote_jid"
            int r31 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "key_from_me"
            int r30 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "key_id"
            int r29 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "remote_resource"
            int r28 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "status"
            int r27 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "receipt_device_timestamp"
            int r26 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "read_device_timestamp"
            int r25 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "played_device_timestamp"
            int r24 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "participant_hash"
            int r23 = r10.getColumnIndexOrThrow(r0)
            r9 = 0
            r1 = -1
        L_0x0045:
            boolean r0 = r10.moveToNext()
            if (r0 == 0) goto L_0x034c
            r0 = r32
            long r1 = r10.getLong(r0)
            int r9 = r9 + 1
            r0 = r30
            long r5 = r10.getLong(r0)
            r3 = 1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            r0 = r31
            X.4uZ r5 = X.AnonymousClass0x2.A0K(r10, r0)
            java.lang.String r6 = ", messageRowId="
            java.lang.String r4 = "receipt-device-db-migration/process-batch: chatJid="
            if (r5 != 0) goto L_0x0086
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r4)
            java.lang.String r0 = r10.getString(r0)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
            java.lang.String r0 = " SKIP Due to invalid chatJid."
            r3.append(r0)
        L_0x0082:
            X.AnonymousClass0x2.A19(r3)
            goto L_0x0045
        L_0x0086:
            r0 = r27
            int r7 = r10.getInt(r0)
            r0 = 6
            if (r7 != r0) goto L_0x009f
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A17(r5, r4, r6, r3)
            r3.append(r1)
            java.lang.String r0 = " SKIP Due to never send."
            X.C18260x0.A1J(r3, r0)
            goto L_0x0045
        L_0x009f:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0k(r5, r4)
            X.C18260x0.A12(r6, r0, r1)
            boolean r0 = X.C627336j.A0K(r5)
            java.lang.String r22 = ", userJid="
            r18 = 20
            java.lang.String r21 = "receipt-device-db-migration/process-batch: failed to insert blank receipt for messageRowId="
            r3 = 1
            r11 = r34
            if (r0 != 0) goto L_0x014d
            boolean r0 = r5 instanceof X.C135166kE
            if (r0 != 0) goto L_0x014d
            boolean r0 = r5 instanceof X.AnonymousClass1fI
            if (r0 != 0) goto L_0x0045
            r0 = r26
            long r16 = r10.getLong(r0)
            r0 = r25
            long r14 = r10.getLong(r0)
            r0 = r24
            long r12 = r10.getLong(r0)
            r6 = 0
            int r0 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0045
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0045
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0045
            r0 = r28
            java.lang.String r0 = r10.getString(r0)
            com.whatsapp.jid.Jid r7 = X.AnonymousClass32W.A00(r0)
            X.4uZ r7 = (X.C95814uZ) r7
            boolean r0 = r7 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x011d
            r0 = r29
            java.lang.String r4 = r10.getString(r0)
            X.2qz r0 = r11.A05     // Catch:{ SQLiteException -> 0x032f }
            X.34x r6 = X.C55832qz.A01(r7, r0, r4, r3)     // Catch:{ SQLiteException -> 0x032f }
            if (r6 == 0) goto L_0x0045
            X.1R3 r0 = r11.A02
            long r3 = r6.A1L
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            boolean r0 = r0.A07(r5, r3)
            if (r0 != 0) goto L_0x0114
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r21)
            r3.append(r1)
            java.lang.String r0 = ", broadcastJid="
            X.C18260x0.A1S(r3, r0, r7)
        L_0x0114:
            X.2iV r3 = r11.A01
            X.2z0 r0 = r6.A1J
            r3.A01(r0)
            goto L_0x0045
        L_0x011d:
            boolean r0 = r5 instanceof com.whatsapp.jid.UserJid
            X.C626936e.A0C(r0)
            boolean r0 = r5 instanceof X.AnonymousClass1fX
            if (r0 != 0) goto L_0x0045
            boolean r0 = r5 instanceof X.AnonymousClass1fY
            if (r0 != 0) goto L_0x0045
            boolean r0 = r5 instanceof X.AnonymousClass1fW
            if (r0 != 0) goto L_0x0045
            boolean r0 = r5 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x0045
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.1R3 r0 = r11.A02
            boolean r0 = r0.A07(r5, r1)
            if (r0 != 0) goto L_0x0045
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r21)
            r3.append(r1)
            r0 = r22
            r3.append(r0)
            r3.append(r5)
            goto L_0x0082
        L_0x014d:
            X.2qz r0 = r11.A05     // Catch:{ SQLiteException -> 0x0326 }
            X.34x r6 = X.C55122pp.A00(r0, r1)     // Catch:{ SQLiteException -> 0x0326 }
            r0 = r23
            java.lang.String r12 = r10.getString(r0)
            if (r6 == 0) goto L_0x0045
            X.2z0 r8 = r6.A1J
            X.4uZ r13 = r8.A00
            boolean r0 = X.C627336j.A0K(r13)
            if (r0 != 0) goto L_0x016a
            boolean r0 = r13 instanceof X.C135166kE
            if (r0 != 0) goto L_0x016a
            r3 = 0
        L_0x016a:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "chatJid="
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = "; jid="
            r4.append(r0)
            r4.append(r13)
            java.lang.String r0 = "; messageRowId="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "; remoteResourceJid="
            X.C624134x.A0R(r6, r0, r4)
            java.lang.String r0 = "; status="
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = "; type="
            X.C624134x.A0W(r6, r0, r4, r3)
            X.2c3 r3 = r11.A04
            r0 = 0
            X.2W3 r20 = r3.A00(r8, r0)
            X.2Sr r7 = r11.A03
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            X.3dV r3 = r7.A05
            X.4GK r15 = r3.get()
            r0 = r15
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x031c }
            X.2sg r14 = r0.A03     // Catch:{ all -> 0x031c }
            java.lang.String r13 = "SELECT jid FROM group_participants WHERE gjid = ?"
            java.lang.String[] r4 = X.C18270x1.A1a(r5)     // Catch:{ all -> 0x031c }
            java.lang.String r0 = "getGroupParticipantsSet/QUERY_GROUP_PARTICIPANTS"
            android.database.Cursor r4 = r14.A0E(r13, r0, r4)     // Catch:{ all -> 0x031c }
            java.lang.String r19 = "jid"
            r0 = r19
            int r13 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0310 }
        L_0x01c4:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0310 }
            if (r0 == 0) goto L_0x01e6
            java.lang.String r14 = r4.getString(r13)     // Catch:{ all -> 0x0310 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0310 }
            if (r0 == 0) goto L_0x01de
            X.2sr r0 = r7.A01     // Catch:{ all -> 0x0310 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r0)     // Catch:{ all -> 0x0310 }
            r6.add(r0)     // Catch:{ all -> 0x0310 }
            goto L_0x01c4
        L_0x01de:
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A09(r14)     // Catch:{ 24P -> 0x01c4 }
            r6.add(r0)     // Catch:{ 24P -> 0x01c4 }
            goto L_0x01c4
        L_0x01e6:
            r4.close()     // Catch:{ all -> 0x031c }
            r15.close()
            java.lang.String r0 = X.C620833k.A00(r6)
            boolean r0 = android.text.TextUtils.equals(r0, r12)
            if (r0 != 0) goto L_0x02b7
            X.4GK r18 = r3.get()
            r0 = r18
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x030b }
            X.2sg r13 = r0.A03     // Catch:{ all -> 0x030b }
            java.lang.String r4 = "SELECT jid, action, old_phash, new_phash FROM group_participants_history WHERE gjid = ? ORDER BY _id DESC"
            java.lang.String[] r3 = X.C18270x1.A1a(r5)     // Catch:{ all -> 0x030b }
            java.lang.String r0 = "getHistoricGroupParticipants/QUERY_GROUP_PARTICIPANTS_HISTORY"
            android.database.Cursor r13 = r13.A0E(r4, r0, r3)     // Catch:{ all -> 0x030b }
        L_0x020c:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x02ff }
            if (r0 == 0) goto L_0x02b0
            r0 = r19
            java.lang.String r3 = X.AnonymousClass0x2.A0Z(r13, r0)     // Catch:{ all -> 0x02ff }
            java.lang.String r0 = "action"
            int r15 = X.AnonymousClass0x2.A04(r13, r0)     // Catch:{ all -> 0x02ff }
            java.lang.String r0 = "old_phash"
            java.lang.String r17 = X.AnonymousClass0x2.A0Z(r13, r0)     // Catch:{ all -> 0x02ff }
            java.lang.String r0 = "new_phash"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r13, r0)     // Catch:{ all -> 0x02ff }
            boolean r0 = android.text.TextUtils.equals(r0, r12)     // Catch:{ all -> 0x02ff }
            if (r0 != 0) goto L_0x02ac
            java.lang.String r14 = ""
            boolean r0 = r3.equals(r14)     // Catch:{ all -> 0x02ff }
            if (r0 == 0) goto L_0x0245
            X.2sr r0 = r7.A01     // Catch:{ all -> 0x02ff }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)     // Catch:{ all -> 0x02ff }
            java.util.List r5 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x02ff }
            goto L_0x0275
        L_0x0245:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x02ff }
            java.lang.String r0 = ","
            java.lang.String[] r4 = android.text.TextUtils.split(r3, r0)     // Catch:{ all -> 0x02ff }
            int r0 = r4.length     // Catch:{ all -> 0x02ff }
            r33 = r0
            r3 = 0
        L_0x0253:
            r0 = r33
            if (r3 >= r0) goto L_0x0275
            r16 = r4[r3]     // Catch:{ all -> 0x02ff }
            r0 = r16
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x02ff }
            if (r0 == 0) goto L_0x026b
            X.2sr r0 = r7.A01     // Catch:{ all -> 0x02ff }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)     // Catch:{ all -> 0x02ff }
            r5.add(r0)     // Catch:{ all -> 0x02ff }
            goto L_0x0272
        L_0x026b:
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A09(r16)     // Catch:{ 24P -> 0x0272 }
            r5.add(r0)     // Catch:{ 24P -> 0x0272 }
        L_0x0272:
            int r3 = r3 + 1
            goto L_0x0253
        L_0x0275:
            r4 = 1
            if (r15 == r4) goto L_0x0293
            r3 = 2
            if (r15 == r3) goto L_0x0297
            r0 = 3
            if (r15 != r0) goto L_0x02b0
            int r0 = r5.size()     // Catch:{ all -> 0x02ff }
            if (r0 != r3) goto L_0x02b0
            java.lang.Object r0 = r5.get(r4)     // Catch:{ all -> 0x02ff }
            r6.remove(r0)     // Catch:{ all -> 0x02ff }
            java.lang.Object r0 = X.C18290x4.A0k(r5)     // Catch:{ all -> 0x02ff }
            r6.add(r0)     // Catch:{ all -> 0x02ff }
            goto L_0x029a
        L_0x0293:
            r6.removeAll(r5)     // Catch:{ all -> 0x02ff }
            goto L_0x029a
        L_0x0297:
            r6.addAll(r5)     // Catch:{ all -> 0x02ff }
        L_0x029a:
            r0 = r17
            boolean r0 = android.text.TextUtils.equals(r0, r12)     // Catch:{ all -> 0x02ff }
            if (r0 != 0) goto L_0x02ac
            java.lang.String r0 = X.C620833k.A00(r6)     // Catch:{ all -> 0x02ff }
            boolean r0 = android.text.TextUtils.equals(r0, r12)     // Catch:{ all -> 0x02ff }
            if (r0 == 0) goto L_0x020c
        L_0x02ac:
            r13.close()     // Catch:{ all -> 0x030b }
            goto L_0x02b4
        L_0x02b0:
            r13.close()     // Catch:{ all -> 0x030b }
            goto L_0x02f5
        L_0x02b4:
            r18.close()
        L_0x02b7:
            java.util.Iterator r5 = r6.iterator()
        L_0x02bb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02f8
            com.whatsapp.jid.UserJid r4 = X.C18310x6.A0T(r5)
            X.2sr r0 = r11.A00
            boolean r0 = r0.A0a(r4)
            if (r0 != 0) goto L_0x02bb
            r0 = r20
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r4)
            X.2z3 r0 = (X.C60722z3) r0
            if (r0 == 0) goto L_0x02e0
            int r3 = r0.A00()
            r0 = 4
            if (r3 != r0) goto L_0x02bb
        L_0x02e0:
            X.1R3 r0 = r11.A02
            boolean r0 = r0.A07(r4, r1)
            if (r0 != 0) goto L_0x02bb
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r21)
            r3.append(r1)
            r0 = r22
            X.C18260x0.A1S(r3, r0, r4)
            goto L_0x02bb
        L_0x02f5:
            r18.close()
        L_0x02f8:
            X.2iV r0 = r11.A01
            r0.A01(r8)
            goto L_0x0045
        L_0x02ff:
            r1 = move-exception
            if (r13 == 0) goto L_0x030a
            r13.close()     // Catch:{ all -> 0x0306 }
            goto L_0x030a
        L_0x0306:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x030b }
        L_0x030a:
            throw r1     // Catch:{ all -> 0x030b }
        L_0x030b:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0321 }
            throw r1
        L_0x0310:
            r1 = move-exception
            if (r4 == 0) goto L_0x031b
            r4.close()     // Catch:{ all -> 0x0317 }
            goto L_0x031b
        L_0x0317:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x031c }
        L_0x031b:
            throw r1     // Catch:{ all -> 0x031c }
        L_0x031c:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0321 }
            throw r1
        L_0x0321:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0326:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "receipt-device-db-migration/process-batch fail to read from message store for group/status chat, e="
            goto L_0x0337
        L_0x032f:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "receipt-device-db-migration/process-batch fail to read from message store, e="
        L_0x0337:
            X.C18260x0.A16(r0, r1, r3)
            long r1 = r11.A0B()
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x034b
            r1 = -1
            r0 = 0
            X.32H r3 = new X.32H
            r3.<init>(r1, r0)
            return r3
        L_0x034b:
            throw r3
        L_0x034c:
            X.32H r3 = new X.32H
            r3.<init>(r1, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23261Rx.A0D(android.database.Cursor):X.32H");
    }

    public boolean A0T(C44342Vr r5) {
        AnonymousClass4GK A032 = this.A05.get();
        try {
            if (TextUtils.isEmpty(C626235v.A00(((AnonymousClass3H0) A032).A03, "table", "messages"))) {
                A0I();
                A032.close();
                return true;
            }
            A032.close();
            return super.A0T(r5);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C23261Rx(C56972sr r3, C50632iV r4, AnonymousClass1R3 r5, C43582Sr r6, C46692c3 r7, AnonymousClass2U4 r8, C55832qz r9) {
        super(r8, "receipt_device", Integer.MIN_VALUE);
        this.A00 = r3;
        this.A05 = r9;
        this.A04 = r7;
        this.A03 = r6;
        this.A01 = r4;
        this.A02 = r5;
    }

    public void A0I() {
        super.A0I();
        this.A06.A03("receipt_device_migration_complete", 1);
    }
}
