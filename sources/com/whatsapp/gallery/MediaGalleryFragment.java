package com.whatsapp.gallery;

import X.AnonymousClass0YZ;
import X.AnonymousClass319;
import X.AnonymousClass4FW;
import X.AnonymousClass665;
import X.AnonymousClass677;
import X.AnonymousClass8GZ;
import X.C106405Yw;
import X.C114205mf;
import X.C124166Bf;
import X.C186058ug;
import X.C29431io;
import X.C30471mV;
import X.C33141sV;
import X.C55832qz;
import X.C56532s8;
import X.C626936e;
import X.C66543Lv;
import X.C69993Zl;
import X.C72173dI;
import X.C86614Ku;
import X.C95294tG;
import X.C95814uZ;
import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.scroller.RecyclerFastScroller;
import java.util.Collection;
import java.util.Iterator;

public class MediaGalleryFragment extends Hilt_MediaGalleryFragment implements AnonymousClass665 {
    public C66543Lv A00;
    public AnonymousClass319 A01;
    public C29431io A02;
    public C95814uZ A03;
    public C55832qz A04;
    public C33141sV A05;
    public C72173dI A06;
    public final AnonymousClass4FW A07 = new C124166Bf(this, 13);

    public static /* synthetic */ void A00(MediaGalleryFragment mediaGalleryFragment, C114205mf r4, C95814uZ r5, Collection collection) {
        if (r4 != null) {
            if (collection != null && !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C95814uZ r1 = C86614Ku.A0h(it).A00;
                    if (r1 == null || !r1.equals(mediaGalleryFragment.A03)) {
                    }
                }
                return;
            } else if (r5 != null && !r5.equals(mediaGalleryFragment.A03)) {
                return;
            }
            r4.Bjj();
            mediaGalleryFragment.A0B.A0S(new C69993Zl(mediaGalleryFragment, 30));
        }
    }

    public boolean A1X(C186058ug r5, C95294tG r6) {
        C30471mV r3 = ((AnonymousClass8GZ) r5).A03;
        if (r3 == null) {
            return false;
        }
        boolean A1V = A1V();
        AnonymousClass677 r0 = (AnonymousClass677) A0Q();
        if (A1V) {
            r6.setChecked(r0.Bqw(r3));
            return true;
        }
        r0.Bpx(r3);
        r6.setChecked(true);
        return true;
    }

    public void A0a() {
        super.A0a();
        this.A02.A07(this.A07);
        C72173dI r0 = this.A06;
        if (r0 != null) {
            r0.A02();
            this.A06 = null;
        }
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        this.A06 = new C72173dI(this.A0V, false);
        C95814uZ A002 = C106405Yw.A00(A0R());
        C626936e.A06(A002);
        this.A03 = A002;
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A0C;
        if (stickyHeadersRecyclerView != null) {
            AnonymousClass0YZ.A0G(stickyHeadersRecyclerView, true);
        }
        AnonymousClass0YZ.A0G(A0J().findViewById(R.id.no_media), true);
        A1T(false);
        if (A0R() instanceof MediaGalleryActivity) {
            this.A0C.A0q(((MediaGalleryActivity) A0R()).A0m);
            ((RecyclerFastScroller) view.findViewById(R.id.scroller)).setAppBarLayout((CoordinatorLayout) A0R().findViewById(R.id.coordinator), (AppBarLayout) A0R().findViewById(R.id.appbar));
        }
        this.A02.A06(this.A07);
    }

    public void Bay(C56532s8 r1) {
    }

    public void BbA() {
        A1P();
    }
}
