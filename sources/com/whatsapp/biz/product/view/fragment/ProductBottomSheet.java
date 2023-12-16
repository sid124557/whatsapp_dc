package com.whatsapp.biz.product.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass32Y;
import X.AnonymousClass4FS;
import X.AnonymousClass69E;
import X.C08240dc;
import X.C1001359q;
import X.C104095Pq;
import X.C109425eb;
import X.C111985j0;
import X.C162457s7;
import X.C170788En;
import X.C18270x1;
import X.C18300x5;
import X.C49732h0;
import X.C620733j;
import X.C86604Kt;
import X.C86614Ku;
import X.C86644Kx;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class ProductBottomSheet extends Hilt_ProductBottomSheet {
    public View A00;
    public View A01;
    public Toolbar A02;
    public WaTextView A03;
    public WaTextView A04;
    public C104095Pq A05;
    public VariantsCarouselFragment A06;
    public C49732h0 A07;
    public QuantitySelector A08;
    public ProductBottomSheetViewModel A09;
    public C620733j A0A;
    public UserJid A0B;
    public AnonymousClass4FS A0C;
    public WDSButton A0D;
    public String A0E;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A04 = C86644Kx.A0O(inflate, R.id.title);
        this.A03 = C86644Kx.A0O(inflate, R.id.price);
        this.A00 = inflate.findViewById(R.id.cart_container);
        this.A0D = (WDSButton) inflate.findViewById(R.id.action_button);
        this.A08 = (QuantitySelector) inflate.findViewById(R.id.quantity_selector);
        this.A01 = inflate.findViewById(R.id.loading_indicator);
        QuantitySelector quantitySelector = this.A08;
        if (quantitySelector != null) {
            quantitySelector.A03 = new C111985j0(this);
            quantitySelector.A04 = new C170788En(this);
        }
        Toolbar A0K = C86644Kx.A0K(inflate);
        this.A02 = A0K;
        if (A0K != null) {
            A0K.setNavigationIcon((int) R.drawable.ic_close);
            A0K.setNavigationOnClickListener(new C109425eb(this, 1));
            A0K.A0B(R.menu.f10nameremoved);
            A0K.A0R = new AnonymousClass69E(this, 1);
        }
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C08240dc r6 = new C08240dc(A0T());
        r6.A0H = true;
        UserJid userJid = this.A0B;
        if (userJid == null) {
            throw C18270x1.A0S("productOwnerJid");
        }
        VariantsCarouselFragment variantsCarouselFragment = new VariantsCarouselFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelable("extra_product_owner_jid", userJid);
        variantsCarouselFragment.A0u(A082);
        r6.A0D(variantsCarouselFragment, (String) null, R.id.variants_carousel_fragment);
        r6.A03();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C18300x5.A1A(this);
    }

    public final void A1Y(boolean z) {
        View view = this.A01;
        int i = 0;
        if (view != null) {
            view.setVisibility(C86614Ku.A01(z ^ true ? 1 : 0));
        }
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            waTextView.setVisibility(AnonymousClass0x9.A00(z ? 1 : 0));
        }
        WaTextView waTextView2 = this.A03;
        if (waTextView2 != null) {
            if (z) {
                i = 4;
            }
            waTextView2.setVisibility(i);
        }
    }

    public void A0g() {
        FragmentContainerView fragmentContainerView;
        super.A0g();
        if (this.A06 == null) {
            View view = this.A0B;
            VariantsCarouselFragment variantsCarouselFragment = null;
            if (!(view == null || (fragmentContainerView = (FragmentContainerView) view.findViewById(R.id.variants_carousel_fragment)) == null)) {
                variantsCarouselFragment = (VariantsCarouselFragment) fragmentContainerView.getFragment();
            }
            this.A06 = variantsCarouselFragment;
            if (variantsCarouselFragment != null) {
                VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = variantsCarouselFragment.A05;
                if (variantsCarouselFragmentViewModel == null) {
                    throw C86604Kt.A0j();
                }
                variantsCarouselFragmentViewModel.A03 = true;
            }
            ProductBottomSheetViewModel productBottomSheetViewModel = this.A09;
            if (productBottomSheetViewModel == null) {
                throw C18270x1.A0S("viewModel");
            }
            C86604Kt.A1N(this, productBottomSheetViewModel.A0E, C1001359q.A00(this, 0), 43);
            ProductBottomSheetViewModel productBottomSheetViewModel2 = this.A09;
            if (productBottomSheetViewModel2 == null) {
                throw C18270x1.A0S("viewModel");
            }
            C86604Kt.A1N(this, productBottomSheetViewModel2.A0D, C1001359q.A00(this, 1), 44);
            ProductBottomSheetViewModel productBottomSheetViewModel3 = this.A09;
            if (productBottomSheetViewModel3 == null) {
                throw C18270x1.A0S("viewModel");
            }
            UserJid userJid = this.A0B;
            if (userJid == null) {
                throw C18270x1.A0S("productOwnerJid");
            }
            String str = this.A0E;
            if (str == null) {
                throw C18270x1.A0S("productId");
            }
            productBottomSheetViewModel3.A0F(userJid, str);
        }
    }

    public void A0p(Bundle bundle) {
        String string;
        super.A0p(bundle);
        AnonymousClass32Y r2 = UserJid.Companion;
        Bundle bundle2 = this.A06;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString("extra_product_owner_jid");
        }
        UserJid A0E2 = r2.A0E(str);
        if (A0E2 != null) {
            this.A0B = A0E2;
            Bundle bundle3 = this.A06;
            if (bundle3 == null || (string = bundle3.getString("extra_product_id")) == null) {
                throw AnonymousClass001.A0e("ProductBottomSheet requires a product id");
            }
            this.A0E = string;
            ProductBottomSheetViewModel productBottomSheetViewModel = (ProductBottomSheetViewModel) AnonymousClass0x9.A0H(this).A01(ProductBottomSheetViewModel.class);
            this.A09 = productBottomSheetViewModel;
            if (productBottomSheetViewModel == null) {
                throw C86604Kt.A0j();
            }
            UserJid userJid = this.A0B;
            if (userJid == null) {
                throw C18270x1.A0S("productOwnerJid");
            }
            productBottomSheetViewModel.A0W.A00(userJid, 44);
            C49732h0 r1 = this.A07;
            if (r1 != null) {
                UserJid userJid2 = this.A0B;
                if (userJid2 == null) {
                    throw C18270x1.A0S("productOwnerJid");
                }
                r1.A00(userJid2);
                return;
            }
            throw C18270x1.A0S("openVariantsPageLogger");
        }
        throw AnonymousClass001.A0e("ProductBottomSheet requires a product owner id");
    }
}
