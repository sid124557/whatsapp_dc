package X;

import java.util.Map;

/* renamed from: X.2mp  reason: invalid class name and case insensitive filesystem */
public abstract class C53272mp {
    public Map A00;
    public final C55682qk A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;
    public final C60592yo A04;

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0456, code lost:
        if (r6.A0Y(r1, 4923) == false) goto L_0x0458;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass36K r18) {
        /*
            r17 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C32111pa
            r4 = r18
            if (r0 == 0) goto L_0x00ec
            X.1pa r3 = (X.C32111pa) r3
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r1 = r4.A0g(r1, r0)
            boolean r0 = r1 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x002e
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            X.2sr r0 = r3.A00
            boolean r0 = r0.A0b(r1)
            if (r0 == 0) goto L_0x002d
            X.2yo r0 = r3.A04
            X.4Ag r3 = r0.A01
            r0 = 213(0xd5, float:2.98E-43)
            android.os.Message r0 = X.C18290x4.A0J(r0, r4)
        L_0x002a:
            r3.Bfr(r0)
        L_0x002d:
            return
        L_0x002e:
            X.4uZ r7 = X.C627336j.A02(r1)
            if (r7 == 0) goto L_0x002d
            java.lang.String r0 = "type"
            r5 = 0
            java.lang.String r1 = r4.A0r(r0, r5)
            java.lang.String r0 = "name"
            java.lang.String r6 = r4.A0r(r0, r5)
            java.lang.String r9 = "presence"
            java.lang.String r8 = r4.A0r(r9, r5)
            java.lang.String r0 = "unavailable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            X.2yo r5 = r3.A04
            long r1 = X.C57522tm.A00(r4)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/presence/unavailable "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = " "
            r3.append(r0)
            r3.append(r1)
            X.C18260x0.A0s(r0, r8, r3)
            X.4Ag r3 = r5.A01
            android.os.Bundle r4 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jid"
            X.C384027k.A00(r4, r7, r0)
            java.lang.String r0 = "pushName"
            r4.putString(r0, r6)
            java.lang.String r0 = "lastSeen"
            r4.putLong(r0, r1)
            r4.putString(r9, r8)
            r0 = 64
            android.os.Message r0 = X.C18290x4.A0J(r0, r4)
            goto L_0x002a
        L_0x0090:
            java.lang.String r0 = "unsubscribe"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00be
            X.2yo r2 = r3.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/presence/unsubscribe "
            X.C18260x0.A1R(r1, r0, r7)
            X.4Ag r3 = r2.A01
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jid"
            X.C384027k.A00(r2, r7, r0)
            java.lang.String r0 = "pushName"
            r2.putString(r0, r6)
            r1 = 0
            r0 = 88
            android.os.Message r0 = android.os.Message.obtain(r5, r1, r0, r1, r2)
            goto L_0x002a
        L_0x00be:
            if (r1 == 0) goto L_0x00c8
            java.lang.String r0 = "available"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002d
        L_0x00c8:
            X.2yo r2 = r3.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/presence/available "
            X.C18260x0.A1R(r1, r0, r7)
            X.4Ag r3 = r2.A01
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jid"
            X.C384027k.A00(r2, r7, r0)
            java.lang.String r0 = "pushName"
            r2.putString(r0, r6)
            r1 = 0
            r0 = 5
            android.os.Message r0 = android.os.Message.obtain(r5, r1, r0, r1, r2)
            goto L_0x002a
        L_0x00ec:
            boolean r0 = r3 instanceof X.C32101pZ
            if (r0 == 0) goto L_0x0200
            java.lang.String r0 = "type"
            r6 = 0
            java.lang.String r2 = r4.A0r(r0, r6)
            java.lang.String r0 = "id"
            java.lang.String r5 = r4.A0r(r0, r6)
            java.lang.String r0 = "xmlns"
            java.lang.String r1 = r4.A0r(r0, r6)
            if (r2 == 0) goto L_0x02d5
            java.lang.String r0 = "result"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0140
            if (r5 == 0) goto L_0x02b7
            java.util.Map r0 = r3.A00
            java.lang.Object r0 = r0.remove(r5)
            X.2oQ r0 = (X.C54252oQ) r0
            if (r0 == 0) goto L_0x011f
            r0.A02(r4)
        L_0x011f:
            X.2yo r2 = r3.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-iq-response; id="
            X.C18260x0.A0s(r0, r5, r1)
            X.4Ag r1 = r2.A01
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 4
            android.os.Message r2 = r1.obtainMessage(r0, r4)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "iqId"
            r1.putString(r0, r5)
            r2.sendToTarget()
            return
        L_0x0140:
            java.lang.String r0 = "error"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0158
            java.util.Map r0 = r3.A00
            java.lang.Object r0 = r0.remove(r5)
            X.2oQ r0 = (X.C54252oQ) r0
            if (r0 == 0) goto L_0x0155
            r0.A01(r4)
        L_0x0155:
            if (r5 == 0) goto L_0x002d
            goto L_0x011f
        L_0x0158:
            java.lang.String r0 = "get"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01b9
            r7 = 0
            X.36K r2 = r4.A0k(r7)
            java.lang.String r0 = "urn:xmpp:ping"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0195
            java.lang.String r0 = "t"
            java.lang.String r0 = r4.A0r(r0, r6)
            long r1 = X.C615531h.A03(r0)
            X.2yo r6 = r3.A04
            java.lang.String r0 = "ConnectionThreadRequestsImpl/onServerPingReceived"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Ag r8 = r6.A01
            r0 = 4
            android.os.Message r7 = X.AnonymousClass0x7.A0G(r0)
            android.os.Bundle r6 = r7.getData()
            java.lang.String r0 = "timestamp"
            r6.putLong(r0, r1)
            r8.Bfr(r7)
            goto L_0x0155
        L_0x0195:
            java.lang.String r0 = "relay"
            boolean r0 = X.AnonymousClass36K.A0W(r2, r0)
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = "pin"
            java.lang.String r1 = r2.A0r(r0, r6)
            java.lang.String r0 = "ip"
            r2.A0r(r0, r6)
            java.lang.String r0 = "timeout"
            r2.A0b(r0, r7)
            if (r1 == 0) goto L_0x0155
            java.lang.String r0 = "onRelayRequest"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0155
        L_0x01b9:
            java.lang.String r0 = "set"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02c9
            java.lang.String r0 = "location"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d2
            X.2yo r1 = r3.A04
            r0 = 206(0xce, float:2.89E-43)
            r1.A01(r4, r6, r0)
            goto L_0x0155
        L_0x01d2:
            java.lang.String r0 = "md"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0155
            X.36K r2 = X.AnonymousClass36K.A0D(r4)
            if (r2 == 0) goto L_0x0155
            java.lang.String r0 = "pair-device"
            boolean r0 = X.AnonymousClass36K.A0W(r2, r0)
            if (r0 == 0) goto L_0x01f2
            X.2yo r1 = r3.A04
            r0 = 242(0xf2, float:3.39E-43)
        L_0x01ed:
            r1.A01(r4, r6, r0)
            goto L_0x0155
        L_0x01f2:
            java.lang.String r0 = "pair-success"
            boolean r0 = X.AnonymousClass36K.A0W(r2, r0)
            if (r0 == 0) goto L_0x02bd
            X.2yo r1 = r3.A04
            r0 = 243(0xf3, float:3.4E-43)
            goto L_0x01ed
        L_0x0200:
            boolean r0 = r3 instanceof X.C32091pY
            if (r0 == 0) goto L_0x02dd
            X.36K r2 = X.AnonymousClass36K.A0D(r4)
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r0 = r4.A0g(r1, r0)
            X.4uZ r5 = X.C627336j.A02(r0)
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r0 = r4.A0g(r1, r0)
            X.4uZ r6 = X.C627336j.A02(r0)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r1 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "participant_pn"
            com.whatsapp.jid.Jid r4 = r4.A0g(r1, r0)
            java.lang.String r0 = "composing"
            boolean r0 = X.AnonymousClass36K.A0W(r2, r0)
            if (r0 == 0) goto L_0x0277
            java.lang.String r7 = "media"
            java.lang.String r8 = X.AnonymousClass36K.A0L(r2, r7)
            X.2yo r2 = r3.A04
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass32Y.A03(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/compose/composing "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " "
            X.C18310x6.A1Q(r1, r0, r6)
            r1.append(r4)
            X.C18260x0.A0s(r0, r8, r1)
            X.4Ag r3 = r2.A01
            java.lang.String r0 = "audio"
            boolean r2 = r0.equals(r8)
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jid"
            X.C384027k.A00(r1, r5, r0)
            java.lang.String r0 = "author"
            X.C384027k.A00(r1, r6, r0)
            java.lang.String r0 = "author_pn"
            X.C384027k.A00(r1, r4, r0)
            r1.putInt(r7, r2)
            r0 = 20
        L_0x0273:
            X.AnonymousClass0x2.A16(r3, r1, r0)
            return
        L_0x0277:
            java.lang.String r0 = "paused"
            boolean r0 = X.AnonymousClass36K.A0W(r2, r0)
            if (r0 == 0) goto L_0x002d
            X.2yo r3 = r3.A04
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/compose/paused jid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " author="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " pn="
            X.C18260x0.A1R(r1, r0, r4)
            X.4Ag r3 = r3.A01
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jid"
            X.C384027k.A00(r1, r5, r0)
            java.lang.String r0 = "author"
            X.C384027k.A00(r1, r2, r0)
            java.lang.String r0 = "author_pn"
            X.C384027k.A00(r1, r4, r0)
            r0 = 21
            goto L_0x0273
        L_0x02b7:
            X.3ez r0 = new X.3ez
            r0.<init>()
            throw r0
        L_0x02bd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unknown tag in multidevice IQ: "
            X.24Y r0 = X.AnonymousClass24Y.A00(r2, r0, r1)
            throw r0
        L_0x02c9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unknown iq type attribute: "
            X.24Y r0 = X.AnonymousClass24Y.A02(r0, r2, r1)
            throw r0
        L_0x02d5:
            java.lang.String r0 = "missing 'type' attribute in iq stanza"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x02dd:
            boolean r0 = r3 instanceof X.C32131pc
            if (r0 == 0) goto L_0x0408
            X.1pc r3 = (X.C32131pc) r3
            java.lang.String r0 = "id"
            java.lang.String r13 = r4.A0q(r0)
            java.lang.Class<com.whatsapp.jid.Jid> r8 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r2 = r4.A0g(r8, r0)
            X.C626936e.A06(r2)
            java.lang.String r0 = "category"
            java.lang.String r14 = X.AnonymousClass36K.A0L(r4, r0)
            java.lang.String r0 = "t"
            java.lang.String r7 = r4.A0q(r0)
            X.2sH r0 = r3.A01
            long r0 = r0.A0H()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            long r15 = X.C615531h.A04(r7, r0)
            long r15 = r15 * r5
            boolean r6 = r2 instanceof X.AnonymousClass1fI
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r0 = r4.A0g(r8, r0)
            if (r6 == 0) goto L_0x0332
            X.C626936e.A06(r0)
            r11 = r0
        L_0x031e:
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "recipient"
            com.whatsapp.jid.UserJid r12 = X.AnonymousClass36K.A0A(r4, r1, r0)
            if (r12 == 0) goto L_0x0335
            if (r2 == 0) goto L_0x0335
            java.lang.String r0 = "Appdata cannot have both a recipient and a participant attribute"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0332:
            r11 = r2
            r2 = r0
            goto L_0x031e
        L_0x0335:
            r5 = 0
            r0 = 0
            X.3SS r10 = new X.3SS
            r10.<init>(r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x0340
            r10.A00 = r2
        L_0x0340:
            r10.A04 = r6
            X.36K[] r9 = r4.A03
            if (r9 != 0) goto L_0x0348
            X.36K[] r9 = new X.AnonymousClass36K[r0]
        L_0x0348:
            int r8 = r9.length
            r7 = 0
        L_0x034a:
            if (r7 >= r8) goto L_0x038c
            r1 = r9[r7]
            java.lang.String r0 = "enc"
            boolean r0 = X.AnonymousClass36K.A0W(r1, r0)
            if (r0 == 0) goto L_0x0386
            X.2a1 r6 = X.AnonymousClass28S.A00(r1)
            byte[] r0 = r6.A02
            if (r0 != 0) goto L_0x037f
            X.1VX r2 = r3.A02
            r1 = 2187(0x88b, float:3.065E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x037f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "missing ciphertext "
            r1.append(r0)
            int r0 = r6.A01
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x037f:
            int r1 = r6.A00
            r0 = 2
            if (r1 != r0) goto L_0x0389
            r10.A03 = r6
        L_0x0386:
            int r7 = r7 + 1
            goto L_0x034a
        L_0x0389:
            r10.A02 = r6
            goto L_0x0386
        L_0x038c:
            X.2yo r6 = r3.A04
            X.39V[] r8 = r4.A0u()
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            if (r8 == 0) goto L_0x03b3
            int r7 = r8.length
            r3 = 0
        L_0x039a:
            if (r3 >= r7) goto L_0x03b3
            r2 = r8[r3]
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "offline"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03b0
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r2.A03
            r4.put(r1, r0)
        L_0x03b0:
            int r3 = r3 + 1
            goto L_0x039a
        L_0x03b3:
            long r1 = java.lang.System.currentTimeMillis()
            long r7 = r10.A06
            long r1 = r1 - r7
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/appdata remote="
            r7.append(r0)
            com.whatsapp.jid.Jid r0 = r10.A07
            X.4uZ r0 = X.C627336j.A02(r0)
            r7.append(r0)
            java.lang.String r0 = " id="
            r7.append(r0)
            java.lang.String r0 = r10.A0A
            r7.append(r0)
            java.lang.String r0 = " participant="
            r7.append(r0)
            com.whatsapp.jid.Jid r3 = r10.A00
            X.4uZ r0 = X.C627336j.A02(r3)
            if (r0 != 0) goto L_0x0403
            java.lang.String r0 = "none"
        L_0x03e6:
            r7.append(r0)
            java.lang.String r0 = " delay="
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = " offline="
            X.C18260x0.A1R(r7, r0, r5)
            X.4Ag r2 = r6.A01
            X.2LN r1 = new X.2LN
            r1.<init>(r10, r4)
            r0 = 255(0xff, float:3.57E-43)
            X.AnonymousClass0x7.A19(r2, r1, r0)
            return
        L_0x0403:
            X.4uZ r0 = X.C627336j.A02(r3)
            goto L_0x03e6
        L_0x0408:
            X.1pe r3 = (X.C32151pe) r3
            java.lang.String r9 = "offline"
            r8 = 0
            java.lang.String r0 = r4.A0r(r9, r8)
            r2 = 0
            int r6 = X.C615531h.A01(r0, r2)
            java.lang.String r7 = X.AnonymousClass36K.A0K(r4)
            boolean r0 = r3 instanceof X.C32071pW
            if (r0 == 0) goto L_0x04e1
            java.lang.String r5 = "receipt"
        L_0x0422:
            r1 = r5
            r0 = 11
            if (r6 != r0) goto L_0x043b
            X.2qk r6 = r3.A01
            if (r7 == 0) goto L_0x0435
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "-"
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r7, r1)
        L_0x0435:
            java.lang.String r0 = "offline-count-11"
            r6.A0A(r0, r2, r1)
        L_0x043b:
            X.1VX r6 = r3.A02
            java.lang.String r7 = "message"
            boolean r0 = r7.equals(r5)
            if (r0 == 0) goto L_0x0458
            X.2vE r1 = X.C58422vE.A01
            r0 = 5452(0x154c, float:7.64E-42)
            boolean r0 = r6.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0458
            r0 = 4923(0x133b, float:6.899E-42)
            boolean r0 = r6.A0Y(r1, r0)
            r11 = 1
            if (r0 != 0) goto L_0x0459
        L_0x0458:
            r11 = 0
        L_0x0459:
            boolean r0 = r5.equals(r7)
            if (r0 == 0) goto L_0x0465
            r0 = 6363(0x18db, float:8.916E-42)
            boolean r2 = X.C56952sp.A0K(r6, r0, r2)
        L_0x0465:
            if (r11 != 0) goto L_0x046e
            if (r2 != 0) goto L_0x046e
            r6 = 0
        L_0x046a:
            r3.A03(r4, r8, r6)
            return
        L_0x046e:
            X.39V[] r10 = r4.A0u()
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            java.lang.String r0 = "stanza-type"
            r6.put(r0, r5)
            if (r10 == 0) goto L_0x0496
            int r8 = r10.length
            r7 = 0
        L_0x0480:
            if (r7 >= r8) goto L_0x0496
            r5 = r10[r7]
            java.lang.String r0 = r5.A02
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0493
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r5.A03
            r6.put(r1, r0)
        L_0x0493:
            int r7 = r7 + 1
            goto L_0x0480
        L_0x0496:
            int r7 = r6.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            if (r11 == 0) goto L_0x04b0
            X.3Qt r0 = r3.A00
            java.util.HashSet r1 = r0.A01
            monitor-enter(r1)
            boolean r0 = r1.contains(r8)     // Catch:{ all -> 0x0501 }
            if (r0 == 0) goto L_0x04ac
            goto L_0x04f6
        L_0x04ac:
            r1.add(r8)     // Catch:{ all -> 0x0501 }
            monitor-exit(r1)
        L_0x04b0:
            if (r2 == 0) goto L_0x046a
            X.3Qt r0 = r3.A00
            android.util.SparseArray r5 = r0.A00
            monitor-enter(r5)
            java.lang.Integer r0 = X.C18290x4.A0Z()     // Catch:{ all -> 0x0504 }
            java.lang.Object r2 = r5.get(r7, r0)     // Catch:{ all -> 0x0504 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0504 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = "IncomingStanzaProcessingCache/onIncomingStanza/stanzaAttrHash: "
            r1.append(r0)     // Catch:{ all -> 0x0504 }
            r1.append(r7)     // Catch:{ all -> 0x0504 }
            java.lang.String r0 = " ; count: "
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ all -> 0x0504 }
            int r0 = r2.intValue()     // Catch:{ all -> 0x0504 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0504 }
            r5.put(r7, r0)     // Catch:{ all -> 0x0504 }
            monitor-exit(r5)
            goto L_0x046a
        L_0x04e1:
            boolean r0 = r3 instanceof X.C32061pV
            if (r0 == 0) goto L_0x04ea
            java.lang.String r5 = "notification"
            goto L_0x0422
        L_0x04ea:
            boolean r0 = r3 instanceof X.C32041pT
            if (r0 == 0) goto L_0x04f2
            java.lang.String r5 = "message"
            goto L_0x0422
        L_0x04f2:
            java.lang.String r5 = "call"
            goto L_0x0422
        L_0x04f6:
            monitor-exit(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "connection/handleMessage/ignoring duplicate stanza: "
            X.C18260x0.A1S(r1, r0, r6)
            return
        L_0x0501:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0504:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53272mp.A00(X.36K):void");
    }

    public void A01(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        if (num != null && num.intValue() > 10) {
            C25021Zq r1 = new C25021Zq();
            r1.A03 = C18310x6.A0g(num);
            r1.A02 = num2;
            r1.A00 = num3;
            r1.A04 = str;
            r1.A05 = str2;
            r1.A01 = num4;
            this.A03.BhD(r1);
        }
    }

    public String[] A02() {
        String str;
        if (this instanceof C32111pa) {
            str = "presence";
        } else if (this instanceof C32101pZ) {
            str = "iq";
        } else if (this instanceof C32121pb) {
            str = "ib";
        } else if (this instanceof C32141pd) {
            return new String[]{"stream:error", "error"};
        } else {
            if (this instanceof C32091pY) {
                str = "chatstate";
            } else if (this instanceof C32071pW) {
                str = "receipt";
            } else if (this instanceof C32061pV) {
                str = "notification";
            } else if (this instanceof C32041pT) {
                str = "message";
            } else if (this instanceof C32051pU) {
                str = "call";
            } else if (this instanceof C32131pc) {
                str = "appdata";
            } else {
                str = "ack";
            }
        }
        return new String[]{str};
    }

    public C53272mp(C55682qk r1, AnonymousClass1VX r2, AnonymousClass4FV r3, C60592yo r4, Map map) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = map;
    }
}
