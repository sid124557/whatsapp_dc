package X;

import android.widget.RadioButton;

/* renamed from: X.4K2  reason: invalid class name */
public class AnonymousClass4K2 implements C15930sC {
    public Object A00;
    public final int A01;

    public AnonymousClass4K2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C15910sA r1, C06270Wx r2, Object obj, int i) {
        r2.A0B(r1, new AnonymousClass4K2(obj, i));
    }

    public static void A01(C06270Wx r1, AnonymousClass08J r2, Object obj, int i) {
        r2.A0J(r1, new AnonymousClass4K2(obj, i));
    }

    public static final void A02(AnonymousClass4K2 r3) {
        AnonymousClass12W r32 = (AnonymousClass12W) r3.A00;
        boolean z = r32.A00.A00;
        RadioButton radioButton = r32.A01;
        if (z != radioButton.isChecked()) {
            radioButton.setChecked(r32.A00.A00);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v596, resolved type: X.122} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v687, resolved type: X.4Wb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v690, resolved type: X.11r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v119, resolved type: com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v116, resolved type: com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v120, resolved type: com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v289, resolved type: com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v693, resolved type: X.122} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v694, resolved type: X.122} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v695, resolved type: X.122} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02cc, code lost:
        if (r1.isFinishing() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ce, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02d0, code lost:
        r0 = r1.A06;
        r0.A01 = r3;
        r0.A0K();
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02d7, code lost:
        r0.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e7, code lost:
        if (X.AnonymousClass001.A1Z(r3.A0z.A07()) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0bb9, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0bbc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0cd7, code lost:
        r1.A79(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0cda, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0cfc, code lost:
        X.C06270Wx.A04(r0.A09, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0d02, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0d61, code lost:
        r3.A7n(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0d64, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0d94, code lost:
        r3.A7H();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0d97, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0d9a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0dbb, code lost:
        X.C621433s.A00(r1, r0);
        r1.A7l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0dc1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0e13, code lost:
        ((android.app.Activity) r0).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0e18, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0e48, code lost:
        r4 = X.AnonymousClass0x9.A09("android.intent.action.SEND");
        r4.setType("application/zip");
        r4.putExtra("android.intent.extra.STREAM", com.whatsapp.contentprovider.MediaProvider.A06("business_activity_report", r3));
        r4.putExtra("android.intent.extra.SUBJECT", r5.getString(com.whatsapp.R.string.f11nameremoved));
        r4.addFlags(524288);
        r5.startActivity(android.content.Intent.createChooser(r4, r5.getString(com.whatsapp.R.string.f11nameremoved)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0e7a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0ef8, code lost:
        r2.A1O(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0efb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x10c7, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x10ca, code lost:
        r3.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x10cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x11ce, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x11d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x1359, code lost:
        r3.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x135c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:611:0x0fe0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BOf(java.lang.Object r24) {
        /*
            r23 = this;
            r3 = r24
            r1 = r23
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0009;
                case 2: goto L_0x0009;
                case 3: goto L_0x0009;
                case 4: goto L_0x07b1;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x004f;
                case 8: goto L_0x0074;
                case 9: goto L_0x0009;
                case 10: goto L_0x0009;
                case 11: goto L_0x0009;
                case 12: goto L_0x00a8;
                case 13: goto L_0x0011;
                case 14: goto L_0x0009;
                case 15: goto L_0x00be;
                case 16: goto L_0x0009;
                case 17: goto L_0x0009;
                case 18: goto L_0x07dc;
                case 19: goto L_0x07f9;
                case 20: goto L_0x0009;
                case 21: goto L_0x0847;
                case 22: goto L_0x0854;
                case 23: goto L_0x085c;
                case 24: goto L_0x0854;
                case 25: goto L_0x0864;
                case 26: goto L_0x086c;
                case 27: goto L_0x0874;
                case 28: goto L_0x08cc;
                case 29: goto L_0x0009;
                case 30: goto L_0x0009;
                case 31: goto L_0x0009;
                case 32: goto L_0x00cc;
                case 33: goto L_0x08cc;
                case 34: goto L_0x08d4;
                case 35: goto L_0x00fe;
                case 36: goto L_0x08e3;
                case 37: goto L_0x08fe;
                case 38: goto L_0x0150;
                case 39: goto L_0x0932;
                case 40: goto L_0x0289;
                case 41: goto L_0x0009;
                case 42: goto L_0x0009;
                case 43: goto L_0x0009;
                case 44: goto L_0x0009;
                case 45: goto L_0x0009;
                case 46: goto L_0x0009;
                case 47: goto L_0x0009;
                case 48: goto L_0x0009;
                case 49: goto L_0x093a;
                case 50: goto L_0x0949;
                case 51: goto L_0x0960;
                case 52: goto L_0x0949;
                case 53: goto L_0x0974;
                case 54: goto L_0x097e;
                case 55: goto L_0x099b;
                case 56: goto L_0x09b6;
                case 57: goto L_0x02ac;
                case 58: goto L_0x02b3;
                case 59: goto L_0x02db;
                case 60: goto L_0x10db;
                case 61: goto L_0x09c0;
                case 62: goto L_0x09ce;
                case 63: goto L_0x030b;
                case 64: goto L_0x09d8;
                case 65: goto L_0x09f3;
                case 66: goto L_0x0333;
                case 67: goto L_0x0345;
                case 68: goto L_0x0377;
                case 69: goto L_0x0385;
                case 70: goto L_0x03ac;
                case 71: goto L_0x0009;
                case 72: goto L_0x09fd;
                case 73: goto L_0x0a23;
                case 74: goto L_0x0a34;
                case 75: goto L_0x0854;
                case 76: goto L_0x0a55;
                case 77: goto L_0x0a82;
                case 78: goto L_0x0aa4;
                case 79: goto L_0x0ab3;
                case 80: goto L_0x03c2;
                case 81: goto L_0x03d2;
                case 82: goto L_0x0ad0;
                case 83: goto L_0x0ae2;
                case 84: goto L_0x0b48;
                case 85: goto L_0x03eb;
                case 86: goto L_0x0b6b;
                case 87: goto L_0x0854;
                case 88: goto L_0x0854;
                case 89: goto L_0x0405;
                case 90: goto L_0x041d;
                case 91: goto L_0x0ba5;
                case 92: goto L_0x0009;
                case 93: goto L_0x0009;
                case 94: goto L_0x0009;
                case 95: goto L_0x0009;
                case 96: goto L_0x0009;
                case 97: goto L_0x0009;
                case 98: goto L_0x0009;
                case 99: goto L_0x0009;
                case 100: goto L_0x0009;
                case 101: goto L_0x0009;
                case 102: goto L_0x0009;
                case 103: goto L_0x0009;
                case 104: goto L_0x0009;
                case 105: goto L_0x0009;
                case 106: goto L_0x0009;
                case 107: goto L_0x0009;
                case 108: goto L_0x0009;
                case 109: goto L_0x0009;
                case 110: goto L_0x0009;
                case 111: goto L_0x0009;
                case 112: goto L_0x0009;
                case 113: goto L_0x0009;
                case 114: goto L_0x0009;
                case 115: goto L_0x0009;
                case 116: goto L_0x0ba9;
                case 117: goto L_0x0009;
                case 118: goto L_0x0009;
                case 119: goto L_0x0009;
                case 120: goto L_0x0009;
                case 121: goto L_0x0009;
                case 122: goto L_0x0009;
                case 123: goto L_0x001d;
                case 124: goto L_0x0bb1;
                case 125: goto L_0x0bbd;
                case 126: goto L_0x0bf8;
                case 127: goto L_0x0009;
                case 128: goto L_0x0009;
                case 129: goto L_0x0433;
                case 130: goto L_0x055c;
                case 131: goto L_0x0c10;
                case 132: goto L_0x0c37;
                case 133: goto L_0x0c5b;
                case 134: goto L_0x0c65;
                case 135: goto L_0x119c;
                case 136: goto L_0x0c71;
                case 137: goto L_0x058a;
                case 138: goto L_0x0c7a;
                case 139: goto L_0x0c84;
                case 140: goto L_0x05af;
                case 141: goto L_0x0ca3;
                case 142: goto L_0x0d03;
                case 143: goto L_0x05f0;
                case 144: goto L_0x00be;
                case 145: goto L_0x00be;
                case 146: goto L_0x0623;
                case 147: goto L_0x00be;
                case 148: goto L_0x064a;
                case 149: goto L_0x00be;
                case 150: goto L_0x0d0b;
                case 151: goto L_0x0d13;
                case 152: goto L_0x0d1b;
                case 153: goto L_0x0d23;
                case 154: goto L_0x0d4a;
                case 155: goto L_0x0d51;
                case 156: goto L_0x0da3;
                case 157: goto L_0x0dab;
                case 158: goto L_0x0db5;
                case 159: goto L_0x0dc2;
                case 160: goto L_0x0009;
                case 161: goto L_0x0dd6;
                case 162: goto L_0x0df9;
                case 163: goto L_0x0009;
                case 164: goto L_0x0009;
                case 165: goto L_0x0009;
                case 166: goto L_0x0009;
                case 167: goto L_0x0009;
                case 168: goto L_0x0009;
                case 169: goto L_0x0009;
                case 170: goto L_0x0009;
                case 171: goto L_0x0009;
                case 172: goto L_0x0009;
                case 173: goto L_0x0009;
                case 174: goto L_0x0009;
                case 175: goto L_0x0669;
                case 176: goto L_0x0009;
                case 177: goto L_0x1118;
                case 178: goto L_0x0e02;
                case 179: goto L_0x0e0a;
                case 180: goto L_0x0e0d;
                case 181: goto L_0x0e19;
                case 182: goto L_0x0e27;
                case 183: goto L_0x0e27;
                case 184: goto L_0x068e;
                case 185: goto L_0x0e38;
                case 186: goto L_0x069f;
                case 187: goto L_0x0e42;
                case 188: goto L_0x0e7b;
                case 189: goto L_0x06f9;
                case 190: goto L_0x0009;
                case 191: goto L_0x0eb0;
                case 192: goto L_0x0ec6;
                case 193: goto L_0x0ee9;
                case 194: goto L_0x0efc;
                case 195: goto L_0x0f0d;
                case 196: goto L_0x0722;
                case 197: goto L_0x0fa0;
                case 198: goto L_0x130b;
                case 199: goto L_0x0799;
                case 200: goto L_0x101c;
                case 201: goto L_0x1035;
                case 202: goto L_0x1056;
                case 203: goto L_0x10b6;
                case 204: goto L_0x10bf;
                case 205: goto L_0x0009;
                case 206: goto L_0x10ce;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.4GQ r0 = (X.AnonymousClass4GQ) r0
            r0.invoke(r3)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r1.A00
            com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = (com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment) r0
            java.util.List r3 = (java.util.List) r3
            X.11r r0 = r0.A01
            r0.A00 = r3
            goto L_0x02d7
        L_0x001d:
            java.lang.Object r0 = r1.A00
            X.4Wb r0 = (X.C87774Wb) r0
            java.util.List r3 = (java.util.List) r3
            r0.A02 = r3
            goto L_0x02d7
        L_0x0027:
            java.lang.Object r2 = r1.A00
            X.1FB r2 = (X.AnonymousClass1FB) r2
            int r0 = X.AnonymousClass001.A0K(r3)
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "VerifyMessageStoreActivity/messagestoreverified/missing-params bounce to regphone"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.8qC r0 = r2.A74()
            java.lang.Object r1 = r0.get()
            X.317 r1 = (X.AnonymousClass317) r1
            r0 = 1
            r1.A0B(r0, r0)
            android.content.Intent r0 = X.C627736r.A04(r2)
            r2.startActivity(r0)
            r2.finish()
            return
        L_0x004f:
            java.lang.Object r2 = r1.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0010
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Intent r1 = X.C18300x5.A07(r0)
            java.lang.String r0 = "com.whatsapp.intent.action.CHATS"
            android.content.Intent r0 = r1.setAction(r0)
            r2.finish()
            r2.startActivity(r0)
            r0 = 0
            r2.overridePendingTransition(r0, r0)
            return
        L_0x0074:
            java.lang.Object r2 = r1.A00
            X.4ea r2 = (X.C89654ea) r2
            int r1 = X.AnonymousClass001.A0K(r3)
            r0 = 5
            if (r1 == r0) goto L_0x114d
            r0 = 2
            if (r1 == r0) goto L_0x114d
            if (r1 == 0) goto L_0x114d
            r0 = 4
            if (r1 != r0) goto L_0x008e
            r0 = 2131624034(0x7f0e0062, float:1.8875236E38)
            r2.setContentView((int) r0)
            return
        L_0x008e:
            r0 = 3
            if (r1 != r0) goto L_0x0010
            r0 = 2131624034(0x7f0e0062, float:1.8875236E38)
            r2.setContentView((int) r0)
            r0 = 10485760(0xa00000, double:5.180654E-317)
            android.content.Intent r1 = X.C627736r.A0D(r2, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r1.setFlags(r0)
            r2.startActivity(r0)
            return
        L_0x00a8:
            java.lang.Object r2 = r1.A00
            X.4ea r2 = (X.C89654ea) r2
            int r0 = X.AnonymousClass001.A0K(r3)
            if (r0 != 0) goto L_0x0010
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryEducationNuxFragment r1 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryEducationNuxFragment
            r1.<init>()
            java.lang.String r0 = "nux_tag"
            r2.Bon(r1, r0)
            return
        L_0x00be:
            java.lang.Object r1 = r1.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A16()
            if (r0 == 0) goto L_0x0010
            r1.A1K()
            return
        L_0x00cc:
            java.lang.Object r3 = r1.A00
            X.11H r3 = (X.AnonymousClass11H) r3
            X.107 r0 = r3.A10
            java.lang.Object r0 = r0.A07()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 != 0) goto L_0x00e9
            X.107 r0 = r3.A0z
            java.lang.Object r0 = r0.A07()
            boolean r1 = X.AnonymousClass001.A1Z(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00ea
        L_0x00e9:
            r0 = 1
        L_0x00ea:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.08J r1 = r3.A0B
            java.lang.Object r0 = r1.A07()
            boolean r0 = X.AnonymousClass75J.A00(r2, r0)
            if (r0 != 0) goto L_0x0010
            r1.A0H(r2)
            return
        L_0x00fe:
            java.lang.Object r5 = r1.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r5 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r5
            X.1eG r3 = (X.C27641eG) r3
            if (r3 == 0) goto L_0x0010
            int r4 = r3.A00
            int r3 = r3.A01
            if (r4 >= r3) goto L_0x0137
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131755345(0x7f100151, float:1.9141567E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            X.AnonymousClass000.A1L(r0, r4)
            X.AnonymousClass000.A1M(r0, r3)
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)
            r5.BjL()
            X.0zH r0 = X.C19340zH.A00(r5, r0)
            X.C19340zH.A02(r5, r0)
            r0.A0S()
        L_0x012e:
            X.11H r0 = r5.A0B
            X.08M r1 = r0.A0I
            r0 = 0
            r1.A0G(r0)
            return
        L_0x0137:
            r5.BjL()
            android.view.View r2 = r5.A00
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131755344(0x7f100150, float:1.9141565E38)
            java.lang.String r1 = r1.getQuantityString(r0, r3)
            r0 = -1
            X.4ab r0 = X.C88694ab.A01(r2, r1, r0)
            r0.A05()
            goto L_0x012e
        L_0x0150:
            java.lang.Object r5 = r1.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r5 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r5
            X.1eH r3 = (X.C27651eH) r3
            r5.BjL()
            if (r3 != 0) goto L_0x016b
            r0 = 2131893926(0x7f121ea6, float:1.9422642E38)
            java.lang.String r1 = r5.getString(r0)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r1, r0)
            r0.show()
            return
        L_0x016b:
            X.2oJ r2 = r5.A0N
            long r6 = android.os.SystemClock.uptimeMillis()
            long r0 = r5.A01
            long r6 = r6 - r0
            r0 = 12
            r2.A00(r0, r6)
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            java.util.Set r0 = r3.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0183:
            boolean r0 = r4.hasNext()
            r7 = -1
            if (r0 == 0) goto L_0x01a5
            android.util.Pair r2 = X.AnonymousClass0x9.A0D(r4)
            java.lang.Object r1 = r2.second
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r7 == r0) goto L_0x0183
            java.util.List r1 = X.C18280x3.A0k(r1, r6)
            java.lang.Object r0 = r2.first
            X.C626936e.A06(r0)
            r1.add(r0)
            goto L_0x0183
        L_0x01a5:
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x01e0
            r0 = 406(0x196, float:5.69E-43)
            java.lang.Object r10 = X.C18290x4.A0j(r6, r0)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x0227
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x0227
            int r0 = r10.size()
            r9 = 0
            r8 = 1
            if (r0 != r8) goto L_0x020e
            X.2ss r1 = r5.A0H
            java.lang.Object r0 = r10.get(r9)
            X.4uZ r0 = (X.C95814uZ) r0
            java.lang.String r1 = r1.A0D(r0)
            if (r1 == 0) goto L_0x020e
            r0 = 2131889317(0x7f120ca5, float:1.9413294E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r5, r1, r8, r0)
        L_0x01d8:
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r1, r0)
            r0.show()
        L_0x01e0:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Set r0 = r3.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x01ea:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022f
            android.util.Pair r2 = X.AnonymousClass0x9.A0D(r3)
            int r0 = X.C18290x4.A03(r2)
            if (r7 == r0) goto L_0x01ea
            X.3Ex r1 = r5.A0D
            java.lang.Object r0 = r2.first
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r1 = r1.A0A(r0)
            X.5ZU r0 = r5.A0E
            java.lang.String r0 = r0.A0H(r1)
            r6.add(r0)
            goto L_0x01ea
        L_0x020e:
            android.content.res.Resources r6 = r5.getResources()
            r4 = 2131755120(0x7f100070, float:1.914111E38)
            int r2 = r10.size()
            java.lang.Object[] r1 = new java.lang.Object[r8]
            int r0 = r10.size()
            X.AnonymousClass000.A1P(r1, r0, r9)
            java.lang.String r1 = r6.getQuantityString(r4, r2, r1)
            goto L_0x01d8
        L_0x0227:
            r0 = 2131893926(0x7f121ea6, float:1.9422642E38)
            java.lang.String r1 = r5.getString(r0)
            goto L_0x01d8
        L_0x022f:
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x0010
            X.1VX r2 = r5.A0D
            r1 = 5021(0x139d, float:7.036E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0010
            int r1 = r6.size()
            if (r1 == 0) goto L_0x0010
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L_0x027d
            r3 = 2
            if (r1 == r3) goto L_0x0274
            r0 = 3
            if (r1 == r0) goto L_0x0267
            r2 = 2131890480(0x7f121130, float:1.9415653E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.C18280x3.A1M(r6, r1)
            int r0 = X.AnonymousClass0x9.A03(r6, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0261:
            r1[r3] = r0
        L_0x0263:
            r5.Box(r1, r4, r2)
            return
        L_0x0267:
            r2 = 2131890482(0x7f121132, float:1.9415657E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.C18280x3.A1M(r6, r1)
            java.lang.Object r0 = r6.get(r3)
            goto L_0x0261
        L_0x0274:
            r2 = 2131890483(0x7f121133, float:1.941566E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.C18280x3.A1M(r6, r1)
            goto L_0x0263
        L_0x027d:
            r2 = 2131890481(0x7f121131, float:1.9415655E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r0 = r6.get(r4)
            r1[r4] = r0
            goto L_0x0263
        L_0x0289:
            java.lang.Object r2 = r1.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r2 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r2
            int r1 = X.AnonymousClass001.A0K(r3)
            r2.BjL()
            if (r1 == 0) goto L_0x0010
            X.0zH r0 = X.AnonymousClass5V0.A00(r2)
            X.C19340zH.A01(r2, r0, r1)
            X.C19340zH.A02(r2, r0)
            r0.A0S()
            X.11H r0 = r2.A0B
            X.08M r1 = r0.A0H
            r0 = 0
            X.C06270Wx.A04(r1, r0)
            return
        L_0x02ac:
            java.lang.Object r1 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r1 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r1
            java.util.List r3 = (java.util.List) r3
            goto L_0x02c8
        L_0x02b3:
            java.lang.Object r1 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r1 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x0010
            java.util.List r0 = java.util.Collections.emptyList()
            r1.A74(r0)
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x02c8:
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x0010
            if (r3 == 0) goto L_0x0010
            X.122 r0 = r1.A06
            r0.A01 = r3
            r0.A0K()
        L_0x02d7:
            r0.A05()
            return
        L_0x02db:
            java.lang.Object r6 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r6 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r6
            int r1 = r6.A00
            r0 = 5
            if (r1 != r0) goto L_0x0010
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x0010
            r5 = 1
            r6.A0K = r5
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r4 = r6.A08
            X.2iG r0 = r6.A09
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r0.A0A
            boolean r3 = r0.A01()
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r6.A0A
            int r2 = r0.A0D()
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r6.A0A
            X.3Mg r0 = r0.A05
            X.3Mh r1 = r0.A00
            X.1Ek r0 = X.C66663Mh.A1H
            int r0 = r1.A03(r0)
            r4.A0F(r2, r0, r5, r3)
            return
        L_0x030b:
            java.lang.Object r0 = r1.A00
            X.2iG r0 = (X.C50492iG) r0
            if (r24 == 0) goto L_0x0010
            r1 = 1
            X.4eZ r4 = r0.A05
            r0 = 2131890437(0x7f121105, float:1.9415566E38)
            java.lang.String r2 = X.AnonymousClass0x2.A0X(r4, r3, r1, r0)
            r0 = 2131890436(0x7f121104, float:1.9415564E38)
            java.lang.String r1 = r4.getString(r0)
            X.0zH r0 = X.AnonymousClass5V0.A00(r4)
            r0.A0h(r2)
            r0.A0g(r1)
            X.C19340zH.A06(r0)
            r0.A0S()
            return
        L_0x0333:
            java.lang.Object r0 = r1.A00
            X.2iG r0 = (X.C50492iG) r0
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x0010
            X.4eZ r1 = r0.A05
            int r0 = r3.intValue()
            r1.Bot(r0)
            return
        L_0x0345:
            java.lang.Object r2 = r1.A00
            X.2iG r2 = (X.C50492iG) r2
            X.4eZ r0 = r2.A05
            X.0df r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "wifi_speed_bump_dialog"
            X.0eF r1 = r1.A0D(r0)
            boolean r0 = r1 instanceof com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            if (r1 == 0) goto L_0x0010
            android.app.Dialog r0 = r1.A03
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0010
            r1.A1K()
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r1 = r2.A06
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r2.A0A
            boolean r0 = r0.A01()
            r1.A0H(r0)
            return
        L_0x0377:
            java.lang.Object r0 = r1.A00
            X.2iG r0 = (X.C50492iG) r0
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x0010
            X.49W r0 = r0.A07
            r0.Bre(r3)
            return
        L_0x0385:
            java.lang.Object r4 = r1.A00
            X.2iG r4 = (X.C50492iG) r4
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x0010
            boolean r1 = r3.booleanValue()
            android.app.ProgressDialog r0 = r4.A00
            if (r1 == 0) goto L_0x039e
            if (r0 == 0) goto L_0x1166
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x1166
            return
        L_0x039e:
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0010
            android.app.ProgressDialog r0 = r4.A00
            r0.dismiss()
            return
        L_0x03ac:
            java.lang.Object r0 = r1.A00
            X.2iG r0 = (X.C50492iG) r0
            X.0PJ r3 = (X.AnonymousClass0PJ) r3
            if (r3 == 0) goto L_0x0010
            X.4eZ r2 = r0.A05
            java.lang.Object r1 = r3.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r3.A01
            java.lang.String r0 = (java.lang.String) r0
            r2.Bov(r1, r0)
            return
        L_0x03c2:
            java.lang.Object r1 = r1.A00
            com.whatsapp.StarRatingBar r1 = (com.whatsapp.StarRatingBar) r1
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x0010
            int r0 = r3.intValue()
            r1.setRating(r0)
            return
        L_0x03d2:
            java.lang.Object r0 = r1.A00
            X.5l7 r0 = (X.C113245l7) r0
            com.whatsapp.conversation.ConversationListView r2 = r0.A2f
            X.4uZ r0 = r0.A4J
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0010
            r1 = 9
            X.5rM r0 = new X.5rM
            r0.<init>(r2, r1)
            r2.post(r0)
            return
        L_0x03eb:
            java.lang.Object r0 = r1.A00
            X.5l7 r0 = (X.C113245l7) r0
            X.34x r3 = (X.C624134x) r3
            if (r3 == 0) goto L_0x0010
            X.4uZ r4 = r0.A4J
            X.676 r0 = r0.A2z
            X.4eZ r0 = r0.getActivity()
            X.0df r1 = r0.getSupportFragmentManager()
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            goto L_0x1185
        L_0x0405:
            java.lang.Object r4 = r1.A00
            X.15W r4 = (X.AnonymousClass15W) r4
            if (r24 == 0) goto L_0x0010
            X.5Py r3 = r4.A06
            X.4uZ r0 = r4.A0A
            java.lang.String r2 = r0.getRawString()
            r1 = 4
            r0 = 1
            r3.A00(r1, r2, r0)
            android.view.View r1 = r4.A00
            r0 = 0
            goto L_0x11ce
        L_0x041d:
            java.lang.Object r2 = r1.A00
            X.2O0 r2 = (X.AnonymousClass2O0) r2
            boolean r1 = X.AnonymousClass000.A1Y(r3, r2)
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x0010
            r2.A00 = r1
            if (r1 == 0) goto L_0x0010
            X.08M r0 = r2.A01
            r0.A0G(r2)
            return
        L_0x0433:
            java.lang.Object r7 = r1.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r7 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r7
            if (r24 != 0) goto L_0x043f
            java.lang.String r0 = "ExportMigrationActivity/onCurrentScreenChanged/screen is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x043f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExportMigrationActivity/onCurrentScreenChanged/screen="
            X.C18260x0.A1R(r1, r0, r3)
            com.whatsapp.migration.export.ui.ExportMigrationViewModel r0 = r7.A0E
            X.7Q5 r6 = r0.A05
            int r4 = r6.A03
            int r2 = r6.A06
            int r9 = r6.A00
            int r8 = r6.A04
            int r5 = r6.A0A
            com.whatsapp.WaTextView r1 = r7.A05
            int r0 = r6.A08
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r7.A04
            int r0 = r6.A07
            r1.setText(r0)
            if (r9 != 0) goto L_0x04d0
            r0 = 2131890827(0x7f12128b, float:1.9416357E38)
            java.lang.String r0 = r7.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r12 = X.C18330xA.A00(r0)
            int r1 = r12.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r13 = 0
            java.lang.Object[] r11 = r12.getSpans(r13, r1, r0)
            android.text.style.URLSpan[] r11 = (android.text.style.URLSpan[]) r11
            if (r11 == 0) goto L_0x04b4
            int r0 = r11.length
            r16 = r0
        L_0x0487:
            r0 = r16
            if (r13 >= r0) goto L_0x04b4
            r1 = r11[r13]
            java.lang.String r10 = r1.getURL()
            java.lang.String r0 = "edit-number"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x04b1
            int r15 = r12.getSpanStart(r1)
            int r14 = r12.getSpanEnd(r1)
            int r10 = r12.getSpanFlags(r1)
            r12.removeSpan(r1)
            r1 = 1
            X.4Gy r0 = new X.4Gy
            r0.<init>(r7, r1)
            r12.setSpan(r0, r15, r14, r10)
        L_0x04b1:
            int r13 = r13 + 1
            goto L_0x0487
        L_0x04b4:
            com.whatsapp.WaTextView r0 = r7.A02
            r0.setText(r12)
            com.whatsapp.WaTextView r1 = r7.A02
            int r0 = X.C18290x4.A00(r7)
            int r0 = X.AnonymousClass0Y8.A04(r7, r0)
            r1.setLinkTextColor(r0)
            com.whatsapp.WaTextView r1 = r7.A02
            android.text.method.LinkMovementMethod r0 = new android.text.method.LinkMovementMethod
            r0.<init>()
            r1.setMovementMethod(r0)
        L_0x04d0:
            com.whatsapp.WaTextView r0 = r7.A02
            r0.setVisibility(r9)
            if (r4 != 0) goto L_0x04e5
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0H
            int r0 = r6.A02
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0H
            r0 = 37
            X.C18310x6.A19(r1, r7, r3, r0)
        L_0x04e5:
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A0H
            r0.setVisibility(r4)
            if (r2 != 0) goto L_0x04fa
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0I
            int r0 = r6.A05
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0I
            r0 = 38
            X.C18310x6.A19(r1, r7, r3, r0)
        L_0x04fa:
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A0I
            r0.setVisibility(r2)
            X.1VX r1 = r7.A0D
            r0 = 3005(0xbbd, float:4.211E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r0 = r1.A0Y(r2, r0)
            if (r0 == 0) goto L_0x053e
            X.1VX r1 = r7.A0D
            r0 = 3666(0xe52, float:5.137E-42)
            boolean r0 = r1.A0Y(r2, r0)
            if (r0 == 0) goto L_0x053e
            com.whatsapp.WaNetworkResourceImageView r2 = r7.A01
            java.lang.String r1 = r6.A0B
            r0 = 1
            r2.A07(r1, r0)
        L_0x051d:
            com.whatsapp.components.RoundCornerProgressBar r0 = r7.A09
            r0.setVisibility(r8)
            com.whatsapp.WaTextView r0 = r7.A03
            r0.setVisibility(r8)
            if (r8 != 0) goto L_0x052f
            com.whatsapp.components.RoundCornerProgressBar r1 = r7.A09
            r0 = 0
            r1.setProgress(r0)
        L_0x052f:
            com.whatsapp.WaTextView r0 = r7.A06
            r0.setVisibility(r5)
            if (r5 != 0) goto L_0x0010
            com.whatsapp.WaTextView r1 = r7.A06
            int r0 = r6.A09
            r1.setText(r0)
            return
        L_0x053e:
            com.whatsapp.WaNetworkResourceImageView r4 = r7.A01
            int r3 = r6.A01
            android.content.res.Resources r1 = r7.getResources()
            r0 = 0
            X.0AQ r2 = X.AnonymousClass0AQ.A03(r0, r1, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExportMigrationActivity/getVectorDrawable/drawableId is invalid/drawableId = "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            X.C626936e.A07(r2, r0)
            r4.setImageDrawable(r2)
            goto L_0x051d
        L_0x055c:
            java.lang.Object r4 = r1.A00
            android.content.Context r4 = (android.content.Context) r4
            int r1 = X.AnonymousClass001.A0K(r3)
            r0 = 1
            if (r1 != r0) goto L_0x0010
            java.lang.String r0 = "ExportMigrationActivity/onError/unknown-error"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 2131890843(0x7f12129b, float:1.941639E38)
            java.lang.String r0 = r4.getString(r0)
            X.0zH r3 = X.C19340zH.A00(r4, r0)
            r0 = 0
            r3.A0i(r0)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 44
            X.90b r0 = new X.90b
            r0.<init>(r4, r1)
            r3.A0Y(r0, r2)
            goto L_0x1359
        L_0x058a:
            java.lang.Object r1 = r1.A00
            X.1gh r1 = (X.C28341gh) r1
            boolean r0 = X.AnonymousClass001.A1Z(r3)
            if (r0 == 0) goto L_0x0010
            X.0O1 r4 = r1.A0F
            r3 = 2131887732(0x7f120674, float:1.941008E38)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.migration.transfer.ui.P2pTransferQrScannerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "hint"
            r2.putExtra(r0, r3)
            r4.A01(r2)
            return
        L_0x05af:
            java.lang.Object r4 = r1.A00
            X.1gh r4 = (X.C28341gh) r4
            boolean r0 = X.AnonymousClass001.A1Z(r3)
            if (r0 == 0) goto L_0x0010
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A0D
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A0D
            r0 = 2131894489(0x7f1220d9, float:1.9423784E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A0D
            r0 = 4
            X.C18300x5.A19(r1, r4, r0)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r4.A09
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x11d2
            com.whatsapp.WaTextView r1 = r4.A03
            r0 = 8
            r1.setVisibility(r0)
            r7 = 2131887700(0x7f120654, float:1.9410014E38)
            r8 = 2131887699(0x7f120653, float:1.9410012E38)
            r9 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r10 = 0
            r6 = 0
            r11 = 1
            X.2T5 r5 = new X.2T5
            r12 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.A7A(r5)
            return
        L_0x05f0:
            java.lang.Object r5 = r1.A00
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r5 = (com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog) r5
            boolean r0 = r5.A16()
            if (r0 == 0) goto L_0x0010
            X.66R r4 = r5.A01
            java.lang.Object r1 = r4.getValue()
            X.21J r0 = X.AnonymousClass21J.NOT_SUPPORTED
            if (r1 == r0) goto L_0x061f
            X.4Aq r3 = r5.A00
            if (r3 == 0) goto L_0x061f
            X.66R r0 = r5.A04
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r4.getValue()
            X.21J r1 = (X.AnonymousClass21J) r1
            X.66R r0 = r5.A02
            java.lang.String r0 = X.AnonymousClass0x9.A13(r0)
            r3.Bek(r1, r0, r2)
        L_0x061f:
            r5.A1K()
            return
        L_0x0623:
            java.lang.Object r3 = r1.A00
            com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment r3 = (com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment) r3
            boolean r0 = r3.A16()
            if (r0 == 0) goto L_0x0010
            X.66R r0 = r3.A01
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            if (r2 == 0) goto L_0x0646
            X.03q r1 = r3.A0Q()
            boolean r0 = r1 instanceof X.C84014Ar
            if (r0 == 0) goto L_0x0646
            X.4Ar r1 = (X.C84014Ar) r1
            if (r1 == 0) goto L_0x0646
            r1.BRM(r2)
        L_0x0646:
            r3.A1K()
            return
        L_0x064a:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.multiadmin.RevokeNewsletterAdminInviteDialogFragment r2 = (com.whatsapp.newsletter.multiadmin.RevokeNewsletterAdminInviteDialogFragment) r2
            boolean r0 = r2.A16()
            if (r0 == 0) goto L_0x0010
            X.66R r0 = r2.A01
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x0665
            X.4As r0 = r2.A00
            if (r0 == 0) goto L_0x0665
            r0.Bae(r1)
        L_0x0665:
            r2.A1K()
            return
        L_0x0669:
            java.lang.Object r4 = r1.A00
            X.4ea r4 = (X.C89654ea) r4
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x0010
            X.3Wi r0 = r4.A05
            r0.A0D()
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x0684
            r0 = -1
            r4.setResult(r0)
        L_0x0680:
            r4.finish()
            return
        L_0x0684:
            X.3Wi r2 = r4.A05
            r1 = 2131887810(0x7f1206c2, float:1.9410238E38)
            r0 = 1
            r2.A0H(r1, r0)
            goto L_0x0680
        L_0x068e:
            java.lang.Object r1 = r1.A00
            X.10z r1 = (X.AnonymousClass10z) r1
            int r0 = X.AnonymousClass001.A0K(r3)
            if (r0 != 0) goto L_0x0010
            X.08J r1 = r1.A02
            r0 = 0
            X.C06270Wx.A03(r1, r0)
            return
        L_0x069f:
            java.lang.Object r2 = r1.A00
            com.whatsapp.report.ReportActivity r2 = (com.whatsapp.report.ReportActivity) r2
            int r1 = X.AnonymousClass001.A0K(r3)
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r2.A05
            X.2qI r0 = r0.A05
            X.7xn r0 = r0.A01()
            if (r0 == 0) goto L_0x06f6
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r2.A05
            X.2qI r0 = r0.A05
            X.7xn r0 = r0.A01()
            long r15 = r0.A02
        L_0x06bb:
            X.2pn r12 = r2.A07
            if (r12 == 0) goto L_0x0010
            if (r1 == 0) goto L_0x12f9
            r0 = 1
            if (r1 == r0) goto L_0x12e7
            r5 = 2
            if (r1 == r5) goto L_0x12b6
            r0 = 3
            if (r1 == r0) goto L_0x1205
            r0 = 4
            if (r1 != r0) goto L_0x0010
            r0 = 3
            X.3br r3 = new X.3br
            r3.<init>((java.lang.Object) r2, (int) r0)
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r2.A05
            X.33p r0 = r0.A04
            java.lang.String r1 = "business_activity_report_timestamp"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            long r4 = X.AnonymousClass0x2.A0A(r0, r1)
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r2.A05
            X.33p r0 = r0.A04
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "business_activity_report_expiration_timestamp"
            long r6 = X.AnonymousClass0x2.A0B(r1, r0)
            r0 = r12
            r1 = r3
            r2 = r15
            r0.A02(r1, r2, r4, r6)
            return
        L_0x06f6:
            r15 = -1
            goto L_0x06bb
        L_0x06f9:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsChat r4 = (com.whatsapp.settings.SettingsChat) r4
            long r1 = X.C18310x6.A0B(r3)
            android.content.Context r0 = r4.getApplicationContext()
            boolean r0 = X.AnonymousClass0YV.A0F(r0)
            if (r0 != 0) goto L_0x0010
            X.33j r0 = r4.A00
            java.lang.String r0 = X.C06390Xm.A03(r4, r0, r1)
            com.whatsapp.settings.SettingsRowIconText r2 = r4.A0D
            r1 = 2131893684(0x7f121db4, float:1.9422151E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r0)
            java.lang.String r0 = r4.getString(r1, r0)
            r2.setSubText(r0)
            return
        L_0x0722:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsUserProxyActivity r2 = (com.whatsapp.settings.SettingsUserProxyActivity) r2
            X.7LN r3 = (X.AnonymousClass7LN) r3
            int r5 = r3.A00
            if (r5 != 0) goto L_0x0745
            int r0 = r3.A01
            if (r0 != 0) goto L_0x0745
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r2.A09
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0745
            com.whatsapp.WaTextView r0 = r2.A06
            java.lang.String r1 = ""
            r0.setText(r1)
            com.whatsapp.WaTextView r0 = r2.A08
            r0.setText(r1)
            return
        L_0x0745:
            int r1 = r3.A02
            com.whatsapp.WaTextView r0 = r2.A06
            r0.setText(r1)
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r2.A09
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0010
            com.whatsapp.WaTextView r4 = r2.A08
            if (r4 == 0) goto L_0x0010
            r0 = 2
            if (r5 != r0) goto L_0x0783
            int r1 = r3.A01
            r0 = 6
            if (r1 != r0) goto L_0x0783
            r0 = 0
            r4.setVisibility(r0)
            com.whatsapp.WaTextView r1 = r2.A08
            r0 = 2131892785(0x7f121a31, float:1.9420328E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r2.A08
            int r0 = r2.A04
            r1.setTextColor(r0)
            com.whatsapp.WaTextView r1 = r2.A06
            r0 = 2131892776(0x7f121a28, float:1.942031E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r2.A06
            int r0 = r2.A01
        L_0x077f:
            r1.setTextColor(r0)
            return
        L_0x0783:
            r0 = 8
            r4.setVisibility(r0)
            com.whatsapp.WaTextView r1 = r2.A06
            r0 = 2
            if (r5 != r0) goto L_0x0790
            int r0 = r2.A01
            goto L_0x077f
        L_0x0790:
            r0 = 3
            if (r5 != r0) goto L_0x0796
            int r0 = r2.A04
            goto L_0x077f
        L_0x0796:
            int r0 = r2.A02
            goto L_0x077f
        L_0x0799:
            java.lang.Object r1 = r1.A00
            X.03q r1 = (X.C003203q) r1
            boolean r0 = X.AnonymousClass001.A1Z(r3)
            if (r0 == 0) goto L_0x0010
            X.0df r1 = r1.getSupportFragmentManager()
            int r0 = r1.A07()
            if (r0 <= 0) goto L_0x0010
            r1.A0M()
            return
        L_0x07b1:
            java.lang.Object r5 = r1.A00
            com.whatsapp.biz.compliance.view.BusinessComplianceDetailActivity r5 = (com.whatsapp.biz.compliance.view.BusinessComplianceDetailActivity) r5
            java.lang.Number r3 = (java.lang.Number) r3
            android.widget.ProgressBar r1 = r5.A01
            int r4 = r3.intValue()
            r3 = 0
            r0 = 8
            if (r4 != 0) goto L_0x07c3
            r0 = 0
        L_0x07c3:
            r1.setVisibility(r0)
            android.widget.LinearLayout r2 = r5.A00
            r1 = 3
            r0 = 8
            if (r4 != r1) goto L_0x07ce
            r0 = 0
        L_0x07ce:
            r2.setVisibility(r0)
            androidx.cardview.widget.CardView r1 = r5.A02
            r0 = 1
            if (r4 == r0) goto L_0x07d8
            r3 = 8
        L_0x07d8:
            r1.setVisibility(r3)
            return
        L_0x07dc:
            java.lang.Object r1 = r1.A00
            com.whatsapp.calling.schedulecall.upcomingcalls.view.UpcomingScheduledCallsActivity r1 = (com.whatsapp.calling.schedulecall.upcomingcalls.view.UpcomingScheduledCallsActivity) r1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x07ea
            r0 = 0
            r1.A0A = r0
            return
        L_0x07ea:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x07f3
            r1.finish()
        L_0x07f3:
            X.11n r0 = r1.A02
            r0.A0L(r3)
            return
        L_0x07f9:
            java.lang.Object r4 = r1.A00
            X.4k4 r4 = (X.C91484k4) r4
            java.util.List r3 = (java.util.List) r3
            int r2 = r3.size()
            X.5UY r1 = r4.A0a
            if (r1 != 0) goto L_0x0813
            r0 = 2131434493(0x7f0b1bfd, float:1.8490801E38)
            android.view.View r0 = X.C005205m.A00(r4, r0)
            X.5UY r1 = new X.5UY
            r1.<init>(r0)
        L_0x0813:
            r4.A0a = r1
            if (r2 <= 0) goto L_0x0841
            r0 = 0
            r1.A06(r0)
            X.5UY r0 = r4.A0a
            android.view.View r0 = r0.A04()
            com.whatsapp.chatinfo.ChatInfoEventsCard r0 = (com.whatsapp.chatinfo.ChatInfoEventsCard) r0
            r0.setInfoText(r2)
            X.5UY r0 = r4.A0a
            android.view.View r0 = r0.A04()
            com.whatsapp.chatinfo.ChatInfoEventsCard r0 = (com.whatsapp.chatinfo.ChatInfoEventsCard) r0
            r0.setUpcomingEvents(r3)
            X.5UY r0 = r4.A0a
            android.view.View r1 = r0.A04()
            com.whatsapp.chatinfo.ChatInfoEventsCard r1 = (com.whatsapp.chatinfo.ChatInfoEventsCard) r1
            X.4uZ r0 = r4.A75()
            r1.setTitleRowClickListener(r0)
            return
        L_0x0841:
            r0 = 8
            r1.A06(r0)
            return
        L_0x0847:
            java.lang.Object r1 = r1.A00
            X.4ea r1 = (X.C89654ea) r1
            com.whatsapp.chatlock.LeakyCompanionDialogFragment r0 = new com.whatsapp.chatlock.LeakyCompanionDialogFragment
            r0.<init>()
            r1.Boo(r0)
            return
        L_0x0854:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x085c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.chatlock.ChatNowLockedDialogFragment r0 = (com.whatsapp.chatlock.ChatNowLockedDialogFragment) r0
            com.whatsapp.chatlock.ChatNowLockedDialogFragment.A00(r0)
            return
        L_0x0864:
            java.lang.Object r0 = r1.A00
            com.whatsapp.chatlock.LeakyCompanionDialogFragment r0 = (com.whatsapp.chatlock.LeakyCompanionDialogFragment) r0
            com.whatsapp.chatlock.LeakyCompanionDialogFragment.A00(r0)
            return
        L_0x086c:
            java.lang.Object r1 = r1.A00
            com.whatsapp.chatlock.dialogs.UnarchiveForQuickLockDialogFragment r1 = (com.whatsapp.chatlock.dialogs.UnarchiveForQuickLockDialogFragment) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x0874:
            java.lang.Object r8 = r1.A00
            com.whatsapp.community.AddGroupsToCommunityActivity r8 = (com.whatsapp.community.AddGroupsToCommunityActivity) r8
            java.util.Collection r3 = (java.util.Collection) r3
            X.0R8 r7 = r8.A00
            android.content.res.Resources r9 = r8.getResources()
            r6 = 2131755215(0x7f1000cf, float:1.9141303E38)
            X.2so r0 = r8.A04
            X.1VX r0 = r0.A0F
            r11 = 1990(0x7c6, float:2.789E-42)
            X.2vE r10 = X.C58422vE.A02
            int r0 = r0.A0O(r10, r11)
            int r5 = r0 + 1
            java.lang.Object[] r4 = X.AnonymousClass002.A0M()
            r2 = 1
            X.10d r0 = r8.A03
            X.107 r0 = r0.A07
            java.lang.Object r1 = r0.A07()
            java.util.Collection r1 = (java.util.Collection) r1
            X.3B4 r0 = new X.3B4
            r0.<init>(r2)
            java.util.Collection r0 = X.C161497pn.filter(r1, r0)
            int r0 = r0.size()
            X.AnonymousClass000.A1L(r4, r0)
            X.2so r0 = r8.A04
            X.1VX r0 = r0.A0F
            int r0 = r0.A0O(r10, r11)
            int r0 = r0 + 1
            X.AnonymousClass000.A1P(r4, r0, r2)
            java.lang.String r0 = r9.getQuantityString(r6, r5, r4)
            r7.A0I(r0)
            X.4Wa r0 = r8.A06
            X.0QY r0 = r0.A01
            r0.A04(r3)
            return
        L_0x08cc:
            java.lang.Object r0 = r1.A00
            X.0Wx r0 = (X.C06270Wx) r0
            r0.A0H(r3)
            return
        L_0x08d4:
            java.lang.Object r2 = r1.A00
            X.11B r2 = (X.AnonymousClass11B) r2
            X.3dI r1 = r2.A0N
            r0 = 0
            X.3bu r0 = X.C71313bu.A00(r2, r0)
            r1.execute(r0)
            return
        L_0x08e3:
            java.lang.Object r2 = r1.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r2 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r2
            java.util.Collection r3 = (java.util.Collection) r3
            android.widget.Spinner r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A04
            r0 = 0
            r1.setVisibility(r0)
            X.4Wc r0 = r2.A0A
            X.0QY r0 = r0.A01
            r0.A04(r3)
            return
        L_0x08fe:
            java.lang.Object r9 = r1.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r9 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r9
            X.0R8 r8 = r9.A03
            android.content.res.Resources r7 = r9.getResources()
            r6 = 2131755215(0x7f1000cf, float:1.9141303E38)
            X.2so r0 = r9.A08
            X.1VX r0 = r0.A0F
            r5 = 1238(0x4d6, float:1.735E-42)
            X.2vE r4 = X.C58422vE.A02
            int r0 = r0.A0O(r4, r5)
            int r2 = r0 + 1
            java.lang.Object[] r1 = X.C18310x6.A1a(r3)
            X.2so r0 = r9.A08
            X.1VX r0 = r0.A0F
            int r0 = r0.A0O(r4, r5)
            int r0 = r0 + 1
            X.AnonymousClass000.A1M(r1, r0)
            java.lang.String r0 = r7.getQuantityString(r6, r2, r1)
            r8.A0I(r0)
            return
        L_0x0932:
            java.lang.Object r0 = r1.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r0 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r0
            r0.A74()
            return
        L_0x093a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r2 = r0.A74()
            X.20r r1 = X.C370320r.REJECT
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x0949:
            java.lang.Object r0 = r1.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r0.A74()
            X.4C6 r3 = X.AnonymousClass0IV.A00(r0)
            r2 = 0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$dismissNotification$1 r1 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$dismissNotification$1
            r1.<init>(r0, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x0960:
            java.lang.Object r1 = r1.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r1 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r1
            X.66R r0 = r1.A0E
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            android.content.Intent r0 = X.C627736r.A0T(r1, r0)
            r1.startActivity(r0)
            return
        L_0x0974:
            java.lang.Object r0 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r0
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r0.A0A
            r0.A0E()
            return
        L_0x097e:
            java.lang.Object r4 = r1.A00
            X.4el r4 = (X.C89704el) r4
            r3 = 1
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.qrcode.DevicePairQrScannerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
            r0 = 101(0x65, float:1.42E-43)
            r4.startActivityForResult(r2, r0)
            return
        L_0x099b:
            java.lang.Object r4 = r1.A00
            android.content.Context r4 = (android.content.Context) r4
            r3 = 1
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x09b6:
            java.lang.Object r0 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r0
            java.util.List r3 = (java.util.List) r3
            r0.A74(r3)
            return
        L_0x09c0:
            java.lang.Object r1 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r1
            r1.A74()
            X.33i r0 = r1.A08
            X.C620633i.A05(r0)
            goto L_0x0bb9
        L_0x09ce:
            java.lang.Object r0 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r0
            X.5UC r0 = r0.A0F
            r0.A01()
            return
        L_0x09d8:
            java.lang.Object r1 = r1.A00
            X.2iG r1 = (X.C50492iG) r1
            X.2FO r0 = new X.2FO
            r0.<init>(r1)
            com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment r2 = new com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment
            r2.<init>()
            r2.A00 = r0
            X.4eZ r0 = r1.A05
            X.0df r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "wifi_speed_bump_dialog"
            goto L_0x0ef8
        L_0x09f3:
            java.lang.Object r0 = r1.A00
            X.2iG r0 = (X.C50492iG) r0
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r0.A0A
            r0.A02()
            return
        L_0x09fd:
            java.lang.Object r3 = r1.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r3 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r3
            X.2dy r0 = r3.A02
            if (r0 == 0) goto L_0x0a1c
            X.1iA r0 = r0.A00()
            r0.A0A()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "extra_rate_limited"
            r0 = 1
            r2.putExtra(r1, r0)
            r0 = -1
            r3.setResult(r0, r2)
            goto L_0x0d97
        L_0x0a1c:
            java.lang.String r0 = "companionRegistrationManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0a23:
            java.lang.Object r3 = r1.A00
            X.4el r3 = (X.C89704el) r3
            X.4FS r1 = r3.A04
            r0 = 37
            X.3Zi r0 = X.C69963Zi.A00(r3, r0)
            r1.BkP(r0)
            goto L_0x0d97
        L_0x0a34:
            java.lang.Object r5 = r1.A00
            X.0eF r5 = (X.C08310eF) r5
            X.33D r3 = (X.AnonymousClass33D) r3
            java.lang.Integer r4 = X.AnonymousClass001.A0f()
            android.content.Context r2 = r5.A1D()
            java.lang.Object r0 = r3.A00()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A04(r0)
            r0 = 1
            android.content.Intent r0 = X.C627736r.A0l(r2, r1, r4, r0, r0)
            r5.A0m(r0)
            return
        L_0x0a55:
            java.lang.Object r6 = r1.A00
            com.whatsapp.conversation.CustomStickerConfirmationDialog r6 = (com.whatsapp.conversation.CustomStickerConfirmationDialog) r6
            X.66R r0 = r6.A03
            java.lang.Object r5 = r0.getValue()
            X.10o r5 = (X.C194410o) r5
            X.66R r0 = r6.A02
            java.lang.Object r4 = r0.getValue()
            X.4uZ r4 = (X.C95814uZ) r4
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            r0 = 1
            r5.A00 = r0
            X.4C6 r3 = X.AnonymousClass0IV.A00(r5)
            r2 = 0
            com.whatsapp.conversation.viewmodel.CustomStickerViewModel$sendSticker$1 r1 = new com.whatsapp.conversation.viewmodel.CustomStickerViewModel$sendSticker$1
            r1.<init>(r5, r4, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            r6.A1K()
            return
        L_0x0a82:
            java.lang.Object r4 = r1.A00
            X.4ea r4 = (X.C89654ea) r4
            X.33D r3 = (X.AnonymousClass33D) r3
            java.lang.Object r3 = r3.A00()
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment r2 = new com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jid"
            X.AnonymousClass0x2.A0v(r1, r3, r0)
            r2.A0u(r1)
            r0 = 0
            r4.Bon(r2, r0)
            return
        L_0x0aa4:
            java.lang.Object r2 = r1.A00
            android.view.View r2 = (android.view.View) r2
            r1 = 27
            X.5eg r0 = new X.5eg
            r0.<init>(r2, r1, r3)
            r2.setOnClickListener(r0)
            return
        L_0x0ab3:
            java.lang.Object r5 = r1.A00
            X.1Pb r5 = (X.C22661Pb) r5
            android.content.res.Resources r4 = r5.getResources()
            r1 = 2131892648(0x7f1219a8, float:1.942005E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            r2 = 0
            java.lang.String r1 = X.C18320x8.A0b(r4, r3, r0, r2, r1)
            android.widget.TextView r0 = r5.A00
            r0.setText(r1)
            r5.setVisibility(r2)
            return
        L_0x0ad0:
            java.lang.Object r0 = r1.A00
            X.5l7 r0 = (X.C113245l7) r0
            com.whatsapp.conversation.ConversationListView r3 = r0.A2f
            X.4uZ r2 = r0.A4J
            r1 = 2
            X.3bw r0 = new X.3bw
            r0.<init>(r3, r1, r2)
            r3.post(r0)
            return
        L_0x0ae2:
            java.lang.Object r5 = r1.A00
            X.5l7 r5 = (X.C113245l7) r5
            X.2mj r3 = (X.C53212mj) r3
            if (r3 == 0) goto L_0x0b40
            X.2zl r9 = r5.A4H
            X.2p8 r7 = r3.A01
            java.lang.String r8 = r3.A04
            java.lang.String r6 = r3.A03
            java.lang.String r4 = "ConversationDelegate/updateSurveyBanner before conversationBanners.show"
            X.1VX r2 = r9.A00
            r1 = 4725(0x1275, float:6.621E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0b40
            X.1ZJ r1 = new X.1ZJ
            r1.<init>()
            java.lang.Integer r3 = X.AnonymousClass0x7.A0h()
            r1.A02 = r3
            int r0 = X.C61132zl.A00(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            r1.A04 = r8
            r1.A03 = r4
            X.4FV r2 = r9.A01
            r2.BhD(r1)
            X.1Ze r1 = new X.1Ze
            r1.<init>()
            r1.A02 = r3
            int r0 = X.C61132zl.A00(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            com.whatsapp.jid.UserJid r0 = r7.A03
            java.lang.String r0 = r0.user
            java.lang.Long r0 = X.C18290x4.A0h(r0)
            r1.A03 = r0
            r1.A04 = r6
            r1.A05 = r4
            r2.BhD(r1)
        L_0x0b40:
            X.5PZ r1 = r5.A2b
            java.lang.Class<X.1PN> r0 = X.AnonymousClass1PN.class
            r1.A01(r0)
            return
        L_0x0b48:
            java.lang.Object r0 = r1.A00
            X.5l7 r0 = (X.C113245l7) r0
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            X.676 r0 = r0.A2z
            X.4eZ r0 = r0.getActivity()
            android.app.Activity r1 = X.C111095hX.A02(r0)
            X.4ea r1 = (X.C89654ea) r1
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x0b67
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r1.Bp9(r0)
            return
        L_0x0b67:
            r1.BjL()
            return
        L_0x0b6b:
            java.lang.Object r4 = r1.A00
            X.2hT r4 = (X.C50002hT) r4
            X.2KO r3 = (X.AnonymousClass2KO) r3
            r2 = 0
            r4.A00 = r2
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0b8d
            java.lang.Boolean r1 = r3.A00
            if (r1 == 0) goto L_0x0b8d
            X.33p r0 = r4.A03
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "tos_2016_opt_out_state"
            X.C18270x1.A0l(r1, r0, r2)
            return
        L_0x0b8d:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0ba1
            r4.A01 = r2
            X.3Wi r3 = r4.A02
            r0 = 15
            X.3Zk r2 = X.C69983Zk.A00(r4, r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.A0T(r2, r0)
            return
        L_0x0ba1:
            r0 = 1
            r4.A01 = r0
            return
        L_0x0ba5:
            A02(r1)
            return
        L_0x0ba9:
            java.lang.Object r0 = r1.A00
            X.4GQ r0 = (X.AnonymousClass4GQ) r0
            com.whatsapp.extensions.phoenix.view.ExtensionsInitialLoadingView.setUpFlowsFooterWithLogo$lambda$4$lambda$3(r0, r3)
            return
        L_0x0bb1:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
        L_0x0bb9:
            r1.finish()
            return
        L_0x0bbd:
            java.lang.Object r1 = r1.A00
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r1 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r1
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            r8 = 1
            X.C162457s7.A0J(r3, r8)
            r3.dismiss()
            X.66R r0 = r1.A0Q
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r3 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r3
            com.whatsapp.WaEditText r0 = r1.A0A
            r2 = 0
            if (r0 == 0) goto L_0x0bf6
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0bf6
            java.lang.String r4 = r0.toString()
        L_0x0be1:
            java.lang.String r5 = r1.A75()
            android.net.Uri[] r7 = r1.A0P
            java.lang.String r6 = r1.A0N
            r3.A0F(r4, r5, r6, r7, r8)
            X.2WS r1 = r1.A74()
            r0 = 16
            r1.A00(r0, r2)
            return
        L_0x0bf6:
            r4 = r2
            goto L_0x0be1
        L_0x0bf8:
            java.lang.Object r1 = r1.A00
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r1 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r1
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            r0 = 1
            X.C162457s7.A0J(r3, r0)
            r3.dismiss()
            X.2WS r2 = r1.A74()
            r1 = 0
            r0 = 17
            r2.A00(r0, r1)
            return
        L_0x0c10:
            java.lang.Object r5 = r1.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r5 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r5
            int r1 = X.AnonymousClass001.A0K(r3)
            com.whatsapp.components.RoundCornerProgressBar r0 = r5.A09
            r0.setProgress(r1)
            com.whatsapp.WaTextView r4 = r5.A03
            r3 = 2131890837(0x7f121295, float:1.9416377E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.33j r0 = r5.A00
            java.text.NumberFormat r0 = r0.A0N()
            java.lang.String r1 = X.AnonymousClass001.A0l(r0, r1)
            r0 = 0
            r2[r0] = r1
            X.AnonymousClass001.A0y(r5, r4, r2, r3)
            return
        L_0x0c37:
            java.lang.Object r3 = r1.A00
            com.whatsapp.migration.transfer.ui.ChatTransferActivity r3 = (com.whatsapp.migration.transfer.ui.ChatTransferActivity) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "fpm/ChatTransferActivity/upgradeApp/user-accepted-update; playStoreEnabled: "
            r1.append(r0)
            X.2i5 r0 = r3.A00
            boolean r0 = r0.A01()
            r1.append(r0)
            X.C18280x3.A13(r1)
            X.2i5 r0 = r3.A00
            android.net.Uri r0 = r0.A00()
            X.AnonymousClass1Ha.A1w(r0, r3)
            goto L_0x0d97
        L_0x0c5b:
            java.lang.Object r0 = r1.A00
            X.1gh r0 = (X.C28341gh) r0
            X.2UG r3 = (X.AnonymousClass2UG) r3
            r0.A7B(r3)
            return
        L_0x0c65:
            java.lang.Object r1 = r1.A00
            X.1gh r1 = (X.C28341gh) r1
            int r0 = X.AnonymousClass001.A0K(r3)
            r1.A78(r0)
            return
        L_0x0c71:
            java.lang.Object r1 = r1.A00
            X.1gh r1 = (X.C28341gh) r1
            int r0 = X.AnonymousClass001.A0K(r3)
            goto L_0x0cd7
        L_0x0c7a:
            java.lang.Object r0 = r1.A00
            X.1gh r0 = (X.C28341gh) r0
            X.2T5 r3 = (X.AnonymousClass2T5) r3
            r0.A7A(r3)
            return
        L_0x0c84:
            java.lang.Object r5 = r1.A00
            X.1gh r5 = (X.C28341gh) r5
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            com.whatsapp.wds.components.button.WDSButton r4 = r5.A0D
            boolean r2 = r3.booleanValue()
            r1 = 8
            r0 = 0
            if (r2 == 0) goto L_0x0c97
            r0 = 8
        L_0x0c97:
            r4.setVisibility(r0)
            com.whatsapp.CircularProgressBar r0 = r5.A02
            if (r2 == 0) goto L_0x0c9f
            r1 = 0
        L_0x0c9f:
            r0.setVisibility(r1)
            return
        L_0x0ca3:
            java.lang.Object r0 = r1.A00
            X.2T5 r0 = (X.AnonymousClass2T5) r0
            X.4Ak r1 = r0.A04
            X.4Hd r1 = (X.C85664Hd) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0cb8;
                case 1: goto L_0x0cc0;
                case 2: goto L_0x0cd2;
                case 3: goto L_0x0cdb;
                case 4: goto L_0x0cf0;
                case 5: goto L_0x0cf8;
                default: goto L_0x0cb0;
            }
        L_0x0cb0:
            java.lang.Object r0 = r1.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r0
            r0.A0G()
            return
        L_0x0cb8:
            java.lang.Object r0 = r1.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r0
            r0.A0I()
            goto L_0x0cfc
        L_0x0cc0:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)     // Catch:{ ActivityNotFoundException -> 0x0cce }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0cce }
            return
        L_0x0cce:
            r1 = move-exception
            java.lang.String r0 = "fpm/P2pTransferActivity/No location settings"
            goto L_0x0cec
        L_0x0cd2:
            java.lang.Object r1 = r1.A00
            X.1gh r1 = (X.C28341gh) r1
            r0 = 0
        L_0x0cd7:
            r1.A79(r0)
            return
        L_0x0cdb:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.WIFI_SETTINGS"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)     // Catch:{ ActivityNotFoundException -> 0x0ce9 }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0ce9 }
            return
        L_0x0ce9:
            r1 = move-exception
            java.lang.String r0 = "fpm/P2pTransferActivity/No wifi settings"
        L_0x0cec:
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0cf0:
            java.lang.Object r0 = r1.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r0
            r0.A0F()
            return
        L_0x0cf8:
            java.lang.Object r0 = r1.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r0
        L_0x0cfc:
            X.08M r1 = r0.A09
            r0 = 0
            X.C06270Wx.A04(r1, r0)
            return
        L_0x0d03:
            java.lang.Object r1 = r1.A00
            X.2LU r1 = (X.AnonymousClass2LU) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x0d0b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r0 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r0
            r0.A7l()
            return
        L_0x0d13:
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 12
            goto L_0x0dbb
        L_0x0d1b:
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 27
            goto L_0x0dbb
        L_0x0d23:
            java.lang.Object r3 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r3 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r3
            r0 = 11
            X.C621433s.A00(r3, r0)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0d33
            java.lang.String r0 = "forgot_pin"
            goto L_0x0d61
        L_0x0d33:
            X.6hm r2 = r3.A02
            if (r2 != 0) goto L_0x0d3f
            java.lang.String r0 = "paymentBankAccount"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0d3f:
            r1 = 1
            java.lang.String r0 = r3.A0a
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0C(r3, r2, r0, r1)
            r3.startActivity(r0)
            goto L_0x0d94
        L_0x0d4a:
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 11
            goto L_0x0dbb
        L_0x0d51:
            java.lang.Object r3 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r3 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r3
            r0 = 10
            X.C621433s.A00(r3, r0)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0d65
            java.lang.String r0 = "retry"
        L_0x0d61:
            r3.A7n(r0)
            return
        L_0x0d65:
            java.lang.String r1 = "upi_p2p_check_balance"
            r0 = 0
            X.2lm r7 = new X.2lm
            r7.<init>(r1, r0, r0)
            X.6hm r0 = r3.A02
            if (r0 != 0) goto L_0x0d7a
            java.lang.String r0 = "paymentBankAccount"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0d7a:
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential_id"
            java.util.Map r9 = X.C57692u3.A04(r0, r1)
            X.8qC r0 = r3.A07
            if (r0 == 0) goto L_0x0d9b
            java.lang.Object r4 = r0.get()
            X.2YZ r4 = (X.AnonymousClass2YZ) r4
            java.lang.String r8 = "payment_bank_account_details"
            r5 = 0
            r6 = r5
            r4.A00(r5, r6, r7, r8, r9)
        L_0x0d94:
            r3.A7H()
        L_0x0d97:
            r3.finish()
            return
        L_0x0d9b:
            java.lang.String r0 = "paymentsPhoenixManagerLazy"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0da3:
            java.lang.Object r0 = r1.A00
            X.9D8 r0 = (X.AnonymousClass9D8) r0
            r0.A7a()
            return
        L_0x0dab:
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 0
            r1.A0I = r0
            r0 = 19
            goto L_0x0dbb
        L_0x0db5:
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 10
        L_0x0dbb:
            X.C621433s.A00(r1, r0)
            r1.A7l()
            return
        L_0x0dc2:
            java.lang.Object r2 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r2 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r2
            r0 = 12
            X.C621433s.A00(r2, r0)
            X.5hX r1 = r2.A00
            java.lang.String r0 = "https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1"
            X.C18310x6.A0y(r2, r1, r0)
            r2.A7l()
            return
        L_0x0dd6:
            java.lang.Object r0 = r1.A00
            com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment r0 = (com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment) r0
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            X.2NV r1 = r0.A00
            if (r1 == 0) goto L_0x10ca
            X.226 r7 = r0.A01
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            X.1Px r6 = r1.A01
            X.4FS r0 = r6.A08
            X.34x r5 = r1.A02
            int r8 = r1.A00
            r9 = 6
            X.3c6 r4 = new X.3c6
            r4.<init>(r5, r6, r7, r8, r9)
            r0.BkM(r4)
            goto L_0x10ca
        L_0x0df9:
            java.lang.Object r0 = r1.A00
            X.2nX r0 = (X.C53712nX) r0
            X.2mm r3 = (X.C53242mm) r3
            r0.A00 = r3
            return
        L_0x0e02:
            java.lang.Object r0 = r1.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r0 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r0
            r0.A78()
            return
        L_0x0e0a:
            java.lang.Object r0 = r1.A00
            goto L_0x0e13
        L_0x0e0d:
            java.lang.Object r0 = r1.A00
            X.26p r0 = (X.C382626p) r0
            java.lang.Object r0 = r0.A00
        L_0x0e13:
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x0e19:
            java.lang.Object r0 = r1.A00
            X.26p r0 = (X.C382626p) r0
            java.lang.Object r0 = r0.A00
            X.1pq r0 = (X.C32241pq) r0
            com.whatsapp.qrcode.WaQrScannerView r0 = r0.A05
            r0.Bjp()
            return
        L_0x0e27:
            java.lang.Object r5 = r1.A00
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r3 = (java.lang.String) r3
            r0 = 127(0x7f, float:1.78E-43)
            X.C621433s.A00(r5, r0)
            r0 = 128(0x80, float:1.794E-43)
            X.C621433s.A00(r5, r0)
            goto L_0x0e48
        L_0x0e38:
            java.lang.Object r0 = r1.A00
            com.whatsapp.report.DownloadLargeNewsletterReportFileConfirmationDialogFragment r0 = (com.whatsapp.report.DownloadLargeNewsletterReportFileConfirmationDialogFragment) r0
            X.4GP r0 = r0.A01
            r0.invoke()
            return
        L_0x0e42:
            java.lang.Object r5 = r1.A00
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r3 = (java.lang.String) r3
        L_0x0e48:
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r4 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "application/zip"
            r4.setType(r0)
            java.lang.String r1 = "android.intent.extra.STREAM"
            java.lang.String r0 = "business_activity_report"
            android.net.Uri r0 = com.whatsapp.contentprovider.MediaProvider.A06(r0, r3)
            r4.putExtra(r1, r0)
            r2 = 2131891570(0x7f121572, float:1.9417864E38)
            java.lang.String r1 = r5.getString(r2)
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            r4.putExtra(r0, r1)
            r0 = 524288(0x80000, float:7.34684E-40)
            r4.addFlags(r0)
            java.lang.String r0 = r5.getString(r2)
            android.content.Intent r0 = android.content.Intent.createChooser(r4, r0)
            r5.startActivity(r0)
            return
        L_0x0e7b:
            java.lang.Object r5 = r1.A00
            com.whatsapp.search.SearchFragment r5 = (com.whatsapp.search.SearchFragment) r5
            X.2oX r2 = r5.A1K
            r0 = 22
            X.1aW r1 = new X.1aW
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.4FV r0 = r2.A00
            r0.BhA(r1)
            r4 = 0
            android.content.Context r3 = r5.A0G()
            java.lang.String r1 = "com.bloks.www.csf.whatsapp.gethelp.user"
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportBloksActivity"
            r2.setClassName(r3, r0)
            X.C18310x6.A11(r2, r1, r4)
            X.5hX r1 = r5.A0D
            android.content.Context r0 = r5.A0G()
            r1.A0A(r0, r2)
            return
        L_0x0eb0:
            java.lang.Object r1 = r1.A00
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r1 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r1
            java.lang.String r0 = "SettingsPasskeys/revokePasskey/cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.66R r0 = r1.A01
            X.5OE r2 = X.C18300x5.A0V(r0)
            r1 = 0
            r0 = 13
            r2.A00(r1, r0)
            return
        L_0x0ec6:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r4 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r4
            java.lang.String r0 = "SettingsPasskeys/revokePasskey/accept"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.66R r0 = r4.A01
            X.5OE r1 = X.C18300x5.A0V(r0)
            r3 = 0
            r0 = 14
            r1.A00(r3, r0)
            X.0ni r2 = X.AnonymousClass0IT.A00(r4)
            com.whatsapp.settings.SettingsPasskeysEnabledFragment$showRevokeDialog$2$1 r1 = new com.whatsapp.settings.SettingsPasskeysEnabledFragment$showRevokeDialog$2$1
            r1.<init>(r4, r3)
            r0 = 3
            X.C616131n.A02(r3, r1, r2, r3, r0)
            return
        L_0x0ee9:
            java.lang.Object r0 = r1.A00
            X.03q r0 = (X.C003203q) r0
            com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet r2 = new com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet
            r2.<init>()
            X.0df r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "SettingsPrivacyFLMConsentBottomSheet"
        L_0x0ef8:
            r2.A1O(r1, r0)
            return
        L_0x0efc:
            java.lang.Object r0 = r1.A00
            X.03q r0 = (X.C003203q) r0
            X.0df r1 = r0.getSupportFragmentManager()
            com.whatsapp.calling.avatar.view.FLMConsentErrorDialogFragment r0 = new com.whatsapp.calling.avatar.view.FLMConsentErrorDialogFragment
            r0.<init>()
            X.AnonymousClass344.A00(r0, r1)
            return
        L_0x0f0d:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsUserProxyActivity r2 = (com.whatsapp.settings.SettingsUserProxyActivity) r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r4 = 0
            if (r0 == 0) goto L_0x0f95
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r2.A09
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0f82
            com.whatsapp.WaTextView r1 = r2.A07
            r0 = 2131892789(0x7f121a35, float:1.9420336E38)
            r1.setText(r0)
            androidx.appcompat.widget.SwitchCompat r1 = r2.A05
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.WaTextView r1 = r2.A06
            java.lang.String r0 = ""
            r1.setText(r0)
        L_0x0f38:
            r2.invalidateOptionsMenu()
            com.whatsapp.settings.SettingsUserProxyViewModel r5 = r2.A09
            boolean r0 = r5.A0H()
            if (r0 == 0) goto L_0x0f80
            androidx.appcompat.widget.SwitchCompat r0 = r2.A05
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x0f55
            androidx.appcompat.widget.SwitchCompat r0 = r2.A05
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x0f80
        L_0x0f55:
            r1 = 1
        L_0x0f56:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0f67
            boolean r0 = r5.A0H()
            if (r0 != 0) goto L_0x0f67
            X.2rm r0 = r5.A0E
            r0.A04(r4)
        L_0x0f67:
            boolean r0 = r5.A0H()
            if (r0 == 0) goto L_0x0f72
            X.2rm r0 = r5.A0E
            r0.A04(r1)
        L_0x0f72:
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r2.A09
            X.2yZ r0 = r0.A0F
            X.2rm r0 = r0.A00
            boolean r0 = r0.A05()
            r2.A75(r0)
            return
        L_0x0f80:
            r1 = 0
            goto L_0x0f56
        L_0x0f82:
            androidx.appcompat.widget.SwitchCompat r0 = r2.A05
            r0.setVisibility(r4)
            com.whatsapp.WaTextView r1 = r2.A07
            r0 = 2131892788(0x7f121a34, float:1.9420334E38)
            r1.setText(r0)
            androidx.appcompat.widget.SwitchCompat r0 = r2.A05
            r0.setChecked(r4)
            goto L_0x0f38
        L_0x0f95:
            androidx.appcompat.widget.SwitchCompat r0 = r2.A05
            r0.setVisibility(r4)
            com.whatsapp.WaTextView r0 = r2.A07
            r0.setText(r3)
            goto L_0x0f38
        L_0x0fa0:
            java.lang.Object r5 = r1.A00
            com.whatsapp.userban.ui.BanAppealActivity r5 = (com.whatsapp.userban.ui.BanAppealActivity) r5
            int r2 = X.AnonymousClass001.A0K(r3)
            r6 = 1
            if (r2 == r6) goto L_0x1005
            r0 = 2
            if (r2 == r0) goto L_0x0ffd
            r0 = 3
            if (r2 == r0) goto L_0x0ff5
            r0 = 4
            if (r2 == r0) goto L_0x0fed
            r0 = 5
            if (r2 != r0) goto L_0x100d
            java.lang.String r4 = "BanAppealBannedDecisionFragment"
            com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment
            r3.<init>()
        L_0x0fbe:
            r6 = 0
        L_0x0fbf:
            X.0df r2 = r5.getSupportFragmentManager()
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x0fd4
            int r0 = r2.A07()
            if (r0 <= 0) goto L_0x0fd4
            r0 = 1
            r2.A0m(r1, r0)
            r0 = 0
            r5.A01 = r0
        L_0x0fd4:
            X.0dc r1 = X.AnonymousClass0x2.A0J(r5)
            r0 = 2131429051(0x7f0b06bb, float:1.8479764E38)
            r1.A0A(r3, r0)
            if (r6 == 0) goto L_0x0fe9
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L_0x0fe6
            r5.A01 = r4
        L_0x0fe6:
            r1.A0I(r4)
        L_0x0fe9:
            r1.A01()
            return
        L_0x0fed:
            java.lang.String r4 = "BanAppealUnbannedDecisionFragment"
            com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment
            r3.<init>()
            goto L_0x0fbe
        L_0x0ff5:
            java.lang.String r4 = "BanAppealFormSubmittedFragment"
            com.whatsapp.userban.ui.fragment.BanAppealFormSubmittedFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealFormSubmittedFragment
            r3.<init>()
            goto L_0x0fbf
        L_0x0ffd:
            java.lang.String r4 = "BanAppealFormFragment"
            com.whatsapp.userban.ui.fragment.BanAppealFormFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealFormFragment
            r3.<init>()
            goto L_0x0fd4
        L_0x1005:
            java.lang.String r4 = "BanInfoFragment"
            com.whatsapp.userban.ui.fragment.BanInfoFragment r3 = new com.whatsapp.userban.ui.fragment.BanInfoFragment
            r3.<init>()
            goto L_0x0fbe
        L_0x100d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid screen state: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        L_0x101c:
            java.lang.Object r2 = r1.A00
            com.whatsapp.userban.ui.fragment.BanAppealFormFragment r2 = (com.whatsapp.userban.ui.fragment.BanAppealFormFragment) r2
            int r1 = X.AnonymousClass001.A0K(r3)
            r0 = 1
            X.3Wi r2 = r2.A01
            if (r1 != r0) goto L_0x1031
            r1 = 2131894152(0x7f121f88, float:1.94231E38)
            r0 = 0
            r2.A0G(r1, r0)
            return
        L_0x1031:
            r2.A0D()
            return
        L_0x1035:
            java.lang.Object r4 = r1.A00
            X.4cw r4 = (X.C89434cw) r4
            X.38g r3 = (X.C631838g) r3
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            com.whatsapp.calling.backwardcompat.BackwardCompatDialog r2 = new com.whatsapp.calling.backwardcompat.BackwardCompatDialog
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "event-args"
            r1.putParcelable(r0, r3)
            r2.A0u(r1)
            java.lang.String r0 = "BackwardCompatDialog"
            r4.A7A(r2, r0)
            return
        L_0x1056:
            java.lang.Object r4 = r1.A00
            com.whatsapp.wabloks.base.BkFragment r4 = (com.whatsapp.wabloks.base.BkFragment) r4
            X.2bF r3 = (X.C46202bF) r3
            int r2 = r3.A00
            r0 = 5
            if (r2 != r0) goto L_0x10a6
            X.7r0 r3 = r3.A01
            com.facebook.rendercore.RootHostView r1 = r4.A00
            r0 = 0
            r1.setVisibility(r0)
            X.7kz r0 = r4.A01
            if (r0 == 0) goto L_0x1070
            r0.A04()
        L_0x1070:
            X.2dA r2 = r4.A03
            X.03q r1 = r4.A0R()
            X.2pO r0 = new X.2pO
            r0.<init>(r1, r3, r2)
            X.7kz r0 = r0.A00()
            r4.A01 = r0
            X.03q r1 = r4.A0Q()
            X.07r r1 = (X.C009707r) r1
            if (r1 == 0) goto L_0x1090
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r1)
            r1.onConfigurationChanged(r0)
        L_0x1090:
            X.7kz r1 = r4.A01
            com.facebook.rendercore.RootHostView r0 = r4.A00
            r1.A07(r0)
            r4.A1J()
            java.lang.Integer r3 = com.whatsapp.wabloks.base.BkFragment.A09
            java.lang.Integer r2 = com.whatsapp.wabloks.base.BkFragment.A08
            java.lang.String r1 = ""
            java.lang.String r0 = "END_RENDER_SUCCESS"
            r4.A1O(r3, r2, r1, r0)
            return
        L_0x10a6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "received unsuccessful status: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x10b6:
            java.lang.Object r0 = r1.A00
            X.3Wt r0 = (X.C69373Wt) r0
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            X.4GP r0 = r0.A04
            goto L_0x10c7
        L_0x10bf:
            java.lang.Object r0 = r1.A00
            X.3Wt r0 = (X.C69373Wt) r0
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            X.4GP r0 = r0.A03
        L_0x10c7:
            r0.invoke()
        L_0x10ca:
            r3.dismiss()
            return
        L_0x10ce:
            java.lang.Object r2 = r1.A00
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r2 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r2
            r1 = 0
            android.content.Intent r0 = r2.A74()
            r2.A76(r1, r0)
            return
        L_0x10db:
            java.lang.Object r3 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r3 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r3
            X.2R8 r0 = r3.A0C
            X.1VX r2 = r0.A02
            r1 = 2459(0x99b, float:3.446E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x10ff
            X.5rC r1 = r3.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x10ff
            r1.A04()
            java.lang.String r0 = "endPrefTracker"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x10ff:
            r3.A74()
            X.33i r0 = r3.A08
            X.C620633i.A05(r0)
            r3.finish()
            X.2JT r0 = r3.A03
            X.5rC r0 = r0.A00
            r0.A04()
            java.lang.String r0 = "getSetDeviceNameActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x1118:
            java.lang.Object r3 = r1.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r3 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r3
            X.2R8 r0 = r3.A0A
            X.1VX r2 = r0.A02
            r1 = 2459(0x99b, float:3.446E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x113c
            X.5rC r1 = r3.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x113c
            r1.A04()
            java.lang.String r0 = "endPrefTracker"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x113c:
            r3.A78()
            X.2JT r0 = r3.A04
            X.5rC r0 = r0.A00
            r0.A04()
            java.lang.String r0 = "getSetDeviceNameActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x114d:
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Intent r1 = X.C18300x5.A07(r0)
            java.lang.String r0 = "com.whatsapp.intent.action.CHATS"
            android.content.Intent r0 = r1.setAction(r0)
            r2.finish()
            r2.startActivity(r0)
            r0 = 0
            r2.overridePendingTransition(r0, r0)
            return
        L_0x1166:
            android.app.ProgressDialog r0 = r4.A00
            if (r0 != 0) goto L_0x117f
            X.4eZ r2 = r4.A05
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r2)
            r4.A00 = r1
            r0 = 2131890559(0x7f12117f, float:1.9415813E38)
            X.C18320x8.A0w(r1, r2, r0)
            android.app.ProgressDialog r1 = r4.A00
            r0 = 0
            r1.setCancelable(r0)
        L_0x117f:
            android.app.ProgressDialog r0 = r4.A00
            r0.show()
            return
        L_0x1185:
            X.0dc r2 = new X.0dc     // Catch:{ Exception -> 0x1197 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x1197 }
            com.whatsapp.conversation.CommentsBottomSheet r1 = X.AnonymousClass25W.A00(r4, r3)     // Catch:{ Exception -> 0x1197 }
            java.lang.String r0 = "COMMENTS"
            r2.A0C(r1, r0)     // Catch:{ Exception -> 0x1197 }
            r2.A02()     // Catch:{ Exception -> 0x1197 }
            return
        L_0x1197:
            r0 = move-exception
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
            return
        L_0x119c:
            java.lang.Object r6 = r1.A00
            X.1gh r6 = (X.C28341gh) r6
            android.util.Pair r3 = (android.util.Pair) r3
            int r5 = X.C18280x3.A03(r3)
            int r4 = X.C18290x4.A03(r3)
            com.whatsapp.WaTextView r3 = r6.A03
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.33j r0 = r6.A00
            java.text.NumberFormat r0 = r0.A0N()
            java.lang.String r0 = X.AnonymousClass001.A0l(r0, r4)
            r1 = 0
            r2[r1] = r0
            X.AnonymousClass001.A0y(r6, r3, r2, r5)
            com.whatsapp.components.RoundCornerProgressBar r0 = r6.A06
            r0.setProgress(r4)
            com.whatsapp.components.RoundCornerProgressBar r0 = r6.A06
            r0.setVisibility(r1)
            com.whatsapp.CircularProgressBar r1 = r6.A02
            r0 = 8
        L_0x11ce:
            r1.setVisibility(r0)
            return
        L_0x11d2:
            r0 = 2131428740(0x7f0b0584, float:1.8479133E38)
            android.view.View r1 = X.C005205m.A00(r4, r0)
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r1.setAlpha(r0)
            r0 = 0
            X.5eW r3 = new X.5eW
            r3.<init>(r4, r0)
            r2 = 2131233526(0x7f080af6, float:1.8083192E38)
            r0 = 2131428741(0x7f0b0585, float:1.8479135E38)
            android.view.View r1 = X.C005205m.A00(r4, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setImageResource(r2)
            r0 = 1
            r1.setClickable(r0)
            r1.setOnClickListener(r3)
            X.5PT r1 = r4.A0A
            android.view.Window r0 = r4.getWindow()
            r1.A00(r0)
            return
        L_0x1205:
            com.whatsapp.report.BusinessActivityReportViewModel r11 = r2.A05
            r7 = 0
            X.C162457s7.A0J(r11, r7)
            android.view.View r1 = r12.A01
            r1.setEnabled(r7)
            r0 = 0
            r1.setOnClickListener(r0)
            android.widget.ImageView r1 = r12.A04
            r0 = 2131231774(0x7f08041e, float:1.8079639E38)
            r1.setImageResource(r0)
            android.content.Context r6 = r12.A00
            r2 = 2131101128(0x7f0605c8, float:1.7814657E38)
            int r0 = X.AnonymousClass0Y8.A04(r6, r2)
            X.C107335b8.A0E(r1, r0)
            android.widget.TextView r1 = r12.A07
            r0 = 2131889536(0x7f120d80, float:1.9413738E38)
            r1.setText(r0)
            X.AnonymousClass0x2.A0q(r6, r1, r2)
            android.widget.TextView r4 = r12.A06
            X.AnonymousClass0x2.A0q(r6, r4, r2)
            r4.setVisibility(r7)
            X.2qI r10 = r11.A05
            X.7xn r0 = r10.A01()
            r3 = 1
            if (r0 == 0) goto L_0x12a3
            r9 = 2131889542(0x7f120d86, float:1.941375E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            X.33j r8 = r12.A0A
            X.33p r2 = r11.A04
            java.lang.String r1 = "business_activity_report_timestamp"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            long r0 = X.AnonymousClass0x2.A0A(r0, r1)
            java.lang.String r0 = X.C107505bQ.A05(r8, r0)
            r5[r7] = r0
            X.7xn r0 = r10.A01()
            if (r0 == 0) goto L_0x12a0
            long r0 = r0.A02
        L_0x1265:
            java.lang.String r0 = X.AnonymousClass35V.A03(r8, r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r6, r0, r5, r3, r9)
        L_0x126d:
            r4.setText(r0)
            android.view.View r0 = r12.A02
            r5 = 8
            r0.setVisibility(r5)
            android.widget.TextView r9 = r12.A05
            r9.setVisibility(r7)
            r4 = 2131889540(0x7f120d84, float:1.9413746E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r2)
            java.lang.String r0 = "business_activity_report_expiration_timestamp"
            long r1 = X.AnonymousClass0x2.A0B(r1, r0)
            r0 = 1
            java.lang.String r0 = X.C100575Bl.A00(r8, r0, r1)
            r3[r7] = r0
            X.AnonymousClass001.A0y(r6, r9, r3, r4)
            com.whatsapp.TextEmojiLabel r0 = r12.A09
            r0.setVisibility(r5)
            android.view.View r0 = r12.A03
            r0.setVisibility(r5)
            return
        L_0x12a0:
            r0 = 0
            goto L_0x1265
        L_0x12a3:
            X.33j r8 = r12.A0A
            X.33p r2 = r11.A04
            java.lang.String r1 = "business_activity_report_timestamp"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            long r0 = X.AnonymousClass0x2.A0A(r0, r1)
            java.lang.String r0 = X.C107505bQ.A05(r8, r0)
            goto L_0x126d
        L_0x12b6:
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r2.A05
            java.util.Objects.requireNonNull(r0)
            X.3br r13 = new X.3br
            r13.<init>((java.lang.Object) r0, (int) r5)
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r2.A05
            X.33p r0 = r0.A04
            java.lang.String r1 = "business_activity_report_timestamp"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            long r17 = X.AnonymousClass0x2.A0A(r0, r1)
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r2.A05
            X.33p r0 = r0.A04
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "business_activity_report_expiration_timestamp"
            long r19 = X.AnonymousClass0x2.A0B(r1, r0)
            r14 = 2131891569(0x7f121571, float:1.9417862E38)
            r21 = 0
            r22 = r21
            r12.A01(r13, r14, r15, r17, r19, r21, r22)
            return
        L_0x12e7:
            r0 = 2131891572(0x7f121574, float:1.9417868E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131891571(0x7f121573, float:1.9417866E38)
            java.lang.String r0 = r2.getString(r0)
            r12.A03(r1, r0)
            return
        L_0x12f9:
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r2.A05
            java.util.Objects.requireNonNull(r2)
            r0 = 6
            X.3br r1 = new X.3br
            r1.<init>((java.lang.Object) r2, (int) r0)
            r0 = 2131891573(0x7f121575, float:1.941787E38)
            r12.A00(r1, r0)
            return
        L_0x130b:
            java.lang.Object r7 = r1.A00
            X.00M r7 = (X.AnonymousClass00M) r7
            int r9 = X.AnonymousClass001.A0K(r3)
            r0 = -2
            r8 = 1
            r6 = -1
            if (r9 == r0) goto L_0x136c
            if (r9 == r8) goto L_0x1365
            r0 = 3
            if (r9 == r0) goto L_0x135d
            r2 = 4
            r1 = 2131888583(0x7f1209c7, float:1.9411805E38)
            r0 = 2131886580(0x7f1201f4, float:1.9407743E38)
            if (r9 == r2) goto L_0x1363
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 2131886579(0x7f1201f3, float:1.940774E38)
        L_0x132c:
            r5 = -1
            r4 = -1
        L_0x132e:
            X.0zH r3 = X.AnonymousClass5V0.A00(r7)
            r3.A0T(r0)
            r3.A0i(r8)
            java.lang.String r2 = r7.getString(r1)
            r1 = 1
            X.4K5 r0 = new X.4K5
            r0.<init>(r7, r9, r1)
            r3.A0f(r7, r0, r2)
            if (r4 == r6) goto L_0x134a
            r3.A0U(r4)
        L_0x134a:
            if (r5 == r6) goto L_0x1359
            java.lang.String r2 = r7.getString(r5)
            r1 = 0
            X.4K6 r0 = new X.4K6
            r0.<init>(r1)
            r3.A0e(r7, r0, r2)
        L_0x1359:
            r3.A0S()
            return
        L_0x135d:
            r1 = 2131891566(0x7f12156e, float:1.9417856E38)
            r0 = 2131886581(0x7f1201f5, float:1.9407745E38)
        L_0x1363:
            r8 = 0
            goto L_0x132c
        L_0x1365:
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 2131891206(0x7f121406, float:1.9417126E38)
            goto L_0x132c
        L_0x136c:
            r1 = 2131891566(0x7f12156e, float:1.9417856E38)
            r4 = 2131886576(0x7f1201f0, float:1.9407735E38)
            r5 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 2131886577(0x7f1201f1, float:1.9407737E38)
            goto L_0x132e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4K2.BOf(java.lang.Object):void");
    }
}
