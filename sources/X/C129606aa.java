package X;

import java.util.Objects;

/* renamed from: X.6aa  reason: invalid class name and case insensitive filesystem */
public final class C129606aa<K, V> extends AnonymousClass8OQ<K, V> {
    public static final AnonymousClass8OQ EMPTY = new C129606aa((Object) null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] alternatingKeysAndValues;
    public final transient Object hashTable;
    public final transient int size;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        r7 = X.AnonymousClass6CA.A0D(r3, r2, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r3[r1] = (short) r2;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        r6[r2] = r5;
        r7 = r7 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object createHashTable(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r1 = 0
            r0 = 1
            if (r11 != r0) goto L_0x0013
            r1 = r10[r1]
            java.util.Objects.requireNonNull(r1)
            r0 = r10[r0]
            java.util.Objects.requireNonNull(r0)
            X.C160937oh.checkEntryNotNull(r1, r0)
            r0 = 0
            return r0
        L_0x0013:
            int r9 = r12 + -1
            r0 = 128(0x80, float:1.794E-43)
            r7 = 0
            r8 = -1
            if (r12 > r0) goto L_0x0054
            byte[] r3 = new byte[r12]
            java.util.Arrays.fill(r3, r8)
        L_0x0020:
            if (r7 >= r11) goto L_0x0053
            int r2 = r7 * 2
            r5 = r10[r2]
            java.util.Objects.requireNonNull(r5)
            r0 = r2 ^ 1
            r6 = r10[r0]
            java.util.Objects.requireNonNull(r6)
            X.C160937oh.checkEntryNotNull(r5, r6)
            int r0 = r5.hashCode()
            int r1 = X.C159347lg.smear(r0)
        L_0x003b:
            r1 = r1 & r9
            byte r4 = r3[r1]
            r0 = 255(0xff, float:3.57E-43)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x0048
            int r7 = X.AnonymousClass6CA.A0D(r3, r2, r1, r7)
            goto L_0x0020
        L_0x0048:
            r0 = r10[r4]
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0093
            int r1 = r1 + 1
            goto L_0x003b
        L_0x0053:
            return r3
        L_0x0054:
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r12 > r0) goto L_0x0099
            short[] r3 = new short[r12]
            java.util.Arrays.fill(r3, r8)
        L_0x005e:
            if (r7 >= r11) goto L_0x0098
            int r2 = r7 * 2
            r5 = r10[r2]
            java.util.Objects.requireNonNull(r5)
            r0 = r2 ^ 1
            r6 = r10[r0]
            java.util.Objects.requireNonNull(r6)
            X.C160937oh.checkEntryNotNull(r5, r6)
            int r0 = r5.hashCode()
            int r1 = X.C159347lg.smear(r0)
        L_0x0079:
            r1 = r1 & r9
            short r4 = r3[r1]
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x0088
            short r0 = (short) r2
            r3[r1] = r0
            int r7 = r7 + 1
            goto L_0x005e
        L_0x0088:
            r0 = r10[r4]
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0093
            int r1 = r1 + 1
            goto L_0x0079
        L_0x0093:
            java.lang.IllegalArgumentException r0 = duplicateKeyException(r5, r6, r10, r4)
            throw r0
        L_0x0098:
            return r3
        L_0x0099:
            int[] r6 = new int[r12]
            java.util.Arrays.fill(r6, r8)
        L_0x009e:
            if (r7 >= r11) goto L_0x00d3
            int r5 = r7 * 2
            r4 = r10[r5]
            java.util.Objects.requireNonNull(r4)
            r0 = r5 ^ 1
            r3 = r10[r0]
            java.util.Objects.requireNonNull(r3)
            X.C160937oh.checkEntryNotNull(r4, r3)
            int r0 = r4.hashCode()
            int r2 = X.C159347lg.smear(r0)
        L_0x00b9:
            r2 = r2 & r9
            r1 = r6[r2]
            if (r1 != r8) goto L_0x00c3
            r6[r2] = r5
            int r7 = r7 + 1
            goto L_0x009e
        L_0x00c3:
            r0 = r10[r1]
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00ce
            int r2 = r2 + 1
            goto L_0x00b9
        L_0x00ce:
            java.lang.IllegalArgumentException r0 = duplicateKeyException(r4, r3, r10, r1)
            throw r0
        L_0x00d3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129606aa.createHashTable(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static C129606aa create(int i, Object[] objArr) {
        if (i == 0) {
            return (C129606aa) EMPTY;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            C160937oh.checkEntryNotNull(obj, obj2);
            return new C129606aa((Object) null, objArr, 1);
        }
        C162187rP.A02(i, objArr.length >> 1);
        return new C129606aa(createHashTable(objArr, i, C129526aS.chooseTableSize(i), 0), objArr, i);
    }

    public C129526aS createEntrySet() {
        return new C129716al(this, this.alternatingKeysAndValues, 0, this.size);
    }

    public C129526aS createKeySet() {
        return new C129686ai(this, new C129536aT(this.alternatingKeysAndValues, 0, this.size));
    }

    public C174098Sy createValues() {
        return new C129536aT(this.alternatingKeysAndValues, 1, this.size);
    }

    public Object get(Object obj) {
        Object obj2 = get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    public int size() {
        return this.size;
    }

    public C129606aa(Object obj, Object[] objArr, int i) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i;
    }

    public static IllegalArgumentException duplicateKeyException(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder A0o = AnonymousClass6C7.A0o(valueOf.length() + 39 + valueOf2.length() + valueOf3.length(), valueOf4);
        A0o.append("Multiple entries with same key: ");
        A0o.append(valueOf);
        A0o.append("=");
        A0o.append(valueOf2);
        C18260x0.A0p(" and ", valueOf3, "=", valueOf4, A0o);
        return C18310x6.A0d(A0o);
    }

    public static Object get(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        int i3;
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int smear = C159347lg.smear(obj2.hashCode());
                while (true) {
                    int i4 = smear & length;
                    i3 = bArr[i4] & 255;
                    if (i3 != 255) {
                        if (obj2.equals(objArr[i3])) {
                            break;
                        }
                        smear = i4 + 1;
                    } else {
                        return null;
                    }
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int smear2 = C159347lg.smear(obj2.hashCode());
                while (true) {
                    int i5 = smear2 & length2;
                    i3 = sArr[i5] & 65535;
                    if (i3 != 65535) {
                        if (obj2.equals(objArr[i3])) {
                            break;
                        }
                        smear2 = i5 + 1;
                    } else {
                        return null;
                    }
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int smear3 = C159347lg.smear(obj2.hashCode());
                while (true) {
                    int i6 = smear3 & length3;
                    i3 = iArr[i6];
                    if (i3 != -1) {
                        if (obj2.equals(objArr[i3])) {
                            break;
                        }
                        smear3 = i6 + 1;
                    } else {
                        return null;
                    }
                }
            }
            return objArr[i3 ^ 1];
        }
    }
}
