package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4Sv  reason: invalid class name */
public final class AnonymousClass4Sv extends ConstraintLayout {
    public final WaImageView A00 = C18280x3.A0J(this, R.id.stickers_upsell_image);
    public final AnonymousClass66R A01;
    public final AnonymousClass66R A02;
    public final AnonymousClass66R A03;
    public final AnonymousClass66R A04;

    public AnonymousClass4Sv(Context context) {
        super(context, (AttributeSet) null, 0);
        AnonymousClass58H r1 = AnonymousClass58H.NONE;
        this.A04 = C154517dI.A00(r1, new C119655xK(context));
        this.A02 = C154517dI.A00(r1, new C119635xI(context));
        this.A03 = C154517dI.A00(r1, new C119645xJ(context));
        this.A01 = C154517dI.A00(r1, new C119625xH(context));
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        setBackgroundResource(R.drawable.stickers_upsell_background);
        C18300x5.A13(context, this, R.string.f11nameremoved);
        C18280x3.A0E(this, R.id.stickers_upsell_close).setVisibility(0);
    }

    private final int getImageHeightLandscape() {
        return AnonymousClass0x2.A09(this.A01);
    }

    private final int getImageHeightPortrait() {
        return AnonymousClass0x2.A09(this.A02);
    }

    private final int getImageWidthLandscape() {
        return AnonymousClass0x2.A09(this.A03);
    }

    private final int getImageWidthPortrait() {
        return AnonymousClass0x2.A09(this.A04);
    }

    public void onConfigurationChanged(Configuration configuration) {
        int A09;
        int A092;
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            if (configuration.orientation == 2) {
                A09 = AnonymousClass0x2.A09(this.A03);
            } else {
                A09 = AnonymousClass0x2.A09(this.A04);
            }
            if (configuration.orientation == 2) {
                A092 = AnonymousClass0x2.A09(this.A01);
            } else {
                A092 = AnonymousClass0x2.A09(this.A02);
            }
            this.A00.setLayoutParams(new C001702c(A09, A092));
        }
    }
}
