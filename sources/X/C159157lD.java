package X;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7lD  reason: invalid class name and case insensitive filesystem */
public class C159157lD {
    public static final C172308Km A0M;
    public static final Pattern A0N = Pattern.compile("\\[([^\\[\\]])*\\]");
    public static final Pattern A0O = Pattern.compile(" ");
    public static final Pattern A0P = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    public static final Pattern A0Q = Pattern.compile("[- ]");
    public static final Pattern A0R = Pattern.compile("\\d(?=[^,}][^,}])");
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public C172308Km A03;
    public C172308Km A04;
    public AnonymousClass7RS A05 = new AnonymousClass7RS(64);
    public String A06 = "";
    public String A07 = "";
    public String A08;
    public String A09 = "";
    public StringBuilder A0A = AnonymousClass001.A0o();
    public StringBuilder A0B = AnonymousClass001.A0o();
    public StringBuilder A0C = AnonymousClass001.A0o();
    public StringBuilder A0D = AnonymousClass001.A0o();
    public StringBuilder A0E = AnonymousClass001.A0o();
    public List A0F = AnonymousClass001.A0s();
    public boolean A0G = true;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = false;
    public boolean A0K = false;
    public final C162167rN A0L = C162167rN.A00();

    static {
        C172308Km r2 = new C172308Km();
        r2.hasInternationalPrefix = true;
        r2.internationalPrefix_ = "NA";
        A0M = r2;
    }

    public final C172308Km A00(String str) {
        int i;
        C162167rN r4 = this.A0L;
        if (str == null || !r4.A07.contains(str)) {
            Logger logger = C162167rN.A0B;
            Level level = Level.WARNING;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            A0o.append(str);
            logger.log(level, AnonymousClass000.A0X(") provided.", A0o));
            i = 0;
        } else {
            C172308Km A0E2 = r4.A0E(str);
            if (A0E2 != null) {
                i = A0E2.countryCode_;
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Invalid region code: ");
                throw AnonymousClass000.A0F(str, A0o2);
            }
        }
        C172308Km A0E3 = r4.A0E(r4.A0G(i));
        if (A0E3 == null) {
            return A0M;
        }
        return A0E3;
    }

    public final String A01() {
        C172308Km r1;
        List<C172298Kl> list;
        List list2;
        StringBuilder sb = this.A0D;
        if (sb.length() < 3) {
            return A06(sb.toString());
        }
        String substring = sb.substring(0, 3);
        C172308Km r12 = this.A03;
        if (r12 != null) {
            if (!this.A0I || (list2 = r12.intlNumberFormat_) == null || list2.size() <= 0) {
                r1 = this.A03;
                list = r1.numberFormat_;
            } else {
                r1 = this.A03;
                list = r1.intlNumberFormat_;
            }
            boolean z = r1.hasNationalPrefix;
            for (C172298Kl r2 : list) {
                if ((!z || this.A0I || r2.nationalPrefixOptionalWhenFormatting_ || C18280x3.A1X(r2.nationalPrefixFormattingRule_, C162167rN.A0G)) && C18280x3.A1X(r2.format_, A0P)) {
                    this.A0F.add(r2);
                }
            }
            A08(substring);
        }
        if (A0B()) {
            return A02();
        }
        return this.A0A.toString();
    }

    public final String A02() {
        StringBuilder sb;
        String A042;
        StringBuilder sb2 = this.A0D;
        int length = sb2.length();
        if (length > 0) {
            int i = 0;
            do {
                A042 = A04(sb2.charAt(i));
                i++;
            } while (i < length);
            if (this.A0G) {
                return A06(A042);
            }
            sb = this.A0A;
        } else {
            sb = this.A0E;
        }
        return sb.toString();
    }

    public final String A03() {
        C172308Km r0 = this.A03;
        boolean z = false;
        if (r0 != null && r0.countryCode_ == 1) {
            StringBuilder sb = this.A0D;
            if (!(sb.charAt(0) != '1' || sb.charAt(1) == '0' || sb.charAt(1) == '1')) {
                z = true;
            }
        }
        int i = 1;
        if (z) {
            StringBuilder sb2 = this.A0E;
            sb2.append('1');
            sb2.append(' ');
            this.A0I = true;
        } else {
            C172308Km r2 = this.A03;
            if (r2 != null && r2.hasNationalPrefixForParsing) {
                Pattern A002 = this.A05.A00(r2.nationalPrefixForParsing_);
                StringBuilder sb3 = this.A0D;
                Matcher matcher = A002.matcher(sb3);
                if (matcher.lookingAt()) {
                    this.A0I = true;
                    i = matcher.end();
                    this.A0E.append(sb3.substring(0, i));
                }
            }
            i = 0;
        }
        StringBuilder sb4 = this.A0D;
        String substring = sb4.substring(0, i);
        sb4.delete(0, i);
        return substring;
    }

