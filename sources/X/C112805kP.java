package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5kP  reason: invalid class name and case insensitive filesystem */
public class C112805kP implements C185688u5 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C89634eX A01;
    public final /* synthetic */ List A02;

    public C112805kP(View view, C89634eX r2, List list) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = view;
    }

    public void BT9() {
        C18290x4.A1L(this.A01.A0G.A00);
        BUK();
    }

    public void BTA(AnonymousClass3ZH r4) {
        if (r4 != null) {
            C89634eX r1 = this.A01;
            List list = r1.A0W;
            if (list.contains(r4)) {
                r1.A0V.add(list.get(list.indexOf(r4)));
            } else {
                r1.A0V.add(r4);
            }
        }
        C89634eX r2 = this.A01;
        AnonymousClass54Z r12 = new AnonymousClass54Z(r2, this.A02);
        r2.A0L = r12;
        C18270x1.A0w(r12, r2.A04);
        BUK();
    }

    public void BTB() {
        C89634eX r1 = this.A01;
        r1.A0Y = true;
        r1.findViewById(R.id.init_contacts_progress).setVisibility(0);
        this.A00.setVisibility(8);
    }

    public void BUK() {
        C89634eX r2 = this.A01;
        r2.A0Y = false;
        C86604Kt.A1L(r2, R.id.init_contacts_progress);
        this.A00.setVisibility(0);
    }

    public void BbX(int i) {
        C89634eX r1 = this.A01;
        int A04 = C86644Kx.A04(r1, R.id.search_no_matches);
        TextView A0L = C18310x6.A0L(r1, R.id.error_text_line1);
        TextView A0L2 = C18310x6.A0L(r1, R.id.error_text_line2);
        View findViewById = r1.findViewById(R.id.retry_button);
        C18290x4.A1I(findViewById, this, this.A02, 39);
        int i2 = 8;
        if (i != 2) {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        int i3 = R.string.f11nameremoved;
        if (i != 0) {
            i3 = R.string.f11nameremoved;
            if (i != 2) {
                i3 = R.string.f11nameremoved;
            }
        }
        A0L.setText(i3);
        A0L.setVisibility(0);
        int i4 = R.string.f11nameremoved;
        if (i != 0) {
            if (i == 2) {
                i4 = R.string.f11nameremoved;
            }
            A0L2.setVisibility(A04);
        }
        Integer valueOf = Integer.valueOf(i4);
        if (valueOf != null) {
            A0L2.setText(valueOf.intValue());
            A0L2.setVisibility(0);
            return;
        }
        A0L2.setVisibility(A04);
    }
}
