package X;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5r6  reason: invalid class name and case insensitive filesystem */
public class C116935r6 implements AnonymousClass499 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C116935r6(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static final void A00(C116935r6 r9, C108985dt r10) {
        C108755dV r0;
        List<C165977xw> list;
        String str;
        C90304h3 r3 = (C90304h3) r9.A00;
        C108635dJ r1 = (C108635dJ) r9.A01;
        if (!r3.A07.A01(r10) || (r0 = r1.A04) == null || (list = r0.A02) == null || list.isEmpty()) {
            r3.A03.setVisibility(8);
            r3.A04.setVisibility(8);
            return;
        }
        TextEmojiLabel textEmojiLabel = r3.A03;
        textEmojiLabel.setVisibility(0);
        ArrayList A0s = AnonymousClass001.A0s();
        for (C165977xw r92 : list) {
            C620733j r8 = r3.A08;
            boolean A04 = C620733j.A04(r8);
            Object[] A0M = AnonymousClass002.A0M();
            if (A04) {
                A0M[0] = r92.A00.toUpperCase(C620733j.A02(r8));
                A0M[1] = r92.A01.toUpperCase(C620733j.A02(r8));
                str = "%s: %s";
            } else {
                A0M[0] = r92.A01.toUpperCase(C620733j.A02(r8));
                A0M[1] = r92.A00.toUpperCase(C620733j.A02(r8));
                str = "%s :%s";
            }
            A0s.add(String.format(str, A0M));
        }
        if (A0s.size() > 0) {
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.setText((CharSequence) A0s.get(0));
        }
        if (A0s.size() > 1) {
            TextEmojiLabel textEmojiLabel2 = r3.A04;
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.setText((CharSequence) A0s.get(1));
        }
    }

    public final void BNt(C108985dt r13) {
        String str;
        MenuItem A04;
        C105255Ue r0;
        C108775dX r1;
        C165997xy r02;
        C165997xy r03;
        switch (this.A02) {
            case 0:
                C90504hW r5 = (C90504hW) this.A00;
                C146967Ch r2 = (C146967Ch) this.A01;
                r5.A0H.A00 = r13;
                if (r2 instanceof C132306f4) {
                    C132306f4 r22 = (C132306f4) r2;
                    if (AnonymousClass75J.A00(r22.A00, r5.A0M)) {
                        AnonymousClass7KK r12 = r22.A00;
                        if (r12.A02 && !r12.A01) {
                            r5.A0I.A03 = true;
                        }
                        r5.A0R = true;
                        r5.invalidateOptionsMenu();
                        C90264gz r23 = r5.A0H;
                        UserJid userJid = r5.A0M;
                        C162457s7.A0J(userJid, 0);
                        r23.A0U(userJid);
                        r23.A0R();
                        r23.A05();
                        C87614Tz r14 = r5.A0I;
                        if (r14.A02 && r14.A03) {
                            r5.A0N.A06("catalog_collections_view_tag", true);
                            return;
                        }
                        return;
                    }
                    return;
                } else if ((r2 instanceof C132296f3) && AnonymousClass75J.A00(r2.A00, r5.A0M)) {
                    C87614Tz r04 = r5.A0I;
                    boolean z = true;
                    r04.A03 = true;
                    Integer num = r04.A01;
                    if (num != null) {
                        r5.A0H.A0S(num.intValue());
                        r0 = r5.A0N;
                        z = false;
                    } else if (!r5.A0D.A02) {
                        r5.A0R = true;
                        r5.invalidateOptionsMenu();
                        C90264gz r24 = r5.A0H;
                        UserJid userJid2 = r5.A0M;
                        C162457s7.A0J(userJid2, 0);
                        r24.A0U(userJid2);
                        r24.A0R();
                        r24.A05();
                        r0 = r5.A0N;
                    } else {
                        return;
                    }
                    r0.A06("catalog_collections_view_tag", z);
                    return;
                } else {
                    return;
                }
            case 1:
                UserJid userJid3 = (UserJid) this.A01;
                C90504hW r3 = ((C111765ie) this.A00).A00;
                r3.A0R = true;
                r3.invalidateOptionsMenu();
                C90264gz r15 = r3.A0H;
                r15.A00 = r13;
                C162457s7.A0J(userJid3, 0);
                r15.A0U(userJid3);
                r15.A0R();
                r15.A05();
                C87614Tz r16 = r3.A0I;
                if (r16.A02 && r16.A03) {
                    r3.A0N.A06("catalog_collections_view_tag", true);
                    return;
                }
                return;
            case 2:
                ProductListActivity productListActivity = (ProductListActivity) this.A00;
                List list = (List) this.A01;
                AnonymousClass4XL r6 = productListActivity.A0H;
                r6.A01 = r13;
                List list2 = r6.A0B;
                AnonymousClass0U0 A002 = AnonymousClass0SC.A00(new AnonymousClass6HA(list2, list));
                list2.clear();
                list2.addAll(list);
                A002.A01(r6.A00);
                if (list.size() > 0) {
                    productListActivity.A00.setVisibility(8);
                }
                if (productListActivity.A0I.A00.A07() != null && C86604Kt.A05(productListActivity.A0I.A00) == 2) {
                    productListActivity.A0N.A05("plm_details_view_tag", "ProductsCount", String.valueOf(list.size()));
                    productListActivity.A0N.A06("plm_details_view_tag", true);
                    return;
                }
                return;
            case 3:
                A00(this, r13);
                return;
            case 4:
                AnonymousClass4U5 r25 = (AnonymousClass4U5) this.A00;
                C150967Sx r52 = (C150967Sx) this.A01;
                if (r13 != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (C166447yh r05 : r13.A0O) {
                        A0s.add(r05.A00);
                    }
                    C186048uf r62 = r25.A0H;
                    Jid jid = r25.A04;
                    AnonymousClass4UB r32 = r25.A0Q.A00;
                    AnonymousClass5ZO r9 = r32.A01;
                    String str2 = r25.A0M.A0P;
                    AnonymousClass7H6 r7 = null;
                    if (r25.A0R.A01()) {
                        A0s = null;
                    }
                    C150967Sx r8 = new C150967Sx(r52.A00, A0s, r52.A02);
                    if (C157167hq.A00(r32.A01)) {
                        r7 = r25.A0D();
                    }
                    r62.B3B(r7, r8, r9, jid, str2);
                    return;
                }
                return;
            case 5:
                BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) this.A00;
                List list3 = (List) this.A01;
                businessProductListBaseFragment.A1K().A00 = r13;
                C90254gy A1K = businessProductListBaseFragment.A1K();
                if (A1K instanceof BusinessProductListAdapter) {
                    List list4 = A1K.A00;
                    if (list4.isEmpty()) {
                        A1K.A0Q((C49722gz) null, list3);
                    } else {
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            C109015dw A12 = C86664Kz.A12(it);
                            C162457s7.A0J(A12, 0);
                            if (A12.A01()) {
                                list4.add(AnonymousClass002.A03(list4), new C132426fH(A12, A1K.A0K(A12)));
                                A1K.A07(AnonymousClass002.A03(list4));
                            }
                        }
                    }
                }
                ((C125216Gu) businessProductListBaseFragment.A0L.getValue()).A02.A00();
                RecyclerView recyclerView = businessProductListBaseFragment.A00;
                if (recyclerView != null) {
                    recyclerView.post(new C71553cI((Object) businessProductListBaseFragment, 6));
                    return;
                }
                return;
            case 6:
                C92264mM r72 = (C92264mM) this.A00;
                Menu menu = (Menu) this.A01;
                if (r13 == null) {
                    return;
                }
                if (!r13.A0c || !r72.A0M.A0X(957)) {
                    C105035Th r17 = r72.A05;
                    if (r17.A01(r13)) {
                        if (menu.findItem(30) != null) {
                            menu.removeItem(30);
                        }
                        A04 = menu.add(0, 30, 1, R.string.f11nameremoved).setIcon(R.drawable.ic_action_view_shop);
                        View A0F = C86644Kx.A0F(A04, R.layout.f8nameremoved);
                        A0F.setTag(R.id.tag_shop_url, r13.A0J);
                        C18300x5.A13(r72.A01, A0F, R.string.f11nameremoved);
                        r72.A06(A04, R.string.f11nameremoved, true);
                    } else if (!r13.A0Y) {
                        return;
                    } else {
                        if ((!r13.A0X || r17.A03(r13)) && !"PERMANENT".equals(r17.A00(r13))) {
                            if (menu.findItem(29) != null) {
                                menu.removeItem(29);
                            }
                            A04 = r72.A04(menu, 29, R.string.f11nameremoved, R.drawable.ic_action_view_catalog);
                            C009707r r26 = r72.A01;
                            ImageView imageView = (ImageView) C86664Kz.A0g(LayoutInflater.from(r26), R.layout.f8nameremoved);
                            C18290x4.A1A(r26, imageView, R.drawable.ic_action_view_catalog);
                            C18300x5.A13(r26, imageView, R.string.f11nameremoved);
                            A04.setActionView(imageView);
                            r72.A06(A04, R.string.f11nameremoved, true);
                        } else {
                            return;
                        }
                    }
                    A04.setShowAsAction(2);
                    return;
                }
                return;
            case 7:
                C92264mM r53 = (C92264mM) this.A00;
                Jid jid2 = (Jid) this.A01;
                String A003 = r53.A05.A00(r13);
                switch (A003.hashCode()) {
                    case -839883634:
                        str = "PERMANENT";
                        break;
                    case 181990675:
                        if (A003.equals("UNBLOCKED")) {
                            r53.A07.A01(7);
                            C111095hX r33 = r53.A02;
                            C009707r r27 = r53.A01;
                            r33.A0A(r27, C627736r.A0c(r27, jid2, (Integer) null, 12));
                            return;
                        }
                        return;
                    case 476614193:
                        str = "TEMPORARY";
                        break;
                    default:
                        return;
                }
                if (A003.equals(str)) {
                    r53.A08.A02(r53.A01, A003);
                    return;
                }
                return;
            default:
                C92694n6 r63 = (C92694n6) this.A00;
                C52842m8 r54 = (C52842m8) this.A01;
                ConversationRowContactInfoLinkedAccount conversationRowContactInfoLinkedAccount = r63.A09;
                C108775dX r28 = null;
                if (r13 == null || (r03 = r13.A05) == null) {
                    r1 = null;
                } else {
                    r1 = r03.A00;
                }
                r63.A27(r1, conversationRowContactInfoLinkedAccount, r54.A01);
                ConversationRowContactInfoLinkedAccount conversationRowContactInfoLinkedAccount2 = r63.A0A;
                if (!(r13 == null || (r02 = r13.A05) == null)) {
                    r28 = r02.A01;
                }
                r63.A27(r28, conversationRowContactInfoLinkedAccount2, r54.A02);
                View view = r63.A07;
                int i = 0;
                if (!(conversationRowContactInfoLinkedAccount.getVisibility() == 0 && conversationRowContactInfoLinkedAccount2.getVisibility() == 0)) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
        }
    }
}
