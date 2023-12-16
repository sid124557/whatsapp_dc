package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.2rT  reason: invalid class name and case insensitive filesystem */
public class C56132rT {
    public int A00 = 0;
    public int A01 = 0;
    public final int A02;
    public final C380625j A03;
    public final C59182wU A04 = new C59182wU();
    public final C613230f A05;
    public final AnonymousClass2SH A06;
    public final C26071bX A07;

    public byte[] A06(int i) {
        if (i == 1) {
            AnonymousClass2SG r1 = this.A06.A05[this.A02];
            int i2 = r1.A00;
            return new byte[]{(byte) r1.A02, (byte) i2, (byte) (i2 >> 8)};
        }
        AnonymousClass2SG r2 = this.A06.A05[this.A02];
        int i3 = r2.A00;
        return new byte[]{(byte) r2.A02, (byte) i3, (byte) (i3 >> 8), (byte) r2.A05};
    }

    public final int A00() {
        if (this.A02 == this.A06.A01) {
            return this.A00;
        }
        throw AnonymousClass002.A0G("No event count available for rotated buffers");
    }

    public void A01() {
        C613230f r4 = this.A05;
        r4.A05.clear();
        r4.A01 = 0;
        r4.A06.reset();
        r4.A00 = 0;
        AnonymousClass2SG r2 = this.A06.A05[this.A02];
        r2.A01 = r4.A01;
        r2.A04 = 0;
        r2.A02 = 1;
        r2.A00 = 0;
        r2.A03 = r4.A00();
        this.A01 = 0;
        this.A00 = 0;
        this.A04.A00.clear();
    }

    public void A02() {
        try {
            C613230f r3 = this.A05;
            r3.A01();
            AnonymousClass2SG r2 = this.A06.A05[this.A02];
            r2.A01 = r3.A01;
            r2.A03 = r3.A00();
        } catch (IOException e) {
            C26071bX r1 = this.A07;
            r1.A0G = Boolean.TRUE;
            r1.A05();
            Log.e("eventbuffer/flushEventBuffers: cannot write event buffer", e);
            throw e;
        }
    }

    public void A03() {
        try {
            C613230f r4 = this.A05;
            AnonymousClass2SH r8 = this.A06;
            AnonymousClass2SG[] r3 = r8.A05;
            int i = this.A02;
            r4.A02(r3[i].A01);
            ByteBuffer byteBuffer = r4.A05;
            boolean z = true;
            Log.a(AnonymousClass000.A1U(byteBuffer.position(), r3[i].A01));
            if (r4.A01 != r3[i].A01) {
                z = false;
            }
            Log.a(z);
            int i2 = (r4.A00() > r3[i].A03 ? 1 : (r4.A00() == r3[i].A03 ? 0 : -1));
            boolean A1U = AnonymousClass000.A1U(i, r8.A01);
            if (i2 != 0) {
                C26071bX r1 = this.A07;
                Boolean bool = Boolean.TRUE;
                if (A1U) {
                    r1.A01 = bool;
                } else {
                    r1.A06 = bool;
                }
                throw new C375423a("Invalid checksum");
            } else if (A1U) {
                this.A01 = 0;
                this.A00 = 0;
                C59182wU r5 = this.A04;
                r5.A00.clear();
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                asReadOnlyBuffer.flip();
                if (asReadOnlyBuffer.limit() != 0) {
                    byte[][] bArr = C57832uH.A00;
                    int length = bArr.length;
                    int i3 = length - 1;
                    byte[] bArr2 = new byte[C57832uH.A00(i3).length];
                    try {
                        asReadOnlyBuffer.get(bArr2);
                        int i4 = 0;
                        while (i4 < length) {
                            if (!Arrays.equals(bArr2, bArr[i4])) {
                                i4++;
                            } else if (i4 < 0 || i4 > i3) {
                                throw new C375423a("Invalid event buffer header");
                            } else {
                                if (i4 >= 1) {
                                    asReadOnlyBuffer.get(A06(i4));
                                }
                                while (asReadOnlyBuffer.position() < asReadOnlyBuffer.limit()) {
                                    try {
                                        AnonymousClass2O5 A032 = C625335l.A03(asReadOnlyBuffer);
                                        this.A01++;
                                        int i5 = A032.A01;
                                        if (i5 == 1) {
                                            this.A00++;
                                        } else if (i5 == 0) {
                                            r5.A00(A032.A00, A032.A02);
                                        }
                                    } catch (C375523b e) {
                                        throw new C375423a(e.toString());
                                    }
                                }
                                return;
                            }
                        }
                        throw AnonymousClass002.A0E(AnonymousClass000.A0P(bArr2, "Invalid value: ", AnonymousClass001.A0o()));
                    } catch (BufferUnderflowException unused) {
                        throw new C375423a("Event buffer does not have a header");
                    }
                }
            }
        } catch (IOException e2) {
            throw new C375423a(e2.toString());
        }
    }

    public final void A04(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.A05.A05;
        if (byteBuffer.position() == 0) {
            byteBuffer.put(C57832uH.A00(2));
            AnonymousClass2SH r5 = this.A06;
            AnonymousClass2SG r4 = r5.A05[this.A02];
            int i2 = r5.A00 + 1;
            r5.A00 = i2;
            if (i2 > 65535) {
                r5.A00 = 1;
                i2 = 1;
            }
            r4.A00 = i2;
            byteBuffer.put(A06(2));
        }
        int min = Math.min(bArr.length, i);
        if (min <= byteBuffer.remaining()) {
            byteBuffer.put(bArr, 0, min);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Not enough space in the buffer lenToWrite = ");
        A0o.append(min);
        A0o.append(" remaining = ");
        throw new IndexOutOfBoundsException(AnonymousClass000.A0h(A0o, byteBuffer.remaining()));
    }

    public final boolean A05() {
        return AnonymousClass000.A1T(this.A05.A05.position());
    }

    public C56132rT(C380625j r5, AnonymousClass2SH r6, C26071bX r7, RandomAccessFile randomAccessFile, int i, int i2) {
        C613230f r2;
        int i3 = 65536;
        int i4 = (i * 65536) + 65536;
        if (i2 != 0) {
            if (i2 == 1) {
                i4 = (i * 16384) + 65536;
                i3 = 16384;
            } else {
                r2 = new C613230f(r7, randomAccessFile, (i * 32768) + 65536, 32768);
                this.A05 = r2;
                this.A02 = i;
                this.A06 = r6;
                this.A07 = r7;
                this.A03 = r5;
            }
        }
        r2 = new C613230f(r7, randomAccessFile, i4, i3);
        this.A05 = r2;
        this.A02 = i;
        this.A06 = r6;
        this.A07 = r7;
        this.A03 = r5;
    }
}
