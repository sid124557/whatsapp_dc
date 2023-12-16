package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;

/* renamed from: X.9Bz  reason: invalid class name */
public class AnonymousClass9Bz extends AnonymousClass97V {
    public RecyclerView A00;
    public PayToolbar A01;
    public final C160757oG A02 = C160757oG.A00("PaymentComponentListActivity", "infra", "COMMON");
    public final AnonymousClass955 A03 = new AnonymousClass955(this);

    public C05570Ua A74(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        int i2;
        this.A02.A04(AnonymousClass000.A0Y("Create view holder for ", AnonymousClass001.A0o(), i));
        switch (i) {
            case 100:
                return new AnonymousClass9EZ(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 102:
                layoutInflater = C86604Kt.A0D(viewGroup);
                i2 = R.layout.f8nameremoved;
                break;
            case 103:
                layoutInflater = C86604Kt.A0D(viewGroup);
                i2 = R.layout.f8nameremoved;
                break;
            case 104:
                return new C191239Ed(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            default:
                throw AnonymousClass002.A0E(C160757oG.A01("PaymentComponentListActivity", AnonymousClass000.A0Y("no valid mapping for: ", AnonymousClass001.A0o(), i)));
        }
        return new C191299Ej(AnonymousClass001.A0R(layoutInflater, viewGroup, i2));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ((this instanceof PaymentTransactionDetailsListActivity) || (this instanceof IndiaUpiMandateHistoryActivity)) {
            setContentView((int) R.layout.f8nameremoved);
        } else {
            setContentView((int) R.layout.f8nameremoved);
            int A04 = AnonymousClass0Y8.A04(this, R.color.f5nameremoved);
            PayToolbar payToolbar = (PayToolbar) findViewById(R.id.pay_service_toolbar);
            this.A01 = payToolbar;
            setSupportActionBar(payToolbar);
            AnonymousClass0R8 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                C1899593h.A0n(supportActionBar, R.string.f11nameremoved);
                C1899593h.A0j(this, supportActionBar, A04);
            }
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.payment_component_list);
        this.A00 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.A00.setAdapter(this.A03);
    }
}
