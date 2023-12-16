package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

/* renamed from: X.04R  reason: invalid class name */
public class AnonymousClass04R extends AppCompatImageView implements C16490tU {
    public final /* synthetic */ C07530bB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass04R(Context context, C07530bB r4) {
        super(context, (AttributeSet) null, R.attr.f3nameremoved);
        this.A00 = r4;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        C02550Gr.A00(this, getContentDescription());
        setOnTouchListener(new C17530vj(this, this, r4, 0));
    }

    public boolean BLP() {
        return false;
    }

    public boolean BLQ() {
        return false;
    }

    public boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.A00.A03();
        }
        return true;
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AnonymousClass0YG.A07(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
