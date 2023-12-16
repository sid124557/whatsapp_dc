package X;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: X.6W4  reason: invalid class name */
public final class AnonymousClass6W4 extends C153747bt {
    public final void A07(long j, byte b) {
        Memory.pokeByte((int) (j & -1), b);
    }

    public final void A0E(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
    }

    public AnonymousClass6W4(Unsafe unsafe) {
        super(unsafe);
    }
}
