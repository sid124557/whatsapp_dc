package com.whatsapp.conversation.comments;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass33p;
import X.AnonymousClass5ZU;
import X.C106625Zs;
import X.C106715a2;
import X.C111095hX;
import X.C117085rM;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C378924l;
import X.C54182oJ;
import X.C56972sr;
import X.C66433Lk;
import X.C69263Wi;
import X.C85244Fm;
import X.C86604Kt;
import X.C86624Kv;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class DecryptionFailureMessageView extends TextEmojiLabel {
    public C111095hX A00;
    public C69263Wi A01;
    public C85244Fm A02;
    public C56972sr A03;
    public AnonymousClass5ZU A04;
    public AnonymousClass33p A05;
    public C66433Lk A06;
    public C54182oJ A07;
    public C106715a2 A08;
    public boolean A09;

    public final void setActivityUtils(C111095hX r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setFaqLinkFactory(C66433Lk r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setLinkLauncher(C85244Fm r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setLinkifier(C106715a2 r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public final void setMeManager(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setUiWamEventHelper(C54182oJ r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setWaContactNames(AnonymousClass5ZU r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setWaSharedPreferences(AnonymousClass33p r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final C111095hX getActivityUtils() {
        C111095hX r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("activityUtils");
    }

    public final C66433Lk getFaqLinkFactory() {
        C66433Lk r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("faqLinkFactory");
    }

    public final C69263Wi getGlobalUI() {
        C69263Wi r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C85244Fm getLinkLauncher() {
        C85244Fm r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkLauncher");
    }

    public final C106715a2 getLinkifier() {
        C106715a2 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifier");
    }

    public final C56972sr getMeManager() {
        C56972sr r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final C54182oJ getUiWamEventHelper() {
        C54182oJ r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("uiWamEventHelper");
    }

    public final AnonymousClass5ZU getWaContactNames() {
        AnonymousClass5ZU r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContactNames");
    }

    public final AnonymousClass33p getWaSharedPreferences() {
        AnonymousClass33p r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waSharedPreferences");
    }

    public DecryptionFailureMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A08();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecryptionFailureMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A08();
        C86604Kt.A1J(this);
        AnonymousClass0x2.A14(getAbProps(), this);
        C18270x1.A0q(this, getAbProps());
        AnonymousClass0x2.A12(this, this.A09);
        getLinkifier();
        setText(C106625Zs.A01(context, C117085rM.A00(this, 25), AnonymousClass002.A0F(context, "learn-more", new Object[1], 0, R.string.f11nameremoved), "learn-more", C18290x4.A00(context)));
    }

    public /* synthetic */ DecryptionFailureMessageView(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }
}
