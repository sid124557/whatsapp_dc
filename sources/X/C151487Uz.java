package X;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import javax.net.ssl.SSLException;

/* renamed from: X.7Uz  reason: invalid class name and case insensitive filesystem */
public abstract class C151487Uz {
    public synchronized void A01(byte[] bArr, int i, int i2, byte b) {
        C143806zV r0;
        if (bArr == null) {
            r0 = C143806zV.A01("Data cannot be null", (byte) 80);
        } else if (!C100735Cb.A00.contains(Byte.valueOf(b))) {
            r0 = C143806zV.A01("Invalid content type", (byte) 80);
        } else {
            while (i2 > 16384) {
                A00(bArr, i, 16384, b);
                i += 16384;
                i2 -= 16384;
            }
            if (i2 > 0) {
                A00(bArr, i, i2, b);
            }
        }
        throw r0;
    }

    public void A00(byte[] bArr, int i, int i2, byte b) {
        short s;
        byte b2 = b;
        if (this instanceof AnonymousClass6n5) {
            AnonymousClass6n5 r5 = (AnonymousClass6n5) this;
            try {
                ByteBuffer allocate = ByteBuffer.allocate(i2 + 5);
                allocate.put(b2);
                if (b2 != 22 || r5.A01) {
                    s = 771;
                } else {
                    r5.A01 = true;
                    s = 769;
                }
                allocate.putShort(s);
                C162257rX.A05(i2, allocate);
                allocate.put(bArr, i, i2);
                r5.A00.write(allocate.array());
            } catch (SocketException | SocketTimeoutException e) {
                throw new C143806zV(new SSLException(e), (byte) 80, true);
            } catch (IOException e2) {
                throw C143806zV.A03(e2);
            }
        } else {
            C136686n6 r7 = (C136686n6) this;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
            ByteBuffer allocate2 = ByteBuffer.allocate(copyOfRange.length + 1);
            allocate2.put(copyOfRange);
            allocate2.put(b2);
            allocate2.put(new byte[0]);
            byte[] array = allocate2.array();
            ByteBuffer allocate3 = ByteBuffer.allocate(5);
            allocate3.put((byte) 23);
            allocate3.putShort(771);
            int length = array.length;
            C179528jI r11 = r7.A01;
            synchronized (AnonymousClass2BZ.class) {
                if (AnonymousClass2BZ.A00 == null) {
                    AnonymousClass2BZ.A00 = new AnonymousClass2BZ();
                }
            }
            C162257rX.A05(length + 16, allocate3);
            long j = r7.A00;
            byte[] array2 = allocate3.array();
            C171548Hm r112 = (C171548Hm) r11;
            try {
                r112.A00.init(1, r112.A01, new GCMParameterSpec(128, C171538Hl.A00(r112.A02, j)));
                r112.A00.updateAAD(array2);
                byte[] doFinal = r112.A00.doFinal(array, 0, length);
                r7.A00++;
                try {
                    ByteBuffer allocate4 = ByteBuffer.allocate(doFinal.length + 5);
                    allocate4.put(allocate3.array());
                    allocate4.put(doFinal);
                    r7.A02.write(allocate4.array());
                } catch (SocketException | SocketTimeoutException e3) {
                    throw new C143806zV(new SSLException(e3), (byte) 80, true);
                } catch (IOException e4) {
                    throw C143806zV.A03(e4);
                }
            } catch (BadPaddingException e5) {
                throw C143806zV.A02("Bad padding", e5, (byte) 80);
            } catch (IllegalBlockSizeException e6) {
                throw C143806zV.A02("Illegal block size ", e6, (byte) 80);
            } catch (InvalidAlgorithmParameterException e7) {
                throw C143806zV.A02("Invalid Algorithm Params", e7, (byte) 80);
            } catch (InvalidKeyException e8) {
                throw C143806zV.A02(" Invalid Key", e8, (byte) 80);
            }
        }
    }
}
