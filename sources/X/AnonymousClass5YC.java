package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

/* renamed from: X.5YC  reason: invalid class name */
public final class AnonymousClass5YC {
    public static final Map A0A;
    public ArrayList A00;
    public ArrayList A01;
    public final HashMap A02 = AnonymousClass001.A0t();
    public final HashMap A03 = AnonymousClass001.A0t();
    public final HashSet A04 = AnonymousClass002.A0K();
    public final HashSet A05 = AnonymousClass002.A0K();
    public final Vector A06 = new Vector();
    public final Vector A07 = new Vector();
    public final Vector A08 = new Vector();
    public final Vector A09 = new Vector();

    static {
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[5];
        AnonymousClass3Z6.A04(AnonymousClass3Z6.A02("min", 2), "MIN", r2);
        AnonymousClass3Z6.A05(AnonymousClass3Z6.A02("max", 2), "MAX", r2);
        AnonymousClass3Z6.A09(AnonymousClass3Z6.A02("log", 2), "LOG", r2, 2);
        AnonymousClass3Z6.A07(AnonymousClass3Z6.A02("pow", 2), "POW", r2);
        AnonymousClass3Z6.A08(AnonymousClass3Z6.A02("mod", 2), "MOD", r2);
        A0A = C73813g7.A0F(r2);
    }

