package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.bonsai.commands.BotCommandsPickerView;
import com.whatsapp.mentions.MentionPickerView;

/* renamed from: X.4mS  reason: invalid class name and case insensitive filesystem */
public abstract class C92314mS extends C89764et {
    public int A00;
    public ValueAnimator A01;
    public View A02;
    public View A03;
    public AnonymousClass1VX A04;

    public abstract View getContentView();

    public void A05() {
        if (this instanceof MentionPickerView) {
            MentionPickerView mentionPickerView = (MentionPickerView) this;
            if (mentionPickerView.A0O) {
                mentionPickerView.A08(mentionPickerView.A0L.A07.size(), mentionPickerView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
            } else {
                mentionPickerView.A08(0, 0);
            }
        } else {
            BotCommandsPickerView botCommandsPickerView = (BotCommandsPickerView) this;
            AnonymousClass4WQ r0 = botCommandsPickerView.A02;
            if (r0 != null) {
                botCommandsPickerView.A0A(r0.A01.size());
            }
        }
    }

    public final void A06() {
        if (this.A02 != null) {
            ViewGroup.LayoutParams layoutParams = getContentView().getLayoutParams();
            layoutParams.width = this.A02.getWidth();
            getContentView().setLayoutParams(layoutParams);
        }
    }

    public void A07(int i) {
        int i2;
        if (i != this.A00) {
            this.A00 = i;
            ValueAnimator valueAnimator = this.A01;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (C86604Kt.A1Y(this)) {
                i2 = getHeight();
            } else {
                i2 = 0;
            }
            ValueAnimator A0Q = C86664Kz.A0Q(C86664Kz.A1a(i2), i);
            this.A01 = A0Q;
            C100295Aj.A03(A0Q, this, 9);
            this.A01.addListener(new AnonymousClass67F(this, i, 1));
            this.A01.setDuration(250);
            this.A01.start();
        }
    }

    public void A08(int i, int i2) {
        int i3;
        if (i != 0) {
            if (this.A04.A0X(571)) {
                i3 = i2 * Math.min(2, i);
            } else {
                int actionBarSize = getActionBarSize();
                Display defaultDisplay = C620633i.A01(getContext()).getDefaultDisplay();
                Point A07 = AnonymousClass4L0.A07();
                defaultDisplay.getSize(A07);
                int i4 = A07.y;
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                View view = this.A03;
                if (view == null) {
                    view = (View) getParent().getParent();
                    this.A03 = view;
                }
                view.getLocationOnScreen(iArr2);
                double d = (double) i2;
                int min = Math.min((int) (((((double) i4) * 0.5d) - ((double) actionBarSize)) - ((double) ((int) (1.25d * d)))), (C86634Kw.A09(this, iArr) - iArr2[1]) - ((int) (0.6d * d))) / i2;
                if (i > min) {
                    i3 = (min * i2) + ((int) (d * 0.5d));
                } else {
                    i3 = i2 * i;
                }
            }
            if (i3 != 0) {
                A07(i3);
                return;
            }
        }
        if (getVisibility() == 0) {
            A07(0);
        }
    }

    public void A09(boolean z) {
        if (this instanceof MentionPickerView) {
            C182728ot r0 = ((MentionPickerView) this).A0J;
            if (r0 != null) {
                r0.BOd(z);
                return;
            }
            return;
        }
        C179108ic r02 = ((BotCommandsPickerView) this).A04;
        if (r02 != null) {
            C113245l7 r1 = ((AnonymousClass8F3) r02).A00;
            int i = R.drawable.ib_new_expanded_bottom;
            if (!z) {
                i = r1.A0V(2);
            }
            r1.A1Q(i);
            r1.A1J();
        }
    }

    public double getAvailableScreenHeightPercentage() {
        return 0.5d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.A02 != null && getVisibility() == 0) {
            AnonymousClass6BG.A00(getViewTreeObserver(), this, 15);
        }
    }

    public void setAnchorWidthView(View view) {
        this.A02 = view;
        A06();
    }

    private int getActionBarSize() {
        TypedArray obtainStyledAttributes = C86614Ku.A0C(this).obtainStyledAttributes(new int[]{16843499});
        try {
            return (int) obtainStyledAttributes.getDimension(0, 0.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setConstraintParentView(View view) {
        this.A03 = view;
    }

    public C92314mS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C92314mS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C92314mS(Context context) {
        super(context);
    }
}
