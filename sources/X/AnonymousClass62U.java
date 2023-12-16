package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.ArrayList;

/* renamed from: X.62U  reason: invalid class name */
public final class AnonymousClass62U extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UpdatesAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass62U(UpdatesAdapter updatesAdapter) {
        super(1);
        this.this$0 = updatesAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        ViewTreeObserver viewTreeObserver;
        C06440Xs layoutManager;
        int i;
        boolean A1Z = AnonymousClass001.A1Z(obj);
        UpdatesFragment updatesFragment = this.this$0.A0L;
        UpdatesViewModel updatesViewModel = updatesFragment.A0q;
        if (A1Z) {
            if (updatesViewModel != null) {
                updatesViewModel.A0E = true;
                AnonymousClass08J r1 = updatesViewModel.A0Q;
                AnonymousClass5ZA r0 = (AnonymousClass5ZA) r1.A07();
                if (r0 != null) {
                    r0.A01 = true;
                }
                C86634Kw.A1L(r1);
            }
            ObservableRecyclerView observableRecyclerView = updatesFragment.A0H;
            if (observableRecyclerView == null || (layoutManager = observableRecyclerView.getLayoutManager()) == null) {
                arrayList = null;
            } else {
                arrayList = AnonymousClass001.A0s();
                int A08 = layoutManager.A08();
                for (int i2 = 0; i2 < A08; i2++) {
                    View A0Q = layoutManager.A0Q(i2);
                    if (A0Q != null) {
                        Object tag = A0Q.getTag();
                        if ((tag instanceof C986452r) && ((C986452r) tag).A01.A03() == 0) {
                            arrayList.add(A0Q);
                            UpdatesViewModel updatesViewModel2 = updatesFragment.A0q;
                            if (updatesViewModel2 == null) {
                                continue;
                            } else {
                                AnonymousClass5ZA r02 = (AnonymousClass5ZA) updatesViewModel2.A0Q.A07();
                                if (r02 != null) {
                                    i = r02.A06.size();
                                } else {
                                    i = 0;
                                }
                                if (i == arrayList.size()) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            ObservableRecyclerView observableRecyclerView2 = updatesFragment.A0H;
            if (!(observableRecyclerView2 == null || (viewTreeObserver = observableRecyclerView2.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnPreDrawListener(new AnonymousClass6AN(updatesFragment, 3, arrayList));
            }
        } else if (updatesViewModel != null) {
            updatesViewModel.A0E = false;
            AnonymousClass08J r12 = updatesViewModel.A0Q;
            AnonymousClass5ZA r03 = (AnonymousClass5ZA) r12.A07();
            if (r03 != null) {
                r03.A01 = false;
            }
            C86634Kw.A1L(r12);
        }
        return C59022wD.A00;
    }
}
