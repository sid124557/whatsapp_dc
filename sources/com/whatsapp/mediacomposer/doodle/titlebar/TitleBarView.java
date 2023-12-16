package com.whatsapp.mediacomposer.doodle.titlebar;

import X.AnonymousClass087;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass2QH;
import X.AnonymousClass33p;
import X.AnonymousClass3A6;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass4Lt;
import X.AnonymousClass5BF;
import X.C116855qy;
import X.C131666dx;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C378924l;
import X.C620633i;
import X.C620733j;
import X.C64333Db;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class TitleBarView extends RelativeLayout implements AnonymousClass4GJ {
    public int A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public RelativeLayout A09;
    public C69263Wi A0A;
    public WaTextView A0B;
    public WaTextView A0C;
    public C620633i A0D;
    public AnonymousClass33p A0E;
    public C620733j A0F;
    public AnonymousClass1VX A0G;
    public AnonymousClass4Lt A0H;
    public AnonymousClass4Lt A0I;
    public AnonymousClass4Lt A0J;
    public AnonymousClass4Lt A0K;
    public AnonymousClass4Lt A0L;
    public AnonymousClass4Lt A0M;
    public AnonymousClass4Lt A0N;
    public AnonymousClass2QH A0O;
    public AnonymousClass4FS A0P;
    public WDSButton A0Q;
    public C116855qy A0R;
    public Runnable A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        if (!this.A0T) {
            this.A0T = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A0F = C64333Db.A2t(A002);
            this.A0G = C64333Db.A4B(A002);
            this.A0P = C64333Db.A8y(A002);
            this.A0A = C64333Db.A04(A002);
            this.A0O = (AnonymousClass2QH) A002.A00.A7H.get();
            this.A0E = C64333Db.A2s(A002);
            this.A0D = C64333Db.A2o(A002);
        }
        this.A0U = true;
    }

    public static final void setTooltipInPosition$lambda$13$lambda$12(TitleBarView titleBarView, View view) {
        C162457s7.A0J(titleBarView, 0);
        titleBarView.A00();
    }

    public static final void setTooltipInPosition$lambda$14(TitleBarView titleBarView) {
        C162457s7.A0J(titleBarView, 0);
        WaTextView waTextView = titleBarView.A0B;
        if (waTextView == null) {
            throw C18270x1.A0S("mediaQualityToolTip");
        }
        waTextView.setVisibility(0);
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A0G = r2;
    }

    public final void setFont(int i) {
        int i2;
        if (i == 2) {
            i2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        } else {
            i2 = 0;
        }
        WaTextView waTextView = this.A0C;
        if (waTextView == null) {
            throw C18270x1.A0S("textTool");
        }
        waTextView.setTypeface(AnonymousClass5BF.A00(C18290x4.A0F(waTextView), i));
        waTextView.setPadding(0, i2, i2, 0);
    }

    public final void setGlobalUI(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A0A = r2;
    }

    public final void setMediaQualityTooltipUtil(AnonymousClass2QH r2) {
        C162457s7.A0J(r2, 0);
        this.A0O = r2;
    }

    public final void setSystemServices(C620633i r2) {
        C162457s7.A0J(r2, 0);
        this.A0D = r2;
    }

    public final void setToolBarExtra(RelativeLayout relativeLayout) {
        C162457s7.A0J(relativeLayout, 0);
        this.A09 = relativeLayout;
    }

    public final void setWaSharedPreferences(AnonymousClass33p r2) {
        C162457s7.A0J(r2, 0);
        this.A0E = r2;
    }

    public final void setWaWorkers(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A0P = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A0F = r2;
    }

    public final void A00() {
        WaTextView waTextView = this.A0B;
        if (waTextView == null) {
            throw C18270x1.A0S("mediaQualityToolTip");
        } else if (waTextView.getVisibility() == 0) {
            AlphaAnimation A0G2 = C86604Kt.A0G();
            A0G2.setInterpolator(new AnonymousClass087());
            A0G2.setDuration(100);
            A0G2.setAnimationListener(new AnonymousClass3A6(this));
            WaTextView waTextView2 = this.A0B;
            if (waTextView2 == null) {
                throw C18270x1.A0S("mediaQualityToolTip");
            }
            waTextView2.startAnimation(A0G2);
        }
    }

    public final void A01(Animation animation) {
        View view = this.A02;
        if (view == null) {
            throw C18270x1.A0S("titleBar");
        } else if (view.getVisibility() != 0) {
            View view2 = this.A02;
            if (view2 == null) {
                throw C18270x1.A0S("titleBar");
            }
            view2.setVisibility(0);
            View view3 = this.A02;
            if (view3 == null) {
                throw C18270x1.A0S("titleBar");
            }
            view3.startAnimation(animation);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0R;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0R = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final int getCropToolId() {
        ImageView imageView = this.A04;
        if (imageView != null) {
            return imageView.getId();
        }
        throw C18270x1.A0S("cropTool");
    }

    public final float getCropToolOffsetX() {
        ImageView imageView = this.A06;
        if (imageView == null) {
            throw C18270x1.A0S("penTool");
        }
        float x = imageView.getX();
        ImageView imageView2 = this.A04;
        if (imageView2 == null) {
            throw C18270x1.A0S("cropTool");
        }
        float x2 = x - imageView2.getX();
        ImageView imageView3 = this.A04;
        if (imageView3 != null) {
            return x2 - imageView3.getTranslationX();
        }
        throw C18270x1.A0S("cropTool");
    }

    public final C69263Wi getGlobalUI() {
        C69263Wi r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final AnonymousClass2QH getMediaQualityTooltipUtil() {
        AnonymousClass2QH r0 = this.A0O;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mediaQualityTooltipUtil");
    }

    public final float getMediaSettingsToolOffsetX() {
        float f;
        ImageView imageView = this.A06;
        if (imageView == null) {
            throw C18270x1.A0S("penTool");
        }
        float x = imageView.getX();
        ImageView imageView2 = this.A05;
        float f2 = 0.0f;
        if (imageView2 != null) {
            f = imageView2.getX();
        } else {
            f = 0.0f;
        }
        float f3 = x - f;
        ImageView imageView3 = this.A05;
        if (imageView3 != null) {
            f2 = imageView3.getTranslationX();
        }
        return f3 - f2;
    }

    public final int getPenToolId() {
        ImageView imageView = this.A06;
        if (imageView != null) {
            return imageView.getId();
        }
        throw C18270x1.A0S("penTool");
    }

    public final int getShapeToolId() {
        ImageView imageView = this.A07;
        if (imageView != null) {
            return imageView.getId();
        }
        throw C18270x1.A0S("shapeTool");
    }

    public final float getShapeToolOffsetX() {
        ImageView imageView = this.A06;
        if (imageView == null) {
            throw C18270x1.A0S("penTool");
        }
        float x = imageView.getX();
        ImageView imageView2 = this.A07;
        if (imageView2 == null) {
            throw C18270x1.A0S("shapeTool");
        }
        float x2 = x - imageView2.getX();
        ImageView imageView3 = this.A07;
        if (imageView3 != null) {
            return x2 - imageView3.getTranslationX();
        }
        throw C18270x1.A0S("shapeTool");
    }

    public final View getStartingViewFromToolbarExtra() {
        ImageView imageView = this.A03;
        if (imageView != null) {
            return imageView;
        }
        throw C18270x1.A0S("backButton");
    }

    public final C620633i getSystemServices() {
        C620633i r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemServices");
    }

    public final int getTextToolId() {
        WaTextView waTextView = this.A0C;
        if (waTextView != null) {
            return waTextView.getId();
        }
        throw C18270x1.A0S("textTool");
    }

    public final float getTextToolOffsetX() {
        ImageView imageView = this.A06;
        if (imageView == null) {
            throw C18270x1.A0S("penTool");
        }
        float x = imageView.getX();
        WaTextView waTextView = this.A0C;
        if (waTextView == null) {
            throw C18270x1.A0S("textTool");
        }
        float x2 = x - waTextView.getX();
        WaTextView waTextView2 = this.A0C;
        if (waTextView2 != null) {
            return x2 - waTextView2.getTranslationX();
        }
        throw C18270x1.A0S("textTool");
    }

    public final RelativeLayout getToolbarExtra() {
        RelativeLayout relativeLayout = this.A09;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        throw C18270x1.A0S("toolBarExtraView");
    }

    public final AnonymousClass33p getWaSharedPreferences() {
        AnonymousClass33p r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waSharedPreferences");
    }

    public final AnonymousClass4FS getWaWorkers() {
        AnonymousClass4FS r0 = this.A0P;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final void setCloseButtonAlpha(float f) {
        ImageView imageView = this.A03;
        if (imageView == null) {
            throw C18270x1.A0S("backButton");
        }
        imageView.setAlpha(f);
    }

    public final void setCropToolVisibility(int i) {
        ImageView imageView = this.A04;
        if (imageView == null) {
            throw C18270x1.A0S("cropTool");
        }
        imageView.setVisibility(i);
    }

    public final void setCropToolX(float f) {
        ImageView imageView = this.A04;
        if (imageView == null) {
            throw C18270x1.A0S("cropTool");
        }
        imageView.setTranslationX(f);
    }

    public final void setMediaQualityVisibility(int i) {
        ImageView imageView = this.A05;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public final void setMediaSettingsToolX(float f) {
        ImageView imageView = this.A05;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
    }

    public final void setMediaToolsVisibility(int i) {
        View view = this.A01;
        if (view == null) {
            throw C18270x1.A0S("mediaTools");
        }
        view.setVisibility(i);
    }

    public final void setPenToolDrawableStrokePreview(boolean z) {
        AnonymousClass4Lt r0 = this.A0K;
        if (r0 == null) {
            throw C18270x1.A0S("penToolDrawable");
        }
        r0.A05 = z;
    }

    public final void setShapeToolDrawableStrokePreview(boolean z) {
        AnonymousClass4Lt r0 = this.A0L;
        if (r0 == null) {
            throw C18270x1.A0S("shapeToolDrawable");
        }
        r0.A05 = z;
    }

    public final void setShapeToolX(float f) {
        ImageView imageView = this.A07;
        if (imageView == null) {
            throw C18270x1.A0S("shapeTool");
        }
        imageView.setTranslationX(f);
    }

    public final void setTextToolX(float f) {
        WaTextView waTextView = this.A0C;
        if (waTextView == null) {
            throw C18270x1.A0S("textTool");
        }
        waTextView.setTranslationX(f);
    }

    public final void setToolbarExtraVisibility(int i) {
        RelativeLayout relativeLayout = this.A09;
        if (relativeLayout == null) {
            throw C18270x1.A0S("toolBarExtraView");
        }
        relativeLayout.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r5 == 4) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setUndoButtonVisibility(int r5) {
        /*
            r4 = this;
            android.widget.ImageView r0 = r4.A08
            java.lang.String r3 = "undoButton"
            if (r0 != 0) goto L_0x000b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x000b:
            int r0 = r0.getVisibility()
            if (r0 == r5) goto L_0x004d
            android.widget.ImageView r0 = r4.A08
            if (r0 != 0) goto L_0x001a
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x001a:
            r0.setVisibility(r5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 4
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r5 == r1) goto L_0x0027
            r0 = 0
            if (r5 != r1) goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            android.view.animation.AlphaAnimation r2 = X.AnonymousClass4L0.A0C(r0, r2)
            if (r5 != r1) goto L_0x0044
            X.087 r0 = new X.087
            r0.<init>()
        L_0x0033:
            r2.setInterpolator(r0)
            r0 = 100
            r2.setDuration(r0)
            android.widget.ImageView r0 = r4.A08
            if (r0 != 0) goto L_0x004a
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0044:
            X.089 r0 = new X.089
            r0.<init>()
            goto L_0x0033
        L_0x004a:
            r0.startAnimation(r2)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setUndoButtonVisibility(int):void");
    }

    public final void setUndoToolX(float f) {
        ImageView imageView = this.A08;
        if (imageView == null) {
            throw C18270x1.A0S("undoButton");
        }
        imageView.setTranslationX(f);
    }

    public final void setBackButtonDrawable(boolean z) {
        int i = R.drawable.new_close;
        if (z) {
            i = R.drawable.new_back;
        }
        C131666dx A0J2 = AnonymousClass0x7.A0J(getContext(), getWhatsAppLocale(), i);
        AnonymousClass4Lt r0 = this.A0H;
        if (r0 == null) {
            throw C18270x1.A0S("closeButtonDrawable");
        }
        r0.A04 = A0J2;
        r0.invalidateSelf();
        AnonymousClass4Lt r1 = this.A0H;
        if (r1 == null) {
            throw C18270x1.A0S("closeButtonDrawable");
        }
        r1.A01(this.A00);
        ImageView imageView = this.A03;
        if (imageView == null) {
            throw C18270x1.A0S("backButton");
        }
        AnonymousClass4Lt r02 = this.A0H;
        if (r02 == null) {
            throw C18270x1.A0S("closeButtonDrawable");
        }
        imageView.setImageDrawable(r02);
        ImageView imageView2 = this.A03;
        if (imageView2 == null) {
            throw C18270x1.A0S("backButton");
        }
        imageView2.requestLayout();
        ImageView imageView3 = this.A03;
        if (imageView3 == null) {
            throw C18270x1.A0S("backButton");
        }
        imageView3.setVisibility(C86614Ku.A01(0));
        WDSButton wDSButton = this.A0Q;
        if (wDSButton == null) {
            throw C18270x1.A0S("doneButton");
        }
        wDSButton.setVisibility(8);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TitleBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ TitleBarView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TitleBarView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
