package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass08M;
import X.AnonymousClass0R8;
import X.AnonymousClass0UY;
import X.AnonymousClass4SG;
import X.AnonymousClass4W3;
import X.AnonymousClass58H;
import X.AnonymousClass5Yj;
import X.AnonymousClass5Z8;
import X.AnonymousClass5ZD;
import X.AnonymousClass66R;
import X.AnonymousClass6BO;
import X.AnonymousClass8V9;
import X.AnonymousClass8VA;
import X.C005205m;
import X.C107335b8;
import X.C107385bE;
import X.C107405bG;
import X.C107695bk;
import X.C117685sK;
import X.C118845w1;
import X.C118855w2;
import X.C121165zm;
import X.C121175zn;
import X.C121185zo;
import X.C121195zp;
import X.C132066ed;
import X.C132076ee;
import X.C132086ef;
import X.C132096eg;
import X.C154517dI;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C64333Db;
import X.C86604Kt;
import X.C86654Ky;
import X.C88834as;
import X.C89644eZ;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;

public final class AvatarProfilePhotoActivity extends C89644eZ {
    public MenuItem A00;
    public View A01;
    public View A02;
    public View A03;
    public ProgressBar A04;
    public Toolbar A05;
    public ShimmerFrameLayout A06;
    public AvatarProfilePhotoImageView A07;
    public AnonymousClass5ZD A08;
    public WDSButton A09;
    public boolean A0A;
    public final AnonymousClass4W3 A0B;
    public final AnonymousClass4W3 A0C;
    public final AnonymousClass66R A0D;
    public final AnonymousClass66R A0E;
    public final AnonymousClass66R A0F;

    public void A5r() {
        if (!this.A0A) {
            this.A0A = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A08 = (AnonymousClass5ZD) A2W.A04.get();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null) {
            getMenuInflater().inflate(R.menu.f10nameremoved, menu);
            MenuItem findItem = menu.findItem(R.id.menu_avatar_profile_photo_save);
            this.A00 = findItem;
            if (findItem != null) {
                findItem.setIcon((Drawable) this.A0D.getValue());
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        boolean z;
        MenuItem menuItem2 = menuItem;
        int A042 = C18290x4.A04(menuItem2);
        if (A042 == R.id.menu_avatar_profile_photo_save) {
            AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A0F.getValue();
            Log.i("AvatarProfilePhotoViewModel/onSavePhotoClicked()");
            AnonymousClass08M r2 = avatarProfilePhotoViewModel.A00;
            AnonymousClass5Z8 r6 = (AnonymousClass5Z8) r2.A07();
            if (r6 == null) {
                str = "AvatarProfilePhotoViewModel/onSavePhotoClicked(null view state)";
            } else {
                C132066ed r13 = r6.A01;
                C132096eg r11 = r6.A00;
                if (r13 == null || r11 == null) {
                    str = "AvatarProfilePhotoViewModel/onSavePhotoClicked(null value)";
                } else {
                    Iterator it = r6.A03.iterator();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        C132086ef r4 = (C132086ef) it.next();
                        if (r4 instanceof C132076ee) {
                            z = ((C132076ee) r4).A01;
                        } else {
                            z = ((C132066ed) r4).A03;
                        }
                        if (z) {
                            break;
                        }
                        i2++;
                    }
                    Iterator it2 = r6.A02.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((C132096eg) it2.next()).A03) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    AnonymousClass5Z8 A0R = C86654Ky.A0R(r2);
                    r2.A0H(new AnonymousClass5Z8(A0R.A00, A0R.A01, A0R.A03, A0R.A02, true, A0R.A05, A0R.A04));
                    avatarProfilePhotoViewModel.A0D.BkP(new C117685sK(r11, avatarProfilePhotoViewModel, r13, i2, i, 1));
                }
            }
            Log.i(str);
        } else if (A042 == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem2);
    }

