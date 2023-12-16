package X;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onItemsScroll$1;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1;
import java.util.List;

/* renamed from: X.4HC  reason: invalid class name */
public class AnonymousClass4HC extends AnonymousClass128 {
    public Object A00;
    public boolean A01;
    public final int A02 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HC(Resources resources, C06440Xs r3, AvatarExpressionsFragment avatarExpressionsFragment, AnonymousClass1VX r5) {
        super(resources, (GridLayoutManager) r3, r5);
        this.A00 = avatarExpressionsFragment;
        C162457s7.A0H(r5);
        C162457s7.A0H(resources);
        C162457s7.A0K(r3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    public void A05(RecyclerView recyclerView, int i) {
        boolean z = false;
        C162457s7.A0J(recyclerView, 0);
        if (i != 0) {
            if (i == 2) {
                z = true;
            } else {
                return;
            }
        }
        this.A01 = z;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        ExpressionsSearchViewModel expressionsSearchViewModel;
        C195211m r0;
        AnonymousClass2UW A012;
        AnonymousClass2UW A013;
        int i3;
        int i4;
        C85474Gj r02;
        if (this.A02 != 0) {
            C162457s7.A0J(recyclerView, 0);
            super.A04(recyclerView, i, i2);
            if (this.A01) {
                StickerExpressionsFragment stickerExpressionsFragment = (StickerExpressionsFragment) this.A00;
                GridLayoutManager gridLayoutManager = stickerExpressionsFragment.A04;
                if (gridLayoutManager != null) {
                    int A1H = gridLayoutManager.A1H();
                    if (A1H >= 0) {
                        if (i2 != 0) {
                            StickerExpressionsViewModel A0N = C18300x5.A0N(stickerExpressionsFragment);
                            int A1I = gridLayoutManager.A1I();
                            if (A0N.A0L.A0Y(C58422vE.A02, 6471)) {
                                List list = A0N.A04;
                                if (list != null) {
                                    i3 = list.size();
                                } else {
                                    i3 = 0;
                                }
                                List list2 = A0N.A03;
                                if (list2 != null) {
                                    i4 = list2.size();
                                } else {
                                    i4 = 0;
                                }
                                List list3 = A0N.A02;
                                if (list3 != null) {
                                    int size = i4 + i3 + list3.size();
                                    String str = A0N.A01;
                                    if (str != null && A1I + 20 > size && (r02 = A0N.A07) != null && !r02.BGz()) {
                                        List list4 = A0N.A03;
                                        if (list4 == null) {
                                            list4 = C72023d3.A00;
                                        }
                                        A0N.A07 = C616131n.A02((C85494Gl) null, new StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1(A0N, str, list4, list3, (C84814Du) null), AnonymousClass0IV.A00(A0N), (AnonymousClass20D) null, 3);
                                    }
                                }
                            }
                        }
                        C195211m r03 = stickerExpressionsFragment.A09;
                        if (r03 != null && (A013 = ((C47712dh) r03.A0K(A1H)).A01()) != null) {
                            AnonymousClass2UW r04 = stickerExpressionsFragment.A0A;
                            if (r04 != null && !A013.equals(r04)) {
                                C45952aq r1 = C18300x5.A0N(stickerExpressionsFragment).A0F;
                                AnonymousClass1Tb r05 = AnonymousClass1Tb.A00;
                                r1.A00(r05, r05, 6);
                            }
                            stickerExpressionsFragment.A0A = A013;
                            C18300x5.A0N(stickerExpressionsFragment).A0M(A013, false);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (i2 != 0) {
                    expressionsSearchViewModel = stickerExpressionsFragment.A08;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            C162457s7.A0J(recyclerView, 0);
            super.A04(recyclerView, i, i2);
            if (this.A01) {
                AvatarExpressionsFragment avatarExpressionsFragment = (AvatarExpressionsFragment) this.A00;
                GridLayoutManager gridLayoutManager2 = avatarExpressionsFragment.A07;
                if (gridLayoutManager2 != null) {
                    int A1H2 = gridLayoutManager2.A1H();
                    if (A1H2 >= 0 && (r0 = avatarExpressionsFragment.A0F) != null && (A012 = ((C47712dh) r0.A0K(A1H2)).A01()) != null) {
                        AnonymousClass2UW r06 = avatarExpressionsFragment.A0G;
                        if (r06 != null && !A012.equals(r06)) {
                            C45952aq r12 = AnonymousClass0x9.A0O(avatarExpressionsFragment).A03;
                            AnonymousClass1TY r07 = AnonymousClass1TY.A00;
                            r12.A00(r07, r07, 6);
                        }
                        avatarExpressionsFragment.A0G = A012;
                        AnonymousClass0x9.A0O(avatarExpressionsFragment).A0F(A012);
                    } else {
                        return;
                    }
                }
                if (i2 != 0) {
                    expressionsSearchViewModel = avatarExpressionsFragment.A0D;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        if (expressionsSearchViewModel != null) {
            C616131n.A02((C85494Gl) null, new ExpressionsSearchViewModel$onItemsScroll$1(expressionsSearchViewModel, (C84814Du) null), AnonymousClass0IV.A00(expressionsSearchViewModel), (AnonymousClass20D) null, 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HC(Resources resources, C06440Xs r3, StickerExpressionsFragment stickerExpressionsFragment, AnonymousClass1VX r5) {
        super(resources, (GridLayoutManager) r3, r5);
        this.A00 = stickerExpressionsFragment;
        C162457s7.A0H(r5);
        C162457s7.A0H(resources);
        C162457s7.A0K(r3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }
}
