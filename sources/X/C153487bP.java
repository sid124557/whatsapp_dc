package X;

/* renamed from: X.7bP  reason: invalid class name and case insensitive filesystem */
public abstract class C153487bP {
    public int A00;
    public AnonymousClass7EE A01;
    public final C186378vD A02;

    public int A00() {
        int readInt;
        boolean z = this instanceof C135776lE;
        A01();
        if (z) {
            C186378vD r4 = this.A02;
            r4.readInt();
            readInt = r4.readInt() * this.A01.A00[((C142666xZ) AnonymousClass001.A0i(C142666xZ.A00, r4.readByte() & 255)).typeId];
            byte[] bArr = new byte[readInt];
            C171478Hf r42 = (C171478Hf) r4;
            r42.A00.BiI(bArr);
            r42.A01.write(new byte[bArr.length]);
        } else {
            C186378vD r0 = this.A02;
            r0.readInt();
            readInt = r0.readInt() * this.A01.A00[((C142666xZ) AnonymousClass001.A0i(C142666xZ.A00, r0.readByte() & 255)).typeId];
            A03((long) readInt);
        }
        return this.A00 + 4 + 4 + 1 + readInt;
    }

    public long A01() {
        int i;
        int i2 = this.A00;
        if (i2 == 1) {
            i = this.A02.readByte();
        } else if (i2 == 2) {
            i = this.A02.readShort();
        } else if (i2 == 4) {
            i = this.A02.readInt();
        } else if (i2 == 8) {
            return this.A02.readLong();
        } else {
            throw AnonymousClass001.A0c("ID Length must be 1, 2, 4, or 8");
        }
        return (long) i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: X.6xZ[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02fc, code lost:
        A01();
        r5.readInt();
        r5.readInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0310, code lost:
        r8 = (r6.A00 + 4) + 4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r19 = this;
            X.7EE r0 = new X.7EE
            r0.<init>()
            r6 = r19
            r6.A01 = r0
        L_0x0009:
            X.8vD r5 = r6.A02     // Catch:{ EOFException -> 0x0369 }
            byte r0 = r5.readByte()     // Catch:{ EOFException -> 0x0369 }
            if (r0 != 0) goto L_0x0009
            int r3 = r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            r6.A00 = r3     // Catch:{ EOFException -> 0x0369 }
            X.7EE r7 = r6.A01     // Catch:{ EOFException -> 0x0369 }
            r8 = -1
            r4 = 0
            r2 = 0
            r1 = -1
        L_0x001d:
            X.6xZ[] r0 = X.C142666xZ.values()     // Catch:{ EOFException -> 0x0369 }
            int r0 = r0.length     // Catch:{ EOFException -> 0x0369 }
            if (r2 >= r0) goto L_0x0033
            X.6xZ[] r0 = X.C142666xZ.values()     // Catch:{ EOFException -> 0x0369 }
            r0 = r0[r2]     // Catch:{ EOFException -> 0x0369 }
            int r0 = r0.typeId     // Catch:{ EOFException -> 0x0369 }
            int r1 = java.lang.Math.max(r0, r1)     // Catch:{ EOFException -> 0x0369 }
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0033:
            int r0 = r1 + 1
            int[] r0 = new int[r0]     // Catch:{ EOFException -> 0x0369 }
            r7.A00 = r0     // Catch:{ EOFException -> 0x0369 }
            java.util.Arrays.fill(r0, r8)     // Catch:{ EOFException -> 0x0369 }
        L_0x003c:
            X.6xZ[] r0 = X.C142666xZ.values()     // Catch:{ EOFException -> 0x0369 }
            int r0 = r0.length     // Catch:{ EOFException -> 0x0369 }
            int[] r2 = r7.A00     // Catch:{ EOFException -> 0x0369 }
            if (r4 >= r0) goto L_0x005a
            X.6xZ[] r0 = X.C142666xZ.values()     // Catch:{ EOFException -> 0x0369 }
            r0 = r0[r4]     // Catch:{ EOFException -> 0x0369 }
            int r1 = r0.typeId     // Catch:{ EOFException -> 0x0369 }
            X.6xZ[] r0 = X.C142666xZ.values()     // Catch:{ EOFException -> 0x0369 }
            r0 = r0[r4]     // Catch:{ EOFException -> 0x0369 }
            int r0 = r0.size     // Catch:{ EOFException -> 0x0369 }
            r2[r1] = r0     // Catch:{ EOFException -> 0x0369 }
            int r4 = r4 + 1
            goto L_0x003c
        L_0x005a:
            X.6xZ r4 = X.C142666xZ.A08     // Catch:{ EOFException -> 0x0369 }
            int r0 = r4.typeId     // Catch:{ EOFException -> 0x0369 }
            r2[r0] = r3     // Catch:{ EOFException -> 0x0369 }
            r5.readLong()     // Catch:{ EOFException -> 0x0369 }
        L_0x0063:
            boolean r0 = r5.BFT()     // Catch:{ EOFException -> 0x0369 }
            if (r0 == 0) goto L_0x0369
            byte r0 = r5.readByte()     // Catch:{ EOFException -> 0x0369 }
            r3 = r0 & 255(0xff, float:3.57E-43)
            r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            int r0 = r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            long r0 = X.AnonymousClass6C8.A0M(r0)
            r2 = 12
            if (r3 == r2) goto L_0x0086
            r2 = 28
            if (r3 == r2) goto L_0x0086
            r6.A03(r0)     // Catch:{ EOFException -> 0x0369 }
            goto L_0x0063
        L_0x0086:
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0063
            byte r2 = r5.readByte()     // Catch:{ EOFException -> 0x0369 }
            r7 = r2 & 255(0xff, float:3.57E-43)
            r2 = 1
            long r0 = r0 - r2
            r2 = 144(0x90, float:2.02E-43)
            if (r7 == r2) goto L_0x032d
            r2 = 195(0xc3, float:2.73E-43)
            if (r7 == r2) goto L_0x0339
            r2 = 254(0xfe, float:3.56E-43)
            if (r7 == r2) goto L_0x0322
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == r2) goto L_0x032d
            switch(r7) {
                case 1: goto L_0x02ec;
                case 2: goto L_0x0306;
                case 3: goto L_0x0306;
                case 4: goto L_0x0317;
                case 5: goto L_0x032d;
                case 6: goto L_0x0317;
                case 7: goto L_0x032d;
                case 8: goto L_0x02fc;
                default: goto L_0x00a8;
            }     // Catch:{ EOFException -> 0x0369 }
        L_0x00a8:
            switch(r7) {
                case 32: goto L_0x00b0;
                case 33: goto L_0x0230;
                case 34: goto L_0x02ca;
                case 35: goto L_0x02e7;
                default: goto L_0x00ab;
            }     // Catch:{ EOFException -> 0x0369 }
        L_0x00ab:
            switch(r7) {
                case 137: goto L_0x032d;
                case 138: goto L_0x032d;
                case 139: goto L_0x032d;
                case 140: goto L_0x032d;
                case 141: goto L_0x032d;
                case 142: goto L_0x02fc;
                default: goto L_0x00ae;
            }     // Catch:{ EOFException -> 0x0369 }
        L_0x00ae:
            goto L_0x034a
        L_0x00b0:
            boolean r2 = r6 instanceof X.C135776lE     // Catch:{ EOFException -> 0x0369 }
            if (r2 == 0) goto L_0x0165
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r2 * 7
            int r2 = r2 + 4
            int r2 = r2 + 4
            short r10 = r5.readShort()     // Catch:{ EOFException -> 0x0369 }
            r13 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r13
            int r12 = r2 + 2
            r7 = 0
            r9 = 0
        L_0x00e3:
            if (r9 >= r10) goto L_0x010a
            r5.readShort()     // Catch:{ EOFException -> 0x0369 }
            byte r2 = r5.readByte()     // Catch:{ EOFException -> 0x0369 }
            r3 = r2 & 255(0xff, float:3.57E-43)
            java.util.Map r2 = X.C142666xZ.A00     // Catch:{ EOFException -> 0x0369 }
            java.lang.Object r8 = X.AnonymousClass001.A0i(r2, r3)     // Catch:{ EOFException -> 0x0369 }
            X.6xZ r8 = (X.C142666xZ) r8     // Catch:{ EOFException -> 0x0369 }
            X.7EE r2 = r6.A01     // Catch:{ EOFException -> 0x0369 }
            int[] r3 = r2.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r8.typeId     // Catch:{ EOFException -> 0x0369 }
            r8 = r3[r2]     // Catch:{ EOFException -> 0x0369 }
            long r2 = (long) r8     // Catch:{ EOFException -> 0x0369 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0369 }
            int r2 = r8 + 1
            int r2 = r2 + 2
            int r12 = r12 + r2
            int r9 = r9 + 1
            goto L_0x00e3
        L_0x010a:
            short r11 = r5.readShort()     // Catch:{ EOFException -> 0x0369 }
            r11 = r11 & r13
            int r10 = r12 + 2
            r9 = 0
        L_0x0112:
            if (r9 >= r11) goto L_0x014e
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            byte r3 = r5.readByte()     // Catch:{ EOFException -> 0x0369 }
            java.util.Map r2 = X.C142666xZ.A00     // Catch:{ EOFException -> 0x0369 }
            java.lang.Object r8 = X.AnonymousClass001.A0i(r2, r3)     // Catch:{ EOFException -> 0x0369 }
            X.6xZ r8 = (X.C142666xZ) r8     // Catch:{ EOFException -> 0x0369 }
            if (r8 != r4) goto L_0x0139
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
        L_0x0128:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            int r12 = r2 + 1
            X.7EE r2 = r6.A01     // Catch:{ EOFException -> 0x0369 }
            int[] r3 = r2.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r8.typeId     // Catch:{ EOFException -> 0x0369 }
            int r10 = X.AnonymousClass6C9.A0I(r3, r2, r12, r10)     // Catch:{ EOFException -> 0x0369 }
            int r9 = r9 + 1
            goto L_0x0112
        L_0x0139:
            r12 = r5
            X.8Hf r12 = (X.C171478Hf) r12     // Catch:{ EOFException -> 0x0369 }
            int r2 = r8.size     // Catch:{ EOFException -> 0x0369 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0369 }
            X.8vD r2 = r12.A00     // Catch:{ EOFException -> 0x0369 }
            r2.BiI(r3)     // Catch:{ EOFException -> 0x0369 }
            int r2 = r3.length     // Catch:{ EOFException -> 0x0369 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0369 }
            java.io.DataOutputStream r2 = r12.A01     // Catch:{ EOFException -> 0x0369 }
            r2.write(r3)     // Catch:{ EOFException -> 0x0369 }
            goto L_0x0128
        L_0x014e:
            short r3 = r5.readShort()     // Catch:{ EOFException -> 0x0369 }
            r3 = r3 & r13
            int r8 = r10 + 2
        L_0x0155:
            if (r7 >= r3) goto L_0x0335
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r5.readByte()     // Catch:{ EOFException -> 0x0369 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r2 + 1
            int r8 = r8 + r2
            int r7 = r7 + 1
            goto L_0x0155
        L_0x0165:
            r7 = r6
            X.6lD r7 = (X.C135766lD) r7     // Catch:{ EOFException -> 0x0369 }
            long r15 = r7.A01()     // Catch:{ EOFException -> 0x0369 }
            X.8vD r12 = r7.A02     // Catch:{ EOFException -> 0x0369 }
            r12.readInt()     // Catch:{ EOFException -> 0x0369 }
            long r17 = r7.A01()     // Catch:{ EOFException -> 0x0369 }
            r7.A01()     // Catch:{ EOFException -> 0x0369 }
            r7.A01()     // Catch:{ EOFException -> 0x0369 }
            r7.A01()     // Catch:{ EOFException -> 0x0369 }
            r7.A01()     // Catch:{ EOFException -> 0x0369 }
            r7.A01()     // Catch:{ EOFException -> 0x0369 }
            r12.readInt()     // Catch:{ EOFException -> 0x0369 }
            int r2 = r7.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r2 * 7
            int r2 = r2 + 4
            int r2 = r2 + 4
            short r9 = r12.readShort()     // Catch:{ EOFException -> 0x0369 }
            r14 = 65535(0xffff, float:9.1834E-41)
            r9 = r9 & r14
            int r13 = r2 + 2
            r8 = 0
        L_0x019a:
            if (r8 >= r9) goto L_0x01c1
            r12.readShort()     // Catch:{ EOFException -> 0x0369 }
            byte r2 = r12.readByte()     // Catch:{ EOFException -> 0x0369 }
            r3 = r2 & 255(0xff, float:3.57E-43)
            java.util.Map r2 = X.C142666xZ.A00     // Catch:{ EOFException -> 0x0369 }
            java.lang.Object r10 = X.AnonymousClass001.A0i(r2, r3)     // Catch:{ EOFException -> 0x0369 }
            X.6xZ r10 = (X.C142666xZ) r10     // Catch:{ EOFException -> 0x0369 }
            X.7EE r2 = r7.A01     // Catch:{ EOFException -> 0x0369 }
            int[] r3 = r2.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r10.typeId     // Catch:{ EOFException -> 0x0369 }
            r10 = r3[r2]     // Catch:{ EOFException -> 0x0369 }
            long r2 = (long) r10     // Catch:{ EOFException -> 0x0369 }
            r7.A03(r2)     // Catch:{ EOFException -> 0x0369 }
            int r2 = r10 + 1
            int r2 = r2 + 2
            int r13 = r13 + r2
            int r8 = r8 + 1
            goto L_0x019a
        L_0x01c1:
            short r11 = r12.readShort()     // Catch:{ EOFException -> 0x0369 }
            r11 = r11 & r14
            int r9 = r13 + 2
            r10 = 0
        L_0x01c9:
            if (r10 >= r11) goto L_0x01f7
            r7.A01()     // Catch:{ EOFException -> 0x0369 }
            byte r3 = r12.readByte()     // Catch:{ EOFException -> 0x0369 }
            java.util.Map r2 = X.C142666xZ.A00     // Catch:{ EOFException -> 0x0369 }
            java.lang.Object r8 = X.AnonymousClass001.A0i(r2, r3)     // Catch:{ EOFException -> 0x0369 }
            X.6xZ r8 = (X.C142666xZ) r8     // Catch:{ EOFException -> 0x0369 }
            X.7EE r2 = r7.A01     // Catch:{ EOFException -> 0x0369 }
            int[] r3 = r2.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r8.typeId     // Catch:{ EOFException -> 0x0369 }
            r2 = r3[r2]     // Catch:{ EOFException -> 0x0369 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0369 }
            r7.A03(r2)     // Catch:{ EOFException -> 0x0369 }
            int r2 = r7.A00     // Catch:{ EOFException -> 0x0369 }
            int r3 = r2 + 1
            X.7EE r2 = r7.A01     // Catch:{ EOFException -> 0x0369 }
            int[] r2 = r2.A00     // Catch:{ EOFException -> 0x0369 }
            int r8 = r8.typeId     // Catch:{ EOFException -> 0x0369 }
            int r9 = X.AnonymousClass6C9.A0I(r2, r8, r3, r9)     // Catch:{ EOFException -> 0x0369 }
            int r10 = r10 + 1
            goto L_0x01c9
        L_0x01f7:
            short r10 = r12.readShort()     // Catch:{ EOFException -> 0x0369 }
            r10 = r10 & r14
            X.6xZ[] r14 = new X.C142666xZ[r10]     // Catch:{ EOFException -> 0x0369 }
            int r8 = r9 + 2
            r9 = 0
        L_0x0201:
            if (r9 >= r10) goto L_0x021c
            r7.A01()     // Catch:{ EOFException -> 0x0369 }
            byte r2 = r12.readByte()     // Catch:{ EOFException -> 0x0369 }
            r3 = r2 & 255(0xff, float:3.57E-43)
            java.util.Map r2 = X.C142666xZ.A00     // Catch:{ EOFException -> 0x0369 }
            java.lang.Object r2 = X.AnonymousClass001.A0i(r2, r3)     // Catch:{ EOFException -> 0x0369 }
            r14[r9] = r2     // Catch:{ EOFException -> 0x0369 }
            int r2 = r7.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r2 + 1
            int r8 = r8 + r2
            int r9 = r9 + 1
            goto L_0x0201
        L_0x021c:
            X.7L8 r13 = new X.7L8     // Catch:{ EOFException -> 0x0369 }
            r13.<init>(r14, r15, r17)     // Catch:{ EOFException -> 0x0369 }
            X.7ED r2 = r7.A00     // Catch:{ EOFException -> 0x0369 }
            java.util.Map r7 = r2.A00     // Catch:{ EOFException -> 0x0369 }
            long r2 = r13.A00     // Catch:{ EOFException -> 0x0369 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ EOFException -> 0x0369 }
            r7.put(r2, r13)     // Catch:{ EOFException -> 0x0369 }
            goto L_0x0335
        L_0x0230:
            boolean r2 = r6 instanceof X.C135776lE     // Catch:{ EOFException -> 0x0369 }
            if (r2 == 0) goto L_0x02b0
            r9 = r6
            X.6lE r9 = (X.C135776lE) r9     // Catch:{ EOFException -> 0x0369 }
            r9.A01()     // Catch:{ EOFException -> 0x0369 }
            X.8vD r8 = r9.A02     // Catch:{ EOFException -> 0x0369 }
            r8.readInt()     // Catch:{ EOFException -> 0x0369 }
            long r10 = r9.A01()     // Catch:{ EOFException -> 0x0369 }
            int r14 = r8.readInt()     // Catch:{ EOFException -> 0x0369 }
            X.7ED r2 = r9.A00     // Catch:{ EOFException -> 0x0369 }
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ EOFException -> 0x0369 }
            java.util.Map r12 = r2.A00     // Catch:{ EOFException -> 0x0369 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ EOFException -> 0x0369 }
        L_0x0253:
            java.lang.Object r2 = r12.get(r2)     // Catch:{ EOFException -> 0x0369 }
            X.7L8 r2 = (X.AnonymousClass7L8) r2     // Catch:{ EOFException -> 0x0369 }
            r13.add(r2)     // Catch:{ EOFException -> 0x0369 }
            long r2 = r2.A01     // Catch:{ EOFException -> 0x0369 }
            r10 = 0
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0269
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ EOFException -> 0x0369 }
            goto L_0x0253
        L_0x0269:
            java.util.Iterator r11 = r13.iterator()     // Catch:{ EOFException -> 0x0369 }
        L_0x026d:
            boolean r2 = r11.hasNext()     // Catch:{ EOFException -> 0x0369 }
            if (r2 == 0) goto L_0x02a6
            java.lang.Object r2 = r11.next()     // Catch:{ EOFException -> 0x0369 }
            X.7L8 r2 = (X.AnonymousClass7L8) r2     // Catch:{ EOFException -> 0x0369 }
            java.util.List r2 = r2.A02     // Catch:{ EOFException -> 0x0369 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ EOFException -> 0x0369 }
        L_0x027f:
            boolean r2 = r10.hasNext()     // Catch:{ EOFException -> 0x0369 }
            if (r2 == 0) goto L_0x026d
            java.lang.Object r2 = r10.next()     // Catch:{ EOFException -> 0x0369 }
            X.6xZ r2 = (X.C142666xZ) r2     // Catch:{ EOFException -> 0x0369 }
            if (r2 != r4) goto L_0x0291
            r9.A01()     // Catch:{ EOFException -> 0x0369 }
            goto L_0x027f
        L_0x0291:
            r7 = r8
            X.8Hf r7 = (X.C171478Hf) r7     // Catch:{ EOFException -> 0x0369 }
            int r2 = r2.size     // Catch:{ EOFException -> 0x0369 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0369 }
            X.8vD r2 = r7.A00     // Catch:{ EOFException -> 0x0369 }
            r2.BiI(r3)     // Catch:{ EOFException -> 0x0369 }
            int r2 = r3.length     // Catch:{ EOFException -> 0x0369 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0369 }
            java.io.DataOutputStream r2 = r7.A01     // Catch:{ EOFException -> 0x0369 }
            r2.write(r3)     // Catch:{ EOFException -> 0x0369 }
            goto L_0x027f
        L_0x02a6:
            int r3 = r9.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r3 + 4
            int r2 = r2 + r3
            int r8 = r2 + 4
            int r8 = r8 + r14
            goto L_0x0335
        L_0x02b0:
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            int r7 = r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            long r2 = (long) r7     // Catch:{ EOFException -> 0x0369 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0369 }
            int r3 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r3 + 4
            int r2 = r2 + r3
            int r8 = r2 + 4
            int r8 = r8 + r7
            goto L_0x0335
        L_0x02ca:
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            int r7 = r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            int r7 = r7 * r2
            long r2 = (long) r7     // Catch:{ EOFException -> 0x0369 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0369 }
            int r3 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r3 + 4
            int r8 = r2 + 4
            int r8 = r8 + r3
            int r8 = r8 + r7
            goto L_0x0335
        L_0x02e7:
            int r8 = r6.A00()     // Catch:{ EOFException -> 0x0369 }
            goto L_0x0335
        L_0x02ec:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0369 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0369 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0369 }
            long r0 = r0 - r2
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            int r8 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            goto L_0x0335
        L_0x02fc:
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            goto L_0x0310
        L_0x0306:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r2 + 4
            int r2 = r2 + 4
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0369 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0369 }
        L_0x0310:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            int r2 = r2 + 4
            int r8 = r2 + 4
            goto L_0x0335
        L_0x0317:
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            int r8 = r2 + 4
            goto L_0x0335
        L_0x0322:
            r5.readInt()     // Catch:{ EOFException -> 0x0369 }
            r6.A01()     // Catch:{ EOFException -> 0x0369 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            int r8 = r2 + 4
            goto L_0x0335
        L_0x032d:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0369 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0369 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0369 }
            int r8 = r6.A00     // Catch:{ EOFException -> 0x0369 }
        L_0x0335:
            long r2 = (long) r8     // Catch:{ EOFException -> 0x0369 }
            long r0 = r0 - r2
            goto L_0x0086
        L_0x0339:
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ EOFException -> 0x0369 }
            java.lang.String r0 = "+--- PRIMITIVE ARRAY NODATA DUMP"
            r1.println(r0)     // Catch:{ EOFException -> 0x0369 }
            r6.A00()     // Catch:{ EOFException -> 0x0369 }
            java.lang.String r0 = "Don't know how to load a nodata array"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ EOFException -> 0x0369 }
            goto L_0x0368
        L_0x034a:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x0369 }
            java.lang.String r0 = "loadHeapDump loop with unknown tag "
            r2.append(r0)     // Catch:{ EOFException -> 0x0369 }
            r2.append(r7)     // Catch:{ EOFException -> 0x0369 }
            java.lang.String r0 = " with "
            r2.append(r0)     // Catch:{ EOFException -> 0x0369 }
            long r0 = r5.Bj0()     // Catch:{ EOFException -> 0x0369 }
            r2.append(r0)     // Catch:{ EOFException -> 0x0369 }
            java.lang.String r0 = " bytes possibly remaining"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r2)     // Catch:{ EOFException -> 0x0369 }
        L_0x0368:
            throw r0     // Catch:{ EOFException -> 0x0369 }
        L_0x0369:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153487bP.A02():void");
    }

    public void A03(long j) {
        C186378vD r2 = this.A02;
        r2.Bn0(r2.position() + j);
    }

    public C153487bP(C186378vD r1) {
        this.A02 = r1;
    }
}
