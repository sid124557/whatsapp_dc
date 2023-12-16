package X;

import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.90T  reason: invalid class name */
public class AnonymousClass90T implements C181758nH {
    public Object A00;
    public final int A01;

    public AnonymousClass90T(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(AnonymousClass90T r1) {
        ((AnonymousClass4YU) r1.A00).A01.setImageResource(R.color.f5nameremoved);
    }

    public static final void A01(AnonymousClass90T r0) {
        C1448873i.A00((ImageView) r0.A00);
    }

    public final void BMg(AnonymousClass8EI r2) {
        ImageView imageView;
        switch (this.A01) {
            case 0:
                A00(this);
                return;
            case 2:
                A01(this);
                return;
            case 5:
                ((AnonymousClass4GP) this.A00).invoke();
                return;
            case 6:
                imageView = (ImageView) this.A00;
                if (imageView == null) {
                    return;
                }
                break;
            default:
                imageView = (ImageView) this.A00;
                break;
        }
        C1448873i.A00(imageView);
    }
}
