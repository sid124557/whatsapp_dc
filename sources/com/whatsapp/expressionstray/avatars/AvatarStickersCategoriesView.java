package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1lQ;
import X.AnonymousClass1lR;
import X.AnonymousClass4AA;
import X.C1001059l;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C29851lS;
import X.C29861lT;
import X.C29871lU;
import X.C29881lV;
import X.C29891lW;
import X.C29901lX;
import X.C29911lY;
import X.C29921lZ;
import X.C378924l;
import X.C43952Uc;
import X.C633839a;
import X.C635339p;
import X.C73833g9;
import X.C88694ab;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public final class AvatarStickersCategoriesView extends FrameLayout {
    public AnonymousClass4AA A00;
    public C43952Uc A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final WaImageView A0B;
    public final WaImageView A0C;
    public final WaImageView A0D;
    public final WaImageView A0E;
    public final WaImageView A0F;
    public final WaImageView A0G;
    public final WaImageView A0H;
    public final WaImageView A0I;
    public final WaImageView A0J;
    public final WaImageView A0K;
    public final WaImageView A0L;
    public final WaImageView A0M;
    public final WaImageView A0N;
    public final WaImageView A0O;
    public final WaImageView A0P;
    public final WaImageView A0Q;
    public final WaImageView A0R;
    public final WaImageView A0S;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersCategoriesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A08 = C18280x3.A0E(this, R.id.recent);
        this.A0N = C18280x3.A0J(this, R.id.recent_icon);
        this.A0O = C18280x3.A0J(this, R.id.recent_selector);
        this.A0A = C18280x3.A0E(this, R.id.starred);
        this.A0R = C18280x3.A0J(this, R.id.starred_icon);
        this.A0S = C18280x3.A0J(this, R.id.starred_selector);
        this.A04 = C18280x3.A0E(this, R.id.happy);
        this.A0F = C18280x3.A0J(this, R.id.happy_icon);
        this.A0G = C18280x3.A0J(this, R.id.happy_selector);
        this.A06 = C18280x3.A0E(this, R.id.love);
        this.A0J = C18280x3.A0J(this, R.id.love_icon);
        this.A0K = C18280x3.A0J(this, R.id.love_selector);
        this.A07 = C18280x3.A0E(this, R.id.reaction);
        this.A0L = C18280x3.A0J(this, R.id.reaction_icon);
        this.A0M = C18280x3.A0J(this, R.id.reaction_selector);
        this.A03 = C18280x3.A0E(this, R.id.greeting);
        this.A0D = C18280x3.A0J(this, R.id.greeting_icon);
        this.A0E = C18280x3.A0J(this, R.id.greeting_selector);
        this.A02 = C18280x3.A0E(this, R.id.celebration);
        this.A0B = C18280x3.A0J(this, R.id.celebration_icon);
        this.A0C = C18280x3.A0J(this, R.id.celebration_selector);
        this.A09 = C18280x3.A0E(this, R.id.sad);
        this.A0P = C18280x3.A0J(this, R.id.sad_icon);
        this.A0Q = C18280x3.A0J(this, R.id.sad_selector);
        this.A05 = C18280x3.A0E(this, R.id.lifestyle);
        this.A0H = C18280x3.A0J(this, R.id.lifestyle_icon);
        this.A0I = C18280x3.A0J(this, R.id.lifestyle_selector);
        C633839a.A00(this.A08, this, 43);
        C633839a.A00(this.A0A, this, 44);
        C633839a.A00(this.A04, this, 45);
        C633839a.A00(this.A06, this, 46);
        C633839a.A00(this.A09, this, 47);
        C633839a.A00(this.A07, this, 48);
        C633839a.A00(this.A03, this, 49);
        C635339p.A00(this.A02, this, 0);
        C633839a.A00(this.A05, this, 39);
        if (C1001059l.A04) {
            int dimensionPixelSize = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
            for (View view : C73833g9.A05(this.A0N, this.A0R, this.A0F, this.A0J, this.A0P, this.A0L, this.A0D, this.A0B, this.A0H)) {
                view.getLayoutParams().width = dimensionPixelSize;
                view.getLayoutParams().height = dimensionPixelSize;
            }
        }
    }

    public static final void setRecentEnabled$lambda$3(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        CoordinatorLayout coordinatorLayout;
        C162457s7.A0J(avatarStickersCategoriesView, 0);
        AnonymousClass4AA r0 = avatarStickersCategoriesView.A00;
        if (r0 != null && (coordinatorLayout = ((AvatarExpressionsFragment) r0).A06) != null) {
            C88694ab.A00(coordinatorLayout, R.string.f11nameremoved, 0).A05();
        }
    }

    public static final void setStarredEnabled$lambda$5(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        CoordinatorLayout coordinatorLayout;
        C162457s7.A0J(avatarStickersCategoriesView, 0);
        AnonymousClass4AA r0 = avatarStickersCategoriesView.A00;
        if (r0 != null && (coordinatorLayout = ((AvatarExpressionsFragment) r0).A06) != null) {
            C88694ab.A00(coordinatorLayout, R.string.f11nameremoved, 0).A05();
        }
    }

    public final void setCategorySelectionListener(AnonymousClass4AA r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setSelectedCategory(C43952Uc r5) {
        C162457s7.A0J(r5, 0);
        C18270x1.A0p(A01(this.A01));
        ImageView A002 = A00(this.A01);
        if (A002 != null) {
            AnonymousClass0x2.A0p(getContext(), A002, R.color.f5nameremoved);
        }
        this.A01 = r5;
        WaImageView A012 = A01(r5);
        if (A012 != null) {
            A012.setVisibility(0);
        }
        ImageView A003 = A00(r5);
        if (A003 != null) {
            AnonymousClass0x2.A0p(getContext(), A003, R.color.f5nameremoved);
        }
    }

    public final ImageView A00(C43952Uc r2) {
        if (C162457s7.A0P(r2, C29901lX.A00)) {
            return this.A0N;
        }
        if (C162457s7.A0P(r2, C29921lZ.A00)) {
            return this.A0R;
        }
        if (C162457s7.A0P(r2, C29861lT.A00)) {
            return this.A0F;
        }
        if (C162457s7.A0P(r2, C29881lV.A00)) {
            return this.A0J;
        }
        if (C162457s7.A0P(r2, AnonymousClass1lQ.A00) || C162457s7.A0P(r2, C29911lY.A00)) {
            return this.A0P;
        }
        if (C162457s7.A0P(r2, C29891lW.A00)) {
            return this.A0L;
        }
        if (C162457s7.A0P(r2, C29851lS.A00)) {
            return this.A0D;
        }
        if (C162457s7.A0P(r2, AnonymousClass1lR.A00)) {
            return this.A0B;
        }
        if (C162457s7.A0P(r2, C29871lU.A00)) {
            return this.A0H;
        }
        return null;
    }

    public final WaImageView A01(C43952Uc r2) {
        if (C162457s7.A0P(r2, C29901lX.A00)) {
            return this.A0O;
        }
        if (C162457s7.A0P(r2, C29921lZ.A00)) {
            return this.A0S;
        }
        if (C162457s7.A0P(r2, C29861lT.A00)) {
            return this.A0G;
        }
        if (C162457s7.A0P(r2, C29881lV.A00)) {
            return this.A0K;
        }
        if (C162457s7.A0P(r2, AnonymousClass1lQ.A00) || C162457s7.A0P(r2, C29911lY.A00)) {
            return this.A0Q;
        }
        if (C162457s7.A0P(r2, C29891lW.A00)) {
            return this.A0M;
        }
        if (C162457s7.A0P(r2, C29851lS.A00)) {
            return this.A0E;
        }
        if (C162457s7.A0P(r2, AnonymousClass1lR.A00)) {
            return this.A0C;
        }
        if (C162457s7.A0P(r2, C29871lU.A00)) {
            return this.A0I;
        }
        return null;
    }

    public final void setLifestyleVisibility(boolean z) {
        WaImageView waImageView = this.A0H;
        int A082 = AnonymousClass001.A08(z ? 1 : 0);
        waImageView.setVisibility(A082);
        this.A05.setVisibility(A082);
    }

    public final void setRecentEnabled(boolean z) {
        AnonymousClass0x2.A0p(getContext(), this.A0N, R.color.f5nameremoved);
        View view = this.A08;
        int i = 42;
        if (z) {
            i = 38;
        }
        C633839a.A00(view, this, i);
    }

    public final void setStarredEnabled(boolean z) {
        AnonymousClass0x2.A0p(getContext(), this.A0R, R.color.f5nameremoved);
        View view = this.A0A;
        int i = 41;
        if (z) {
            i = 40;
        }
        C633839a.A00(view, this, i);
    }

    public static final void setClickListeners$lambda$10(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(C29911lY.A00);
        }
    }

    public static final void setClickListeners$lambda$11(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(C29891lW.A00);
        }
    }

    public static final void setClickListeners$lambda$12(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(C29851lS.A00);
        }
    }

    public static final void setClickListeners$lambda$13(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(AnonymousClass1lR.A00);
        }
    }

    public static final void setClickListeners$lambda$14(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(C29871lU.A00);
        }
    }

    public static final void setClickListeners$lambda$6(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(C29901lX.A00);
        }
    }

    public static final void setClickListeners$lambda$7(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(C29921lZ.A00);
        }
    }

    public static final void setClickListeners$lambda$8(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(C29861lT.A00);
        }
    }

    public static final void setClickListeners$lambda$9(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(C29881lV.A00);
        }
    }

    public static final void setRecentEnabled$lambda$2(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(C29901lX.A00);
        }
    }

    public static final void setStarredEnabled$lambda$4(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass4AA A0P2 = AnonymousClass0x7.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BOc(C29921lZ.A00);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarStickersCategoriesView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickersCategoriesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickersCategoriesView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
