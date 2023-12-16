package com.whatsapp.conversation.comments;

import X.AnonymousClass0x2;
import X.AnonymousClass5ZU;
import X.C162197rQ;
import X.C162457s7;
import X.C18270x1;
import X.C30961nV;
import X.C378924l;
import X.C56972sr;
import X.C624134x;
import X.C86624Kv;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class RevokedMessageText extends TextEmojiLabel {
    public C56972sr A00;
    public AnonymousClass5ZU A01;
    public boolean A02;

    public final void setMeManager(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setWaContactNames(AnonymousClass5ZU r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    private final void setAdminRevokeText(C624134x r6) {
        int i;
        C162457s7.A0K(r6, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageAdminRevoked");
        UserJid userJid = ((C30961nV) r6).A00;
        if (getMeManager().A0a(userJid)) {
            i = R.string.f11nameremoved;
        } else if (userJid == null) {
            i = R.string.f11nameremoved;
        } else {
            String A0W = getWaContactNames().A0W(C162197rQ.newArrayList((Object[]) new UserJid[]{userJid}), -1);
            C162457s7.A0D(A0W);
            A0K((List) null, AnonymousClass0x2.A0X(getContext(), A0W, 1, R.string.f11nameremoved));
            return;
        }
        setText(i);
    }

    private final void setSenderRevokeText(C624134x r3) {
        boolean z = r3.A1J.A02;
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        setText(i);
    }

    public final void A0L(C624134x r3) {
        if (r3.A1I == 64) {
            setAdminRevokeText(r3);
        } else {
            setSenderRevokeText(r3);
        }
    }

    public final C56972sr getMeManager() {
        C56972sr r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final AnonymousClass5ZU getWaContactNames() {
        AnonymousClass5ZU r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContactNames");
    }

    public RevokedMessageText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A08();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RevokedMessageText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A08();
    }

    public /* synthetic */ RevokedMessageText(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }
}
