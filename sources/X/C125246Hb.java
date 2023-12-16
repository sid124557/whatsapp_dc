package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.6Hb  reason: invalid class name and case insensitive filesystem */
public class C125246Hb extends AnonymousClass0R6 {
    public final C620733j A00;
    public final List A01;

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C125466Id(C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false), this);
        }
        LayoutInflater A0D = C18280x3.A0D(viewGroup);
        if (i != 1) {
            return new C125536Ik(A0D.inflate(R.layout.f8nameremoved, viewGroup, false), this);
        }
        return new AnonymousClass6I8(A0D.inflate(R.layout.f8nameremoved, viewGroup, false));
    }

    public int A0G() {
        return this.A01.size();
    }

    public void BNf(C05570Ua r7, int i) {
        C109705f3 r1;
        View view;
        int i2 = r7.A02;
        boolean z = true;
        if (i2 == 0) {
            C125466Id r72 = (C125466Id) r7;
            C146977Ci r0 = (C146977Ci) this.A01.get(i);
            if (i == 0) {
                z = false;
            }
            r72.A01.setText(r0.A00);
            View view2 = r72.A00;
            int i3 = 8;
            if (z) {
                i3 = 0;
            }
            view2.setVisibility(i3);
        } else if (i2 == 1) {
            ((AnonymousClass6I8) r7).A00.setText(((C146977Ci) this.A01.get(i)).A00);
        } else if (i2 == 2) {
            C125536Ik r73 = (C125536Ik) r7;
            C132356f9 r5 = (C132356f9) ((C146977Ci) this.A01.get(i));
            r73.A01.setText(r5.A00);
            WaTextView waTextView = r73.A02;
            String str = r5.A01;
            waTextView.setText(str);
            int i4 = r5.A00;
            if (i4 == 1) {
                AnonymousClass0x2.A0q(waTextView.getContext(), waTextView, AnonymousClass5Yj.A02(waTextView.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
                r1 = new C109705f3((Object) r73, 19, (Object) r5);
                view = waTextView;
            } else if (i4 == 2) {
                waTextView.setText(r73.A03.A00.A0I(AnonymousClass36P.A08(str)));
                View view3 = r73.A00;
                Context context = view3.getContext();
                Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, (String) null));
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    view3.setVisibility(0);
                    r1 = new C109705f3(context, intent, 20);
                    view = view3;
                } else {
                    return;
                }
            } else {
                return;
            }
            view.setOnClickListener(r1);
        }
    }

    public int getItemViewType(int i) {
        List list = this.A01;
        if (list.get(i) instanceof C132346f8) {
            return 0;
        }
        return C18280x3.A01(list.get(i) instanceof C132336f7 ? 1 : 0);
    }

    public C125246Hb(C620733j r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }
}
