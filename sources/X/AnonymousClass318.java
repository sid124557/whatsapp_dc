package X;

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

/* renamed from: X.318  reason: invalid class name */
public class AnonymousClass318 {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C56612sH A02;
    public final AnonymousClass33p A03;
    public final C28771hk A04;
    public final C56522s7 A05;

    public AnonymousClass8OQ A03() {
        long j;
        AnonymousClass8OQ A002 = this.A05.A04.A00();
        C160667o6 r3 = new C160667o6();
        C172878Nf A0M = C18310x6.A0M(A002);
        while (A0M.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0M);
            r3.put(A0w.getKey(), AnonymousClass0x9.A0m(((AnonymousClass33G) A0w.getValue()).A04));
        }
        C56972sr r1 = this.A01;
        boolean A0Y = r1.A0Y();
        C135196kH A032 = C56972sr.A03(r1);
        if (A0Y) {
            j = (long) C18310x6.A03(AnonymousClass0x2.A0F(this.A03), "adv_current_key_index");
        } else {
            j = 0;
        }
        r3.put(A032, Long.valueOf(j));
        return r3.build();
    }

    public C129526aS A04() {
        if (C56972sr.A04(this.A01) == null) {
            return C129526aS.of();
        }
        return this.A05.A00().keySet();
    }

    public C60212yB A05() {
        AnonymousClass33p r2 = this.A03;
        int A032 = C18310x6.A03(AnonymousClass0x2.A0F(r2), "adv_raw_id");
        C183538qC r4 = r2.A01;
        return new C60212yB(A032, C60212yB.A00(AnonymousClass239.E2EE), AnonymousClass0x2.A0A(C18300x5.A0B(r4), "adv_timestamp_sec"), C18300x5.A0B(r4).getLong("adv_expected_timestamp_sec_in_companion_mode", 0), C18300x5.A0B(r4).getLong("adv_expected_ts_last_device_job_ts_in_companion_mode", 0), C18300x5.A0B(r4).getLong("adv_expected_ts_update_ts_in_companion_mode", 0));
    }

    public C60212yB A06(C60212yB r13, long j) {
        long j2 = r13.A05;
        long j3 = j;
        if (j2 < j) {
            long j4 = r13.A02;
            if (j4 < j) {
                long A0B = AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this.A03), "adv_last_device_job_ts");
                long j5 = r13.A03;
                if (j2 >= j4) {
                    j5 = this.A02.A0F();
                }
                return new C60212yB(r13.A01, r13.A00, j2, j3, A0B, j5);
            }
        }
        return r13;
    }

    public C60212yB A07(UserJid userJid) {
        if (userJid == null) {
            return null;
        }
        if (this.A01.A0a(userJid)) {
            return A05();
        }
        C56522s7 r2 = this.A05;
        C626936e.A0F(!r2.A00.A0a(userJid), "only query info for others");
        return r2.A02.A01(userJid);
    }

    public String A08(UserJid userJid) {
        if (userJid == null) {
            return "";
        }
        HashSet A15 = AnonymousClass0x9.A15(A0D(userJid));
        return !A15.isEmpty() ? C621933y.A03(A15) : "";
    }

    public Map A09(UserJid userJid) {
        if (this.A01.A0a(userJid)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(this.A05.A01(userJid));
        DeviceJid primaryDevice = userJid.getPrimaryDevice();
        C626936e.A06(primaryDevice);
        AnonymousClass0x2.A1J(primaryDevice, hashMap, 0);
        return hashMap;
    }

    public Set A0D(UserJid userJid) {
        Set A0B;
        Object A0G;
        C56972sr r2 = this.A01;
        if (userJid.equals(C56972sr.A04(r2))) {
            A0B = A0C();
            A0G = C56972sr.A03(r2);
        } else if (userJid.equals(r2.A0H())) {
            A0B = A0B();
            A0G = r2.A0G();
        } else {
            HashSet A15 = AnonymousClass0x9.A15(this.A05.A01(userJid).keySet());
            DeviceJid primaryDevice = userJid.getPrimaryDevice();
            C626936e.A06(primaryDevice);
            A15.add(primaryDevice);
            return A15;
        }
        C626936e.A06(A0G);
        A0B.add(A0G);
        return A0B;
    }

    public void A0F(C60212yB r8, UserJid userJid) {
        C69833Yo Axl;
        C56972sr r1 = this.A01;
        if (r1.A0a(userJid)) {
            C626936e.A0B(r1.A0Y());
            AnonymousClass33p r4 = this.A03;
            C18270x1.A0h(C18270x1.A03(r4), "adv_raw_id", r8.A01);
            C18270x1.A0i(C18270x1.A03(r4), "adv_timestamp_sec", r8.A05);
            C18270x1.A0i(C18270x1.A03(r4), "adv_expected_timestamp_sec_in_companion_mode", r8.A02);
            C18270x1.A0i(C18270x1.A03(r4), "adv_expected_ts_last_device_job_ts_in_companion_mode", r8.A04);
            C18270x1.A0i(C18270x1.A03(r4), "adv_expected_ts_update_ts_in_companion_mode", r8.A03);
            return;
        }
        C56522s7 r6 = this.A05;
        Set A07 = r6.A03.A07(userJid);
        C85284Fq A042 = r6.A01.A04();
        try {
            Axl = A042.Axl();
            Iterator it = A07.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Axl.A00();
                    break;
                }
                UserJid A0T = C18310x6.A0T(it);
                C54652p4 r12 = r6.A02;
                if (r6.A08(r12.A01(A0T), r8, A0T)) {
                    r12.A02(r8, A0T);
                }
            }
            Axl.close();
            A042.close();
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
        throw th;
    }

    public void A0G(UserJid userJid, String str) {
        C626936e.A0C(!this.A01.A0a(userJid));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserDeviceManager/removeAllCompanionsForUser user=");
        A0o.append(userJid);
        C18260x0.A0q("; removeADVInfoReason=", str, A0o);
        HashSet A15 = AnonymousClass0x9.A15(this.A05.A01(userJid).keySet());
        A15.remove(userJid.getPrimaryDevice());
        A0E(C129526aS.copyOf((Collection) A15), userJid, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014b, code lost:
        r20.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0151, code lost:
        r21.close();
        r21 = r30.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r20 = r21.Axl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r12 = r22.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0164, code lost:
        if (r12.hasNext() == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0166, code lost:
        r10 = X.C18310x6.A0T(r12);
        r11 = (X.AnonymousClass2R7) r2.get(r10);
        X.C626936e.A06(r11);
        r8 = r11.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0179, code lost:
        if (r8.isEmpty() == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017b, code lost:
        r1 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0181, code lost:
        if (r1.isEmpty() == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0183, code lost:
        if (r35 == false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0185, code lost:
        r4.A05(r11.A00.keySet(), r1, r8, r10, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0198, code lost:
        if (r33 == null) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019a, code lost:
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a4, code lost:
        if (r4.A08(r1.A01(r10), r9, r10) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a6, code lost:
        r1.A02(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a9, code lost:
        r4.A04(r11.A00.keySet(), r11.A02, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b5, code lost:
        r20.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(X.AnonymousClass8OQ r32, X.C60212yB r33, com.whatsapp.jid.UserJid r34, boolean r35) {
        /*
            r31 = this;
            r6 = r31
            X.2sr r0 = r6.A01
            r7 = r34
            boolean r0 = r0.A0a(r7)
            r1 = r0 ^ 1
            java.lang.String r0 = "cannot refresh yourself device"
            X.C626936e.A0F(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r32
            r0.<init>(r1)
            r6.A0H(r7, r0)
            X.8OQ r5 = X.AnonymousClass8OQ.copyOf((java.util.Map) r0)
            X.2s7 r4 = r6.A05
            X.8OQ r3 = r4.A01(r7)
            r5.keySet()
            X.2sr r0 = r4.A00
            boolean r0 = r0.A0a(r7)
            r1 = r0 ^ 1
            java.lang.String r0 = "only refresh devices for others"
            X.C626936e.A0F(r1, r0)
            X.6aS r1 = r5.keySet()
            com.whatsapp.jid.DeviceJid r0 = r7.getPrimaryDevice()
            boolean r1 = r1.contains(r0)
            java.lang.String r0 = "device list should always include primary."
            X.C626936e.A0F(r1, r0)
            X.2sM r0 = r4.A03
            java.util.Set r22 = r0.A07(r7)
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.util.Iterator r8 = r22.iterator()
        L_0x0055:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0068
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r8)
            X.2R7 r0 = new X.2R7
            r0.<init>(r5, r4, r1)
            r2.put(r1, r0)
            goto L_0x0055
        L_0x0068:
            X.3dV r0 = r4.A01
            r30 = r0
            X.4Fq r21 = r30.A04()
            X.3Yo r20 = r21.Axl()     // Catch:{ all -> 0x01ec }
            java.util.Iterator r19 = r22.iterator()     // Catch:{ all -> 0x01e2 }
        L_0x0078:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x01e2 }
            r9 = r33
            r28 = r35
            if (r0 == 0) goto L_0x014b
            com.whatsapp.jid.UserJid r10 = X.C18310x6.A0T(r19)     // Catch:{ all -> 0x01e2 }
            java.lang.Object r11 = r2.get(r10)     // Catch:{ all -> 0x01e2 }
            X.2R7 r11 = (X.AnonymousClass2R7) r11     // Catch:{ all -> 0x01e2 }
            X.C626936e.A06(r11)     // Catch:{ all -> 0x01e2 }
            X.6aS r0 = r11.A02     // Catch:{ all -> 0x01e2 }
            r25 = r0
            boolean r0 = r25.isEmpty()     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x00a1
            X.6aS r0 = r11.A03     // Catch:{ all -> 0x01e2 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x0078
        L_0x00a1:
            X.2qL r12 = r4.A05     // Catch:{ all -> 0x01e2 }
            X.8OQ r0 = r11.A01     // Catch:{ all -> 0x01e2 }
            r23 = r0
            X.3dV r0 = r12.A02     // Catch:{ all -> 0x01e2 }
            X.4Fq r8 = r0.A04()     // Catch:{ all -> 0x01e2 }
            X.3Yo r18 = r8.Axl()     // Catch:{ all -> 0x0141 }
            X.34p r0 = r12.A01     // Catch:{ all -> 0x0137 }
            long r16 = r0.A05(r10)     // Catch:{ all -> 0x0137 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0137 }
            X.2sg r15 = r0.A03     // Catch:{ all -> 0x0137 }
            java.lang.String r14 = "user_device"
            java.lang.String r13 = "user_jid_row_id = ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r16)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "DELETE_USER_DEVICE_JIDS_SQL"
            r15.A07(r14, r13, r0, r1)     // Catch:{ all -> 0x0137 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "device-store/refreshDevicesForUser/deleteAllDevices for userJid="
            X.C18260x0.A1P(r1, r0, r10)     // Catch:{ all -> 0x0137 }
            X.8Nf r15 = X.C18310x6.A0M(r23)     // Catch:{ all -> 0x0137 }
        L_0x00d8:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x0105
            java.util.Map$Entry r14 = X.AnonymousClass001.A0w(r15)     // Catch:{ all -> 0x0137 }
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass0x9.A0Q(r14)     // Catch:{ all -> 0x0137 }
            int r0 = r0.getDevice()     // Catch:{ all -> 0x0137 }
            com.whatsapp.jid.DeviceJid r13 = com.whatsapp.jid.DeviceJid.getFromUserJidAndDeviceIdNullable(r10, r0)     // Catch:{ all -> 0x0137 }
            boolean r1 = X.AnonymousClass000.A1W(r13)
            java.lang.String r0 = "DeviceJid must not be null"
            X.C626936e.A0D(r1, r0)     // Catch:{ all -> 0x0137 }
            if (r13 == 0) goto L_0x00d8
            java.lang.Object r0 = r14.getValue()     // Catch:{ all -> 0x0137 }
            long r0 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x0137 }
            r12.A03(r13, r10, r0)     // Catch:{ all -> 0x0137 }
            goto L_0x00d8
        L_0x0105:
            r18.A00()     // Catch:{ all -> 0x0137 }
            r12.A02(r8, r10)     // Catch:{ all -> 0x0137 }
            r18.close()     // Catch:{ all -> 0x0141 }
            r8.close()     // Catch:{ all -> 0x01e2 }
            if (r33 == 0) goto L_0x0122
            X.2p4 r1 = r4.A02     // Catch:{ all -> 0x01e2 }
            X.2yB r0 = r1.A01(r10)     // Catch:{ all -> 0x01e2 }
            boolean r0 = r4.A08(r0, r9, r10)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01b8
            r1.A02(r9, r10)     // Catch:{ all -> 0x01e2 }
        L_0x0122:
            X.8OQ r0 = r11.A00     // Catch:{ all -> 0x01e2 }
            X.6aS r24 = r0.keySet()     // Catch:{ all -> 0x01e2 }
            X.6aS r0 = r11.A03     // Catch:{ all -> 0x01e2 }
            r29 = 0
            r23 = r4
            r26 = r0
            r27 = r10
            r23.A05(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x01e2 }
            goto L_0x0078
        L_0x0137:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x013c }
            goto L_0x0140
        L_0x013c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0141 }
        L_0x0140:
            throw r1     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0146 }
            goto L_0x014a
        L_0x0146:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01e2 }
        L_0x014a:
            throw r1     // Catch:{ all -> 0x01e2 }
        L_0x014b:
            r20.A00()     // Catch:{ all -> 0x01e2 }
            r20.close()     // Catch:{ all -> 0x01ec }
            r21.close()
            X.4Fq r21 = r30.A04()
            X.3Yo r20 = r21.Axl()     // Catch:{ all -> 0x01ec }
            java.util.Iterator r12 = r22.iterator()     // Catch:{ all -> 0x01e2 }
        L_0x0160:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01b5
            com.whatsapp.jid.UserJid r10 = X.C18310x6.A0T(r12)     // Catch:{ all -> 0x01e2 }
            java.lang.Object r11 = r2.get(r10)     // Catch:{ all -> 0x01e2 }
            X.2R7 r11 = (X.AnonymousClass2R7) r11     // Catch:{ all -> 0x01e2 }
            X.C626936e.A06(r11)     // Catch:{ all -> 0x01e2 }
            X.6aS r8 = r11.A03     // Catch:{ all -> 0x01e2 }
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01a9
            X.6aS r1 = r11.A02     // Catch:{ all -> 0x01e2 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01a9
            if (r35 == 0) goto L_0x0198
            X.8OQ r0 = r11.A00     // Catch:{ all -> 0x01e2 }
            X.6aS r14 = r0.keySet()     // Catch:{ all -> 0x01e2 }
            r18 = 1
            r19 = 0
            r13 = r4
            r15 = r1
            r16 = r8
            r17 = r10
            r13.A05(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01e2 }
        L_0x0198:
            if (r33 == 0) goto L_0x01a9
            X.2p4 r1 = r4.A02     // Catch:{ all -> 0x01e2 }
            X.2yB r0 = r1.A01(r10)     // Catch:{ all -> 0x01e2 }
            boolean r0 = r4.A08(r0, r9, r10)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01b8
            r1.A02(r9, r10)     // Catch:{ all -> 0x01e2 }
        L_0x01a9:
            X.8OQ r0 = r11.A00     // Catch:{ all -> 0x01e2 }
            X.6aS r1 = r0.keySet()     // Catch:{ all -> 0x01e2 }
            X.6aS r0 = r11.A02     // Catch:{ all -> 0x01e2 }
            r4.A04(r1, r0, r8, r10)     // Catch:{ all -> 0x01e2 }
            goto L_0x0160
        L_0x01b5:
            r20.A00()     // Catch:{ all -> 0x01e2 }
        L_0x01b8:
            r20.close()     // Catch:{ all -> 0x01ec }
            r21.close()
            X.6aS r0 = X.C621933y.A01(r5, r3)
            java.util.HashSet r2 = X.AnonymousClass0x9.A15(r0)
            X.6aS r0 = X.C621933y.A02(r5, r3)
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r0)
            X.1hk r0 = r6.A04
            r0.A08(r7, r2, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01e0
            boolean r1 = r1.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x01e1
        L_0x01e0:
            r0 = 1
        L_0x01e1:
            return r0
        L_0x01e2:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x01e7 }
            goto L_0x01eb
        L_0x01e7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01ec }
        L_0x01eb:
            throw r1     // Catch:{ all -> 0x01ec }
        L_0x01ec:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x01f1 }
            throw r1
        L_0x01f1:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass318.A0I(X.8OQ, X.2yB, com.whatsapp.jid.UserJid, boolean):boolean");
    }

    public AnonymousClass318(C55682qk r1, C56972sr r2, C56612sH r3, AnonymousClass33p r4, C28771hk r5, C56522s7 r6) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
    }

    public static long A00(C618832q r2, AnonymousClass318 r3, UserJid userJid) {
        r2.A08 = r3.A08(userJid);
        r2.A03 = r3.A02(userJid);
        C60212yB A07 = r3.A07(userJid);
        if (A07 != null) {
            return A07.A02;
        }
        return 0;
    }

    public static C129526aS A01(C129526aS r5, UserJid userJid) {
        HashSet A0K = AnonymousClass002.A0K();
        C172878Nf it = r5.iterator();
        while (it.hasNext()) {
            DeviceJid fromUserJidAndDeviceIdNullable = DeviceJid.getFromUserJidAndDeviceIdNullable(userJid, AnonymousClass0x7.A0S(it).getDevice());
            C626936e.A0D(AnonymousClass000.A1W(fromUserJidAndDeviceIdNullable), "DeviceJid must not be null");
            if (fromUserJidAndDeviceIdNullable != null) {
                A0K.add(fromUserJidAndDeviceIdNullable);
            }
        }
        return C129526aS.copyOf((Collection) A0K);
    }

    public long A02(UserJid userJid) {
        C60212yB A07 = A07(userJid);
        if (A07 == null) {
            return 0;
        }
        return A07.A05;
    }

    public Map A0A(Set set) {
        HashSet A0K;
        HashMap A0t = AnonymousClass001.A0t();
        HashSet A15 = AnonymousClass0x9.A15(set);
        C56972sr r6 = this.A01;
        PhoneUserJid A042 = C56972sr.A04(r6);
        C27981fH A0H = r6.A0H();
        if (set.contains(A042)) {
            Set A0C = A0C();
            A0C.add(C56972sr.A02(r6));
            A0t.put(A042, A0C);
            A15.remove(A042);
        }
        if (set.contains(A0H)) {
            Set A0B = A0B();
            C135136kB A0G = r6.A0G();
            C626936e.A06(A0G);
            A0B.add(A0G);
            A0t.put(A0H, A0B);
            A15.remove(A0H);
        }
        C55432qL r0 = this.A05.A05;
        HashMap A0t2 = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(r0.A00(A15));
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            A0t2.put(A0w.getKey(), ((AnonymousClass8OQ) A0w.getValue()).keySet());
        }
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            UserJid A0T = C18310x6.A0T(it);
            if (A0t2.containsKey(A0T)) {
                A0K = AnonymousClass0x9.A15((Collection) C18290x4.A0i(A0T, A0t2));
            } else {
                A0K = AnonymousClass002.A0K();
            }
            DeviceJid A002 = C618932r.A00(A0T);
            C626936e.A06(A002);
            A0K.add(A002);
            A0t.put(A0T, A0K);
        }
        return A0t;
    }

    public Set A0B() {
        Object r0;
        HashSet A0K = AnonymousClass002.A0K();
        C27981fH A0H = this.A01.A0H();
        if (A0H != null) {
            C172878Nf it = A04().iterator();
            while (it.hasNext()) {
                DeviceJid A0R = AnonymousClass0x7.A0R(it);
                if (A0R.userJid instanceof PhoneUserJid) {
                    try {
                        int device = A0R.getDevice();
                        if (device == 99) {
                            r0 = new C28061fQ(A0H, device);
                        } else {
                            r0 = new C135136kB(A0H, device);
                        }
                        A0K.add(r0);
                    } catch (AnonymousClass24P e) {
                        Log.w("Failed to map to LID companion", e);
                    }
                }
            }
        }
        return A0K;
    }

    public Set A0C() {
        HashSet A0K = AnonymousClass002.A0K();
        C172878Nf it = A04().iterator();
        while (it.hasNext()) {
            DeviceJid A0R = AnonymousClass0x7.A0R(it);
            if (A0R.userJid instanceof PhoneUserJid) {
                A0K.add(A0R);
            }
        }
        return A0K;
    }

    public void A0E(C129526aS r25, UserJid userJid, String str) {
        C69833Yo Axl;
        C69833Yo Axl2;
        HashSet A15 = AnonymousClass0x9.A15(r25);
        C56522s7 r9 = this.A05;
        UserJid userJid2 = userJid;
        A15.retainAll(r9.A01(userJid2).keySet());
        String str2 = str;
        if (!A15.isEmpty() || str != null) {
            C129526aS copyOf = C129526aS.copyOf((Collection) A15);
            C626936e.A0F(!r9.A00.A0a(userJid2), "only remove device for others");
            C626936e.A0F(!copyOf.contains(userJid2.getPrimaryDevice()), "never remove primary device.");
            Set A07 = r9.A03.A07(userJid2);
            if (!copyOf.isEmpty()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("DeviceManager/removeDevicesForOtherUser user=");
                A0o.append(userJid2);
                A0o.append("; device=");
                A0o.append(copyOf);
                C18260x0.A0q("; shouldRemoveADVInfoAndReason=", str2, A0o);
                HashMap A0t = AnonymousClass001.A0t();
                C85284Fq A042 = r9.A01.A04();
                try {
                    Axl2 = A042.Axl();
                    Iterator it = A07.iterator();
                    while (it.hasNext()) {
                        UserJid A0T = C18310x6.A0T(it);
                        C129526aS keySet = r9.A01(A0T).keySet();
                        A0t.put(A0T, keySet);
                        C129526aS A012 = A01(copyOf, A0T);
                        if (str != null) {
                            C54652p4 r12 = r9.A02;
                            if (!r9.A08(r12.A01(A0T), (C60212yB) null, A0T)) {
                                Axl2.close();
                                A042.close();
                                break;
                            }
                            r12.A03(A0T);
                            r9.A05.A04(A0T);
                        } else {
                            r9.A05.A01(A012, A0T);
                        }
                        C129526aS r18 = keySet;
                        C56522s7 r17 = r9;
                        r17.A05(r18, C129526aS.of(), A012, A0T, false, "identity_changed".equals(str2));
                    }
                    Axl2.A00();
                    Axl2.close();
                    A042.close();
                    Iterator it2 = A07.iterator();
                    while (it2.hasNext()) {
                        UserJid A0T2 = C18310x6.A0T(it2);
                        r9.A04((C129526aS) C18290x4.A0i(A0T2, A0t), C129526aS.of(), A01(copyOf, A0T2), A0T2);
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        A042.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else if (str != null) {
                C85284Fq A043 = r9.A01.A04();
                try {
                    Axl = A043.Axl();
                    Iterator it3 = A07.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            Axl.A00();
                            break;
                        }
                        UserJid A0T3 = C18310x6.A0T(it3);
                        C54652p4 r1 = r9.A02;
                        if (r9.A08(r1.A01(A0T3), (C60212yB) null, A0T3)) {
                            r1.A03(A0T3);
                            r9.A05.A04(A0T3);
                        }
                    }
                    Axl.close();
                    A043.close();
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    A043.close();
                    throw th;
                }
            }
            if (!A15.isEmpty()) {
                this.A04.A08(userJid2, Collections.emptySet(), A15);
                return;
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    public void A0H(UserJid userJid, HashMap hashMap) {
        String str;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0u = AnonymousClass001.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            if (!AnonymousClass0x9.A0Q(A0w).userJid.equals(userJid)) {
                C18270x1.A1N(A0t, A0w);
            }
        }
        if (A0t.size() > 0) {
            C55682qk r3 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("userJid=");
            A0o.append(userJid);
            StringBuilder A0w2 = C18290x4.A0w("; deviceJids=", A0o);
            Iterator A0u2 = AnonymousClass001.A0u(A0t);
            while (A0u2.hasNext()) {
                Map.Entry A0w3 = AnonymousClass001.A0w(A0u2);
                C18320x8.A1K(A0w2);
                A0w2.append(A0w3.getKey());
                A0w2.append(":");
                A0w2.append(A0w3.getValue());
            }
            if (A0w2.length() > 0) {
                str = A0w2.substring(1);
            } else {
                str = "no-data-found";
            }
            r3.A0A("userdevicemanager/invalid_devices", false, AnonymousClass000.A0X(str, A0o));
            Iterator A11 = C18290x4.A11(A0t);
            while (A11.hasNext()) {
                hashMap.remove(A11.next());
            }
        }
    }

    public boolean A0J(UserJid userJid, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet A0K = AnonymousClass002.A0K();
        A0K.addAll(A0D(userJid));
        return C621933y.A03(A0K).equals(str);
    }
}
