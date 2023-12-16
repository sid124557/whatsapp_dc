package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.5Zp  reason: invalid class name and case insensitive filesystem */
public final class C106595Zp {
    public static final AnonymousClass5ZC A00 = new AnonymousClass5ZC(1, 1);
    public static final Set A01;

    static {
        Integer[] numArr = new Integer[29];
        AnonymousClass000.A1L(numArr, 128525);
        numArr[1] = 128514;
        numArr[2] = 128558;
        numArr[3] = 128546;
        C18280x3.A1P(numArr, 128591);
        C18310x6.A1U(numArr, 128079);
        C18290x4.A1U(numArr, 127881);
        C18310x6.A1V(numArr, 128175);
        numArr[8] = 128077;
        AnonymousClass001.A1G(128514, 128558, 128546, numArr);
        numArr[12] = 10084;
        numArr[13] = 128522;
        numArr[14] = 129392;
        numArr[15] = 129321;
        numArr[16] = 128154;
        numArr[17] = 129315;
        numArr[18] = 128518;
        numArr[19] = 128293;
        numArr[20] = 128588;
        numArr[21] = 129395;
        numArr[22] = 128557;
        numArr[23] = 128532;
        numArr[24] = 129402;
        numArr[25] = 128562;
        numArr[26] = 129327;
        numArr[27] = 128545;
        numArr[28] = 128548;
        A01 = C73833g9.A06(numArr);
    }

    public static final boolean A01(C69263Wi r5, C620633i r6, String str) {
        C18260x0.A0Q(r6, r5);
        ClipboardManager A0C = r6.A0C();
        if (A0C == null) {
            r5.A0H(R.string.f11nameremoved, 0);
            return false;
        } else if (str == null || str.length() == 0) {
            return true;
        } else {
            try {
                A0C.setPrimaryClip(ClipData.newPlainText(str, str));
                r5.A0H(R.string.f11nameremoved, 0);
                return true;
            } catch (NullPointerException | SecurityException e) {
                Log.e("invitelink/copy/npe", e);
                r5.A0H(R.string.f11nameremoved, 0);
                return false;
            }
        }
    }

    public static final List A00(String str) {
        ArrayList A0r = C18300x5.A0r(str);
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (C18300x5.A1X(A01, jSONArray.getInt(i))) {
                    C18270x1.A1K(A0r, jSONArray.getInt(i));
                }
            }
        } catch (JSONException e) {
            C18260x0.A0u("statusreply/statusreactions/invalid emoji list JSONArray:", str, AnonymousClass001.A0o(), e);
        }
        return A0r;
    }
}
