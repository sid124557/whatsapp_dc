package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Q9  reason: invalid class name */
public final class AnonymousClass0Q9 {
    public Map A00 = AnonymousClass001.A0t();

    public AnonymousClass0Xq A00() {
        AnonymousClass0Xq r0 = new AnonymousClass0Xq(this.A00);
        AnonymousClass0Xq.A01(r0);
        return r0;
    }

    public void A01(String str, int i) {
        this.A00.put(str, Integer.valueOf(i));
    }

    public void A02(String str, int[] iArr) {
        Map map = this.A00;
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            AnonymousClass000.A1P(numArr, iArr[i], i);
        }
        map.put(str, numArr);
    }

    public void A03(Map map) {
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String str = (String) A0w.getKey();
            Object value = A0w.getValue();
            if (value == null) {
                this.A00.put(str, (Object) null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.A00.put(str, value);
                } else if (cls == boolean[].class) {
                    Map map2 = this.A00;
                    boolean[] zArr = (boolean[]) value;
                    int length = zArr.length;
                    Boolean[] boolArr = new Boolean[length];
                    for (int i = 0; i < length; i++) {
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                    map2.put(str, boolArr);
                } else if (cls == byte[].class) {
                    Map map3 = this.A00;
                    byte[] bArr = (byte[]) value;
                    int length2 = bArr.length;
                    Byte[] bArr2 = new Byte[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        bArr2[i2] = Byte.valueOf(bArr[i2]);
                    }
                    map3.put(str, bArr2);
                } else if (cls == int[].class) {
                    Map map4 = this.A00;
                    int[] iArr = (int[]) value;
                    int length3 = iArr.length;
                    Integer[] numArr = new Integer[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        AnonymousClass000.A1P(numArr, iArr[i3], i3);
                    }
                    map4.put(str, numArr);
                } else if (cls == long[].class) {
                    Map map5 = this.A00;
                    long[] jArr = (long[]) value;
                    int length4 = jArr.length;
                    Long[] lArr = new Long[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        AnonymousClass000.A1Q(lArr, i4, jArr[i4]);
                    }
                    map5.put(str, lArr);
                } else if (cls == float[].class) {
                    Map map6 = this.A00;
                    float[] fArr = (float[]) value;
                    int length5 = fArr.length;
                    Float[] fArr2 = new Float[length5];
                    for (int i5 = 0; i5 < length5; i5++) {
                        AnonymousClass001.A1P(fArr2, fArr[i5], i5);
                    }
                    map6.put(str, fArr2);
                } else if (cls == double[].class) {
                    Map map7 = this.A00;
                    double[] dArr = (double[]) value;
                    int length6 = dArr.length;
                    Double[] dArr2 = new Double[length6];
                    for (int i6 = 0; i6 < length6; i6++) {
                        dArr2[i6] = Double.valueOf(dArr[i6]);
                    }
                    map7.put(str, dArr2);
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Key ");
                    A0o.append(str);
                    throw AnonymousClass000.A0E(cls, "has invalid type ", A0o);
                }
            }
        }
    }
}
