package X;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: X.6W5  reason: invalid class name */
public final class AnonymousClass6W5 extends C153747bt {
    public final void A0E(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
    }

    public final void A07(long j, byte b) {
        Memory.pokeByte(j, b);
    }

    public AnonymousClass6W5(Unsafe unsafe) {
        super(unsafe);
    }
}
