package com.whatsapp.community;

import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass3ZH;
import X.AnonymousClass4PO;
import X.AnonymousClass5UX;
import X.AnonymousClass651;
import X.AnonymousClass6A7;
import X.AnonymousClass922;
import X.C105365Uq;
import X.C112745kE;
import X.C56942so;
import X.C59862xc;
import X.C620733j;
import X.C70323aJ;
import X.C86624Kv;
import X.C86664Kz;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.Jid;

public class SubgroupWithParentView extends AnonymousClass4PO implements AnonymousClass651 {
    public int A00;
    public int A01;
    public WaImageView A02;
    public C56942so A03;
    public ThumbnailButton A04;
    public AnonymousClass5UX A05;
    public C620733j A06;
    public C59862xc A07;
    public AnonymousClass1VX A08;

    public final Drawable A00() {
        C59862xc r5 = this.A07;
        Context context = getContext();
        AnonymousClass922 r4 = new AnonymousClass922(1);
        return C59862xc.A00(context.getTheme(), context.getResources(), r4, r5.A00, R.drawable.vec_ic_avatar_community);
    }

    public View getTransitionView() {
        if (this.A00 == 3) {
            return this.A02;
        }
        return this.A04;
    }

    public void setSubgroupProfilePhoto(AnonymousClass3ZH r4, int i, C105365Uq r6) {
        this.A00 = i;
        r6.A05(this.A04, new C112745kE(this.A05, r4), r4, false);
        setBottomCommunityPhoto(r4, r6);
    }

    public void setSubgroupProfilePhotoBorderColor(int i) {
        this.A04.A03 = C86624Kv.A02(this, i);
    }

    public SubgroupWithParentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        this.A01 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A02 = AnonymousClass0x9.A0L(this, R.id.parent_group_image);
        this.A04 = C86664Kz.A16(this, R.id.subgroup_pile_front_profile_photo);
    }

    public final void setBottomCommunityPhoto(AnonymousClass3ZH r6, C105365Uq r7) {
        Jid A042 = AnonymousClass3ZH.A04(r6);
        if (A042 == null) {
            this.A02.setImageDrawable(A00());
            return;
        }
        C56942so r3 = this.A03;
        C70323aJ.A00(r3.A0N, r3, A042, new AnonymousClass6A7(r7, 0, this), 26);
    }

    public SubgroupWithParentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SubgroupWithParentView(Context context) {
        this(context, (AttributeSet) null);
    }
}
