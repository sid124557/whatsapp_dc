package com.whatsapp.group;

import X.AnonymousClass0Y8;
import X.C162457s7;
import X.C378924l;
import X.C86624Kv;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class CustomGroupMembershipApprovalRequestRejectWDSButton extends WDSButton {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomGroupMembershipApprovalRequestRejectWDSButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
    }

    public void setupBackgroundStyle(ColorStateList colorStateList) {
        C162457s7.A0J(colorStateList, 0);
        ColorStateList A07 = AnonymousClass0Y8.A07(getContext(), R.color.f5nameremoved);
        if (A07 != null) {
            colorStateList = A07;
        }
        super.setupBackgroundStyle(colorStateList);
    }

    public void setupContentStyle(ColorStateList colorStateList) {
        C162457s7.A0J(colorStateList, 0);
        ColorStateList A07 = AnonymousClass0Y8.A07(getContext(), R.color.f5nameremoved);
        if (A07 != null) {
            colorStateList = A07;
        }
        super.setupContentStyle(colorStateList);
    }

    public /* synthetic */ CustomGroupMembershipApprovalRequestRejectWDSButton(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomGroupMembershipApprovalRequestRejectWDSButton(Context context) {
        super(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
