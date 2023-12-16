package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass6BG;
import X.C06560Yg;
import X.C107295b4;
import X.C111685iW;
import X.C116855qy;
import X.C620733j;
import X.C86634Kw;
import X.C86654Ky;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public class CollapsingProfilePhotoView extends FrameLayout implements AnonymousClass4GJ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ImageView A07;
    public C620733j A08;
    public WDSProfilePhoto A09;
    public C116855qy A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;

    public void A01(int i, int i2) {
        if (i != -1 && i2 != -1) {
            this.A06 = i;
            this.A01 = i2;
            if (this.A02 != 0) {
                int i3 = (i - i2) / 2;
                if (!C620733j.A04(this.A08)) {
                    i = (this.A02 - i2) - ((int) this.A00);
                }
                this.A04 = i - i3;
            }
        }
    }

    public void A00() {
        if (!this.A0D) {
            this.A0D = true;
            this.A08 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public WDSProfilePhoto getProfileImage() {
        return this.A09;
    }

    public void setAnimationValue(float f) {
        float f2;
        float f3;
        if (!this.A0B) {
            this.A0B = AnonymousClass001.A1W((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
        boolean A042 = C620733j.A04(this.A08);
        int i = this.A04;
        if (i != -1) {
            float f4 = this.A00;
            if (f4 != -1.0f) {
                float A043 = 1.0f - ((1.0f - AnonymousClass001.A04(this.A09, f4)) * f);
                float A002 = (AnonymousClass4L0.A00(this.A09) - this.A00) / 2.0f;
                if (A042) {
                    f2 = -(((float) (this.A05 - this.A04)) + A002);
                } else {
                    f2 = ((float) (this.A04 - this.A05)) - A002;
                }
                this.A09.setTranslationX(f2 * f);
                this.A09.setScaleX(A043);
                this.A09.setScaleY(A043);
                int width = this.A07.getWidth();
                if (this.A0C && width > 0) {
                    float f5 = this.A00;
                    float f6 = (float) width;
                    float f7 = 1.0f - ((1.0f - (f5 / f6)) * f);
                    float f8 = (f6 - f5) / 2.0f;
                    if (A042) {
                        f3 = -(((float) (this.A03 - this.A04)) + f8);
                    } else {
                        f3 = ((float) (this.A04 - this.A03)) - f8;
                    }
                    this.A07.setTranslationX(f3 * f);
                    this.A07.setScaleX(f7);
                    this.A07.setScaleY(f7);
                    return;
                }
                return;
            }
        }
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1P(A0M, i, 0);
        AnonymousClass001.A1P(A0M, this.A00, 1);
        Log.d(String.format("Required values not set: profilePhotoCollapsedX = %s , targetDimen = %s", A0M));
    }

    public void setHaloEnabled(boolean z) {
        if (this.A0C != z) {
            this.A0C = z;
            this.A07.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        }
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        boolean A1V = C86654Ky.A1V(this);
        this.A0E = C86634Kw.A07(this);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = A1V;
        A02(context);
    }

    public final void A02(Context context) {
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A09 = (WDSProfilePhoto) C06560Yg.A02(this, R.id.wds_profile_picture);
        this.A07 = AnonymousClass0x9.A0E(this, R.id.profile_photo_halo);
        AnonymousClass6BG.A00(this.A09.getViewTreeObserver(), this, 9);
        C107295b4.A03(this.A09, R.string.f11nameremoved);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A0B) {
            int left = this.A09.getLeft();
            this.A05 = left;
            this.A03 = left;
        }
    }

    public void setCollapsedProfilePhotoDimen(float f) {
        this.A00 = f;
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        boolean A1V = C86654Ky.A1V(this);
        this.A0E = C86634Kw.A07(this);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = A1V;
        A02(context);
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public CollapsingProfilePhotoView(Context context) {
        super(context);
        A00();
        boolean A1V = C86654Ky.A1V(this);
        this.A0E = C86634Kw.A07(this);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = A1V;
        A02(context);
    }
}
