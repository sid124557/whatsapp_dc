package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass33C;
import X.AnonymousClass4GJ;
import X.AnonymousClass5Y3;
import X.AnonymousClass5YO;
import X.AnonymousClass5Yj;
import X.C106205Ya;
import X.C107335b8;
import X.C116855qy;
import X.C133556hZ;
import X.C133566ha;
import X.C18280x3;
import X.C18290x4;
import X.C86604Kt;
import X.C86624Kv;
import X.C86664Kz;
import X.C93944pb;
import X.C93974pe;
import X.C93994pg;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class ConversationRowVideo$RowVideoView extends AppCompatImageView implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Paint A06;
    public RectF A07;
    public Shader A08;
    public Drawable A09;
    public AnonymousClass5Y3 A0A;
    public C116855qy A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public final void A00() {
        Drawable A002;
        boolean z = this.A0I;
        Context context = getContext();
        if (z) {
            A002 = C106205Ya.A02(context);
        } else {
            A002 = C106205Ya.A00(context);
        }
        this.A09 = A002;
        if (this.A0H) {
            A002 = C106205Ya.A01(getContext());
            this.A09 = A002;
        }
        if (this.A0J) {
            Context context2 = getContext();
            boolean z2 = this.A0I;
            Context context3 = getContext();
            int i = R.attr.f3nameremoved;
            int i2 = R.color.f5nameremoved;
            if (z2) {
                i = R.attr.f3nameremoved;
                i2 = R.color.f5nameremoved;
            }
            C107335b8.A0B(A002, AnonymousClass5Yj.A03(context3, context2, i, i2));
        }
    }

    public void A02(int i, int i2, boolean z) {
        int i3;
        int i4 = this.A03;
        if (i4 <= 0 || (i3 = this.A02) <= 0 || z) {
            hashCode();
            this.A03 = i;
            i4 = i;
            this.A02 = i2;
            i3 = i2;
        }
        this.A0A.A06(i4, i3);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0B;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public int getRowWidth() {
        return AnonymousClass5Y3.A01(this.A0A);
    }

    public void setFullWidth(boolean z) {
        this.A0C = z;
        A01();
    }

    public void setInAlbum(boolean z) {
        this.A0D = z;
        A01();
    }

    public void setIsGif(boolean z) {
        this.A0G = z;
        A01();
    }

    public void setKeepRatio(boolean z) {
        this.A0K = z;
        A01();
    }

    public void setPortraitPreviewEnabled(boolean z) {
        this.A0L = z;
        A01();
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0E) {
            this.A0E = true;
            generatedComponent();
        }
        C86624Kv.A0m(C86604Kt.A0B(), this);
    }

    public final void A01() {
        AnonymousClass33C r3;
        AnonymousClass5Y3 r2;
        AnonymousClass33C r0;
        int A002 = AnonymousClass5YO.A00(getContext());
        AnonymousClass5Y3 r02 = this.A0A;
        if (r02 == null || (r0 = r02.A00) == null) {
            r3 = null;
        } else {
            r3 = new AnonymousClass33C(r0);
        }
        if (this.A0D && this.A0K) {
            r2 = new C133556hZ(A002);
        } else if (this.A0G) {
            r2 = new C93994pg(getContext());
        } else if (this.A0C) {
            r2 = new C133566ha(getContext(), this.A0L);
        } else if (this.A0K) {
            r2 = new C93944pb(A002);
        } else {
            r2 = new C93974pe(A002, this.A0L);
        }
        this.A0A = r2;
        if (r3 != null) {
            r2.A00 = r3;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        A01();
        super.onConfigurationChanged(configuration);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode()) {
            float dimension = getResources().getDimension(R.dimen.f6nameremoved);
            int width = getWidth();
            Paint paint = this.A06;
            paint.setColor(1711276032);
            paint.setShader(this.A08);
            AnonymousClass001.A10(paint);
            RectF rectF = this.A07;
            rectF.set(0.0f, C86664Kz.A02(this) - ((dimension * 4.0f) / 3.0f), (float) width, C86664Kz.A02(this));
            canvas.drawRect(rectF, paint);
            if (this.A09 != null && !this.A0D) {
                RectF A0b = C86664Kz.A0b((float) getWidth(), (float) getHeight());
                this.A09.setBounds(new Rect(Math.round(A0b.left), Math.round(A0b.top), Math.round(A0b.right), Math.round(A0b.bottom)));
                this.A09.draw(canvas);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int A032;
        int A033;
        if (!isInEditMode()) {
            if (getDrawable() == null || (getDrawable() instanceof ColorDrawable)) {
                i3 = this.A03;
                i4 = this.A02;
            } else {
                i3 = getDrawable().getIntrinsicWidth();
                i4 = getDrawable().getIntrinsicHeight();
            }
            AnonymousClass5Y3 r0 = this.A0A;
            r0.A06(i3, i4);
            Pair A042 = r0.A04(i, i2);
            if (this.A0F) {
                A032 = this.A01;
                A033 = this.A00;
            } else if (this.A0H) {
                A032 = this.A05;
                A033 = this.A04;
            } else {
                A032 = C18280x3.A03(A042);
                A033 = C18290x4.A03(A042);
            }
            setMeasuredDimension(A032, A033);
        } else if (this.A0K) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(600, 600);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!isInEditMode()) {
            float f = (float) i2;
            this.A08 = new LinearGradient(0.0f, f - ((getResources().getDimension(R.dimen.f6nameremoved) * 4.0f) / 3.0f), 0.0f, f, 0, -16777216, Shader.TileMode.CLAMP);
        }
    }

    public void setCarouselCardHeight(int i) {
        this.A00 = i;
    }

    public void setCarouselCardWidth(int i) {
        this.A01 = i;
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A09 = drawable;
    }

    public void setIsCarouselCard(boolean z) {
        this.A0F = z;
    }

    public void setIsLimitedTimeOffer(boolean z) {
        this.A0H = z;
    }

    public void setIsOutgoing(boolean z) {
        this.A0I = z;
    }

    public void setLimitedTimeOfferHeight(int i) {
        this.A04 = i;
    }

    public void setLimitedTimeOfferWidth(int i) {
        this.A05 = i;
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0E) {
            this.A0E = true;
            generatedComponent();
        }
        C86624Kv.A0m(C86604Kt.A0B(), this);
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A0E) {
            this.A0E = true;
            generatedComponent();
        }
    }

    public ConversationRowVideo$RowVideoView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A0E) {
            this.A0E = true;
            generatedComponent();
        }
        C86624Kv.A0m(C86604Kt.A0B(), this);
    }
}
