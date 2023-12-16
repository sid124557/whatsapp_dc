package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5AW  reason: invalid class name */
public class AnonymousClass5AW implements AnonymousClass499 {
    public Object A00;
    public final int A01;

    public AnonymousClass5AW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BNt(C108985dt r15) {
        List list;
        AnonymousClass33p r0;
        boolean z;
        String str;
        switch (this.A01) {
            case 0:
                C103915Ox r2 = (C103915Ox) this.A00;
                C104975Tb r3 = r2.A06;
                if (r3.A03(r15, "promotions", r3.A02.A0X(5996))) {
                    C105405Uu r02 = r2.A04;
                    UserJid userJid = r2.A07;
                    AnonymousClass7OX A002 = C105405Uu.A00(r02, userJid);
                    if (!(A002 == null || (list = A002.A02) == null || list.isEmpty())) {
                        r2.A01.A0G(list);
                    }
                    AnonymousClass5Y9 r32 = r2.A05;
                    C146927Cd r1 = new C146927Cd(r2);
                    AnonymousClass5UJ r22 = r32.A0F;
                    C148077Gv r5 = new C148077Gv(userJid, r32.A0D.A02);
                    C148067Gu r4 = new C148067Gu(r1, r32);
                    AnonymousClass5P8 r12 = r22.A01;
                    C59012wB r7 = r12.A04;
                    AnonymousClass4FS r13 = r12.A0I;
                    AnonymousClass1Ll r03 = r12.A05;
                    AnonymousClass7RW r6 = r12.A03;
                    r22.A03(new C90434hJ(r4, r5, r6, r7, new AnonymousClass7MY(r6, r03), r12.A06, r12.A07, r12.A09, r12.A00(), r13));
                    return;
                }
                Log.d("Promotions feature is not enabled");
                r2.A0A.set(false);
                r2.A01.A0G((Object) null);
                return;
            case 1:
                C90604hu r33 = (C90604hu) this.A00;
                C90254gy r23 = r33.A0I;
                if (r15 != r23.A00) {
                    r23.A00 = r15;
                    C06440Xs layoutManager = r33.A02.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        int A1H = linearLayoutManager.A1H();
                        r33.A0I.A09(A1H, (linearLayoutManager.A1J() - A1H) + 1);
                        return;
                    }
                    r23.A09(0, r23.A00.size());
                    return;
                }
                return;
            case 2:
                CollectionProductListFragment collectionProductListFragment = (CollectionProductListFragment) this.A00;
                collectionProductListFragment.A1K().A00 = r15;
                C49722gz A06 = collectionProductListFragment.A1J().A06(collectionProductListFragment.A1L(), collectionProductListFragment.A1O());
                if (C162457s7.A0P(collectionProductListFragment.A1O(), "catalog_products_all_items_collection_id")) {
                    collectionProductListFragment.A1K().A0Q((C49722gz) null, collectionProductListFragment.A1J().A0B(collectionProductListFragment.A1L()));
                } else if (A06 != null) {
                    List list2 = A06.A04;
                    if (C18310x6.A1X(list2)) {
                        collectionProductListFragment.A1K().A0Q(A06, list2);
                    }
                }
                C162457s7.A0H(collectionProductListFragment.A0B);
                return;
            case 3:
                ((C92264mM) this.A00).A00 = r15;
                return;
            default:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                if (r15 != null) {
                    List list3 = r15.A0O;
                    if (!list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C166447yh r04 = (C166447yh) it.next();
                                if (r04 != null && (str = r04.A00) != null && str.equals("644728732639272")) {
                                    r0 = conversationsFragment.A1k;
                                    z = true;
                                }
                            } else {
                                r0 = conversationsFragment.A1k;
                                z = false;
                            }
                        }
                        C18270x1.A0l(C18270x1.A03(r0), "not_a_business", z);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
