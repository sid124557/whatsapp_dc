package X;

import android.graphics.Bitmap;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.8ED  reason: invalid class name */
public final class AnonymousClass8ED implements C185398ta {
    public AnonymousClass1LX A00;
    public final int A01;

    public /* bridge */ /* synthetic */ void BMf(C186038ue r2) {
        C181758nH r0;
        AnonymousClass8EI r22 = (AnonymousClass8EI) r2;
        if (r22.A00() && (r0 = r22.A06) != null) {
            r0.BMg(r22);
        }
    }

    public /* bridge */ /* synthetic */ void BVP(C186038ue r21) {
        C181768nI r0;
        AnonymousClass8EI r4 = (AnonymousClass8EI) r21;
        if (r4.A04 == 1) {
            ArrayList A0I = AnonymousClass002.A0I(2);
            AnonymousClass93T r10 = new AnonymousClass93T(r4, 0, this);
            C108815db r7 = r4.A05;
            int i = this.A01;
            AnonymousClass8EI r5 = new AnonymousClass8EI(r4.B8H(), r7, (C181758nH) null, (C181768nI) null, r10, 2, i, i);
            AnonymousClass8EI r11 = new AnonymousClass8EI(r4.B8H(), r7, (C181758nH) null, (C181768nI) null, r10, 3, Integer.MAX_VALUE, Integer.MAX_VALUE);
            A0I.add(r5);
            A0I.add(r11);
            r4.A02 = A0I;
            AnonymousClass1LX r02 = this.A00;
            if (r02 != null) {
                r02.A02(r5, true);
                this.A00.A02(r11, true);
            }
        } else if (r4.A00() && (r0 = r4.A07) != null) {
            r0.BVU(r4);
        }
    }

    public /* bridge */ /* synthetic */ void BVY(C186038ue r1) {
    }

    public /* bridge */ /* synthetic */ void BVd(Bitmap bitmap, C186038ue r5, boolean z) {
        AnonymousClass8EI r52 = (AnonymousClass8EI) r5;
        if (r52.A00()) {
            if (r52.B8H() != null) {
                r52.B8H().setTag(R.id.loaded_image_url, r52.BE7());
            }
            r52.A08.BVc(bitmap, r52, z);
        }
    }

    public AnonymousClass8ED(int i) {
        this.A01 = i;
    }
}
