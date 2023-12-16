package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.36A  reason: invalid class name */
public class AnonymousClass36A {
    public static int A00(byte[] bArr) {
        return (bArr[2] & 255) | ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    public static byte[] A01(int i) {
        byte[] bArr = new byte[4];
        bArr[3] = (byte) i;
        bArr[2] = (byte) (i >> 8);
        bArr[1] = (byte) (i >> 16);
        bArr[0] = (byte) (i >> 24);
        return bArr;
    }

    public static byte[] A02(int i) {
        byte[] bArr = new byte[3];
        bArr[2] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[0] = (byte) (i >> 16);
        return bArr;
    }

    public static byte[][] A07(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = new byte[i2];
        byte[][] bArr4 = {bArr2, bArr3};
        System.arraycopy(bArr, i, bArr3, 0, i2);
        return bArr4;
    }

    public static byte[][] A08(byte[] bArr, int i, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0) {
            int i4 = i + i2;
            if (bArr.length >= i4 + i3) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i, bArr3, 0, i2);
                byte[] bArr4 = new byte[i3];
                byte[][] bArr5 = {bArr2, bArr3, bArr4};
                System.arraycopy(bArr, i4, bArr4, 0, i3);
                return bArr5;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Input too small: ");
        throw new ParseException(AnonymousClass000.A0X(C58012uZ.A00(bArr), A0o), 0);
    }

    public static byte[] A03(Object obj, Object obj2, byte[][] bArr, int i, int i2) {
        bArr[i] = obj;
        bArr[i2] = obj2;
        return A06(bArr);
    }

    public static byte[] A04(Object obj, byte[][] bArr, int i) {
        bArr[i] = obj;
        return A06(bArr);
    }

    public static byte[] A05(Collection collection) {
        try {
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A0e.write((byte[]) it.next());
            }
            return A0e.toByteArray();
        } catch (IOException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static byte[] A06(byte[]... bArr) {
        try {
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            for (byte[] write : bArr) {
                A0e.write(write);
            }
            return A0e.toByteArray();
        } catch (IOException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
