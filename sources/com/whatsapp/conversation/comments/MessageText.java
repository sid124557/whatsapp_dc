package com.whatsapp.conversation.comments;

import X.AnonymousClass2z0;
import X.AnonymousClass5NQ;
import X.AnonymousClass5OL;
import X.AnonymousClass5ST;
import X.AnonymousClass5UY;
import X.AnonymousClass5Y0;
import X.AnonymousClass761;
import X.AnonymousClass7IU;
import X.AnonymousClass8GU;
import X.C103565Nm;
import X.C105815Wn;
import X.C106195Xz;
import X.C106625Zs;
import X.C107295b4;
import X.C107315b6;
import X.C112945kd;
import X.C162457s7;
import X.C18270x1;
import X.C378924l;
import X.C56572sD;
import X.C56972sr;
import X.C56982ss;
import X.C58422vE;
import X.C60152y5;
import X.C620633i;
import X.C624134x;
import X.C64773Ex;
import X.C66473Lo;
import X.C66493Lq;
import X.C86604Kt;
import X.C86624Kv;
import X.C86644Kx;
import X.C86664Kz;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;

public final class MessageText extends TextEmojiLabel {
    public int A00;
    public C56972sr A01;
    public C64773Ex A02;
    public AnonymousClass5ST A03;
    public AnonymousClass5OL A04;
    public AnonymousClass5NQ A05;
    public C105815Wn A06;
    public C103565Nm A07;
    public C56982ss A08;
    public C66473Lo A09;
    public C66493Lq A0A;
    public C624134x A0B;
    public C56572sD A0C;
    public C106625Zs A0D;
    public AnonymousClass5UY A0E;
    public boolean A0F;

    public final void setChatsCache(C56982ss r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public final void setContactManager(C64773Ex r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setConversationContactManager(C66473Lo r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setConversationFont(AnonymousClass5ST r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setGroupChatManager(C66493Lq r2) {
        C162457s7.A0J(r2, 0);
        this.A0A = r2;
    }

    public final void setGroupLinkHelper(AnonymousClass5NQ r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setLinkifierUtils(C106625Zs r2) {
        C162457s7.A0J(r2, 0);
        this.A0D = r2;
    }

    public final void setMeManager(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setPhoneLinkHelper(C105815Wn r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setSpamManager(C56572sD r2) {
        C162457s7.A0J(r2, 0);
        this.A0C = r2;
    }

    public final void setSuspiciousLinkHelper(C103565Nm r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void A0L(AnonymousClass5OL r19, C624134x r20, AnonymousClass5UY r21) {
        AnonymousClass2z0 r1;
        AnonymousClass5OL r2;
        C624134x r0 = r20;
        AnonymousClass2z0 r22 = r0.A1J;
        C624134x r12 = this.A0B;
        if (r12 != null) {
            r1 = r12.A1J;
        } else {
            r1 = null;
        }
        if (!C162457s7.A0P(r22, r1)) {
            this.A00 = 1;
            C86644Kx.A1P(this.A0E);
        }
        this.A04 = r19;
        this.A0E = r21;
        this.A0B = r0;
        String A13 = r0.A13();
        if (A13 == null) {
            A13 = "";
        }
        AnonymousClass5Y0 r9 = this.A0B;
        C620633i r8 = this.A09;
        getWhatsAppLocale();
        C60152y5 r11 = this.A0C;
        AnonymousClass761 r5 = new AnonymousClass761(r0, 2, this);
        AnonymousClass8GU r7 = new AnonymousClass8GU(this.A00, 768);
        AnonymousClass5ST conversationFont = getConversationFont();
        AnonymousClass7IU A002 = C107315b6.A00((Context) null, r5, this, r7, r8, r9, (C106195Xz) null, r11, (C624134x) null, A13, r0.A1I, conversationFont.A03(getResources(), conversationFont.A02), true, getAbProps().A0Y(C58422vE.A01, 4093));
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) A002.A00;
        Boolean bool = (Boolean) A002.A01;
        C162457s7.A0H(bool);
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            C107295b4.A07(this, this.A09, getAbProps());
            C86604Kt.A1J(this);
        }
        C86664Kz.A1T(this, spannableStringBuilder);
        C162457s7.A0H(spannableStringBuilder);
        C64773Ex contactManager = getContactManager();
        C66473Lo conversationContactManager = getConversationContactManager();
        C66493Lq groupChatManager = getGroupChatManager();
        C56972sr meManager = getMeManager();
        C56572sD spamManager = getSpamManager();
        if (C107315b6.A0A(meManager, contactManager, getChatsCache(), conversationContactManager, getAbProps(), groupChatManager, r0, spamManager) && (r2 = this.A04) != null) {
            r2.A00(this, new C112945kd(this, r0, booleanValue), r0, spannableStringBuilder);
        }
    }

    public final AnonymousClass5OL getAsyncLinkifier() {
        return this.A04;
    }

    public final C56982ss getChatsCache() {
        C56982ss r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatsCache");
    }

    public final C64773Ex getContactManager() {
        C64773Ex r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactManager");
    }

    public final C66473Lo getConversationContactManager() {
        C66473Lo r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("conversationContactManager");
    }

    public final AnonymousClass5ST getConversationFont() {
        AnonymousClass5ST r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("conversationFont");
    }

    public final C624134x getFMessage() {
        return this.A0B;
    }

    public final C66493Lq getGroupChatManager() {
        C66493Lq r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupChatManager");
    }

    public final AnonymousClass5NQ getGroupLinkHelper() {
        AnonymousClass5NQ r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupLinkHelper");
    }

    public final C106625Zs getLinkifierUtils() {
        C106625Zs r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifierUtils");
    }

    public final C56972sr getMeManager() {
        C56972sr r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final int getPageLimit() {
        return this.A00;
    }

    public final C105815Wn getPhoneLinkHelper() {
        C105815Wn r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("phoneLinkHelper");
    }

    public final C56572sD getSpamManager() {
        C56572sD r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("spamManager");
    }

    public final C103565Nm getSuspiciousLinkHelper() {
        C103565Nm r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("suspiciousLinkHelper");
    }

    public final AnonymousClass5UY getSuspiciousLinkViewStub() {
        return this.A0E;
    }

    public MessageText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A08();
    }

    public final void setAsyncLinkifier(AnonymousClass5OL r1) {
        this.A04 = r1;
    }

    public final void setFMessage(C624134x r1) {
        this.A0B = r1;
    }

    public final void setPageLimit(int i) {
        this.A00 = i;
    }

    public final void setSuspiciousLinkViewStub(AnonymousClass5UY r1) {
        this.A0E = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A08();
        this.A00 = 1;
    }

    public /* synthetic */ MessageText(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }
}
