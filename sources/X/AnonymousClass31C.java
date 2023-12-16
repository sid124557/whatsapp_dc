package X;

import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.31C  reason: invalid class name */
public class AnonymousClass31C {
    public AnonymousClass2WX A00;
    public final C55682qk A01;
    public final C29411im A02;
    public final AnonymousClass1VX A03;
    public final C52552lf A04;
    public final C50122hf A05;
    public final C64173Cl A06;
    public final C48142eQ A07;
    public final C613430h A08;
    public final C383927j A09;
    public final C55892r5 A0A;
    public final AnonymousClass8JP A0B;
    public final AtomicInteger A0C = new AtomicInteger();
    public volatile AnonymousClass4EW A0D;

    public final Future A05(Message message, AnonymousClass39T r5) {
        C162457s7.A0J(message, 1);
        C626936e.A07(r5, "MessageClient/sendAckableMessage: stanzaKey is null");
        AnonymousClass39T A002 = A00(r5);
        C72183dJ r1 = new C72183dJ();
        this.A05.A00(A002, r1);
        A0B(message, false);
        return r1;
    }

    public final Future A06(Message message, String str) {
        C162457s7.A0J(message, 1);
        C626936e.A07(str, "MessageClient/sendIq: id is null");
        C72183dJ r2 = new C72183dJ();
        Map map = this.A05.A06;
        synchronized (map) {
            map.put(str, r2);
        }
        A0B(message, false);
        this.A08.A05(str);
        return r2;
    }

    public final void A09(Message message, String str) {
        C162457s7.A0J(message, 0);
        A0A(message, str, false);
    }

    public final void A0D(AnonymousClass4EZ r9, AnonymousClass36K r10, String str, int i, long j) {
        C18260x0.A0S(r10, r9);
        A0F(r9, r10, str, i, j, false);
    }

