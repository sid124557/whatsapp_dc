package com.whatsapp.search.views;

import X.AnonymousClass000;
import X.AnonymousClass0WH;
import X.AnonymousClass0YI;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5VL;
import X.AnonymousClass5YI;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZL;
import X.AnonymousClass5ZU;
import X.AnonymousClass68Y;
import X.AnonymousClass6BD;
import X.AnonymousClass75J;
import X.AnonymousClass7ET;
import X.C06560Yg;
import X.C100295Aj;
import X.C108795dZ;
import X.C108875dh;
import X.C109745f7;
import X.C116855qy;
import X.C1230767a;
import X.C149937Om;
import X.C15910sA;
import X.C1892090k;
import X.C620633i;
import X.C620733j;
import X.C64333Db;
import X.C64773Ex;
import X.C71283br;
import X.C86614Ku;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C88864av;
import X.C97774zD;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.text.FinalBackspaceAwareEntry;

public class TokenizedSearchInput extends LinearLayout implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public View.OnClickListener A02;
    public View.OnKeyListener A03;
    public TextView.OnEditorActionListener A04;
    public AnonymousClass0WH A05;
    public C15910sA A06;
    public Chip A07;
    public C108875dh A08;
    public C64773Ex A09;
    public AnonymousClass5ZU A0A;
    public C620633i A0B;
    public C620733j A0C;
    public AnonymousClass1VX A0D;
    public UserJid A0E;
    public SearchViewModel A0F;
    public C108795dZ A0G;
    public AnonymousClass7ET A0H;
    public C116855qy A0I;
    public Integer A0J;
    public Runnable A0K;
    public Runnable A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final View.OnFocusChangeListener A0Q;
    public final View A0R;
    public final Chip A0S;
    public final Chip A0T;
    public final Chip A0U;
    public final WaImageButton A0V;
    public final WaImageView A0W;
    public final FinalBackspaceAwareEntry A0X;

    public static /* synthetic */ void A00(View view, TokenizedSearchInput tokenizedSearchInput) {
        SearchViewModel searchViewModel = tokenizedSearchInput.A0F;
        if (searchViewModel != null) {
            if (view == tokenizedSearchInput.A0U) {
                searchViewModel.A0Y(0);
            } else if (view == tokenizedSearchInput.A0S) {
                searchViewModel.A0b((UserJid) null);
            } else if (view == tokenizedSearchInput.A0T) {
                searchViewModel.A0d((C108795dZ) null);
            } else if (view == tokenizedSearchInput.A07) {
                searchViewModel.A0g(true);
            }
        }
        tokenizedSearchInput.postDelayed(new C71283br((Object) tokenizedSearchInput, 31), 100);
    }

    public static /* synthetic */ void A06(TokenizedSearchInput tokenizedSearchInput) {
        SearchViewModel searchViewModel = tokenizedSearchInput.A0F;
        if (searchViewModel != null) {
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0X;
            C86654Ky.A1D(finalBackspaceAwareEntry, searchViewModel.A0N());
            finalBackspaceAwareEntry.sendAccessibilityEvent(8);
            tokenizedSearchInput.setFocus(0);
        }
    }

    public static /* synthetic */ void A08(TokenizedSearchInput tokenizedSearchInput, Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            tokenizedSearchInput.setFocus(0);
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0X;
            finalBackspaceAwareEntry.requestFocus();
            finalBackspaceAwareEntry.A07(false);
            return;
        }
        tokenizedSearchInput.setFocus(4);
        tokenizedSearchInput.A0X.clearFocus();
        tokenizedSearchInput.A0R.requestFocus();
        InputMethodManager A0Q2 = tokenizedSearchInput.A0B.A0Q();
        if (A0Q2 != null) {
            A0Q2.hideSoftInputFromWindow(tokenizedSearchInput.getWindowToken(), 2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r4 != 4) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFocus(int r4) {
        /*
            r3 = this;
            com.whatsapp.search.SearchViewModel r0 = r3.A0F
            if (r0 == 0) goto L_0x0038
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 != 0) goto L_0x0038
            r2 = 1
            if (r4 == 0) goto L_0x0043
            if (r4 == r2) goto L_0x0039
            r0 = 2
            if (r4 == r0) goto L_0x0039
            r0 = 3
            if (r4 == r0) goto L_0x0039
            r0 = 5
            if (r4 == r0) goto L_0x0039
        L_0x0022:
            r0 = 4
            if (r4 == r0) goto L_0x002a
        L_0x0025:
            com.whatsapp.search.SearchViewModel r0 = r3.A0F
            r0.A0h(r2)
        L_0x002a:
            r3.A00 = r4
            r3.A0H()
            r3.A0E()
            r3.A0G()
            r3.A0F()
        L_0x0038:
            return
        L_0x0039:
            com.whatsapp.text.FinalBackspaceAwareEntry r1 = r3.A0X
            r0 = 0
            r1.setSelection(r0)
            r1.setCursorVisible(r0)
            goto L_0x0022
        L_0x0043:
            com.whatsapp.text.FinalBackspaceAwareEntry r0 = r3.A0X
            r0.setCursorVisible(r2)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.setFocus(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r3.A08 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r3 = this;
            com.whatsapp.WaImageView r2 = r3.A0W
            com.whatsapp.jid.UserJid r0 = r3.A0E
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = r3.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.Integer r0 = r3.A0J
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x001f
            X.5dZ r0 = r3.A0G
            if (r0 != 0) goto L_0x001f
            X.5dh r1 = r3.A08
            r0 = 1
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r0 = r0 ^ 1
            r2.setEnabled(r0)
            com.whatsapp.WaImageButton r1 = r3.A0V
            boolean r0 = r3.A0N
            r1.setEnabled(r0)
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x0034
            r3.A0B()
            return
        L_0x0034:
            java.lang.Runnable r0 = r3.A0L
            if (r0 == 0) goto L_0x003b
            r3.removeCallbacks(r0)
        L_0x003b:
            java.lang.Runnable r0 = r3.A0K
            if (r0 == 0) goto L_0x0042
            r3.removeCallbacks(r0)
        L_0x0042:
            r0 = 30
            X.3br r2 = new X.3br
            r2.<init>((java.lang.Object) r3, (int) r0)
            r3.A0L = r2
            r0 = 50
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A0A():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r1 == 8) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B() {
        /*
            r6 = this;
            com.whatsapp.search.SearchViewModel r0 = r6.A0F
            if (r0 == 0) goto L_0x003a
            int r0 = r6.A01
            com.whatsapp.WaImageButton r5 = r6.A0V
            if (r0 == 0) goto L_0x0060
            r0 = 2131232781(0x7f08080d, float:1.808168E38)
            r5.setImageResource(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131894207(0x7f121fbf, float:1.9423212E38)
        L_0x0017:
            X.C18300x5.A13(r1, r5, r0)
            int r4 = r5.getVisibility()
            boolean r0 = r6.A0N
            r3 = 4
            r2 = 8
            if (r0 == 0) goto L_0x0054
            r1 = 0
        L_0x0026:
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x0030
            r5.setVisibility(r1)
            r6.A0C()
        L_0x0030:
            if (r4 != r2) goto L_0x003b
            if (r1 != r2) goto L_0x0045
        L_0x0034:
            r5.setVisibility(r1)
            r6.A0C()
        L_0x003a:
            return
        L_0x003b:
            if (r4 == r2) goto L_0x0034
            if (r1 != r2) goto L_0x0034
            r5.setVisibility(r3)
            r6.A0C()
        L_0x0045:
            r0 = 13
            X.3cJ r2 = new X.3cJ
            r2.<init>((java.lang.Object) r6, (int) r1, (int) r0)
            r6.A0K = r2
            r0 = 50
            r6.postDelayed(r2, r0)
            return
        L_0x0054:
            com.whatsapp.search.SearchViewModel r0 = r6.A0F
            boolean r0 = r0.A0i()
            r1 = 8
            if (r0 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0026
        L_0x0060:
            r0 = 2131232779(0x7f08080b, float:1.8081677E38)
            r5.setImageResource(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131894206(0x7f121fbe, float:1.942321E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A0B():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r3.A08 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r3 = this;
            com.whatsapp.jid.UserJid r0 = r3.A0E
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = r3.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r0 = r3.A0J
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x001d
            X.5dZ r0 = r3.A0G
            if (r0 != 0) goto L_0x001d
            X.5dh r0 = r3.A08
            r2 = 1
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            com.whatsapp.WaImageView r1 = r3.A0W
            r0 = 0
            if (r2 == 0) goto L_0x0024
            r0 = 4
        L_0x0024:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A0C():void");
    }

    public final void A0D() {
        FinalBackspaceAwareEntry finalBackspaceAwareEntry;
        String string;
        if (this.A0E == null || this.A0J.intValue() == 0) {
            finalBackspaceAwareEntry = this.A0X;
            string = getContext().getString(R.string.f11nameremoved);
        } else {
            finalBackspaceAwareEntry = this.A0X;
            string = "";
        }
        finalBackspaceAwareEntry.setHint(string);
    }

    public final void A0E() {
        UserJid userJid = this.A0E;
        Chip chip = this.A0S;
        if (userJid == null) {
            chip.setVisibility(8);
        } else if (chip.getVisibility() == 8) {
            A0I(chip, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        } else {
            boolean z = true;
            chip.setChipBackgroundColor(A09(AnonymousClass000.A1U(this.A00, 2)));
            if (this.A00 != 2) {
                z = false;
            }
            A0K(chip, z);
        }
    }

    public final void A0F() {
        Chip chip = this.A07;
        if (chip != null) {
            C108875dh r0 = this.A08;
            if (r0 == null) {
                chip.setVisibility(8);
            } else {
                A0J(chip, r0.A02, r0.A00, 5);
            }
        }
    }

    public final void A0G() {
        C108795dZ r0 = this.A0G;
        if (r0 == null) {
            this.A0T.setVisibility(8);
        } else {
            A0J(this.A0T, r0.A02, r0.A00, 3);
        }
    }

    public final void A0H() {
        AnonymousClass1VX r7 = this.A0D;
        C149937Om r2 = (C149937Om) AnonymousClass5VL.A00(r7).get(this.A0J.intValue());
        if (r2 == null) {
            this.A0U.setVisibility(8);
            return;
        }
        Chip chip = this.A0U;
        AnonymousClass5Yj.A08(getContext(), getContext(), chip, R.attr.f3nameremoved, R.color.f5nameremoved);
        AnonymousClass5VL.A01(C86654Ky.A0B(this, chip, r2.A05), chip, r7, this.A0J.intValue(), AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        boolean z = false;
        chip.setChipBackgroundColor(A09(AnonymousClass000.A1U(this.A00, 1)));
        if (this.A00 == 1) {
            z = true;
        }
        A0K(chip, z);
        if (chip.getVisibility() == 8) {
            A0I(chip, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        }
    }

    public void A0K(Chip chip, boolean z) {
        Context context;
        float f;
        if (z) {
            chip.setChipStrokeColor(ColorStateList.valueOf(AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
            context = getContext();
            f = 1.0f;
        } else {
            chip.setChipStrokeColor((ColorStateList) null);
            context = getContext();
            f = 0.0f;
        }
        chip.setChipStrokeWidth(AnonymousClass5YI.A01(context, f));
    }

    public void A0L(String str) {
        if (!AnonymousClass75J.A00(this.A0M, str)) {
            if (this.A00 != 0 && !TextUtils.isEmpty(str)) {
                setFocus(0);
            }
            this.A0M = str;
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0I;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0I = r0;
        }
        return r0.generatedComponent();
    }

    public WaImageView getClearButton() {
        return this.A0W;
    }

    public WaImageButton getGridToggle() {
        return this.A0V;
    }

    public TokenizedSearchInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0O) {
            this.A0O = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A0D = C64333Db.A4B(A002);
            this.A09 = C64333Db.A26(A002);
            this.A0A = C64333Db.A28(A002);
            this.A0C = C64333Db.A2t(A002);
            this.A0B = C64333Db.A2o(A002);
        }
        this.A0P = false;
        this.A0M = "";
        this.A0J = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A0H = new AnonymousClass7ET(this);
        this.A04 = new AnonymousClass68Y(this, 5);
        this.A03 = new AnonymousClass6BD(this, 3);
        this.A02 = new C109745f7(this, 39);
        this.A05 = new C1230767a(this, 12);
        this.A0Q = new C1892090k(this, 6);
        LayoutInflater from = LayoutInflater.from(context);
        C86634Kw.A1H(this, 0);
        from.inflate(R.layout.f8nameremoved, this, true);
        this.A0U = (Chip) C06560Yg.A02(this, R.id.type_token);
        this.A0S = (Chip) C06560Yg.A02(this, R.id.chat_token);
        this.A0T = (Chip) C06560Yg.A02(this, R.id.smart_filter_token);
        if (AnonymousClass5ZL.A0L.A00(this.A0D)) {
            this.A07 = (Chip) C86614Ku.A0F(this, R.id.remote_entity_filter_token_stub);
        }
        this.A0X = (FinalBackspaceAwareEntry) C06560Yg.A02(this, R.id.search_input);
        this.A0W = AnonymousClass0x9.A0L(this, R.id.search_clear_btn);
        this.A0R = C06560Yg.A02(this, R.id.focus_dummy);
        this.A0V = C86664Kz.A10(this, R.id.grid_list_toggle);
    }

    public ColorStateList A09(boolean z) {
        int A032 = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        int A033 = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        if (!z) {
            A032 = A033;
        }
        return ColorStateList.valueOf(A032);
    }

    public final void A0I(Chip chip, int i) {
        int color = getResources().getColor(R.color.f5nameremoved);
        int color2 = getResources().getColor(i);
        int A052 = AnonymousClass0YI.A05(color, color2);
        if (this.A0P) {
            chip.setScaleX(1.0f);
            chip.setScaleY(1.0f);
            chip.setAlpha(1.0f);
            chip.setVisibility(0);
            chip.setChipBackgroundColor(ColorStateList.valueOf(color2));
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(A052);
        chip.setScaleX(0.92f);
        chip.setScaleY(0.92f);
        chip.setAlpha(0.0f);
        chip.setChipBackgroundColor(valueOf);
        chip.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chip, "scaleX", new float[]{0.92f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chip, "scaleY", new float[]{0.92f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(chip, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet A0O2 = C86664Kz.A0O();
        A0O2.play(ofFloat).with(ofFloat2).with(ofFloat3);
        A0O2.setDuration(100);
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Object[] objArr = new Object[2];
        AnonymousClass000.A1P(objArr, A052, 0);
        AnonymousClass000.A1P(objArr, color2, 1);
        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
        C100295Aj.A03(ofObject, chip, 16);
        ofObject.setDuration(100);
        AnimatorSet A0O3 = C86664Kz.A0O();
        A0O3.play(ofObject).after(A0O2);
        A0O3.start();
    }

    public final void A0J(Chip chip, int i, int i2, int i3) {
        AnonymousClass5Yj.A08(getContext(), C86654Ky.A0B(this, chip, i), chip, R.attr.f3nameremoved, R.color.f5nameremoved);
        C97774zD.A01(getContext(), chip, i2, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        boolean z = true;
        chip.setChipBackgroundColor(A09(AnonymousClass000.A1U(this.A00, i3)));
        if (this.A00 != i3) {
            z = false;
        }
        A0K(chip, z);
        if (chip.getVisibility() == 8) {
            A0I(chip, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int max = Math.max(getResources().getDimensionPixelSize(R.dimen.f6nameremoved), (int) Math.floor(((double) getWidth()) * 0.3d));
        this.A0U.setMaxWidth(max);
        this.A0S.setMaxWidth(max);
    }

    public void setNoAnimateForTestsOnly(boolean z) {
        this.A0P = z;
    }

    public TokenizedSearchInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TokenizedSearchInput(Context context) {
        this(context, (AttributeSet) null);
    }
}
