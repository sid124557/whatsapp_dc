package X;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.5Uj  reason: invalid class name and case insensitive filesystem */
public class C105305Uj {
    public float A00 = 1.0f;
    public int A01 = -13381889;
    public AnimatorSet A02;
    public Rect A03 = AnonymousClass001.A0N();
    public CoordinatorLayout A04;
    public AnonymousClass5UO A05;
    public C114825nf A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A0C;
    public final ValueAnimator A0D;
    public final Animation A0E;
    public final Animation A0F;
    public final C105385Us A0G;
    public final AnonymousClass7E6 A0H;
    public final TitleBarView A0I;

    public void A07(int i) {
        if (i == 2 && C86604Kt.A05(this.A0G.A05) == 2) {
            A05(this.A00, this.A01);
            return;
        }
        C105385Us r1 = this.A0G;
        if (C86604Kt.A05(r1.A05) == i) {
            i = 0;
        }
        r1.A04(i);
    }

    public AnimatorSet A00(boolean z) {
        float f;
        ImageView imageView;
        long j;
        TimeInterpolator r0;
        AnimatorSet animatorSet = this.A02;
        if (animatorSet != null) {
            animatorSet.end();
        }
        AnimatorSet A0O = C86664Kz.A0O();
        this.A07 = AnonymousClass001.A0s();
        TitleBarView titleBarView = this.A0I;
        float shapeToolOffsetX = titleBarView.getShapeToolOffsetX();
        float textToolOffsetX = titleBarView.getTextToolOffsetX();
        float cropToolOffsetX = titleBarView.getCropToolOffsetX();
        AnonymousClass08M r4 = this.A0G.A05;
        int A052 = C86604Kt.A05(r4);
        ImageView imageView2 = titleBarView.A08;
        if (imageView2 == null) {
            throw C18270x1.A0S("undoButton");
        }
        if (imageView2.getVisibility() == 8 || A052 != 1) {
            ImageView imageView3 = titleBarView.A06;
            if (imageView3 == null) {
                throw C18270x1.A0S("penTool");
            }
            float x = imageView3.getX();
            ImageView imageView4 = titleBarView.A08;
            if (imageView4 == null) {
                throw C18270x1.A0S("undoButton");
            }
            f = x - imageView4.getX();
            imageView = titleBarView.A08;
            if (imageView == null) {
                throw C18270x1.A0S("undoButton");
            }
        } else {
            WaTextView waTextView = titleBarView.A0C;
            if (waTextView == null) {
                throw C18270x1.A0S("textTool");
            }
            float x2 = waTextView.getX();
            WaTextView waTextView2 = titleBarView.A0C;
            if (waTextView2 == null) {
                throw C18270x1.A0S("textTool");
            }
            float translationX = x2 - waTextView2.getTranslationX();
            ImageView imageView5 = titleBarView.A08;
            if (imageView5 == null) {
                throw C18270x1.A0S("undoButton");
            }
            f = translationX - imageView5.getX();
            imageView = titleBarView.A08;
            if (imageView == null) {
                throw C18270x1.A0S("undoButton");
            }
        }
        float mediaSettingsToolOffsetX = titleBarView.getMediaSettingsToolOffsetX();
        C86604Kt.A0w(A01(shapeToolOffsetX, 40, z), this, 23);
        C86604Kt.A0w(A01(textToolOffsetX, 60, z), this, 24);
        C86604Kt.A0w(A01(cropToolOffsetX, 20, z), this, 25);
        C86604Kt.A0w(A01(f - imageView.getTranslationX(), 20, z), this, 26);
        C86604Kt.A0w(A01(mediaSettingsToolOffsetX, 20, z), this, 27);
        float[] fArr = new float[2];
        float f2 = 1.0f;
        fArr[0] = C86634Kw.A00(z ? 1 : 0);
        float f3 = 1.0f;
        if (z) {
            f3 = 0.0f;
        }
        ValueAnimator A0P = C86664Kz.A0P(fArr, f3);
        C100295Aj.A03(A0P, this, 14);
        ValueAnimator valueAnimator = this.A0D;
        valueAnimator.setDuration(400);
        if (z) {
            A0P.setDuration(300);
            A0P.setInterpolator(new AnonymousClass089());
            this.A07.add(valueAnimator);
        } else {
            A0P.setDuration(500);
        }
        this.A07.add(A0P);
        if (!(C86604Kt.A05(r4) == 5 || C86604Kt.A05(r4) == 2)) {
            float[] fArr2 = new float[2];
            fArr2[0] = C86634Kw.A00(z);
            if (z) {
                f2 = 0.0f;
            }
            ValueAnimator A0P2 = C86664Kz.A0P(fArr2, f2);
            C86604Kt.A0w(A0P2, this, 28);
            long j2 = 100;
            if (z) {
                j = 100;
            } else {
                j = 300;
            }
            A0P2.setDuration(j);
            if (z) {
                j2 = 0;
            }
            A0P2.setStartDelay(j2);
            if (z) {
                r0 = new AnonymousClass087();
            } else {
                r0 = new AnonymousClass089();
            }
            A0P2.setInterpolator(r0);
            this.A07.add(A0P2);
        }
        A0O.playTogether(this.A07);
        A0O.addListener(new AnonymousClass67G(1, this, z));
        return A0O;
    }

