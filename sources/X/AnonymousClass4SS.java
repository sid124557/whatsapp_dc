package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.crop.CropImageView;

/* renamed from: X.4SS  reason: invalid class name */
public abstract class AnonymousClass4SS extends AppCompatImageView implements AnonymousClass4GJ {
    public C116855qy A00;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4SS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CropImageView cropImageView = (CropImageView) this;
        if (!cropImageView.A04) {
            cropImageView.A04 = true;
            cropImageView.generatedComponent();
        }
    }
}
