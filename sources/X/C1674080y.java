package X;

import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.android.exoplayer2.util.Util;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: X.80y  reason: invalid class name and case insensitive filesystem */
public class C1674080y implements C184698sN {
    public int A00;
    public int A01;
    public HandlerThread A02;
    public C124646Di A03;
    public C140526tt A04;
    public C156297gO A05;
    public byte[] A06 = null;
    public byte[] A07;
    public final C124656Dj A08;
    public final C1463679z A09;
    public final C1674180z A0A;
    public final C160797oK A0B;
    public final AnonymousClass7NZ A0C;
    public final String A0D;
    public final UUID A0E;
    public final byte[] A0F;

    public C1674080y(Looper looper, C1463679z r4, C1674180z r5, C160797oK r6, AnonymousClass7NZ r7, String str, UUID uuid, byte[] bArr) {
        this.A0E = uuid;
        this.A0A = r5;
        this.A0B = r6;
        this.A0C = r7;
        this.A09 = r4;
        this.A01 = 2;
        this.A08 = new C124656Dj(looper, this);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.A02 = handlerThread;
        handlerThread.start();
        this.A03 = new C124646Di(this.A02.getLooper(), this);
        this.A0F = bArr;
        this.A0D = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[Catch:{ NumberFormatException -> 0x0051 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(boolean r8) {
        /*
            r7 = this;
            r3 = 1
            r5 = 2
            byte[] r2 = r7.A06
            if (r2 != 0) goto L_0x000a
            r7.A00(r3, r8)
        L_0x0009:
            return
        L_0x000a:
            int r0 = r7.A01
            r6 = 4
            if (r0 == r6) goto L_0x0016
            X.7oK r1 = r7.A0B     // Catch:{ Exception -> 0x00ae }
            byte[] r0 = r7.A07     // Catch:{ Exception -> 0x00ae }
            r1.A0A(r0, r2)     // Catch:{ Exception -> 0x00ae }
        L_0x0016:
            java.util.UUID r1 = X.C155567f7.A04
            java.util.UUID r0 = r7.A0E
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0094
            byte[] r1 = r7.A07
            if (r1 == 0) goto L_0x004f
            X.7oK r0 = r7.A0B
            java.util.Map r3 = r0.A05(r1)
            if (r3 == 0) goto L_0x004f
            java.lang.String r0 = "LicenseDurationRemaining"
            java.lang.String r0 = X.C18310x6.A0o(r0, r3)     // Catch:{ NumberFormatException -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0039 }
            goto L_0x003e
        L_0x0039:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x003e:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "PlaybackDurationRemaining"
            java.lang.String r0 = X.C18310x6.A0o(r0, r3)     // Catch:{ NumberFormatException -> 0x0051 }
            if (r0 == 0) goto L_0x0051
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0051 }
            goto L_0x0056
        L_0x004f:
            r1 = 0
            goto L_0x005e
        L_0x0051:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0056:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r2, r0)
        L_0x005e:
            java.lang.Object r0 = r1.first
            long r2 = X.C18310x6.A0B(r0)
            long r0 = X.AnonymousClass6C8.A0R(r1)
            long r3 = java.lang.Math.min(r2, r0)
            r1 = 60
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0085
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Offline license has expired or will expire soon. Remaining seconds: "
            java.lang.String r1 = X.AnonymousClass000.A0Z(r0, r1, r3)
            java.lang.String r0 = "DefaultDrmSession"
            android.util.Log.d(r0, r1)
            r7.A00(r5, r8)
            return
        L_0x0085:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0094
            X.6yM r0 = new X.6yM
            r0.<init>()
            r7.A01(r0, r5)
            return
        L_0x0094:
            r7.A01 = r6
            X.79z r0 = r7.A09
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0009
            r1.next()
            java.lang.String r0 = "listener"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00ae:
            r2 = move-exception
            java.lang.String r1 = "DefaultDrmSession"
            java.lang.String r0 = "Error trying to restore Widevine keys."
            android.util.Log.e(r1, r0, r2)
            r7.A01(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674080y.A02(boolean):void");
    }

    public final void A00(int i, boolean z) {
        byte[] bArr = this.A07;
        try {
            AnonymousClass7F3 A022 = this.A0B.A02(this.A0D, bArr, this.A0F, i);
            if (C155567f7.A00.equals(this.A0E)) {
                byte[] bArr2 = A022.A01;
                if (Util.A00 < 27) {
                    Charset charset = AnonymousClass79T.A05;
                    bArr2 = new String(bArr2, charset).replace('+', '-').replace('/', '_').getBytes(charset);
                }
                A022 = new AnonymousClass7F3(bArr2, A022.A00);
            }
            this.A03.obtainMessage(1, z ? 1 : 0, 0, A022).sendToTarget();
        } catch (Exception e) {
            if (e instanceof NotProvisionedException) {
                this.A0A.A01(this);
            } else {
                A01(e, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r4 != 2) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Exception r3, int r4) {
        /*
            r2 = this;
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            boolean r0 = X.C153817c4.A01(r3)
            if (r0 == 0) goto L_0x0032
            int r1 = X.C153817c4.A00(r3)
        L_0x000c:
            X.6tt r0 = new X.6tt
            r0.<init>(r3, r1)
            r2.A04 = r0
            java.lang.String r1 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            android.util.Log.e(r1, r0, r3)
            X.79z r0 = r2.A09
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            r1.next()
            java.lang.String r0 = "listener"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0032:
            r0 = 23
            if (r1 < r0) goto L_0x003f
            boolean r0 = X.AnonymousClass70x.A00(r3)
            if (r0 == 0) goto L_0x003f
        L_0x003c:
            r1 = 6006(0x1776, float:8.416E-42)
            goto L_0x000c
        L_0x003f:
            boolean r0 = X.C153807c3.A01(r3)
            if (r0 != 0) goto L_0x006b
            boolean r0 = X.C153807c3.A00(r3)
            if (r0 == 0) goto L_0x004e
            r1 = 6007(0x1777, float:8.418E-42)
            goto L_0x000c
        L_0x004e:
            boolean r0 = r3 instanceof X.C143766zR
            if (r0 == 0) goto L_0x0055
            r1 = 6001(0x1771, float:8.409E-42)
            goto L_0x000c
        L_0x0055:
            boolean r0 = r3 instanceof X.C143106yL
            if (r0 == 0) goto L_0x005c
            r1 = 6003(0x1773, float:8.412E-42)
            goto L_0x000c
        L_0x005c:
            boolean r0 = r3 instanceof X.C143116yM
            if (r0 == 0) goto L_0x0063
            r1 = 6008(0x1778, float:8.419E-42)
            goto L_0x000c
        L_0x0063:
            r0 = 1
            if (r4 == r0) goto L_0x003c
            r0 = 2
            r1 = 6004(0x1774, float:8.413E-42)
            if (r4 == r0) goto L_0x000c
        L_0x006b:
            r1 = 6002(0x1772, float:8.41E-42)
            goto L_0x000c
        L_0x006e:
            int r1 = r2.A01
            r0 = 4
            if (r1 == r0) goto L_0x0076
            r0 = 1
            r2.A01 = r0
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674080y.A01(java.lang.Exception, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2 == 4) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(boolean r5) {
        /*
            r4 = this;
            int r2 = r4.A01
            r0 = 3
            if (r2 == r0) goto L_0x0009
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r3 = 1
            if (r0 != 0) goto L_0x0032
            r2 = 3
            X.7oK r1 = r4.A0B     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            byte[] r0 = r1.A0B()     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            r4.A07 = r0     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            X.7gO r0 = r1.A04(r0)     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            r4.A05 = r0     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            r4.A01 = r2     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            return r3
        L_0x001f:
            r0 = move-exception
            if (r5 == 0) goto L_0x0028
            X.80z r0 = r4.A0A
            r0.A01(r4)
            goto L_0x0030
        L_0x0028:
            r4.A01(r0, r2)
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            r4.A01(r0, r3)
        L_0x0030:
            r0 = 0
            return r0
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674080y.A03(boolean):boolean");
    }

    public final C156297gO B6H() {
        return this.A05;
    }

    public final C140526tt B7N() {
        if (this.A01 == 1) {
            return this.A04;
        }
        return null;
    }

    public final int BDG() {
        return this.A01;
    }
}
