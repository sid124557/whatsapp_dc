package X;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.6PY  reason: invalid class name */
public final class AnonymousClass6PY extends C126516Og {
    public static final Pattern A02 = Pattern.compile("\\{\\\\.*?\\}");
    public static final Pattern A03 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public final StringBuilder A00 = AnonymousClass001.A0o();
    public final ArrayList A01 = AnonymousClass001.A0s();

    public AnonymousClass6PY() {
        super("SubripDecoder");
    }

    public static long A00(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        long parseLong = j + (Long.parseLong(AnonymousClass6C8.A0f(matcher, i + 2)) * 60 * 1000) + (Long.parseLong(AnonymousClass6C8.A0f(matcher, i + 3)) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }
}
