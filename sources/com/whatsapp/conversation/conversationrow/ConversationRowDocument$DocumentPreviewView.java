package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.C116855qy;
import X.C86664Kz;
import X.C93964pd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class ConversationRowDocument$DocumentPreviewView extends AppCompatImageView implements AnonymousClass4GJ {
    public C93964pd A00;
    public C116855qy A01;
    public boolean A02;

    public final void A00() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.A00 = new C93964pd(AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved));
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.A00.A06(bitmap.getWidth(), bitmap.getHeight());
        super.setImageBitmap(bitmap);
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C93964pd r0 = this.A00;
        ImageView.ScaleType scaleType = getScaleType();
        RectF A03 = r0.A03(i3, i4);
        Matrix matrix = null;
        if (A03 != null) {
            RectF A0b = C86664Kz.A0b((float) i3, (float) i4);
            if (scaleType == ImageView.ScaleType.MATRIX) {
                matrix = AnonymousClass002.A05();
                matrix.setRectToRect(A03, A0b, Matrix.ScaleToFit.FILL);
            } else {
                matrix = C93964pd.A00;
            }
        }
        setImageMatrix(matrix);
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00();
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ConversationRowDocument$DocumentPreviewView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00();
    }
}
