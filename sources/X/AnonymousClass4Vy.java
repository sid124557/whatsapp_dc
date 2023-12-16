package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.polls.PollCreatorActivity;
import com.whatsapp.polls.PollCreatorViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4Vy  reason: invalid class name */
public class AnonymousClass4Vy extends AnonymousClass099 {
    public final /* synthetic */ PollCreatorActivity A00;

    public void A04(C05570Ua r3, int i) {
        if (i == 2) {
            if (r3 != null) {
                C86644Kx.A14(r3.A0H, this.A00.A02);
            }
        } else if (i == 0) {
            this.A00.A0D.A0G(true);
        }
    }

    public AnonymousClass4Vy(PollCreatorActivity pollCreatorActivity) {
        this.A00 = pollCreatorActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (((X.C97504yQ) r1.get(r2)).A00.isEmpty() != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.C05570Ua r5, androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C97484yO
            r3 = 0
            if (r0 == 0) goto L_0x0027
            int r0 = r5.A01()
            int r2 = r0 + -2
            com.whatsapp.polls.PollCreatorActivity r0 = r4.A00
            com.whatsapp.polls.PollCreatorViewModel r0 = r0.A0D
            if (r2 < 0) goto L_0x0028
            java.util.List r1 = r0.A0E
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0028
            java.lang.Object r0 = r1.get(r2)
            X.4yQ r0 = (X.C97504yQ) r0
            java.lang.String r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            return r3
        L_0x0028:
            int r3 = super.A02(r5, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Vy.A02(X.0Ua, androidx.recyclerview.widget.RecyclerView):int");
    }

    public boolean A07(C05570Ua r3, C05570Ua r4, RecyclerView recyclerView) {
        if (!(r4 instanceof C97474yN) || !(r4 instanceof C137366oZ)) {
            return true;
        }
        return false;
    }

    public boolean A08(C05570Ua r8, C05570Ua r9, RecyclerView recyclerView) {
        int A01 = r8.A01() - 2;
        int A012 = r9.A01() - 2;
        PollCreatorActivity pollCreatorActivity = this.A00;
        PollCreatorViewModel pollCreatorViewModel = pollCreatorActivity.A0D;
        if (A01 == A012 || A01 < 0) {
            return false;
        }
        List list = pollCreatorViewModel.A0E;
        if (A01 >= list.size() || A012 < 0 || A012 >= list.size()) {
            return false;
        }
        if (list.size() > 0 && ((C97504yQ) list.get(list.size() - 1)).A00.isEmpty() && (A01 == AnonymousClass002.A04(list, 1) || A012 == AnonymousClass002.A04(list, 1))) {
            return false;
        }
        ArrayList A0J = AnonymousClass002.A0J(list);
        Collections.swap(A0J, A01, A012);
        list.clear();
        list.addAll(A0J);
        pollCreatorViewModel.A0D();
        pollCreatorActivity.A0C.A02 = true;
        pollCreatorActivity.A01.vibrate(3);
        return true;
    }
}
