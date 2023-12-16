package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.reactions.ReactionEmojiTextView;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.List;

/* renamed from: X.4pj  reason: invalid class name and case insensitive filesystem */
public class C94024pj extends AnonymousClass4QN implements AnonymousClass4GJ {
    public int A00;
    public AnimatorSet A01;
    public C56972sr A02;
    public C620633i A03;
    public C56612sH A04;
    public C620733j A05;
    public C56982ss A06;
    public AnonymousClass1VX A07;
    public AnonymousClass5U1 A08;
    public C60152y5 A09;
    public C58742vk A0A;
    public C187958y5 A0B;
    public AnonymousClass4FS A0C;
    public C116855qy A0D;
    public boolean A0E;
    public final AnimatorSet A0F;
    public final ReactionsTrayViewModel A0G;
    public final int[] A0H;

    public C94024pj(Context context, ReactionsTrayViewModel reactionsTrayViewModel) {
        super(context);
        AnonymousClass1RL r2;
        if (!this.A0E) {
            this.A0E = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A04 = C64333Db.A2p(A002);
            this.A07 = C64333Db.A4B(A002);
            this.A0C = C64333Db.A8y(A002);
            this.A02 = C64333Db.A06(A002);
            this.A06 = C64333Db.A39(A002);
            this.A0B = C86614Ku.A0o(A002);
            this.A03 = C64333Db.A2o(A002);
            this.A05 = C64333Db.A2t(A002);
            this.A0A = (C58742vk) A002.ATH.get();
            this.A09 = C64333Db.A74(A002);
            this.A08 = (AnonymousClass5U1) A002.A00.A7W.get();
        }
        int i = ReactionsTrayViewModel.A0H;
        this.A0H = new int[(i + 1)];
        this.A0F = C86664Kz.A0O();
        this.A0G = reactionsTrayViewModel;
        setId(R.id.reactions_tray_layout);
        setClipChildren(false);
        C86624Kv.A0t(this, -2);
        setOrientation(0);
        int A022 = AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        float dimension = C18290x4.A0G(this).getDimension(R.dimen.f6nameremoved);
        int A012 = AnonymousClass4L0.A01(C18290x4.A0G(this), R.dimen.f6nameremoved);
        int A023 = C86624Kv.A02(this, R.color.f5nameremoved);
        int A024 = C86624Kv.A02(this, A022);
        float[] fArr = new float[8];
        fArr[0] = dimension;
        fArr[1] = dimension;
        fArr[2] = dimension;
        fArr[3] = dimension;
        C86624Kv.A1U(fArr, dimension);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(new Rect(A012, A012, A012, A012));
        shapeDrawable.getPaint().setColor(A024);
        shapeDrawable.getPaint().setShadowLayer((float) A012, 0.0f, (float) (A012 / 4), A023);
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, shapeDrawable.getPaint());
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, A012, A012, A012, A012);
        setBackground(layerDrawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved) + C86614Ku.A05(this, R.dimen.f6nameremoved);
        this.A00 = dimensionPixelSize;
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        ReactionsTrayViewModel reactionsTrayViewModel2 = this.A0G;
        String str = ((AnonymousClass5Q4) reactionsTrayViewModel2.A0E.A07()).A00;
        for (int i2 = 0; i2 < reactionsTrayViewModel2.A02.size(); i2++) {
            String A0n = AnonymousClass001.A0n(reactionsTrayViewModel2.A02, i2);
            boolean A1W = AnonymousClass001.A1W(i2);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) View.inflate(getContext(), R.layout.f8nameremoved, (ViewGroup) null);
            textEmojiLabel.A0K((List) null, A0n);
            if (A0n.equals(str)) {
                textEmojiLabel.setSelected(true);
            }
            C107295b4.A03(textEmojiLabel, textEmojiLabel.isSelected() ? R.string.f11nameremoved : R.string.f11nameremoved);
            addView(textEmojiLabel);
            if (A1W) {
                ViewGroup.LayoutParams layoutParams = textEmojiLabel.getLayoutParams();
                C107555bV.A03(textEmojiLabel, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0);
                textEmojiLabel.setLayoutParams(layoutParams);
            }
            C18310x6.A18(textEmojiLabel, this, 2);
        }
        if (reactionsTrayViewModel2.A0G != null && AnonymousClass2z0.A0C(reactionsTrayViewModel2.A0G)) {
            C624134x r0 = reactionsTrayViewModel2.A0G;
            C56982ss r4 = reactionsTrayViewModel2.A07;
            AnonymousClass1VX r22 = reactionsTrayViewModel2.A08;
            C162457s7.A0J(r0, 0);
            C18270x1.A10(r4, 1, r22);
            C95814uZ r1 = r0.A1J.A00;
            if (r22.A0X(4633)) {
                AnonymousClass31A A0A2 = r4.A0A(r1, false);
                C372921r r12 = null;
                if ((A0A2 instanceof AnonymousClass1RL) && (r2 = (AnonymousClass1RL) A0A2) != null) {
                    r12 = r2.A09;
                }
                if (r12 != C100825Ck.A00) {
                    return;
                }
            } else {
                return;
            }
        }
        if (reactionsTrayViewModel2.A02.size() == i) {
            View.inflate(getContext(), R.layout.f8nameremoved, this);
            View findViewById = findViewById(R.id.reactions_plus_button);
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            C107555bV.A03(findViewById, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0);
            findViewById.setLayoutParams(layoutParams2);
            C109345eT.A00(findViewById, this, 42);
        }
    }

    public void A02(int i, int i2, boolean z) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float[] A0T = AnonymousClass4L0.A0T();
        // fill-array-data instruction
        A0T[0] = 0;
        A0T[1] = 1065353216;
        ValueAnimator duration = ValueAnimator.ofFloat(A0T).setDuration(120);
        C100295Aj.A03(duration, this, 13);
        AnonymousClass67L.A01(duration, this, 10);
        Interpolator interpolator = C107165ao.A01;
        duration.setInterpolator(interpolator);
        float[] A0T2 = AnonymousClass4L0.A0T();
        // fill-array-data instruction
        A0T2[0] = 1065353216;
        A0T2[1] = 1065353216;
        ValueAnimator duration2 = ValueAnimator.ofFloat(A0T2).setDuration(120);
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        duration2.addUpdateListener(new C107875c2(this, measuredHeight, measuredWidth, i4, i3, z2));
        duration2.setInterpolator(C100865Co.A00);
        C107885c3 r10 = new C107885c3(this, measuredWidth - measuredHeight, measuredHeight, measuredWidth, i4, i3, z2);
        ValueAnimator duration3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.05f}).setDuration(150);
        ValueAnimator duration4 = ValueAnimator.ofFloat(new float[]{1.05f, 1.0f}).setDuration(70);
        duration3.addUpdateListener(r10);
        duration3.setInterpolator(interpolator);
        duration3.addListener(new AnonymousClass67G(0, this, z2));
        duration4.addUpdateListener(r10);
        duration4.setInterpolator(interpolator);
        AnimatorSet A0O = C86664Kz.A0O();
        A0O.playSequentially(new Animator[]{duration3, duration4});
        AnimatorSet animatorSet = this.A0F;
        animatorSet.playTogether(C86664Kz.A1b(duration, duration2, 2, 0));
        animatorSet.playSequentially(C86664Kz.A1b(duration2, A0O, 2, 0));
        animatorSet.start();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0D;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public final Animator A01(ReactionEmojiTextView reactionEmojiTextView) {
        AnimatorSet A0O = C86664Kz.A0O();
        float[] A1b = C86654Ky.A1b(1.0f);
        A1b[1] = 0.0f;
        ObjectAnimator duration = ObjectAnimator.ofFloat(reactionEmojiTextView, "backgroundScale", A1b).setDuration(100);
        duration.addListener(new AnonymousClass67H(reactionEmojiTextView, this, 0.0f, 1));
        duration.setInterpolator(C107165ao.A00);
        A0O.play(duration);
        A0O.addListener(new AnonymousClass67K(this, 3, reactionEmojiTextView));
        return A0O;
    }
}
