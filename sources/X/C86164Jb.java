package X;

import android.app.Activity;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;
import com.whatsapp.chatinfo.EventsViewModel$queryAndUpdateEvents$1;
import com.whatsapp.comments.CommentListManager$messageObserver$1$onMessagesChanged$1;
import com.whatsapp.comments.CommentListManager$messageObserver$1$onMessagesDeleted$1;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$refreshDb$1;
import com.whatsapp.polls.PollResultsViewModel;
import com.whatsapp.status.StatusesFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4Jb  reason: invalid class name and case insensitive filesystem */
public class C86164Jb implements AnonymousClass4FW {
    public Object A00;
    public final int A01;

    public static void A00(C86164Jb r4, C624134x r5) {
        C162457s7.A0J(r5, 0);
        if (r5 instanceof C30461mU) {
            C95814uZ r1 = r5.A1J.A00;
            AnonymousClass10c r52 = (AnonymousClass10c) r4.A00;
            if (C162457s7.A0P(r1, r52.A06)) {
                C616131n.A02(r52.A07, new EventsViewModel$queryAndUpdateEvents$1(r52, (C84814Du) null), AnonymousClass0IV.A00(r52), (AnonymousClass20D) null, 2);
            }
        }
    }

    public C86164Jb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r3) {
        switch (this.A01) {
            case 4:
                AnonymousClass113 r1 = (AnonymousClass113) this.A00;
                if (C162457s7.A0P(r1.A06, r3)) {
                    C616131n.A02((C85494Gl) null, new ReportToAdminMessagesViewModel$refreshDb$1(r1, (C84814Du) null), AnonymousClass0IV.A00(r1), (AnonymousClass20D) null, 3);
                    return;
                }
                return;
            case 10:
                if (r3 instanceof C135166kE) {
                    ((StatusesFragment) this.A00).A1L();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWS(X.C624134x r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0118;
                case 2: goto L_0x0032;
                case 3: goto L_0x004f;
                case 4: goto L_0x0005;
                case 5: goto L_0x00a1;
                case 6: goto L_0x0005;
                case 7: goto L_0x00c8;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x00e5;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            X.2z0 r3 = X.C624134x.A07(r7)
            X.4uZ r2 = r3.A00
            java.lang.Object r1 = r6.A00
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r1 = (com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel) r1
            com.whatsapp.jid.UserJid r0 = r1.A00
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0026
            X.107 r1 = r1.A07
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A0I(r0)
            return
        L_0x0026:
            boolean r0 = r7 instanceof X.C30241m8
            if (r0 != 0) goto L_0x0005
            boolean r0 = r7 instanceof X.C30341mI
            if (r0 != 0) goto L_0x0005
            r6.A01(r7)
            return
        L_0x0032:
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            java.lang.Object r5 = r6.A00
            X.2yN r5 = (X.C60332yN) r5
            boolean r0 = r5.A00(r7)
            if (r0 == 0) goto L_0x0005
            X.4C6 r4 = r5.A08
            X.3gB r3 = r5.A07
            r2 = 0
            com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageAdded$1 r1 = new com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageAdded$1
            r1.<init>(r5, r7, r2)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x004f:
            boolean r0 = r7 instanceof X.C31861oy
            if (r0 == 0) goto L_0x006d
            r1 = r7
            X.1p0 r1 = (X.C31881p0) r1
            r0 = 1
            com.whatsapp.jid.GroupJid r3 = r1.A1x(r0)
        L_0x005b:
            if (r3 == 0) goto L_0x0077
            java.lang.Object r0 = r6.A00
            X.11B r0 = (X.AnonymousClass11B) r0
            X.3dI r2 = r0.A0N
            r1 = 1
            X.3a6 r0 = new X.3a6
            r0.<init>(r6, r1, r3)
        L_0x0069:
            r2.execute(r0)
            return
        L_0x006d:
            boolean r0 = r7 instanceof X.C31571oV
            if (r0 == 0) goto L_0x0077
            r0 = r7
            X.1oV r0 = (X.C31571oV) r0
            com.whatsapp.jid.GroupJid r3 = r0.A01
            goto L_0x005b
        L_0x0077:
            boolean r0 = r7 instanceof X.C31581oW
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r6.A00
            X.11B r0 = (X.AnonymousClass11B) r0
            X.3dI r2 = r0.A0N
            r0 = 5
        L_0x0082:
            X.3bu r0 = X.C71313bu.A00(r6, r0)
            goto L_0x0069
        L_0x0087:
            boolean r0 = r7 instanceof X.C31741om
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r6.A00
            X.11B r0 = (X.AnonymousClass11B) r0
            X.3dI r2 = r0.A0N
            r0 = 6
            goto L_0x0082
        L_0x0093:
            boolean r0 = X.C627636p.A0n(r7)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r6.A00
            X.11B r0 = (X.AnonymousClass11B) r0
            X.3dI r2 = r0.A0N
            r0 = 7
            goto L_0x0082
        L_0x00a1:
            X.2z0 r0 = r7.A1J
            X.4uZ r3 = r0.A00
            java.lang.Object r2 = r6.A00
            X.2pj r2 = (X.C55062pj) r2
            X.2gb r0 = r2.A05
            java.util.Map r1 = r0.A03
            java.lang.Object r0 = r1.get(r3)
            if (r0 != 0) goto L_0x0005
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L_0x0005
            X.2ss r1 = r2.A04
            X.3Ex r0 = r2.A02
            int r0 = X.AnonymousClass352.A00(r0, r1, r3)
            if (r0 <= 0) goto L_0x0005
            r2.A00()
            return
        L_0x00c8:
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            boolean r0 = r7 instanceof X.C30791n7
            if (r0 == 0) goto L_0x0005
            X.2z0 r2 = r7.A1J
            java.lang.Object r1 = r6.A00
            X.11I r1 = (X.AnonymousClass11I) r1
            X.2z0 r0 = r1.A0F
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0005
            X.1n7 r7 = (X.C30791n7) r7
            r0 = 0
            r1.A0G(r0, r7)
            return
        L_0x00e5:
            X.2z0 r1 = r7.A1J
            X.4uZ r0 = r1.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0005
            java.lang.Object r2 = r6.A00
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            r2.A1L()
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x011c
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x010e
            android.content.Context r0 = r2.A1D()
            if (r0 == 0) goto L_0x010e
            X.33p r0 = r2.A0Z
            r0.A0z()
            android.view.View r1 = r2.A03
            r0 = 8
            r1.setVisibility(r0)
        L_0x010e:
            X.30n r1 = r2.A16
            android.content.Context r0 = r2.A0G()
            r1.A04(r0, r7)
            return
        L_0x0118:
            A00(r6, r7)
            return
        L_0x011c:
            java.util.Set r1 = r2.A1b
            com.whatsapp.jid.UserJid r0 = r7.A0o()
            r1.remove(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86164Jb.BWS(X.34x, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r3 = (com.whatsapp.polls.PollResultsViewModel) r10.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BWU(X.C624134x r11, int r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 1: goto L_0x01a9;
                case 2: goto L_0x0006;
                case 3: goto L_0x0005;
                case 4: goto L_0x0027;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0045;
                case 8: goto L_0x0062;
                case 9: goto L_0x007e;
                case 10: goto L_0x009f;
                case 11: goto L_0x0184;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            r0 = 24
            if (r12 != r0) goto L_0x0005
            java.lang.Object r5 = r10.A00
            X.2yN r5 = (X.C60332yN) r5
            boolean r0 = r5.A00(r11)
            if (r0 == 0) goto L_0x0005
            X.4C6 r4 = r5.A08
            X.3gB r3 = r5.A07
            r2 = 0
            com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageChanged$1 r1 = new com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageChanged$1
            r1.<init>(r5, r11, r2)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x0027:
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            java.lang.Object r2 = r10.A00
            X.113 r2 = (X.AnonymousClass113) r2
            X.1fJ r1 = r2.A06
            X.2z0 r0 = r11.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r2.A0D(r11)
            if (r0 == 0) goto L_0x0005
            X.C616131n.A02((X.C85494Gl) null, new com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$refreshDb$1(r2, (X.C84814Du) null), X.AnonymousClass0IV.A00(r2), (X.AnonymousClass20D) null, 3)
            return
        L_0x0045:
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            boolean r0 = r11 instanceof X.C30791n7
            if (r0 == 0) goto L_0x0005
            X.2z0 r2 = r11.A1J
            java.lang.Object r1 = r10.A00
            X.11I r1 = (X.AnonymousClass11I) r1
            X.2z0 r0 = r1.A0F
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0005
            X.1n7 r11 = (X.C30791n7) r11
            r0 = 0
            r1.A0G(r0, r11)
            return
        L_0x0062:
            if (r11 == 0) goto L_0x0005
            java.lang.Object r3 = r10.A00
            com.whatsapp.polls.PollResultsViewModel r3 = (com.whatsapp.polls.PollResultsViewModel) r3
            X.1mT r2 = r3.A02
            if (r2 == 0) goto L_0x0005
            X.2z0 r0 = r11.A1J
            java.lang.String r1 = r0.A01
            X.2z0 r0 = r2.A1J
            java.lang.String r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0005
            r3.A0F(r2)
            return
        L_0x007e:
            r0 = 8
            if (r12 == r0) goto L_0x0005
            X.2z0 r0 = r11.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = r0 instanceof X.C135176kF
            if (r0 == 0) goto L_0x0005
            r0 = 3
            java.lang.Object r1 = r10.A00
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            if (r12 != r0) goto L_0x01ad
            X.3Wi r3 = r1.A05
            r0 = 7
            X.3br r2 = new X.3br
            r2.<init>((java.lang.Object) r10, (int) r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.A0T(r2, r0)
            return
        L_0x009f:
            X.2z0 r6 = r11.A1J
            X.4uZ r0 = r6.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0005
            r0 = 8
            if (r12 == r0) goto L_0x0005
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0178
            java.lang.Object r3 = r10.A00
            com.whatsapp.status.StatusesFragment r3 = (com.whatsapp.status.StatusesFragment) r3
            X.5Wh r0 = r3.A10
            X.34r r0 = r0.A00
            if (r0 == 0) goto L_0x0178
            X.54U r0 = r3.A17
            X.C18290x4.A1L(r0)
            X.2pt r0 = r3.A0e
            X.54U r1 = new X.54U
            r1.<init>(r0, r3)
            r3.A17 = r1
            X.4FS r0 = r3.A1B
            X.C18270x1.A0w(r1, r0)
            long r1 = r11.A0J
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0104
            X.30n r5 = r3.A16
            android.content.Context r4 = r3.A0G()
            boolean r0 = X.C613930n.A00(r11)
            if (r0 == 0) goto L_0x0005
            java.lang.String r1 = r6.A01
            java.util.Map r8 = r5.A06
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x0005
            r8.put(r1, r11)
            java.util.Iterator r9 = X.AnonymousClass001.A0v(r8)
        L_0x00f1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01b8
            X.34x r0 = X.C18300x5.A0T(r9)
            long r0 = r0.A0J
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x00f1
            return
        L_0x0104:
            boolean r0 = r11 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0005
            r0 = r11
            X.1mV r0 = (X.C30471mV) r0
            X.33C r1 = r0.A01
            if (r1 == 0) goto L_0x0005
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x0005
            boolean r0 = r1.A0c
            if (r0 != 0) goto L_0x0005
            X.30n r2 = r3.A16
            boolean r0 = X.C613930n.A00(r11)
            if (r0 == 0) goto L_0x0005
            java.lang.String r1 = r6.A01
            java.util.Map r0 = r2.A06
            r0.remove(r1)
            boolean r0 = X.C626736a.A07(r11)
            if (r0 == 0) goto L_0x0155
            X.5de r0 = r11.A0O
            if (r0 == 0) goto L_0x0155
            java.util.List r0 = java.util.Collections.singletonList(r11)
            boolean r0 = X.C626736a.A09(r0)
            if (r0 == 0) goto L_0x0155
            com.whatsapp.bridge.wfal.WfalManager r0 = r2.A01
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0155
            X.30E r0 = r2.A02
            X.8qC r0 = r0.A09
            java.lang.Object r0 = r0.get()
            X.3Gn r0 = (X.C65183Gn) r0
            java.util.HashMap r0 = r0.A05
        L_0x014e:
            X.C162457s7.A0C(r1)
            r0.put(r1, r11)
            return
        L_0x0155:
            boolean r0 = X.AnonymousClass36X.A07(r11)
            if (r0 == 0) goto L_0x0005
            X.5de r0 = r11.A0O
            if (r0 == 0) goto L_0x0005
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0005
            X.5Se r0 = r2.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0005
            X.5YA r0 = r2.A03
            X.8qC r0 = r0.A0G
            java.lang.Object r0 = r0.get()
            X.3Gk r0 = (X.C65153Gk) r0
            java.util.HashMap r0 = r0.A06
            goto L_0x014e
        L_0x0178:
            r0 = 12
            if (r12 != r0) goto L_0x0005
            java.lang.Object r0 = r10.A00
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            r0.A1L()
            return
        L_0x0184:
            if (r11 == 0) goto L_0x0005
            X.2z0 r2 = r11.A1J
            java.lang.Object r1 = r10.A00
            X.51v r1 = (X.AnonymousClass51v) r1
            X.34x r0 = r1.A06
            X.2z0 r0 = r0.A1J
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0005
            X.3Wi r2 = r1.A05
            r0 = 23
            X.3cY r1 = new X.3cY
            r1.<init>(r10, r11, r12, r0)
            android.os.Handler r0 = r2.A02
            r0.post(r1)
            return
        L_0x01a9:
            A00(r10, r11)
            return
        L_0x01ad:
            X.20h r0 = X.C369320h.ACCOUNT
            r1.BiY(r0)
            X.20h r0 = X.C369320h.NEWSLETTER
            r1.BiY(r0)
            return
        L_0x01b8:
            boolean r0 = r5.A08()
            if (r0 == 0) goto L_0x01c2
            r5.A06(r4, r3)
            return
        L_0x01c2:
            java.util.Collection r0 = r8.values()
            boolean r0 = X.C626736a.A09(r0)
            if (r0 == 0) goto L_0x01d8
            com.whatsapp.bridge.wfal.WfalManager r0 = r5.A01
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01d8
            r5.A05(r4, r11, r3)
            return
        L_0x01d8:
            java.util.Collection r0 = r8.values()
            java.util.HashSet r2 = X.AnonymousClass0x9.A15(r0)
            r0 = 12
            X.5el r1 = new X.5el
            r1.<init>(r5, r2, r3, r0)
            r0 = 0
            r5.A03(r4, r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86164Jb.BWU(X.34x, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        r3 = (com.whatsapp.polls.PollResultsViewModel) r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BWW(X.C624134x r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 4: goto L_0x0006;
                case 8: goto L_0x0026;
                case 11: goto L_0x0042;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r4.A00
            X.113 r2 = (X.AnonymousClass113) r2
            X.1fJ r1 = r2.A06
            if (r5 == 0) goto L_0x0024
            X.2z0 r0 = r5.A1J
            if (r0 == 0) goto L_0x0024
            X.4uZ r0 = r0.A00
        L_0x0014:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r2.A0D(r5)
            if (r0 == 0) goto L_0x0005
            X.C616131n.A02((X.C85494Gl) null, new com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$refreshDb$1(r2, (X.C84814Du) null), X.AnonymousClass0IV.A00(r2), (X.AnonymousClass20D) null, 3)
            return
        L_0x0024:
            r0 = 0
            goto L_0x0014
        L_0x0026:
            if (r5 == 0) goto L_0x0005
            java.lang.Object r3 = r4.A00
            com.whatsapp.polls.PollResultsViewModel r3 = (com.whatsapp.polls.PollResultsViewModel) r3
            X.1mT r2 = r3.A02
            if (r2 == 0) goto L_0x0005
            X.2z0 r0 = r5.A1J
            java.lang.String r1 = r0.A01
            X.2z0 r0 = r2.A1J
            java.lang.String r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0005
            r3.A0F(r2)
            return
        L_0x0042:
            if (r5 == 0) goto L_0x0005
            X.2z0 r3 = r5.A1J
            java.lang.String r1 = r3.A01
            java.lang.Object r2 = r4.A00
            X.51v r2 = (X.AnonymousClass51v) r2
            X.34x r0 = r2.A06
            X.C626936e.A06(r0)
            X.2z0 r0 = r0.A1J
            java.lang.String r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0005
            X.54T r0 = r2.A00
            X.C18290x4.A1L(r0)
            X.54T r1 = new X.54T
            r1.<init>(r2)
            r2.A00 = r1
            X.4FS r0 = r2.A0a
            X.C18270x1.A0w(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86164Jb.BWW(X.34x):void");
    }

    public void BWX(C624134x r4, C624134x r5) {
        switch (this.A01) {
            case 0:
                C162457s7.A0J(r5, 1);
                AnonymousClass2z0 r2 = r5.A1J;
                if (C162457s7.A0P(r2.A00, ((BotEmbodimentViewModel) this.A00).A00) && !r2.A02 && !(r5 instanceof C30241m8) && !(r5 instanceof C30341mI)) {
                    A01(r5);
                    return;
                }
                return;
            case 4:
                C18260x0.A0O(r4, r5);
                AnonymousClass113 r22 = (AnonymousClass113) this.A00;
                if (C162457s7.A0P(r22.A06, r4.A1J.A00) && r22.A0D(r4)) {
                    C616131n.A02((C85494Gl) null, new ReportToAdminMessagesViewModel$refreshDb$1(r22, (C84814Du) null), AnonymousClass0IV.A00(r22), (AnonymousClass20D) null, 3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BWY(C624134x r4) {
        if (10 - this.A01 == 0 && AnonymousClass2z0.A0B(r4)) {
            StatusesFragment statusesFragment = (StatusesFragment) this.A00;
            statusesFragment.A1b.add(r4.A0o());
            statusesFragment.A1L();
        }
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        if (2 - this.A01 != 0) {
            C381525x.A00(this, collection, i);
            return;
        }
        C60332yN r0 = (C60332yN) this.A00;
        C616131n.A02((C85494Gl) null, new CommentListManager$messageObserver$1$onMessagesChanged$1(r0, collection, (C84814Du) null), r0.A08, (AnonymousClass20D) null, 3);
    }

    public /* synthetic */ void BWf(C95814uZ r4) {
        switch (this.A01) {
            case 8:
                PollResultsViewModel pollResultsViewModel = (PollResultsViewModel) this.A00;
                C30451mT r0 = pollResultsViewModel.A02;
                if (r0 != null && AnonymousClass2z0.A0E(r0, r4)) {
                    if (pollResultsViewModel.A0D.A05(pollResultsViewModel.A02.A1J) == null) {
                        AnonymousClass0x7.A18(pollResultsViewModel.A0E);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                if (r4 instanceof C135166kE) {
                    ((StatusesFragment) this.A00).A1L();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BWg(Collection collection, Map map) {
        switch (this.A01) {
            case 2:
                C162457s7.A0J(collection, 0);
                C60332yN r0 = (C60332yN) this.A00;
                C616131n.A02(r0.A07, new CommentListManager$messageObserver$1$onMessagesDeleted$1(r0, collection, (C84814Du) null), r0.A08, (AnonymousClass20D) null, 2);
                return;
            case 4:
                C162457s7.A0J(collection, 0);
                AnonymousClass113 r4 = (AnonymousClass113) this.A00;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        C624134x A0T = C18300x5.A0T(it);
                        if (C162457s7.A0P(A0T.A1J.A00, r4.A06) && r4.A0D(A0T)) {
                            C616131n.A02((C85494Gl) null, new ReportToAdminMessagesViewModel$refreshDb$1(r4, (C84814Du) null), AnonymousClass0IV.A00(r4), (AnonymousClass20D) null, 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    C624134x A0T2 = C18300x5.A0T(it2);
                    if (A0T2.A1J.A00 != null && C627636p.A0J(A0T2.A1I)) {
                        ((Activity) this.A00).finish();
                    }
                }
                return;
            case 8:
                PollResultsViewModel pollResultsViewModel = (PollResultsViewModel) this.A00;
                if (pollResultsViewModel.A02 != null) {
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        if (C18300x5.A0T(it3).A1J.equals(pollResultsViewModel.A02.A1J)) {
                            AnonymousClass0x7.A18(pollResultsViewModel.A0E);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 10:
                Iterator it4 = collection.iterator();
                boolean z = false;
                while (it4.hasNext()) {
                    C624134x A0T3 = C18300x5.A0T(it4);
                    AnonymousClass2z0 r1 = A0T3.A1J;
                    if (r1.A00 instanceof C135166kE) {
                        if (!z) {
                            ((StatusesFragment) this.A00).A1L();
                            z = true;
                        }
                        if (r1.A02) {
                            StatusesFragment statusesFragment = (StatusesFragment) this.A00;
                            if (statusesFragment.A11.A00() && !C627636p.A0l(A0T3)) {
                                statusesFragment.A13.A0C.A02(A0T3, (Long) null, (String) null, 5);
                            }
                        }
                    }
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public final void A01(C624134x r7) {
        AnonymousClass21Q r5;
        AnonymousClass08M r1;
        Object A07;
        C51962kf A0q = r7.A0q();
        if (A0q != null) {
            r5 = A0q.A00;
        } else {
            r5 = null;
        }
        int i = 4;
        boolean z = false;
        if (C73833g9.A06(null, AnonymousClass21Q.LAST, AnonymousClass21Q.FULL, AnonymousClass21Q.TIMED_OUT).contains(r5)) {
            i = 5;
        }
        BotEmbodimentViewModel botEmbodimentViewModel = (BotEmbodimentViewModel) this.A00;
        AnonymousClass107 r12 = botEmbodimentViewModel.A07;
        Number number = (Number) r12.A07();
        if (number == null || number.intValue() != i) {
            z = true;
        }
        C06270Wx.A03(r12, i);
        if (r7.A0p() != null) {
            r1 = botEmbodimentViewModel.A01;
            A07 = r7.A0p();
        } else if (z) {
            r1 = botEmbodimentViewModel.A01;
            C162457s7.A0J(r1, 0);
            A07 = r1.A07();
        } else {
            return;
        }
        r1.A0H(A07);
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
