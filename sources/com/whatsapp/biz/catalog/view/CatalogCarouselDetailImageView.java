package com.whatsapp.biz.catalog.view;

import X.AnonymousClass0YY;
import X.AnonymousClass2JZ;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.C105145Tt;
import X.C109015dw;
import X.C116855qy;
import X.C146957Cg;
import X.C148087Gw;
import X.C152967aS;
import X.C620733j;
import X.C64333Db;
import X.C86644Kx;
import X.C86664Kz;
import X.C87804We;
import X.C88864av;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;

public class CatalogCarouselDetailImageView extends FrameLayout implements AnonymousClass4GJ {
    public RecyclerView A00;
    public C109015dw A01;
    public C105145Tt A02;
    public C152967aS A03;
    public CarouselScrollbarView A04;
    public C87804We A05;
    public C620733j A06;
    public UserJid A07;
    public AnonymousClass4FS A08;
    public C116855qy A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    /* access modifiers changed from: private */
    public C148087Gw getImageLoadContext() {
        UserJid userJid = this.A07;
        if (userJid != null) {
            return new C148087Gw(new C146957Cg(897460107), userJid);
        }
        return null;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A09;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0A) {
            this.A0A = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A08 = C64333Db.A8y(A002);
            this.A02 = C86644Kx.A0P(A002);
            this.A06 = C64333Db.A2t(A002);
        }
    }

    public final void setImageAndGradient(AnonymousClass2JZ r4, boolean z, ThumbnailButton thumbnailButton, Bitmap bitmap, View view) {
        GradientDrawable.Orientation orientation;
        int[] A1Z = C86664Kz.A1Z();
        A1Z[0] = r4.A01;
        A1Z[1] = r4.A00;
        if (z) {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        } else {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        }
        AnonymousClass0YY.A04(new GradientDrawable(orientation, A1Z), view);
        thumbnailButton.setImageBitmap(bitmap);
    }

    public CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CatalogCarouselDetailImageView(Context context) {
        this(context, (AttributeSet) null);
    }
}
