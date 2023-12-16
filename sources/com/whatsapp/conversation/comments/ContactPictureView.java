package com.whatsapp.conversation.comments;

import X.AnonymousClass20D;
import X.AnonymousClass2C4;
import X.AnonymousClass349;
import X.AnonymousClass46A;
import X.AnonymousClass46Q;
import X.AnonymousClass5UX;
import X.C105365Uq;
import X.C162457s7;
import X.C18270x1;
import X.C378924l;
import X.C56972sr;
import X.C615931l;
import X.C616131n;
import X.C624134x;
import X.C64333Db;
import X.C64773Ex;
import X.C73853gB;
import X.C84814Du;
import X.C85494Gl;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

public final class ContactPictureView extends ThumbnailButton {
    public C56972sr A00;
    public AnonymousClass5UX A01;
    public C64773Ex A02;
    public C73853gB A03;
    public C73853gB A04;
    public boolean A05;

    public final void setContactAvatars(AnonymousClass5UX r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setContactManager(C64773Ex r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setIoDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setMainDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setMeManager(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public void A05() {
        if (!this.A05) {
            this.A05 = true;
            C64333Db A022 = C64333Db.A02(this);
            this.A00 = C64333Db.A06(A022);
            this.A01 = (AnonymousClass5UX) A022.A6K.get();
            this.A02 = C64333Db.A26(A022);
            AnonymousClass46Q r0 = AnonymousClass2C4.A01;
            C615931l.A00(r0);
            this.A03 = r0;
            AnonymousClass46A r02 = AnonymousClass2C4.A03;
            C615931l.A00(r02);
            this.A04 = r02;
        }
    }

    public final AnonymousClass5UX getContactAvatars() {
        AnonymousClass5UX r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactAvatars");
    }

    public final C64773Ex getContactManager() {
        C64773Ex r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactManager");
    }

    public final C73853gB getIoDispatcher() {
        C73853gB r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("ioDispatcher");
    }

    public final C73853gB getMainDispatcher() {
        C73853gB r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mainDispatcher");
    }

    public final C56972sr getMeManager() {
        C56972sr r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public ContactPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A05();
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void A08(C105365Uq r5, C624134x r6) {
        getContactAvatars().A06(this, R.drawable.avatar_contact);
        C616131n.A02((C85494Gl) null, new ContactPictureView$bind$1(r5, this, r6, (C84814Du) null), AnonymousClass349.A02(getIoDispatcher()), (AnonymousClass20D) null, 3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A05();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactPictureView(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
