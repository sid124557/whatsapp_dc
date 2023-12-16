package X;

import android.net.Uri;
import com.whatsapp.Mp4Ops;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: X.81p  reason: invalid class name and case insensitive filesystem */
public class C1675781p implements C185788uF {
    public long A00 = 0;
    public C158207jb A01;
    public FileInputStream A02;
    public boolean A03;
    public final C187448xE A04;
    public final C55682qk A05;
    public final Mp4Ops A06;
    public final C153407bG A07;
    public final C54292oU A08;
    public final File A09;

    public void Awq(C184768sU r1) {
    }

    public Uri BE6() {
        return this.A04.BE6();
    }

    public long Bfw(C161387pX r24) {
        long j;
        C161387pX r5 = r24;
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
                byte[] bArr = r5.A08;
                r5 = new C161387pX(uri, new C160487ni(), r5.A06, bArr, r5.A00, length, length, -1);
            }
            j = 0;
        } else {
            if (j2 != 0) {
                Uri uri2 = r5.A04;
                byte[] bArr2 = r5.A08;
                r5 = new C161387pX(uri2, new C160487ni(), r5.A06, bArr2, r5.A00, 0, 0, -1);
            }
            j = 0;
        }
        long Bfw = j + this.A04.Bfw(r5);
        if (Bfw >= 0 && !this.A03) {
            C54292oU r3 = this.A08;
            Mp4Ops mp4Ops = this.A06;
            this.A01 = new C158207jb(this.A05, mp4Ops, this.A07, r3, this.A09, Bfw);
        }
        return Bfw;
    }

    public /* synthetic */ void cancel() {
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
                    throw AnonymousClass002.A0C("Mp4StreamCheckedHeroDataSource/Mp4StreamCheck not successful");
                }
            }
            File file2 = this.A09;
            long length = file2.length();
            if (length <= 0) {
                throw AnonymousClass002.A0C("Mp4StreamCheckedHeroDataSource/videoHeadForStreamCheck is empty");
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
            throw AnonymousClass002.A0C("Mp4StreamCheckedHeroDataSource/Mp4StreamCheck not initialized");
        }
    }

    public C1675781p(C55682qk r7, Mp4Ops mp4Ops, C153407bG r9, C54292oU r10, String str) {
        this.A06 = mp4Ops;
        this.A05 = r7;
        this.A08 = r10;
        this.A07 = r9;
        C1675481m r0 = new C1675481m(str);
        this.A04 = new AnonymousClass6KP(r0.A00, (C184768sU) null, r0.A01, 8000, 8000);
        this.A09 = AnonymousClass002.A0A(r10.A00.getExternalCacheDir(), C18280x3.A0Y());
    }
}
