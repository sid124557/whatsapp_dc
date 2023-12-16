package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.9al  reason: invalid class name and case insensitive filesystem */
public class C196389al implements C185418tc {
    public ImageView A00;
    public final C54292oU A01;
    public final AnonymousClass33Q A02;
    public final AnonymousClass4FS A03;

    /* renamed from: A00 */
    public void Axq(AnonymousClass7HR r3) {
        if (r3 != null && r3.A01 != null) {
            this.A00.setImageResource(R.drawable.payment_invite_bubble_icon);
        }
    }

    public C196389al(C54292oU r1, AnonymousClass33Q r2, AnonymousClass4FS r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    public void BfU(View view) {
        this.A00 = AnonymousClass0x9.A0E(view, R.id.payment_invite_bubble_icon);
    }

    public int B94() {
        return R.layout.f8nameremoved;
    }

    public /* synthetic */ void BFl(ViewStub viewStub) {
        AnonymousClass9LS.A00(viewStub, this);
    }
}
