package X;

import android.content.Context;
import com.whatsapp.TextData;

/* renamed from: X.5Bz  reason: invalid class name and case insensitive filesystem */
public final class C100715Bz {
    public static final AnonymousClass4QG A00(Context context, AnonymousClass67B r7, C30481mW r8) {
        Object obj;
        C18270x1.A14(context, r8);
        String A1w = r8.A1w();
        if (A1w != null) {
            obj = C107415bH.A05(A1w, 0, A1w.length(), 10, 700);
        } else {
            obj = "";
        }
        AnonymousClass4QG r1 = new AnonymousClass4QG(context);
        TextData textData = r8.A02;
        if (textData != null) {
            r1.setTextContentProperties(textData);
        }
        r1.A09 = r8;
        r1.A06 = r7;
        r1.A01 = null;
        r1.setTextContent(obj.toString());
        return r1;
    }
}
