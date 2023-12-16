package X;

import android.os.CancellationSignal;
import android.os.SystemClock;
import android.util.Base64;
import com.whatsapp.jid.PhoneUserJid;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2xH  reason: invalid class name and case insensitive filesystem */
public class C59662xH {
    public final C56972sr A00;
    public final C29411im A01;
    public final AnonymousClass0XM A02;
    public final C56612sH A03;
    public final C44402Vx A04;
    public final C48502f0 A05;

    public static void A00(CancellationSignal cancellationSignal, CountDownLatch countDownLatch) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + C625635p.A0L;
        while (true) {
            cancellationSignal.throwIfCanceled();
            if (countDownLatch.getCount() != 0 && SystemClock.elapsedRealtime() <= elapsedRealtime) {
                countDownLatch.await(500, TimeUnit.MILLISECONDS);
            } else {
                return;
            }
        }
    }

    public AnonymousClass2SN A01(CancellationSignal cancellationSignal, String str, String str2, String str3) {
        byte[] bArr;
        C56972sr r12 = this.A00;
        PhoneUserJid A042 = C56972sr.A04(r12);
        if (A042 != null) {
            byte[] decode = Base64.decode(str2, 2);
            byte[] decode2 = Base64.decode(str3, 2);
            CountDownLatch A14 = C18290x4.A14();
            String str4 = str;
            this.A02.A04(C69963Zi.A00(A14, 25), str4, decode2, decode);
            try {
                A00(cancellationSignal, A14);
                if (A14.getCount() <= 0) {
                    PhoneUserJid A043 = C56972sr.A04(r12);
                    if (A043 == null) {
                        throw new C36811zv(301, "User was logged out while waiting for encryption key.");
                    } else if (A043.equals(A042)) {
                        C48502f0 r0 = this.A05;
                        AnonymousClass2ZX r1 = (AnonymousClass2ZX) r0.A01.A00.get(new C48572f7(str4, decode2));
                        if (r1 != null && Arrays.equals(r1.A01, decode) && (bArr = r1.A02) != null) {
                            return new AnonymousClass2SN(A043, str4, Base64.encodeToString(decode, 2), Base64.encodeToString(decode2, 2), Base64.encodeToString(bArr, 2), System.currentTimeMillis());
                        }
                        throw new AnonymousClass1gV(101, "Key not found.");
                    } else {
                        throw new C36811zv(301, "User changed while waiting for encryption key.");
                    }
                } else if (!AnonymousClass000.A1U(this.A01.A04, 2)) {
                    throw new AnonymousClass1gV(102, "Not connected to server, cannot fetch keys.");
                } else {
                    throw new AnonymousClass1gV(103, "Failed to fetch keys, timed out.");
                }
            } catch (InterruptedException e) {
                throw new AnonymousClass1gV("Failed to fetch keys, interrupted.", (Throwable) e);
            }
        } else {
            throw new C36811zv(301, "Cannot fetch encryption key when user is not logged in.");
        }
    }

    public C59662xH(C56972sr r1, C29411im r2, AnonymousClass0XM r3, C56612sH r4, C44402Vx r5, C48502f0 r6) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
    }
}