    public final void A0E(AnonymousClass4EZ r17, AnonymousClass36K r18, String str, int i, long j) {
        String str2 = str;
        C162457s7.A0J(str2, 1);
        AnonymousClass4EZ r3 = r17;
        AnonymousClass36K r4 = r18;
        int i2 = i;
        long j2 = j;
        if (!A0K(r3, r4, str2, i2, j2)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MessageClient/sendIqWithCallback/add-to-pending type: ");
            A0o.append(i2);
            C18260x0.A0s(" id: ", str2, A0o);
            this.A08.A03(r3, str2, i2, j2, true);
            this.A04.A00(C383827i.A00(r4, Boolean.valueOf(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1)))), str2, i2, false, false), str2, false);
        }
    }

    public final void A0H(AnonymousClass39T r4) {
        C162457s7.A0J(r4, 0);
        this.A0A.A04(r4.A00);
        Message A032 = AnonymousClass36N.A03(this.A01, this.A03, r4);
        C162457s7.A0D(A032);
        A0J(A032);
    }

    public final boolean A0J(Message message) {
        C162457s7.A0J(message, 0);
        if (!this.A02.A06) {
            return false;
        }
        A0B(message, false);
        return true;
    }

    public final boolean A0K(AnonymousClass4EZ r9, AnonymousClass36K r10, String str, int i, long j) {
        C18260x0.A0V(str, r10, r9);
        return A0L(r9, r10, str, i, j, false);
    }

    public static final AnonymousClass39T A00(AnonymousClass39T r3) {
        Jid jid = r3.A02;
        C50412i8 r2 = null;
        if (jid instanceof DeviceJid) {
            DeviceJid deviceJid = (DeviceJid) jid;
            if (deviceJid.getDevice() == 0) {
                r2 = r3.A02();
                r2.A02 = deviceJid.userJid;
                C18260x0.A1P(AnonymousClass001.A0o(), "expecting a user jid for remote jid in ack for ", r3);
            }
        }
        DeviceJid of = DeviceJid.of(r3.A01);
        if (of != null && of.getDevice() == 0) {
            if (r2 == null) {
                r2 = r3.A02();
            }
            r2.A01 = of.userJid;
            C18260x0.A1P(AnonymousClass001.A0o(), "expecting a user jid for participant jid in ack for ", r3);
        } else if (r2 == null) {
            return r3;
        }
        return r2.A01();
    }

    public static Object A01(AnonymousClass31C r8, AnonymousClass36K r9, String str, C84814Du r11, int i) {
        return r8.A02(r9, str, r11, i, 32000, false);
    }

    public final String A03() {
        String A0X;
        C613430h r6 = this.A08;
        synchronized (r6.A0C) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("0");
            int i = r6.A00;
            r6.A00 = i + 1;
            A0X = AnonymousClass000.A0X(Integer.toHexString(i), A0o);
            C626936e.A0C(AnonymousClass000.A1X(r6.A0F.put(A0X, r6.A0B)));
            if (r6.A00 == 65536) {
                r6.A04.A0A("iqId too large", false, (String) null);
                r6.A00 = 0;
            }
        }
        C162457s7.A0D(A0X);
        return A0X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r0.A0A != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        r7.A06.A07(r3);
        r4 = android.os.Message.obtain((android.os.Handler) null, 0, 43, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (r6.A0Y(r5, 5452) != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r9 != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(android.os.Message r8, boolean r9) {
        /*
            r7 = this;
            X.4EW r0 = r7.A0D
            if (r0 != 0) goto L_0x0016
            X.1im r1 = r7.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x00a2
            int r1 = r1.A03
            r0 = 12
            if (r1 != r0) goto L_0x00a2
            java.lang.String r0 = "MessageClient/sendXmpp/drop the stanza if xmpp is not ready for a good reason"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageClient/sendXmpp; type="
            r1.append(r0)
            int r0 = X.C384127l.A00(r8)
            X.C18260x0.A1G(r1, r0)
            int r0 = X.C384127l.A00(r8)
            switch(r0) {
                case 4: goto L_0x002f;
                case 8: goto L_0x002f;
                case 12: goto L_0x002f;
                case 25: goto L_0x002f;
                case 27: goto L_0x002f;
                case 35: goto L_0x002f;
                case 38: goto L_0x002f;
                case 59: goto L_0x002f;
                case 60: goto L_0x002f;
                case 71: goto L_0x002f;
                case 72: goto L_0x002f;
                case 73: goto L_0x002f;
                case 77: goto L_0x002f;
                case 89: goto L_0x002f;
                case 118: goto L_0x002f;
                case 119: goto L_0x002f;
                case 157: goto L_0x002f;
                case 194: goto L_0x002f;
                case 206: goto L_0x002f;
                case 220: goto L_0x002f;
                case 255: goto L_0x002f;
                case 273: goto L_0x002f;
                case 327: goto L_0x002f;
                case 371: goto L_0x002f;
                case 381: goto L_0x002f;
                case 402: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            if (r9 == 0) goto L_0x0046
        L_0x002f:
            X.2WX r0 = r7.A00
            X.C626936e.A06(r0)
            X.3Lt r2 = r0.A00
            X.2zb r1 = r2.A0s
            r0 = 4
            X.C61032zb.A00(r1, r0)
            X.2pM r0 = r2.A0p
            r0.A02()
            r1 = 1
            r0 = 0
            r2.A0H(r1, r0, r0)
        L_0x0046:
            X.1VX r6 = r7.A03
            X.2vE r5 = X.C58422vE.A01
            r0 = 6002(0x1772, float:8.41E-42)
            boolean r0 = r6.A0Y(r5, r0)
            r4 = 0
            if (r0 == 0) goto L_0x0086
            r0 = 4429(0x114d, float:6.206E-42)
            boolean r0 = r6.A0Y(r5, r0)
            if (r0 != 0) goto L_0x0063
            r0 = 5452(0x154c, float:7.64E-42)
            boolean r0 = r6.A0Y(r5, r0)
            if (r0 == 0) goto L_0x0086
        L_0x0063:
            X.2lg r3 = X.AnonymousClass36N.A08(r8, r6)
            if (r3 == 0) goto L_0x0086
            X.2r5 r2 = r7.A0A
            long r0 = r3.A00
            X.2rb r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x0099
            r0.A02()
            java.lang.Integer r0 = r0.A0A
            if (r0 == 0) goto L_0x0099
        L_0x007a:
            X.3Cl r0 = r7.A06
            r0.A07(r3)
            r1 = 0
            r0 = 43
            android.os.Message r4 = android.os.Message.obtain(r4, r1, r0, r1, r3)
        L_0x0086:
            X.4EW r1 = r7.A0D
            if (r1 == 0) goto L_0x0015
            if (r4 != 0) goto L_0x0090
            android.os.Message r4 = android.os.Message.obtain(r8)
        L_0x0090:
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 4
            r4.what = r0
            r1.sendMessage(r4)
            return
        L_0x0099:
            r0 = 5452(0x154c, float:7.64E-42)
            boolean r0 = r6.A0Y(r5, r0)
            if (r0 == 0) goto L_0x0086
            goto L_0x007a
        L_0x00a2:
            java.lang.String r0 = "sendXmpp called before sending channel is ready"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31C.A0B(android.os.Message, boolean):void");
    }

    public final void A0C(C56612sH r27, AnonymousClass4EZ r28, AnonymousClass36K r29, String str, int i, int i2, long j) {
        AnonymousClass36K r12 = r29;
        int i3 = i;
        long j2 = j;
        AnonymousClass3TB r8 = new AnonymousClass3TB(r27, this, r28, r12, i3, i2, j2);
        boolean z = true;
        boolean z2 = false;
        String str2 = str;
        if (!this.A02.A06 || this.A0D == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MessageClient/sendIqWithRetryInternal/add-to-pending inFlightMessages type: ");
            A0o.append(i3);
            C18260x0.A0s(" id: ", str2, A0o);
            this.A08.A03(r8, str2, i3, j2, false);
            C52552lf r1 = this.A04;
            if (j <= 0) {
                z = false;
            }
            r1.A00(C383827i.A00(r12, Boolean.valueOf(z), str2, i3, false, false), str2, false);
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MessageClient/sendIqWithRetryInternal/add-to-pending type: ");
        A0o2.append(i3);
        C18260x0.A0s(" id: ", str2, A0o2);
        this.A08.A03(r8, str2, i3, j2, false);
        if (j > 0) {
            z2 = true;
        }
        A0B(C383827i.A00(r12, Boolean.valueOf(z2), str2, i3, false, false), true);
    }

    public final void A0G(AnonymousClass36K r7, int i) {
        if (this.A02.A06) {
            A0B(C383827i.A00(r7, (Boolean) null, (String) null, i, false, false), false);
        } else {
            Log.d("MessageClient/sendProtocolTreeNode not ready to send PTN");
        }
    }

    public final boolean A0I() {
        C29411im r1 = this.A02;
        if (!r1.A06 || !AnonymousClass000.A1U(r1.A04, 2)) {
            return false;
        }
        return true;
    }

    public final boolean A0L(AnonymousClass4EZ r10, AnonymousClass36K r11, String str, int i, long j, boolean z) {
        boolean z2 = false;
        String str2 = str;
        if (!this.A02.A06 || this.A0D == null) {
            this.A08.A05(str);
            C18260x0.A0s("MessageClient/sendIqWithCallback not ready, iqId=", str, AnonymousClass001.A0o());
            return false;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageClient/sendIqWithCallbackInternal/add-to-pending type: ");
        int i2 = i;
        A0o.append(i);
        C18260x0.A0s(" id: ", str, A0o);
        this.A08.A03(r10, str2, i2, j, false);
        if (j > 0) {
            z2 = true;
        }
        A0B(C383827i.A00(r11, Boolean.valueOf(z2), str2, i2, z, false), true);
        return true;
    }

    public AnonymousClass31C(C55682qk r2, C29411im r3, AnonymousClass1VX r4, C52552lf r5, C50122hf r6, C64173Cl r7, C48142eQ r8, C613430h r9, C383927j r10, C55892r5 r11, AnonymousClass8JP r12) {
        C18260x0.A0f(r4, r2, r7, r8, r5);
        C18260x0.A0g(r3, r12, r11, r10, r6);
        C162457s7.A0J(r9, 11);
        this.A03 = r4;
        this.A01 = r2;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A02 = r3;
        this.A0B = r12;
        this.A0A = r11;
        this.A09 = r10;
        this.A05 = r6;
        this.A08 = r9;
    }

    public final Object A02(AnonymousClass36K r22, String str, C84814Du r24, int i, long j, boolean z) {
        boolean z2 = true;
        AnonymousClass46G r4 = new AnonymousClass46G(C57702u4.A01(r24), 1);
        r4.A0A();
        AnonymousClass4KQ r7 = new AnonymousClass4KQ(r4, 3);
        AnonymousClass36K r8 = r22;
        String str2 = str;
        int i2 = i;
        long j2 = j;
        if (z) {
            A0F(r7, r8, str2, i2, j2, false);
        } else if (!A0L(r7, r8, str2, i2, j2, false)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MessageClient/sendIq/add-to-pending type: ");
            A0o.append(i2);
            C18260x0.A0s(" id: ", str2, A0o);
            String str3 = str2;
            int i3 = i2;
            this.A08.A03(r7, str3, i3, j2, true);
            C52552lf r3 = this.A04;
            if (j <= 0) {
                z2 = false;
            }
            r3.A00(C383827i.A00(r8, Boolean.valueOf(z2), str3, i3, false, false), str2, false);
        }
        return r4.A06();
    }

    public final String A04() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('n');
        return AnonymousClass000.A0X(Integer.toHexString(this.A0C.getAndIncrement()), A0o);
    }

    public final Future A07(AnonymousClass36K r10, AnonymousClass39T r11, int i) {
        AnonymousClass39T A002 = A00(r11);
        C72183dJ r2 = new C72183dJ();
        C29411im r1 = this.A02;
        if (!r1.A06 || !AnonymousClass000.A1U(r1.A04, 2)) {
            r2.BQr(AnonymousClass002.A0C("MessageClient not ready, user not registered likely"));
            return r2;
        }
        this.A05.A00(A002, r2);
        A0B(C383827i.A00(r10, (Boolean) null, (String) null, i, false, false), false);
        return r2;
    }

    public final void A08(long j) {
        C626936e.A00();
        C29411im r3 = this.A02;
        if (!AnonymousClass000.A1U(r3.A04, 2)) {
            if (this.A00 != null) {
                Log.i("app/msghandler-not-connected/connecting-now");
                AnonymousClass2WX r0 = this.A00;
                if (r0 != null) {
                    C66523Lt r2 = r0.A00;
                    C61032zb.A00(r2.A0s, 4);
                    r2.A0p.A02();
                    r2.A0H(true, false, false);
                } else {
                    throw C18290x4.A0Y();
                }
            } else {
                Log.i("app/msghandler-not-connected/too-early-to-connect");
            }
            Log.i("app/waiting-for-msghandler-to-be-connected");
            C626936e.A00();
            if (!r3.A02.block(j)) {
                Log.i("gdrive-service/backup-map/timeout-while-waiting-for-msghandler-to-be-connected/abort");
                throw new C376223j();
            }
        }
        Log.i("app/msghandler-connected/true");
    }

    public final void A0A(Message message, String str, boolean z) {
        int A002 = C384127l.A00(message);
        if (this.A02.A06) {
            if (z) {
                C48142eQ r2 = this.A07;
                C626936e.A07(str, AnonymousClass000.A0P(message, "Ackable message with null id not allowed:", C18290x4.A0u(str)));
                LinkedHashMap linkedHashMap = r2.A00;
                synchronized (linkedHashMap) {
                    int i = 1;
                    if (linkedHashMap.containsKey(str)) {
                        i = 1 + AnonymousClass0x7.A05(((Pair) linkedHashMap.get(str)).second);
                    }
                    linkedHashMap.put(str, C18300x5.A0E(message, i));
                }
            }
            A0B(message, false);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageClient/sendMessageWhenReady/add-to-pending type: ");
        A0o.append(A002);
        C18260x0.A0s(" id: ", str, A0o);
        this.A04.A00(message, str, z);
    }

    public final void A0F(AnonymousClass4EZ r10, AnonymousClass36K r11, String str, int i, long j, boolean z) {
        AnonymousClass4EZ r3 = r10;
        String str2 = str;
        if (A0I()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MessageClient/sendIqWithCallbackIfConnectedInternal/add-to-pending type: ");
            int i2 = i;
            A0o.append(i);
            C18260x0.A0s(" id: ", str, A0o);
            this.A08.A03(r3, str2, i2, j, false);
            A0B(C383827i.A00(r11, Boolean.valueOf(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1)))), str2, i2, z, true), false);
            return;
        }
        this.A08.A05(str);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MessageClient/sendIqWithCallback ready:");
        C29411im r1 = this.A02;
        A0o2.append(r1.A06);
        A0o2.append(" connected:");
        A0o2.append(AnonymousClass000.A1U(r1.A04, 2));
        C18260x0.A0s(" iqId=", str, A0o2);
        r10.BQs(str);
    }
}
