package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6h8  reason: invalid class name and case insensitive filesystem */
public class C133316h8 extends C169968Bi {
    public final float A00;
    public final float A01;
    public final Resources A02;
    public final View A03;
    public final View A04;
    public final ViewGroup.LayoutParams A05;
    public final ViewGroup.MarginLayoutParams A06;
    public final TextView A07;
    public final TextView A08;
    public final AnonymousClass08M A09 = AnonymousClass08M.A01();
    public final TextEmojiLabel A0A;
    public final TextEmojiLabel A0B;
    public final C620733j A0C;
    public final AnonymousClass8P2 A0D;
    public final AnonymousClass8P2 A0E;
    public final AnonymousClass8P2 A0F;
    public final AnonymousClass8P2 A0G;
    public final AnonymousClass8P2 A0H;
    public final AnonymousClass8P2 A0I;
    public final AnonymousClass8P2 A0J;
    public final AnonymousClass8P2 A0K;
    public final AnonymousClass8P2 A0L;
    public final AnonymousClass8P2 A0M;
    public final AnonymousClass8P2 A0N;
    public final AnonymousClass8P2 A0O;
    public final AnonymousClass8P2 A0P;
    public final AnonymousClass8P2 A0Q;
    public final AnonymousClass8P2 A0R;

    public C133316h8(View view, View view2, TextView textView, TextView textView2, TextEmojiLabel textEmojiLabel, TextEmojiLabel textEmojiLabel2, C620733j r16) {
        C620733j r7 = r16;
        this.A0C = r7;
        this.A03 = (View) view2.getParent();
        this.A02 = view2.getResources();
        this.A04 = view2;
        this.A0B = textEmojiLabel;
        this.A0A = textEmojiLabel2;
        this.A08 = textView;
        this.A07 = textView2;
        this.A06 = AnonymousClass001.A0T(textEmojiLabel);
        this.A01 = textEmojiLabel.getTextSize();
        this.A05 = textView.getLayoutParams();
        this.A00 = textView.getTextSize();
        this.A0D = C169968Bi.A03(view, this, 0);
        this.A0J = C169968Bi.A03(view2, this, 1);
        this.A0E = C169968Bi.A03(view2, this, 2);
        this.A0K = new AnonymousClass8P2(new AnonymousClass935(view2, view, this, r7, 0));
        this.A0L = C169968Bi.A03(view2, this, 3);
        this.A0N = C169968Bi.A02(textEmojiLabel, 3);
        this.A0I = C169968Bi.A02(this, 4);
        this.A0H = new AnonymousClass8P2(new AnonymousClass937(view, this, r7, 0));
        this.A0Q = C169968Bi.A02(this, 5);
        this.A0R = C169968Bi.A02(this, 6);
        this.A0M = C169968Bi.A02(textView, 7);
        this.A0G = C169968Bi.A02(this, 8);
        this.A0F = new AnonymousClass8P2(new AnonymousClass937(view, this, r7, 1));
        this.A0O = C169968Bi.A02(this, 9);
        this.A0P = C169968Bi.A02(this, 10);
    }

    public final void A0E(AppBarLayout appBarLayout, float f, int i) {
        int i2 = (((double) f) > 0.5d ? 1 : (((double) f) == 0.5d ? 0 : -1));
        TextEmojiLabel textEmojiLabel = this.A0A;
        if (i2 < 0) {
            textEmojiLabel.setVisibility(8);
            float A002 = 1.0f - (AnonymousClass8P2.A00(this.A0Q) * f);
            TextEmojiLabel textEmojiLabel2 = this.A0B;
            A00(textEmojiLabel2, AnonymousClass4L0.A00(textEmojiLabel2) / 2.0f, C86664Kz.A02(textEmojiLabel2) / 2.0f, 0.0f, (AnonymousClass8P2.A00(this.A0R) * f) + ((float) (-i)), A002);
            textEmojiLabel2.setAlpha(1.0f - (f * 2.0f));
            return;
        }
        textEmojiLabel.setVisibility(0);
        this.A0B.setAlpha(0.0f);
        A0C(appBarLayout);
        C620733j r4 = this.A0C;
        int i3 = 51;
        if (r4.A0U()) {
            i3 = 53;
        }
        textEmojiLabel.setGravity(i3);
        int i4 = -1;
        if (r4.A0U()) {
            i4 = 1;
        }
        float f2 = (f - 0.5f) * 2.0f;
        textEmojiLabel.setTranslationX((((float) (i4 * textEmojiLabel.getLeft())) / 4.0f) * (1.0f - f2));
        textEmojiLabel.setTranslationY((float) (-i));
        textEmojiLabel.setAlpha(f2);
    }

