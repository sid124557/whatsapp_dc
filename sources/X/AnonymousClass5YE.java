package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.expressions.BaseExpressionsBottomSheet;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.5YE  reason: invalid class name */
public abstract class AnonymousClass5YE {
    public int A00;
    public Activity A01;
    public Context A02;
    public View A03;
    public View A04;
    public ImageButton A05;
    public CoordinatorLayout A06;
    public BottomSheetBehavior A07;
    public AnonymousClass4CE A08;
    public KeyboardPopupLayout A09;
    public WaEditText A0A;
    public EmojiSearchKeyboardContainer A0B;
    public BaseExpressionsBottomSheet A0C;
    public C182448oQ A0D;
    public C184378rh A0E;
    public ExpressionsBottomSheetView A0F;
    public AnonymousClass4TE A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final AnonymousClass33p A0M;
    public final C620733j A0N;
    public final C27821ej A0O;
    public final AnonymousClass5Y0 A0P;
    public final EmojiSearchProvider A0Q;
    public final AnonymousClass2WI A0R;
    public final C84534Cs A0S = new C106765a8(this, 1);
    public final C60152y5 A0T;
    public final C105895Wv A0U;

    public static final /* synthetic */ void A00(AnonymousClass5YE r4) {
        Activity activity = r4.A01;
        if (activity != null) {
            KeyboardPopupLayout keyboardPopupLayout = r4.A09;
            if (keyboardPopupLayout != null) {
                keyboardPopupLayout.A07 = true;
            }
            C18270x1.A0p(r4.A0F);
            C184378rh r0 = r4.A0E;
            if (r0 != null) {
                r0.BUJ();
            }
            ExpressionsBottomSheetView expressionsBottomSheetView = r4.A0F;
            if (expressionsBottomSheetView != null) {
                expressionsBottomSheetView.post(new C71343bx(r4, 39, activity));
            }
        }
    }

