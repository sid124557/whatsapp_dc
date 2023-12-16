package X;

import android.content.DialogInterface;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Hr  reason: invalid class name and case insensitive filesystem */
public class C85804Hr implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public C85804Hr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass0Uj r1, Object obj, int i, int i2) {
        r1.setNegativeButton(i2, new C85804Hr(obj, i));
    }

    public static void A01(AnonymousClass0Uj r1, Object obj, int i, int i2) {
        r1.setPositiveButton(i2, new C85804Hr(obj, i));
    }

    public static final void A02(C85804Hr r16) {
        C197612l r1 = (C197612l) r16.A00;
        C56612sH r5 = r1.A0D;
        AnonymousClass1VX r8 = r1.A0K;
        C95814uZ r7 = r1.A01.A0H;
        C626936e.A06(r7);
        C56972sr r3 = r1.A04;
        AnonymousClass4FS r4 = r1.A0N;
        C50392i6 r12 = r1.A00;
        AnonymousClass30G r10 = r1.A0G;
        C55832qz r9 = r1.A0M;
        AnonymousClass35J r6 = r1.A0L;
        C66543Lv r13 = r1.A0F;
        C50562iN r2 = r1.A0J;
        C18260x0.A1R(AnonymousClass001.A0o(), "scheduled-call/sendScheduledCallCancelMessage chatJid=", r7);
        if (r8.A0Y(C58422vE.A02, 4164)) {
            C95814uZ r42 = r12.A04;
            boolean z = r12.A08;
            r2.A00(new C30581mg(r6.A04(r42, z), new C52042kn(r12.A05, AnonymousClass2z0.A05(r42, r12.A07, z)), r5.A0H(), r12.A02));
            return;
        }
        UserJid userJid = r12.A05;
        AnonymousClass2z0 A05 = AnonymousClass2z0.A05(r7, AnonymousClass35J.A02(r3, r5), r3.A0a(userJid));
        long j = r12.A02;
        long currentTimeMillis = System.currentTimeMillis();
        String str = r12.A07;
        PhoneUserJid A052 = C56972sr.A05(r3);
        C30971nX r11 = new C30971nX(A05, currentTimeMillis);
        int i = 8;
        if (A05.A02) {
            i = 7;
        }
        r11.A01 = i;
        r11.A1J(A052);
        r11.A00 = 1;
        r11.A02 = str;
        r11.A01 = userJid;
        r4.BkP(new C70763b1(r9, r10, r11, r12, r13, 0, j));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v207, resolved type: com.whatsapp.deeplink.DeepLinkActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v103, resolved type: com.whatsapp.qrcode.DevicePairQrScannerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v104, resolved type: com.whatsapp.dialogs.ProgressDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v209, resolved type: com.whatsapp.community.CommunityConfirmLinkDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v210, resolved type: com.whatsapp.group.ReportGroupPrivacyTipDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: com.whatsapp.voipcalling.WASecuredDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v105, resolved type: X.03q} */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ec, code lost:
        if (r3 == null) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0374, code lost:
        r1.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0377, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0398, code lost:
        r1 = new X.C70183a5(r3, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x039d, code lost:
        r5.BkM(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x044f, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0452, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0856, code lost:
        r2.startActivity(r0);
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x085c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x098d, code lost:
        r1.finish();
        r1.overridePendingTransition(0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0994, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0ac5, code lost:
        r3.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0ac8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0bbf, code lost:
        X.C621433s.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0bc2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0bfb, code lost:
        r2.A00 = false;
        r2.BkT(false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0c01, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0c22, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0c25, code lost:
        r2.A00 = true;
        r2.BkT(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0c2c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0c38, code lost:
        X.C621433s.A01(r1, 106);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0c3d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0cad, code lost:
        r4.A1L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0cb0, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A01
            r3 = r17
            r2 = r18
            switch(r0) {
                case 0: goto L_0x0445;
                case 1: goto L_0x000b;
                case 2: goto L_0x0c74;
                case 3: goto L_0x0c3e;
                case 4: goto L_0x000b;
                case 5: goto L_0x0423;
                case 6: goto L_0x0423;
                case 7: goto L_0x040e;
                case 8: goto L_0x0c2d;
                case 9: goto L_0x0c14;
                case 10: goto L_0x0c02;
                case 11: goto L_0x0bea;
                case 12: goto L_0x0bdb;
                case 13: goto L_0x0092;
                case 14: goto L_0x03f9;
                case 15: goto L_0x0bcf;
                case 16: goto L_0x0bc3;
                case 17: goto L_0x0bba;
                case 18: goto L_0x0bb4;
                case 19: goto L_0x0b96;
                case 20: goto L_0x0b90;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0b53;
                case 23: goto L_0x0b3c;
                case 24: goto L_0x0b32;
                case 25: goto L_0x000b;
                case 26: goto L_0x0b16;
                case 27: goto L_0x0378;
                case 28: goto L_0x0b12;
                case 29: goto L_0x005a;
                case 30: goto L_0x0b04;
                case 31: goto L_0x0ae9;
                case 32: goto L_0x036a;
                case 33: goto L_0x0351;
                case 34: goto L_0x0ae1;
                case 35: goto L_0x0ac9;
                case 36: goto L_0x0ab7;
                case 37: goto L_0x0a89;
                case 38: goto L_0x0a81;
                case 39: goto L_0x033d;
                case 40: goto L_0x0a6d;
                case 41: goto L_0x0ae1;
                case 42: goto L_0x0ae1;
                case 43: goto L_0x0a44;
                case 44: goto L_0x0a2c;
                case 45: goto L_0x0a18;
                case 46: goto L_0x09e6;
                case 47: goto L_0x09db;
                case 48: goto L_0x09cd;
                case 49: goto L_0x09c5;
                case 50: goto L_0x032f;
                case 51: goto L_0x031e;
                case 52: goto L_0x09ad;
                case 53: goto L_0x0995;
                case 54: goto L_0x0ae1;
                case 55: goto L_0x01fc;
                case 56: goto L_0x01d5;
                case 57: goto L_0x0989;
                case 58: goto L_0x097b;
                case 59: goto L_0x096d;
                case 60: goto L_0x0bba;
                case 61: goto L_0x0966;
                case 62: goto L_0x0bb4;
                case 63: goto L_0x089e;
                case 64: goto L_0x0ae1;
                case 65: goto L_0x087e;
                case 66: goto L_0x01c9;
                case 67: goto L_0x01b7;
                case 68: goto L_0x01a5;
                case 69: goto L_0x085d;
                case 70: goto L_0x0847;
                case 71: goto L_0x017b;
                case 72: goto L_0x0157;
                case 73: goto L_0x013b;
                case 74: goto L_0x083f;
                case 75: goto L_0x0ae1;
                case 76: goto L_0x0118;
                case 77: goto L_0x07d3;
                case 78: goto L_0x000b;
                case 79: goto L_0x0c95;
                case 80: goto L_0x000b;
                case 81: goto L_0x0c95;
                case 82: goto L_0x07bd;
                case 83: goto L_0x0054;
                case 84: goto L_0x07ac;
                case 85: goto L_0x078f;
                case 86: goto L_0x077b;
                case 87: goto L_0x0754;
                case 88: goto L_0x071f;
                case 89: goto L_0x06d2;
                case 90: goto L_0x06b2;
                case 91: goto L_0x05d6;
                case 92: goto L_0x0107;
                case 93: goto L_0x05c6;
                case 94: goto L_0x0ae1;
                case 95: goto L_0x0ae1;
                case 96: goto L_0x0ae1;
                case 97: goto L_0x05be;
                case 98: goto L_0x05ae;
                case 99: goto L_0x055f;
                case 100: goto L_0x050b;
                case 101: goto L_0x0ae1;
                case 102: goto L_0x004c;
                case 103: goto L_0x0013;
                case 104: goto L_0x000b;
                case 105: goto L_0x0054;
                case 106: goto L_0x0b90;
                case 107: goto L_0x00e4;
                case 108: goto L_0x04e4;
                case 109: goto L_0x048d;
                case 110: goto L_0x000b;
                case 111: goto L_0x0467;
                case 112: goto L_0x000b;
                case 113: goto L_0x000b;
                case 114: goto L_0x000b;
                case 115: goto L_0x00d6;
                case 116: goto L_0x045d;
                case 117: goto L_0x045d;
                case 118: goto L_0x00c4;
                case 119: goto L_0x0453;
                case 120: goto L_0x0453;
                case 121: goto L_0x00d6;
                case 122: goto L_0x009a;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r4 = r1.A00
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r4 = (com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment) r4
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x003b
            java.util.Collection r1 = r4.A03
        L_0x001d:
            java.util.LinkedHashSet r3 = X.AnonymousClass0x9.A17()
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x003e
            java.util.Iterator r2 = r1.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0041
            X.34x r1 = X.C18300x5.A0T(r2)
            boolean r0 = r1.A1F
            if (r0 != 0) goto L_0x0029
            r3.add(r1)
            goto L_0x0029
        L_0x003b:
            java.util.Collection r1 = r4.A04
            goto L_0x001d
        L_0x003e:
            r3.addAll(r1)
        L_0x0041:
            X.4FS r5 = r4.A02
            r0 = 30
            X.3cK r1 = new X.3cK
            r1.<init>(r4, r0, r3)
            goto L_0x039d
        L_0x004c:
            java.lang.Object r0 = r1.A00
            X.3Ui r0 = (X.C68743Ui) r0
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = r0.A00
            goto L_0x044f
        L_0x0054:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x044f
        L_0x005a:
            java.lang.Object r3 = r1.A00
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r3 = (com.whatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment) r3
            X.1ip r0 = r3.A04
            boolean r0 = r0.A0F()
            r2 = 0
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "callspamactivity/spam/report/no-network-cannot-block-report"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.03q r0 = r3.A0R()
            boolean r0 = X.C29441ip.A02(r0)
            r1 = 2131891211(0x7f12140b, float:1.9417136E38)
            if (r0 == 0) goto L_0x007c
            r1 = 2131891212(0x7f12140c, float:1.9417138E38)
        L_0x007c:
            X.3Wi r0 = r3.A02
            r0.A0H(r1, r2)
            return
        L_0x0082:
            X.3Wi r1 = r3.A02
            r0 = 0
            r1.A0M(r0)
            X.03q r2 = r3.A0R()
            X.4FS r5 = r3.A0G
            r0 = 38
            goto L_0x0398
        L_0x0092:
            java.lang.Object r0 = r1.A00
            X.1qJ r0 = (X.C32381qJ) r0
            android.app.Activity r0 = r0.A01
            goto L_0x044f
        L_0x009a:
            java.lang.Object r4 = r1.A00
            com.whatsapp.voipcalling.WASecuredDialogFragment r4 = (com.whatsapp.voipcalling.WASecuredDialogFragment) r4
            X.3Lk r1 = r4.A01
            java.lang.String r0 = "26000103"
            android.net.Uri r3 = r1.A03(r0)
            android.content.Context r0 = r4.A1D()
            if (r0 == 0) goto L_0x00be
            X.8ss r2 = r4.A00
            android.content.Context r1 = r4.A1D()
            r0 = 0
            r2.BkW(r1, r3, r0)
        L_0x00b6:
            boolean r0 = r4.A16()
            if (r0 == 0) goto L_0x0012
            goto L_0x0cad
        L_0x00be:
            java.lang.String r0 = "Dialog detached from activity, null context"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00b6
        L_0x00c4:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r1 = r0.A0R()
            boolean r0 = r1 instanceof X.C185888uP
            if (r0 == 0) goto L_0x0012
            X.8uP r1 = (X.C185888uP) r1
            r1.finish()
            return
        L_0x00d6:
            java.lang.Object r1 = r1.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A16()
            if (r0 == 0) goto L_0x0012
            r1.A1L()
            return
        L_0x00e4:
            java.lang.Object r1 = r1.A00
            X.0eF r1 = (X.C08310eF) r1
            r0 = 1
            X.0eF r2 = r1.A0P(r0)
            com.whatsapp.twofactor.SetEmailFragment r2 = (com.whatsapp.twofactor.SetEmailFragment) r2
            java.lang.String r0 = "setemailfragment/do-skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.widget.EditText r1 = r2.A03
            if (r1 == 0) goto L_0x00fe
            java.lang.String r0 = ""
            r1.setText(r0)
        L_0x00fe:
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = r2.A07
            if (r1 == 0) goto L_0x0012
            r0 = 0
            r1.A76(r0)
            return
        L_0x0107:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r1 = r0.A0Q()
            com.whatsapp.settings.SettingsNetworkUsage r1 = (com.whatsapp.settings.SettingsNetworkUsage) r1
            if (r1 == 0) goto L_0x0012
            r0 = 1
            r1.A75(r0)
            return
        L_0x0118:
            java.lang.Object r2 = r1.A00
            com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment r2 = (com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment) r2
            android.os.Bundle r1 = r2.A0H()
            java.lang.String r0 = ""
            X.2z0 r1 = X.C107395bF.A03(r1, r0)
            X.2qz r0 = r2.A02     // Catch:{ all -> 0x0cc0 }
            if (r0 == 0) goto L_0x0cb9
            X.34x r1 = r0.A05(r1)     // Catch:{ all -> 0x0cc0 }
            if (r1 == 0) goto L_0x0012
            X.4FS r5 = r2.A03
            if (r5 == 0) goto L_0x0cb1
            r0 = 5
            X.3a0 r1 = X.C70133a0.A00(r2, r1, r0)
            goto L_0x039d
        L_0x013b:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r1 = r0.A0Q()
            boolean r0 = r1 instanceof X.AnonymousClass4FN
            if (r0 == 0) goto L_0x0155
            X.4FN r1 = (X.AnonymousClass4FN) r1
        L_0x0149:
            boolean r0 = r1 instanceof com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity
            if (r0 == 0) goto L_0x0012
            com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity r1 = (com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity) r1
            if (r1 == 0) goto L_0x0012
            r1.A74()
            return
        L_0x0155:
            r1 = 0
            goto L_0x0149
        L_0x0157:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mute.ui.MuteDialogFragment r0 = (com.whatsapp.mute.ui.MuteDialogFragment) r0
            X.66R r0 = r0.A03
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r2 = (com.whatsapp.mute.ui.MuteDialogViewModel) r2
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0012
            java.util.List r0 = r2.A02
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = X.C73723fy.A04(r0)
            X.4uZ r1 = (X.C95814uZ) r1
            if (r1 == 0) goto L_0x0012
            X.1hw r0 = r2.A09
            if (r0 == 0) goto L_0x0012
            r0.A0A(r1)
            return
        L_0x017b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mute.ui.MuteDialogFragment r0 = (com.whatsapp.mute.ui.MuteDialogFragment) r0
            X.66R r0 = r0.A03
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r4 = (com.whatsapp.mute.ui.MuteDialogViewModel) r4
            java.util.List r3 = r4.A02
            if (r3 == 0) goto L_0x0012
            X.33p r1 = r4.A08
            X.221 r0 = r4.A01
            int r2 = r0.id
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "last_mute_selection"
            X.C18270x1.A0h(r1, r0, r2)
            X.4FS r5 = r4.A0C
            r0 = 30
            X.3Zy r1 = new X.3Zy
            r1.<init>(r4, r0, r3)
            goto L_0x039d
        L_0x01a5:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r1 = r0.A0Q()
            boolean r0 = r1 instanceof X.AnonymousClass4D7
            if (r0 == 0) goto L_0x0012
            X.4D7 r1 = (X.AnonymousClass4D7) r1
            r1.Ayg()
            return
        L_0x01b7:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r1 = r0.A0Q()
            boolean r0 = r1 instanceof X.AnonymousClass4D7
            if (r0 == 0) goto L_0x0012
            X.4D7 r1 = (X.AnonymousClass4D7) r1
            r1.Azf()
            return
        L_0x01c9:
            java.lang.Object r1 = r1.A00
            com.whatsapp.group.ReportGroupPrivacyTipDialogFragment r1 = (com.whatsapp.group.ReportGroupPrivacyTipDialogFragment) r1
            r0 = -1
            if (r2 != r0) goto L_0x0012
            r0 = 3
            r1.A00 = r0
            goto L_0x0374
        L_0x01d5:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r5 = r0.A0Q()
            boolean r0 = r5 instanceof com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity
            if (r0 == 0) goto L_0x0012
            com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity r5 = (com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity) r5
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r5.Bp9(r0)
            X.4FS r4 = r5.A04
            X.5kg r0 = r5.A00
            X.3Gp r3 = r0.A0A
            X.2qe r2 = r5.A04
            X.4uZ r1 = r5.A0F
            X.1tD r0 = new X.1tD
            r0.<init>(r3, r5, r2, r1)
            X.C18270x1.A0w(r0, r4)
            return
        L_0x01fc:
            java.lang.Object r4 = r1.A00
            com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment r4 = (com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment) r4
            r0 = -1
            if (r2 != r0) goto L_0x0012
            android.os.Bundle r2 = r4.A0H()
            X.03q r1 = r4.A0R()
            boolean r0 = r1 instanceof X.C89654ea
            if (r0 == 0) goto L_0x021b
            X.4ea r1 = (X.C89654ea) r1
            r0 = 2131892829(0x7f121a5d, float:1.9420417E38)
            boolean r0 = r1.A6i(r0)
            if (r0 == 0) goto L_0x0221
            return
        L_0x021b:
            java.lang.String r1 = "GoogleSearchDialogFragment does not have a DialogActivity as a host"
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x0221:
            java.lang.String r0 = "search_query_type"
            int r1 = r2.getInt(r0)
            if (r1 == 0) goto L_0x0262
            r0 = 1
            if (r1 != r0) goto L_0x0012
            android.os.Bundle r1 = r4.A0H()
            java.lang.String r0 = "image_file"
            java.lang.String r1 = r1.getString(r0)
            X.03q r5 = r4.A0Q()
            if (r5 == 0) goto L_0x0012
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x0012
            boolean r0 = r5 instanceof X.C89654ea
            if (r0 == 0) goto L_0x025e
            X.4FS r0 = r4.A05
            X.3Wi r6 = r4.A01
            X.2s4 r7 = r4.A03
            X.4FV r8 = r4.A04
            X.4ea r5 = (X.C89654ea) r5
            java.io.File r9 = X.AnonymousClass002.A0B(r1)
            X.1tk r4 = new X.1tk
            r4.<init>(r5, r6, r7, r8, r9)
            X.C18270x1.A0w(r4, r0)
            return
        L_0x025e:
            java.lang.String r1 = "GoogleSearchDialogFragment does not have a DialogActivity as a host"
            goto L_0x02f0
        L_0x0262:
            android.os.Bundle r1 = r4.A0H()
            java.lang.String r0 = "search_query_text"
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r2 = "wa"
            android.net.Uri$Builder r1 = X.C18300x5.A0C()
            java.lang.String r0 = "www.google.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "search"
            android.net.Uri$Builder r1 = r1.path(r0)
            java.lang.String r0 = "ctx"
            android.net.Uri$Builder r7 = r1.appendQueryParameter(r0, r2)
            java.lang.String r0 = X.C18300x5.A0f(r7)
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
            int r0 = 2000 - r0
            int r10 = r0 + -3
            java.nio.charset.Charset r8 = X.C58152un.A0D
            java.nio.ByteBuffer r0 = r8.encode(r3)
            byte[] r9 = r0.array()
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            java.lang.String r2 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            java.lang.String r1 = "+"
            java.lang.String r0 = "%20"
            java.lang.String r6 = r2.replace(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            byte[] r0 = r6.getBytes()     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            int r0 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            if (r0 <= r10) goto L_0x02ec
            r5 = 0
            r3 = 0
            r2 = 0
        L_0x02b7:
            if (r3 >= r10) goto L_0x02cf
            int r0 = r9.length     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            if (r2 >= r0) goto L_0x02cf
            char r1 = r6.charAt(r3)     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            r0 = 37
            if (r1 != r0) goto L_0x02c5
            goto L_0x02c8
        L_0x02c5:
            int r3 = r3 + 1
            goto L_0x02ca
        L_0x02c8:
            int r3 = r3 + 3
        L_0x02ca:
            if (r3 > r10) goto L_0x02cf
            int r2 = r2 + 1
            goto L_0x02b7
        L_0x02cf:
            byte r0 = r9[r2]     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            r1 = r0 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 != r0) goto L_0x02dc
            if (r2 <= 0) goto L_0x02dc
            int r2 = r2 + -1
            goto L_0x02cf
        L_0x02dc:
            byte[] r0 = java.util.Arrays.copyOfRange(r9, r5, r2)     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            r3.<init>(r0, r8)     // Catch:{ UnsupportedEncodingException -> 0x02e6 }
            goto L_0x02f5
        L_0x02e6:
            java.lang.String r0 = "UrlUtils/truncateParameterForPercentEncoding UTF-8 encoding not supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x02ee
        L_0x02ec:
            if (r3 != 0) goto L_0x02f5
        L_0x02ee:
            java.lang.String r1 = "Failed to encode URI in UTF-8, this should not happen"
        L_0x02f0:
            r0 = 0
            X.C626936e.A0D(r0, r1)
            return
        L_0x02f5:
            java.lang.String r0 = "q"
            android.net.Uri r0 = X.C18290x4.A0H(r7, r0, r3)
            if (r0 == 0) goto L_0x02ee
            android.content.Intent r3 = X.C18310x6.A0D(r0)
            X.03q r2 = r4.A0Q()
            if (r2 == 0) goto L_0x0012
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0012
            X.4FV r1 = r4.A04
            X.1Vh r0 = new X.1Vh
            r0.<init>()
            r1.BhD(r0)
            X.5hX r0 = r4.A00
            r0.A0A(r2, r3)
            return
        L_0x031e:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversation.CapturePictureOrVideoDialogFragment r0 = (com.whatsapp.conversation.CapturePictureOrVideoDialogFragment) r0
            X.4Ck r1 = r0.A00
            if (r1 == 0) goto L_0x0012
            if (r18 == 0) goto L_0x0cc4
            r0 = 1
            if (r2 != r0) goto L_0x0012
            r1.BZd()
            return
        L_0x032f:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.0eF r0 = r0.A0E
            if (r0 == 0) goto L_0x0012
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            r0.A1U()
            return
        L_0x033d:
            java.lang.Object r1 = r1.A00
            com.whatsapp.community.CommunityConfirmLinkDialogFragment r1 = (com.whatsapp.community.CommunityConfirmLinkDialogFragment) r1
            X.4Cc r0 = r1.A00
            if (r0 != 0) goto L_0x034d
            java.lang.String r0 = "onConfirmLinkSubgroupListener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x034d:
            r0.BOO()
            goto L_0x0374
        L_0x0351:
            java.lang.Object r1 = r1.A00
            com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment r1 = (com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment) r1
            if (r18 == 0) goto L_0x0362
            r0 = 1
            if (r2 != r0) goto L_0x0012
            X.4Cb r0 = r1.A00
            if (r0 == 0) goto L_0x0012
            r0.BfY()
            return
        L_0x0362:
            X.4Cb r0 = r1.A00
            if (r0 == 0) goto L_0x0012
            r0.BfW()
            return
        L_0x036a:
            java.lang.Object r1 = r1.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A16()
            if (r0 == 0) goto L_0x0012
        L_0x0374:
            r1.A1K()
            return
        L_0x0378:
            java.lang.Object r3 = r1.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment r3 = (com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment) r3
            r1 = 2131892748(0x7f121a0c, float:1.9420253E38)
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            com.whatsapp.dialogs.ProgressDialogFragment r2 = com.whatsapp.dialogs.ProgressDialogFragment.A00(r1, r0)
            boolean r0 = r3.A16()
            if (r0 == 0) goto L_0x0012
            X.0df r1 = r3.A0U()
            r0 = 0
            r2.A1O(r1, r0)
            X.4FS r5 = r3.A06
            r0 = 15
        L_0x0398:
            X.3a5 r1 = new X.3a5
            r1.<init>(r3, r0, r2)
        L_0x039d:
            r5.BkM(r1)
            return
        L_0x03a1:
            java.lang.Object r5 = r1.A00
            com.whatsapp.account.remove.RemoveAccountActivity r5 = (com.whatsapp.account.remove.RemoveAccountActivity) r5
            r0 = 1
            X.C621433s.A00(r5, r0)
            X.5XC r1 = r5.A04
            if (r1 == 0) goto L_0x0d34
            r4 = 14
            r0 = 9
            r1.A00(r4, r0)
            X.2aW r0 = r5.A02
            if (r0 == 0) goto L_0x0d2d
            int r3 = r0.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RemoveAccountActivity/maybeRemoveAccount shouldAllowAccountSwitching:"
            X.C18260x0.A0y(r0, r1, r3)
            if (r3 == 0) goto L_0x0ce4
            r0 = 2
            r2 = 0
            if (r3 == r0) goto L_0x03e5
            r0 = 3
            if (r3 != r0) goto L_0x0012
            X.30z r0 = r5.A03
            if (r0 == 0) goto L_0x0ccf
            r1 = 2131886262(0x7f1200b6, float:1.9407098E38)
            r0 = 2131893006(0x7f121b0e, float:1.9420776E38)
            X.C614930z.A00(r5, r2, r1, r0)
            X.5XC r1 = r5.A04
            if (r1 == 0) goto L_0x0cc8
            r0 = 24
        L_0x03e1:
            r1.A00(r4, r0)
            return
        L_0x03e5:
            X.30z r0 = r5.A03
            if (r0 == 0) goto L_0x0cdd
            r1 = 2131886263(0x7f1200b7, float:1.94071E38)
            r0 = 2131893007(0x7f121b0f, float:1.9420778E38)
            X.C614930z.A00(r5, r2, r1, r0)
            X.5XC r1 = r5.A04
            if (r1 == 0) goto L_0x0cd6
            r0 = 23
            goto L_0x03e1
        L_0x03f9:
            java.lang.Object r2 = r1.A00
            X.1qJ r2 = (X.C32381qJ) r2
            android.app.Activity r1 = r2.A01
            r0 = 107(0x6b, float:1.5E-43)
            X.C621433s.A00(r1, r0)
            boolean r0 = r2.Ayl()
            if (r0 == 0) goto L_0x0012
            r2.BsA()
            return
        L_0x040e:
            java.lang.Object r1 = r1.A00
            X.0eF r1 = (X.C08310eF) r1
            java.lang.String r0 = "invitelink/revoke/confirmation/ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.03q r0 = r1.A0Q()
            X.493 r0 = (X.AnonymousClass493) r0
            if (r0 == 0) goto L_0x0012
            r0.BkF()
            return
        L_0x0423:
            java.lang.Object r1 = r1.A00
            X.0eF r1 = (X.C08310eF) r1
            X.03q r5 = r1.A0Q()
            boolean r0 = r5 instanceof X.AnonymousClass490
            if (r0 == 0) goto L_0x0012
            X.490 r5 = (X.AnonymousClass490) r5
            if (r5 == 0) goto L_0x0012
            android.os.Bundle r4 = r1.A0H()
            java.lang.String r1 = "id"
            r0 = -1
            int r0 = r4.getInt(r1, r0)
            X.C162457s7.A0H(r3)
            r5.BR5(r3, r0, r2)
            return
        L_0x0445:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r0 = r0.A0Q()
            if (r0 == 0) goto L_0x0012
        L_0x044f:
            r0.finish()
            return
        L_0x0453:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipErrorDialogFragment r0 = (com.whatsapp.voipcalling.VoipErrorDialogFragment) r0
            X.2dg r0 = r0.A03
            r0.A00()
            return
        L_0x045d:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipErrorDialogFragment r0 = (com.whatsapp.voipcalling.VoipErrorDialogFragment) r0
            X.2dg r0 = r0.A03
            r0.A01(r3)
            return
        L_0x0467:
            java.lang.Object r3 = r1.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            android.content.Context r0 = r3.A1D()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.voipcalling.VoipActivityV2"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.intent.action.END_CALL_AFTER_CONFIRMATION"
            r2.setAction(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            r3.A0m(r2)
            r3.A1L()
            return
        L_0x048d:
            java.lang.Object r3 = r1.A00
            com.whatsapp.userban.ui.fragment.BanAppealBaseFragment r3 = (com.whatsapp.userban.ui.fragment.BanAppealBaseFragment) r3
            java.lang.String r0 = "BanAppealBaseFragment/showRemoveAccountDialog/remove current account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5hX r2 = r3.A00
            if (r2 == 0) goto L_0x04dd
            X.03q r1 = r3.A0R()
            r5 = 0
            X.03q r4 = r3.A0R()
            X.33p r0 = r3.A03
            if (r0 == 0) goto L_0x04d5
            int r7 = r0.A0C()
            r8 = 16
            X.2sH r0 = r3.A02
            if (r0 == 0) goto L_0x04cd
            long r9 = android.os.SystemClock.elapsedRealtime()
            X.2og r0 = r3.A04
            if (r0 == 0) goto L_0x04c5
            java.lang.String r6 = r0.A02()
            android.content.Intent r0 = X.C627736r.A13(r4, r5, r6, r7, r8, r9)
            r2.A0A(r1, r0)
            return
        L_0x04c5:
            java.lang.String r0 = "waStartupSharedPreferences"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04cd:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04d5:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04dd:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04e4:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r4 = r0.A0Q()
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r4 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r4
            r0 = 2131894508(0x7f1220ec, float:1.9423823E38)
            r4.Bp9(r0)
            android.os.Handler r3 = r4.A0D
            java.lang.Runnable r2 = r4.A0E
            long r0 = X.C613130e.A0F
            r3.postDelayed(r2, r0)
            X.30e r2 = r4.A0A
            java.lang.String r0 = "TwoFactorAuthManager/disableTwoFactorAuth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = ""
            r0 = 0
            r2.A04(r1, r0)
            return
        L_0x050b:
            java.lang.Object r3 = r1.A00
            X.0eF r3 = (X.C08310eF) r3
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x054f
            java.lang.String r2 = "com.samsung.android.lool"
            android.content.Context r0 = r3.A1D()     // Catch:{ NameNotFoundException -> 0x054f }
            if (r0 == 0) goto L_0x054f
            android.content.Context r0 = r3.A1D()     // Catch:{ NameNotFoundException -> 0x054f }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x054f }
            if (r0 == 0) goto L_0x054f
            android.content.Context r0 = r3.A1D()     // Catch:{ NameNotFoundException -> 0x054f }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x054f }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x054f }
            if (r0 == 0) goto L_0x054f
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)     // Catch:{ ActivityNotFoundException -> 0x054a }
            android.content.Intent r0 = r0.setPackage(r2)     // Catch:{ ActivityNotFoundException -> 0x054a }
            r3.A0m(r0)     // Catch:{ ActivityNotFoundException -> 0x054a }
            return
        L_0x054a:
            java.lang.String r0 = "Sticker/ThirdPartyPackPage/cannot launch com.samsung.android.lool"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x054f:
            java.lang.String r0 = "android.intent.action.POWER_USAGE_SUMMARY"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)     // Catch:{ ActivityNotFoundException -> 0x0559 }
            r3.A0m(r0)     // Catch:{ ActivityNotFoundException -> 0x0559 }
            return
        L_0x0559:
            java.lang.String r0 = "Sticker/ThirdPartyPackPage/cannot launch power usage"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x055f:
            java.lang.Object r3 = r1.A00
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r3 = (com.whatsapp.stickers.StarStickerFromPickerDialogFragment) r3
            X.39M r6 = r3.A02
            java.lang.String r0 = r6.A0F
            if (r0 != 0) goto L_0x0573
            X.2sn r1 = r3.A03
            java.util.Set r0 = java.util.Collections.singleton(r6)
            r1.A0E(r0)
            return
        L_0x0573:
            X.48W r2 = r3.A01
            java.lang.String r0 = "StarStickerFromPickerDialogFragment/downloadAndStarStickerAsync/begin"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.os.Bundle r0 = r3.A0H()
            java.lang.String r1 = "position"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x05ac
            android.os.Bundle r0 = r3.A0H()
            int r0 = r0.getInt(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x0593:
            X.2sn r1 = r3.A03
            X.2rq r0 = r3.A00
            X.1td r4 = new X.1td
            r4.<init>(r0, r2, r1)
            X.4FS r3 = r3.A04
            r0 = 1
            android.util.Pair[] r2 = new android.util.Pair[r0]
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r6, r5)
            r0 = 0
            r2[r0] = r1
            r3.BkL(r4, r2)
            return
        L_0x05ac:
            r5 = 0
            goto L_0x0593
        L_0x05ae:
            java.lang.Object r0 = r1.A00
            com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment r0 = (com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment) r0
            X.2sn r1 = r0.A01
            X.39M r0 = r0.A00
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r1.A0F(r0)
            return
        L_0x05be:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 13
            goto L_0x0bbf
        L_0x05c6:
            java.lang.Object r3 = r1.A00
            X.4el r3 = (X.C89704el) r3
            X.4FS r2 = r3.A04
            r1 = 2
            X.4HS r0 = new X.4HS
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.C18270x1.A0w(r0, r2)
            return
        L_0x05d6:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.MultiSelectionDialogFragment r0 = (com.whatsapp.settings.MultiSelectionDialogFragment) r0
            X.8jV r5 = r0.A01
            int r8 = r0.A00
            boolean[] r4 = r0.A04
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            r6 = 0
            r1 = 0
        L_0x05e8:
            int r0 = r4.length
            if (r1 >= r0) goto L_0x05f9
            boolean r0 = r4[r1]
            if (r0 == 0) goto L_0x05f6
            java.lang.String[] r0 = r5.A0g
            r0 = r0[r1]
            r2.add(r0)
        L_0x05f6:
            int r1 = r1 + 1
            goto L_0x05e8
        L_0x05f9:
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r6]
            java.lang.Object[] r7 = r2.toArray(r0)
            java.lang.CharSequence[] r7 = (java.lang.CharSequence[]) r7
            r0 = 2
            if (r8 == r0) goto L_0x0664
            r0 = 3
            if (r8 == r0) goto L_0x0650
            r0 = 4
            if (r8 != r0) goto L_0x0ac5
            int r4 = r7.length
            r2 = 0
        L_0x060c:
            if (r2 >= r4) goto L_0x061e
            r0 = r7[r2]
            java.lang.String r0 = r0.toString()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 1
            int r0 = r0 << r1
            r6 = r6 | r0
            int r2 = r2 + 1
            goto L_0x060c
        L_0x061e:
            r5.A01 = r6
            X.33p r0 = r5.A09
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "autodownload_roaming_mask"
            X.C18270x1.A0h(r1, r0, r6)
            android.widget.TextView r1 = r5.A0C
            int r0 = r5.A01
            java.lang.String r0 = r5.A75(r0)
            r1.setText(r0)
            X.3XH r2 = r5.A0S
            java.lang.String r0 = "mediaautodownload/updatequeue"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r1 = r2.A09
            r0 = 25
            X.C71533cG.A00(r1, r2, r0)
            int r0 = r5.A01
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0ac5
            r0 = 1
            X.C621433s.A01(r5, r0)
            goto L_0x0ac5
        L_0x0650:
            int r4 = r7.length
            r2 = 0
        L_0x0652:
            if (r2 >= r4) goto L_0x068a
            r0 = r7[r2]
            java.lang.String r0 = r0.toString()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 1
            int r0 = r0 << r1
            r6 = r6 | r0
            int r2 = r2 + 1
            goto L_0x0652
        L_0x0664:
            int r4 = r7.length
            r2 = 0
        L_0x0666:
            if (r2 >= r4) goto L_0x0678
            r0 = r7[r2]
            java.lang.String r0 = r0.toString()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 1
            int r0 = r0 << r1
            r6 = r6 | r0
            int r2 = r2 + 1
            goto L_0x0666
        L_0x0678:
            r5.A00 = r6
            X.33p r0 = r5.A09
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "autodownload_cellular_mask"
            X.C18270x1.A0h(r1, r0, r6)
            android.widget.TextView r1 = r5.A0B
            int r0 = r5.A00
            goto L_0x069b
        L_0x068a:
            r5.A02 = r6
            X.33p r0 = r5.A09
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "autodownload_wifi_mask"
            X.C18270x1.A0h(r1, r0, r6)
            android.widget.TextView r1 = r5.A0D
            int r0 = r5.A02
        L_0x069b:
            java.lang.String r0 = r5.A75(r0)
            r1.setText(r0)
            X.3XH r2 = r5.A0S
            java.lang.String r0 = "mediaautodownload/updatequeue"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r1 = r2.A09
            r0 = 25
            X.C71533cG.A00(r1, r2, r0)
            goto L_0x0ac5
        L_0x06b2:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity r1 = (com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity) r1
            r3.dismiss()
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/launchConfirmationDialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2I0 r0 = new X.2I0
            r0.<init>(r1)
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment r2 = new com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment
            r2.<init>(r0)
            X.0df r1 = r1.getSupportFragmentManager()
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity"
            r2.A1O(r1, r0)
            return
        L_0x06d2:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment r0 = (com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment) r0
            X.2I0 r0 = r0.A00
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity r5 = r0.A00
            X.1ip r0 = r5.A07
            boolean r0 = r0.A0F()
            r4 = 1
            if (r0 != 0) goto L_0x0703
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/checksystemstatus/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 2131892894(0x7f121a9e, float:1.942055E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0 = 2131888105(0x7f1207e9, float:1.9410836E38)
            java.lang.String r1 = r5.getString(r0)
            r0 = 0
            r2[r0] = r1
            X.2iE r0 = com.whatsapp.LegacyMessageDialogFragment.A00(r2, r3)
            androidx.fragment.app.DialogFragment r0 = r0.A00()
            X.C18270x1.A0t(r0, r5)
            return
        L_0x0703:
            r0 = 2131890558(0x7f12117e, float:1.9415811E38)
            r5.Bp9(r0)
            X.4KU r0 = new X.4KU
            r0.<init>(r5, r4)
            X.31C r2 = r5.A05
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r0)
            X.3TE r1 = new X.3TE
            r1.<init>(r2, r0)
            java.lang.String r0 = r5.A0A
            r1.A00(r4, r0)
            return
        L_0x071f:
            r3 = 0
            X.4KU r0 = new X.4KU
            r0.<init>(r1, r3)
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment r4 = (com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment) r4
            X.31C r2 = r4.A05
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r0)
            X.3TE r1 = new X.3TE
            r1.<init>(r2, r0)
            X.2fb r0 = com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06
            java.lang.String r0 = r0.A02
            r1.A00(r3, r0)
            android.content.Context r3 = r4.A0G()
            android.content.Context r0 = r4.A0G()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0754:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            android.content.Context r4 = r0.A0G()
            android.content.Context r1 = r0.A0G()
            X.2fb r0 = com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06
            java.lang.String r3 = r0.A02
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "server_token"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x077b:
            java.lang.Object r3 = r1.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r3 = (com.whatsapp.registration.VerifyTwoFactorAuth) r3
            r2 = 2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyTwoFactorAuth/do-reset mode="
            X.C18260x0.A0w(r0, r1, r2)
            r1 = 0
            r0 = 0
            r3.A76(r2, r1, r0)
            return
        L_0x078f:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            X.0zH r2 = X.AnonymousClass5V0.A00(r3)
            r0 = 2131894525(0x7f1220fd, float:1.9423857E38)
            r2.A0T(r0)
            r1 = 2131894519(0x7f1220f7, float:1.9423845E38)
            r0 = 86
            X.C19340zH.A08(r2, r3, r0, r1)
            X.C19340zH.A05(r2)
            r2.A0S()
            return
        L_0x07ac:
            java.lang.Object r2 = r1.A00
            X.0eF r2 = (X.C08310eF) r2
            android.content.Context r1 = r2.A0G()
            r0 = 2
            android.content.Intent r0 = X.C57112t6.A01(r1, r0)
            r2.A0m(r0)
            return
        L_0x07bd:
            java.lang.Object r2 = r1.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r2 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r2
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)
            X.2i5 r0 = r2.A03
            android.net.Uri r0 = r0.A00()
            android.content.Intent r0 = r1.setData(r0)
            goto L_0x0856
        L_0x07d3:
            java.lang.Object r6 = r1.A00
            com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment r6 = (com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment) r6
            r0 = 1
            r6.A06 = r0
            X.34x r0 = r6.A02
            java.lang.String r1 = "selectedMessage"
            r5 = 0
            if (r0 != 0) goto L_0x07e7
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x07e7:
            X.2Ou r0 = r0.A11()
            if (r0 == 0) goto L_0x07f5
            X.2z0 r0 = r0.A02
            if (r0 == 0) goto L_0x07f5
            java.lang.String r4 = r0.A01
            if (r4 != 0) goto L_0x0802
        L_0x07f5:
            X.34x r0 = r6.A02
            if (r0 != 0) goto L_0x07fe
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x07fe:
            X.2z0 r0 = r0.A1J
            java.lang.String r4 = r0.A01
        L_0x0802:
            X.C162457s7.A0H(r4)
            X.34x r0 = r6.A02
            if (r0 != 0) goto L_0x080e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x080e:
            com.whatsapp.jid.UserJid r3 = r0.A0o()
            if (r3 != 0) goto L_0x0825
            X.2e3 r1 = r6.A01
            if (r1 == 0) goto L_0x081e
            X.22M r0 = X.AnonymousClass22M.A0M
            r1.A01(r0, r5)
            return
        L_0x081e:
            java.lang.String r0 = "crashLogsWrapper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0825:
            X.46U r1 = new X.46U
            r1.<init>(r5)
            X.46A r0 = X.AnonymousClass788.A00
            X.4Gl r0 = r1.plus(r0)
            X.3e5 r2 = new X.3e5
            r2.<init>(r0)
            com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment$setButtons$1$1 r1 = new com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment$setButtons$1$1
            r1.<init>(r3, r6, r4, r5)
            r0 = 3
            X.C616131n.A02(r5, r1, r2, r5, r0)
            return
        L_0x083f:
            java.lang.Object r0 = r1.A00
            com.whatsapp.newsletter.ui.delete.DeleteConfirmationDialogFragment r0 = (com.whatsapp.newsletter.ui.delete.DeleteConfirmationDialogFragment) r0
            r0.A1W()
            return
        L_0x0847:
            java.lang.Object r2 = r1.A00
            X.4el r2 = (X.C89704el) r2
            X.4FS r1 = r2.A04
            r0 = 11
            X.C70023Zo.A00(r1, r2, r0)
            android.content.Intent r0 = X.C627736r.A03(r2)
        L_0x0856:
            r2.startActivity(r0)
            r2.finish()
            return
        L_0x085d:
            java.lang.Object r3 = r1.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r3 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r3
            X.2j6 r2 = r3.A0G
            java.lang.String r1 = r3.A0J
            r0 = 6
            r2.A00(r1, r0)
            X.4FV r0 = r3.A0B
            r2 = 8
            java.lang.String r1 = X.AnonymousClass297.A00(r0, r2)
            r0 = 0
            android.content.Intent r2 = X.C627736r.A12(r3, r1, r0, r2)
            X.5hX r1 = r3.A00
            r0 = 5000(0x1388, float:7.006E-42)
            r1.A0D(r3, r2, r0)
            return
        L_0x087e:
            java.lang.Object r3 = r1.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.String r0 = "group_info/onclick_setDescription"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.03q r2 = r3.A0Q()
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            android.os.Bundle r1 = r3.A0H()
            java.lang.String r0 = "description"
            java.lang.String r0 = X.C18310x6.A0k(r1, r0)
            r2.A7a(r0)
            r3.A1K()
            return
        L_0x089e:
            java.lang.Object r11 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r11 = (com.whatsapp.group.GroupChatInfoActivity) r11
            r0 = 6
            X.C621433s.A00(r11, r0)
            X.3ZH r0 = r11.A1A
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3ZH.A07(r0)
            X.10x r0 = r11.A1R
            boolean r0 = r0.A0F(r4)
            if (r0 == 0) goto L_0x08ca
            X.3Lq r3 = r11.A1T
            X.1fJ r2 = r11.A1h
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r3.A0Q(r2, r0)
            X.3Wi r1 = r3.A05
            r0 = 12
            X.C69263Wi.A04(r1, r3, r2, r0)
        L_0x08c6:
            r11.A7I()
            return
        L_0x08ca:
            X.2sj r1 = r11.A0O
            X.1fJ r0 = r11.A1h
            X.33k r0 = X.C56892sj.A01(r1, r0)
            X.2zG r0 = r0.A05(r4)
            if (r0 == 0) goto L_0x08f7
            int r1 = r0.A01
            r0 = 2
            if (r1 != r0) goto L_0x08f7
            r3 = 2131889121(0x7f120be1, float:1.9412897E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.5ZU r1 = r11.A0t
            X.3Ex r0 = r11.A0I
            X.3ZH r0 = r0.A0A(r4)
            java.lang.String r1 = r1.A0H(r0)
            r0 = 0
            r2[r0] = r1
            r11.Box(r2, r0, r3)
            return
        L_0x08f7:
            X.1ip r0 = r11.A07
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0915
            X.3Wi r2 = r11.A05
            android.content.Context r0 = r11.getApplicationContext()
            boolean r1 = X.C29441ip.A02(r0)
            r0 = 2131890926(0x7f1212ee, float:1.9416558E38)
            if (r1 == 0) goto L_0x0911
            r0 = 2131890927(0x7f1212ef, float:1.941656E38)
        L_0x0911:
            r2.A0E(r0)
            goto L_0x08c6
        L_0x0915:
            r1 = 2131891659(0x7f1215cb, float:1.9418044E38)
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r11.BpA(r1, r0)
            X.3Lq r12 = r11.A1T
            X.1hw r10 = r11.A0M
            X.1fJ r13 = r11.A1h
            java.util.List r14 = java.util.Collections.singletonList(r4)
            r8 = 30
            X.1du r9 = new X.1du
            r9.<init>(r10, r11, r12, r13, r14)
            X.3Lr r2 = r11.A1Y
            X.1fJ r4 = r9.A03
            java.lang.String r6 = "remove"
            java.util.List r7 = r9.A05
            X.C626936e.A06(r7)
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x095a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupIqResponseUtil/remove-participants/timeout; groupId="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; participants="
            X.C18260x0.A1Q(r1, r0, r7)
            r5 = 0
        L_0x0951:
            r9 = 0
            X.8TE r3 = X.AnonymousClass8TE.create()
            r2.A07(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x095a:
            r15 = 1
            X.4KY r5 = new X.4KY
            r13 = r9
            r14 = r9
            r10 = r5
            r11 = r9
            r12 = r2
            r10.<init>((X.AnonymousClass1FE) r11, (X.C66503Lr) r12, (X.AnonymousClass4B6) r13, (java.lang.Runnable) r14, (int) r15)
            goto L_0x0951
        L_0x0966:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 4
            goto L_0x0bbf
        L_0x096d:
            java.lang.Object r1 = r1.A00
            com.whatsapp.email.UpdateEmailActivity r1 = (com.whatsapp.email.UpdateEmailActivity) r1
            r0 = 2
            X.C621433s.A00(r1, r0)
            java.lang.String r0 = ""
            r1.A77(r0)
            return
        L_0x097b:
            java.lang.Object r1 = r1.A00
            com.whatsapp.deeplink.DeepLinkActivity r1 = (com.whatsapp.deeplink.DeepLinkActivity) r1
            X.2i5 r0 = r1.A0B
            android.net.Uri r0 = r0.A00()
            X.AnonymousClass1Ha.A1w(r0, r1)
            goto L_0x098d
        L_0x0989:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
        L_0x098d:
            r1.finish()
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x0995:
            java.lang.Object r2 = r1.A00
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r2 = (com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment) r2
            r0 = 1
            X.1Yz r1 = r2.A0A
            if (r1 == 0) goto L_0x09a9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.4FV r0 = r2.A09
            r0.BhD(r1)
        L_0x09a9:
            r2.A1L()
            return
        L_0x09ad:
            java.lang.Object r2 = r1.A00
            com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment r2 = (com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment) r2
            r0 = 1
            X.1Yz r1 = r2.A05
            if (r1 == 0) goto L_0x09c1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.4FV r0 = r2.A04
            r0.BhD(r1)
        L_0x09c1:
            r2.A1K()
            return
        L_0x09c5:
            java.lang.Object r0 = r1.A00
            X.54F r0 = (X.AnonymousClass54F) r0
            r0.A08()
            return
        L_0x09cd:
            java.lang.Object r0 = r1.A00
            X.2Ts r0 = (X.C43852Ts) r0
            android.widget.EditText r1 = r0.A03
            android.accounts.Account r0 = r0.A00
            java.lang.String r0 = r0.name
            r1.setText(r0)
            return
        L_0x09db:
            java.lang.Object r1 = r1.A00
            X.2Ts r1 = (X.C43852Ts) r1
            android.accounts.Account[] r0 = r1.A01
            r0 = r0[r18]
            r1.A00 = r0
            return
        L_0x09e6:
            java.lang.Object r2 = r1.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r2 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r2
            r0 = 1
            X.C162457s7.A0J(r3, r0)
            r0 = 0
            r2.A06 = r0
            android.widget.ProgressBar r1 = r2.A01
            if (r1 != 0) goto L_0x09fc
            java.lang.String r0 = "loadingSpinner"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x09fc:
            r0 = 0
            r1.setVisibility(r0)
            android.widget.LinearLayout r1 = r2.A00
            if (r1 != 0) goto L_0x0a0b
            java.lang.String r0 = "codeInputBoxesLinearLayout"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0a0b:
            r0 = 4
            r1.setVisibility(r0)
            X.4FS r1 = r2.A04
            r0 = 36
            X.C69963Zi.A01(r1, r2, r0)
            goto L_0x0ac5
        L_0x0a18:
            java.lang.Object r0 = r1.A00
            com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment r0 = (com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment) r0
            X.2FO r0 = r0.A00
            X.2iG r0 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r1 = r0.A06
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r0.A0A
            boolean r0 = r0.A01()
            r1.A0H(r0)
            return
        L_0x0a2c:
            java.lang.Object r3 = r1.A00
            X.4el r3 = (X.C89704el) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            r0 = 100
            r3.startActivityForResult(r1, r0)
            return
        L_0x0a44:
            java.lang.Object r5 = r1.A00
            com.whatsapp.community.deactivate.DeactivateCommunityConfirmationFragment r5 = (com.whatsapp.community.deactivate.DeactivateCommunityConfirmationFragment) r5
            X.480 r4 = r5.A00
            if (r4 != 0) goto L_0x0a53
            java.lang.String r0 = "deactivateClickListener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0a53:
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r4 = (com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity) r4
            r0 = 2131888445(0x7f12093d, float:1.9411526E38)
            r4.Bp9(r0)
            X.0ni r3 = X.AnonymousClass0IT.A00(r4)
            r2 = 0
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1 r1 = new com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1
            r1.<init>(r4, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            r5.A1K()
            return
        L_0x0a6d:
            java.lang.Object r0 = r1.A00
            com.whatsapp.community.CommunityConfirmLinkDialogFragment r0 = (com.whatsapp.community.CommunityConfirmLinkDialogFragment) r0
            X.4Cc r0 = r0.A00
            if (r0 != 0) goto L_0x0a7d
            java.lang.String r0 = "onConfirmLinkSubgroupListener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0a7d:
            r0.BPh()
            return
        L_0x0a81:
            java.lang.Object r0 = r1.A00
            com.whatsapp.community.CommunityAdminDialogFragment r0 = (com.whatsapp.community.CommunityAdminDialogFragment) r0
            X.AnonymousClass2FG.A00(r0)
            goto L_0x0ac5
        L_0x0a89:
            java.lang.Object r0 = r1.A00
            com.whatsapp.community.CommunityAdminDialogFragment r0 = (com.whatsapp.community.CommunityAdminDialogFragment) r0
            X.2FG r1 = r0.A01
            int r4 = r0.A00
            com.whatsapp.jid.UserJid r2 = r0.A02
            r0 = 2
            if (r4 == r0) goto L_0x0aab
            r0 = 1
            if (r4 == r0) goto L_0x0aab
            r0 = 4
            if (r4 == r0) goto L_0x0a9f
            r0 = 3
            if (r4 != r0) goto L_0x0ac5
        L_0x0a9f:
            X.2bx r0 = r1.A00
            X.2o8 r1 = r0.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A01(r2, r0)
            goto L_0x0ac5
        L_0x0aab:
            X.2bx r0 = r1.A00
            X.2o8 r1 = r0.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A00(r2, r0)
            goto L_0x0ac5
        L_0x0ab7:
            java.lang.Object r1 = r1.A00
            com.whatsapp.chatlock.ChatLockSettingsActivity r1 = (com.whatsapp.chatlock.ChatLockSettingsActivity) r1
            r0 = 0
            r1.A77(r0)
            r0 = 2131894495(0x7f1220df, float:1.9423796E38)
            r1.A76(r0)
        L_0x0ac5:
            r3.dismiss()
            return
        L_0x0ac9:
            java.lang.Object r4 = r1.A00
            com.whatsapp.chatlock.ChatLockPrivacySettingsActivity r4 = (com.whatsapp.chatlock.ChatLockPrivacySettingsActivity) r4
            X.5aW r3 = r4.A00
            if (r3 == 0) goto L_0x0ada
            X.4kQ r2 = X.C91594kQ.A00
            X.4Kq r1 = r4.A03
            r0 = 5
            r3.A08(r4, r2, r1, r0)
            return
        L_0x0ada:
            java.lang.String r0 = "chatLockManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0ae1:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x0ae9:
            java.lang.Object r1 = r1.A00
            X.0eF r1 = (X.C08310eF) r1
            java.lang.String r0 = "voip/AppSettingsWarningDialogFragment/settings"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.03q r0 = r1.A0Q()
            if (r0 != 0) goto L_0x0b00
            java.lang.String r0 = "voip/AppSettingsWarningDialogFragment/settings activity is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0b00:
            X.C107395bF.A05(r0)
            return
        L_0x0b04:
            java.lang.Object r0 = r1.A00
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r0 = (com.whatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment) r0
            X.2p7 r2 = r0.A0A
            java.lang.String r1 = r0.A0J
            com.whatsapp.jid.UserJid r0 = r0.A0C
            r2.A00(r0, r1)
            return
        L_0x0b12:
            A02(r1)
            return
        L_0x0b16:
            java.lang.Object r1 = r1.A00
            com.whatsapp.calling.backwardcompat.BackwardCompatDialog r1 = (com.whatsapp.calling.backwardcompat.BackwardCompatDialog) r1
            X.2i5 r0 = r1.A00
            if (r0 == 0) goto L_0x0b2a
            android.net.Uri r0 = r0.A00()
            android.content.Intent r0 = X.C18310x6.A0D(r0)
            r1.A0m(r0)
            return
        L_0x0b2a:
            java.lang.String r0 = "upgrade"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0b32:
            java.lang.Object r0 = r1.A00
            com.whatsapp.blocklist.UnblockDialogFragment r0 = (com.whatsapp.blocklist.UnblockDialogFragment) r0
            X.49D r0 = r0.A00
            r0.BrK()
            return
        L_0x0b3c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog) r0
            r3.dismiss()
            X.66R r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r0
            X.4UC r1 = r0.A0C
            X.6vg r0 = X.C141506vg.CLOSE_SCREEN
            r1.A0H(r0)
            return
        L_0x0b53:
            java.lang.Object r6 = r1.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r6 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r6
            r0 = 4
            r6.A00 = r0
            X.30e r2 = r6.A06
            android.content.SharedPreferences r1 = r2.A00()
            r0 = 0
            java.lang.String r5 = "two_factor_auth_nag_interval"
            int r1 = r1.getInt(r5, r0)
            r0 = 2
            int r4 = java.lang.Math.max(r1, r0)
            android.content.SharedPreferences r0 = r2.A00()
            android.content.SharedPreferences$Editor r3 = r0.edit()
            X.2sH r0 = r2.A06
            long r1 = r0.A0H()
            java.lang.String r0 = "two_factor_auth_nag_time"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r1)
            android.content.SharedPreferences$Editor r1 = r0.putInt(r5, r4)
            java.lang.String r0 = "two_factor_auth_last_code_correctness"
            X.C18270x1.A0f(r1, r0)
            r6.A1W()
            return
        L_0x0b90:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            goto L_0x0bbf
        L_0x0b96:
            java.lang.Object r3 = r1.A00
            X.0eF r3 = (X.C08310eF) r3
            java.lang.String r0 = "delete-account-feedback/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.03q r0 = r3.A0Q()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.ChangeNumberOverview"
            r2.setClassName(r1, r0)
            r3.A0m(r2)
            return
        L_0x0bb4:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
            goto L_0x0bbf
        L_0x0bba:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
        L_0x0bbf:
            X.C621433s.A00(r1, r0)
            return
        L_0x0bc3:
            java.lang.Object r2 = r1.A00
            X.1qJ r2 = (X.C32381qJ) r2
            android.app.Activity r1 = r2.A01
            r0 = 103(0x67, float:1.44E-43)
            X.C621433s.A00(r1, r0)
            goto L_0x0c25
        L_0x0bcf:
            java.lang.Object r2 = r1.A00
            X.1qJ r2 = (X.C32381qJ) r2
            android.app.Activity r1 = r2.A01
            r0 = 107(0x6b, float:1.5E-43)
            X.C621433s.A00(r1, r0)
            goto L_0x0bfb
        L_0x0bdb:
            java.lang.Object r2 = r1.A00
            X.1qJ r2 = (X.C32381qJ) r2
            android.app.Activity r1 = r2.A01
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/checknorestore/restore"
            goto L_0x0c22
        L_0x0bea:
            java.lang.Object r2 = r1.A00
            X.1qJ r2 = (X.C32381qJ) r2
            android.app.Activity r1 = r2.A01
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/checknorestore/skiprestore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0bfb:
            r0 = 0
            r2.A00 = r0
            r2.BkT(r0, r0)
            return
        L_0x0c02:
            java.lang.Object r0 = r1.A00
            X.1qJ r0 = (X.C32381qJ) r0
            android.app.Activity r1 = r0.A01
            r0 = 105(0x69, float:1.47E-43)
            X.C621433s.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/restoreduetoerror/skiprestore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0c38
        L_0x0c14:
            java.lang.Object r2 = r1.A00
            X.1qJ r2 = (X.C32381qJ) r2
            android.app.Activity r1 = r2.A01
            r0 = 105(0x69, float:1.47E-43)
            X.C621433s.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/restoreduetoerror/restore"
        L_0x0c22:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0c25:
            r1 = 1
            r2.A00 = r1
            r0 = 0
            r2.BkT(r1, r0)
            return
        L_0x0c2d:
            java.lang.Object r0 = r1.A00
            X.1qJ r0 = (X.C32381qJ) r0
            android.app.Activity r1 = r0.A01
            r0 = 103(0x67, float:1.44E-43)
            X.C621433s.A00(r1, r0)
        L_0x0c38:
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A01(r1, r0)
            return
        L_0x0c3e:
            java.lang.Object r3 = r1.A00
            com.whatsapp.Main r3 = (com.whatsapp.Main) r3
            X.8qC r0 = r3.A0F
            java.lang.Object r0 = r0.get()
            X.2i5 r0 = (X.C50382i5) r0
            X.310 r0 = r0.A02
            java.lang.String r1 = "WhatsApp.upgrade"
            java.io.File r0 = X.AnonymousClass310.A00(r0)
            java.io.File r0 = X.AnonymousClass002.A0A(r0, r1)
            boolean r2 = r0.createNewFile()     // Catch:{ IOException -> 0x0c65 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0c65 }
            java.lang.String r0 = "upgrade sentinel file created; success="
            X.C18260x0.A1E(r0, r1, r2)     // Catch:{ IOException -> 0x0c65 }
            goto L_0x0c6c
        L_0x0c65:
            r1 = move-exception
            java.lang.String r0 = "upgrade/sentinel/fail"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0c6c:
            r0 = 0
            X.C621433s.A00(r3, r0)
            r3.A7A()
            return
        L_0x0c74:
            java.lang.Object r3 = r1.A00
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)
            r1 = 0
            java.lang.String r0 = "application/vnd.android.package-archive"
            android.content.Intent r1 = r2.setDataAndType(r1, r0)
            r0 = 1
            android.content.Intent r0 = r1.setFlags(r0)
            r3.startActivity(r0)
            r0 = 0
            X.C621433s.A00(r3, r0)
            r3.finish()
            return
        L_0x0c95:
            java.lang.Object r4 = r1.A00
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.03q r3 = r4.A0Q()
            if (r3 == 0) goto L_0x0cad
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "is_reset"
            r0 = 1
            r2.putExtra(r1, r0)
            r0 = -1
            r3.setResult(r0, r2)
        L_0x0cad:
            r4.A1L()
            return
        L_0x0cb1:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0cb9:
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ all -> 0x0cc0 }
            throw r0     // Catch:{ all -> 0x0cc0 }
        L_0x0cc0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0cc2 }
        L_0x0cc2:
            r0 = move-exception
            throw r0
        L_0x0cc4:
            r1.Bdx()
            return
        L_0x0cc8:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0ccf:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0cd6:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0cdd:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0ce4:
            r0 = 0
            X.C621433s.A01(r5, r0)
            X.2a4 r0 = r5.A06
            if (r0 == 0) goto L_0x0d25
            X.3U2 r4 = new X.3U2
            r4.<init>(r5)
            java.lang.String r3 = "gcm"
            r9 = 1
            X.31C r5 = r0.A02
            java.lang.String r8 = r5.A03()
            r0 = 17
            X.1wk r2 = new X.1wk
            r2.<init>((java.lang.String) r8, (int) r0)
            X.1x3 r1 = new X.1x3
            r1.<init>(r3)
            X.1xJ r0 = new X.1xJ
            r0.<init>((X.C35361wk) r2, (X.AnonymousClass4GI) r1)
            X.36K r7 = X.C41032Ir.A05(r0)
            r0 = 9
            X.4KQ r6 = new X.4KQ
            r6.<init>(r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Sending clear config for platform:"
            X.C18260x0.A0q(r0, r3, r1)
            r10 = 32000(0x7d00, double:1.581E-319)
            r5.A0K(r6, r7, r8, r9, r10)
            return
        L_0x0d25:
            java.lang.String r0 = "pushXmppMethods"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0d2d:
            java.lang.String r0 = "accountSwitcherBridge"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0d34:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85804Hr.onClick(android.content.DialogInterface, int):void");
    }
}
