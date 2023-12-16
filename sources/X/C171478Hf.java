package X;

import java.io.DataOutputStream;

/* renamed from: X.8Hf  reason: invalid class name and case insensitive filesystem */
public class C171478Hf implements C186378vD {
    public final C186378vD A00;
    public final DataOutputStream A01;

    public boolean BFT() {
        return this.A00.BFT();
    }

    public void BiI(byte[] bArr) {
        this.A00.BiI(bArr);
        this.A01.write(bArr);
    }

    public long Bj0() {
        return this.A00.Bj0();
    }

    public void Bn0(long j) {
        BiI(new byte[((int) (j - this.A00.position()))]);
    }

    public void close() {
        this.A00.close();
        this.A01.close();
    }

    public long position() {
        return this.A00.position();
    }

    public byte readByte() {
        byte readByte = this.A00.readByte();
        this.A01.write(readByte);
        return readByte;
    }

    public int readInt() {
        int readInt = this.A00.readInt();
        this.A01.writeInt(readInt);
        return readInt;
    }

    public long readLong() {
        long readLong = this.A00.readLong();
        this.A01.writeLong(readLong);
        return readLong;
    }

    public short readShort() {
        short readShort = this.A00.readShort();
        this.A01.writeShort(readShort);
        return readShort;
    }

    public C171478Hf(C186378vD r1, DataOutputStream dataOutputStream) {
        this.A00 = r1;
        this.A01 = dataOutputStream;
    }
}
