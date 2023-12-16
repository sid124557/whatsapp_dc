package com.whatsapp.conversation.comments;

import X.AnonymousClass4FS;
import X.AnonymousClass5ST;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.C162457s7;
import X.C18270x1;
import X.C378924l;
import X.C56892sj;
import X.C56972sr;
import X.C56982ss;
import X.C64773Ex;
import X.C69263Wi;
import X.C73853gB;
import X.C86624Kv;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;

public final class ContactName extends TextEmojiLabel {
    public C69263Wi A00;
    public C56972sr A01;
    public AnonymousClass64J A02;
    public C64773Ex A03;
    public AnonymousClass5ZU A04;
    public AnonymousClass5ST A05;
    public C56982ss A06;
    public C56892sj A07;
    public AnonymousClass4FS A08;
    public C73853gB A09;
    public boolean A0A;

    public final void setChatsCache(C56982ss r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setContactManager(C64773Ex r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setConversationFont(AnonymousClass5ST r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setGlobalUI(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setGroupParticipantsManager(C56892sj r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setMainDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setMeManager(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setTextEmojiLabelViewControllerFactory(AnonymousClass64J r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setWaContactNames(AnonymousClass5ZU r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setWaWorkers(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final C56982ss getChatsCache() {
        C56982ss r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatsCache");
    }

    public final C64773Ex getContactManager() {
        C64773Ex r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactManager");
    }

    public final AnonymousClass5ST getConversationFont() {
        AnonymousClass5ST r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("conversationFont");
    }

    public final C69263Wi getGlobalUI() {
        C69263Wi r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C56892sj getGroupParticipantsManager() {
        C56892sj r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupParticipantsManager");
    }

    public final C73853gB getMainDispatcher() {
        C73853gB r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mainDispatcher");
    }

    public final C56972sr getMeManager() {
        C56972sr r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final AnonymousClass64J getTextEmojiLabelViewControllerFactory() {
        AnonymousClass64J r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("textEmojiLabelViewControllerFactory");
    }

    public final AnonymousClass5ZU getWaContactNames() {
        AnonymousClass5ZU r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContactNames");
    }

    public final AnonymousClass4FS getWaWorkers() {
        AnonymousClass4FS r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }

    public ContactName(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A08();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactName(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A08();
    }

    public /* synthetic */ ContactName(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }
}
