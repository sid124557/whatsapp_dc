package X;

import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import java.util.List;

/* renamed from: X.2Zy  reason: invalid class name and case insensitive filesystem */
public final class C45412Zy {
    public final C44522Wj A00;
    public final C48182eU A01;
    public final C60482yd A02;

    public final BkFcsPreloadingScreenFragment A00(C08270df r3) {
        Object A0c;
        List A05 = r3.A0Y.A05();
        C162457s7.A0D(A05);
        if (A05.isEmpty()) {
            A0c = null;
        } else {
            A0c = C18300x5.A0c(A05);
        }
        C08310eF r1 = (C08310eF) A0c;
        if (r1 instanceof BkFcsPreloadingScreenFragment) {
            return (BkFcsPreloadingScreenFragment) r1;
        }
        if (r1 != null) {
            return A00(r1.A0T());
        }
        return null;
    }

    public C45412Zy(C44522Wj r1, C48182eU r2, C60482yd r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