    public final float A01() {
        ContentResolver contentResolver;
        Activity activity = this.A01;
        if (activity != null) {
            contentResolver = activity.getContentResolver();
        } else {
            contentResolver = null;
        }
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public final int A02() {
        int i;
        View rootView;
        AnonymousClass0XY A062;
        Activity activity = (Activity) C116885r1.A00(this.A02);
        if (activity == null || (A062 = C06560Yg.A06(AnonymousClass001.A0Q(activity))) == null) {
            Rect A0N2 = AnonymousClass001.A0N();
            View view = this.A04;
            if (view != null) {
                view.getWindowVisibleDisplayFrame(A0N2);
            }
            View view2 = this.A04;
            if (view2 == null || (rootView = view2.getRootView()) == null) {
                i = 0;
            } else {
                i = rootView.getHeight();
            }
            return i - A0N2.bottom;
        }
        C05640Uh r2 = A062.A00;
        return r2.A0C(8).A00 - r2.A0C(2).A00;
    }

    public void A03() {
        BottomSheetBehavior bottomSheetBehavior;
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A0F;
        if (expressionsBottomSheetView != null && expressionsBottomSheetView.getVisibility() != 8 && (bottomSheetBehavior = this.A07) != null && bottomSheetBehavior.A0O != 2) {
            bottomSheetBehavior.A0S(5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
        if (r1 == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r4 = this;
            com.whatsapp.KeyboardPopupLayout r0 = r4.A09
            r1 = 1
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.A07
            if (r0 != r1) goto L_0x000a
        L_0x0009:
            return
        L_0x000a:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r4.A0F
            if (r0 == 0) goto L_0x00bf
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x00bf
            com.whatsapp.KeyboardPopupLayout r0 = r4.A09
            if (r0 == 0) goto L_0x00a1
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x00a1
            r0 = 2131890356(0x7f1210b4, float:1.9415401E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x0027:
            r1 = 2131231688(0x7f0803c8, float:1.8079464E38)
            android.widget.ImageButton r0 = r4.A05
            if (r0 == 0) goto L_0x0031
            r0.setImageResource(r1)
        L_0x0031:
            android.widget.ImageButton r0 = r4.A05
            if (r0 == 0) goto L_0x0038
            r0.setContentDescription(r2)
        L_0x0038:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r4.A0F
            if (r1 == 0) goto L_0x0055
            boolean r0 = r4 instanceof X.C94334qy
            if (r0 == 0) goto L_0x0099
            r0 = 4
        L_0x0041:
            r1.setExpressionsTabs(r0)
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r4.A0B
            if (r0 == 0) goto L_0x0055
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0055
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r4.A0B
            if (r0 == 0) goto L_0x0055
            r0.A00()
        L_0x0055:
            com.whatsapp.KeyboardPopupLayout r0 = r4.A09
            if (r0 == 0) goto L_0x0060
            boolean r1 = X.C105895Wv.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            r1 = 1
            if (r0 == 0) goto L_0x00bb
            com.whatsapp.KeyboardPopupLayout r0 = r4.A09
            if (r0 == 0) goto L_0x006a
            r0.A07 = r1
        L_0x006a:
            r4.A0H = r1
            r4.A0L = r1
            r4.A06()
            com.whatsapp.KeyboardPopupLayout r3 = r4.A09
            if (r3 == 0) goto L_0x0087
            r0 = 7
            X.3Zl r2 = new X.3Zl
            r2.<init>(r4, r0)
            r0 = 50
            float r1 = (float) r0
            float r0 = r4.A01()
            float r1 = r1 * r0
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
        L_0x0087:
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x00a3
            X.4TE r1 = r4.A0G
            if (r1 == 0) goto L_0x0009
            X.3uJ r0 = new X.3uJ
            r0.<init>(r4)
            r1.A00 = r0
            return
        L_0x0099:
            boolean r0 = r4 instanceof X.C94324qx
            if (r0 == 0) goto L_0x009f
            r0 = 3
            goto L_0x0041
        L_0x009f:
            r0 = 7
            goto L_0x0041
        L_0x00a1:
            r2 = 0
            goto L_0x0027
        L_0x00a3:
            com.whatsapp.KeyboardPopupLayout r3 = r4.A09
            if (r3 == 0) goto L_0x0009
            r0 = 8
            X.3Zl r2 = new X.3Zl
            r2.<init>(r4, r0)
            r0 = 300(0x12c, float:4.2E-43)
            float r1 = (float) r0
            float r0 = r4.A01()
            float r1 = r1 * r0
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
            return
        L_0x00bb:
            r4.A0D(r1)
            return
        L_0x00bf:
            r4.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YE.A04():void");
    }

    public final void A05() {
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A0F;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A09();
        }
        BaseExpressionsBottomSheet baseExpressionsBottomSheet = this.A0C;
        if (baseExpressionsBottomSheet != null) {
            ((ExpressionsKeyboardSearchBottomSheet) baseExpressionsBottomSheet).A0C = null;
        }
        this.A0C = null;
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A0B;
        if (emojiSearchKeyboardContainer != null) {
            emojiSearchKeyboardContainer.A02();
        }
        this.A0A = null;
        this.A02 = null;
        this.A01 = null;
        this.A05 = null;
        this.A04 = null;
        this.A0D = null;
        this.A03 = null;
        this.A06 = null;
        this.A09 = null;
        this.A0B = null;
        this.A08 = null;
        this.A0G = null;
        this.A0F = null;
        this.A07 = null;
    }

    public final void A07() {
        int i;
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A0F;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0A();
        }
        BottomSheetBehavior bottomSheetBehavior = this.A07;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0O != 3) {
            ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A0F;
            if (expressionsBottomSheetView2 == null || expressionsBottomSheetView2.getVisibility() != 8) {
                KeyboardPopupLayout keyboardPopupLayout = this.A09;
                if (keyboardPopupLayout != null) {
                    keyboardPopupLayout.A07 = true;
                }
                C18270x1.A0p(this.A0F);
                C184378rh r0 = this.A0E;
                if (r0 != null) {
                    r0.BUJ();
                }
                ExpressionsBottomSheetView expressionsBottomSheetView3 = this.A0F;
                if (expressionsBottomSheetView3 != null) {
                    expressionsBottomSheetView3.post(new C69993Zl(this, 6));
                    return;
                }
                return;
            }
            C86644Kx.A1J(this.A0A);
            return;
        }
        this.A0K = true;
        if (this instanceof C94344qz) {
            i = 5;
        } else {
            i = 4;
        }
        bottomSheetBehavior.A0S(i);
    }

    public final void A08() {
        int i;
        A0B(this.A0F);
        if (this instanceof C94344qz) {
            i = 3;
        } else {
            i = 4;
        }
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A0F;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0C(i);
        }
        ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A0F;
        if (expressionsBottomSheetView2 != null) {
            expressionsBottomSheetView2.A08();
        }
        ExpressionsBottomSheetView expressionsBottomSheetView3 = this.A0F;
        if (expressionsBottomSheetView3 != null) {
            expressionsBottomSheetView3.A0B();
        }
        KeyboardPopupLayout keyboardPopupLayout = this.A09;
        if (keyboardPopupLayout != null) {
            keyboardPopupLayout.A07 = false;
        }
    }

    public final void A09() {
        ViewGroup.LayoutParams layoutParams;
        Resources resources;
        KeyboardPopupLayout keyboardPopupLayout = this.A09;
        if (keyboardPopupLayout != null) {
            keyboardPopupLayout.A07 = false;
            keyboardPopupLayout.requestLayout();
        }
        WaEditText waEditText = this.A0A;
        if (waEditText != null) {
            waEditText.requestFocus();
        }
        KeyboardPopupLayout keyboardPopupLayout2 = this.A09;
        String str = null;
        if (!(keyboardPopupLayout2 == null || (resources = keyboardPopupLayout2.getResources()) == null)) {
            str = resources.getString(R.string.f11nameremoved);
        }
        ImageButton imageButton = this.A05;
        if (imageButton != null) {
            imageButton.setImageResource(R.drawable.ib_emoji);
        }
        ImageButton imageButton2 = this.A05;
        if (imageButton2 != null) {
            imageButton2.setContentDescription(str);
        }
        KeyboardPopupLayout keyboardPopupLayout3 = this.A09;
        if (!(keyboardPopupLayout3 == null || (layoutParams = keyboardPopupLayout3.getLayoutParams()) == null)) {
            layoutParams.height = -1;
        }
        KeyboardPopupLayout keyboardPopupLayout4 = this.A09;
        if (keyboardPopupLayout4 != null) {
            keyboardPopupLayout4.requestLayout();
        }
    }

    public void A0A(int i) {
        ViewTreeObserver viewTreeObserver;
        boolean z;
        int i2;
        this.A00 = i;
        Context context = this.A02;
        if (context != null) {
            this.A0F = new ExpressionsBottomSheetView(context, (AttributeSet) null, 0);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            bottomSheetBehavior.A0d(true);
            if (this instanceof C94344qz) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            bottomSheetBehavior.A0S(i2);
            bottomSheetBehavior.A0U(context.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved), false);
            C002002f r1 = new C002002f(-1, -1);
            r1.A01(bottomSheetBehavior);
            ExpressionsBottomSheetView expressionsBottomSheetView = this.A0F;
            if (expressionsBottomSheetView != null) {
                expressionsBottomSheetView.setLayoutParams(r1);
            }
            CoordinatorLayout coordinatorLayout = this.A06;
            if (coordinatorLayout != null) {
                coordinatorLayout.addView(this.A0F);
            }
        }
        ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A0F;
        View view = null;
        if (expressionsBottomSheetView2 != null) {
            view = expressionsBottomSheetView2.findViewById(R.id.expressions_view_root);
        }
        this.A03 = view;
        this.A0Q.A01((Integer) null);
        ExpressionsBottomSheetView expressionsBottomSheetView3 = this.A0F;
        if (expressionsBottomSheetView3 != null) {
            expressionsBottomSheetView3.setExpressionsSearchListener(this.A0S);
            expressionsBottomSheetView3.setVisibility(8);
        }
        ExpressionsBottomSheetView expressionsBottomSheetView4 = this.A0F;
        if (expressionsBottomSheetView4 != null) {
            BottomSheetBehavior A012 = BottomSheetBehavior.A01(expressionsBottomSheetView4);
            this.A07 = A012;
            if (A012 != null) {
                A012.A0Z(new C1232167o(this, 6));
            }
            BottomSheetBehavior bottomSheetBehavior2 = this.A07;
            if (bottomSheetBehavior2 != null) {
                if (this instanceof C94344qz) {
                    z = true;
                } else {
                    z = false;
                }
                bottomSheetBehavior2.A0p = z;
            }
            CoordinatorLayout coordinatorLayout2 = this.A06;
            if (coordinatorLayout2 != null && (viewTreeObserver = coordinatorLayout2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass6BP(2, this, false));
                return;
            }
            return;
        }
        throw C18300x5.A0X();
    }

