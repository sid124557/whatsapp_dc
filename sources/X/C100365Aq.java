package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.camera.DragGalleryStripIndicator;
import com.whatsapp.components.SegmentedProgressBar;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;

/* renamed from: X.5Aq  reason: invalid class name and case insensitive filesystem */
public class C100365Aq implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C100365Aq(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A02) {
            case 0:
                AnonymousClass5UD r4 = (AnonymousClass5UD) this.A01;
                int i = this.A00;
                float A03 = AnonymousClass001.A03(valueAnimator);
                RecyclerView recyclerView = r4.A0A;
                recyclerView.getLayoutParams().height = (int) (((float) i) * A03);
                recyclerView.requestLayout();
                DragGalleryStripIndicator dragGalleryStripIndicator = r4.A03;
                if (dragGalleryStripIndicator != null) {
                    dragGalleryStripIndicator.setOffset(A03);
                    return;
                }
                return;
            case 1:
                SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) this.A01;
                segmentedProgressBar.A0D[this.A00] = AnonymousClass001.A03(valueAnimator);
                segmentedProgressBar.postInvalidate();
                return;
            case 2:
                int i2 = this.A00;
                int A012 = C86604Kt.A01(valueAnimator);
                AnonymousClass4PD.A00((ConversationsFragment) this.A01, A012).setTranslationY((float) (A012 - i2));
                return;
            case 3:
                int i3 = this.A00;
                TitleBarView titleBarView = ((C105305Uj) this.A01).A0I;
                float A032 = AnonymousClass001.A03(valueAnimator);
                AnonymousClass4Lt r1 = titleBarView.A0M;
                if (r1 == null) {
                    throw C18270x1.A0S("textToolDrawable");
                }
                r1.A02 = 0.0f;
                r1.A03 = i3;
                r1.A01 = A032;
                r1.invalidateSelf();
                return;
            default:
                C115815pH r3 = (C115815pH) this.A01;
                int A033 = (int) (((float) this.A00) * (AnonymousClass001.A03(valueAnimator) / 100.0f));
                FrameLayout.LayoutParams A0r = C86664Kz.A0r(r3.A01);
                A0r.topMargin = -A033;
                r3.A01.setLayoutParams(A0r);
                return;
        }
    }
}
