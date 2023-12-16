package X;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Af  reason: invalid class name and case insensitive filesystem */
public class C100265Af {
    public static Pair A00(C620733j r8, List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        int size = list.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            AnonymousClass3ZH contact = ((C182128nu) list.get(i)).getContact();
            if (contact != null) {
                String A0J = contact.A0J();
                if (!TextUtils.isEmpty(A0J)) {
                    String upperCase = C107575bX.A0C(A0J, 1).toUpperCase(C620733j.A02(r8));
                    if (Character.isDigit(upperCase.codePointAt(0)) || "+".equals(upperCase)) {
                        upperCase = "#";
                    }
                    if (!str.equals(upperCase)) {
                        A0s.add(upperCase);
                        C18270x1.A1K(A0s2, i);
                        str = upperCase;
                    }
                }
            }
        }
        return AnonymousClass0x9.A0C(A0s, A0s2);
    }
}
