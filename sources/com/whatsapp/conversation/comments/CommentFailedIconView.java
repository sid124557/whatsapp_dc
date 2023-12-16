package com.whatsapp.conversation.comments;

import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.AnonymousClass5Ul;
import X.C162457s7;
import X.C18270x1;
import X.C378924l;
import X.C52552lf;
import X.C56612sH;
import X.C56962sq;
import X.C56972sr;
import X.C620333f;
import X.C621033m;
import X.C66543Lv;
import X.C69263Wi;
import X.C86624Kv;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;

public final class CommentFailedIconView extends WaImageView {
    public C69263Wi A00;
    public C56972sr A01;
    public AnonymousClass5Ul A02;
    public C621033m A03;
    public C56962sq A04;
    public C56612sH A05;
    public C66543Lv A06;
    public C620333f A07;
    public AnonymousClass1VX A08;
    public C52552lf A09;
    public AnonymousClass4FS A0A;
    public boolean A0B;

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public final void setBlockListManager(C56962sq r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setCoreMessageStore(C66543Lv r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setInFlightMessages(C52552lf r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setMeManager(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setMessageAddOnManager(C620333f r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setSendMedia(AnonymousClass5Ul r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setTime(C56612sH r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setUserActions(C621033m r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A0A = r2;
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C56962sq getBlockListManager() {
        C56962sq r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("blockListManager");
    }

    public final C66543Lv getCoreMessageStore() {
        C66543Lv r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("coreMessageStore");
    }

    public final C69263Wi getGlobalUI() {
        C69263Wi r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C52552lf getInFlightMessages() {
        C52552lf r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("inFlightMessages");
    }

    public final C56972sr getMeManager() {
        C56972sr r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final C620333f getMessageAddOnManager() {
        C620333f r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("messageAddOnManager");
    }

    public final AnonymousClass5Ul getSendMedia() {
        AnonymousClass5Ul r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("sendMedia");
    }

    public final C56612sH getTime() {
        C56612sH r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("time");
    }

    public final C621033m getUserActions() {
        C621033m r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("userActions");
    }

    public final AnonymousClass4FS getWaWorkers() {
        AnonymousClass4FS r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }

    public CommentFailedIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A05();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentFailedIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A05();
    }

    public /* synthetic */ CommentFailedIconView(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommentFailedIconView(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
