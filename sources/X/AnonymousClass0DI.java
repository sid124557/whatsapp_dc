package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: X.0DI  reason: invalid class name */
public class AnonymousClass0DI extends AnonymousClass0DJ {
    public Boolean A00;

    public AnonymousClass0W0 A0E(byte[] bArr) {
        return new AnonymousClass0W0(bArr, (byte[]) null);
    }

    public C56292rk A0F(Context context) {
        try {
            AnonymousClass0NX A05 = C06550Ye.A05(context);
            if (A05 == null) {
                this.A04.A01("msgstore/backupDatabase/key is null", 3);
                return null;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("msgstore/backupDatabase/key v=");
            C04260Nl r4 = A05.A00;
            Log.i(AnonymousClass000.A0X(r4.A00, A0o));
            return new C132116ei(r4, A0M(), A05.A02, A05.A01, r4.A01);
        } catch (Exception e) {
            Log.w("msgstore/backupDatabase/key/error", e);
            return null;
        }
    }

    public int A0A() {
        return 16;
    }

    public AnonymousClass0NK A0B(AnonymousClass0W0 r4, String str) {
        byte[] bArr = r4.A01;
        if (bArr != null) {
            return new AnonymousClass0NK(2, AnonymousClass0W0.A00(bArr));
        }
        return r4.A02(this.A04, str, (String) null);
    }

    public AnonymousClass0W0 A0D(InputStream inputStream) {
        byte[] bArr = new byte[16];
        if (inputStream.read(bArr) == 16) {
            return new AnonymousClass0W0(bArr, (byte[]) null);
        }
        Log.e("backup/cannot read footer, footer is null");
        return null;
    }

    public AnonymousClass22O A0H() {
        return AnonymousClass22O.CRYPT14;
    }

    public AnonymousClass0DI(C56972sr r1, C06430Xr r2, AnonymousClass0WN r3, C56512s6 r4, C48502f0 r5, C48092eK r6, C48772fR r7, C622634i r8, File file, Boolean bool) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, file);
        this.A00 = bool;
    }

    public C56292rk A0G(InputStream inputStream, boolean z) {
        StringBuilder A0o;
        String str;
        byte[] bArr;
        C130766cV r8;
        C130756cU A002 = C130756cU.A00(inputStream);
        byte[] bArr2 = null;
        if (A002.A0N() != C143046yF.WA_PROVIDED || !A002.A0R()) {
            A0o = AnonymousClass001.A0o();
            str = "msgstore/restore/failed to read cipher from the file ";
        } else {
            C130726cR A0P = A002.A0P();
            C04260Nl r3 = new C04260Nl(A0P.A0Q(), A0P.A0M().A07(), A0P.A0P().A07(), A0P.A0O().A07(), A0P.A0N().A07());
            AnonymousClass2ZX A01 = this.A03.A01(r3);
            if (z) {
                if (A01 == null) {
                    A0o = AnonymousClass001.A0o();
                    str = "msgstore/restore/cipher result is null for ";
                }
                bArr = A01.A02;
            } else {
                if (A01 == null) {
                    bArr = null;
                }
                bArr = A01.A02;
            }
            Arrays.toString(bArr);
            if (A002.A0Q()) {
                r8 = A002.A0M();
            } else {
                r8 = null;
            }
            if (A01 != null) {
                bArr2 = A01.A01;
            }
            return new C132116ei(r3, r8, bArr2, bArr, r3.A01);
        }
        A0o.append(str);
        Log.e(AnonymousClass000.A0R(A0H(), A0o));
        return null;
    }

    public C130766cV A0M() {
        String str;
        String A0L = A0L();
        if (A0L != null) {
            str = A0L.substring(A0L.length() - 2);
        } else {
            str = null;
        }
        C130536c8 A002 = C130766cV.A00();
        A002.A0B();
        if (str != null) {
            A002.A0F(str);
        }
        Boolean bool = this.A00;
        if (bool != null) {
            A002.A0J(bool.booleanValue());
        }
        C06430Xr r0 = this.A00;
        if (r0 != null) {
            r0.A07(A002);
        }
        return (C130766cV) A002.A06();
    }
}
