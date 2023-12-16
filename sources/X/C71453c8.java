package X;

/* renamed from: X.3c8  reason: invalid class name and case insensitive filesystem */
public class C71453c8 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C71453c8(C160767oH r2, AnonymousClass7A4 r3, C150007Ot r4, AnonymousClass4FL r5, Object obj) {
        this.A05 = 0;
        this.A00 = r2;
        this.A01 = r5;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            int r0 = r13.A05
            switch(r0) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x00d0;
                case 2: goto L_0x012c;
                case 3: goto L_0x01bc;
                case 4: goto L_0x0210;
                case 5: goto L_0x022c;
                case 6: goto L_0x0257;
                case 7: goto L_0x0270;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x02b0;
                case 11: goto L_0x02f1;
                case 12: goto L_0x0327;
                case 13: goto L_0x0365;
                case 14: goto L_0x03e1;
                case 15: goto L_0x0479;
                case 16: goto L_0x04dc;
                case 17: goto L_0x0502;
                case 18: goto L_0x051e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r13.A00
            X.4KT r3 = (X.AnonymousClass4KT) r3
            java.lang.Object r7 = r13.A01
            com.whatsapp.jid.DeviceJid r7 = (com.whatsapp.jid.DeviceJid) r7
            java.lang.Object r1 = r13.A02
            X.36K r1 = (X.AnonymousClass36K) r1
            java.lang.Object r0 = r13.A03
            X.36K r0 = (X.AnonymousClass36K) r0
            java.lang.Object r2 = r13.A04
            X.36K r2 = (X.AnonymousClass36K) r2
            java.lang.Object r3 = r3.A00
            X.3Ln r3 = (X.C66463Ln) r3
            byte[] r9 = r1.A01
            byte[] r1 = r0.A01
            r0 = 0
            byte r10 = r1[r0]
            if (r2 == 0) goto L_0x003b
            byte[] r8 = r2.A01
        L_0x0028:
            X.8qC r0 = r3.A09
            java.lang.Object r1 = r0.get()
            X.30x r1 = (X.C614730x) r1
            com.whatsapp.jid.UserJid r0 = r7.userJid
            X.2ov r0 = X.AnonymousClass36G.A03(r0)
            X.3fe r5 = X.C614730x.A00(r0, r1)
            goto L_0x003d
        L_0x003b:
            r8 = 0
            goto L_0x0028
        L_0x003d:
            int r0 = r7.getDevice()     // Catch:{ all -> 0x00a9 }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ all -> 0x00a9 }
            r4 = 1
            if (r0 != 0) goto L_0x0068
            X.8qC r1 = r3.A04     // Catch:{ all -> 0x00a9 }
            java.lang.Object r6 = r1.get()     // Catch:{ all -> 0x00a9 }
            X.33Z r6 = (X.AnonymousClass33Z) r6     // Catch:{ all -> 0x00a9 }
            r11 = 5
            boolean r0 = r6.A0C(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "recvmessagelistener/on-get-identity-success/invalid device identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x00a9 }
            X.33Z r0 = (X.AnonymousClass33Z) r0     // Catch:{ all -> 0x00a9 }
            r0.A09(r7, r4)     // Catch:{ all -> 0x00a9 }
            goto L_0x04fc
        L_0x0068:
            r0 = 2
            byte[][] r2 = new byte[r0][]     // Catch:{ all -> 0x00a9 }
            byte[] r1 = new byte[r4]     // Catch:{ all -> 0x00a9 }
            r0 = 0
            r1[r0] = r10     // Catch:{ all -> 0x00a9 }
            byte[] r0 = X.AnonymousClass36A.A03(r1, r9, r2, r0, r4)     // Catch:{ all -> 0x00a9 }
            X.2jv r4 = X.AnonymousClass36G.A01(r0)     // Catch:{ 23X -> 0x00a0 }
            X.8qC r0 = r3.A07     // Catch:{ 23X -> 0x00a0 }
            java.lang.Object r2 = r0.get()     // Catch:{ 23X -> 0x00a0 }
            X.33n r2 = (X.C621133n) r2     // Catch:{ 23X -> 0x00a0 }
            X.2ov r1 = X.AnonymousClass36G.A02(r7)     // Catch:{ 23X -> 0x00a0 }
            X.2e4 r0 = new X.2e4     // Catch:{ 23X -> 0x00a0 }
            r0.<init>(r4)     // Catch:{ 23X -> 0x00a0 }
            r2.A0M(r0, r1)     // Catch:{ 23X -> 0x00a0 }
            X.8qC r0 = r3.A05     // Catch:{ 23X -> 0x00a0 }
            java.lang.Object r2 = r0.get()     // Catch:{ 23X -> 0x00a0 }
            X.3Wi r2 = (X.C69263Wi) r2     // Catch:{ 23X -> 0x00a0 }
            r1 = 20
            X.3bx r0 = new X.3bx     // Catch:{ 23X -> 0x00a0 }
            r0.<init>(r3, r1, r7)     // Catch:{ 23X -> 0x00a0 }
            r2.A0S(r0)     // Catch:{ 23X -> 0x00a0 }
            goto L_0x04fc
        L_0x00a0:
            r1 = move-exception
            java.lang.String r0 = "recvmessagelistener/on-get-identity-success/invalidkey/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00a9 }
            goto L_0x04fc
        L_0x00a9:
            r1 = move-exception
            if (r5 == 0) goto L_0x00b4
            r5.close()     // Catch:{ all -> 0x00b0 }
            throw r1
        L_0x00b0:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x00b4:
            throw r1
        L_0x00b5:
            java.lang.Object r1 = r13.A01
            X.4FL r1 = (X.AnonymousClass4FL) r1
            java.lang.Object r0 = r13.A00
            X.7oH r0 = (X.C160767oH) r0
            int r7 = r0.A00
            X.7Z2 r2 = r0.A01
            java.lang.Object r3 = r13.A02
            X.7A4 r3 = (X.AnonymousClass7A4) r3
            java.lang.Object r4 = r13.A04
            X.7Ot r4 = (X.C150007Ot) r4
            java.lang.Object r5 = r13.A03
            r6 = 0
            r1.BVM(r2, r3, r4, r5, r6, r7)
            return
        L_0x00d0:
            java.lang.Object r8 = r13.A00
            X.2nx r8 = (X.C53962nx) r8
            java.lang.Object r9 = r13.A01
            X.1fH r9 = (X.C27981fH) r9
            java.lang.Object r7 = r13.A02
            X.1fH r7 = (X.C27981fH) r7
            java.lang.Object r6 = r13.A03
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r5 = r13.A04
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.311 r10 = r8.A06
            monitor-enter(r10)
            X.34p r0 = r10.A02     // Catch:{ all -> 0x0129 }
            long r11 = r0.A05(r9)     // Catch:{ all -> 0x0129 }
            long r3 = r0.A05(r7)     // Catch:{ all -> 0x0129 }
            r1 = -1
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0111
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0111
            java.lang.Boolean r0 = r10.A01(r9)     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x0108
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0129 }
            r10.A07(r7, r3, r0)     // Catch:{ all -> 0x0129 }
        L_0x0108:
            long r1 = r10.A00(r9)     // Catch:{ all -> 0x0129 }
            X.2zg r0 = r10.A03     // Catch:{ all -> 0x0129 }
            r0.A03(r3, r1)     // Catch:{ all -> 0x0129 }
        L_0x0111:
            monitor-exit(r10)
            boolean r0 = r6 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x011d
            X.2sM r0 = r8.A05
            com.whatsapp.jid.PhoneUserJid r6 = (com.whatsapp.jid.PhoneUserJid) r6
            r0.A09(r9, r6)
        L_0x011d:
            boolean r0 = r5 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0501
            X.2sM r0 = r8.A05
            com.whatsapp.jid.PhoneUserJid r5 = (com.whatsapp.jid.PhoneUserJid) r5
            r0.A09(r7, r5)
            return
        L_0x0129:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x012c:
            java.lang.Object r8 = r13.A00
            com.whatsapp.TextEmojiLabel r8 = (com.whatsapp.TextEmojiLabel) r8
            java.lang.Object r6 = r13.A01
            X.5Ts r6 = (X.C105135Ts) r6
            java.lang.Object r3 = r13.A02
            com.whatsapp.TextEmojiLabel r3 = (com.whatsapp.TextEmojiLabel) r3
            java.lang.Object r5 = r13.A03
            X.5UY r5 = (X.AnonymousClass5UY) r5
            java.lang.Object r2 = r13.A04
            r7 = 0
            r10 = 1
            int r0 = r8.getLineCount()
            r4 = 8
            if (r0 <= r10) goto L_0x01b5
            X.2sr r0 = r6.A01
            X.2og r0 = r0.A0D
            java.lang.String r9 = r0.A03()
            X.C162457s7.A0D(r9)
            android.text.Layout r0 = r8.getLayout()
            int r1 = r0.getLineStart(r7)
            android.text.Layout r0 = r8.getLayout()
            int r0 = r0.getLineEnd(r7)
            java.lang.String r1 = r9.substring(r1, r0)
            X.C162457s7.A0D(r1)
            android.text.Layout r0 = r8.getLayout()
            int r0 = r0.getLineStart(r10)
            java.lang.String r0 = r9.substring(r0)
            X.C162457s7.A0D(r0)
            r8.A0I(r1)
            r3.A0I(r0)
            r3.setVisibility(r7)
            r1 = 30
            X.8Mj r0 = new X.8Mj
            r0.<init>(r3, r6, r2, r1)
            r3.post(r0)
            r3 = 2131431255(0x7f0b0f57, float:1.8484234E38)
        L_0x018f:
            android.view.ViewGroup$LayoutParams r2 = r5.A05()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            X.C162457s7.A0K(r2, r0)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            X.33j r0 = r6.A08
            X.5Ki r0 = r0.A05()
            boolean r1 = r0.A06
            r0 = 7
            if (r1 == 0) goto L_0x01a7
            r0 = 5
        L_0x01a7:
            r2.addRule(r0, r3)
            r0 = 6
            r2.addRule(r0, r3)
            r2.addRule(r4, r3)
            r5.A08(r2)
            return
        L_0x01b5:
            r3.setVisibility(r4)
            r3 = 2131431253(0x7f0b0f55, float:1.848423E38)
            goto L_0x018f
        L_0x01bc:
            java.lang.Object r1 = r13.A00
            X.2oU r1 = (X.C54292oU) r1
            java.lang.Object r0 = r13.A01
            X.33j r0 = (X.C620733j) r0
            java.lang.Object r4 = r13.A02
            android.location.Location r4 = (android.location.Location) r4
            java.lang.Object r3 = r13.A03
            X.3Wi r3 = (X.C69263Wi) r3
            java.lang.Object r2 = r13.A04
            android.content.Context r6 = r1.A00
            java.util.Locale r0 = X.C620733j.A02(r0)
            android.location.Geocoder r7 = new android.location.Geocoder
            r7.<init>(r6, r0)
            r5 = 0
            double r8 = r4.getLatitude()     // Catch:{ Exception -> 0x01ea }
            double r10 = r4.getLongitude()     // Catch:{ Exception -> 0x01ea }
            r12 = 1
            java.util.List r1 = r7.getFromLocation(r8, r10, r12)     // Catch:{ Exception -> 0x01ea }
            if (r1 == 0) goto L_0x0205
            goto L_0x01f1
        L_0x01ea:
            r1 = move-exception
            java.lang.String r0 = "LocationUpdateListener/geocodeAddress Exception while trying to fetch address"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0205
        L_0x01f1:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0205
            java.lang.Object r1 = X.C18290x4.A0k(r1)
            android.location.Address r1 = (android.location.Address) r1
            float r0 = r4.getAccuracy()
            java.lang.String r5 = X.C106445Za.A00(r6, r1, r0)
        L_0x0205:
            r1 = 21
            X.5sN r0 = new X.5sN
            r0.<init>(r2, r4, r5, r1)
            r3.A0S(r0)
            return
        L_0x0210:
            java.lang.Object r0 = r13.A00
            X.2OE r0 = (X.AnonymousClass2OE) r0
            java.lang.Object r4 = r13.A01
            com.whatsapp.chatinfo.EphemeralMessagesInfoView r4 = (com.whatsapp.chatinfo.EphemeralMessagesInfoView) r4
            java.lang.Object r3 = r13.A02
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            java.lang.Object r2 = r13.A03
            X.1fJ r2 = (X.C27991fJ) r2
            java.lang.Object r1 = r13.A04
            X.4sb r1 = (X.C95084sb) r1
            if (r0 == 0) goto L_0x0501
            boolean r0 = r0.A02
            r4.A08(r3, r1, r2, r0)
            return
        L_0x022c:
            java.lang.Object r0 = r13.A04
            X.55u r0 = (X.C994555u) r0
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0501
            java.lang.Object r3 = r13.A01
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r0 = r3.getTag()
            if (r0 == 0) goto L_0x0501
            java.lang.Object r1 = r3.getTag()
            java.lang.Object r0 = r13.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0501
            java.lang.Object r2 = r13.A02
            X.8rY r2 = (X.C184288rY) r2
            java.lang.Object r1 = r13.A00
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0 = 0
            r2.Bog(r1, r3, r0)
            return
        L_0x0257:
            java.lang.Object r0 = r13.A00
            X.30g r0 = (X.C613330g) r0
            java.lang.Object r2 = r13.A01
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            java.lang.Object r4 = r13.A02
            X.1fJ r4 = (X.C27991fJ) r4
            java.lang.Object r3 = r13.A03
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            java.lang.Object r1 = r13.A04
            X.0rw r1 = (X.C15790rw) r1
            r5 = 0
            r0.A05(r1, r2, r3, r4, r5)
            return
        L_0x0270:
            java.lang.Object r5 = r13.A00
            X.1mV r5 = (X.C30471mV) r5
            java.lang.Object r3 = r13.A01
            X.33j r3 = (X.C620733j) r3
            java.lang.Object r2 = r13.A02
            X.3Wi r2 = (X.C69263Wi) r2
            java.lang.Object r4 = r13.A03
            java.lang.Object r6 = r13.A04
            int r0 = r5.A0B
            if (r0 != 0) goto L_0x02aa
            X.33C r0 = r5.A01
            java.io.File r0 = r0.A0F
            int r0 = X.C107655bf.A0F(r0)
            r5.A0B = r0
            if (r0 != 0) goto L_0x02aa
            long r0 = r5.A00
            java.lang.String r7 = X.AnonymousClass35V.A03(r3, r0)
        L_0x0296:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationRowVideoUtils/fetchAndSetVideoDurationText: duration="
            X.C18260x0.A0q(r0, r7, r1)
            r8 = 14
            X.3cN r3 = new X.3cN
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A0S(r3)
            return
        L_0x02aa:
            long r0 = (long) r0
            java.lang.String r7 = X.C107565bW.A0A(r3, r0)
            goto L_0x0296
        L_0x02b0:
            java.lang.Object r6 = r13.A00
            X.2hA r6 = (X.C49832hA) r6
            java.lang.Object r5 = r13.A01
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            java.lang.Object r4 = r13.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r13.A03
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r13.A04
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.1a3 r1 = new X.1a3
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A00 = r0
            r1.A01 = r0
            X.2WM r0 = r6.A02
            java.lang.String r0 = r0.A00(r5)
            r1.A06 = r0
            r1.A02 = r4
            r1.A03 = r3
            r1.A04 = r2
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A04
            int r0 = r0.getAndIncrement()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r1.A05 = r0
            X.4FV r0 = r6.A01
            r0.BhD(r1)
            return
        L_0x02f1:
            java.lang.Object r1 = r13.A01
            X.8qC r1 = (X.C183538qC) r1
            java.lang.Object r4 = r13.A02
            X.1RW r4 = (X.AnonymousClass1RW) r4
            java.lang.Object r3 = r13.A03
            X.2ss r3 = (X.C56982ss) r3
            java.lang.Object r2 = r13.A04
            X.8qC r2 = (X.C183538qC) r2
            r0 = -8
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r1.get()
            X.2q5 r0 = (X.C55272q5) r0
            X.3dV r0 = r0.A02
            r1 = 0
            boolean r0 = r0.A0A(r4, r1)
            r3.A0G()
            if (r0 == 0) goto L_0x0323
            java.lang.String r0 = "app-init/main/msgstoredb/healthy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Lt r0 = X.AnonymousClass0x9.A0S(r2)
            r0.A04()
        L_0x0323:
            android.os.Process.setThreadPriority(r1)
            return
        L_0x0327:
            java.lang.Object r5 = r13.A00
            X.30w r5 = (X.C614630w) r5
            java.lang.Object r0 = r13.A01
            X.2sk r0 = (X.C56902sk) r0
            java.lang.Object r2 = r13.A02
            X.2qb r2 = (X.C55592qb) r2
            java.lang.Object r4 = r13.A03
            X.34x r4 = (X.C624134x) r4
            java.lang.Object r3 = r13.A04
            X.2iO r3 = (X.C50572iO) r3
            r1 = 1
            byte[] r0 = r0.A0H()
            r5.A03(r0)
            r2.A09 = r1
            boolean r0 = X.AnonymousClass36V.A06(r4)
            if (r0 == 0) goto L_0x0363
            X.2qz r1 = r3.A0D
            X.2z0 r0 = r4.A1J
            X.34x r2 = r1.A05(r0)
            if (r2 == 0) goto L_0x0363
        L_0x0355:
            X.3Lv r1 = r3.A04
            r0 = -1
            r1.A0b(r2, r0)
            X.3Wi r1 = r3.A02
            r0 = 32
            X.C69263Wi.A0A(r1, r3, r4, r0)
            return
        L_0x0363:
            r2 = r4
            goto L_0x0355
        L_0x0365:
            java.lang.Object r7 = r13.A00
            X.7pg r7 = (X.C161447pg) r7
            java.lang.Object r6 = r13.A01
            X.2lm r6 = (X.C52622lm) r6
            java.lang.Object r8 = r13.A02
            X.36K r8 = (X.AnonymousClass36K) r8
            java.lang.Object r9 = r13.A03
            X.2Ir r9 = (X.C41032Ir) r9
            java.lang.Object r4 = r13.A04
            X.4DL r4 = (X.AnonymousClass4DL) r4
            r3 = 0
            r0 = 4
            X.C162457s7.A0J(r4, r0)
            int r1 = r6.hashCode()
            java.lang.String r0 = "iqResponse"
            X.1iz r5 = r7.A0A
            r5.A00(r1, r0)
            java.util.Map r0 = r6.A02
            if (r0 == 0) goto L_0x03a5
            X.C626936e.A06(r0)
            java.lang.String r2 = "action"
            java.lang.Object r1 = r0.get(r2)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x03a5
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x03a5
            int r0 = r6.hashCode()
            r5.A03(r0, r2, r1)
        L_0x03a5:
            X.36K r2 = X.C41032Ir.A02(r8, r9)
            r1 = 5
            X.4Jo r0 = new X.4Jo
            r0.<init>(r2, r1)
            java.lang.Object r3 = X.C626836d.A02(r8, r0, r3)
            X.6rH r3 = (X.C138956rH) r3
            X.C162457s7.A0D(r3)
            java.lang.Object r2 = r3.A00
            X.6qv r2 = (X.C138746qv) r2
            java.lang.Object r0 = r2.A02
            X.6qj r0 = (X.C138626qj) r0
            if (r0 == 0) goto L_0x044a
            java.lang.Object r0 = r0.A00
            X.6qj r0 = (X.C138626qj) r0
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x03ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x044a
            java.lang.Object r0 = r1.next()
            X.6rI r0 = (X.C138966rI) r0
            X.C162457s7.A0H(r0)
            X.C161447pg.A01(r7, r0)
            goto L_0x03ce
        L_0x03e1:
            java.lang.Object r5 = r13.A00
            X.7pg r5 = (X.C161447pg) r5
            java.lang.Object r8 = r13.A01
            java.lang.Object r7 = r13.A02
            X.36K r7 = (X.AnonymousClass36K) r7
            java.lang.Object r2 = r13.A03
            X.2Ir r2 = (X.C41032Ir) r2
            java.lang.Object r4 = r13.A04
            X.4DL r4 = (X.AnonymousClass4DL) r4
            r3 = 0
            r0 = 4
            X.C162457s7.A0J(r4, r0)
            int r1 = r8.hashCode()
            java.lang.String r0 = "iqResponse"
            X.1iz r6 = r5.A0A
            r6.A00(r1, r0)
            X.36K r2 = X.C41032Ir.A02(r7, r2)
            r1 = 6
            X.4Jo r0 = new X.4Jo
            r0.<init>(r2, r1)
            java.lang.Object r3 = X.C626836d.A02(r7, r0, r3)
            X.6rH r3 = (X.C138956rH) r3
            X.C162457s7.A0D(r3)
            int r2 = r8.hashCode()
            r1 = 467(0x1d3, float:6.54E-43)
            X.316 r0 = r6.A03
            r0.A07(r2, r1)
            java.lang.Object r0 = r3.A00
            X.6qv r0 = (X.C138746qv) r0
            java.lang.Object r0 = r0.A02
            X.6qj r0 = (X.C138626qj) r0
            if (r0 == 0) goto L_0x0475
            java.lang.Object r0 = r0.A00
            X.6qj r0 = (X.C138626qj) r0
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0437:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0475
            java.lang.Object r0 = r1.next()
            X.6rI r0 = (X.C138966rI) r0
            X.C162457s7.A0H(r0)
            X.C161447pg.A01(r5, r0)
            goto L_0x0437
        L_0x044a:
            java.lang.Object r0 = r2.A01
            X.6qj r0 = (X.C138626qj) r0
            if (r0 == 0) goto L_0x046a
            int r2 = r6.hashCode()
            java.lang.Object r0 = r0.A00
            X.6qj r0 = (X.C138626qj) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "num_screens_to_prefetch"
            r5.A03(r2, r0, r1)
        L_0x046a:
            int r2 = r6.hashCode()
            r1 = 467(0x1d3, float:6.54E-43)
            X.316 r0 = r5.A03
            r0.A07(r2, r1)
        L_0x0475:
            r4.BT0(r3)
            return
        L_0x0479:
            java.lang.Object r3 = r13.A00
            com.whatsapp.storage.StorageUsageActivity r3 = (com.whatsapp.storage.StorageUsageActivity) r3
            java.lang.Object r6 = r13.A01
            X.5Io r6 = (X.C102365Io) r6
            java.lang.Object r5 = r13.A02
            X.5In r5 = (X.C102355In) r5
            java.lang.Object r4 = r13.A03
            X.5In r4 = (X.C102355In) r4
            java.lang.Object r2 = r13.A04
            X.5Kd r2 = (X.C102755Kd) r2
            X.4X8 r1 = r3.A0H
            if (r6 == 0) goto L_0x049f
            X.5Io r0 = r1.A02
            if (r0 != 0) goto L_0x049f
            r1.A02 = r6
            r0 = 1
            int r0 = r1.A0M(r0)
            r1.A06(r0)
        L_0x049f:
            if (r5 == 0) goto L_0x04aa
            X.5In r0 = r1.A01
            if (r0 != 0) goto L_0x04aa
            r1.A01 = r5
            r1.A0N()
        L_0x04aa:
            if (r4 == 0) goto L_0x04b5
            X.5In r0 = r1.A00
            if (r0 != 0) goto L_0x04b5
            r1.A00 = r4
            r1.A0N()
        L_0x04b5:
            java.lang.Long r0 = r2.A04
            if (r0 == 0) goto L_0x04c3
            java.lang.String r0 = "storage-usage-activity/fetch cache/fetched media size"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r3.A77(r0)
        L_0x04c3:
            if (r5 == 0) goto L_0x04cf
            java.lang.String r0 = "storage-usage-activity/fetch cache/fetched large files"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r3.A77(r0)
        L_0x04cf:
            if (r4 == 0) goto L_0x0501
            java.lang.String r0 = "storage-usage-activity/fetch cache/fetched forwarded files"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            r3.A77(r0)
            return
        L_0x04dc:
            java.lang.Object r5 = r13.A00
            java.lang.Object r4 = r13.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r13.A02
            X.8tp r3 = (X.C185528tp) r3
            java.lang.Object r2 = r13.A03
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.Object r1 = r13.A04
            X.34x r1 = (X.C624134x) r1
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0501
            r3.Bof(r2, r4, r1)
            return
        L_0x04fc:
            if (r5 == 0) goto L_0x0501
            r5.close()
        L_0x0501:
            return
        L_0x0502:
            java.lang.Object r5 = r13.A00
            X.2Z8 r5 = (X.AnonymousClass2Z8) r5
            java.lang.Object r4 = r13.A01
            X.21S r4 = (X.AnonymousClass21S) r4
            java.lang.Object r3 = r13.A02
            X.5dj r3 = (X.C108895dj) r3
            java.lang.Object r2 = r13.A03
            X.2aT r2 = (X.C45722aT) r2
            java.lang.Object r1 = r13.A04
            X.2p5 r1 = (X.C54662p5) r1
            r0 = 1
            X.C18270x1.A11(r4, r0, r1)
            r5.A00(r1, r3, r2, r4)
            return
        L_0x051e:
            java.lang.Object r6 = r13.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r6 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r6
            java.lang.Object r5 = r13.A01
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r4 = r13.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r13.A03
            X.59i r3 = (X.C1000759i) r3
            java.lang.Object r2 = r13.A04
            X.2fU r2 = (X.C48792fU) r2
            r1 = 0
            X.4xg r0 = r6.A00
            if (r0 == 0) goto L_0x0543
            r0.A08(r3, r5, r4, r1)
            if (r2 == 0) goto L_0x053f
            r2.A00()
        L_0x053f:
            r6.finish()
            return
        L_0x0543:
            java.lang.String r0 = "accountLinkingResultObservers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71453c8.run():void");
    }

    public C71453c8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
    }
}
