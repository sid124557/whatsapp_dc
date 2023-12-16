package X;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.6Pm  reason: invalid class name and case insensitive filesystem */
public final class C126836Pm extends C1691088a {
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public C126836Pm() {
        super(false);
    }

    public void close() {
        this.A01 = null;
        try {
            RandomAccessFile randomAccessFile = this.A02;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
        } catch (IOException e) {
            throw new AnonymousClass6u0(e);
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
            throw th;
        }
    }

    public Uri BE6() {
        return this.A01;
    }

    public long Bfx(C157677ih r8) {
        Throwable th;
        try {
            Uri uri = r8.A04;
            this.A01 = uri;
            A01();
            try {
                String path = uri.getPath();
                path.getClass();
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
                this.A02 = randomAccessFile;
                long j = r8.A03;
                randomAccessFile.seek(j);
                long j2 = r8.A02;
                if (j2 == -1) {
                    j2 = this.A02.length() - j;
                }
                this.A00 = j2;
                if (j2 >= 0) {
                    this.A03 = true;
                    A03(r8);
                    return this.A00;
                }
                th = AnonymousClass6CA.A0M();
                throw th;
            } catch (FileNotFoundException e) {
                if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                    Object[] A1X = AnonymousClass0x9.A1X();
                    A1X[0] = uri.getPath();
                    A1X[1] = uri.getQuery();
                    A1X[2] = uri.getFragment();
                    th = new AnonymousClass6u0(e, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", A1X));
                } else {
                    th = new AnonymousClass6u0(e);
                }
            }
        } catch (IOException e2) {
            throw new AnonymousClass6u0(e2);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i, AnonymousClass6CA.A02(j, (long) i2));
            if (read <= 0) {
                return read;
            }
            this.A00 -= (long) read;
            A02(read);
            return read;
        } catch (IOException e) {
            throw new AnonymousClass6u0(e);
        }
    }
}
