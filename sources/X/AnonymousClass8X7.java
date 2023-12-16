package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;

/* renamed from: X.8X7  reason: invalid class name */
public final class AnonymousClass8X7 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C185018sv $adapter;
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ C184108rG $quantityPickerListener;
    public final /* synthetic */ C90524hb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8X7(View view, C185018sv r3, C90524hb r4, C184108rG r5) {
        super(0);
        this.$itemView = view;
        this.$adapter = r3;
        this.this$0 = r4;
        this.$quantityPickerListener = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View findViewById = this.$itemView.findViewById(R.id.product_item_quantity_selector);
        C185018sv r3 = this.$adapter;
        C90524hb r2 = this.this$0;
        C184108rG r1 = this.$quantityPickerListener;
        QuantitySelector quantitySelector = (QuantitySelector) findViewById;
        quantitySelector.setCollapsible(true);
        quantitySelector.setVisibility(0);
        quantitySelector.A04 = new C170798Eo(r3, r2, r1);
        quantitySelector.A03 = new C170778Em(r3, r2, r1);
        return quantitySelector;
    }
}
