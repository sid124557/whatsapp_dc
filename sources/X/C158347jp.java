package X;

import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: X.7jp  reason: invalid class name and case insensitive filesystem */
public class C158347jp {
    public final C153697bn A00;
    public final LinkedList A01;

    public static C151637Vo A00(String str, C181468mo... r5) {
        try {
            C153697bn r3 = new C153697bn(str);
            r3.A05();
            CharSequence charSequence = r3.A02;
            if (!(charSequence.charAt(0) == '$' || charSequence.charAt(0) == '@')) {
                r3 = new C153697bn(AnonymousClass000.A0V("$.", str, AnonymousClass001.A0o()));
                r3.A05();
            }
            if (r3.A02.charAt(r3.A00) != '.') {
                return new C158347jp(r3, new LinkedList(Arrays.asList(r5))).A01();
            }
            throw C131316dO.A00("Path must not end with a '.' or '..'");
        } catch (Exception e) {
            if (!(e instanceof C131316dO)) {
                throw new C131316dO((Throwable) e);
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r2 == '@') goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C151637Vo A01() {
        /*
            r5 = this;
        L_0x0000:
            X.7bn r3 = r5.A00
            int r1 = r3.A01
            boolean r0 = r3.A09(r1)
            if (r0 == 0) goto L_0x0027
            java.lang.CharSequence r0 = r3.A02
            char r1 = r0.charAt(r1)
            r0 = 32
            if (r1 == r0) goto L_0x0020
            r0 = 9
            if (r1 == r0) goto L_0x0020
            r0 = 10
            if (r1 == r0) goto L_0x0020
            r0 = 13
            if (r1 != r0) goto L_0x0027
        L_0x0020:
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            goto L_0x0000
        L_0x0027:
            java.lang.CharSequence r4 = r3.A02
            int r0 = r3.A01
            char r2 = r4.charAt(r0)
            r0 = 36
            if (r2 == r0) goto L_0x0038
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0099
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            X.6ds r2 = new X.6ds
            r2.<init>(r0)
            int r1 = r3.A01
            int r0 = r3.A00
            if (r1 >= r0) goto L_0x008b
            int r0 = r1 + 1
            r3.A01 = r0
            char r1 = r4.charAt(r0)
            r0 = 46
            if (r1 == r0) goto L_0x0083
            int r0 = r3.A01
            char r1 = r4.charAt(r0)
            r0 = 91
            if (r1 == r0) goto L_0x0083
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Illegal character at position "
            r1.append(r0)
            int r0 = r3.A01
            r1.append(r0)
            java.lang.String r0 = " expected '.' or '['"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x0083:
            X.7RV r0 = new X.7RV
            r0.<init>(r2)
            r5.A02(r0)
        L_0x008b:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "$"
            boolean r1 = r1.equals(r0)
            X.7Vo r0 = new X.7Vo
            r0.<init>(r2, r1)
            return r0
        L_0x0099:
            java.lang.String r0 = "Path must start with '$' or '@'"
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158347jp.A01():X.7Vo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x028c, code lost:
        if (r0 == false) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0615, code lost:
        if (r1 < r8.A00) goto L_0x0624;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00da, code lost:
        if (r1 == '@') goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0268  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.AnonymousClass7RV r26) {
        /*
            r25 = this;
            r9 = r25
            X.7bn r8 = r9.A00
            java.lang.CharSequence r7 = r8.A02
            int r0 = r8.A01
            char r2 = r7.charAt(r0)
            r0 = 42
            java.lang.String r14 = "Could not parse token starting at position "
            r6 = 1
            r10 = r26
            if (r2 == r0) goto L_0x0288
            r1 = 46
            if (r2 == r1) goto L_0x022d
            r11 = 91
            boolean r0 = r8.A07(r11)
            if (r2 == r11) goto L_0x0298
            if (r0 != 0) goto L_0x028e
            r0 = 42
            boolean r0 = r8.A07(r0)
            if (r0 != 0) goto L_0x028e
            boolean r0 = r8.A07(r1)
            if (r0 != 0) goto L_0x028e
            r3 = 32
            boolean r0 = r8.A07(r3)
            if (r0 != 0) goto L_0x028e
            int r0 = r8.A01
            r24 = r0
            r2 = r0
        L_0x003e:
            boolean r0 = r8.A09(r2)
            r12 = 40
            if (r0 == 0) goto L_0x01a6
            char r0 = r7.charAt(r2)
            if (r0 == r3) goto L_0x0219
            if (r0 == r1) goto L_0x01a4
            if (r0 == r11) goto L_0x01a4
            if (r0 != r12) goto L_0x01a0
            r5 = r2
            r23 = 1
        L_0x0055:
            if (r5 != 0) goto L_0x005b
            int r0 = r8.A00
            int r5 = r0 + 1
        L_0x005b:
            r4 = 0
            if (r23 == 0) goto L_0x0215
            int r1 = r2 + 1
            r13 = r1
            r14 = 1
        L_0x0062:
            int r0 = r8.A00
            int r0 = r0 + 1
            r3 = 41
            if (r13 >= r0) goto L_0x01f8
            char r0 = r7.charAt(r13)
            if (r0 != r3) goto L_0x0192
            int r14 = r14 + -1
        L_0x0072:
            if (r14 != 0) goto L_0x019c
            boolean r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x01f4
            char r0 = r7.charAt(r1)
            if (r0 == r3) goto L_0x05ff
            int r0 = r5 + 1
            r8.A01 = r0
            r0 = r24
            java.lang.String r22 = X.AnonymousClass6CA.A0R(r7, r0, r5)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()
            r21 = 0
            r2 = 1
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
        L_0x009f:
            int r1 = r8.A01
            boolean r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x01d3
            if (r21 != 0) goto L_0x01d3
            char r1 = r7.charAt(r1)
            int r0 = r8.A01
            int r0 = r0 + 1
            r8.A01 = r0
            r14 = 34
            if (r19 != 0) goto L_0x00e9
            r0 = 32
            if (r1 == r0) goto L_0x009f
            r0 = 9
            if (r1 == r0) goto L_0x009f
            r0 = 10
            if (r1 == r0) goto L_0x009f
            r0 = 13
            if (r1 == r0) goto L_0x009f
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x018e
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x018e
            if (r14 == r1) goto L_0x018e
            r0 = 36
            if (r1 == r0) goto L_0x00dc
            r15 = 0
            r0 = 64
            if (r1 != r0) goto L_0x00dd
        L_0x00dc:
            r15 = 1
        L_0x00dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e9
            X.6vO r19 = X.C141326vO.PATH
        L_0x00e9:
            if (r1 == r14) goto L_0x016e
            r0 = 44
            if (r1 == r0) goto L_0x010c
            if (r1 == r11) goto L_0x016b
            r0 = 93
            if (r1 == r0) goto L_0x0166
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x0163
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L_0x015e
            if (r1 == r12) goto L_0x017c
            if (r1 != r3) goto L_0x017e
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0109
            r0 = r16
            if (r0 != r12) goto L_0x010c
        L_0x0109:
            r13.append(r1)
        L_0x010c:
            if (r17 != 0) goto L_0x017e
            if (r20 != 0) goto L_0x017e
            if (r18 != 0) goto L_0x017e
            if (r2 != 0) goto L_0x0159
            if (r3 != r1) goto L_0x017e
            r21 = 1
        L_0x0118:
            if (r19 == 0) goto L_0x014b
            int r14 = r19.ordinal()
            r0 = 0
            if (r14 == r0) goto L_0x014f
            if (r14 != r6) goto L_0x0141
            java.util.LinkedList r15 = X.AnonymousClass0x9.A18()
            java.lang.String r14 = r13.toString()
            X.7bn r0 = new X.7bn
            r0.<init>(r14)
            X.7jp r14 = new X.7jp
            r14.<init>(r0, r15)
            X.7Vo r0 = r14.A01()
            X.7pO r14 = new X.7pO
            r14.<init>((X.C151637Vo) r0)
        L_0x013e:
            r4.add(r14)
        L_0x0141:
            int r14 = r13.length()
            r0 = 0
            r13.delete(r0, r14)
            r19 = 0
        L_0x014b:
            r16 = r1
            goto L_0x009f
        L_0x014f:
            java.lang.String r0 = r13.toString()
            X.7pO r14 = new X.7pO
            r14.<init>((java.lang.String) r0)
            goto L_0x013e
        L_0x0159:
            if (r6 != r2) goto L_0x017e
            r21 = 0
            goto L_0x0118
        L_0x015e:
            if (r20 == 0) goto L_0x01ab
            int r20 = r20 + -1
            goto L_0x017e
        L_0x0163:
            int r20 = r20 + 1
            goto L_0x017e
        L_0x0166:
            if (r18 == 0) goto L_0x01bf
            int r18 = r18 + -1
            goto L_0x017e
        L_0x016b:
            int r18 = r18 + 1
            goto L_0x017e
        L_0x016e:
            r14 = 92
            r0 = r16
            if (r0 == r14) goto L_0x0179
            if (r17 <= 0) goto L_0x0179
            int r17 = r17 + -1
            goto L_0x017e
        L_0x0179:
            int r17 = r17 + 1
            goto L_0x017e
        L_0x017c:
            int r2 = r2 + 1
        L_0x017e:
            if (r19 == 0) goto L_0x014b
            r0 = 44
            if (r1 != r0) goto L_0x018a
            if (r20 != 0) goto L_0x018a
            if (r18 != 0) goto L_0x018a
            if (r6 == r2) goto L_0x014b
        L_0x018a:
            r13.append(r1)
            goto L_0x014b
        L_0x018e:
            X.6vO r19 = X.C141326vO.JSON
            goto L_0x00e9
        L_0x0192:
            char r0 = r7.charAt(r13)
            if (r0 != r12) goto L_0x019c
            int r14 = r14 + 1
            goto L_0x0072
        L_0x019c:
            int r13 = r13 + 1
            goto L_0x0062
        L_0x01a0:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x01a4:
            r5 = r2
            goto L_0x01a7
        L_0x01a6:
            r5 = 0
        L_0x01a7:
            r23 = 0
            goto L_0x0055
        L_0x01ab:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected close brace '}' at character position: "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x01bf:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected close bracket ']' at character position: "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x01d3:
            if (r20 != 0) goto L_0x01db
            if (r2 != 0) goto L_0x01db
            if (r18 != 0) goto L_0x01db
            goto L_0x0601
        L_0x01db:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Arguments to function: '"
            r1.append(r0)
            r0 = r22
            r1.append(r0)
            java.lang.String r0 = "' are not closed properly."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x01f4:
            r8.A01 = r2
            goto L_0x0601
        L_0x01f8:
            r0 = r24
            java.lang.String r2 = X.AnonymousClass6CA.A0R(r7, r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Arguments to function: '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "' are not closed properly."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x0215:
            r8.A01 = r5
            goto L_0x0601
        L_0x0219:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Use bracket notion ['my prop'] if your property contains blank characters. position: "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x022d:
            boolean r0 = r8.A07(r1)
            if (r0 == 0) goto L_0x025c
            int r0 = r8.A01
            int r2 = r0 + 1
            boolean r0 = r8.A09(r2)
            if (r0 == 0) goto L_0x025c
            char r0 = r7.charAt(r2)
            if (r0 != r1) goto L_0x025c
            X.6du r0 = new X.6du
            r0.<init>()
            r10.A00(r0)
            r2 = 2
        L_0x024c:
            int r0 = r8.A01
            int r0 = r0 + r2
            r8.A01 = r0
            boolean r0 = r8.A07(r1)
            if (r0 != 0) goto L_0x0268
            boolean r0 = r9.A02(r10)
            goto L_0x028c
        L_0x025c:
            int r0 = r8.A01
            int r0 = r0 + 1
            boolean r0 = r8.A09(r0)
            if (r0 == 0) goto L_0x0281
            r2 = 1
            goto L_0x024c
        L_0x0268:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Character '.' on position "
            r1.append(r0)
            int r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = " is not valid."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x0281:
            java.lang.String r0 = "Path must not end with a '."
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x0288:
            boolean r0 = r9.A03(r10)
        L_0x028c:
            if (r0 != 0) goto L_0x0617
        L_0x028e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            int r0 = r8.A01
            r1.append(r0)
            goto L_0x0309
        L_0x0298:
            if (r0 == 0) goto L_0x02a8
            int r0 = r8.A01
            char r2 = r8.A00(r0)
            r0 = 39
            if (r2 == r0) goto L_0x0564
            r0 = 34
            if (r2 == r0) goto L_0x0564
        L_0x02a8:
            boolean r0 = r8.A07(r11)
            r1 = 0
            if (r0 == 0) goto L_0x02c3
            int r0 = r8.A01
            char r2 = r8.A00(r0)
            boolean r0 = java.lang.Character.isDigit(r2)
            r13 = 58
            r5 = 45
            if (r0 != 0) goto L_0x0399
            if (r2 == r5) goto L_0x0399
            if (r2 == r13) goto L_0x0399
        L_0x02c3:
            boolean r0 = r9.A03(r10)
            if (r0 != 0) goto L_0x0617
            r0 = 91
            boolean r0 = r8.A07(r0)
            r11 = 0
            if (r0 != 0) goto L_0x0365
            r1 = 63
            int r0 = r8.A01
            boolean r0 = r8.A08(r1, r0)
            if (r0 != 0) goto L_0x0365
        L_0x02dc:
            r0 = 91
            boolean r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x02fb
            r1 = 63
            int r0 = r8.A01
            int r0 = r8.A02(r1, r0)
            r3 = -1
            if (r0 == r3) goto L_0x02fb
            char r1 = r8.A00(r0)
            r2 = 93
            if (r1 == r2) goto L_0x0312
            r0 = 44
            if (r1 == r0) goto L_0x0312
        L_0x02fb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)
            int r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = ". Expected ?, ', 0-9, * "
            r1.append(r0)
        L_0x0309:
            java.lang.String r0 = r1.toString()
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x0312:
            int r0 = r8.A01
            int r1 = r0 + 1
            r4 = r1
        L_0x0317:
            boolean r0 = r8.A09(r4)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02fb
            char r0 = r7.charAt(r4)
            if (r0 != r2) goto L_0x0362
            if (r4 == r3) goto L_0x02fb
            java.lang.String r2 = X.AnonymousClass6CA.A0R(r7, r1, r4)
            java.lang.String r0 = ","
            java.lang.String[] r12 = r2.split(r0)
            java.util.LinkedList r11 = r9.A01
            int r0 = r11.size()
            int r7 = r12.length
            if (r0 < r7) goto L_0x03ff
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r3 = 0
        L_0x033f:
            if (r3 >= r7) goto L_0x03f5
            r0 = r12[r3]
            if (r0 == 0) goto L_0x035e
            java.lang.String r2 = r0.trim()
            if (r2 == 0) goto L_0x035f
            r1 = r2
        L_0x034c:
            java.lang.String r0 = "?"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03e6
            java.lang.Object r0 = r11.pop()
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x033f
        L_0x035e:
            r2 = 0
        L_0x035f:
            java.lang.String r1 = ""
            goto L_0x034c
        L_0x0362:
            int r4 = r4 + 1
            goto L_0x0317
        L_0x0365:
            int r4 = r8.A01
            r0 = 63
            int r0 = r8.A02(r0, r4)
            r3 = -1
            if (r0 == r3) goto L_0x02dc
            r2 = 40
            int r1 = r8.A02(r2, r0)
            if (r1 == r3) goto L_0x02dc
            r0 = 41
            int r2 = r8.A01(r2, r0, r1, r6)
            if (r2 == r3) goto L_0x02dc
            r1 = 93
            boolean r0 = r8.A08(r1, r2)
            if (r0 == 0) goto L_0x02dc
            int r0 = r8.A02(r1, r2)
            int r3 = r0 + 1
            java.lang.String r0 = X.AnonymousClass6CA.A0R(r7, r4, r3)
            X.7jj r4 = new X.7jj
            r4.<init>(r0)
            goto L_0x041b
        L_0x0399:
            int r0 = r8.A01
            int r3 = r0 + 1
            r4 = r3
            r2 = 93
        L_0x03a0:
            boolean r0 = r8.A09(r4)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02c3
            char r0 = r7.charAt(r4)
            if (r0 != r2) goto L_0x03e3
            r0 = -1
            if (r4 == r0) goto L_0x02c3
            java.lang.String r0 = X.AnonymousClass6CA.A0R(r7, r3, r4)
            java.lang.String r11 = r0.trim()
            java.lang.String r0 = "*"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x02c3
            r12 = 0
        L_0x03c2:
            int r3 = r11.length()
            if (r12 >= r3) goto L_0x0487
            char r2 = r11.charAt(r12)
            boolean r0 = java.lang.Character.isDigit(r2)
            if (r0 != 0) goto L_0x03e0
            r0 = 44
            if (r2 == r0) goto L_0x03e0
            if (r2 == r5) goto L_0x03e0
            if (r2 == r13) goto L_0x03e0
            r0 = 32
            if (r2 == r0) goto L_0x03e0
            goto L_0x02c3
        L_0x03e0:
            int r12 = r12 + 1
            goto L_0x03c2
        L_0x03e3:
            int r4 = r4 + 1
            goto L_0x03a0
        L_0x03e6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Expected '?' but found "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x03f5:
            X.6dt r0 = new X.6dt
            r0.<init>((java.util.Collection) r5)
            r10.A00(r0)
            goto L_0x055e
        L_0x03ff:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Not enough predicates supplied for filter ["
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "] at position "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x041b:
            X.8DK r2 = r4.A02()     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            X.7bn r7 = r4.A00     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            r7.A04()     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            int r5 = r7.A01     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            boolean r0 = r7.A09(r5)     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            if (r0 != 0) goto L_0x0440
            X.8DL r1 = new X.8DL
            r1.<init>(r2)
            X.6dt r0 = new X.6dt
            r0.<init>((X.C181468mo) r1)
            r10.A00(r0)
            r8.A01 = r3
            int r0 = r8.A00
            if (r3 < r0) goto L_0x0624
            return r6
        L_0x0440:
            java.lang.String r3 = "Expected end of filter expression instead of: %s"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            int r0 = r7.A00     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            int r1 = r0 + 1
            java.lang.CharSequence r0 = r7.A02     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            java.lang.CharSequence r0 = r0.subSequence(r5, r1)     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            r2[r11] = r0     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            java.lang.String r0 = java.lang.String.format(r3, r2)     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            X.6dO r0 = X.C131316dO.A00(r0)     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
            throw r0     // Catch:{ 6dO -> 0x0485, Exception -> 0x0459 }
        L_0x0459:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to parse filter: "
            r3.append(r0)
            X.7bn r2 = r4.A00
            r3.append(r2)
            java.lang.String r0 = ", error on position: "
            r3.append(r0)
            int r1 = r2.A01
            r3.append(r1)
            java.lang.String r0 = ", char: "
            r3.append(r0)
            java.lang.CharSequence r0 = r2.A02
            char r0 = r0.charAt(r1)
            java.lang.String r0 = X.AnonymousClass001.A0j(r3, r0)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x0485:
            r0 = move-exception
            throw r0
        L_0x0487:
            java.lang.String r14 = ":"
            boolean r0 = r11.contains(r14)
            r12 = 0
            if (r0 == 0) goto L_0x04fe
        L_0x0490:
            java.lang.String r7 = "Failed to parse SliceOperation: "
            if (r12 >= r3) goto L_0x04ae
            char r2 = r11.charAt(r12)
            boolean r0 = java.lang.Character.isDigit(r2)
            if (r0 != 0) goto L_0x04ab
            if (r2 == r5) goto L_0x04ab
            if (r2 == r13) goto L_0x04ab
            java.lang.String r0 = X.AnonymousClass000.A0T(r7, r11)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x04ab:
            int r12 = r12 + 1
            goto L_0x0490
        L_0x04ae:
            java.lang.String[] r13 = r11.split(r14)
            int r12 = r13.length
            r5 = 0
            if (r12 <= r1) goto L_0x04f5
            r1 = r13[r1]
            java.lang.String r3 = ""
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x04ec
            r2 = r5
        L_0x04c1:
            if (r12 <= r6) goto L_0x04d3
            r1 = r13[r6]
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x04d3
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x04d3:
            if (r2 == 0) goto L_0x04e7
            if (r5 != 0) goto L_0x04e4
            X.6vc r1 = X.C141466vc.SLICE_FROM
        L_0x04d9:
            X.7St r0 = new X.7St
            r0.<init>(r1, r2, r5)
            X.6dn r1 = new X.6dn
            r1.<init>(r0)
            goto L_0x055b
        L_0x04e4:
            X.6vc r1 = X.C141466vc.SLICE_BETWEEN
            goto L_0x04d9
        L_0x04e7:
            if (r5 == 0) goto L_0x04f5
            X.6vc r1 = X.C141466vc.SLICE_TO
            goto L_0x04d9
        L_0x04ec:
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x04c1
        L_0x04f5:
            java.lang.String r0 = X.AnonymousClass000.A0T(r7, r11)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x04fe:
            if (r1 >= r3) goto L_0x0526
            char r2 = r11.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r2)
            if (r0 != 0) goto L_0x0523
            r0 = 44
            if (r2 == r0) goto L_0x0523
            r0 = 32
            if (r2 == r0) goto L_0x0523
            if (r2 == r5) goto L_0x0523
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to parse ArrayIndexOperation: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r11, r1)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x0523:
            int r1 = r1 + 1
            goto L_0x04fe
        L_0x0526:
            java.util.regex.Pattern r1 = X.C157237hy.A01
            r0 = -1
            java.lang.String[] r5 = r1.split(r11, r0)
            int r2 = r5.length
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r2)
        L_0x0532:
            if (r12 >= r2) goto L_0x0551
            r3 = r5[r12]
            int r0 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0540 }
            X.C18270x1.A1K(r1, r0)     // Catch:{ Exception -> 0x0540 }
            int r12 = r12 + 1
            goto L_0x0532
        L_0x0540:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to parse token in ArrayIndexOperation: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)
            X.6dO r0 = new X.6dO
            r0.<init>(r1, r2)
            throw r0
        L_0x0551:
            X.7hy r0 = new X.7hy
            r0.<init>(r1)
            X.6dm r1 = new X.6dm
            r1.<init>(r0)
        L_0x055b:
            r10.A00(r1)
        L_0x055e:
            int r1 = r4 + 1
            r8.A01 = r1
            goto L_0x0613
        L_0x0564:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            int r0 = r8.A01
            int r4 = r0 + 1
            r11 = r4
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
        L_0x0572:
            boolean r0 = r8.A09(r4)
            r12 = 93
            if (r0 == 0) goto L_0x058c
            char r5 = r7.charAt(r4)
            if (r16 == 0) goto L_0x0585
            r16 = 0
        L_0x0582:
            int r4 = r4 + 1
            goto L_0x0572
        L_0x0585:
            r0 = 92
            if (r0 != r5) goto L_0x059c
            r16 = 1
            goto L_0x0582
        L_0x058c:
            if (r15 == 0) goto L_0x05ee
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Property has not been closed - missing closing "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass001.A0j(r1, r2)
            goto L_0x05a8
        L_0x059c:
            java.lang.String r0 = "Found empty property at index "
            if (r5 != r12) goto L_0x05ad
            if (r15 != 0) goto L_0x0582
            if (r14 == 0) goto L_0x05ee
            java.lang.String r0 = X.C18260x0.A05(r0, r4)
        L_0x05a8:
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x05ad:
            r1 = 44
            if (r5 != r2) goto L_0x05dd
            if (r15 == 0) goto L_0x05d8
            char r0 = r8.A00(r4)
            if (r0 == r12) goto L_0x05ca
            if (r0 == r1) goto L_0x05ca
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Property must be separated by comma or Property must be terminated close square bracket at index "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x05ca:
            java.lang.String r0 = X.AnonymousClass6CA.A0R(r7, r11, r4)
            java.lang.String r0 = X.C160947oi.A01(r0)
            r3.add(r0)
            r13 = r4
            r15 = 0
            goto L_0x0582
        L_0x05d8:
            int r11 = r4 + 1
            r15 = 1
            r14 = 0
            goto L_0x0582
        L_0x05dd:
            if (r5 != r1) goto L_0x0582
            if (r15 != 0) goto L_0x0582
            if (r14 == 0) goto L_0x05ec
            java.lang.String r0 = X.C18260x0.A05(r0, r4)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x05ec:
            r14 = 1
            goto L_0x0582
        L_0x05ee:
            int r0 = r8.A02(r12, r13)
            int r0 = r0 + 1
            r8.A01 = r0
            X.6dq r0 = new X.6dq
            r0.<init>(r3, r2)
            r10.A00(r0)
            goto L_0x0611
        L_0x05ff:
            r8.A01 = r1
        L_0x0601:
            r0 = r24
            java.lang.String r0 = X.AnonymousClass6CA.A0R(r7, r0, r5)
            if (r23 == 0) goto L_0x0618
            X.6dr r2 = new X.6dr
            r2.<init>(r0, r4)
        L_0x060e:
            r10.A00(r2)
        L_0x0611:
            int r1 = r8.A01
        L_0x0613:
            int r0 = r8.A00
            if (r1 < r0) goto L_0x0624
        L_0x0617:
            return r6
        L_0x0618:
            r1 = 39
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.6dq r2 = new X.6dq
            r2.<init>(r0, r1)
            goto L_0x060e
        L_0x0624:
            r9.A02(r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158347jp.A02(X.7RV):boolean");
    }

    public final boolean A03(AnonymousClass7RV r6) {
        C153697bn r3 = this.A00;
        boolean A07 = r3.A07('[');
        if (A07 && !r3.A08('*', r3.A01)) {
            return false;
        }
        if (!r3.A07('*') && (!r3.A09(r3.A01 + 1))) {
            return false;
        }
        int i = r3.A01;
        if (A07) {
            int A02 = r3.A02('*', i);
            if (r3.A08(']', A02)) {
                i = r3.A02(']', A02);
            } else {
                throw C131316dO.A00(AnonymousClass000.A0Y("Expected wildcard token to end with ']' on position ", AnonymousClass001.A0o(), A02 + 1));
            }
        }
        int i2 = i + 1;
        r3.A01 = i2;
        r6.A00(new C131586dp());
        if (i2 >= r3.A00) {
            return true;
        }
        A02(r6);
        return true;
    }

    public C158347jp(C153697bn r1, LinkedList linkedList) {
        this.A01 = linkedList;
        this.A00 = r1;
    }
}
