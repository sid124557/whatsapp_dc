package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.0AD  reason: invalid class name */
public class AnonymousClass0AD extends C08750f0 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ AnonymousClass0AP A03;

    public AnonymousClass0AD(View view, View view2, ViewGroup viewGroup, AnonymousClass0AP r4) {
        this.A03 = r4;
        this.A02 = viewGroup;
        this.A00 = view;
        this.A01 = view2;
    }

    public void Bef(C10560i8 r4) {
        this.A01.setTag(R.id.save_overlay_view, (Object) null);
        C03420Kb r0 = new C03420Kb(this.A02);
        r0.A00.remove(this.A00);
        r4.A0C(this);
    }

    public void Beg(C10560i8 r3) {
        C03420Kb r0 = new C03420Kb(this.A02);
        r0.A00.remove(this.A00);
    }

    public void Beh(C10560i8 r4) {
        View view = this.A00;
        if (view.getParent() == null) {
            new C03420Kb(this.A02).A00.add(view);
        } else {
            this.A03.A0G();
        }
    }
}