    public final double A00(String str) {
        HashMap hashMap = this.A03;
        if (hashMap.containsKey(str)) {
            if (!this.A04.contains(str)) {
                ArrayList arrayList = this.A00;
                if (arrayList == null) {
                    throw C18270x1.A0S("isComputedFeatureEvaluated");
                }
                HashMap hashMap2 = this.A02;
                C162457s7.A0J(hashMap2, 0);
                if (!AnonymousClass001.A1Z(C86654Ky.A0j(arrayList, AnonymousClass001.A0K(C57692u3.A02(hashMap2, str))))) {
                    A0B(AnonymousClass001.A0K(C57692u3.A02(hashMap2, str)));
                }
            }
            ArrayList arrayList2 = this.A01;
            if (arrayList2 != null) {
                return ((Number) C86654Ky.A0j(arrayList2, AnonymousClass001.A0K(C57692u3.A02(hashMap, str)))).doubleValue();
            }
            throw C18270x1.A0S("outputValues");
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Symbol ");
        A0o.append(str);
        throw C118205tA.A00(" does not exist.", A0o);
    }

    public final int A01(C998858o r3, int i, int i2) {
        Vector vector = this.A07;
        vector.add(new C107095ag(r3, i, i2));
        return C86664Kz.A0M(vector);
    }

    public final int A09(String str, boolean z) {
        HashMap hashMap = this.A03;
        if (!hashMap.containsKey(str)) {
            Vector vector = this.A07;
            vector.add(new C107095ag());
            int A0M = C86664Kz.A0M(vector);
            AnonymousClass0x2.A1I(str, hashMap, A0M);
            if (z) {
                this.A04.add(str);
            }
            return A0M;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Multiple declarations of symbol ");
        A0o.append(str);
        throw C118205tA.A00(" found in the configuration file.", A0o);
    }

    public final C107095ag A0A(int i) {
        if (i >= 0) {
            Vector vector = this.A07;
            if (i < vector.size()) {
                return (C107095ag) C86654Ky.A0j(vector, i);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("getNodeByIndex was called with unexpected index=");
        A0o.append(i);
        A0o.append(", size of allNodes is ");
        throw new C118205tA(AnonymousClass000.A0h(A0o, this.A07.size()));
    }

    public final void A0B(int i) {
        Iterator it = ((AbstractCollection) this.A08.get(i)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            ArrayList arrayList = this.A00;
            if (arrayList == null) {
                throw C18270x1.A0S("isComputedFeatureEvaluated");
            }
            int A072 = C86644Kx.A07(number);
            if (!AnonymousClass001.A1Z(arrayList.get(A072))) {
                A0B(A072);
            }
        }
        AnonymousClass3Z6 r1 = (AnonymousClass3Z6) this.A06.get(i);
        int A0K = AnonymousClass001.A0K(r1.first);
        int A0K2 = AnonymousClass001.A0K(r1.second);
        ArrayList arrayList2 = this.A01;
        if (arrayList2 == null) {
            throw C18270x1.A0S("outputValues");
        }
        C107095ag A0A2 = A0A(A0K2);
        ArrayList arrayList3 = this.A01;
        if (arrayList3 == null) {
            throw C18270x1.A0S("outputValues");
        }
        arrayList2.set(A0K, Double.valueOf(A0A2.A03(this, arrayList3, A0K2)));
        ArrayList arrayList4 = this.A00;
        if (arrayList4 == null) {
            throw C18270x1.A0S("isComputedFeatureEvaluated");
        }
        arrayList4.set(i, Boolean.TRUE);
        ArrayList arrayList5 = this.A01;
        if (arrayList5 == null) {
            throw C18270x1.A0S("outputValues");
        }
        ((Number) C86654Ky.A0j(arrayList5, A0K)).doubleValue();
    }

    public final int A02(AnonymousClass7Y4 r4, String str) {
        C998858o r1;
        int A072 = A07(r4, str);
        while (true) {
            char A002 = r4.A00();
            if (A002 == '+') {
                r1 = C998858o.ADD;
            } else if (A002 != '-') {
                return A072;
            } else {
                r1 = C998858o.SUB;
            }
            r4.A02();
            A072 = A01(r1, A072, A07(r4, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        throw new X.C118205tA(X.AnonymousClass000.A0U(" in ", r9, "'s expression", r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(X.AnonymousClass7Y4 r8, java.lang.String r9) {
        /*
            r7 = this;
            int r4 = r7.A08(r8, r9)
        L_0x0004:
            char r1 = r8.A00()
            java.lang.String r3 = "'s expression"
            java.lang.String r2 = " in "
            r5 = 61
            r6 = 1
            if (r1 != r5) goto L_0x0033
            java.lang.String r0 = r8.A01
            int r1 = r0.length()
            int r0 = r8.A00
            int r1 = r1 - r0
            if (r1 <= r6) goto L_0x004e
            char r0 = r8.A01(r6)
            if (r0 != r5) goto L_0x004e
            r8.A02()
            X.58o r1 = X.C998858o.EQ
        L_0x0027:
            r8.A02()
            int r0 = r7.A08(r8, r9)
            int r4 = r7.A01(r1, r4, r0)
            goto L_0x0004
        L_0x0033:
            r0 = 33
            if (r1 != r0) goto L_0x007e
            java.lang.String r0 = r8.A01
            int r1 = r0.length()
            int r0 = r8.A00
            int r1 = r1 - r0
            if (r1 <= r6) goto L_0x0066
            char r0 = r8.A01(r6)
            if (r0 != r5) goto L_0x0066
            r8.A02()
            X.58o r1 = X.C998858o.NE
            goto L_0x0027
        L_0x004e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid operator found at index "
            r1.append(r0)
            int r0 = r8.A00
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0U(r2, r9, r3, r1)
            X.5tA r0 = new X.5tA
            r0.<init>(r1)
            throw r0
        L_0x0066:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected '!' found at index "
            r1.append(r0)
            int r0 = r8.A00
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0U(r2, r9, r3, r1)
            X.5tA r0 = new X.5tA
            r0.<init>(r1)
            throw r0
        L_0x007e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YC.A03(X.7Y4, java.lang.String):int");
    }

    public final int A04(AnonymousClass7Y4 r9, String str) {
        int length;
        char A002 = r9.A00();
        if (A002 == '(') {
            r9.A02();
            int A062 = A06(r9, str);
            if (r9.A00() == ')') {
                r9.A02();
                return A062;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            C86604Kt.A1P(r9, "Unexpected character found at index ", str, A0o);
            throw C118205tA.A00("'s expression. Expected ')'.", A0o);
        } else if ('a' > A002 ? 'A' > A002 || (A002 >= '[' && A002 != '_') : A002 >= '{') {
            char A012 = r9.A01(0);
            if ('0' > A012 || A012 >= ':') {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Unexpected character '");
                A0o2.append(A002);
                C86604Kt.A1P(r9, "' found at index ", str, A0o2);
                throw C118205tA.A00("'s expression", A0o2);
            }
            String str2 = r9.A01;
            String substring = str2.substring(r9.A00);
            C162457s7.A0D(substring);
            while (true) {
                length = str2.length();
                if (!AnonymousClass001.A1W(length - r9.A00)) {
                    break;
                }
                char A013 = r9.A01(0);
                if ('0' > A013) {
                    if (A013 != '.') {
                        break;
                    }
                } else if (A013 >= ':') {
                    break;
                }
                r9.A02();
            }
            String substring2 = substring.substring(0, substring.length() - (length - r9.A00));
            C162457s7.A0D(substring2);
            try {
                double parseDouble = Double.parseDouble(substring2);
                Vector vector = this.A07;
                vector.add(new C107095ag(parseDouble));
                return C86664Kz.A0M(vector);
            } catch (NumberFormatException unused) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("Failed to convert '");
                A0o3.append(substring2);
                A0o3.append("' to double in ");
                A0o3.append(str);
                throw C118205tA.A00("'s expression", A0o3);
            }
        } else {
            String str3 = r9.A01;
            String substring3 = str3.substring(r9.A00);
            C162457s7.A0D(substring3);
            while (AnonymousClass001.A1W(str3.length() - r9.A00)) {
                char A014 = r9.A01(0);
                char c = '{';
                if ('a' > A014) {
                    if ('A' > A014) {
                        if ('0' > A014) {
                            break;
                        }
                        c = ':';
                    } else {
                        if (A014 >= '[' && A014 != '_') {
                            break;
                        }
                        r9.A02();
                    }
                }
                if (A014 >= c) {
                    break;
                }
                r9.A02();
            }
            int length2 = substring3.length();
            String substring4 = str3.substring(r9.A00);
            C162457s7.A0D(substring4);
            String substring5 = substring3.substring(0, length2 - substring4.length());
            C162457s7.A0D(substring5);
            if (r9.A00() == '(') {
                r9.A02();
                ArrayList A0s = AnonymousClass001.A0s();
                while (r9.A00() != ')') {
                    C18270x1.A1K(A0s, A06(r9, str));
                    if (r9.A00() == ',') {
                        r9.A02();
                        if (r9.A00() == ')') {
                            StringBuilder A0o4 = AnonymousClass001.A0o();
                            C86604Kt.A1P(r9, "Function argument list ends in comma at index ", str, A0o4);
                            throw C118205tA.A00("'s expression", A0o4);
                        }
                    }
                }
                r9.A02();
                AnonymousClass3Z6 A015 = AnonymousClass3Z6.A01(C18320x8.A0g(Locale.ROOT, substring5), A0s.size());
                Map map = A0A;
                if (map.containsKey(A015)) {
                    C998858o valueOf = C998858o.valueOf((String) C57692u3.A02(map, A015));
                    int size = A0s.size();
                    if (size == 1) {
                        int A072 = C86614Ku.A07(A0s, 0);
                        Vector vector2 = this.A07;
                        vector2.add(new C107095ag(valueOf, A072));
                        return C86664Kz.A0M(vector2);
                    } else if (size == 2) {
                        return A01(valueOf, C86614Ku.A07(A0s, 0), C86614Ku.A07(A0s, 1));
                    } else {
                        StringBuilder A0l = AnonymousClass000.A0l(str);
                        A0l.append("'s expression contains function call to '");
                        A0l.append(substring5);
                        C18260x0.A19("' with ", A0l, A0s);
                        throw C118205tA.A00(" arguments which has been found in the lookup table but the number of arguments is unexpected.", A0l);
                    }
                } else {
                    StringBuilder A0l2 = AnonymousClass000.A0l(str);
                    A0l2.append("'s expression contains an unexpected function call to '");
                    A0l2.append(substring5);
                    C18260x0.A19("' with ", A0l2, A0s);
                    throw C118205tA.A00(" arguments", A0l2);
                }
            } else if (!C162457s7.A0P(str, substring5)) {
                HashMap hashMap = this.A03;
                if (hashMap.containsKey(substring5)) {
                    if (this.A04.contains(substring5)) {
                        this.A05.add(substring5);
                    } else {
                        HashMap hashMap2 = this.A02;
                        C162457s7.A0J(hashMap2, 0);
                        ((Vector) this.A08.get(AnonymousClass001.A0K(C57692u3.A02(hashMap2, str)))).addElement(Integer.valueOf(AnonymousClass001.A0K(C57692u3.A02(hashMap2, substring5))));
                    }
                    return AnonymousClass001.A0K(C57692u3.A02(hashMap, substring5));
                }
                StringBuilder A0o5 = AnonymousClass001.A0o();
                A0o5.append("Unexpected symbol ");
                A0o5.append(substring5);
                A0o5.append(" found in ");
                A0o5.append(str);
                throw C118205tA.A00("'s expression", A0o5);
            } else {
                throw C118205tA.A00("'s expression contains itself", AnonymousClass000.A0l(str));
            }
        }
    }

    public final int A05(AnonymousClass7Y4 r5, String str) {
        int A032 = A03(r5, str);
        while (r5.A00() == '&') {
            if (r5.A01.length() - r5.A00 <= 1 || r5.A01(1) != '&') {
                StringBuilder A0o = AnonymousClass001.A0o();
                C86604Kt.A1P(r5, "Invalid operator found at index ", str, A0o);
                throw C118205tA.A00("'s expression", A0o);
            }
            r5.A02();
            C998858o r1 = C998858o.AND;
            r5.A02();
            A032 = A01(r1, A032, A03(r5, str));
        }
        return A032;
    }

    public final int A06(AnonymousClass7Y4 r5, String str) {
        int A052 = A05(r5, str);
        while (r5.A00() == '|') {
            if (r5.A01.length() - r5.A00 <= 1 || r5.A01(1) != '|') {
                StringBuilder A0o = AnonymousClass001.A0o();
                C86604Kt.A1P(r5, "Invalid operator found at index ", str, A0o);
                throw C118205tA.A00("'s expression", A0o);
            }
            r5.A02();
            C998858o r1 = C998858o.OR;
            r5.A02();
            A052 = A01(r1, A052, A05(r5, str));
        }
        return A052;
    }

    public final int A07(AnonymousClass7Y4 r7, String str) {
        int i;
        C998858o r4;
        int A042;
        if (r7.A00() == '!') {
            r7.A02();
            int A043 = A04(r7, str);
            C998858o r2 = C998858o.NOT;
            Vector vector = this.A07;
            vector.add(new C107095ag(r2, A043));
            i = C86664Kz.A0M(vector);
        } else {
            i = A04(r7, str);
        }
        while (true) {
            char A002 = r7.A00();
            if (A002 == '*') {
                r4 = C998858o.MUL;
            } else if (A002 != '/') {
                return i;
            } else {
                r4 = C998858o.DIV;
            }
            r7.A02();
            if (r7.A00() == '!') {
                r7.A02();
                int A044 = A04(r7, str);
                C998858o r22 = C998858o.NOT;
                Vector vector2 = this.A07;
                vector2.add(new C107095ag(r22, A044));
                A042 = C86664Kz.A0M(vector2);
            } else {
                A042 = A04(r7, str);
            }
            i = A01(r4, i, A042);
        }
    }

    public final int A08(AnonymousClass7Y4 r6, String str) {
        C998858o r1;
        int A022 = A02(r6, str);
        while (true) {
            char A002 = r6.A00();
            if (A002 == '>') {
                if (r6.A01.length() - r6.A00 <= 1 || r6.A01(1) != '=') {
                    r1 = C998858o.GT;
                } else {
                    r6.A02();
                    r1 = C998858o.GE;
                }
            } else if (A002 != '<') {
                return A022;
            } else {
                if (r6.A01.length() - r6.A00 <= 1 || r6.A01(1) != '=') {
                    r1 = C998858o.LT;
                } else {
                    r6.A02();
                    r1 = C998858o.LE;
                }
            }
            r6.A02();
            A022 = A01(r1, A022, A02(r6, str));
        }
    }
}
