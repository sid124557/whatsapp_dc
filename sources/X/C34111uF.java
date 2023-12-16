package X;

/* renamed from: X.1uF  reason: invalid class name and case insensitive filesystem */
public final class C34111uF extends C173778Rq {
    public final C55682qk A00;
    public final AnonymousClass48G A01;
    public final AnonymousClass30Z A02;

    public C34111uF(C55682qk r2, AnonymousClass48G r3, AnonymousClass30Z r4) {
        super("ReaderThread");
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (X.AnonymousClass36K.A0W(r4, "notification") != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014d, code lost:
        if (r5.A0J.A0Y(X.C58422vE.A02, 3563) != false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0255, code lost:
        r5.A04(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            java.lang.String r17 = "ReaderThread/error"
            r8 = 1
            android.os.Process.setThreadPriority(r8)
        L_0x0006:
            r7 = 0
            r6 = r18
            X.30Z r5 = r6.A02     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            X.4DS r13 = r5.A0N     // Catch:{ 24Y | IOException -> 0x026e, RuntimeException -> 0x029d }
            X.36K r4 = r13.BLZ()     // Catch:{ 24Y | IOException -> 0x026e, RuntimeException -> 0x029d }
            if (r4 != 0) goto L_0x0015
            goto L_0x025a
        L_0x0015:
            boolean r0 = r5.A0C     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 != 0) goto L_0x00c8
            java.lang.String r10 = "message"
            boolean r16 = X.AnonymousClass36K.A0W(r4, r10)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r16 != 0) goto L_0x0034
            java.lang.String r0 = "receipt"
            boolean r0 = X.AnonymousClass36K.A0W(r4, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "notification"
            boolean r1 = X.AnonymousClass36K.A0W(r4, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r0 = 0
            if (r1 == 0) goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            java.lang.String r12 = "notification"
            java.lang.String r11 = "receipt"
            java.lang.String r9 = "offline"
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = X.AnonymousClass36K.A0L(r4, r9)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0086
            java.lang.String r2 = "t"
            r0 = -1
            long r2 = r4.A0e(r2, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x005e
            long r0 = r5.A08     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r14
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r5.A08 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
        L_0x005e:
            r2 = 1
            if (r16 == 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            boolean r0 = X.AnonymousClass36K.A0W(r4, r11)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x006f
            long r0 = r5.A06     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            long r0 = r0 + r2
            r5.A06 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            goto L_0x0080
        L_0x006f:
            boolean r0 = X.AnonymousClass36K.A0W(r4, r12)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0080
            long r0 = r5.A05     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            long r0 = r0 + r2
            r5.A05 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            goto L_0x0080
        L_0x007b:
            long r0 = r5.A04     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            long r0 = r0 + r2
            r5.A04 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
        L_0x0080:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r5.A03 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
        L_0x0086:
            java.lang.String r0 = "ib"
            boolean r0 = X.AnonymousClass36K.A0W(r4, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x00c8
            X.36K r2 = r4.A0k(r7)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r0 = "offline_preview"
            boolean r0 = X.AnonymousClass36K.A0W(r2, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x019a
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r5.A07 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            int r0 = r2.A0b(r10, r7)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            long r0 = (long) r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r5.A00 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            int r0 = r2.A0b(r11, r7)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            long r0 = (long) r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r5.A02 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            int r0 = r2.A0b(r12, r7)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            long r0 = (long) r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r5.A01 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            X.3Qu r1 = r5.A0O     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0H     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            boolean r0 = r0.getAndSet(r8)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 != 0) goto L_0x00c3
            r1.A04()     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
        L_0x00c3:
            java.lang.String r0 = "XmppConnectionMetrics/onOfflineResumeStarted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
        L_0x00c8:
            boolean r0 = r5.A0B     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 != 0) goto L_0x00f3
            long r0 = r5.A07     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x00f3
            long r2 = r5.A01     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            long r0 = r5.A02     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            long r2 = r2 + r0
            long r0 = r5.A00     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            long r2 = r2 + r0
            long r0 = r5.A0D     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x0104
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r9 = "ConnectionReader/read/next-tree eager ack disabled, offline stanzas count is small, expected="
            r10.append(r9)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r10.append(r2)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r2 = ", eagerAckMinOfflineSize="
            X.C18260x0.A10(r2, r10, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
        L_0x00f3:
            java.util.Map r1 = r5.A0A     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r0 = r4.A00     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            X.2mp r0 = (X.C53272mp) r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01a4
            r0.A00(r4)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            goto L_0x0006
        L_0x0104:
            java.lang.String r0 = r4.A00     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r3 = X.AnonymousClass30Z.A00(r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r0 = "receipt"
            boolean r0 = X.AnonymousClass75J.A00(r3, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x011e
            X.1VX r2 = r5.A0J     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r1 = 3565(0xded, float:4.996E-42)
        L_0x0117:
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            goto L_0x012c
        L_0x011e:
            java.lang.String r0 = "notification"
            boolean r0 = X.AnonymousClass75J.A00(r3, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x012f
            X.1VX r2 = r5.A0J     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r1 = 3564(0xdec, float:4.994E-42)
            goto L_0x0117
        L_0x012c:
            if (r0 != 0) goto L_0x014f
            goto L_0x00f3
        L_0x012f:
            java.lang.String r0 = "message"
            boolean r0 = X.AnonymousClass75J.A00(r3, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x00f3
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r0 = r4.A0g(r1, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            boolean r0 = r0 instanceof X.C135166kE     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x00f3
            X.1VX r2 = r5.A0J     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r1 = 3563(0xdeb, float:4.993E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x00f3
        L_0x014f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r0 = "ConnectionReader/read/next-tree/stanza/"
            r1.append(r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r1.append(r4)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r0 = " eager ack"
            X.C18260x0.A1J(r1, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            X.2i8 r2 = new X.2i8     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r2.<init>()     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r2.A05 = r3     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r0 = r4.A0g(r1, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r2.A02 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r0 = "id"
            java.lang.String r0 = r4.A0q(r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r2.A07 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r0 = "type"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r4, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r2.A08 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r0 = r4.A0g(r1, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r2.A01 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r0 = -1
            r2.A00 = r0     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            X.31C r1 = r5.A0M     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            X.39T r0 = r2.A01()     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r1.A0H(r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            goto L_0x00f3
        L_0x019a:
            boolean r0 = X.AnonymousClass36K.A0W(r2, r9)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x00c8
            r5.A0B = r8     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            goto L_0x00c8
        L_0x01a4:
            X.1VX r2 = r5.A0J     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            r1 = 3280(0xcd0, float:4.596E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01b5
            r0 = 488(0x1e8, float:6.84E-43)
            r5.A04(r4, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
        L_0x01b5:
            java.lang.String r0 = "ConnectionReader/read tag found in map, but canHandleStanzaType returned false"
            X.C626936e.A0D(r7, r0)     // Catch:{ 24Y -> 0x01f4, Exception -> 0x01bc }
            goto L_0x0006
        L_0x01bc:
            r2 = move-exception
            java.lang.String r0 = "ConnectionReader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = "ConnectionReader/read/next-tree/stanza/"
            r1.append(r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = r13.BJX()     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            boolean r0 = r2 instanceof X.C73133ez     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            if (r0 != 0) goto L_0x026c
            X.1VX r2 = r5.A0J     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            r1 = 3280(0xcd0, float:4.596E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            if (r0 == 0) goto L_0x0006
            java.lang.String r1 = "message"
            java.lang.String r0 = r4.A00     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            if (r0 == 0) goto L_0x01f1
            r0 = 10
            r5.A05(r4, r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
        L_0x01f1:
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x0255
        L_0x01f4:
            r10 = move-exception
            java.lang.String r3 = r4.A00     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r11 = X.AnonymousClass30Z.A00(r3)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            if (r11 == 0) goto L_0x026d
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = "ConnectionReader/maybeSendCorruptStreamExceptionResolutionAck STANZA_PARSING_ERROR id="
            r2.append(r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r1 = "id"
            r0 = 0
            java.lang.String r0 = r4.A0r(r1, r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            X.C18260x0.A14(r0, r2, r10)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = "cls:"
            r9.append(r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            r9.append(r11)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r2 = " "
            r9.append(r2)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r1 = X.AnonymousClass36K.A0K(r4)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            if (r1 == 0) goto L_0x022d
            java.lang.String r0 = "type:"
            X.AnonymousClass001.A1K(r0, r1, r2, r9)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
        L_0x022d:
            X.2qk r2 = r5.A0F     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = "source=ConnectionReader debug="
            r1.append(r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            r1.append(r9)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = " message="
            java.lang.String r1 = X.AnonymousClass000.A0a(r0, r1, r10)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = "CorruptStreamException"
            r2.A0A(r0, r7, r1)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            if (r0 == 0) goto L_0x0253
            r0 = 4
            r5.A05(r4, r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
        L_0x0253:
            r0 = 487(0x1e7, float:6.82E-43)
        L_0x0255:
            r5.A04(r4, r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            goto L_0x0006
        L_0x025a:
            java.lang.String r0 = "ReaderThread/logout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.48G r1 = r6.A01
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.String r0 = "ConnectionThread/ReaderThreadHandler/send/logout"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1.sendEmptyMessage(r8)
            return
        L_0x026c:
            throw r2     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
        L_0x026d:
            throw r10     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
        L_0x026e:
            r4 = move-exception
            java.lang.String r0 = "ConnectionReader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.util.Map r3 = r5.A09     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.util.Iterator r2 = X.AnonymousClass000.A0q(r3)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
        L_0x027a:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            if (r0 == 0) goto L_0x0299
            java.lang.Object r1 = X.AnonymousClass0x2.A0W(r2)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            X.2oQ r1 = (X.C54252oQ) r1     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            boolean r0 = r1 instanceof X.C30651mn     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            if (r0 == 0) goto L_0x027a
            X.1mn r1 = (X.C30651mn) r1     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            X.2Ht r0 = r1.A01     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            com.whatsapp.profile.SetAboutInfo r0 = r0.A00     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            android.os.Handler r0 = r0.A08     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            r0.removeMessages(r7)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            r0.sendEmptyMessage(r7)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            goto L_0x027a
        L_0x0299:
            r3.clear()     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            goto L_0x02b5
        L_0x029d:
            r4 = move-exception
            X.4DS r2 = r5.A0N     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = "ConnectionReader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = "ConnectionReader/read/next-tree/stanza/"
            r1.append(r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            java.lang.String r0 = r2.BJX()     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
        L_0x02b5:
            throw r4     // Catch:{ IOException -> 0x02e3, 24Y -> 0x02b6 }
        L_0x02b6:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0300 }
            java.lang.String r0 = "ReaderThread/corrupt-stream-error/stanza "
            r1.append(r0)     // Catch:{ all -> 0x0300 }
            java.lang.String r0 = r4.bufString     // Catch:{ all -> 0x0300 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0300 }
            java.lang.String r0 = "ReaderThread/corrupt-stream-error"
            com.whatsapp.util.Log.i(r0, r4)     // Catch:{ all -> 0x0300 }
            X.2qk r3 = r6.A00     // Catch:{ all -> 0x0300 }
            java.lang.String r2 = "CorruptStreamException"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0300 }
            java.lang.String r0 = "source=ReaderThread message="
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r4)     // Catch:{ all -> 0x0300 }
            r3.A0A(r2, r7, r0)     // Catch:{ all -> 0x0300 }
            com.whatsapp.util.Log.i((java.lang.String) r17)
            X.48G r1 = r6.A01
            r8 = 2
            goto L_0x02ee
        L_0x02e3:
            r1 = move-exception
            java.lang.String r0 = "ReaderThread/io-error"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0300 }
            com.whatsapp.util.Log.i((java.lang.String) r17)
            X.48G r1 = r6.A01
        L_0x02ee:
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.String r0 = "ConnectionThread/ReaderThreadHandler/send/reader_error"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 2
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.arg1 = r8
            r0.sendToTarget()
            return
        L_0x0300:
            r2 = move-exception
            com.whatsapp.util.Log.i((java.lang.String) r17)
            X.48G r1 = r6.A01
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.String r0 = "ConnectionThread/ReaderThreadHandler/send/reader_error"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 2
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.arg1 = r7
            r0.sendToTarget()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34111uF.run():void");
    }
}