    public final void A0B(View view) {
        CoordinatorLayout coordinatorLayout;
        int height;
        if (view != null && (coordinatorLayout = this.A06) != null && (height = coordinatorLayout.getHeight()) > 0) {
            A0C(Integer.valueOf((int) (((float) height) - view.getY())));
        }
    }

    public final void A0C(Integer num) {
        CoordinatorLayout coordinatorLayout;
        int height;
        ViewGroup.LayoutParams layoutParams;
        if (num != null) {
            BottomSheetBehavior bottomSheetBehavior = this.A07;
            if (bottomSheetBehavior == null || bottomSheetBehavior.A0O != 5) {
                ExpressionsBottomSheetView expressionsBottomSheetView = this.A0F;
                if ((expressionsBottomSheetView == null || expressionsBottomSheetView.getVisibility() != 8) && (coordinatorLayout = this.A06) != null && (height = coordinatorLayout.getHeight()) > 0) {
                    int intValue = height - num.intValue();
                    KeyboardPopupLayout keyboardPopupLayout = this.A09;
                    if (!(keyboardPopupLayout == null || (layoutParams = keyboardPopupLayout.getLayoutParams()) == null)) {
                        layoutParams.height = intValue;
                    }
                    KeyboardPopupLayout keyboardPopupLayout2 = this.A09;
                    if (keyboardPopupLayout2 != null) {
                        keyboardPopupLayout2.requestLayout();
                    }
                }
            }
        }
    }

