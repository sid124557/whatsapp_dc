package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;
import java.util.Set;

/* renamed from: X.4Xf  reason: invalid class name and case insensitive filesystem */
public abstract class C88074Xf extends AnonymousClass0O5 {
    public int A00;
    public final Set A01 = AnonymousClass0x9.A17();

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int i3;
        AnonymousClass6mM r0;
        C162457s7.A0J(recyclerView, 0);
        C06440Xs layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int A1G = linearLayoutManager.A1G();
            int A1I = linearLayoutManager.A1I();
            if (A1G <= A1I) {
                while (true) {
                    Set set = this.A01;
                    if (!C18300x5.A1X(set, A1G) && (r0 = (AnonymousClass6mM) recyclerView.A0F(A1G)) != null) {
                        r0.A08();
                        C86654Ky.A1R(set, A1G);
                    }
                    if (A1G == A1I) {
                        break;
                    }
                    A1G++;
                }
            }
            if (A08()) {
                if (A1I - this.A00 < A06()) {
                    C06440Xs layoutManager2 = recyclerView.getLayoutManager();
                    if ((layoutManager2 instanceof LinearLayoutManager) && recyclerView.A0N != null) {
                        int A1J = ((LinearLayoutManager) layoutManager2).A1J();
                        AnonymousClass0R6 r02 = recyclerView.A0N;
                        if (r02 != null) {
                            i3 = r02.A0G();
                        } else {
                            i3 = 0;
                        }
                        if (A1J != i3 - 1) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                A07();
                this.A00 = A1I;
            }
        }
    }

    public int A06() {
        if (!(this instanceof C96274w6) || ((C96274w6) this).A00.A0D.A0M.A05 != 0) {
            return 5;
        }
        return 14;
    }

    public void A07() {
        AnonymousClass7YI r0;
        if (this instanceof C96274w6) {
            ((C96274w6) this).A00.A0D.A0I();
            return;
        }
        AnonymousClass4U0 r02 = BusinessApiBrowseFragment.A08;
        if (r02 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C156637gx r03 = (C156637gx) r02.A06.A00.A07();
        if (r03 != null && (r0 = r03.A03) != null && r0.A01 != null) {
            AnonymousClass4U0 r1 = BusinessApiBrowseFragment.A08;
            if (r1 == null) {
                throw C18270x1.A0S("viewModel");
            }
            r1.A0E(BusinessApiBrowseFragment.A09);
        }
    }

    public boolean A08() {
        if (!(this instanceof C96274w6)) {
            return true;
        }
        AnonymousClass4U5 r2 = ((C96274w6) this).A00.A0D;
        int i = r2.A02;
        if (i == 1 || i == 4 || r2.A0d()) {
            C112225jO r22 = r2.A0Q;
            AnonymousClass5ZO r0 = r22.A00.A01;
            if (r0 == null || "country_default".equals(r0.A09) || !r22.A0A()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