    public void A02() {
        TitleBarView titleBarView = this.A0I;
        Animation animation = this.A0E;
        View view = titleBarView.A02;
        if (view == null) {
            throw C18270x1.A0S("titleBar");
        }
        view.setVisibility(4);
        View view2 = titleBarView.A02;
        if (view2 == null) {
            throw C18270x1.A0S("titleBar");
        }
        view2.startAnimation(animation);
    }

    public void A03() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.A02;
        if (animatorSet2 != null && animatorSet2.isRunning() && this.A08) {
            this.A02.end();
        }
        if (!this.A09 || (animatorSet = this.A02) == null || animatorSet.isRunning()) {
            this.A0I.A01(this.A0F);
        } else {
            this.A02.start();
            this.A08 = false;
        }
        this.A09 = false;
    }

    public void A05(float f, int i) {
        if (!this.A0B || i == 0) {
            AnonymousClass4Lt r0 = this.A0I.A0L;
            if (r0 == null) {
                throw C18270x1.A0S("shapeToolDrawable");
            }
            r0.A00(f, i);
            return;
        }
        ValueAnimator valueAnimator = this.A0D;
        valueAnimator.addUpdateListener(new C100455Az(this, f, i, 0));
        C86614Ku.A0z(valueAnimator, this, 22);
        AnimatorSet A002 = A00(true);
        this.A02 = A002;
        A002.start();
        this.A08 = true;
    }

    public void A06(float f, int i, boolean z, boolean z2) {
        this.A01 = i;
        this.A00 = f;
        boolean z3 = false;
        this.A0A = false;
        this.A0B = false;
        int A052 = C86604Kt.A05(this.A0G.A05);
        if (A052 == 0) {
            A04(f);
        } else if (A052 == 1) {
            if (i == 0 || !this.A0A) {
                AnonymousClass4Lt r0 = this.A0I.A0K;
                if (r0 == null) {
                    throw C18270x1.A0S("penToolDrawable");
                }
                r0.A00(f, i);
            } else {
                ValueAnimator valueAnimator = this.A0D;
                valueAnimator.addUpdateListener(new C100455Az(this, f, i, 1));
                C86614Ku.A0z(valueAnimator, this, 22);
                valueAnimator.start();
                this.A0A = false;
                this.A0B = true;
            }
            this.A0I.setPenToolDrawableStrokePreview(z);
        } else if (A052 == 2) {
            A05(f, i);
            if (z && z2) {
                z3 = true;
            }
            this.A0I.setShapeToolDrawableStrokePreview(z3);
        }
    }

    public C105305Uj(CoordinatorLayout coordinatorLayout, C105385Us r11, AnonymousClass7E6 r12, TitleBarView titleBarView) {
        KeyEvent.Callback callback;
        ImageView imageView;
        AlphaAnimation A0C2 = AnonymousClass4L0.A0C(1.0f, 0.0f);
        this.A0E = A0C2;
        AlphaAnimation A0C3 = AnonymousClass4L0.A0C(0.0f, 1.0f);
        this.A0F = A0C3;
        float[] A0T = AnonymousClass4L0.A0T();
        // fill-array-data instruction
        A0T[0] = 1061997773;
        A0T[1] = 1065353216;
        this.A0D = ValueAnimator.ofFloat(A0T);
        this.A04 = coordinatorLayout;
        this.A0G = r11;
        this.A0I = titleBarView;
        this.A0H = r12;
        A0C2.setDuration(300);
        A0C3.setDuration(300);
        titleBarView.A03 = C86604Kt.A0J(titleBarView, R.id.back);
        titleBarView.A0Q = C86614Ku.A0p(titleBarView, R.id.done);
        titleBarView.A09 = (RelativeLayout) C18280x3.A0E(titleBarView, R.id.tool_bar_extra);
        titleBarView.A01 = C18280x3.A0E(titleBarView, R.id.media_tools);
        titleBarView.A08 = C86604Kt.A0J(titleBarView, R.id.undo);
        titleBarView.A02 = C18280x3.A0E(titleBarView, R.id.title_bar);
        titleBarView.A06 = C86604Kt.A0J(titleBarView, R.id.pen);
        titleBarView.A07 = C86604Kt.A0J(titleBarView, R.id.shape);
        titleBarView.A0C = C86604Kt.A0O(titleBarView, R.id.text);
        titleBarView.A04 = C86604Kt.A0J(titleBarView, R.id.crop);
        titleBarView.A0B = C86604Kt.A0O(titleBarView, R.id.media_quality_tool_tip);
        ViewStub A0n = C86664Kz.A0n(titleBarView, R.id.media_upload_quality_settings_stub);
        if (A0n != null) {
            A0n.setLayoutResource(R.layout.f8nameremoved);
        }
        ImageView imageView2 = null;
        if (A0n != null) {
            callback = A0n.inflate();
        } else {
            callback = null;
        }
        titleBarView.A05 = callback instanceof ImageView ? (ImageView) callback : imageView2;
        titleBarView.A0K = new AnonymousClass4Lt(titleBarView.getContext(), R.drawable.new_pen);
        titleBarView.A0L = new AnonymousClass4Lt(titleBarView.getContext(), R.drawable.new_shape);
        titleBarView.A0M = new AnonymousClass4Lt(titleBarView.getContext(), R.drawable.new_text);
        titleBarView.A0I = new AnonymousClass4Lt(titleBarView.getContext(), R.drawable.new_crop);
        titleBarView.A0N = new AnonymousClass4Lt(titleBarView.getContext(), R.drawable.new_undo);
        titleBarView.A0H = new AnonymousClass4Lt(titleBarView.getContext(), R.drawable.new_close);
        titleBarView.A0J = new AnonymousClass4Lt(titleBarView.getContext(), 0);
        WaTextView waTextView = titleBarView.A0C;
        if (waTextView == null) {
            throw C18270x1.A0S("textTool");
        }
        C86634Kw.A1I(waTextView);
        titleBarView.A00 = AnonymousClass0Y8.A04(titleBarView.getContext(), R.color.f5nameremoved);
        DisplayMetrics displayMetrics = C18290x4.A0G(titleBarView).getDisplayMetrics();
        if (((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) < 360) {
            ImageView imageView3 = titleBarView.A03;
            if (imageView3 == null) {
                throw C18270x1.A0S("backButton");
            }
            imageView3.setPadding(0, 0, 0, 0);
            ImageView imageView4 = titleBarView.A04;
            if (imageView4 == null) {
                throw C18270x1.A0S("cropTool");
            }
            imageView4.setPadding(0, 0, 0, 0);
            ImageView imageView5 = titleBarView.A08;
            if (imageView5 == null) {
                throw C18270x1.A0S("undoButton");
            }
            imageView5.setPadding(0, 0, 0, 0);
            ImageView imageView6 = titleBarView.A05;
            if (imageView6 != null) {
                imageView6.setPadding(0, 0, 0, 0);
            }
        }
        ImageView imageView7 = titleBarView.A06;
        if (imageView7 == null) {
            throw C18270x1.A0S("penTool");
        }
        AnonymousClass4Lt r0 = titleBarView.A0K;
        if (r0 == null) {
            throw C18270x1.A0S("penToolDrawable");
        }
        imageView7.setImageDrawable(r0);
        ImageView imageView8 = titleBarView.A07;
        if (imageView8 == null) {
            throw C18270x1.A0S("shapeTool");
        }
        AnonymousClass4Lt r02 = titleBarView.A0L;
        if (r02 == null) {
            throw C18270x1.A0S("shapeToolDrawable");
        }
        imageView8.setImageDrawable(r02);
        WaTextView waTextView2 = titleBarView.A0C;
        if (waTextView2 == null) {
            throw C18270x1.A0S("textTool");
        }
        AnonymousClass4Lt r03 = titleBarView.A0M;
        if (r03 == null) {
            throw C18270x1.A0S("textToolDrawable");
        }
        waTextView2.setBackground(r03);
        ImageView imageView9 = titleBarView.A03;
        if (imageView9 == null) {
            throw C18270x1.A0S("backButton");
        }
        C620733j whatsAppLocale = titleBarView.getWhatsAppLocale();
        AnonymousClass4Lt r04 = titleBarView.A0H;
        if (r04 == null) {
            throw C18270x1.A0S("closeButtonDrawable");
        }
        C86614Ku.A1B(r04, imageView9, whatsAppLocale);
        ImageView imageView10 = titleBarView.A04;
        if (imageView10 == null) {
            throw C18270x1.A0S("cropTool");
        }
        AnonymousClass4Lt r05 = titleBarView.A0I;
        if (r05 == null) {
            throw C18270x1.A0S("cropToolDrawable");
        }
        imageView10.setImageDrawable(r05);
        ImageView imageView11 = titleBarView.A08;
        if (imageView11 == null) {
            throw C18270x1.A0S("undoButton");
        }
        AnonymousClass4Lt r06 = titleBarView.A0N;
        if (r06 == null) {
            throw C18270x1.A0S("undoButtonDrawable");
        }
        imageView11.setImageDrawable(r06);
        ImageView imageView12 = titleBarView.A05;
        if (imageView12 != null) {
            AnonymousClass4Lt r07 = titleBarView.A0J;
            if (r07 == null) {
                throw C18270x1.A0S("mediaQualityButtonDrawable");
            }
            imageView12.setImageDrawable(r07);
        }
        ImageView imageView13 = titleBarView.A03;
        if (imageView13 == null) {
            throw C18270x1.A0S("backButton");
        }
        C18290x4.A1F(imageView13, this, 39);
        WDSButton wDSButton = titleBarView.A0Q;
        if (wDSButton == null) {
            throw C18270x1.A0S("doneButton");
        }
        C18290x4.A1F(wDSButton, this, 40);
        ImageView imageView14 = titleBarView.A08;
        if (imageView14 == null) {
            throw C18270x1.A0S("undoButton");
        }
        C18290x4.A1F(imageView14, this, 41);
        ImageView imageView15 = titleBarView.A08;
        if (imageView15 == null) {
            throw C18270x1.A0S("undoButton");
        }
        AnonymousClass692.A00(imageView15, this, 11);
        ImageView imageView16 = titleBarView.A06;
        if (imageView16 == null) {
            throw C18270x1.A0S("penTool");
        }
        C18290x4.A1F(imageView16, this, 42);
        ImageView imageView17 = titleBarView.A07;
        if (imageView17 == null) {
            throw C18270x1.A0S("shapeTool");
        }
        C18290x4.A1F(imageView17, this, 43);
        ImageView imageView18 = titleBarView.A04;
        if (imageView18 == null) {
            throw C18270x1.A0S("cropTool");
        }
        C18290x4.A1F(imageView18, this, 44);
        WaTextView waTextView3 = titleBarView.A0C;
        if (waTextView3 == null) {
            throw C18270x1.A0S("textTool");
        }
        C18290x4.A1F(waTextView3, this, 36);
        ImageView imageView19 = titleBarView.A05;
        if (imageView19 != null) {
            C18290x4.A1F(imageView19, this, 37);
        }
        if (titleBarView.getAbProps().A0X(4049) && (imageView = titleBarView.A05) != null) {
            AnonymousClass692.A00(imageView, this, 10);
        }
    }

    public ValueAnimator A01(float f, long j, boolean z) {
        TimeInterpolator A002;
        float[] A0T = AnonymousClass4L0.A0T();
        float f2 = -f;
        if (z) {
            f2 = 0.0f;
        }
        A0T[0] = f2;
        if (!z) {
            f = 0.0f;
        }
        ValueAnimator A0P = C86664Kz.A0P(A0T, f);
        if (z) {
            A0P.setDuration(300);
            A002 = new AnonymousClass089();
        } else {
            A0P.setDuration(500);
            A0P.setStartDelay(j);
            A002 = C05030Rp.A00(0.5f, 1.35f, 0.4f, 1.0f);
        }
        A0P.setInterpolator(A002);
        this.A07.add(A0P);
        return A0P;
    }

    public void A04(float f) {
        A03();
        this.A0G.A04(0);
        TitleBarView titleBarView = this.A0I;
        titleBarView.setShapeToolDrawableStrokePreview(false);
        titleBarView.setPenToolDrawableStrokePreview(false);
        ImageView imageView = titleBarView.A06;
        if (imageView == null) {
            throw C18270x1.A0S("penTool");
        }
        imageView.setSelected(false);
        WaTextView waTextView = titleBarView.A0C;
        if (waTextView == null) {
            throw C18270x1.A0S("textTool");
        }
        waTextView.setSelected(false);
        ImageView imageView2 = titleBarView.A07;
        if (imageView2 == null) {
            throw C18270x1.A0S("shapeTool");
        }
        imageView2.setSelected(false);
        int i = titleBarView.A00;
        AnonymousClass4Lt r0 = titleBarView.A0L;
        if (r0 == null) {
            throw C18270x1.A0S("shapeToolDrawable");
        }
        r0.A00(f, i);
        AnonymousClass4Lt r1 = titleBarView.A0M;
        if (r1 == null) {
            throw C18270x1.A0S("textToolDrawable");
        }
        r1.A00(f, titleBarView.A00);
        AnonymousClass4Lt r12 = titleBarView.A0K;
        if (r12 == null) {
            throw C18270x1.A0S("penToolDrawable");
        }
        r12.A00(f, titleBarView.A00);
        AnonymousClass4Lt r13 = titleBarView.A0I;
        if (r13 == null) {
            throw C18270x1.A0S("cropToolDrawable");
        }
        r13.A00(f, titleBarView.A00);
        AnonymousClass4Lt r14 = titleBarView.A0N;
        if (r14 == null) {
            throw C18270x1.A0S("undoButtonDrawable");
        }
        r14.A00(f, titleBarView.A00);
        AnonymousClass4Lt r15 = titleBarView.A0H;
        if (r15 == null) {
            throw C18270x1.A0S("closeButtonDrawable");
        }
        r15.A00(f, titleBarView.A00);
        AnonymousClass4Lt r16 = titleBarView.A0J;
        if (r16 == null) {
            throw C18270x1.A0S("mediaQualityButtonDrawable");
        }
        r16.A00(f, titleBarView.A00);
        titleBarView.setBackButtonDrawable(false);
        this.A0A = true;
        this.A0B = true;
        ImageView imageView3 = titleBarView.A06;
        if (imageView3 == null) {
            throw C18270x1.A0S("penTool");
        }
        imageView3.setVisibility(0);
        WaTextView waTextView2 = titleBarView.A0C;
        if (waTextView2 == null) {
            throw C18270x1.A0S("textTool");
        }
        waTextView2.setVisibility(0);
        ImageView imageView4 = titleBarView.A07;
        if (imageView4 == null) {
            throw C18270x1.A0S("shapeTool");
        }
        imageView4.setVisibility(0);
        ImageView imageView5 = titleBarView.A06;
        if (imageView5 == null) {
            throw C18270x1.A0S("penTool");
        }
        float f2 = 1.0f;
        imageView5.setAlpha(1.0f);
        WaTextView waTextView3 = titleBarView.A0C;
        if (waTextView3 == null) {
            throw C18270x1.A0S("textTool");
        }
        waTextView3.setAlpha(1.0f);
        ImageView imageView6 = titleBarView.A04;
        if (imageView6 == null) {
            throw C18270x1.A0S("cropTool");
        }
        imageView6.setAlpha(1.0f);
        ImageView imageView7 = titleBarView.A07;
        if (imageView7 == null) {
            throw C18270x1.A0S("shapeTool");
        }
        imageView7.setAlpha(1.0f);
        ImageView imageView8 = titleBarView.A05;
        if (imageView8 != null) {
            if (!titleBarView.A0U) {
                f2 = 0.4f;
            }
            imageView8.setAlpha(f2);
        }
        ImageView imageView9 = titleBarView.A04;
        if (imageView9 == null) {
            throw C18270x1.A0S("cropTool");
        } else if (imageView9.getVisibility() != 8) {
            ImageView imageView10 = titleBarView.A04;
            if (imageView10 == null) {
                throw C18270x1.A0S("cropTool");
            }
            imageView10.setVisibility(0);
        }
    }
}
