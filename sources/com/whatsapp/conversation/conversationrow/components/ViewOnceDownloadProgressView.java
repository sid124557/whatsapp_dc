package com.whatsapp.conversation.conversationrow.components;

import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5UY;
import X.C107335b8;
import X.C116855qy;
import X.C18310x6;
import X.C56232re;
import X.C64333Db;
import X.C88864av;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class ViewOnceDownloadProgressView extends FrameLayout implements AnonymousClass4GJ {
    public AnonymousClass1VX A00;
    public C56232re A01;
    public C116855qy A02;
    public boolean A03;
    public final WaImageView A04;
    public final AnonymousClass5UY A05;

    public void A00(int i, int i2, int i3) {
        WaImageView waImageView = this.A04;
        Drawable drawable = null;
        if (i2 != -1) {
            drawable = C107335b8.A09(getResources(), C18310x6.A0G(getContext(), i2), i3);
        }
        waImageView.setBackgroundDrawable(drawable);
        waImageView.setImageDrawable(C107335b8.A09(getResources(), C18310x6.A0G(getContext(), i), i3));
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public ViewOnceDownloadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A03) {
            this.A03 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A00 = C64333Db.A4B(A002);
            this.A01 = (C56232re) A002.AUV.get();
        }
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A04 = AnonymousClass0x9.A0L(this, R.id.view_once_control_icon);
        AnonymousClass5UY A0M = AnonymousClass0x2.A0M(this, R.id.view_once_progressbar);
        this.A05 = A0M;
        AnonymousClass5UY.A02(A0M, this, 9);
    }

    public ViewOnceDownloadProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnceDownloadProgressView(Context context) {
        this(context, (AttributeSet) null);
    }
}
