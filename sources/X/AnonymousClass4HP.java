package X;

import com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1;
import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1;
import com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateAvatarStickerList$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateStickerList$1;
import com.whatsapp.stickers.starred.StarredStickersFlow$notifyStickerFavoriteAdded$1;
import com.whatsapp.stickers.starred.StarredStickersFlow$updateStickerList$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4HP  reason: invalid class name */
public class AnonymousClass4HP extends C56872sh {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4HP(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass4HP r2, StickerPackFlow stickerPackFlow, List list) {
        StickerPackFlow.A00(new C32671rQ(list), stickerPackFlow, (AnonymousClass4Gm) r2.A00);
    }

    public void A04() {
        C58912w1 r2;
        AnonymousClass4Gm r1;
        int i;
        switch (this.A02) {
            case 4:
                r2 = (C58912w1) this.A01;
                r1 = (AnonymousClass4Gm) this.A00;
                i = 2;
                break;
            case 5:
                r2 = (C58912w1) this.A01;
                r1 = (AnonymousClass4Gm) this.A00;
                i = 1;
                break;
            default:
                return;
        }
        C616131n.A02(r2.A04, new StarredStickersFlow$updateStickerList$1(r2, (C84814Du) null, r1, i), r1, (AnonymousClass20D) null, 2);
    }

    public void A05() {
        switch (this.A02) {
            case 2:
                C616131n.A02(((AnonymousClass32R) this.A01).A02, new RecentStickerFlowImpl$updateAvatarStickerList$1((AnonymousClass32R) this.A01, (C84814Du) null, (AnonymousClass4Gm) this.A00), (AnonymousClass4Gm) this.A00, (AnonymousClass20D) null, 2);
                return;
            case 3:
                C616131n.A02(((AnonymousClass32R) this.A01).A02, new RecentStickerFlowImpl$updateStickerList$1((AnonymousClass32R) this.A01, (C84814Du) null, (AnonymousClass4Gm) this.A00), (AnonymousClass4Gm) this.A00, (AnonymousClass20D) null, 2);
                return;
            default:
                return;
        }
    }

    public void A06() {
        if (1 - this.A02 == 0) {
            StickerPackFlow stickerPackFlow = (StickerPackFlow) this.A01;
            C616131n.A02(stickerPackFlow.A0B, new StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1(stickerPackFlow, (C84814Du) null, (AnonymousClass4Gm) this.A00), stickerPackFlow.A0E, (AnonymousClass20D) null, 2);
        }
    }

    public void A07() {
        switch (this.A02) {
            case 2:
                C616131n.A02(((AnonymousClass32R) this.A01).A02, new RecentStickerFlowImpl$updateAvatarStickerList$1((AnonymousClass32R) this.A01, (C84814Du) null, (AnonymousClass4Gm) this.A00), (AnonymousClass4Gm) this.A00, (AnonymousClass20D) null, 2);
                return;
            case 3:
                C616131n.A02(((AnonymousClass32R) this.A01).A02, new RecentStickerFlowImpl$updateStickerList$1((AnonymousClass32R) this.A01, (C84814Du) null, (AnonymousClass4Gm) this.A00), (AnonymousClass4Gm) this.A00, (AnonymousClass20D) null, 2);
                return;
            default:
                return;
        }
    }

