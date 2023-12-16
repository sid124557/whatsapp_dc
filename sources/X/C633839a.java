package X;

import android.view.View;

/* renamed from: X.39a  reason: invalid class name and case insensitive filesystem */
public class C633839a implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C633839a(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C633839a(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: com.whatsapp.ephemeral.ViewOnceNuxBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: com.whatsapp.ephemeral.ViewOnceNuxBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: com.whatsapp.ephemeral.ViewOnceNuxBottomSheet} */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03c0, code lost:
        r8.postDelayed(new X.C69993Zl(r4, r0), 300);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ca, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0414, code lost:
        if (r6.A16.A04.A0Y(X.C58422vE.A02, 5563) != false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0416, code lost:
        com.whatsapp.util.Log.d("UserActions/userActionSendEventResponseMessage Event's viewing ABProp is off");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x041b, code lost:
        r5.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x041e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x041f, code lost:
        r6.A1r.BkM(new X.C172708Mj(r6, r3, r4, 22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r3.A1L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0186, code lost:
        X.C621433s.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0189, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0208;
                case 1: goto L_0x007f;
                case 2: goto L_0x0019;
                case 3: goto L_0x00b0;
                case 4: goto L_0x00b8;
                case 5: goto L_0x002c;
                case 6: goto L_0x00d6;
                case 7: goto L_0x0100;
                case 8: goto L_0x011f;
                case 9: goto L_0x0139;
                case 10: goto L_0x004c;
                case 11: goto L_0x0141;
                case 12: goto L_0x0152;
                case 13: goto L_0x017e;
                case 14: goto L_0x018a;
                case 15: goto L_0x01cb;
                case 16: goto L_0x01e6;
                case 17: goto L_0x01f4;
                case 18: goto L_0x01f4;
                case 19: goto L_0x0208;
                case 20: goto L_0x0069;
                case 21: goto L_0x0069;
                case 22: goto L_0x0210;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x0249;
                case 26: goto L_0x03cb;
                case 27: goto L_0x027d;
                case 28: goto L_0x02b7;
                case 29: goto L_0x02db;
                case 30: goto L_0x02e3;
                case 31: goto L_0x0312;
                case 32: goto L_0x0332;
                case 33: goto L_0x03a2;
                case 34: goto L_0x03cb;
                case 35: goto L_0x03d3;
                case 36: goto L_0x03f2;
                case 37: goto L_0x0434;
                case 38: goto L_0x043c;
                case 39: goto L_0x0444;
                case 40: goto L_0x044c;
                case 41: goto L_0x0454;
                case 42: goto L_0x045c;
                case 43: goto L_0x0464;
                case 44: goto L_0x046c;
                case 45: goto L_0x0474;
                case 46: goto L_0x047c;
                case 47: goto L_0x0484;
                case 48: goto L_0x048c;
                case 49: goto L_0x0494;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r7.A00
            com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet r3 = (com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet) r3
            X.33p r0 = r3.A02
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "view_once_nux_secondary"
            X.C18270x1.A0f(r1, r0)
        L_0x0015:
            r3.A1L()
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r0 = r7.A00
            X.12W r0 = (X.AnonymousClass12W) r0
            X.2O0 r2 = r0.A00
            r1 = 1
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x0018
            r2.A00 = r1
            X.08M r0 = r2.A01
            r0.A0G(r2)
            return
        L_0x002c:
            java.lang.Object r3 = r7.A00
            com.whatsapp.documentpicker.DocumentPickerActivity r3 = (com.whatsapp.documentpicker.DocumentPickerActivity) r3
            r2 = 2
            X.5ZR r0 = r3.A0H
            X.57z r1 = r0.A04()
            X.57z r0 = X.C997357z.DENIED
            if (r1 == r0) goto L_0x049c
            X.2s6 r1 = r3.A0G
            X.3FF r0 = new X.3FF
            r0.<init>(r3)
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0018
            r3.A76()
            return
        L_0x004c:
            java.lang.Object r4 = r7.A00
            com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment r4 = (com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment) r4
            com.whatsapp.WaEditText r0 = r4.A0A
            java.lang.String r1 = X.C18290x4.A0m(r0)
            java.lang.String[] r0 = r4.A0U
            r3 = 0
            if (r0 == 0) goto L_0x04a2
            boolean r0 = X.C106825aE.A02(r1, r0)
            if (r0 == 0) goto L_0x04a2
            X.4EF r0 = r4.A0E
            if (r0 == 0) goto L_0x0018
            r0.BNi(r1)
            return
        L_0x0069:
            java.lang.Object r3 = r7.A00
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet r3 = (com.whatsapp.ephemeral.ViewOnceNuxBottomSheet) r3
            X.3LQ r1 = r3.A05
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x007c
            java.lang.String r2 = "ephemeral_view_once"
        L_0x0075:
            X.2ml r1 = r1.A00
            r0 = 0
            r1.A01(r2, r0)
            goto L_0x0015
        L_0x007c:
            java.lang.String r2 = "ephemeral_view_once_receiver"
            goto L_0x0075
        L_0x007f:
            java.lang.Object r4 = r7.A00
            X.15W r4 = (X.AnonymousClass15W) r4
            X.08M r0 = r4.A02
            java.lang.Object r2 = r0.A07()
            X.C626936e.A06(r2)
            X.2O0 r2 = (X.AnonymousClass2O0) r2
            X.5Py r3 = r4.A06
            X.4uZ r0 = r4.A0A
            java.lang.String r1 = r0.getRawString()
            X.2ez r2 = r2.A02
            java.lang.String r0 = r2.A01
            boolean r0 = X.C18320x8.A1U(r0)
            r3.A01(r1, r0)
            X.2Fm r0 = r4.A07
            X.1Hk r1 = r4.A01
            X.5RH r0 = r0.A00
            X.5MV r0 = r0.A07
            r0.A00(r1, r2)
            r4.dismiss()
            return
        L_0x00b0:
            java.lang.Object r0 = r7.A00
            X.0eF r0 = (X.C08310eF) r0
            X.C18310x6.A1A(r0)
            return
        L_0x00b8:
            java.lang.Object r3 = r7.A00
            X.4ea r3 = (X.C89654ea) r3
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r2.addCategory(r0)
            java.lang.String r0 = "*/*"
            r2.setType(r0)
            java.lang.String r1 = "android.intent.extra.ALLOW_MULTIPLE"
            r0 = 1
            r2.putExtra(r1, r0)
            r3.BpY(r2, r0)
            return
        L_0x00d6:
            java.lang.Object r4 = r7.A00
            com.whatsapp.email.EmailVerificationActivity r4 = (com.whatsapp.email.EmailVerificationActivity) r4
            X.2eI r3 = r4.A04
            if (r3 == 0) goto L_0x00f9
            java.lang.String r2 = r4.A05
            int r1 = r4.A00
            r0 = 18
            r3.A01(r2, r1, r0)
            X.5hX r3 = r4.A00
            int r2 = r4.A00
            java.lang.String r1 = r4.A05
            r0 = 1
            android.content.Intent r0 = X.C627736r.A0x(r4, r1, r0, r2)
            r3.A0A(r4, r0)
            r4.finish()
            return
        L_0x00f9:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0100:
            java.lang.Object r1 = r7.A00
            com.whatsapp.email.UpdateEmailActivity r1 = (com.whatsapp.email.UpdateEmailActivity) r1
            com.whatsapp.WaEditText r0 = r1.A03
            if (r0 != 0) goto L_0x010f
            java.lang.String r0 = "emailInput"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x010f:
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r0)
            r1.A77(r0)
            return
        L_0x011f:
            java.lang.Object r1 = r7.A00
            com.whatsapp.email.VerifyEmailActivity r1 = (com.whatsapp.email.VerifyEmailActivity) r1
            com.whatsapp.CodeInputField r0 = r1.A03
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x012e:
            java.lang.String r0 = r0.getCode()
            X.C162457s7.A0D(r0)
            r1.A77(r0)
            return
        L_0x0139:
            java.lang.Object r0 = r7.A00
            com.whatsapp.email.VerifyEmailActivity r0 = (com.whatsapp.email.VerifyEmailActivity) r0
            r0.A76()
            return
        L_0x0141:
            java.lang.Object r2 = r7.A00
            com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment r2 = (com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment) r2
            X.4EF r1 = r2.A0E
            if (r1 == 0) goto L_0x014e
            int r0 = r2.A00
            r1.BOP(r0)
        L_0x014e:
            r2.A1K()
            return
        L_0x0152:
            java.lang.Object r3 = r7.A00
            X.4bL r3 = (X.C89014bL) r3
            com.whatsapp.WaEditText r0 = r3.A03
            java.lang.String r0 = X.C18290x4.A0m(r0)
            java.lang.String r1 = r0.trim()
            int r0 = r1.length()
            if (r0 > 0) goto L_0x0175
            int r2 = r3.A09
            if (r2 == 0) goto L_0x0175
            X.3Wi r1 = r3.A0G
            r0 = 0
            r1.A0H(r2, r0)
        L_0x0170:
            android.app.Activity r1 = r3.A01
            int r0 = r3.A08
            goto L_0x0186
        L_0x0175:
            X.4A3 r0 = r3.A0J
            r0.BiP(r1)
            r3.dismiss()
            goto L_0x0170
        L_0x017e:
            java.lang.Object r0 = r7.A00
            X.4bL r0 = (X.C89014bL) r0
            android.app.Activity r1 = r0.A01
            int r0 = r0.A08
        L_0x0186:
            X.C621433s.A00(r1, r0)
            return
        L_0x018a:
            java.lang.Object r3 = r7.A00
            X.4c7 r3 = (X.C89224c7) r3
            boolean r0 = r3.isShowing()
            if (r0 == 0) goto L_0x019a
            com.whatsapp.WaEditText r0 = r3.A0K
            r3.A06(r0)
            return
        L_0x019a:
            X.5S9 r0 = r3.A0C
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01aa
            X.5S9 r0 = r3.A0C
            r0.A03()
            return
        L_0x01aa:
            java.lang.Runnable r0 = r3.A0E
            if (r0 == 0) goto L_0x01b1
            r0.run()
        L_0x01b1:
            X.2aG r2 = r3.A0D
            if (r2 == 0) goto L_0x01c7
            r0 = 5
            r2.A00(r0)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x01c7
            X.1Ve r1 = new X.1Ve
            r1.<init>()
            X.4FV r0 = r2.A00
            r0.BhD(r1)
        L_0x01c7:
            r3.A09()
            return
        L_0x01cb:
            java.lang.Object r2 = r7.A00
            X.4Rm r2 = (X.AnonymousClass4Rm) r2
            int[][] r1 = r2.A04
            java.lang.Object r0 = r8.getTag()
            int r0 = X.AnonymousClass001.A0K(r0)
            r1 = r1[r0]
            X.4A4 r0 = r2.A03
            if (r0 == 0) goto L_0x01e2
            r0.Bbj(r1)
        L_0x01e2:
            r2.dismiss()
            return
        L_0x01e6:
            java.lang.Object r0 = r7.A00
            X.4Z4 r0 = (X.AnonymousClass4Z4) r0
            X.4A5 r2 = r0.A05
            X.5Zv r1 = r0.A01
            int r0 = r0.A00
            r2.BRq(r1, r0)
            return
        L_0x01f4:
            java.lang.Object r3 = r7.A00
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog r3 = (com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog) r3
            X.33p r0 = r3.A0D
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "ephemeral_kic_nux"
            X.C18270x1.A0l(r1, r0, r2)
            r3.A1L()
            return
        L_0x0208:
            java.lang.Object r0 = r7.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x0210:
            java.lang.Object r3 = r7.A00
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet r3 = (com.whatsapp.ephemeral.ViewOnceNuxBottomSheet) r3
            X.3Lk r2 = r3.A06
            java.lang.String r1 = "chats"
            java.lang.String r0 = "about-view-once"
            android.net.Uri r0 = r2.A04(r1, r0)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.5hX r1 = r3.A01
            android.content.Context r0 = r8.getContext()
            r1.A0A(r0, r2)
            X.3LQ r1 = r3.A05
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0246
            java.lang.String r2 = "ephemeral_view_once"
        L_0x0238:
            X.2ml r1 = r1.A00
            r0 = 0
            r1.A01(r2, r0)
            r3.A1L()
            r0 = 1
            r3.A1a(r0)
            return
        L_0x0246:
            java.lang.String r2 = "ephemeral_view_once_receiver"
            goto L_0x0238
        L_0x0249:
            java.lang.Object r3 = r7.A00
            com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet r3 = (com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet) r3
            X.3Lk r2 = r3.A05
            java.lang.String r1 = "chats"
            java.lang.String r0 = "about-view-once"
            android.net.Uri r0 = r2.A04(r1, r0)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.5hX r1 = r3.A01
            android.content.Context r0 = r8.getContext()
            r1.A0A(r0, r2)
            X.33p r0 = r3.A02
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r0)
            java.lang.String r1 = "view_once_nux_secondary"
            r0 = 1
            X.C18270x1.A0l(r2, r1, r0)
            r3.A1L()
            r3.A1a(r0)
            return
        L_0x027d:
            java.lang.Object r5 = r7.A00
            com.whatsapp.events.EventCreationFragment r5 = (com.whatsapp.events.EventCreationFragment) r5
            X.1fd r1 = r5.A0G
            if (r1 == 0) goto L_0x02b0
            android.content.Context r0 = r5.A1D()
            boolean r4 = r1.A05(r0)
            android.content.Context r3 = r5.A0G()
            android.content.Intent r2 = X.C18320x8.A07()
            r1 = 2
            java.lang.String r0 = "mode"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r3.getPackageName()
            if (r4 == 0) goto L_0x02ad
            java.lang.String r0 = "com.whatsapp.location.LocationPicker2"
        L_0x02a4:
            r2.setClassName(r1, r0)
            X.0O1 r0 = r5.A0R
            r0.A01(r2)
            return
        L_0x02ad:
            java.lang.String r0 = "com.whatsapp.location.LocationPicker"
            goto L_0x02a4
        L_0x02b0:
            java.lang.String r0 = "locationUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02b7:
            java.lang.Object r0 = r7.A00
            com.whatsapp.events.EventCreationFragment r0 = (com.whatsapp.events.EventCreationFragment) r0
            X.66R r0 = r0.A0T
            java.lang.Object r0 = r0.getValue()
            X.11J r0 = (X.AnonymousClass11J) r0
            r4 = 0
            X.4Gp r3 = r0.A0B
        L_0x02c6:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.2yl r0 = (X.C60562yl) r0
            X.20W r1 = r0.A00
            X.2yl r0 = new X.2yl
            r0.<init>(r1, r4)
            boolean r0 = r3.AzD(r2, r0)
            if (r0 == 0) goto L_0x02c6
            return
        L_0x02db:
            java.lang.Object r0 = r7.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.show()
            return
        L_0x02e3:
            java.lang.Object r1 = r7.A00
            com.whatsapp.events.EventCreationFragment r1 = (com.whatsapp.events.EventCreationFragment) r1
            X.0eF r0 = r1.A0N()
            X.0df r5 = r0.A0T()
            java.util.Calendar r0 = r1.A1K()
            java.util.Date r0 = r0.getTime()
            long r3 = r0.getTime()
            com.whatsapp.events.EventCreationVideoCallDialog r2 = new com.whatsapp.events.EventCreationVideoCallDialog
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "EVENT_DATE"
            r1.putLong(r0, r3)
            r2.A0u(r1)
            java.lang.String r0 = "EVENT_VIDEO_CALL_DIALOG"
            X.C18300x5.A1B(r2, r5, r0)
            return
        L_0x0312:
            java.lang.Object r4 = r7.A00
            com.whatsapp.events.EventCreationVideoCallDialog r4 = (com.whatsapp.events.EventCreationVideoCallDialog) r4
            X.66R r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            X.11J r0 = (X.AnonymousClass11J) r0
            X.4Gp r3 = r0.A0A
        L_0x0320:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.2yk r1 = (X.C60552yk) r1
            X.21P r0 = X.AnonymousClass21P.NONE
            boolean r0 = X.C60552yk.A00(r0, r1, r2, r3)
            if (r0 == 0) goto L_0x0320
            r0 = 4
            goto L_0x03c0
        L_0x0332:
            java.lang.Object r4 = r7.A00
            com.whatsapp.events.EventCreationVideoCallDialog r4 = (com.whatsapp.events.EventCreationVideoCallDialog) r4
            X.66R r0 = r4.A01
            java.lang.Object r5 = r0.getValue()
            X.11J r5 = (X.AnonymousClass11J) r5
            X.4Gt r0 = r5.A0C
            java.lang.Object r0 = r0.getValue()
            X.2yk r0 = (X.C60552yk) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0363
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0363
            X.4Gp r3 = r5.A0A
        L_0x0352:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.2yk r1 = (X.C60552yk) r1
            X.21P r0 = X.AnonymousClass21P.SUCCESS
            boolean r0 = X.C60552yk.A00(r0, r1, r2, r3)
            if (r0 == 0) goto L_0x0352
        L_0x0361:
            r0 = 3
            goto L_0x03c0
        L_0x0363:
            X.1ip r0 = r5.A03
            boolean r0 = r0.A0F()
            X.4Gp r3 = r5.A0A
            if (r0 == 0) goto L_0x0392
        L_0x036d:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.2yk r1 = (X.C60552yk) r1
            X.21P r0 = X.AnonymousClass21P.LOADING
            boolean r0 = X.C60552yk.A00(r0, r1, r2, r3)
            if (r0 == 0) goto L_0x036d
            X.2NC r5 = r5.A02
            r2 = 1
            r1 = 0
            r0 = 0
            android.os.Message r3 = android.os.Message.obtain(r1, r0, r2, r0)
            X.5jr r2 = r5.A01
            java.lang.String r1 = "create_call_link"
            X.5Zu r0 = new X.5Zu
            r0.<init>((android.os.Message) r3, (java.lang.String) r1)
            r2.A00(r0)
            goto L_0x0361
        L_0x0392:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.2yk r1 = (X.C60552yk) r1
            X.21P r0 = X.AnonymousClass21P.NO_INTERNET
            boolean r0 = X.C60552yk.A00(r0, r1, r2, r3)
            if (r0 == 0) goto L_0x0392
            goto L_0x0361
        L_0x03a2:
            java.lang.Object r4 = r7.A00
            com.whatsapp.events.EventCreationVideoCallDialog r4 = (com.whatsapp.events.EventCreationVideoCallDialog) r4
            X.66R r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            X.11J r0 = (X.AnonymousClass11J) r0
            X.4Gp r3 = r0.A0A
        L_0x03b0:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.2yk r1 = (X.C60552yk) r1
            X.21P r0 = X.AnonymousClass21P.CUSTOM_LINK
            boolean r0 = X.C60552yk.A00(r0, r1, r2, r3)
            if (r0 == 0) goto L_0x03b0
            r0 = 2
        L_0x03c0:
            X.3Zl r2 = new X.3Zl
            r2.<init>(r4, r0)
            r0 = 300(0x12c, double:1.48E-321)
            r8.postDelayed(r2, r0)
            return
        L_0x03cb:
            java.lang.Object r0 = r7.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x03d3:
            java.lang.Object r5 = r7.A00
            com.whatsapp.events.EventResponseBottomSheet r5 = (com.whatsapp.events.EventResponseBottomSheet) r5
            X.8qC r0 = r5.A02
            if (r0 == 0) goto L_0x03ea
            java.lang.Object r6 = r0.get()
            X.33m r6 = (X.C621033m) r6
            X.66R r0 = r5.A03
            java.lang.Object r4 = r0.getValue()
            X.21m r3 = X.C372421m.GOING
            goto L_0x0408
        L_0x03ea:
            java.lang.String r0 = "userActions"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03f2:
            java.lang.Object r5 = r7.A00
            com.whatsapp.events.EventResponseBottomSheet r5 = (com.whatsapp.events.EventResponseBottomSheet) r5
            X.8qC r0 = r5.A02
            if (r0 == 0) goto L_0x042c
            java.lang.Object r6 = r0.get()
            X.33m r6 = (X.C621033m) r6
            X.66R r0 = r5.A03
            java.lang.Object r4 = r0.getValue()
            X.21m r3 = X.C372421m.NOT_GOING
        L_0x0408:
            X.2pV r0 = r6.A16
            X.1VX r2 = r0.A04
            r1 = 5563(0x15bb, float:7.795E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x041f
            java.lang.String r0 = "UserActions/userActionSendEventResponseMessage Event's viewing ABProp is off"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x041b:
            r5.A1K()
            return
        L_0x041f:
            X.4FS r2 = r6.A1r
            r1 = 22
            X.8Mj r0 = new X.8Mj
            r0.<init>(r6, r3, r4, r1)
            r2.BkM(r0)
            goto L_0x041b
        L_0x042c:
            java.lang.String r0 = "userActions"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0434:
            java.lang.Object r0 = r7.A00
            X.0zD r0 = (X.C19310zD) r0
            X.C19310zD.setUpContextMenu$lambda$2$lambda$1(r0, r8)
            return
        L_0x043c:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setRecentEnabled$lambda$2(r0, r8)
            return
        L_0x0444:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$14(r0, r8)
            return
        L_0x044c:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setStarredEnabled$lambda$4(r0, r8)
            return
        L_0x0454:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setStarredEnabled$lambda$5(r0, r8)
            return
        L_0x045c:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setRecentEnabled$lambda$3(r0, r8)
            return
        L_0x0464:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$6(r0, r8)
            return
        L_0x046c:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$7(r0, r8)
            return
        L_0x0474:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$8(r0, r8)
            return
        L_0x047c:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$9(r0, r8)
            return
        L_0x0484:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$10(r0, r8)
            return
        L_0x048c:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$11(r0, r8)
            return
        L_0x0494:
            java.lang.Object r0 = r7.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$12(r0, r8)
            return
        L_0x049c:
            X.1VX r0 = r3.A0D
            com.whatsapp.RequestPermissionActivity.A0i(r3, r0, r2)
            return
        L_0x04a2:
            java.lang.String r2 = r1.trim()
            int r0 = r2.length()
            if (r0 > 0) goto L_0x04b6
            int r1 = r4.A01
            if (r1 == 0) goto L_0x04b6
            X.3Wi r0 = r4.A09
            r0.A0H(r1, r3)
            return
        L_0x04b6:
            X.4EF r1 = r4.A0E
            if (r1 == 0) goto L_0x04bf
            int r0 = r4.A00
            r1.BRm(r0, r2)
        L_0x04bf:
            r4.A1K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C633839a.onClick(android.view.View):void");
    }
}
