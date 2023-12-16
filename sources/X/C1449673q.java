package X;

import android.text.Spannable;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.73q  reason: invalid class name and case insensitive filesystem */
public final class C1449673q {
    public static void A00(AnonymousClass03n r12, C153427bI r13, AnonymousClass84O r14, C186518vU r15) {
        try {
            List A0S = r14.A0S(42);
            List A0S2 = r14.A0S(35);
            List A0S3 = r14.A0S(38);
            List A0S4 = r14.A0S(41);
            AnonymousClass3AL r6 = new AnonymousClass3AL(r13, r14);
            C186518vU r3 = r15;
            Spannable B7q = r3.B7q(r12.getContext(), r13.A00, r6, (String) AnonymousClass84O.A05(r14, 43), A0S, A0S2, A0S3, A0S4);
            if (B7q != null) {
                r12.setText(B7q);
            }
        } catch (JSONException e) {
            C159737mN.A01("WaTextWithEntitiesComponentBinder", AnonymousClass000.A0P(e, "bind/exception parsing formatted string: ", AnonymousClass001.A0o()));
        }
        String str = (String) AnonymousClass84O.A05(r14, 44);
        if (str != null) {
            try {
                r12.setGravity(C162407s0.A07(str));
            } catch (AnonymousClass6u2 e2) {
                C159737mN.A00(r13, "WaTextWithEntitiesComponentBinder", "Failed to parse textAlign", e2);
            }
        }
        String str2 = (String) AnonymousClass84O.A05(r14, 45);
        if (str2 != null) {
            try {
                r12.setTextSize(C162407s0.A02(str2));
            } catch (AnonymousClass6u2 e3) {
                C159737mN.A00(r13, "WaTextWithEntitiesComponentBinder", "Failed to parse text size", e3);
            }
        }
        String A07 = AnonymousClass84O.A07(r14);
        if (A07 != null) {
            try {
                r12.setLineHeight((int) C162407s0.A01(A07));
            } catch (AnonymousClass6u2 e4) {
                C159737mN.A00(r13, "WaTextWithEntitiesComponentBinder", "Failed to parse line height pixel value", e4);
            }
        }
    }
}
