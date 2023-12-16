package X;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: X.7d4  reason: invalid class name and case insensitive filesystem */
public class C154377d4 {
    public static byte[] A00(byte[] bArr) {
        if (bArr != null) {
            try {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b = wrap.get();
                byte[] bArr2 = new byte[3];
                wrap.get(bArr2);
                int A01 = C162257rX.A01(bArr2);
                byte[] bArr3 = new byte[A01];
                wrap.get(bArr3);
                if (C100745Cc.A00.contains(Byte.valueOf(b)) && A01 <= 16777215) {
                    return bArr3;
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Received an invalid handshake - type ");
                A0o.append(b);
                throw C143806zV.A01(AnonymousClass000.A0Y(" len ", A0o, A01), (byte) 80);
            } catch (BufferUnderflowException e) {
                throw C143806zV.A02("Invalid handshake message", e, (byte) 80);
            }
        } else {
            throw C143806zV.A01("Illegal argument - handshake is null", (byte) 80);
        }
    }

    public static byte[] A01(byte[] bArr, byte b) {
        int length;
        if (!C100745Cc.A00.contains(Byte.valueOf(b)) || bArr == null || (length = bArr.length) > 16777215) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Illegal arguments -  type ");
            A0o.append(b);
            throw C143806zV.A00(AnonymousClass000.A0Y(" msg is null or bigger than", A0o, 16777215));
        }
        ByteBuffer allocate = ByteBuffer.allocate(length + 4);
        allocate.put(b);
        allocate.put(C162257rX.A07(length));
        allocate.put(bArr);
        return allocate.array();
    }
}
