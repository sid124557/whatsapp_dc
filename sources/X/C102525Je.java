package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.R;
import com.whatsapp.biz.serviceofferings.ServiceOfferingsRecyclerView;

/* renamed from: X.5Je  reason: invalid class name and case insensitive filesystem */
public final class C102525Je {
    public AnonymousClass4WI A00;
    public ServiceOfferingsRecyclerView A01;
    public final Context A02;
    public final View A03;
    public final C620733j A04;

    public C102525Je(Context context, View view, C620733j r8) {
        C86614Ku.A1S(r8, 2, context);
        this.A03 = view;
        this.A04 = r8;
        this.A02 = context;
        this.A01 = (ServiceOfferingsRecyclerView) C18280x3.A0E(view, R.id.service_offerings_recycler_view);
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        ServiceOfferingsRecyclerView serviceOfferingsRecyclerView = this.A01;
        if (serviceOfferingsRecyclerView == null) {
            throw C18270x1.A0S("serviceOfferingsRecyclerView");
        }
        serviceOfferingsRecyclerView.setLayoutManager(gridLayoutManager);
        ServiceOfferingsRecyclerView serviceOfferingsRecyclerView2 = this.A01;
        if (serviceOfferingsRecyclerView2 == null) {
            throw C18270x1.A0S("serviceOfferingsRecyclerView");
        }
        C86654Ky.A1I(serviceOfferingsRecyclerView2, this.A04, this.A02.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        ServiceOfferingsRecyclerView serviceOfferingsRecyclerView3 = this.A01;
        if (serviceOfferingsRecyclerView3 == null) {
            throw C18270x1.A0S("serviceOfferingsRecyclerView");
        }
        serviceOfferingsRecyclerView3.setNestedScrollingEnabled(false);
        AnonymousClass4WI r1 = new AnonymousClass4WI();
        this.A00 = r1;
        ServiceOfferingsRecyclerView serviceOfferingsRecyclerView4 = this.A01;
        if (serviceOfferingsRecyclerView4 == null) {
            throw C18270x1.A0S("serviceOfferingsRecyclerView");
        }
        serviceOfferingsRecyclerView4.setAdapter(r1);
    }
}
