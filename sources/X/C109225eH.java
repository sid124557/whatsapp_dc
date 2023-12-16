package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5eH  reason: invalid class name and case insensitive filesystem */
public class C109225eH implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ ImageComposerFragment A00;
    public final /* synthetic */ MediaComposerFragment A01;

    public C109225eH(ImageComposerFragment imageComposerFragment) {
        this.A00 = imageComposerFragment;
        this.A01 = imageComposerFragment;
    }

    public void A00() {
        Uri uri;
        Uri uri2;
        ImageComposerFragment imageComposerFragment = this.A00;
        C186068uh A1E = C86664Kz.A1E(imageComposerFragment);
        if (!(A1E == null || (uri2 = imageComposerFragment.A00) == null)) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1E;
            AnonymousClass4SG.A2l(uri2, mediaComposerActivity).A0D(imageComposerFragment.A07.A01);
            if (mediaComposerActivity.A0t.A06()) {
                mediaComposerActivity.A7L(uri2);
                mediaComposerActivity.A0w.A08.A02.A05();
            }
        }
        if (imageComposerFragment.A16()) {
            if (imageComposerFragment.A0Q() != null && imageComposerFragment.A08.getDrawable() == null) {
                imageComposerFragment.A0Q().A5V();
            }
            imageComposerFragment.A08.A06(imageComposerFragment.A07.A03);
            C114825nf r7 = imageComposerFragment.A0E;
            if (r7 != null) {
                C156767hA r2 = r7.A0U;
                r2.A02 = null;
                r2.A03 = null;
                if (r7.A0A) {
                    for (C95954vE A0X : r7.A0T.A01()) {
                        A0X.A0X(r2);
                    }
                    r7.A0A = false;
                }
                C106085Xo r6 = r7.A0L;
                Bitmap bitmap = r6.A05;
                if (bitmap != null) {
                    bitmap.eraseColor(0);
                }
                AnonymousClass5US r0 = r6.A0H;
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = r0.A04.iterator();
                while (it.hasNext()) {
                    C105425Uw A1F = C86664Kz.A1F(it);
                    if (A1F instanceof C95954vE) {
                        C95954vE r1 = (C95954vE) A1F;
                        if (r1.A03 instanceof AnonymousClass4vL) {
                            A0s.add(r1);
                        }
                    }
                }
                if (!A0s.isEmpty()) {
                    r6.A03(true);
                    Iterator it2 = A0s.iterator();
                    while (it2.hasNext()) {
                        C95954vE r4 = (C95954vE) it2.next();
                        C106115Xr r3 = r4.A03;
                        if (r3 instanceof AnonymousClass4vL) {
                            Bitmap bitmap2 = r6.A05;
                            PointF pointF = r6.A0D;
                            int i = r6.A00;
                            r4.A01 = bitmap2;
                            r4.A02 = pointF;
                            r4.A00 = i;
                        }
                        r4.A05 = false;
                        Bitmap bitmap3 = r4.A01;
                        if (bitmap3 != null) {
                            r3.A01(bitmap3, r4.A02, r4.A00);
                            C106115Xr r12 = r4.A03;
                            Canvas canvas = r12.A00;
                            if (canvas != null) {
                                r12.A02(canvas);
                            }
                        }
                    }
                }
                r7.A0M.invalidate();
            }
            Bitmap bitmap4 = imageComposerFragment.A07.A03;
            if (imageComposerFragment.A0E != null && bitmap4 != null && (uri = imageComposerFragment.A00) != null) {
                Rect A03 = AnonymousClass4SG.A2l(uri, C86644Kx.A0Y(imageComposerFragment)).A03();
                RectF A0b = C86664Kz.A0b((float) bitmap4.getWidth(), (float) bitmap4.getHeight());
                if (A03 != null) {
                    imageComposerFragment.A1V(A03, A0b, 0, -1);
                }
            }
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ImageComposerFragment imageComposerFragment = this.A00;
        boolean onDoubleTap = imageComposerFragment.A06.A04.onDoubleTap(motionEvent);
        if (onDoubleTap) {
            imageComposerFragment.A1X(false, true);
        }
        return onDoubleTap;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }
}