    public AvatarProfilePhotoActivity(int i) {
        this.A0A = false;
        C86604Kt.A1K(this, 11);
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        Toolbar A2T = AnonymousClass4SG.A2T(this);
        setSupportActionBar(A2T);
        C107335b8.A0D(this, A2T, this.A00, R.color.f5nameremoved);
        A2T.setTitle((int) R.string.f11nameremoved);
        this.A05 = A2T;
        if (C107385bE.A02()) {
            C107405bG.A07(this, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
            C107405bG.A0C(getWindow(), !C107405bG.A0D(this));
        }
        WDSButton wDSButton = (WDSButton) C005205m.A00(this, R.id.avatar_profile_photo_options);
        C18320x8.A15(wDSButton, this, 3);
        this.A09 = wDSButton;
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
        }
        AnonymousClass4W3 r2 = this.A0C;
        RecyclerView recyclerView = (RecyclerView) C005205m.A00(this, R.id.avatar_pose_recycler);
        recyclerView.setAdapter(r2);
        recyclerView.setItemAnimator((AnonymousClass0UY) null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new AvatarProfilePhotoActivity$setupRecyclerView$1$1());
        AnonymousClass4W3 r22 = this.A0B;
        RecyclerView recyclerView2 = (RecyclerView) C005205m.A00(this, R.id.avatar_color_recycler);
        recyclerView2.setAdapter(r22);
        recyclerView2.setItemAnimator((AnonymousClass0UY) null);
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new AvatarProfilePhotoActivity$setupRecyclerView$1$1());
        this.A07 = (AvatarProfilePhotoImageView) C005205m.A00(this, R.id.avatar_pose);
        this.A02 = C005205m.A00(this, R.id.pose_layout);
        this.A04 = (ProgressBar) C005205m.A00(this, R.id.profile_image_progress);
        this.A06 = (ShimmerFrameLayout) C005205m.A00(this, R.id.pose_shimmer);
        this.A03 = C005205m.A00(this, R.id.poses_title);
        this.A01 = C005205m.A00(this, R.id.background_color_title);
        AvatarProfilePhotoImageView avatarProfilePhotoImageView = this.A07;
        if (avatarProfilePhotoImageView != null) {
            C18300x5.A13(this, avatarProfilePhotoImageView, R.string.f11nameremoved);
        }
        View view2 = this.A03;
        if (view2 != null) {
            C18300x5.A13(this, view2, R.string.f11nameremoved);
        }
        View view3 = this.A01;
        if (view3 != null) {
            C18300x5.A13(this, view3, R.string.f11nameremoved);
        }
        WDSButton wDSButton2 = this.A09;
        if (wDSButton2 != null) {
            C18300x5.A13(this, wDSButton2, R.string.f11nameremoved);
        }
        Toolbar toolbar = this.A05;
        if (toolbar != null) {
            toolbar.setNavigationContentDescription((CharSequence) getString(R.string.f11nameremoved));
        }
        AnonymousClass66R r3 = this.A0F;
        C86604Kt.A1N(this, ((AvatarProfilePhotoViewModel) r3.getValue()).A00, new C121185zo(this), 4);
        C86604Kt.A1N(this, ((AvatarProfilePhotoViewModel) r3.getValue()).A0C, new C121175zn(this), 5);
        if (C86604Kt.A02(this) == 2 && (view = this.A02) != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BO((Object) new AnonymousClass8VA(this), 0, (Object) view));
        }
    }

    public AvatarProfilePhotoActivity() {
        this(0);
        AnonymousClass58H r2 = AnonymousClass58H.NONE;
        this.A0F = C154517dI.A00(r2, new C118855w2(this));
        this.A0C = new AnonymousClass4W3(new C121195zp(this));
        this.A0B = new AnonymousClass4W3(new C121165zm(this));
        this.A0D = C154517dI.A00(r2, new C118845w1(this));
        this.A0E = C154517dI.A00(r2, new AnonymousClass8V9(this));
    }
}
