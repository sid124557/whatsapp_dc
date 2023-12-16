package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.0zA  reason: invalid class name and case insensitive filesystem */
public final class C19300zA extends LinearLayout implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public ImageView A02;
    public C85244Fm A03;
    public C620733j A04;
    public AnonymousClass643 A05;
    public C43192Rd A06;
    public C46102b5 A07;
    public C633638y A08;
    public C48212eX A09;
    public C49182g7 A0A;
    public C116855qy A0B;
    public boolean A0C;
    public final ViewStub A0D;
    public final LinearLayout A0E;
    public final TextView A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final Toolbar A0I;
    public final C08270df A0J;
    public final AppBarLayout A0K;
    public final WDSButton A0L;
    public final WDSButton A0M;

    public C19300zA(Context context, C08270df r7) {
        super(context);
        if (!this.A0C) {
            this.A0C = true;
            C88864av r3 = (C88864av) ((C111685iW) generatedComponent());
            C64333Db r4 = r3.A0K;
            this.A03 = C64333Db.A05(r4);
            this.A04 = C64333Db.A2t(r4);
            this.A07 = (C46102b5) r3.A0H.get();
            C107695bk r2 = r4.A00;
            this.A06 = (C43192Rd) r2.A9J.get();
            this.A09 = (C48212eX) r4.ARN.get();
            this.A0A = (C49182g7) r2.ABt.get();
            this.A05 = (AnonymousClass643) r3.A05.get();
        }
        this.A0J = r7;
        this.A00 = -1;
        this.A01 = -1;
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        setOrientation(1);
        this.A0D = (ViewStub) C18290x4.A0M(this, R.id.privacy_disclosure_head_icon_view_stub);
        TextView A0F2 = C18280x3.A0F(this, R.id.title);
        this.A0H = A0F2;
        this.A0F = C18280x3.A0F(this, R.id.body);
        this.A0L = (WDSButton) C18290x4.A0M(this, R.id.button_primary);
        this.A0M = (WDSButton) C18290x4.A0M(this, R.id.button_secondary);
        this.A0G = C18280x3.A0F(this, R.id.footer);
        this.A0K = (AppBarLayout) C18290x4.A0M(this, R.id.appbar);
        this.A0I = (Toolbar) C18290x4.A0M(this, R.id.toolbar);
        this.A0E = (LinearLayout) C18290x4.A0M(this, R.id.privacy_disclosure_bullets);
        C107295b4.A06(A0F2, true);
    }

    public static final void setupToolBarAndTopView$lambda$5$lambda$3(C19300zA r1, View view) {
        C162457s7.A0J(r1, 0);
        AnonymousClass5BZ.A00(r1.A0J, AnonymousClass58Y.RESULT_BACK);
    }

    public final void setBulletViewFactory(AnonymousClass643 r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setImageLoader(C43192Rd r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setLinkLauncher(C85244Fm r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setPrivacyDisclosureLogger(C48212eX r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setUiUtils(C46102b5 r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setUserNoticeActionHandler(C49182g7 r2) {
        C162457s7.A0J(r2, 0);
        this.A0A = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void A00(C633638y r36, int i, int i2) {
        String str;
        String str2;
        C633338v r2;
        View inflate;
        int i3;
        int i4 = i;
        this.A00 = i4;
        this.A01 = i2;
        ViewStub viewStub = this.A0D;
        C633638y r1 = r36;
        if (!(viewStub.getParent() == null || (r2 = r1.A02) == null)) {
            if (C162457s7.A0P(r2.A04, "lottie")) {
                viewStub.setLayoutResource(R.layout.f8nameremoved);
                inflate = viewStub.inflate();
                i3 = R.id.privacy_disclosure_head_icon_animation_view;
            } else {
                viewStub.setLayoutResource(R.layout.f8nameremoved);
                inflate = viewStub.inflate();
                i3 = R.id.privacy_disclosure_head_icon_view;
            }
            View A022 = C06560Yg.A02(inflate, i3);
            C162457s7.A0H(A022);
            if (A022 != null) {
                this.A02 = (ImageView) A022;
            }
        }
        setupToolBarAndTopView(r1.A03, this.A0K, this.A0I, this.A02);
        C46102b5 uiUtils = getUiUtils();
        Context A0F2 = C18290x4.A0F(this);
        C633338v r4 = r1.A02;
        ImageView imageView = this.A02;
        if (imageView != null) {
            if (r4 != null) {
                if (C107405bG.A0D(A0F2)) {
                    str2 = r4.A02;
                } else {
                    str2 = r4.A03;
                }
                if (str2 != null) {
                    C60622yr A002 = AnonymousClass754.A00(A0F2, r4.A00, r4.A01);
                    int i5 = R.dimen.f6nameremoved;
                    if (A002 == null) {
                        i5 = R.dimen.f6nameremoved;
                    }
                    int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(i5);
                    C43182Rc r10 = uiUtils.A02;
                    String str3 = r4.A04;
                    C51912ka r9 = new C51912ka(C369120f.HEAD, 0);
                    Resources resources = imageView.getResources();
                    r10.A03.A01(new C71153be(A0F2, resources, imageView, r9, r10, A002, str2, str3, i4, dimensionPixelSize, dimensionPixelSize), AnonymousClass2C4.A01);
                }
            } else {
                imageView.setVisibility(8);
            }
        }
        getUiUtils().A00(C18290x4.A0F(this), this.A0H, getUserNoticeActionHandler(), r1.A09);
        getUiUtils().A00(C18290x4.A0F(this), this.A0F, getUserNoticeActionHandler(), r1.A05);
        getUiUtils();
        Context A0F3 = C18290x4.A0F(this);
        LinearLayout linearLayout = this.A0E;
        C632838q[] r92 = r1.A0A;
        AnonymousClass643 bulletViewFactory = getBulletViewFactory();
        C162457s7.A0J(linearLayout, 2);
        int length = r92.length;
        int i6 = 0;
        if (length == 0) {
            i6 = 8;
        }
        linearLayout.setVisibility(i6);
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            C632838q r5 = r92[i7];
            int i9 = i8 + 1;
            C118045su r42 = ((C115205oI) bulletViewFactory).A00;
            C88864av r3 = r42.A04;
            C19240z4 r29 = new C19240z4(A0F3, (C43182Rc) r3.A0F.get(), (C46102b5) r3.A0H.get(), (C49182g7) r42.A03.A00.ABt.get(), i8);
            C633338v r11 = r5.A00;
            if (r11 != null) {
                if (C107405bG.A0D(A0F3)) {
                    str = r11.A02;
                } else {
                    str = r11.A03;
                }
                String str4 = r11.A04;
                int dimensionPixelSize2 = r29.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                if (str != null) {
                    C43182Rc r15 = r29.A04;
                    Context A0F4 = C18290x4.A0F(r29);
                    WaImageView waImageView = r29.A02;
                    C51912ka r13 = new C51912ka(C369120f.BULLET, r29.A03);
                    C162457s7.A0J(waImageView, 1);
                    Resources resources2 = waImageView.getResources();
                    r15.A03.A01(new C71153be(A0F4, resources2, waImageView, r13, r15, (C60622yr) null, str, str4, i4, dimensionPixelSize2, dimensionPixelSize2), AnonymousClass2C4.A01);
                }
            }
            r29.setText(r5.A01);
            r29.setSecondaryText(r5.A02);
            r29.setItemPaddingIfNeeded(AnonymousClass001.A1Y(i8, length - 1));
            linearLayout.addView(r29);
            i7++;
            i8 = i9;
        }
        getUiUtils().A00(C18290x4.A0F(this), this.A0G, getUserNoticeActionHandler(), r1.A06);
        C166007xz r6 = r1.A00;
        WDSButton wDSButton = this.A0L;
        wDSButton.setVisibility(0);
        wDSButton.setText(r6.A01);
        wDSButton.setOnClickListener(new C634539h(this, r6, 1, false));
        C166007xz r43 = r1.A01;
        if (r43 != null) {
            WDSButton wDSButton2 = this.A0M;
            wDSButton2.setVisibility(0);
            wDSButton2.setText(r43.A01);
            wDSButton2.setOnClickListener(new C634539h(this, r43, 1, true));
        }
        this.A08 = r1;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0B;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass643 getBulletViewFactory() {
        AnonymousClass643 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("bulletViewFactory");
    }

    public final C43192Rd getImageLoader() {
        C43192Rd r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("imageLoader");
    }

    public final C85244Fm getLinkLauncher() {
        C85244Fm r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkLauncher");
    }

    public final C48212eX getPrivacyDisclosureLogger() {
        C48212eX r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("privacyDisclosureLogger");
    }

    public final C46102b5 getUiUtils() {
        C46102b5 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("uiUtils");
    }

    public final C49182g7 getUserNoticeActionHandler() {
        C49182g7 r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("userNoticeActionHandler");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final void setupToolBarAndTopView(C165957xu r7, AppBarLayout appBarLayout, Toolbar toolbar, View view) {
        Context context;
        boolean z;
        int i;
        if (view != null && (context = getContext()) != null) {
            getUiUtils();
            C620733j whatsAppLocale = getWhatsAppLocale();
            C633939b r4 = new C633939b(this, 17);
            C18270x1.A11(appBarLayout, 3, toolbar);
            if (r7 == null || !r7.A00) {
                appBarLayout.setVisibility(8);
                toolbar.setVisibility(8);
                z = false;
            } else {
                appBarLayout.setVisibility(0);
                toolbar.setVisibility(0);
                C131666dx A0J2 = AnonymousClass0x7.A0J(context, whatsAppLocale, R.drawable.ic_close);
                A0J2.setColorFilter(context.getResources().getColor(R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP);
                toolbar.setNavigationIcon((Drawable) A0J2);
                toolbar.setNavigationOnClickListener(r4);
                z = true;
            }
            C158547k9 A002 = C106895aL.A00(view);
            if (!z) {
                i = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            } else {
                i = 0;
            }
            A002.A03 = i;
            C106895aL.A01(view, A002);
        }
    }
}
