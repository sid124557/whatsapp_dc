package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4Qx  reason: invalid class name */
public class AnonymousClass4Qx extends LinearLayout implements AnonymousClass4GJ {
    public int A00;
    public LinearLayout A01;
    public ThumbnailButton A02;
    public AnonymousClass5UY A03;
    public C116855qy A04;
    public boolean A05;

    public AnonymousClass4Qx(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        setOrientation(1);
        setGravity(1);
        this.A01 = C86654Ky.A0N(this, R.id.contact_photo_layout);
        this.A02 = C86664Kz.A16(this, R.id.contact_photo);
        this.A03 = AnonymousClass0x2.A0M(this, R.id.peers_not_in_face_pile_count_text_stub);
    }

    public int A00(int i) {
        Resources resources;
        int i2;
        if (this.A00 != 0) {
            resources = getResources();
            i2 = this.A00;
        } else {
            resources = getResources();
            if (i == 1) {
                i2 = R.dimen.f6nameremoved;
            } else {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
                if (i >= 2) {
                    return dimensionPixelSize - ((i - 2) * getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
                }
                return 0;
            }
        }
        return resources.getDimensionPixelSize(i2);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public ThumbnailButton getContactPhoto() {
        return this.A02;
    }

    public LinearLayout getContactPhotoLayout() {
        return this.A01;
    }

    public void setFixedContactPhotoSizeRes(int i) {
        this.A00 = i;
    }
}
