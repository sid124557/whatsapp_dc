package com.whatsapp.newsletter.ui.directory.filter.country;

import X.AnonymousClass1VX;
import X.AnonymousClass4WG;
import X.AnonymousClass4XQ;
import X.AnonymousClass5Vo;
import X.AnonymousClass69F;
import X.AnonymousClass7I1;
import X.AnonymousClass7PH;
import X.C06560Yg;
import X.C139796sd;
import X.C162457s7;
import X.C49122g1;
import X.C86634Kw;
import X.C86654Ky;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.wds.components.search.WDSSearchView;

public final class CountrySelectorBottomSheet extends Hilt_CountrySelectorBottomSheet {
    public View A00;
    public RecyclerView A01;
    public AnonymousClass1VX A02;
    public C49122g1 A03;
    public AnonymousClass7I1 A04;
    public AnonymousClass4WG A05;
    public AnonymousClass4XQ A06;
    public WDSSearchView A07;
    public String A08 = "";

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String string;
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        Bundle bundle2 = this.A06;
        String str = "";
        if (!(bundle2 == null || (string = bundle2.getString("SELECTED_COUNTRY_ISO", str)) == null)) {
            str = string;
        }
        this.A08 = str;
        this.A01 = C86654Ky.A0P(inflate, R.id.country_list);
        this.A00 = C06560Yg.A02(inflate, R.id.country_no_results_view);
        WDSSearchView wDSSearchView = (WDSSearchView) C06560Yg.A02(inflate, R.id.search_bar);
        this.A07 = wDSSearchView;
        if (wDSSearchView != null) {
            wDSSearchView.setBackImageDrawableRes(R.drawable.vec_ic_nav_search);
        }
        WDSSearchView wDSSearchView2 = this.A07;
        if (wDSSearchView2 != null) {
            wDSSearchView2.setOnQueryTextChangeListener(new AnonymousClass69F(this, 2));
        }
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r11, android.view.View r12) {
        /*
            r10 = this;
            r7 = 0
            X.C162457s7.A0J(r12, r7)
            super.A0w(r11, r12)
            X.4XQ r0 = new X.4XQ
            r0.<init>(r10)
            r10.A06 = r0
            X.4WG r1 = new X.4WG
            r1.<init>(r10)
            X.4XQ r0 = r10.A06
            if (r0 == 0) goto L_0x001a
            r1.BiZ(r0)
        L_0x001a:
            r10.A05 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r10.A01
            if (r0 == 0) goto L_0x0023
            r0.setAdapter(r1)
        L_0x0023:
            androidx.recyclerview.widget.RecyclerView r0 = r10.A01
            if (r0 == 0) goto L_0x002a
            X.C18270x1.A0u(r0)
        L_0x002a:
            X.0XL r1 = X.AnonymousClass0x9.A0H(r10)
            java.lang.Class<com.whatsapp.countries.CountryListViewModel> r0 = com.whatsapp.countries.CountryListViewModel.class
            X.0Ty r6 = r1.A01(r0)
            com.whatsapp.countries.CountryListViewModel r6 = (com.whatsapp.countries.CountryListViewModel) r6
            java.lang.String r8 = r10.A08
            X.1VX r1 = r10.A02
            if (r1 == 0) goto L_0x0112
            r0 = 1777(0x6f1, float:2.49E-42)
            boolean r9 = r1.A0X(r0)
            X.5Zy r2 = r6.A03
            X.33j r1 = r6.A02
            java.util.Locale r0 = X.C620733j.A02(r1)
            java.lang.String r0 = X.C162307rf.A04(r0)
            java.util.List r5 = r2.A03(r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0062
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = X.C162307rf.A04(r0)
            java.util.List r5 = r2.A03(r0)
        L_0x0062:
            java.util.Locale r1 = X.C620733j.A02(r1)
            X.5sS r0 = new X.5sS
            r0.<init>(r1)
            java.util.Collections.sort(r5, r0)
            java.lang.String r4 = "N/A"
            r3 = 0
            if (r9 == 0) goto L_0x00d7
            java.lang.String r1 = r6.A04
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x00d7
            X.7IS r0 = new X.7IS
            r0.<init>(r1, r1)
            r5.add(r7, r0)
        L_0x0083:
            java.util.ArrayList r7 = X.AnonymousClass000.A0p(r5)
        L_0x0087:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x0102
            java.lang.Object r8 = r5.get(r3)
            X.7IS r8 = (X.AnonymousClass7IS) r8
            X.5Xx r1 = r6.A01
            java.lang.String r0 = r8.A00
            X.5Ow r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = r8.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r1 = r6.A04
            java.lang.String r0 = r8.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CountryListViewModel saw unknown country "
            r1.append(r0)
            java.lang.String r0 = r8.A00
            r1.append(r0)
            java.lang.String r0 = "="
            r1.append(r0)
            java.lang.String r0 = r8.A01
            X.C18260x0.A1M(r1, r0)
        L_0x00c7:
            int r3 = r3 + 1
            goto L_0x0087
        L_0x00ca:
            java.lang.String r2 = r8.A01
            java.lang.String r1 = r8.A00
            X.7Kl r0 = new X.7Kl
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x00c7
        L_0x00d7:
            java.util.Iterator r1 = r5.iterator()
        L_0x00db:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r2 = r1.next()
            X.7IS r2 = (X.AnonymousClass7IS) r2
            java.lang.String r0 = r2.A00
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00db
            r1.remove()
            if (r9 == 0) goto L_0x00fe
            java.lang.String r1 = r6.A04
            X.7IS r0 = new X.7IS
            r0.<init>(r1, r1)
            r5.add(r7, r0)
        L_0x00fe:
            r5.add(r7, r2)
            goto L_0x0083
        L_0x0102:
            X.08M r2 = r6.A00
            r2.A0H(r7)
            X.627 r1 = new X.627
            r1.<init>(r10)
            r0 = 291(0x123, float:4.08E-43)
            X.C86604Kt.A1N(r10, r2, r1, r0)
            return
        L_0x0112:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet.A0w(android.os.Bundle, android.view.View):void");
    }

    public void A1W(AnonymousClass5Vo r3) {
        C162457s7.A0J(r3, 0);
        C139796sd r0 = C139796sd.A00;
        AnonymousClass7PH r1 = r3.A00;
        r1.A04 = r0;
        r1.A02 = C86634Kw.A0J().heightPixels / 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDismiss(android.content.DialogInterface r4) {
        /*
            r3 = this;
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            super.onDismiss(r4)
            X.7I1 r0 = r3.A04
            if (r0 == 0) goto L_0x0018
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r0 = r0.A00
            X.4Wr r2 = r0.A0D
            if (r2 == 0) goto L_0x0018
            X.59R r1 = r0.A0E
            java.lang.String r0 = r0.A0K
            r2.A0K(r1, r0)
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet.onDismiss(android.content.DialogInterface):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0d() {
        /*
            r4 = this;
            super.A0d()
            X.4WG r0 = r4.A05
            if (r0 == 0) goto L_0x0010
            X.4XQ r1 = r4.A06
            if (r1 == 0) goto L_0x0010
            X.00r r0 = r0.A01
            r0.unregisterObserver(r1)
        L_0x0010:
            r3 = 0
            r4.A01 = r3
            X.7I1 r0 = r4.A04
            if (r0 == 0) goto L_0x0024
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r0 = r0.A00
            X.4Wr r2 = r0.A0D
            if (r2 == 0) goto L_0x0024
            X.59R r1 = r0.A0E
            java.lang.String r0 = r0.A0K
            r2.A0K(r1, r0)
        L_0x0024:
            r4.A04 = r3
            r4.A07 = r3
            r4.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet.A0d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0h() {
        /*
            r3 = this;
            super.A0h()
            X.7I1 r0 = r3.A04
            if (r0 == 0) goto L_0x0014
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r0 = r0.A00
            X.4Wr r2 = r0.A0D
            if (r2 == 0) goto L_0x0014
            X.59R r1 = r0.A0E
            java.lang.String r0 = r0.A0K
            r2.A0K(r1, r0)
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet.A0h():void");
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }
}
