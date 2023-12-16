package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.6G3  reason: invalid class name */
public abstract class AnonymousClass6G3 extends AppCompatImageView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass6G3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((WDSProfilePhoto) this).setWhatsAppLocale(C88864av.A02((C111685iW) generatedComponent()));
        }
    }
}
