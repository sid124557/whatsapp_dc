package X;

import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.688  reason: invalid class name */
public class AnonymousClass688 extends C56252rg {
    public Object A00;
    public final int A01;

    public AnonymousClass688(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(GroupJid groupJid) {
        switch (this.A01) {
            case 2:
                C87194Oj r0 = ((ConversationsFragment) this.A00).A1V;
                if (r0 != null) {
                    r0.notifyDataSetChanged();
                    return;
                }
                return;
            case 3:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (groupJid.equals(groupChatInfoActivity.A1i)) {
                    groupChatInfoActivity.A7J();
                    groupChatInfoActivity.A7K();
                    return;
                }
                return;
            default:
                super.A00(groupJid);
                return;
        }
    }

    public void A02(GroupJid groupJid, GroupJid groupJid2) {
        if (3 - this.A01 != 0) {
            super.A02(groupJid, groupJid2);
            return;
        }
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
        if (groupJid.equals(groupChatInfoActivity.A1i) && groupJid2.equals(groupChatInfoActivity.A1h)) {
            C005205m.A00(groupChatInfoActivity, R.id.link_to_community_home_card).setVisibility(8);
            C86654Ky.A0s(groupChatInfoActivity, R.id.remove_group_from_community, 8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(com.whatsapp.jid.GroupJid r8, java.util.List r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A03(r8, r9)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r5 = r7.A00
            com.whatsapp.community.CommunityHomeActivity r5 = (com.whatsapp.community.CommunityHomeActivity) r5
            X.1fJ r0 = r5.A0p
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.1fJ r6 = r5.A0p
            goto L_0x0026
        L_0x0018:
            java.lang.Object r5 = r7.A00
            com.whatsapp.community.CommunityNavigationActivity r5 = (com.whatsapp.community.CommunityNavigationActivity) r5
            X.1fJ r0 = r5.A0b
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.1fJ r6 = r5.A0b
        L_0x0026:
            int r0 = r9.size()
            if (r0 == 0) goto L_0x0008
            int r1 = r9.size()
            r3 = 0
            r0 = 1
            if (r1 != r0) goto L_0x006a
            r2 = 2131891624(0x7f1215a8, float:1.9417973E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r0 = r9.get(r3)
            java.lang.String r0 = X.AnonymousClass002.A0F(r5, r0, r1, r3, r2)
        L_0x0041:
            X.2iE r3 = new X.2iE
            r3.<init>()
            r3.A08 = r0
            r2 = 2131891623(0x7f1215a7, float:1.9417971E38)
            r1 = 4
            X.69T r0 = new X.69T
            r0.<init>(r5, r1, r6)
            r3.A01(r0, r2)
            r0 = 8
            X.90p r1 = new X.90p
            r1.<init>(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r3.A04 = r0
            r3.A07 = r1
            androidx.fragment.app.DialogFragment r0 = r3.A00()
            r5.Boo(r0)
            return
        L_0x006a:
            int r0 = r9.size()
            r4 = 2
            android.content.res.Resources r3 = r5.getResources()
            if (r0 != r4) goto L_0x0082
            r2 = 2131891625(0x7f1215a9, float:1.9417975E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.C18290x4.A1T(r9, r1)
        L_0x007d:
            java.lang.String r0 = r3.getString(r2, r1)
            goto L_0x0041
        L_0x0082:
            r2 = 2131891626(0x7f1215aa, float:1.9417977E38)
            java.lang.Object[] r1 = X.AnonymousClass0x9.A1X()
            X.C18290x4.A1T(r9, r1)
            int r0 = X.AnonymousClass002.A04(r9, r4)
            X.AnonymousClass000.A1P(r1, r0, r4)
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass688.A03(com.whatsapp.jid.GroupJid, java.util.List):void");
    }
}
