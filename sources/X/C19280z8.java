package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.0z8  reason: invalid class name and case insensitive filesystem */
public final class C19280z8 extends LinearLayout implements AnonymousClass4GJ {
    public AnonymousClass5ZU A00;
    public C116855qy A01;
    public boolean A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;

    public C19280z8(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C64333Db.A28(((C88864av) ((C111685iW) generatedComponent())).A0K);
        }
        View inflate = View.inflate(context, R.layout.f8nameremoved, this);
        C162457s7.A0D(inflate);
        setGravity(17);
        this.A05 = AnonymousClass0x2.A0I(inflate, R.id.contact_name);
        ImageView imageView = (ImageView) C18280x3.A0E(inflate, R.id.contact_row_photo);
        this.A04 = imageView;
        this.A03 = C18280x3.A0E(inflate, R.id.close);
        AnonymousClass0YY.A06(imageView, 2);
        C107295b4.A04(inflate, R.string.f11nameremoved);
    }

    public final void setWaContactNames(AnonymousClass5ZU r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass5ZU getWaContactNames() {
        AnonymousClass5ZU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContactNames");
    }
}
