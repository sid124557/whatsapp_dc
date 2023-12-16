package X;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

/* renamed from: X.0UR  reason: invalid class name */
public abstract class AnonymousClass0UR {
    public final C06430Xr A00;
    public final C56512s6 A01;
    public final C48092eK A02;
    public final C622634i A03;
    public final File A04;

    public abstract AnonymousClass0NK A03();

    public abstract AnonymousClass0NK A04(C54292oU r1, AnonymousClass4BZ r2, File file, int i, int i2, boolean z);

    public abstract C17410vU A05(Context context);

    public abstract void A06(C16370su r1, File file);

    public abstract boolean A07(Context context);

    public abstract boolean A08(C16380sv r1, boolean z);

    public abstract boolean A09(String str);

    public static void A02(C16370su r8, InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr = new byte[AnonymousClass35S.A0F];
        long j2 = 0;
        int i = -1;
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
                int A0F = AnonymousClass001.A0F(j2, j);
                if (i != A0F) {
                    Locale locale = Locale.ENGLISH;
                    Object[] objArr = new Object[3];
                    AnonymousClass000.A1Q(objArr, 0, j2);
                    AnonymousClass000.A1Q(objArr, 1, j);
                    AnonymousClass000.A1P(objArr, A0F, 2);
                    String.format(locale, "encrypter/encrypt %d/%d (%d%%)", objArr);
                    if (r8 != null) {
                        r8.AyK(Integer.valueOf(A0F));
                    }
                    i = A0F;
                }
            } else {
                return;
            }
        }
    }

    public AnonymousClass0UR(C06430Xr r1, C56512s6 r2, C48092eK r3, C622634i r4, File file) {
        this.A04 = file;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
