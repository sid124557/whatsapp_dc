package X;

import java.lang.Character;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.8O7  reason: invalid class name */
public final class AnonymousClass8O7 implements Iterator {
    public static final Pattern A08;
    public static final Pattern A09;
    public static final Pattern A0A;
    public static final Pattern A0B;
    public static final Pattern A0C = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    public static final Pattern A0D = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    public static final Pattern A0E = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d [0-2]\\d$");
    public static final Pattern A0F = Pattern.compile(":[0-5]\\d");
    public int A00 = 0;
    public long A01;
    public AnonymousClass5S2 A02 = null;
    public C141416vX A03 = C141416vX.NOT_READY;
    public final C142756xi A04;
    public final C162167rN A05;
    public final CharSequence A06;
    public final String A07;

    public final AnonymousClass5S2 A03(String str, int i) {
        char charAt;
        char charAt2;
        try {
            String str2 = str;
            if (C18280x3.A1X(str, A0A)) {
                C142756xi r3 = this.A04;
                if (r3.compareTo(C142756xi.A03) >= 0) {
                    if (i > 0 && !A09.matcher(str).lookingAt() && ((charAt2 = this.A06.charAt(i - 1)) == '%' || Character.getType(charAt2) == 26 || A02(charAt2))) {
                        return null;
                    }
                    int length = str.length() + i;
                    CharSequence charSequence = this.A06;
                    if (length < charSequence.length() && ((charAt = charSequence.charAt(length)) == '%' || Character.getType(charAt) == 26 || A02(charAt))) {
                        return null;
                    }
                }
                C162167rN r5 = this.A05;
                String str3 = this.A07;
                AnonymousClass8LC r6 = new AnonymousClass8LC();
                r5.A0I(r6, str2, str3, true, true);
                if (r3.A00(r5, r6, str)) {
                    r6.hasCountryCodeSource = false;
                    r6.countryCodeSource_ = C141706w0.FROM_NUMBER_WITH_PLUS_SIGN;
                    r6.hasRawInput = false;
                    r6.rawInput_ = "";
                    r6.hasPreferredDomesticCarrierCode = false;
                    r6.preferredDomesticCarrierCode_ = "";
                    return new AnonymousClass5S2(r6, str, i);
                }
                return null;
            }
            return null;
        } catch (C143616zC unused) {
        }
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[^");
        A0o.append("(\\[（［");
        A0o.append(")\\]）］");
        String A0X = AnonymousClass000.A0X("]", A0o);
        String A012 = A01(0, 3);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("(?:[");
        A0o2.append("(\\[（［");
        A0o2.append("])?(?:");
        A0o2.append(A0X);
        A0o2.append("+[");
        A0o2.append(")\\]）］");
        A0o2.append("])?");
        A0o2.append(A0X);
        C18260x0.A0p("+(?:[", "(\\[（［", "]", A0X, A0o2);
        A0o2.append("+[");
        A0o2.append(")\\]）］");
        AnonymousClass001.A1K("])", A012, A0X, A0o2);
        A0A = Pattern.compile(AnonymousClass000.A0X("*", A0o2));
        String A013 = A01(0, 2);
        String A014 = A01(0, 4);
        String A015 = A01(0, 19);
        String A0V = AnonymousClass000.A0V("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]", A014, AnonymousClass001.A0o());
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("\\p{Nd}");
        String A0X2 = AnonymousClass000.A0X(A01(1, 19), A0o3);
        String A0X3 = AnonymousClass000.A0X("+＋", AnonymousClass000.A0l("(\\[（［"));
        String A0U = AnonymousClass000.A0U("[", A0X3, "]", AnonymousClass001.A0o());
        A09 = Pattern.compile(A0U);
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("\\p{Z}[^");
        A0o4.append(A0X3);
        A08 = Pattern.compile(AnonymousClass000.A0X("\\p{Nd}]*", A0o4));
        StringBuilder A0o5 = AnonymousClass001.A0o();
        AnonymousClass001.A1K("(?:", A0U, A0V, A0o5);
        C18260x0.A0p(")", A013, A0X2, "(?:", A0o5);
        C18260x0.A0p(A0V, A0X2, ")", A015, A0o5);
        A0o5.append("(?:");
        A0o5.append(C162167rN.A08);
        A0B = Pattern.compile(AnonymousClass000.A0X(")?", A0o5), 66);
    }

    public boolean hasNext() {
        AnonymousClass5S2 r0;
        C141416vX r1 = this.A03;
        if (r1 == C141416vX.NOT_READY) {
            int i = this.A00;
            Pattern pattern = A0B;
            CharSequence charSequence = this.A06;
            Matcher matcher = pattern.matcher(charSequence);
            while (true) {
                if (this.A01 <= 0 || !matcher.find(i)) {
                    r0 = null;
                } else {
                    int start = matcher.start();
                    CharSequence A002 = A00(charSequence.subSequence(start, matcher.end()), C162167rN.A0L);
                    if (!A0C.matcher(A002).find() && !A0D.matcher(A002).find()) {
                        if (A0E.matcher(A002).find()) {
                            if (A0F.matcher(charSequence.toString().substring(A002.length() + start)).lookingAt()) {
                                continue;
                            }
                        }
                        String charSequence2 = A002.toString();
                        r0 = A03(charSequence2, start);
                        if (r0 != null) {
                            break;
                        }
                        Matcher matcher2 = A08.matcher(charSequence2);
                        if (matcher2.find()) {
                            String substring = charSequence2.substring(0, matcher2.start());
                            Pattern pattern2 = C162167rN.A0N;
                            CharSequence A003 = A00(substring, pattern2);
                            r0 = A03(A003.toString(), start);
                            if (r0 != null) {
                                break;
                            }
                            this.A01--;
                            int end = matcher2.end();
                            r0 = A03(A00(charSequence2.substring(end), pattern2).toString(), start + end);
                            if (r0 != null) {
                                break;
                            }
                            long j = this.A01 - 1;
                            this.A01 = j;
                            if (j > 0) {
                                while (matcher2.find()) {
                                    end = matcher2.start();
                                }
                                CharSequence A004 = A00(charSequence2.substring(0, end), pattern2);
                                if (!A004.equals(A003)) {
                                    r0 = A03(A004.toString(), start);
                                    if (r0 != null) {
                                        break;
                                    }
                                    this.A01--;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i = start + A002.length();
                    this.A01--;
                }
            }
            this.A02 = r0;
            if (r0 == null) {
                r1 = C141416vX.DONE;
            } else {
                this.A00 = r0.A00 + r0.A02.length();
                r1 = C141416vX.READY;
            }
            this.A03 = r1;
        }
        return AnonymousClass000.A1Y(r1, C141416vX.READY);
    }

    public static CharSequence A00(CharSequence charSequence, Pattern pattern) {
        Matcher matcher = pattern.matcher(charSequence);
        if (matcher.find()) {
            return charSequence.subSequence(0, matcher.start());
        }
        return charSequence;
    }

    public static String A01(int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("{");
        A0o.append(i);
        C18320x8.A1K(A0o);
        A0o.append(i2);
        return AnonymousClass000.A0g(A0o);
    }

    public static boolean A02(char c) {
        if (Character.isLetter(c) || Character.getType(c) == 6) {
            Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
            if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            AnonymousClass5S2 r1 = this.A02;
            this.A02 = null;
            this.A03 = C141416vX.NOT_READY;
            return r1;
        }
        throw AnonymousClass6CA.A0c();
    }

    public void remove() {
        throw C18320x8.A0m();
    }

    public AnonymousClass8O7(C142756xi r4, C162167rN r5, CharSequence charSequence, String str) {
        this.A05 = r5;
        this.A06 = charSequence;
        this.A07 = str;
        this.A04 = r4;
        this.A01 = Long.MAX_VALUE;
    }
}
