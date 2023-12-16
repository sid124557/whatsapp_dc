package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.53Z  reason: invalid class name */
public final class AnonymousClass53Z extends C88504Yz {
    public LinearLayoutManager A00 = new LinearLayoutManager(0);
    public final View A01;
    public final View A02;
    public final WaTextView A03;
    public final ObservableRecyclerView A04;
    public final UpdatesFragment A05;
    public final AnonymousClass4WX A06;
    public final AnonymousClass4W1 A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass53Z(View view, AnonymousClass5FX r8, C105365Uq r9, C620733j r10, UpdatesFragment updatesFragment) {
        super(view);
        C18260x0.A0Q(r10, r8);
        C162457s7.A0J(r9, 4);
        this.A05 = updatesFragment;
        C64333Db r1 = r8.A00.A01;
        this.A06 = new AnonymousClass4WX((AnonymousClass5FY) r1.A00.A86.get(), r9, C86634Kw.A0n(r1), this);
        View findViewById = view.findViewById(R.id.find_channels_btn);
        this.A01 = findViewById;
        WaTextView A0O = C86644Kx.A0O(view, R.id.subtitle);
        this.A03 = A0O;
        this.A04 = (ObservableRecyclerView) view.findViewById(R.id.recommended_list);
        View findViewById2 = view.findViewById(R.id.see_all_container);
        this.A02 = findViewById2;
        this.A07 = new AnonymousClass4W1(view.getContext(), r10);
        C109395eY.A00(findViewById, this, 4);
        C109395eY.A00(findViewById2, this, 5);
        C106905aM.A04(AnonymousClass002.A09(view, R.id.see_all_text));
        C106905aM.A04(A0O);
        this.A0H.getContext();
        ObservableRecyclerView observableRecyclerView = this.A04;
        observableRecyclerView.setLayoutDirection(C102805Ki.A00(r10) ? 1 : 0);
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager == null) {
            throw C18270x1.A0S("layoutManager");
        }
        observableRecyclerView.setLayoutManager(linearLayoutManager);
        observableRecyclerView.setAdapter(this.A06);
        observableRecyclerView.setItemAnimator((AnonymousClass0UY) null);
        C18270x1.A0d(view.getContext(), AnonymousClass0x9.A0F(view, R.id.chevron), r10, R.drawable.chevron_right);
    }
}
