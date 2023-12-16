package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import java.util.Objects;

/* renamed from: X.5nf  reason: invalid class name and case insensitive filesystem */
public class C114825nf implements C182678oo {
    public int A00 = 0;
    public int A01 = 2;
    public int A02 = 0;
    public View A03;
    public C003203q A04;
    public AnonymousClass5UO A05;
    public C188048yE A06;
    public AnonymousClass4LC A07;
    public AnonymousClass4LE A08;
    public boolean A09;
    public boolean A0A = false;
    public final Rect A0B = AnonymousClass001.A0N();
    public final Handler A0C;
    public final AnonymousClass4CE A0D;
    public final AnonymousClass33p A0E;
    public final C620733j A0F;
    public final AnonymousClass5YE A0G;
    public final AnonymousClass1VX A0H;
    public final MediaComposerFragment A0I;
    public final ColorPickerComponent A0J;
    public final AnonymousClass5GV A0K;
    public final C106085Xo A0L;
    public final DoodleView A0M;
    public final C104435Qy A0N;
    public final C103795Ol A0O;
    public final C103705Ob A0P;
    public final AnonymousClass5N6 A0Q;
    public final C109245eJ A0R;
    public final C182678oo A0S;
    public final AnonymousClass5US A0T;
    public final C156767hA A0U;
    public final C105305Uj A0V;
    public final C104255Qg A0W;
    public final C105895Wv A0X;
    public final C72333dY A0Y;
    public final C183538qC A0Z;
    public final boolean A0a;

    public static /* synthetic */ void A00(C114825nf r6) {
        AnonymousClass4LC r2 = r6.A07;
        if (r2 != null) {
            boolean A022 = C107385bE.A02();
            View rootView = r2.findViewById(16908290).getRootView();
            if (A022) {
                rootView.setForeground((Drawable) null);
            } else {
                C86604Kt.A0z(r6.A03.getContext(), rootView, R.color.f5nameremoved);
            }
        }
        AnonymousClass5UO r5 = r6.A05;
        r5.A03();
        r6.A0O.A02 = false;
        ColorPickerComponent colorPickerComponent = r6.A0J;
        ColorPickerView colorPickerView = colorPickerComponent.A05;
        colorPickerView.A01();
        colorPickerView.invalidate();
        r6.A0T.A01 = null;
        DoodleView doodleView = r6.A0M;
        AnonymousClass5GV r22 = r6.A0K;
        doodleView.A03 = r22.A00;
        doodleView.invalidate();
        colorPickerComponent.setColorAndInvalidate(r22.A00);
        C105305Uj r1 = r6.A0V;
        r1.A07(0);
        r1.A01 = r22.A00;
        r5.A02();
        r6.A06();
        r1.A03();
    }

    public static /* synthetic */ void A01(C114825nf r3) {
        r3.A0V.A02();
        AnonymousClass4LC r2 = r3.A07;
        if (r2 != null) {
            boolean A022 = C107385bE.A02();
            View rootView = r2.findViewById(16908290).getRootView();
            if (A022) {
                rootView.setForeground(AnonymousClass0RP.A00(r3.A03.getContext(), R.drawable.doodle_top_bar_background_with_height));
            } else {
                rootView.setBackgroundResource(R.drawable.doodle_top_bar_background);
            }
        }
    }

