package com.whatsapp.gallery.views;

import X.AnonymousClass4GP;
import X.AnonymousClass4L0;
import X.AnonymousClass67T;
import X.AnonymousClass6FN;
import X.C162457s7;
import X.C175728Zm;
import X.C18290x4;
import X.C18300x5;
import X.C378924l;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class GalleryPartialPermissionBanner extends AnonymousClass6FN {
    public WaTextView A00;
    public AnonymousClass4GP A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPartialPermissionBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        Object systemService = context.getSystemService("layout_inflater");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.f8nameremoved, this, true);
        this.A00 = C86604Kt.A0O(inflate, R.id.bannerTextView);
        String A0l = C18290x4.A0l(context, R.string.f11nameremoved);
        String A0e = C18300x5.A0e(context, A0l, new Object[1], 0, R.string.f11nameremoved);
        int A0G = C175728Zm.A0G(A0e, A0l, 0, false);
        AnonymousClass67T r3 = new AnonymousClass67T(inflate, 0, this);
        SpannableString A0A = AnonymousClass4L0.A0A(A0e);
        A0A.setSpan(r3, A0G, C86664Kz.A0L(A0l, A0G), 33);
        WaTextView waTextView = this.A00;
        waTextView.setText(A0A);
        waTextView.setContentDescription(A0A.toString());
        C86654Ky.A1E(waTextView);
    }

    public final AnonymousClass4GP getManageActionCallback() {
        return this.A01;
    }

    public final void setManageActionCallback(AnonymousClass4GP r1) {
        this.A01 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryPartialPermissionBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ GalleryPartialPermissionBanner(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryPartialPermissionBanner(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
