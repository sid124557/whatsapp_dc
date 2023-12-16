package X;

import com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.6Bf  reason: invalid class name and case insensitive filesystem */
public class C124166Bf implements AnonymousClass4FW {
    public Object A00;
    public final int A01;

    public C124166Bf(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass5OX r0, AnonymousClass4VQ r1) {
        r1.A14.A0H(r0.A00());
    }

    public final void A01(C624134x r5) {
        if (r5 != null) {
            AnonymousClass2z0 r3 = r5.A1J;
            String str = r3.A01;
            MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this.A00;
            if (!str.equals(messageDetailsActivity.A0Q.A1J.A01)) {
                return;
            }
            if (r3.A02 || (r5 instanceof C30451mT)) {
                messageDetailsActivity.A75();
                messageDetailsActivity.A0H.A1H();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r8 = r14.A1J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r4 = r14.A1J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BNb(X.C624134x r36, int r37) {
        /*
            r35 = this;
            r1 = r35
            int r0 = r1.A01
            r14 = r36
            switch(r0) {
                case 11: goto L_0x0040;
                case 23: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            if (r36 == 0) goto L_0x0009
            X.2z0 r4 = r14.A1J
            X.4uZ r3 = r4.A00
            if (r3 == 0) goto L_0x0009
            java.lang.Object r2 = r1.A00
            com.whatsapp.status.playback.StatusReplyActivity r2 = (com.whatsapp.status.playback.StatusReplyActivity) r2
            X.4uZ r0 = r2.A0p
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0009
            byte r1 = r14.A1I
            r0 = 8
            if (r1 == r0) goto L_0x0009
            r0 = 7
            if (r1 == r0) goto L_0x0009
            X.2zI r0 = r2.A00
            r2 = 4
            android.content.SharedPreferences r0 = r0.A02()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = r4.A01
            java.lang.String r0 = X.C60862zI.A00(r3, r0)
            X.C18270x1.A0h(r1, r0, r2)
            return
        L_0x0040:
            java.lang.Object r4 = r1.A00
            X.4VQ r4 = (X.AnonymousClass4VQ) r4
            X.5OX r3 = new X.5OX
            r3.<init>()
            X.7Mj r2 = new X.7Mj
            r2.<init>()
            if (r36 == 0) goto L_0x01de
            X.2z0 r8 = r14.A1J
            X.4uZ r7 = r8.A00
            if (r7 == 0) goto L_0x01de
            X.4uZ r6 = r4.A0x
            boolean r0 = r7.equals(r6)
            if (r0 == 0) goto L_0x01de
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x01de
            byte r5 = r14.A1I
            r0 = 8
            if (r5 == r0) goto L_0x01de
            r0 = 87
            if (r5 == r0) goto L_0x01de
            r0 = 88
            if (r5 == r0) goto L_0x01de
            boolean r0 = X.C624134x.A0g(r14)
            if (r0 != 0) goto L_0x01de
            boolean r0 = r14 instanceof X.AnonymousClass48R
            if (r0 != 0) goto L_0x01de
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagesViewModel/observer/beforemsgadded/add "
            r1.append(r0)
            java.lang.String r8 = r8.A01
            r1.append(r8)
            java.lang.String r0 = " "
            X.C18260x0.A0w(r0, r1, r5)
            X.5Qe r5 = r4.A0h
            boolean r0 = r4.A1M
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r14 instanceof X.C30341mI
            if (r0 == 0) goto L_0x00cc
            r0 = r14
            X.1mI r0 = (X.C30341mI) r0
            int r9 = r0.A00
            r1 = 1
            if (r9 == r1) goto L_0x00ca
            r0 = 27
            if (r9 == r0) goto L_0x00ca
            r0 = 4
            if (r9 == r0) goto L_0x00ca
            r0 = 5
            if (r9 == r0) goto L_0x00ca
            r0 = 7
            if (r9 == r0) goto L_0x00ca
            boolean r0 = X.C627636p.A0K(r9)
            if (r0 != 0) goto L_0x00ca
            r0 = 13
            if (r9 == r0) goto L_0x00ca
            r0 = 14
            if (r9 == r0) goto L_0x00ca
            r0 = 17
            if (r9 == r0) goto L_0x00ca
            r0 = 31
            if (r9 == r0) goto L_0x00ca
            r0 = 32
            if (r9 == r0) goto L_0x00ca
            r0 = 56
            if (r9 != r0) goto L_0x00cc
        L_0x00ca:
            r2.A02 = r1
        L_0x00cc:
            monitor-enter(r4)
            X.2Ni r0 = r4.A0C     // Catch:{ all -> 0x00d0 }
            goto L_0x00d3
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00d3:
            monitor-exit(r4)
            boolean r0 = r5.A00(r0, r6, r14)
            if (r0 == 0) goto L_0x00eb
            java.util.List r0 = r4.A1I
            r0.add(r14)
            X.6aY r0 = X.C129586aY.copyOf((java.util.Collection) r0)
            r3.A00 = r0
            r0 = 1
            r3.A06 = r0
            r4.A0L()
        L_0x00eb:
            int r0 = r4.A07
            if (r0 == 0) goto L_0x00fd
            X.2sr r0 = r5.A00
            boolean r0 = X.C627636p.A0Q(r0, r14)
            if (r0 == 0) goto L_0x00fd
            r4.A0K()
            r4.A0J()
        L_0x00fd:
            X.34x r9 = r4.A0G
            int r1 = r14.A0D
            r0 = 6
            if (r1 == r0) goto L_0x011a
            r0 = 7
            r1 = r37
            if (r1 == r0) goto L_0x011a
            java.lang.Integer r0 = X.C18310x6.A0e()
            r2.A00 = r0
            r0 = 1
            r2.A01 = r0
            if (r9 == 0) goto L_0x0116
            r2.A03 = r0
        L_0x0116:
            r0 = 0
            r4.A0S(r0)
        L_0x011a:
            r0 = 1
            r3.A06 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.A02 = r0
            android.content.Intent r1 = r4.A0Q
            boolean r11 = r4.A1N
            long r26 = android.os.SystemClock.uptimeMillis()
            X.36E r13 = r5.A01
            r0 = 0
            int r12 = r14.A0B
            r15 = 0
            long r9 = r14.A1Q
            long r24 = r26 - r9
            long r9 = r14.A1b
            long r26 = r26 - r9
            r16 = 1
            r19 = r0
            r20 = r0
            r21 = r0
            r22 = r0
            r30 = r0
            r31 = r0
            r32 = r0
            r33 = r0
            r34 = r0
            r17 = r0
            r18 = r0
            r23 = r12
            r28 = r26
            r13.A0O(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r31, r32, r33, r34)
            boolean r9 = r14 instanceof X.C30341mI
            if (r9 != 0) goto L_0x01de
            X.5Ks r9 = r5.A03
            java.lang.String r5 = "extra_deep_link_session_id"
            java.lang.String r12 = r1.getStringExtra(r5)
            java.lang.String r5 = "args_conversation_screen_entry_point"
            int r10 = r1.getIntExtra(r5, r0)
            if (r10 == 0) goto L_0x017b
            X.2zI r5 = r9.A03
            android.content.SharedPreferences r5 = r5.A02()
            android.content.SharedPreferences$Editor r13 = r5.edit()
            java.lang.String r5 = X.C60862zI.A00(r7, r8)
            X.C18270x1.A0h(r13, r5, r10)
        L_0x017b:
            boolean r5 = android.text.TextUtils.isEmpty(r12)
            if (r5 != 0) goto L_0x0195
            X.2eG r8 = r9.A05
            X.1XC r7 = new X.1XC
            r7.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            r7.A00 = r5
            r7.A01 = r12
            X.4FV r5 = r8.A00
            r5.BhD(r7)
        L_0x0195:
            X.5rC r5 = r9.A00
            boolean r5 = r5.A07()
            if (r5 == 0) goto L_0x01ad
            if (r11 == 0) goto L_0x01ad
            boolean r5 = r6 instanceof X.C28011fL
            if (r5 == 0) goto L_0x01ad
            X.1fL r6 = (X.C28011fL) r6
            if (r6 == 0) goto L_0x01ad
            X.4FS r7 = r9.A07
            r5 = 5
            X.C117155rT.A00(r7, r9, r6, r5)
        L_0x01ad:
            r7 = 6
            if (r10 != r7) goto L_0x0264
            r10 = 0
            java.lang.String r11 = "args_chat_search_result_type"
            boolean r5 = r1.hasExtra(r11)
            if (r5 == 0) goto L_0x01c1
            int r5 = r1.getIntExtra(r11, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
        L_0x01c1:
            java.lang.String r8 = "args_chat_search_type"
            boolean r5 = r1.hasExtra(r8)
            if (r5 == 0) goto L_0x01de
            int r6 = r1.getIntExtra(r8, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            if (r5 == 0) goto L_0x01de
            if (r10 == 0) goto L_0x01de
            if (r6 != 0) goto L_0x01f4
            int r6 = r10.intValue()
            r5 = 5
            if (r6 == r5) goto L_0x01f8
        L_0x01de:
            X.4UC r8 = r4.A13
            java.lang.Integer r7 = r2.A00
            boolean r6 = r2.A02
            boolean r5 = r2.A01
            boolean r1 = r2.A03
            X.7Mk r0 = new X.7Mk
            r0.<init>(r7, r6, r5, r1)
            r8.A0H(r0)
            A00(r3, r4)
            return
        L_0x01f4:
            r5 = 98
            if (r6 != r5) goto L_0x01de
        L_0x01f8:
            r6 = 0
            r10 = 0
            boolean r5 = r1.hasExtra(r11)
            if (r5 == 0) goto L_0x0208
            int r5 = r1.getIntExtra(r11, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
        L_0x0208:
            boolean r5 = r1.hasExtra(r8)
            if (r5 == 0) goto L_0x01de
            int r5 = r1.getIntExtra(r8, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            if (r1 == 0) goto L_0x01de
            if (r10 == 0) goto L_0x01de
            X.1VX r1 = r9.A06
            X.C162457s7.A0J(r1, r0)
            r8 = 5957(0x1745, float:8.348E-42)
            boolean r1 = r1.A0X(r8)
            if (r1 == 0) goto L_0x01de
            r1 = 98
            if (r5 != r1) goto L_0x022d
            r6 = 20
        L_0x022d:
            X.8qC r1 = r9.A08
            java.lang.Object r14 = r1.get()
            X.5iD r14 = (X.C111515iD) r14
            int r5 = r10.intValue()
            X.1VX r1 = r14.A01
            X.C162457s7.A0J(r1, r0)
            boolean r0 = r1.A0X(r8)
            if (r0 == 0) goto L_0x0251
            X.4sJ r1 = new X.4sJ
            r1.<init>()
            X.C94924sJ.A01(r14, r1, r7, r6, r5)
            X.4FV r0 = r14.A02
            r0.BhD(r1)
        L_0x0251:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r20 = 2
            r17 = r15
            r18 = r15
            r19 = r15
            r21 = r6
            r14.A03(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x01de
        L_0x0264:
            r5 = 7
            if (r10 != r5) goto L_0x01de
            X.2Xs r8 = r9.A02
            java.lang.String r6 = "isPhoneNumberOwner"
            boolean r5 = r1.hasExtra(r6)
            r7 = 0
            if (r5 == 0) goto L_0x027a
            boolean r5 = r1.getBooleanExtra(r6, r0)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r5)
        L_0x027a:
            java.lang.String r6 = "isWAAccount"
            boolean r5 = r1.hasExtra(r6)
            if (r5 == 0) goto L_0x028a
            boolean r0 = r1.getBooleanExtra(r6, r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x028a:
            r0 = 9
            r8.A00(r15, r7, r0)
            goto L_0x01de
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124166Bf.BNb(X.34x, int):void");
    }

    public /* synthetic */ void BVB(C95814uZ r4) {
        if (11 - this.A01 == 0) {
            AnonymousClass4VQ r2 = (AnonymousClass4VQ) this.A00;
            if (r4 != null && r4.equals(r2.A0x)) {
                r2.A0O = true;
                AnonymousClass5OX r0 = new AnonymousClass5OX();
                r0.A05 = true;
                A00(r0, r2);
                r2.A0I();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0256, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0257, code lost:
        com.whatsapp.util.Log.i("messagesViewModel/addreceived/staledata ", r1);
        r0 = r6.A1I;
        r0.add(r7);
        r5.A00 = X.C129586aY.copyOf((java.util.Collection) r0);
        r5.A06 = true;
        r6.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02af, code lost:
        if (r1 == false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0148, code lost:
        if (r6.A07 != 0) goto L_0x014a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWS(X.C624134x r23, int r24) {
        /*
            r22 = this;
            r7 = r23
            r3 = r22
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0041;
                case 2: goto L_0x006a;
                case 11: goto L_0x0096;
                case 14: goto L_0x0374;
                case 21: goto L_0x03a1;
                case 22: goto L_0x03b1;
                case 27: goto L_0x03d8;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            java.lang.Object r3 = r3.A00
            X.5Og r3 = (X.C103745Og) r3
            X.0Wx r1 = r3.A02
            java.lang.Number r0 = X.C86654Ky.A0i(r1)
            if (r0 == 0) goto L_0x0009
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0009
            X.2z0 r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0009
            r0 = 8
            X.C06270Wx.A04(r1, r0)
            X.4uZ r0 = r3.A00
            if (r0 == 0) goto L_0x0009
            X.2Wf r1 = r3.A05
            r0 = 6
            r1.A00(r0)
            X.4uZ r2 = r3.A00
            if (r2 == 0) goto L_0x0009
            X.4FS r1 = r3.A07
            r0 = 24
            X.C117165rU.A00(r1, r3, r2, r0)
            return
        L_0x0041:
            X.2z0 r1 = X.C624134x.A07(r7)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0009
            X.4uZ r2 = r1.A00
            java.lang.Object r1 = r3.A00
            X.4V1 r1 = (X.AnonymousClass4V1) r1
            X.4uZ r0 = r1.A00
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0009
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0009
            boolean r0 = r7 instanceof X.C30241m8
            if (r0 != 0) goto L_0x0009
            boolean r0 = r7 instanceof X.C30341mI
            if (r0 != 0) goto L_0x0009
            r0 = 1
            r1.A03 = r0
            r1.A0D()
            return
        L_0x006a:
            X.2z0 r1 = X.C624134x.A07(r7)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0009
            X.4uZ r2 = r1.A00
            java.lang.Object r1 = r3.A00
            com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel r1 = (com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel) r1
            X.4uZ r0 = r1.A00
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0009
            X.107 r1 = r1.A05
            boolean r0 = X.C86634Kw.A1Y(r1)
            if (r0 != 0) goto L_0x0009
            boolean r0 = r7 instanceof X.C30241m8
            if (r0 != 0) goto L_0x0009
            boolean r0 = r7 instanceof X.C30341mI
            if (r0 != 0) goto L_0x0009
            X.3d3 r0 = X.C72023d3.A00
            r1.A0H(r0)
            return
        L_0x0096:
            java.lang.Object r6 = r3.A00
            X.4VQ r6 = (X.AnonymousClass4VQ) r6
            if (r23 == 0) goto L_0x0009
            X.2z0 r2 = r7.A1J
            X.4uZ r10 = r2.A00
            X.4uZ r13 = r6.A0x
            boolean r0 = X.AnonymousClass75J.A00(r10, r13)
            if (r0 == 0) goto L_0x0009
            byte r12 = r7.A1I
            r0 = 8
            if (r12 == r0) goto L_0x0009
            r0 = 87
            if (r12 == r0) goto L_0x0009
            r0 = 88
            if (r12 == r0) goto L_0x0009
            boolean r0 = X.C624134x.A0g(r7)
            if (r0 != 0) goto L_0x0009
            boolean r0 = r7 instanceof X.AnonymousClass48R
            if (r0 != 0) goto L_0x0009
            X.5OX r5 = new X.5OX
            r5.<init>()
            X.5L4 r4 = new X.5L4
            r4.<init>(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagesViewModel/observer/msgadded "
            r1.append(r0)
            java.lang.String r0 = r2.A01
            X.C18260x0.A1J(r1, r0)
            X.5Qe r9 = r6.A0h
            boolean r0 = X.C627636p.A0h(r7)     // Catch:{ Exception -> 0x00e4 }
            if (r0 == 0) goto L_0x00ea
            r0 = 1
            r4.A06 = r0     // Catch:{ Exception -> 0x00e4 }
            goto L_0x00ea
        L_0x00e4:
            r1 = move-exception
            java.lang.String r0 = "messageObserverHelper/onMessageAddedHandleEphemeralMessageNux/consumed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ea:
            boolean r8 = r2.A02
            if (r8 == 0) goto L_0x0113
            boolean r0 = r7.A1o()
            if (r0 != 0) goto L_0x0113
            X.2sr r0 = r6.A0c
            boolean r0 = X.C627636p.A0Q(r0, r7)
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r7 instanceof X.C30341mI
            if (r0 == 0) goto L_0x01d6
            X.1VX r1 = r6.A0w
            r0 = 4546(0x11c2, float:6.37E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0113
            r0 = r7
            X.1mI r0 = (X.C30341mI) r0
            int r1 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r1 != r0) goto L_0x01d6
        L_0x0113:
            long r0 = r7.A1L
            r14 = -1
            r11 = 1
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r2)
            java.lang.String r0 = "row id must be present"
            X.C626936e.A0D(r1, r0)
            int r1 = r6.A0D()     // Catch:{ StaleDataException -> 0x0256 }
            X.34x r0 = r6.A0G()     // Catch:{ StaleDataException -> 0x0256 }
            if (r1 <= 0) goto L_0x0130
            if (r0 == 0) goto L_0x0130
            goto L_0x0197
        L_0x0130:
            monitor-enter(r6)     // Catch:{ StaleDataException -> 0x0256 }
            X.2Ni r0 = r6.A0C     // Catch:{ all -> 0x01d3 }
            monitor-exit(r6)     // Catch:{ StaleDataException -> 0x0256 }
            boolean r0 = r9.A00(r0, r13, r7)     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 == 0) goto L_0x01af
            X.2Xz r2 = r6.A0k     // Catch:{ StaleDataException -> 0x0256 }
            boolean r0 = r2.A00(r7)     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 == 0) goto L_0x0151
            java.lang.Integer r0 = r7.A0p     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 != 0) goto L_0x0151
            int r0 = r6.A07     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 == 0) goto L_0x0183
        L_0x014a:
            int r0 = r6.A07     // Catch:{ StaleDataException -> 0x0256 }
            int r0 = r0 + 1
            r6.A07 = r0     // Catch:{ StaleDataException -> 0x0256 }
            goto L_0x016d
        L_0x0151:
            monitor-enter(r6)     // Catch:{ StaleDataException -> 0x0256 }
            X.34x r1 = r6.A0F     // Catch:{ all -> 0x01d3 }
            monitor-exit(r6)     // Catch:{ StaleDataException -> 0x0256 }
            int r0 = r6.A07     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 == 0) goto L_0x014a
            if (r1 == 0) goto L_0x014a
            X.2sr r0 = r6.A0c     // Catch:{ StaleDataException -> 0x0256 }
            boolean r0 = X.C627636p.A0Q(r0, r1)     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 != 0) goto L_0x0169
            boolean r0 = r2.A00(r1)     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 == 0) goto L_0x014a
        L_0x0169:
            r6.A0K()     // Catch:{ StaleDataException -> 0x0256 }
            goto L_0x014a
        L_0x016d:
            r0 = 10
            if (r12 != r0) goto L_0x0172
            goto L_0x017d
        L_0x0172:
            boolean r0 = r7 instanceof X.C30341mI     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 != 0) goto L_0x0183
            int r0 = r6.A05     // Catch:{ StaleDataException -> 0x0256 }
            int r0 = r0 + 1
            r6.A05 = r0     // Catch:{ StaleDataException -> 0x0256 }
            goto L_0x0183
        L_0x017d:
            int r0 = r6.A06     // Catch:{ StaleDataException -> 0x0256 }
            int r0 = r0 + 1
            r6.A06 = r0     // Catch:{ StaleDataException -> 0x0256 }
        L_0x0183:
            r6.A0J()     // Catch:{ StaleDataException -> 0x0256 }
            java.util.List r0 = r6.A1I     // Catch:{ StaleDataException -> 0x0256 }
            r0.add(r7)     // Catch:{ StaleDataException -> 0x0256 }
            X.6aY r0 = X.C129586aY.copyOf((java.util.Collection) r0)     // Catch:{ StaleDataException -> 0x0256 }
            r5.A00 = r0     // Catch:{ StaleDataException -> 0x0256 }
            r5.A06 = r11     // Catch:{ StaleDataException -> 0x0256 }
            r6.A0L()     // Catch:{ StaleDataException -> 0x0256 }
            goto L_0x01af
        L_0x0197:
            long r2 = r0.A1M     // Catch:{ StaleDataException -> 0x0256 }
            long r0 = r7.A1M     // Catch:{ StaleDataException -> 0x0256 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 < 0) goto L_0x0130
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ StaleDataException -> 0x0256 }
            java.lang.String r0 = "messagesViewModel/addreceived/skip/"
            r1.append(r0)     // Catch:{ StaleDataException -> 0x0256 }
            java.lang.String r0 = X.C627636p.A0E(r7)     // Catch:{ StaleDataException -> 0x0256 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ StaleDataException -> 0x0256 }
        L_0x01af:
            X.4uZ r0 = r7.A0n()     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 == 0) goto L_0x01bd
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r0)     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 == 0) goto L_0x01bd
            r4.A01 = r0     // Catch:{ StaleDataException -> 0x0256 }
        L_0x01bd:
            boolean r0 = r7.A1o()     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 == 0) goto L_0x026c
            r0 = 1048576(0x100000, float:1.469368E-39)
            boolean r0 = r7.A1s(r0)     // Catch:{ StaleDataException -> 0x0256 }
            if (r0 != 0) goto L_0x026c
            r6.A0O = r11     // Catch:{ StaleDataException -> 0x0256 }
            r0 = 0
            r6.A0V(r0)     // Catch:{ StaleDataException -> 0x0256 }
            goto L_0x026c
        L_0x01d3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ StaleDataException -> 0x0256 }
            throw r0     // Catch:{ StaleDataException -> 0x0256 }
        L_0x01d6:
            boolean r0 = r7 instanceof X.C30341mI
            if (r0 == 0) goto L_0x01e8
            r0 = r7
            X.1mI r0 = (X.C30341mI) r0
            int r1 = r0.A00
            r0 = 28
            if (r1 != r0) goto L_0x01e8
            r0 = 1
            r4.A08 = r0
            goto L_0x0273
        L_0x01e8:
            int r13 = r6.A0D()
            X.34x r12 = r6.A0G()
            java.util.List r11 = r6.A1I
            java.lang.String r15 = "messagesViewModel/addsent/skipped/"
            if (r13 != 0) goto L_0x01f7
            goto L_0x0232
        L_0x01f7:
            if (r12 == 0) goto L_0x0273
            long r2 = r12.A1M     // Catch:{ StaleDataException -> 0x024f }
            long r0 = r7.A1M     // Catch:{ StaleDataException -> 0x024f }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 >= 0) goto L_0x0273
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r15)     // Catch:{ StaleDataException -> 0x024f }
            java.lang.String r0 = X.C627636p.A0E(r7)     // Catch:{ StaleDataException -> 0x024f }
            r2.append(r0)     // Catch:{ StaleDataException -> 0x024f }
            java.lang.String r0 = " adapter-count:"
            r2.append(r0)     // Catch:{ StaleDataException -> 0x024f }
            r2.append(r13)     // Catch:{ StaleDataException -> 0x024f }
            java.lang.String r0 = " las-row-id:"
            r2.append(r0)     // Catch:{ StaleDataException -> 0x024f }
            long r0 = r12.A1L     // Catch:{ StaleDataException -> 0x024f }
            r2.append(r0)     // Catch:{ StaleDataException -> 0x024f }
            java.lang.String r0 = " cur-row-id:"
            r2.append(r0)     // Catch:{ StaleDataException -> 0x024f }
            long r0 = r7.A1L     // Catch:{ StaleDataException -> 0x024f }
            X.C18260x0.A1I(r2, r0)     // Catch:{ StaleDataException -> 0x024f }
            r11.add(r7)     // Catch:{ StaleDataException -> 0x024f }
            X.6aY r0 = X.C129586aY.copyOf((java.util.Collection) r11)     // Catch:{ StaleDataException -> 0x024f }
            r5.A00 = r0     // Catch:{ StaleDataException -> 0x024f }
            goto L_0x024b
        L_0x0232:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)     // Catch:{ StaleDataException -> 0x024f }
            java.lang.String r0 = X.C627636p.A0E(r7)     // Catch:{ StaleDataException -> 0x024f }
            r1.append(r0)     // Catch:{ StaleDataException -> 0x024f }
            java.lang.String r0 = " adapter-count:0"
            X.C18260x0.A1L(r1, r0)     // Catch:{ StaleDataException -> 0x024f }
            r11.add(r7)     // Catch:{ StaleDataException -> 0x024f }
            X.6aY r0 = X.C129586aY.copyOf((java.util.Collection) r11)     // Catch:{ StaleDataException -> 0x024f }
            r5.A00 = r0     // Catch:{ StaleDataException -> 0x024f }
        L_0x024b:
            r0 = 1
            r5.A06 = r0     // Catch:{ StaleDataException -> 0x024f }
            goto L_0x0273
        L_0x024f:
            r1 = move-exception
            java.lang.String r0 = "messagesViewModel/addsent/staledata "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x0273
        L_0x0256:
            r1 = move-exception
            java.lang.String r0 = "messagesViewModel/addreceived/staledata "
            com.whatsapp.util.Log.i(r0, r1)
            java.util.List r0 = r6.A1I
            r0.add(r7)
            X.6aY r0 = X.C129586aY.copyOf((java.util.Collection) r0)
            r5.A00 = r0
            r5.A06 = r11
            r6.A0L()
        L_0x026c:
            X.4FS r1 = r6.A1E
            r0 = 11
            X.C117155rT.A00(r1, r6, r7, r0)
        L_0x0273:
            r2 = 1
            r5.A06 = r2
            int r0 = r6.A03
            if (r0 != 0) goto L_0x0336
            boolean r0 = X.C627636p.A0l(r7)
            if (r0 != 0) goto L_0x0336
            boolean r0 = r7.A1o()
            if (r0 != 0) goto L_0x0336
            X.2sr r1 = r6.A0c
            boolean r0 = X.C627636p.A0Q(r1, r7)
            if (r0 != 0) goto L_0x0336
            int r0 = r6.A04
            int r0 = r0 + 1
            r6.A04 = r0
            r4.A00 = r0
            boolean r0 = X.C627636p.A0M(r1, r7)
            if (r0 == 0) goto L_0x02aa
            java.util.ArrayList r0 = r6.A1H
            r0.add(r7)
            X.5Pd r1 = X.C103975Pd.A00(r6, r0)
            X.08M r0 = r6.A0V
            r0.A0G(r1)
        L_0x02aa:
            boolean r1 = r6.A0M
            if (r8 != 0) goto L_0x02b1
            r0 = 1
            if (r1 != 0) goto L_0x02b2
        L_0x02b1:
            r0 = 0
        L_0x02b2:
            r4.A05 = r0
            X.2sr r0 = r6.A0c
            boolean r0 = X.C627636p.A0O(r0, r7)
            if (r0 == 0) goto L_0x02be
            r4.A07 = r2
        L_0x02be:
            boolean r0 = r6.A1M
            if (r0 == 0) goto L_0x02dd
            X.99n r1 = r9.A05
            r0 = 0
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x02dd
            boolean r0 = r7 instanceof X.C30341mI
            if (r0 == 0) goto L_0x02dd
            X.1mI r7 = (X.C30341mI) r7
            int r1 = r7.A00
            r0 = 32
            if (r1 == r0) goto L_0x02db
            r0 = 31
            if (r1 != r0) goto L_0x02dd
        L_0x02db:
            r4.A02 = r2
        L_0x02dd:
            X.4UC r9 = r6.A16
            X.34x r13 = r4.A09
            boolean r15 = r4.A06
            boolean r7 = r4.A08
            boolean r3 = r4.A03
            boolean r2 = r4.A05
            boolean r1 = r4.A07
            boolean r0 = r4.A02
            int r14 = r4.A00
            com.whatsapp.jid.UserJid r12 = r4.A01
            boolean r4 = r4.A04
            X.5Qt r11 = new X.5Qt
            r17 = r3
            r18 = r2
            r19 = r1
            r20 = r0
            r21 = r4
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r9.A0H(r11)
            A00(r5, r6)
            X.5rC r1 = r6.A0b
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x031c
            X.66o r0 = X.C116985rC.A03(r1)
            boolean r0 = r0.BH2(r10)
            if (r0 != 0) goto L_0x0324
        L_0x031c:
            X.3ZH r0 = r6.A0t
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x032d
        L_0x0324:
            if (r8 != 0) goto L_0x032d
            X.4UC r1 = r6.A1B
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0H(r0)
        L_0x032d:
            r6.A0L()
            if (r8 == 0) goto L_0x0009
            X.AnonymousClass4VQ.A02(r6)
            return
        L_0x0336:
            int r0 = r6.A03
            if (r0 != 0) goto L_0x035b
            X.2sr r0 = r6.A0c
            boolean r0 = X.C627636p.A0Q(r0, r7)
            if (r0 == 0) goto L_0x035b
            boolean r0 = r7 instanceof X.C30341mI
            if (r0 == 0) goto L_0x035b
            X.1VX r1 = r6.A0w
            r0 = 4547(0x11c3, float:6.372E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x02aa
            r0 = r7
            X.1mI r0 = (X.C30341mI) r0
            int r1 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r1 != r0) goto L_0x035b
            goto L_0x02aa
        L_0x035b:
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r6.A0g
            X.08M r0 = r0.A01
            java.lang.Number r0 = X.C86654Ky.A0i(r0)
            if (r0 == 0) goto L_0x036e
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x036e
            goto L_0x02aa
        L_0x036e:
            r4.A03 = r2
            r4.A04 = r2
            goto L_0x02aa
        L_0x0374:
            boolean r0 = r7 instanceof X.C30341mI
            if (r0 == 0) goto L_0x0009
            java.lang.Object r2 = r3.A00
            X.5i6 r2 = (X.C111445i6) r2
            X.4uZ r0 = r2.A0c
            boolean r0 = X.AnonymousClass2z0.A0E(r7, r0)
            if (r0 == 0) goto L_0x0009
            r0 = r7
            X.1mI r0 = (X.C30341mI) r0
            int r1 = r0.A00
            r0 = 5
            if (r1 == r0) goto L_0x038f
            r0 = 7
            if (r1 != r0) goto L_0x0009
        L_0x038f:
            X.2sr r1 = r2.A0z
            X.4uZ r0 = r7.A0n()
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x0009
            android.app.Activity r0 = r2.A0E
            r0.finish()
            return
        L_0x03a1:
            X.2z0 r0 = X.C624134x.A07(r7)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0009
            java.lang.Object r0 = r3.A00
            com.whatsapp.status.advertise.AdvertiseViewModel r0 = (com.whatsapp.status.advertise.AdvertiseViewModel) r0
            r0.A0D()
            return
        L_0x03b1:
            java.lang.String r0 = "MyStatusesActivity/onMessageAdded"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2z0 r1 = r7.A1J
            X.4uZ r0 = r1.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0009
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0009
            java.lang.Object r2 = r3.A00
            com.whatsapp.status.playback.MyStatusesActivity r2 = (com.whatsapp.status.playback.MyStatusesActivity) r2
            X.54S r0 = r2.A0Y
            X.C18290x4.A1L(r0)
            X.54S r1 = new X.54S
            r1.<init>(r2)
            r2.A0Y = r1
            X.4FS r0 = r2.A04
            X.C18270x1.A0w(r1, r0)
            return
        L_0x03d8:
            X.2z0 r5 = X.C624134x.A07(r7)
            X.4uZ r4 = r5.A00
            boolean r0 = r4 instanceof X.C95804uY
            r2 = 0
            if (r0 == 0) goto L_0x03e6
            r2 = r4
            X.4uY r2 = (X.C95804uY) r2
        L_0x03e6:
            java.lang.Object r1 = r3.A00
            X.5WK r1 = (X.AnonymousClass5WK) r1
            boolean r0 = r4 instanceof X.C135166kE
            if (r0 == 0) goto L_0x03fd
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x03fd
            java.lang.String r0 = "UpdatesViewModelObservers/onMessageAdded status"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r1.A0A
            r0.A0F()
            return
        L_0x03fd:
            if (r2 == 0) goto L_0x0009
            java.lang.String r0 = "UpdatesViewModelObservers/onMessageAdded newsletter"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = r1.A0A
            X.58R r0 = X.AnonymousClass58R.ADDED
            r1.A0L(r2, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124166Bf.BWS(X.34x, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:199:0x032f, code lost:
        if (r1.A00.isEmpty() != false) goto L_0x0334;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BWU(X.C624134x r11, int r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 3: goto L_0x0006;
                case 4: goto L_0x0038;
                case 5: goto L_0x0057;
                case 6: goto L_0x0097;
                case 7: goto L_0x0346;
                case 8: goto L_0x00aa;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x00c3;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x018c;
                case 16: goto L_0x019d;
                case 17: goto L_0x01f3;
                case 18: goto L_0x0005;
                case 19: goto L_0x0219;
                case 20: goto L_0x0227;
                case 21: goto L_0x0248;
                case 22: goto L_0x025c;
                case 23: goto L_0x0005;
                case 24: goto L_0x0281;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x02e1;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            if (r11 == 0) goto L_0x002d
            java.lang.Object r1 = r10.A00
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            X.3ZH r0 = r1.A1K
            com.whatsapp.jid.UserJid r0 = X.C86604Kt.A0d(r0)
            boolean r0 = X.AnonymousClass2z0.A0E(r11, r0)
            if (r0 == 0) goto L_0x002d
            byte r0 = r11.A1I
            boolean r0 = X.C627636p.A0H(r0)
            if (r0 == 0) goto L_0x002d
            r0 = 3
            if (r12 == r0) goto L_0x0027
            r0 = 9
            if (r12 != r0) goto L_0x002d
        L_0x0027:
            X.4kJ r0 = r1.A0x
        L_0x0029:
            r0.A0F()
            return
        L_0x002d:
            r0 = 30
            if (r12 != r0) goto L_0x0005
            java.lang.Object r0 = r10.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            X.4kJ r0 = r0.A0x
            goto L_0x0029
        L_0x0038:
            if (r11 == 0) goto L_0x0005
            java.lang.Object r1 = r10.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            X.1fI r0 = r1.A7G()
            boolean r0 = X.AnonymousClass2z0.A0E(r11, r0)
            if (r0 == 0) goto L_0x0005
            byte r0 = r11.A1I
            boolean r0 = X.C627636p.A0H(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 3
            if (r12 != r0) goto L_0x0005
            r1.A7L()
            return
        L_0x0057:
            java.lang.Object r4 = r10.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r4 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r4
            X.4Oc r0 = r4.A0B
            X.2z0 r3 = r11.A1J
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0005
            java.util.Iterator r1 = r0.iterator()
        L_0x0067:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0005
            X.2z0 r0 = X.C86614Ku.A0h(r1)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0067
            android.widget.ListView r0 = r4.getListView()
            android.view.View r2 = r0.findViewWithTag(r3)
            if (r2 == 0) goto L_0x0391
            X.4oJ r2 = (X.C93314oJ) r2
            boolean r0 = r2.A21(r3)
            if (r0 == 0) goto L_0x038b
            r0 = 8
            if (r12 != r0) goto L_0x034a
            X.34x r0 = r2.getFMessage()
            if (r0 != r11) goto L_0x037d
            r2.A1L()
            return
        L_0x0097:
            if (r11 == 0) goto L_0x0005
            r0 = 30
            if (r12 == r0) goto L_0x00a4
            int r1 = r11.A0j()
            r0 = 1
            if (r1 != r0) goto L_0x0005
        L_0x00a4:
            java.lang.Object r3 = r10.A00
            X.4ok r3 = (X.C93544ok) r3
            goto L_0x0207
        L_0x00aa:
            if (r11 == 0) goto L_0x0005
            boolean r0 = r11.A1F
            if (r0 == 0) goto L_0x0005
            java.lang.Object r3 = r10.A00
            X.4br r3 = (X.C89164br) r3
            android.widget.ListView r2 = r3.getListView()
            r1 = 37
            X.3bw r0 = new X.3bw
            r0.<init>(r3, r1, r11)
            r2.post(r0)
            return
        L_0x00c3:
            java.lang.Object r3 = r10.A00
            X.4VQ r3 = (X.AnonymousClass4VQ) r3
            X.2z0 r6 = r11.A1J
            X.4uZ r1 = r6.A00
            X.4uZ r0 = r3.A0x
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 == 0) goto L_0x0005
            byte r1 = r11.A1I
            r0 = 8
            if (r1 == r0) goto L_0x0005
            X.4UC r5 = r3.A17
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A00
            r1 = 1
            r0 = 0
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0178
            java.lang.Object r4 = r5.A07()
        L_0x00e9:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0156
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
        L_0x00f1:
            r6 = 24
            boolean r1 = X.AnonymousClass000.A1U(r12, r6)
            X.5Pw r0 = new X.5Pw
            r0.<init>(r11, r12, r1)
            r4.add(r0)
            r5.A0H(r4)
            X.2eV r0 = r3.A0z
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0186
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r9 = r4.iterator()
        L_0x0112:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x017b
            java.lang.Object r2 = r9.next()
            X.5Pw r2 = (X.C104155Pw) r2
            int r1 = r2.A00
            r0 = 34
            if (r1 != r0) goto L_0x0112
            X.34x r7 = r2.A01
            X.2z0 r8 = r7.A1J
            X.1me r0 = r7.A1T
            if (r0 != 0) goto L_0x0153
            r4 = 0
        L_0x012d:
            r2 = 1
            java.util.Map r1 = r3.A1J
            boolean r0 = r1.containsKey(r8)
            if (r4 != r2) goto L_0x014b
            if (r0 != 0) goto L_0x0112
            r1.put(r8, r7)
            X.58X r2 = X.AnonymousClass58X.ADDED
        L_0x013d:
            r0 = 2
            X.C162457s7.A0J(r2, r0)
            r1 = 0
            X.5SF r0 = new X.5SF
            r0.<init>(r2, r7, r1)
            r5.add(r0)
            goto L_0x0112
        L_0x014b:
            if (r0 == 0) goto L_0x0112
            r1.remove(r8)
            X.58X r2 = X.AnonymousClass58X.DELETED
            goto L_0x013d
        L_0x0153:
            int r4 = r0.A00
            goto L_0x012d
        L_0x0156:
            java.util.Iterator r2 = r4.iterator()
        L_0x015a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r1 = r2.next()
            X.5Pw r1 = (X.C104155Pw) r1
            X.34x r0 = r1.A01
            X.2z0 r0 = r0.A1J
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x015a
            int r0 = r1.A00
            if (r0 != r12) goto L_0x015a
            r2.remove()
            goto L_0x015a
        L_0x0178:
            r4 = 0
            goto L_0x00e9
        L_0x017b:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0186
            X.4UC r0 = r3.A18
            r0.A0H(r5)
        L_0x0186:
            if (r12 != r6) goto L_0x0005
            r3.A0U(r11)
            return
        L_0x018c:
            boolean r0 = r11 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0005
            r0 = 3
            if (r12 != r0) goto L_0x0005
            java.lang.Object r0 = r10.A00
            com.whatsapp.mediaview.MediaViewFragment r0 = (com.whatsapp.mediaview.MediaViewFragment) r0
            X.1mV r11 = (X.C30471mV) r11
            r0.A1q(r11)
            return
        L_0x019d:
            java.lang.Object r2 = r10.A00
            com.whatsapp.notification.PopupNotification r2 = (com.whatsapp.notification.PopupNotification) r2
            com.whatsapp.notification.PopupNotificationViewPager r0 = r2.A14
            X.2z0 r4 = r11.A1J
            android.view.View r1 = r0.findViewWithTag(r4)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x01c9
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3 = 0
            android.view.View r1 = r1.getChildAt(r3)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x01c9
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r1 = r1.getChildAt(r3)
            boolean r0 = r1 instanceof X.C93314oJ
            if (r0 == 0) goto L_0x01c9
            X.4oJ r1 = (X.C93314oJ) r1
            if (r1 == 0) goto L_0x01c9
            r1.A1H()
        L_0x01c9:
            byte r1 = r11.A1I
            r0 = 20
            if (r1 != r0) goto L_0x0005
            java.util.List r0 = r2.A1P
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x0005
            r0 = 3
            if (r12 != r0) goto L_0x0005
            com.whatsapp.notification.PopupNotificationViewPager r0 = r2.A14
            android.view.View r1 = r0.findViewWithTag(r4)
            if (r1 == 0) goto L_0x0005
            r0 = 2131432566(0x7f0b1476, float:1.8486893E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            if (r0 == 0) goto L_0x0005
            X.1nE r11 = (X.AnonymousClass1nE) r11
            r2.A6s(r11, r0)
            return
        L_0x01f3:
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            java.lang.Object r3 = r10.A00
            X.4ok r3 = (X.C93544ok) r3
            X.4uZ r1 = r3.A0F
            X.2z0 r0 = r11.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0005
        L_0x0207:
            android.widget.ListView r2 = r3.getListView()
            r1 = 37
            X.3bw r0 = new X.3bw
            r0.<init>(r3, r1, r11)
            r2.post(r0)
            r3.A77()
            return
        L_0x0219:
            boolean r0 = r11 instanceof X.C30721mu
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r10.A00
            com.whatsapp.search.SearchViewModel r0 = (com.whatsapp.search.SearchViewModel) r0
            X.08J r0 = r0.A0X
            r0.A0H(r11)
            return
        L_0x0227:
            java.lang.Object r1 = r10.A00
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r1 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r1
            X.2qY r0 = r1.A03
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0005
            android.os.Handler r2 = r1.A07
            java.lang.Runnable r0 = r1.A0A
            r2.removeCallbacks(r0)
            r1.A00()
            r1 = 40
            X.3br r0 = new X.3br
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.post(r0)
            return
        L_0x0248:
            X.2z0 r0 = X.C624134x.A07(r11)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0005
            r0 = 24
            if (r12 != r0) goto L_0x0005
            java.lang.Object r0 = r10.A00
            com.whatsapp.status.advertise.AdvertiseViewModel r0 = (com.whatsapp.status.advertise.AdvertiseViewModel) r0
            r0.A0D()
            return
        L_0x025c:
            java.lang.String r0 = "MyStatusesActivity/onMessageChanged"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            if (r11 == 0) goto L_0x0005
            X.2z0 r1 = r11.A1J
            X.4uZ r0 = r1.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0005
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0005
            int r1 = r11.A0D
            r0 = 4
            int r0 = X.AnonymousClass358.A00(r1, r0)
            if (r0 <= 0) goto L_0x0397
            java.lang.Object r1 = r10.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            r0 = 1
            com.whatsapp.status.playback.MyStatusesActivity.A0C(r11, r1, r0)
            return
        L_0x0281:
            java.lang.Object r6 = r10.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r6 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r6
            java.util.List r0 = r6.A0o
            if (r0 == 0) goto L_0x0005
            com.whatsapp.jid.UserJid r1 = r6.A0R
            X.1fY r0 = X.AnonymousClass1fY.A00
            if (r1 != r0) goto L_0x0005
            if (r11 == 0) goto L_0x0005
            X.2z0 r5 = r11.A1J
            X.4uZ r0 = r5.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0005
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0005
            X.5LT r0 = X.C86654Ky.A0c(r6)
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r0.A0F
            java.util.Set r4 = r0.A08
            r4.clear()
            java.util.List r0 = r6.A0o
            java.util.Iterator r7 = r0.iterator()
            r3 = 0
        L_0x02af:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0005
            X.34x r2 = X.C18300x5.A0T(r7)
            boolean r0 = r2 instanceof X.C30471mV
            if (r0 == 0) goto L_0x02cf
            r0 = r2
            X.1mV r0 = (X.C30471mV) r0
            X.33C r1 = r0.A01
            if (r1 == 0) goto L_0x02cf
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x02cf
            boolean r0 = r1.A0c
            if (r0 != 0) goto L_0x02cf
            X.C86654Ky.A1R(r4, r3)
        L_0x02cf:
            int r0 = r6.A00
            if (r3 != r0) goto L_0x02de
            X.2z0 r0 = r2.A1J
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x02de
            r6.A1Y(r11)
        L_0x02de:
            int r3 = r3 + 1
            goto L_0x02af
        L_0x02e1:
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            boolean r0 = X.C627636p.A0l(r11)
            if (r0 != 0) goto L_0x0005
            X.2z0 r4 = r11.A1J
            X.4uZ r1 = r4.A00
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0344
            r3 = r1
            X.4uY r3 = (X.C95804uY) r3
        L_0x02f6:
            java.lang.Object r2 = r10.A00
            X.5WK r2 = (X.AnonymousClass5WK) r2
            boolean r0 = r1 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0334
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0334
            com.whatsapp.updates.viewmodels.UpdatesViewModel r4 = r2.A0A
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            if (r1 == 0) goto L_0x0331
            r0 = 8
            int r1 = r1.intValue()
            if (r1 == r0) goto L_0x0334
            r0 = -1
            if (r1 > r0) goto L_0x0331
            X.0Wx r0 = r4.A0M
            java.lang.Object r0 = r0.A07()
            X.5Ny r0 = (X.C103685Ny) r0
            if (r0 == 0) goto L_0x0334
            X.5Nx r1 = r0.A02
            java.util.Set r0 = r1.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0331
            java.util.Set r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0334
        L_0x0331:
            r4.A0F()
        L_0x0334:
            if (r3 == 0) goto L_0x0005
            java.lang.String r0 = "UpdatesViewModelObservers/onMessageChanged newsletter"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.updates.viewmodels.UpdatesViewModel r2 = r2.A0A
            r1 = 0
            X.58R r0 = X.AnonymousClass58R.UPDATED
            r2.A0L(r3, r1, r0)
            return
        L_0x0344:
            r3 = 0
            goto L_0x02f6
        L_0x0346:
            r10.A01(r11)
            return
        L_0x034a:
            r0 = 12
            if (r12 != r0) goto L_0x0358
            X.34x r0 = r2.getFMessage()
            if (r0 != r11) goto L_0x037d
            r2.A1I()
            return
        L_0x0358:
            r0 = 27
            if (r12 == r0) goto L_0x0382
            r0 = 39
            if (r12 == r0) goto L_0x0382
            r0 = 30
            if (r12 != r0) goto L_0x036d
            int r1 = r11.A0j()
            r0 = 0
            r2.A1S(r1, r0)
            return
        L_0x036d:
            r0 = 34
            if (r12 != r0) goto L_0x037d
            X.1me r0 = r11.A1T
            if (r0 != 0) goto L_0x037a
            r0 = 0
        L_0x0376:
            r2.A1P(r0)
            return
        L_0x037a:
            int r0 = r0.A00
            goto L_0x0376
        L_0x037d:
            r0 = 1
            r2.A1q(r11, r0)
            return
        L_0x0382:
            r2.A1p(r11, r12)
            int r0 = r2.A01
            r2.A1O(r0)
            return
        L_0x038b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0391:
            java.util.HashSet r0 = r4.A0b
            r0.add(r3)
            return
        L_0x0397:
            java.lang.String r0 = "MyStatusesActivity/onMessageChanged refreshing dataset"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.Object r0 = r10.A00
            com.whatsapp.status.playback.MyStatusesActivity r0 = (com.whatsapp.status.playback.MyStatusesActivity) r0
            X.4OU r0 = r0.A0Z
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124166Bf.BWU(X.34x, int):void");
    }

    public /* synthetic */ void BWW(C624134x r4) {
        C95814uZ r0;
        AnonymousClass2z0 r02;
        switch (this.A01) {
            case 6:
                ((C93544ok) this.A00).A77();
                return;
            case 7:
                A01(r4);
                return;
            case 17:
                C93544ok r2 = (C93544ok) this.A00;
                C95814uZ r1 = r2.A0F;
                if (r4 == null || (r02 = r4.A1J) == null) {
                    r0 = null;
                } else {
                    r0 = r02.A00;
                }
                if (C162457s7.A0P(r1, r0)) {
                    r2.A77();
                    return;
                }
                return;
            case 22:
                Log.d("MyStatusesActivity/onMessageDetailsChanged");
                if (r4 != null) {
                    AnonymousClass2z0 r12 = r4.A1J;
                    if ((r12.A00 instanceof C135166kE) && r12.A02) {
                        MyStatusesActivity.A0C(r4, (MyStatusesActivity) this.A00, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BWX(C624134x r4, C624134x r5) {
        if (11 - this.A01 == 0) {
            AnonymousClass4VQ r2 = (AnonymousClass4VQ) this.A00;
            if (AnonymousClass75J.A00(r4.A1J.A00, r2.A0x)) {
                r2.A0Y.A0H(AnonymousClass0x9.A0C(r4, r5));
                r2.A0I();
            }
        }
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        if (19 - this.A01 != 0) {
            C381525x.A00(this, collection, i);
            return;
        }
        for (Object next : collection) {
            if (next instanceof C30721mu) {
                ((SearchViewModel) this.A00).A0X.A0H(next);
            }
        }
    }

    public /* synthetic */ void BWf(C95814uZ r10) {
        C54002o1 r0;
        switch (this.A01) {
            case 1:
                C162457s7.A0J(r10, 0);
                AnonymousClass4V1 r1 = (AnonymousClass4V1) this.A00;
                if (r10.equals(r1.A00)) {
                    r1.A0D();
                    return;
                }
                return;
            case 2:
                C162457s7.A0J(r10, 0);
                BonsaiPromptsViewModel bonsaiPromptsViewModel = (BonsaiPromptsViewModel) this.A00;
                if (r10.equals(bonsaiPromptsViewModel.A00) && (r0 = bonsaiPromptsViewModel.A08) != null) {
                    bonsaiPromptsViewModel.A05.A0H(r0.A0A);
                    return;
                }
                return;
            case 7:
                MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this.A00;
                if (AnonymousClass2z0.A0E(messageDetailsActivity.A0Q, r10)) {
                    if (messageDetailsActivity.A0T.A05(messageDetailsActivity.A0Q.A1J) == null) {
                        messageDetailsActivity.finish();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                AnonymousClass4VQ r8 = (AnonymousClass4VQ) this.A00;
                if (r10.equals(r8.A0x)) {
                    r8.A0K();
                    r8.A0I();
                    if (r8.A0z.A01()) {
                        Map map = r8.A1J;
                        if (!map.isEmpty()) {
                            AnonymousClass4UC r6 = r8.A18;
                            Collection values = map.values();
                            AnonymousClass58X r5 = AnonymousClass58X.DELETED;
                            C18260x0.A0O(values, r5);
                            ArrayList A0c = C73783g4.A0c(values);
                            Iterator it = values.iterator();
                            while (it.hasNext()) {
                                C624134x A0T = C18300x5.A0T(it);
                                C162457s7.A0J(A0T, 1);
                                A0c.add(new AnonymousClass5SF(r5, A0T, (AnonymousClass2z0) null));
                            }
                            r6.A0H(A0c);
                            map.clear();
                        }
                    }
                    AnonymousClass4VQ.A02(r8);
                    return;
                }
                return;
            case 18:
                AnonymousClass5RD r12 = (AnonymousClass5RD) this.A00;
                r12.A01(AnonymousClass000.A1T(r12.A0K.A02));
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e4, code lost:
        if (r7.A06 <= 0) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02dd, code lost:
        if (r1 == null) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0490, code lost:
        if (r8 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0492, code lost:
        ((com.whatsapp.gallery.MediaGalleryFragmentBase) r10.A00).A1Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0499, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:422:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BWg(java.util.Collection r11, java.util.Map r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 3: goto L_0x0006;
                case 4: goto L_0x0036;
                case 5: goto L_0x04ec;
                case 6: goto L_0x0062;
                case 7: goto L_0x0078;
                case 8: goto L_0x0096;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00e2;
                case 11: goto L_0x00fb;
                case 12: goto L_0x0237;
                case 13: goto L_0x0259;
                case 14: goto L_0x0005;
                case 15: goto L_0x027c;
                case 16: goto L_0x0005;
                case 17: goto L_0x02e6;
                case 18: goto L_0x0312;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x033f;
                case 22: goto L_0x035f;
                case 23: goto L_0x0005;
                case 24: goto L_0x0392;
                case 25: goto L_0x03f5;
                case 26: goto L_0x0408;
                case 27: goto L_0x049a;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.util.Iterator r3 = r11.iterator()
        L_0x000a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.34x r2 = X.C18300x5.A0T(r3)
            java.lang.Object r1 = r10.A00
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            X.3ZH r0 = r1.A1K
            com.whatsapp.jid.UserJid r0 = X.C86604Kt.A0d(r0)
            boolean r0 = X.AnonymousClass2z0.A0E(r2, r0)
            if (r0 == 0) goto L_0x000a
            byte r0 = r2.A1I
            boolean r0 = X.C627636p.A0H(r0)
            if (r0 != 0) goto L_0x0030
            boolean r0 = r2.A1F
            if (r0 == 0) goto L_0x000a
        L_0x0030:
            X.4kJ r0 = r1.A0x
            r0.A0F()
            return
        L_0x0036:
            java.util.Iterator r3 = r11.iterator()
        L_0x003a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.34x r2 = X.C18300x5.A0T(r3)
            java.lang.Object r1 = r10.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            X.1fI r0 = r1.A7G()
            boolean r0 = X.AnonymousClass2z0.A0E(r2, r0)
            if (r0 == 0) goto L_0x003a
            byte r0 = r2.A1I
            boolean r0 = X.C627636p.A0H(r0)
            if (r0 != 0) goto L_0x005e
            boolean r0 = r2.A1F
            if (r0 == 0) goto L_0x003a
        L_0x005e:
            r1.A7L()
            return
        L_0x0062:
            java.util.Iterator r2 = r11.iterator()
        L_0x0066:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0005
            X.34x r0 = X.C18300x5.A0T(r2)
            int r1 = r0.A0j()
            r0 = 1
            if (r1 != r0) goto L_0x0066
            goto L_0x00a8
        L_0x0078:
            java.util.Iterator r3 = r11.iterator()
        L_0x007c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.2z0 r2 = X.C86614Ku.A0h(r3)
            java.lang.Object r1 = r10.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r1
            X.34x r0 = r1.A0Q
            boolean r0 = X.C86664Kz.A1X(r0, r2)
            if (r0 == 0) goto L_0x007c
            r1.finish()
            return
        L_0x0096:
            java.util.Iterator r1 = r11.iterator()
        L_0x009a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0005
            X.34x r0 = X.C18300x5.A0T(r1)
            boolean r0 = r0.A1F
            if (r0 == 0) goto L_0x009a
        L_0x00a8:
            java.lang.Object r0 = r10.A00
            X.4ok r0 = (X.C93544ok) r0
            r0.A77()
            return
        L_0x00b0:
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            java.lang.Object r5 = r10.A00
            com.whatsapp.conversation.selection.SelectedImageAlbumViewModel r5 = (com.whatsapp.conversation.selection.SelectedImageAlbumViewModel) r5
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0005
            java.util.Iterator r4 = r11.iterator()
        L_0x00c2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0005
            java.lang.Object r3 = r4.next()
            X.08M r2 = r5.A00
            java.lang.Object r0 = r2.A07()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 1
            if (r0 == 0) goto L_0x00c2
            boolean r0 = X.C73723fy.A0U(r0, r3)
            if (r0 != r1) goto L_0x00c2
            r0 = 0
            r2.A0H(r0)
            return
        L_0x00e2:
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            java.lang.Object r0 = r10.A00
            X.4Ud r0 = (X.C87654Ud) r0
            X.08M r1 = r0.A00
            java.lang.Object r0 = r1.A07()
            boolean r0 = X.C73723fy.A0U(r11, r0)
            if (r0 == 0) goto L_0x0005
            r0 = 0
            r1.A0H(r0)
            return
        L_0x00fb:
            java.lang.Object r7 = r10.A00
            X.4VQ r7 = (X.AnonymousClass4VQ) r7
            java.util.Iterator r6 = r11.iterator()
            r5 = 0
            r9 = 0
            r8 = 0
        L_0x0106:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0183
            X.34x r2 = X.C18300x5.A0T(r6)
            X.2z0 r4 = r2.A1J
            X.4uZ r1 = r4.A00
            X.4uZ r0 = r7.A0x
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 == 0) goto L_0x0156
            X.66v r1 = r7.A1G
            boolean r0 = r1.B8N()
            if (r0 == 0) goto L_0x012f
            X.2z0 r0 = r1.B6Q()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x012f
            r9 = 1
        L_0x012f:
            X.2Xz r0 = r7.A0k
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0150
            int r0 = r7.A07
            if (r0 <= 0) goto L_0x0150
            int r0 = r0 + -1
            r7.A07 = r0
            byte r1 = r2.A1I
            r0 = 10
            if (r1 == r0) goto L_0x014d
            int r0 = r7.A05
            if (r0 <= 0) goto L_0x014d
            int r0 = r0 + -1
            r7.A05 = r0
        L_0x014d:
            r7.A0J()
        L_0x0150:
            boolean r0 = r4.A02
            r5 = 1
            if (r0 == 0) goto L_0x0156
            r8 = 1
        L_0x0156:
            X.5RW r0 = r7.A1F
            X.5WI r0 = r0.A00
            java.util.List r0 = r0.A0A
            java.util.Iterator r3 = r0.iterator()
        L_0x0160:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0106
            java.lang.Object r2 = r3.next()
            X.7ND r2 = (X.AnonymousClass7ND) r2
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r4.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0160
            X.8po r0 = r2.A01
            if (r0 == 0) goto L_0x017d
            r0.BTj()
        L_0x017d:
            X.5YG r0 = r2.A03
            r0.A0G()
            goto L_0x0160
        L_0x0183:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagesViewModel/observer/delete/unseen/"
            r2.append(r0)
            int r0 = r7.A07
            r2.append(r0)
            java.lang.String r1 = "/"
            r2.append(r1)
            int r0 = r7.A05
            r2.append(r0)
            r2.append(r1)
            int r0 = r7.A06
            X.C18260x0.A1G(r2, r0)
            if (r5 == 0) goto L_0x0005
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0005
            java.util.Iterator r0 = r11.iterator()
            X.34x r0 = X.C18300x5.A0T(r0)
            boolean r0 = r0.A1V
            if (r0 != 0) goto L_0x01e6
            long r1 = r7.A09
            r3 = -9223372036854775808
            r6 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01e9
            java.util.Iterator r5 = r11.iterator()
        L_0x01c4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01d9
            X.34x r0 = X.C18300x5.A0T(r5)
            long r3 = r7.A09
            long r1 = r0.A1M
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c4
            int r6 = r6 + 1
            goto L_0x01c4
        L_0x01d9:
            if (r6 <= 0) goto L_0x01e9
            int r0 = r7.A05
            int r0 = r0 - r6
            r7.A05 = r0
            if (r0 > 0) goto L_0x01e9
            int r0 = r7.A06
            if (r0 > 0) goto L_0x01e9
        L_0x01e6:
            r7.A0K()
        L_0x01e9:
            r7.A0I()
            if (r9 == 0) goto L_0x01f3
            X.66v r0 = r7.A1G
            r0.Az5()
        L_0x01f3:
            X.2eV r0 = r7.A0z
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0231
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r11.iterator()
        L_0x0203:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0226
            X.34x r3 = X.C18300x5.A0T(r4)
            java.util.Map r2 = r7.A1J
            X.2z0 r1 = r3.A1J
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0203
            r2.remove(r1)
            X.58X r2 = X.AnonymousClass58X.DELETED
            r1 = 0
            X.5SF r0 = new X.5SF
            r0.<init>(r2, r3, r1)
            r5.add(r0)
            goto L_0x0203
        L_0x0226:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0231
            X.4UC r0 = r7.A18
            r0.A0H(r5)
        L_0x0231:
            if (r8 == 0) goto L_0x0005
            X.AnonymousClass4VQ.A02(r7)
            return
        L_0x0237:
            java.util.Iterator r3 = r11.iterator()
        L_0x023b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.2z0 r0 = X.C86614Ku.A0h(r3)
            X.4uZ r2 = r0.A00
            if (r2 == 0) goto L_0x023b
            java.lang.Object r1 = r10.A00
            com.whatsapp.gallery.GalleryFragmentBase r1 = (com.whatsapp.gallery.GalleryFragmentBase) r1
            X.4uZ r0 = r1.A0D
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x023b
            r1.A1K()
            return
        L_0x0259:
            java.util.Iterator r3 = r11.iterator()
        L_0x025d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.2z0 r0 = X.C86614Ku.A0h(r3)
            X.4uZ r2 = r0.A00
            if (r2 == 0) goto L_0x025d
            java.lang.Object r1 = r10.A00
            com.whatsapp.gallery.MediaGalleryFragment r1 = (com.whatsapp.gallery.MediaGalleryFragment) r1
            X.4uZ r0 = r1.A03
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x025d
            r0 = 0
            r1.A1T(r0)
            return
        L_0x027c:
            java.lang.Object r4 = r10.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.util.Iterator r3 = r11.iterator()
        L_0x0284:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.34x r2 = X.C18300x5.A0T(r3)
            X.2z0 r5 = r2.A1J
            X.4uZ r1 = r5.A00
            if (r1 == 0) goto L_0x0284
            X.4uZ r0 = r4.A14
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0284
            byte r1 = r2.A1I
            boolean r0 = X.C627636p.A0H(r1)
            if (r0 != 0) goto L_0x02aa
            boolean r0 = X.C627636p.A0I(r1)
            if (r0 == 0) goto L_0x0284
        L_0x02aa:
            X.66p r0 = r4.A1E
            if (r0 == 0) goto L_0x02df
            int r0 = r0.getCount()
            r2 = 1
            if (r0 == r2) goto L_0x02df
            X.8or r0 = r4.A1F
            if (r0 == 0) goto L_0x02df
            int r0 = r4.A04
            X.1mV r1 = r4.A1a(r0)
            int r3 = r4.A04
            if (r1 == 0) goto L_0x0005
            X.2z0 r0 = r1.A1J
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x053b
            int r1 = r4.A04
            X.66p r0 = r4.A1E
            int r0 = r0.getCount()
            int r0 = r0 - r2
            int r3 = r4.A04
            if (r1 != r0) goto L_0x02e3
            int r3 = r3 - r2
        L_0x02d9:
            X.1mV r1 = r4.A1a(r3)
            if (r1 != 0) goto L_0x053b
        L_0x02df:
            r4.A1O()
            return
        L_0x02e3:
            int r3 = r3 + 1
            goto L_0x02d9
        L_0x02e6:
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            java.lang.Object r3 = r10.A00
            X.4ok r3 = (X.C93544ok) r3
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0005
            java.util.Iterator r2 = r11.iterator()
        L_0x02f8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0005
            X.34x r0 = X.C18300x5.A0T(r2)
            X.4uZ r1 = r3.A0F
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x02f8
            r3.A77()
            return
        L_0x0312:
            java.lang.Object r3 = r10.A00
            X.5RD r3 = (X.AnonymousClass5RD) r3
            X.08J r2 = r3.A05
            java.lang.Object r1 = r2.A07()
            X.5Wf r1 = (X.C105745Wf) r1
            if (r1 == 0) goto L_0x0005
            java.util.List r0 = r1.A04
            r0.removeAll(r11)
            java.util.List r0 = r1.A02
            r0.removeAll(r11)
            java.util.List r0 = r1.A03
            r0.removeAll(r11)
            java.util.List r0 = r1.A01
            r0.removeAll(r11)
            r2.A0G(r1)
            X.08J r1 = r3.A07
            X.2s8 r0 = r3.A0L
            r1.A0G(r0)
            return
        L_0x033f:
            boolean r0 = X.AnonymousClass0x7.A1T(r11)
            if (r0 != 0) goto L_0x0005
            java.util.Iterator r1 = r11.iterator()
        L_0x0349:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0005
            X.2z0 r0 = X.C86614Ku.A0h(r1)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0349
            java.lang.Object r0 = r10.A00
            com.whatsapp.status.advertise.AdvertiseViewModel r0 = (com.whatsapp.status.advertise.AdvertiseViewModel) r0
            r0.A0D()
            return
        L_0x035f:
            java.lang.String r0 = "MyStatusesActivity/onMessagesDeleted"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.Iterator r2 = r11.iterator()
        L_0x0368:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0005
            X.2z0 r1 = X.C86614Ku.A0h(r2)
            X.4uZ r0 = r1.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0368
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0368
            java.lang.Object r2 = r10.A00
            com.whatsapp.status.playback.MyStatusesActivity r2 = (com.whatsapp.status.playback.MyStatusesActivity) r2
            X.54S r0 = r2.A0Y
            X.C18290x4.A1L(r0)
            X.54S r1 = new X.54S
            r1.<init>(r2)
            r2.A0Y = r1
            X.4FS r0 = r2.A04
            X.C18270x1.A0w(r1, r0)
            return
        L_0x0392:
            java.lang.Object r4 = r10.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r4
            java.util.List r0 = r4.A0o
            if (r0 == 0) goto L_0x0005
            int r3 = r4.A00
            java.util.Iterator r7 = r11.iterator()
            r6 = 0
        L_0x03a1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03e4
            X.2z0 r5 = X.C86614Ku.A0h(r7)
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x03a1
            X.4uZ r0 = r5.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x03a1
            java.util.List r0 = r4.A0o
            if (r0 == 0) goto L_0x03a1
            java.util.Iterator r2 = r0.iterator()
        L_0x03bd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03a1
            X.34x r1 = X.C18300x5.A0T(r2)
            X.2z0 r0 = r1.A1J
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x03bd
            java.util.List r0 = r4.A0o
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L_0x03e2
            java.util.List r0 = r4.A0o
            r0.remove(r1)
            int r0 = r4.A00
            if (r1 >= r0) goto L_0x03e2
            int r3 = r3 + -1
        L_0x03e2:
            r6 = 1
            goto L_0x03a1
        L_0x03e4:
            if (r6 == 0) goto L_0x0005
            X.3Wi r2 = r4.A00
            r0 = 21
            X.3cY r1 = new X.3cY
            r1.<init>(r10, r11, r3, r0)
            android.os.Handler r0 = r2.A02
            r0.post(r1)
            return
        L_0x03f5:
            java.lang.Object r2 = r10.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r2 = (com.whatsapp.storage.StorageUsageGalleryActivity) r2
            android.os.Handler r1 = r2.A0V
            java.lang.Runnable r0 = r2.A0Z
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r2.A0S
            if (r0 == 0) goto L_0x0005
            r0.run()
            return
        L_0x0408:
            java.util.Iterator r9 = r11.iterator()
            r8 = 0
        L_0x040d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0490
            X.34x r1 = X.C18300x5.A0T(r9)
            java.lang.Object r3 = r10.A00
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r3 = (com.whatsapp.storage.StorageUsageMediaGalleryFragment) r3
            X.4uZ r2 = r3.A07
            if (r2 == 0) goto L_0x042b
            X.2z0 r0 = r1.A1J
            X.4uZ r0 = r0.A00
            if (r0 == 0) goto L_0x040d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x040d
        L_0x042b:
            boolean r0 = r3.A0X
            if (r0 == 0) goto L_0x048c
            X.8v5 r5 = r3.A0L
            X.5mf r5 = (X.C114205mf) r5
            if (r5 == 0) goto L_0x040d
            monitor-enter(r5)
            int r6 = r5.getCount()     // Catch:{ all -> 0x0564 }
            r7 = 0
            r4 = 0
        L_0x043c:
            if (r4 >= r6) goto L_0x047e
            java.util.Map r2 = r5.A07     // Catch:{ all -> 0x0564 }
            java.lang.Object r0 = X.AnonymousClass001.A0i(r2, r4)     // Catch:{ all -> 0x0564 }
            X.8GZ r0 = (X.AnonymousClass8GZ) r0     // Catch:{ all -> 0x0564 }
            if (r0 == 0) goto L_0x0462
            X.1mV r0 = r0.A03     // Catch:{ all -> 0x0564 }
            if (r0 == 0) goto L_0x0462
            X.2z0 r0 = r0.A1J     // Catch:{ all -> 0x0564 }
            boolean r0 = X.C86664Kz.A1X(r1, r0)     // Catch:{ all -> 0x0564 }
            if (r0 == 0) goto L_0x0462
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0564 }
            r2.remove(r0)     // Catch:{ all -> 0x0564 }
            int r0 = r5.A00     // Catch:{ all -> 0x0564 }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x0564 }
            goto L_0x0465
        L_0x0462:
            int r4 = r4 + 1
            goto L_0x043c
        L_0x0465:
            r7 = 1
        L_0x0466:
            int r0 = r6 + -1
            if (r4 >= r0) goto L_0x047e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0564 }
            int r4 = r4 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0564 }
            java.lang.Object r0 = r2.remove(r0)     // Catch:{ all -> 0x0564 }
            X.8GZ r0 = (X.AnonymousClass8GZ) r0     // Catch:{ all -> 0x0564 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0564 }
            goto L_0x0466
        L_0x047e:
            monitor-exit(r5)     // Catch:{ all -> 0x0564 }
            if (r7 == 0) goto L_0x040d
            int r1 = r3.A01
            r0 = 1
            int r1 = r1 - r0
            r3.A01 = r1
            r3.A1P()
            r8 = 1
            goto L_0x040d
        L_0x048c:
            r0 = 0
            r3.A1T(r0)
        L_0x0490:
            if (r8 == 0) goto L_0x0005
            java.lang.Object r0 = r10.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A1Q()
            return
        L_0x049a:
            java.util.ArrayList r3 = X.C18300x5.A0r(r11)
            java.util.Iterator r2 = r11.iterator()
        L_0x04a2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04b9
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.34x r0 = (X.C624134x) r0
            X.2z0 r0 = r0.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x04a2
            r3.add(r1)
            goto L_0x04a2
        L_0x04b9:
            java.lang.Object r5 = r10.A00
            X.5WK r5 = (X.AnonymousClass5WK) r5
            java.util.Iterator r4 = r3.iterator()
        L_0x04c1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0005
            X.34x r3 = X.C18300x5.A0T(r4)
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r5.A0A
            r0.A0F()
            X.2X0 r0 = r5.A08
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x04c1
            boolean r0 = X.C627636p.A0l(r3)
            if (r0 != 0) goto L_0x04c1
            X.5mK r1 = r5.A09
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.5Z9 r2 = r1.A0C
            r1 = 5
            r0 = 0
            r2.A02(r3, r0, r0, r1)
            goto L_0x04c1
        L_0x04ec:
            java.lang.Object r6 = r10.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r6 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r6
            X.4Oc r7 = r6.A0B
            java.util.List r0 = r7.A00
            if (r0 == 0) goto L_0x052b
            java.util.Iterator r5 = r11.iterator()
            r4 = 0
        L_0x04fb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0526
            X.34x r3 = X.C18300x5.A0T(r5)
            java.util.List r0 = r7.A00
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L_0x050c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04fb
            X.2z0 r0 = X.C86614Ku.A0h(r2)
            boolean r0 = X.C86664Kz.A1X(r3, r0)
            if (r0 == 0) goto L_0x0523
            java.util.List r0 = r7.A00
            r0.remove(r1)
            r4 = 1
            goto L_0x04fb
        L_0x0523:
            int r1 = r1 + 1
            goto L_0x050c
        L_0x0526:
            if (r4 == 0) goto L_0x052b
            r7.notifyDataSetChanged()
        L_0x052b:
            X.4Oc r0 = r6.A0B
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0537
            r6.finish()
            return
        L_0x0537:
            r6.A77()
            return
        L_0x053b:
            X.66p r0 = r4.A1E
            if (r0 == 0) goto L_0x0542
            r0.close()
        L_0x0542:
            X.8or r0 = r4.A1F
            X.66p r2 = r0.B0s(r1)
            r4.A1E = r2
            r1 = 14
            X.3Zn r0 = new X.3Zn
            r0.<init>(r4, r1)
            r2.Bm9(r0)
            r2.Brd(r3)
            boolean r0 = r4.A20
            if (r0 != 0) goto L_0x0560
            X.66p r0 = r4.A1E
            r0.Bpf()
        L_0x0560:
            r4.A1P()
            return
        L_0x0564:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0564 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124166Bf.BWg(java.util.Collection, java.util.Map):void");
    }

    public /* synthetic */ void BWh(C95814uZ r3, Collection collection, boolean z) {
        if (17 - this.A01 == 0) {
            C93544ok r1 = (C93544ok) this.A00;
            if (C162457s7.A0P(r1.A0F, r3)) {
                r1.A77();
            }
        }
    }

    public /* synthetic */ void BWi(C95814uZ r10, Collection collection, boolean z) {
        C30471mV r0;
        List list;
        C91524kJ r02;
        switch (this.A01) {
            case 3:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        C624134x A0T = C18300x5.A0T(it);
                        ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                        if (AnonymousClass2z0.A0E(A0T, C86604Kt.A0d(contactInfoActivity.A1K))) {
                            r02 = contactInfoActivity.A0x;
                        }
                    }
                    return;
                } else if (r10 == null || C86604Kt.A0d(((ContactInfoActivity) this.A00).A1K).equals(r10)) {
                    r02 = ((ContactInfoActivity) this.A00).A0x;
                } else {
                    return;
                }
                r02.A0F();
                return;
            case 4:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        C624134x A0T2 = C18300x5.A0T(it2);
                        ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                        if (AnonymousClass2z0.A0E(A0T2, listChatInfoActivity.A7G())) {
                            listChatInfoActivity.A7L();
                            return;
                        }
                    }
                    return;
                } else if (r10 == null || r10.equals(((ListChatInfoActivity) this.A00).A7G())) {
                    ((ListChatInfoActivity) this.A00).A7L();
                    return;
                } else {
                    return;
                }
            case 5:
                if (collection != null) {
                    Iterator it3 = collection.iterator();
                    boolean z2 = false;
                    while (it3.hasNext()) {
                        C624134x A0T3 = C18300x5.A0T(it3);
                        MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this.A00;
                        C87124Oc r03 = mediaAlbumActivity.A0B;
                        AnonymousClass2z0 r2 = A0T3.A1J;
                        List list2 = r03.A00;
                        if (list2 != null) {
                            Iterator it4 = list2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (C86614Ku.A0h(it4).equals(r2)) {
                                        mediaAlbumActivity.A0c.add(r2);
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (z2) {
                        ((MediaAlbumActivity) this.A00).A0B.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Iterator it5 = collection.iterator();
                while (it5.hasNext()) {
                    A01(C18300x5.A0T(it5));
                }
                return;
            case 8:
                if (collection == null || !collection.isEmpty()) {
                    ((C93544ok) this.A00).A77();
                    return;
                }
                return;
            case 11:
                AnonymousClass4VQ r22 = (AnonymousClass4VQ) this.A00;
                AnonymousClass5OX r1 = new AnonymousClass5OX();
                if (collection == null || collection.isEmpty()) {
                    r1.A05 = true;
                } else {
                    r1.A04 = collection;
                }
                A00(r1, r22);
                r22.A0I();
                return;
            case 12:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it6 = collection.iterator();
                    while (it6.hasNext()) {
                        C95814uZ r23 = C86614Ku.A0h(it6).A00;
                        if (r23 != null) {
                            GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A00;
                            if (r23.equals(galleryFragmentBase.A0D)) {
                                galleryFragmentBase.A1K();
                                return;
                            }
                        }
                    }
                    return;
                } else if (r10 == null || r10.equals(((GalleryFragmentBase) this.A00).A0D)) {
                    ((GalleryFragmentBase) this.A00).A1K();
                    return;
                } else {
                    return;
                }
            case 13:
                MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this.A00;
                if (mediaGalleryFragment.A06 == null || !mediaGalleryFragment.A0J.A0X(6509)) {
                    MediaGalleryFragment.A00(mediaGalleryFragment, (C114205mf) mediaGalleryFragment.A0L, r10, collection);
                    return;
                } else {
                    mediaGalleryFragment.A06.execute(new C70343aL(this, r10, collection, 23));
                    return;
                }
            case 18:
                AnonymousClass08J r4 = ((AnonymousClass5RD) this.A00).A05;
                C105745Wf r3 = (C105745Wf) r4.A07();
                if (r3 != null && collection != null) {
                    if (z) {
                        r3.A04.removeAll(collection);
                        list = r3.A03;
                    } else {
                        r3.A03.removeAll(collection);
                        list = r3.A04;
                    }
                    TreeSet treeSet = new TreeSet(C1459277v.A00);
                    treeSet.addAll(list);
                    treeSet.addAll(collection);
                    list.clear();
                    list.addAll(treeSet);
                    r4.A0G(r3);
                    return;
                }
                return;
            case 19:
                ((SearchViewModel) this.A00).A0a.A0H(collection);
                return;
            case 26:
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A00;
                C114205mf r6 = (C114205mf) mediaGalleryFragmentBase.A0L;
                if (r6 != null && collection != null) {
                    int count = r6.getCount();
                    Iterator it7 = collection.iterator();
                    boolean z3 = false;
                    while (it7.hasNext()) {
                        C624134x A0T4 = C18300x5.A0T(it7);
                        int i = 0;
                        while (true) {
                            if (i < count) {
                                AnonymousClass8GZ r12 = (AnonymousClass8GZ) AnonymousClass001.A0i(r6.A07, i);
                                if (r12 == null || (r0 = r12.A03) == null || !C86664Kz.A1X(A0T4, r0.A1J)) {
                                    i++;
                                } else {
                                    r12.A03.A1F = z;
                                    z3 = true;
                                }
                            }
                        }
                    }
                    if (z3) {
                        mediaGalleryFragmentBase.A1P();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BWj(Collection collection) {
        if (11 - this.A01 == 0) {
            AnonymousClass4VQ r6 = (AnonymousClass4VQ) this.A00;
            if (r6.A0z.A01()) {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C624134x A0T = C18300x5.A0T(it);
                    C30561me r0 = A0T.A1T;
                    if (r0 != null && r0.A00 == 1) {
                        r6.A1J.put(A0T.A1J, A0T);
                        A0s.add(new AnonymousClass5SF(AnonymousClass58X.UNDO_DELETED, A0T, (AnonymousClass2z0) null));
                    }
                }
                if (!A0s.isEmpty()) {
                    r6.A18.A0H(A0s);
                }
            }
        }
    }

    public /* synthetic */ void BX3(C95804uY r4) {
        if (11 - this.A01 == 0) {
            AnonymousClass4VQ r2 = (AnonymousClass4VQ) this.A00;
            if (r4.equals(r2.A0x)) {
                AnonymousClass5OX r1 = new AnonymousClass5OX();
                r1.A05 = true;
                A00(r1, r2);
                r2.A0I();
                r2.A0O(r2.A0B);
            }
        }
    }

    public /* synthetic */ void BX5(C95804uY r8, boolean z) {
        switch (this.A01) {
            case 11:
                AnonymousClass4VQ r6 = (AnonymousClass4VQ) this.A00;
                if (r8.equals(r6.A0x)) {
                    r6.A0O = !z;
                    if (r6.A08 < 5) {
                        r6.A0V(true);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                C162457s7.A0J(r8, 0);
                ((AnonymousClass5WK) this.A00).A0A.A0L(r8, (C624134x) null, AnonymousClass58R.FULL_HISTORY_FETCHED);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BX6(C95804uY r4) {
        if (11 - this.A01 == 0) {
            AnonymousClass4VQ r2 = (AnonymousClass4VQ) this.A00;
            if (r4.equals(r2.A0x)) {
                AnonymousClass5OX r1 = new AnonymousClass5OX();
                r1.A05 = true;
                A00(r1, r2);
                r2.A0I();
            }
        }
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BY8(C624134x r6, C624134x r7) {
        if (11 - this.A01 == 0) {
            AnonymousClass4VQ r2 = (AnonymousClass4VQ) this.A00;
            Map map = r2.A1J;
            AnonymousClass2z0 r4 = r6.A1J;
            if (map.containsKey(r4)) {
                map.remove(r4);
                map.put(r7.A1J, r7);
                r2.A18.A0H(C162197rQ.newArrayList((Object[]) new AnonymousClass5SF[]{new AnonymousClass5SF(AnonymousClass58X.EDITED, r7, r4)}));
            }
        }
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }
}
