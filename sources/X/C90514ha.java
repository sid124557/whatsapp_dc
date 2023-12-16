package X;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.biz.product.view.fragment.ProductMoreInfoFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4ha  reason: invalid class name and case insensitive filesystem */
public abstract class C90514ha extends C131776eA implements C184048rA {
    public int A00 = 0;
    public int A01;
    public ObjectAnimator A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewTreeObserver.OnScrollChangedListener A07;
    public ScrollView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public FragmentContainerView A0C;
    public C88694ab A0D;
    public TextEmojiLabel A0E;
    public TextEmojiLabel A0F;
    public C621033m A0G;
    public WaTextView A0H;
    public C105035Th A0I;
    public C620433g A0J;
    public AnonymousClass5T7 A0K;
    public C29201iR A0L;
    public AnonymousClass5UW A0M;
    public C154197cm A0N;
    public C104095Pq A0O;
    public C181728nE A0P;
    public C87604Ty A0Q;
    public AnonymousClass5XF A0R;
    public C29221iT A0S;
    public C105405Uu A0T;
    public C109015dw A0U;
    public C109015dw A0V;
    public AnonymousClass7KG A0W;
    public C105145Tt A0X;
    public AnonymousClass5Y9 A0Y;
    public C151257Ua A0Z;
    public C152967aS A0a;
    public C181798nL A0b;
    public CatalogCarouselDetailImageView A0c;
    public CatalogMediaCard A0d;
    public EllipsizedTextEmojiLabel A0e;
    public VariantsCarouselFragment A0f;
    public AnonymousClass5MK A0g;
    public C49732h0 A0h;
    public QuantitySelector A0i;
    public AnonymousClass7OY A0j;
    public AnonymousClass4V5 A0k;
    public C106945aQ A0l;
    public C48922fh A0m;
    public C64773Ex A0n;
    public C47882dz A0o;
    public C56422rx A0p;
    public C113905mB A0q;
    public UserJid A0r;
    public C103115Lp A0s;
    public C105255Ue A0t;
    public AnonymousClass7SV A0u;
    public WDSButton A0v;
    public WDSButton A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public List A12 = null;
    public boolean A13;
    public boolean A14;
    public boolean A15 = false;
    public boolean A16 = true;
    public final AnonymousClass2UT A17 = new C189028zs(this, 2);

