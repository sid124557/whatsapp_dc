package X;

import com.whatsapp.WaEditText;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.274  reason: invalid class name */
public class AnonymousClass274 extends AnonymousClass8V2 implements AnonymousClass4GR {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass274(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0013;
                case 2: goto L_0x001c;
                case 3: goto L_0x0025;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.7SK> r3 = X.AnonymousClass7SK.class
            java.lang.String r4 = "fromTreeNode"
            java.lang.String r5 = "fromTreeNode(Lcom/whatsapp/group/batch/iq/BatchGetGroupInfoRequest;Lcom/whatsapp/protocol/ProtocolTreeNode;)Lcom/whatsapp/group/batch/iq/BatchGetGroupInfoResponse;"
        L_0x000c:
            r1 = 2
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel> r3 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.class
            java.lang.String r4 = "onSingleAction"
            java.lang.String r5 = "onSingleAction(Lcom/whatsapp/community/membersuggestedgroups/SubgroupSuggestion;Lcom/whatsapp/community/membersuggestedgroups/SubgroupAction;)V"
            goto L_0x000c
        L_0x001c:
            java.lang.Class<com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet> r3 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.class
            java.lang.String r4 = "onToggleFavoriteSticker"
            java.lang.String r5 = "onToggleFavoriteSticker(Lcom/whatsapp/funstickers/data/model/FunStickerModel;Lcom/whatsapp/stickers/Sticker;)V"
            goto L_0x000c
        L_0x0025:
            java.lang.Class<com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet> r3 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.class
            java.lang.String r4 = "loadStickerOnDemand"
            java.lang.String r5 = "loadStickerOnDemand(Lcom/whatsapp/funstickers/data/model/FunStickerModel;I)V"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass274.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (this.A00) {
            case 0:
            case 1:
                C370320r r6 = (C370320r) obj3;
                C18270x1.A14(obj, r6);
                MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.receiver;
                List A12 = C18290x4.A12(obj);
                C616131n.A02(memberSuggestedGroupsManagementViewModel.A0E, new MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(memberSuggestedGroupsManagementViewModel, r6, A12, (C84814Du) null, false), AnonymousClass0IV.A00(memberSuggestedGroupsManagementViewModel), (AnonymousClass20D) null, 2);
                break;
            case 2:
                AnonymousClass39D r4 = (AnonymousClass39D) obj4;
                AnonymousClass39M r62 = (AnonymousClass39M) obj3;
                C18260x0.A0O(r4, r62);
                SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.receiver;
                WaEditText waEditText = searchFunStickersBottomSheet.A08;
                if (waEditText != null) {
                    waEditText.A05();
                }
                if (r4.A08 != null) {
                    SearchFunStickersViewModel A0O = C18300x5.A0O(searchFunStickersBottomSheet);
                    C616131n.A02((C85494Gl) null, new SearchFunStickersViewModel$onToggleFavoriteSticker$1(A0O, r62, (C84814Du) null), AnonymousClass0IV.A00(A0O), (AnonymousClass20D) null, 3);
                    break;
                }
                break;
            case 3:
                AnonymousClass39D r42 = (AnonymousClass39D) obj4;
                int A06 = AnonymousClass0x2.A06(obj2, r42);
                SearchFunStickersViewModel A0O2 = C18300x5.A0O((SearchFunStickersBottomSheet) this.receiver);
                Log.d("SearchFunStickersViewModel/getSticker");
                String str = r42.A08;
                if (str != null) {
                    C616131n.A02((C85494Gl) null, new SearchFunStickersViewModel$fetchSticker$1$1(A0O2, r42, str, (C84814Du) null, A06), AnonymousClass0IV.A00(A0O2), (AnonymousClass20D) null, 3);
                    break;
                }
                break;
            default:
                AnonymousClass3YS r43 = (AnonymousClass3YS) obj4;
                AnonymousClass36K r63 = (AnonymousClass36K) obj3;
                C18260x0.A0O(r43, r63);
                return ((AnonymousClass7SK) this.receiver).A00(r43, r63);
        }
        return C59022wD.A00;
    }
}
