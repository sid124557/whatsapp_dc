package X;

import android.graphics.Bitmap;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.8EE  reason: invalid class name */
public final class AnonymousClass8EE implements C185398ta {
    public AnonymousClass1LX A00;
    public final int A01;

    public /* bridge */ /* synthetic */ void BMf(C186038ue r2) {
        C181758nH r0;
        AnonymousClass8EI r22 = (AnonymousClass8EI) r2;
        if (r22.A00() && (r0 = r22.A06) != null) {
            r0.BMg(r22);
        }
    }

    public /* bridge */ /* synthetic */ void BVP(C186038ue r20) {
        C181768nI r0;
        AnonymousClass8EI r3 = (AnonymousClass8EI) r20;
        if (r3.A04 == 1) {
            ArrayList A0I = AnonymousClass002.A0I(2);
            AnonymousClass93T r9 = new AnonymousClass93T(r3, 1, this);
            C108815db r6 = r3.A05;
            int i = this.A01;
            AnonymousClass8EI r4 = new AnonymousClass8EI(r3.B8H(), r6, (C181758nH) null, (C181768nI) null, r9, 2, i, i);
            AnonymousClass8EI r10 = new AnonymousClass8EI(r3.B8H(), r6, (C181758nH) null, (C181768nI) null, r9, 3, Integer.MAX_VALUE, Integer.MAX_VALUE);
            A0I.add(r4);
            A0I.add(r10);
            r3.A02 = A0I;
            AnonymousClass1LX r02 = this.A00;
            if (r02 != null) {
                r02.A02(r4, true);
                this.A00.A02(r10, true);
            }
        } else if (r3.A00() && (r0 = r3.A07) != null) {
            r0.BVU(r3);
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

    public AnonymousClass8EE(int i) {
        this.A01 = i;
    }
}
