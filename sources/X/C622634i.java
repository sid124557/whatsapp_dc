package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;

/* renamed from: X.34i  reason: invalid class name and case insensitive filesystem */
public class C622634i {
    public Cipher A00;
    public Cipher A01;
    public Cipher A02;
    public Cipher A03;
    public Cipher A04;
    public Cipher A05;
    public boolean A06;

    public synchronized OutputStream A01(AnonymousClass22O r3, OutputStream outputStream, byte[] bArr, byte[] bArr2) {
        DeflaterOutputStream deflaterOutputStream;
        A04();
        int ordinal = r3.ordinal();
        if (ordinal == 1) {
            deflaterOutputStream = C18310x6.A0u(A00(outputStream, this.A03, bArr, bArr2));
        } else if (ordinal == 3) {
            deflaterOutputStream = C18310x6.A0u(A00(outputStream, this.A04, bArr, bArr2));
        } else if (ordinal == 4) {
            deflaterOutputStream = C18310x6.A0u(A00(outputStream, this.A05, bArr, bArr2));
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unexpected key selector (");
            A0o.append(r3);
            throw AnonymousClass000.A0F(")", A0o);
        }
        return deflaterOutputStream;
    }

    public synchronized ZipInputStream A02(AnonymousClass22O r3, InputStream inputStream, AtomicLong atomicLong, byte[] bArr, byte[] bArr2) {
        ZipInputStream zipInputStream;
        int ordinal = r3.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 0) {
                        throw AnonymousClass000.A0E(r3, "unsupported key selector ", AnonymousClass001.A0o());
                    }
                    zipInputStream = new ZipInputStream(inputStream);
                } else if (!(bArr == null || bArr2 == null)) {
                    A04();
                    Cipher cipher = this.A02;
                    C18290x4.A1S(C18300x5.A0y(bArr), cipher, bArr2);
                    zipInputStream = new ZipInputStream(new C73533ff(inputStream, atomicLong, cipher));
                }
            }
            if (!(bArr == null || bArr2 == null)) {
                A04();
                Cipher cipher2 = this.A01;
                C18290x4.A1S(C18300x5.A0y(bArr), cipher2, bArr2);
                zipInputStream = new ZipInputStream(new C73533ff(inputStream, atomicLong, cipher2));
            }
        }
        if (!(bArr == null || bArr2 == null)) {
            A04();
            Cipher cipher3 = this.A00;
            C18290x4.A1S(C18300x5.A0y(bArr), cipher3, bArr2);
            zipInputStream = new ZipInputStream(new C73533ff(inputStream, atomicLong, cipher3));
        }
        zipInputStream = new ZipInputStream(inputStream);
        return zipInputStream;
    }

    public synchronized ZipOutputStream A03(AnonymousClass22O r3, OutputStream outputStream, byte[] bArr, byte[] bArr2) {
        ZipOutputStream zipOutputStream;
        int ordinal = r3.ordinal();
        if (ordinal == 1) {
            A04();
            zipOutputStream = new ZipOutputStream(A00(outputStream, this.A03, bArr, bArr2));
        } else if (ordinal == 3) {
            A04();
            zipOutputStream = new ZipOutputStream(A00(outputStream, this.A04, bArr, bArr2));
        } else if (ordinal == 4) {
            A04();
            zipOutputStream = new ZipOutputStream(A00(outputStream, this.A05, bArr, bArr2));
        } else if (ordinal == 0) {
            zipOutputStream = new ZipOutputStream(outputStream);
        } else {
            throw AnonymousClass000.A0E(r3, "unsupported key selector ", AnonymousClass001.A0o());
        }
        return zipOutputStream;
    }

    public final synchronized void A04() {
        if (!this.A06) {
            this.A03 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A00 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A04 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A01 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A05 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A02 = Cipher.getInstance("AES/GCM/NoPadding");
            this.A06 = true;
        }
    }

    public static final CipherOutputStream A00(OutputStream outputStream, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(1, C18300x5.A0y(bArr), C18330xA.A0D(bArr2));
        return new CipherOutputStream(outputStream, cipher);
    }

    public void A05(AnonymousClass22O r13, AnonymousClass4BZ r14, InputStream inputStream, OutputStream outputStream, byte[] bArr, byte[] bArr2, int i, int i2, long j) {
        InflaterInputStream inflaterInputStream;
        A04();
        AtomicLong atomicLong = new AtomicLong();
        synchronized (this) {
            int ordinal = r13.ordinal();
            byte[] bArr3 = bArr2;
            if (ordinal == 1) {
                Cipher cipher = this.A00;
                C18290x4.A1S(C18300x5.A0y(bArr), cipher, bArr3);
                inflaterInputStream = new InflaterInputStream(new C73533ff(inputStream, atomicLong, cipher));
            } else if (ordinal == 3) {
                Cipher cipher2 = this.A01;
                C18290x4.A1S(C18300x5.A0y(bArr), cipher2, bArr3);
                inflaterInputStream = new InflaterInputStream(new C73533ff(inputStream, atomicLong, cipher2));
            } else if (ordinal == 4) {
                Cipher cipher3 = this.A02;
                C18290x4.A1S(C18300x5.A0y(bArr), cipher3, bArr3);
                inflaterInputStream = new InflaterInputStream(new C73533ff(inputStream, atomicLong, cipher3));
            } else {
                throw AnonymousClass000.A0E(r13, "unsupported key selector ", AnonymousClass001.A0o());
            }
        }
        try {
            byte[] bArr4 = new byte[AnonymousClass35S.A0F];
            while (true) {
                int read = inflaterInputStream.read(bArr4);
                if (read >= 0) {
                    outputStream.write(bArr4, 0, read);
                    AnonymousClass4BZ r5 = r14;
                    if (r14 != null) {
                        int i3 = i2;
                        if (i2 > 0) {
                            r5.Bez(i, i3, atomicLong.get(), j);
                        }
                    }
                } else {
                    inflaterInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
