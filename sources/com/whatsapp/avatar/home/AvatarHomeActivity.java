package com.whatsapp.avatar.home;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass413;
import X.AnonymousClass414;
import X.AnonymousClass4H4;
import X.AnonymousClass4HY;
import X.AnonymousClass4K2;
import X.AnonymousClass58H;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZD;
import X.AnonymousClass66R;
import X.AnonymousClass6Z3;
import X.C107335b8;
import X.C107405bG;
import X.C107695bk;
import X.C131666dx;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C64333Db;
import X.C71703cX;
import X.C76753sI;
import X.C85244Fm;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.bottomsheet.LockableBottomSheetBehavior;
import com.whatsapp.components.MainChildCoordinatorLayout;
import com.whatsapp.wds.components.button.WDSButton;

public final class AvatarHomeActivity extends C89644eZ {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public FrameLayout A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public LinearLayout A07;
    public AnonymousClass6Z3 A08;
    public CircularProgressBar A09;
    public C85244Fm A0A;
    public WaImageView A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public LockableBottomSheetBehavior A0G;
    public MainChildCoordinatorLayout A0H;
    public AnonymousClass5ZD A0I;
    public WDSButton A0J;
    public boolean A0K;
    public final AnonymousClass66R A0L;

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r1 = A0I2.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A0A = C64333Db.A05(r1);
            this.A0I = (AnonymousClass5ZD) A0I2.A04.get();
        }
    }

    public final void A74() {
        WaTextView waTextView = this.A0D;
        if (waTextView == null) {
            throw C18270x1.A0S("browseStickersTextView");
        }
        C18280x3.A0p(waTextView, this, 46);
        WaTextView waTextView2 = this.A0D;
        if (waTextView2 == null) {
            throw C18270x1.A0S("browseStickersTextView");
        }
        waTextView2.setClickable(true);
        WaTextView waTextView3 = this.A0E;
        if (waTextView3 == null) {
            throw C18270x1.A0S("createProfilePhotoTextView");
        }
        C18280x3.A0p(waTextView3, this, 47);
        WaTextView waTextView4 = this.A0E;
        if (waTextView4 == null) {
            throw C18270x1.A0S("createProfilePhotoTextView");
        }
        waTextView4.setClickable(true);
        WaTextView waTextView5 = this.A0F;
        if (waTextView5 == null) {
            throw C18270x1.A0S("deleteAvatarTextView");
        }
        C18280x3.A0p(waTextView5, this, 48);
        WaTextView waTextView6 = this.A0F;
        if (waTextView6 == null) {
            throw C18270x1.A0S("deleteAvatarTextView");
        }
        waTextView6.setClickable(true);
        LinearLayout linearLayout = this.A07;
        if (linearLayout == null) {
            throw C18270x1.A0S("containerPrivacy");
        }
        C18280x3.A0p(linearLayout, this, 45);
        LinearLayout linearLayout2 = this.A07;
        if (linearLayout2 == null) {
            throw C18270x1.A0S("containerPrivacy");
        }
        linearLayout2.setClickable(true);
    }

    public final void A76(boolean z) {
        MainChildCoordinatorLayout mainChildCoordinatorLayout = this.A0H;
        if (mainChildCoordinatorLayout == null) {
            throw C18270x1.A0S("coordinatorLayout");
        }
        mainChildCoordinatorLayout.post(new C71703cX(7, (Object) this, z));
    }

    public final boolean A77() {
        Integer num;
        LockableBottomSheetBehavior lockableBottomSheetBehavior = this.A0G;
        if (lockableBottomSheetBehavior != null) {
            num = Integer.valueOf(lockableBottomSheetBehavior.A0O);
        } else {
            num = null;
        }
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        if (intValue != 5 && intValue != 3) {
            return false;
        }
        if (lockableBottomSheetBehavior != null) {
            lockableBottomSheetBehavior.A0S(4);
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        A5j(9);
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A0H = (MainChildCoordinatorLayout) C18290x4.A0L(this, R.id.coordinator);
        this.A05 = (LinearLayout) C18290x4.A0L(this, R.id.avatar_home_sheet);
        this.A06 = (LinearLayout) C18290x4.A0L(this, R.id.avatar_new_user_container);
        this.A04 = (FrameLayout) C18290x4.A0L(this, R.id.avatar_set_container);
        this.A07 = (LinearLayout) C18290x4.A0L(this, R.id.avatar_privacy);
        this.A03 = C18290x4.A0L(this, R.id.avatar_bottom_sheet_padding);
        this.A01 = C18290x4.A0L(this, R.id.avatar_placeholder);
        if (AnonymousClass001.A0M(this).orientation != 2) {
            LinearLayout linearLayout = this.A05;
            if (linearLayout == null) {
                throw C18270x1.A0S("containerAvatarSheet");
            }
            BottomSheetBehavior A012 = BottomSheetBehavior.A01(linearLayout);
            C162457s7.A0K(A012, "null cannot be cast to non-null type com.whatsapp.bottomsheet.LockableBottomSheetBehavior<android.widget.LinearLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) A012;
            this.A0G = lockableBottomSheetBehavior;
            if (lockableBottomSheetBehavior != null) {
                lockableBottomSheetBehavior.A0a(new AnonymousClass4H4(this, 0));
            }
        }
        WaImageView waImageView = (WaImageView) C18290x4.A0L(this, R.id.avatar_set_image);
        C18280x3.A0p(waImageView, this, 49);
        this.A0B = waImageView;
        this.A09 = (CircularProgressBar) C18290x4.A0L(this, R.id.avatar_set_progress);
        this.A0D = (WaTextView) C18290x4.A0L(this, R.id.avatar_browse_stickers);
        this.A0E = (WaTextView) C18290x4.A0L(this, R.id.avatar_create_profile_photo);
        this.A0F = (WaTextView) C18290x4.A0L(this, R.id.avatar_delete);
        this.A02 = C18290x4.A0L(this, R.id.avatar_privacy_divider);
        WDSButton wDSButton = (WDSButton) C18290x4.A0L(this, R.id.avatar_create_avatar_button);
        C18320x8.A15(wDSButton, this, 0);
        this.A0J = wDSButton;
        AnonymousClass6Z3 r5 = (AnonymousClass6Z3) C18290x4.A0L(this, R.id.avatar_home_fab);
        C18320x8.A15(r5, this, 1);
        r5.setImageDrawable(new C131666dx(C107335b8.A04(this, R.drawable.ic_action_edit, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved)), this.A00));
        this.A08 = r5;
        this.A00 = C18290x4.A0L(this, R.id.avatar_home_preview_error);
        WaTextView waTextView = (WaTextView) C18290x4.A0L(this, R.id.avatar_try_again);
        C18320x8.A15(waTextView, this, 2);
        this.A0C = waTextView;
        AnonymousClass0R8 A1l = AnonymousClass1Ha.A1l(this, R.string.f11nameremoved);
        if (A1l != null) {
            A1l.A0B(R.string.f11nameremoved);
            A1l.A0N(true);
        }
        AnonymousClass66R r3 = this.A0L;
        AnonymousClass4K2.A00(this, ((AvatarHomeViewModel) r3.getValue()).A00, new AnonymousClass414(this), 2);
        AnonymousClass4K2.A00(this, ((AvatarHomeViewModel) r3.getValue()).A05, new AnonymousClass413(this), 3);
        View view = this.A01;
        if (view == null) {
            throw C18270x1.A0S("newUserAvatarImage");
        }
        C18300x5.A13(this, view, R.string.f11nameremoved);
        WaImageView waImageView2 = this.A0B;
        if (waImageView2 == null) {
            throw C18270x1.A0S("avatarSetImageView");
        }
        C18300x5.A13(this, waImageView2, R.string.f11nameremoved);
    }

    public AvatarHomeActivity(int i) {
        this.A0K = false;
        AnonymousClass4HY.A00(this, 13);
    }

    public boolean A5o() {
        if (!A77()) {
            return super.A5o();
        }
        return false;
    }

    public final void A75() {
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A06();
        }
        boolean z = !C107405bG.A0D(this);
        MainChildCoordinatorLayout mainChildCoordinatorLayout = this.A0H;
        if (mainChildCoordinatorLayout == null) {
            throw C18270x1.A0S("coordinatorLayout");
        }
        mainChildCoordinatorLayout.postDelayed(new C71703cX(8, (Object) this, z), 250);
    }

    public void onBackPressed() {
        if (!A77()) {
            super.onBackPressed();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (A77()) {
            return true;
        }
        finish();
        return true;
    }

    public AvatarHomeActivity() {
        this(0);
        this.A0L = C154517dI.A00(AnonymousClass58H.NONE, new C76753sI(this));
    }
}
