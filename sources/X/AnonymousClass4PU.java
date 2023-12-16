package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.storage.StorageUsageMediaPreviewOverflowOverlayView;

/* renamed from: X.4PU  reason: invalid class name */
public class AnonymousClass4PU extends FrameLayout implements AnonymousClass4GJ {
    public C95294tG A00;
    public C116855qy A01;
    public boolean A02;
    public final WaTextView A03;
    public final StorageUsageMediaPreviewOverflowOverlayView A04;

    public AnonymousClass4PU(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        this.A04 = (StorageUsageMediaPreviewOverflowOverlayView) C06560Yg.A02(this, R.id.overflow_overlay_view);
        this.A03 = AnonymousClass0x7.A0L(this, R.id.overflow_text_view);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A04.setFrameDrawable(drawable);
        C95294tG r0 = this.A00;
        if (r0 != null) {
            r0.setFrameDrawable(drawable);
        }
    }
}
