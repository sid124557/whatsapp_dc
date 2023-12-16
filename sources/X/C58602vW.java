package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.2vW  reason: invalid class name and case insensitive filesystem */
public class C58602vW {
    public final AnonymousClass1VX A00;
    public final C56142rU A01;
    public final Set A02;

    public static boolean A00(String str, String str2) {
        if (!(str == null || str2 == null)) {
            if (str2.equals("all") || str2.equals("none")) {
                throw AnonymousClass001.A0c("Name 'none' and 'all' are not supported");
            }
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            String lowerCase2 = str2.toLowerCase(locale);
            String trim = lowerCase.trim();
            if (!TextUtils.isEmpty(trim) && !trim.equals("none")) {
                boolean z = false;
                for (String trim2 : trim.split(";")) {
                    String trim3 = trim2.trim();
                    if (!TextUtils.isEmpty(trim3)) {
                        if (trim3.equals("all")) {
                            z = true;
                        }
                        if (trim3.equals(lowerCase2)) {
                            z = true;
                        }
                        if (trim3.startsWith("-") && lowerCase2.equals(trim3.substring(1))) {
                        }
                    }
                }
                return z;
            }
        }
        return false;
    }

    public C58602vW(AnonymousClass1VX r3, C56142rU r4) {
        HashSet A0D = C18260x0.A0D();
        A0D.add("blank_me_jid");
        A0D.add("participant_user");
        A0D.add("broadcast_me_jid");
        A0D.add("message_media");
        Set unmodifiableSet = Collections.unmodifiableSet(A0D);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = Collections.unmodifiableSet(AnonymousClass0x9.A15(unmodifiableSet));
    }
}
