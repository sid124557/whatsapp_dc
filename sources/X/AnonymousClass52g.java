package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.whatsapp.info.views.ChatInfoMediaCardV2;

/* renamed from: X.52g  reason: invalid class name */
public abstract class AnonymousClass52g extends AnonymousClass52i {
    public boolean A00;

    public void A01() {
        if (this instanceof ChatInfoMediaCardV2) {
            ChatInfoMediaCardV2 chatInfoMediaCardV2 = (ChatInfoMediaCardV2) this;
            if (!chatInfoMediaCardV2.A00) {
                chatInfoMediaCardV2.A00 = true;
                chatInfoMediaCardV2.A0B = C88864av.A02((C111685iW) chatInfoMediaCardV2.generatedComponent());
            }
        } else if (this instanceof LinkedAccountsMediaCard) {
            LinkedAccountsMediaCard linkedAccountsMediaCard = (LinkedAccountsMediaCard) this;
            if (!linkedAccountsMediaCard.A07) {
                linkedAccountsMediaCard.A07 = true;
                C88864av r2 = (C88864av) ((C111685iW) linkedAccountsMediaCard.generatedComponent());
                C64333Db r1 = r2.A0K;
                linkedAccountsMediaCard.A0B = C64333Db.A2t(r1);
                linkedAccountsMediaCard.A01 = C64333Db.A00(r1);
                C107695bk r12 = r1.A00;
                linkedAccountsMediaCard.A04 = (C153127ai) r12.A6w.get();
                linkedAccountsMediaCard.A05 = (C989153s) r12.A6x.get();
                linkedAccountsMediaCard.A06 = (AnonymousClass65M) r2.A0I.A25.get();
            }
        } else if (!this.A00) {
            this.A00 = true;
            this.A0B = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public AnonymousClass52g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }
}
