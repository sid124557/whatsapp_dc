package X;

import android.net.Uri;
import com.whatsapp.Mp4Ops;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.88d  reason: invalid class name and case insensitive filesystem */
public class C1691388d implements C187668xc {
    public long A00 = 0;
    public C158207jb A01;
    public FileInputStream A02;
    public boolean A03;
    public final C187658xb A04;
    public final C55682qk A05;
    public final Mp4Ops A06;
    public final C153407bG A07;
    public final C54292oU A08;
    public final File A09;

    public void Awr(C178288hI r1) {
    }

    public Uri BE6() {
        return this.A04.BE6();
    }

    public long Bfx(C157677ih r25) {
        long j;
        C157677ih r5 = r25;
        long j2 = r5.A03;
        this.A00 = j2;
        if (this.A03) {
            File file = this.A09;
            long length = file.length();
            if (this.A00 < length) {
                FileInputStream A0g = AnonymousClass0x9.A0g(file);
                this.A02 = A0g;
                A0g.skip(this.A00);
                j = (length - this.A00) + 0;
                Uri uri = r5.A04;
                byte[] bArr = r5.A07;
                String str = r5.A05;
                int i = r5.A00;
                int i2 = 1;
                if (bArr != null) {
                    i2 = 2;
                }
                r5 = new C157677ih(uri, str, Collections.emptyMap(), bArr, i2, i, length - length, length, -1);
            }
            j = 0;
        } else {
            if (j2 != 0) {
                Uri uri2 = r5.A04;
                byte[] bArr2 = r5.A07;
                String str2 = r5.A05;
                int i3 = r5.A00;
                int i4 = 1;
                if (bArr2 != null) {
                    i4 = 2;
                }
                r5 = new C157677ih(uri2, str2, Collections.emptyMap(), bArr2, i4, i3, 0, 0, -1);
            }
            j = 0;
        }
        long Bfx = j + this.A04.Bfx(r5);
        if (Bfx >= 0 && !this.A03) {
            C54292oU r4 = this.A08;
            Mp4Ops mp4Ops = this.A06;
            this.A01 = new C158207jb(this.A05, mp4Ops, this.A07, r4, this.A09, Bfx);
        }
        return Bfx;
    }

    public void close() {
        this.A04.close();
        FileInputStream fileInputStream = this.A02;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.A02 = null;
        }
        this.A00 = 0;
    }

    public int read(byte[] bArr, int i, int i2) {
        FileInputStream fileInputStream;
        if (this.A01 != null) {
            if (!this.A03) {
                byte[] bArr2 = new byte[256];
                File file = this.A09;
                FileOutputStream A0h = AnonymousClass0x9.A0h(file);
                while (this.A01.A00 == 0) {
                    try {
                        A0h.write(bArr2, 0, this.A04.read(bArr2, 0, 256));
                        A0h.flush();
                        if (!this.A01.A01(file.length())) {
                            this.A03 = AnonymousClass001.A1T(this.A01.A00);
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                }
                if (this.A03) {
                    A0h.close();
                } else {
                    throw AnonymousClass002.A0C("Mp4StreamCheckedDataSource/Mp4StreamCheck not successful");
                }
            }
            File file2 = this.A09;
            long length = file2.length();
            if (length <= 0) {
                throw AnonymousClass002.A0C("Mp4StreamCheckedDataSource/videoHeadForStreamCheck is empty");
            } else if (this.A00 < length) {
                FileInputStream fileInputStream2 = this.A02;
                if (fileInputStream2 == null) {
                    fileInputStream2 = AnonymousClass0x9.A0g(file2);
                    this.A02 = fileInputStream2;
                }
                int read = fileInputStream2.read(bArr, i, i2);
                long j = this.A00 + ((long) read);
                this.A00 = j;
                if (j >= length && (fileInputStream = this.A02) != null) {
                    fileInputStream.close();
                    this.A02 = null;
                }
                return read;
            } else {
                int read2 = this.A04.read(bArr, i, i2);
                this.A00 += (long) read2;
                return read2;
            }
        } else {
            throw AnonymousClass002.A0C("Mp4StreamCheckedDataSource/Mp4StreamCheck not initialized");
        }
    }

    public C1691388d(C55682qk r4, Mp4Ops mp4Ops, C153407bG r6, C54292oU r7, String str) {
        this.A06 = mp4Ops;
        this.A05 = r4;
        this.A08 = r7;
        this.A07 = r6;
        AnonymousClass88Z r0 = new AnonymousClass88Z(str);
        this.A04 = new C126876Pr(r0.A00, r0.A01);
        this.A09 = AnonymousClass002.A0A(r7.A00.getExternalCacheDir(), C18280x3.A0Y());
    }

    public /* synthetic */ Map BCF() {
        return Collections.emptyMap();
    }
}
