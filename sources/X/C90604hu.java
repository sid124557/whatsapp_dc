package X;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businesscollection.view.activity.CollectionProductListActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Objects;

/* renamed from: X.4hu  reason: invalid class name and case insensitive filesystem */
public abstract class C90604hu extends C131786eB {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public C620433g A03;
    public C29201iR A04;
    public AnonymousClass5UW A05;
    public C154197cm A06;
    public C104095Pq A07;
    public C181728nE A08;
    public C87604Ty A09;
    public C29221iT A0A;
    public C105405Uu A0B;
    public AnonymousClass5QB A0C;
    public C105145Tt A0D;
    public AnonymousClass5Y9 A0E;
    public C152967aS A0F;
    public C181798nL A0G;
    public C87594Tr A0H;
    public C90254gy A0I;
    public C64773Ex A0J;
    public C56422rx A0K;
    public AnonymousClass5ZU A0L;
    public C53202mi A0M;
    public UserJid A0N;
    public C103115Lp A0O;
    public C105255Ue A0P;
    public WDSButton A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public final AnonymousClass2UT A0V = new C189028zs(this, 4);
    public final C50642iX A0W = new C189038zt(this, 2);

    public final void A74() {
        WDSButton wDSButton;
        int i;
        C87594Tr r3 = this.A0H;
        C18290x4.A1M(r3.A08, r3, this.A0N, 38);
        if (this.A0I.A08.isEmpty() || !this.A0I.B5J()) {
            wDSButton = this.A0Q;
            i = 8;
        } else {
            wDSButton = this.A0Q;
            i = 0;
        }
        wDSButton.setVisibility(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        Intent intent = getIntent();
        this.A0N = C86624Kv.A0U(intent.getStringExtra("cache_jid"));
        this.A0S = C86664Kz.A1J(intent, "collection_id");
        this.A0U = C86664Kz.A1J(intent, "collection_name");
        this.A0T = intent.getStringExtra("collection_index");
        this.A00 = intent.getIntExtra("category_browsing_entry_point", -1);
        this.A01 = intent.getIntExtra("category_level", -1);
        if (!this.A0S.equals("catalog_products_all_items_collection_id")) {
            this.A0P.A02(774780089, "view_collection_details_tag", "CollectionProductListBaseActivity");
            boolean z = true;
            this.A0P.A07("view_collection_details_tag", !this.A01.A0a(this.A0N), "IsConsumer");
            C105255Ue r4 = this.A0P;
            if (this.A0B.A06(this.A0N, this.A0S) == null) {
                z = false;
            }
            r4.A07("view_collection_details_tag", z, "Cached");
        }
        WDSButton wDSButton = (WDSButton) findViewById(R.id.view_cart);
        this.A0Q = wDSButton;
        C18290x4.A1H(wDSButton, this, 22);
        String str = this.A0U;
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            if (str != null) {
                supportActionBar.A0J(str);
            }
        }
        this.A02 = (RecyclerView) findViewById(R.id.product_list);
        CollectionProductListActivity collectionProductListActivity = (CollectionProductListActivity) this;
        AnonymousClass1VX r19 = collectionProductListActivity.A0D;
        C111095hX r31 = collectionProductListActivity.A00;
        AnonymousClass5Y9 r18 = collectionProductListActivity.A0E;
        C64773Ex r17 = collectionProductListActivity.A0J;
        C69263Wi r30 = collectionProductListActivity.A05;
        C56972sr r16 = collectionProductListActivity.A01;
        C56422rx r15 = collectionProductListActivity.A0K;
        AnonymousClass5ZU r14 = collectionProductListActivity.A0L;
        C620733j r13 = collectionProductListActivity.A00;
        C106875aJ r12 = new C106875aJ(collectionProductListActivity, 2);
        C112045j6 r10 = new C112045j6(collectionProductListActivity);
        C104975Tb r8 = collectionProductListActivity.A01;
        String str2 = collectionProductListActivity.A0T;
        String str3 = collectionProductListActivity.A0S;
        int i = 897451937;
        if (collectionProductListActivity.A00 != -1) {
            i = 897451370;
        }
        C146957Cg r5 = new C146957Cg(i);
        C111095hX r132 = r31;
        C69263Wi r142 = r30;
        collectionProductListActivity.A0I = new C90844iP(r132, r142, r16, r18, r5, collectionProductListActivity.A0F, r8, r10, r12, r17, r15, r14, r13, r19, collectionProductListActivity.A0N, str2, str3);
        this.A02.setAdapter(this.A0I);
        RecyclerView recyclerView = this.A02;
        recyclerView.A0W = new AnonymousClass93K(2);
        C18270x1.A0u(recyclerView);
        AnonymousClass0UY r3 = this.A02.A0R;
        if (r3 instanceof AnonymousClass09N) {
            ((AnonymousClass09N) r3).A00 = false;
        }
        this.A0A.A06(this.A0W);
        this.A09 = (C87604Ty) C86604Kt.A0L(this, this.A08, this.A0N);
        UserJid userJid = this.A0N;
        Application application = getApplication();
        AnonymousClass5Y9 r7 = this.A0E;
        C104325Qn Azv = this.A0G.Azv(this.A0N);
        C103115Lp r102 = this.A0O;
        this.A0H = (C87594Tr) AnonymousClass4L0.A0F(new C110705gt(application, this.A06, this.A07, r7, Azv, userJid, r102, this.A04), this).A01(C87594Tr.class);
        this.A04.A06(this.A0V);
        AnonymousClass6C6.A01(this, this.A0H.A05.A03, 34);
        AnonymousClass6C6.A01(this, this.A0H.A04.A03, 35);
        AnonymousClass08M r42 = this.A0H.A04.A05;
        C90254gy r32 = this.A0I;
        Objects.requireNonNull(r32);
        C86604Kt.A1N(this, r42, r32, 70);
        C86604Kt.A1M(this, this.A0H.A01, 71);
        C87594Tr r6 = this.A0H;
        r6.A04.A01(r6.A00, this.A0N, this.A0S, AnonymousClass001.A1X(this.A00, -1));
        C1231767k.A00(this.A02, this, 3);
    }

    public void onDestroy() {
        this.A04.A07(this.A0V);
        this.A0A.A07(this.A0W);
        this.A0F.A00();
        this.A0E.A05.A0H(Boolean.FALSE);
        this.A0P.A06("view_collection_details_tag", false);
        super.onDestroy();
    }

    public void onResume() {
        this.A0H.A05.A00();
        super.onResume();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3.A02.canScrollVertically(1) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.C90604hu r3) {
        /*
            r0 = 2131433683(0x7f0b18d3, float:1.8489159E38)
            android.view.View r2 = r3.findViewById(r0)
            X.4gy r0 = r3.A0I
            java.util.List r0 = r0.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView r1 = r3.A02
            r0 = 1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            r0 = 8
        L_0x001d:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90604hu.A0C(X.4hu):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setVisible(false);
        C989453v.A00(AnonymousClass4SG.A2Q(findItem), this, 34);
        TextView A092 = AnonymousClass002.A09(findItem.getActionView(), R.id.cart_total_quantity);
        String str = this.A0R;
        if (str != null) {
            A092.setText(str);
        }
        this.A09.A00.A0B(this, new C1897692o(findItem, 0, this));
        this.A09.A0E();
        return super.onCreateOptionsMenu(menu);
    }
}
