package com.whatsapp.community;

import X.AnonymousClass0x9;
import X.AnonymousClass3ZH;
import X.AnonymousClass4PN;
import X.AnonymousClass5UX;
import X.AnonymousClass651;
import X.C105365Uq;
import X.C112735kD;
import X.C18270x1;
import X.C18290x4;
import X.C620733j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class CommunityStackView extends AnonymousClass4PN implements AnonymousClass651 {
    public WaImageView A00;
    public AnonymousClass5UX A01;
    public C620733j A02;

    public View getTransitionView() {
        return this.A00;
    }

    public void setParentGroupProfilePhoto(AnonymousClass3ZH r5, C105365Uq r6) {
        r6.A05(this.A00, new C112735kD(this.A01, C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved)), r5, false);
    }

    public CommunityStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A00 = AnonymousClass0x9.A0L(this, R.id.parent_group_profile_photo);
        C18270x1.A0d(context, AnonymousClass0x9.A0E(this, R.id.community_stack_pile_bottom_crescents), this.A02, R.drawable.vec_community_avatar_stacked_frame);
    }

    public CommunityStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommunityStackView(Context context) {
        this(context, (AttributeSet) null);
    }
}
