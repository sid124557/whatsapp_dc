package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ta  reason: invalid class name and case insensitive filesystem */
public class C68403Ta implements AnonymousClass4EZ {
    public final C55682qk A00;
    public final AnonymousClass4E5 A01;
    public final C56662sM A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass31C A04;
    public final Map A05 = AnonymousClass0x7.A0y();

    public static final C45902al A01(AnonymousClass36K r8, String str) {
        Long l;
        if (r8.A0l("error") != null) {
            AnonymousClass36K A0m = r8.A0m("error");
            Long valueOf = Long.valueOf(Math.min(A0m.A0e("backoff", 7200) * 1000, 3600000));
            String A0r = A0m.A0r("text", (String) null);
            int A0b = A0m.A0b("code", -1);
            long A0e = A0m.A0e("backoff", -1);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("connection/unisynciq/parse/");
            A0o.append(str);
            A0o.append("/error/error_text= ");
            A0o.append(A0r);
            A0o.append(", code: ");
            A0o.append(A0b);
            C18270x1.A1B(", backoff:", A0o, A0e);
            return new C45902al(Integer.valueOf(A0b), (Long) null, valueOf, false);
        }
        String A0r2 = r8.A0r("refresh", (String) null);
        if (A0r2 != null) {
            l = Long.valueOf(Long.parseLong(A0r2) * 1000);
        } else {
            l = null;
        }
        return new C45902al((Integer) null, l, (Long) null, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0253, code lost:
        if ((r28 & 16) == 16) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e3, code lost:
        if (r0 != false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05f2, code lost:
        if ((r28 & 16) == 16) goto L_0x05f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.concurrent.Future A04(X.C59512x2 r44, java.lang.String r45, long r46) {
        /*
            r43 = this;
            r42 = r43
            r0 = r42
            X.31C r0 = r0.A04
            r41 = r0
            java.lang.String r19 = r41.A03()
            r0 = 4
            java.util.ArrayList r3 = X.AnonymousClass002.A0I(r0)
            java.util.ArrayList r16 = X.AnonymousClass001.A0s()
            java.util.ArrayList r17 = X.AnonymousClass001.A0s()
            r0 = 2
            java.util.ArrayList r27 = X.AnonymousClass002.A0I(r0)
            r11 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r28 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r15 = 0
            r14 = 0
        L_0x0039:
            r12 = r44
            java.util.List r2 = r12.A02
            int r1 = r2.size()
            java.lang.String r21 = "sidelist"
            java.lang.String r20 = "pay"
            java.lang.String r26 = "bot"
            java.lang.String r25 = "devices"
            java.lang.String r24 = "username"
            java.lang.String r10 = "business"
            java.lang.String r23 = "id"
            java.lang.String r13 = "picture"
            java.lang.String r9 = "verified_name"
            java.lang.String r8 = "status"
            java.lang.String r22 = "profile"
            java.lang.String r18 = "type"
            java.lang.String r0 = "contact"
            if (r11 >= r1) goto L_0x0378
            java.lang.Object r2 = r2.get(r11)
            X.2UM r2 = (X.AnonymousClass2UM) r2
            r3.clear()
            boolean r1 = r2.A0G
            java.lang.String r12 = "delete"
            if (r1 == 0) goto L_0x008e
            boolean r1 = r2.A0K
            if (r1 != 0) goto L_0x008e
            boolean r1 = r2.A0H
            if (r1 == 0) goto L_0x033f
            X.39V[] r5 = X.AnonymousClass0x9.A1V()
            r4 = r18
            X.AnonymousClass39V.A04(r4, r12, r5)
            X.36K r4 = X.AnonymousClass36K.A0I(r0, r5)
        L_0x0089:
            r3.add(r4)
        L_0x008c:
            r29 = 1
        L_0x008e:
            boolean r0 = r2.A0P
            r5 = 0
            if (r0 == 0) goto L_0x00b3
            long r0 = r2.A04
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b1
            X.39V[] r4 = X.AnonymousClass0x9.A1V()
            long r0 = r2.A04
            long r0 = X.C18290x4.A0B(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "t"
            X.AnonymousClass39V.A04(r0, r1, r4)
            X.AnonymousClass36K.A0R(r8, r3, r4)
        L_0x00b1:
            r30 = 1
        L_0x00b3:
            boolean r0 = r2.A0F
            java.lang.String r7 = "tag"
            if (r0 == 0) goto L_0x00f9
            r27.clear()
            java.lang.String r0 = r2.A0D
            if (r0 == 0) goto L_0x00d2
            X.39V[] r4 = X.AnonymousClass0x9.A1V()
            java.lang.String r1 = "serial"
            java.lang.String r0 = r2.A0D
            X.AnonymousClass39V.A04(r1, r0, r4)
            r0 = r27
            X.AnonymousClass36K.A0R(r9, r0, r4)
        L_0x00d2:
            java.lang.String r0 = r2.A09
            if (r0 == 0) goto L_0x033c
            X.39V[] r5 = X.AnonymousClass0x9.A1V()
            java.lang.String r0 = r2.A09
            boolean r4 = X.AnonymousClass39V.A0F(r7, r0, r5)
            r1 = r27
            r0 = r22
            X.AnonymousClass36K.A0R(r0, r1, r5)
        L_0x00e7:
            boolean r0 = r27.isEmpty()
            if (r0 != 0) goto L_0x00f7
            r0 = r27
            X.36K[] r1 = X.C18280x3.A1a(r0, r4)
            r0 = 0
            X.AnonymousClass36K.A0S(r10, r3, r0, r1)
        L_0x00f7:
            r32 = 1
        L_0x00f9:
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x0116
            int r0 = r2.A01
            if (r0 <= 0) goto L_0x0114
            X.39V[] r4 = X.AnonymousClass0x9.A1V()
            int r5 = r2.A01
            X.39V r1 = new X.39V
            r0 = r23
            r1.<init>((java.lang.String) r0, (int) r5)
            r0 = 0
            r4[r0] = r1
            X.AnonymousClass36K.A0R(r13, r3, r4)
        L_0x0114:
            r31 = 1
        L_0x0116:
            boolean r0 = r2.A0I
            if (r0 == 0) goto L_0x0163
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.lang.String r0 = r2.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0161
            java.lang.String r1 = "device_hash"
            java.lang.String r0 = r2.A0A
            X.AnonymousClass39V.A03(r1, r0, r4)
            long r0 = r2.A03
            r8 = 0
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0154
            java.lang.String r6 = "ts"
            long r0 = r2.A03
            X.39V r5 = new X.39V
            r5.<init>((java.lang.String) r6, (long) r0)
            r4.add(r5)
            long r5 = r2.A02
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0154
            java.lang.String r1 = "expected_ts"
            long r5 = r2.A02
            X.39V r0 = new X.39V
            r0.<init>((java.lang.String) r1, (long) r5)
            r4.add(r0)
        L_0x0154:
            int r0 = r4.size()
            X.39V[] r1 = X.C18300x5.A1Z(r4, r0)
            r0 = r25
            X.AnonymousClass36K.A0R(r0, r3, r1)
        L_0x0161:
            r34 = 1
        L_0x0163:
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x019f
            r0 = 2
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r0)
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x017a
            int r1 = r2.A00
            X.39V r0 = new X.39V
            r0.<init>((java.lang.String) r7, (int) r1)
            r4.add(r0)
        L_0x017a:
            java.lang.String r0 = r2.A08
            if (r0 == 0) goto L_0x0186
            java.lang.String r1 = "persona_id"
            java.lang.String r0 = r2.A08
            X.AnonymousClass39V.A03(r1, r0, r4)
        L_0x0186:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x019d
            r0 = 0
            X.39V[] r1 = X.C18300x5.A1Z(r4, r0)
            r0 = r22
            X.36K r4 = X.AnonymousClass36K.A0I(r0, r1)
            r1 = 0
            r0 = r26
            X.AnonymousClass36K.A0O(r4, r0, r3, r1)
        L_0x019d:
            r37 = 1
        L_0x019f:
            com.whatsapp.jid.UserJid r0 = r2.A07
            if (r0 == 0) goto L_0x0339
            X.39V[] r10 = X.AnonymousClass0x9.A1V()
            java.lang.String r4 = "jid"
            com.whatsapp.jid.UserJid r1 = r2.A07
            X.39V r0 = new X.39V
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r4)
            r1 = 0
            r10[r1] = r0
        L_0x01b3:
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x02bc
            X.2Py r0 = r2.A05
            if (r0 == 0) goto L_0x02bc
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x021b
            X.2Py r1 = r2.A05
            if (r1 == 0) goto L_0x021b
            android.util.Pair r0 = r1.A00
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r0 = r0.first
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x01d1
            r28 = r28 | 1
        L_0x01d1:
            X.8OQ r0 = r1.A01
            boolean r6 = r0.isEmpty()
            r5 = 3
            r4 = 1
            if (r6 != 0) goto L_0x01f7
            X.8Nf r6 = X.C18310x6.A0M(r0)
        L_0x01df:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01f7
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r6)
            int r0 = X.C18280x3.A06(r0)
            if (r0 != r4) goto L_0x01f2
            r28 = r28 | 2
            goto L_0x01df
        L_0x01f2:
            if (r0 != r5) goto L_0x01df
            r28 = r28 | 8
            goto L_0x01df
        L_0x01f7:
            X.8OQ r0 = r1.A02
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x021b
            X.8Nf r1 = X.C18310x6.A0M(r0)
        L_0x0203:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x021b
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r1)
            int r0 = X.C18280x3.A06(r0)
            if (r0 != r4) goto L_0x0216
            r28 = r28 | 16
            goto L_0x0203
        L_0x0216:
            if (r0 != r5) goto L_0x0203
            r28 = r28 | 32
            goto L_0x0203
        L_0x021b:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.2Py r1 = r2.A05
            android.util.Pair r4 = r1.A00
            r0 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0249
            java.lang.Object r6 = r4.first
            boolean r6 = X.AnonymousClass001.A1Z(r6)
            if (r6 == 0) goto L_0x0249
            java.lang.Object r6 = r4.second
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0249
            X.39V[] r6 = new X.AnonymousClass39V[r7]
            java.lang.Object r4 = r4.second
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r8 = "dhash"
            X.AnonymousClass39V.A0B(r8, r4, r6, r0)
            java.lang.String r4 = "merchant_status"
            X.AnonymousClass36K.A0R(r4, r5, r6)
        L_0x0249:
            r6 = r28 & 2
            r4 = 2
            if (r6 == r4) goto L_0x0255
            r6 = 16
            r4 = r28 & 16
            r8 = 0
            if (r4 != r6) goto L_0x0256
        L_0x0255:
            r8 = 1
        L_0x0256:
            r6 = 0
            if (r8 == 0) goto L_0x027d
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.8OQ r8 = r1.A01
            X.36K r8 = A02(r8, r7)
            X.8OQ r9 = r1.A02
            X.36K r7 = A03(r9, r7)
            if (r8 == 0) goto L_0x026e
            r4.add(r8)
        L_0x026e:
            if (r7 == 0) goto L_0x0273
            r4.add(r7)
        L_0x0273:
            X.36K[] r7 = X.C18280x3.A1a(r4, r0)
            java.lang.String r4 = "upi"
            X.AnonymousClass36K.A0S(r4, r5, r6, r7)
        L_0x027d:
            r7 = r28 & 8
            r4 = 8
            if (r7 == r4) goto L_0x0289
            r7 = 32
            r4 = r28 & 32
            if (r4 != r7) goto L_0x02ad
        L_0x0289:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.8OQ r8 = r1.A01
            r7 = 3
            X.36K r8 = A02(r8, r7)
            X.8OQ r1 = r1.A02
            X.36K r1 = A03(r1, r7)
            if (r8 == 0) goto L_0x029f
            r4.add(r8)
        L_0x029f:
            if (r1 == 0) goto L_0x02a4
            r4.add(r1)
        L_0x02a4:
            X.36K[] r4 = X.C18280x3.A1a(r4, r0)
            java.lang.String r1 = "fbpay"
            X.AnonymousClass36K.A0S(r1, r5, r6, r4)
        L_0x02ad:
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x02bc
            X.36K[] r1 = X.C18280x3.A1a(r5, r0)
            r0 = r20
            X.AnonymousClass36K.A0S(r0, r3, r6, r1)
        L_0x02bc:
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x02c2
            r35 = 1
        L_0x02c2:
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x02c8
            r36 = 1
        L_0x02c8:
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x02ce
            r38 = 1
        L_0x02ce:
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x02d4
            r39 = 1
        L_0x02d4:
            boolean r0 = r2.A0K
            java.lang.String r5 = "user"
            if (r0 == 0) goto L_0x0327
            boolean r0 = r2.A0O
            if (r0 != 0) goto L_0x02e5
            r0 = r33
            r33 = 0
            if (r0 == 0) goto L_0x02e7
        L_0x02e5:
            r33 = 1
        L_0x02e7:
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x0325
            X.39V[] r4 = X.AnonymousClass0x9.A1V()
            r1 = r18
            boolean r1 = X.AnonymousClass39V.A0F(r1, r12, r4)
            r0 = r21
            X.AnonymousClass36K.A0R(r0, r3, r4)
        L_0x02fa:
            if (r36 == 0) goto L_0x0301
            r0 = r42
            r0.A05(r2, r3)
        L_0x0301:
            X.36K[] r1 = X.C18280x3.A1a(r3, r1)
            r0 = r17
            X.AnonymousClass36K.A0S(r5, r0, r10, r1)
            com.whatsapp.jid.UserJid r0 = r2.A07
            boolean r0 = X.C627336j.A0L(r0)
            if (r0 == 0) goto L_0x031e
            X.3ZH r0 = r2.A06
            if (r0 == 0) goto L_0x0322
            boolean r0 = r0.A0R()
            if (r0 == 0) goto L_0x0322
            int r14 = r14 + 1
        L_0x031e:
            int r11 = r11 + 1
            goto L_0x0039
        L_0x0322:
            int r15 = r15 + 1
            goto L_0x031e
        L_0x0325:
            r1 = 0
            goto L_0x02fa
        L_0x0327:
            if (r36 == 0) goto L_0x032e
            r0 = r42
            r0.A05(r2, r3)
        L_0x032e:
            r0 = 0
            X.36K[] r1 = X.C18280x3.A1a(r3, r0)
            r0 = r16
            X.AnonymousClass36K.A0S(r5, r0, r10, r1)
            goto L_0x031e
        L_0x0339:
            r10 = 0
            goto L_0x01b3
        L_0x033c:
            r4 = 0
            goto L_0x00e7
        L_0x033f:
            java.lang.String r1 = r2.A0B
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0351
            java.lang.String r5 = r2.A0B
            r1 = 0
            X.36K r4 = new X.36K
            r4.<init>((java.lang.String) r0, (java.lang.String) r5, (X.AnonymousClass39V[]) r1)
            goto L_0x0089
        L_0x0351:
            r4 = 0
            com.whatsapp.jid.UserJid r1 = r2.A07
            boolean r1 = X.C627336j.A0L(r1)
            if (r1 == 0) goto L_0x0360
            X.36K r4 = X.AnonymousClass36K.A0I(r0, r4)
            goto L_0x0089
        L_0x0360:
            java.lang.String r1 = r2.A0C
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x008c
            X.39V[] r4 = X.AnonymousClass0x9.A1V()
            java.lang.String r5 = r2.A0C
            r1 = r24
            X.AnonymousClass39V.A04(r1, r5, r4)
            X.AnonymousClass36K.A0R(r0, r3, r4)
            goto L_0x008c
        L_0x0378:
            X.227 r11 = r12.A01
            int r1 = r15 + r14
            r27 = r45
            if (r1 <= 0) goto L_0x03dc
            X.21Z r2 = r11.mode
            X.21Z r1 = X.AnonymousClass21Z.DELTA
            if (r2 == r1) goto L_0x038a
            X.21Z r1 = X.AnonymousClass21Z.FULL
            if (r2 != r1) goto L_0x03dc
        L_0x038a:
            X.24G r3 = new X.24G
            r1 = r27
            r3.<init>(r12, r1, r15, r14)
            r1 = r42
            X.2qk r7 = r1.A00
            java.lang.String r6 = "LidInSideListException"
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "LidInSideListException(\n      |sid={"
            r2.append(r1)
            java.lang.String r1 = r3.sid
            r2.append(r1)
            java.lang.String r1 = "},\n      |requestData={"
            r2.append(r1)
            X.2x2 r1 = r3.requestData
            r2.append(r1)
            java.lang.String r1 = "},\n      |lidCount="
            r2.append(r1)
            int r4 = r3.consumerLidCount
            int r1 = r3.smbLidCount
            int r5 = r4 + r1
            r2.append(r5)
            java.lang.String r5 = ",\n      |consumerLidCount="
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = ",\n      |smbLidCount="
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = "\n      |)"
            java.lang.String r1 = X.AnonymousClass000.A0X(r1, r2)
            java.lang.String r1 = X.C830345w.A09(r1)
            r7.A09(r6, r1, r3)
        L_0x03dc:
            int r1 = r29 + r30
            int r1 = r1 + r32
            int r1 = r1 + r33
            int r1 = r1 + r31
            int r1 = r1 + r34
            boolean r2 = X.AnonymousClass000.A1S(r28)
            int r1 = r1 + r2
            int r1 = r1 + r35
            int r1 = r1 + r36
            int r1 = r1 + r38
            int r1 = r1 + r37
            int r1 = r1 + r39
            X.36K[] r3 = new X.AnonymousClass36K[r1]
            r1 = 0
            if (r29 == 0) goto L_0x0652
            X.36K r2 = X.AnonymousClass36K.A0I(r0, r1)
            r0 = 0
            r3[r0] = r2
            r2 = 1
        L_0x0402:
            if (r30 == 0) goto L_0x040a
            int r0 = r2 + 1
            X.AnonymousClass36K.A0U(r8, r1, r3, r2)
            r2 = r0
        L_0x040a:
            if (r32 == 0) goto L_0x043a
            r0 = 2
            X.36K[] r0 = new X.AnonymousClass36K[r0]
            X.36K r4 = X.AnonymousClass36K.A0I(r9, r1)
            r1 = 0
            r0[r1] = r4
            X.39V[] r4 = X.AnonymousClass0x9.A1V()
            java.lang.String r6 = "v"
            int r5 = r12.A00
            X.39V r1 = new X.39V
            r1.<init>((java.lang.String) r6, (int) r5)
            r5 = 0
            r4[r5] = r1
            r1 = r22
            X.36K r4 = X.AnonymousClass36K.A0I(r1, r4)
            r1 = 1
            r0[r1] = r4
            int r4 = r2 + 1
            r1 = 0
            X.36K r0 = X.AnonymousClass36K.A0J(r10, r1, r0)
            r3[r2] = r0
            r2 = r4
        L_0x043a:
            if (r31 == 0) goto L_0x0451
            int r5 = r2 + 1
            X.39V[] r4 = X.AnonymousClass0x9.A1V()
            X.227 r0 = X.AnonymousClass227.A06
            if (r11 != r0) goto L_0x064d
            java.lang.String r1 = "image"
        L_0x0448:
            r0 = r18
            X.AnonymousClass39V.A04(r0, r1, r4)
            X.AnonymousClass36K.A0U(r13, r4, r3, r2)
            r2 = r5
        L_0x0451:
            if (r33 == 0) goto L_0x045c
            int r4 = r2 + 1
            r1 = 0
            r0 = r21
            X.AnonymousClass36K.A0U(r0, r1, r3, r2)
            r2 = r4
        L_0x045c:
            if (r34 == 0) goto L_0x0472
            int r5 = r2 + 1
            X.39V[] r1 = X.AnonymousClass0x9.A1V()
            java.lang.String r4 = "version"
            java.lang.String r0 = "2"
            X.AnonymousClass39V.A04(r4, r0, r1)
            r0 = r25
            X.AnonymousClass36K.A0U(r0, r1, r3, r2)
            r2 = r5
        L_0x0472:
            r5 = r28 & 1
            r0 = 1
            if (r5 == r0) goto L_0x05cb
            r1 = r28 & 2
            r0 = 2
            if (r1 == r0) goto L_0x05cb
            r1 = r28 & 8
            r0 = 8
            if (r1 == r0) goto L_0x05cb
            r1 = r28 & 16
            r0 = 16
            if (r1 == r0) goto L_0x05cb
            r1 = 32
            r0 = r28 & 32
            if (r0 == r1) goto L_0x05cb
            r1 = 0
        L_0x048f:
            if (r35 == 0) goto L_0x0499
            int r4 = r2 + 1
            java.lang.String r0 = "disappearing_mode"
            X.AnonymousClass36K.A0U(r0, r1, r3, r2)
            r2 = r4
        L_0x0499:
            if (r36 == 0) goto L_0x04a3
            int r4 = r2 + 1
            java.lang.String r0 = "lid"
            X.AnonymousClass36K.A0U(r0, r1, r3, r2)
            r2 = r4
        L_0x04a3:
            if (r38 == 0) goto L_0x04ad
            int r4 = r2 + 1
            r0 = r24
            X.AnonymousClass36K.A0U(r0, r1, r3, r2)
            r2 = r4
        L_0x04ad:
            if (r37 == 0) goto L_0x04cd
            int r5 = r2 + 1
            X.39V[] r1 = X.AnonymousClass0x9.A1V()
            java.lang.String r4 = "v"
            java.lang.String r0 = "1"
            X.AnonymousClass39V.A04(r4, r0, r1)
            r0 = r22
            X.36K r4 = X.AnonymousClass36K.A0I(r0, r1)
            r1 = 0
            r0 = r26
            X.36K r0 = X.AnonymousClass36K.A0F(r4, r0, r1)
            r3[r2] = r0
            r2 = r5
        L_0x04cd:
            if (r39 == 0) goto L_0x04d5
            java.lang.String r0 = "text_status"
            X.AnonymousClass36K.A0U(r0, r1, r3, r2)
        L_0x04d5:
            boolean r4 = X.AnonymousClass0x7.A1S(r16)
            boolean r5 = X.AnonymousClass0x7.A1S(r17)
            int r0 = r4 + 1
            int r0 = r0 + r5
            X.36K[] r2 = new X.AnonymousClass36K[r0]
            java.lang.String r0 = "query"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r1, r3)
            r3 = 0
            r2[r3] = r0
            if (r4 == 0) goto L_0x05c8
            r0 = r16
            X.36K[] r4 = X.C18280x3.A1a(r0, r3)
            java.lang.String r0 = "list"
            X.36K r4 = X.AnonymousClass36K.A0J(r0, r1, r4)
            r0 = 1
            r2[r0] = r4
            r4 = 2
        L_0x04fe:
            if (r5 == 0) goto L_0x050f
            r0 = r17
            X.36K[] r3 = X.C18280x3.A1a(r0, r3)
            java.lang.String r0 = "side_list"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r1, r3)
            r2[r4] = r0
        L_0x050f:
            r0 = 5
            X.39V[] r1 = new X.AnonymousClass39V[r0]
            java.lang.String r3 = "sid"
            r0 = r27
            X.AnonymousClass39V.A04(r3, r0, r1)
            java.lang.String r3 = "index"
            java.lang.String r0 = "0"
            X.AnonymousClass39V.A05(r3, r0, r1)
            java.lang.String r3 = "last"
            java.lang.String r0 = "true"
            X.AnonymousClass39V.A06(r3, r0, r1)
            X.21Z r0 = r11.mode
            java.lang.String r3 = r0.modeString
            java.lang.String r0 = "mode"
            X.AnonymousClass39V.A07(r0, r3, r1)
            java.lang.String r3 = "context"
            X.21x r0 = r11.context
            java.lang.String r0 = r0.contextString
            X.AnonymousClass39V.A08(r3, r0, r1)
            java.lang.String r0 = "usync"
            X.36K r2 = X.AnonymousClass36K.A0J(r0, r1, r2)
            r1 = 3
            X.39V[] r1 = new X.AnonymousClass39V[r1]
            java.lang.String r3 = "xmlns"
            X.AnonymousClass39V.A04(r3, r0, r1)
            r3 = r23
            r0 = r19
            X.AnonymousClass39V.A05(r3, r0, r1)
            java.lang.String r3 = "get"
            r0 = r18
            X.AnonymousClass39V.A06(r0, r3, r1)
            X.36K r2 = X.AnonymousClass36K.A0G(r2, r1)
            boolean r1 = r12.A03
            X.227 r0 = X.AnonymousClass227.A06
            if (r11 != r0) goto L_0x05c4
            java.lang.String r26 = "image"
        L_0x0566:
            X.2U9 r0 = new X.2U9
            r25 = r11
            r40 = r1
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            android.util.Pair r4 = android.util.Pair.create(r0, r2)
            java.lang.Object r3 = r4.first
            X.2U9 r3 = (X.AnonymousClass2U9) r3
            r0 = r42
            java.util.Map r1 = r0.A05
            r0 = r19
            r1.put(r0, r3)
            X.21x r1 = r11.context
            X.21x r0 = X.C373521x.REGISTRATION
            boolean r2 = X.AnonymousClass000.A1Y(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UniSyncProtocolHelper/sendUniSyncIq; request="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = "; sid="
            r1.append(r0)
            r0 = r27
            r1.append(r0)
            java.lang.String r0 = "; isRegistration="
            X.C18260x0.A1E(r0, r1, r2)
            java.lang.Object r0 = r4.second
            X.36K r0 = (X.AnonymousClass36K) r0
            r8 = 102(0x66, float:1.43E-43)
            boolean r11 = X.C18320x8.A1V(r0)
            r9 = r46
            r4 = r41
            r5 = r42
            r6 = r0
            r7 = r19
            if (r2 == 0) goto L_0x05c0
            r4.A0L(r5, r6, r7, r8, r9, r11)
        L_0x05bd:
            X.3dJ r0 = r3.A02
            return r0
        L_0x05c0:
            r4.A0F(r5, r6, r7, r8, r9, r11)
            goto L_0x05bd
        L_0x05c4:
            java.lang.String r26 = "preview"
            goto L_0x0566
        L_0x05c8:
            r4 = 1
            goto L_0x04fe
        L_0x05cb:
            java.lang.String r0 = "merchant_status"
            r4 = 0
            X.36K r6 = X.AnonymousClass36K.A0I(r0, r4)
            java.lang.String r0 = "consumer_status"
            X.36K r9 = X.AnonymousClass36K.A0I(r0, r4)
            java.lang.String r0 = "eligible_offers"
            X.36K r10 = X.AnonymousClass36K.A0I(r0, r4)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r1 = 1
            if (r5 != r1) goto L_0x05e8
            r0.add(r6)
        L_0x05e8:
            r7 = r28 & 2
            r6 = 2
            if (r7 == r6) goto L_0x05f4
            r5 = 16
            r1 = r28 & 16
            r8 = 0
            if (r1 != r5) goto L_0x05f5
        L_0x05f4:
            r8 = 1
        L_0x05f5:
            r5 = 0
            if (r8 == 0) goto L_0x0614
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            if (r7 != r6) goto L_0x0601
            r1.add(r9)
        L_0x0601:
            r7 = r28 & 16
            r6 = 16
            if (r7 != r6) goto L_0x060a
            r1.add(r10)
        L_0x060a:
            X.36K[] r6 = X.C18280x3.A1a(r1, r5)
            java.lang.String r1 = "upi"
            X.AnonymousClass36K.A0S(r1, r0, r4, r6)
        L_0x0614:
            r7 = r28 & 8
            r6 = 8
            if (r7 == r6) goto L_0x0620
            r8 = 32
            r1 = r28 & 32
            if (r1 != r8) goto L_0x063b
        L_0x0620:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            if (r7 != r6) goto L_0x0629
            r1.add(r9)
        L_0x0629:
            r7 = 32
            r6 = r28 & 32
            if (r6 != r7) goto L_0x0632
            r1.add(r10)
        L_0x0632:
            X.36K[] r6 = X.C18280x3.A1a(r1, r5)
            java.lang.String r1 = "fbpay"
            X.AnonymousClass36K.A0S(r1, r0, r4, r6)
        L_0x063b:
            int r6 = r2 + 1
            X.36K[] r5 = X.C18280x3.A1a(r0, r5)
            r1 = 0
            r0 = r20
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r4, r5)
            r3[r2] = r0
            r2 = r6
            goto L_0x048f
        L_0x064d:
            java.lang.String r1 = "preview"
            goto L_0x0448
        L_0x0652:
            r2 = 0
            goto L_0x0402
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68403Ta.A04(X.2x2, java.lang.String, long):java.util.concurrent.Future");
    }

    public final void A05(AnonymousClass2UM r5, List list) {
        C27981fH A012;
        UserJid userJid = r5.A07;
        if ((userJid instanceof PhoneUserJid) && (A012 = this.A02.A01((PhoneUserJid) userJid)) != null) {
            AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
            A1V[0] = new AnonymousClass39V((Jid) A012, "jid");
            list.add(AnonymousClass36K.A0I("lid", A1V));
        }
    }

    public void BQs(String str) {
        AnonymousClass2U9 r0 = (AnonymousClass2U9) this.A05.remove(str);
        if (r0 != null) {
            r0.A02.BQr(new AnonymousClass249(str));
        } else {
            Log.w("UniSyncProtocolHelper/onDeliveryFailure missing request");
        }
    }

    public void BSN(AnonymousClass36K r11, String str) {
        AnonymousClass2U9 r2 = (AnonymousClass2U9) this.A05.remove(str);
        if (r2 != null) {
            AnonymousClass36K A0l = r11.A0l("error");
            int i = 0;
            long j = -1;
            if (A0l != null) {
                String A0r = A0l.A0r("code", (String) null);
                if (A0r != null) {
                    i = Integer.parseInt(A0r);
                }
                String A0r2 = A0l.A0r("backoff", (String) null);
                if (A0r2 != null) {
                    j = Math.min(Long.parseLong(A0r2) * 1000, 3600000);
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("UniSyncProtocolHelper/handleSyncContactError sid=");
            String str2 = r2.A04;
            A0o.append(str2);
            A0o.append(" code=");
            A0o.append(i);
            C18260x0.A12(" backoff=", A0o, j);
            this.A01.BF7(r2.A01, str2, 0, i, j);
            r2.A02.BQt((Object) null);
            return;
        }
        Log.w("UniSyncProtocolHelper/onError missing request");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0204, code lost:
        r0.A0K.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x060a, code lost:
        if (r33 == false) goto L_0x060c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0612, code lost:
        if (r33 != false) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0618, code lost:
        if (X.C107575bX.A0F(r13) == false) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0621, code lost:
        if (r1.A0l("text_status") == null) goto L_0x060c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0627, code lost:
        if (r10.A0Y(r6, 5839) == false) goto L_0x060c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0629, code lost:
        r6 = r1.A0m("text_status");
        r9 = java.util.concurrent.TimeUnit.SECONDS;
        r12 = r9.toMillis(r6.A0e("last_update_time", 0));
        r4 = r6.A0e("ephemeral_duration_sec", 0);
        r11 = r6.A0r("text", (java.lang.String) null);
        r6 = r6.A0l("emoji");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x064e, code lost:
        if (r6 == null) goto L_0x0669;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0650, code lost:
        r6 = r6.A0r("content", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0656, code lost:
        if (r6 == null) goto L_0x0669;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0658, code lost:
        r0.A0I = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x065c, code lost:
        if (r4 <= 0) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x065e, code lost:
        r4 = r12 + r9.toMillis(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0664, code lost:
        r0.A08 = r4;
        r0.A0H = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0669, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x066c, code lost:
        r0.A03 = 1;
        r0.A08 = r4;
        r0.A0H = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01dd, code lost:
        throw X.AnonymousClass24Y.A02("Invalid contact type=", r5, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fc, code lost:
        r0.A04 = r4;
        r5 = r6.A0n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0202, code lost:
        if (r5 == null) goto L_0x01bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r61, java.lang.String r62) {
        /*
            r60 = this;
            r59 = r60
            r0 = r59
            java.util.Map r0 = r0.A05
            r1 = r62
            java.lang.Object r2 = r0.remove(r1)
            X.2U9 r2 = (X.AnonymousClass2U9) r2
            if (r2 == 0) goto L_0x07ee
            java.lang.String r0 = "usync"
            r1 = r61
            X.36K r1 = r1.A0l(r0)
            if (r1 == 0) goto L_0x07e7
            java.lang.String r0 = "result"
            X.36K r0 = r1.A0m(r0)
            boolean r5 = r2.A08
            java.lang.String r4 = " backoff="
            java.lang.String r3 = " code="
            if (r5 == 0) goto L_0x0783
            java.lang.String r6 = "contact"
            X.2al r25 = A00(r0, r6)
            r5 = r25
            boolean r5 = r5.A03
            if (r5 != 0) goto L_0x006c
            boolean r5 = r2.A05
            if (r5 != 0) goto L_0x006c
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "UniSyncProtocolHelper/handleSyncContactError sid="
            r9.append(r5)
            java.lang.String r11 = r2.A04
            r9.append(r11)
            r9.append(r3)
            r5 = r25
            java.lang.Integer r8 = r5.A00
            r9.append(r8)
            r9.append(r4)
            java.lang.Long r7 = r5.A01
            X.C18260x0.A0o(r7, r9)
            r5 = r59
            X.4E5 r9 = r5.A01
            X.227 r10 = r2.A01
            r12 = 0
            int r13 = r8.intValue()
            long r14 = r7.longValue()
            r9.BF7(r10, r11, r12, r13, r14)
        L_0x006c:
            X.36K r6 = r0.A0m(r6)
            java.lang.String r5 = "version"
            java.lang.String r45 = X.AnonymousClass36K.A0L(r6, r5)
        L_0x0077:
            boolean r5 = r2.A0G
            if (r5 == 0) goto L_0x077f
            java.lang.String r5 = "sidelist"
            X.2al r24 = A00(r0, r5)
            r5 = r24
            boolean r5 = r5.A03
            if (r5 != 0) goto L_0x00bc
            boolean r5 = r2.A05
            if (r5 != 0) goto L_0x00bc
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "UniSyncProtocolHelper/handleSyncSidelistError sid="
            r6.append(r5)
            java.lang.String r9 = r2.A04
            r6.append(r9)
            r6.append(r3)
            r3 = r24
            java.lang.Integer r5 = r3.A00
            r6.append(r5)
            r6.append(r4)
            java.lang.Long r4 = r3.A01
            X.C18260x0.A0o(r4, r6)
            r3 = r59
            X.4E5 r6 = r3.A01
            r7 = 0
            int r8 = r5.intValue()
            long r10 = r4.longValue()
            r6.BF9(r7, r8, r9, r10)
        L_0x00bc:
            boolean r3 = r2.A0D
            if (r3 == 0) goto L_0x077b
            java.lang.String r3 = "status"
            X.2al r36 = A00(r0, r3)
        L_0x00c7:
            boolean r3 = r2.A0C
            if (r3 == 0) goto L_0x0777
            java.lang.String r3 = "picture"
            X.2al r37 = A00(r0, r3)
        L_0x00d2:
            boolean r3 = r2.A07
            java.lang.String r30 = "business"
            if (r3 == 0) goto L_0x0773
            r3 = r30
            X.2al r21 = A00(r0, r3)
        L_0x00de:
            boolean r3 = r2.A09
            if (r3 == 0) goto L_0x076f
            java.lang.String r3 = "devices"
            X.2al r38 = A00(r0, r3)
        L_0x00e8:
            int r5 = r2.A00
            r4 = r5 & 1
            r3 = 1
            if (r4 == r3) goto L_0x0766
            r4 = r5 & 2
            r3 = 2
            if (r4 == r3) goto L_0x0766
            r4 = r5 & 8
            r3 = 8
            if (r4 == r3) goto L_0x0766
            r4 = r5 & 16
            r3 = 16
            if (r4 == r3) goto L_0x0766
            r4 = 32
            r3 = r5 & 32
            if (r3 == r4) goto L_0x0766
            r39 = 0
        L_0x0108:
            boolean r3 = r2.A0A
            if (r3 == 0) goto L_0x0762
            java.lang.String r3 = "disappearing_mode"
            X.2al r40 = A00(r0, r3)
        L_0x0112:
            boolean r3 = r2.A0B
            java.lang.String r29 = "lid"
            if (r3 == 0) goto L_0x075e
            r3 = r29
            X.2al r20 = A00(r0, r3)
        L_0x011e:
            boolean r3 = r2.A06
            if (r3 == 0) goto L_0x075a
            java.lang.String r3 = "bot"
            X.2al r42 = A00(r0, r3)
        L_0x0128:
            boolean r3 = r2.A0F
            java.lang.String r28 = "username"
            if (r3 == 0) goto L_0x0756
            r3 = r28
            X.2al r19 = A00(r0, r3)
        L_0x0135:
            boolean r3 = r2.A0E
            if (r3 == 0) goto L_0x0752
            java.lang.String r3 = "text_status"
            X.2al r44 = A00(r0, r3)
        L_0x0140:
            java.lang.String r0 = "list"
            X.36K r0 = r1.A0m(r0)
            java.lang.String r3 = "side_list"
            X.36K r22 = r1.A0l(r3)
            X.36K[] r0 = r0.A03
            r23 = r0
            if (r0 == 0) goto L_0x074e
            int r0 = r0.length
            r18 = r0
        L_0x0156:
            if (r22 == 0) goto L_0x074a
            r0 = r22
            X.36K[] r0 = r0.A03
            if (r0 == 0) goto L_0x074a
            int r0 = r0.length
            r16 = r0
        L_0x0161:
            int r16 = r16 + r18
            java.util.HashMap r26 = X.AnonymousClass001.A0t()
            java.util.ArrayList r27 = X.AnonymousClass001.A0s()
            r14 = 0
        L_0x016c:
            r0 = r16
            if (r14 >= r0) goto L_0x07a7
            r0 = r18
            if (r14 >= r0) goto L_0x073e
            r1 = r23[r14]
            r17 = 0
        L_0x0178:
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.lang.String r4 = "jid"
            com.whatsapp.jid.Jid r5 = r1.A0g(r0, r4)
            if (r5 != 0) goto L_0x0720
            X.2UJ r0 = new X.2UJ
            r0.<init>()
        L_0x0187:
            r3 = r27
            r3.add(r0)
        L_0x018c:
            r3 = 0
            java.lang.String r4 = r1.A0r(r4, r3)
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A08(r4)
            r0.A0D = r4
            if (r17 == 0) goto L_0x071c
            java.lang.String r4 = "sidelist"
        L_0x019c:
            java.util.List r5 = r1.A0s(r4)
            boolean r4 = r5.isEmpty()
            java.lang.String r35 = "type"
            r31 = 3
            r32 = 1
            r7 = -1
            if (r4 != 0) goto L_0x020a
            java.util.List r4 = r0.A0K
            if (r4 != 0) goto L_0x01b8
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r0.A0K = r4
        L_0x01b8:
            java.util.Iterator r8 = r5.iterator()
        L_0x01bc:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x020e
            X.36K r6 = X.C18310x6.A0Y(r8)
            r4 = r35
            java.lang.String r5 = r6.A0q(r4)
            int r4 = r5.hashCode()
            switch(r4) {
                case 3365: goto L_0x01f3;
                case 110414: goto L_0x01e8;
                case 1959784951: goto L_0x01de;
                default: goto L_0x01d3;
            }
        L_0x01d3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid contact type="
            X.24Y r0 = X.AnonymousClass24Y.A02(r0, r5, r1)
            throw r0
        L_0x01de:
            java.lang.String r4 = "invalid"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01d3
            r4 = 3
            goto L_0x01fc
        L_0x01e8:
            java.lang.String r4 = "out"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01d3
            r4 = 2
            goto L_0x01fc
        L_0x01f3:
            java.lang.String r4 = "in"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01d3
            r4 = 1
        L_0x01fc:
            r0.A04 = r4
            java.lang.String r5 = r6.A0n()
            if (r5 == 0) goto L_0x01bc
            java.util.List r4 = r0.A0K
            r4.add(r5)
            goto L_0x01bc
        L_0x020a:
            r4 = r32
            r0.A04 = r4
        L_0x020e:
            java.lang.String r4 = "devices"
            X.36K r5 = r1.A0l(r4)
            java.lang.String r13 = "code"
            if (r5 == 0) goto L_0x0257
            X.36K r6 = r1.A0m(r4)
            java.lang.String r5 = "error"
            X.36K r4 = r6.A0l(r5)
            if (r4 == 0) goto L_0x033c
            r0.A00 = r7
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r8 = "UniSyncProtocolHelper/parseUser/partial error code="
            r4.append(r8)
            X.36K r8 = r6.A0l(r5)
            int r7 = r8.A0b(r13, r7)
            r4.append(r7)
            java.lang.String r7 = "; text="
            r4.append(r7)
            X.36K r6 = r6.A0l(r5)
            java.lang.String r5 = "text"
            java.lang.String r5 = r6.A0r(r5, r3)
            r4.append(r5)
            java.lang.String r5 = "; jid="
            r4.append(r5)
            com.whatsapp.jid.UserJid r5 = r0.A0D
            X.C18270x1.A17(r5, r4)
        L_0x0257:
            java.lang.String r4 = "bot"
            X.36K r5 = r1.A0l(r4)
            if (r5 == 0) goto L_0x04b0
            X.36K r5 = r1.A0l(r4)
            java.lang.String r4 = "profile"
            X.36K r5 = r5.A0m(r4)
            java.lang.String r4 = "tag"
            int r57 = X.AnonymousClass36K.A01(r5, r4)
            java.lang.String r4 = "persona_id"
            java.lang.String r53 = r5.A0r(r4, r3)
            X.36K[] r4 = r5.A03
            if (r4 == 0) goto L_0x0484
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "unisyncprotocolhelper/parseBotData v1 not match user="
            r4.append(r6)
            com.whatsapp.jid.UserJid r6 = r0.A0D
            X.C18260x0.A0m(r6, r4)
            java.lang.String r10 = "name"
            X.36K r7 = r5.A0l(r10)
            java.lang.String r4 = "default"
            X.36K r34 = r5.A0l(r4)
            java.lang.String r4 = "attributes"
            X.36K r33 = r5.A0l(r4)
            java.lang.String r8 = "description"
            X.36K r12 = r5.A0l(r8)
            java.lang.String r4 = "category"
            X.36K r11 = r5.A0l(r4)
            java.lang.String r4 = "prompts"
            X.36K r6 = r5.A0l(r4)
            java.lang.String r4 = "avatar"
            X.36K r9 = r5.A0l(r4)
            java.lang.String r4 = "commands"
            X.36K r4 = r5.A0l(r4)
            r54 = 0
            if (r4 == 0) goto L_0x033a
            X.36K r15 = r4.A0l(r8)
        L_0x02c5:
            if (r7 == 0) goto L_0x0337
            java.lang.String r48 = r7.A0n()
        L_0x02cb:
            if (r34 == 0) goto L_0x0334
            java.lang.String r7 = "true"
            java.lang.String r5 = r34.A0n()
            boolean r5 = r7.equals(r5)
            java.lang.Boolean r47 = java.lang.Boolean.valueOf(r5)
        L_0x02dc:
            if (r33 == 0) goto L_0x0331
            java.lang.String r49 = r33.A0n()
        L_0x02e2:
            if (r12 == 0) goto L_0x032e
            java.lang.String r50 = r12.A0n()
        L_0x02e8:
            if (r11 == 0) goto L_0x032b
            java.lang.String r51 = r11.A0n()
        L_0x02ee:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            if (r6 == 0) goto L_0x0422
            java.lang.String r5 = "prompt"
            java.util.Iterator r12 = X.AnonymousClass36K.A0M(r6, r5)
        L_0x02fb:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x0422
            X.36K r5 = X.C18310x6.A0Y(r12)
            java.lang.String r6 = "text"
            X.36K r6 = r5.A0l(r6)
            if (r6 == 0) goto L_0x02fb
            java.lang.String r7 = r6.A0n()
            if (r7 == 0) goto L_0x02fb
            java.lang.String r6 = "emoji"
            X.36K r5 = r5.A0l(r6)
            if (r5 != 0) goto L_0x0326
            r6 = 0
        L_0x031d:
            X.2k4 r5 = new X.2k4
            r5.<init>(r7, r6)
            r11.add(r5)
            goto L_0x02fb
        L_0x0326:
            java.lang.String r6 = r5.A0n()
            goto L_0x031d
        L_0x032b:
            r51 = r3
            goto L_0x02ee
        L_0x032e:
            r50 = r3
            goto L_0x02e8
        L_0x0331:
            r49 = r3
            goto L_0x02e2
        L_0x0334:
            r47 = r3
            goto L_0x02dc
        L_0x0337:
            r48 = r3
            goto L_0x02cb
        L_0x033a:
            r15 = r3
            goto L_0x02c5
        L_0x033c:
            r4 = r32
            r0.A00 = r4
            java.lang.String r5 = "device"
            r10 = 0
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "unisyncprotocolhelper/parseDeviceData v2 user="
            r7.append(r4)
            com.whatsapp.jid.UserJid r4 = r0.A0D
            X.C18260x0.A0o(r4, r7)
            java.lang.String r4 = "device-list"
            X.36K r7 = r6.A0l(r4)
            if (r7 == 0) goto L_0x03d4
            X.36K r4 = r6.A0l(r4)
            java.util.List r5 = r4.A0s(r5)
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x03d4
            java.util.Map r4 = r0.A0L
            if (r4 != 0) goto L_0x0373
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            r0.A0L = r4
        L_0x0373:
            java.util.Iterator r15 = r5.iterator()
        L_0x0377:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x03d4
            X.36K r5 = X.C18310x6.A0Y(r15)
            java.lang.String r4 = "id"
            int r7 = X.AnonymousClass36K.A02(r5, r4)
            com.whatsapp.jid.UserJid r8 = r0.A0D     // Catch:{ 24P -> 0x0790 }
            X.C626936e.A06(r8)     // Catch:{ 24P -> 0x0790 }
            X.32r r4 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 24P -> 0x0790 }
            com.whatsapp.jid.DeviceJid r12 = r4.A01(r8, r7)     // Catch:{ 24P -> 0x0790 }
            java.lang.String r4 = "is_hosted"
            java.lang.String r7 = r5.A0r(r4, r3)
            boolean r8 = X.C57372tX.A00(r12)
            java.lang.String r4 = "true"
            boolean r4 = r4.equals(r7)
            if (r8 == r4) goto L_0x03c8
            r4 = r59
            X.1VX r9 = r4.A03
            r8 = 6671(0x1a0f, float:9.348E-42)
            X.2vE r4 = X.C58422vE.A02
            boolean r4 = r9.A0Y(r4, r8)
            if (r4 != 0) goto L_0x0789
            r4 = r59
            X.2qk r9 = r4.A00
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "sync; isHosted: "
            java.lang.String r8 = X.AnonymousClass000.A0V(r4, r7, r8)
            r7 = 0
            java.lang.String r4 = "invalid-hosted-flag"
            r9.A0A(r4, r7, r8)
        L_0x03c8:
            java.util.Map r7 = r0.A0L
            java.lang.String r4 = "key-index"
            long r4 = r5.A0e(r4, r10)
            X.AnonymousClass0x2.A1K(r12, r7, r4)
            goto L_0x0377
        L_0x03d4:
            java.lang.String r7 = "key-index-list"
            X.36K r4 = r6.A0l(r7)
            if (r4 == 0) goto L_0x0257
            X.36K r5 = r6.A0l(r7)
            java.lang.String r4 = "ts"
            long r4 = X.AnonymousClass36K.A04(r5, r4)
            r0.A06 = r4
            X.36K r5 = r6.A0l(r7)
            java.lang.String r4 = "expected_ts"
            long r4 = r5.A0e(r4, r10)
            r0.A05 = r4
            X.36K r4 = r6.A0l(r7)
            byte[] r4 = r4.A01
            r0.A0N = r4
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "unisyncprotocolhelper/parseDeviceData v2 index list="
            r6.append(r4)
            com.whatsapp.jid.UserJid r4 = r0.A0D
            r6.append(r4)
            java.lang.String r4 = "; ts="
            r6.append(r4)
            long r4 = r0.A06
            r6.append(r4)
            java.lang.String r4 = "; expectedTs="
            r6.append(r4)
            long r4 = r0.A05
            X.C18260x0.A1I(r6, r4)
            goto L_0x0257
        L_0x0422:
            if (r9 == 0) goto L_0x0471
            java.lang.String r5 = "behavior_graph"
            X.36K r5 = r9.A0l(r5)
            if (r5 == 0) goto L_0x0471
            java.lang.String r52 = r5.A0n()
        L_0x0430:
            if (r15 == 0) goto L_0x0436
            java.lang.String r54 = r15.A0n()
        L_0x0436:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            if (r4 == 0) goto L_0x0474
            java.lang.String r5 = "command"
            java.util.Iterator r9 = X.AnonymousClass36K.A0M(r4, r5)
        L_0x0442:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0474
            X.36K r4 = X.C18310x6.A0Y(r9)
            X.36K r5 = r4.A0l(r10)
            if (r5 == 0) goto L_0x0442
            java.lang.String r6 = r5.A0n()
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x0442
            X.36K r4 = r4.A0l(r8)
            if (r4 != 0) goto L_0x046c
            r5 = 0
        L_0x0463:
            X.2k3 r4 = new X.2k3
            r4.<init>(r6, r5)
            r7.add(r4)
            goto L_0x0442
        L_0x046c:
            java.lang.String r5 = r4.A0n()
            goto L_0x0463
        L_0x0471:
            r52 = r3
            goto L_0x0430
        L_0x0474:
            r58 = 0
            X.2o3 r4 = new X.2o3
            r46 = r4
            r55 = r11
            r56 = r7
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r0.A0A = r4
            goto L_0x04b0
        L_0x0484:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "unisyncprotocolhelper/parseBotData v1 match user="
            r5.append(r4)
            com.whatsapp.jid.UserJid r4 = r0.A0D
            X.C18260x0.A0m(r4, r5)
            X.3d3 r55 = X.C72023d3.A00
            X.2o3 r4 = new X.2o3
            r48 = r3
            r49 = r3
            r50 = r3
            r51 = r3
            r52 = r3
            r54 = r3
            r46 = r4
            r47 = r3
            r56 = r55
            r58 = r32
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r0.A0A = r4
        L_0x04b0:
            java.lang.String r4 = "status"
            X.36K r5 = r1.A0l(r4)
            java.lang.String r15 = "t"
            if (r5 == 0) goto L_0x0506
            X.36K r8 = r1.A0m(r4)
            long r4 = X.AnonymousClass36K.A05(r8, r15)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            java.lang.String r7 = r8.A0r(r13, r3)
            r6 = r35
            java.lang.String r11 = r8.A0r(r6, r3)
            java.lang.String r13 = r8.A0n()
            r6 = r59
            X.1VX r10 = r6.A03
            r9 = 5839(0x16cf, float:8.182E-42)
            X.2vE r6 = X.C58422vE.A02
            boolean r33 = r10.A0Y(r6, r9)
            if (r11 == 0) goto L_0x05fb
            java.lang.String r12 = "fail"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x05fb
            java.lang.String r4 = "401"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x05f6
            java.lang.String r4 = "403"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x05f6
            java.lang.String r4 = "404"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x05f6
            r4 = 0
            r0.A03 = r4
        L_0x0506:
            java.lang.String r4 = "picture"
            X.36K r5 = r1.A0l(r4)
            java.lang.String r13 = "id"
            if (r5 == 0) goto L_0x05f1
            X.36K r5 = r1.A0m(r4)
            r4 = -1
            int r4 = r5.A0b(r13, r4)
            r0.A02 = r4
            java.lang.String r4 = "direct_path"
            java.lang.String r4 = r5.A0r(r4, r3)
            r0.A0E = r4
            java.lang.String r4 = "hash"
            java.lang.String r4 = r5.A0r(r4, r3)
            r0.A0F = r4
        L_0x052c:
            java.lang.String r4 = "pay"
            X.36K r11 = r1.A0l(r4)
            if (r11 == 0) goto L_0x0676
            X.2Pz r4 = new X.2Pz
            r4.<init>()
            r0.A0B = r4
            java.lang.String r4 = "merchant_status"
            X.36K r6 = r11.A0l(r4)
            java.lang.String r12 = "value"
            java.lang.String r7 = "dhash"
            if (r6 == 0) goto L_0x055b
            X.2Pz r5 = r0.A0B
            java.lang.String r4 = "false"
            boolean r4 = X.AnonymousClass36K.A0X(r6, r12, r4)
            r5.A03 = r4
            X.2Pz r4 = r0.A0B
            java.lang.String r5 = r6.A0r(r7, r3)
            r4.A00 = r5
        L_0x055b:
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r32)
            java.lang.String r4 = "upi"
            r6.put(r5, r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r31)
            java.lang.String r4 = "fbpay"
            r6.put(r5, r4)
            java.util.Iterator r32 = X.AnonymousClass001.A0u(r6)
        L_0x0576:
            boolean r4 = r32.hasNext()
            if (r4 == 0) goto L_0x0676
            java.util.Map$Entry r31 = X.AnonymousClass001.A0w(r32)
            java.lang.String r4 = X.AnonymousClass0x9.A12(r31)
            X.36K r6 = r11.A0l(r4)
            if (r6 == 0) goto L_0x0576
            java.lang.String r4 = "consumer_status"
            X.36K r4 = r6.A0l(r4)
            if (r4 == 0) goto L_0x05ae
            X.2Pz r9 = r0.A0B
            java.lang.Object r10 = r31.getKey()
            java.lang.String r8 = r4.A0q(r12)
            java.lang.String r5 = r4.A0r(r7, r3)
            X.2Ka r4 = new X.2Ka
            r4.<init>()
            r4.A01 = r8
            r4.A00 = r5
            java.util.HashMap r5 = r9.A01
            r5.put(r10, r4)
        L_0x05ae:
            java.lang.String r4 = "eligible_offers"
            X.36K r6 = r6.A0l(r4)
            if (r6 == 0) goto L_0x0576
            java.lang.String r4 = "offer"
            X.36K r8 = r6.A0l(r4)
            X.2Pz r5 = r0.A0B
            java.lang.Object r4 = r31.getKey()
            if (r8 == 0) goto L_0x05dc
            java.lang.String r9 = r8.A0q(r13)
            java.lang.String r8 = r6.A0r(r7, r3)
            X.2Kb r6 = new X.2Kb
            r6.<init>()
            r6.A01 = r9
            r6.A00 = r8
            java.util.HashMap r5 = r5.A02
            r5.put(r4, r6)
            goto L_0x0576
        L_0x05dc:
            java.lang.String r9 = ""
            java.lang.String r8 = r6.A0r(r7, r3)
            X.2Kb r6 = new X.2Kb
            r6.<init>()
            r6.A01 = r9
            r6.A00 = r8
            java.util.HashMap r5 = r5.A02
            r5.put(r4, r6)
            goto L_0x0576
        L_0x05f1:
            r4 = -1
            r0.A02 = r4
            goto L_0x052c
        L_0x05f6:
            r4 = 2
            r0.A03 = r4
            goto L_0x0506
        L_0x05fb:
            X.39V[] r7 = r8.A0u()
            if (r7 == 0) goto L_0x0604
            int r7 = r7.length
            if (r7 != 0) goto L_0x0612
        L_0x0604:
            boolean r7 = android.text.TextUtils.isEmpty(r13)
            if (r7 == 0) goto L_0x0612
            if (r33 != 0) goto L_0x0614
        L_0x060c:
            r4 = r31
            r0.A03 = r4
            goto L_0x0506
        L_0x0612:
            if (r33 == 0) goto L_0x066c
        L_0x0614:
            boolean r7 = X.C107575bX.A0F(r13)
            if (r7 == 0) goto L_0x066c
            java.lang.String r4 = "text_status"
            X.36K r5 = r1.A0l(r4)
            if (r5 == 0) goto L_0x060c
            boolean r5 = r10.A0Y(r6, r9)
            if (r5 == 0) goto L_0x060c
            X.36K r6 = r1.A0m(r4)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r4 = "last_update_time"
            r7 = 0
            long r4 = r6.A0e(r4, r7)
            long r12 = r9.toMillis(r4)
            java.lang.String r4 = "ephemeral_duration_sec"
            long r4 = r6.A0e(r4, r7)
            java.lang.String r10 = "text"
            java.lang.String r11 = r6.A0r(r10, r3)
            java.lang.String r10 = "emoji"
            X.36K r6 = r6.A0l(r10)
            if (r6 == 0) goto L_0x0669
            java.lang.String r10 = "content"
            java.lang.String r6 = r6.A0r(r10, r3)
            if (r6 == 0) goto L_0x0669
        L_0x0658:
            r0.A0I = r6
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0664
            long r6 = r9.toMillis(r4)
            long r4 = r12 + r6
        L_0x0664:
            r0.A08 = r4
            r0.A0H = r11
            goto L_0x060c
        L_0x0669:
            java.lang.String r6 = ""
            goto L_0x0658
        L_0x066c:
            r6 = r32
            r0.A03 = r6
            r0.A08 = r4
            r0.A0H = r13
            goto L_0x0506
        L_0x0676:
            java.lang.String r3 = "disappearing_mode"
            X.36K r5 = r1.A0l(r3)
            if (r5 == 0) goto L_0x068d
            java.lang.String r4 = "duration"
            r3 = -1
            int r3 = r5.A0b(r4, r3)
            r0.A01 = r3
            long r3 = X.AnonymousClass36K.A04(r5, r15)
            r0.A07 = r3
        L_0x068d:
            r3 = r17
            r0.A0M = r3
            java.lang.String r3 = r2.A03
            r0.A0G = r3
            com.whatsapp.jid.UserJid r3 = r0.A0D
            if (r3 == 0) goto L_0x06e1
            r3 = r30
            X.36K r4 = r1.A0l(r3)
            if (r21 == 0) goto L_0x06e1
            r3 = r21
            boolean r3 = r3.A03
            if (r3 == 0) goto L_0x06e1
            if (r4 == 0) goto L_0x06e1
            com.whatsapp.jid.UserJid r3 = r0.A0D
            X.2Nf r7 = new X.2Nf
            r7.<init>()
            r7.A01 = r3
            r7.A02 = r4
            java.lang.String r3 = "verified_name"
            X.36K r6 = r4.A0l(r3)
            if (r6 == 0) goto L_0x0718
            X.2Ne r5 = new X.2Ne
            r5.<init>()
            byte[] r3 = r6.A01
            r5.A02 = r3
            java.lang.String r4 = "verified_level"
            r3 = 0
            java.lang.String r3 = r6.A0r(r4, r3)
            X.C626936e.A06(r3)
            int r3 = X.AnonymousClass28W.A00(r3)
            r5.A00 = r3
            X.3ZC r3 = X.AnonymousClass36K.A0B(r6)
            r5.A01 = r3
            r7.A00 = r5
        L_0x06df:
            r0.A09 = r7
        L_0x06e1:
            if (r20 == 0) goto L_0x06fe
            r3 = r20
            boolean r3 = r3.A03
            if (r3 == 0) goto L_0x06fe
            r3 = r29
            X.36K r5 = r1.A0l(r3)
            if (r5 == 0) goto L_0x06fe
            java.lang.Class<X.1fH> r4 = X.C27981fH.class
            java.lang.String r3 = "val"
            com.whatsapp.jid.Jid r3 = r5.A0g(r4, r3)
            X.1fH r3 = (X.C27981fH) r3
            r0.A0C = r3
        L_0x06fe:
            if (r19 == 0) goto L_0x0714
            r3 = r19
            boolean r3 = r3.A03
            if (r3 == 0) goto L_0x0714
            r3 = r28
            X.36K r1 = r1.A0l(r3)
            if (r1 == 0) goto L_0x0714
            java.lang.String r1 = r1.A0n()
            r0.A0J = r1
        L_0x0714:
            int r14 = r14 + 1
            goto L_0x016c
        L_0x0718:
            r3 = 0
            r7.A00 = r3
            goto L_0x06df
        L_0x071c:
            java.lang.String r4 = "contact"
            goto L_0x019c
        L_0x0720:
            r0 = r26
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x0732
            r0 = r26
            java.lang.Object r0 = r0.get(r5)
            X.2UJ r0 = (X.AnonymousClass2UJ) r0
            goto L_0x018c
        L_0x0732:
            X.2UJ r0 = new X.2UJ
            r0.<init>()
            r3 = r26
            r3.put(r5, r0)
            goto L_0x0187
        L_0x073e:
            r0 = r22
            X.36K[] r0 = r0.A03
            int r1 = r14 - r18
            r1 = r0[r1]
            r17 = 1
            goto L_0x0178
        L_0x074a:
            r16 = 0
            goto L_0x0161
        L_0x074e:
            r18 = 0
            goto L_0x0156
        L_0x0752:
            r44 = 0
            goto L_0x0140
        L_0x0756:
            r19 = 0
            goto L_0x0135
        L_0x075a:
            r42 = 0
            goto L_0x0128
        L_0x075e:
            r20 = 0
            goto L_0x011e
        L_0x0762:
            r40 = 0
            goto L_0x0112
        L_0x0766:
            java.lang.String r3 = "pay"
            X.2al r39 = A00(r0, r3)
            goto L_0x0108
        L_0x076f:
            r38 = 0
            goto L_0x00e8
        L_0x0773:
            r21 = 0
            goto L_0x00de
        L_0x0777:
            r37 = 0
            goto L_0x00d2
        L_0x077b:
            r36 = 0
            goto L_0x00c7
        L_0x077f:
            r24 = 0
            goto L_0x00bc
        L_0x0783:
            r45 = 0
            r25 = 0
            goto L_0x0077
        L_0x0789:
            java.lang.String r0 = "Invalid hosted device id"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0790:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Invalid device id jid="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "; id="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r2, r7)
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x07a7:
            r1 = 0
            X.2UJ[] r3 = new X.AnonymousClass2UJ[r1]
            r0 = r27
            java.lang.Object[] r3 = r0.toArray(r3)
            X.2UJ[] r3 = (X.AnonymousClass2UJ[]) r3
            X.2Tz r0 = new X.2Tz
            r32 = r0
            r33 = r25
            r34 = r24
            r35 = r21
            r41 = r20
            r43 = r19
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            X.2Kc r5 = new X.2Kc
            r5.<init>(r0, r3)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UniSyncProtocolHelper/handleSyncResult sid="
            r4.append(r0)
            java.lang.String r3 = r2.A04
            r4.append(r3)
            java.lang.String r0 = " querySync="
            r4.append(r0)
            boolean r0 = r2.A05
            X.C18260x0.A1V(r4, r0)
            r0 = r59
            X.4E5 r0 = r0.A01
            r0.BF8(r5, r3, r1)
        L_0x07e7:
            X.3dJ r1 = r2.A02
            r0 = 0
            r1.BQt(r0)
            return
        L_0x07ee:
            java.lang.String r0 = "UniSyncProtocolHelper/onSuccess missing request"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68403Ta.BdM(X.36K, java.lang.String):void");
    }

    public C68403Ta(C55682qk r2, AnonymousClass4E5 r3, C56662sM r4, AnonymousClass1VX r5, AnonymousClass31C r6) {
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
    }

    public static C45902al A00(AnonymousClass36K r0, String str) {
        return A01(r0.A0m(str), str);
    }

    public static AnonymousClass36K A02(AnonymousClass8OQ r3, int i) {
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass39V[] r2 = null;
        if (!r3.containsKey(valueOf)) {
            return null;
        }
        String str = (String) r3.get(valueOf);
        if (!TextUtils.isEmpty(str)) {
            r2 = AnonymousClass0x9.A1V();
            AnonymousClass39V.A04("dhash", str, r2);
        }
        return AnonymousClass36K.A0I("consumer_status", r2);
    }

    public static AnonymousClass36K A03(AnonymousClass8OQ r3, int i) {
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass39V[] r2 = null;
        if (!r3.containsKey(valueOf)) {
            return null;
        }
        String str = (String) r3.get(valueOf);
        if (!TextUtils.isEmpty(str)) {
            r2 = AnonymousClass0x9.A1V();
            AnonymousClass39V.A04("dhash", str, r2);
        }
        return AnonymousClass36K.A0I("eligible_offers", r2);
    }
}