    public final String A04(char c) {
        Pattern pattern = A0O;
        StringBuilder sb = this.A0C;
        Matcher matcher = pattern.matcher(sb);
        if (matcher.find(this.A00)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            sb.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.A00 = start;
            return sb.substring(0, start + 1);
        }
        if (this.A0F.size() == 1) {
            this.A0G = false;
        }
        this.A06 = "";
        return this.A0A.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (A09() != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (X.C18280x3.A1X(java.lang.Character.toString(r8), X.C162167rN.A0K) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A05(char r8, boolean r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r2 = r7.A0A
            r2.append(r8)
            if (r9 == 0) goto L_0x000d
            int r0 = r2.length()
            r7.A01 = r0
        L_0x000d:
            boolean r0 = java.lang.Character.isDigit(r8)
            r5 = 1
            if (r0 != 0) goto L_0x0026
            int r0 = r2.length()
            if (r0 != r5) goto L_0x00a3
            java.util.regex.Pattern r1 = X.C162167rN.A0K
            java.lang.String r0 = java.lang.Character.toString(r8)
            boolean r0 = X.C18280x3.A1X(r0, r1)
            if (r0 == 0) goto L_0x00a3
        L_0x0026:
            r3 = 0
            r4 = 1
            if (r5 != 0) goto L_0x007e
            r7.A0G = r3
            r7.A0H = r4
        L_0x002e:
            boolean r0 = r7.A0G
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r7.A0H
            if (r0 != 0) goto L_0x015b
            boolean r0 = r7.A0A()
            if (r0 == 0) goto L_0x0050
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x015b
        L_0x0042:
            r7.A0G = r4
            r7.A0J = r3
            java.util.List r0 = r7.A0F
            r0.clear()
            java.lang.String r0 = r7.A01()
            return r0
        L_0x0050:
            java.lang.String r1 = r7.A09
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0068
            java.lang.StringBuilder r0 = r7.A0D
            r0.insert(r3, r1)
            java.lang.StringBuilder r1 = r7.A0E
            java.lang.String r0 = r7.A09
            int r0 = r1.lastIndexOf(r0)
            r1.setLength(r0)
        L_0x0068:
            java.lang.String r1 = r7.A09
            java.lang.String r0 = r7.A03()
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x015b
            java.lang.StringBuilder r1 = r7.A0E
            r0 = 32
            r1.append(r0)
            goto L_0x0042
        L_0x007e:
            r0 = 43
            if (r8 != r0) goto L_0x0091
            java.lang.StringBuilder r1 = r7.A0B
            r0 = r1
        L_0x0085:
            r1.append(r8)
            if (r9 == 0) goto L_0x002e
            int r0 = r0.length()
            r7.A02 = r0
            goto L_0x002e
        L_0x0091:
            r1 = 10
            int r0 = java.lang.Character.digit(r8, r1)
            char r8 = java.lang.Character.forDigit(r0, r1)
            java.lang.StringBuilder r0 = r7.A0B
            r0.append(r8)
            java.lang.StringBuilder r1 = r7.A0D
            goto L_0x0085
        L_0x00a3:
            r5 = 0
            goto L_0x0026
        L_0x00a5:
            java.lang.StringBuilder r0 = r7.A0B
            int r1 = r0.length()
            if (r1 == 0) goto L_0x015b
            if (r1 == r4) goto L_0x015b
            r0 = 2
            if (r1 == r0) goto L_0x015b
            r0 = 3
            if (r1 != r0) goto L_0x00bd
            boolean r0 = r7.A0A()
            if (r0 == 0) goto L_0x0150
            r7.A0J = r4
        L_0x00bd:
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x00c9
            r7.A0J = r3
        L_0x00c9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.StringBuilder r0 = r7.A0E
            r1.append(r0)
            java.lang.StringBuilder r0 = r7.A0D
            X.AnonymousClass000.A1B(r0, r1)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x00dc:
            java.util.List r1 = r7.A0F
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x014b
            java.lang.String r3 = r7.A04(r8)
            java.util.Iterator r6 = r1.iterator()
        L_0x00ec:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x012b
            java.lang.Object r5 = r6.next()
            X.8Kl r5 = (X.C172298Kl) r5
            X.7RS r1 = r7.A05
            java.lang.String r0 = r5.pattern_
            java.util.regex.Pattern r1 = r1.A00(r0)
            java.lang.StringBuilder r0 = r7.A0D
            java.util.regex.Matcher r4 = r1.matcher(r0)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L_0x00ec
            java.util.regex.Pattern r1 = A0Q
            java.lang.String r0 = r5.nationalPrefixFormattingRule_
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.find()
            r7.A0K = r0
            java.lang.String r0 = r5.format_
            java.lang.String r0 = r4.replaceAll(r0)
            java.lang.String r1 = r7.A06(r0)
        L_0x0124:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x012e
            return r1
        L_0x012b:
            java.lang.String r1 = ""
            goto L_0x0124
        L_0x012e:
            java.lang.StringBuilder r0 = r7.A0D
            java.lang.String r0 = r0.toString()
            r7.A08(r0)
            boolean r0 = r7.A0B()
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = r7.A02()
            return r0
        L_0x0142:
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x015b
            java.lang.String r0 = r7.A06(r3)
            return r0
        L_0x014b:
            java.lang.String r0 = r7.A01()
            return r0
        L_0x0150:
            java.lang.String r0 = r7.A03()
            r7.A09 = r0
            java.lang.String r0 = r7.A01()
            return r0
        L_0x015b:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159157lD.A05(char, boolean):java.lang.String");
    }

    public final String A06(String str) {
        StringBuilder A0o;
        StringBuilder sb = this.A0E;
        int length = sb.length();
        if (!this.A0K || length <= 0 || sb.charAt(length - 1) == ' ') {
            A0o = AnonymousClass001.A0o();
            A0o.append(sb);
        } else {
            A0o = AnonymousClass001.A0o();
            A0o.append(new String(sb));
            A0o.append(' ');
        }
        return AnonymousClass000.A0X(str, A0o);
    }

    public void A07() {
        this.A07 = "";
        this.A0A.setLength(0);
        this.A0B.setLength(0);
        this.A0C.setLength(0);
        this.A00 = 0;
        this.A06 = "";
        this.A0E.setLength(0);
        this.A09 = "";
        this.A0D.setLength(0);
        this.A0G = true;
        this.A0H = false;
        this.A02 = 0;
        this.A01 = 0;
        this.A0I = false;
        this.A0J = false;
        this.A0F.clear();
        this.A0K = false;
        C172308Km r1 = this.A03;
        if (r1 == null || !r1.equals(this.A04)) {
            this.A03 = A00(this.A08);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = X.AnonymousClass001.A0o();
        r3 = r5.A0L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09() {
        /*
            r5 = this;
            java.lang.StringBuilder r4 = r5.A0D
            int r0 = r4.length()
            r1 = 0
            if (r0 == 0) goto L_0x004a
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.7rN r3 = r5.A0L
            int r2 = r3.A08(r4, r0)
            if (r2 == 0) goto L_0x004a
            r4.setLength(r1)
            r4.append(r0)
            java.lang.String r1 = r3.A0G(r2)
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003d
            X.8Km r0 = r3.A0D(r2)
        L_0x002b:
            r5.A03 = r0
        L_0x002d:
            java.lang.String r0 = java.lang.Integer.toString(r2)
            java.lang.StringBuilder r1 = r5.A0E
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            r0 = 1
            return r0
        L_0x003d:
            java.lang.String r0 = r5.A08
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002d
            X.8Km r0 = r5.A00(r1)
            goto L_0x002b
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159157lD.A09():boolean");
    }

    public final boolean A0A() {
        C172308Km r3 = this.A03;
        if (r3 != null) {
            AnonymousClass7RS r2 = this.A05;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("\\+|");
            Pattern A002 = r2.A00(AnonymousClass000.A0X(r3.internationalPrefix_, A0o));
            StringBuilder sb = this.A0B;
            Matcher matcher = A002.matcher(sb);
            if (matcher.lookingAt()) {
                this.A0I = true;
                int end = matcher.end();
                StringBuilder sb2 = this.A0D;
                sb2.setLength(0);
                sb2.append(sb.substring(end));
                StringBuilder sb3 = this.A0E;
                sb3.setLength(0);
                sb3.append(sb.substring(0, end));
                if (sb.charAt(0) != '+') {
                    sb3.append(' ');
                }
                return true;
            }
        }
        return false;
    }

    public final boolean A0B() {
        String replaceAll;
        Iterator it = this.A0F.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.A0G = false;
                break;
            }
            C172298Kl r5 = (C172298Kl) it.next();
            String str = r5.pattern_;
            if (this.A06.equals(str)) {
                break;
            }
            if (str.indexOf(124) == -1) {
                String replaceAll2 = A0R.matcher(A0N.matcher(str).replaceAll("\\\\d")).replaceAll("\\\\d");
                StringBuilder sb = this.A0C;
                sb.setLength(0);
                String str2 = r5.format_;
                Matcher matcher = this.A05.A00(replaceAll2).matcher("999999999999999");
                matcher.find();
                String group = matcher.group();
                if (group.length() < this.A0D.length()) {
                    replaceAll = "";
                } else {
                    replaceAll = group.replaceAll(replaceAll2, str2).replaceAll("9", " ");
                }
                if (replaceAll.length() > 0) {
                    sb.append(replaceAll);
                    this.A06 = str;
                    this.A0K = A0Q.matcher(r5.nationalPrefixFormattingRule_).find();
                    this.A00 = 0;
                    return true;
                }
            }
            it.remove();
        }
        return false;
    }

    public C159157lD(String str) {
        this.A08 = str;
        C172308Km A002 = A00(str);
        this.A03 = A002;
        this.A04 = A002;
    }

    public final void A08(String str) {
        int length = str.length() - 3;
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            C172298Kl r2 = (C172298Kl) it.next();
            if (r2.leadingDigitsPattern_.size() > length && !this.A05.A00(AnonymousClass001.A0n(r2.leadingDigitsPattern_, length)).matcher(str).lookingAt()) {
                it.remove();
            }
        }
    }
}
