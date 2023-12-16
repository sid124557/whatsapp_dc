package X;

import java.util.concurrent.ThreadLocalRandom;

/* renamed from: X.7kv  reason: invalid class name and case insensitive filesystem */
public abstract class C158997kv {
    public static final C175688Zi A00 = new C175688Zi();
    public static final C158997kv A01;

    static {
        C158997kv r0;
        Integer num = AnonymousClass785.A00;
        if (num == null || num.intValue() >= 34) {
            r0 = new C175668Zg();
        } else {
            r0 = new C175658Zf();
        }
        A01 = r0;
    }

    public int A00() {
        if (this instanceof C175688Zi) {
            return A01.A00();
        }
        return ((C175678Zh) this).A07().nextInt();
    }

    public int A01(int i) {
        if (this instanceof C175688Zi) {
            return A01.A01(i);
        }
        return (((C175678Zh) this).A07().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    public int A02(int i) {
        if (this instanceof C175688Zi) {
            return A01.A02(i);
        }
        return ((C175678Zh) this).A07().nextInt(i);
    }

    public int A03(int i, int i2) {
        int A002;
        int i3;
        if (this instanceof C175668Zg) {
            return ThreadLocalRandom.current().nextInt(i, i2);
        }
        if (this instanceof C175688Zi) {
            return A01.A03(i, i2);
        }
        if (i2 > i) {
            int i4 = i2 - i;
            if (i4 > 0 || i4 == Integer.MIN_VALUE) {
                if (((-i4) & i4) == i4) {
                    i3 = A01(31 - Integer.numberOfLeadingZeros(i4));
                } else {
                    do {
                        A002 = A00() >>> 1;
                        i3 = A002 % i4;
                    } while ((A002 - i3) + (i4 - 1) < 0);
                }
                return i + i3;
            }
            while (true) {
                int A003 = A00();
                if (i <= A003 && A003 < i2) {
                    return A003;
                }
            }
        } else {
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Random range is empty: [");
            A0o.append(valueOf);
            AnonymousClass001.A1M(A0o);
            A0o.append(valueOf2);
            throw AnonymousClass000.A0F(").", A0o);
        }
    }

    public long A04() {
        if (this instanceof C175688Zi) {
            return A01.A04();
        }
        return ((C175678Zh) this).A07().nextLong();
    }

    public long A05() {
        if (this instanceof C175668Zg) {
            return ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
        }
        if (this instanceof C175688Zi) {
            return A01.A05();
        }
        return A06();
    }

    public long A06() {
        long A04;
        long j;
        int A002;
        if (this instanceof C175668Zg) {
            return ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE);
        }
        if (this instanceof C175688Zi) {
            return A01.A06();
        }
        if (((-Long.MAX_VALUE) & Long.MAX_VALUE) == Long.MAX_VALUE) {
            int i = (int) Long.MAX_VALUE;
            int i2 = (int) (Long.MAX_VALUE >>> 32);
            if (i != 0) {
                A002 = A01(31 - Integer.numberOfLeadingZeros(i));
            } else if (i2 == 1) {
                A002 = A00();
            } else {
                j = (((long) A01(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) A00()) & 4294967295L);
            }
            j = ((long) A002) & 4294967295L;
        } else {
            do {
                A04 = A04() >>> 1;
                j = A04 % Long.MAX_VALUE;
            } while ((A04 - j) + 9223372036854775806L < 0);
        }
        return 0 + j;
    }
}
