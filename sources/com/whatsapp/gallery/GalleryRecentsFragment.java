package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0GC;
import X.AnonymousClass0x9;
import X.AnonymousClass45G;
import X.AnonymousClass5YF;
import X.AnonymousClass5ZS;
import X.AnonymousClass8OF;
import X.AnonymousClass8PL;
import X.AnonymousClass8ZA;
import X.C08310eF;
import X.C106105Xq;
import X.C13760nh;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C185038sx;
import X.C185448tf;
import X.C186058ug;
import X.C56612sH;
import X.C58392vB;
import X.C620733j;
import X.C69263Wi;
import X.C72623e1;
import X.C73723fy;
import X.C86604Kt;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C87884Wm;
import X.C88084Xg;
import X.C95294tG;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GalleryRecentsFragment extends Hilt_GalleryRecentsFragment implements C185448tf, C185038sx {
    public int A00;
    public AnonymousClass5ZS A01;
    public C56612sH A02;
    public GalleryTabHostFragment A03;
    public C88084Xg A04;
    public C58392vB A05;
    public boolean A06;
    public final List A07 = AnonymousClass001.A0s();
    public final Map A08 = C18320x8.A0r();

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        this.A00 = C86664Kz.A0I(A1L());
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A0C;
        if (stickyHeadersRecyclerView != null) {
            C86604Kt.A0z(view.getContext(), stickyHeadersRecyclerView, R.color.f5nameremoved);
        }
        BiW();
        C88084Xg r1 = new C88084Xg(this);
        this.A04 = r1;
        StickyHeadersRecyclerView stickyHeadersRecyclerView2 = this.A0C;
        if (stickyHeadersRecyclerView2 != null) {
            stickyHeadersRecyclerView2.A14.add(r1);
        }
    }

    public final void A1Y() {
        ViewGroup viewGroup;
        int i;
        String str;
        GalleryTabHostFragment galleryTabHostFragment = this.A03;
        if (galleryTabHostFragment != null) {
            Set A0P = C73723fy.A0P(C73723fy.A0C(this.A08.values()));
            C162457s7.A0J(A0P, 0);
            Toolbar toolbar = galleryTabHostFragment.A03;
            if (toolbar != null) {
                if (C18310x6.A1X(A0P)) {
                    galleryTabHostFragment.A1S(true);
                    C620733j r5 = galleryTabHostFragment.A0B;
                    if (r5 != null) {
                        long size = (long) A0P.size();
                        Object[] objArr = new Object[1];
                        AnonymousClass000.A1P(objArr, A0P.size(), 0);
                        str = r5.A0L(objArr, R.plurals.f9nameremoved, size);
                    } else {
                        throw C18270x1.A0S("whatsAppLocale");
                    }
                } else {
                    galleryTabHostFragment.A1S(galleryTabHostFragment.A1V());
                    Bundle bundle = galleryTabHostFragment.A06;
                    if (bundle != null) {
                        str = bundle.getString("gallery_picker_title");
                    } else {
                        str = null;
                    }
                }
                toolbar.setTitle((CharSequence) str);
            }
            int A082 = AnonymousClass001.A08(C18310x6.A1X(A0P) ? 1 : 0);
            ViewGroup viewGroup2 = galleryTabHostFragment.A02;
            if ((viewGroup2 == null || viewGroup2.getVisibility() != A082) && (viewGroup = galleryTabHostFragment.A02) != null) {
                viewGroup.setVisibility(A082);
            }
            C87884Wm r1 = (C87884Wm) galleryTabHostFragment.A0K.getValue();
            C86644Kx.A1F(r1, A0P, r1.A02);
            ViewPager viewPager = galleryTabHostFragment.A05;
            if (viewPager != null) {
                i = viewPager.getCurrentItem();
            } else {
                i = 0;
            }
            galleryTabHostFragment.A1P(i);
        }
        A1R(this.A08.size());
        A1P();
    }

    public void BCe(C106105Xq r5, Collection collection) {
        C106105Xq r3 = new C106105Xq();
        collection.clear();
        Iterator A0q = AnonymousClass000.A0q(this.A08);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            collection.add(A0w.getKey());
            r3.A04(new AnonymousClass5YF((Uri) A0w.getKey()));
        }
        Map map = r3.A00;
        map.clear();
        map.putAll(r5.A00);
    }

    public boolean BKt() {
        return C18280x3.A1U(this.A08.size(), this.A00);
    }

    public void BiW() {
        if (this.A0L.A02.A00(AnonymousClass0GC.CREATED)) {
            A1T(false);
        }
    }

    public void Bl8(C186058ug r3) {
        Map map = this.A08;
        Uri B3d = r3.B3d();
        C162457s7.A0D(B3d);
        if (!map.containsKey(B3d)) {
            A1Z(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5.containsAll(r12) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BnK(X.C106105Xq r11, java.util.Collection r12, java.util.Collection r13) {
        /*
            r10 = this;
            java.util.List r5 = r10.A07
            int r1 = r5.size()
            int r0 = r12.size()
            if (r1 != r0) goto L_0x0013
            boolean r0 = r5.containsAll(r12)
            r9 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r9 = 0
        L_0x0014:
            java.util.Map r4 = r10.A08
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0025
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0025
            if (r9 == 0) goto L_0x0025
            return
        L_0x0025:
            java.util.LinkedHashMap r6 = X.C18320x8.A0r()
            java.util.Iterator r2 = X.AnonymousClass000.A0q(r4)
        L_0x002d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0045
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r2)
            java.lang.Object r0 = r1.getKey()
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x002d
            X.C18270x1.A1N(r6, r1)
            goto L_0x002d
        L_0x0045:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r6)
            java.util.Iterator r8 = r13.iterator()
        L_0x004e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r6 = r8.next()
            boolean r0 = r3.containsKey(r6)
            if (r0 != 0) goto L_0x004e
            X.5ZS r0 = r10.A01
            if (r0 == 0) goto L_0x00ab
            X.5Qv r2 = r0.A0i
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0088
            java.util.List r0 = r2.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x006e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r7 = r1.next()
            X.8ug r7 = (X.C186058ug) r7
            android.net.Uri r0 = r7.B3d()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x006e
        L_0x0084:
            r3.put(r6, r7)
            goto L_0x004e
        L_0x0088:
            X.8v5 r0 = r2.A02
            if (r0 == 0) goto L_0x00ab
            r1 = 0
        L_0x008d:
            X.8v5 r0 = r2.A02
            int r0 = r0.getCount()
            if (r1 >= r0) goto L_0x00ab
            X.8v5 r0 = r2.A02
            X.8ug r7 = r0.B9S(r1)
            if (r7 == 0) goto L_0x00a8
            android.net.Uri r0 = r7.B3d()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00a8
            goto L_0x0084
        L_0x00a8:
            int r1 = r1 + 1
            goto L_0x008d
        L_0x00ab:
            r7 = 0
            goto L_0x0084
        L_0x00ad:
            r4.clear()
            r4.putAll(r3)
            if (r9 != 0) goto L_0x00be
            r5.clear()
            r5.addAll(r12)
            r10.BiW()
        L_0x00be:
            r10.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryRecentsFragment.BnK(X.5Xq, java.util.Collection, java.util.Collection):void");
    }

    public void Bos() {
        Toast toast = this.A09;
        if (toast != null) {
            toast.cancel();
        }
        C69263Wi A1J = A1J();
        Resources A09 = C08310eF.A09(this);
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, this.A00);
        Toast A0C = A1J.A0C(A09.getString(R.string.f11nameremoved, A0L));
        A0C.show();
        this.A09 = A0C;
    }

    public void BrQ(C186058ug r3) {
        Map map = this.A08;
        Uri B3d = r3.B3d();
        C162457s7.A0D(B3d);
        if (map.containsKey(B3d)) {
            A1Z(r3);
        }
    }

    public void A0c() {
        super.A0c();
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A0C;
        if (stickyHeadersRecyclerView != null) {
            AnonymousClass8OF r2 = new AnonymousClass8OF(new AnonymousClass8PL(AnonymousClass45G.A00, new C72623e1(AnonymousClass8ZA.A00, new C13760nh(stickyHeadersRecyclerView)), false));
            while (r2.hasNext()) {
                ((ImageView) r2.next()).setImageDrawable((Drawable) null);
            }
        }
    }

    public void A0g() {
        super.A0g();
        A1Y();
    }

    public void A1S(C186058ug r4, C95294tG r5) {
        if (A1V()) {
            A1Z(r4);
            return;
        }
        Bundle bundle = this.A06;
        if (bundle == null || !bundle.getBoolean("is_send_as_document", false)) {
            Map map = this.A08;
            Uri B3d = r4.B3d();
            C162457s7.A0D(B3d);
            map.put(B3d, r4);
        }
        GalleryTabHostFragment galleryTabHostFragment = this.A03;
        if (galleryTabHostFragment != null) {
            galleryTabHostFragment.A1R(C18290x4.A12(r4));
        }
    }

    public boolean A1X(C186058ug r4, C95294tG r5) {
        Boolean bool;
        GalleryTabHostFragment galleryTabHostFragment;
        C88084Xg r2;
        Uri B3d = r4.B3d();
        C162457s7.A0D(B3d);
        Map map = this.A08;
        if (!(map.containsKey(B3d) || this.A04 == null || map.size() >= this.A00 || (galleryTabHostFragment = this.A03) == null || !galleryTabHostFragment.A1T() || (r2 = this.A04) == null || this.A0C == null)) {
            int A012 = RecyclerView.A01(r5);
            r2.A04 = true;
            r2.A03 = A012;
            r2.A00 = C86654Ky.A04(r5);
        }
        GalleryTabHostFragment galleryTabHostFragment2 = this.A03;
        if (galleryTabHostFragment2 != null) {
            bool = Boolean.valueOf(galleryTabHostFragment2.A1T());
        } else {
            bool = null;
        }
        if (AnonymousClass0x9.A1Q(bool)) {
            return A1Z(r4);
        }
        return false;
    }

    public final boolean A1Z(C186058ug r7) {
        int A0I = C86664Kz.A0I(A1L());
        Map map = this.A08;
        if (map.size() >= A0I) {
            A0I = A1L().A0N(2693);
        }
        Uri B3d = r7.B3d();
        C162457s7.A0D(B3d);
        if (map.containsKey(B3d)) {
            map.remove(B3d);
        } else if (map.size() >= A0I) {
            Toast toast = this.A09;
            if (toast != null) {
                toast.cancel();
            }
            C69263Wi A1J = A1J();
            Resources A09 = C08310eF.A09(this);
            Object[] objArr = new Object[1];
            boolean A1Y = C18300x5.A1Y(objArr, A0I);
            Toast A0C = A1J.A0C(A09.getString(R.string.f11nameremoved, objArr));
            A0C.show();
            this.A09 = A0C;
            return A1Y;
        } else {
            map.put(B3d, r7);
        }
        A1Y();
        return true;
    }
}