    public void onActivityResult(int i, int i2, Intent intent) {
        C109015dw r1;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && (r1 = this.A0V) != null) {
            if (i == 3) {
                List A0r2 = C86604Kt.A0r(intent);
                File A0B2 = AnonymousClass002.A0B(intent.getStringExtra("file_path"));
                C621033m r6 = this.A0G;
                C109015dw r7 = this.A0V;
                UserJid userJid = this.A0r;
                r6.A1r.BkM(new C71723cZ(Uri.fromFile(A0B2), r6, r7, userJid, (C624134x) null, A0r2));
                if (A0r2.size() == 1) {
                    this.A00.A0B(this, C86604Kt.A08(this, this.A0n, C86664Kz.A1B(), A0r2));
                    return;
                }
                Bqv(A0r2);
            } else if (i == 66) {
                this.A0R.A01(this, this.A0a, (C95814uZ) null, this.A0r, Collections.singletonList(r1), 3, 0, 0);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean A0E2 = this.A0k.A0E(this.A0V, this.A00);
        boolean z = this.A0r instanceof PhoneUserJid;
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        MenuItem findItem2 = menu.findItem(R.id.menu_share);
        MenuItem findItem3 = menu.findItem(R.id.menu_forward);
        MenuItem findItem4 = menu.findItem(R.id.menu_more_info);
        boolean z2 = false;
        findItem.setVisible(false);
        findItem3.setVisible(A0E2);
        if (A0E2 && z) {
            z2 = true;
        }
        findItem2.setVisible(z2);
        findItem4.setVisible(this.A0l.A04(this.A0r));
        C989453v.A00(AnonymousClass4SG.A2Q(findItem), this, 27);
        TextView A092 = AnonymousClass002.A09(findItem.getActionView(), R.id.cart_total_quantity);
        String str = this.A0x;
        if (str != null) {
            A092.setText(str);
        }
        this.A0Q.A00.A0B(this, new C1897792p(findItem3, findItem2, findItem, this, 0));
        return super.onCreateOptionsMenu(menu);
    }

    public void A74() {
        C86604Kt.A1M(this, this.A0Q.A00, 38);
        updateButton(this.A0w);
    }

    public final void A75() {
        AnonymousClass7KG r1;
        Boolean bool;
        if (!this.A13 && (r1 = this.A0W) != null) {
            C105145Tt r3 = this.A0X;
            AnonymousClass5P6 r2 = new AnonymousClass5P6();
            r2.A0A = r1.A02;
            AnonymousClass5P6.A05(r2, r3, r1.A00);
            r2.A09 = Long.valueOf(r1.A01);
            AnonymousClass5P6.A02(r2, 12);
            AnonymousClass5P6.A03(r2, 31);
            r2.A0G = this.A10;
            C109015dw r0 = this.A0V;
            if (r0 != null) {
                bool = Boolean.valueOf(AnonymousClass000.A1W(r0.A0B));
            } else {
                bool = null;
            }
            r2.A06(bool);
            r2.A00 = this.A0r;
            r2.A01 = (Boolean) this.A0Q.A00.A07();
            r2.A0C = this.A0z;
            r2.A0H = this.A11;
            r2.A0B = this.A0y;
            r3.A03(r2);
            this.A13 = true;
            this.A0W = null;
        }
    }

    public final void A76(String str) {
        Set A002;
        this.A10 = str;
        if (this.A16 || !this.A15) {
            A002 = AnonymousClass74S.A00();
        } else {
            A002 = AnonymousClass002.A0K();
        }
        this.A0m.A01(this.A0r, A002, new C118135t3(this, str));
        this.A00 = AnonymousClass000.A1X(this.A0V) ? 1 : 0;
    }

    public final void A77(List list) {
        long j;
        WDSButton wDSButton;
        int i;
        C109015dw r0 = this.A0V;
        if (r0 != null) {
            j = r0.A09;
        } else {
            j = 99;
        }
        long A002 = C87604Ty.A00(this.A10, list);
        this.A0i.A04(A002, j);
        int i2 = (A002 > 0 ? 1 : (A002 == 0 ? 0 : -1));
        QuantitySelector quantitySelector = this.A0i;
        if (i2 > 0) {
            quantitySelector.setVisibility(0);
            wDSButton = this.A0v;
            i = 48;
        } else {
            quantitySelector.setVisibility(8);
            wDSButton = this.A0v;
            i = 49;
        }
        C18320x8.A15(wDSButton, this, i);
    }

    public void BTH(String str, int i) {
        if (str.equals(this.A10)) {
            A75();
            this.A00 = 3;
            Iterator A032 = C61102zi.A03(this.A0S);
            while (A032.hasNext()) {
                ((C50642iX) A032.next()).A02(str, i);
            }
            C49732h0 r1 = this.A0h;
            r1.A01(new AnonymousClass41A(r1));
            this.A0t.A06("view_product_tag", false);
        }
    }

    public void BTI(AnonymousClass7PB r5, String str) {
        C49732h0 r1;
        AnonymousClass4GQ r0;
        List list;
        if (str.equals(this.A10)) {
            this.A15 = true;
            this.A00 = 0;
            Iterator A032 = C61102zi.A03(this.A0S);
            while (A032.hasNext()) {
                ((C50642iX) A032.next()).A00(str);
            }
            C109015dw A082 = this.A0T.A08((UserJid) null, str);
            if (A082 != null) {
                C108755dV r02 = A082.A0B;
                if (r02 != null) {
                    C108665dM r03 = r02.A00;
                    if (!(r03 == null || (list = r03.A00) == null || !list.isEmpty())) {
                        r1 = this.A0h;
                        r0 = new AnonymousClass43W(r1, false);
                    }
                } else {
                    r1 = this.A0h;
                    r0 = new AnonymousClass43X(r1, false);
                }
                r1.A01(r0);
                this.A0t.A06("view_product_tag", true);
                this.A0j.A00 = this.A0r;
            }
            r1 = this.A0h;
            r0 = new AnonymousClass41A(r1);
            r1.A01(r0);
            this.A0t.A06("view_product_tag", true);
            this.A0j.A00 = this.A0r;
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        C108755dV r0;
        C108665dM r02;
        List list;
        C105465Va.A00(this);
        super.onCreate(bundle);
        this.A0t.A02(774775607, "view_product_tag", "ProductBaseActivity");
        this.A01 = getIntent().getIntExtra("view_product_origin", 0);
        this.A0L.A06(this.A17);
        this.A0r = C86624Kv.A0U(AnonymousClass0x7.A0l(this));
        this.A10 = C86664Kz.A1J(getIntent(), "product");
        this.A14 = getIntent().getBooleanExtra("disable_report", false);
        this.A0z = getIntent().getStringExtra("collection_index");
        this.A11 = getIntent().getStringExtra("product_index");
        this.A0y = getIntent().getStringExtra("collection_id");
        setContentView((int) R.layout.f8nameremoved);
        this.A0c = (CatalogCarouselDetailImageView) findViewById(R.id.catalog_carousel_detail_image_view);
        this.A0F = C86664Kz.A0z(this, R.id.catalog_detail_title);
        this.A0A = C18310x6.A0L(this, R.id.catalog_detail_price);
        this.A0e = (EllipsizedTextEmojiLabel) findViewById(R.id.catalog_detail_description);
        this.A09 = C18310x6.A0L(this, R.id.catalog_detail_link);
        this.A0B = C18310x6.A0L(this, R.id.catalog_detail_sku);
        this.A0E = C86664Kz.A0z(this, R.id.loading_product_text);
        this.A0d = (CatalogMediaCard) findViewById(R.id.product_message_catalog_media_card);
        this.A0H = (WaTextView) findViewById(R.id.product_availability_label);
        this.A0v = (WDSButton) findViewById(R.id.pdp_action_button);
        this.A08 = (ScrollView) findViewById(R.id.pdp_scroll_view);
        this.A06 = findViewById(R.id.shadow_bottom);
        this.A04 = findViewById(R.id.loading_indicator);
        this.A0C = (FragmentContainerView) findViewById(R.id.catalog_variants_carousel_fragment);
        View findViewById = findViewById(R.id.quantity_selector_cart_container);
        this.A03 = findViewById;
        this.A07 = new C1892390n(this, 0);
        findViewById.setVisibility(8);
        QuantitySelector quantitySelector = (QuantitySelector) findViewById(R.id.pdp_quantity_selector);
        this.A0i = quantitySelector;
        quantitySelector.A03 = new C170768El(this);
        quantitySelector.A04 = new C112005j2(this);
        View findViewById2 = findViewById(R.id.request_report_btn_container);
        this.A05 = findViewById2;
        findViewById2.setVisibility(8);
        C18290x4.A1H(findViewById(R.id.report_btn), this, 0);
        C989453v r1 = new C989453v(this, 25);
        WDSButton wDSButton = (WDSButton) findViewById(R.id.message_business_btn);
        this.A0w = wDSButton;
        wDSButton.setVisibility(8);
        this.A0w.setOnClickListener(r1);
        Toolbar toolbar = (Toolbar) C005205m.A00(this, R.id.product_detail_image_toolbar);
        toolbar.setTitle((CharSequence) "");
        toolbar.A07();
        setSupportActionBar(toolbar);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
        }
        C86604Kt.A11(this, toolbar, this.A00, R.drawable.ic_back_shadow);
        this.A0V = this.A0T.A08(this.A0r, this.A10);
        C152967aS r03 = this.A0a;
        if (r03 != null) {
            r03.A00();
        }
        this.A0a = new C152967aS(this.A0Z, this.A0u);
        this.A0Y.A0P.add(this);
        if (this.A01 == 6) {
            C117115rP.A01(this.A04, this, 43);
        }
        this.A0Q = (C87604Ty) C86604Kt.A0L(this, this.A0P, this.A0r);
        AnonymousClass3TS A012 = this.A0J.A01(this.A03, this.A0r, (String) null);
        C104325Qn Azv = this.A0b.Azv(this.A0r);
        UserJid userJid = this.A0r;
        AnonymousClass4FS r9 = this.A04;
        AnonymousClass8EO r8 = new AnonymousClass8EO(this.A0J, A012, userJid, r9);
        C29441ip r17 = this.A07;
        AnonymousClass5Y9 r15 = this.A0Y;
        AnonymousClass33p r7 = this.A09;
        C103115Lp r6 = this.A0s;
        C105035Th r5 = this.A0I;
        AnonymousClass5MK r4 = this.A0g;
        C154197cm r3 = this.A0N;
        int i = this.A01;
        AnonymousClass5MK r21 = r4;
        AnonymousClass8EO r22 = r8;
        C29441ip r23 = r17;
        C104095Pq r18 = this.A0O;
        AnonymousClass5Y9 r19 = r15;
        C105035Th r16 = r5;
        C154197cm r172 = r3;
        AnonymousClass4V5 r04 = (AnonymousClass4V5) AnonymousClass4L0.A0F(new C110715gu(r16, r172, r18, r19, Azv, r21, r22, r23, r7, userJid, r6, r9, i), this).A01(AnonymousClass4V5.class);
        this.A0k = r04;
        AnonymousClass6C6.A01(this, r04.A09, 23);
        AnonymousClass6C6.A01(this, this.A0k.A06, 24);
        AnonymousClass6C6.A01(this, this.A0k.A08, 25);
        AnonymousClass6C6.A01(this, this.A0k.A0F.A03, 26);
        C86604Kt.A1M(this, this.A0k.A0A, 39);
        boolean z = true;
        this.A0t.A07("view_product_tag", !this.A01.A0a(this.A0r), "IsConsumer");
        C105255Ue r2 = this.A0t;
        if (this.A0V == null) {
            z = false;
        }
        r2.A07("view_product_tag", z, "Cached");
        int i2 = this.A01;
        switch (i2) {
            case 1:
            case 7:
                str = "Message";
                break;
            case 2:
                str = "EditProduct";
                break;
            case 3:
                str = "Catalog";
                break;
            case 4:
                str = "ContactInfo";
                break;
            case 5:
                str = "Product";
                break;
            case 6:
                str = "Deeplink";
                break;
            case 8:
                str = "Cart";
                break;
            case 9:
                str = "Order";
                break;
            default:
                throw C86604Kt.A0h("ProductDetailActivity/startViewProductQpl/Unexpected value: ", AnonymousClass001.A0o(), i2);
        }
        this.A0t.A05("view_product_tag", "EntryPoint", str);
        this.A0W = this.A0X.A00();
        AnonymousClass7OY r42 = this.A0j;
        UserJid userJid2 = this.A0r;
        C162457s7.A0J(this.A10, 1);
        r42.A00 = userJid2;
        if (bundle == null) {
            C08240dc A0J2 = AnonymousClass0x2.A0J(this);
            A0J2.A0H = true;
            UserJid userJid3 = this.A0r;
            C162457s7.A0J(userJid3, 0);
            VariantsCarouselFragment variantsCarouselFragment = new VariantsCarouselFragment();
            Bundle A082 = AnonymousClass002.A08();
            A082.putParcelable("extra_product_owner_jid", userJid3);
            variantsCarouselFragment.A0u(A082);
            A0J2.A0D(variantsCarouselFragment, (String) null, R.id.catalog_variants_carousel_fragment);
            A0J2.A03();
        }
        FragmentContainerView fragmentContainerView = this.A0C;
        if (fragmentContainerView != null) {
            this.A0f = (VariantsCarouselFragment) fragmentContainerView.getFragment();
        }
        this.A0h.A00(this.A0r);
        C109015dw r05 = this.A0V;
        if (r05 != null && (r0 = r05.A0B) != null && (r02 = r0.A00) != null && (list = r02.A00) != null && list.isEmpty()) {
            C49732h0 r24 = this.A0h;
            r24.A01(new AnonymousClass43W(r24, true));
        }
    }

    public void onDestroy() {
        this.A0L.A07(this.A17);
        CatalogMediaCard catalogMediaCard = this.A0d;
        if (catalogMediaCard != null) {
            catalogMediaCard.A01();
        }
        this.A0Y.A0P.remove(this);
        C152967aS r0 = this.A0a;
        if (r0 != null) {
            r0.A00();
        }
        this.A0t.A06("view_product_tag", false);
        this.A0t.A06("cart_add_tag", false);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        MenuItem menuItem2 = menuItem;
        if (16908332 == menuItem2.getItemId()) {
            onBackPressed();
        } else if (R.id.menu_more_info == menuItem2.getItemId()) {
            if (!A6h()) {
                UserJid userJid = this.A0r;
                String str = this.A10;
                ProductMoreInfoFragment productMoreInfoFragment = new ProductMoreInfoFragment();
                Bundle A082 = AnonymousClass002.A08();
                A082.putParcelable("product_owner_jid", userJid);
                A082.putString("product_id", str);
                productMoreInfoFragment.A0u(A082);
                Boo(productMoreInfoFragment);
                return true;
            }
        } else if (R.id.menu_forward == menuItem2.getItemId()) {
            AnonymousClass4V5 r2 = this.A0k;
            int i = this.A00;
            C109015dw r1 = this.A0V;
            if (r2.A0E(r1, i)) {
                this.A0R.A01(this, this.A0a, (C95814uZ) null, this.A0r, Collections.singletonList(r1), 3, 0, 0);
                return true;
            }
        } else if (R.id.menu_share != menuItem2.getItemId()) {
            return super.onOptionsItemSelected(menuItem2);
        } else {
            UserJid userJid2 = this.A0r;
            String str2 = this.A10;
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.ShareProductLinkActivity");
            A072.setAction("android.intent.action.VIEW");
            AnonymousClass0x2.A0u(A072, userJid2, "jid");
            A072.putExtra("product_id", str2);
            startActivity(A072);
            return true;
        }
        return true;
    }

    public void updateButton(View view) {
        view.setVisibility(AnonymousClass001.A08(this.A0k.A0E(this.A0V, this.A00) ? 1 : 0));
    }

    public void onPause() {
        super.onPause();
        if (this.A07 != null) {
            this.A08.getViewTreeObserver().removeOnScrollChangedListener(this.A07);
        }
    }

    public void onResume() {
        super.onResume();
        A74();
        this.A0k.A0F.A00();
        if (this.A07 != null) {
            this.A08.getViewTreeObserver().addOnScrollChangedListener(this.A07);
        }
    }

    public void onStart() {
        super.onStart();
        A76(this.A10);
    }
}
