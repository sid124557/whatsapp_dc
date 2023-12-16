package com.whatsapp.calling.avatar.view;

import X.AnonymousClass4L0;
import X.C1460578k;
import X.C162457s7;
import X.C378924l;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class FLMConsentBulletRow extends ConstraintLayout {
    public final TextEmojiLabel A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FLMConsentBulletRow(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }

    public final void setTitle(int i) {
        this.A00.setText(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FLMConsentBulletRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        int A01 = AnonymousClass4L0.A01(context.getResources(), R.dimen.f6nameremoved);
        setPadding(0, A01, 0, A01);
        View.inflate(context, R.layout.f8nameremoved, this);
        TextEmojiLabel A0M = C86614Ku.A0M(this, R.id.bullet_title);
        this.A00 = A0M;
        ImageView A0J = C86604Kt.A0J(this, R.id.bullet_icon);
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1460578k.A00);
            A0J.setImageResource(A0X.getResourceId(0, 0));
            int resourceId = A0X.getResourceId(1, 0);
            if (resourceId != 0) {
                A0M.setText(resourceId);
            }
            A0X.recycle();
        }
    }

    public /* synthetic */ FLMConsentBulletRow(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }
}
