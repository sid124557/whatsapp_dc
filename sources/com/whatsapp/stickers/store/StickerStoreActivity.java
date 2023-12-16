package com.whatsapp.stickers.store;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0YH;
import X.AnonymousClass1Fr;
import X.AnonymousClass4TX;
import X.AnonymousClass5T2;
import X.AnonymousClass69C;
import X.AnonymousClass6C2;
import X.C002002f;
import X.C08310eF;
import X.C107335b8;
import X.C109675f0;
import X.C110765h0;
import X.C117635sF;
import X.C1232167o;
import X.C620733j;
import X.C86644Kx;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;

public class StickerStoreActivity extends AnonymousClass1Fr {
    public View A00;
    public ViewPager A01;
    public BottomSheetBehavior A02;
    public TabLayout A03;
    public C620733j A04;
    public AnonymousClass4TX A05;
    public StickerStoreFeaturedTabFragment A06;
    public StickerStoreMyTabFragment A07;

    public final void A74(C08310eF r3, int i) {
        this.A05.A00.add(r3);
        TabLayout tabLayout = this.A03;
        AnonymousClass5T2 A042 = tabLayout.A04();
        A042.A01(i);
        tabLayout.A0E(A042);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == 1 && this.A05 != null) {
            this.A01.postDelayed(new C117635sF(this, 27), 300);
        }
    }

    public void onCreate(Bundle bundle) {
        C08310eF r1;
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        View view = this.A00;
        this.A00 = view;
        View findViewById = view.findViewById(R.id.store_container);
        this.A03 = (TabLayout) this.A00.findViewById(R.id.sticker_store_tabs);
        this.A01 = (ViewPager) this.A00.findViewById(R.id.sticker_store_pager);
        this.A05 = new AnonymousClass4TX(getSupportFragmentManager());
        this.A06 = new StickerStoreFeaturedTabFragment();
        this.A07 = new StickerStoreMyTabFragment();
        this.A06.A07 = AnonymousClass000.A1X(bundle);
        AnonymousClass0YH.A06(this.A03, 0);
        if (C620733j.A04(this.A04)) {
            A74(this.A06, R.string.f11nameremoved);
            r1 = this.A07;
            i = R.string.f11nameremoved;
        } else {
            A74(this.A07, R.string.f11nameremoved);
            r1 = this.A06;
            i = R.string.f11nameremoved;
        }
        A74(r1, i);
        this.A01.setAdapter(this.A05);
        this.A01.A0G(new C110765h0(this.A03));
        this.A01.A0G(new AnonymousClass69C(this, 2));
        this.A01.A0F(C620733j.A04(this.A04) ^ true ? 1 : 0, false);
        this.A03.A0D(new AnonymousClass6C2(this, 2));
        Toolbar A0K = C86644Kx.A0K(findViewById);
        C107335b8.A0D(this, A0K, this.A04, R.color.f5nameremoved);
        A0K.setNavigationContentDescription((int) R.string.f11nameremoved);
        A0K.setTitle((int) R.string.f11nameremoved);
        A0K.setNavigationOnClickListener(new C109675f0((Object) this, 10));
        AnonymousClass3 r0 = new BottomSheetBehavior() {
        };
        this.A02 = r0;
        r0.A0d(true);
        this.A02.A0S(4);
        this.A02.A0p = true;
        C002002f A0W = AnonymousClass001.A0W(findViewById);
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        A0W.A01(bottomSheetBehavior);
        C1232167o.A00(bottomSheetBehavior, this, 13);
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0O == 4) {
            this.A00.post(new C117635sF(this, 26));
        }
    }
}
