package com.whatsapp.picker.search;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R4;
import X.AnonymousClass0R6;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass11P;
import X.AnonymousClass330;
import X.AnonymousClass33O;
import X.AnonymousClass39M;
import X.AnonymousClass4BP;
import X.AnonymousClass4FV;
import X.AnonymousClass4L0;
import X.AnonymousClass4Qc;
import X.AnonymousClass5RA;
import X.AnonymousClass5T2;
import X.AnonymousClass5Yj;
import X.AnonymousClass6Gl;
import X.AnonymousClass8YX;
import X.AnonymousClass8YY;
import X.C08310eF;
import X.C106655Zv;
import X.C110765h0;
import X.C115975pX;
import X.C125306Hh;
import X.C137976pZ;
import X.C150137Pj;
import X.C162457s7;
import X.C166987za;
import X.C18270x1;
import X.C188848za;
import X.C1896992h;
import X.C24191Wl;
import X.C45112Ys;
import X.C46792cD;
import X.C59232wZ;
import X.C633939b;
import X.C63643Ab;
import X.C86604Kt;
import X.C86644Kx;
import X.C86664Kz;
import X.C88064Xe;
import X.C94264qq;
import X.C989653x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class StickerSearchDialogFragment extends Hilt_StickerSearchDialogFragment implements AnonymousClass4BP {
    public View A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public RecyclerView A02;
    public ViewPager A03;
    public TabLayout A04;
    public WaEditText A05;
    public EmojiSearchProvider A06;
    public AnonymousClass4FV A07;
    public C166987za A08;
    public AnonymousClass11P A09;
    public C125306Hh A0A;
    public C45112Ys A0B;
    public Runnable A0C;
    public String A0D = "";
    public final C59232wZ A0E = new C59232wZ();

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C94264qq r0;
        AnonymousClass5RA r02;
        AnonymousClass33O r8;
        List list;
        ViewTreeObserver viewTreeObserver;
        C162457s7.A0J(layoutInflater, 0);
        super.A0K(bundle, layoutInflater, viewGroup);
        if (bundle == null || (str = bundle.getString("search_term")) == null) {
            str = "";
        }
        this.A0D = str;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A00 = inflate.findViewById(R.id.no_results);
        View findViewById = inflate.findViewById(R.id.get_more_stickers_button);
        C115975pX r3 = this.A00;
        if (r3 != null) {
            C633939b.A00(findViewById, r3, 10);
        }
        this.A05 = (WaEditText) inflate.findViewById(R.id.search_bar);
        this.A02 = C86664Kz.A0w(inflate, R.id.search_result);
        this.A04 = (TabLayout) inflate.findViewById(R.id.sticker_category_tabs);
        C150137Pj r7 = new C150137Pj(A0G(), viewGroup, this.A02, this.A0A);
        this.A01 = r7.A05;
        RecyclerView recyclerView = this.A02;
        if (!(recyclerView == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A01);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            recyclerView2.A0q(new C188848za(this, 8));
        }
        C88064Xe r5 = new C88064Xe(C08310eF.A09(this), r7.A06, this.A02);
        RecyclerView recyclerView3 = this.A02;
        if (recyclerView3 != null) {
            recyclerView3.A0q(r5);
        }
        RecyclerView recyclerView4 = this.A02;
        if (recyclerView4 != null) {
            this.A08 = new C166987za(recyclerView4, r5);
            ViewTreeObserver viewTreeObserver2 = recyclerView4.getViewTreeObserver();
            if (viewTreeObserver2 != null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.A08);
            }
        }
        EmojiSearchProvider emojiSearchProvider = this.A06;
        if (emojiSearchProvider != null) {
            this.A09 = (AnonymousClass11P) AnonymousClass4L0.A0F(new C63643Ab(emojiSearchProvider), this).A01(AnonymousClass11P.class);
            C86604Kt.A1N(A0V(), A1U().A01, new AnonymousClass8YX(this), 312);
            C86604Kt.A1N(A0V(), A1U().A02, new AnonymousClass8YY(this), 313);
            if (this.A0A == null) {
                C115975pX r03 = this.A00;
                if (!(r03 == null || (list = r03.A05) == null)) {
                    A1U().A01.A0H(list);
                }
                C115975pX r04 = this.A00;
                if (!(r04 == null || (r0 = r04.A00) == null || (r02 = r0.A0D) == null || (r8 = r02.A0A) == null)) {
                    C125306Hh r6 = new C125306Hh(A0G(), r8, this, AnonymousClass001.A0f(), C86644Kx.A0h(A1U().A02));
                    this.A0A = r6;
                    RecyclerView recyclerView5 = this.A02;
                    if (recyclerView5 != null) {
                        recyclerView5.setAdapter(r6);
                    }
                }
            }
            View findViewById2 = inflate.findViewById(R.id.clear_search_btn);
            C989653x.A00(findViewById2, this, 19);
            WaEditText waEditText = this.A05;
            if (waEditText != null) {
                waEditText.addTextChangedListener(new C137976pZ(findViewById2, this));
            }
            ImageView A0F = AnonymousClass0x9.A0F(inflate, R.id.back);
            C989653x.A00(A0F, this, 18);
            C18270x1.A0d(A0G(), A0F, this.A01, R.drawable.ic_back);
            TabLayout tabLayout = this.A04;
            if (tabLayout != null) {
                tabLayout.setTabTextColors(TabLayout.A00(AnonymousClass0Y8.A04(A0G(), R.color.f5nameremoved), AnonymousClass5Yj.A03(A0G(), A0G(), R.attr.f3nameremoved, R.color.f5nameremoved)));
            }
            TabLayout tabLayout2 = this.A04;
            if (tabLayout2 != null) {
                C86604Kt.A0z(A0G(), tabLayout2, AnonymousClass5Yj.A02(A0G(), R.attr.f3nameremoved, R.color.f5nameremoved));
            }
            C86604Kt.A0z(A0G(), inflate.findViewById(R.id.search_bar_container), AnonymousClass5Yj.A02(A0G(), R.attr.f3nameremoved, R.color.f5nameremoved));
            A1W(R.string.f11nameremoved, 0);
            A1W(R.string.f11nameremoved, 1);
            A1W(R.string.f11nameremoved, 2);
            A1W(R.string.f11nameremoved, 3);
            A1W(R.string.f11nameremoved, 4);
            A1W(R.string.f11nameremoved, 5);
            A1W(R.string.f11nameremoved, 6);
            TabLayout tabLayout3 = this.A04;
            if (tabLayout3 != null) {
                tabLayout3.setTabMode(0);
            }
            this.A03 = (ViewPager) inflate.findViewById(R.id.sticker_category_viewpager);
            AnonymousClass6Gl r32 = new AnonymousClass6Gl(A0T());
            ViewPager viewPager = this.A03;
            if (viewPager != null) {
                viewPager.setAdapter(r32);
            }
            ViewPager viewPager2 = this.A03;
            if (viewPager2 != null) {
                viewPager2.setOffscreenPageLimit(7);
            }
            ViewPager viewPager3 = this.A03;
            if (viewPager3 != null) {
                viewPager3.A0G(new C110765h0(this.A04));
            }
            TabLayout tabLayout4 = this.A04;
            if (tabLayout4 != null) {
                tabLayout4.A0D(new C1896992h(this, 0));
            }
            WaEditText waEditText2 = this.A05;
            if (waEditText2 != null) {
                waEditText2.setText("");
            }
            WaEditText waEditText3 = this.A05;
            if (waEditText3 != null) {
                waEditText3.requestFocus();
            }
            WaEditText waEditText4 = this.A05;
            if (waEditText4 != null) {
                waEditText4.A07(false);
            }
            C24191Wl r2 = new C24191Wl();
            r2.A00 = AnonymousClass001.A0f();
            AnonymousClass4FV r05 = this.A07;
            if (r05 != null) {
                r05.BhD(r2);
                C45112Ys r06 = this.A0B;
                if (r06 != null) {
                    C46792cD r62 = r06.A01;
                    synchronized (r62.A04) {
                        C18270x1.A0h(r62.A00().edit(), "sticker_search_opened_count", r62.A00().getInt("sticker_search_opened_count", 0) + 1);
                    }
                    return inflate;
                }
                throw C18270x1.A0S("stickerAggregatedLogger");
            }
            throw C18270x1.A0S("wamRuntime");
        }
        throw C18270x1.A0S("emojiSearchProvider");
    }

    public void A0q(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.A0q(bundle);
        String str = this.A0D;
        if (str != null && str.length() != 0) {
            bundle.putString("search_term", str);
        }
    }

    public void A0c() {
        List list;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        RecyclerView recyclerView = this.A02;
        if (!(recyclerView == null || (viewTreeObserver2 = recyclerView.getViewTreeObserver()) == null)) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.A01);
        }
        RecyclerView recyclerView2 = this.A02;
        if (!(recyclerView2 == null || (viewTreeObserver = recyclerView2.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A08);
        }
        RecyclerView recyclerView3 = this.A02;
        if (!(recyclerView3 == null || (list = recyclerView3.A0b) == null)) {
            list.clear();
        }
        Runnable runnable = this.A0C;
        if (runnable != null) {
            WaEditText waEditText = this.A05;
            if (waEditText != null) {
                waEditText.removeCallbacks(runnable);
            }
            this.A0C = null;
        }
        super.A0c();
        this.A04 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A03 = null;
    }

    public final AnonymousClass11P A1U() {
        AnonymousClass11P r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("stickerSearchViewModel");
    }

    public final void A1W(int i, int i2) {
        TabLayout tabLayout = this.A04;
        if (tabLayout != null) {
            AnonymousClass5T2 A042 = tabLayout.A04();
            A042.A01(i);
            A042.A06 = Integer.valueOf(i2);
            A042.A04 = AnonymousClass0x7.A0n(this, C08310eF.A09(this).getString(i), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
            AnonymousClass4Qc r0 = A042.A02;
            if (r0 != null) {
                r0.A02();
            }
            TabLayout tabLayout2 = this.A04;
            if (tabLayout2 != null) {
                tabLayout2.A0E(A042);
            }
        }
    }

    public final void A1X(boolean z) {
        AnonymousClass0R4 r1;
        StickerSearchTabFragment stickerSearchTabFragment;
        C125306Hh r2;
        ViewPager viewPager = this.A03;
        if (viewPager != null) {
            r1 = viewPager.getAdapter();
        } else {
            r1 = null;
        }
        if ((r1 instanceof AnonymousClass6Gl) && (stickerSearchTabFragment = ((AnonymousClass6Gl) r1).A00) != null && (r2 = stickerSearchTabFragment.A03) != null) {
            r2.A04 = z;
            RecyclerView recyclerView = stickerSearchTabFragment.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter((AnonymousClass0R6) null);
            }
            RecyclerView recyclerView2 = stickerSearchTabFragment.A01;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(r2);
            }
        }
    }

    public void Bci(AnonymousClass39M r2, Integer num, int i) {
        C115975pX r0 = this.A00;
        if (r0 != null && r2 != null) {
            r0.Bci(r2, num, i);
        }
    }

    public static final /* synthetic */ void A00(StickerSearchDialogFragment stickerSearchDialogFragment) {
        View view;
        Collection A1P = C86664Kz.A1P(stickerSearchDialogFragment.A1U().A02);
        Collection A1P2 = C86664Kz.A1P(stickerSearchDialogFragment.A1U().A01);
        String str = stickerSearchDialogFragment.A0D;
        int i = 0;
        if (str == null || str.length() != 0) {
            TabLayout tabLayout = stickerSearchDialogFragment.A04;
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
            }
            ViewPager viewPager = stickerSearchDialogFragment.A03;
            if (viewPager == null || viewPager.getVisibility() != 8) {
                stickerSearchDialogFragment.A1X(false);
                ViewPager viewPager2 = stickerSearchDialogFragment.A03;
                if (viewPager2 != null) {
                    viewPager2.setVisibility(8);
                }
            }
            if (A1P == null || A1P.isEmpty()) {
                view = stickerSearchDialogFragment.A00;
                if (view == null) {
                    return;
                }
            } else {
                View view2 = stickerSearchDialogFragment.A00;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
        } else {
            TabLayout tabLayout2 = stickerSearchDialogFragment.A04;
            if (tabLayout2 != null) {
                tabLayout2.setVisibility(0);
            }
            ViewPager viewPager3 = stickerSearchDialogFragment.A03;
            if (viewPager3 == null || viewPager3.getVisibility() != 0) {
                ViewPager viewPager4 = stickerSearchDialogFragment.A03;
                if (viewPager4 != null) {
                    viewPager4.setVisibility(0);
                }
                stickerSearchDialogFragment.A1X(true);
            }
            view = stickerSearchDialogFragment.A00;
            if (view == null) {
                return;
            }
            if (A1P2 != null && !A1P2.isEmpty()) {
                i = 8;
            }
        }
        view.setVisibility(i);
    }

    public void A0g() {
        super.A0g();
        C86644Kx.A1J(this.A05);
    }

    public final List A1V(int i) {
        C106655Zv[] r3;
        List<AnonymousClass39M> A0h = C86644Kx.A0h(A1U().A01);
        if (A0h == null) {
            return AnonymousClass002.A0I(0);
        }
        C59232wZ r0 = this.A0E;
        if (i == 0) {
            return A0h;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Set set = (Set) AnonymousClass001.A0i(r0.A00, i);
        if (set != null) {
            for (AnonymousClass39M r4 : A0h) {
                AnonymousClass330 r02 = r4.A04;
                if (r02 != null && (r3 = r02.A0B) != null) {
                    int length = r3.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (set.contains(r3[i2])) {
                            A0s.add(r4);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        return A0s;
    }
}
