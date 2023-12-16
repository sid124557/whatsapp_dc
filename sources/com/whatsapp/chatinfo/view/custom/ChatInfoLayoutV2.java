package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass0Y8;
import X.AnonymousClass0x9;
import X.AnonymousClass5OF;
import X.AnonymousClass5UX;
import X.AnonymousClass5Yj;
import X.AnonymousClass6BG;
import X.C06560Yg;
import X.C107385bE;
import X.C107405bG;
import X.C111095hX;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C91484k4;
import X.C91494k9;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public class ChatInfoLayoutV2 extends C91494k9 {
    public float A00;
    public int A01 = 0;
    public int A02 = 0;
    public ImageView A03;
    public ImageView A04;
    public CollapsingProfilePhotoView A05;
    public AnonymousClass5UX A06;
    public AnonymousClass5OF A07;
    public boolean A08 = true;

    public final void A0G() {
        FrameLayout.LayoutParams A0r = C86664Kz.A0r(this.A0H);
        int i = 80;
        if (getWidth() >= getHeight()) {
            i = 17;
        }
        A0r.gravity = i;
        this.A0H.setLayoutParams(A0r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H() {
        /*
            r5 = this;
            X.5OF r4 = r5.A07
            com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView r3 = r5.A05
            boolean r0 = r5.A08
            r2 = 1
            if (r0 == 0) goto L_0x0014
            android.widget.ImageView r0 = r5.A03
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r3.setHaloEnabled(r0)
            if (r4 == 0) goto L_0x0038
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x0038
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0038
            android.widget.ImageView r1 = r5.A04
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            r1.setStatusIndicatorEnabled(r2)
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x0035
            X.593 r0 = X.AnonymousClass593.UNSEEN
        L_0x0031:
            X.AnonymousClass576.A00(r1, r0)
        L_0x0034:
            return
        L_0x0035:
            X.593 r0 = X.AnonymousClass593.SEEN
            goto L_0x0031
        L_0x0038:
            android.widget.ImageView r1 = r5.A04
            boolean r0 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x0034
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            r0 = 0
            r1.setStatusIndicatorEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2.A0H():void");
    }

    public void setStatusData(AnonymousClass5OF r1) {
        this.A07 = r1;
        A0H();
    }

    public ChatInfoLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private ImageView getProfilePhotoImage() {
        CollapsingProfilePhotoView collapsingProfilePhotoView = (CollapsingProfilePhotoView) C06560Yg.A02(this, R.id.collapsing_profile_photo_view);
        this.A05 = collapsingProfilePhotoView;
        WDSProfilePhoto wDSProfilePhoto = collapsingProfilePhotoView.A09;
        collapsingProfilePhotoView.A00 = (float) (this.A07 - (this.A01 * 2));
        collapsingProfilePhotoView.A01(this.A04, this.A03);
        return wDSProfilePhoto;
    }

    public int A04(int i) {
        return C86654Ky.A02(getResources(), R.dimen.f6nameremoved, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
    }

    public void A05() {
        super.A05();
        this.A0Q.setVisibility(0);
        A0G();
    }

    public void A06() {
        super.A06();
        this.A01 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A02 = C86634Kw.A0E(this).orientation;
        this.A03 = AnonymousClass0x9.A0E(this, R.id.picture);
        this.A04 = getProfilePhotoImage();
    }

    public void A0B(int i, int i2) {
        super.A0B(i, i2);
        CollapsingProfilePhotoView collapsingProfilePhotoView = this.A05;
        collapsingProfilePhotoView.A00 = (float) (this.A07 - (this.A01 * 2));
        collapsingProfilePhotoView.A01(this.A04, this.A03);
    }

    public void A0F() {
        int i;
        if (getContext() instanceof C91484k4) {
            C91484k4 r3 = (C91484k4) C111095hX.A03(getContext(), C91484k4.class);
            View view = r3.A01;
            if (view != null && view.getVisibility() == 0) {
                i = AnonymousClass0Y8.A04(r3, r3.A0H.getBackgroundColorRes());
            } else if (((int) (this.A00 * 255.0f)) > 0) {
                i = this.A05;
            } else if (C107385bE.A02()) {
                C107405bG.A05(r3);
                return;
            } else {
                C107405bG.A07(r3, AnonymousClass5Yj.A02(r3, R.attr.f3nameremoved, R.color.f5nameremoved));
                return;
            }
            r3.getWindow().setStatusBarColor(i);
            if (Color.alpha(i) == 255) {
                C107405bG.A0C(r3.getWindow(), AnonymousClass5Yj.A0D(i));
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.A02;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.A02 = i2;
            CollapsingProfilePhotoView collapsingProfilePhotoView = this.A05;
            AnonymousClass6BG.A00(collapsingProfilePhotoView.A09.getViewTreeObserver(), collapsingProfilePhotoView, 9);
            this.A08 = true;
            A0H();
        }
        A09();
    }

    public void setOnPhotoClickListener(View.OnClickListener onClickListener) {
        this.A0A = onClickListener;
    }

    public void setRadius(float f) {
        this.A00 = f;
    }

    public int getToolbarColorResId() {
        return R.color.f5nameremoved;
    }

    public ChatInfoLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatInfoLayoutV2(Context context) {
        super(context);
    }
}
