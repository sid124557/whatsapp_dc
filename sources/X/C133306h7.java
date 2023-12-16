package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6h7  reason: invalid class name and case insensitive filesystem */
public class C133306h7 extends C169968Bi {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Resources A03;
    public final View A04;
    public final ViewGroup.LayoutParams A05;
    public final ViewGroup.LayoutParams A06;
    public final ViewGroup.LayoutParams A07;
    public final TextView A08;
    public final TextEmojiLabel A09;
    public final AnonymousClass8P2 A0A;
    public final AnonymousClass8P2 A0B;
    public final AnonymousClass8P2 A0C;
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

    public C133306h7(View view, View view2, TextView textView, TextEmojiLabel textEmojiLabel, C620733j r24) {
        View view3 = view2;
        Resources resources = view3.getResources();
        this.A03 = resources;
        this.A04 = view3;
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        this.A09 = textEmojiLabel2;
        TextView textView2 = textView;
        this.A08 = textView2;
        this.A07 = textEmojiLabel2.getLayoutParams();
        this.A01 = textEmojiLabel2.getTextSize();
        this.A06 = textView2.getLayoutParams();
        this.A05 = view3.getLayoutParams();
        this.A00 = textView2.getTextSize();
        this.A02 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0F = C169968Bi.A02(view3, 13);
        this.A0H = C169968Bi.A02(textEmojiLabel2, 13);
        this.A0G = C169968Bi.A02(textView2, 13);
        AnonymousClass8P2 A022 = C169968Bi.A02(this, 11);
        this.A0B = A022;
        AnonymousClass8P2 A023 = C169968Bi.A02(this, 12);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        View view4 = view;
        AnonymousClass8P2 A032 = C169968Bi.A03(new AnonymousClass8P2(new AnonymousClass936(view4, dimensionPixelSize, 0)), view3, 5);
        this.A0C = A032;
        this.A0A = C169968Bi.A03(A032, view3, 4);
        C620733j r12 = r24;
        this.A0D = new AnonymousClass8P2(new AnonymousClass935(view3, view4, this, r12, 1));
        this.A0E = new AnonymousClass8P2(new AnonymousClass936(view3, dimensionPixelSize, 1));
        AnonymousClass8P2 A033 = C169968Bi.A03(A022, textEmojiLabel2, 5);
        this.A0L = A033;
        this.A0N = new AnonymousClass8P2(new AnonymousClass936(textEmojiLabel2, dimensionPixelSize));
        AnonymousClass8P2 A034 = C169968Bi.A03(A033, textEmojiLabel2, 4);
        AnonymousClass8P2 A035 = C169968Bi.A03(A023, textView2, 5);
        this.A0I = A035;
        AnonymousClass8P2 A036 = C169968Bi.A03(A035, textView2, 4);
        this.A0M = new AnonymousClass8P2(new AnonymousClass8P1(view4, textEmojiLabel2, this, r12, A034));
        this.A0J = new AnonymousClass8P2(new AnonymousClass8P1(view4, textView2, this, r12, A036));
        this.A0K = new AnonymousClass8P2(new AnonymousClass8P0(textView2, this, dimensionPixelSize));
    }

    public static final void A00(View view, ViewGroup.LayoutParams layoutParams, AnonymousClass8P2 r4) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        view.setLayoutParams(layoutParams);
        view.setX((float) ((Rect) r4.get()).left);
        view.setY((float) ((Rect) r4.get()).top);
    }

    public static final void A01(View view, AnonymousClass8P2 r7, AnonymousClass8P2 r8, AnonymousClass8P2 r9, float f, int i) {
        float A002 = 1.0f - (AnonymousClass8P2.A00(r9) * f);
        view.setScaleX(A002);
        view.setScaleY(A002);
        float A003 = ((float) (-i)) + (AnonymousClass8P2.A00(r8) * f);
        float f2 = 1.0f - A002;
        view.setTranslationX((AnonymousClass8P2.A00(r7) * f) - ((AnonymousClass4L0.A00(view) / 2.0f) * f2));
        view.setTranslationY(A003 - ((C86664Kz.A02(view) / 2.0f) * f2));
    }
}
