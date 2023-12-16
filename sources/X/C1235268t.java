package X;

import android.content.DialogInterface;

/* renamed from: X.68t  reason: invalid class name and case insensitive filesystem */
public class C1235268t implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public C1235268t(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C1235268t A00(Object obj, int i) {
        return new C1235268t(obj, i);
    }

    public static void A01(AnonymousClass0Uj r1, Object obj, int i, int i2) {
        r1.setNegativeButton(i2, new C1235268t(obj, i));
    }

    public static void A02(AnonymousClass0Uj r1, Object obj, int i, int i2) {
        r1.setPositiveButton(i2, new C1235268t(obj, i));
    }

    public static void A03(C19340zH r1, Object obj, int i, int i2) {
        r1.A0Y(new C1235268t(obj, i), i2);
    }

    public static void A04(C19340zH r1, Object obj, int i, int i2) {
        r1.A0W(new C1235268t(obj, i), i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.whatsapp.status.playback.fragment.OpenLinkDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment$DiscardChangesConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: com.whatsapp.voipcalling.VoipActivityV2$E2EEInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v63, resolved type: com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v252, resolved type: com.whatsapp.status.playback.fragment.OpenLinkDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v253, resolved type: com.whatsapp.status.playback.fragment.OpenLinkDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v64, resolved type: com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0328, code lost:
        r5.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x032b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0c67, code lost:
        r1.A1L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0c6a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0c8f, code lost:
        r3.A1L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0c92, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r23, int r24) {
        /*
            r22 = this;
            r1 = r22
            int r0 = r1.A01
            r2 = r23
            switch(r0) {
                case 0: goto L_0x0baa;
                case 1: goto L_0x0ba0;
                case 2: goto L_0x0b98;
                case 3: goto L_0x0b89;
                case 4: goto L_0x0185;
                case 5: goto L_0x0185;
                case 6: goto L_0x0b7e;
                case 7: goto L_0x0b34;
                case 8: goto L_0x0afa;
                case 9: goto L_0x0c6b;
                case 10: goto L_0x0ae8;
                case 11: goto L_0x0ab2;
                case 12: goto L_0x0aa6;
                case 13: goto L_0x0a99;
                case 14: goto L_0x0a90;
                case 15: goto L_0x0a7d;
                case 16: goto L_0x0a74;
                case 17: goto L_0x0a40;
                case 18: goto L_0x0a37;
                case 19: goto L_0x0a22;
                case 20: goto L_0x0a08;
                case 21: goto L_0x0161;
                case 22: goto L_0x0009;
                case 23: goto L_0x0009;
                case 24: goto L_0x0a02;
                case 25: goto L_0x09f3;
                case 26: goto L_0x09eb;
                case 27: goto L_0x09d7;
                case 28: goto L_0x09c3;
                case 29: goto L_0x09aa;
                case 30: goto L_0x0999;
                case 31: goto L_0x014d;
                case 32: goto L_0x098c;
                case 33: goto L_0x094d;
                case 34: goto L_0x0940;
                case 35: goto L_0x090f;
                case 36: goto L_0x08fd;
                case 37: goto L_0x08f1;
                case 38: goto L_0x08d2;
                case 39: goto L_0x08c2;
                case 40: goto L_0x089b;
                case 41: goto L_0x0009;
                case 42: goto L_0x0009;
                case 43: goto L_0x0009;
                case 44: goto L_0x088c;
                case 45: goto L_0x0876;
                case 46: goto L_0x0852;
                case 47: goto L_0x0843;
                case 48: goto L_0x081f;
                case 49: goto L_0x0813;
                case 50: goto L_0x0807;
                case 51: goto L_0x07f7;
                case 52: goto L_0x07ec;
                case 53: goto L_0x07e0;
                case 54: goto L_0x07a9;
                case 55: goto L_0x079d;
                case 56: goto L_0x0791;
                case 57: goto L_0x0775;
                case 58: goto L_0x076c;
                case 59: goto L_0x0763;
                case 60: goto L_0x075a;
                case 61: goto L_0x0751;
                case 62: goto L_0x0747;
                case 63: goto L_0x073e;
                case 64: goto L_0x0730;
                case 65: goto L_0x0725;
                case 66: goto L_0x071c;
                case 67: goto L_0x0711;
                case 68: goto L_0x0709;
                case 69: goto L_0x0711;
                case 70: goto L_0x0711;
                case 71: goto L_0x0700;
                case 72: goto L_0x06f8;
                case 73: goto L_0x0a02;
                case 74: goto L_0x0a02;
                case 75: goto L_0x06e3;
                case 76: goto L_0x06d9;
                case 77: goto L_0x0140;
                case 78: goto L_0x06bd;
                case 79: goto L_0x06b3;
                case 80: goto L_0x06aa;
                case 81: goto L_0x06a1;
                case 82: goto L_0x0698;
                case 83: goto L_0x0680;
                case 84: goto L_0x0677;
                case 85: goto L_0x066a;
                case 86: goto L_0x0660;
                case 87: goto L_0x0657;
                case 88: goto L_0x064e;
                case 89: goto L_0x0642;
                case 90: goto L_0x05b3;
                case 91: goto L_0x05a5;
                case 92: goto L_0x059b;
                case 93: goto L_0x012e;
                case 94: goto L_0x0140;
                case 95: goto L_0x0591;
                case 96: goto L_0x0582;
                case 97: goto L_0x0566;
                case 98: goto L_0x054d;
                case 99: goto L_0x0540;
                case 100: goto L_0x0528;
                case 101: goto L_0x051c;
                case 102: goto L_0x0512;
                case 103: goto L_0x04fb;
                case 104: goto L_0x04e3;
                case 105: goto L_0x04da;
                case 106: goto L_0x0493;
                case 107: goto L_0x048a;
                case 108: goto L_0x0481;
                case 109: goto L_0x0478;
                case 110: goto L_0x046f;
                case 111: goto L_0x0465;
                case 112: goto L_0x045c;
                case 113: goto L_0x0422;
                case 114: goto L_0x0411;
                case 115: goto L_0x03e5;
                case 116: goto L_0x03cd;
                case 117: goto L_0x039e;
                case 118: goto L_0x0381;
                case 119: goto L_0x0369;
                case 120: goto L_0x035d;
                case 121: goto L_0x0122;
                case 122: goto L_0x0351;
                case 123: goto L_0x0344;
                case 124: goto L_0x0336;
                case 125: goto L_0x032c;
                case 126: goto L_0x0c5c;
                case 127: goto L_0x02f2;
                case 128: goto L_0x0009;
                case 129: goto L_0x00fd;
                case 130: goto L_0x02a4;
                case 131: goto L_0x00ba;
                case 132: goto L_0x00aa;
                case 133: goto L_0x029c;
                case 134: goto L_0x008e;
                case 135: goto L_0x0082;
                case 136: goto L_0x0054;
                case 137: goto L_0x0011;
                case 138: goto L_0x0292;
                case 139: goto L_0x0288;
                case 140: goto L_0x026d;
                case 141: goto L_0x0247;
                case 142: goto L_0x0212;
                case 143: goto L_0x01c5;
                case 144: goto L_0x019d;
                case 145: goto L_0x018f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r3 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2$SwitchConfirmationFragment r3 = (com.whatsapp.voipcalling.VoipActivityV2.SwitchConfirmationFragment) r3
            X.33p r0 = r3.A00
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r2 = "switch_to_video_call_confirmation_dialog_count"
            int r0 = X.C18280x3.A02(r0, r2)
            X.33p r1 = r3.A00
            int r0 = r0 + 1
            X.C18260x0.A0L(r1, r2, r0)
            X.03q r2 = r3.A0Q()
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            if (r2 == 0) goto L_0x0010
            com.whatsapp.voipcalling.CallInfo r1 = r2.A7D()
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1.isGroupCall
            if (r0 != 0) goto L_0x0010
            X.5Lb r0 = r1.self
            int r0 = r0.A06
            if (r0 != 0) goto L_0x0010
            com.whatsapp.jid.UserJid r1 = X.C86644Kx.A0X(r1)
            r0 = 1
            boolean r0 = r2.A85(r1, r0, r0)
            if (r0 == 0) goto L_0x0010
            X.5b3 r0 = r2.A16
            X.C626936e.A06(r0)
            r0.A0H()
            return
        L_0x0054:
            java.lang.Object r3 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2$E2EEInfoDialogFragment r3 = (com.whatsapp.voipcalling.VoipActivityV2.E2EEInfoDialogFragment) r3
            X.5WX r2 = r3.A03
            int r1 = r3.A00
            r0 = 2
            r2.A00(r1, r0)
            X.3Lk r1 = r3.A04
            java.lang.String r0 = "28030015"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.5hX r1 = r3.A01
            android.content.Context r0 = r3.A0G()
            r1.A0A(r0, r2)
            boolean r0 = r3.A16()
            if (r0 == 0) goto L_0x0010
            goto L_0x0c8f
        L_0x0082:
            java.lang.Object r1 = r1.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A16()
            if (r0 == 0) goto L_0x0010
            goto L_0x0c67
        L_0x008e:
            java.lang.Object r0 = r1.A00
            X.66L r0 = (X.AnonymousClass66L) r0
            X.69e r0 = (X.C1236369e) r0
            int r1 = r0.A01
            java.lang.Object r0 = r0.A00
            switch(r1) {
                case 0: goto L_0x0bb2;
                case 1: goto L_0x00a1;
                default: goto L_0x009b;
            }
        L_0x009b:
            X.66K r0 = (X.AnonymousClass66K) r0
            r0.BWt()
            return
        L_0x00a1:
            com.whatsapp.WaPreferenceFragment r0 = (com.whatsapp.WaPreferenceFragment) r0
            X.4bZ r1 = r0.A00
            if (r1 == 0) goto L_0x0010
            r0 = 3
            goto L_0x0bb7
        L_0x00aa:
            java.lang.Object r2 = r1.A00
            com.whatsapp.stickers.info.StickerInfoDialogFragment r2 = (com.whatsapp.stickers.info.StickerInfoDialogFragment) r2
            X.5LB r1 = r2.A0M
            if (r1 == 0) goto L_0x0010
            X.39M r0 = r2.A0H
            if (r0 == 0) goto L_0x0010
            r2.A1V(r0, r1)
            return
        L_0x00ba:
            java.lang.Object r5 = r1.A00
            com.whatsapp.stickers.info.StickerInfoDialogFragment r5 = (com.whatsapp.stickers.info.StickerInfoDialogFragment) r5
            X.5LB r0 = r5.A0M
            if (r0 == 0) goto L_0x0010
            X.39M r0 = r5.A0H
            if (r0 == 0) goto L_0x0010
            X.2sr r0 = r5.A09
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0bce
            X.1VX r1 = r5.A02
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0bce
            X.5LB r1 = r5.A0M
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x0bce
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0bbe
            X.03q r0 = r5.A0Q()
            boolean r0 = r0 instanceof X.AnonymousClass67A
            if (r0 == 0) goto L_0x0bbb
            boolean r0 = r5.A1W()
            if (r0 != 0) goto L_0x0bbb
            X.2r2 r1 = r5.A0G
            r0 = 6
            r1.A01(r0)
            X.4xh r1 = r5.A0N
            r0 = 0
            r1.A09(r0)
            return
        L_0x00fd:
            java.lang.Object r4 = r1.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment$DiscardChangesConfirmationDialogFragment r4 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.DiscardChangesConfirmationDialogFragment) r4
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0010
            X.5de r0 = r4.A01
            boolean r0 = r0.A03
            X.5hb r3 = r4.A03
            java.lang.Boolean r2 = X.C18320x8.A0V(r0)
            java.lang.String r0 = "initial_auto_setting"
            r3.A06(r0, r2)
            r1 = 1
            java.lang.String r0 = "final_auto_setting"
            r3.A06(r0, r2)
            java.lang.String r0 = "TAP_CHANGES_DISCARD"
            r3.A04(r0)
            r4.A00 = r1
            return
        L_0x0122:
            java.lang.Object r0 = r1.A00
            com.whatsapp.report.ShareReportConfirmationDialogFragment r0 = (com.whatsapp.report.ShareReportConfirmationDialogFragment) r0
            X.65V r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            r0.Bnz()
            return
        L_0x012e:
            java.lang.Object r1 = r1.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.String r0 = "RegistrationUtils/showLoginFailedDialog/continue login"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.dismiss()
            if (r1 == 0) goto L_0x0010
            r1.run()
            return
        L_0x0140:
            java.lang.Object r0 = r1.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.dismiss()
            if (r0 == 0) goto L_0x0010
            r0.run()
            return
        L_0x014d:
            java.lang.Object r2 = r1.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.03q r1 = r2.A0Q()
            r0 = 1
            X.C621433s.A00(r1, r0)
            X.0R2 r0 = r2.A0O
            if (r0 == 0) goto L_0x0010
            r0.A05()
            return
        L_0x0161:
            java.lang.Object r0 = r1.A00
            com.whatsapp.community.CommunityExitDialogFragment r0 = (com.whatsapp.community.CommunityExitDialogFragment) r0
            android.content.Context r5 = r0.A1D()
            if (r5 == 0) goto L_0x0010
            X.5hX r4 = r0.A00
            X.1fJ r3 = r0.A04
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "parent_group_jid"
            X.AnonymousClass0x2.A0u(r2, r3, r0)
            r4.A0A(r5, r2)
            return
        L_0x0185:
            java.lang.Object r0 = r1.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            if (r0 == 0) goto L_0x0010
            r0.invoke()
            return
        L_0x018f:
            java.lang.Object r0 = r1.A00
            com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity r0 = (com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity) r0
            X.5hb r1 = r0.A74()
            java.lang.String r0 = "TAP_UNLINK_CANCEL"
            r1.A05(r0)
            return
        L_0x019d:
            java.lang.Object r3 = r1.A00
            com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity r3 = (com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity) r3
            X.3Wi r0 = r3.A05
            X.C162457s7.A0C(r0)
            X.2fU r2 = new X.2fU
            r2.<init>(r0)
            r0 = 2131886300(0x7f1200dc, float:1.9407175E38)
            r2.A01(r0)
            X.5hb r1 = r3.A74()
            java.lang.String r0 = "TAP_UNLINK_DISABLE"
            r1.A05(r0)
            X.4FS r1 = r3.A04
            X.5rS r0 = new X.5rS
            r0.<init>(r2, r3)
            r1.BkM(r0)
            return
        L_0x01c5:
            java.lang.Object r0 = r1.A00
            com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment) r0
            X.5Jc r1 = r0.A02
            X.5aR r4 = r1.A01
            X.8qC r0 = r4.A00
            java.lang.Object r5 = r0.get()
            X.5Xa r5 = (X.C105945Xa) r5
            java.lang.String r7 = r1.A02
            r9 = 0
            r8 = 2131888383(0x7f1208ff, float:1.94114E38)
            r6 = 0
            r10 = r9
            r5.A01(r6, r7, r8, r9, r10)
            X.8qC r3 = r4.A04
            X.5hb r2 = X.C86644Kx.A0c(r3)
            java.lang.String r1 = "is_auto_crosspost"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A06(r1, r0)
            X.5hb r2 = X.C86644Kx.A0c(r3)
            X.8qC r0 = r4.A01
            X.2rK r1 = X.C86654Ky.A0g(r0)
            X.21S r0 = X.C106955aR.A05
            X.C111135hb.A00(r1, r0, r2)
            X.5hb r1 = X.C86644Kx.A0c(r3)
            java.lang.String r0 = "TAP_NOT_NOW"
            r1.A04(r0)
            X.8qC r0 = r4.A02
            java.lang.Object r1 = r0.get()
            X.5Tr r1 = (X.C105125Tr) r1
            r0 = 1
            r1.A02(r0)
            return
        L_0x0212:
            java.lang.Object r0 = r1.A00
            com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment) r0
            X.5Jc r5 = r0.A02
            boolean r4 = r0.A01
            X.5aR r2 = r5.A01
            X.8qC r0 = r2.A01
            X.2rK r1 = X.C86654Ky.A0g(r0)
            X.21S r0 = X.C106955aR.A05
            r1.A04(r0, r4)
            X.8qC r3 = r2.A04
            X.5hb r2 = X.C86644Kx.A0c(r3)
            java.lang.String r1 = "is_auto_crosspost"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A06(r1, r0)
            X.5hb r1 = X.C86644Kx.A0c(r3)
            java.lang.String r0 = "TAP_SHARE_NOW"
            r1.A05(r0)
            X.66Q r1 = r5.A00
            java.util.List r0 = r5.A03
            r1.BZU(r0)
            return
        L_0x0247:
            java.lang.Object r4 = r1.A00
            com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment r4 = (com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment) r4
            X.5Iu r0 = r4.A00
            X.5aR r0 = r0.A01
            X.8qC r3 = r0.A04
            X.5hb r2 = X.C86644Kx.A0c(r3)
            X.8qC r0 = r0.A01
            X.2rK r1 = X.C86654Ky.A0g(r0)
            X.21S r0 = X.C106955aR.A05
            X.C111135hb.A00(r1, r0, r2)
            X.5hb r1 = X.C86644Kx.A0c(r3)
            java.lang.String r0 = "TAP_NOT_NOW"
            r1.A04(r0)
            r4.A1K()
            return
        L_0x026d:
            java.lang.Object r0 = r1.A00
            com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment) r0
            X.5Iu r2 = r0.A00
            X.5aR r0 = r2.A01
            X.8qC r0 = r0.A04
            X.5hb r1 = X.C86644Kx.A0c(r0)
            java.lang.String r0 = "TAP_SHARE_NOW"
            r1.A05(r0)
            X.66Q r1 = r2.A00
            java.util.List r0 = r2.A02
            r1.BZU(r0)
            return
        L_0x0288:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 27
            X.C621433s.A00(r1, r0)
            return
        L_0x0292:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 26
            X.C621433s.A00(r1, r0)
            return
        L_0x029c:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
            return
        L_0x02a4:
            java.lang.Object r5 = r1.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment$DiscardChangesConfirmationDialogFragment r5 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.DiscardChangesConfirmationDialogFragment) r5
            java.lang.ref.WeakReference r0 = r5.A04
            java.lang.Object r1 = r0.get()
            X.65f r1 = (X.C1226565f) r1
            if (r1 == 0) goto L_0x02b7
            X.5de r0 = r5.A01
            r1.BcV(r0)
        L_0x02b7:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0328
            X.5de r0 = r5.A01
            boolean r4 = r0.A03
            X.5hb r3 = r5.A03
            java.lang.Boolean r1 = X.C18320x8.A0V(r4)
            java.lang.String r0 = "initial_auto_setting"
            r3.A06(r0, r1)
            java.lang.String r1 = "final_auto_setting"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.A06(r1, r0)
            java.lang.String r0 = "TAP_CHANGES_SAVE"
            r3.A05(r0)
            X.1VX r2 = r5.A02
            X.2vE r1 = X.C58422vE.A01
            r0 = 5584(0x15d0, float:7.825E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x02eb
            X.2rK r1 = r5.A02
            X.21S r0 = com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A0K
            r1.A04(r0, r4)
        L_0x02eb:
            r3.A01()
            r0 = 1
            r5.A00 = r0
            goto L_0x0328
        L_0x02f2:
            java.lang.Object r5 = r1.A00
            com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment r5 = (com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment) r5
            X.33e r0 = r5.A03
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x031b
            X.33e r0 = r5.A03
            r4 = 0
            r3 = 0
            r0.A0E(r3, r4)
            X.4FS r2 = r5.A04
            r1 = 17
            X.5sF r0 = new X.5sF
            r0.<init>(r5, r1)
            r2.BkM(r0)
            X.2gy r1 = r5.A01
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = new com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            r0.<init>(r3, r4)
            r1.A02(r0)
        L_0x031b:
            X.03q r1 = r5.A0Q()
            boolean r0 = r1 instanceof X.C1226365d
            if (r0 == 0) goto L_0x0328
            X.65d r1 = (X.C1226365d) r1
            r1.BcW()
        L_0x0328:
            r5.A1K()
            return
        L_0x032c:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 17
            X.C621433s.A00(r1, r0)
            return
        L_0x0336:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = 1
            r1.A7E(r0)
            r0 = 17
            X.C621433s.A00(r1, r0)
            return
        L_0x0344:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A00(r1, r0)
            r1.A76()
            return
        L_0x0351:
            java.lang.Object r2 = r1.A00
            X.4el r2 = (X.C89704el) r2
            X.4FS r1 = r2.A04
            r0 = 19
            X.C71293bs.A00(r1, r2, r0)
            return
        L_0x035d:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName r1 = (com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName) r1
            r1.A7D()
            r0 = 1
            X.C621433s.A00(r1, r0)
            return
        L_0x0369:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            r2.dismiss()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.backup.google.SettingsGoogleDrive"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0381:
            java.lang.Object r5 = r1.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r5 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r5
            r4 = 16
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r3 = r5.A07
            java.lang.String r0 = "NewDeviceConfirmationRegistrationViewModel/onRegistrationTimedOutDialogClick"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2s5 r2 = r3.A0G
            java.lang.String r1 = "device_confirm"
            java.lang.String r0 = "ad_timeout"
            r2.A04(r1, r0)
            r3.A0E()
            X.C621433s.A00(r5, r4)
            return
        L_0x039e:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r1 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r1
            r0 = 11
            X.C621433s.A00(r1, r0)
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r2 = r1.A07
            X.4UC r1 = r2.A0H
            r0 = 2
            X.C06270Wx.A04(r1, r0)
            X.2hq r3 = r2.A0F
            java.lang.String r6 = r2.A00
            X.C626936e.A06(r6)
            java.lang.String r5 = r2.A01
            X.C626936e.A06(r5)
            r0 = 1
            X.6Bj r4 = new X.6Bj
            r4.<init>(r2, r0)
            X.4FS r0 = r3.A07
            r7 = 7
            X.3aa r2 = new X.3aa
            r2.<init>(r3, r4, r5, r6, r7)
            r0.BkM(r2)
            return
        L_0x03cd:
            java.lang.Object r3 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r3 = (com.whatsapp.registration.VerifyPhoneNumber) r3
            X.2s5 r2 = r3.A14
            java.lang.String r1 = r3.A78()
            java.lang.String r0 = "ad_timeout"
            r2.A04(r1, r0)
            r0 = 45
            X.C621433s.A00(r3, r0)
            r3.A7L()
            return
        L_0x03e5:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r4 = (com.whatsapp.registration.VerifyPhoneNumber) r4
            r0 = 28
            X.C621433s.A00(r4, r0)
            r0 = 0
            r4.A7Z(r0)
            X.317 r1 = r4.A0w
            r0 = 1
            r1.A0B(r0, r0)
            java.lang.String r3 = r4.A1E
            if (r3 != 0) goto L_0x03fe
            java.lang.String r3 = ""
        L_0x03fe:
            r0 = 0
            r4.A1E = r0
            X.2hd r2 = r4.A0i
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "verify-tmg "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            r2.A01(r4, r0)
            return
        L_0x0411:
            java.lang.Object r2 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r2 = (com.whatsapp.registration.VerifyPhoneNumber) r2
            r0 = 31
            X.C621433s.A00(r2, r0)
            X.2nM r1 = r2.A0d
            java.lang.String r0 = "how-to-register"
            r1.A01(r2, r0)
            return
        L_0x0422:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r4 = (com.whatsapp.registration.VerifyPhoneNumber) r4
            r0 = 27
            X.C621433s.A00(r4, r0)
            r0 = 0
            r4.A7Z(r0)
            X.317 r1 = r4.A0w
            r0 = 1
            r1.A0B(r0, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "+"
            r1.append(r0)
            java.lang.String r0 = r4.A1B
            r1.append(r0)
            java.lang.String r0 = r4.A1E
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)
            r0 = 0
            r4.A1E = r0
            X.2hd r2 = r4.A0i
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "verify-tma "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            r2.A01(r4, r0)
            return
        L_0x045c:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 4
            X.C621433s.A00(r1, r0)
            return
        L_0x0465:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 8
            X.C621433s.A00(r1, r0)
            return
        L_0x046f:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 7
            X.C621433s.A00(r1, r0)
            return
        L_0x0478:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 6
            X.C621433s.A00(r1, r0)
            return
        L_0x0481:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            X.C621433s.A00(r1, r0)
            return
        L_0x048a:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            X.C621433s.A00(r1, r0)
            return
        L_0x0493:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r4 = (com.whatsapp.registration.VerifyCaptcha) r4
            r0 = 7
            X.C621433s.A00(r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 43
            r1.append(r0)
            java.lang.String r0 = r4.A0W
            if (r0 != 0) goto L_0x04af
            java.lang.String r0 = "countryCode"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04af:
            r1.append(r0)
            java.lang.String r0 = r4.A0X
            if (r0 != 0) goto L_0x04bd
            java.lang.String r0 = "phoneNumber"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04bd:
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)
            X.2hd r2 = r4.A0L
            if (r2 == 0) goto L_0x04d3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "verify-captcha "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            r2.A01(r4, r0)
            return
        L_0x04d3:
            java.lang.String r0 = "feedbackSendMethods"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04da:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            X.C621433s.A00(r1, r0)
            return
        L_0x04e3:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r1 = (com.whatsapp.registration.VerifyCaptcha) r1
            r0 = 3
            X.C621433s.A00(r1, r0)
            com.whatsapp.CodeInputField r1 = r1.A0D
            if (r1 != 0) goto L_0x04f6
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04f6:
            r0 = 1
            r1.setImportantForAccessibility(r0)
            return
        L_0x04fb:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r0 = (com.whatsapp.registration.VerifyCaptcha) r0
            r1 = 1
            X.C621433s.A00(r0, r1)
            com.whatsapp.CodeInputField r0 = r0.A0D
            if (r0 != 0) goto L_0x050e
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x050e:
            r0.setImportantForAccessibility(r1)
            return
        L_0x0512:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 8
            X.C621433s.A00(r1, r0)
            return
        L_0x051c:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r1 = (com.whatsapp.registration.VerifyCaptcha) r1
            r0 = 7
            X.C621433s.A00(r1, r0)
            r1.A78()
            return
        L_0x0528:
            java.lang.Object r3 = r1.A00
            com.whatsapp.registration.SendSmsToWa r3 = (com.whatsapp.registration.SendSmsToWa) r3
            r2 = 1
            android.content.SharedPreferences r0 = r3.A74()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "send_sms_intent_triggered"
            X.C18270x1.A0l(r1, r0, r2)
            r0 = 0
            r3.A78(r0)
            return
        L_0x0540:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.SendSmsToWa r1 = (com.whatsapp.registration.SendSmsToWa) r1
            java.lang.String r0 = "SendSmsToWa/wrong number tapped, reset state and direct to enter phone"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A76()
            return
        L_0x054d:
            java.lang.Object r2 = r1.A00
            com.whatsapp.registration.SendSmsToWa r2 = (com.whatsapp.registration.SendSmsToWa) r2
            android.content.SharedPreferences r1 = r2.A74()
            java.lang.String r0 = "send_sms_number"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            if (r0 == 0) goto L_0x0561
            r2.A79(r0)
            return
        L_0x0561:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()
            throw r0
        L_0x0566:
            java.lang.Object r2 = r1.A00
            com.whatsapp.registration.SelectPhoneNumberDialog r2 = (com.whatsapp.registration.SelectPhoneNumberDialog) r2
            java.lang.String r0 = "SelectPhoneNumberDialog/no-phone-number-selected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8jS r0 = r2.A01
            if (r0 == 0) goto L_0x057e
            X.4z3 r0 = (X.C97674z3) r0
            X.5Wv r1 = r0.A0B
            X.5Kb r0 = r0.A0I
            android.widget.EditText r0 = r0.A03
            r1.A03(r0)
        L_0x057e:
            r2.A1K()
            return
        L_0x0582:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "RegistrationUtils/createCannotConnectDialog/dialog/cant-connect/button/cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 109(0x6d, float:1.53E-43)
            X.C621433s.A00(r1, r0)
            return
        L_0x0591:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 604(0x25c, float:8.46E-43)
            X.C621433s.A00(r1, r0)
            return
        L_0x059b:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 125(0x7d, float:1.75E-43)
            X.C621433s.A00(r1, r0)
            return
        L_0x05a5:
            java.lang.Object r1 = r1.A00
            X.4z3 r1 = (X.C97674z3) r1
            r0 = 0
            r1.A76(r0)
            r0 = 21
            X.C621433s.A00(r1, r0)
            return
        L_0x05b3:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterPhone r0 = (com.whatsapp.registration.RegisterPhone) r0
            java.lang.String r1 = "RegisterPhone/createNumberConfirmationDialog/ok"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            int r2 = X.C97674z3.A0e
            r1 = 2
            if (r2 != r1) goto L_0x063d
            java.lang.String r1 = "RegisterPhone/retryExistCall"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1VW r2 = r0.A0C
            r1 = 3186(0xc72, float:4.465E-42)
            float r2 = r2.A0L(r1)
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r1
            long r1 = (long) r2
            long r3 = r0.A03
            long r1 = r1 + r3
            X.2sH r3 = r0.A06
            long r3 = r3.A0H()
            long r1 = r1 - r3
            long r20 = X.C97674z3.A0f
            X.2sH r6 = r0.A06
            java.lang.String r16 = X.C97674z3.A0g
            X.C626936e.A06(r16)
            java.lang.String r17 = X.C97674z3.A0h
            X.C626936e.A06(r17)
            X.2oU r7 = r0.A09
            int r5 = r0.A00
            java.lang.String r4 = X.C97674z3.A0g
            java.lang.String r3 = X.C97674z3.A0h
            java.lang.String r18 = r0.A7C(r4, r3, r5)
            X.5OP r3 = r0.A0m
            org.json.JSONObject r19 = r3.A00()
            X.2nR r11 = r0.A0F
            X.2rU r10 = r0.A0D
            X.1VW r9 = r0.A0C
            X.7aX r13 = r0.A0O
            X.5Uf r14 = r0.A0T
            X.33p r8 = r0.A09
            X.2sl r12 = r0.A0L
            X.5ol r15 = new X.5ol
            r15.<init>(r0)
            X.55h r5 = new X.55h
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.A0U = r5
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "RegisterPhone/retryExistCall/check device switching eligibility again, delay: "
            X.C18260x0.A12(r3, r4, r1)
            r4 = 0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            X.4FS r5 = r0.A04
            if (r3 <= 0) goto L_0x0637
            r3 = 40
            X.3Zp r4 = new X.3Zp
            r4.<init>(r0, r3)
            java.lang.String r3 = "RegisterPhone/retry-exist"
            r5.Bkn(r4, r3, r1)
        L_0x0633:
            r0.Bp8()
            return
        L_0x0637:
            X.55h r1 = r0.A0U
            X.C86614Ku.A1R(r1, r5)
            goto L_0x0633
        L_0x063d:
            r1 = 0
            r0.A7K(r1)
            return
        L_0x0642:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            r1.A79()
            r0 = 1
            X.C621433s.A00(r1, r0)
            return
        L_0x064e:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            X.C621433s.A00(r1, r0)
            return
        L_0x0657:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
            X.C621433s.A00(r1, r0)
            return
        L_0x0660:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 22
            X.C621433s.A00(r1, r0)
            return
        L_0x066a:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.EULA r1 = (com.whatsapp.registration.EULA) r1
            r0 = 8
            X.C621433s.A00(r1, r0)
            r0 = 0
            r1.A00 = r0
            return
        L_0x0677:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 7
            X.C621433s.A01(r1, r0)
            return
        L_0x0680:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.EULA r1 = (com.whatsapp.registration.EULA) r1
            r0 = 6
            X.C621433s.A00(r1, r0)
            boolean r0 = X.C627236i.A0C()
            if (r0 == 0) goto L_0x0694
            r0 = 8
            X.C621433s.A01(r1, r0)
            return
        L_0x0694:
            r0 = 0
            r1.A00 = r0
            return
        L_0x0698:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            X.C621433s.A01(r1, r0)
            return
        L_0x06a1:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            X.C621433s.A00(r1, r0)
            return
        L_0x06aa:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            X.C621433s.A00(r1, r0)
            return
        L_0x06b3:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 9
            X.C621433s.A00(r1, r0)
            return
        L_0x06bd:
            java.lang.Object r1 = r1.A00
            com.whatsapp.profile.SetAboutInfo r1 = (com.whatsapp.profile.SetAboutInfo) r1
            r0 = 3
            X.C621433s.A00(r1, r0)
            java.util.ArrayList r0 = com.whatsapp.profile.SetAboutInfo.A0A
            r0.clear()
            r1.A74()
            X.4OK r0 = r1.A04
            r0.notifyDataSetChanged()
            X.2on r1 = r1.A05
            r0 = 5
            r1.A00(r0)
            return
        L_0x06d9:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A00(r1, r0)
            return
        L_0x06e3:
            java.lang.Object r2 = r1.A00
            com.whatsapp.notification.PopupNotification r2 = (com.whatsapp.notification.PopupNotification) r2
            X.2sq r1 = r2.A0P
            X.3ZH r0 = r2.A0q
            com.whatsapp.jid.UserJid r0 = X.C86604Kt.A0d(r0)
            r1.A0G(r2, r0)
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A00(r2, r0)
            return
        L_0x06f8:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = (com.whatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A1O()
            return
        L_0x0700:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 6
            X.C621433s.A00(r1, r0)
            return
        L_0x0709:
            java.lang.Object r0 = r1.A00
            X.4VM r0 = (X.AnonymousClass4VM) r0
            r0.A0D()
            return
        L_0x0711:
            java.lang.Object r0 = r1.A00
            X.4VM r0 = (X.AnonymousClass4VM) r0
            X.4UC r1 = r0.A03
            r0 = 0
            X.C06270Wx.A04(r1, r0)
            return
        L_0x071c:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            X.C621433s.A00(r1, r0)
            return
        L_0x0725:
            java.lang.Object r0 = r1.A00
            X.653 r0 = (X.AnonymousClass653) r0
            r0.Ayt()
            r2.dismiss()
            return
        L_0x0730:
            java.lang.Object r0 = r1.A00
            X.653 r0 = (X.AnonymousClass653) r0
            r2.dismiss()
            r0.Ayt()
            r2.dismiss()
            return
        L_0x073e:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 4
            X.C621433s.A00(r1, r0)
            return
        L_0x0747:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 8
            X.C621433s.A00(r1, r0)
            return
        L_0x0751:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 7
            X.C621433s.A00(r1, r0)
            return
        L_0x075a:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 6
            X.C621433s.A00(r1, r0)
            return
        L_0x0763:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            X.C621433s.A00(r1, r0)
            return
        L_0x076c:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            X.C621433s.A00(r1, r0)
            return
        L_0x0775:
            java.lang.Object r3 = r1.A00
            X.4fP r3 = (X.C89864fP) r3
            X.66e r2 = r3.A0Z
            X.6AB r2 = (X.AnonymousClass6AB) r2
            int r0 = r2.A01
            if (r0 == 0) goto L_0x0789
            r1 = 1
            java.lang.Object r0 = r2.A00
            X.5l7 r0 = (X.C113245l7) r0
            r0.A2J(r1)
        L_0x0789:
            X.07r r1 = r3.A03
            r0 = 17
            X.C621433s.A00(r1, r0)
            return
        L_0x0791:
            java.lang.Object r0 = r1.A00
            X.4fP r0 = (X.C89864fP) r0
            X.07r r1 = r0.A03
            r0 = 12
            X.C621433s.A00(r1, r0)
            return
        L_0x079d:
            java.lang.Object r0 = r1.A00
            X.4fP r0 = (X.C89864fP) r0
            X.07r r1 = r0.A03
            r0 = 9
            X.C621433s.A00(r1, r0)
            return
        L_0x07a9:
            java.lang.Object r4 = r1.A00
            X.4fP r4 = (X.C89864fP) r4
            X.07r r3 = r4.A03
            r0 = 9
            X.C621433s.A00(r3, r0)
            X.3Lo r1 = r4.A0U
            X.4uZ r0 = r4.A0o
            X.3ZH r0 = r1.A01(r0)
            java.lang.String r2 = X.AnonymousClass36P.A02(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "tel:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r2 = "android.intent.action.DIAL"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r3.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x07d9 }
            goto L_0x07df
        L_0x07d9:
            X.3Wi r0 = r4.A0A
            X.C86654Ky.A1J(r0)
            return
        L_0x07df:
            return
        L_0x07e0:
            java.lang.Object r0 = r1.A00
            X.4fP r0 = (X.C89864fP) r0
            X.07r r1 = r0.A03
            r0 = 8
            X.C621433s.A00(r1, r0)
            return
        L_0x07ec:
            java.lang.Object r0 = r1.A00
            X.4fP r0 = (X.C89864fP) r0
            X.07r r1 = r0.A03
            r0 = 7
            X.C621433s.A00(r1, r0)
            return
        L_0x07f7:
            java.lang.Object r0 = r1.A00
            X.4fP r0 = (X.C89864fP) r0
            X.07r r1 = r0.A03
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            X.C86654Ky.A0v(r1, r0)
            r0 = 2
            X.C621433s.A00(r1, r0)
            return
        L_0x0807:
            java.lang.Object r0 = r1.A00
            X.4fP r0 = (X.C89864fP) r0
            X.07r r1 = r0.A03
            r0 = 17
            X.C621433s.A00(r1, r0)
            return
        L_0x0813:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            android.content.Intent r0 = X.C627736r.A03(r1)
            r1.startActivity(r0)
            return
        L_0x081f:
            java.lang.Object r4 = r1.A00
            com.whatsapp.conversationslist.SmsDefaultAppWarning r4 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r4
            r0 = 1
            X.C621433s.A00(r4, r0)
            X.2fa r3 = r4.A00
            android.content.Intent r0 = r4.getIntent()
            android.net.Uri r2 = r0.getData()
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "sms_body"
            java.lang.String r1 = r1.getStringExtra(r0)
            r0 = 0
            r3.A00(r4, r2, r0, r1)
            r4.finish()
            return
        L_0x0843:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.SmsDefaultAppWarning r1 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r1
            r0 = 1
            X.C621433s.A00(r1, r0)
            r1.A74()
            r1.finish()
            return
        L_0x0852:
            java.lang.Object r4 = r1.A00
            com.whatsapp.conversationslist.SmsDefaultAppWarning r4 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r4
            r0 = 0
            X.C621433s.A00(r4, r0)
            X.2fa r3 = r4.A00
            android.content.Intent r0 = r4.getIntent()
            android.net.Uri r2 = r0.getData()
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "sms_body"
            java.lang.String r1 = r1.getStringExtra(r0)
            r0 = 0
            r3.A00(r4, r2, r0, r1)
            r4.finish()
            return
        L_0x0876:
            java.lang.Object r2 = r1.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "smsdefaultappwarning/reset"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            java.lang.String r0 = "com.whatsapp"
            r1.clearPackagePreferredActivities(r0)
            r2.finish()
            return
        L_0x088c:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.SmsDefaultAppWarning r1 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r1
            r0 = 0
            X.C621433s.A00(r1, r0)
            r1.A74()
            r1.finish()
            return
        L_0x089b:
            java.lang.Object r2 = r1.A00
            X.5l7 r2 = (X.C113245l7) r2
            X.2hj r1 = r2.A5O
            r0 = 1
            r1.A01(r0)
            X.676 r4 = r2.A2z
            X.4eZ r0 = r4.getActivity()
            r3 = 0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.greenalert.GreenAlertActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "page"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x08c2:
            java.lang.Object r0 = r1.A00
            X.5l7 r0 = (X.C113245l7) r0
            X.2nM r2 = r0.A2Y
            java.lang.String r1 = "channels_update_edit"
            X.4eZ r0 = X.C113245l7.A09(r0)
            r2.A01(r0, r1)
            return
        L_0x08d2:
            java.lang.Object r3 = r1.A00
            X.5l7 r3 = (X.C113245l7) r3
            X.3Lk r1 = r3.A5J
            java.lang.String r0 = "6614640168569481"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.5hX r1 = r3.A12
            X.4eZ r0 = X.C113245l7.A09(r3)
            r1.A0A(r0, r2)
            return
        L_0x08f1:
            java.lang.Object r0 = r1.A00
            X.68K r0 = (X.AnonymousClass68K) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.conversation.ConversationAttachmentContentView r0 = (com.whatsapp.conversation.ConversationAttachmentContentView) r0
            r0.A05()
            return
        L_0x08fd:
            java.lang.Object r0 = r1.A00
            X.33p r0 = (X.AnonymousClass33p) r0
            r3 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "forward_with_captions_nux_shown"
            X.C18270x1.A0l(r1, r0, r3)
            r2.dismiss()
            return
        L_0x090f:
            java.lang.Object r4 = r1.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            android.content.Intent r3 = X.C18320x8.A07()
            X.3ZH r0 = r4.A1q
            java.lang.String r1 = X.AnonymousClass3ZH.A08(r0)
            java.lang.String r0 = "contact"
            r3.putExtra(r0, r1)
            android.os.Bundle r0 = r4.A1K()
            java.lang.String r2 = "message_row_id"
            long r0 = r0.getLong(r2)
            r3.putExtra(r2, r0)
            X.5hx r0 = r4.A19
            r0.A03(r3)
            X.03q r1 = r4.A0Q()
            r0 = 3
            X.C621433s.A00(r1, r0)
            X.C111355hx.A01(r4)
            return
        L_0x0940:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r1 = r0.A0Q()
            r0 = 3
            X.C621433s.A00(r1, r0)
            return
        L_0x094d:
            java.lang.Object r4 = r1.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            android.content.Intent r3 = X.C18320x8.A07()
            r2 = 1
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r2)
            X.3ZH r0 = r4.A1q
            java.lang.String r0 = X.AnonymousClass3ZH.A08(r0)
            r1.add(r0)
            java.lang.String r0 = "jids"
            r3.putStringArrayListExtra(r0, r1)
            android.os.Bundle r0 = r4.A1K()
            java.lang.String r1 = "file_path"
            java.lang.String r0 = r0.getString(r1)
            r3.putExtra(r1, r0)
            X.5hx r0 = r4.A19
            r0.A03(r3)
            X.03q r1 = r4.A0Q()
            r0 = 2
            X.C621433s.A00(r1, r0)
            X.2X4 r1 = r4.A2U
            r0 = 0
            r1.A00(r0, r2)
            X.C111355hx.A01(r4)
            return
        L_0x098c:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r1 = r0.A0Q()
            r0 = 2
            X.C621433s.A00(r1, r0)
            return
        L_0x0999:
            java.lang.Object r2 = r1.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.03q r1 = r2.A0Q()
            r0 = 1
            X.C621433s.A00(r1, r0)
            r0 = 0
            r2.A1t(r0)
            return
        L_0x09aa:
            java.lang.Object r1 = r1.A00
            X.5O6 r1 = (X.AnonymousClass5O6) r1
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            r2.dismiss()
            X.2ch r0 = r1.A04
            if (r0 == 0) goto L_0x09bd
            r0.A00()
            return
        L_0x09bd:
            X.2qh r0 = r1.A03
            r0.A02()
            return
        L_0x09c3:
            java.lang.Object r0 = r1.A00
            X.5O6 r0 = (X.AnonymousClass5O6) r0
            boolean r1 = X.C18290x4.A1W(r2)
            r2.dismiss()
            android.app.Activity r0 = r0.A00
            r0.setResult(r1)
            r0.finish()
            return
        L_0x09d7:
            java.lang.Object r3 = r1.A00
            X.4el r3 = (X.C89704el) r3
            r2.dismiss()
            X.4FS r2 = r3.A04
            r1 = 48
            X.3Zi r0 = new X.3Zi
            r0.<init>(r3, r1)
            r2.BkM(r0)
            return
        L_0x09eb:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x09f3:
            java.lang.Object r0 = r1.A00
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r0 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r0
            X.4Uq r1 = r0.A05
            java.lang.String r0 = "OptInWebBeta/OptIn-Out_Confirmation_Clicked"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1.A0D()
            return
        L_0x0a02:
            java.lang.Object r0 = r1.A00
            X.AnonymousClass0x9.A1K(r0)
            return
        L_0x0a08:
            java.lang.Object r4 = r1.A00
            com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog r4 = (com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog) r4
            int r1 = r4.A00
            android.content.DialogInterface$OnClickListener r0 = r4.A01
            com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeContinueUnlockClearDialog r3 = new com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeContinueUnlockClearDialog
            r3.<init>(r0, r1)
            X.0df r1 = r4.A0U()
            java.lang.String r0 = "continue"
            r3.A1S(r1, r0)
            r2.dismiss()
            return
        L_0x0a22:
            java.lang.Object r4 = r1.A00
            com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity r4 = (com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity) r4
            r3 = 1
            X.5To r1 = r4.A75()
            X.62q r0 = new X.62q
            r0.<init>(r4, r3)
            r1.A02(r0)
            r2.dismiss()
            return
        L_0x0a37:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 4
            X.C621433s.A00(r1, r0)
            return
        L_0x0a40:
            java.lang.Object r6 = r1.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r6 = (com.whatsapp.chatinfo.ListChatInfoActivity) r6
            r0 = 6
            X.C621433s.A00(r6, r0)
            X.3ZH r5 = r6.A0S
            X.33A r4 = r6.A0W
            X.1fI r3 = r6.A7G()
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = X.AnonymousClass3ZH.A05(r5, r0)
            r1 = 0
            boolean r0 = X.AnonymousClass0x2.A1Y(r3, r2)
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            r0[r1] = r2
            java.util.List r1 = X.AnonymousClass8UF.A0p(r0)
            X.3Lq r0 = r4.A0C
            r0.A0Q(r3, r1)
            java.util.ArrayList r0 = r6.A0j
            r0.remove(r5)
            r6.A7J()
            r6.A7N()
            return
        L_0x0a74:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 6
            X.C621433s.A00(r1, r0)
            return
        L_0x0a7d:
            java.lang.Object r2 = r1.A00
            com.whatsapp.chatinfo.ChatMediaVisibilityDialog r2 = (com.whatsapp.chatinfo.ChatMediaVisibilityDialog) r2
            r1 = 2
            r0 = 1
            r3 = r24
            if (r3 == r0) goto L_0x0a8a
            if (r3 == r1) goto L_0x0a8d
            r1 = 0
        L_0x0a8a:
            r2.A01 = r1
            return
        L_0x0a8d:
            r2.A01 = r0
            return
        L_0x0a90:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            X.C621433s.A00(r1, r0)
            return
        L_0x0a99:
            java.lang.Object r1 = r1.A00
            com.whatsapp.calling.callhistory.CallLogActivity r1 = (com.whatsapp.calling.callhistory.CallLogActivity) r1
            r0 = 1
            X.C621433s.A00(r1, r0)
            r0 = 0
            r1.A79(r0)
            return
        L_0x0aa6:
            java.lang.Object r1 = r1.A00
            com.whatsapp.calling.callhistory.CallLogActivity r1 = (com.whatsapp.calling.callhistory.CallLogActivity) r1
            r0 = 1
            X.C621433s.A00(r1, r0)
            r1.A79(r0)
            return
        L_0x0ab2:
            java.lang.Object r0 = r1.A00
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r0 = r0.A09
            X.5iG r1 = r0.A0N
            r5 = 1
            r6 = 37
            java.lang.Integer r2 = X.C105085Tn.A00(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r7 = r5
            r1.A09(r2, r3, r4, r5, r6, r7)
            X.5Xb r5 = r0.A0X
            X.7WI r4 = r5.A05
            java.util.List r3 = r4.A00()
            r3.clear()
            X.5QW r2 = r4.A00
            X.4FS r1 = r2.A04
            r0 = 39
            X.C18290x4.A1M(r1, r2, r3, r0)
            java.util.List r1 = r4.A00()
            X.08M r0 = r5.A00
            r0.A0H(r1)
            return
        L_0x0ae8:
            java.lang.Object r0 = r1.A00
            com.whatsapp.blockui.BlockConfirmationDialogFragment r0 = (com.whatsapp.blockui.BlockConfirmationDialogFragment) r0
            X.2gj r3 = r0.A06
            java.lang.String r2 = r0.A0A
            com.whatsapp.jid.UserJid r1 = r0.A08
            X.C18260x0.A0O(r2, r1)
            r0 = 2
            r3.A00(r1, r2, r0)
            return
        L_0x0afa:
            java.lang.Object r5 = r1.A00
            com.whatsapp.audiopicker.AudioPickerActivity r5 = (com.whatsapp.audiopicker.AudioPickerActivity) r5
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.LinkedHashMap r0 = r5.A0R
            java.util.Iterator r3 = X.C18290x4.A10(r0)
        L_0x0b08:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b21
            java.lang.Object r0 = r3.next()
            X.5Kq r0 = (X.C102885Kq) r0
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            int r0 = r0.A00
            long r0 = (long) r0
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r2, r0)
            r4.add(r0)
            goto L_0x0b08
        L_0x0b21:
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "result_uris"
            r1.putParcelableArrayListExtra(r0, r4)
            X.AnonymousClass0x2.A0m(r5, r1)
            X.5U6 r1 = r5.A0F
            r0 = 7
            r1.A03(r0)
            return
        L_0x0b34:
            java.lang.Object r1 = r1.A00
            X.5LL r1 = (X.AnonymousClass5LL) r1
            X.4FV r10 = r1.A05
            X.36Y r9 = r1.A04
            X.30N r11 = r1.A06
            java.util.Set r14 = r1.A0C
            X.2hp r12 = r1.A09
            X.2Yl r13 = r1.A0A
            X.2cd r7 = r1.A08
            X.33m r8 = r1.A03
            X.64F r6 = r1.A02
            X.65x r5 = r1.A01
            X.4uZ r4 = r1.A07
            boolean r0 = r1.A0D
            java.lang.Integer r3 = r1.A0B
            int r1 = r1.A00
            r15 = 1
            X.AnonymousClass5ZW.A02(r9, r10, r11, r12, r13, r14, r15)
            r8.A0Z(r14, r0)
            r8 = 4
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0b6e
            int r0 = r7.A00
            if (r0 != r8) goto L_0x0b6e
            r0 = 5
            r7.A00 = r0
            r0 = 2
            if (r1 < r15) goto L_0x0b6b
            r0 = 4
        L_0x0b6b:
            r7.A00(r0)
        L_0x0b6e:
            r6.BQn()
            if (r3 == 0) goto L_0x0b7a
            int r0 = r3.intValue()
            r5.Bbc(r4, r0)
        L_0x0b7a:
            r2.dismiss()
            return
        L_0x0b7e:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r2.dismiss()
            r0.finish()
            return
        L_0x0b89:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.fragment.OpenLinkDialogFragment r1 = (com.whatsapp.status.playback.fragment.OpenLinkDialogFragment) r1
            X.66G r0 = r1.A04
            if (r0 == 0) goto L_0x0b94
            r0.BR6()
        L_0x0b94:
            r1.A1K()
            return
        L_0x0b98:
            java.lang.Object r0 = r1.A00
            X.64H r0 = (X.AnonymousClass64H) r0
            r0.BZn()
            return
        L_0x0ba0:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 500(0x1f4, float:7.0E-43)
            X.C621433s.A00(r1, r0)
            return
        L_0x0baa:
            java.lang.Object r0 = r1.A00
            X.65x r0 = (X.C1228165x) r0
            r0.BZn()
            return
        L_0x0bb2:
            X.4fP r0 = (X.C89864fP) r0
            X.07r r1 = r0.A03
            r0 = 0
        L_0x0bb7:
            X.C621433s.A00(r1, r0)
            return
        L_0x0bbb:
            java.lang.String r4 = "meta-avatar"
            goto L_0x0c3b
        L_0x0bbe:
            X.5ZD r2 = r5.A0F
            X.03q r0 = r5.A0R()
            java.lang.ref.WeakReference r1 = X.AnonymousClass0x9.A14(r0)
            java.lang.String r0 = "sticker_info_dialog"
            r2.A04(r0, r1)
            return
        L_0x0bce:
            boolean r0 = r5.A1W()
            if (r0 != 0) goto L_0x0be8
            X.2pQ r1 = r5.A0B
            X.5LB r0 = r5.A0M
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0be8
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0be8
            X.4xh r0 = r5.A0N
            r0.A08()
            return
        L_0x0be8:
            X.5LB r1 = r5.A0M
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0c0a
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x0c0a
            X.03q r0 = r5.A0Q()
            boolean r0 = r0 instanceof X.AnonymousClass67A
            if (r0 == 0) goto L_0x0c37
            boolean r0 = r5.A1W()
            if (r0 != 0) goto L_0x0c37
            X.4xh r1 = r5.A0N
            X.5LB r0 = r5.A0M
            java.lang.String r0 = r0.A00
            r1.A0A(r0)
            return
        L_0x0c0a:
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x0c2d
            X.5hX r4 = r5.A08     // Catch:{ ActivityNotFoundException -> 0x0c27 }
            android.content.Context r3 = r5.A1D()     // Catch:{ ActivityNotFoundException -> 0x0c27 }
            java.lang.String r2 = "android.intent.action.VIEW"
            X.5LB r0 = r5.A0M     // Catch:{ ActivityNotFoundException -> 0x0c27 }
            java.lang.String r0 = r0.A03     // Catch:{ ActivityNotFoundException -> 0x0c27 }
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ ActivityNotFoundException -> 0x0c27 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0c27 }
            r0.<init>(r2, r1)     // Catch:{ ActivityNotFoundException -> 0x0c27 }
            r4.A0A(r3, r0)     // Catch:{ ActivityNotFoundException -> 0x0c27 }
            return
        L_0x0c27:
            java.lang.String r0 = "StickerInfoDialogFragment/onClickListener failed to open playstore link"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0c2d:
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0c39
            X.39M r0 = r5.A0H
            r5.A1V(r0, r1)
            return
        L_0x0c37:
            X.5LB r1 = r5.A0M
        L_0x0c39:
            java.lang.String r4 = r1.A00
        L_0x0c3b:
            android.content.Context r0 = r5.A1D()
            java.lang.String r3 = "info_dialog"
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "sticker_pack_id"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "sticker_pack_preview_source"
            r2.putExtra(r0, r3)
            r5.A0m(r2)
            return
        L_0x0c5c:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.fragment.OpenLinkDialogFragment r1 = (com.whatsapp.status.playback.fragment.OpenLinkDialogFragment) r1
            X.66G r0 = r1.A04
            if (r0 == 0) goto L_0x0c67
            r0.BR6()
        L_0x0c67:
            r1.A1L()
            return
        L_0x0c6b:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment r3 = (com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment) r3
            com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment r2 = new com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment
            r2.<init>()
            X.8nV r0 = r3.A00
            r2.A02 = r0
            boolean r0 = r3.A16()
            if (r0 == 0) goto L_0x0c8f
            X.0df r0 = r3.A0U()
            X.0dc r1 = new X.0dc
            r1.<init>(r0)
            java.lang.String r0 = com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment.A04
            r1.A0C(r2, r0)
            r1.A01()
        L_0x0c8f:
            r3.A1L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1235268t.onClick(android.content.DialogInterface, int):void");
    }
}
