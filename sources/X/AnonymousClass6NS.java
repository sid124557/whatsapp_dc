package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.soloader.SysUtil$Api14Utils;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6NS  reason: invalid class name */
public class AnonymousClass6NS extends AnonymousClass7Uk {
    public final File A00;
    public final Map A01 = AnonymousClass001.A0t();
    public final Set A02;

    public AnonymousClass6NS(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        this.A02 = A00(lastIndexOf > 0 ? AnonymousClass0x7.A0r(name, lastIndexOf) : name, file.getAbsolutePath());
        this.A00 = file;
    }

    public static Set A00(String str, String str2) {
        HashSet A0K = AnonymousClass002.A0K();
        String A002 = SysUtil$Api14Utils.A00();
        if (A002 != null) {
            for (String str3 : A002.split(":")) {
                if (str3.contains(AnonymousClass000.A0X(".apk!/", AnonymousClass000.A0l(str)))) {
                    A0K.add(str3);
                }
            }
        }
        if (A0K.isEmpty()) {
            String[] A022 = C159237lU.A02();
            if (!TextUtils.isEmpty(str2) && A022.length > 0) {
                StringBuilder A0l = AnonymousClass000.A0l(str2);
                A0l.append("!/lib/");
                String A0X = AnonymousClass000.A0X(A022[0], A0l);
                if (A0X != null) {
                    A0K.add(A0X);
                }
            }
        }
        return A0K;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(AnonymousClass000.A0O(this));
        A0o.append("[root = ");
        AnonymousClass000.A1B(this.A02, A0o);
        return AnonymousClass0x2.A0f(A0o);
    }

    public AnonymousClass6NS(Context context) {
        String str = context.getApplicationInfo().sourceDir;
        this.A02 = A00("", str);
        this.A00 = AnonymousClass002.A0B(str);
    }
}
