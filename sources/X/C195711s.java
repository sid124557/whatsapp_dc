package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.11s  reason: invalid class name and case insensitive filesystem */
public final class C195711s extends AnonymousClass0R6 {
    public C84574Cw A00;
    public List A01 = AnonymousClass001.A0s();

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        return new C197012f(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r9, int i) {
        ImageView imageView;
        Context context;
        int i2;
        C197012f r92 = (C197012f) r9;
        C162457s7.A0J(r92, 0);
        AnonymousClass3ZO r7 = (AnonymousClass3ZO) this.A01.get(i);
        C84574Cw r6 = this.A00;
        C162457s7.A0J(r7, 0);
        AnonymousClass66R r5 = r92.A03;
        ((View) C18300x5.A0d(r5)).setVisibility(0);
        int i3 = r7.A01;
        if (i3 != 1) {
            if (i3 == 2) {
                AnonymousClass66R r4 = r92.A04;
                View view = r92.A0H;
                C18290x4.A1A(view.getContext(), (ImageView) C18300x5.A0d(r4), R.drawable.ic_alert);
                imageView = (ImageView) C18300x5.A0d(r4);
                context = view.getContext();
                i2 = R.color.f5nameremoved;
            } else if (i3 == 3) {
                AnonymousClass66R r42 = r92.A04;
                View view2 = r92.A0H;
                C18290x4.A1A(view2.getContext(), (ImageView) C18300x5.A0d(r42), R.drawable.ic_card);
                imageView = (ImageView) C18300x5.A0d(r42);
                context = view2.getContext();
                i2 = R.color.f5nameremoved;
            }
            AnonymousClass0x2.A0p(context, imageView, i2);
        } else {
            AnonymousClass66R r43 = r92.A04;
            View view3 = r92.A0H;
            C18290x4.A1A(view3.getContext(), (ImageView) C18300x5.A0d(r43), R.drawable.ic_alert_round);
            AnonymousClass0x2.A0p(view3.getContext(), (ImageView) C18300x5.A0d(r43), R.color.f5nameremoved);
            ((View) C18300x5.A0d(r5)).setVisibility(8);
        }
        C18280x3.A0G(r92.A05).setText(r7.A08);
        C18280x3.A0G(r92.A02).setText(r7.A05);
        TextView A0G = C18280x3.A0G(r92.A01);
        A0G.setText(r7.A04);
        C18310x6.A19(A0G, r6, r7, 8);
        if (((View) C18300x5.A0d(r5)).getVisibility() == 0) {
            TextView A0G2 = C18280x3.A0G(r5);
            A0G2.setText(R.string.f11nameremoved);
            C18310x6.A19(A0G2, r6, r7, 9);
        }
    }

    public C195711s(C84574Cw r2, List list) {
        this.A00 = r2;
        this.A01 = list;
    }
}
