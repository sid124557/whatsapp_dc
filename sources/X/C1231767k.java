package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.emoji.EmojiPopupFooter;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import com.whatsapp.search.IteratingPlayer;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.67k  reason: invalid class name and case insensitive filesystem */
public class C1231767k extends AnonymousClass0O5 {
    public Object A00;
    public final int A01;

    public C1231767k(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(RecyclerView recyclerView, Object obj, int i) {
        recyclerView.A0q(new C1231767k(obj, i));
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        WaEditText waEditText;
        AnonymousClass4WC r0;
        AnonymousClass5SX A002;
        Object value;
        Object obj;
        AnonymousClass7N7 r02;
        CatalogSearchFragment catalogSearchFragment;
        View view;
        C105895Wv r03;
        View findViewById;
        float f;
        View findViewById2;
        float f2;
        LinearLayoutManager linearLayoutManager;
        C148047Gs A03;
        switch (this.A01) {
            case 0:
                if (recyclerView.getScrollState() != 0) {
                    LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) recyclerView.getLayoutManager();
                    if (linearLayoutManager2.A09() - (linearLayoutManager2.A08() + linearLayoutManager2.A1H()) <= 4) {
                        C90504hW r04 = (C90504hW) this.A00;
                        C87614Tz r2 = r04.A0I;
                        UserJid userJid = r04.A0M;
                        if (!r2.A0P.A02(r2.A00, userJid) || ((A03 = r2.A0K.A03(userJid)) != null && !A03.A01)) {
                            AnonymousClass5Y9 r3 = r2.A0N;
                            int i3 = r2.A05;
                            int i4 = 1;
                            if (r3.A08.A0a(userJid)) {
                                i4 = 4;
                            }
                            r3.A06(userJid, i3, i4 * 6, false);
                        } else {
                            AnonymousClass5Y9 r32 = r2.A0N;
                            r32.A0I.A01(userJid, AnonymousClass74S.A00(), new C124346Bx(r32, userJid, r2.A05, C18280x3.A00(r32.A08.A0a(userJid) ? 1 : 0) * 4, 1, false));
                        }
                        recyclerView.post(new C117165rU(this, 47, recyclerView));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ProductListActivity productListActivity = (ProductListActivity) this.A00;
                productListActivity.A74();
                if (!productListActivity.A0H.A0K() && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null) {
                    if (linearLayoutManager.A09() - (linearLayoutManager.A08() + linearLayoutManager.A1H()) <= 4) {
                        productListActivity.A0I.A0D();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                BusinessApiHomeFragment businessApiHomeFragment = (BusinessApiHomeFragment) this.A00;
                BusinessApiSearchActivity A1I = businessApiHomeFragment.A1I();
                if (businessApiHomeFragment.A00.canScrollVertically(-1)) {
                    A1I.A75();
                    findViewById2 = A1I.findViewById(R.id.search_toolbar_container);
                    f2 = AnonymousClass5CP.A00(A1I);
                } else {
                    Menu menu = A1I.A00;
                    if (!(menu == null || menu.findItem(1) == null)) {
                        A1I.A00.removeItem(1);
                    }
                    A1I.A09 = false;
                    findViewById2 = A1I.findViewById(R.id.search_toolbar_container);
                    f2 = 0.0f;
                }
                AnonymousClass0YZ.A0B(findViewById2, f2);
                if (i2 != 0 && recyclerView.getScrollState() == 1 && C105895Wv.A00(businessApiHomeFragment.A0B) && (view = businessApiHomeFragment.A0B) != null) {
                    r03 = businessApiHomeFragment.A06;
                    break;
                } else {
                    return;
                }
            case 3:
                LinearLayoutManager linearLayoutManager3 = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager3 != null) {
                    int A08 = linearLayoutManager3.A08();
                    int A09 = linearLayoutManager3.A09();
                    int A1H = linearLayoutManager3.A1H();
                    C90604hu r22 = (C90604hu) this.A00;
                    Object A07 = r22.A0H.A04.A03.A07();
                    if (A09 - (A08 + A1H) <= 4 && (A07 instanceof C132326f6)) {
                        recyclerView.post(new C117125rQ(this, 20));
                    }
                    C90604hu.A0C(r22);
                    return;
                }
                return;
            case 4:
                BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment = (BusinessDirectoryConsumerHomeFragment) this.A00;
                boolean canScrollVertically = recyclerView.canScrollVertically(-1);
                BusinessDirectoryActivity A1I2 = businessDirectoryConsumerHomeFragment.A1I();
                if (canScrollVertically) {
                    A1I2.A77();
                    BusinessDirectoryActivity A1I3 = businessDirectoryConsumerHomeFragment.A1I();
                    findViewById = A1I3.findViewById(R.id.search_toolbar_container);
                    f = AnonymousClass5CP.A00(A1I3);
                } else {
                    A1I2.A75();
                    findViewById = businessDirectoryConsumerHomeFragment.A1I().findViewById(R.id.search_toolbar_container);
                    f = 0.0f;
                }
                AnonymousClass0YZ.A0B(findViewById, f);
                if (i2 != 0 && recyclerView.getScrollState() == 1 && C105895Wv.A00(businessDirectoryConsumerHomeFragment.A0B) && (view = businessDirectoryConsumerHomeFragment.A0B) != null) {
                    r03 = businessDirectoryConsumerHomeFragment.A0F;
                    break;
                } else {
                    return;
                }
                break;
            case 5:
                if (i2 > 0) {
                    BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) this.A00;
                    RecyclerView recyclerView2 = businessProductListBaseFragment.A00;
                    C162457s7.A0H(recyclerView2);
                    LinearLayoutManager linearLayoutManager4 = (LinearLayoutManager) recyclerView2.getLayoutManager();
                    if (linearLayoutManager4 != null) {
                        if (linearLayoutManager4.A09() - (linearLayoutManager4.A08() + linearLayoutManager4.A1H()) <= 4 && !businessProductListBaseFragment.A1K().A0O()) {
                            if (businessProductListBaseFragment instanceof CatalogSearchProductListFragment) {
                                CatalogSearchProductListFragment catalogSearchProductListFragment = (CatalogSearchProductListFragment) businessProductListBaseFragment;
                                if (!catalogSearchProductListFragment.A1K().A0O() && (catalogSearchFragment = catalogSearchProductListFragment.A03) != null) {
                                    AnonymousClass66R r05 = catalogSearchFragment.A0Q;
                                    CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) r05.getValue();
                                    String str = (String) ((CatalogSearchViewModel) r05.getValue()).A00.A07();
                                    if (str == null) {
                                        str = "";
                                    }
                                    UserJid userJid2 = (UserJid) catalogSearchFragment.A0M.getValue();
                                    C108985dt r1 = catalogSearchFragment.A0F;
                                    C162457s7.A0J(userJid2, 1);
                                    if (!catalogSearchViewModel.A03.A00(r1)) {
                                        catalogSearchViewModel.A0D(new AnonymousClass6h1(C133266gx.A00));
                                        return;
                                    } else {
                                        catalogSearchViewModel.A05.A00(C141526vi.CONTINUE, userJid2, str);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                CollectionProductListFragment collectionProductListFragment = (CollectionProductListFragment) businessProductListBaseFragment;
                                C87584Tn r5 = (C87584Tn) collectionProductListFragment.A0G.getValue();
                                r5.A01.A02(r5.A02.A00, collectionProductListFragment.A1L(), collectionProductListFragment.A1O(), AnonymousClass001.A1X(collectionProductListFragment.A00, -1));
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                C08310eF r33 = (C08310eF) this.A00;
                if (r33.A0B != null) {
                    r33.A0B.findViewById(R.id.shadow_top).setVisibility(C86634Kw.A01(recyclerView.canScrollVertically(-1) ? 1 : 0));
                }
                if (r33.A0B != null) {
                    r33.A0B.findViewById(R.id.shadow_bottom).setVisibility(C86634Kw.A01(recyclerView.canScrollVertically(1) ? 1 : 0));
                    return;
                }
                return;
            case 8:
                C162457s7.A0J(recyclerView, 0);
                EmojiExpressionsFragment emojiExpressionsFragment = (EmojiExpressionsFragment) this.A00;
                GridLayoutManager gridLayoutManager = emojiExpressionsFragment.A05;
                if (gridLayoutManager != null) {
                    int A1H2 = gridLayoutManager.A1H();
                    int A1J = gridLayoutManager.A1J();
                    if (A1H2 >= 0 && A1J >= 0 && (r0 = emojiExpressionsFragment.A0D) != null && (A002 = ((AnonymousClass5MX) r0.A0K(A1H2)).A00()) != null) {
                        AnonymousClass5SX r06 = emojiExpressionsFragment.A0E;
                        if (r06 != null && !A002.equals(r06)) {
                            C45952aq r12 = C86634Kw.A0i(emojiExpressionsFragment).A07;
                            AnonymousClass1TZ r07 = AnonymousClass1TZ.A00;
                            r12.A00(r07, r07, 6);
                        }
                        emojiExpressionsFragment.A0E = A002;
                        C85524Gp r52 = C86634Kw.A0i(emojiExpressionsFragment).A0C;
                        do {
                            value = r52.getValue();
                            C100435Ax r9 = (C100435Ax) value;
                            if (r9 instanceof C94364r4) {
                                C94364r4 r92 = (C94364r4) r9;
                                List<AnonymousClass5SX> list = r92.A02;
                                ArrayList A0c = C73783g4.A0c(list);
                                for (AnonymousClass5SX r13 : list) {
                                    String str2 = r13.A02;
                                    A0c.add(new AnonymousClass5SX(r13.A01, r13.A00, str2, C162457s7.A0P(str2, A002.A02)));
                                }
                                obj = new C94364r4(r92.A00, A0c, r92.A01);
                            } else {
                                obj = AnonymousClass4r5.A00;
                                if (!C162457s7.A0P(r9, obj)) {
                                    throw C73153f1.A00();
                                }
                            }
                        } while (!r52.AzD(value, obj));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                C89224c7 r34 = (C89224c7) this.A00;
                if (i2 == 0) {
                    EmojiPopupFooter emojiPopupFooter = r34.A08;
                    if (emojiPopupFooter.A00 != 0) {
                        emojiPopupFooter.startAnimation(new AnonymousClass4O9(r34, 0));
                        r34.A04 = 0;
                        return;
                    }
                    return;
                }
                Animation animation = r34.A08.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                EmojiPopupFooter emojiPopupFooter2 = r34.A08;
                emojiPopupFooter2.setTopOffset(emojiPopupFooter2.A00 + i2);
                r34.A04 = i2;
                return;
            case 11:
                C162457s7.A0J(recyclerView, 0);
                if (i2 != 0 && (waEditText = ((GifSearchContainer) this.A00).A07) != null) {
                    waEditText.A05();
                    return;
                }
                return;
            case 13:
                C162457s7.A0J(recyclerView, 0);
                C06440Xs layoutManager = recyclerView.getLayoutManager();
                C162457s7.A0K(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int A1J2 = ((LinearLayoutManager) layoutManager).A1J();
                NewsletterDirectoryActivity newsletterDirectoryActivity = (NewsletterDirectoryActivity) this.A00;
                RecyclerView recyclerView3 = newsletterDirectoryActivity.A01;
                if (recyclerView3 == null) {
                    throw C18270x1.A0S("directoryRecyclerView");
                } else if (recyclerView3.getScrollState() != 0 || A1J2 != -1) {
                    if (!newsletterDirectoryActivity.A75().A01 || !((r02 = (AnonymousClass7N7) newsletterDirectoryActivity.A75().A02.A07()) == null || r02.A02 == null)) {
                        AnonymousClass4X6 r08 = newsletterDirectoryActivity.A0C;
                        if (r08 == null) {
                            throw C18270x1.A0S("newsletterDirectoryAdapter");
                        } else if (r08.getItemViewType(A1J2) == 2) {
                            newsletterDirectoryActivity.A78((Integer) null, true);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        AnonymousClass4X6 r09 = newsletterDirectoryActivity.A0C;
                        if (r09 == null) {
                            throw C18270x1.A0S("newsletterDirectoryAdapter");
                        }
                        r09.A0K();
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                SearchFragment searchFragment = (SearchFragment) this.A00;
                C88694ab r14 = searchFragment.A05;
                if (r14 != null) {
                    r14.A08(3);
                }
                searchFragment.A1L();
                if (i2 != 0 && recyclerView.getScrollState() == 1) {
                    searchFragment.A1c.A0h(false);
                    return;
                }
                return;
            default:
                super.A04(recyclerView, i, i2);
                return;
        }
        r03.A02(view);
    }

    public void A05(RecyclerView recyclerView, int i) {
        boolean z;
        EmojiPopupFooter emojiPopupFooter;
        AnonymousClass4O9 r0;
        switch (this.A01) {
            case 6:
                if (i == 0) {
                    AnonymousClass4o4 r02 = (AnonymousClass4o4) this.A00;
                    AnonymousClass5MU r3 = r02.A0E;
                    AnonymousClass2z0 r2 = r02.A06;
                    int currentPosition = r02.A01.getCurrentPosition();
                    C162457s7.A0J(r2, 0);
                    r3.A00.put(r2, Integer.valueOf(currentPosition));
                    return;
                }
                return;
            case 9:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                MenuItem menuItem = mediaGalleryActivity.A04;
                if (menuItem != null && menuItem.isActionViewExpanded() && mediaGalleryActivity.getCurrentFocus() != null) {
                    InputMethodManager A0Q = mediaGalleryActivity.A08.A0Q();
                    C626936e.A06(A0Q);
                    A0Q.hideSoftInputFromWindow(recyclerView.getWindowToken(), 2);
                    return;
                }
                return;
            case 10:
                int i2 = 0;
                if (i == 0) {
                    C89224c7 r4 = (C89224c7) this.A00;
                    int height = r4.A08.getHeight();
                    if (r4.A04 > 0 && r4.A08.A00 > height / 2) {
                        i2 = height;
                    }
                    emojiPopupFooter = r4.A08;
                    if (i2 != emojiPopupFooter.A00) {
                        r0 = new AnonymousClass4O9(r4, i2);
                    } else {
                        return;
                    }
                } else if (i == 1 && recyclerView.computeVerticalScrollRange() <= recyclerView.getHeight()) {
                    C89224c7 r1 = (C89224c7) this.A00;
                    emojiPopupFooter = r1.A08;
                    if (emojiPopupFooter.A00 != 0) {
                        r0 = new AnonymousClass4O9(r1, 0);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                emojiPopupFooter.startAnimation(r0);
                return;
            case 12:
                boolean z2 = false;
                C162457s7.A0J(recyclerView, 0);
                AnonymousClass4XH r5 = (AnonymousClass4XH) this.A00;
                boolean z3 = r5.A04;
                if (i != 0) {
                    z2 = true;
                }
                r5.A04 = z2;
                if (z3 != z2) {
                    Iterator it = r5.A18.iterator();
                    while (it.hasNext()) {
                        AnonymousClass4Z6 r32 = (AnonymousClass4Z6) it.next();
                        r32.A0A(r5.A04);
                        if (r5.A04) {
                            IteratingPlayer iteratingPlayer = r5.A0x;
                            int i3 = r32.A06;
                            if (i3 == -1) {
                                i3 = r32.A05;
                            }
                            z = true;
                            if (i3 == iteratingPlayer.A00) {
                                r32.A0B(z);
                            }
                        }
                        z = false;
                        r32.A0B(z);
                    }
                    return;
                }
                return;
            case 14:
                IteratingPlayer iteratingPlayer2 = (IteratingPlayer) this.A00;
                if (i == 0) {
                    iteratingPlayer2.A02();
                    iteratingPlayer2.A03(iteratingPlayer2.A01);
                    iteratingPlayer2.A00();
                    return;
                }
                iteratingPlayer2.A01();
                return;
            case 16:
                C162457s7.A0J(recyclerView, 0);
                if (i == 0) {
                    ((UpdatesFragment) this.A00).A1O();
                    return;
                }
                return;
            default:
                super.A05(recyclerView, i);
                return;
        }
    }
}
