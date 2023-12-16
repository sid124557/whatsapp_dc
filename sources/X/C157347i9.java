package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7i9  reason: invalid class name and case insensitive filesystem */
public final class C157347i9 {
    public static final Pattern A02 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int A00 = -1;
    public int A01 = -1;

    public void A00(C166547ys r7) {
        String str;
        int parseInt;
        int parseInt2;
        int i = 0;
        while (true) {
            C187368x6[] r1 = r7.A00;
            if (i < r1.length) {
                C187368x6 r5 = r1[i];
                if (r5 instanceof AnonymousClass6P7) {
                    AnonymousClass6P7 r52 = (AnonymousClass6P7) r5;
                    if ("iTunSMPB".equals(r52.A00)) {
                        str = r52.A02;
                    } else {
                        continue;
                        i++;
                    }
                } else {
                    if (r5 instanceof AnonymousClass6P8) {
                        AnonymousClass6P8 r53 = (AnonymousClass6P8) r5;
                        if ("com.apple.iTunes".equals(r53.A01) && "iTunSMPB".equals(r53.A00)) {
                            str = r53.A02;
                        }
                    } else {
                        continue;
                    }
                    i++;
                }
                Matcher matcher = A02.matcher(str);
                if (matcher.find()) {
                    try {
                        parseInt = Integer.parseInt(matcher.group(1), 16);
                        parseInt2 = Integer.parseInt(matcher.group(2), 16);
                        if (parseInt > 0 || parseInt2 > 0) {
                            this.A00 = parseInt;
                            this.A01 = parseInt2;
                        }
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
        this.A00 = parseInt;
        this.A01 = parseInt2;
    }
}
