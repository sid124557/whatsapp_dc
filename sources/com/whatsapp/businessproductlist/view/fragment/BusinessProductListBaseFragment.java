package com.whatsapp.businessproductlist.view.fragment;

import X.AnonymousClass2UT;
import X.AnonymousClass4FS;
import X.AnonymousClass5UW;
import X.AnonymousClass66R;
import X.AnonymousClass8VQ;
import X.C103115Lp;
import X.C105145Tt;
import X.C105405Uu;
import X.C106875aJ;
import X.C118965wD;
import X.C118975wE;
import X.C125216Gu;
import X.C141776w7;
import X.C152967aS;
import X.C154517dI;
import X.C162457s7;
import X.C170848Et;
import X.C181728nE;
import X.C181798nL;
import X.C181878nU;
import X.C182058nn;
import X.C18270x1;
import X.C184108rG;
import X.C189028zs;
import X.C189038zt;
import X.C29201iR;
import X.C29221iT;
import X.C50642iX;
import X.C620733j;
import X.C90254gy;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class BusinessProductListBaseFragment extends Hilt_BusinessProductListBaseFragment {
    public RecyclerView A00;
    public C29201iR A01;
    public AnonymousClass5UW A02;
    public C181728nE A03;
    public C29221iT A04;
    public C105405Uu A05;
    public C105145Tt A06;
    public C152967aS A07;
    public C181798nL A08;
    public C90254gy A09;
    public C141776w7 A0A = C141776w7.PLM;
    public C182058nn A0B;
    public C620733j A0C;
    public UserJid A0D;
    public C103115Lp A0E;
    public AnonymousClass4FS A0F;
    public WDSButton A0G;
    public final AnonymousClass2UT A0H = new C189028zs(this, 5);
    public final C50642iX A0I = new C189038zt(this, 3);
    public final C181878nU A0J = new C170848Et();
    public final C184108rG A0K = new C106875aJ(this, 3);
    public final AnonymousClass66R A0L = C154517dI.A01(new C118965wD(this));
    public final AnonymousClass66R A0M = C154517dI.A01(new C118975wE(this));
    public final AnonymousClass66R A0N = C154517dI.A01(new AnonymousClass8VQ(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.product_list);
        C162457s7.A0K(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.A00 = (RecyclerView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.view_cart_button);
        C162457s7.A0K(findViewById2, "null cannot be cast to non-null type com.whatsapp.wds.components.button.WDSButton");
        this.A0G = (WDSButton) findViewById2;
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r0v29, types: [X.4gy] */
    /* JADX WARNING: type inference failed for: r11v3, types: [X.4iP] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r30, android.view.View r31) {
        /*
            r29 = this;
            r0 = 0
            r1 = r31
            X.C162457s7.A0J(r1, r0)
            r2 = r29
            boolean r0 = r2 instanceof com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment
            if (r0 == 0) goto L_0x00e1
            r4 = r2
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment r4 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment) r4
            X.7CI r0 = r4.A00
            if (r0 == 0) goto L_0x015a
            com.whatsapp.jid.UserJid r20 = r4.A1L()
            X.8rG r5 = r4.A0K
            X.8Eu r3 = new X.8Eu
            r3.<init>(r4)
            X.5sv r6 = r0.A00
            X.3Db r0 = r6.A04
            X.3Wi r8 = X.C64333Db.A04(r0)
            X.2sr r9 = X.C64333Db.A06(r0)
            X.5hX r7 = X.C64333Db.A00(r0)
            X.4C1 r1 = r0.A4Y
            java.lang.Object r1 = r1.get()
            X.5Y9 r1 = (X.AnonymousClass5Y9) r1
            X.3Ex r15 = X.C64333Db.A26(r0)
            X.5ZU r17 = X.C64333Db.A28(r0)
            X.33j r18 = X.C64333Db.A2t(r0)
            X.2rx r16 = X.C86614Ku.A0T(r0)
            X.4as r6 = r6.A01
            X.7aS r11 = r6.ABV()
            X.1VX r19 = X.C64333Db.A4B(r0)
            X.5Tb r12 = r0.AhS()
            com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter r0 = new com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter
            r13 = r3
            r14 = r5
            r10 = r1
            r5 = r0
            r6 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x005e:
            r2.A09 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r2.A00
            X.C162457s7.A0H(r1)
            X.4gy r0 = r2.A1K()
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A00
            X.C162457s7.A0H(r1)
            r0 = 5
            X.C1231767k.A00(r1, r2, r0)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A00
            X.C162457s7.A0H(r1)
            r0 = 0
            r1.setItemAnimator(r0)
            X.66R r5 = r2.A0L
            java.lang.Object r0 = r5.getValue()
            X.6Gu r0 = (X.C125216Gu) r0
            X.0Wx r4 = r0.A01
            X.0sA r3 = r2.A0V()
            X.60D r1 = new X.60D
            r1.<init>(r2)
            r0 = 109(0x6d, float:1.53E-43)
            X.C86604Kt.A1N(r3, r4, r1, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A0G
            X.C162457s7.A0H(r1)
            r0 = 44
            X.C989453v.A00(r1, r2, r0)
            X.1iR r1 = r2.A01
            if (r1 == 0) goto L_0x0153
            X.2UT r0 = r2.A0H
            r1.A06(r0)
            java.lang.Object r0 = r5.getValue()
            X.6Gu r0 = (X.C125216Gu) r0
            X.0Wx r4 = r0.A00
            X.0sA r3 = r2.A0V()
            X.60B r1 = new X.60B
            r1.<init>(r2)
            r0 = 107(0x6b, float:1.5E-43)
            X.C86604Kt.A1N(r3, r4, r1, r0)
            X.66R r5 = r2.A0M
            java.lang.Object r0 = r5.getValue()
            X.4Ty r0 = (X.C87604Ty) r0
            X.08M r4 = r0.A00
            X.0sA r3 = r2.A0V()
            X.60C r1 = new X.60C
            r1.<init>(r2)
            r0 = 108(0x6c, float:1.51E-43)
            X.C86604Kt.A1N(r3, r4, r1, r0)
            java.lang.Object r0 = r5.getValue()
            X.4Ty r0 = (X.C87604Ty) r0
            r0.A0E()
            return
        L_0x00e1:
            r14 = r2
            com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment r14 = (com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment) r14
            X.1VX r13 = r14.A0B
            if (r13 == 0) goto L_0x01a7
            X.5hX r12 = r14.A01
            if (r12 == 0) goto L_0x01a0
            X.5Y9 r11 = r14.A06
            if (r11 == 0) goto L_0x0199
            X.3Ex r10 = r14.A08
            if (r10 == 0) goto L_0x0192
            X.3Wi r9 = r14.A02
            if (r9 == 0) goto L_0x018b
            X.2sr r8 = r14.A03
            if (r8 == 0) goto L_0x0184
            X.2rx r7 = r14.A09
            if (r7 == 0) goto L_0x017d
            X.5ZU r6 = r14.A0A
            if (r6 == 0) goto L_0x0176
            X.33j r5 = r14.A0C
            if (r5 == 0) goto L_0x016f
            X.8rG r0 = r14.A0K
            r17 = r0
            X.8nU r0 = r14.A0J
            r16 = r0
            X.5Tb r4 = r14.A07
            if (r4 == 0) goto L_0x0168
            java.lang.String r15 = r14.A0F
            java.lang.String r28 = r14.A1O()
            int r3 = r14.A00
            r1 = -1
            r0 = 897451937(0x357e07a1, float:9.4633475E-7)
            if (r3 == r1) goto L_0x0125
            r0 = 897451370(0x357e056a, float:9.463025E-7)
        L_0x0125:
            X.7Cg r3 = new X.7Cg
            r3.<init>(r0)
            X.7aS r1 = r14.A07
            if (r1 == 0) goto L_0x0161
            com.whatsapp.jid.UserJid r26 = r14.A1L()
            X.4iP r0 = new X.4iP
            r23 = r6
            r24 = r5
            r25 = r13
            r27 = r15
            r18 = r4
            r19 = r16
            r20 = r17
            r21 = r10
            r22 = r7
            r13 = r9
            r14 = r8
            r15 = r11
            r16 = r3
            r17 = r1
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x005e
        L_0x0153:
            java.lang.String r0 = "cartObservers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x015a:
            java.lang.String r0 = "adapterFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0161:
            java.lang.String r0 = "loadSession"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0168:
            java.lang.String r0 = "catalogFeaturesEnableManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x016f:
            java.lang.String r0 = "whatsAppLocale"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0176:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x017d:
            java.lang.String r0 = "verifiedNameManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0184:
            java.lang.String r0 = "meManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x018b:
            java.lang.String r0 = "globalUI"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0192:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0199:
            java.lang.String r0 = "catalogManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01a0:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01a7:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment.A0w(android.os.Bundle, android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0eF] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1G(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            super.A1G(r4)
            boolean r0 = r4 instanceof X.C182058nn
            r2 = 0
            if (r0 == 0) goto L_0x0030
            r0 = r4
            X.8nn r0 = (X.C182058nn) r0
        L_0x000f:
            r3.A0B = r0
            if (r0 != 0) goto L_0x0032
            X.0eF r1 = r3.A0E
            boolean r0 = r1 instanceof X.C182058nn
            if (r0 == 0) goto L_0x001c
            r2 = r1
            X.8nn r2 = (X.C182058nn) r2
        L_0x001c:
            r3.A0B = r2
            if (r2 != 0) goto L_0x0032
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r4)
            java.lang.String r0 = " must implement BusinessProductListBaseFragment.BusinessProductListHost"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            r0 = r2
            goto L_0x000f
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment.A1G(android.content.Context):void");
    }

    public void A0a() {
        C152967aS r0 = this.A07;
        if (r0 != null) {
            r0.A00();
            C29201iR r1 = this.A01;
            if (r1 != null) {
                r1.A07(this.A0H);
                C29221iT r12 = this.A04;
                if (r12 != null) {
                    r12.A07(this.A0I);
                    super.A0a();
                    return;
                }
                throw C18270x1.A0S("productObservers");
            }
            throw C18270x1.A0S("cartObservers");
        }
        throw C18270x1.A0S("loadSession");
    }

    public final C105405Uu A1J() {
        C105405Uu r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("catalogCacheManager");
    }

    public final C90254gy A1K() {
        C90254gy r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("adapter");
    }

    public final UserJid A1L() {
        UserJid userJid = this.A0D;
        if (userJid != null) {
            return userJid;
        }
        throw C18270x1.A0S("bizJid");
    }

    public final void A1N(boolean z) {
        WDSButton wDSButton;
        int i;
        if (!z || A1K().A08.isEmpty()) {
            wDSButton = this.A0G;
            C162457s7.A0H(wDSButton);
            i = 8;
        } else {
            wDSButton = this.A0G;
            C162457s7.A0H(wDSButton);
            i = 0;
        }
        wDSButton.setVisibility(i);
    }

    public void A0d() {
        super.A0d();
        this.A0B = null;
    }

    public void A0f() {
        super.A0f();
        ((C125216Gu) this.A0L.getValue()).A02.A00();
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A13(true);
        Bundle A0H2 = A0H();
        Parcelable parcelable = A0H2.getParcelable("category_biz_id");
        C162457s7.A0H(parcelable);
        UserJid userJid = (UserJid) parcelable;
        C162457s7.A0J(userJid, 0);
        this.A0D = userJid;
        this.A0A = C141776w7.values()[A0H2.getInt("business_product_list_entry_point")];
        C29221iT r1 = this.A04;
        if (r1 != null) {
            r1.A06(this.A0I);
            return;
        }
        throw C18270x1.A0S("productObservers");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r1.canScrollVertically(1) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M() {
        /*
            r3 = this;
            android.view.View r1 = r3.A0J()
            r0 = 2131433683(0x7f0b18d3, float:1.8489159E38)
            android.view.View r2 = X.C18290x4.A0M(r1, r0)
            X.4gy r0 = r3.A1K()
            java.util.List r0 = r0.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0024
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            X.C162457s7.A0H(r1)
            r0 = 1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            r0 = 8
        L_0x0026:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment.A1M():void");
    }
}
