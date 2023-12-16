package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.status.StatusesFragment;
import java.util.List;

/* renamed from: X.5pF  reason: invalid class name and case insensitive filesystem */
public class C115795pF implements C1226165b {
    public final long A00;
    public final /* synthetic */ StatusesFragment A01;

    public View BEK(Context context, View view, ViewGroup viewGroup, C105365Uq r15, List list, List list2, List list3, List list4, boolean z) {
        int i;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup, false);
            AnonymousClass0YY.A06(view, 1);
        }
        TextView A0I = C86614Ku.A0I(view);
        C106905aM.A04(A0I);
        long j = this.A00;
        if (j == 0) {
            i = R.string.f11nameremoved;
        } else if (j == 1) {
            i = R.string.f11nameremoved;
        } else {
            if (j != 2) {
                C18260x0.A11("statusesFragment/invalid id: ", AnonymousClass001.A0o(), j);
            }
            i = R.string.f11nameremoved;
        }
        A0I.setText(i);
        ImageView A0F = AnonymousClass0x9.A0F(view, R.id.status_chevron);
        AnonymousClass0YY.A06(A0F, 2);
        StatusesFragment statusesFragment = this.A01;
        if (!statusesFragment.A1Q || j != 2 || statusesFragment.A1O) {
            A0F.setVisibility(4);
            C06560Yg.A0O(view, (AnonymousClass0WH) null);
            view.setOnClickListener((View.OnClickListener) null);
            view.setClickable(false);
        } else {
            A0F.setVisibility(0);
            boolean z2 = statusesFragment.A1N;
            int i2 = R.string.f11nameremoved;
            if (z2) {
                i2 = R.string.f11nameremoved;
            }
            C107295b4.A03(view, i2);
            boolean z3 = statusesFragment.A1N;
            Resources A09 = C08310eF.A09(statusesFragment);
            int i3 = R.drawable.ic_chevron_up;
            if (z3) {
                i3 = R.drawable.ic_chevron_down;
            }
            A0F.setImageDrawable(A09.getDrawable(i3));
            view.setClickable(true);
            C109495ei.A00(view, this, A0F, 1);
        }
        C107295b4.A06(view, true);
        return view;
    }

    public C115795pF(StatusesFragment statusesFragment, long j) {
        this.A01 = statusesFragment;
        this.A00 = j;
    }
}