    public void A02() {
        ValueAnimator valueAnimator;
        ValueAnimator.AnimatorUpdateListener r0;
        DoodleView doodleView = this.A0M;
        if (doodleView.A04()) {
            C103795Ol r8 = this.A0O;
            r8.A02 = true;
            AnonymousClass5UO r2 = this.A05;
            r2.A03();
            A04();
            this.A0T.A01 = null;
            this.A0J.A04(false);
            r2.A01();
            int[] A1Z = C86664Kz.A1Z();
            C105305Uj r22 = this.A0V;
            Rect rect = r22.A03;
            int i = rect.top;
            if (i != -1) {
                A1Z[1] = i;
                A1Z[0] = rect.left;
            } else if (doodleView.getScaleX() == 1.0f && doodleView.getScaleY() == 1.0f) {
                doodleView.getLocationOnScreen(A1Z);
            }
            C003203q r5 = this.A04;
            AnonymousClass5GV r6 = this.A0K;
            AnonymousClass5N6 r9 = this.A0Q;
            Objects.requireNonNull(doodleView);
            AnonymousClass4LC r4 = new AnonymousClass4LC(r5, r6, new AnonymousClass7E7(doodleView), r8, r9, A1Z, this.A0a);
            this.A07 = r4;
            C86654Ky.A0u(r4, this, 6);
            int i2 = r6.A00;
            int A052 = C86604Kt.A05(r22.A0G.A05);
            if (A052 != 1) {
                if (A052 == 3) {
                    valueAnimator = r22.A0D;
                    r0 = new C100365Aq(r22, i2, 3);
                }
                C86614Ku.A0z(r22.A0D, r22, 22);
                AnimatorSet A002 = r22.A00(true);
                r22.A02 = A002;
                AnonymousClass67L.A01(A002, r22, 14);
                r22.A02.start();
                r22.A08 = true;
                this.A07.setOnShowListener(new AnonymousClass93U(this, 0));
            }
            valueAnimator = r22.A0D;
            r0 = new C100455Az(r22, 0.0f, i2, 1);
            valueAnimator.addUpdateListener(r0);
            C86614Ku.A0z(r22.A0D, r22, 22);
            AnimatorSet A0022 = r22.A00(true);
            r22.A02 = A0022;
            AnonymousClass67L.A01(A0022, r22, 14);
            r22.A02.start();
            r22.A08 = true;
            this.A07.setOnShowListener(new AnonymousClass93U(this, 0));
        }
    }

    public void A03() {
        if (this.A0M.A04()) {
            A06();
            C105305Uj r5 = this.A0V;
            r5.A03();
            r5.A07(0);
            AnonymousClass5UO r3 = this.A05;
            r3.A02();
            AnonymousClass5US r2 = this.A0T;
            r5.A0I.setUndoButtonVisibility(C86634Kw.A01(AnonymousClass0x7.A1S(r2.A03.A00) ? 1 : 0));
            r3.A03();
            A04();
            this.A0O.A02 = false;
            ColorPickerComponent colorPickerComponent = this.A0J;
            colorPickerComponent.A04(true);
            r3.A00();
            ColorPickerView colorPickerView = colorPickerComponent.A05;
            colorPickerView.A01();
            colorPickerView.invalidate();
            r2.A01 = null;
        }
    }

    public final void A04() {
        C105305Uj r3 = this.A0V;
        if (C86604Kt.A05(r3.A0G.A05) != 0) {
            r3.A0I.A00();
        }
        if (A0A()) {
            C158927km r2 = (C158927km) this.A0Y.get();
            ShapePickerView shapePickerView = r2.A0R;
            shapePickerView.setVisibility(8);
            r2.A0Y.A02(shapePickerView);
            if (shapePickerView.A02()) {
                shapePickerView.invalidate();
            }
            if (r2.A04) {
                r2.A0E.A1M();
            }
            TitleBarView titleBarView = r3.A0I;
            titleBarView.setToolbarExtraVisibility(8);
            titleBarView.setUndoButtonVisibility(C86634Kw.A01(AnonymousClass0x7.A1S(this.A0T.A03.A00) ? 1 : 0));
            this.A05.A02();
            A06();
        }
    }

