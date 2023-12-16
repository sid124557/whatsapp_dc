package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass4GJ;
import X.AnonymousClass4XD;
import X.AnonymousClass4Z7;
import X.AnonymousClass77V;
import X.AnonymousClass7Pi;
import X.AnonymousClass8FS;
import X.AnonymousClass8FT;
import X.C105175Tw;
import X.C109905fN;
import X.C111685iW;
import X.C116855qy;
import X.C149377Mf;
import X.C179138if;
import X.C179148ig;
import X.C620733j;
import X.C626936e;
import X.C64333Db;
import X.C86664Kz;
import X.C88864av;
import X.C91194j5;
import X.C91234j9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.voipcalling.VoipActivityV2;

public class PipViewContainer extends FrameLayout implements AnonymousClass4GJ {
    public ValueAnimator A00;
    public Point A01;
    public Pair A02;
    public AnonymousClass4XD A03;
    public AnonymousClass4Z7 A04;
    public C179148ig A05;
    public AnonymousClass7Pi A06;
    public C620733j A07;
    public C116855qy A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final int A0C;
    public final boolean A0D;

    public static /* synthetic */ void A00(PipViewContainer pipViewContainer, boolean z) {
        C179138if r0;
        C179148ig r02 = pipViewContainer.A05;
        if (r02 != null && (r0 = ((AnonymousClass8FT) r02).A00.A06) != null) {
            VoipActivityV2 voipActivityV2 = ((AnonymousClass8FS) r0).A00;
            voipActivityV2.A2I = z;
            if (z && voipActivityV2.A1t != null) {
                voipActivityV2.A7R();
            }
        }
    }

