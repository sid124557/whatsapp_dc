package X;

import java.io.File;
import java.util.Date;

/* renamed from: X.342  reason: invalid class name */
public class AnonymousClass342 {
    public static String A01(String str) {
        return A02(str, new Date()).substring(0, str.indexOf(46) + 1);
    }

    public static String A02(String str, Date date) {
        StringBuilder A0l = AnonymousClass000.A0l(AnonymousClass0x7.A0r(str, str.indexOf(46)));
        A0l.append("-");
        return AnonymousClass000.A0X(AnonymousClass0x7.A0u("yyyy-MM-dd").format(date), A0l);
    }

    public static String A00(File file, String str, Date date) {
        String A02 = A02(file.getName(), date);
        String name = file.getName();
        String A0T = AnonymousClass000.A0T(name.substring(name.indexOf(46)), str);
        File[] listFiles = file.getParentFile().listFiles();
        File file2 = null;
        if (listFiles != null) {
            int i = 0;
            for (File file3 : listFiles) {
                String name2 = file3.getName();
                if (name2.startsWith(A02) && name2.endsWith(A0T)) {
                    int length = A02.length() + 1;
                    int length2 = name2.length();
                    int length3 = length2 - A0T.length();
                    if (length3 < length2 && length < length3) {
                        try {
                            int parseInt = Integer.parseInt(name2.substring(length, length3));
                            if (parseInt > i) {
                                file2 = file3;
                                i = parseInt;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        if (file2 != null) {
            return file2.getName();
        }
        return AnonymousClass000.A0V(".1", A0T, AnonymousClass000.A0l(A02));
    }
}
