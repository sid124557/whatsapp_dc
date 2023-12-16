package X;

import android.os.CancellationSignal;
import android.util.Base64;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;

/* renamed from: X.36H  reason: invalid class name */
public class AnonymousClass36H {
    public static final String A00;
    public static final byte[] A01 = Base64.decode("f84Z7HXNlLvU8vledkRkLCXBWB16jaE3gyDeRPPkwtQ=", 2);

    public static void A06(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        CipherInputStream cipherInputStream;
        try {
            byte[] A012 = AnonymousClass29O.A01(16);
            Cipher A0v = C18320x8.A0v();
            A0v.init(1, C18300x5.A0y(bArr), C18330xA.A0D(A012));
            cipherInputStream = new CipherInputStream(inputStream, A0v);
            outputStream.write(A012);
            C627536m.A0I(cipherInputStream, outputStream);
            cipherInputStream.close();
            return;
        } catch (GeneralSecurityException e) {
            throw new C36811zv("Failed to encrypt stream", e, 1);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static C619432w A00(CancellationSignal cancellationSignal, InputStream inputStream) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        try {
            byte[] bArr = new byte[16];
            if (inputStream.read(bArr) != -1) {
                return new C619432w(ByteBuffer.wrap(bArr, 0, 4).getInt(), ByteBuffer.wrap(bArr, 4, 8).getLong(), ByteBuffer.wrap(bArr, 12, 4).getInt());
            }
            throw AnonymousClass002.A0C("No bytes to read");
        } catch (SocketException unused) {
            throw new C36811zv();
        }
    }

    public static void A02(CancellationSignal cancellationSignal, C619432w r4, OutputStream outputStream) {
        FileInputStream A0g;
        if (cancellationSignal != null) {
            try {
                cancellationSignal.throwIfCanceled();
            } catch (SocketException unused) {
                throw new C36811zv();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putInt(r4.A01);
        allocate.putLong(4, r4.A02);
        allocate.putInt(12, r4.A00);
        outputStream.write(allocate.array());
        outputStream.flush();
        if (r4 instanceof C28331gf) {
            C28331gf r42 = (C28331gf) r4;
            A0g = AnonymousClass0x9.A0g(r42.A00);
            byte[] bArr = r42.A03;
            if (bArr != null) {
                A06(A0g, outputStream, bArr);
            } else {
                C627536m.A0I(A0g, outputStream);
            }
            outputStream.flush();
            A0g.close();
            return;
        } else if (r4 instanceof C28321ge) {
            C28321ge r43 = (C28321ge) r4;
            byte[] bArr2 = r43.A03;
            if (bArr2 != null) {
                A06(AnonymousClass0x9.A0d(r43.A00), outputStream, bArr2);
            } else {
                outputStream.write(r43.A00);
            }
            outputStream.flush();
            return;
        } else {
            return;
        }
        throw th;
    }

    public static void A04(C28901hx r3, Exception exc) {
        int i;
        if (exc instanceof C83914Ah) {
            i = ((C83914Ah) exc).B9k();
            C18260x0.A0y("fpm/TransferUtils/error code received during transfer: ", AnonymousClass001.A0o(), i);
        } else {
            Log.e("fpm/TransferUtils/failure during transfer process: ", exc);
            i = 1;
        }
        r3.A0A(i, exc.getMessage());
    }

    public static void A05(C84134Bd r5, InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        IOException th;
        try {
            byte[] bArr2 = new byte[16];
            if (inputStream.read(bArr2) != -1) {
                Cipher A0v = C18320x8.A0v();
                A0v.init(2, C18300x5.A0y(bArr), C18330xA.A0D(bArr2));
                CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, A0v);
                if (r5 != null) {
                    try {
                        byte[] bArr3 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                        while (true) {
                            int read = inputStream.read(bArr3);
                            if (read >= 0) {
                                cipherOutputStream.write(bArr3, 0, read);
                                r5.AwB(AnonymousClass0x9.A0m(read));
                            }
                        }
                        cipherOutputStream.close();
                        return;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                } else {
                    C627536m.A0I(inputStream, cipherOutputStream);
                }
                cipherOutputStream.close();
                return;
            }
            th = AnonymousClass002.A0C("No bytes to read");
            throw th;
        } catch (GeneralSecurityException e) {
            throw new C36811zv("Failed to decrypt stream", e, 105);
        }
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("msgstore.dbcrypt");
        A00 = AnonymousClass000.A0h(A0o, AnonymousClass22O.UNENCRYPTED.version);
    }

    public static void A01(long j, long j2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fpm/TransferUtils/");
        A0o.append(j);
        A0o.append(" bytes transferred in ");
        A0o.append(j2);
        A0o.append(" ms. This is a transfer rate of ");
        AnonymousClass0x9.A1M(A0o, j * 8 * 1000, j2 * SearchActionVerificationClientService.MS_TO_NS);
        C18260x0.A1J(A0o, " Mbps.");
    }

    public static void A03(CancellationSignal cancellationSignal, C84134Bd r2, File file, InputStream inputStream, byte[] bArr, long j) {
        FileOutputStream A0h;
        cancellationSignal.throwIfCanceled();
        try {
            C140706uL r1 = new C140706uL(inputStream, j);
            if (bArr != null) {
                A0h = AnonymousClass0x9.A0h(file);
                A05(r2, r1, A0h, bArr);
                A0h.close();
                return;
            }
            C627536m.A0S(file, r1, j);
            return;
        } catch (SocketException unused) {
            throw new C36811zv();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
