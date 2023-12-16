package X;

import android.util.Log;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* renamed from: X.7oY  reason: invalid class name and case insensitive filesystem */
public final class C160877oY {
    public static long A01(C188158yR r1, ByteBuffer byteBuffer, long j) {
        A02(r1, byteBuffer, 4, j);
        return AnonymousClass6C8.A0M(byteBuffer.getInt());
    }

    public static void A02(C188158yR r3, ByteBuffer byteBuffer, int i, long j) {
        int BiE;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (BiE = r3.BiE(byteBuffer, j)) != -1) {
            j += (long) BiE;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new AnonymousClass8RG("ELF file truncated");
    }

    public static long A00(C188158yR r1, ByteBuffer byteBuffer, long j) {
        A02(r1, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    public static String[] A03(C188158yR r4) {
        if (!(r4 instanceof C1682584s)) {
            return A04(r4);
        }
        C1682584s r42 = (C1682584s) r4;
        int i = 0;
        while (true) {
            try {
                return A04(r42);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i <= 4) {
                    Thread.interrupted();
                    Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                    FileInputStream A0g = AnonymousClass0x9.A0g(r42.A00);
                    r42.A01 = A0g;
                    r42.A02 = A0g.getChannel();
                } else {
                    throw e;
                }
            }
        }
    }

    public static String[] A04(C188158yR r31) {
        long A00;
        int i;
        long j;
        long j2;
        long A002;
        long A003;
        long j3;
        long j4;
        long j5;
        long j6;
        long A004;
        long A005;
        long j7;
        long A006;
        long A007;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        C188158yR r9 = r31;
        long A01 = A01(r9, allocate, 0);
        if (A01 == 1179403647) {
            A02(r9, allocate, 1, 4);
            boolean A1M = AnonymousClass6C9.A1M((short) AnonymousClass6CA.A07(allocate));
            A02(r9, allocate, 1, 5);
            if (((short) AnonymousClass6CA.A07(allocate)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (A1M) {
                A00 = A01(r9, allocate, 28);
                i = 2;
                A02(r9, allocate, 2, 44);
                j = (long) (allocate.getShort() & 65535);
                j2 = 42;
            } else {
                A00 = A00(r9, allocate, 32);
                i = 2;
                A02(r9, allocate, 2, 56);
                j = (long) (allocate.getShort() & 65535);
                j2 = 54;
            }
            A02(r9, allocate, i, j2);
            short s = allocate.getShort() & 65535;
            if (j == 65535) {
                if (A1M) {
                    A007 = A01(r9, allocate, 32) + 28;
                } else {
                    A007 = A00(r9, allocate, 40) + 44;
                }
                j = A01(r9, allocate, A007);
            }
            long j8 = A00;
            long j9 = 0;
            while (true) {
                if (j9 >= j) {
                    break;
                } else if (A01(r9, allocate, j8 + 0) == 2) {
                    if (A1M) {
                        A002 = A01(r9, allocate, j8 + 4);
                    } else {
                        A002 = A00(r9, allocate, j8 + 8);
                    }
                    if (A002 != 0) {
                        long j10 = A002;
                        long j11 = 0;
                        int i2 = 0;
                        do {
                            long j12 = j10 + 0;
                            if (A1M) {
                                A003 = A01(r9, allocate, j12);
                            } else {
                                A003 = A00(r9, allocate, j12);
                            }
                            if (A003 == 1) {
                                if (i2 != Integer.MAX_VALUE) {
                                    i2++;
                                } else {
                                    throw new AnonymousClass8RG("malformed DT_NEEDED section");
                                }
                            } else if (A003 == 5) {
                                if (A1M) {
                                    j11 = A01(r9, allocate, j10 + 4);
                                } else {
                                    j11 = A00(r9, allocate, j10 + 8);
                                }
                            }
                            j3 = 16;
                            if (A1M) {
                                j4 = 8;
                            } else {
                                j4 = 16;
                            }
                            j10 += j4;
                        } while (A003 != 0);
                        if (j11 != 0) {
                            int i3 = 0;
                            while (true) {
                                if (((long) i3) >= j) {
                                    break;
                                }
                                if (A01(r9, allocate, A00 + 0) == 1) {
                                    if (A1M) {
                                        j5 = A01(r9, allocate, A00 + 8);
                                        j6 = A01(r9, allocate, A00 + 20);
                                    } else {
                                        A02(r9, allocate, 8, A00 + j3);
                                        j5 = allocate.getLong();
                                        A02(r9, allocate, 8, A00 + 40);
                                        j6 = allocate.getLong();
                                    }
                                    if (j5 <= j11 && j11 < j6 + j5) {
                                        if (A1M) {
                                            A004 = A01(r9, allocate, A00 + 4);
                                        } else {
                                            A004 = A00(r9, allocate, A00 + 8);
                                        }
                                        long j13 = A004 + (j11 - j5);
                                        if (j13 != 0) {
                                            String[] strArr = new String[i2];
                                            int i4 = 0;
                                            do {
                                                long j14 = A002 + 0;
                                                if (A1M) {
                                                    A005 = A01(r9, allocate, j14);
                                                } else {
                                                    A005 = A00(r9, allocate, j14);
                                                }
                                                if (A005 == 1) {
                                                    if (A1M) {
                                                        A006 = A01(r9, allocate, A002 + 4);
                                                    } else {
                                                        A006 = A00(r9, allocate, A002 + 8);
                                                    }
                                                    long j15 = A006 + j13;
                                                    StringBuilder A0o = AnonymousClass001.A0o();
                                                    while (true) {
                                                        long j16 = 1 + j15;
                                                        A02(r9, allocate, 1, j15);
                                                        short A07 = (short) AnonymousClass6CA.A07(allocate);
                                                        if (A07 == 0) {
                                                            break;
                                                        }
                                                        A0o.append((char) A07);
                                                        j15 = j16;
                                                    }
                                                    AnonymousClass0x7.A1E(A0o, strArr, i4);
                                                    if (i4 != Integer.MAX_VALUE) {
                                                        i4++;
                                                    } else {
                                                        throw new AnonymousClass8RG("malformed DT_NEEDED section");
                                                    }
                                                }
                                                if (A1M) {
                                                    j7 = 8;
                                                } else {
                                                    j7 = 16;
                                                }
                                                A002 += j7;
                                            } while (A005 != 0);
                                            if (i4 == i2) {
                                                return strArr;
                                            }
                                            throw new AnonymousClass8RG("malformed DT_NEEDED section");
                                        }
                                    }
                                }
                                A00 += (long) s;
                                i3++;
                                j3 = 16;
                            }
                            throw new AnonymousClass8RG("did not find file offset of DT_STRTAB table");
                        }
                        throw new AnonymousClass8RG("Dynamic section string-table not found");
                    }
                } else {
                    j8 += (long) s;
                    j9++;
                }
            }
            throw new AnonymousClass8RG("ELF file does not contain dynamic linking information");
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("file is not ELF: 0x");
        throw new AnonymousClass8RG(AnonymousClass000.A0X(Long.toHexString(A01), A0o2));
    }
}
