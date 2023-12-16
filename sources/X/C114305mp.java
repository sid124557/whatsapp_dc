package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.5mp  reason: invalid class name and case insensitive filesystem */
public class C114305mp implements C185708u7 {
    public final float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ MediaViewBaseFragment A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r4.A1X() == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C114305mp(android.view.View r3, com.whatsapp.mediaview.MediaViewBaseFragment r4) {
        /*
            r2 = this;
            r2.A02 = r4
            r2.A01 = r3
            r2.<init>()
            X.5b2 r0 = r4.A0B
            boolean r0 = r0 instanceof X.C96014vU
            if (r0 != 0) goto L_0x0016
            boolean r1 = r4.A1X()
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            if (r1 != 0) goto L_0x0018
        L_0x0016:
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0018:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114305mp.<init>(android.view.View, com.whatsapp.mediaview.MediaViewBaseFragment):void");
    }

    public boolean BHS(View view) {
        return AnonymousClass000.A1Y(view, this.A02.A04);
    }

    public void BRJ(View view) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        C107275b2 r1 = mediaViewBaseFragment.A0B;
        if (((r1 instanceof C96014vU) || !mediaViewBaseFragment.A1X()) && (r1 instanceof C96024vV)) {
            mediaViewBaseFragment.A09.setAlpha(0.0f);
        }
        mediaViewBaseFragment.A1Q();
    }

    public void BRe(int i) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        if (mediaViewBaseFragment instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) mediaViewBaseFragment;
            AnonymousClass5YG r1 = mediaViewFragment.A1n;
            if (i == 1) {
                if (r1 != null) {
                    r1.A0C();
                    AnonymousClass561 A0A = mediaViewFragment.A1n.A0A();
                    if (A0A != null && !C86604Kt.A1Y(A0A.A0E)) {
                        A0A.A05();
                        A0A.A0E(3000);
                    }
                }
                mediaViewFragment.A1b();
            } else if (r1 != null && r1.A0A() == null) {
                r1.A0N();
            }
        }
    }

    public void BbQ(View view) {
        C185918uS r0 = (C185918uS) this.A02.A0Q();
        if (r0 != null) {
            r0.Bdm();
        }
    }

    public void Bbl(View view, float f) {
        float f2;
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        C185918uS r1 = (C185918uS) mediaViewBaseFragment.A0Q();
        if (r1 != null && !r1.isFinishing()) {
            r1.BRO();
            float f3 = 1.0f - f;
            float f4 = this.A00;
            if (f3 < f4) {
                f2 = 0.0f;
            } else {
                f2 = (f3 - f4) / (1.0f - f4);
            }
            this.A01.setAlpha(f2);
            mediaViewBaseFragment.A03.setAlpha(f2);
            mediaViewBaseFragment.A07.setAlpha(f2);
            if ((mediaViewBaseFragment.A0B instanceof C96014vU) || !mediaViewBaseFragment.A1X()) {
                mediaViewBaseFragment.A09.setAlpha(f2);
            }
            int childCount = mediaViewBaseFragment.A09.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mediaViewBaseFragment.A09.getChildAt(i).findViewById(R.id.footer).setAlpha(f2 * f2);
            }
            mediaViewBaseFragment.A1W(true, true);
        }
    }
}
