package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C86664Kz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class ConversationRowImageAndVideoAlbum$AlbumGridFrame extends FrameLayout implements AnonymousClass4GJ {
    public int A00;
    public C116855qy A01;
    public boolean A02;

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public ConversationRowImageAndVideoAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        A01(context);
    }

    public final void A01(Context context) {
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int A05 = C86664Kz.A05((size - this.A00) / 2);
        int i3 = 0;
        do {
            getChildAt(i3).measure(A05, A05);
            i3++;
        } while (i3 < 4);
        setMeasuredDimension(size, size);
    }

    public ConversationRowImageAndVideoAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(context);
    }

    public ConversationRowImageAndVideoAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        A01(context);
    }

    public ConversationRowImageAndVideoAlbum$AlbumGridFrame(Context context) {
        super(context);
        A00();
        A01(context);
    }

    public ConversationRowImageAndVideoAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
