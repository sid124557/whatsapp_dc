package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4ni  reason: invalid class name and case insensitive filesystem */
public class C93004ni extends C93014nj {
    public int A00 = 0;
    public ImageView A01;
    public final View.OnClickListener A02 = new C109345eT(this, 34);
    public final Runnable A03 = C117085rM.A00(this, 47);

    public void A1N() {
        C626936e.A0D(false, "ConversationRowViewOnceMedia/senders can not view their own media");
    }

    public Drawable getPopupDrawable() {
        return this.A1R.A05(getResources(), new C94274qr(new int[]{129323}), -1);
    }

    public C93004ni(Context context, AnonymousClass677 r4, C30471mV r5) {
        super(context, r4, r5);
        A29();
    }

    public void A29() {
        super.A29();
        C30471mV fMessage = getFMessage();
        int BEM = ((AnonymousClass4DU) fMessage).BEM();
        if (BEM != 0) {
            if (BEM == 1) {
                A28();
                WaTextView waTextView = this.A03;
                C18300x5.A13(C86654Ky.A0B(this, waTextView, R.string.f11nameremoved), waTextView, getMediaTypeDescriptionString());
            } else if (BEM == 2) {
                C93014nj.A00(this.A04, fMessage, 2, true);
                A2C(this.A01, 2, true);
                A2A();
            } else {
                return;
            }
            View view = this.A01;
            view.setOnClickListener(this.A02);
            C93314oJ.A0q(view, this);
            return;
        }
        int A002 = C627636p.A00(fMessage);
        C93014nj.A00(this.A04, fMessage, A002, true);
        View view2 = this.A01;
        A2C(view2, A002, true);
        if (A002 == 2) {
            view2.setOnClickListener(this.A02);
            C93314oJ.A0q(view2, this);
        }
        A2A();
    }
}
