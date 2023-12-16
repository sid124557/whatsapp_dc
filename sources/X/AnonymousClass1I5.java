package X;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1I5  reason: invalid class name */
public class AnonymousClass1I5 extends AnonymousClass1I8 {
    public static final byte[] A0k = new byte[0];
    public long A00;
    public AnonymousClass2YO A01;
    public C32441qP A02;
    public File A03;
    public String A04;
    public AtomicReference A05 = new AtomicReference((Object) null);
    public boolean A06;
    public final C55682qk A07;
    public final C64393Dh A08;
    public final C69263Wi A09;
    public final C56352rq A0A;
    public final C56492s4 A0B;
    public final AnonymousClass3XB A0C;
    public final AnonymousClass3XB A0D;
    public final AnonymousClass3XB A0E;
    public final AnonymousClass3XB A0F;
    public final AnonymousClass3XB A0G;
    public final AnonymousClass3XB A0H;
    public final C56612sH A0I;
    public final C54292oU A0J;
    public final C182368oI A0K;
    public final C184298rZ A0L;
    public final AnonymousClass319 A0M;
    public final C49802h7 A0N;
    public final AnonymousClass1VX A0O;
    public final C55002pd A0P;
    public final C54672p6 A0Q;
    public final AnonymousClass2WV A0R;
    public final AnonymousClass2H2 A0S;
    public final C60132y3 A0T;
    public final C49592gm A0U;
    public final C61212zt A0V;
    public final AnonymousClass7L3 A0W;
    public final C56752sV A0X;
    public final AnonymousClass2UL A0Y;
    public final AnonymousClass5KI A0Z;
    public final C622934l A0a;
    public final AnonymousClass2RO A0b;
    public final C102275If A0c;
    public final C60152y5 A0d;
    public final AnonymousClass65W A0e;
    public final C29011i8 A0f;
    public final AnonymousClass4FS A0g;
    public final boolean A0h;
    public volatile long A0i;
    public volatile boolean A0j;

