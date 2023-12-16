package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.4my  reason: invalid class name and case insensitive filesystem */
public final class C92614my extends C93314oJ {
    public C29421in A00;
    public C114015mM A01;
    public AnonymousClass58M A02 = AnonymousClass58M.EMPTY;
    public C996557m A03 = C996557m.UPDATED;
    public AnonymousClass5YD A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Drawable A08;
    public final LinearLayout A09 = ((LinearLayout) C18280x3.A0E(this, R.id.newsletter_context_card));
    public final TextView A0A = AnonymousClass0x2.A0I(this, R.id.newsletter_admin_context_card_subtitle);
    public final TextView A0B = AnonymousClass0x2.A0I(this, R.id.newsletter_admin_context_card_title);
    public final C56602sG A0C = new C91854lF(this);
    public final C30341mI A0D;
    public final WDSButton A0E = C86614Ku.A0p(this, R.id.add_newsletter_description);
    public final WDSButton A0F = C86614Ku.A0p(this, R.id.share_newsletter_link);
    public final WDSButton A0G = C86614Ku.A0p(this, R.id.share_to_my_status);
    public final WDSProfilePhoto A0H = ((WDSProfilePhoto) C18280x3.A0E(this, R.id.newsletter_icon));
    public final AnonymousClass66R A0I = C154517dI.A01(new C119455x0(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92614my(Context context, AnonymousClass677 r4, C30341mI r5) {
        super(context, r4, r5);
        C162457s7.A0J(context, 1);
        A0v();
        this.A0D = r5;
        Drawable A0G2 = C18310x6.A0G(context, R.drawable.balloon_centered_no_padding_normal);
        C162457s7.A0D(A0G2);
        this.A08 = A0G2;
        setClickable(false);
        this.A2M = true;
        this.A2Q = false;
        setOnClickListener((View.OnClickListener) null);
        A22();
    }

    public static final void setupShareNewsletterLinkButton$lambda$2(C92614my r1, Intent intent, View view) {
        C162457s7.A0J(r1, 0);
        AnonymousClass0RN.A00(r1.getBaseActivity(), intent, (Bundle) null);
    }

    public Drawable A10(int i, int i2, boolean z) {
        if (i == 1) {
            return this.A08;
        }
        Drawable A10 = super.A10(i, i2, z);
        C162457s7.A0D(A10);
        return A10;
    }

    public final void setContactObservers(C29421in r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setContactPhotos(C114015mM r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setNewsletterLogging(AnonymousClass5YD r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    private final AnonymousClass1RL getNewsletterInfo() {
        AnonymousClass31A A002 = C56982ss.A00(this.A0N, this.A0D.A1J.A00);
        if (A002 instanceof AnonymousClass1RL) {
            return (AnonymousClass1RL) A002;
        }
        return null;
    }

    private final AnonymousClass5MG getTransitionNames() {
        return (AnonymousClass5MG) this.A0I.getValue();
    }

    public static /* synthetic */ void setupNewsletterIcon$default(C92614my r1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        r1.setupNewsletterIcon(z);
    }

    public void A0v() {
        if (!this.A06) {
            this.A06 = true;
            C88864av A0C2 = C87094Nz.A0C(this);
            C64333Db r2 = A0C2.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A2 = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A2, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C2, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A2, r2, A0C2, this, C86604Kt.A0i(r2));
            C87094Nz.A0L(A0A2, r2, this);
            this.A00 = C86604Kt.A0Q(r2);
            this.A04 = (AnonymousClass5YD) r2.ANq.get();
            this.A01 = C86604Kt.A0S(r2);
        }
    }

    public final void A23() {
        int i;
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            i = R.string.f11nameremoved;
        } else if (ordinal == 1) {
            i = R.string.f11nameremoved;
        } else if (ordinal == 2) {
            i = R.string.f11nameremoved;
        } else if (ordinal == 3) {
            i = R.string.f11nameremoved;
        } else {
            throw C73153f1.A00();
        }
        TextView textView = this.A0A;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x2.A0s(getContext(), A0o, i);
        A0o.append(' ');
        AnonymousClass0x2.A0s(getContext(), A0o, R.string.f11nameremoved);
        textView.setText(A0o.toString());
    }

    public final C29421in getContactObservers() {
        C29421in r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactObservers");
    }

    public final C114015mM getContactPhotos() {
        C114015mM r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public final AnonymousClass5YD getNewsletterLogging() {
        AnonymousClass5YD r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("newsletterLogging");
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    /* access modifiers changed from: private */
    public final C89644eZ getBaseActivity() {
        Activity A002 = C111095hX.A00(getContext());
        C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        return (C89644eZ) A002;
    }

    public static final void setupAddNewsletterDescriptionButton$lambda$1(C92614my r3, Intent intent, View view) {
        C18260x0.A0O(r3, intent);
        C05680Um.A02(r3.getBaseActivity(), intent, (Bundle) null, 1052);
        r3.A03 = C996557m.NEEDS_UPDATE;
    }

    private final void setupNewsletterIcon(boolean z) {
        AnonymousClass1RL newsletterInfo = getNewsletterInfo();
        if (newsletterInfo != null) {
            C105365Uq A062 = getContactPhotos().A06(getContext(), "newsletter-admin-context-card");
            AnonymousClass3ZH A012 = this.A1H.A01(newsletterInfo.A05());
            int i = R.dimen.f6nameremoved;
            if (z) {
                i = R.dimen.f6nameremoved;
            }
            int A052 = C86614Ku.A05(this, i);
            WDSProfilePhoto wDSProfilePhoto = this.A0H;
            A062.A09(wDSProfilePhoto, A012, A052, true);
            if (!this.A07) {
                this.A07 = true;
                getContactObservers().A06(this.A0C);
            }
            C107295b4.A02(wDSProfilePhoto);
            C107295b4.A03(wDSProfilePhoto, R.string.f11nameremoved);
            C18300x5.A13(getContext(), wDSProfilePhoto, R.string.f11nameremoved);
            if (newsletterInfo.A0J != null) {
                wDSProfilePhoto.setProfileBadge((C156257gJ) null);
                wDSProfilePhoto.setOnClickListener((View.OnClickListener) null);
                wDSProfilePhoto.setClickable(false);
                return;
            }
            if (wDSProfilePhoto.A04 == null) {
                wDSProfilePhoto.setProfileBadge(new C139966sw());
            }
            wDSProfilePhoto.setClickable(true);
            C109475eg.A00(wDSProfilePhoto, this, newsletterInfo, 16);
        }
    }

    public static final void setupNewsletterIcon$lambda$0(C92614my r10, AnonymousClass1RL r11, View view) {
        int i;
        C18260x0.A0O(r10, r11);
        C89644eZ baseActivity = r10.getBaseActivity();
        if (!r10.A05) {
            int statusBarColor = baseActivity.getWindow().getStatusBarColor();
            if (C107385bE.A05()) {
                i = baseActivity.getWindow().getNavigationBarColor();
            } else {
                i = 0;
            }
            C95804uY A0I2 = r11.A0I();
            C89644eZ baseActivity2 = r10.getBaseActivity();
            Intent A072 = C18320x8.A07();
            C86604Kt.A13(A072, A0I2, baseActivity2.getPackageName(), "com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto");
            A072.putExtra("circular_transition", true);
            A072.putExtra("start_transition_alpha", 0.0f);
            A072.putExtra("start_transition_status_bar_color", statusBarColor);
            A072.putExtra("return_transition_status_bar_color", 0);
            A072.putExtra("start_transition_navigation_bar_color", i);
            A072.putExtra("return_transition_navigation_bar_color", 0);
            A072.putExtra("open_pic_selection_sheet", true);
            View A0E2 = C18280x3.A0E(r10, R.id.transition_start);
            String A032 = r10.getTransitionNames().A03(R.string.f11nameremoved);
            C162457s7.A0D(A032);
            C05680Um.A02(baseActivity, A072, C107275b2.A05(baseActivity, A0E2, A032), 1053);
        }
    }

    public static final void setupShareToMyStatusButton$lambda$3(C92614my r5, AnonymousClass1RL r6, Intent intent, View view) {
        r5.getNewsletterLogging().A07(r6.A0I(), (AnonymousClass59F) null, 2, C18270x1.A1U(r5, r6) ? 1 : 0);
        AnonymousClass0RN.A00(r5.getBaseActivity(), intent, (Bundle) null);
    }

    public void A1q(C624134x r3, boolean z) {
        super.A1q(getFMessage(), z);
        if (z || this.A03 == C996557m.NEEDS_UPDATE) {
            A22();
            this.A03 = C996557m.UPDATED;
        }
    }

    public final void A22() {
        int i;
        AnonymousClass1RL newsletterInfo = getNewsletterInfo();
        if (newsletterInfo == null || !newsletterInfo.A0K() || !this.A0O.A0X(5158)) {
            this.A0B.setVisibility(8);
            this.A0A.setVisibility(8);
            this.A0H.setVisibility(8);
            this.A0E.setVisibility(8);
            this.A0F.setVisibility(8);
            LinearLayout linearLayout = this.A09;
            linearLayout.setVisibility(8);
            this.A0G.setVisibility(8);
            linearLayout.setPadding(0, 0, 0, 0);
            C86624Kv.A0t(this, 0);
            return;
        }
        A24();
        setupNewsletterIcon(false);
        AnonymousClass1RL newsletterInfo2 = getNewsletterInfo();
        if (newsletterInfo2 != null) {
            TextView textView = this.A0B;
            Context context = getContext();
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = newsletterInfo2.A0H;
            AnonymousClass001.A0y(context, textView, A0L, R.string.f11nameremoved);
        }
        A23();
        AnonymousClass1RL newsletterInfo3 = getNewsletterInfo();
        if (newsletterInfo3 != null) {
            Context context2 = getContext();
            C95804uY A0I2 = newsletterInfo3.A0I();
            Intent A072 = C18320x8.A07();
            C86604Kt.A13(A072, A0I2, context2.getPackageName(), "com.whatsapp.newsletter.ui.NewsletterEditDescriptionActivity");
            WDSButton wDSButton = this.A0E;
            String str = newsletterInfo3.A0E;
            int i2 = 0;
            if (str != null && str.length() > 0) {
                i2 = 8;
            }
            wDSButton.setVisibility(i2);
            C109475eg.A00(wDSButton, this, A072, 15);
        }
        AnonymousClass1RL newsletterInfo4 = getNewsletterInfo();
        if (newsletterInfo4 != null) {
            C89644eZ baseActivity = getBaseActivity();
            C95804uY A0I3 = newsletterInfo4.A0I();
            int i3 = AnonymousClass59F.CONTEXT_CARD.value;
            Intent A073 = C18320x8.A07();
            A073.setClassName(baseActivity.getPackageName(), "com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity");
            AnonymousClass0x2.A0u(A073, A0I3, "jid");
            A073.putExtra("entry_point", i3);
            C109475eg.A00(this.A0F, this, A073, 17);
        }
        AnonymousClass1RL newsletterInfo5 = getNewsletterInfo();
        if (newsletterInfo5 != null) {
            String str2 = newsletterInfo5.A0F;
            if (str2 != null) {
                i = R.string.f11nameremoved;
            } else {
                str2 = newsletterInfo5.A0G;
                if (str2 != null) {
                    i = R.string.f11nameremoved;
                }
            }
            C89644eZ baseActivity2 = getBaseActivity();
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = newsletterInfo5.A0H;
            C109725f5.A00(this.A0G, this, newsletterInfo5, C627736r.A0M(getBaseActivity(), (C108845de) null, 17, C18300x5.A0e(baseActivity2, str2, A0M, 1, i)), 35);
        }
        if (C107275b2.A00) {
            C89644eZ baseActivity3 = getBaseActivity();
            Window window = baseActivity3.getWindow();
            C162457s7.A0D(window);
            if (baseActivity3.getIntent().getBooleanExtra("circular_transition", false)) {
                window.requestFeature(12);
                AnonymousClass6EJ r1 = new AnonymousClass6EJ(true, false);
                r1.addTarget(AnonymousClass5MG.A01(baseActivity3));
                window.setSharedElementEnterTransition(r1);
                r1.addListener(new C189018zr(this, 0));
            }
            Fade fade = new Fade();
            C86634Kw.A19(fade);
            window.setReturnTransition(fade);
            window.setEnterTransition(fade);
            C86634Kw.A1G(window);
        }
    }

    public final void A24() {
        AnonymousClass58M r0;
        AnonymousClass1RL newsletterInfo = getNewsletterInfo();
        if (newsletterInfo != null) {
            String str = newsletterInfo.A0E;
            if (str == null || str.length() != 0) {
                if (newsletterInfo.A0J == null) {
                    r0 = AnonymousClass58M.NEEDS_ICON;
                } else {
                    r0 = AnonymousClass58M.PROFILE_COMPLETE;
                }
            } else if (newsletterInfo.A0J == null) {
                r0 = AnonymousClass58M.EMPTY;
            } else {
                r0 = AnonymousClass58M.NEEDS_DESCRIPTION;
            }
            this.A02 = r0;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A07) {
            getContactObservers().A07(this.A0C);
        }
    }

    private final int getLayoutRes() {
        return R.layout.f8nameremoved;
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
