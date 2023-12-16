package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2s7  reason: invalid class name and case insensitive filesystem */
public class C56522s7 {
    public final C56972sr A00;
    public final C72303dV A01;
    public final C54652p4 A02;
    public final C56662sM A03;
    public final C49012fq A04;
    public final C55432qL A05;
    public final C48062eH A06;
    public final C183538qC A07;
    public volatile String A08;

    public void A02() {
        String str;
        synchronized (this) {
            C56972sr r2 = this.A00;
            if (C56972sr.A03(r2) == null) {
                str = null;
            } else {
                HashSet A15 = AnonymousClass0x9.A15(this.A04.A00().keySet());
                A15.add(C56972sr.A03(r2));
                str = C621933y.A03(A15);
            }
            this.A08 = str;
        }
    }

    public AnonymousClass8OQ A00() {
        C172878Nf A0M = C18310x6.A0M(this.A04.A00());
        C160667o6 r3 = new C160667o6();
        while (A0M.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0M);
            if (!((AnonymousClass33G) A0w.getValue()).A02()) {
                r3.put(A0w.getKey(), A0w.getValue());
            }
        }
        return r3.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if ((!r17) != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r0 > 0) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass8OQ A01(com.whatsapp.jid.UserJid r21) {
        /*
            r20 = this;
            r2 = r20
            X.2sr r0 = r2.A00
            r8 = r21
            boolean r0 = r0.A0a(r8)
            r1 = r0 ^ 1
            java.lang.String r0 = "only get user for others"
            X.C626936e.A0F(r1, r0)
            X.2qL r5 = r2.A05
            X.34p r11 = r5.A01
            X.3dV r0 = r11.A01
            boolean r0 = X.C72303dV.A00(r0)
            if (r0 != 0) goto L_0x0023
            X.8OQ r0 = X.AnonymousClass8OQ.of()
            return r0
        L_0x0023:
            X.2G1 r0 = r5.A04
            java.util.Map r7 = r0.A00
            boolean r0 = r7.containsKey(r8)
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r7.get(r8)
            X.8OQ r0 = (X.AnonymousClass8OQ) r0
            if (r0 == 0) goto L_0x0036
            return r0
        L_0x0036:
            long r0 = r11.A05(r8)
            X.3dV r2 = r5.A02
            X.4GK r19 = r2.get()
            monitor-enter(r5)     // Catch:{ all -> 0x010a }
            r2 = r19
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x0107 }
            X.2sg r4 = r2.A03     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = "SELECT device_jid_row_id, key_index FROM user_device WHERE user_jid_row_id = ?"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0107 }
            X.C18260x0.A1Y(r2, r0)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = "GET_DEVICE_JIDS_BY_USER_JID_SQL"
            android.database.Cursor r6 = r4.A0E(r3, r0, r2)     // Catch:{ all -> 0x0107 }
            X.7o6 r18 = new X.7o6     // Catch:{ all -> 0x00fb }
            r18.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "device_jid_row_id"
            int r10 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "key_index"
            int r9 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fb }
            java.util.HashSet r4 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x00fb }
        L_0x006b:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00dc
            long r2 = r6.getLong(r10)     // Catch:{ all -> 0x00fb }
            long r0 = r6.getLong(r9)     // Catch:{ all -> 0x00fb }
            com.whatsapp.jid.Jid r14 = r11.A08(r2)     // Catch:{ all -> 0x00fb }
            com.whatsapp.jid.DeviceJid r13 = com.whatsapp.jid.DeviceJid.of(r14)     // Catch:{ all -> 0x00fb }
            if (r13 == 0) goto L_0x00a5
            int r12 = r13.getDevice()     // Catch:{ all -> 0x00fb }
            boolean r17 = X.AnonymousClass000.A1T(r12)     // Catch:{ all -> 0x00fb }
            r15 = 0
            if (r17 == 0) goto L_0x0097
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r12 == 0) goto L_0x009b
            r12 = r17 ^ 1
            if (r12 == 0) goto L_0x00a5
        L_0x0097:
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x00a5
        L_0x009b:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00fb }
            r0 = r18
            r0.put(r13, r1)     // Catch:{ all -> 0x00fb }
            goto L_0x006b
        L_0x00a5:
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fb }
            java.lang.String r12 = "DeviceStore/getDevicesForUser/invalid devices jid="
            r15.append(r12)     // Catch:{ all -> 0x00fb }
            r15.append(r14)     // Catch:{ all -> 0x00fb }
            java.lang.String r12 = "; deviceJidRowId="
            r15.append(r12)     // Catch:{ all -> 0x00fb }
            r15.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r12 = "; keyIndex="
            X.C18260x0.A11(r12, r15, r0)     // Catch:{ all -> 0x00fb }
            if (r13 != 0) goto L_0x00d8
            X.2qk r13 = r5.A00     // Catch:{ all -> 0x00fb }
            java.lang.String r12 = "invalid-device"
            if (r14 != 0) goto L_0x00cf
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00fb }
        L_0x00ca:
            r0 = 0
            r13.A0A(r12, r0, r1)     // Catch:{ all -> 0x00fb }
            goto L_0x006b
        L_0x00cf:
            int r0 = r14.getType()     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00fb }
            goto L_0x00ca
        L_0x00d8:
            r4.add(r13)     // Catch:{ all -> 0x00fb }
            goto L_0x006b
        L_0x00dc:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00fb }
            if (r0 != 0) goto L_0x00e9
            X.4FS r1 = r5.A05     // Catch:{ all -> 0x00fb }
            r0 = 15
            X.C70343aL.A01(r1, r5, r8, r4, r0)     // Catch:{ all -> 0x00fb }
        L_0x00e9:
            X.8OQ r0 = r18.build()     // Catch:{ all -> 0x00fb }
            r7.put(r8, r0)     // Catch:{ all -> 0x00fb }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x00fb }
            r6.close()     // Catch:{ all -> 0x0107 }
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
            r19.close()
            return r0
        L_0x00fb:
            r1 = move-exception
            if (r6 == 0) goto L_0x0106
            r6.close()     // Catch:{ all -> 0x0102 }
            goto L_0x0106
        L_0x0102:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0107 }
        L_0x0106:
            throw r1     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x010a:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x010f }
            throw r1
        L_0x010f:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56522s7.A01(com.whatsapp.jid.UserJid):X.8OQ");
    }

    public final void A04(C129526aS r9, C129526aS r10, C129526aS r11, UserJid userJid) {
        boolean z;
        PhoneUserJid A002;
        PhoneUserJid A003;
        C69833Yo Axl;
        PhoneUserJid A004;
        C47482dK r3 = (C47482dK) this.A07.get();
        if (!r11.isEmpty()) {
            if (r3.A06.A0X()) {
                C71343bx.A00(r3.A0C, r3, r11, 17);
            } else {
                C48972fm.A02(r3.A07, new C71343bx(r3, 18, r11));
            }
        }
        if (!r10.isEmpty() && !r11.isEmpty()) {
            HashSet A15 = AnonymousClass0x9.A15(r9);
            A15.removeAll(r11);
            A15.addAll(r10);
            C56892sj r0 = r3.A0A;
            C129526aS copyOf = C129526aS.copyOf((Collection) A15);
            C620533h r5 = r0.A09;
            if (!copyOf.isEmpty()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("participant-user-store/onDevicesRefreshed/");
                A0o.append(userJid);
                C18260x0.A1R(A0o, "/", copyOf);
                Set<C28011fL> A0B = r5.A0B(userJid);
                HashMap A0t = AnonymousClass001.A0t();
                for (C28011fL A072 : A0B) {
                    C620833k A073 = r5.A07(A072);
                    C42052Mp A082 = A073.A08(copyOf, userJid);
                    if (A073.A00 != 0 && C627336j.A0L(userJid)) {
                        boolean A0P = A073.A0P(r5.A01);
                        C60842zG A052 = A073.A05(userJid);
                        if (A052 != null && ((A052.A01 != 0 || A0P) && (A004 = C56662sM.A00(r5.A0C, userJid)) != null)) {
                            A073.A08(C620533h.A00(copyOf, A004), A004);
                        }
                    }
                    if (A082.A00 || A082.A01) {
                        AnonymousClass000.A1C(A073, A0t, A082.A02);
                    }
                }
                if (!A0t.isEmpty()) {
                    C85284Fq A022 = C620533h.A02(r5);
                    try {
                        Axl = A022.Axl();
                        Iterator A0u = AnonymousClass001.A0u(A0t);
                        while (A0u.hasNext()) {
                            Map.Entry A0w = AnonymousClass001.A0w(A0u);
                            r5.A0H((C620833k) A0w.getKey(), userJid, AnonymousClass001.A1Z(A0w.getValue()));
                        }
                        Axl.A00();
                        Axl.close();
                        A022.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            A022.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (!r10.isEmpty()) {
            C620533h r4 = r3.A0A.A09;
            if (!r10.isEmpty()) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("participant-user-store/onDevicesAdded/");
                A0o2.append(userJid);
                C18260x0.A1R(A0o2, "/", r10);
                Set<C28011fL> A0B2 = r4.A0B(userJid);
                HashSet A0K = AnonymousClass002.A0K();
                for (C28011fL A074 : A0B2) {
                    C620833k A075 = r4.A07(A074);
                    r4.A0D(r10, A075, userJid);
                    if (A075.A00 != 0 && C627336j.A0L(userJid)) {
                        boolean A0P2 = A075.A0P(r4.A01);
                        C60842zG A053 = A075.A05(userJid);
                        if (A053 != null && ((A053.A01 != 0 || A0P2) && (A003 = C56662sM.A00(r4.A0C, userJid)) != null)) {
                            r4.A0D(C620533h.A00(r10, A003), A075, A003);
                        }
                    }
                    A0K.add(A075);
                }
                r4.A0K(userJid, A0K, false);
                return;
            }
            return;
        } else if (!r11.isEmpty()) {
            C620533h r52 = r3.A0A.A09;
            if (!r11.isEmpty()) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("participant-user-store/onDevicesRemoved/");
                A0o3.append(userJid);
                C18260x0.A1R(A0o3, "/", r11);
                Set<C28011fL> A0B3 = r52.A0B(userJid);
                HashSet A0K2 = AnonymousClass002.A0K();
                boolean z2 = false;
                for (C28011fL A076 : A0B3) {
                    C620833k A077 = r52.A07(A076);
                    boolean A0N = A077.A0N(r11, userJid);
                    if (A077.A00 != 0 && C627336j.A0L(userJid)) {
                        boolean A0P3 = A077.A0P(r52.A01);
                        C60842zG A054 = A077.A05(userJid);
                        if (A054 != null && ((A054.A01 != 0 || A0P3) && (A002 = C56662sM.A00(r52.A0C, userJid)) != null)) {
                            z = A077.A0N(C620533h.A00(r11, A002), A002);
                            z2 = z2 | z | A0N;
                            A0K2.add(A077);
                        }
                    }
                    z = false;
                    z2 = z2 | z | A0N;
                    A0K2.add(A077);
                }
                r52.A0K(userJid, A0K2, z2);
                return;
            }
            return;
        } else {
            return;
        }
        throw th;
    }

    public final void A05(C129526aS r13, C129526aS r14, C129526aS r15, UserJid userJid, boolean z, boolean z2) {
        C47482dK r6 = (C47482dK) this.A07.get();
        C129526aS r9 = r15;
        UserJid userJid2 = userJid;
        if (!r15.isEmpty()) {
            Set A0C = r6.A0A.A09.A0C(r15);
            boolean z3 = z2;
            if (r6.A06.A0X()) {
                r6.A0C.BkM(new C70643ap(r6, A0C, userJid2, r9, 2, z3));
            }
            C48972fm.A02(r6.A07, new C70643ap(r6, A0C, userJid2, r9, 3, z3));
        }
        if (!r14.isEmpty() || !r15.isEmpty() || !z) {
            if (C18280x3.A1W(AnonymousClass0x2.A0F(r6.A05), "security_notifications") && z) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18270x1.A1H(A0o, "device-change-manager/showDeviceChangeSecurityNotifications/device-added:", r14);
                C18260x0.A1J(A0o, C18300x5.A0k(r15, ", device-removed:", A0o));
                C56972sr r2 = r6.A00;
                if (r2.A0a(userJid2)) {
                    Iterator it = r6.A03.A05().iterator();
                    while (it.hasNext()) {
                        r2.A0a(C18300x5.A0P(it));
                    }
                } else if (!r13.isEmpty()) {
                    if (r6.A03.A0D(userJid2)) {
                        C66543Lv r4 = r6.A09;
                        C56832sd r22 = r6.A0B;
                        C31061ng r23 = new C31061ng(C56832sd.A00(userJid2, r22), r6.A04.A0H());
                        r23.A1J(userJid2);
                        r4.A08(r23);
                    }
                    Iterator it2 = r6.A00(userJid2).iterator();
                    while (it2.hasNext()) {
                        C95814uZ A0P = C18300x5.A0P(it2);
                        C66543Lv r42 = r6.A09;
                        C56832sd r24 = r6.A0B;
                        C31061ng r25 = new C31061ng(C56832sd.A00(A0P, r24), r6.A04.A0H());
                        r25.A1J(userJid2);
                        r42.A08(r25);
                    }
                }
            }
        } else if (C18280x3.A1W(AnonymousClass0x2.A0F(r6.A05), "security_notifications")) {
            if (r6.A03.A0D(userJid2)) {
                C66543Lv r43 = r6.A09;
                C56832sd r26 = r6.A0B;
                C31061ng r27 = new C31061ng(C56832sd.A00(userJid2, r26), r6.A04.A0H());
                r27.A1J(userJid2);
                r43.A08(r27);
            }
            Iterator it3 = r6.A00(userJid2).iterator();
            while (it3.hasNext()) {
                C95814uZ A0P2 = C18300x5.A0P(it3);
                C66543Lv r44 = r6.A09;
                C56832sd r28 = r6.A0B;
                C31061ng r29 = new C31061ng(C56832sd.A00(A0P2, r28), r6.A04.A0H());
                r29.A1J(userJid2);
                r44.A08(r29);
            }
        }
        if (r6.A00.A0a(userJid2)) {
            AnonymousClass367.A02(new AnonymousClass4KE(1), r15);
        }
    }

    public void A06(C129526aS r21, boolean z) {
        Log.i("DeviceManager/removeMyDevices/start");
        C56972sr r2 = this.A00;
        C129526aS r12 = r21;
        C626936e.A0F(!r12.contains(C56972sr.A03(r2)), "never remove my primary device.");
        if (!r12.isEmpty()) {
            PhoneUserJid A052 = C56972sr.A05(r2);
            C85284Fq A042 = this.A01.A04();
            try {
                C69833Yo Axl = A042.Axl();
                try {
                    C49012fq r22 = this.A04;
                    C129526aS keySet = r22.A00().keySet();
                    if (z) {
                        C85284Fq A0C = r22.A02.A0C();
                        try {
                            C69833Yo Axl2 = A0C.Axl();
                            try {
                                synchronized (r22) {
                                    long A0H = r22.A01.A0H();
                                    ContentValues A062 = AnonymousClass0x9.A06();
                                    C18270x1.A0c(A062, "logout_time", A0H);
                                    String[] A0O = C627336j.A0O(r12);
                                    String join = TextUtils.join(", ", Collections.nCopies(A0O.length, "?"));
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("device_id IN (");
                                    A0o.append(join);
                                    ((AnonymousClass3H0) A0C).A03.A05(A062, "devices", AnonymousClass000.A0e(A0o), "markDeviceLoggedOut/UPDATE_DEVICES", A0O);
                                    Axl2.A00();
                                    r22.A00 = null;
                                }
                                Axl2.close();
                                A0C.close();
                            } catch (Throwable th) {
                                Axl2.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            A0C.close();
                            throw th2;
                        }
                    } else {
                        r22.A01(r12);
                    }
                    A05(keySet, C129526aS.of(), r12, A052, false, false);
                    Axl.A00();
                    Axl.close();
                    A042.close();
                    A02();
                    A04(keySet, C129526aS.of(), r12, A052);
                } catch (Throwable th3) {
                    Axl.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    A042.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        }
        Log.i("DeviceManager/removeMyDevices/done");
    }

    public void A07(AnonymousClass33G r18) {
        UserJid A052;
        boolean z;
        Log.i("DeviceManager/addMyDevice/start");
        AnonymousClass33G r3 = r18;
        DeviceJid deviceJid = r3.A07;
        boolean A0L = C627336j.A0L(deviceJid);
        C56972sr r0 = this.A00;
        if (A0L) {
            A052 = r0.A0I();
        } else {
            A052 = C56972sr.A05(r0);
        }
        C129526aS of = C129526aS.of(deviceJid);
        C85284Fq A042 = this.A01.A04();
        try {
            C69833Yo Axl = A042.Axl();
            try {
                C49012fq r4 = this.A04;
                C129526aS keySet = r4.A00().keySet();
                C85284Fq A0C = r4.A02.A0C();
                try {
                    C69833Yo Axl2 = A0C.Axl();
                    try {
                        synchronized (r4) {
                            ContentValues A062 = AnonymousClass0x9.A06();
                            AnonymousClass0x2.A0n(A062, deviceJid, "device_id");
                            C18270x1.A0b(A062, "platform_type", r3.A08.value);
                            A062.put("device_os", r3.A09);
                            C18270x1.A0c(A062, "last_active", r3.A00);
                            C18270x1.A0c(A062, "login_time", r3.A05);
                            C18270x1.A0c(A062, "logout_time", r3.A01);
                            C18270x1.A0b(A062, "adv_key_index", r3.A04);
                            A062.put("place_name", r3.A03);
                            C59732xO r6 = r3.A06;
                            if (r6 != null) {
                                z = r6.A05;
                            } else {
                                z = false;
                            }
                            int i = 1;
                            C18270x1.A0b(A062, "support_bot_user_agent_chat_history", AnonymousClass000.A1S(z ? 1 : 0) ? 1 : 0);
                            if (r6 == null || !r6.A06) {
                                i = 0;
                            }
                            AnonymousClass3H0.A01(A062, A0C, "support_cag_reactions_and_polls_history", i).A0B("devices", "addDevice/REPLACE_DEVICES", A062);
                            Axl2.A00();
                            r4.A00 = null;
                        }
                        Axl2.close();
                        A0C.close();
                        A05(keySet, of, C129526aS.of(), A052, false, false);
                        Axl.A00();
                        Axl.close();
                        A042.close();
                        A02();
                        A04(keySet, of, C129526aS.of(), A052);
                        Log.i("DeviceManager/addMyDevice/done");
                    } catch (Throwable th) {
                        Axl2.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    A0C.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                Axl.close();
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                A042.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.1o1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.1nv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.1o1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.1o1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.1o1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(X.C60212yB r11, X.C60212yB r12, com.whatsapp.jid.UserJid r13) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0006
            if (r12 != 0) goto L_0x0006
        L_0x0004:
            r0 = 1
            return r0
        L_0x0006:
            r0 = 1
            if (r11 != 0) goto L_0x0102
            int r1 = r12.A00
        L_0x000b:
            if (r1 != r0) goto L_0x0004
            if (r12 != 0) goto L_0x010a
            r2 = 0
        L_0x0010:
            X.2eH r1 = r10.A06
            java.lang.Class<X.3LV> r0 = X.AnonymousClass3LV.class
            X.485 r5 = r1.A02(r0)
            X.3LV r5 = (X.AnonymousClass3LV) r5
            if (r2 != 0) goto L_0x00fe
            X.239 r3 = X.AnonymousClass239.E2EE
        L_0x001e:
            r4 = 0
            boolean r9 = X.AnonymousClass0x2.A1Y(r13, r3)
            X.2sr r0 = r5.A01
            boolean r1 = r0.A0a(r13)
            java.lang.String r8 = " failed"
            java.lang.String r7 = "BusinessPrivacySystemMessageUpdater/insert transitional system message for jid: "
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/onUserADVAccountEncryptionTypeChanged to "
            if (r1 == 0) goto L_0x003d
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/onUserADVAccountEncryptionTypeChanged: Only SMB supports CoEx!"
            X.C626936e.A0D(r4, r0)
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/onUserADVAccountEncryptionTypeChanged invalid for this application"
        L_0x0038:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x003b:
            r0 = 0
            return r0
        L_0x003d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r3, r0)
            java.lang.String r0 = " for jid: "
            X.C18260x0.A1P(r1, r0, r13)
            X.2FM r0 = r5.A02
            X.1VX r2 = r0.A00
            r1 = 6939(0x1b1b, float:9.724E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x0070
            X.239 r0 = X.AnonymousClass239.HOSTED
            if (r3 != r0) goto L_0x0070
            X.2qk r2 = r5.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ADV: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r3, r0, r1)
            java.lang.String r0 = "unexpected-hosted-device"
            r2.A0A(r0, r4, r1)
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/onUserADVAccountEncryptionTypeChanged returning since hosted devices not allowed"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x003b
        L_0x0070:
            X.2eH r1 = r5.A05
            java.lang.Class<X.3Lv> r0 = X.C66543Lv.class
            X.485 r6 = X.C48062eH.A01(r1, r0)
            X.3Lv r6 = (X.C66543Lv) r6
            X.8qC r0 = r5.A06
            r0.get()
            X.2rt r0 = r6.A1P
            boolean r0 = r0.A07(r13)
            if (r0 != 0) goto L_0x00da
            X.239 r0 = X.AnonymousClass239.HOSTED
            if (r3 != r0) goto L_0x00da
            X.2sd r3 = r6.A2B
            long r0 = X.C56612sH.A06(r6)
            X.2sr r2 = r6.A09
            boolean r2 = r2.A0a(r13)
            r4 = 16
            if (r2 == 0) goto L_0x009d
            r4 = 17
        L_0x009d:
            X.2z0 r3 = X.C56832sd.A01(r13, r3, r9)
            r2 = 67
            X.1nv r9 = new X.1nv
            r9.<init>(r3, r2, r0)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r13)
            if (r0 == 0) goto L_0x00b0
            r9.A00 = r4
        L_0x00b0:
            r0 = -1
            r6.A0c(r9, r0)
            X.2KS r0 = r6.A0A(r9, r0)
            boolean r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore addCoexPrivacySystemMessageOnCurrentThread for jid: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " success: "
            X.C18260x0.A1D(r0, r1, r2)
            if (r2 != 0) goto L_0x0004
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A17(r13, r7, r8, r0)
            java.lang.String r0 = r0.toString()
            goto L_0x0038
        L_0x00da:
            X.2P9 r2 = r6.A2H
            X.239 r0 = X.AnonymousClass239.HOSTED
            r5 = 1
            if (r3 != r0) goto L_0x00e2
            r5 = 2
        L_0x00e2:
            X.2sd r1 = r2.A02
            X.2sH r0 = r2.A00
            long r2 = r0.A0H()
            java.lang.String r4 = X.AnonymousClass36P.A03(r13)
            X.2z0 r1 = X.C56832sd.A01(r13, r1, r9)
            r0 = 69
            X.1o1 r9 = new X.1o1
            r9.<init>(r1, r0, r2)
            r9.A00 = r5
            r9.A01 = r4
            goto L_0x00b0
        L_0x00fe:
            X.239 r3 = X.AnonymousClass239.HOSTED
            goto L_0x001e
        L_0x0102:
            int r1 = r11.A00
            if (r12 == 0) goto L_0x000b
            int r0 = r12.A00
            if (r1 == r0) goto L_0x0004
        L_0x010a:
            int r2 = r12.A00
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56522s7.A08(X.2yB, X.2yB, com.whatsapp.jid.UserJid):boolean");
    }

    public C56522s7(C56972sr r1, C72303dV r2, C54652p4 r3, C56662sM r4, C49012fq r5, C55432qL r6, C48062eH r7, C183538qC r8) {
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
    }

    public void A03(C129526aS r5) {
        C69833Yo Axl;
        if (!r5.isEmpty()) {
            C85284Fq A042 = this.A01.A04();
            try {
                Axl = A042.Axl();
                this.A04.A01(r5);
                Axl.A00();
                Axl.close();
                A042.close();
                A02();
                return;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
