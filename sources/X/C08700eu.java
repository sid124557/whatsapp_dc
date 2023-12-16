package X;

import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: X.0eu  reason: invalid class name and case insensitive filesystem */
public final class C08700eu implements C17420vV, C16680tn {
    public static final TreeMap A08 = new TreeMap();
    public int A00;
    public final int A01;
    public final double[] A02;
    public final int[] A03;
    public final long[] A04;
    public final String[] A05;
    public final byte[][] A06;
    public volatile String A07;

    public void Axp(int i, byte[] bArr) {
        C162457s7.A0J(bArr, 1);
        this.A03[i] = 5;
        this.A06[i] = bArr;
    }

    public void Axu(int i, String str) {
        C162457s7.A0J(str, 1);
        this.A03[i] = 4;
        this.A05[i] = str;
    }

    public static final void A00() {
        TreeMap treeMap = A08;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            C162457s7.A0D(it);
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void A01() {
        TreeMap treeMap = A08;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.A01), this);
            A00();
        }
    }

    public void Axr(int i, double d) {
        this.A03[i] = 3;
        this.A02[i] = d;
    }

    public void Axs(int i, long j) {
        this.A03[i] = 2;
        this.A04[i] = j;
    }

    public void Axt(int i) {
        this.A03[i] = 1;
    }

    public void Axv(C17420vV r7) {
        int i = this.A00;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                int i3 = this.A03[i2];
                if (i3 == 1) {
                    r7.Axt(i2);
                } else if (i3 == 2) {
                    r7.Axs(i2, this.A04[i2]);
                } else if (i3 == 3) {
                    r7.Axr(i2, this.A02[i2]);
                } else if (i3 == 4) {
                    String str = this.A05[i2];
                    if (str != null) {
                        r7.Axu(i2, str);
                    } else {
                        throw AnonymousClass001.A0c("Required value was null.");
                    }
                } else if (i3 == 5) {
                    byte[] bArr = this.A06[i2];
                    if (bArr != null) {
                        r7.Axp(i2, bArr);
                    } else {
                        throw AnonymousClass001.A0c("Required value was null.");
                    }
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public String BDC() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        throw AnonymousClass001.A0e("Required value was null.");
    }

    public void close() {
    }

    public C08700eu(int i) {
        this.A01 = i;
        int i2 = i + 1;
        this.A03 = new int[i2];
        this.A04 = new long[i2];
        this.A02 = new double[i2];
        this.A05 = new String[i2];
        this.A06 = new byte[i2][];
    }
}
