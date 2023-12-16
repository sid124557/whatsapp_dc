package X;

import com.whatsapp.util.Log;

/* renamed from: X.3My  reason: invalid class name and case insensitive filesystem */
public class C66833My implements C84554Cu {
    public final C612830a A00;

    public boolean BLR(C51692kE r3, C624134x r4) {
        C614630w A0y;
        if (r3.A00.contains(C370920x.SKIP_THUMBNAILS) || (A0y = r4.A0y()) == null || A0y.A06()) {
            return false;
        }
        return true;
    }

    public C66833My(C612830a r1) {
        this.A00 = r1;
    }

    public void A00(C614630w r3) {
        if (!r3.A06()) {
            Log.d("FMessageThumbnailLazyLoader/ensureLoaded/Thumbnail hasn't been loaded, we must retrieve it");
            byte[] A08 = r3.A08();
            if (A08 == null) {
                A08 = this.A00.A05(r3.A04);
            }
            r3.A02(A08);
            return;
        }
        Log.d("FMessageThumbnailLazyLoader/ensureLoaded/Thumbnail has already been loaded, no further action required");
    }

    public void BJr(C51692kE r2, C624134x r3) {
        if (BLR(r2, r3) && r3.A0y() != null) {
            A00(r3.A0y());
        }
    }
}
