package X;

import android.view.View;

/* renamed from: X.39f  reason: invalid class name and case insensitive filesystem */
public class C634339f implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C634339f(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C634339f(obj, i, obj2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0316, code lost:
        r2 = X.C18320x8.A07();
        X.C627336j.A0E(r2, (com.whatsapp.jid.Jid) r0.getValue(), r5.getPackageName(), "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity");
        r2.putExtra("newsletter-appeal-data", r4);
        r5.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0332, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x046e, code lost:
        r1.A0h(false);
        r1.A0R();
        r1.A1E.A0H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x047a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04a6, code lost:
        r0.A0c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013d, code lost:
        X.C621433s.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0252, code lost:
        r0.invoke(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0255, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A02
            switch(r0) {
                case 0: goto L_0x002f;
                case 1: goto L_0x0256;
                case 2: goto L_0x0266;
                case 3: goto L_0x028f;
                case 4: goto L_0x02bd;
                case 5: goto L_0x02df;
                case 6: goto L_0x0016;
                case 7: goto L_0x0301;
                case 8: goto L_0x030c;
                case 9: goto L_0x0333;
                case 10: goto L_0x034e;
                case 11: goto L_0x034e;
                case 12: goto L_0x035a;
                case 13: goto L_0x0380;
                case 14: goto L_0x011d;
                case 15: goto L_0x0128;
                case 16: goto L_0x0133;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x03a1;
                case 20: goto L_0x03b9;
                case 21: goto L_0x03d2;
                case 22: goto L_0x0144;
                case 23: goto L_0x03df;
                case 24: goto L_0x03fe;
                case 25: goto L_0x040e;
                case 26: goto L_0x041a;
                case 27: goto L_0x041a;
                case 28: goto L_0x0426;
                case 29: goto L_0x0431;
                case 30: goto L_0x043c;
                case 31: goto L_0x0445;
                case 32: goto L_0x0450;
                case 33: goto L_0x045b;
                case 34: goto L_0x0466;
                case 35: goto L_0x047b;
                case 36: goto L_0x0486;
                case 37: goto L_0x0491;
                case 38: goto L_0x049c;
                case 39: goto L_0x04aa;
                case 40: goto L_0x01e5;
                case 41: goto L_0x04c5;
                case 42: goto L_0x04d1;
                case 43: goto L_0x04f5;
                case 44: goto L_0x0216;
                case 45: goto L_0x051e;
                case 46: goto L_0x056c;
                case 47: goto L_0x05c1;
                case 48: goto L_0x05d8;
                case 49: goto L_0x0244;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r15.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 128(0x80, float:1.794E-43)
            X.C621433s.A00(r1, r0)
        L_0x0012:
            r2.run()
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r2 = r15.A00
            X.4oK r2 = (X.C93324oK) r2
            java.lang.Object r1 = r15.A01
            X.1Pu r1 = (X.C22711Pu) r1
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.34x r0 = r2.getFMessage()
            X.2z0 r2 = r0.A1J
            X.C162457s7.A0C(r2)
            X.4GQ r0 = r1.A04
            goto L_0x0252
        L_0x002f:
            java.lang.Object r5 = r15.A00
            X.5RF r5 = (X.AnonymousClass5RF) r5
            java.lang.Object r2 = r15.A01
            java.util.List r2 = (java.util.List) r2
            X.1mT r0 = r5.A01
            X.C626936e.A06(r0)
            X.1mT r0 = r5.A01
            int r1 = r0.A01
            r0 = 1
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            if (r1 != r0) goto L_0x00f5
            android.widget.CheckBox r0 = r5.A04
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x005e
            X.2y4 r0 = r5.A00
            if (r0 == 0) goto L_0x005e
            long r1 = r0.A01
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
            X.AnonymousClass0x2.A1Q(r8, r1)
        L_0x005e:
            X.1mT r4 = r5.A01
            if (r4 == 0) goto L_0x0015
            X.32c r6 = r5.A0H
            java.util.List r0 = r4.A04
            if (r0 == 0) goto L_0x00f3
            java.util.Iterator r2 = r0.iterator()
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f3
            X.34x r1 = X.C18300x5.A0T(r2)
            X.2z0 r0 = r1.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x006c
            boolean r0 = r1 instanceof X.C30591mh
            if (r0 == 0) goto L_0x006c
            r7 = 1
        L_0x0081:
            boolean r0 = r8.isEmpty()
            X.1aD r2 = new X.1aD
            r2.<init>()
            X.2z0 r1 = r4.A1J
            X.4uZ r3 = r1.A00
            if (r0 == 0) goto L_0x00dd
            if (r3 == 0) goto L_0x0095
            r6.A02(r2, r3)
        L_0x0095:
            X.C617532c.A01(r2, r4)
            r0 = 5
        L_0x0099:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
            r0 = 0
            X.C617532c.A00(r2, r0, r4)
            X.4FV r0 = r6.A01
            r0.BhD(r2)
            X.33m r2 = r5.A09
            X.1VX r0 = r2.A18
            boolean r0 = X.AnonymousClass31e.A01(r0)
            if (r0 == 0) goto L_0x0015
            com.whatsapp.jid.UserJid r0 = r4.A0o()
            X.2kn r7 = new X.2kn
            r7.<init>(r0, r1)
            long r11 = r4.A1L
            X.2Hw r1 = r2.A1Z
            X.C626936e.A06(r3)
            X.2sH r0 = r2.A0V
            long r9 = r0.A0H()
            long r13 = r0.A0H()
            X.35J r0 = r1.A00
            X.2z0 r6 = X.AnonymousClass35J.A01(r3, r0)
            X.1mh r5 = new X.1mh
            r5.<init>((X.AnonymousClass2z0) r6, (X.C52042kn) r7, (java.util.List) r8, (long) r9, (long) r11, (long) r13)
            X.2iN r0 = r2.A10
            r0.A00(r5)
            return
        L_0x00dd:
            if (r7 == 0) goto L_0x00e9
            if (r3 == 0) goto L_0x00e4
            r6.A02(r2, r3)
        L_0x00e4:
            X.C617532c.A01(r2, r4)
            r0 = 7
            goto L_0x0099
        L_0x00e9:
            if (r3 == 0) goto L_0x00ee
            r6.A02(r2, r3)
        L_0x00ee:
            X.C617532c.A01(r2, r4)
            r0 = 6
            goto L_0x0099
        L_0x00f3:
            r7 = 0
            goto L_0x0081
        L_0x00f5:
            java.util.Iterator r6 = r2.iterator()
        L_0x00f9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = r6.next()
            X.5RF r1 = (X.AnonymousClass5RF) r1
            android.widget.CheckBox r0 = r1.A04
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x00f9
            X.2y4 r0 = r1.A00
            if (r0 == 0) goto L_0x00f9
            long r1 = r0.A01
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00f9
            X.AnonymousClass0x2.A1Q(r8, r1)
            goto L_0x00f9
        L_0x011d:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r15.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x013d
        L_0x0128:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r15.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x013d
        L_0x0133:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r15.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 130(0x82, float:1.82E-43)
        L_0x013d:
            X.C621433s.A00(r1, r0)
            if (r2 == 0) goto L_0x0015
            goto L_0x0012
        L_0x0144:
            java.lang.Object r4 = r15.A01
            X.4zR r4 = (X.C97894zR) r4
            java.util.List r2 = r4.A01
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x0178
            java.lang.Object r1 = r15.A00
            X.4XH r1 = (X.AnonymousClass4XH) r1
            X.3ZH r0 = r4.A00
            android.content.Context r4 = r16.getContext()
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r0)
            java.lang.String r3 = X.AnonymousClass36P.A03(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0015
            X.2nh r2 = r1.A0Q
            r0 = 25
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sms:"
            r2.A01(r4, r1, r3, r0)
            return
        L_0x0178:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r2.iterator()
        L_0x0180:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01b9
            X.3ZH r2 = X.C18310x6.A0R(r5)
            android.content.Context r1 = r16.getContext()
            java.lang.Object r0 = r15.A00
            X.4XH r0 = (X.AnonymousClass4XH) r0
            X.33j r0 = r0.A0X
            java.lang.CharSequence r1 = X.AnonymousClass5ZU.A00(r1, r0, r2)
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r2)
            java.lang.String r2 = X.AnonymousClass36P.A03(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0180
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0180
            java.lang.String r1 = r1.toString()
            X.5dN r0 = new X.5dN
            r0.<init>(r1, r2)
            r3.add(r0)
            goto L_0x0180
        L_0x01b9:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0015
            X.3ZH r0 = r4.A00
            java.lang.String r0 = r0.A0J()
            com.whatsapp.contact.picker.PhoneNumberSelectionDialog r2 = com.whatsapp.contact.picker.PhoneNumberSelectionDialog.A00(r0, r3)
            java.lang.Object r0 = r15.A00
            X.4XH r0 = (X.AnonymousClass4XH) r0
            android.app.Activity r1 = r0.A05
            if (r1 == 0) goto L_0x0015
            boolean r0 = r1 instanceof X.C003203q
            if (r0 == 0) goto L_0x0015
            X.03q r1 = (X.C003203q) r1
            X.0dc r1 = X.AnonymousClass0x2.A0J(r1)
            java.lang.String r0 = "phone_number_selection_dialog"
            r1.A0C(r2, r0)
            r1.A02()
            return
        L_0x01e5:
            java.lang.Object r5 = r15.A00
            com.whatsapp.settings.Settings r5 = (com.whatsapp.settings.Settings) r5
            java.lang.Object r1 = r15.A01
            com.whatsapp.Me r1 = (com.whatsapp.Me) r1
            r5.A76()
            X.33j r0 = r5.A00
            java.lang.String r4 = r1.cc
            java.lang.String r3 = r1.number
            java.util.Locale r1 = r0.A05
            java.util.Locale r0 = r0.A04
            X.5Wj r2 = new X.5Wj
            r2.<init>(r4, r3, r1, r0)
            java.lang.String r0 = r2.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0015
            X.1WN r1 = new X.1WN
            r1.<init>()
            java.lang.String r0 = r2.A02
            r1.A00 = r0
            X.4FV r0 = r5.A0f
            r0.BhD(r1)
            return
        L_0x0216:
            java.lang.Object r2 = r15.A00
            com.whatsapp.settings.SettingsHelpV2 r2 = (com.whatsapp.settings.SettingsHelpV2) r2
            X.5X8 r1 = r2.A03
            java.lang.String r0 = ""
            android.net.Uri r0 = r1.A00(r0)
            X.AnonymousClass1Ha.A1w(r0, r2)
            X.2qU r4 = r2.A06
            if (r4 == 0) goto L_0x05f3
            r3 = 0
            X.1VX r2 = r4.A04
            X.2vE r1 = X.C58422vE.A01
            r0 = 1799(0x707, float:2.521E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0015
            X.3S8 r2 = r4.A07
            r0 = 1
            X.3cJ r1 = new X.3cJ
            r1.<init>((java.lang.Object) r2, (int) r3, (int) r0)
            X.3dI r0 = r2.A00
            r0.execute(r1)
            return
        L_0x0244:
            java.lang.Object r1 = r15.A00
            X.5Sm r1 = (X.C104825Sm) r1
            java.lang.Object r0 = r15.A01
            X.51Q r0 = (X.AnonymousClass51Q) r0
            java.lang.String r2 = r1.A02
            if (r2 == 0) goto L_0x0015
            X.4GQ r0 = r0.A00
        L_0x0252:
            r0.invoke(r2)
            return
        L_0x0256:
            java.lang.Object r0 = r15.A00
            X.6Ia r0 = (X.C125436Ia) r0
            java.lang.Object r2 = r15.A01
            com.whatsapp.polls.PollResultsViewModel r2 = (com.whatsapp.polls.PollResultsViewModel) r2
            long r0 = r0.A00
            r2.A01 = r0
            r2.A0E(r0)
            return
        L_0x0266:
            java.lang.Object r3 = r15.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r0 = X.AnonymousClass5CU.A00     // Catch:{ ActivityNotFoundException -> 0x0288 }
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)     // Catch:{ ActivityNotFoundException -> 0x0288 }
            java.lang.String r1 = X.AnonymousClass78K.A00     // Catch:{ ActivityNotFoundException -> 0x0288 }
            java.lang.String r0 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"
            X.C18320x8.A10(r2, r1, r0)     // Catch:{ ActivityNotFoundException -> 0x0288 }
            java.lang.String r1 = "package_name"
            java.lang.String r0 = r3.getPackageName()     // Catch:{ ActivityNotFoundException -> 0x0288 }
            r2.putExtra(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x0288 }
            X.AnonymousClass29G.A00(r3, r2)     // Catch:{ ActivityNotFoundException -> 0x0288 }
            r3.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x0288 }
            return
        L_0x0288:
            r1 = move-exception
            java.lang.String r0 = "Failed to launch App-Update-Settings activity within AppManager"
            X.C626936e.A08(r0, r1)
            return
        L_0x028f:
            java.lang.Object r2 = r15.A00
            com.whatsapp.product.integrityappeals.NewsletterRequestReviewSelectReasonActivity r2 = (com.whatsapp.product.integrityappeals.NewsletterRequestReviewSelectReasonActivity) r2
            java.lang.Object r1 = r15.A01
            X.3Yy r1 = (X.C69903Yy) r1
            X.66R r0 = r2.A02
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel r5 = (com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel) r5
            X.66R r0 = r2.A01
            java.lang.Object r4 = r0.getValue()
            X.38S r4 = (X.AnonymousClass38S) r4
            java.lang.Object r0 = r1.element
            java.lang.String r0 = (java.lang.String) r0
            X.C18260x0.A0O(r4, r0)
            X.4C6 r3 = X.AnonymousClass0IV.A00(r5)
            r2 = 0
            com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel$submitReview$1 r1 = new com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel$submitReview$1
            r1.<init>(r4, r5, r0, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x02bd:
            java.lang.Object r0 = r15.A00
            X.11x r0 = (X.C196211x) r0
            java.lang.Object r5 = r15.A01
            android.content.Context r5 = (android.content.Context) r5
            X.5hX r4 = r0.A01
            X.4uY r3 = r0.A03
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity"
            X.C627336j.A0E(r2, r3, r1, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.addFlags(r0)
            r4.A0A(r5, r2)
            return
        L_0x02df:
            java.lang.Object r0 = r15.A00
            X.11x r0 = (X.C196211x) r0
            java.lang.Object r5 = r15.A01
            android.content.Context r5 = (android.content.Context) r5
            X.5hX r4 = r0.A01
            X.4uY r3 = r0.A03
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity"
            X.C627336j.A0E(r2, r3, r1, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.addFlags(r0)
            r4.A0A(r5, r2)
            return
        L_0x0301:
            java.lang.Object r5 = r15.A00
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoActivity r5 = (com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoActivity) r5
            java.lang.Object r4 = r15.A01
            X.38T r4 = (X.AnonymousClass38T) r4
            X.66R r0 = r5.A09
            goto L_0x0316
        L_0x030c:
            java.lang.Object r5 = r15.A00
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity r5 = (com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity) r5
            java.lang.Object r4 = r15.A01
            X.38T r4 = (X.AnonymousClass38T) r4
            X.66R r0 = r5.A07
        L_0x0316:
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity"
            X.C627336j.A0E(r2, r3, r1, r0)
            java.lang.String r0 = "newsletter-appeal-data"
            r2.putExtra(r0, r4)
            r5.startActivity(r2)
            return
        L_0x0333:
            java.lang.Object r2 = r15.A00
            X.11t r2 = (X.C195811t) r2
            java.lang.Object r1 = r15.A01
            X.7aq r1 = (X.C153197aq) r1
            r0 = 1
            X.C162457s7.A0J(r1, r0)
            X.4GQ r2 = r2.A02
            org.json.JSONObject r1 = r1.A00
            java.lang.String r0 = "report_id"
            java.lang.String r0 = X.C18300x5.A0l(r0, r1)
            r2.invoke(r0)
            return
        L_0x034e:
            java.lang.Object r1 = r15.A00
            com.whatsapp.profile.ViewProfilePhoto r1 = (com.whatsapp.profile.ViewProfilePhoto) r1
            java.lang.Object r0 = r15.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.onOptionsItemSelected(r0)
            return
        L_0x035a:
            java.lang.Object r3 = r15.A00
            X.1pq r3 = (X.C32241pq) r3
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r3.A07 = r0
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0373
            com.whatsapp.qrcode.WaQrScannerView r0 = r3.A05
            r0.Bjp()
        L_0x0373:
            com.whatsapp.qrcode.WaQrScannerView r2 = r3.A05
            r1 = 45
            X.3bq r0 = new X.3bq
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
            return
        L_0x0380:
            java.lang.Object r5 = r15.A00
            com.whatsapp.registration.MaacGrantConsentActivity r5 = (com.whatsapp.registration.MaacGrantConsentActivity) r5
            java.lang.Object r4 = r15.A01
            X.3Q0 r4 = (X.AnonymousClass3Q0) r4
            r3 = 0
            r2 = 1
            X.33p r1 = r5.A09
            X.1VX r0 = r5.A0D
            boolean r0 = X.AnonymousClass36l.A0R(r1, r0)
            if (r0 != 0) goto L_0x039d
            java.lang.String r0 = "MaacGrantConsentActivity/maac not enabled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5.A74(r3)
            return
        L_0x039d:
            r4.A00(r5, r2)
            return
        L_0x03a1:
            java.lang.Object r1 = r15.A00
            com.whatsapp.registration.SendSmsToWa r1 = (com.whatsapp.registration.SendSmsToWa) r1
            java.lang.Object r0 = r15.A01
            X.3Yy r0 = (X.C69903Yy) r0
            java.lang.Object r0 = r0.element
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            X.C626936e.A05(r0)
            X.C162457s7.A0D(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.A79(r0)
            return
        L_0x03b9:
            java.lang.Object r4 = r15.A00
            com.whatsapp.registration.VerifyPhoneNumber r4 = (com.whatsapp.registration.VerifyPhoneNumber) r4
            java.lang.Object r3 = r15.A01
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            X.2s5 r2 = r4.A14
            java.lang.String r1 = "verification_complete_dialog"
            java.lang.String r0 = "click_verification_complete_dialog_continue"
            r2.A04(r1, r0)
            r4.A7F()
            r3.run()
            return
        L_0x03d2:
            java.lang.Object r2 = r15.A00
            X.4ea r2 = (X.C89654ea) r2
            java.lang.Object r1 = r15.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            r0 = 0
            r2.Bon(r1, r0)
            return
        L_0x03df:
            java.lang.Object r0 = r15.A00
            X.5dR r0 = (X.C108715dR) r0
            java.lang.Object r3 = r15.A01
            com.whatsapp.search.SearchViewModel r3 = (com.whatsapp.search.SearchViewModel) r3
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x03fc
            java.lang.String r0 = r0.A02
            X.7yh r1 = new X.7yh
            r1.<init>(r2, r0)
        L_0x03f2:
            X.4UC r0 = r3.A1C
            r0.A0G(r1)
            r0 = 1
            r3.A0f(r0)
            return
        L_0x03fc:
            r1 = 0
            goto L_0x03f2
        L_0x03fe:
            java.lang.Object r1 = r15.A00
            com.whatsapp.search.SearchViewModel r1 = (com.whatsapp.search.SearchViewModel) r1
            java.lang.Object r0 = r15.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r0)
            r1.A0b(r0)
            return
        L_0x040e:
            java.lang.Object r1 = r15.A00
            com.whatsapp.search.SearchViewModel r1 = (com.whatsapp.search.SearchViewModel) r1
            java.lang.Object r0 = r15.A01
            X.5dZ r0 = (X.C108795dZ) r0
            r1.A0d(r0)
            return
        L_0x041a:
            java.lang.Object r0 = r15.A00
            X.6j5 r0 = (X.C134466j5) r0
            java.lang.Object r1 = r15.A01
            X.34x r1 = (X.C624134x) r1
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x04a6
        L_0x0426:
            java.lang.Object r0 = r15.A00
            X.6j6 r0 = (X.C134476j6) r0
            java.lang.Object r1 = r15.A01
            X.34x r1 = (X.C624134x) r1
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x04a6
        L_0x0431:
            java.lang.Object r0 = r15.A00
            X.6j7 r0 = (X.C134486j7) r0
            java.lang.Object r1 = r15.A01
            X.34x r1 = (X.C624134x) r1
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x04a6
        L_0x043c:
            java.lang.Object r0 = r15.A00
            X.6jI r0 = (X.C134596jI) r0
            java.lang.Object r2 = r15.A01
            com.whatsapp.search.SearchViewModel r1 = r0.A00
            goto L_0x046e
        L_0x0445:
            java.lang.Object r0 = r15.A00
            X.6j8 r0 = (X.C134496j8) r0
            java.lang.Object r1 = r15.A01
            X.34x r1 = (X.C624134x) r1
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x04a6
        L_0x0450:
            java.lang.Object r0 = r15.A00
            X.6j9 r0 = (X.C134506j9) r0
            java.lang.Object r1 = r15.A01
            X.34x r1 = (X.C624134x) r1
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x04a6
        L_0x045b:
            java.lang.Object r0 = r15.A00
            X.6jA r0 = (X.C134516jA) r0
            java.lang.Object r1 = r15.A01
            X.34x r1 = (X.C624134x) r1
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x04a6
        L_0x0466:
            java.lang.Object r0 = r15.A00
            X.6jA r0 = (X.C134516jA) r0
            java.lang.Object r2 = r15.A01
            com.whatsapp.search.SearchViewModel r1 = r0.A00
        L_0x046e:
            r0 = 0
            r1.A0h(r0)
            r1.A0R()
            X.4UC r0 = r1.A1E
            r0.A0H(r2)
            return
        L_0x047b:
            java.lang.Object r0 = r15.A00
            X.6jB r0 = (X.C134526jB) r0
            java.lang.Object r1 = r15.A01
            X.34x r1 = (X.C624134x) r1
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x04a6
        L_0x0486:
            java.lang.Object r0 = r15.A00
            X.6jC r0 = (X.C134536jC) r0
            java.lang.Object r1 = r15.A01
            X.34x r1 = (X.C624134x) r1
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x04a6
        L_0x0491:
            java.lang.Object r0 = r15.A00
            X.6jD r0 = (X.C134546jD) r0
            java.lang.Object r1 = r15.A01
            X.34x r1 = (X.C624134x) r1
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x04a6
        L_0x049c:
            java.lang.Object r0 = r15.A00
            X.6jE r0 = (X.C134556jE) r0
            java.lang.Object r1 = r15.A01
            X.34x r1 = (X.C624134x) r1
            com.whatsapp.search.SearchViewModel r0 = r0.A00
        L_0x04a6:
            r0.A0c(r1)
            return
        L_0x04aa:
            java.lang.Object r0 = r15.A00
            com.whatsapp.settings.Settings r0 = (com.whatsapp.settings.Settings) r0
            java.lang.Object r2 = r15.A01
            android.view.View r2 = (android.view.View) r2
            X.5Tc r0 = r0.A0a
            X.33p r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "create_group_banner_dismissed"
            X.C18270x1.A0f(r1, r0)
            r0 = 8
            r2.setVisibility(r0)
            return
        L_0x04c5:
            java.lang.Object r1 = r15.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r15.A01
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            return
        L_0x04d1:
            java.lang.Object r1 = r15.A00
            com.whatsapp.settings.SettingsChat r1 = (com.whatsapp.settings.SettingsChat) r1
            java.lang.Object r0 = r15.A01
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.toggle()
            boolean r2 = r0.isChecked()
            X.1R1 r0 = r1.A0F
            X.33p r1 = r0.A0G
            java.lang.String r0 = "wa-shared-prefs/setPushToVideoEnabled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "push_to_video_sending_enabled"
            X.C18270x1.A0h(r1, r0, r2)
            return
        L_0x04f5:
            java.lang.Object r1 = r15.A00
            com.whatsapp.settings.SettingsChat r1 = (com.whatsapp.settings.SettingsChat) r1
            java.lang.Object r0 = r15.A01
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.toggle()
            boolean r2 = r0.isChecked()
            X.8qC r0 = r1.A0J
            java.lang.Object r0 = r0.get()
            X.7KQ r0 = (X.AnonymousClass7KQ) r0
            X.66R r0 = r0.A02
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r0)
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "bonsai_meta_ai_button_setting_enabled"
            r1.putBoolean(r0, r2)
            r1.apply()
            return
        L_0x051e:
            java.lang.Object r3 = r15.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Object r5 = r15.A01
            X.5Ij r5 = (X.C102315Ij) r5
            X.5RV r4 = r3.A0r
            r2 = 4
            java.lang.Integer r1 = X.C18290x4.A0Z()
            r0 = 0
            X.4rZ r1 = r4.A00(r0, r1, r2)
            java.lang.Integer r0 = X.C18280x3.A0S()
            r1.A00 = r0
            X.4FV r0 = r4.A00
            r0.BhA(r1)
            X.5RV r1 = r3.A0r
            r0 = 3
            r1.A01(r0)
            X.33p r2 = r5.A01
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            java.lang.String r1 = "privacy_checkup_banner_dismiss"
            int r0 = X.C18280x3.A02(r0, r1)
            int r0 = r0 + 1
            X.C18260x0.A0L(r2, r1, r0)
            java.lang.String r0 = "privacy_checkup_banner_cool_off_timestamp"
            r2.A1Y(r0)
            java.lang.String r0 = "privacy_checkup_banner_last_seen_timestamp"
            r2.A1Y(r0)
            android.view.View r1 = r3.A0B
            r0 = 8
            r1.setVisibility(r0)
            r3.A7B()
            return
        L_0x056c:
            java.lang.Object r4 = r15.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Object r0 = r15.A01
            X.5Ij r0 = (X.C102315Ij) r0
            X.33p r1 = r0.A01
            java.lang.String r0 = "privacy_checkup_banner_last_seen_timestamp"
            r1.A1Y(r0)
            X.5RV r2 = r4.A0r
            r0 = 0
            r3 = 4
            X.4rZ r1 = r2.A00(r0, r0, r3)
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A00 = r0
            X.4FV r0 = r2.A00
            r0.BhA(r1)
            java.lang.Integer r2 = X.C18320x8.A0W()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.1XW r1 = new X.1XW
            r1.<init>()
            r1.A00 = r0
            r1.A01 = r2
            X.4FV r0 = r4.A0b
            r0.BhA(r1)
            X.5RV r1 = r4.A0r
            r0 = 2
            r1.A01(r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.privacy.checkup.PrivacyCheckupHomeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "ENTRY_POINT"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x05c1:
            java.lang.Object r4 = r15.A00
            X.4el r4 = (X.C89704el) r4
            java.lang.Object r3 = r15.A01
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.4FS r2 = r4.A04
            r1 = 37
            X.3a1 r0 = new X.3a1
            r0.<init>(r4, r1, r3)
            r2.BkM(r0)
            return
        L_0x05d8:
            java.lang.Object r2 = r15.A00
            com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r2 = (com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity) r2
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setEnabled(r0)
            X.2vq r3 = r2.A05
            X.3dI r2 = r3.A04
            r1 = 22
            X.3bs r0 = new X.3bs
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.execute(r0)
            return
        L_0x05f3:
            java.lang.String r0 = "noticeBadgeManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C634339f.onClick(android.view.View):void");
    }
}
