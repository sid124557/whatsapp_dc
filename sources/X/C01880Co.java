package X;

/* renamed from: X.0Co  reason: invalid class name and case insensitive filesystem */
public class C01880Co extends C05600Ud {
    public C01880Co(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static final int A00(int i) {
        if (i < 48) {
            return -1;
        }
        if (i <= 57) {
            return i - 48;
        }
        int i2 = 65;
        if (i < 65) {
            return -1;
        }
        if (i > 70) {
            i2 = 97;
            if (i < 97 || i > 102) {
                return -1;
            }
        }
        return (i - i2) + 10;
    }

    public String A0G() {
        char charAt;
        if (AnonymousClass000.A1U(this.A01, this.A00) || ((charAt = this.A03.charAt(this.A01)) != '\'' && charAt != '\"')) {
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        this.A01++;
        loop0:
        while (true) {
            int intValue = A09().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = A09().intValue();
                    if (intValue == -1) {
                        break loop0;
                    } else if (!(intValue == 10 || intValue == 13 || intValue == 12)) {
                        int A00 = A00(intValue);
                        if (A00 != -1) {
                            int i = 1;
                            do {
                                intValue = A09().intValue();
                                int A002 = A00(intValue);
                                if (A002 == -1) {
                                    break;
                                }
                                A00 = (A00 * 16) + A002;
                                i++;
                            } while (i <= 5);
                            A0o.append((char) A00);
                        }
                    }
                }
                A0o.append((char) intValue);
            }
        }
        return A0o.toString();
    }

