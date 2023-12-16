package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Xq  reason: invalid class name */
public final class AnonymousClass0Xq {
    public static final AnonymousClass0Xq A01 = new AnonymousClass0Q9().A00();
    public static final String A02 = C06240Wu.A01("Data");
    public Map A00;

    public boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && AnonymousClass0Xq.class == obj.getClass()) {
                Map map = this.A00;
                Set keySet = map.keySet();
                Map map2 = ((AnonymousClass0Xq) obj).A00;
                if (keySet.equals(map2.keySet())) {
                    for (Object next : keySet) {
                        Object obj2 = map.get(next);
                        Object obj3 = map2.get(next);
                        if (obj2 != null) {
                            if (obj3 != null) {
                                if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                                    equals = obj2.equals(obj3);
                                } else {
                                    equals = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                                }
                                if (!equals) {
                                }
                            }
                        } else if (obj2 == obj3) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[SYNTHETIC, Splitter:B:20:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0Xq A00(byte[] r7) {
        /*
            java.lang.String r3 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x0072
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r7)
            r1 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0039, all -> 0x0037 }
            r4.<init>(r5)     // Catch:{ IOException | ClassNotFoundException -> 0x0039, all -> 0x0037 }
            int r2 = r4.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0035 }
        L_0x001a:
            if (r2 <= 0) goto L_0x002a
            java.lang.String r1 = r4.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0035 }
            java.lang.Object r0 = r4.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0035 }
            r6.put(r1, r0)     // Catch:{ IOException | ClassNotFoundException -> 0x0035 }
            int r2 = r2 + -1
            goto L_0x001a
        L_0x002a:
            r4.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x004a
        L_0x002e:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            goto L_0x004a
        L_0x0035:
            r0 = move-exception
            goto L_0x003b
        L_0x0037:
            r2 = move-exception
            goto L_0x0067
        L_0x0039:
            r0 = move-exception
            r4 = r1
        L_0x003b:
            java.lang.String r1 = A02     // Catch:{ all -> 0x005a }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x004a
            r4.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L_0x004a:
            r5.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0054
        L_0x004e:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0054:
            X.0Xq r0 = new X.0Xq
            r0.<init>((java.util.Map) r6)
            return r0
        L_0x005a:
            r2 = move-exception
            if (r4 == 0) goto L_0x0067
            r4.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0067
        L_0x0061:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0067:
            r5.close()     // Catch:{ IOException -> 0x006b }
            throw r2
        L_0x006b:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        L_0x0072:
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0e(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Xq.A00(byte[]):X.0Xq");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c A[SYNTHETIC, Splitter:B:28:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0084 A[SYNTHETIC, Splitter:B:42:0x0084] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(X.AnonymousClass0Xq r7) {
        /*
            java.lang.String r3 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r6 = 0
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0060 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0060 }
            java.util.Map r1 = r7.A00     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
            int r0 = r1.size()     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
            r5.writeInt(r0)     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
            java.util.Iterator r2 = X.AnonymousClass000.A0q(r1)     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
        L_0x001a:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
            if (r0 == 0) goto L_0x0035
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r2)     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
            r5.writeUTF(r0)     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
            r5.writeObject(r0)     // Catch:{ IOException -> 0x005d, all -> 0x0080 }
            goto L_0x001a
        L_0x0035:
            r5.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003f
        L_0x0039:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x003f:
            r4.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0049
        L_0x0043:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0049:
            int r1 = r4.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x0056
            byte[] r1 = r4.toByteArray()
            return r1
        L_0x0056:
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0e(r0)
            throw r2
        L_0x005d:
            r0 = move-exception
            r6 = r5
            goto L_0x0061
        L_0x0060:
            r0 = move-exception
        L_0x0061:
            java.lang.String r2 = A02     // Catch:{ all -> 0x007e }
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x007e }
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x0074
            r6.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            r0 = move-exception
            android.util.Log.e(r2, r3, r0)
        L_0x0074:
            r4.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x007d
        L_0x0078:
            r0 = move-exception
            android.util.Log.e(r2, r3, r0)
            return r1
        L_0x007d:
            return r1
        L_0x007e:
            r2 = move-exception
            goto L_0x0082
        L_0x0080:
            r2 = move-exception
            r6 = r5
        L_0x0082:
            if (r6 == 0) goto L_0x008e
            r6.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008e
        L_0x0088:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x008e:
            r4.close()     // Catch:{ IOException -> 0x0092 }
            throw r2
        L_0x0092:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Xq.A01(X.0Xq):byte[]");
    }

    public int A02(String str, int i) {
        Object obj = this.A00.get(str);
        if (obj instanceof Integer) {
            return AnonymousClass001.A0K(obj);
        }
        return i;
    }

    public String A03(String str) {
        Object obj = this.A00.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int[] A04(String str) {
        Object obj = this.A00.get(str);
        if (!(obj instanceof Integer[])) {
            return null;
        }
        Integer[] numArr = (Integer[]) obj;
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        Map map = this.A00;
        if (!map.isEmpty()) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                sb.append(A0m);
                sb.append(" : ");
                Object obj = map.get(A0m);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                AnonymousClass001.A1M(sb);
            }
        }
        return AnonymousClass000.A0g(sb);
    }

    public AnonymousClass0Xq(AnonymousClass0Xq r3) {
        this.A00 = new HashMap(r3.A00);
    }

    public AnonymousClass0Xq(Map map) {
        this.A00 = new HashMap(map);
    }

    public AnonymousClass0Xq() {
    }
}
