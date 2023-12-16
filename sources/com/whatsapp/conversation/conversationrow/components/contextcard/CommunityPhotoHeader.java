package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.C162457s7;
import X.C182228o4;
import X.C18270x1;
import X.C18310x6;
import X.C378924l;
import X.C59862xc;
import X.C64333Db;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;

public final class CommunityPhotoHeader extends WaImageView implements C182228o4 {
    public C59862xc A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityPhotoHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A05();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
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
    public /* synthetic */ CommunityPhotoHeader(Context context, AttributeSet attributeSet, int i, int i2, C378924l r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommunityPhotoHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommunityPhotoHeader(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
