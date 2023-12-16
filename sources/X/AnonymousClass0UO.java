package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.0UO  reason: invalid class name */
public final class AnonymousClass0UO {
    public File A00;
    public final AnonymousClass0WN A01;
    public final AnonymousClass0UF A02;
    public final C56512s6 A03;
    public final File A04;
    public final Object A05 = AnonymousClass002.A0D();
    public final String A06;
    public final byte[] A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass0UO.class != obj.getClass()) {
                return false;
            }
            AnonymousClass0UO r5 = (AnonymousClass0UO) obj;
            if (!this.A04.equals(r5.A04) || !AnonymousClass75J.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public long A01() {
        if (!this.A01.A0G() || this.A07 == null) {
            return this.A04.length();
        }
        return this.A04.length() + 16;
    }

    public File A02() {
        byte[] bArr;
        File file;
        AnonymousClass0WN r4 = this.A01;
        if (!r4.A0G() || (bArr = this.A07) == null) {
            return this.A04;
        }
        synchronized (this.A05) {
            File file2 = this.A00;
            if (file2 == null || !file2.exists()) {
                File A0A = AnonymousClass002.A0A(this.A03.A01(), AnonymousClass002.A0B(this.A06).getName());
                this.A00 = A0A;
                r4.A0D(this.A04, A0A, bArr);
            }
            file = this.A00;
        }
        return file;
    }

    public void A03() {
        synchronized (this.A05) {
            File file = this.A00;
            if (file != null && file.exists() && !this.A00.delete()) {
                Log.w("local-file/cleanup/failed to delete a file");
            }
        }
    }

    public static String A00(AnonymousClass310 r0, AnonymousClass5ZR r1, File file) {
        try {
            return AnonymousClass0YV.A07(r0, r1, file);
        } catch (AnonymousClass0EV e) {
            Log.w("gdrive/local-file/calcMd5() failed", e);
            return null;
        }
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A04;
        A0M[1] = this.A02;
        return Arrays.hashCode(A0M);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LocalFile{file=");
        A0o.append(this.A04);
        A0o.append(", metadata=");
        return AnonymousClass000.A0Q(this.A02, A0o);
    }

    public AnonymousClass0UO(C64393Dh r10, AnonymousClass0WN r11, C04450Oi r12, AnonymousClass310 r13, C56512s6 r14, C54292oU r15, AnonymousClass5ZR r16, File file, String str, String str2) {
        String A002;
        File file2 = file;
        this.A04 = file2;
        AnonymousClass0WN r2 = r11;
        this.A01 = r11;
        this.A03 = r14;
        String str3 = str2;
        if (!r11.A0G() || !r12.A01(str) || (A002 = A00(r13, r16, file2)) == null) {
            this.A06 = str3;
            return;
        }
        AnonymousClass0UF r1 = new AnonymousClass0UF(r2, str3, A002, file2.length(), file2.lastModified());
        this.A02 = r1;
        byte[] A0O = r11.A0O(str3, r1.A03);
        this.A07 = A0O;
        if (A0O != null) {
            File A0G = r10.A0G();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(C627236i.A06(A0O));
            String A062 = AnonymousClass0YV.A06(r15.A06(), r13, AnonymousClass002.A0A(A0G, AnonymousClass000.A0X(".mcrypt1", A0o)));
            if (A062 != null) {
                this.A06 = A062;
                return;
            }
            throw AnonymousClass001.A0c("Filed to get a new uploadPath");
        }
        throw AnonymousClass001.A0e("Filed to get media decryption hash");
    }
}
