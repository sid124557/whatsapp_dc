package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.8UD  reason: invalid class name */
public class AnonymousClass8UD extends AnonymousClass70R {
    public static final boolean A08(Object[] objArr, Object[] objArr2) {
        int length;
        boolean equals;
        if (objArr != objArr2) {
            if (!(objArr == null || objArr2 == null || (length = objArr.length) != objArr2.length)) {
                for (int i = 0; i < length; i++) {
                    Object[] objArr3 = objArr[i];
                    Object[] objArr4 = objArr2[i];
                    if (objArr3 != objArr4) {
                        if (!(objArr3 == null || objArr4 == null)) {
                            if ((objArr3 instanceof Object[]) && (objArr4 instanceof Object[])) {
                                equals = A08(objArr3, objArr4);
                            } else if ((objArr3 instanceof byte[]) && (objArr4 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) objArr3, (byte[]) objArr4);
                            } else if ((objArr3 instanceof short[]) && (objArr4 instanceof short[])) {
                                equals = Arrays.equals((short[]) objArr3, (short[]) objArr4);
                            } else if ((objArr3 instanceof int[]) && (objArr4 instanceof int[])) {
                                equals = Arrays.equals((int[]) objArr3, (int[]) objArr4);
                            } else if ((objArr3 instanceof long[]) && (objArr4 instanceof long[])) {
                                equals = Arrays.equals((long[]) objArr3, (long[]) objArr4);
                            } else if ((objArr3 instanceof float[]) && (objArr4 instanceof float[])) {
                                equals = Arrays.equals((float[]) objArr3, (float[]) objArr4);
                            } else if ((objArr3 instanceof double[]) && (objArr4 instanceof double[])) {
                                equals = Arrays.equals((double[]) objArr3, (double[]) objArr4);
                            } else if ((objArr3 instanceof char[]) && (objArr4 instanceof char[])) {
                                equals = Arrays.equals((char[]) objArr3, (char[]) objArr4);
                            } else if ((objArr3 instanceof boolean[]) && (objArr4 instanceof boolean[])) {
                                equals = Arrays.equals((boolean[]) objArr3, (boolean[]) objArr4);
                            } else if ((objArr3 instanceof AnonymousClass8ND) && (objArr4 instanceof AnonymousClass8ND)) {
                                equals = Arrays.equals(((AnonymousClass8ND) objArr3).A00, ((AnonymousClass8ND) objArr4).A00);
                            } else if ((objArr3 instanceof AnonymousClass8NG) && (objArr4 instanceof AnonymousClass8NG)) {
                                equals = Arrays.equals(((AnonymousClass8NG) objArr3).A00, ((AnonymousClass8NG) objArr4).A00);
                            } else if ((objArr3 instanceof AnonymousClass8NE) && (objArr4 instanceof AnonymousClass8NE)) {
                                equals = Arrays.equals(((AnonymousClass8NE) objArr3).A00, ((AnonymousClass8NE) objArr4).A00);
                            } else if (!(objArr3 instanceof AnonymousClass8NF) || !(objArr4 instanceof AnonymousClass8NF)) {
                                equals = objArr3.equals(objArr4);
                            } else {
                                equals = Arrays.equals(((AnonymousClass8NF) objArr3).A00, ((AnonymousClass8NF) objArr4).A00);
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final void A07(StringBuilder sb, List list, Object[] objArr) {
        String obj;
        Iterable r7;
        if (list.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        list.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                AnonymousClass001.A1M(sb);
            }
            Object[] objArr2 = objArr[i];
            if (objArr2 == null) {
                obj = "null";
            } else if (objArr2 instanceof Object[]) {
                A07(sb, list, objArr2);
            } else {
                if (objArr2 instanceof byte[]) {
                    obj = Arrays.toString((byte[]) objArr2);
                } else if (objArr2 instanceof short[]) {
                    obj = Arrays.toString((short[]) objArr2);
                } else if (objArr2 instanceof int[]) {
                    obj = Arrays.toString((int[]) objArr2);
                } else if (objArr2 instanceof long[]) {
                    obj = Arrays.toString((long[]) objArr2);
                } else if (objArr2 instanceof float[]) {
                    obj = Arrays.toString((float[]) objArr2);
                } else if (objArr2 instanceof double[]) {
                    obj = Arrays.toString((double[]) objArr2);
                } else if (objArr2 instanceof char[]) {
                    obj = Arrays.toString((char[]) objArr2);
                } else if (objArr2 instanceof boolean[]) {
                    obj = Arrays.toString((boolean[]) objArr2);
                } else {
                    if (objArr2 instanceof AnonymousClass8ND) {
                        r7 = new AnonymousClass8ND(((AnonymousClass8ND) objArr2).A00);
                    } else if (objArr2 instanceof AnonymousClass8NG) {
                        r7 = new AnonymousClass8NG(((AnonymousClass8NG) objArr2).A00);
                    } else if (objArr2 instanceof AnonymousClass8NE) {
                        r7 = new AnonymousClass8NE(((AnonymousClass8NE) objArr2).A00);
                    } else if (objArr2 instanceof AnonymousClass8NF) {
                        r7 = new AnonymousClass8NF(((AnonymousClass8NF) objArr2).A00);
                    } else {
                        obj = objArr2.toString();
                    }
                    obj = C73723fy.A07(", ", "[", "]", "...", r7, (AnonymousClass4GQ) null, -1);
                }
                C162457s7.A0D(obj);
            }
            sb.append(obj);
        }
        sb.append(']');
        list.remove(AnonymousClass002.A03(list));
    }
}
