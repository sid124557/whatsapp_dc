package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4oK  reason: invalid class name and case insensitive filesystem */
public abstract class C93324oK extends C87094Nz implements C182158nx {
    public float A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Paint A08;
    public Drawable A09;
    public Drawable A0A;
    public Pair A0B;
    public View A0C;
    public View A0D;
    public LinearLayout A0E;
    public C55682qk A0F;
    public AnonymousClass64J A0G;
    public AnonymousClass5KB A0H;
    public C104525Rh A0I;
    public AnonymousClass4QQ A0J;
    public AnonymousClass5R7 A0K;
    public C620633i A0L;
    public C620733j A0M;
    public C56982ss A0N;
    public AnonymousClass1VX A0O;
    public AnonymousClass3UK A0P;
    public C28071fd A0Q;
    public C48192eV A0R;
    public C624134x A0S;
    public C105025Tg A0T;
    public C54182oJ A0U;
    public boolean A0V = true;
    public boolean A0W;
    public boolean A0X;
    public final int A0Y;
    public final int A0Z;
    public final Rect A0a;
    public final Rect A0b = AnonymousClass001.A0N();
    public final Rect A0c;
    public final Rect A0d;
    public final Rect A0e;
    public final Drawable A0f;
    public final Drawable A0g;
    public final Drawable A0h;
    public final Drawable A0i;
    public final Drawable A0j;
    public final Drawable A0k;
    public final View A0l;
    public final AnonymousClass677 A0m;
    public final AnonymousClass679 A0n;
    public final C183538qC A0o;
    public final C183538qC A0p;

    public final Rect A0z(int i) {
        if (i == 1) {
            Rect rect = this.A0c;
            Rect rect2 = new Rect(rect);
            int i2 = rect.left / 4;
            rect2.right = i2;
            rect2.left = i2;
            return rect2;
        } else if (i == 2) {
            return this.A0d;
        } else {
            if (i == 3) {
                return this.A0e;
            }
            throw new AssertionError(AnonymousClass000.A0Y("Unreachable code: direction=", AnonymousClass001.A0o(), i));
        }
    }

    public boolean A13() {
        C93314oJ r5 = (C93314oJ) this;
        AnonymousClass67A A0b2 = C86634Kw.A0b(r5);
        if (A0b2 == null) {
            return false;
        }
        boolean A012 = r5.A0P.A01(r5.getFMessage());
        if (r5.A0l == null || !r5.A1v() || r5.getMessageCount() != 1 || !r5.A1t.A02(r5.getFMessage())) {
            return false;
        }
        if (!A0b2.BId() || A012) {
            return true;
        }
        return false;
    }

    public abstract int getCenteredLayoutId();

    public abstract int getIncomingLayoutId();

    public abstract int getOutgoingLayoutId();

    public abstract int getUserNameInGroupLayoutOption();

    private int getBubbleSwipeOffset() {
        return (int) this.A0l.getTranslationX();
    }

    private AnonymousClass5KB getOrCreateBubbleDrawState() {
        AnonymousClass5KB r2 = this.A0H;
        if (r2 != null) {
            return r2;
        }
        int i = this.A0Y;
        Drawable A10 = A10(i, this.A01, false);
        Rect A0z = A0z(i);
        Drawable A102 = A10(i, this.A01, true);
        Rect A0z2 = A0z(i);
        View bubbleAnchorView = getBubbleAnchorView();
        Rect A0N2 = AnonymousClass001.A0N();
        A0N2.left = 0;
        A0N2.top = 0;
        A0N2.right = bubbleAnchorView.getWidth();
        A0N2.bottom = bubbleAnchorView.getHeight();
        while (bubbleAnchorView != this && bubbleAnchorView != null) {
            A0N2.offset(bubbleAnchorView.getLeft(), bubbleAnchorView.getTop());
            bubbleAnchorView = (View) bubbleAnchorView.getParent();
        }
        AnonymousClass5KB r22 = new AnonymousClass5KB(A0z, A0z2, A0N2, A10, A102, i);
        this.A0H = r22;
        return r22;
    }

    public int A0x() {
        AnonymousClass4QQ r1 = this.A0J;
        if (r1 == null) {
            return 0;
        }
        if (r1.A02.getVisibility() != 0 && r1.A01.getVisibility() != 0) {
            return 0;
        }
        AnonymousClass4QQ r3 = this.A0J;
        int measuredHeight = this.A0l.getMeasuredHeight();
        r3.setOrientation(1);
        C86604Kt.A19(r3);
        if (r3.getMeasuredHeight() > measuredHeight) {
            r3.setOrientation(0);
            C86604Kt.A19(r3);
        }
        AnonymousClass4QQ r0 = this.A0J;
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(r0);
        return r0.getMeasuredWidth() + A0T2.leftMargin + A0T2.rightMargin;
    }

