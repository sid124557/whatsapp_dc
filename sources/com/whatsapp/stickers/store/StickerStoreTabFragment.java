package com.whatsapp.stickers.store;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass09T;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass33O;
import X.AnonymousClass4Vx;
import X.AnonymousClass525;
import X.AnonymousClass52A;
import X.AnonymousClass52B;
import X.AnonymousClass5JV;
import X.AnonymousClass6BG;
import X.AnonymousClass909;
import X.C06560Yg;
import X.C106905aM;
import X.C117635sF;
import X.C18280x3;
import X.C18320x8;
import X.C29361ih;
import X.C49652gs;
import X.C49912hI;
import X.C50612iT;
import X.C54722pB;
import X.C55862r2;
import X.C56872sh;
import X.C56932sn;
import X.C56972sr;
import X.C620733j;
import X.C86634Kw;
import X.C86654Ky;
import X.C87844Wi;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import java.util.List;

public abstract class StickerStoreTabFragment extends Hilt_StickerStoreTabFragment {
    public int A00;
    public LayoutInflater A01;
    public View A02;
    public LinearLayoutManager A03;
    public RecyclerView A04;
    public C56972sr A05;
    public C620733j A06;
    public AnonymousClass1VX A07;
    public C49652gs A08;
    public C49912hI A09;
    public AnonymousClass33O A0A;
    public C29361ih A0B;
    public C56932sn A0C;
    public StickerPackDownloader A0D;
    public C87844Wi A0E;
    public List A0F;
    public final ViewTreeObserver.OnGlobalLayoutListener A0G = new AnonymousClass6BG((Object) this, 35);
    public final C56872sh A0H = new AnonymousClass909(this, 4);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        this.A01 = layoutInflater;
        boolean z = this instanceof StickerStoreMyTabFragment;
        if (z) {
            i = R.layout.f8nameremoved;
        } else {
            i = R.layout.f8nameremoved;
        }
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, i);
        this.A04 = C86654Ky.A0P(A0R, R.id.store_recycler_view);
        this.A02 = C06560Yg.A02(A0R, R.id.store_progress);
        A1D();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A03 = linearLayoutManager;
        linearLayoutManager.A1X(1);
        LinearLayoutManager linearLayoutManager2 = this.A03;
        linearLayoutManager2.A0A = true;
        this.A04.setLayoutManager(linearLayoutManager2);
        this.A04.getViewTreeObserver().addOnGlobalLayoutListener(this.A0G);
        this.A04.setNestedScrollingEnabled(true);
        this.A0B.A06(this.A0H);
        if (z) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this;
            stickerStoreMyTabFragment.A00 = A0R.findViewById(R.id.empty);
            TextView A092 = AnonymousClass002.A09(A0R, R.id.get_stickers_button);
            C106905aM.A04(A092);
            C18280x3.A0o(A092, stickerStoreMyTabFragment, 12);
        } else if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            stickerStoreFeaturedTabFragment.A00 = A0R.findViewById(R.id.empty);
            View A022 = C06560Yg.A02(A0R, R.id.floating_discover_third_party_app_button);
            stickerStoreFeaturedTabFragment.A01 = A022;
            A022.setVisibility(0);
            C86634Kw.A1D(stickerStoreFeaturedTabFragment.A01, stickerStoreFeaturedTabFragment, R.string.f11nameremoved);
            C18280x3.A0o(stickerStoreFeaturedTabFragment.A01, stickerStoreFeaturedTabFragment, 11);
            if (stickerStoreFeaturedTabFragment.A1T()) {
                C55862r2 r2 = stickerStoreFeaturedTabFragment.A05;
                r2.A03 = C18280x3.A0Y();
                r2.A00 = 3;
            }
            stickerStoreFeaturedTabFragment.A04.A0q(stickerStoreFeaturedTabFragment.A09);
        }
        A1M();
        if (z) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment2 = (StickerStoreMyTabFragment) this;
            stickerStoreMyTabFragment2.A06 = false;
            AnonymousClass09T r1 = new AnonymousClass09T(new AnonymousClass4Vx(stickerStoreMyTabFragment2));
            stickerStoreMyTabFragment2.A01 = r1;
            r1.A0C(stickerStoreMyTabFragment2.A04);
            stickerStoreMyTabFragment2.A02.postDelayed(new C117635sF(stickerStoreMyTabFragment2, 29), 300);
        } else {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment2 = (StickerStoreFeaturedTabFragment) this;
            stickerStoreFeaturedTabFragment2.A02.setVisibility(0);
            if (!stickerStoreFeaturedTabFragment2.A07) {
                stickerStoreFeaturedTabFragment2.A08 = true;
                AnonymousClass5JV r3 = stickerStoreFeaturedTabFragment2.A06;
                C86634Kw.A1Q(r3.A03, r3, new AnonymousClass525(stickerStoreFeaturedTabFragment2), 8);
                return A0R;
            }
        }
        return A0R;
    }

    public void A0c() {
        this.A04.getViewTreeObserver().removeGlobalOnLayoutListener(this.A0G);
        C56932sn r2 = this.A0C;
        C54722pB r0 = r2.A00;
        if (r0 != null) {
            r0.A02.A03(false);
            r2.A00 = null;
        }
        AnonymousClass33O r02 = this.A0A;
        if (r02 != null) {
            r02.A03();
        }
        this.A0B.A07(this.A0H);
        super.A0c();
    }

    public void A1J() {
        if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            if (stickerStoreFeaturedTabFragment.A07) {
                stickerStoreFeaturedTabFragment.A08 = true;
                AnonymousClass5JV r3 = stickerStoreFeaturedTabFragment.A06;
                C86634Kw.A1Q(r3.A03, r3, new AnonymousClass525(stickerStoreFeaturedTabFragment), 8);
            }
        }
    }

    public void A1K() {
        if (this instanceof StickerStoreMyTabFragment) {
            ((StickerStoreMyTabFragment) this).A1U();
        }
    }

    public void A1L() {
        if (this instanceof StickerStoreMyTabFragment) {
            ((StickerStoreMyTabFragment) this).A1U();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0.A0G() != 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1M() {
        /*
            r3 = this;
            X.4Wi r0 = r3.A0E
            if (r0 == 0) goto L_0x000b
            int r0 = r0.A0G()
            r2 = 1
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.stickers.store.StickerStoreMyTabFragment
            if (r0 == 0) goto L_0x001f
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreMyTabFragment) r1
            android.view.View r1 = r1.A00
            if (r1 == 0) goto L_0x001e
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
        L_0x001e:
            return
        L_0x001f:
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r1
            android.view.View r1 = r1.A00
            if (r1 == 0) goto L_0x001e
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.StickerStoreTabFragment.A1M():void");
    }

    public void A1N(C50612iT r6) {
        StickerStoreTabFragment stickerStoreTabFragment;
        if (this instanceof StickerStoreMyTabFragment) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this;
            if (stickerStoreMyTabFragment.A0E != null) {
                for (int i = 0; i < stickerStoreMyTabFragment.A0F.size(); i++) {
                    if (C86654Ky.A0d(stickerStoreMyTabFragment, i).A0G.equals(r6.A0G)) {
                        stickerStoreMyTabFragment.A0F.set(i, r6);
                        C87844Wi r0 = stickerStoreMyTabFragment.A0E;
                        if (r0 != null) {
                            r0.A06(i);
                            return;
                        }
                        return;
                    }
                }
                C87844Wi r4 = stickerStoreMyTabFragment.A0E;
                if (r4 instanceof AnonymousClass52B) {
                    AnonymousClass52B r42 = (AnonymousClass52B) r4;
                    boolean z = false;
                    if (!r42.A00.isEmpty()) {
                        z = ((C50612iT) r42.A00.get(0)).A0S;
                    }
                    r42.A00.add(z ? 1 : 0, r6);
                    r42.A07(r42.A00.indexOf(r6));
                    stickerStoreTabFragment = r42.A00;
                } else {
                    r4.A00.add(r6);
                    r4.A07(r4.A00.indexOf(r6));
                    stickerStoreTabFragment = r4.A01;
                }
                stickerStoreTabFragment.A1M();
                stickerStoreMyTabFragment.A06 = true;
            }
        } else if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            if (stickerStoreFeaturedTabFragment.A0F != null) {
                int i2 = 0;
                while (i2 < stickerStoreFeaturedTabFragment.A0F.size()) {
                    if (C86654Ky.A0d(stickerStoreFeaturedTabFragment, i2).A0G.equals(r6.A0G)) {
                        stickerStoreFeaturedTabFragment.A0F.set(i2, r6);
                        C87844Wi r1 = stickerStoreFeaturedTabFragment.A0E;
                        if (r1 != null) {
                            if (stickerStoreFeaturedTabFragment.A1U()) {
                                i2++;
                            }
                            r1.A06(i2);
                            return;
                        }
                        return;
                    }
                    i2++;
                }
            }
        }
    }

    public void A1O(C50612iT r6) {
        if (this instanceof StickerStoreMyTabFragment) {
            if (this.A0F != null) {
                for (int i = 0; i < this.A0F.size(); i++) {
                    C50612iT A0d = C86654Ky.A0d(this, i);
                    if (A0d.A0G.equals(r6.A0G)) {
                        A0d.A06 = true;
                        C87844Wi r0 = this.A0E;
                        if (r0 != null) {
                            r0.A06(i);
                            return;
                        }
                        return;
                    }
                }
            }
        } else if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            if (stickerStoreFeaturedTabFragment.A0F != null) {
                for (int i2 = 0; i2 < stickerStoreFeaturedTabFragment.A0F.size(); i2++) {
                    C50612iT A0d2 = C86654Ky.A0d(stickerStoreFeaturedTabFragment, i2);
                    if (A0d2.A0G.equals(r6.A0G)) {
                        A0d2.A06 = true;
                        C87844Wi r2 = stickerStoreFeaturedTabFragment.A0E;
                        if (r2 != null) {
                            int i3 = i2;
                            if (stickerStoreFeaturedTabFragment.A1U()) {
                                i3 = i2 + 1;
                            }
                            r2.A06(i3);
                        }
                    }
                }
                if (r6.A0S) {
                    C87844Wi r02 = stickerStoreFeaturedTabFragment.A0E;
                    List list = stickerStoreFeaturedTabFragment.A0F;
                    if (r02 == null) {
                        stickerStoreFeaturedTabFragment.A1Q(new AnonymousClass52A(stickerStoreFeaturedTabFragment, list));
                        return;
                    }
                    r02.A00 = list;
                    r02.A05();
                }
            }
        }
    }

    public void A1Q(C87844Wi r4) {
        this.A0E = r4;
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.suppressLayout(false);
            recyclerView.A0m(r4, true, true);
            recyclerView.A0v(true);
            recyclerView.requestLayout();
        }
        A1M();
    }

    public void A1R(String str) {
        if (this instanceof StickerStoreMyTabFragment) {
            if (this.A0F != null) {
                for (int i = 0; i < this.A0F.size(); i++) {
                    C50612iT A0d = C86654Ky.A0d(this, i);
                    if (A0d.A0G.equals(str)) {
                        A0d.A06 = false;
                        C87844Wi r0 = this.A0E;
                        if (r0 != null) {
                            r0.A06(i);
                            return;
                        }
                        return;
                    }
                }
            }
        } else if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            if (stickerStoreFeaturedTabFragment.A0F != null) {
                for (int i2 = 0; i2 < stickerStoreFeaturedTabFragment.A0F.size(); i2++) {
                    C50612iT A0d2 = C86654Ky.A0d(stickerStoreFeaturedTabFragment, i2);
                    if (A0d2.A0G.equals(str)) {
                        A0d2.A06 = false;
                        C87844Wi r2 = stickerStoreFeaturedTabFragment.A0E;
                        if (r2 != null) {
                            int i3 = i2;
                            if (stickerStoreFeaturedTabFragment.A1U()) {
                                i3 = i2 + 1;
                            }
                            r2.A06(i3);
                        }
                        stickerStoreFeaturedTabFragment.A03.A0P(AnonymousClass0x7.A0n(stickerStoreFeaturedTabFragment, A0d2.A0I, new Object[1], 0, R.string.f11nameremoved), 1);
                    }
                }
            }
        }
    }

    public void A1S(String str) {
        if (this instanceof StickerStoreMyTabFragment) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this;
            C87844Wi r3 = stickerStoreMyTabFragment.A0E;
            if (r3 != null) {
                int i = 0;
                while (true) {
                    if (i >= r3.A00.size()) {
                        break;
                    }
                    C50612iT r1 = (C50612iT) r3.A00.get(i);
                    if (r1.A0G.equals(str)) {
                        r3.A00.remove(r1);
                        if (r3.A00.size() == 0) {
                            r3.A05();
                        } else {
                            r3.A08(i);
                        }
                        r3.A01.A1M();
                    } else {
                        i++;
                    }
                }
                stickerStoreMyTabFragment.A06 = true;
            }
        } else if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            if (stickerStoreFeaturedTabFragment.A0F != null) {
                int i2 = 0;
                while (i2 < stickerStoreFeaturedTabFragment.A0F.size()) {
                    C50612iT A0d = C86654Ky.A0d(stickerStoreFeaturedTabFragment, i2);
                    if (A0d.A0G.equals(str)) {
                        A0d.A06 = false;
                        A0d.A01 = 0;
                        A0d.A03 = null;
                        C87844Wi r12 = stickerStoreFeaturedTabFragment.A0E;
                        if (r12 != null) {
                            if (stickerStoreFeaturedTabFragment.A1U()) {
                                i2++;
                            }
                            r12.A06(i2);
                            return;
                        }
                        return;
                    }
                    i2++;
                }
            }
        }
    }

    public boolean A1T() {
        if (this.A05.A0Y() || !this.A07.A0X(1396)) {
            return false;
        }
        return true;
    }

    public void A1P(C50612iT r6, int i) {
        String str;
        Context A1D = A1D();
        String str2 = r6.A0G;
        if (this instanceof StickerStoreMyTabFragment) {
            str = "sticker_store_my_tab";
        } else {
            str = "sticker_store_featured_tab";
        }
        Intent A072 = C18320x8.A07();
        A072.setClassName(A1D.getPackageName(), "com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity");
        A072.putExtra("sticker_pack_id", str2);
        A072.putExtra("sticker_pack_preview_source", str);
        A0R().startActivityForResult(A072, 1);
    }
}
