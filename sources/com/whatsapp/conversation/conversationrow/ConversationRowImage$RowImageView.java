package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0RP;
import X.AnonymousClass33C;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5JY;
import X.AnonymousClass5NR;
import X.AnonymousClass5Y3;
import X.AnonymousClass5YO;
import X.AnonymousClass5Yj;
import X.C106205Ya;
import X.C107335b8;
import X.C111095hX;
import X.C111685iW;
import X.C116855qy;
import X.C116985rC;
import X.C131666dx;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C620733j;
import X.C626936e;
import X.C64333Db;
import X.C86634Kw;
import X.C86664Kz;
import X.C86724Lf;
import X.C88744aj;
import X.C88864av;
import X.C93954pc;
import X.C93984pf;
import X.C94014pi;
import X.C996457l;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class ConversationRowImage$RowImageView extends AppCompatImageView implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Shader A04;
    public Drawable A05;
    public C116985rC A06;
    public AnonymousClass33C A07;
    public C996457l A08;
    public AnonymousClass5Y3 A09;
    public C620733j A0A;
    public AnonymousClass5JY A0B;
    public C116855qy A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Matrix A0N;
    public final RectF A0O;
    public final RectF A0P;
    public final RectF A0Q;

    public void A00() {
        if (!this.A0G) {
            this.A0G = true;
            this.A06 = C88744aj.A00;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A0A = C64333Db.A2t(r1);
            this.A0B = (AnonymousClass5JY) r1.A00.A3o.get();
        }
    }

    public final void A02() {
        Drawable A002;
        if (this.A0B != null) {
            boolean z = this.A0K;
            boolean z2 = this.A0L;
            if (z) {
                Context context = getContext();
                if (z2) {
                    Drawable A003 = AnonymousClass0RP.A00(context, R.drawable.balloon_live_location_outgoing_frame);
                    int A032 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
                    C626936e.A06(A003);
                    A002 = C107335b8.A0B(A003, A032);
                } else {
                    A002 = C106205Ya.A02(context);
                }
            } else {
                Context context2 = getContext();
                if (z2) {
                    A002 = C106205Ya.A01(context2);
                } else {
                    A002 = C106205Ya.A00(context2);
                }
            }
            this.A05 = A002;
            if (this.A0J) {
                Context context3 = getContext();
                boolean z3 = this.A0K;
                Context context4 = getContext();
                int i = R.attr.f3nameremoved;
                int i2 = R.color.f5nameremoved;
                if (z3) {
                    i = R.attr.f3nameremoved;
                    i2 = R.color.f5nameremoved;
                }
                C107335b8.A0B(A002, AnonymousClass5Yj.A03(context4, context3, i, i2));
            }
        }
    }

    public void A04(int i, int i2) {
        AnonymousClass33C r0 = this.A07;
        r0.A08 = i;
        r0.A06 = i2;
        setImageData(r0);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0C;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public int getRowWidth() {
        return AnonymousClass5Y3.A01(this.A09);
    }

    public void setFullWidth(boolean z) {
        this.A0D = z;
        A03();
    }

    public void setImageBitmap(Bitmap bitmap) {
        C86724Lf r0;
        if (bitmap == null) {
            r0 = null;
        } else {
            r0 = new C86724Lf(C18290x4.A0G(this), bitmap, this);
        }
        super.setImageDrawable(r0);
        A01();
    }

    public void setImageData(AnonymousClass33C r3) {
        this.A07 = r3;
        this.A09.A00 = new AnonymousClass33C(r3);
    }

    public void setInAlbum(boolean z) {
        this.A0F = z;
        A03();
    }

    public void setOutgoing(boolean z) {
        if (this.A0K != z) {
            this.A0K = z;
            A02();
        }
    }

    public void setPaddingOnTopOnly(boolean z) {
        if (z != this.A0L) {
            this.A0L = z;
            A02();
        }
    }

    public void setPortraitPreviewEnabled(boolean z) {
        this.A0M = z;
        A03();
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0P = C86634Kw.A0F(this);
        this.A0O = AnonymousClass002.A07();
        this.A0N = AnonymousClass002.A05();
        this.A0Q = AnonymousClass002.A07();
        A02();
        A03();
    }

    public final void A01() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF A032 = this.A09.A03(measuredWidth, measuredHeight);
        RectF A0b = C86664Kz.A0b((float) measuredWidth, (float) measuredHeight);
        if (A032 != null) {
            RectF rectF = this.A0O;
            rectF.set(A032);
            RectF rectF2 = this.A0P;
            rectF2.set(A0b);
            Matrix matrix = this.A0N;
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            setImageMatrix(matrix);
        }
    }

    public final void A03() {
        AnonymousClass33C r3;
        AnonymousClass5NR r1;
        AnonymousClass5Y3 r2;
        AnonymousClass33C r0;
        int A002 = AnonymousClass5YO.A00(getContext());
        AnonymousClass5Y3 r02 = this.A09;
        if (r02 == null || (r0 = r02.A00) == null) {
            r3 = null;
        } else {
            r3 = new AnonymousClass33C(r0);
        }
        if (this.A0F) {
            r2 = new C93954pc(A002, AnonymousClass001.A0Q(C111095hX.A04(this)).getHeight());
        } else if (this.A0D) {
            r2 = new C93984pf(getContext(), this.A0M);
        } else {
            if (this.A0M) {
                r1 = C94014pi.A04;
            } else {
                r1 = C94014pi.A03;
            }
            r2 = new C94014pi(r1, C94014pi.A02, A002);
        }
        this.A09 = r2;
        if (r3 != null) {
            r2.A00 = r3;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        A03();
        super.onConfigurationChanged(configuration);
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!isInEditMode()) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int A0I2 = AnonymousClass001.A0I(this);
            int A0H2 = AnonymousClass001.A0H(this);
            Context context = getContext();
            C626936e.A06(context);
            AnonymousClass5JY r8 = this.A0B;
            if (r8 != null) {
                C996457l r1 = this.A08;
                if (r1 == C996457l.BOTTOM) {
                    int height = getHeight();
                    AnonymousClass5JY r0 = this.A0B;
                    r0.A00.setShader(this.A04);
                    RectF rectF = this.A0Q;
                    float f = (float) height;
                    rectF.set(0.0f, f - (context.getResources().getDimension(R.dimen.f6nameremoved) * 1.0f), AnonymousClass4L0.A00(this), f);
                    canvas.drawRect(rectF, this.A0B.A00);
                } else if (r1 == C996457l.CORNER) {
                    Drawable drawable2 = r8.A02;
                    if (drawable2 == null) {
                        drawable2 = new C131666dx(context.getResources().getDrawable(R.drawable.balloon_media_botshade), r8.A03);
                        r8.A02 = drawable2;
                    }
                    C116985rC r12 = this.A06;
                    if (!r12.A07() || !this.A0E) {
                        if (C620733j.A04(this.A0A)) {
                            drawable2.setBounds(A0I2 - drawable2.getIntrinsicWidth(), AnonymousClass4L0.A02(drawable2, A0H2), A0I2, A0H2);
                        } else {
                            drawable2.setBounds(paddingLeft, AnonymousClass4L0.A02(drawable2, A0H2), drawable2.getIntrinsicWidth() + paddingLeft, A0H2);
                        }
                        drawable2.draw(canvas);
                    } else {
                        r12.A04();
                        throw AnonymousClass001.A0g("getFrameOverlayShadeLabelsDrawable");
                    }
                }
                if (!this.A0F && (drawable = this.A05) != null) {
                    drawable.setBounds(paddingLeft, paddingTop, A0I2, A0H2);
                    this.A05.draw(canvas);
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A01();
    }

    public void onMeasure(int i, int i2) {
        int A032;
        int A033;
        if (isInEditMode()) {
            A032 = 800;
            A033 = 600;
        } else {
            Pair A042 = this.A09.A04(i, i2);
            if (this.A0H) {
                A032 = this.A01;
                A033 = this.A00;
            } else if (this.A0I) {
                A032 = this.A03;
                A033 = this.A02;
            } else {
                A032 = C18280x3.A03(A042);
                A033 = C18290x4.A03(A042);
            }
        }
        setMeasuredDimension(A032, A033);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!isInEditMode() && this.A08 == C996457l.BOTTOM && this.A0B != null) {
            Context context = getContext();
            float f = (float) i2;
            this.A04 = new LinearGradient(0.0f, f - (context.getResources().getDimension(R.dimen.f6nameremoved) * 1.0f), 0.0f, f, 0, context.getResources().getColor(R.color.f5nameremoved), Shader.TileMode.CLAMP);
        }
    }

    public void setCarouselCardHeight(int i) {
        this.A00 = i;
    }

    public void setCarouselCardWidth(int i) {
        this.A01 = i;
    }

    public void setHasLabels(boolean z) {
        this.A0E = z;
    }

    public void setIsCarouselCard(boolean z) {
        this.A0H = z;
    }

    public void setIsLimitedTimeOffer(boolean z) {
        this.A0I = z;
    }

    public void setLimitedTimeOfferHeight(int i) {
        this.A02 = i;
    }

    public void setLimitedTimeOfferWidth(int i) {
        this.A03 = i;
    }

    public void setTemplateImageRatio(boolean z) {
        A03();
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0P = C86634Kw.A0F(this);
        this.A0O = AnonymousClass002.A07();
        this.A0N = AnonymousClass002.A05();
        this.A0Q = AnonymousClass002.A07();
        A02();
        A03();
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public ConversationRowImage$RowImageView(Context context) {
        super(context, (AttributeSet) null);
        this.A0P = C86634Kw.A0F(this);
        this.A0O = AnonymousClass002.A07();
        this.A0N = AnonymousClass002.A05();
        this.A0Q = AnonymousClass002.A07();
        A02();
        A03();
    }
}
