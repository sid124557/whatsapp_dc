package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.95B  reason: invalid class name */
public final class AnonymousClass95B extends AnonymousClass0R6 {
    public final int A00;
    public final Activity A01;
    public final AnonymousClass5UX A02;
    public final C105365Uq A03;
    public final AnonymousClass9OQ A04;
    public final C195219Wq A05;
    public final List A06;
    public final List A07;

    public void BNf(C05570Ua r8, int i) {
        C162457s7.A0J(r8, 0);
        int i2 = r8.A02;
        if (i2 == 0) {
            AnonymousClass95Y r82 = (AnonymousClass95Y) r8;
            AnonymousClass3ZQ r6 = (AnonymousClass3ZQ) this.A06.get(i);
            if (r6.A06) {
                r82.A01.setText(this.A05.A0O(r6.A03, (C95814uZ) null, false));
                this.A02.A06(r82.A00, R.drawable.avatar_contact);
                return;
            }
            Iterator it = this.A07.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it);
                if (C162457s7.A0P(A0R.A0H, r6.A04)) {
                    this.A03.A08(r82.A00, A0R);
                    r82.A01.setText(this.A05.A0O(r6.A03, A0R.A0H, false));
                    return;
                }
            }
        } else if (i2 == 1 && i == 3) {
            AnonymousClass95Z r83 = (AnonymousClass95Z) r8;
            r83.A01.setText(R.string.f11nameremoved);
            r83.A00.setImageResource(R.drawable.ic_view_all);
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 0) {
            return new AnonymousClass95Y(C18310x6.A0I(this.A01.getLayoutInflater(), viewGroup, R.layout.f8nameremoved, false), this.A04);
        }
        if (i == 1) {
            return new AnonymousClass95Z(C18310x6.A0I(this.A01.getLayoutInflater(), viewGroup, R.layout.f8nameremoved, false), this.A04);
        }
        throw AnonymousClass001.A0c("Invalid view type");
    }

    public int getItemViewType(int i) {
        if (i <= 2) {
            return 0;
        }
        return 1;
    }

    public int A0G() {
        int size = this.A06.size();
        if (size > 3) {
            return this.A00;
        }
        return size;
    }

    public AnonymousClass95B(Activity activity, AnonymousClass5UX r3, C105365Uq r4, AnonymousClass9OQ r5, C195219Wq r6, List list, List list2, int i) {
        C18260x0.A0Q(activity, r3);
        C162457s7.A0J(r4, 5);
        C162457s7.A0J(r6, 7);
        this.A01 = activity;
        this.A02 = r3;
        this.A07 = list;
        this.A06 = list2;
        this.A03 = r4;
        this.A00 = i;
        this.A05 = r6;
        this.A04 = r5;
    }
}
