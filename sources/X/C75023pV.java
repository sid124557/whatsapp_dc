package X;

import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.3pV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C75023pV extends C72573dw implements AnonymousClass4GR, C834248i {
    public C75023pV(Object obj) {
        super(C43782Tl.class, obj, "render", "render(Lcom/whatsapp/status/archive/entity/StatusArchiveSettingsViewState;)V");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C632238k r10 = (C632238k) obj;
        C43782Tl r8 = (C43782Tl) this.receiver;
        C162457s7.A0J(r10, 0);
        TextView textView = r8.A05;
        C620733j r5 = r8.A07;
        int i = r10.A00;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1P(A0L, i, 0);
        textView.setText(r5.A0L(A0L, R.plurals.f9nameremoved, (long) i));
        r8.A06.setChecked(r10.A01);
        return C59022wD.A00;
    }
}
