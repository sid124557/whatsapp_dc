package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5Wb  reason: invalid class name and case insensitive filesystem */
public class C105705Wb {
    public static final Double A03 = Double.valueOf(0.0d);
    public final C55682qk A00;
    public final C69263Wi A01;
    public final AnonymousClass4FS A02;

    public void A00(AnonymousClass5T3 r4) {
        String str = r4.A05;
        if (TextUtils.isEmpty(str)) {
            for (List A1U : r4.A06) {
                Log.e("DirectoryBusinessRankerValueModel/fallbackToSortByDistance Falling back to ranking by distance.");
                C86614Ku.A1U(A1U, 24);
            }
            if (!r4.A00) {
                r4.A03.BZM();
                return;
            }
            return;
        }
        C117715sN.A00(this.A02, this, r4, str, 22);
    }

    public C105705Wb(C55682qk r1, C69263Wi r2, AnonymousClass4FS r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
