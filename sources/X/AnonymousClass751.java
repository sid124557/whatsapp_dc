package X;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.751  reason: invalid class name */
public final class AnonymousClass751 {
    public static final C152417Yu A00(C08310eF r5) {
        C633638y r4;
        Bundle A0H = r5.A0H();
        Parcelable parcelable = A0H.getParcelable("argPrompt");
        if (parcelable instanceof C633638y) {
            r4 = (C633638y) parcelable;
        } else {
            r4 = null;
        }
        int i = A0H.getInt("argDisclosureId", -1);
        int i2 = A0H.getInt("argPromptIndex", -1);
        if (r4 == null || i == -1 || i2 == -1) {
            return null;
        }
        return new C152417Yu(r4, i, i2);
    }
}