    public final AnonymousClass5KH A09(AnonymousClass2YO r12, C32441qP r13, String str) {
        AnonymousClass2RO r1 = this.A0b;
        String A002 = A0A().A00();
        C60872zJ r2 = r1.A00;
        AnonymousClass2WV r6 = r1.A04;
        C47412dD r14 = new C47412dD(r2, r1.A01, r1.A02, r1.A03, r6, r12, r13, str, A002);
        C53512nD A003 = r14.A00();
        C102265Ie r4 = r14.A07;
        AnonymousClass580 r3 = A003.A02;
        if (r3 == null || r3 == AnonymousClass580.FAILURE) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("mediaupload/the resume request and the fallback mms resume request failed; request=");
            C18260x0.A0o(this.A0V, A0o);
            return new AnonymousClass5KH(r4, (String) null, (String) null, 17, 0, false);
        } else if (r3 == AnonymousClass580.COMPLETE) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("mediaupload/object already existed on media server; upload ending; request=");
            C18260x0.A0o(this.A0V, A0o2);
            return new AnonymousClass5KH(r4, A003.A03, A003.A05, 0, 0, true);
        } else {
            AnonymousClass580 r0 = AnonymousClass580.RESUME;
            StringBuilder A0o3 = AnonymousClass001.A0o();
            if (r3 == r0) {
                A0o3.append("mediaupload/resume from ");
                A0o3.append(A003.A01);
                A0o3.append("; request=");
                C18260x0.A0o(this.A0V, A0o3);
                return new AnonymousClass5KH(r4, (String) null, (String) null, 0, A003.A01, false);
            }
            throw AnonymousClass000.A0H(r3, "unhandled result type in checkForResumePoint, type=", A0o3);
        }
    }

    public final C46822cG A0A() {
        String str;
        Integer valueOf;
        AnonymousClass1VX r2 = this.A0O;
        AnonymousClass2UD r1 = this.A0V.A02;
        switch (r1.A02) {
            case 2:
                str = "chat_personal";
                break;
            case 3:
                str = "chat_group";
                break;
            case 4:
                str = "status_user";
                break;
            case 5:
                str = "product_catalog";
                break;
            case 6:
                str = "sticker_web";
                break;
            case 7:
                str = "payment_kyc";
                break;
            case 8:
                str = "message_history_sync";
                break;
            case 9:
                str = "community";
                break;
            case 10:
                str = "channel";
                break;
            case 11:
                str = "broadcast";
                break;
            case 12:
                str = "multi_chat";
                break;
            default:
                str = "unknown";
                break;
        }
        String str2 = r1.A06.A02;
        AnonymousClass2YO r0 = this.A01;
        if (r0 == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(r0.A01.get());
        }
        return new C46822cG(r2, valueOf, str, str2, (String) null, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        com.whatsapp.util.Log.w("MMS upload unable to get video meta", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r3 = this;
            X.2zt r0 = r3.A0V
            X.2UD r1 = r0.A02
            X.38t r0 = r1.A06
            boolean r0 = X.AnonymousClass36O.A08(r0)
            if (r0 == 0) goto L_0x0040
            java.io.File r0 = r1.A07     // Catch:{ 6pi -> 0x003a }
            X.C626936e.A06(r0)     // Catch:{ 6pi -> 0x003a }
            X.5Qm r1 = new X.5Qm     // Catch:{ 6pi -> 0x003a }
            r1.<init>(r0)     // Catch:{ 6pi -> 0x003a }
            boolean r0 = r1.A02()     // Catch:{ 6pi -> 0x003a }
            if (r0 == 0) goto L_0x0024
            int r2 = r1.A01     // Catch:{ 6pi -> 0x003a }
            int r0 = r1.A03     // Catch:{ 6pi -> 0x003a }
        L_0x0020:
            X.2sV r1 = r3.A0X     // Catch:{ 6pi -> 0x003a }
            monitor-enter(r1)     // Catch:{ 6pi -> 0x003a }
            goto L_0x0029
        L_0x0024:
            int r2 = r1.A03     // Catch:{ 6pi -> 0x003a }
            int r0 = r1.A01     // Catch:{ 6pi -> 0x003a }
            goto L_0x0020
        L_0x0029:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0037 }
            r1.A03 = r0     // Catch:{ all -> 0x0037 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0037 }
            r1.A04 = r0     // Catch:{ all -> 0x0037 }
            monitor-exit(r1)     // Catch:{ 6pi -> 0x003a }
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ 6pi -> 0x003a }
            throw r0     // Catch:{ 6pi -> 0x003a }
        L_0x003a:
            r1 = move-exception
            java.lang.String r0 = "MMS upload unable to get video meta"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I5.A0B():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (r3 != 0) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(long r7) {
        /*
            r6 = this;
            long r1 = r6.A0i
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            X.2s4 r5 = r6.A0B
            long r3 = r6.A0i
            long r1 = r7 - r3
            X.2zt r0 = r6.A0V
            X.7iO r0 = r0.A03
            boolean r0 = r0.A02
            int r0 = X.AnonymousClass0x9.A00(r0)
            r5.A06(r1, r0)
        L_0x0019:
            r6.A0i = r7
            X.2UL r2 = r6.A0Y
            long r0 = r6.A0i
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08 = r0
            java.util.concurrent.FutureTask r0 = r6.A02
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x0061
            X.2zt r1 = r6.A0V
            boolean r0 = r1 instanceof X.C135406kc
            if (r0 == 0) goto L_0x0066
            r0 = r1
            X.6kc r0 = (X.C135406kc) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0062
            X.2UD r0 = r1.A02
            java.io.File r1 = r0.A07
            X.C626936e.A06(r1)
            boolean r0 = r1.exists()
            X.C626936e.A0C(r0)
            long r3 = r1.length()
        L_0x004c:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
        L_0x0052:
            r0 = 100
            long r7 = r7 * r0
            long r1 = r7 / r3
        L_0x0057:
            int r0 = (int) r1
            X.3XB r1 = r6.A0G
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05(r0)
        L_0x0061:
            return
        L_0x0062:
            r3 = 65536(0x10000, double:3.2379E-319)
            goto L_0x0052
        L_0x0066:
            X.2UD r0 = r1.A02
            long r3 = r0.A03
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I5.A0C(long):void");
    }

    public boolean A0E() {
        if (this instanceof AnonymousClass1g6) {
            return C18300x5.A1W(this.A0V.A02.A06, C633138t.A0S);
        }
        return false;
    }

    public final boolean A0F() {
        AnonymousClass2UD r2 = this.A0V.A02;
        C633138t r1 = r2.A06;
        if (!C613030d.A00(r1)) {
            return false;
        }
        if (AnonymousClass36O.A07(r1) || r1 == C633138t.A0f) {
            return true;
        }
        int[] iArr = r2.A0H;
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        return true;
    }

    public void A02() {
        super.A02();
        this.A0C.A02();
        this.A0G.A02();
        this.A0H.A02();
        this.A0E.A02();
        this.A0D.A02();
    }

    public final void A0D(Integer num) {
        C56752sV r8;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mediaupload/onpostexecute, result=");
        A0o.append(num);
        C18260x0.A1P(A0o, ", this=", this);
        if (this.A0j) {
            this.A0j = false;
            this.A0f.A07(this.A0e);
        }
        C61212zt r7 = this.A0V;
        if (r7.A02.A0F) {
            C56752sV r5 = this.A0X;
            AnonymousClass2WV r6 = this.A0R;
            String A032 = r5.A03();
            long A0H2 = this.A0I.A0H();
            if (!TextUtils.isEmpty(A032)) {
                A032 = C18300x5.A0f(AnonymousClass3UP.A00(Uri.parse(A032).buildUpon(), "_nc_hot", String.valueOf(C18290x4.A0B(A0H2))));
            }
            r5.A08(r6.A00(A032, true));
        }
        if (num.intValue() == 18) {
            this.A0Q.A00();
        }
        if (this.A02.isCancelled()) {
            num = AnonymousClass001.A0f();
        }
        AnonymousClass3XB r1 = this.A0H;
        C56752sV r2 = this.A0X;
        synchronized (r2) {
            r8 = new C56752sV();
            r8.A00 = r2.A00;
            r8.A0I = r2.A0I;
            r8.A0K = r2.A0K;
            r8.A0L = r2.A0L;
            r8.A03 = r2.A03;
            r8.A04 = r2.A04;
            r8.A09 = r2.A09;
            r8.A08 = r2.A08;
            r8.A02 = r2.A02;
            r8.A0B = r2.A0B;
            r8.A07 = r2.A07;
            r8.A05 = r2.A05;
            r8.A0F = r2.A0F;
            r8.A0H = r2.A0H;
            r8.A0G = r2.A0G;
            r8.A0D = r2.A0D;
            r8.A0C = r2.A0C;
            r8.A0J = r2.A0J;
            r8.A01 = r2.A01;
            r8.A06 = r2.A06;
            r8.A0A = r2.A0A;
            r8.A0E = r2.A0E;
        }
        r1.A05(new C149897Oi(r7, r8, this.A03, num.intValue(), this.A06, A0E()));
    }

    public void cancel() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mediaupload/cancel request=");
        A0o.append(this.A0V);
        C18260x0.A1P(A0o, ", this=", this);
        if (this.A05.get() != null && A0E()) {
            C626936e.A06(this.A02);
            C71533cG.A00(this.A0g, this, 36);
        }
        super.cancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0102, code lost:
        if (r4.A03 <= 52428800) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1I5(X.C55682qk r10, X.C64393Dh r11, X.C69263Wi r12, X.C56352rq r13, X.C56492s4 r14, X.C56612sH r15, X.C54292oU r16, X.AnonymousClass319 r17, X.C49802h7 r18, X.AnonymousClass1VX r19, X.C46992cX r20, X.C55002pd r21, X.C54672p6 r22, X.AnonymousClass2WV r23, X.AnonymousClass2H2 r24, X.C60132y3 r25, X.C49592gm r26, X.C61212zt r27, X.AnonymousClass5KI r28, X.C622934l r29, X.AnonymousClass2RO r30, X.C60152y5 r31, X.C29011i8 r32, X.AnonymousClass4FS r33) {
        /*
            r9 = this;
            X.5If r4 = new X.5If
            r0 = r20
            r3 = r19
            r7 = r21
            r4.<init>(r3, r0, r7)
            r9.<init>()
            r1 = 0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r1)
            r9.A05 = r0
            X.3XB r6 = X.AnonymousClass3XB.A00()
            r9.A0C = r6
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r9.A0G = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r9.A0H = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r9.A0E = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r9.A0F = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r9.A0D = r0
            r1 = 1
            X.4Kk r0 = new X.4Kk
            r0.<init>(r9, r1)
            r9.A0e = r0
            r0 = r16
            r9.A0J = r0
            r9.A0I = r15
            r9.A0O = r3
            r9.A09 = r12
            r9.A07 = r10
            r0 = r33
            r9.A0g = r0
            r9.A08 = r11
            r9.A0B = r14
            r5 = r32
            r9.A0f = r5
            r0 = r23
            r9.A0R = r0
            r0 = r25
            r9.A0T = r0
            r1 = r29
            r9.A0a = r1
            r2 = r17
            r9.A0M = r2
            r0 = r30
            r9.A0b = r0
            r0 = r26
            r9.A0U = r0
            r0 = r28
            r9.A0Z = r0
            r0 = r18
            r9.A0N = r0
            r0 = r24
            r9.A0S = r0
            r0 = r22
            r9.A0Q = r0
            r9.A0P = r7
            r0 = r31
            r9.A0d = r0
            r9.A0A = r13
            r8 = r27
            X.2UL r0 = r8.A04
            r9.A0Y = r0
            r9.A0V = r8
            r9.A0c = r4
            X.2sV r7 = new X.2sV
            r7.<init>()
            r9.A0X = r7
            monitor-enter(r7)
            X.2UD r4 = r8.A02     // Catch:{ all -> 0x0108 }
            X.32B r0 = r4.A04     // Catch:{ all -> 0x0108 }
            r7.A00 = r0     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = r4.A09     // Catch:{ all -> 0x0108 }
            r7.A09 = r0     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = r4.A08     // Catch:{ all -> 0x0108 }
            r7.A08 = r0     // Catch:{ all -> 0x0108 }
            X.7Hs r0 = r4.A05     // Catch:{ all -> 0x0108 }
            r7.A01 = r0     // Catch:{ all -> 0x0108 }
            monitor-exit(r7)
            X.8rZ r0 = r8.A00
            r9.A0L = r0
            X.8oI r0 = r0.B8x()
            r9.A0K = r0
            X.7L3 r0 = new X.7L3
            r0.<init>(r15, r2, r1)
            r9.A0W = r0
            r1 = 15
            X.6Bp r0 = new X.6Bp
            r0.<init>(r9, r1)
            java.util.concurrent.Executor r2 = r12.A08
            r9.A04(r0, r2)
            r0 = 22
            X.4Ji r1 = new X.4Ji
            r1.<init>(r9, r0)
            X.3XB r0 = r9.A00
            r0.A04(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.A05(r0)
            X.2zt r0 = r9.A0V
            X.2UD r0 = r0.A02
            X.38t r0 = r0.A06
            java.lang.String r2 = r0.A02
            r1 = 0
            r0 = 0
            r5.A0J(r2, r1, r1, r0)
            r1 = 487(0x1e7, float:6.82E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0104
            X.38t r1 = r4.A06
            X.38t r0 = X.C633138t.A09
            if (r1 != r0) goto L_0x0104
            long r4 = r4.A03
            r2 = 52428800(0x3200000, double:2.5903269E-316)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0105
        L_0x0104:
            r0 = 0
        L_0x0105:
            r9.A0h = r0
            return
        L_0x0108:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I5.<init>(X.2qk, X.3Dh, X.3Wi, X.2rq, X.2s4, X.2sH, X.2oU, X.319, X.2h7, X.1VX, X.2cX, X.2pd, X.2p6, X.2WV, X.2H2, X.2y3, X.2gm, X.2zt, X.5KI, X.34l, X.2RO, X.2y5, X.1i8, X.4FS):void");
    }
}