    public final void A0D(boolean z) {
        ViewTreeObserver viewTreeObserver;
        AnonymousClass0x2.A0x(this.A0F);
        C184378rh r0 = this.A0E;
        if (r0 != null) {
            r0.BbV();
        }
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A0F;
        if (expressionsBottomSheetView != null && (viewTreeObserver = expressionsBottomSheetView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass4JS(this, z));
        }
    }

    public boolean A0E() {
        if (this instanceof C94334qy) {
            return C175728Zm.A0S(C56952sp.A08(((C94334qy) this).A00, 6409), C999358t.USE_KEYBOARD_LISTENER.value, false);
        }
        return false;
    }

    public AnonymousClass5YE(AnonymousClass33p r3, C620733j r4, C27821ej r5, AnonymousClass5Y0 r6, EmojiSearchProvider emojiSearchProvider, AnonymousClass2WI r8, C60152y5 r9, C105895Wv r10) {
        this.A0U = r10;
        this.A0P = r6;
        this.A0O = r5;
        this.A0N = r4;
        this.A0Q = emojiSearchProvider;
        this.A0M = r3;
        this.A0T = r9;
        this.A0R = r8;
    }

    public final void A06() {
        BottomSheetBehavior bottomSheetBehavior;
        SharedPreferences.Editor A032;
        String str;
        Resources resources;
        Configuration configuration;
        int A022 = A02();
        if (A022 > 0 && (bottomSheetBehavior = this.A07) != null && bottomSheetBehavior.A0F > A022) {
            Context context = this.A02;
            if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 1) {
                AnonymousClass33p r2 = this.A0M;
                if (C18280x3.A02(AnonymousClass0x2.A0F(r2), "expressions_tray_peek_height_landscape") != A022) {
                    A032 = C18270x1.A03(r2);
                    str = "expressions_tray_peek_height_landscape";
                }
            } else {
                AnonymousClass33p r22 = this.A0M;
                if (C18280x3.A02(AnonymousClass0x2.A0F(r22), "expressions_tray_peek_height_portrait") != A022) {
                    A032 = C18270x1.A03(r22);
                    str = "expressions_tray_peek_height_portrait";
                }
            }
            C18270x1.A0h(A032, str, A022);
            BottomSheetBehavior bottomSheetBehavior2 = this.A07;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.A0U(A022, false);
            }
        }
        WaEditText waEditText = this.A0A;
        if (waEditText != null) {
            waEditText.A05();
        }
    }
}
