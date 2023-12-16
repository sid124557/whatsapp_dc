package X;

import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import java.io.File;

/* renamed from: X.5An  reason: invalid class name and case insensitive filesystem */
public class C100335An {
    public static int A00(C111095hX r4, C55682qk r5, C89654ea r6, C69263Wi r7, AnonymousClass5ZR r8, C48042eF r9, AnonymousClass1nF r10, C105025Tg r11, C187958y5 r12, AnonymousClass4FS r13) {
        int i;
        C89654ea r3 = r6;
        if (C107385bE.A08() || r8.A0E()) {
            AnonymousClass1nF r62 = r10;
            AnonymousClass33C A00 = C30471mV.A00(r10);
            if (!r10.A1J.A02 && !A00.A0R) {
                return 1;
            }
            File file = A00.A0F;
            if ((file == null || !file.exists()) && A00.A07 == 1) {
                return 4;
            }
            File file2 = A00.A0F;
            if (file2 == null || !file2.exists()) {
                return 2;
            }
            C107105ah.A02(r4, r5, r3, r7, r9, r62, r11, r12, r13);
            return 3;
        }
        if (!C107385bE.A08()) {
            i = R.string.f11nameremoved;
        } else {
            boolean A0A = C107385bE.A0A();
            i = R.string.f11nameremoved;
            if (!A0A) {
                i = R.string.f11nameremoved;
            }
        }
        r6.startActivity(RequestPermissionActivity.A0C(r6, R.string.f11nameremoved, i, false));
        return 0;
    }
}
