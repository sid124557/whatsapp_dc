package X;

import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.5an  reason: invalid class name and case insensitive filesystem */
public class C107155an {
    public static final ThreadLocal A00 = new C118235tD();
    public static final ThreadLocal A01 = new C173868Rz();
    public static final Pattern A02 = Pattern.compile("[\\p{ASCII}&&[^\\p{Alnum}]]");

    public static ArrayList A03(C620733j r1, String str) {
        Object obj = A00(r1, str, true).A01;
        C626936e.A06(obj);
        return (ArrayList) obj;
    }

    public static boolean A05(C620733j r9, String str, List list, boolean z) {
        boolean equals;
        if (str == null) {
            return false;
        }
        String replaceAll = A02.matcher(str).replaceAll(" ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            BreakIterator A022 = A02(r9);
            A022.setText(replaceAll);
            int first = A022.first();
            while (true) {
                int next = A022.next();
                int i = first;
                first = next;
                if (next == -1) {
                    return false;
                }
                String A06 = C107575bX.A06(replaceAll.substring(i, next));
                if (z) {
                    equals = A06.startsWith(A0m);
                    continue;
                } else {
                    equals = A06.equals(A0m);
                    continue;
                }
                if (equals) {
                }
            }
        }
        return true;
    }

    public static AnonymousClass0PJ A00(C620733j r9, String str, boolean z) {
        String A07;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = A02.matcher(str).replaceAll(" ");
            BreakIterator A022 = A02(r9);
            A022.setText(replaceAll);
            int first = A022.first();
            while (true) {
                int next = A022.next();
                int i = first;
                first = next;
                if (next == -1) {
                    break;
                }
                String substring = replaceAll.substring(i, next);
                if (z) {
                    A07 = C107575bX.A06(substring);
                } else {
                    A07 = C107575bX.A07(substring);
                }
                if (!TextUtils.isEmpty(A07) && !Character.isSpaceChar(A07.codePointAt(0))) {
                    C18270x1.A1K(A0s2, i);
                    C18270x1.A1K(A0s2, next);
                    A0s.add(A07);
                }
            }
        }
        return AnonymousClass0x9.A0G(A0s2, A0s);
    }

    public static String A01(C620733j r9, String str) {
        if (str.isEmpty()) {
            return str;
        }
        boolean z = false;
        if (!AnonymousClass2BP.A00.matcher(str).find()) {
            z = true;
            str = C107575bX.A07(str);
        }
        StringBuilder sb = new StringBuilder(str.length());
        BreakIterator A022 = A02(r9);
        A022.setText(str);
        int first = A022.first();
        while (true) {
            int next = A022.next();
            int i = first;
            first = next;
            if (next == -1) {
                break;
            } else if (next - i != 1 || str.codePointAt(i) != 32) {
                CharSequence subSequence = str.subSequence(i, next);
                if (!z) {
                    subSequence = C107575bX.A07(subSequence);
                }
                sb.append(subSequence);
                sb.append(' ');
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static BreakIterator A02(C620733j r3) {
        Locale A022 = C620733j.A02(r3);
        ThreadLocal threadLocal = A01;
        if (A022.equals(threadLocal.get())) {
            return (BreakIterator) A00.get();
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(A022);
        threadLocal.set(A022);
        A00.set(wordInstance);
        return wordInstance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.C620733j r12, java.lang.String r13, java.lang.String r14) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r9 = 0
            if (r0 != 0) goto L_0x006a
            java.util.regex.Pattern r0 = A02
            java.util.regex.Matcher r1 = r0.matcher(r13)
            java.lang.String r0 = " "
            java.lang.String r10 = r1.replaceAll(r0)
            java.util.regex.Pattern r0 = X.AnonymousClass2BP.A00
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r0 = r0.find()
            r11 = r0 ^ 1
            if (r11 == 0) goto L_0x0025
            java.lang.String r10 = X.C107575bX.A07(r10)
        L_0x0025:
            java.text.BreakIterator r8 = A02(r12)
            r8.setText(r10)
            int r7 = r8.first()
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = X.C107575bX.A07(r14)
        L_0x003a:
            char[] r6 = r0.toCharArray()
            int r5 = r6.length
            r4 = 0
        L_0x0040:
            if (r4 >= r5) goto L_0x0069
            char r3 = r6[r4]
        L_0x0044:
            int r2 = r8.next()
            r1 = r7
            r7 = r2
            r0 = -1
            if (r2 == r0) goto L_0x006a
            java.lang.String r1 = r10.substring(r1, r2)
            if (r11 != 0) goto L_0x0057
            java.lang.String r1 = X.C107575bX.A07(r1)
        L_0x0057:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0044
            char r0 = r1.charAt(r9)
            if (r3 != r0) goto L_0x0044
            int r4 = r4 + 1
            goto L_0x0040
        L_0x0066:
            java.lang.String r0 = ""
            goto L_0x003a
        L_0x0069:
            r9 = 1
        L_0x006a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107155an.A04(X.33j, java.lang.String, java.lang.String):boolean");
    }
}
