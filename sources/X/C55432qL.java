package X;

import android.content.ContentValues;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractMap;

/* renamed from: X.2qL  reason: invalid class name and case insensitive filesystem */
public class C55432qL {
    public final C55682qk A00;
    public final C623334p A01;
    public final C72303dV A02;
    public final C56662sM A03;
    public final AnonymousClass2G1 A04;
    public final AnonymousClass4FS A05;

    public C55432qL(C55682qk r2, C623334p r3, C72303dV r4, C56662sM r5, AnonymousClass4FS r6) {
        AnonymousClass2G1 r0 = new AnonymousClass2G1();
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r0;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 183 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A00(java.util.Set r24) {
        /*
            r23 = this;
            r12 = r23
            X.34p r11 = r12.A01
            X.3dV r0 = r11.A01
            boolean r1 = X.C72303dV.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x000e
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x018b
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x018b
            java.util.HashMap r10 = X.AnonymousClass001.A0t()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r24.iterator()
        L_0x0022:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004e
            com.whatsapp.jid.Jid r2 = X.AnonymousClass0x7.A0S(r3)
            X.2G1 r0 = r12.A04
            java.util.Map r1 = r0.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r1.get(r2)
        L_0x003a:
            if (r0 == 0) goto L_0x0040
            r10.put(r2, r0)
            goto L_0x0022
        L_0x0040:
            long r0 = r11.A05(r2)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4.add(r0)
            goto L_0x0022
        L_0x004c:
            r0 = 0
            goto L_0x003a
        L_0x004e:
            java.lang.String[] r0 = X.C58152un.A0N
            java.lang.Object[] r1 = r4.toArray(r0)
            java.util.HashMap r9 = X.AnonymousClass001.A0t()
            X.3dV r0 = r12.A02
            X.4GK r16 = r0.get()
            monitor-enter(r12)     // Catch:{ all -> 0x0181 }
            java.util.HashSet r8 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x017e }
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x017e }
            X.3ct r15 = X.C71923ct.A00(r1)     // Catch:{ all -> 0x017e }
        L_0x006b:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x00dd
            java.lang.String[] r4 = X.C71923ct.A01(r15)     // Catch:{ all -> 0x017e }
            r0 = r16
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x017e }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x017e }
            int r2 = r4.length     // Catch:{ all -> 0x017e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x017e }
            java.lang.String r0 = "SELECT user_jid_row_id, device_jid_row_id, key_index FROM user_device WHERE user_jid_row_id IN "
            X.C57212tH.A02(r0, r1, r2)     // Catch:{ all -> 0x017e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x017e }
            java.lang.String r0 = "GET_DEVICE_JIDS_BY_USER_JIDS_SQL"
            android.database.Cursor r7 = r3.A0E(r1, r0, r4)     // Catch:{ all -> 0x017e }
            java.lang.String r0 = "user_jid_row_id"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "device_jid_row_id"
            int r5 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "key_index"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d1 }
        L_0x00a2:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00cd
            long r2 = r7.getLong(r6)     // Catch:{ all -> 0x00d1 }
            long r0 = r7.getLong(r5)     // Catch:{ all -> 0x00d1 }
            long r21 = r7.getLong(r4)     // Catch:{ all -> 0x00d1 }
            X.AnonymousClass0x2.A1Q(r8, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.Class<com.whatsapp.jid.UserJid> r13 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.UserJid r18 = X.C623334p.A02(r11, r13, r2)     // Catch:{ all -> 0x00d1 }
            X.C626936e.A06(r18)     // Catch:{ all -> 0x00d1 }
            X.2Ns r2 = new X.2Ns     // Catch:{ all -> 0x00d1 }
            r19 = r0
            r17 = r2
            r17.<init>(r18, r19, r21)     // Catch:{ all -> 0x00d1 }
            r14.add(r2)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a2
        L_0x00cd:
            r7.close()     // Catch:{ all -> 0x017e }
            goto L_0x006b
        L_0x00d1:
            r1 = move-exception
            if (r7 == 0) goto L_0x00dc
            r7.close()     // Catch:{ all -> 0x00d8 }
            goto L_0x00dc
        L_0x00d8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x017e }
        L_0x00dc:
            throw r1     // Catch:{ all -> 0x017e }
        L_0x00dd:
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            java.util.Map r6 = r11.A0D(r0, r8)     // Catch:{ all -> 0x017e }
            java.util.Iterator r5 = r14.iterator()     // Catch:{ all -> 0x017e }
        L_0x00e7:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0115
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x017e }
            X.2Ns r4 = (X.C42342Ns) r4     // Catch:{ all -> 0x017e }
            com.whatsapp.jid.UserJid r0 = r4.A02     // Catch:{ all -> 0x017e }
            java.lang.Object r3 = r9.get(r0)     // Catch:{ all -> 0x017e }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x017e }
            if (r3 != 0) goto L_0x0104
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x017e }
            r9.put(r0, r3)     // Catch:{ all -> 0x017e }
        L_0x0104:
            long r0 = r4.A00     // Catch:{ all -> 0x017e }
            java.lang.Object r2 = X.C18280x3.A0W(r6, r0)     // Catch:{ all -> 0x017e }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ all -> 0x017e }
            X.C626936e.A06(r2)     // Catch:{ all -> 0x017e }
            long r0 = r4.A01     // Catch:{ all -> 0x017e }
            X.AnonymousClass0x2.A1K(r2, r3, r0)     // Catch:{ all -> 0x017e }
            goto L_0x00e7
        L_0x0115:
            java.util.Iterator r5 = X.AnonymousClass001.A0u(r9)     // Catch:{ all -> 0x017e }
        L_0x0119:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x015d
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r5)     // Catch:{ all -> 0x017e }
            com.whatsapp.jid.UserJid r4 = X.C18320x8.A0P(r0)     // Catch:{ all -> 0x017e }
            X.7o6 r3 = new X.7o6     // Catch:{ all -> 0x017e }
            r3.<init>()     // Catch:{ all -> 0x017e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x017e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x017e }
            java.util.Iterator r2 = X.AnonymousClass000.A0q(r0)     // Catch:{ all -> 0x017e }
        L_0x0136:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x014e
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r2)     // Catch:{ all -> 0x017e }
            com.whatsapp.jid.DeviceJid r1 = X.AnonymousClass0x9.A0Q(r0)     // Catch:{ all -> 0x017e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x017e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x017e }
            r3.put(r1, r0)     // Catch:{ all -> 0x017e }
            goto L_0x0136
        L_0x014e:
            X.8OQ r1 = r3.build()     // Catch:{ all -> 0x017e }
            X.2G1 r0 = r12.A04     // Catch:{ all -> 0x017e }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x017e }
            r0.put(r4, r1)     // Catch:{ all -> 0x017e }
            r10.put(r4, r1)     // Catch:{ all -> 0x017e }
            goto L_0x0119
        L_0x015d:
            java.util.Iterator r2 = r24.iterator()     // Catch:{ all -> 0x017e }
        L_0x0161:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0179
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)     // Catch:{ all -> 0x017e }
            boolean r0 = r10.containsKey(r1)     // Catch:{ all -> 0x017e }
            if (r0 != 0) goto L_0x0161
            X.8OQ r0 = X.AnonymousClass8OQ.of()     // Catch:{ all -> 0x017e }
            r10.put(r1, r0)     // Catch:{ all -> 0x017e }
            goto L_0x0161
        L_0x0179:
            monitor-exit(r12)     // Catch:{ all -> 0x017e }
            r16.close()
            return r10
        L_0x017e:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x017e }
            throw r0     // Catch:{ all -> 0x0181 }
        L_0x0181:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0186 }
            throw r1
        L_0x0186:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x018b:
            java.util.HashMap r10 = X.AnonymousClass001.A0t()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55432qL.A00(java.util.Set):java.util.Map");
    }

    public void A01(C129526aS r18, UserJid userJid) {
        C85284Fq A042;
        C72303dV r9 = this.A02;
        C85284Fq A043 = r9.A04();
        try {
            C69833Yo Axl = A043.Axl();
            try {
                C172878Nf it = r18.iterator();
                while (true) {
                    UserJid userJid2 = userJid;
                    if (it.hasNext()) {
                        DeviceJid fromUserJidAndDeviceIdNullable = DeviceJid.getFromUserJidAndDeviceIdNullable(userJid2, AnonymousClass0x7.A0R(it).getDevice());
                        C626936e.A0D(AnonymousClass000.A1W(fromUserJidAndDeviceIdNullable), "DeviceJid must not be null");
                        if (fromUserJidAndDeviceIdNullable != null) {
                            C623334p r0 = this.A01;
                            long A052 = r0.A05(userJid2);
                            long A053 = r0.A05(fromUserJidAndDeviceIdNullable);
                            A042 = r9.A04();
                            C56862sg r13 = ((AnonymousClass3H0) A042).A03;
                            String[] A1Z = AnonymousClass0x9.A1Z();
                            C18260x0.A1X(A1Z, A052);
                            C18270x1.A1R(A1Z, A053);
                            int A07 = r13.A07("user_device", "user_jid_row_id= ? AND device_jid_row_id = ?", "DELETE_DEVICE_JID_SQL", A1Z);
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("device-store/removeDeviceForUser/removed: userJid=");
                            A0o.append(userJid2);
                            A0o.append(" deviceJid=");
                            A0o.append(fromUserJidAndDeviceIdNullable);
                            C18260x0.A0w(" result=", A0o, A07);
                            A042.close();
                        }
                    } else {
                        Axl.A00();
                        A02(A043, userJid2);
                        Axl.close();
                        A043.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A043.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final void A02(AnonymousClass4GK r5, UserJid userJid) {
        C71343bx r3 = new C71343bx(this, 19, userJid);
        AnonymousClass3H0 r52 = (AnonymousClass3H0) r5;
        C626936e.A0C(r52.A03.A00.inTransaction());
        AnonymousClass37P r2 = r52.A02;
        AnonymousClass31L r1 = new AnonymousClass31L(r2, 0, r3);
        Object obj = r2.A02.get();
        C626936e.A06(obj);
        ((AbstractMap) obj).put(userJid, r1);
    }

    public void A03(DeviceJid deviceJid, UserJid userJid, long j) {
        C85284Fq A042 = this.A02.A04();
        try {
            C623334p r0 = this.A01;
            long A052 = r0.A05(userJid);
            long A053 = r0.A05(deviceJid);
            ContentValues A0E = C18290x4.A0E();
            C18270x1.A0c(A0E, "user_jid_row_id", A052);
            C18270x1.A0c(A0E, "device_jid_row_id", A053);
            long A0C = AnonymousClass3H0.A02(A0E, A042, "key_index", j).A0C("user_device", "INSERT_DEVICE_JID_SQL", A0E, 4);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("device-store/addDeviceForUser/inserted: userJid=");
            A0o.append(userJid);
            A0o.append(" deviceJid=");
            A0o.append(deviceJid);
            A0o.append(" keyIndex=");
            A0o.append(j);
            C18260x0.A10(" result=", A0o, A0C);
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A04(UserJid userJid) {
        C85284Fq A042;
        C72303dV r1 = this.A02;
        C85284Fq A043 = r1.A04();
        try {
            C69833Yo Axl = A043.Axl();
            try {
                long A052 = this.A01.A05(userJid);
                A042 = r1.A04();
                int A07 = ((AnonymousClass3H0) A042).A03.A07("user_device", "user_jid_row_id= ?", "DELETE_DEVICE_OF_USER_JID_SQL", C18260x0.A1b(A052));
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("device-store/removeAllDeviceForUser/removed: userJid=");
                A0o.append(userJid);
                C18260x0.A0w(" result=", A0o, A07);
                A042.close();
                Axl.A00();
                A02(A043, userJid);
                Axl.close();
                A043.close();
                return;
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A043.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