    public final void A06() {
        C105305Uj r2 = this.A0V;
        AnonymousClass08M r1 = r2.A0G.A05;
        if (C86604Kt.A05(r1) != 0) {
            r2.A0I.A00();
        }
        int i = 0;
        if (C86604Kt.A05(r1) == 2) {
            C105425Uw r12 = this.A0T.A01;
            if (r12 == null || (!r12.A0R() && !r12.A0Q())) {
                this.A0J.A04(true);
                this.A05.A00();
                r2.A07(0);
                A03();
            } else {
                this.A0J.A00();
            }
        }
        if (A0A()) {
            ColorPickerComponent colorPickerComponent = this.A0J;
            colorPickerComponent.A05.clearAnimation();
            colorPickerComponent.A04(false);
        } else {
            if (!AnonymousClass0x7.A1S(this.A0T.A03.A00)) {
                i = 4;
            }
            r2.A0I.setUndoButtonVisibility(i);
        }
        boolean A002 = C102805Ki.A00(this.A0F);
        TitleBarView titleBarView = r2.A0I;
        RelativeLayout toolbarExtra = titleBarView.getToolbarExtra();
        View startingViewFromToolbarExtra = titleBarView.getStartingViewFromToolbarExtra();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) toolbarExtra.getLayoutParams();
        layoutParams.addRule(A002 ^ true ? 1 : 0, startingViewFromToolbarExtra.getId());
        toolbarExtra.setLayoutParams(layoutParams);
    }

    public void A07(RectF rectF) {
        C104435Qy r2 = this.A0N;
        r2.A07 = rectF;
        C1451774m.A00(r2.A09, rectF, (float) r2.A02);
        DoodleView doodleView = this.A0M;
        r2.A08 = C86614Ku.A0E(doodleView);
        C106085Xo r0 = this.A0L;
        r0.A02();
        doodleView.requestLayout();
        r0.A01();
    }

    public void A08(C105425Uw r3) {
        this.A0M.A03(r3);
        if (!A0A()) {
            boolean A0Q2 = r3.A0Q();
            C105305Uj r1 = this.A0V;
            r1.A07(C18310x6.A02(A0Q2 ? 1 : 0));
            r1.A01 = this.A0K.A00;
        }
    }

    public final void A09(C95964vF r20) {
        String str;
        float f;
        int color;
        int i;
        int i2;
        int i3;
        int i4;
        A04();
        this.A05.A03();
        this.A0O.A02 = false;
        C105305Uj r3 = this.A0V;
        TitleBarView titleBarView = r3.A0I;
        AnonymousClass4Lt r0 = titleBarView.A0L;
        if (r0 == null) {
            throw C18270x1.A0S("shapeToolDrawable");
        }
        r0.A01(0);
        AnonymousClass4Lt r02 = titleBarView.A0K;
        if (r02 == null) {
            throw C18270x1.A0S("penToolDrawable");
        }
        r02.A01(0);
        ColorPickerComponent colorPickerComponent = this.A0J;
        colorPickerComponent.A04(false);
        C105895Wv r03 = this.A0X;
        DoodleView doodleView = this.A0M;
        r03.A03(doodleView);
        int[] iArr = {titleBarView.getPaddingLeft(), titleBarView.getPaddingTop(), titleBarView.getPaddingRight(), titleBarView.getPaddingBottom()};
        AnonymousClass4vO r15 = (AnonymousClass4vO) C18310x6.A0H(C18280x3.A0D(this.A03), R.layout.f8nameremoved).findViewById(R.id.main);
        C95964vF r4 = r20;
        if (r20 == null) {
            str = "";
            f = 0.0f;
            color = -16777216;
            i = this.A02;
            i2 = this.A00;
            i3 = this.A01;
        } else {
            str = r4.A0A;
            f = r4.A05;
            color = r4.A01.getColor();
            i = r4.A07;
            i2 = r4.A06;
            i3 = r4.A09.A02;
        }
        C149797Nx r7 = new C149797Nx(str, f, color, i, i2, i3);
        this.A02 = r7.A02;
        this.A00 = r7.A01;
        this.A01 = r7.A03.A02;
        C003203q r13 = this.A04;
        if (!this.A09) {
            i4 = r3.A03.top;
        } else {
            i4 = 0;
        }
        AnonymousClass4LE r12 = new AnonymousClass4LE(r13, this, r15, r7, iArr, i4);
        this.A08 = r12;
        r12.A02.A00.setDelayShowColorPicker(!C86604Kt.A1Y(colorPickerComponent.A05));
        if (r20 != null) {
            this.A0T.A04(r4);
            doodleView.invalidate();
        }
        this.A08.setOnShowListener(new AnonymousClass93U(this, 1));
        this.A08.show();
        r3.A0C = true;
        this.A08.setOnDismissListener(new C108095cP(this, r4, r7));
    }

    public final boolean A0A() {
        C72333dY r1 = this.A0Y;
        if (!r1.A08() || ((C158927km) r1.get()).A0R.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void BbR(C105425Uw r2) {
        if (r2 instanceof AnonymousClass4vJ) {
            this.A0S.BbR(r2);
        } else {
            A08(r2);
        }
    }

    public final void A05() {
        if (A0A()) {
            C158927km r3 = (C158927km) this.A0Y.get();
            boolean z = this.A09;
            r3.A0U.A02(z);
            r3.A0T.A02(z);
            C18320x8.A18(r3.A0Z, z);
            r3.A0Q.A17(z, C86604Kt.A1Y(r3.A03.A06));
        }
    }

    public boolean A0B(float f, float f2) {
        if (A0A()) {
            return true;
        }
        DoodleView doodleView = this.A0M;
        if (doodleView.A0G.A07 == null) {
            return false;
        }
        if (doodleView.A08.A02) {
            return true;
        }
        AnonymousClass5US r1 = doodleView.A0I;
        if (r1.A02 == null && r1.A00(doodleView.A0H.A00(f, f2)) == null) {
            return false;
        }
        return true;
    }

    public C114825nf(GestureDetector.OnGestureListener onGestureListener, View view, C003203q r36, C15910sA r37, C15940sD r38, C620633i r39, AnonymousClass33p r40, C620733j r41, AnonymousClass5Y0 r42, AnonymousClass5YE r43, AnonymousClass1VX r44, AnonymousClass5UO r45, MediaComposerFragment mediaComposerFragment, AnonymousClass5GV r47, C27831ek r48, C67513Po r49, C182678oo r50, C27801eg r51, C105305Uj r52, AnonymousClass33O r53, C29361ih r54, C56932sn r55, C105895Wv r56, AnonymousClass4FS r57, C183538qC r58, boolean z) {
        Handler A0A2 = AnonymousClass000.A0A();
        this.A0C = A0A2;
        AnonymousClass694 r4 = new AnonymousClass694(this, 8);
        this.A0D = r4;
        AnonymousClass1VX r7 = r44;
        this.A0H = r7;
        C003203q r9 = r36;
        this.A04 = r9;
        C105895Wv r21 = r56;
        this.A0X = r21;
        C620733j r32 = r41;
        this.A0F = r32;
        AnonymousClass5YE r8 = r43;
        this.A0G = r8;
        View view2 = view;
        this.A03 = view2;
        AnonymousClass33p r2 = r40;
        this.A0E = r2;
        AnonymousClass5UO r11 = r45;
        this.A05 = r11;
        this.A0S = r50;
        C105305Uj r6 = r52;
        this.A0V = r6;
        this.A0a = z;
        MediaComposerFragment mediaComposerFragment2 = mediaComposerFragment;
        this.A0I = mediaComposerFragment2;
        AnonymousClass5GV r22 = r47;
        this.A0K = r22;
        this.A0Z = r58;
        this.A02 = AnonymousClass0x2.A0F(r2).getInt("text_tool_media_composer_font", 0);
        C86604Kt.A1E(view2, R.id.doodle_decoration, 0);
        Resources resources = r9.getResources();
        C105425Uw.A03 = resources.getDimension(R.dimen.f6nameremoved);
        resources.getDimension(r7.A0X(2591) ? R.dimen.f6nameremoved : R.dimen.f6nameremoved);
        resources.getDimension(R.dimen.f6nameremoved);
        C105425Uw.A04 = resources.getDimension(R.dimen.f6nameremoved);
        C105425Uw.A06 = resources.getDimension(R.dimen.f6nameremoved);
        C105425Uw.A05 = resources.getDimension(R.dimen.f6nameremoved);
        DoodleView doodleView = (DoodleView) this.A03.findViewById(R.id.doodle_view);
        this.A0M = doodleView;
        C104435Qy r13 = doodleView.A0G;
        this.A0N = r13;
        AnonymousClass5US r3 = doodleView.A0I;
        this.A0T = r3;
        C106085Xo r1 = doodleView.A0F;
        this.A0L = r1;
        C156767hA r14 = new C156767hA(new AnonymousClass7E8(this));
        this.A0U = r14;
        C103795Ol r15 = new C103795Ol(r1, doodleView.A0H, r3, r14, C86614Ku.A0E(doodleView).density);
        this.A0O = r15;
        this.A0Q = new AnonymousClass5N6(r1, r3);
        View findViewById = this.A03.findViewById(R.id.trash);
        ViewGroup A0J2 = C86644Kx.A0J(this.A03, R.id.media_guidelines);
        C620633i r17 = r39;
        C104255Qg r142 = new C104255Qg(A0A2, findViewById, r17, r32, new C86734Lh());
        this.A0W = r142;
        C103705Ob r12 = new C103705Ob(new AnonymousClass7E9(this), r13, new C104425Qx(A0A2, A0J2, r17), r142);
        this.A0P = r12;
        ColorPickerComponent colorPickerComponent = (ColorPickerComponent) this.A03.findViewById(R.id.color_picker_component);
        this.A0J = colorPickerComponent;
        colorPickerComponent.A03(r11, new C114795nc(r22, this, r6), doodleView);
        C114805nd r112 = new C114805nd(this, new C70353aM(this, r6, r11, 1));
        this.A06 = r112;
        C109245eJ r132 = new C109245eJ(onGestureListener, r112, doodleView, r12, new AnonymousClass7EA(), r3);
        this.A0R = r132;
        doodleView.setControllers(r132, r15);
        doodleView.setDoodleViewListener(this.A06);
        AnonymousClass33O r26 = r53;
        C27801eg r24 = r51;
        C67513Po r23 = r49;
        C27831ek r222 = r48;
        C105305Uj r25 = r6;
        C105895Wv r29 = r21;
        C003203q r143 = r9;
        C620733j r172 = r32;
        AnonymousClass1VX r19 = r7;
        MediaComposerFragment mediaComposerFragment3 = mediaComposerFragment2;
        this.A0Y = new C72333dY((Object) null, new C118025ss(r143, r37, r38, r172, r42, r19, mediaComposerFragment3, this, r222, r23, r24, r25, r26, r54, r55, r29, r57));
        this.A09 = false;
        if (r7.A0X(5976)) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) r9.findViewById(R.id.expression_sheet_coordinator_layout);
            View findViewById2 = r9.findViewById(R.id.media_composer_layout);
            C86614Ku.A1S(findViewById2, 1, coordinatorLayout);
            r8.A0A = null;
            r8.A02 = r9;
            r8.A01 = r9;
            r8.A05 = null;
            r8.A06 = coordinatorLayout;
            r8.A09 = null;
            r8.A0B = null;
            r8.A04 = findViewById2;
            r8.A0G = null;
            TitleBarView titleBarView = this.A0V.A0I;
            r8.A0A(C86664Kz.A0C(titleBarView, (int) titleBarView.getY()) + AnonymousClass001.A0T(titleBarView).topMargin);
            r8.A0D = new C1899093c(this, 0);
            C107015aY r0 = new C107015aY(this, 3);
            ExpressionsBottomSheetView expressionsBottomSheetView = r8.A0F;
            if (expressionsBottomSheetView != null) {
                expressionsBottomSheetView.A0I = r0;
            }
            C1896592d r02 = new C1896592d(this, 2, r8);
            if (expressionsBottomSheetView != null) {
                expressionsBottomSheetView.A0N = r02;
            }
            r8.A08 = r4;
            if (expressionsBottomSheetView != null) {
                expressionsBottomSheetView.A03 = r4;
            }
            r8.A0E = new AnonymousClass8GW(this, r6);
        }
    }
}
