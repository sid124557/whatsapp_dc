package X;

import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.community.AddGroupsToCommunityActivity;
import com.whatsapp.community.NewCommunityActivity;
import com.whatsapp.community.communityInfo.CAGInfoViewModel;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.inappsupport.ui.ContactUsWithAiViewModel;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4IC  reason: invalid class name */
public class AnonymousClass4IC implements AnonymousClass4FI {
    public Object A00;
    public final int A01;

    public AnonymousClass4IC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BQA(C95814uZ r4) {
        switch (this.A01) {
            case 9:
                Log.i("newgroup/onConversationAdded");
                NewGroup newGroup = (NewGroup) this.A00;
                AnonymousClass0PJ r0 = newGroup.A07;
                if (r0 != null && r0.A00.equals(r4)) {
                    Log.i("newgroup/onConversationAdded/processing runAfterTempConversationAddedToDb");
                    AnonymousClass0x9.A1K(newGroup.A07.A01);
                    newGroup.A07 = null;
                    return;
                }
                return;
            case 10:
                C162457s7.A0J(r4, 0);
                ContactUsWithAiViewModel contactUsWithAiViewModel = (ContactUsWithAiViewModel) this.A00;
                if (r4.equals(contactUsWithAiViewModel.A00)) {
                    C69263Wi.A04(contactUsWithAiViewModel.A04, contactUsWithAiViewModel, this, 46);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void BQB(C95814uZ r5) {
        C69263Wi r3;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                C18260x0.A1R(AnonymousClass001.A0o(), "acceptlink/onConversationChanged/", r5);
                AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A00;
                Object obj = acceptInviteLinkActivity.A0N.get();
                if (obj != null && obj.equals(r5)) {
                    r3 = acceptInviteLinkActivity.A05;
                    runnable = new C70173a4(obj, 49, this);
                    break;
                } else {
                    return;
                }
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (contactInfoActivity.A1K != null && r5 != null && r5.equals(contactInfoActivity.A7H())) {
                    r3 = contactInfoActivity.A05;
                    runnable = new C71553cI((Object) this, 10);
                    break;
                } else {
                    return;
                }
            case 7:
                C162457s7.A0J(r5, 0);
                CAGInfoViewModel cAGInfoViewModel = (CAGInfoViewModel) this.A00;
                C27991fJ r0 = cAGInfoViewModel.A04;
                if (r0 == null) {
                    throw C18270x1.A0S("cagJid");
                } else if (r5.equals(r0)) {
                    cAGInfoViewModel.A0D();
                    return;
                } else {
                    return;
                }
            case 8:
                if (r5 != null) {
                    GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                    if (r5.equals(groupChatInfoActivity.A1h)) {
                        r3 = groupChatInfoActivity.A05;
                        runnable = new C69993Zl(this, 47);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 9:
                C18260x0.A1R(AnonymousClass001.A0o(), "newgroup/onConversationChanged/", r5);
                NewGroup newGroup = (NewGroup) this.A00;
                Object obj2 = newGroup.A0q.get();
                if (obj2 != null && obj2.equals(r5)) {
                    r3 = newGroup.A05;
                    runnable = new C70103Zx(this, 36, obj2);
                    break;
                } else {
                    return;
                }
                break;
            case 11:
                C18260x0.A1R(AnonymousClass001.A0o(), "ViewGroupInviteActivity/onConversationChanged/", r5);
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A00;
                Object obj3 = viewGroupInviteActivity.A0V.get();
                if (obj3 != null && obj3.equals(r5)) {
                    r3 = viewGroupInviteActivity.A05;
                    runnable = new C71353by(this, 1, obj3);
                    break;
                } else {
                    return;
                }
            case 12:
                if (r5 instanceof GroupJid) {
                    AnonymousClass3DR r2 = (AnonymousClass3DR) this.A00;
                    C70113Zy.A01(r2.A08, r2, r5, 28);
                    return;
                }
                return;
            case 13:
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A00;
                if (C162457s7.A0P(r5, newsletterInfoActivity.A7H())) {
                    r3 = newsletterInfoActivity.A05;
                    runnable = new C70023Zo(newsletterInfoActivity, 28);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r3.A0S(runnable);
    }

    public /* synthetic */ void BQD(C95814uZ r1) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        r2.execute(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        if (r5.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        if ((!r1.A0E) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0093, code lost:
        r1.startActivity(X.C627736r.A00(r1.getApplicationContext()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BQE(X.C95814uZ r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 1: goto L_0x0006;
                case 2: goto L_0x0005;
                case 3: goto L_0x000f;
                case 4: goto L_0x0005;
                case 5: goto L_0x004c;
                case 6: goto L_0x0005;
                case 7: goto L_0x0062;
                case 8: goto L_0x0081;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x009f;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r4.A00
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            com.whatsapp.jid.UserJid r0 = r1.A7H()
            goto L_0x0087
        L_0x000f:
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass32V.A00(r5)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r3 = r4.A00
            X.11H r3 = (X.AnonymousClass11H) r3
            X.2lX r1 = r3.A0r
            X.3ZH r0 = r3.A04
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0005
            java.util.List r0 = r3.A1B
            java.util.Iterator r2 = r0.iterator()
        L_0x0029:
            r1 = 0
        L_0x002a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0040
            X.2mC r0 = X.AnonymousClass0x7.A0O(r2)
            if (r1 != 0) goto L_0x003e
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0029
        L_0x003e:
            r1 = 1
            goto L_0x002a
        L_0x0040:
            if (r1 == 0) goto L_0x0005
            X.3dI r2 = r3.A12
            r0 = 45
            X.3cI r1 = new X.3cI
            r1.<init>((java.lang.Object) r3, (int) r0)
            goto L_0x005e
        L_0x004c:
            java.lang.Object r1 = r4.A00
            X.11B r1 = (X.AnonymousClass11B) r1
            boolean r0 = r1.A0G(r5)
            if (r0 == 0) goto L_0x0005
            X.3dI r2 = r1.A0N
            r0 = 8
            X.3bu r1 = X.C71313bu.A00(r4, r0)
        L_0x005e:
            r2.execute(r1)
            return
        L_0x0062:
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            java.lang.Object r1 = r4.A00
            com.whatsapp.community.communityInfo.CAGInfoViewModel r1 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r1
            X.1fJ r0 = r1.A04
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "cagJid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0075:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.4UC r0 = r1.A0K
            X.AnonymousClass0x7.A18(r0)
            return
        L_0x0081:
            java.lang.Object r1 = r4.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            X.1fJ r0 = r1.A1h
        L_0x0087:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r1.A0E
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0005
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Intent r0 = X.C627736r.A00(r0)
            r1.startActivity(r0)
            return
        L_0x009f:
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            java.lang.Object r1 = r4.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.4uY r0 = r1.A7H()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r1.A0E
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0005
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Intent r0 = X.C627736r.A00(r0)
            X.C162457s7.A0D(r0)
            r1.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4IC.BQE(X.4uZ):void");
    }

    public /* synthetic */ void BQH(int i) {
        if (4 - this.A01 == 0) {
            C59712xM.A00((C59712xM) this.A00);
        }
    }

    public void BQI() {
        C69263Wi r4;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A00;
                Object obj = acceptInviteLinkActivity.A0N.get();
                C18260x0.A1R(AnonymousClass001.A0o(), "acceptlink/onConversationsListChanged ", obj);
                if (obj != null) {
                    r4 = acceptInviteLinkActivity.A05;
                    runnable = new C70173a4(obj, 48, this);
                    break;
                } else {
                    return;
                }
            case 2:
                Log.i("AddGroupsToCommunityActivity/onConversationsListChanged/");
                AddGroupsToCommunityActivity addGroupsToCommunityActivity = (AddGroupsToCommunityActivity) this.A00;
                Object obj2 = addGroupsToCommunityActivity.A0R.get();
                if (obj2 != null) {
                    r4 = addGroupsToCommunityActivity.A05;
                    runnable = new C71653cS(this, 22, obj2);
                    break;
                } else {
                    return;
                }
            case 6:
                Log.i("NewCommunityActivity/onConversationsListChanged/");
                NewCommunityActivity newCommunityActivity = (NewCommunityActivity) this.A00;
                Object obj3 = newCommunityActivity.A0Q.get();
                if (obj3 != null) {
                    r4 = newCommunityActivity.A05;
                    runnable = new C70193a6(this, 7, obj3);
                    break;
                } else {
                    return;
                }
            case 9:
                Log.i("newgroup/onConversationsListChanged");
                NewGroup newGroup = (NewGroup) this.A00;
                Object obj4 = newGroup.A0q.get();
                if (obj4 != null) {
                    r4 = newGroup.A05;
                    runnable = new C70103Zx(newGroup, 35, obj4);
                    break;
                } else {
                    return;
                }
            case 11:
                Log.i("ViewGroupInviteActivity/onConversationsListChanged");
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A00;
                Object obj5 = viewGroupInviteActivity.A0V.get();
                if (obj5 != null) {
                    r4 = viewGroupInviteActivity.A05;
                    runnable = new C71353by(this, 2, obj5);
                    break;
                } else {
                    return;
                }
            case 14:
                ((AnonymousClass35T) this.A00).A0B();
                return;
            default:
                return;
        }
        r4.A0S(runnable);
    }

    public /* synthetic */ void BQC(C95814uZ r1, boolean z) {
    }
}