    public int A0y(int i, int i2, int i3) {
        LinearLayout linearLayout = this.A0E;
        if (linearLayout == null || linearLayout.getVisibility() == 8) {
            return 0;
        }
        C107235av.A05(this.A0E, i, AnonymousClass000.A02(this), 0, i2, i3);
        return this.A0E.getMeasuredHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r8 != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (r6 == 3) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r8 != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A10(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            X.679 r0 = r5.A0n
            boolean r4 = r0.Bo8()
            r3 = 1
            if (r6 == r3) goto L_0x0079
            r2 = -1
            r1 = 3
            r0 = 2
            if (r6 == r0) goto L_0x0032
            if (r6 != r1) goto L_0x0059
        L_0x0010:
            if (r7 == r2) goto L_0x0026
            if (r7 == r3) goto L_0x0026
            if (r7 == r0) goto L_0x0018
            if (r7 != r1) goto L_0x0059
        L_0x0018:
            if (r8 == 0) goto L_0x0056
        L_0x001a:
            android.content.Context r1 = r5.getContext()
            r0 = 2131231059(0x7f080153, float:1.8078188E38)
        L_0x0021:
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r1, r0)
            return r0
        L_0x0026:
            if (r8 == 0) goto L_0x0051
            if (r4 != 0) goto L_0x001a
            android.content.Context r1 = r5.getContext()
            r0 = 2131231058(0x7f080152, float:1.8078186E38)
            goto L_0x0021
        L_0x0032:
            if (r7 == r2) goto L_0x003b
            if (r7 == r3) goto L_0x003b
            if (r7 == r0) goto L_0x0047
            if (r7 == r1) goto L_0x0047
            goto L_0x0010
        L_0x003b:
            if (r8 == 0) goto L_0x0071
            if (r4 != 0) goto L_0x0049
            android.content.Context r1 = r5.getContext()
            r0 = 2131231044(0x7f080144, float:1.8078158E38)
            goto L_0x0021
        L_0x0047:
            if (r8 == 0) goto L_0x0076
        L_0x0049:
            android.content.Context r1 = r5.getContext()
            r0 = 2131231045(0x7f080145, float:1.807816E38)
            goto L_0x0021
        L_0x0051:
            if (r4 != 0) goto L_0x0056
            android.graphics.drawable.Drawable r0 = r5.A0k
            return r0
        L_0x0056:
            android.graphics.drawable.Drawable r0 = r5.A0j
            return r0
        L_0x0059:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unreachable code: direction="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; collapse="
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r7)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0071:
            if (r4 != 0) goto L_0x0076
            android.graphics.drawable.Drawable r0 = r5.A0i
            return r0
        L_0x0076:
            android.graphics.drawable.Drawable r0 = r5.A0h
            return r0
        L_0x0079:
            if (r8 == 0) goto L_0x007e
            android.graphics.drawable.Drawable r0 = r5.A0g
            return r0
        L_0x007e:
            android.graphics.drawable.Drawable r0 = r5.A0f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93324oK.A10(int, int, boolean):android.graphics.drawable.Drawable");
    }

    public void A12(AnonymousClass2z0 r4) {
        AnonymousClass4O7 r2 = new AnonymousClass4O7(this);
        C86624Kv.A18(r2, 2400);
        startAnimation(r2);
    }

    public boolean A14() {
        if ((this instanceof C92984ng) || (this instanceof AnonymousClass4nP) || (this instanceof C92654n2)) {
            return true;
        }
        return this.A0n.BIS();
    }

    public boolean A16() {
        C93314oJ r2;
        if (this instanceof C92554ms) {
            C93314oJ r3 = (C93314oJ) this;
            C103625Ns r22 = r3.A1i;
            C624134x fMessage = r3.getFMessage();
            C162457s7.A0J(fMessage, 0);
            if (r22.A00(fMessage) == null) {
                if (C627636p.A0v(r3.getFMessage(), r3.A28)) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (this instanceof C93194o7) {
            return C87094Nz.A0i((C93314oJ) this);
        } else {
            if (this instanceof C93184o6) {
                return C87094Nz.A0i((C93314oJ) this);
            }
            if (this instanceof AnonymousClass4o4) {
                C93314oJ r0 = (C93314oJ) this;
                return AnonymousClass000.A1S(r0.A1S.A01(r0.getFMessage()));
            } else if ((this instanceof C92534mq) || (this instanceof C92544mr) || (this instanceof C92604mx)) {
                C93314oJ r02 = (C93314oJ) this;
                return C627636p.A0v(r02.getFMessage(), r02.A28);
            } else if (this instanceof C93304oI) {
                C93304oI r1 = (C93304oI) this;
                if (!(r1 instanceof C93094nt)) {
                    return C87094Nz.A0i(r1);
                }
                return false;
            } else if (this instanceof C93214o9) {
                C93214o9 r03 = (C93214o9) this;
                return C627636p.A0v(r03.getFMessage(), r03.A28);
            } else if (this instanceof C93204o8) {
                return C87094Nz.A0i((C93314oJ) this);
            } else {
                if (this instanceof C92914nZ) {
                    return C87094Nz.A0i((C93314oJ) this);
                }
                if (this instanceof C92904nY) {
                    return C87094Nz.A0i((C93314oJ) this);
                }
                if (this instanceof C92894nX) {
                    return C87094Nz.A0i((C93314oJ) this);
                }
                if (this instanceof C93154nz) {
                    r2 = (C93154nz) this;
                    if (!(r2 instanceof C92754nC)) {
                        return C87094Nz.A0i(r2);
                    }
                } else if (this instanceof C93114nv) {
                    r2 = (C93114nv) this;
                    if (!(r2 instanceof C92724n9)) {
                        return C87094Nz.A0i(r2);
                    }
                } else if (this instanceof AnonymousClass4o3) {
                    AnonymousClass4o3 r23 = (AnonymousClass4o3) this;
                    if (r23 instanceof C92784nG) {
                        return false;
                    }
                    return C627636p.A0v(r23.getFMessage(), r23.A28);
                } else if (!(this instanceof C93074nr)) {
                    return false;
                } else {
                    r2 = (C93074nr) this;
                    if (!(r2 instanceof C93234oB)) {
                        return C87094Nz.A0i(r2);
                    }
                }
                return C627636p.A0v((C30471mV) r2.A0S, r2.A28);
            }
        }
    }

    public int getCapabilities() {
        return 3;
    }

    public C624134x getFMessage() {
        return this.A0S;
    }

    public int getGlowContentBottom() {
        LinearLayout linearLayout = this.A0E;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return this.A02;
        }
        return this.A0E.getBottom();
    }

    public int getMainChildMaxWidth() {
        return 0;
    }

    public View getMainView() {
        return this.A0l;
    }

    public AnonymousClass679 getRowCustomizer() {
        AnonymousClass677 r0 = this.A0m;
        if (r0 != null) {
            return r0.getConversationRowCustomizer();
        }
        return this.A0K.A08;
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Rect rect;
        byte b;
        boolean A042;
        boolean z;
        int i;
        int i2;
        byte b2;
        View view;
        Canvas canvas2 = canvas;
        if (this.A0W) {
            if (this.A0A == null) {
                Drawable A002 = C02680He.A00(C86614Ku.A0C(this), getResources(), R.drawable.album_card_top);
                C626936e.A06(A002);
                this.A0A = A002;
            }
            if (this.A09 == null) {
                Drawable A003 = C02680He.A00(C86614Ku.A0C(this), getResources(), R.drawable.album_card_bottom);
                C626936e.A06(A003);
                this.A09 = A003;
            }
            this.A0A.setBounds(0, AnonymousClass4L0.A02(this.A0A, getPaddingTop()), getWidth(), getPaddingTop());
            this.A0A.draw(canvas2);
            this.A09.setBounds(0, this.A02, getWidth(), this.A02 + this.A09.getIntrinsicHeight());
            this.A09.draw(canvas2);
        } else {
            AnonymousClass5KB orCreateBubbleDrawState = getOrCreateBubbleDrawState();
            if (isPressed()) {
                drawable = orCreateBubbleDrawState.A05;
            } else {
                drawable = orCreateBubbleDrawState.A04;
            }
            if (isPressed()) {
                rect = orCreateBubbleDrawState.A03;
            } else {
                rect = orCreateBubbleDrawState.A02;
            }
            Rect rect2 = orCreateBubbleDrawState.A01;
            if (this.A00 > 0.0f) {
                int A032 = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
                int i3 = (A032 & 16777215) | (((int) (((float) (A032 >> 24)) * this.A00)) << 24);
                Paint paint = this.A08;
                if (paint == null) {
                    paint = C86664Kz.A0a(1);
                    this.A08 = paint;
                }
                paint.setColor(i3);
                int i4 = this.A03;
                Rect rect3 = this.A0e;
                canvas2.drawRect(0.0f, (float) C86664Kz.A09(getResources(), R.dimen.f6nameremoved, i4 - rect3.top), AnonymousClass4L0.A00(this), (float) (getGlowContentBottom() + rect3.bottom + Math.max(1, (int) (C86604Kt.A00(getContext()) / 2.0f))), this.A08);
            }
            if (isSelected() || (((view = this.A0D) == null || view.getVisibility() != 0) && (isPressed() || isFocused()))) {
                AnonymousClass679 r10 = this.A0n;
                if (r10.BoW()) {
                    canvas2.drawRect(0.0f, 0.0f, AnonymousClass4L0.A00(this), C86664Kz.A02(this), r10.B7l());
                }
            }
            C624134x r11 = this.A0S;
            int i5 = r11.A0D;
            if (i5 == -1 || (!(i5 != 6 || (b2 = r11.A1I) == 8 || b2 == 90) || (b = r11.A1I) == 21 || b == 22 || b == 36)) {
                Rect rect4 = this.A0b;
                int i6 = this.A03;
                Rect rect5 = this.A0e;
                rect4.set(0, i6 - rect5.top, getWidth(), this.A02 + rect5.bottom);
            } else {
                int i7 = orCreateBubbleDrawState.A00;
                if (i7 == 1) {
                    z = this.A0n.BoE();
                } else {
                    if (i7 == 3) {
                        A042 = this.A0n.BIr();
                    } else {
                        A042 = C620733j.A04(this.A0M);
                    }
                    z = !A042;
                }
                Rect rect6 = this.A0b;
                int i8 = rect2.left;
                if (z) {
                    i = rect.right;
                } else {
                    i = rect.left;
                }
                int i9 = i8 - i;
                int i10 = rect2.top - rect.top;
                int i11 = rect2.right;
                if (z) {
                    i2 = rect.left;
                } else {
                    i2 = rect.right;
                }
                rect6.set(i9, i10, i11 + i2, rect2.bottom + rect.bottom);
                View view2 = this.A0l;
                rect6.offset((int) view2.getTranslationX(), 0);
                if (this.A0V) {
                    drawable.setAlpha(getBubbleAlpha());
                    drawable.setDither(true);
                    drawable.setBounds(rect6);
                    if (z) {
                        canvas2.save();
                        canvas2.scale(-1.0f, 1.0f, rect6.exactCenterX(), 0.0f);
                        drawable.draw(canvas2);
                        canvas2.restore();
                    } else {
                        drawable.draw(canvas2);
                    }
                }
                if (this.A06 > 0) {
                    float translationX = ((float) ((int) view2.getTranslationX())) / ((float) (getWidth() / 6));
                    int min = Math.min((int) view2.getTranslationX(), getWidth() / 6);
                    int top = view2.getTop();
                    int bottom = view2.getBottom();
                    int A012 = AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved);
                    Drawable drawable2 = (Drawable) this.A0p.get();
                    Drawable drawable3 = (Drawable) this.A0o.get();
                    Rect rect7 = this.A0a;
                    drawable3.getPadding(rect7);
                    int i12 = (top + bottom) / 2;
                    drawable3.setBounds(((min - drawable2.getIntrinsicWidth()) - A012) - rect7.right, (i12 - (drawable2.getIntrinsicHeight() / 2)) - A012, (min + A012) - rect7.right, (drawable2.getIntrinsicHeight() / 2) + i12 + A012);
                    drawable2.setBounds((min - drawable2.getIntrinsicWidth()) - rect7.right, i12 - (drawable2.getIntrinsicHeight() / 2), min - rect7.right, i12 + (drawable2.getIntrinsicHeight() / 2));
                    int min2 = (int) (Math.min(1.0f, 2.0f * translationX) * 255.0f);
                    drawable3.setAlpha(min2);
                    drawable2.setAlpha(min2);
                    drawable3.draw(canvas2);
                    drawable2.draw(canvas2);
                    AnonymousClass4QQ r1 = this.A0J;
                    if (r1 != null) {
                        r1.setTranslationX(view2.getTranslationX());
                        r1.setAlpha(Math.max(0.0f, 1.0f - (translationX * 4.0f)));
                    }
                    if (this.A06 == 2) {
                        invalidate();
                    }
                }
            }
        }
        super.onDraw(canvas2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r4 = r17
            int r6 = r4.getPaddingTop()
            android.view.View r0 = r4.A0C
            r2 = 8
            if (r0 == 0) goto L_0x003a
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x003a
            android.view.View r0 = r4.A0C
            android.view.ViewGroup$MarginLayoutParams r8 = X.AnonymousClass001.A0T(r0)
            int r0 = r8.topMargin
            int r6 = r6 + r0
            android.view.View r0 = r4.A0C
            int r7 = r0.getMeasuredWidth()
            android.view.View r0 = r4.A0C
            int r5 = r0.getMeasuredHeight()
            int r0 = r4.getMeasuredWidth()
            int r0 = r0 - r7
            int r3 = r0 / 2
            android.view.View r1 = r4.A0C
            int r7 = r7 + r3
            int r0 = r6 + r5
            r1.layout(r3, r6, r7, r0)
            int r0 = r8.bottomMargin
            int r5 = r5 + r0
            int r6 = r6 + r5
        L_0x003a:
            android.view.View r3 = r4.A0l
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass001.A0T(r3)
            int r0 = r1.topMargin
            int r6 = r6 + r0
            X.33j r0 = r4.A0M
            boolean r12 = X.C620733j.A04(r0)
            if (r12 == 0) goto L_0x025c
            int r10 = r1.leftMargin
            int r9 = r1.rightMargin
            int r1 = r4.getPaddingLeft()
            int r11 = r4.getPaddingRight()
        L_0x0057:
            boolean r0 = r4.A14()
            r8 = 0
            if (r0 != 0) goto L_0x006d
            X.34x r7 = r4.A0S
            int r5 = r7.A0D
            r0 = 6
            if (r5 != r0) goto L_0x023b
            byte r5 = r7.A1I
            if (r5 == r2) goto L_0x023b
            r0 = 90
            if (r5 == r0) goto L_0x023b
        L_0x006d:
            android.util.Pair r0 = r4.A0B
            if (r0 == 0) goto L_0x0075
            int r8 = X.C18290x4.A03(r0)
        L_0x0075:
            int r1 = r4.getMeasuredWidth()
            int r0 = r3.getMeasuredWidth()
            int r1 = r1 - r0
            int r1 = r1 - r8
            int r1 = r1 / 2
        L_0x0081:
            android.util.Pair r0 = r4.A0B
            if (r0 == 0) goto L_0x0238
            java.lang.Object r9 = r0.first
            android.view.View r9 = (android.view.View) r9
            int r8 = X.C18290x4.A03(r0)
            if (r9 == 0) goto L_0x00ac
            int r0 = r9.getVisibility()
            if (r0 == r2) goto L_0x00ac
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r9)
            int r7 = r0.leftMargin
            int r5 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            if (r12 == 0) goto L_0x022f
            int r0 = r1 + r7
        L_0x00a7:
            int r5 = r5 + r0
            int r2 = r2 + r6
            r9.layout(r0, r6, r5, r2)
        L_0x00ac:
            int r1 = r1 + r8
            if (r12 != 0) goto L_0x00ba
            int r2 = r4.getMeasuredWidth()
            int r2 = r2 - r1
            int r0 = r3.getMeasuredWidth()
            int r1 = r2 - r0
        L_0x00ba:
            int r2 = r3.getMeasuredWidth()
            int r2 = r2 + r1
            int r0 = r3.getMeasuredHeight()
            int r0 = r0 + r6
            r3.layout(r1, r6, r2, r0)
            r14 = 3
            int r0 = r4.getCapabilities()
            r0 = r0 & 3
            if (r0 == 0) goto L_0x0176
            X.677 r1 = r4.A0m
            if (r1 == 0) goto L_0x0176
            android.widget.LinearLayout r0 = r4.A0E
            if (r0 == 0) goto L_0x0176
            X.5Rh r2 = r4.A0I
            int r1 = r1.getContainerType()
            X.34x r0 = r4.getFMessage()
            boolean r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L_0x0176
            X.5Rh r10 = r4.A0I
            android.widget.LinearLayout r7 = r4.A0E
            boolean r0 = r4 instanceof X.AnonymousClass4o3
            if (r0 == 0) goto L_0x022c
            boolean r0 = r4.A0W
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x022c
        L_0x00f8:
            X.34x r13 = r4.getFMessage()
            r0 = 1
            X.C162457s7.A0J(r7, r0)
            r12 = 3
            X.C162457s7.A0J(r13, r12)
            int r6 = r7.getMeasuredWidth()
            int r5 = r7.getMeasuredHeight()
            int r16 = r7.getMeasuredWidth()
            int r15 = X.C86654Ky.A05(r7)
            android.view.View r11 = X.C86644Kx.A0G(r4)
            int r9 = r11.getLeft()
            float r0 = r11.getY()
            int r8 = (int) r0
            int r1 = r4.getBubbleType()
            r0 = 2
            if (r1 == r0) goto L_0x0206
            r0 = 2131429294(0x7f0b07ae, float:1.8480257E38)
            android.view.View r2 = X.C18280x3.A0E(r4, r0)
            int r0 = r2.getLeft()
            int r9 = r9 + r0
            float r1 = (float) r8
            float r0 = r2.getY()
            float r1 = r1 + r0
            int r8 = (int) r1
            X.33j r0 = r10.A00
            boolean r0 = X.C620733j.A04(r0)
            if (r0 == 0) goto L_0x0203
            int r9 = X.C86664Kz.A0G(r2, r9)
            int r9 = r9 - r16
            int r9 = r9 - r15
        L_0x014a:
            int r0 = r2.getMeasuredHeight()
        L_0x014e:
            int r8 = r8 + r0
            int r10 = r4.getBubbleType()
            android.content.res.Resources r2 = r7.getResources()
            X.C162457s7.A0D(r2)
            r1 = 2
            r0 = 2131168272(0x7f070c10, float:1.7950841E38)
            if (r10 != r1) goto L_0x0163
            r0 = 2131168277(0x7f070c15, float:1.7950851E38)
        L_0x0163:
            int r0 = r2.getDimensionPixelOffset(r0)
            int r8 = r8 - r0
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r9, r8)
            int r1 = r0.x
            int r0 = r0.y
            int r6 = r6 + r1
            int r5 = r5 + r0
            r7.layout(r1, r0, r6, r5)
        L_0x0176:
            X.4QQ r0 = r4.A0J
            if (r0 == 0) goto L_0x01bc
            android.view.ViewGroup$MarginLayoutParams r9 = X.AnonymousClass001.A0T(r0)
            boolean r0 = X.C87094Nz.A0g(r4)
            if (r0 == 0) goto L_0x01fc
            X.679 r0 = r4.A0n
            boolean r2 = r0.BIr()
        L_0x018a:
            X.4QQ r0 = r4.A0J
            int r0 = r0.getMeasuredHeight()
            int r8 = r0 / 2
            int r1 = r3.getTop()
            int r0 = r3.getBottom()
            int r1 = r1 + r0
            int r7 = r1 / 2
            X.4QQ r6 = r4.A0J
            if (r2 == 0) goto L_0x01e5
            int r5 = r3.getLeft()
            X.4QQ r0 = r4.A0J
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            int r0 = r9.leftMargin
            int r5 = r5 - r0
            int r2 = r7 - r8
            int r1 = r3.getLeft()
            int r0 = r9.leftMargin
            int r1 = r1 - r0
        L_0x01b8:
            int r7 = r7 + r8
            r6.layout(r5, r2, r1, r7)
        L_0x01bc:
            int r0 = r4.getBubbleType()
            if (r0 == 0) goto L_0x01e0
            r0 = 2131428211(0x7f0b0373, float:1.847806E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x01e0
            int r1 = r3.getTop()
            int r0 = r0.getPaddingTop()
            int r1 = r1 + r0
        L_0x01d4:
            r4.A03 = r1
            int r0 = r4.A0w()
            r4.A02 = r0
            r0 = 0
            r4.A0H = r0
            return
        L_0x01e0:
            int r1 = r3.getTop()
            goto L_0x01d4
        L_0x01e5:
            int r5 = r3.getRight()
            int r0 = r9.leftMargin
            int r5 = r5 + r0
            int r2 = r7 - r8
            int r1 = r3.getRight()
            X.4QQ r0 = r4.A0J
            int r1 = X.C86664Kz.A0G(r0, r1)
            int r0 = r9.leftMargin
            int r1 = r1 + r0
            goto L_0x01b8
        L_0x01fc:
            X.33j r0 = r4.A0M
            boolean r2 = X.C102805Ki.A00(r0)
            goto L_0x018a
        L_0x0203:
            int r9 = r9 + r15
            goto L_0x014a
        L_0x0206:
            int r2 = r11.getMeasuredWidth()
            if (r14 != r12) goto L_0x021b
            X.33j r0 = r10.A00
            boolean r0 = X.C620733j.A04(r0)
            if (r0 == 0) goto L_0x0227
        L_0x0214:
            int r9 = r9 + r15
        L_0x0215:
            int r0 = r11.getMeasuredHeight()
            goto L_0x014e
        L_0x021b:
            X.2z0 r0 = r13.A1J
            boolean r1 = r0.A02
            X.33j r0 = r10.A00
            boolean r0 = X.C620733j.A04(r0)
            if (r1 != r0) goto L_0x0214
        L_0x0227:
            int r9 = r9 + r2
            int r9 = r9 - r16
            int r9 = r9 - r15
            goto L_0x0215
        L_0x022c:
            r14 = 5
            goto L_0x00f8
        L_0x022f:
            int r0 = r4.getMeasuredWidth()
            int r0 = r0 - r1
            int r0 = r0 - r7
            int r0 = r0 - r5
            goto L_0x00a7
        L_0x0238:
            r8 = 0
            goto L_0x00ac
        L_0x023b:
            X.2z0 r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0259
            X.679 r0 = r4.A0n
            boolean r0 = r0.BHd()
            if (r0 == 0) goto L_0x0256
            int r1 = r4.getMeasuredWidth()
            int r1 = r1 - r11
            int r1 = r1 - r9
            int r0 = r3.getMeasuredWidth()
            int r1 = r1 - r0
            goto L_0x0081
        L_0x0256:
            int r1 = r1 + r9
            goto L_0x0081
        L_0x0259:
            int r1 = r1 + r10
            goto L_0x0081
        L_0x025c:
            int r10 = r1.rightMargin
            int r9 = r1.leftMargin
            int r1 = r4.getPaddingRight()
            int r11 = r4.getPaddingLeft()
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93324oK.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = i;
        int size = View.MeasureSpec.getSize(i4);
        int A022 = AnonymousClass000.A02(this);
        int mainChildMaxWidth = getMainChildMaxWidth();
        int A032 = AnonymousClass000.A03(this);
        View view = this.A0C;
        int i5 = i2;
        if (!(view == null || view.getVisibility() == 8)) {
            int i6 = 0;
            if (this.A0n.BHd()) {
                i6 = A022;
            }
            C107235av.A05(this.A0C, i4, i6, 0, i5, A032);
            View view2 = this.A0C;
            ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(view2);
            A032 += view2.getMeasuredHeight() + A0T2.topMargin + A0T2.bottomMargin;
        }
        int A0y = A0y(i4, i5, A032);
        if (A0y != 0) {
            A032 += A0y - getReactionsViewVerticalOverlap();
        }
        Pair pair = this.A0B;
        boolean z = false;
        if (pair != null) {
            View view3 = (View) pair.first;
            i3 = C18290x4.A03(pair);
            if (!(view3 == null || view3.getVisibility() == 8)) {
                C107235av.A05(view3, i4, A022, 0, i5, A032);
                ViewGroup.MarginLayoutParams A0T3 = AnonymousClass001.A0T(view3);
                if (i3 == view3.getMeasuredWidth() + A0T3.leftMargin + A0T3.rightMargin) {
                    z = true;
                }
                C626936e.A0D(z, "Profile picture optimistic width should be same as measured");
            }
        } else {
            i3 = 0;
        }
        int i7 = A022 + i3;
        View view4 = this.A0l;
        ViewGroup.MarginLayoutParams A0T4 = AnonymousClass001.A0T(view4);
        AnonymousClass679 r1 = this.A0n;
        int B4r = r1.B4r(getFMessage());
        int B4q = r1.B4q();
        int i8 = this.A0Y;
        if (i8 == 2 || i8 != 3) {
            C107555bV.A03(view4, B4q, B4r);
        } else {
            C107555bV.A03(view4, B4r, B4q);
        }
        int i9 = i4;
        int i10 = i5;
        int i11 = A032;
        C107235av.A05(view4, i9, i7, mainChildMaxWidth, i10, i11);
        int i12 = A0T4.leftMargin + A0T4.rightMargin;
        int A0x = A0x();
        if (A0x > i12) {
            i7 += A0x - i12;
            C107235av.A05(view4, i9, i7, mainChildMaxWidth, i10, i11);
        }
        ViewGroup.MarginLayoutParams A0T5 = AnonymousClass001.A0T(view4);
        int measuredHeight = A032 + view4.getMeasuredHeight() + A0T5.topMargin + A0T5.bottomMargin;
        ViewGroup.MarginLayoutParams A0T6 = AnonymousClass001.A0T(view4);
        int measuredWidth = i7 + view4.getMeasuredWidth() + A0T6.leftMargin + A0T6.rightMargin;
        if (Integer.MIN_VALUE == View.MeasureSpec.getMode(i4)) {
            setMeasuredDimension(measuredWidth, measuredHeight);
        } else {
            setMeasuredDimension(size, measuredHeight);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x027f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C93324oK(android.content.Context r14, X.AnonymousClass677 r15, X.C624134x r16) {
        /*
            r13 = this;
            r13.<init>(r14)
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r13.A0b = r0
            r0 = -1
            r13.A01 = r0
            r3 = 1
            r13.A0V = r3
            android.graphics.Rect r8 = X.AnonymousClass001.A0N()
            r13.A0e = r8
            android.graphics.Rect r7 = X.AnonymousClass001.A0N()
            r13.A0d = r7
            android.graphics.Rect r6 = X.AnonymousClass001.A0N()
            r13.A0c = r6
            r2 = 0
            r13.A04 = r2
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r13.A0a = r0
            r13.A0m = r15
            r4 = r16
            r13.A0S = r4
            X.679 r0 = r13.getRowCustomizer()
            r13.A0n = r0
            r0 = 2131231052(0x7f08014c, float:1.8078174E38)
            android.graphics.drawable.Drawable r9 = X.C18310x6.A0G(r14, r0)
            r13.A0k = r9
            r0 = 2131231053(0x7f08014d, float:1.8078176E38)
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r14, r0)
            r13.A0j = r0
            r0 = 2131231041(0x7f080141, float:1.8078152E38)
            android.graphics.drawable.Drawable r5 = X.C18310x6.A0G(r14, r0)
            r13.A0i = r5
            r0 = 2131231042(0x7f080142, float:1.8078154E38)
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r14, r0)
            r13.A0h = r0
            r0 = 2131231038(0x7f08013e, float:1.8078146E38)
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r14, r0)
            r13.A0f = r0
            android.content.Context r1 = r13.getContext()
            r0 = 2131231039(0x7f08013f, float:1.8078148E38)
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r1, r0)
            r13.A0g = r0
            r9.getPadding(r8)
            r5.getPadding(r7)
            r5.getPadding(r6)
            boolean r0 = r13.A14()
            r5 = 2
            if (r0 == 0) goto L_0x02a1
            r1 = 1
        L_0x0081:
            r13.A0Y = r1
            if (r1 == r3) goto L_0x029b
            if (r1 == r5) goto L_0x0295
            int r5 = r13.getOutgoingLayoutId()
        L_0x008b:
            android.content.Context r9 = r13.getContext()
            X.1VX r1 = r13.A0O
            X.C162457s7.A0J(r9, r2)
            X.C162457s7.A0J(r1, r3)
            r0 = 2131625869(0x7f0e078d, float:1.8878958E38)
            if (r5 != r0) goto L_0x00e1
            r0 = 3783(0xec7, float:5.301E-42)
            int r1 = r1.A0N(r0)
            if (r1 == r3) goto L_0x00a7
            r0 = 2
            if (r1 != r0) goto L_0x0275
        L_0x00a7:
            com.whatsapp.WaFrameLayout r6 = X.AnonymousClass5VA.A00(r9)
        L_0x00ab:
            r13.addView(r6)
        L_0x00ae:
            android.view.View r0 = r13.getChildAt(r2)
            r13.A0l = r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r14)
            int r0 = r0.getScaledTouchSlop()
            double r2 = (double) r0
            r0 = 4610785298501913805(0x3ffccccccccccccd, double:1.8)
            double r2 = r2 * r0
            int r0 = (int) r2
            r13.A0Z = r0
            r0 = 3
            X.5bc r1 = new X.5bc
            r1.<init>(r13, r0)
            X.8P2 r0 = new X.8P2
            r0.<init>(r1)
            r13.A0p = r0
            r0 = 4
            X.5bc r1 = new X.5bc
            r1.<init>(r13, r0)
            X.8P2 r0 = new X.8P2
            r0.<init>(r1)
            r13.A0o = r0
            return
        L_0x00e1:
            r0 = 2131624657(0x7f0e02d1, float:1.88765E38)
            if (r5 != r0) goto L_0x0275
            r0 = 3783(0xec7, float:5.301E-42)
            int r1 = r1.A0N(r0)
            if (r1 == r3) goto L_0x00f1
            r0 = 3
            if (r1 != r0) goto L_0x0275
        L_0x00f1:
            android.content.res.Resources r12 = r9.getResources()
            android.util.DisplayMetrics r11 = r12.getDisplayMetrics()
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r9)
            r0 = 2131431154(0x7f0b0ef2, float:1.848403E38)
            r6.setId(r0)
            r8 = -2
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r8, r8)
            r6.setLayoutParams(r0)
            r0 = 19
            r6.setGravity(r0)
            r0 = 30
            float r0 = (float) r0
            int r0 = X.C1222663s.A02(r11, r0, r3)
            r6.setMinimumHeight(r0)
            r6.setOrientation(r3)
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r9)
            r0 = 2131429141(0x7f0b0715, float:1.8479946E38)
            r1.setId(r0)
            r4 = -1
            X.C86614Ku.A1E(r1, r4, r8)
            r6.addView(r1)
            r1 = 2132083459(0x7f150303, float:1.980706E38)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r9, r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            r0 = 2131432816(0x7f0b1570, float:1.84874E38)
            r1.setId(r0)
            X.C86614Ku.A1E(r1, r4, r8)
            r0 = 8
            r1.setVisibility(r0)
            r6.addView(r1)
            android.widget.FrameLayout r7 = new android.widget.FrameLayout
            r7.<init>(r9)
            r0 = 2131434114(0x7f0b1a82, float:1.8490033E38)
            r7.setId(r0)
            X.C86614Ku.A1E(r7, r4, r8)
            r0 = 4
            float r0 = (float) r0
            int r5 = X.C1222663s.A02(r11, r0, r3)
            int r1 = X.C1222663s.A02(r11, r0, r3)
            int r0 = X.C1222663s.A02(r11, r0, r3)
            r7.setPadding(r5, r1, r0, r2)
            r0 = 8
            r7.setVisibility(r0)
            r6.addView(r7)
            r1 = 2132084240(0x7f150610, float:1.9808645E38)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r9, r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            r0 = 2131434886(0x7f0b1d86, float:1.8491599E38)
            r1.setId(r0)
            r6.addView(r1)
            com.whatsapp.components.TextAndDateLayout r5 = new com.whatsapp.components.TextAndDateLayout
            r5.<init>(r9)
            r0 = 2131429155(0x7f0b0723, float:1.8479975E38)
            r5.setId(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r4, r8)
            r4 = 3
            r0.gravity = r4
            r5.setLayoutParams(r0)
            r0 = 2131168281(0x7f070c19, float:1.795086E38)
            int r7 = r12.getDimensionPixelSize(r0)
            int r1 = r12.getDimensionPixelSize(r0)
            int r0 = r12.getDimensionPixelSize(r0)
            r5.setPadding(r7, r2, r1, r0)
            com.whatsapp.TextEmojiLabel r7 = new com.whatsapp.TextEmojiLabel
            r7.<init>(r9)
            r0 = 2131431521(0x7f0b1061, float:1.8484774E38)
            r7.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r8)
            r0.gravity = r4
            r7.setLayoutParams(r0)
            r1 = 2131166046(0x7f07035e, float:1.7946326E38)
            int r10 = r12.getDimensionPixelSize(r1)
            r0 = 2
            float r0 = (float) r0
            int r4 = X.C1222663s.A02(r11, r0, r3)
            int r1 = r12.getDimensionPixelSize(r1)
            r0 = 5
            float r0 = (float) r0
            int r0 = X.C1222663s.A02(r11, r0, r3)
            r7.setPadding(r10, r4, r1, r0)
            r0 = 2132084162(0x7f1505c2, float:1.9808487E38)
            r7.setTextAppearance(r9, r0)
            r5.addView(r7)
            android.util.DisplayMetrics r7 = X.AnonymousClass000.A0B(r9)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r9)
            r0 = 2131429294(0x7f0b07ae, float:1.8480257E38)
            r4.setId(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r8, r8)
            r0 = 85
            r1.gravity = r0
            r4.setLayoutParams(r1)
            r0 = 16
            r4.setGravity(r0)
            r4.setOrientation(r2)
            r0 = 6
            float r0 = (float) r0
            int r1 = X.C1222663s.A02(r7, r0, r3)
            int r0 = X.C1222663s.A02(r7, r0, r3)
            r4.setPadding(r1, r2, r0, r2)
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r9)
            r0 = 2131431770(0x7f0b115a, float:1.8485279E38)
            r1.setId(r0)
            r1.setInflatedId(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r8, r8)
            r1.setLayoutParams(r0)
            r4.addView(r1)
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r9)
            r0 = 2131433337(0x7f0b1779, float:1.8488457E38)
            r1.setId(r0)
            r1.setInflatedId(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r8, r8)
            r1.setLayoutParams(r0)
            r4.addView(r1)
            com.whatsapp.WaTextView r1 = new com.whatsapp.WaTextView
            r1.<init>(r9)
            r0 = 2132084160(0x7f1505c0, float:1.9808483E38)
            r1.setTextAppearance(r9, r0)
            r0 = 2131429275(0x7f0b079b, float:1.8480218E38)
            r1.setId(r0)
            X.C86624Kv.A0t(r1, r8)
            float r0 = (float) r3
            int r0 = X.C1222663s.A02(r7, r0, r3)
            r1.setPadding(r2, r2, r2, r0)
            r4.addView(r1)
            r5.addView(r4)
            r6.addView(r5)
            goto L_0x00ab
        L_0x0275:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r9)
            android.view.View r0 = r0.inflate(r5, r13, r3)
            if (r0 != 0) goto L_0x00ae
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "rootview for conversationRow is null, rightLayout="
            X.2z0 r0 = X.C624134x.A08(r4, r0, r1)
            boolean r0 = r0.A02
            java.lang.String r1 = X.C18300x5.A0m(r1, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0295:
            int r5 = r13.getIncomingLayoutId()
            goto L_0x008b
        L_0x029b:
            int r5 = r13.getCenteredLayoutId()
            goto L_0x008b
        L_0x02a1:
            X.2z0 r0 = r4.A1J
            boolean r0 = r0.A02
            r1 = 2
            if (r0 == 0) goto L_0x0081
            r1 = 3
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93324oK.<init>(android.content.Context, X.677, X.34x):void");
    }

    public static int A0u(AnonymousClass679 r6, C624134x r7) {
        boolean A1W = AnonymousClass000.A1W(r7.A0w());
        AnonymousClass2z0 r1 = r7.A1J;
        boolean A0K2 = C627336j.A0K(r1.A00);
        boolean z = r1.A02;
        boolean A1W2 = AnonymousClass000.A1W(r7.A0c);
        if (r7 instanceof C31951p9) {
            if (A1W || (A0K2 && !z)) {
                return 1;
            }
            return 0;
        } else if (!(r7 instanceof AnonymousClass1nE) || A1W || A1W2) {
            return 2;
        } else {
            if (!A0K2) {
                return 0;
            }
            if ((!z || r6.Bp3()) && !r6.Bo2()) {
                return 1;
            }
            return 0;
        }
    }

    private int getSwipeReplyActivationThreshold() {
        return getWidth() / 6;
    }

    public int A0w() {
        View findViewById;
        if (getBubbleType() != 0) {
            C624134x r1 = this.A0S;
            if (r1.A0w() == null && r1.A0c == null && (findViewById = findViewById(R.id.bubble_header)) != null) {
                return this.A0l.getTop() + findViewById.getBottom();
            }
        }
        return this.A0l.getBottom();
    }

    public void A11() {
        clearAnimation();
        this.A00 = 0.0f;
        invalidate();
    }

    public boolean A15() {
        return AnonymousClass000.A1U(getBubbleType(), 2);
    }

    public final boolean A17(MotionEvent motionEvent) {
        this.A07 = (int) motionEvent.getX();
        boolean z = false;
        this.A0X = false;
        if (this.A06 == 2) {
            z = true;
            this.A06 = 1;
            post(C117085rM.A00(this, 26));
            invalidate();
        }
        View view = this.A0l;
        this.A05 = (int) view.getTranslationX();
        C86624Kv.A0s(view);
        return z;
    }

    public final boolean A18(MotionEvent motionEvent) {
        Object obj;
        int x = (int) motionEvent.getX();
        if (this.A06 != 1 && AnonymousClass001.A0A(x, this.A07) > this.A0Z) {
            this.A06 = 1;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            cancelLongPress();
            setPressed(false);
        }
        if (this.A06 != 1) {
            return false;
        }
        int A0C2 = AnonymousClass001.A0C((this.A05 + x) - this.A07, this.A0Z, 0);
        float A0C3 = (float) AnonymousClass001.A0C(A0C2, getWidth() / 6, 0);
        int min = Math.min(A0C2, getWidth() / 6);
        double d = (double) A0C3;
        int width = min + ((int) (d / (((0.75d * d) / ((double) (getWidth() / 6))) + 1.0d)));
        float f = (float) width;
        this.A0l.setTranslationX(f);
        LinearLayout linearLayout = this.A0E;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f);
        }
        Pair pair = this.A0B;
        if (!(pair == null || (obj = pair.first) == null)) {
            ((View) obj).setTranslationX(f);
        }
        if (width > getWidth() / 6 && !this.A0X) {
            try {
                if (Settings.System.getInt(getContext().getContentResolver(), "haptic_feedback_enabled") != 0) {
                    C106755a7.A03(this.A0L);
                }
            } catch (Settings.SettingNotFoundException e) {
                Log.e("swipetoreply/vibrate", e);
            }
            this.A0X = true;
        }
        invalidate();
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getBubbleAlpha() {
        if (getBubbleType() == 0) {
            return 0;
        }
        return 255;
    }

    public View getBubbleAnchorView() {
        View findViewById;
        if (getBubbleType() != 1 || (findViewById = findViewById(R.id.bubble_header)) == null) {
            return this.A0l;
        }
        return findViewById;
    }

    public int getBubbleType() {
        return A0u(this.A0n, getFMessage());
    }

    public int getReactionsViewVerticalOverlap() {
        int bubbleType = getBubbleType();
        Resources resources = getResources();
        int i = R.dimen.f6nameremoved;
        if (bubbleType == 2) {
            i = R.dimen.f6nameremoved;
        }
        return resources.getDimensionPixelOffset(i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean A17;
        if (A13()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                A17 = A17(motionEvent);
            } else if (actionMasked == 2) {
                A17 = A18(motionEvent);
            }
            if (A17) {
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.A04 = (int) motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r1 != 3) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.A13()
            if (r0 == 0) goto L_0x0015
            int r1 = r8.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L_0x00bf
            if (r1 == r3) goto L_0x002d
            r0 = 2
            if (r1 == r0) goto L_0x0027
            r0 = 3
            if (r1 == r0) goto L_0x002d
        L_0x0015:
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L_0x0022
            float r0 = r8.getY()
            int r0 = (int) r0
            r7.A04 = r0
        L_0x0022:
            boolean r0 = super.onTouchEvent(r8)
            return r0
        L_0x0027:
            boolean r0 = r7.A18(r8)
            goto L_0x00c3
        L_0x002d:
            int r0 = r7.A06
            if (r0 != r3) goto L_0x0015
            r0 = 2
            r7.A06 = r0
            X.677 r4 = r7.A0m
            if (r4 == 0) goto L_0x0056
            android.view.View r0 = r7.A0l
            float r0 = r0.getTranslationX()
            int r1 = (int) r0
            int r0 = r7.getWidth()
            int r0 = r0 / 6
            if (r1 <= r0) goto L_0x0056
            X.34x r2 = r7.getFMessage()
            X.3UK r0 = r7.A0P
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x00ac
            r4.Boi(r2)
        L_0x0056:
            android.view.View r0 = r7.A0l
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r6 = 0
            android.view.ViewPropertyAnimator r4 = r0.translationX(r6)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r5 = r4.setInterpolator(r0)
            r4 = 17
            X.8zI r0 = new X.8zI
            r0.<init>(r7, r4)
            r5.setListener(r0)
            android.widget.LinearLayout r0 = r7.A0E
            if (r0 == 0) goto L_0x008e
            android.view.ViewPropertyAnimator r0 = X.C86654Ky.A0I(r0, r1)
            android.view.ViewPropertyAnimator r4 = r0.translationX(r6)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r4.setInterpolator(r0)
        L_0x008e:
            android.util.Pair r0 = r7.A0B
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r0.first
            if (r0 == 0) goto L_0x00a8
            android.view.View r0 = (android.view.View) r0
            android.view.ViewPropertyAnimator r0 = X.C86654Ky.A0I(r0, r1)
            android.view.ViewPropertyAnimator r1 = r0.translationX(r6)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
        L_0x00a8:
            r7.invalidate()
            return r3
        L_0x00ac:
            boolean r1 = r4.BIT()
            boolean r0 = r4.BIA()
            r4.setQuotedMessage(r2)
            if (r1 == 0) goto L_0x0056
            r0 = r0 ^ 1
            r4.BZx(r2, r0)
            goto L_0x0056
        L_0x00bf:
            boolean r0 = r7.A17(r8)
        L_0x00c3:
            if (r0 == 0) goto L_0x0015
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93324oK.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDrawBubble(boolean z) {
        this.A0V = z;
    }

    public void setFMessage(C624134x r1) {
        this.A0S = r1;
    }

    public int getUserNameViewId() {
        return R.id.name_in_group;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
