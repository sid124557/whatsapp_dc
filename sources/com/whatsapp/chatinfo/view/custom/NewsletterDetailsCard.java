package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass1RL;
import X.AnonymousClass31A;
import X.AnonymousClass3ZH;
import X.AnonymousClass5YB;
import X.C103985Pe;
import X.C106545Zk;
import X.C106905aM;
import X.C107295b4;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C378924l;
import X.C56982ss;
import X.C86624Kv;
import X.C86634Kw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.contact.view.custom.ContactDetailsActionIcon;
import com.whatsapp.wds.components.actiontile.WDSActionTile;

public final class NewsletterDetailsCard extends ContactDetailsCard {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public AnonymousClass5YB A04;
    public C56982ss A05;
    public AnonymousClass3ZH A06;
    public C103985Pe A07;
    public boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterDetailsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A03();
        this.A0k = false;
        this.A0i = false;
        this.A0j = false;
    }

    public final void setChatsCache(C56982ss r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public void setContact(AnonymousClass3ZH r4) {
        C162457s7.A0J(r4, 0);
        this.A06 = r4;
        AnonymousClass1RL newsletter = getNewsletter();
        AnonymousClass5YB r1 = this.A04;
        if (r1 == null) {
            throw C18270x1.A0S("titleViewController");
        }
        r1.A08(r4);
        AnonymousClass5YB r12 = this.A04;
        if (r12 == null) {
            throw C18270x1.A0S("titleViewController");
        }
        r12.A06(C18310x6.A02(newsletter.A0L() ? 1 : 0));
    }

    public final void setFollowUnfollowButton(View.OnClickListener onClickListener) {
        C162457s7.A0J(onClickListener, 0);
        View view = this.A01;
        if (view == null) {
            throw C18270x1.A0S("followUnfollowButton");
        }
        view.setOnClickListener(onClickListener);
    }

    public final void setForwardClickListener(View.OnClickListener onClickListener) {
        C162457s7.A0J(onClickListener, 0);
        View view = this.A02;
        if (view == null) {
            throw C18270x1.A0S("forwardButton");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.A02;
        if (view2 == null) {
            throw C18270x1.A0S("forwardButton");
        }
        C107295b4.A02(view2);
    }

    public final void setNewsletterSuspensionUtils(C103985Pe r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setShareClickListener(View.OnClickListener onClickListener) {
        C162457s7.A0J(onClickListener, 0);
        View view = this.A03;
        if (view == null) {
            throw C18270x1.A0S("shareButton");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.A03;
        if (view2 == null) {
            throw C18270x1.A0S("shareButton");
        }
        C107295b4.A02(view2);
    }

    public final void setupActionButtons(AnonymousClass1RL r4) {
        View view;
        C162457s7.A0J(r4, 0);
        int i = 8;
        if (r4.A0K || getNewsletterSuspensionUtils().A00(r4)) {
            view = this.A00;
            if (view == null) {
                throw C18270x1.A0S("actionsSection");
            }
        } else {
            view = this.A01;
            if (view == null) {
                throw C18270x1.A0S("followUnfollowButton");
            } else if (!r4.A0K()) {
                i = 0;
            }
        }
        view.setVisibility(i);
    }

    public final void A06() {
        View view = this.A01;
        if (view == null) {
            throw C18270x1.A0S("followUnfollowButton");
        }
        view.setVisibility(0);
        C18300x5.A13(view.getContext(), view, R.string.f11nameremoved);
        A08(view, R.drawable.ic_check, R.string.f11nameremoved);
        C107295b4.A02(view);
        C107295b4.A03(view, R.string.f11nameremoved);
    }

    public final void A07() {
        View view = this.A01;
        if (view == null) {
            throw C18270x1.A0S("followUnfollowButton");
        }
        view.setVisibility(0);
        C18300x5.A13(view.getContext(), view, R.string.f11nameremoved);
        A08(view, R.drawable.ic_action_add, R.string.f11nameremoved);
        C107295b4.A02(view);
        C107295b4.A03(view, R.string.f11nameremoved);
    }

    public final void A08(View view, int i, int i2) {
        ContactDetailsActionIcon contactDetailsActionIcon;
        WDSActionTile wDSActionTile;
        if (C106545Zk.A01(this.A0T)) {
            if ((view instanceof WDSActionTile) && (wDSActionTile = (WDSActionTile) view) != null) {
                wDSActionTile.setIcon(i);
                wDSActionTile.setText(i2);
            }
        } else if ((view instanceof ContactDetailsActionIcon) && (contactDetailsActionIcon = (ContactDetailsActionIcon) view) != null) {
            contactDetailsActionIcon.A02.setImageResource(i);
            contactDetailsActionIcon.setTitle(i2);
        }
    }

    public final C56982ss getChatsCache() {
        C56982ss r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatsCache");
    }

    public final C103985Pe getNewsletterSuspensionUtils() {
        C103985Pe r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("newsletterSuspensionUtils");
    }

    private final AnonymousClass1RL getNewsletter() {
        C56982ss chatsCache = getChatsCache();
        AnonymousClass3ZH r0 = this.A06;
        if (r0 == null) {
            throw C18270x1.A0S("contact");
        }
        AnonymousClass31A A002 = C56982ss.A00(chatsCache, r0.A0H);
        C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
        return (AnonymousClass1RL) A002;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A01 = C18280x3.A0E(this, R.id.action_follow);
        this.A02 = C18280x3.A0E(this, R.id.action_forward);
        this.A03 = C18280x3.A0E(this, R.id.action_share);
        this.A00 = C18280x3.A0E(this, R.id.newsletter_details_actions);
        AnonymousClass5YB Azt = this.A0L.Azt(getContext(), this.A0K);
        this.A04 = Azt;
        C106905aM.A04(Azt.A02);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewsletterDetailsCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ NewsletterDetailsCard(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewsletterDetailsCard(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
