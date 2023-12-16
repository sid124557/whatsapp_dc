package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* renamed from: X.7jj  reason: invalid class name and case insensitive filesystem */
public class C158287jj {
    public C153697bn A00;

    public static final boolean A00(char c) {
        if (c == '<' || c == '>' || c == '=' || c == '~' || c == '!') {
            return true;
        }
        return false;
    }

    public final AnonymousClass8DK A01() {
        C131426dZ r0;
        C153697bn r7 = this.A00;
        r7.A04();
        int i = r7.A01;
        r7.A04();
        if (r7.A07('!')) {
            r7.A06('!');
            r7.A04();
            char charAt = r7.A02.charAt(r7.A01);
            if (charAt != '$' && charAt != '@') {
                return new C131386dV(A01(), C142786xm.NOT);
            }
            r7.A01 = i;
        }
        r7.A04();
        if (r7.A07('(')) {
            r7.A06('(');
            AnonymousClass8DK A02 = A02();
            r7.A06(')');
            return A02;
        }
        C159187lJ A03 = A03();
        try {
            r7.A04();
            int i2 = r7.A01;
            CharSequence charSequence = r7.A02;
            if (!A00(charSequence.charAt(i2))) {
                while (true) {
                    int i3 = r7.A01;
                    if (!r7.A09(i3) || charSequence.charAt(i3) == ' ') {
                        break;
                    }
                    r7.A01++;
                }
            } else {
                while (true) {
                    int i4 = r7.A01;
                    if (!r7.A09(i4) || !A00(charSequence.charAt(i4))) {
                        break;
                    }
                    r7.A01++;
                }
            }
            String A0R = AnonymousClass6CA.A0R(charSequence, i2, r7.A01);
            String upperCase = A0R.toUpperCase(Locale.ROOT);
            for (C142796xn r1 : C142796xn.values()) {
                if (r1.operatorString.equals(upperCase)) {
                    return new C131376dU(r1, A03, A03());
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Filter operator ");
            A0o.append(A0R);
            throw C131316dO.A00(AnonymousClass000.A0X(" is not supported!", A0o));
        } catch (C131316dO unused) {
            r7.A01 = r7.A01;
            if (A03 instanceof C131436da) {
                C131436da r5 = (C131436da) A03;
                C131436da r2 = new C131436da(r5.A00, true, r5.A02);
                C142796xn r12 = C142796xn.EXISTS;
                if (r2.A02) {
                    r0 = C186738vr.A01;
                } else {
                    r0 = C186738vr.A00;
                }
                return new C131376dU(r12, r2, r0);
            }
            throw C131316dO.A00("Expected path node");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0283, code lost:
        if (r1 != false) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r2 != '{') goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016d, code lost:
        if ((0 | r1.code) <= 0) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016f, code lost:
        r11 = r11 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C159187lJ A03() {
        /*
            r14 = this;
            X.7bn r8 = r14.A00
            r8.A04()
            java.lang.CharSequence r9 = r8.A02
            int r0 = r8.A01
            char r0 = r9.charAt(r0)
            r3 = 64
            r2 = 36
            r7 = 33
            if (r0 == r7) goto L_0x01cc
            if (r0 == r2) goto L_0x01f4
            if (r0 == r3) goto L_0x01f4
            r8.A04()
            int r0 = r8.A01
            char r2 = r9.charAt(r0)
            r4 = 34
            if (r2 == r4) goto L_0x019d
            r4 = 39
            if (r2 == r4) goto L_0x019d
            r0 = 45
            if (r2 == r0) goto L_0x0046
            r0 = 47
            if (r2 == r0) goto L_0x0139
            r0 = 91
            if (r2 == r0) goto L_0x0104
            r0 = 102(0x66, float:1.43E-43)
            if (r2 == r0) goto L_0x00b3
            r1 = 110(0x6e, float:1.54E-43)
            if (r2 == r1) goto L_0x007c
            r0 = 116(0x74, float:1.63E-43)
            if (r2 == r0) goto L_0x00b3
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L_0x0104
        L_0x0046:
            int r2 = r8.A01
            r1 = r2
        L_0x0049:
            boolean r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x0070
            char r1 = r9.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x0069
            r0 = 45
            if (r1 == r0) goto L_0x0069
            r0 = 46
            if (r1 == r0) goto L_0x0069
            r0 = 69
            if (r1 == r0) goto L_0x0069
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L_0x0070
        L_0x0069:
            int r0 = r8.A01
            int r1 = r0 + 1
            r8.A01 = r1
            goto L_0x0049
        L_0x0070:
            int r0 = r8.A01
            java.lang.CharSequence r0 = r9.subSequence(r2, r0)
            X.6df r2 = new X.6df
            r2.<init>((java.lang.CharSequence) r0)
            return r2
        L_0x007c:
            int r0 = r8.A01
            char r0 = r9.charAt(r0)
            if (r0 != r1) goto L_0x00ac
            int r1 = r8.A01
            int r0 = r1 + 3
            boolean r0 = r8.A09(r0)
            if (r0 == 0) goto L_0x00ac
            int r0 = r1 + 4
            java.lang.CharSequence r2 = r9.subSequence(r1, r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ac
            int r1 = r2.length()
            int r0 = r8.A01
            int r0 = r0 + r1
            r8.A01 = r0
            X.6dW r2 = X.C186738vr.A02
            return r2
        L_0x00ac:
            java.lang.String r0 = "Expected <null> value"
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x00b3:
            int r4 = r8.A01
            char r3 = r9.charAt(r4)
            int r1 = r8.A01
            r0 = 116(0x74, float:1.63E-43)
            int r2 = r1 + 4
            if (r3 != r0) goto L_0x00c3
            int r2 = r1 + 3
        L_0x00c3:
            boolean r0 = r8.A09(r2)
            java.lang.String r1 = "Expected boolean literal"
            if (r0 == 0) goto L_0x00ff
            int r0 = r2 + 1
            java.lang.CharSequence r2 = r9.subSequence(r4, r0)
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = "false"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00e6
            X.6dO r0 = X.C131316dO.A00(r1)
            throw r0
        L_0x00e6:
            int r1 = r2.length()
            int r0 = r8.A01
            int r0 = r0 + r1
            r8.A01 = r0
            java.lang.String r0 = r2.toString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x00fc
            X.6dZ r2 = X.C186738vr.A01
            return r2
        L_0x00fc:
            X.6dZ r2 = X.C186738vr.A00
            return r2
        L_0x00ff:
            X.6dO r0 = X.C131316dO.A00(r1)
            throw r0
        L_0x0104:
            int r4 = r8.A01
            char r3 = r9.charAt(r4)
            r0 = 91
            r2 = 125(0x7d, float:1.75E-43)
            if (r3 != r0) goto L_0x0112
            r2 = 93
        L_0x0112:
            int r1 = r8.A01
            r0 = 0
            int r1 = r8.A01(r3, r2, r1, r0)
            r0 = -1
            if (r1 == r0) goto L_0x012a
            int r0 = r1 + 1
            r8.A01 = r0
            java.lang.CharSequence r0 = r9.subSequence(r4, r0)
            X.6de r2 = new X.6de
            r2.<init>((java.lang.CharSequence) r0)
            return r2
        L_0x012a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "String not closed. Expected ' in "
            java.lang.String r0 = X.AnonymousClass000.A0P(r8, r0, r1)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x0139:
            int r7 = r8.A01
            int r10 = r8.A03(r0, r7)
            r0 = -1
            if (r10 == r0) goto L_0x018e
            int r12 = r10 + 1
            boolean r0 = r8.A09(r12)
            if (r0 == 0) goto L_0x0180
            r11 = r12
            r0 = 1
            char[] r6 = new char[r0]
        L_0x014e:
            boolean r0 = r8.A09(r11)
            if (r0 == 0) goto L_0x0175
            char r13 = r9.charAt(r11)
            r0 = 0
            r6[r0] = r13
            r5 = 0
            X.6xV[] r4 = X.C142626xV.values()
            int r3 = r4.length
            r2 = 0
        L_0x0162:
            if (r2 >= r3) goto L_0x0175
            r1 = r4[r2]
            char r0 = r1.flag
            if (r0 != r13) goto L_0x0172
            int r0 = r1.code
            r5 = r5 | r0
            if (r5 <= 0) goto L_0x0175
            int r11 = r11 + 1
            goto L_0x014e
        L_0x0172:
            int r2 = r2 + 1
            goto L_0x0162
        L_0x0175:
            if (r11 <= r10) goto L_0x0180
            java.lang.CharSequence r0 = r9.subSequence(r12, r11)
            int r0 = r0.length()
            int r10 = r10 + r0
        L_0x0180:
            int r0 = r10 + 1
            r8.A01 = r0
            java.lang.CharSequence r0 = r9.subSequence(r7, r0)
            X.6dd r2 = new X.6dd
            r2.<init>((java.lang.CharSequence) r0)
            return r2
        L_0x018e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Pattern not closed. Expected / in "
            java.lang.String r0 = X.AnonymousClass000.A0P(r8, r0, r1)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x019d:
            int r3 = r8.A01
            int r2 = r8.A03(r4, r3)
            r0 = -1
            if (r2 == r0) goto L_0x01b5
            r1 = 1
            int r0 = r2 + 1
            r8.A01 = r0
            java.lang.CharSequence r0 = r9.subSequence(r3, r0)
            X.6db r2 = new X.6db
            r2.<init>(r0, r1)
            return r2
        L_0x01b5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "String literal does not have matching quotes. Expected "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " in "
            java.lang.String r0 = X.AnonymousClass000.A0P(r8, r0, r1)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x01cc:
            r1 = 1
            int r0 = r8.A01
            int r0 = r0 + 1
            r8.A01 = r0
            r8.A04()
            int r0 = r8.A01
            char r0 = r9.charAt(r0)
            if (r0 == r2) goto L_0x01f4
            if (r0 == r3) goto L_0x01f4
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            java.lang.Character r0 = java.lang.Character.valueOf(r7)
            r2[r1] = r0
            java.lang.String r0 = "Unexpected character: %c"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        L_0x01f4:
            int r2 = r8.A01
        L_0x01f6:
            int r2 = r2 + -1
            boolean r0 = r8.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0209
            char r1 = r9.charAt(r2)
            r0 = 32
            if (r1 != r0) goto L_0x0209
            goto L_0x01f6
        L_0x0209:
            boolean r0 = r8.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02cd
            r0 = -1
            if (r2 == r0) goto L_0x02cd
            char r10 = r9.charAt(r2)
        L_0x0218:
            int r6 = r8.A01
            r5 = 1
        L_0x021b:
            int r0 = r8.A01
            int r1 = r0 + 1
            r8.A01 = r1
            boolean r0 = r8.A09(r1)
            r4 = 0
            if (r0 == 0) goto L_0x02a4
            char r0 = r9.charAt(r1)
            r2 = 91
            if (r0 != r2) goto L_0x023f
            int r1 = r8.A01
            r0 = 93
            int r1 = r8.A01(r2, r0, r1, r4)
            r0 = -1
            if (r1 == r0) goto L_0x02d1
            int r0 = r1 + 1
            r8.A01 = r0
        L_0x023f:
            int r0 = r8.A01
            char r0 = r9.charAt(r0)
            r3 = 41
            if (r0 != r3) goto L_0x0279
            int r0 = r8.A01
            char r0 = r9.charAt(r0)
            if (r0 != r3) goto L_0x0279
            int r2 = r8.A01
        L_0x0253:
            int r2 = r2 + -1
            boolean r0 = r8.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0266
            char r1 = r9.charAt(r2)
            r0 = 32
            if (r1 != r0) goto L_0x0266
            goto L_0x0253
        L_0x0266:
            boolean r0 = r8.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0279
            r0 = -1
            if (r2 == r0) goto L_0x0279
            char r1 = r9.charAt(r2)
            r0 = 40
            if (r1 == r0) goto L_0x02b9
        L_0x0279:
            r1 = 0
        L_0x027a:
            int r0 = r8.A01
            char r0 = r9.charAt(r0)
            if (r0 != r3) goto L_0x0285
            r2 = 1
            if (r1 == 0) goto L_0x0286
        L_0x0285:
            r2 = 0
        L_0x0286:
            int r1 = r8.A01
            boolean r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x02a4
            char r0 = r9.charAt(r1)
            boolean r0 = A00(r0)
            if (r0 != 0) goto L_0x02a4
            int r0 = r8.A01
            char r1 = r9.charAt(r0)
            r0 = 32
            if (r1 == r0) goto L_0x02a4
            if (r2 == 0) goto L_0x021b
        L_0x02a4:
            if (r10 != r7) goto L_0x02a7
            r5 = 0
        L_0x02a7:
            int r0 = r8.A01
            java.lang.String r1 = X.AnonymousClass6CA.A0R(r9, r6, r0)
            X.8mo[] r0 = new X.C181468mo[r4]
            X.7Vo r0 = X.C158347jp.A00(r1, r0)
            X.6da r2 = new X.6da
            r2.<init>(r0, r4, r5)
            return r2
        L_0x02b9:
            int r2 = r2 + -1
            boolean r0 = r8.A09(r2)
            if (r0 == 0) goto L_0x0279
            if (r2 <= r6) goto L_0x0279
            char r1 = r9.charAt(r2)
            r0 = 46
            if (r1 != r0) goto L_0x02b9
            r1 = 1
            goto L_0x027a
        L_0x02cd:
            r10 = 32
            goto L_0x0218
        L_0x02d1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Square brackets does not match in filter "
            java.lang.String r0 = X.AnonymousClass000.A0P(r8, r0, r1)
            X.6dO r0 = X.C131316dO.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158287jj.A03():X.7lJ");
    }

    public C158287jj(String str) {
        C153697bn r0 = new C153697bn(str);
        this.A00 = r0;
        r0.A05();
        if (this.A00.A07('[')) {
            C153697bn r02 = this.A00;
            if (r02.A02.charAt(r02.A00) == ']') {
                C153697bn r2 = this.A00;
                r2.A01++;
                r2.A00--;
                r2.A05();
                if (this.A00.A07('?')) {
                    C153697bn r1 = this.A00;
                    r1.A01++;
                    r1.A05();
                    if (this.A00.A07('(')) {
                        C153697bn r03 = this.A00;
                        if (r03.A02.charAt(r03.A00) == ')') {
                            return;
                        }
                    }
                    throw C131316dO.A00(AnonymousClass000.A0V("Filter must start with '[?(' and end with ')]'. ", str, AnonymousClass001.A0o()));
                }
                throw C131316dO.A00(AnonymousClass000.A0V("Filter must start with '[?' and end with ']'. ", str, AnonymousClass001.A0o()));
            }
        }
        throw C131316dO.A00(AnonymousClass000.A0V("Filter must start with '[' and end with ']'. ", str, AnonymousClass001.A0o()));
    }

    public final AnonymousClass8DK A02() {
        C153697bn r4;
        int i;
        C142786xm r1;
        Object r0;
        int i2;
        C142786xm r12;
        ArrayList A0s = AnonymousClass001.A0s();
        do {
            ArrayList A0s2 = AnonymousClass001.A0s();
            do {
                A0s2.add(A01());
                r4 = this.A00;
                i = r4.A01;
                r1 = C142786xm.AND;
            } while (r4.A0A(r1.operatorString));
            r4.A01 = i;
            if (1 == A0s2.size()) {
                r0 = AnonymousClass0x9.A0t(A0s2);
            } else {
                r0 = new C131386dV(r1, (Collection) A0s2);
            }
            A0s.add(r0);
            i2 = r4.A01;
            r12 = C142786xm.OR;
        } while (r4.A0A(r12.operatorString));
        r4.A01 = i2;
        if (1 == A0s.size()) {
            return (AnonymousClass8DK) AnonymousClass0x9.A0t(A0s);
        }
        return new C131386dV(r12, (Collection) A0s);
    }
}
