package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.videoplayback.BloksVideoPlayerView;

/* renamed from: X.90n  reason: invalid class name and case insensitive filesystem */
public class C1892390n implements ViewTreeObserver.OnScrollChangedListener {
    public Object A00;
    public final int A01;

    public C1892390n(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onScrollChanged() {
        switch (this.A01) {
            case 0:
                C90514ha r4 = (C90514ha) this.A00;
                int i = 0;
                int bottom = r4.A08.getChildAt(0).getBottom();
                int height = r4.A08.getHeight() + r4.A08.getScrollY();
                View view = r4.A06;
                if (bottom <= height) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
            case 1:
                BloksVideoPlayerView bloksVideoPlayerView = (BloksVideoPlayerView) this.A00;
                boolean z = false;
                Rect rect = new Rect(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels);
                if (bloksVideoPlayerView.getLocalVisibleRect(rect) && (rect.height() * 100) / bloksVideoPlayerView.getHeight() >= 60 && (rect.width() * 100) / bloksVideoPlayerView.getWidth() >= 60) {
                    z = true;
                }
                C152437Yw r0 = bloksVideoPlayerView.A0A;
                boolean z2 = false;
                if (z) {
                    z2 = true;
                }
                bloksVideoPlayerView.A0A = new C152437Yw(r0.A01, z2, r0.A00);
                bloksVideoPlayerView.A02();
                return;
            default:
                AnonymousClass7LQ r1 = (AnonymousClass7LQ) this.A00;
                C162457s7.A0J(r1, 0);
                C140136tD r2 = C140136tD.A00;
                AnonymousClass08M r12 = r1.A01;
                if (!C162457s7.A0P(r12.A07(), r2)) {
                    r12.A0H(r2);
                    return;
                }
                return;
        }
    }
}
