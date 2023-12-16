package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass3ZH;
import X.C105365Uq;
import X.C162457s7;
import X.C182228o4;
import X.C18270x1;
import X.C18310x6;
import X.C378924l;
import X.C59862xc;
import X.C626035t;
import X.C64333Db;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public final class GroupPhotoHeader extends WaImageView implements C182228o4 {
    public C59862xc A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPhotoHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A05();
    }

    public final void A07(AnonymousClass3ZH r4, C105365Uq r5) {
        C162457s7.A0J(r5, 0);
        r5.A02(this, new C626035t(this, 5), r4, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
    }

    public final void setPathDrawableHelper(C59862xc r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public void A05() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = (C59862xc) C64333Db.A02(this).APF.get();
        }
    }

    public final C59862xc getPathDrawableHelper() {
        C59862xc r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("pathDrawableHelper");
    }

    public LinearLayout.LayoutParams getHeaderLayoutParams() {
        return C18310x6.A0K(this);
    }

    public View getHeaderView() {
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupPhotoHeader(Context context, AttributeSet attributeSet, int i, int i2, C378924l r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupPhotoHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupPhotoHeader(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
