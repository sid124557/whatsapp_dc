package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.0Dg  reason: invalid class name and case insensitive filesystem */
public class C02000Dg extends C10350hn implements C182928pD {
    public int A00 = 0;
    public int A01 = -1;
    public C54352oa A02;
    public AnonymousClass2HW A03;
    public C182928pD A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;
    public final C16830u2 A08;
    public final AnonymousClass0WN A09;
    public final C161767qP A0A;
    public final JniBridge A0B;
    public final Object A0C = AnonymousClass002.A0D();
    public final String A0D;

    public static final C130776cW A00(C16830u2 r9, byte[] bArr, byte[] bArr2) {
        int i;
        String str;
        try {
            C130746cT A002 = C130746cT.A00(bArr);
            try {
                try {
                    return C130776cW.A01(AnonymousClass001.A0x(bArr2, A002.A0N().A07()).doFinal(A002.A0M().A07()));
                } catch (AnonymousClass6u5 e) {
                    Log.e("encb/LoginUserHandler/retrieveBackupKey/parseLoginPayload/exception.", e);
                    str = "Failed to parse aes_k_nonce_k";
                    i = 7;
                    r9.BSH(str, i, 4, -1, -1);
                    return null;
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                Log.e("encb/LoginUserHandler/retrieveBackupKey/aesDecrypt/exception.", e2);
                str = "Failed to decrypt aes_k_nonce_k";
                i = 5;
                r9.BSH(str, i, 4, -1, -1);
                return null;
            }
        } catch (AnonymousClass6u5 e3) {
            Log.e("encb/LoginUserHandler/retrieveBackupKey/parseLoginPayload/exception.", e3);
            str = "Failed to parse login payload";
            i = 7;
            r9.BSH(str, i, 4, -1, -1);
            return null;
        }
    }

    public static /* synthetic */ void A03(C02000Dg r4, String str, int i, int i2) {
        int i3;
        C16830u2 r0 = r4.A08;
        synchronized (r4.A0C) {
            i3 = r4.A00;
        }
        r0.BSH(str, i, i3, -1, i2);
    }

    public C182928pD A04() {
        C182928pD r1;
        synchronized (this.A0C) {
            r1 = this.A04;
            if (r1 == null) {
                r1 = new C18120wm(this, 0);
                this.A04 = r1;
            }
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
        if (r1 == null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0012, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0013, code lost:
        X.C626936e.A0C(r3);
        r5.A0A.A04(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0024, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0026, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0027, code lost:
        X.C626936e.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002a, code lost:
        if (r1 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002c, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002d, code lost:
        X.C626936e.A0C(r3);
        r5.A0A.A05(r5, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05() {
        /*
            r5 = this;
            java.lang.Object r4 = r5.A0C
            monitor-enter(r4)
            int r1 = r5.A00     // Catch:{ all -> 0x003f }
            monitor-exit(r4)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0039
            r3 = 0
            r0 = 1
            monitor-enter(r4)
            if (r1 == r0) goto L_0x001f
            byte[] r1 = r5.A07     // Catch:{ all -> 0x001c }
            monitor-exit(r4)     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0013
            r3 = 1
        L_0x0013:
            X.C626936e.A0C(r3)
            X.7qP r0 = r5.A0A
            r0.A04(r5, r1)
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001c }
            throw r0
        L_0x001f:
            byte[] r2 = r5.A06     // Catch:{ all -> 0x0036 }
            byte[] r1 = r5.A05     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            if (r2 != 0) goto L_0x0027
            r0 = 0
        L_0x0027:
            X.C626936e.A0C(r0)
            if (r1 == 0) goto L_0x002d
            r3 = 1
        L_0x002d:
            X.C626936e.A0C(r3)
            X.7qP r0 = r5.A0A
            r0.A05(r5, r2, r1)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            X.7qP r0 = r5.A0A
            r0.A03(r5)
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02000Dg.A05():void");
    }

    public C02000Dg(C16830u2 r2, AnonymousClass0WN r3, C161767qP r4, C60902zM r5, AnonymousClass4FS r6, JniBridge jniBridge, String str) {
        super(r5, r6);
        this.A0B = jniBridge;
        this.A09 = r3;
        this.A0A = r4;
        this.A0D = str;
        this.A08 = r2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A02(C16830u2 r12, C54352oa r13, byte[] bArr) {
        C16830u2 r5 = r12;
        C130776cW A002 = A00(r12, bArr, Arrays.copyOfRange(r13.A03(), 0, 16));
        if (A002 != null) {
            byte[] copyOfRange = Arrays.copyOfRange(r13.A01(), 0, 16);
            try {
                this.A09.A0A(r12, this.A0D, AnonymousClass001.A0x(copyOfRange, A002.A0N().A07()).doFinal(A002.A0M().A07()), false);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                Log.e("encb/LoginUserHandler//retrieveBackupKey/aesDecrypt/exception.", e);
                r5.BSH("Failed to decrypt backup key", 5, 4, -1, -1);
            }
        }
    }
}