    public final ViewGroup.MarginLayoutParams A08(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A06;
        if (marginLayoutParams instanceof RelativeLayout.LayoutParams) {
            return new RelativeLayout.LayoutParams(i, i2);
        }
        if (marginLayoutParams instanceof AnonymousClass6FB) {
            return new AnonymousClass6FB(i, i2);
        }
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            return new LinearLayout.LayoutParams(i, i2);
        }
        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
            return new FrameLayout.LayoutParams(i, i2);
        }
        throw AnonymousClass001.A0e("Title view parent is of an unsupported type. Provide a custom LayoutParams factory.");
    }

    public final void A09(int i, float f) {
        A00(this.A04, 0.0f, 0.0f, AnonymousClass8P2.A00(this.A0K) * f, ((float) (-i)) + (AnonymousClass8P2.A00(this.A0L) * f), 1.0f - (AnonymousClass8P2.A00(this.A0J) * f));
    }

    public final void A0A(Rect rect, ViewGroup.MarginLayoutParams marginLayoutParams, AppBarLayout appBarLayout) {
        if (this.A0C.A0T()) {
            marginLayoutParams.leftMargin = rect.left;
        } else {
            marginLayoutParams.rightMargin = appBarLayout.getWidth() - rect.right;
        }
        marginLayoutParams.topMargin = rect.top;
    }

    public final void A0B(AppBarLayout appBarLayout) {
        Rect rect = (Rect) this.A0F.get();
        ViewGroup.MarginLayoutParams A082 = A08(rect.width(), rect.height());
        A0A(rect, A082, appBarLayout);
        TextView textView = this.A07;
        if (textView.getWidth() != rect.width()) {
            textView.setLayoutParams(A082);
        }
    }

    public final void A0C(AppBarLayout appBarLayout) {
        Rect rect = (Rect) this.A0H.get();
        ViewGroup.MarginLayoutParams A082 = A08(rect.width(), rect.height());
        A0A(rect, A082, appBarLayout);
        TextEmojiLabel textEmojiLabel = this.A0A;
        if (textEmojiLabel.getWidth() != rect.width()) {
            textEmojiLabel.setLayoutParams(A082);
        }
    }

    public final void A0D(AppBarLayout appBarLayout, float f, int i) {
        int i2 = (((double) f) > 0.5d ? 1 : (((double) f) == 0.5d ? 0 : -1));
        TextView textView = this.A07;
        int i3 = i;
        if (i2 < 0) {
            textView.setVisibility(8);
            float A002 = 1.0f - (AnonymousClass8P2.A00(this.A0O) * f);
            TextView textView2 = this.A08;
            A00(textView2, AnonymousClass4L0.A00(textView2) / 2.0f, C86664Kz.A02(textView2) / 2.0f, 0.0f, (AnonymousClass8P2.A00(this.A0P) * f) + ((float) (-i3)), A002);
            textView2.setAlpha(1.0f - (f * 2.0f));
            return;
        }
        textView.setVisibility(0);
        TextView textView3 = this.A08;
        textView3.setAlpha(0.0f);
        A0B(appBarLayout);
        C620733j r5 = this.A0C;
        int i4 = 51;
        if (r5.A0U()) {
            i4 = 53;
        }
        textView.setGravity(i4);
        int i5 = -1;
        if (r5.A0U()) {
            i5 = 1;
        }
        float f2 = (f - 0.5f) * 2.0f;
        textView.setTranslationX((((float) (i5 * textView3.getLeft())) / 4.0f) * (1.0f - f2));
        textView.setTranslationY((float) (-i3));
        textView.setAlpha(f2);
    }

    public static final void A00(View view, float f, float f2, float f3, float f4, float f5) {
        view.setScaleX(f5);
        view.setScaleY(f5);
        float f6 = 1.0f - f5;
        view.setTranslationX(f3 - (((AnonymousClass4L0.A00(view) / 2.0f) - f) * f6));
        view.setTranslationY(f4 - (((C86664Kz.A02(view) / 2.0f) - f2) * f6));
    }
}
