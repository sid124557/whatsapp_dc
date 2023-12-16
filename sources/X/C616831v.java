package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.util.List;
import java.util.Set;

/* renamed from: X.31v  reason: invalid class name and case insensitive filesystem */
public class C616831v {
    public static List A00;

    public static boolean A00(AnonymousClass1VX r4, Jid jid) {
        if (jid != null) {
            C58422vE r2 = C58422vE.A02;
            if (r4.A0Y(r2, 1377)) {
                List list = A00;
                if (list == null) {
                    String A0R = r4.A0R(r2, 1607);
                    if (!TextUtils.isEmpty(A0R)) {
                        C626936e.A06(A0R);
                        list = C18310x6.A0t(A0R);
                        A00 = list;
                    }
                }
                return list.contains(jid.user);
            }
        }
        return false;
    }

    public static boolean A02(AnonymousClass1VX r5, C58932w3 r6) {
        if (2 == r6.A06) {
            String str = r6.A01;
            try {
                Uri parse = Uri.parse(str);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (!parse.getHost().contains("whatsapp.com") || !parse.getPath().equals("/survey/") || ((!queryParameterNames.contains("oid") && !queryParameterNames.contains("session")) || !r5.A0Y(C58422vE.A02, 1377))) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("InAppSurveyUtils/isInAppSurveyURL/<");
                A0o.append(str);
                C18260x0.A1Q(A0o, "> is not a valid URL. Error=", e);
            }
        }
        return false;
    }

    public static boolean A01(AnonymousClass1VX r3, C30341mI r4) {
        String rawString = AnonymousClass2z0.A00(r4).getRawString();
        String A0R = r3.A0R(C58422vE.A02, 1924);
        if (TextUtils.isEmpty(A0R) || !rawString.equals(A0R)) {
            return false;
        }
        return true;
    }
}
