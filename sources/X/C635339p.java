package X;

import android.view.View;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;

/* renamed from: X.39p  reason: invalid class name and case insensitive filesystem */
public class C635339p implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C635339p(StickerExpressionsFragment stickerExpressionsFragment, int i) {
        this.A01 = i;
        this.A00 = stickerExpressionsFragment;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C635339p(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03ee, code lost:
        if (r1.A04.A0Y(X.C58422vE.A02, 4643) == false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        if (r2.A01() == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04d0, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0144, code lost:
        r1 = r4.A0Q();
        X.C626936e.A06(r1);
        ((X.AnonymousClass677) r1).Bqw(r5.A01);
        r0 = r4.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a9, code lost:
        r0.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c9, code lost:
        r1 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cb, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cd, code lost:
        X.C88694ab.A00(r1, r2, 0).A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023a, code lost:
        if (r0 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            r8 = r13
            switch(r0) {
                case 0: goto L_0x045a;
                case 1: goto L_0x04cc;
                case 2: goto L_0x0452;
                case 3: goto L_0x0261;
                case 4: goto L_0x023e;
                case 5: goto L_0x0448;
                case 6: goto L_0x0448;
                case 7: goto L_0x042d;
                case 8: goto L_0x0234;
                case 9: goto L_0x022d;
                case 10: goto L_0x0228;
                case 11: goto L_0x0221;
                case 12: goto L_0x021a;
                case 13: goto L_0x041d;
                case 14: goto L_0x01e3;
                case 15: goto L_0x0414;
                case 16: goto L_0x01e3;
                case 17: goto L_0x0006;
                case 18: goto L_0x03a5;
                case 19: goto L_0x0006;
                case 20: goto L_0x01d6;
                case 21: goto L_0x0006;
                case 22: goto L_0x038e;
                case 23: goto L_0x01c2;
                case 24: goto L_0x01ba;
                case 25: goto L_0x0386;
                case 26: goto L_0x01ad;
                case 27: goto L_0x037e;
                case 28: goto L_0x0376;
                case 29: goto L_0x036e;
                case 30: goto L_0x0180;
                case 31: goto L_0x035c;
                case 32: goto L_0x0155;
                case 33: goto L_0x00f8;
                case 34: goto L_0x00bd;
                case 35: goto L_0x0332;
                case 36: goto L_0x00b2;
                case 37: goto L_0x00a7;
                case 38: goto L_0x0072;
                case 39: goto L_0x032a;
                case 40: goto L_0x0322;
                case 41: goto L_0x030e;
                case 42: goto L_0x0306;
                case 43: goto L_0x0018;
                case 44: goto L_0x02fe;
                case 45: goto L_0x02f4;
                case 46: goto L_0x02bf;
                case 47: goto L_0x02b6;
                case 48: goto L_0x0296;
                case 49: goto L_0x0276;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r12.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r1 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r1
            com.whatsapp.WaEditText r0 = r1.A08
            if (r0 == 0) goto L_0x0014
            r0.A05()
            r0.clearFocus()
        L_0x0014:
            r1.A1K()
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r2 = r12.A00
            com.whatsapp.group.GroupAdminPickerActivity r2 = (com.whatsapp.group.GroupAdminPickerActivity) r2
            java.lang.Object r0 = r13.getTag()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0017
            java.lang.Object r8 = r13.getTag()
            com.whatsapp.jid.Jid r8 = (com.whatsapp.jid.Jid) r8
            java.lang.String r0 = r2.A0P
            if (r0 == 0) goto L_0x0462
            java.lang.String r0 = r2.A0N
            if (r0 == 0) goto L_0x0462
            java.lang.Class<X.4ea> r0 = X.C89654ea.class
            android.app.Activity r7 = X.C111095hX.A03(r2, r0)
            X.4ea r7 = (X.C89654ea) r7
            java.lang.String r6 = r2.A0O
            X.1fJ r5 = r2.A0L
            java.lang.String r4 = r2.A0P
            java.lang.String r3 = r2.A0N
            java.lang.String r1 = "message"
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            X.C18260x0.A0c(r8, r5, r4, r3)
            com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment r2 = new com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass0x7.A0F(r1, r6)
            java.lang.String r0 = "admin_jid"
            X.AnonymousClass0x2.A0v(r1, r8, r0)
            java.lang.String r0 = "group_jid"
            X.AnonymousClass0x2.A0v(r1, r5, r0)
            java.lang.String r0 = "raw_parent_jid"
            r1.putString(r0, r3)
            java.lang.String r0 = "group_subject"
            r1.putString(r0, r4)
            r2.A0u(r1)
            java.lang.String r0 = "join_request_reason"
            r7.Bon(r2, r0)
            return
        L_0x0072:
            java.lang.Object r3 = r12.A00
            X.4qq r3 = (X.C94264qq) r3
            X.5RA r2 = r3.A0D
            if (r2 == 0) goto L_0x0081
            boolean r0 = r2.A01()
            r1 = 1
            if (r0 != 0) goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            boolean r0 = r3.isShowing()
            if (r0 == 0) goto L_0x009f
            int r0 = r3.A00
            if (r0 != 0) goto L_0x009f
            if (r1 == 0) goto L_0x009f
            r3.A0B()
            java.lang.String r0 = "contextual_suggestion"
            r3.A0K(r0)
        L_0x0096:
            X.2mV r0 = r2.A0G
            X.33p r1 = r0.A01
            java.lang.Object r3 = r1.A04
            monitor-enter(r3)
            goto L_0x046f
        L_0x009f:
            android.view.View$OnClickListener r0 = r3.A0F
            r0.onClick(r13)
            if (r1 == 0) goto L_0x0017
            goto L_0x0096
        L_0x00a7:
            java.lang.Object r0 = r12.A00
            com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment r0 = (com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment) r0
            r0.A1K()
            X.4GP r0 = r0.A00
            goto L_0x023a
        L_0x00b2:
            java.lang.Object r0 = r12.A00
            com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment r0 = (com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment) r0
            r0.A1K()
            X.4GP r0 = r0.A01
            goto L_0x023a
        L_0x00bd:
            java.lang.Object r5 = r12.A00
            X.4Z3 r5 = (X.AnonymousClass4Z3) r5
            X.34x r0 = r5.A01
            if (r0 == 0) goto L_0x0017
            com.whatsapp.gallery.LinksGalleryFragment r4 = r5.A0A
            X.03q r0 = r4.A0Q()
            X.C626936e.A06(r0)
            X.677 r0 = (X.AnonymousClass677) r0
            boolean r0 = r0.BFW()
            if (r0 != 0) goto L_0x0144
            java.lang.String r0 = r5.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0017
            java.util.Set r3 = r5.A03
            if (r3 == 0) goto L_0x0488
            X.03q r2 = r4.A0Q()
            X.4ea r2 = (X.C89654ea) r2
            java.lang.String r1 = r5.A02
            X.34x r0 = r5.A01
            X.2z0 r0 = r0.A1J
            java.lang.String r0 = r0.A01
            com.whatsapp.SuspiciousLinkWarningDialogFragment r0 = X.C379624s.A00(r1, r0, r3)
            r2.Boo(r0)
            return
        L_0x00f8:
            java.lang.Object r5 = r12.A00
            X.4Z3 r5 = (X.AnonymousClass4Z3) r5
            X.34x r0 = r5.A01
            if (r0 == 0) goto L_0x0017
            com.whatsapp.gallery.LinksGalleryFragment r4 = r5.A0A
            X.03q r0 = r4.A0Q()
            X.C626936e.A06(r0)
            X.677 r0 = (X.AnonymousClass677) r0
            boolean r0 = r0.BFW()
            if (r0 != 0) goto L_0x0144
            X.36r r3 = new X.36r
            r3.<init>()
            android.content.Context r2 = r4.A1D()
            X.34x r0 = r5.A01
            X.2z0 r0 = r0.A1J
            X.4uZ r1 = r0.A00
            r0 = 0
            android.content.Intent r3 = r3.A1O(r2, r1, r0)
            X.34x r0 = r5.A01
            long r1 = r0.A1L
            java.lang.String r0 = "row_id"
            r3.putExtra(r0, r1)
            X.34x r0 = r5.A01
            long r1 = r0.A1M
            java.lang.String r0 = "sort_id"
            r3.putExtra(r0, r1)
            X.34x r0 = r5.A01
            X.2z0 r0 = r0.A1J
            X.C107395bF.A00(r3, r0)
            X.C57052sz.A00(r3, r4)
            return
        L_0x0144:
            X.03q r1 = r4.A0Q()
            X.C626936e.A06(r1)
            X.677 r1 = (X.AnonymousClass677) r1
            X.34x r0 = r5.A01
            r1.Bqw(r0)
            X.4X2 r0 = r4.A0A
            goto L_0x01a9
        L_0x0155:
            java.lang.Object r2 = r12.A00
            com.whatsapp.gallery.GalleryTabHostFragment r2 = (com.whatsapp.gallery.GalleryTabHostFragment) r2
            X.4Tc r0 = r2.A1M()
            if (r0 == 0) goto L_0x0176
            X.66R r0 = r0.A0J
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.gallery.GalleryRecentsFragment r0 = (com.whatsapp.gallery.GalleryRecentsFragment) r0
            boolean r1 = r0.A06
            r0 = 1
            if (r1 != r0) goto L_0x0176
            boolean r0 = r2.A1V()
            if (r0 != 0) goto L_0x0176
            r2.A1O()
            return
        L_0x0176:
            X.03q r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0017
            r0.onBackPressed()
            return
        L_0x0180:
            java.lang.Object r3 = r12.A00
            X.4Yt r3 = (X.C88444Yt) r3
            X.1nF r0 = r3.A00
            if (r0 == 0) goto L_0x0017
            com.whatsapp.gallery.DocumentsGalleryFragment r2 = r3.A0B
            X.03q r0 = r2.A0Q()
            X.C626936e.A06(r0)
            X.677 r0 = (X.AnonymousClass677) r0
            boolean r0 = r0.BFW()
            if (r0 == 0) goto L_0x04ab
            X.03q r1 = r2.A0Q()
            X.C626936e.A06(r1)
            X.677 r1 = (X.AnonymousClass677) r1
            X.1nF r0 = r3.A00
            r1.Bqw(r0)
            X.4X2 r0 = r2.A0A
        L_0x01a9:
            r0.A05()
            return
        L_0x01ad:
            java.lang.Object r0 = r12.A00
            com.whatsapp.extensions.bloks.view.WaBkExtensionsScreenFragment r0 = (com.whatsapp.extensions.bloks.view.WaBkExtensionsScreenFragment) r0
            X.4ab r1 = r0.A03
            if (r1 == 0) goto L_0x0017
            r0 = 3
            r1.A08(r0)
            return
        L_0x01ba:
            java.lang.Object r0 = r12.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r0 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r0
            r2 = 2131888897(0x7f120b01, float:1.9412442E38)
            goto L_0x01c9
        L_0x01c2:
            java.lang.Object r0 = r12.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r0 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r0
            r2 = 2131888894(0x7f120afe, float:1.9412436E38)
        L_0x01c9:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r0.A03
            if (r1 == 0) goto L_0x0017
            r0 = 0
            X.4ab r0 = X.C88694ab.A00(r1, r2, r0)
            r0.A05()
            return
        L_0x01d6:
            java.lang.Object r0 = r12.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r0 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r0
            com.whatsapp.WaEditText r1 = r0.A08
            if (r1 == 0) goto L_0x0017
            r0 = 0
            r1.setText(r0)
            return
        L_0x01e3:
            java.lang.Object r4 = r12.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r4 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r4
            com.whatsapp.WaTextView r1 = r4.A0F
            r0 = 0
            if (r1 == 0) goto L_0x01f0
            java.lang.CharSequence r0 = r1.getText()
        L_0x01f0:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "\""
            java.lang.String r1 = ""
            r0 = 0
            java.lang.String r2 = X.C175738Zn.A0U(r3, r2, r1, r0)
            boolean r0 = X.C175738Zn.A0V(r2)
            if (r0 != 0) goto L_0x0017
            com.whatsapp.WaEditText r0 = r4.A08
            if (r0 == 0) goto L_0x020a
            r0.setText(r2)
        L_0x020a:
            com.whatsapp.WaEditText r1 = r4.A08
            if (r1 == 0) goto L_0x0215
            int r0 = r2.length()
            r1.setSelection(r0)
        L_0x0215:
            r0 = 0
            r4.A1e(r0)
            return
        L_0x021a:
            java.lang.Object r0 = r12.A00
            X.1Ty r0 = (X.C23611Ty) r0
            X.4GP r0 = r0.A01
            goto L_0x023a
        L_0x0221:
            java.lang.Object r0 = r12.A00
            X.1Ty r0 = (X.C23611Ty) r0
            X.4GP r0 = r0.A02
            goto L_0x023a
        L_0x0228:
            java.lang.Object r0 = r12.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            goto L_0x023a
        L_0x022d:
            java.lang.Object r0 = r12.A00
            X.1Tx r0 = (X.AnonymousClass1Tx) r0
            X.4GP r0 = r0.A01
            goto L_0x023a
        L_0x0234:
            java.lang.Object r0 = r12.A00
            X.1Tx r0 = (X.AnonymousClass1Tx) r0
            X.4GP r0 = r0.A02
        L_0x023a:
            if (r0 == 0) goto L_0x0017
            goto L_0x04d0
        L_0x023e:
            java.lang.Object r0 = r12.A00
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet r0 = (com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet) r0
            android.view.ViewGroup r1 = r0.A02
            if (r1 == 0) goto L_0x0017
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r4 = X.C18320x8.A0L(r0)
            X.5Wv r0 = r0.A0H
            if (r0 == 0) goto L_0x04c5
            boolean r0 = X.C105895Wv.A00(r1)
            X.4C6 r3 = X.AnonymousClass0IV.A00(r4)
            r2 = 0
            com.whatsapp.expressionstray.ExpressionsSearchViewModel$onBackButtonClick$1 r1 = new com.whatsapp.expressionstray.ExpressionsSearchViewModel$onBackButtonClick$1
            r1.<init>(r4, r2, r0)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x0261:
            java.lang.Object r2 = r12.A00
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet r2 = (com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet) r2
            com.whatsapp.WaEditText r1 = r2.A0A
            if (r1 == 0) goto L_0x026e
            java.lang.String r0 = ""
            r1.setText(r0)
        L_0x026e:
            com.whatsapp.WaEditText r0 = r2.A0A
            if (r0 == 0) goto L_0x0017
            r0.A06()
            return
        L_0x0276:
            java.lang.Object r4 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            android.content.Context r0 = r4.getApplicationContext()
            X.1fJ r3 = r4.A1h
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupPendingParticipantsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.AnonymousClass0x2.A0u(r2, r3, r0)
            r4.startActivity(r2)
            return
        L_0x0296:
            java.lang.Object r6 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r6 = (com.whatsapp.group.GroupChatInfoActivity) r6
            X.1fJ r5 = r6.A7G()
            long r2 = r6.A00
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity"
            X.C627336j.A0E(r4, r5, r1, r0)
            java.lang.String r0 = "keptMessageCount"
            r4.putExtra(r0, r2)
            r6.startActivity(r4)
            return
        L_0x02b6:
            java.lang.Object r1 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            r0 = 0
            r1.A7Y(r0)
            return
        L_0x02bf:
            java.lang.Object r4 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.2hF r2 = r4.A1V
            X.1fJ r1 = r4.A1h
            X.3ZH r0 = r4.A19
            boolean r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x02e8
            X.1fJ r3 = r4.A1h
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.expiringgroups.ChangeExpiringGroupsSettingActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass0x2.A0u(r1, r3, r0)
            r4.startActivity(r1)
            return
        L_0x02e8:
            r1 = 2131889056(0x7f120ba0, float:1.9412765E38)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r1, r0)
            r0.show()
            return
        L_0x02f4:
            java.lang.Object r0 = r12.A00
            X.4k4 r0 = (X.C91484k4) r0
            X.5QY r0 = r0.A0D
            r0.A00()
            return
        L_0x02fe:
            java.lang.Object r0 = r12.A00
            com.whatsapp.group.GroupChangedParticipantsBottomSheet r0 = (com.whatsapp.group.GroupChangedParticipantsBottomSheet) r0
            r0.A1Y()
            return
        L_0x0306:
            java.lang.Object r0 = r12.A00
            com.whatsapp.group.GroupAdminPickerActivity r0 = (com.whatsapp.group.GroupAdminPickerActivity) r0
            r0.A75()
            return
        L_0x030e:
            java.lang.Object r0 = r12.A00
            com.whatsapp.greenalert.GreenAlertActivity r0 = (com.whatsapp.greenalert.GreenAlertActivity) r0
            com.whatsapp.WaViewPager r1 = r0.A06
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            android.view.View r0 = r1.findViewWithTag(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            X.AnonymousClass5CE.A00(r0)
            return
        L_0x0322:
            java.lang.Object r0 = r12.A00
            com.whatsapp.greenalert.GreenAlertActivity r0 = (com.whatsapp.greenalert.GreenAlertActivity) r0
            r0.A74()
            return
        L_0x032a:
            java.lang.Object r0 = r12.A00
            com.whatsapp.gifsearch.GifSearchContainer r0 = (com.whatsapp.gifsearch.GifSearchContainer) r0
            com.whatsapp.gifsearch.GifSearchContainer.setupSearchContainer$lambda$4$lambda$2(r0, r13)
            return
        L_0x0332:
            java.lang.Object r3 = r12.A00
            com.whatsapp.gallery.NewMediaPickerFragment r3 = (com.whatsapp.gallery.NewMediaPickerFragment) r3
            java.util.Set r0 = r3.A05
            java.util.ArrayList r2 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0340:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0354
            java.lang.Object r0 = r1.next()
            X.8ug r0 = (X.C186058ug) r0
            android.net.Uri r0 = r0.B3d()
            r2.add(r0)
            goto L_0x0340
        L_0x0354:
            java.util.Set r0 = X.C73723fy.A0P(r2)
            r3.A1b(r0)
            return
        L_0x035c:
            java.lang.Object r1 = r12.A00
            com.whatsapp.gallery.GalleryTabHostFragment r1 = (com.whatsapp.gallery.GalleryTabHostFragment) r1
            X.66R r0 = r1.A0K
            java.lang.Object r0 = r0.getValue()
            X.4Wm r0 = (X.C87884Wm) r0
            java.util.List r0 = r0.A02
            r1.A1R(r0)
            return
        L_0x036e:
            java.lang.Object r0 = r12.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x0376:
            java.lang.Object r0 = r12.A00
            X.0eF r0 = (X.C08310eF) r0
            X.C18310x6.A1A(r0)
            return
        L_0x037e:
            java.lang.Object r0 = r12.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
            return
        L_0x0386:
            java.lang.Object r0 = r12.A00
            com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer r0 = (com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer) r0
            r0.A1Y()
            return
        L_0x038e:
            java.lang.Object r0 = r12.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r0 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r0
            com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = X.C18300x5.A0N(r0)
            X.4C6 r3 = X.AnonymousClass0IV.A00(r0)
            r2 = 0
            com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onStickersStoreClick$1 r1 = new com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onStickersStoreClick$1
            r1.<init>(r0, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x03a5:
            java.lang.Object r3 = r12.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r3 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r3
            X.C162457s7.A0H(r13)
            android.content.Context r7 = r3.A0G()
            r9 = 8388613(0x800005, float:1.175495E-38)
            r10 = 0
            X.1VX r0 = r3.A0K
            if (r0 == 0) goto L_0x040f
            int r11 = X.AnonymousClass29M.A00(r0)
            X.0Th r6 = new X.0Th
            r6.<init>(r7, r8, r9, r10, r11)
            android.content.Context r0 = r6.A02
            X.02O r1 = new X.02O
            r1.<init>(r0)
            r0 = 2131820559(0x7f11000f, float:1.9273836E38)
            X.0cz r4 = r6.A04
            r1.inflate(r0, r4)
            r0 = 2131430281(0x7f0b0b89, float:1.8482259E38)
            android.view.MenuItem r5 = r4.findItem(r0)
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = X.C18300x5.A0O(r3)
            X.2pQ r1 = r0.A0K
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x03f0
            X.1VX r2 = r1.A04
            r1 = 4643(0x1223, float:6.506E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r1 = r2.A0Y(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x03f1
        L_0x03f0:
            r0 = 0
        L_0x03f1:
            r5.setVisible(r0)
            X.1VX r2 = r3.A0K
            if (r2 == 0) goto L_0x040a
            r1 = 0
            r0 = 4497(0x1191, float:6.302E-42)
            boolean r0 = X.C106545Zk.A04(r2, r1, r0)
            if (r0 == 0) goto L_0x0404
            r0 = 1
            r4.A0H = r0
        L_0x0404:
            r6.A01 = r3
            r6.A00()
            return
        L_0x040a:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x040f:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0414:
            java.lang.Object r1 = r12.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r1 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r1
            r0 = 0
            r1.A1e(r0)
            return
        L_0x041d:
            java.lang.Object r0 = r12.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r0 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r0
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = X.C18300x5.A0O(r0)
            X.08M r1 = r0.A0A
            X.6i9 r0 = X.C133916i9.A00
            r1.A0H(r0)
            return
        L_0x042d:
            java.lang.Object r0 = r12.A00
            com.whatsapp.expressionstray.gifs.GifExpressionsFragment r0 = (com.whatsapp.expressionstray.gifs.GifExpressionsFragment) r0
            X.66R r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel r0 = (com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel) r0
            X.4C6 r3 = X.AnonymousClass0IV.A00(r0)
            r2 = 0
            com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$retry$1 r1 = new com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$retry$1
            r1.<init>(r0, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x0448:
            java.lang.Object r1 = r12.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0452:
            java.lang.Object r0 = r12.A00
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = (com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView) r0
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView.A01(r0)
            return
        L_0x045a:
            java.lang.Object r0 = r12.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$13(r0, r13)
            return
        L_0x0462:
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "contact"
            X.AnonymousClass0x2.A0u(r1, r8, r0)
            X.AnonymousClass0x2.A0m(r2, r1)
            return
        L_0x046f:
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r1)     // Catch:{ all -> 0x0485 }
            java.lang.String r2 = "sticker_suggestion_icon_clicked_count"
            int r0 = X.C18280x3.A02(r0, r2)     // Catch:{ all -> 0x0485 }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)     // Catch:{ all -> 0x0485 }
            int r0 = r0 + 1
            X.C18270x1.A0h(r1, r2, r0)     // Catch:{ all -> 0x0485 }
            monitor-exit(r3)     // Catch:{ all -> 0x0485 }
            return
        L_0x0485:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0485 }
            throw r0
        L_0x0488:
            java.lang.String r0 = r5.A02
            android.content.Intent r2 = X.C18300x5.A08(r0)
            android.content.Context r0 = r4.A1D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.android.browser.application_id"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "create_new_tab"
            r0 = 1
            r2.putExtra(r1, r0)
            X.5hX r1 = r4.A00
            android.content.Context r0 = r4.A1D()
            r1.A0A(r0, r2)
            return
        L_0x04ab:
            X.5Tg r9 = r2.A07
            X.3Wi r6 = r2.A02
            X.2qk r4 = r2.A01
            X.4FS r11 = r2.A0G
            X.2eF r7 = r2.A06
            X.03q r5 = r2.A0Q()
            X.4ea r5 = (X.C89654ea) r5
            X.1nF r8 = r3.A00
            X.5hX r3 = r2.A00
            X.8y5 r10 = r2.A08
            X.C107105ah.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x04c5:
            java.lang.String r0 = "imeUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04cc:
            java.lang.Object r0 = r12.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
        L_0x04d0:
            r0.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C635339p.onClick(android.view.View):void");
    }

    public C635339p(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