    public final C149377Mf A01(Point point, Point point2, AnonymousClass7Pi r9) {
        int dimensionPixelSize;
        int i = this.A0B;
        int i2 = r9.A04 + i;
        if (r9.A01 == 0) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(r9.A01);
        }
        return new C149377Mf(i, (point.x - point2.x) - i, i2, (((point.y - point2.y) - i) - r9.A02) - dimensionPixelSize);
    }

    public final void A02() {
        int i;
        float f;
        float f2;
        Point point;
        int i2;
        int i3;
        int i4;
        AnonymousClass7Pi r10 = this.A06;
        if (r10 != null) {
            Point point2 = this.A01;
            if (point2 == null) {
                point = new Point(0, 0);
            } else {
                int i5 = r10.A05;
                if (i5 <= 0 || (i = r10.A03) <= 0) {
                    i5 = point2.x;
                    r10.A05 = i5;
                    i = point2.y;
                    r10.A03 = i;
                }
                int min = Math.min(i5, i);
                int max = Math.max(i5, i);
                int i6 = point2.x;
                int i7 = point2.y;
                int min2 = Math.min(i6, i7);
                int max2 = Math.max(i6, i7);
                int i8 = i6;
                if (i5 < i) {
                    i8 = i7;
                }
                if (i5 >= i) {
                    i6 = i7;
                }
                float f3 = (float) max2;
                float f4 = (float) min2;
                int i9 = (f3 > (2.5f * f4) ? 1 : (f3 == (2.5f * f4) ? 0 : -1));
                float f5 = r10.A00;
                if (i9 > 0) {
                    f = f5 * f3;
                    f2 = (float) max;
                } else {
                    f = f5 * f4;
                    f2 = (float) min;
                }
                float f6 = (float) min;
                float f7 = (float) max;
                float A002 = C86664Kz.A00(((float) i8) * 0.5f, f7, C86664Kz.A00(((float) i6) * 0.5f, f6, f / f2));
                int i10 = (int) (f6 * A002);
                int i11 = (int) (f7 * A002);
                if (i5 >= i) {
                    point = new Point(i11, i10);
                }
            }
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this);
            int i12 = point.x;
            A0T.width = i12;
            int i13 = point.y;
            A0T.height = i13;
            Point point3 = this.A01;
            boolean z = false;
            if (point3 != null) {
                AnonymousClass7Pi r1 = this.A06;
                if (r1.A06) {
                    int i14 = this.A0C;
                    i2 = (point3.x - i12) - i14;
                    i4 = (point3.y - i13) - i14;
                    i3 = 0;
                } else {
                    C149377Mf A012 = A01(point3, point, r1);
                    AnonymousClass7Pi r12 = this.A06;
                    if (r12.A08) {
                        i2 = A012.A00;
                        i3 = A012.A02;
                    } else {
                        i2 = A012.A02;
                        i3 = A012.A00;
                    }
                    if (r12.A07) {
                        i4 = A012.A01;
                    } else {
                        i4 = A012.A03;
                    }
                }
                A0T.setMargins(i2, i4, i3, 0);
            }
            setLayoutParams(A0T);
            if (A0T.height < A0T.width) {
                z = true;
            }
            if (z != this.A0A) {
                this.A0A = z;
                AnonymousClass4Z7 r0 = this.A04;
                if (r0 != null) {
                    A04(r0.A07);
                }
            }
        }
    }

    public final void A03() {
        C179148ig r1;
        Pair pair = this.A02;
        if (pair != null && (r1 = this.A05) != null) {
            boolean A1Z = AnonymousClass001.A1Z(pair.first);
            boolean A1Z2 = AnonymousClass001.A1Z(pair.second);
            CallGridViewModel callGridViewModel = ((AnonymousClass8FT) r1).A00.A09;
            C626936e.A06(callGridViewModel);
            AnonymousClass08M r2 = callGridViewModel.A0N;
            Object A072 = r2.A07();
            C626936e.A06(A072);
            AnonymousClass7Pi r12 = (AnonymousClass7Pi) A072;
            if (!(r12.A08 == A1Z && r12.A07 == A1Z2)) {
                r12.A07 = A1Z2;
                r12.A08 = A1Z;
                r2.A0H(r12);
            }
            this.A02 = null;
        }
    }

    public final void A04(C105175Tw r4) {
        int i;
        AnonymousClass4Z7 r1 = this.A04;
        if (r1 != null && r1.A06()) {
            r1.A08();
        }
        this.A04 = null;
        removeAllViews();
        AnonymousClass4XD r2 = this.A03;
        boolean z = this.A0A;
        if (!r4.A0K || r4.A0A) {
            i = 7;
            if (z) {
                i = 8;
            }
        } else {
            i = 1;
        }
        AnonymousClass4Z7 r12 = (AnonymousClass4Z7) r2.A04(this, i);
        this.A04 = r12;
        if (r12 instanceof C91234j9) {
            ((C91234j9) r12).A0H();
        }
        addView(this.A04.A0H, new ViewGroup.LayoutParams(-1, -1));
        this.A04.A0G(r4);
        AnonymousClass4Z7 r13 = this.A04;
        if (r13 instanceof C91194j5) {
            r13.A0A(9);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A08;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public Rect getGlobalVisibleRect() {
        AnonymousClass4Z7 r2 = this.A04;
        Rect A0N = AnonymousClass001.A0N();
        if (r2 != null && r2.A06()) {
            r2.A0H.getGlobalVisibleRect(A0N);
        }
        return A0N;
    }

    public boolean getIsLandscapeVideo() {
        return this.A0A;
    }

    public AnonymousClass4Z7 getPipViewHolder() {
        return this.A04;
    }

    public PipViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A09) {
            this.A09 = true;
            C88864av r1 = (C88864av) ((C111685iW) generatedComponent());
            this.A07 = C64333Db.A2t(r1.A0K);
            this.A03 = (AnonymousClass4XD) r1.A0I.A0I.get();
        }
        this.A0B = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0C = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0D = AnonymousClass000.A1T(AnonymousClass77V.A00 ? 1 : 0);
        setOnTouchListener(new C109905fN(this));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setPipListener(C179148ig r1) {
        this.A05 = r1;
    }

    public PipViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PipViewContainer(Context context) {
        this(context, (AttributeSet) null);
    }
}
