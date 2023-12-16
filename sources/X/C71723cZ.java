package X;

import android.net.Uri;
import com.whatsapp.jid.UserJid;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3cZ  reason: invalid class name and case insensitive filesystem */
public class C71723cZ implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C71723cZ(AnonymousClass2FQ r2, C29441ip r3, C55802qw r4, AnonymousClass1VX r5, C614330s r6) {
        this.A06 = 3;
        this.A03 = new AtomicBoolean();
        this.A00 = r5;
        this.A04 = r6;
        this.A05 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007f, code lost:
        if (r9 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0854, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:?, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0858, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x085b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x085c, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x085f, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x040d A[Catch:{ Exception -> 0x0585 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x06dd  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x06f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r64 = this;
            r0 = r64
            int r1 = r0.A06
            switch(r1) {
                case 0: goto L_0x0125;
                case 1: goto L_0x01b1;
                case 2: goto L_0x003d;
                case 3: goto L_0x01cd;
                case 4: goto L_0x05e5;
                case 5: goto L_0x0101;
                case 6: goto L_0x075e;
                case 7: goto L_0x07df;
                case 8: goto L_0x07fb;
                case 9: goto L_0x0817;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r0.A00
            X.2vm r6 = (X.C58762vm) r6
            java.lang.Object r8 = r0.A01
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r5 = r0.A02
            X.2hY r5 = (X.C50052hY) r5
            java.lang.Object r7 = r0.A03
            X.3dd r7 = (X.C72383dd) r7
            java.lang.Object r4 = r0.A04
            X.2p5 r4 = (X.C54662p5) r4
            java.lang.Object r9 = r0.A05
            java.util.List r9 = (java.util.List) r9
            X.C18260x0.A0c(r8, r5, r7, r4)
            X.4AM r3 = r6.A02
            X.2iy r2 = X.AnonymousClass2BX.A00
            X.3Ob r1 = new X.3Ob
            r1.<init>(r6, r7, r8, r9)
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            r0 = 0
            X.3Ou r0 = r3.B0i(r2, r0, r1)
            X.3Om r3 = new X.3Om
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.Bh4(r3)
        L_0x003c:
            return
        L_0x003d:
            java.lang.Object r4 = r0.A00
            X.2ND r4 = (X.AnonymousClass2ND) r4
            java.lang.Object r7 = r0.A01
            X.2Vg r7 = (X.C44252Vg) r7
            java.lang.Object r1 = r0.A02
            X.2qz r1 = (X.C55832qz) r1
            java.lang.Object r2 = r0.A03
            X.1mO r2 = (X.C30401mO) r2
            java.lang.Object r11 = r0.A04
            X.34x r11 = (X.C624134x) r11
            java.lang.Object r3 = r0.A05
            X.2z0 r8 = r2.A1J
            X.34x r0 = r1.A05(r8)
            X.1mO r0 = (X.C30401mO) r0
            if (r0 == 0) goto L_0x0081
            long r0 = r7.A00(r0)
            r9 = -1
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0081
            X.8qC r6 = r4.A02
            java.lang.Object r5 = r6.get()
            X.2sW r5 = (X.C56762sW) r5
            X.3ZF r9 = r5.A00(r0)
            if (r9 != 0) goto L_0x00ef
            java.lang.Object r5 = r6.get()
            X.2sW r5 = (X.C56762sW) r5
            X.3ZF r9 = r5.A01(r0)
            if (r9 != 0) goto L_0x00ef
        L_0x0081:
            long r0 = r11.A1L
            X.3dV r5 = r7.A00
            X.4GK r5 = r5.get()
            r6 = r5
            X.3H0 r6 = (X.AnonymousClass3H0) r6     // Catch:{ all -> 0x0859 }
            X.2sg r7 = r6.A03     // Catch:{ all -> 0x0859 }
            java.lang.String r6 = "SELECT video_call, call_result FROM message_quoted_call_log WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r0)     // Catch:{ all -> 0x0859 }
            java.lang.String r0 = "GET_QUOTED_CALL_LOG_MESSAGE"
            android.database.Cursor r7 = r7.A0E(r6, r0, r1)     // Catch:{ all -> 0x0859 }
            boolean r0 = r7.moveToLast()     // Catch:{ all -> 0x0852 }
            r6 = 0
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "video_call"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)     // Catch:{ all -> 0x0852 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0852 }
            java.lang.String r0 = "call_result"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)     // Catch:{ all -> 0x0852 }
            X.3Z6 r6 = X.AnonymousClass3Z6.A01(r1, r0)     // Catch:{ all -> 0x0852 }
        L_0x00b6:
            r7.close()     // Catch:{ all -> 0x0859 }
            r5.close()
            boolean r7 = r8.A02
            if (r7 != 0) goto L_0x00fe
            X.4uZ r0 = r2.A0n()
        L_0x00c4:
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A05(r0)
            if (r6 == 0) goto L_0x003c
            if (r5 == 0) goto L_0x003c
            java.lang.String r1 = r8.A01
            r0 = -1
            X.39J r11 = new X.39J
            r11.<init>(r0, r5, r1, r7)
            long r13 = r2.A0K
            int r1 = X.AnonymousClass3Z6.A00(r6)
            r0 = 1
            boolean r15 = X.AnonymousClass000.A1U(r1, r0)
            r10 = 0
            X.3ZF r9 = new X.3ZF
            r12 = r10
            r9.<init>(r10, r11, r12, r13, r15)
            java.lang.Object r0 = r6.second
            int r0 = X.AnonymousClass001.A0K(r0)
            r9.A0C(r0)
        L_0x00ef:
            r2.A01 = r9
            X.3Wi r2 = r4.A00
            r1 = 18
            X.5sL r0 = new X.5sL
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0S(r0)
            return
        L_0x00fe:
            X.4uZ r0 = r8.A00
            goto L_0x00c4
        L_0x0101:
            java.lang.Object r1 = r0.A04
            X.55t r1 = (X.C994455t) r1
            boolean r1 = r1.A02
            if (r1 != 0) goto L_0x003c
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A05
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r1 = r1.getTag()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r0.A00
            X.8o1 r1 = (X.C182198o1) r1
            java.lang.Object r0 = r0.A02
            android.text.Spannable r0 = (android.text.Spannable) r0
            r1.BjS(r0)
            return
        L_0x0125:
            java.lang.Object r4 = r0.A00
            X.33m r4 = (X.C621033m) r4
            java.lang.Object r9 = r0.A01
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.Object r8 = r0.A02
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r13 = r0.A03
            X.34x r13 = (X.C624134x) r13
            java.lang.Object r2 = r0.A05
            X.5dw r2 = (X.C109015dw) r2
            java.lang.Object r7 = r0.A04
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            r3 = 0
            X.53r r1 = r4.A1q     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            r0 = 100
            android.graphics.Bitmap r1 = r1.A0B(r9, r0, r0)     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            java.io.ByteArrayOutputStream r0 = X.AnonymousClass0x9.A0e()     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            byte[] r6 = X.C18320x8.A1Y(r1, r0)     // Catch:{ all -> 0x0198 }
            r0.close()     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            r1.recycle()     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            java.util.ArrayList r5 = X.AnonymousClass000.A0p(r8)     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
        L_0x015c:
            boolean r0 = r1.hasNext()     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            if (r0 == 0) goto L_0x018b
            X.4uZ r12 = X.C18300x5.A0P(r1)     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            X.33C r10 = new X.33C     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            r10.<init>()     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            X.2rD r8 = r4.A1H     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            r18 = 23
            r11 = 0
            r15 = r11
            r16 = r11
            r17 = r11
            r20 = r3
            r21 = r3
            r14 = r11
            r19 = r3
            X.1mV r0 = r8.A04(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            X.1mz r0 = (X.C30771mz) r0     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            r2.A00(r0)     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            r0.A01 = r7     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            r5.add(r0)     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            goto L_0x015c
        L_0x018b:
            X.3Wi r2 = r4.A02     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            r1 = 20
            X.8Mj r0 = new X.8Mj     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            r0.<init>(r4, r5, r6, r1)     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            r2.A0S(r0)     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
            return
        L_0x0198:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x019d }
            goto L_0x01a1
        L_0x019d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
        L_0x01a1:
            throw r1     // Catch:{ 59c | IOException | OutOfMemoryError -> 0x01a2 }
        L_0x01a2:
            r2 = move-exception
            X.3Wi r1 = r4.A02
            r0 = 2131887523(0x7f1205a3, float:1.9409655E38)
            r1.A0F(r0, r3)
            java.lang.String r0 = "UserActions/userActionSendProductMessages/product thumbnail load failed"
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x01b1:
            java.lang.Object r1 = r0.A05
            X.3MV r1 = (X.AnonymousClass3MV) r1
            java.lang.Object r6 = r0.A01
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r5 = r0.A04
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            java.lang.Object r4 = r0.A03
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A00
            X.4EJ r2 = (X.AnonymousClass4EJ) r2
            java.lang.Object r3 = r0.A02
            X.2p5 r3 = (X.C54662p5) r3
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x01cd:
            java.lang.Object r1 = r0.A05
            r24 = r1
            r1 = r24
            X.2qw r1 = (X.C55802qw) r1
            r24 = r1
        L_0x01d7:
            X.2o9 r1 = r24.A00()
            if (r1 == 0) goto L_0x0204
            java.lang.Object r2 = r0.A03
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x0204
            java.lang.Object r2 = r0.A02
            X.1ip r2 = (X.C29441ip) r2
            boolean r2 = r2.A0F()
            if (r2 != 0) goto L_0x0216
            java.lang.Object r4 = r0.A00
            X.2sp r4 = (X.C56952sp) r4
            r3 = 4879(0x130f, float:6.837E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r2 = r4.A0Y(r2, r3)
            if (r2 == 0) goto L_0x0216
            java.lang.String r1 = "HistorySyncWorkProcessor/run no network access"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x0204:
            java.lang.Object r1 = r0.A01
            X.2FQ r1 = (X.AnonymousClass2FQ) r1
            java.lang.Object r0 = r0.A03
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r2 = r0.get()
            com.whatsapp.companiondevice.sync.HistorySyncWorker r1 = r1.A00
            monitor-enter(r1)
            r0 = 1
            goto L_0x05b8
        L_0x0216:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "HistorySyncWorkProcessor/sendMsgHistoryChunk/"
            X.C18260x0.A1P(r3, r2, r1)
            java.lang.Object r2 = r0.A04
            X.30s r2 = (X.C614330s) r2
            long r3 = r1.A05
            r23 = 0
            r35 = 0
            int r5 = (r3 > r35 ? 1 : (r3 == r35 ? 0 : -1))
            if (r5 < 0) goto L_0x032d
            X.2rl r6 = r2.A0R
            X.1mE r5 = r6.A01(r3)
            X.1nO r5 = (X.AnonymousClass1nO) r5
            if (r5 == 0) goto L_0x058f
            X.3Lv r9 = r2.A0D
            long r10 = r5.A08
            long r7 = r5.A06
            long r3 = r5.A0K
            r12 = r7
            r14 = r3
            android.database.Cursor r16 = r9.A06(r10, r12, r14)
            if (r16 == 0) goto L_0x058f
            X.1iB r4 = r2.A0O     // Catch:{ all -> 0x05d1 }
            com.whatsapp.jid.DeviceJid r3 = r5.A00     // Catch:{ all -> 0x05d1 }
            X.C626936e.A06(r3)     // Catch:{ all -> 0x05d1 }
            int r3 = r3.getDevice()     // Catch:{ all -> 0x05d1 }
            X.33G r3 = r4.A09(r3)     // Catch:{ all -> 0x05d1 }
            if (r3 != 0) goto L_0x026f
            java.lang.String r2 = "HistorySyncSendMethod/resendMsgHistoryChunk device no longer exists in db"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x05d1 }
            long r2 = r5.A1L     // Catch:{ all -> 0x05d1 }
            X.C626936e.A00()     // Catch:{ all -> 0x05d1 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x05d1 }
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x05d1 }
            r6.A06(r2)     // Catch:{ all -> 0x05d1 }
            goto L_0x058c
        L_0x026f:
            X.2mJ r17 = r2.A02(r3)     // Catch:{ all -> 0x05d1 }
            X.2zv r15 = r2.A0X     // Catch:{ all -> 0x05d1 }
            r18 = r23
            r19 = r35
            java.util.Map r4 = r15.A01(r16, r17, r18, r19)     // Catch:{ all -> 0x05d1 }
            int r9 = r16.getCount()     // Catch:{ all -> 0x05d1 }
            X.1A0 r6 = X.AnonymousClass0x7.A0Z()     // Catch:{ all -> 0x05d1 }
            int r3 = r5.A03     // Catch:{ all -> 0x05d1 }
            X.23J r3 = X.C614330s.A00(r3)     // Catch:{ all -> 0x05d1 }
            r6.A0D(r3)     // Catch:{ all -> 0x05d1 }
            int r3 = r5.A00     // Catch:{ all -> 0x05d1 }
            r6.A09(r3)     // Catch:{ all -> 0x05d1 }
            int r3 = r5.A01     // Catch:{ all -> 0x05d1 }
            r6.A0A(r3)     // Catch:{ all -> 0x05d1 }
            java.util.Iterator r11 = X.AnonymousClass000.A0q(r4)     // Catch:{ all -> 0x05d1 }
        L_0x029c:
            boolean r3 = r11.hasNext()     // Catch:{ all -> 0x05d1 }
            if (r3 == 0) goto L_0x02d1
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r11)     // Catch:{ all -> 0x05d1 }
            com.whatsapp.jid.Jid r3 = X.AnonymousClass0x9.A0R(r4)     // Catch:{ all -> 0x05d1 }
            boolean r3 = r3 instanceof X.C95804uY     // Catch:{ all -> 0x05d1 }
            if (r3 != 0) goto L_0x029c
            java.lang.Object r10 = r4.getValue()     // Catch:{ all -> 0x05d1 }
            X.19z r10 = (X.C209619z) r10     // Catch:{ all -> 0x05d1 }
            X.4uZ r26 = X.C18320x8.A0N(r4)     // Catch:{ all -> 0x05d1 }
            long r7 = r5.A08     // Catch:{ all -> 0x05d1 }
            long r3 = r5.A09     // Catch:{ all -> 0x05d1 }
            r25 = r2
            r27 = r10
            r28 = r7
            r30 = r3
            r25.A06(r26, r27, r28, r30)     // Catch:{ all -> 0x05d1 }
            X.6cX r3 = r10.A06()     // Catch:{ all -> 0x05d1 }
            X.1EG r3 = (X.AnonymousClass1EG) r3     // Catch:{ all -> 0x05d1 }
            r6.A0C(r3)     // Catch:{ all -> 0x05d1 }
            goto L_0x029c
        L_0x02d1:
            java.lang.String r4 = r5.A0H     // Catch:{ all -> 0x05d1 }
            if (r4 == 0) goto L_0x02df
            java.lang.String r3 = r5.A0G     // Catch:{ all -> 0x05d1 }
            if (r3 == 0) goto L_0x02df
            X.2jp r7 = new X.2jp     // Catch:{ all -> 0x05d1 }
            r7.<init>(r4, r3)     // Catch:{ all -> 0x05d1 }
            goto L_0x02e0
        L_0x02df:
            r7 = 0
        L_0x02e0:
            com.whatsapp.jid.DeviceJid r3 = r5.A00     // Catch:{ Exception -> 0x0325 }
            r19 = r3
            X.C626936e.A06(r19)     // Catch:{ Exception -> 0x0325 }
            int r3 = r5.A00     // Catch:{ Exception -> 0x0325 }
            r18 = r3
            int r3 = r5.A03     // Catch:{ Exception -> 0x0325 }
            r17 = r3
            int r8 = r5.A01     // Catch:{ Exception -> 0x0325 }
            int r3 = r5.A02     // Catch:{ Exception -> 0x0325 }
            int r34 = r3 + 1
            long r14 = r5.A08     // Catch:{ Exception -> 0x0325 }
            long r12 = r5.A06     // Catch:{ Exception -> 0x0325 }
            long r10 = r5.A09     // Catch:{ Exception -> 0x0325 }
            X.2z0 r3 = r5.A1J     // Catch:{ Exception -> 0x0325 }
            java.lang.String r5 = r3.A01     // Catch:{ Exception -> 0x0325 }
            long r3 = (long) r9     // Catch:{ Exception -> 0x0325 }
            r47 = -1
            r49 = 0
            r28 = r6
            r29 = r23
            r30 = r5
            r31 = r18
            r32 = r17
            r33 = r8
            r37 = r14
            r39 = r12
            r41 = r10
            r43 = r3
            r45 = r35
            r25 = r2
            r26 = r7
            r27 = r19
            r25.A01(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r43, r45, r47, r49)     // Catch:{ Exception -> 0x0325 }
            goto L_0x058c
        L_0x0325:
            r3 = move-exception
            java.lang.String r2 = "history-sync-send-methods/resend-msg-history-chunk failed"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x05d1 }
            goto L_0x058c
        L_0x032d:
            X.1iB r4 = r2.A0O
            com.whatsapp.jid.DeviceJid r3 = r1.A0D
            r39 = r3
            int r3 = r39.getDevice()
            X.33G r5 = r4.A09(r3)
            if (r5 != 0) goto L_0x0352
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "HistorySyncSendMethods/sendMsgHistoryChunk no device info for device id "
            r3.append(r2)
            int r2 = r39.getDevice()
            r3.append(r2)
            X.AnonymousClass0x2.A19(r3)
            goto L_0x058f
        L_0x0352:
            int r4 = r1.A01
            r3 = 3
            r6 = 0
            boolean r22 = X.AnonymousClass000.A1U(r4, r3)
            int r3 = r1.A00
            r21 = r3
            r3 = r22 ^ 1
            int r21 = r21 + r3
            long r9 = r1.A04
            r51 = r9
            java.util.Map r17 = java.util.Collections.emptyMap()
            long r3 = r1.A09     // Catch:{ Exception -> 0x0585 }
            r19 = r3
            int r3 = (r3 > r35 ? 1 : (r3 == r35 ? 0 : -1))
            if (r3 <= 0) goto L_0x037a
            long r3 = r1.A07     // Catch:{ Exception -> 0x0585 }
            int r7 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r7 < 0) goto L_0x037a
            r4 = 0
            goto L_0x03ce
        L_0x037a:
            X.3Lv r11 = r2.A0D     // Catch:{ OutOfMemoryError -> 0x0568 }
            long r3 = r1.A0A     // Catch:{ OutOfMemoryError -> 0x0568 }
            X.2sH r7 = r2.A09     // Catch:{ OutOfMemoryError -> 0x0568 }
            long r16 = r7.A0H()     // Catch:{ OutOfMemoryError -> 0x0568 }
            r12 = r3
            r14 = r9
            android.database.Cursor r7 = r11.A06(r12, r14, r16)     // Catch:{ OutOfMemoryError -> 0x0568 }
            if (r7 == 0) goto L_0x058f
            X.2mJ r13 = r2.A02(r5)     // Catch:{ all -> 0x055e }
            X.2zv r11 = r2.A0X     // Catch:{ all -> 0x055e }
            r12 = r7
            r14 = r23
            r15 = r35
            java.util.Map r17 = r11.A01(r12, r13, r14, r15)     // Catch:{ all -> 0x055e }
            int r4 = r7.getCount()     // Catch:{ all -> 0x055e }
            boolean r3 = r7.moveToLast()     // Catch:{ all -> 0x055e }
            if (r3 == 0) goto L_0x03cb
            long r9 = X.C18270x1.A01(r7)     // Catch:{ all -> 0x055e }
            java.lang.String r3 = "message_type"
            int r8 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x055e }
        L_0x03b0:
            boolean r3 = r7.isNull(r8)     // Catch:{ all -> 0x055e }
            if (r3 != 0) goto L_0x03c5
            int r5 = r7.getInt(r8)     // Catch:{ all -> 0x055e }
            r3 = 7
            if (r5 == r3) goto L_0x03c5
            java.lang.String r3 = "timestamp"
            long r35 = X.AnonymousClass0x2.A0C(r7, r3)     // Catch:{ all -> 0x055e }
            goto L_0x03cb
        L_0x03c5:
            boolean r3 = r7.moveToPrevious()     // Catch:{ all -> 0x055e }
            if (r3 != 0) goto L_0x03b0
        L_0x03cb:
            r7.close()     // Catch:{ OutOfMemoryError -> 0x0568 }
        L_0x03ce:
            long r15 = r1.A08     // Catch:{ Exception -> 0x0585 }
            long r13 = (long) r4     // Catch:{ Exception -> 0x0585 }
            long r11 = r15 + r13
            if (r4 == 0) goto L_0x043a
            long r3 = r1.A0A     // Catch:{ Exception -> 0x0585 }
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            r18 = 0
            if (r5 == 0) goto L_0x043a
            X.2rt r5 = r2.A0G     // Catch:{ Exception -> 0x0585 }
            int r3 = r5.A00(r3, r9)     // Catch:{ Exception -> 0x0585 }
            double r5 = (double) r11     // Catch:{ Exception -> 0x0585 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x0585 }
            long r3 = r3 + r11
            double r7 = (double) r3     // Catch:{ Exception -> 0x0585 }
            double r5 = r5 / r7
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 * r3
            int r7 = (int) r5     // Catch:{ Exception -> 0x0585 }
        L_0x03ec:
            X.1A0 r5 = X.AnonymousClass0x7.A0Z()     // Catch:{ Exception -> 0x0585 }
            int r3 = r1.A02     // Catch:{ Exception -> 0x0585 }
            r34 = r3
            X.23J r3 = X.C614330s.A00(r34)     // Catch:{ Exception -> 0x0585 }
            r5.A0D(r3)     // Catch:{ Exception -> 0x0585 }
            r3 = r21
            r5.A09(r3)     // Catch:{ Exception -> 0x0585 }
            r5.A0A(r7)     // Catch:{ Exception -> 0x0585 }
            java.util.Iterator r8 = X.AnonymousClass000.A0q(r17)     // Catch:{ Exception -> 0x0585 }
        L_0x0407:
            boolean r3 = r8.hasNext()     // Catch:{ Exception -> 0x0585 }
            if (r3 == 0) goto L_0x043f
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r8)     // Catch:{ Exception -> 0x0585 }
            com.whatsapp.jid.Jid r3 = X.AnonymousClass0x9.A0R(r4)     // Catch:{ Exception -> 0x0585 }
            boolean r3 = r3 instanceof X.C95804uY     // Catch:{ Exception -> 0x0585 }
            if (r3 != 0) goto L_0x0407
            java.lang.Object r6 = r4.getValue()     // Catch:{ Exception -> 0x0585 }
            X.19z r6 = (X.C209619z) r6     // Catch:{ Exception -> 0x0585 }
            X.4uZ r26 = X.C18320x8.A0N(r4)     // Catch:{ Exception -> 0x0585 }
            long r3 = r1.A0B     // Catch:{ Exception -> 0x0585 }
            r25 = r2
            r27 = r6
            r28 = r9
            r30 = r3
            r25.A06(r26, r27, r28, r30)     // Catch:{ Exception -> 0x0585 }
            X.6cX r3 = r6.A06()     // Catch:{ Exception -> 0x0585 }
            X.1EG r3 = (X.AnonymousClass1EG) r3     // Catch:{ Exception -> 0x0585 }
            r5.A0C(r3)     // Catch:{ Exception -> 0x0585 }
            goto L_0x0407
        L_0x043a:
            r18 = 1
            r7 = 100
            goto L_0x03ec
        L_0x043f:
            X.2jp r8 = r1.A0C     // Catch:{ Exception -> 0x0585 }
            boolean r46 = X.AnonymousClass000.A1S(r22)
            long r3 = r1.A0B     // Catch:{ Exception -> 0x0585 }
            r62 = r3
            r47 = 0
            r17 = 0
            r42 = r23
            r37 = r2
            r38 = r8
            r40 = r5
            r41 = r23
            r43 = r21
            r44 = r34
            r45 = r7
            r49 = r9
            r53 = r3
            r55 = r13
            r57 = r35
            r59 = r15
            r61 = r17
            long r15 = r37.A01(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49, r51, r53, r55, r57, r59, r61)     // Catch:{ Exception -> 0x0585 }
            if (r18 != 0) goto L_0x0472
            if (r22 != 0) goto L_0x0472
            goto L_0x0475
        L_0x0472:
            r4 = r23
            goto L_0x04a1
        L_0x0475:
            long r13 = r1.A06     // Catch:{ Exception -> 0x0585 }
            long r5 = r1.A0A     // Catch:{ Exception -> 0x0585 }
            long r2 = r1.A07     // Catch:{ Exception -> 0x0585 }
            long r2 = r2 + r15
            long r43 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0585 }
            r30 = 1
            r45 = -1
            X.2o9 r4 = new X.2o9     // Catch:{ Exception -> 0x0585 }
            r25 = r4
            r26 = r8
            r27 = r39
            r28 = r34
            r29 = r21
            r31 = r13
            r33 = r9
            r35 = r5
            r37 = r62
            r39 = r11
            r41 = r2
            r47 = r19
            r25.<init>(r26, r27, r28, r29, r30, r31, r33, r35, r37, r39, r41, r43, r45, r47)     // Catch:{ Exception -> 0x0585 }
        L_0x04a1:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0585 }
            java.lang.String r2 = "history-sync-send-methods/send-msg-history-chunk/progress = "
            r3.append(r2)     // Catch:{ Exception -> 0x0585 }
            r3.append(r7)     // Catch:{ Exception -> 0x0585 }
            java.lang.String r2 = ", last id = "
            X.C18260x0.A12(r2, r3, r9)     // Catch:{ Exception -> 0x0585 }
            if (r4 == 0) goto L_0x058f
            X.C626936e.A00()
            r1 = r24
            X.1RE r1 = r1.A02
            X.4Fq r9 = r1.A0C()
            r1 = r9
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x05d6 }
            X.2sg r7 = r1.A03     // Catch:{ all -> 0x05d6 }
            java.lang.String r6 = "UPDATE msg_history_sync SET device_id=?, sync_type=?, last_processed_msg_row_id=?, oldest_msg_row_id=?, sent_msgs_count=?, chunk_order=?, sent_bytes=?, last_chunk_timestamp=?, status=?, peer_msg_row_id=?, oldest_message_to_sync_row_id=?, session_id=?, md_reg_attempt_id=?, size_limit_bytes=? WHERE _id=?"
            r1 = 15
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x05d6 }
            com.whatsapp.jid.DeviceJid r3 = r4.A0D     // Catch:{ all -> 0x05d6 }
            r1 = r17
            X.C18280x3.A0w(r3, r5, r1)     // Catch:{ all -> 0x05d6 }
            int r1 = r4.A02     // Catch:{ all -> 0x05d6 }
            X.C18270x1.A1P(r5, r1)     // Catch:{ all -> 0x05d6 }
            long r1 = r4.A04     // Catch:{ all -> 0x05d6 }
            X.AnonymousClass0x2.A1T(r5, r1)     // Catch:{ all -> 0x05d6 }
            long r1 = r4.A0A     // Catch:{ all -> 0x05d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x05d6 }
            r1 = 3
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            long r1 = r4.A08     // Catch:{ all -> 0x05d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x05d6 }
            r1 = 4
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            int r1 = r4.A00     // Catch:{ all -> 0x05d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x05d6 }
            r1 = 5
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            long r1 = r4.A07     // Catch:{ all -> 0x05d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x05d6 }
            r1 = 6
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            long r1 = r4.A03     // Catch:{ all -> 0x05d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x05d6 }
            r1 = 7
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            int r1 = r4.A01     // Catch:{ all -> 0x05d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x05d6 }
            r1 = 8
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            long r1 = r4.A05     // Catch:{ all -> 0x05d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x05d6 }
            r1 = 9
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            long r1 = r4.A0B     // Catch:{ all -> 0x05d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x05d6 }
            r1 = 10
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            X.2jp r8 = r4.A0C     // Catch:{ all -> 0x05d6 }
            r2 = 0
            if (r8 == 0) goto L_0x052f
            java.lang.String r1 = r8.A01     // Catch:{ all -> 0x05d6 }
            r23 = r1
        L_0x052f:
            r1 = 11
            r5[r1] = r23     // Catch:{ all -> 0x05d6 }
            if (r8 == 0) goto L_0x0537
            java.lang.String r2 = r8.A00     // Catch:{ all -> 0x05d6 }
        L_0x0537:
            r1 = 12
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            long r1 = r4.A09     // Catch:{ all -> 0x05d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x05d6 }
            r1 = 13
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            long r1 = r4.A06     // Catch:{ all -> 0x05d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x05d6 }
            r1 = 14
            r5[r1] = r2     // Catch:{ all -> 0x05d6 }
            java.lang.String r1 = "MessageHistorySyncTable.UPDATE_SYNC_STATE"
            r7.A0I(r6, r1, r5)     // Catch:{ all -> 0x05d6 }
            r9.close()
            r1 = r24
            r1.A03(r3)
            goto L_0x01d7
        L_0x055e:
            r4 = move-exception
            r7.close()     // Catch:{ all -> 0x0563 }
            goto L_0x0567
        L_0x0563:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ OutOfMemoryError -> 0x0568 }
        L_0x0567:
            throw r4     // Catch:{ OutOfMemoryError -> 0x0568 }
        L_0x0568:
            java.lang.String r3 = "history-sync-send-methods/send-msg-history-chunk failed OOM"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ Exception -> 0x0585 }
            X.2qk r5 = r2.A01     // Catch:{ Exception -> 0x0585 }
            java.lang.String r4 = "historySyncSendMethod/outOfMemory"
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0585 }
            java.lang.String r2 = "type="
            r3.append(r2)     // Catch:{ Exception -> 0x0585 }
            int r2 = r1.A02     // Catch:{ Exception -> 0x0585 }
            java.lang.String r2 = X.AnonymousClass000.A0h(r3, r2)     // Catch:{ Exception -> 0x0585 }
            r5.A0A(r4, r6, r2)     // Catch:{ Exception -> 0x0585 }
            goto L_0x058f
        L_0x0585:
            r3 = move-exception
            java.lang.String r2 = "history-sync-send-methods/send-msg-history-chunk failed"
            com.whatsapp.util.Log.e(r2, r3)
            goto L_0x058f
        L_0x058c:
            r16.close()
        L_0x058f:
            long r5 = r1.A06
            com.whatsapp.jid.DeviceJid r8 = r1.A0D
            X.C626936e.A00()
            r1 = r24
            X.1RE r1 = r1.A02
            X.4Fq r7 = r1.A0C()
            r1 = r7
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x05db }
            X.2sg r4 = r1.A03     // Catch:{ all -> 0x05db }
            java.lang.String r3 = "DELETE FROM msg_history_sync WHERE _id=?"
            java.lang.String[] r2 = X.C18260x0.A1b(r5)     // Catch:{ all -> 0x05db }
            java.lang.String r1 = "MessageHistorySyncTable.DELETE_SYNC_STATE_BY_ID"
            r4.A0I(r3, r1, r2)     // Catch:{ all -> 0x05db }
            r7.close()
            r1 = r24
            r1.A03(r8)
            goto L_0x01d7
        L_0x05b8:
            r1.A03 = r0     // Catch:{ all -> 0x05ce }
            monitor-exit(r1)     // Catch:{ all -> 0x05ce }
            X.6bK r1 = r1.A04
            if (r2 == 0) goto L_0x05c8
            X.0An r0 = new X.0An
            r0.<init>()
        L_0x05c4:
            r1.A05(r0)
            return
        L_0x05c8:
            X.0Ap r0 = new X.0Ap
            r0.<init>()
            goto L_0x05c4
        L_0x05ce:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05ce }
            throw r0
        L_0x05d1:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x05e0 }
            throw r1
        L_0x05d6:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x05e0 }
            throw r1
        L_0x05db:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x05e0 }
            throw r1
        L_0x05e0:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x05e5:
            java.lang.Object r10 = r0.A02
            r4 = r10
            X.4mA r4 = (X.C92144mA) r4
            X.3ZH r13 = r4.A0L
            android.view.View r9 = r4.A02
            android.widget.TextView r1 = r4.A0C
            r16 = r1
            X.5YB r12 = r4.A0G
            com.whatsapp.TextEmojiLabel r8 = r4.A0F
            android.view.View r14 = r4.A04
            java.lang.Object r1 = r0.A01
            X.2nK r1 = (X.C53582nK) r1
            java.lang.String r7 = r1.A02(r13)
            android.util.Pair r1 = r4.A0C()
            java.lang.Object r6 = r1.second
            java.lang.String r6 = (java.lang.String) r6
            X.4fR r10 = (X.C89884fR) r10
            boolean r5 = r10.A07()
            r1 = 800(0x320, double:3.953E-321)
            r15 = 1
            r3 = 0
            if (r5 == 0) goto L_0x0729
            android.text.TextPaint r5 = r16.getPaint()
            java.lang.String r4 = "•"
            float r4 = r5.measureText(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r11 = (int) r4
            int r4 = r16.getPaddingLeft()
            int r11 = r11 + r4
            int r4 = r16.getPaddingRight()
            int r11 = r11 + r4
            if (r12 != 0) goto L_0x0719
            r5 = 0
        L_0x0632:
            java.lang.Object r4 = r0.A00
            X.1VX r4 = (X.AnonymousClass1VX) r4
            int r13 = X.AnonymousClass29N.A00(r4)
            double r4 = (double) r5
            double r4 = java.lang.Math.ceil(r4)
            int r12 = (int) r4
            X.07r r5 = r10.A0U
            android.content.res.Resources r4 = r5.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r13)
            int r4 = r4.getIntrinsicWidth()
            int r12 = r12 + r4
            android.content.res.Resources r5 = r5.getResources()
            r4 = 2131168532(0x7f070d14, float:1.7951368E38)
            int r4 = r5.getDimensionPixelSize(r4)
            int r12 = r12 + r4
            int r12 = r12 + r11
            float r5 = (float) r12
            float r3 = r3 + r5
            if (r7 == 0) goto L_0x0716
            android.text.TextPaint r4 = r8.getPaint()
            float r10 = r4.measureText(r6)
            if (r14 != 0) goto L_0x0710
            r4 = 0
        L_0x066b:
            float r4 = (float) r4
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x0716
            android.text.TextPaint r4 = r8.getPaint()
            float r4 = r4.measureText(r7)
            float r10 = r10 - r4
            float r3 = r3 + r10
        L_0x067a:
            r11 = 0
            r18 = 0
            java.lang.Object r4 = r0.A05
            X.33j r4 = (X.C620733j) r4
            boolean r4 = X.C620733j.A04(r4)
            if (r4 == 0) goto L_0x0688
            float r5 = -r3
        L_0x0688:
            android.view.animation.TranslateAnimation r10 = new android.view.animation.TranslateAnimation
            r19 = r11
            r21 = r11
            r23 = r11
            r24 = r18
            r16 = r10
            r17 = r11
            r20 = r5
            r22 = r18
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r10.setDuration(r1)
            X.4H5 r4 = new X.4H5
            r4.<init>(r0, r11, r9)
            r10.setAnimationListener(r4)
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r4.width = r12
            r9.setLayoutParams(r4)
            r9.startAnimation(r10)
        L_0x06b4:
            r10 = 0
        L_0x06b5:
            r17 = 0
            r18 = 0
            java.lang.Object r9 = r0.A05
            X.33j r9 = (X.C620733j) r9
            boolean r5 = X.C620733j.A04(r9)
            float r4 = -r3
            if (r5 != 0) goto L_0x06c5
            float r4 = (float) r12
        L_0x06c5:
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r21 = r17
            r23 = r17
            r24 = r18
            r16 = r3
            r19 = r17
            r20 = r4
            r22 = r18
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r3.setFillAfter(r15)
            if (r10 == 0) goto L_0x06df
            r1 = 4000(0xfa0, double:1.9763E-320)
        L_0x06df:
            r3.setDuration(r1)
            X.1Ea r1 = new X.1Ea
            r1.<init>(r8, r0, r7)
            r3.setAnimationListener(r1)
            X.5Ki r0 = r9.A05()
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x06f5
            r8.setText(r7)
        L_0x06f5:
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            android.text.TextPaint r0 = r8.getPaint()
            float r0 = r0.measureText(r6)
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            r4.width = r0
            r8.setLayoutParams(r4)
            r8.startAnimation(r3)
            return
        L_0x0710:
            int r4 = r14.getWidth()
            goto L_0x066b
        L_0x0716:
            r7 = r6
            goto L_0x067a
        L_0x0719:
            com.whatsapp.TextEmojiLabel r4 = r12.A02
            android.text.TextPaint r5 = r4.getPaint()
            java.lang.String r4 = r13.A0L()
            float r5 = r5.measureText(r4)
            goto L_0x0632
        L_0x0729:
            if (r7 != 0) goto L_0x072e
            r7 = r6
        L_0x072c:
            r12 = 0
            goto L_0x06b4
        L_0x072e:
            android.text.TextPaint r3 = r8.getPaint()
            float r3 = r3.measureText(r6)
            android.text.TextPaint r5 = r8.getPaint()
            float r5 = r5.measureText(r7)
            float r3 = r3 - r5
            java.lang.Object r10 = r0.A00
            X.2sp r10 = (X.C56952sp) r10
            r9 = 6172(0x181c, float:8.649E-42)
            X.2vE r5 = X.C58422vE.A02
            boolean r5 = r10.A0Y(r5, r9)
            if (r5 == 0) goto L_0x072c
            java.lang.Object r5 = r0.A03
            X.2sH r5 = (X.C56612sH) r5
            X.07r r4 = r4.A0U
            java.lang.String r4 = X.AnonymousClass31U.A01(r4, r5, r13)
            if (r4 == 0) goto L_0x072c
            r7 = r6
            r12 = 0
            r10 = 1
            goto L_0x06b5
        L_0x075e:
            java.lang.Object r3 = r0.A00
            X.5l7 r3 = (X.C113245l7) r3
            java.lang.Object r8 = r0.A01
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.Object r11 = r0.A02
            com.whatsapp.KeyboardPopupLayout r11 = (com.whatsapp.KeyboardPopupLayout) r11
            java.lang.Object r10 = r0.A03
            android.widget.ListView r10 = (android.widget.ListView) r10
            java.lang.Object r9 = r0.A04
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            java.lang.Object r4 = r0.A05
            android.view.View r4 = (android.view.View) r4
            X.4VQ r1 = r3.A3B
            r0 = 0
            r1.A0S(r0)
            android.view.View r7 = r3.A0R
            r2 = 0
            com.whatsapp.conversation.ConversationListView r0 = r3.A2f
            if (r0 == 0) goto L_0x0787
            boolean r2 = r0.A0B(r2)
        L_0x0787:
            r0 = 0
            r11.setClipChildren(r0)
            int r12 = r10.getTranscriptMode()
            int r6 = r8.getHeight()
            r1 = 0
            float r0 = (float) r6
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r1, r1, r1, r0)
            r0 = 250(0xfa, double:1.235E-321)
            r5.setDuration(r0)
            r7.startAnimation(r5)
            if (r2 == 0) goto L_0x07ab
            r2 = 2
            r10.setTranscriptMode(r2)
            r10.startAnimation(r5)
        L_0x07ab:
            android.graphics.drawable.Drawable r5 = r9.getBackground()
            boolean r2 = r5 instanceof X.AnonymousClass4M8
            if (r2 != 0) goto L_0x07bb
            X.4M8 r2 = new X.4M8
            r2.<init>(r5)
            X.AnonymousClass4M8.A00(r2, r9)
        L_0x07bb:
            X.0yg r2 = new X.0yg
            r2.<init>(r9, r6)
            r2.setDuration(r0)
            r9.startAnimation(r2)
            X.1Eb r7 = new X.1Eb
            r7.<init>(r8, r9, r10, r11, r12)
            r2.setAnimationListener(r7)
            r0 = 1
            int r0 = r3.A0V(r0)
            r3.A1Q(r0)
            r0 = 8
            r4.setVisibility(r0)
            r3.A0r()
            return
        L_0x07df:
            java.lang.Object r1 = r0.A05
            X.3MU r1 = (X.AnonymousClass3MU) r1
            java.lang.Object r6 = r0.A01
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r5 = r0.A04
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            java.lang.Object r4 = r0.A03
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A00
            X.4EJ r2 = (X.AnonymousClass4EJ) r2
            java.lang.Object r3 = r0.A02
            X.2p5 r3 = (X.C54662p5) r3
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x07fb:
            java.lang.Object r1 = r0.A05
            X.3MX r1 = (X.AnonymousClass3MX) r1
            java.lang.Object r6 = r0.A01
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r5 = r0.A04
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            java.lang.Object r4 = r0.A03
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A00
            X.4EJ r2 = (X.AnonymousClass4EJ) r2
            java.lang.Object r3 = r0.A02
            X.2p5 r3 = (X.C54662p5) r3
            r1.A01(r2, r3, r4, r5, r6)
            return
        L_0x0817:
            java.lang.Object r7 = r0.A00
            X.34x r7 = (X.C624134x) r7
            java.lang.Object r6 = r0.A01
            X.33f r6 = (X.C620333f) r6
            java.lang.Object r2 = r0.A02
            X.3Lv r2 = (X.C66543Lv) r2
            java.lang.Object r5 = r0.A03
            X.3Wi r5 = (X.C69263Wi) r5
            java.lang.Object r4 = r0.A04
            java.lang.Object r3 = r0.A05
            int r1 = r7.A0D
            r0 = 7
            if (r1 != r0) goto L_0x0843
            r7.A1A()
            boolean r0 = r7 instanceof X.C30331mH
            if (r0 == 0) goto L_0x084e
            X.2z0 r0 = r7.A1J
            X.3Ll r2 = r6.A0P
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 0
            r2.A09(r1, r0)
        L_0x0843:
            r1 = 38
            X.3aM r0 = new X.3aM
            r0.<init>(r7, r4, r3, r1)
            r5.A0S(r0)
            return
        L_0x084e:
            r2.A0Y(r7)
            goto L_0x0843
        L_0x0852:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0854 }
        L_0x0854:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)     // Catch:{ all -> 0x0859 }
            throw r0     // Catch:{ all -> 0x0859 }
        L_0x0859:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x085b }
        L_0x085b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71723cZ.run():void");
    }

    public C71723cZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    public C71723cZ(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MX r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A06 = 8;
        C162457s7.A0J(x509Certificate, 2);
        C18260x0.A0T(r2, r3);
        this.A05 = r4;
        this.A01 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r2;
        this.A02 = r3;
    }

    public C71723cZ(Uri uri, C621033m r3, C109015dw r4, UserJid userJid, C624134x r6, List list) {
        this.A06 = 0;
        this.A00 = r3;
        this.A01 = uri;
        this.A02 = list;
        this.A03 = r6;
        this.A05 = r4;
        this.A04 = userJid;
    }

    public C71723cZ(AnonymousClass3MV r2, AnonymousClass4EJ r3, C54662p5 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A06 = 1;
        C162457s7.A0J(x509Certificate, 2);
        C18260x0.A0T(r3, r4);
        this.A05 = r2;
        this.A01 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r3;
        this.A02 = r4;
    }

    public C71723cZ(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MU r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A06 = 7;
        C162457s7.A0J(x509Certificate, 2);
        C18260x0.A0T(r2, r3);
        this.A05 = r4;
        this.A01 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r2;
        this.A02 = r3;
    }
}
