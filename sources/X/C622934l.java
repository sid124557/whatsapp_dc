package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;

/* renamed from: X.34l  reason: invalid class name and case insensitive filesystem */
public class C622934l {
    public static final C138076pj A06 = new C138076pj(4, 5, false);
    public SecureRandom A00;
    public final C55682qk A01;
    public final C56612sH A02;
    public final C55832qz A03;
    public final AnonymousClass306 A04;
    public final C162397rz A05;

    public static final C150527Rc A01(C42162Na r3, InputStream inputStream, int i) {
        C133636hh r2;
        try {
            r2 = new C133636hh(r3, inputStream, i);
            do {
            } while (r2.read(new byte[DefaultCrypto.BUFFER_SIZE]) >= 0);
            C150527Rc r0 = r2.A04;
            r2.close();
            return r0;
        } catch (IOException e) {
            Log.e("mediaupload/calculate-sidecar/ioexception", e);
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public AnonymousClass8KT A03(C182378oJ r8, File file, int[] iArr) {
        C55682qk r0 = this.A01;
        C626936e.A06(file);
        FileInputStream A0T = C107655bf.A0T(r0, file);
        this.A04.A05(A0T);
        if (iArr.length == 4) {
            long A0C = C18310x6.A0C(iArr);
            if (A0C != -1) {
                C140326tY r4 = new C140326tY(new BufferedInputStream(A0T), MessageDigest.getInstance("SHA-256"));
                C140326tY r3 = new C140326tY(new C140706uL(r4, A0C), MessageDigest.getInstance("SHA-256"));
                return new AnonymousClass8KT(r4, new C140326tY(r8.B2Q(new C36841zy(r3, r4)), MessageDigest.getInstance("SHA-256")), r3, this);
            }
        }
        return A04(r8, new BufferedInputStream(A0T));
    }

    public AnonymousClass8KT A04(C182378oJ r5, InputStream inputStream) {
        C140326tY r3 = new C140326tY(inputStream, MessageDigest.getInstance("SHA-256"));
        return new AnonymousClass8KT(r3, new C140326tY(r5.B2Q(r3), MessageDigest.getInstance("SHA-256")), (C140326tY) null, this);
    }

    public AnonymousClass7L5 A05(C184298rZ r6, C61212zt r7, C148277Ht r8) {
        C140326tY r1;
        AnonymousClass32B r0 = r8.A00;
        C626936e.A06(r0);
        C182378oJ B7L = r6.B7L(r0.A01);
        File file = r7.A02.A07;
        C626936e.A06(file);
        AnonymousClass8KT A022 = A02(B7L, r7, file);
        try {
            byte[] bArr = new byte[16384];
            do {
                r1 = A022.A00;
            } while (r1.read(bArr) >= 0);
            AnonymousClass7L5 r02 = new AnonymousClass7L5(new AnonymousClass7SM(A022.A02.A00(), false), new AnonymousClass7SM(r1.A00(), false), r8);
            A022.close();
            return r02;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final InputStream A06(C61212zt r4, File file) {
        if (r4 instanceof C135406kc) {
            File file2 = r4.A02.A07;
            C626936e.A06(file2);
            return new C140286tU((C135406kc) r4, this, file2);
        }
        C55682qk r0 = this.A01;
        C626936e.A06(file);
        FileInputStream A0T = C107655bf.A0T(r0, file);
        C633138t r1 = r4.A02.A06;
        if (!(AnonymousClass36O.A06(r1) || r1 == C633138t.A0A || r1 == C633138t.A0D || r1 == C633138t.A0h || r1 == C633138t.A0B || r1 == C633138t.A0I || r1 == C633138t.A0U)) {
            this.A04.A05(A0T);
        }
        return new BufferedInputStream(A0T);
    }

    public C622934l(C55682qk r1, C56612sH r2, C55832qz r3, AnonymousClass306 r4, C162397rz r5) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
    }

    public static int A00(AnonymousClass30M r3) {
        C95814uZ r2 = r3.A00().A1J.A00;
        boolean z = true;
        if (r2 == null) {
            return 1;
        }
        if (r3.A02.size() <= 1) {
            z = false;
        }
        return AnonymousClass368.A01(r2, z);
    }

    public AnonymousClass8KT A02(C182378oJ r4, C61212zt r5, File file) {
        if (!r5.A02()) {
            C140326tY r2 = new C140326tY(A06(r5, file), AnonymousClass0x7.A0t());
            return new AnonymousClass8KT(r2, r2, (C140326tY) null, this);
        }
        int[] iArr = r5.A02.A0H;
        if (iArr == null || iArr.length <= 0) {
            return A04(r4, A06(r5, file));
        }
        return A03(r4, file, iArr);
    }

    public String A07(C633138t r3, File file, boolean z) {
        C138076pj A052;
        C626936e.A0C(A08(r3, file, z));
        if (AnonymousClass36O.A03(r3)) {
            if (z) {
                A052 = A06;
            } else {
                A052 = C162397rz.A05(this.A01, file);
            }
            return C162397rz.A08(A052);
        } else if (!AnonymousClass36O.A08(r3)) {
            return null;
        } else {
            int i = C162397rz.A06(this.A01, file).A01;
            if (i == 7) {
                return "video/quicktime";
            }
            if (i == 3) {
                return "video/3gpp";
            }
            return "video/mp4";
        }
    }

    public boolean A08(C633138t r3, File file, boolean z) {
        if (AnonymousClass36O.A03(r3)) {
            if (z || this.A05.A0F(file)) {
                return true;
            }
            return false;
        } else if (AnonymousClass36O.A08(r3)) {
            return this.A05.A0G(file);
        } else {
            return true;
        }
    }
}