    public void A08(C50612iT r7) {
        switch (this.A02) {
            case 0:
                C162457s7.A0J(r7, 0);
                if (r7.A0S) {
                    ((AnonymousClass4FB) this.A00).BrD(new C30131lu(r7));
                    return;
                }
                return;
            case 1:
                C162457s7.A0J(r7, 0);
                r7.A07 = true;
                StickerPackFlow stickerPackFlow = (StickerPackFlow) this.A01;
                List list = stickerPackFlow.A00.A00;
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : list) {
                    C18280x3.A18(((C48272ed) next).A01(), r7.A0G, next, A0s);
                }
                String str = r7.A0G;
                C162457s7.A0D(str);
                A00(this, stickerPackFlow, C73723fy.A0M(new C32691rS(r7, str), A0s));
                return;
            default:
                return;
        }
    }

    public void A09(C50612iT r6) {
        switch (this.A02) {
            case 0:
                if (r6.A0S) {
                    ((AnonymousClass4FB) this.A00).BrD(new C30141lv(0));
                    return;
                }
                return;
            case 1:
                StickerPackFlow stickerPackFlow = (StickerPackFlow) this.A01;
                List list = stickerPackFlow.A00.A00;
                String str = r6.A0G;
                C162457s7.A0D(str);
                A00(this, stickerPackFlow, C73723fy.A0M(new C32711rU(r6, str, 0), list));
                return;
            default:
                return;
        }
    }

    public void A0A(C50612iT r7) {
        switch (this.A02) {
            case 0:
                if (r7.A0S) {
                    ((AnonymousClass4FB) this.A00).BrD(new C30131lu(r7));
                    return;
                }
                return;
            case 1:
                StickerPackFlow stickerPackFlow = (StickerPackFlow) this.A01;
                List<C48272ed> list = stickerPackFlow.A00.A00;
                ArrayList A0c = C73783g4.A0c(list);
                for (C48272ed r2 : list) {
                    String A012 = r2.A01();
                    String str = r7.A0G;
                    if (C162457s7.A0P(A012, str)) {
                        C162457s7.A0D(str);
                        r2 = new C32691rS(r7, str);
                    }
                    A0c.add(r2);
                }
                A00(this, stickerPackFlow, A0c);
                return;
            default:
                return;
        }
    }

    public void A0B(String str) {
        switch (this.A02) {
            case 0:
                if (C162457s7.A0P(str, "meta-avatar")) {
                    AnonymousClass2TU r5 = (AnonymousClass2TU) this.A01;
                    C616131n.A02(r5.A04, new AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1(r5, (C84814Du) null, (AnonymousClass4Gm) this.A00), r5.A06, (AnonymousClass20D) null, 2);
                    return;
                }
                return;
            case 1:
                StickerPackFlow stickerPackFlow = (StickerPackFlow) this.A01;
                List list = stickerPackFlow.A00.A00;
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : list) {
                    C18280x3.A18(((C48272ed) next).A01(), str, next, A0s);
                }
                A00(this, stickerPackFlow, A0s);
                return;
            default:
                return;
        }
    }

    public void A0C(String str) {
        switch (this.A02) {
            case 0:
                if (str.equals("meta-avatar")) {
                    ((AnonymousClass4FB) this.A00).BrD(new C30151lw("onStickerPackRemoved"));
                    return;
                }
                return;
            case 1:
                StickerPackFlow stickerPackFlow = (StickerPackFlow) this.A01;
                List list = stickerPackFlow.A00.A00;
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : list) {
                    C18280x3.A18(((C48272ed) next).A01(), str, next, A0s);
                }
                A00(this, stickerPackFlow, A0s);
                return;
            default:
                return;
        }
    }

    public void A0D(String str, int i) {
        switch (this.A02) {
            case 0:
                C162457s7.A0J(str, 0);
                if (str.equals("meta-avatar")) {
                    ((AnonymousClass4FB) this.A00).BrD(new C30141lv(i));
                    return;
                }
                return;
            case 1:
                C162457s7.A0J(str, 0);
                StickerPackFlow stickerPackFlow = (StickerPackFlow) this.A01;
                List<C48272ed> list = stickerPackFlow.A00.A00;
                ArrayList A0c = C73783g4.A0c(list);
                for (C48272ed r2 : list) {
                    if ((r2 instanceof C32711rU) && C162457s7.A0P(r2.A01(), str)) {
                        C32711rU r22 = (C32711rU) r2;
                        r2 = new C32711rU(r22.A01, r22.A02, i);
                    }
                    A0c.add(r2);
                }
                A00(this, stickerPackFlow, A0c);
                return;
            default:
                return;
        }
    }

    public void A0E(String str, String str2) {
        if (1 - this.A02 == 0) {
            C18260x0.A0O(str, str2);
            StickerPackFlow stickerPackFlow = (StickerPackFlow) this.A01;
            C616131n.A02(stickerPackFlow.A0B, new StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1(stickerPackFlow, str, str2, (C84814Du) null, (AnonymousClass4Gm) this.A00), stickerPackFlow.A0D, (AnonymousClass20D) null, 2);
        }
    }

    public void A0F(Collection collection, boolean z) {
        boolean z2;
        C58912w1 r5;
        AnonymousClass4Gm r4;
        switch (this.A02) {
            case 4:
                C162457s7.A0J(collection, 0);
                r5 = (C58912w1) this.A01;
                r4 = (AnonymousClass4Gm) this.A00;
                C616131n.A02(r5.A04, new StarredStickersFlow$updateStickerList$1(r5, (C84814Du) null, r4, 2), r4, (AnonymousClass20D) null, 2);
                z2 = false;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AnonymousClass0x7.A0b(it).A0J) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                break;
            case 5:
                C162457s7.A0J(collection, 0);
                r5 = (C58912w1) this.A01;
                r4 = (AnonymousClass4Gm) this.A00;
                z2 = true;
                C616131n.A02(r5.A04, new StarredStickersFlow$updateStickerList$1(r5, (C84814Du) null, r4, 1), r4, (AnonymousClass20D) null, 2);
                if (!collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (AnonymousClass0x7.A0b(it2).A0J) {
                                break;
                            }
                        }
                    }
                }
                z2 = false;
                break;
            default:
                return;
        }
        C616131n.A02(r5.A04, new StarredStickersFlow$notifyStickerFavoriteAdded$1(r5, collection, (C84814Du) null, z2), r4, (AnonymousClass20D) null, 2);
    }

    public void A0G(Collection collection, boolean z) {
        C58912w1 r2;
        AnonymousClass4Gm r1;
        int i;
        switch (this.A02) {
            case 4:
                C162457s7.A0J(collection, 0);
                r2 = (C58912w1) this.A01;
                r1 = (AnonymousClass4Gm) this.A00;
                i = 2;
                break;
            case 5:
                C162457s7.A0J(collection, 0);
                r2 = (C58912w1) this.A01;
                r1 = (AnonymousClass4Gm) this.A00;
                i = 1;
                break;
            default:
                return;
        }
        C616131n.A02(r2.A04, new StarredStickersFlow$updateStickerList$1(r2, (C84814Du) null, r1, i), r1, (AnonymousClass20D) null, 2);
    }
}