    public String A0H() {
        int i;
        boolean A1U = AnonymousClass000.A1U(this.A01, this.A00);
        int i2 = this.A01;
        if (A1U) {
            i = i2;
        } else {
            int charAt = this.A03.charAt(i2);
            if (charAt == 45) {
                charAt = A05();
            }
            if (charAt < 65 || (charAt > 90 && (charAt < 97 ? charAt != 95 : charAt > 122))) {
                i = i2;
            } else {
                while (true) {
                    int A05 = A05();
                    if (A05 >= 65) {
                        if (A05 > 90) {
                            if (A05 < 97) {
                                if (A05 != 95) {
                                    break;
                                }
                            } else if (A05 > 122) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else if (A05 >= 48) {
                        if (A05 > 57) {
                            break;
                        }
                    } else if (A05 != 45) {
                        break;
                    }
                }
                i = this.A01;
            }
            this.A01 = i2;
        }
        if (i == i2) {
            return null;
        }
        String substring = this.A03.substring(i2, i);
        this.A01 = i;
        return substring;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.0T3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.0gf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.0gg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.0ge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.0T3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: X.0gc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: X.0gd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: X.0gh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: X.0gh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: X.0T3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: X.0gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: X.0gi} */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r1 != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0233, code lost:
        if (A0E('-') == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02d9, code lost:
        if (A0E(')') != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02db, code lost:
        r1 = new X.C09740gg(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02e0, code lost:
        r5.A00 += 1000;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0355, code lost:
        throw new X.AnonymousClass0GN(X.AnonymousClass000.A0T("Invalid or missing parameter section for pseudo class: ", r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x037a, code lost:
        r0 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x037c, code lost:
        if (r0 != null) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x037e, code lost:
        r0 = X.AnonymousClass001.A0s();
        r2.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0384, code lost:
        r0.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03e5, code lost:
        throw new X.AnonymousClass0GN("Invalid attribute simpleSelectors");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0408, code lost:
        r0 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x040a, code lost:
        if (r0 == null) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0410, code lost:
        if (r0.isEmpty() != false) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0412, code lost:
        r21.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0417, code lost:
        return r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c0, code lost:
        if (r1 == X.AnonymousClass0G7.A0K) goto L_0x01c2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03da A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0404 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0I() {
        /*
            r29 = this;
            r6 = r29
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            r0 = 0
            if (r1 == 0) goto L_0x000e
            return r0
        L_0x000e:
            r0 = 1
            java.util.ArrayList r21 = X.AnonymousClass002.A0I(r0)
        L_0x0013:
            X.0NI r5 = new X.0NI
            r5.<init>()
        L_0x0018:
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x0408
            int r0 = r6.A01
            r28 = r0
            java.util.List r0 = r5.A01
            if (r0 == 0) goto L_0x0031
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            r4 = 0
            if (r0 != 0) goto L_0x03c7
            r0 = 62
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x03bb
            X.0Fj r3 = X.C02230Fj.CHILD
        L_0x003f:
            r6.A0C()
        L_0x0042:
            r0 = 42
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x03a5
            X.0Oa r2 = new X.0Oa
            r2.<init>(r3, r4)
        L_0x004f:
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x0389
            r0 = 46
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x007c
            if (r2 != 0) goto L_0x0068
            X.0Oa r2 = new X.0Oa
            r2.<init>(r3, r4)
        L_0x0068:
            java.lang.String r7 = r6.A0H()
            if (r7 == 0) goto L_0x03ca
            java.lang.String r1 = "class"
            X.0Fu r0 = X.C02340Fu.EQUALS
            r2.A00(r0, r1, r7)
            int r0 = r5.A00
            int r0 = r0 + 1000
            r5.A00 = r0
            goto L_0x004f
        L_0x007c:
            r0 = 35
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x00a1
            if (r2 != 0) goto L_0x008b
            X.0Oa r2 = new X.0Oa
            r2.<init>(r3, r4)
        L_0x008b:
            java.lang.String r7 = r6.A0H()
            if (r7 == 0) goto L_0x03d2
            java.lang.String r1 = "id"
            X.0Fu r0 = X.C02340Fu.EQUALS
            r2.A00(r0, r1, r7)
            int r1 = r5.A00
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 + r0
            r5.A00 = r1
            goto L_0x004f
        L_0x00a1:
            r0 = 91
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x0114
            if (r2 != 0) goto L_0x00b0
            X.0Oa r2 = new X.0Oa
            r2.<init>(r3, r4)
        L_0x00b0:
            r6.A0C()
            java.lang.String r8 = r6.A0H()
            java.lang.String r7 = "Invalid attribute simpleSelectors"
            if (r8 == 0) goto L_0x03e6
            r6.A0C()
            r0 = 61
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x00fb
            X.0Fu r9 = X.C02340Fu.EQUALS
        L_0x00c8:
            r6.A0C()
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x03e0
            java.lang.String r1 = r6.A0A()
            if (r1 != 0) goto L_0x00e1
            java.lang.String r1 = r6.A0H()
            if (r1 == 0) goto L_0x03e0
        L_0x00e1:
            r6.A0C()
        L_0x00e4:
            r0 = 93
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x03da
            if (r9 != 0) goto L_0x00f0
            X.0Fu r9 = X.C02340Fu.EXISTS
        L_0x00f0:
            r2.A00(r9, r8, r1)
            int r0 = r5.A00
            int r0 = r0 + 1000
            r5.A00 = r0
            goto L_0x004f
        L_0x00fb:
            java.lang.String r0 = "~="
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x0106
            X.0Fu r9 = X.C02340Fu.INCLUDES
            goto L_0x00c8
        L_0x0106:
            java.lang.String r0 = "|="
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x0111
            X.0Fu r9 = X.C02340Fu.DASHMATCH
            goto L_0x00c8
        L_0x0111:
            r9 = r4
            r1 = r4
            goto L_0x00e4
        L_0x0114:
            r0 = 58
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x0389
            if (r2 != 0) goto L_0x0123
            X.0Oa r2 = new X.0Oa
            r2.<init>(r3, r4)
        L_0x0123:
            java.lang.String r10 = r6.A0H()
            if (r10 == 0) goto L_0x03fc
            java.util.Map r0 = X.AnonymousClass0G7.A00
            java.lang.Object r1 = r0.get(r10)
            X.0G7 r1 = (X.AnonymousClass0G7) r1
            if (r1 != 0) goto L_0x0135
            X.0G7 r1 = X.AnonymousClass0G7.UNSUPPORTED
        L_0x0135:
            int r0 = r1.ordinal()
            java.lang.String r20 = "Invalid or missing parameter section for pseudo class: "
            r19 = 1
            r12 = 0
            switch(r0) {
                case 0: goto L_0x029e;
                case 1: goto L_0x01a0;
                case 2: goto L_0x01ae;
                case 3: goto L_0x01ae;
                case 4: goto L_0x01ae;
                case 5: goto L_0x01ae;
                case 6: goto L_0x0151;
                case 7: goto L_0x015f;
                case 8: goto L_0x0175;
                case 9: goto L_0x0185;
                case 10: goto L_0x016d;
                case 11: goto L_0x0195;
                case 12: goto L_0x01a7;
                case 13: goto L_0x02eb;
                case 14: goto L_0x02a4;
                case 15: goto L_0x02db;
                case 16: goto L_0x02db;
                case 17: goto L_0x02db;
                case 18: goto L_0x02db;
                case 19: goto L_0x02db;
                case 20: goto L_0x02db;
                case 21: goto L_0x02db;
                case 22: goto L_0x02db;
                case 23: goto L_0x02db;
                default: goto L_0x0141;
            }
        L_0x0141:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported pseudo class: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r10, r1)
            X.0GN r0 = new X.0GN
            r0.<init>(r1)
            throw r0
        L_0x0151:
            X.0gi r1 = new X.0gi
            r9 = 0
            r11 = r19
            r7 = r1
            r8 = r4
            r10 = r11
            r12 = r9
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x02e0
        L_0x015f:
            X.0gi r1 = new X.0gi
            r9 = 0
            r12 = r9
            r7 = r1
            r8 = r4
            r10 = r19
            r11 = r9
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x02e0
        L_0x016d:
            r0 = 0
            X.0gh r1 = new X.0gh
            r1.<init>(r0, r4)
            goto L_0x02e0
        L_0x0175:
            java.lang.String r0 = r2.A01
            X.0gi r1 = new X.0gi
            r9 = 0
            r11 = r19
            r12 = r11
            r7 = r1
            r8 = r0
            r10 = r11
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x02e0
        L_0x0185:
            java.lang.String r0 = r2.A01
            X.0gi r1 = new X.0gi
            r9 = 0
            r12 = r19
            r7 = r1
            r8 = r0
            r10 = r12
            r11 = r9
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x02e0
        L_0x0195:
            java.lang.String r7 = r2.A01
            X.0gh r1 = new X.0gh
            r0 = r19
            r1.<init>(r0, r7)
            goto L_0x02e0
        L_0x01a0:
            X.0gd r1 = new X.0gd
            r1.<init>()
            goto L_0x02e0
        L_0x01a7:
            X.0gc r1 = new X.0gc
            r1.<init>()
            goto L_0x02e0
        L_0x01ae:
            X.0G7 r0 = X.AnonymousClass0G7.nth_child
            if (r1 == r0) goto L_0x01b8
            X.0G7 r0 = X.AnonymousClass0G7.nth_of_type
            if (r1 == r0) goto L_0x01b8
            r19 = 0
        L_0x01b8:
            X.0G7 r0 = X.AnonymousClass0G7.nth_of_type
            if (r1 == r0) goto L_0x01c2
            X.0G7 r0 = X.AnonymousClass0G7.nth_last_of_type
            r27 = 0
            if (r1 != r0) goto L_0x01c4
        L_0x01c2:
            r27 = 1
        L_0x01c4:
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x03f0
            int r0 = r6.A01
            r22 = r0
            r0 = 40
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x03f0
            r6.A0C()
            java.lang.String r0 = "odd"
            boolean r0 = r6.A0F(r0)
            r7 = 2
            r15 = 1
            if (r0 == 0) goto L_0x0214
            X.0LX r1 = new X.0LX
            r1.<init>(r7, r15)
        L_0x01ec:
            r6.A0C()
            r0 = 41
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x03ec
            int r8 = r1.A00
            int r7 = r1.A01
            java.lang.String r0 = r2.A01
            X.0gi r1 = new X.0gi
            r25 = r7
            r26 = r19
            r22 = r1
            r23 = r0
            r24 = r8
            r22.<init>(r23, r24, r25, r26, r27)
            int r0 = r5.A00
            int r0 = r0 + 1000
            r5.A00 = r0
            goto L_0x037a
        L_0x0214:
            java.lang.String r0 = "even"
            boolean r0 = r6.A0F(r0)
            r11 = 0
            if (r0 == 0) goto L_0x0223
            X.0LX r1 = new X.0LX
            r1.<init>(r7, r11)
            goto L_0x01ec
        L_0x0223:
            r0 = 43
            boolean r0 = r6.A0E(r0)
            r14 = 45
            if (r0 != 0) goto L_0x0235
            boolean r0 = r6.A0E(r14)
            r18 = -1
            if (r0 != 0) goto L_0x0237
        L_0x0235:
            r18 = 1
        L_0x0237:
            java.lang.String r13 = r6.A03
            int r0 = r6.A01
            int r9 = r6.A00
            X.0T3 r8 = X.AnonymousClass0T3.A00(r13, r0, r9)
            if (r8 == 0) goto L_0x0247
            int r0 = r8.A00
            r6.A01 = r0
        L_0x0247:
            r0 = 110(0x6e, float:1.54E-43)
            boolean r0 = r6.A0E(r0)
            if (r0 != 0) goto L_0x0266
            r0 = 78
            boolean r0 = r6.A0E(r0)
            if (r0 != 0) goto L_0x0266
            r12 = r8
            r7 = 0
        L_0x0259:
            if (r12 == 0) goto L_0x0260
            long r0 = r12.A01
            int r8 = (int) r0
            int r11 = r18 * r8
        L_0x0260:
            X.0LX r1 = new X.0LX
            r1.<init>(r7, r11)
            goto L_0x01ec
        L_0x0266:
            if (r8 != 0) goto L_0x0274
            int r0 = r6.A01
            r16 = 1
            X.0T3 r8 = new X.0T3
            r7 = r0
            r0 = r16
            r8.<init>(r0, r7)
        L_0x0274:
            r6.A0C()
            r0 = 43
            boolean r0 = r6.A0E(r0)
            if (r0 != 0) goto L_0x0286
            boolean r0 = r6.A0E(r14)
            if (r0 == 0) goto L_0x0295
            r15 = -1
        L_0x0286:
            r6.A0C()
            int r0 = r6.A01
            X.0T3 r12 = X.AnonymousClass0T3.A00(r13, r0, r9)
            if (r12 == 0) goto L_0x03ec
            int r0 = r12.A00
            r6.A01 = r0
        L_0x0295:
            r7 = r18
            r18 = r15
            long r0 = r8.A01
            int r8 = (int) r0
            int r7 = r7 * r8
            goto L_0x0259
        L_0x029e:
            X.0ge r1 = new X.0ge
            r1.<init>()
            goto L_0x02e0
        L_0x02a4:
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x02db
            int r1 = r6.A01
            r0 = 40
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x02db
            r6.A0C()
        L_0x02bb:
            java.lang.String r0 = r6.A0H()
            if (r0 == 0) goto L_0x02e8
            if (r12 != 0) goto L_0x02c7
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
        L_0x02c7:
            r12.add(r0)
            r6.A0C()
            boolean r0 = r6.A0D()
            if (r0 != 0) goto L_0x02bb
            r0 = 41
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x02e8
        L_0x02db:
            X.0gg r1 = new X.0gg
            r1.<init>(r10)
        L_0x02e0:
            int r0 = r5.A00
            int r0 = r0 + 1000
            r5.A00 = r0
            goto L_0x037a
        L_0x02e8:
            r6.A01 = r1
            goto L_0x02db
        L_0x02eb:
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x034a
            int r1 = r6.A01
            r0 = 40
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x034a
            r6.A0C()
            java.util.List r8 = r6.A0I()
            if (r8 == 0) goto L_0x0356
            r0 = 41
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x0356
            java.util.Iterator r9 = r8.iterator()
        L_0x0314:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0359
            java.lang.Object r0 = r9.next()
            X.0NI r0 = (X.AnonymousClass0NI) r0
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x0359
            java.util.Iterator r7 = r0.iterator()
        L_0x0328:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0314
            java.lang.Object r0 = r7.next()
            X.0Oa r0 = (X.C04390Oa) r0
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0314
            java.util.Iterator r1 = r0.iterator()
        L_0x033c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0328
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C09730gf
            if (r0 == 0) goto L_0x033c
        L_0x034a:
            r0 = r20
            java.lang.String r1 = X.AnonymousClass000.A0T(r0, r10)
            X.0GN r0 = new X.0GN
            r0.<init>(r1)
            throw r0
        L_0x0356:
            r6.A01 = r1
            goto L_0x034a
        L_0x0359:
            X.0gf r1 = new X.0gf
            r1.<init>(r8)
            java.util.List r0 = r1.A00
            java.util.Iterator r8 = r0.iterator()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0366:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0378
            java.lang.Object r0 = r8.next()
            X.0NI r0 = (X.AnonymousClass0NI) r0
            int r0 = r0.A00
            if (r0 <= r7) goto L_0x0366
            r7 = r0
            goto L_0x0366
        L_0x0378:
            r5.A00 = r7
        L_0x037a:
            java.util.List r0 = r2.A03
            if (r0 != 0) goto L_0x0384
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r2.A03 = r0
        L_0x0384:
            r0.add(r1)
            goto L_0x004f
        L_0x0389:
            if (r2 == 0) goto L_0x0404
            java.util.List r0 = r5.A01
            if (r0 != 0) goto L_0x0395
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r5.A01 = r0
        L_0x0395:
            r0.add(r2)
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x0018
            r0 = r21
            r0.add(r5)
            goto L_0x0013
        L_0x03a5:
            java.lang.String r0 = r6.A0H()
            if (r0 == 0) goto L_0x03b8
            X.0Oa r2 = new X.0Oa
            r2.<init>(r3, r0)
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            goto L_0x004f
        L_0x03b8:
            r2 = r4
            goto L_0x004f
        L_0x03bb:
            r0 = 43
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x03c7
            X.0Fj r3 = X.C02230Fj.FOLLOWS
            goto L_0x003f
        L_0x03c7:
            r3 = r4
            goto L_0x0042
        L_0x03ca:
            java.lang.String r1 = "Invalid \".class\" simpleSelectors"
            X.0GN r0 = new X.0GN
            r0.<init>(r1)
            throw r0
        L_0x03d2:
            java.lang.String r1 = "Invalid \"#id\" simpleSelectors"
            X.0GN r0 = new X.0GN
            r0.<init>(r1)
            throw r0
        L_0x03da:
            X.0GN r0 = new X.0GN
            r0.<init>(r7)
            throw r0
        L_0x03e0:
            X.0GN r0 = new X.0GN
            r0.<init>(r7)
            throw r0
        L_0x03e6:
            X.0GN r0 = new X.0GN
            r0.<init>(r7)
            throw r0
        L_0x03ec:
            r0 = r22
            r6.A01 = r0
        L_0x03f0:
            r0 = r20
            java.lang.String r1 = X.AnonymousClass000.A0T(r0, r10)
            X.0GN r0 = new X.0GN
            r0.<init>(r1)
            throw r0
        L_0x03fc:
            java.lang.String r1 = "Invalid pseudo class"
            X.0GN r0 = new X.0GN
            r0.<init>(r1)
            throw r0
        L_0x0404:
            r0 = r28
            r6.A01 = r0
        L_0x0408:
            java.util.List r0 = r5.A01
            if (r0 == 0) goto L_0x0417
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0417
            r0 = r21
            r0.add(r5)
        L_0x0417:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01880Co.A0I():java.util.List");
    }
}
