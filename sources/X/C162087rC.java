package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7rC  reason: invalid class name and case insensitive filesystem */
public class C162087rC {
    public static Pattern A00 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$");
    public static final Pattern A01 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$");

    public static C172488Li A01(File file, String str, long j, long j2, long j3) {
        long j4 = j3;
        File file2 = file;
        if (j3 <= 0) {
            j4 = file.length();
        }
        return new C172488Li(file2, str, j, j4, j2, true);
    }

    public static C172488Li A04(String str, long j, long j2) {
        return new C172488Li((File) null, str, j, j2, -1, false);
    }

    public static C172488Li A00(File file, long j, long j2, boolean z, boolean z2) {
        int lastIndexOf;
        int lastIndexOf2;
        long j3 = j2;
        long j4 = j;
        File file2 = file;
        if (z2) {
            String name = file2.getName();
            int lastIndexOf3 = name.lastIndexOf(46);
            if (lastIndexOf3 == -1 || (lastIndexOf = name.lastIndexOf(46, lastIndexOf3 - 1)) == -1 || (lastIndexOf2 = name.lastIndexOf(46, lastIndexOf - 1)) == -1) {
                return null;
            }
            String substring = name.substring(lastIndexOf2 + 1, lastIndexOf);
            int lastIndexOf4 = name.lastIndexOf(46, lastIndexOf2 - 1);
            if (lastIndexOf4 == -1) {
                return null;
            }
            String substring2 = name.substring(lastIndexOf4 + 1, lastIndexOf2);
            String A0r = AnonymousClass0x7.A0r(name, lastIndexOf4);
            if (j == -1) {
                j4 = file2.length();
            }
            if (j4 == 0) {
                return null;
            }
            if (j2 == -9223372036854775807L) {
                try {
                    j3 = Long.parseLong(substring);
                } catch (NumberFormatException e) {
                    Log.e(C172488Li.A0A, AnonymousClass000.A0V("invalid filename: ", name, AnonymousClass001.A0o()), e);
                    return null;
                }
            }
            return A01(file2, A0r, Long.parseLong(substring2), j3, j4);
        }
        Matcher matcher = A01.matcher(file2.getName());
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        if (!z) {
            int length = group.length();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (group.charAt(i3) == '%') {
                    i2++;
                }
            }
            if (i2 != 0) {
                int i4 = length - (i2 * 2);
                StringBuilder A0Y = AnonymousClass6CA.A0Y(i4);
                Matcher matcher2 = Util.A05.matcher(group);
                while (i2 > 0 && matcher2.find()) {
                    char parseInt = (char) Integer.parseInt(AnonymousClass6C8.A0f(matcher2, 1), 16);
                    A0Y.append(group, i, matcher2.start());
                    A0Y.append(parseInt);
                    i = matcher2.end();
                    i2--;
                }
                if (i < length) {
                    A0Y.append(group, i, length);
                }
                if (A0Y.length() != i4) {
                    return null;
                }
                group = A0Y.toString();
            }
            return A01(file2, group, AnonymousClass6C9.A0O(matcher, 2), AnonymousClass6C9.A0O(matcher, 3), j4);
        }
        if (group == null) {
            return null;
        }
        return A01(file2, group, AnonymousClass6C9.A0O(matcher, 2), AnonymousClass6C9.A0O(matcher, 3), j4);
    }

    public static C172488Li A02(String str, long j) {
        return new C172488Li((File) null, str, j, -1, -1, false);
    }

    public static C172488Li A03(String str, long j) {
        return new C172488Li((File) null, str, j, -1, -1, false);
    }

    public static File A05(File file, String str, long j, long j2, boolean z) {
        if (!z) {
            int length = str.length();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Util.A0B(str.charAt(i3))) {
                    i2++;
                }
            }
            if (i2 != 0) {
                StringBuilder A0Y = AnonymousClass6CA.A0Y((i2 * 2) + length);
                while (i2 > 0) {
                    int i4 = i + 1;
                    char charAt = str.charAt(i);
                    if (Util.A0B(charAt)) {
                        A0Y.append('%');
                        AnonymousClass001.A1N(A0Y, charAt);
                        i2--;
                    } else {
                        A0Y.append(charAt);
                    }
                    i = i4;
                }
                if (i < length) {
                    A0Y.append(str, i, length);
                }
                str = A0Y.toString();
            }
        }
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append(".");
        A0l.append(j);
        A0l.append(".");
        A0l.append(j2);
        return C18270x1.A0A(file, ".v2.exo", A0l);
    }

    public static File A06(File file, boolean z) {
        Matcher matcher = A00.matcher(file.getName());
        if (!matcher.matches()) {
            return file;
        }
        File A05 = A05(file.getParentFile(), matcher.group(1), AnonymousClass6C9.A0O(matcher, 2), AnonymousClass6C9.A0O(matcher, 3), z);
        file.renameTo(A05);
        return A05;
    }
}
