package X;

/* renamed from: X.3Zi  reason: invalid class name and case insensitive filesystem */
public class C69963Zi implements Runnable {
    public Object A00;
    public final int A01;

    public C69963Zi(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C69963Zi A00(Object obj, int i) {
        return new C69963Zi(obj, i);
    }

    public static void A01(AnonymousClass4FS r1, Object obj, int i) {
        r1.BkM(new C69963Zi(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02bd, code lost:
        r3.A0U(r0);
        r3.A0i(false);
        r3.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x041d, code lost:
        com.whatsapp.util.Log.d(r0);
        r1.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0423, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04e2, code lost:
        r1.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06d7, code lost:
        r0 = r0.mutationName;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06d9, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        r1 = r5.A02.A08(new X.AnonymousClass3H7(r0), "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC", "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES", (java.lang.String[]) null).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x06f2, code lost:
        if (r1.hasNext() == false) goto L_0x06fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06f4, code lost:
        r5.A02(X.C18320x8.A0K(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06fc, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0888, code lost:
        r5.A02.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x088d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f3, code lost:
        r1.A0D((java.util.Collection) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r1 = r30
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0928;
                case 1: goto L_0x090e;
                case 2: goto L_0x08aa;
                case 3: goto L_0x08a0;
                case 4: goto L_0x088e;
                case 5: goto L_0x0857;
                case 6: goto L_0x083b;
                case 7: goto L_0x0833;
                case 8: goto L_0x0821;
                case 9: goto L_0x07fa;
                case 10: goto L_0x0775;
                case 11: goto L_0x0701;
                case 12: goto L_0x06ca;
                case 13: goto L_0x06ba;
                case 14: goto L_0x06ac;
                case 15: goto L_0x0571;
                case 16: goto L_0x053e;
                case 17: goto L_0x0536;
                case 18: goto L_0x0517;
                case 19: goto L_0x04e6;
                case 20: goto L_0x04d9;
                case 21: goto L_0x04cc;
                case 22: goto L_0x04af;
                case 23: goto L_0x0487;
                case 24: goto L_0x046f;
                case 25: goto L_0x0467;
                case 26: goto L_0x043a;
                case 27: goto L_0x042e;
                case 28: goto L_0x0424;
                case 29: goto L_0x0417;
                case 30: goto L_0x0402;
                case 31: goto L_0x03cf;
                case 32: goto L_0x03c8;
                case 33: goto L_0x0376;
                case 34: goto L_0x0007;
                case 35: goto L_0x0007;
                case 36: goto L_0x0333;
                case 37: goto L_0x031c;
                case 38: goto L_0x02c8;
                case 39: goto L_0x02a4;
                case 40: goto L_0x028a;
                case 41: goto L_0x0282;
                case 42: goto L_0x0232;
                case 43: goto L_0x0200;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01ed;
                case 46: goto L_0x01e1;
                case 47: goto L_0x01c5;
                case 48: goto L_0x0075;
                case 49: goto L_0x0025;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            com.whatsapp.companionmode.registration.CompanionRegistrationViewModel r0 = (com.whatsapp.companionmode.registration.CompanionRegistrationViewModel) r0
            X.2dy r0 = r0.A04
            X.1iA r2 = r0.A00()
            monitor-enter(r2)
            java.lang.String r0 = "companion/registration/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0022 }
            r1 = 2
            X.2jr r0 = r2.A0S     // Catch:{ all -> 0x0022 }
            r0.A01(r1)     // Catch:{ all -> 0x0022 }
            r2.A08()     // Catch:{ all -> 0x0022 }
            goto L_0x0926
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0025:
            java.lang.Object r5 = r1.A00
            X.2Ts r5 = (X.C43852Ts) r5
            X.5ZR r1 = r5.A08
            X.2Xk r0 = r5.A07
            boolean r0 = X.C106785aA.A04(r0, r1)
            java.lang.String r6 = "PHONE"
            r4 = 0
            r8 = 1
            if (r0 != 0) goto L_0x0051
            android.accounts.Account[] r7 = new android.accounts.Account[r8]
            android.content.Context r1 = r5.A02
            r0 = 2131892530(0x7f121932, float:1.941981E38)
            java.lang.String r1 = r1.getString(r0)
            android.accounts.Account r0 = new android.accounts.Account
            r0.<init>(r1, r6)
            r7[r4] = r0
        L_0x0049:
            r5.A01 = r7
            X.3Wi r0 = r5.A06
            X.C69263Wi.A02(r0, r5, r4)
            return
        L_0x0051:
            android.content.Context r3 = r5.A02
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r3)
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r1 = r1.getAccountsByType(r0)
            int r0 = r1.length
            int r2 = r0 + 1
            android.accounts.Account[] r7 = new android.accounts.Account[r2]
            java.lang.System.arraycopy(r1, r4, r7, r4, r0)
            int r2 = r2 - r8
            r0 = 2131892530(0x7f121932, float:1.941981E38)
            java.lang.String r1 = r3.getString(r0)
            android.accounts.Account r0 = new android.accounts.Account
            r0.<init>(r1, r6)
            r7[r2] = r0
            goto L_0x0049
        L_0x0075:
            java.lang.Object r0 = r1.A00
            com.whatsapp.contact.contactform.ContactFormActivity r0 = (com.whatsapp.contact.contactform.ContactFormActivity) r0
            X.2Tg r10 = r0.A0C     // Catch:{ Exception -> 0x0927 }
            X.3Ex r9 = r10.A02     // Catch:{ Exception -> 0x0927 }
            X.4uZ r11 = r10.A06     // Catch:{ Exception -> 0x0927 }
            X.3ZH r22 = r9.A07(r11)     // Catch:{ Exception -> 0x0927 }
            X.5Ud r0 = r10.A04     // Catch:{ Exception -> 0x0927 }
            java.lang.String r21 = r0.A02()     // Catch:{ Exception -> 0x0927 }
            X.C162457s7.A0D(r21)     // Catch:{ Exception -> 0x0927 }
            java.lang.String r20 = r0.A00()     // Catch:{ Exception -> 0x0927 }
            X.C162457s7.A0D(r20)     // Catch:{ Exception -> 0x0927 }
            if (r22 == 0) goto L_0x01bb
            int r0 = r21.length()     // Catch:{ Exception -> 0x0927 }
            r8 = 1
            r7 = 0
            if (r0 <= 0) goto L_0x01bb
            boolean r0 = r10.A09     // Catch:{ Exception -> 0x0927 }
            r19 = r0
            if (r0 == 0) goto L_0x0176
            java.lang.Long r1 = r10.A08     // Catch:{ Exception -> 0x0927 }
            if (r1 == 0) goto L_0x0176
            X.1vC r0 = r9.A05     // Catch:{ Exception -> 0x0927 }
            r29 = r0
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0927 }
            X.33i r0 = r0.A04     // Catch:{ Exception -> 0x0927 }
            X.5UR r12 = r0.A0R()     // Catch:{ Exception -> 0x0927 }
            if (r12 != 0) goto L_0x00e7
            java.lang.String r0 = "contact-mgr-db/deleteContact cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x0927 }
        L_0x00bc:
            X.1hq r1 = X.C34461vC.A00(r29)     // Catch:{ Exception -> 0x0927 }
            java.util.Set r0 = java.util.Collections.singleton(r22)     // Catch:{ Exception -> 0x0927 }
            r1.A09(r0)     // Catch:{ Exception -> 0x0927 }
            X.C48452ev.A00(r9, r11)     // Catch:{ Exception -> 0x0927 }
        L_0x00ca:
            android.content.Intent r3 = X.C18320x8.A07()     // Catch:{ Exception -> 0x0927 }
            java.lang.String r0 = "deleted_synced_contact"
            if (r19 == 0) goto L_0x00e3
            r3.putExtra(r0, r8)     // Catch:{ Exception -> 0x0927 }
        L_0x00d5:
            X.3Wi r2 = r10.A00     // Catch:{ Exception -> 0x0927 }
            r1 = 10
            X.3a7 r0 = new X.3a7     // Catch:{ Exception -> 0x0927 }
            r0.<init>(r10, r1, r3)     // Catch:{ Exception -> 0x0927 }
            r2.A0S(r0)     // Catch:{ Exception -> 0x0927 }
            goto L_0x01ba
        L_0x00e3:
            r3.putExtra(r0, r7)     // Catch:{ Exception -> 0x0927 }
            goto L_0x00d5
        L_0x00e7:
            java.lang.String r18 = "data1"
            java.lang.String[] r25 = new java.lang.String[]{r18}     // Catch:{ Exception -> 0x0927 }
            java.lang.String r26 = "raw_contact_id = ? AND mimetype = ? "
            java.lang.String[] r27 = X.AnonymousClass0x9.A1Z()     // Catch:{ Exception -> 0x0927 }
            java.lang.String r17 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0927 }
            r27[r7] = r17     // Catch:{ Exception -> 0x0927 }
            java.lang.String r6 = "vnd.android.cursor.item/phone_v2"
            r27[r8] = r6     // Catch:{ Exception -> 0x0927 }
            android.net.Uri r16 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ Exception -> 0x016e }
            r5 = 0
            r23 = r12
            r24 = r16
            r28 = r5
            android.database.Cursor r15 = r23.A03(r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x016e }
            if (r15 == 0) goto L_0x00bc
            int r0 = r15.getCount()     // Catch:{ all -> 0x0164 }
            if (r0 != r8) goto L_0x0121
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x0164 }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r1)     // Catch:{ all -> 0x0164 }
            r12.A01(r0, r5, r5)     // Catch:{ all -> 0x0164 }
        L_0x011d:
            r15.close()     // Catch:{ all -> 0x0164 }
            goto L_0x015f
        L_0x0121:
            r14 = 0
            r13 = 0
        L_0x0123:
            boolean r0 = r15.moveToNext()     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x0153
            r0 = r18
            int r0 = r15.getColumnIndex(r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = r15.getString(r0)     // Catch:{ all -> 0x0164 }
            r4 = r21
            r3 = r20
            boolean r3 = X.C107195ar.A04(r0, r4, r3)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x0150
            java.lang.String r4 = "raw_contact_id = ? AND mimetype = ? AND data1 = ? "
            java.lang.String[] r3 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x0164 }
            r3[r7] = r17     // Catch:{ all -> 0x0164 }
            X.C18300x5.A1K(r6, r0, r3)     // Catch:{ all -> 0x0164 }
            r0 = r16
            r12.A01(r0, r4, r3)     // Catch:{ all -> 0x0164 }
            int r13 = r13 + 1
        L_0x0150:
            int r14 = r14 + 1
            goto L_0x0123
        L_0x0153:
            if (r14 != r13) goto L_0x011d
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x0164 }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r1)     // Catch:{ all -> 0x0164 }
            r12.A01(r0, r5, r5)     // Catch:{ all -> 0x0164 }
            goto L_0x011d
        L_0x015f:
            r15.close()     // Catch:{ Exception -> 0x016e }
            goto L_0x00bc
        L_0x0164:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0169 }
            goto L_0x016d
        L_0x0169:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x016e }
        L_0x016d:
            throw r1     // Catch:{ Exception -> 0x016e }
        L_0x016e:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/delete unable to delete contact "
            X.C626936e.A08(r0, r1)     // Catch:{ Exception -> 0x0927 }
            goto L_0x00bc
        L_0x0176:
            X.1vC r0 = r9.A05     // Catch:{ Exception -> 0x0927 }
            java.util.ArrayList r0 = r0.A0D(r11)     // Catch:{ Exception -> 0x0927 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x0927 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x0927 }
        L_0x0184:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0927 }
            if (r0 == 0) goto L_0x019b
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0927 }
            r0 = r1
            X.3ZH r0 = (X.AnonymousClass3ZH) r0     // Catch:{ Exception -> 0x0927 }
            boolean r0 = r0.A0Q()     // Catch:{ Exception -> 0x0927 }
            if (r0 == 0) goto L_0x0184
            r3.add(r1)     // Catch:{ Exception -> 0x0927 }
            goto L_0x0184
        L_0x019b:
            int r0 = r3.size()     // Catch:{ Exception -> 0x0927 }
            if (r0 <= r8) goto L_0x01ae
            X.3Gp r2 = r10.A01     // Catch:{ Exception -> 0x0927 }
            X.3d3 r1 = X.C72023d3.A00     // Catch:{ Exception -> 0x0927 }
            java.util.List r0 = X.C18290x4.A12(r22)     // Catch:{ Exception -> 0x0927 }
            r2.A0L(r1, r0)     // Catch:{ Exception -> 0x0927 }
            goto L_0x00ca
        L_0x01ae:
            r0 = r22
            r9.A0L(r0)     // Catch:{ Exception -> 0x0927 }
            X.3Cq r0 = r10.A05     // Catch:{ Exception -> 0x0927 }
            r0.A08()     // Catch:{ Exception -> 0x0927 }
            goto L_0x00ca
        L_0x01ba:
            return
        L_0x01bb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0927 }
            java.lang.String r0 = "ContactManager/removeWAContact attempting to remove contact that is not in db with jid="
            X.C18260x0.A1Q(r1, r0, r11)     // Catch:{ Exception -> 0x0927 }
            return
        L_0x01c5:
            java.lang.Object r2 = r1.A00
            X.5Xd r2 = (X.C105975Xd) r2
            X.3Ex r0 = r2.A04
            X.2ev r0 = r0.A04
            java.util.Map r0 = r0.A01
            r0.clear()
            X.5ZU r1 = r2.A06
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0D
            r0.clear()
            X.1in r1 = r2.A05
            goto L_0x01f3
        L_0x01e1:
            java.lang.Object r0 = r1.A00
            X.3Ex r0 = (X.C64773Ex) r0
            X.1io r1 = r0.A0D
            X.6kE r0 = X.C135166kE.A00
            r1.A08(r0)
            return
        L_0x01ed:
            java.lang.Object r0 = r1.A00
            X.3Ex r0 = (X.C64773Ex) r0
            X.1in r1 = r0.A06
        L_0x01f3:
            r0 = 0
            r1.A0D(r0)
            return
        L_0x01f8:
            java.lang.Object r0 = r1.A00
            X.0xn r0 = (X.C18510xn) r0
            X.C18510xn.A01(r0)
            return
        L_0x0200:
            java.lang.Object r3 = r1.A00
            com.whatsapp.components.AutoScrollView r3 = (com.whatsapp.components.AutoScrollView) r3
            boolean r1 = r3.A02
            boolean r0 = r3.A03
            if (r1 == 0) goto L_0x0223
            r2 = 0
            android.widget.HorizontalScrollView r1 = r3.A00
            if (r0 == 0) goto L_0x0215
            int r0 = r3.A04
            r1.scrollTo(r0, r2)
            return
        L_0x0215:
            int r0 = r1.getMeasuredWidth()
            r1.scrollTo(r0, r2)
            int r0 = r3.A04
            int r0 = -r0
            r1.scrollBy(r0, r2)
            return
        L_0x0223:
            android.widget.HorizontalScrollView r1 = r3.A00
            if (r0 == 0) goto L_0x022c
            r0 = 0
            r1.scrollTo(r0, r0)
            return
        L_0x022c:
            r0 = 66
            r1.fullScroll(r0)
            return
        L_0x0232:
            java.lang.Object r4 = r1.A00
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3 = 0
            r6 = 0
            r5 = 0
            r2 = 0
        L_0x023a:
            int r0 = r4.getChildCount()
            if (r6 >= r0) goto L_0x0258
            android.view.View r1 = r4.getChildAt(r6)
            int r0 = r1.getWidth()
            int r5 = r5 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
            int r1 = r1 + r0
            int r2 = r2 + r1
            int r6 = r6 + 1
            goto L_0x023a
        L_0x0258:
            if (r5 <= 0) goto L_0x0927
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
            int r1 = r1 + r0
            int r0 = r4.getPaddingLeft()
            int r1 = r1 + r0
            int r0 = r4.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r4.getWidth()
            int r0 = r0 - r1
            int r0 = r0 - r2
            if (r5 < r0) goto L_0x0278
            r3 = 1
        L_0x0278:
            int r0 = r4.getOrientation()
            if (r0 == r3) goto L_0x0927
            r4.setOrientation(r3)
            return
        L_0x0282:
            java.lang.Object r0 = r1.A00
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.start()
            return
        L_0x028a:
            java.lang.Object r2 = r1.A00
            X.00M r2 = (X.AnonymousClass00M) r2
            X.0zH r3 = X.AnonymousClass5V0.A00(r2)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 72
            X.C19340zH.A04(r2, r3, r0, r1)
            r0 = 2131888044(0x7f1207ac, float:1.9410712E38)
            r3.A0T(r0)
            r0 = 2131888043(0x7f1207ab, float:1.941071E38)
            goto L_0x02bd
        L_0x02a4:
            java.lang.Object r2 = r1.A00
            android.content.Context r2 = (android.content.Context) r2
            X.0zH r3 = X.AnonymousClass5V0.A00(r2)
            r1 = 2131888037(0x7f1207a5, float:1.9410698E38)
            r0 = 46
            X.C19340zH.A08(r3, r2, r0, r1)
            r0 = 2131888039(0x7f1207a7, float:1.9410702E38)
            r3.A0T(r0)
            r0 = 2131888038(0x7f1207a6, float:1.94107E38)
        L_0x02bd:
            r3.A0U(r0)
            r0 = 0
            r3.A0i(r0)
            r3.A0S()
            return
        L_0x02c8:
            java.lang.Object r4 = r1.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r4 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r4
            X.8qC r0 = r4.A04
            if (r0 == 0) goto L_0x0315
            java.lang.Object r0 = r0.get()
            X.30z r0 = (X.C614930z) r0
            java.lang.String r1 = r0.A03
            r3 = 0
            if (r1 == 0) goto L_0x02f6
            int r0 = r1.length()
            if (r0 == 0) goto L_0x02f6
            X.8qC r0 = r4.A04
            if (r0 == 0) goto L_0x02ef
            java.lang.Object r0 = X.C18300x5.A0b(r0)
            X.30z r0 = (X.C614930z) r0
            X.AnonymousClass25P.A00(r4, r0, r1)
            return
        L_0x02ef:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02f6:
            X.0zH r2 = X.AnonymousClass5V0.A00(r4)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 73
            X.C19340zH.A04(r4, r2, r0, r1)
            r0 = 2131888035(0x7f1207a3, float:1.9410694E38)
            r2.A0T(r0)
            r0 = 2131888036(0x7f1207a4, float:1.9410696E38)
            r2.A0U(r0)
            r2.A0i(r3)
            r2.A0S()
            return
        L_0x0315:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x031c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r0 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r0
            X.2dy r0 = r0.A02
            if (r0 == 0) goto L_0x032c
            X.1iA r0 = r0.A00()
            r0.A0B()
            return
        L_0x032c:
            java.lang.String r0 = "companionRegistrationManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0333:
            java.lang.Object r3 = r1.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r3 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r3.A05
            if (r0 != 0) goto L_0x0346
            java.lang.String r0 = "cc"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0346:
            r1.append(r0)
            java.lang.String r0 = r3.A07
            if (r0 != 0) goto L_0x0355
            java.lang.String r0 = "pn"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0355:
            r1.append(r0)
            java.lang.String r0 = "@s.whatsapp.net"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A0A(r0)
            X.2dy r0 = r3.A02
            if (r0 == 0) goto L_0x036f
            r1 = 1
            X.1iA r0 = r0.A00()
            r0.A0F(r2, r1)
            return
        L_0x036f:
            java.lang.String r0 = "companionRegistrationManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0376:
            java.lang.Object r6 = r1.A00
            X.1iA r6 = (X.C29031iA) r6
            java.lang.String r0 = "companion/registration/link-code-ref/timeout"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            monitor-enter(r6)
            r1 = 0
            r6.A04 = r1     // Catch:{ all -> 0x03c5 }
            r6.A0E = r1     // Catch:{ all -> 0x03c5 }
            java.util.concurrent.atomic.AtomicReference r0 = r6.A0t     // Catch:{ all -> 0x03c5 }
            r0.set(r1)     // Catch:{ all -> 0x03c5 }
            r6.A0G = r1     // Catch:{ all -> 0x03c5 }
            X.8qC r0 = r6.A0r     // Catch:{ all -> 0x03c5 }
            boolean r5 = X.C18300x5.A1U(r0)     // Catch:{ all -> 0x03c5 }
            monitor-exit(r6)     // Catch:{ all -> 0x03c5 }
            int r0 = r6.A01
            long r3 = (long) r0
            r1 = 4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03ae
            java.lang.String r0 = "companion/registration/auto refreshing link code"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r6.A01
            r1 = 1
            int r0 = r0 + 1
            r6.A01 = r0
            com.whatsapp.jid.UserJid r0 = r6.A07
            r6.A0F(r0, r1)
            return
        L_0x03ae:
            java.util.Iterator r1 = X.C61102zi.A03(r6)
        L_0x03b2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03c2
            java.lang.Object r0 = r1.next()
            X.2rf r0 = (X.C56242rf) r0
            r0.A00()
            goto L_0x03b2
        L_0x03c2:
            r6.A01 = r5
            return
        L_0x03c5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x03c5 }
            throw r0
        L_0x03c8:
            java.lang.Object r1 = r1.A00
            X.1iA r1 = (X.C29031iA) r1
            java.lang.String r0 = "companion/registration/link code/timed out waiting for pair success"
            goto L_0x041d
        L_0x03cf:
            java.lang.Object r3 = r1.A00
            X.1iA r3 = (X.C29031iA) r3
            java.lang.String r0 = "companion/registration/qr-refs/timeout"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            monitor-enter(r3)
            r2 = 0
            X.2jr r0 = r3.A0S     // Catch:{ all -> 0x03ff }
            r0.A01(r2)     // Catch:{ all -> 0x03ff }
            X.8qC r0 = r3.A0r     // Catch:{ all -> 0x03ff }
            X.3Lt r1 = X.AnonymousClass0x9.A0S(r0)     // Catch:{ all -> 0x03ff }
            r0 = 16
            r1.A0F(r2, r0)     // Catch:{ all -> 0x03ff }
            monitor-exit(r3)     // Catch:{ all -> 0x03ff }
            java.util.Iterator r1 = X.C61102zi.A03(r3)
        L_0x03ef:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0927
            java.lang.Object r0 = r1.next()
            X.2rf r0 = (X.C56242rf) r0
            r0.A01()
            goto L_0x03ef
        L_0x03ff:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03ff }
            throw r0
        L_0x0402:
            java.lang.Object r4 = r1.A00
            X.1iA r4 = (X.C29031iA) r4
            java.lang.String r0 = "companion/registration/server registration/timeout"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2by r3 = r4.A0R
            r2 = 2
            r0 = 401(0x191, double:1.98E-321)
            r3.A00(r2, r0)
            r4.A0B()
            return
        L_0x0417:
            java.lang.Object r1 = r1.A00
            X.1iA r1 = (X.C29031iA) r1
            java.lang.String r0 = "companion/registration/verification error/timeout"
        L_0x041d:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1.A0B()
            return
        L_0x0424:
            java.lang.Object r1 = r1.A00
            X.3XA r1 = (X.AnonymousClass3XA) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A05(r0)
            return
        L_0x042e:
            java.lang.Object r2 = r1.A00
            com.whatsapp.companionmode.registration.CompanionPostLogoutActivity r2 = (com.whatsapp.companionmode.registration.CompanionPostLogoutActivity) r2
            X.2hd r1 = r2.A02
            java.lang.String r0 = "CompanionPostLogoutActivity"
            r1.A01(r2, r0)
            return
        L_0x043a:
            java.lang.Object r1 = r1.A00
            X.2NP r1 = (X.AnonymousClass2NP) r1
            X.2w2 r5 = r1.A02
            int r0 = r5.A01
            com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker r4 = r1.A01
            X.2yM r3 = r4.A01
            if (r0 != 0) goto L_0x0459
            r2 = 0
            long r0 = r1.A00
            r3.A02(r5, r0, r2)
            X.6bK r1 = r4.A00
            X.0Ao r0 = new X.0Ao
            r0.<init>()
        L_0x0455:
            r1.A05(r0)
            return
        L_0x0459:
            r2 = 1
            long r0 = r1.A00
            r3.A02(r5, r0, r2)
            X.6bK r1 = r4.A00
            X.0An r0 = new X.0An
            r0.<init>()
            goto L_0x0455
        L_0x0467:
            java.lang.Object r0 = r1.A00
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x046f:
            java.lang.Object r0 = r1.A00
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0477:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0927
            java.lang.Object r0 = r1.next()
            X.4F0 r0 = (X.AnonymousClass4F0) r0
            r0.BO5()
            goto L_0x0477
        L_0x0487:
            java.lang.Object r1 = r1.A00
            X.1Ox r1 = (X.C22621Ox) r1
            X.2sr r0 = r1.A02
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x0927
            monitor-enter(r1)
            java.util.List r5 = r1.A01     // Catch:{ all -> 0x04ac }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x04ac }
            r1.A01 = r0     // Catch:{ all -> 0x04ac }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x04ac }
            X.3Cq r2 = r1.A05     // Catch:{ all -> 0x04ac }
            X.227 r4 = X.AnonymousClass227.A04     // Catch:{ all -> 0x04ac }
            X.2xW r3 = X.C59812xW.A0D     // Catch:{ all -> 0x04ac }
            r6 = 0
            r7 = 1
            r2.A02(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x04ac }
            monitor-exit(r1)     // Catch:{ all -> 0x04ac }
            return
        L_0x04ac:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x04ac }
            throw r0
        L_0x04af:
            java.lang.Object r2 = r1.A00
            X.339 r2 = (X.AnonymousClass339) r2
            r1 = 15
            r0 = 0
            r2.A02(r1, r0)
            X.30l r1 = r2.A04
            X.2sH r0 = r2.A07
            long r2 = r0.A0H()
            android.content.SharedPreferences$Editor r1 = X.C613730l.A00(r1)
            java.lang.String r0 = "syncd_last_lthash_consistency_check_time"
            X.C18270x1.A0i(r1, r0, r2)
            return
        L_0x04cc:
            java.lang.Object r1 = r1.A00
            X.3Gp r1 = (X.C65203Gp) r1
            X.3El r0 = r1.A0I
            r0.A00()
            r1.A0D()
            goto L_0x04e2
        L_0x04d9:
            java.lang.Object r1 = r1.A00
            X.3Gp r1 = (X.C65203Gp) r1
            X.3El r0 = r1.A0I
            r0.A00()
        L_0x04e2:
            r1.A0F()
            return
        L_0x04e6:
            java.lang.Object r3 = r1.A00
            X.3Gp r3 = (X.C65203Gp) r3
            X.3Tb r0 = r3.A0A
            X.30l r0 = r0.A05
            android.content.SharedPreferences r2 = r0.A02()
            java.lang.String r1 = "syncd_dirty"
            r0 = -1
            int r1 = r2.getInt(r1, r0)
            if (r1 == r0) goto L_0x050d
            r0 = 4
            if (r1 >= r0) goto L_0x050d
            boolean r0 = X.C56972sr.A0C(r3)
            r1 = 1
            r0 = r0 ^ 1
            X.C626936e.A0B(r0)
            r3.A0H(r1)
            return
        L_0x050d:
            boolean r0 = r3.A0Q()
            if (r0 == 0) goto L_0x0927
            r3.A0F()
            return
        L_0x0517:
            java.lang.Object r2 = r1.A00
            X.3Gp r2 = (X.C65203Gp) r2
            boolean r0 = X.C56972sr.A0C(r2)
            if (r0 != 0) goto L_0x0927
            X.2j3 r1 = r2.A0c
            java.lang.String r0 = "primary_feature"
            X.2sc r0 = r1.A00(r0)
            X.1Os r0 = (X.C22571Os) r0
            if (r0 == 0) goto L_0x0927
            java.util.List r0 = r0.A0E()
            r2.A0K(r0)
            return
        L_0x0536:
            java.lang.Object r5 = r1.A00
            X.2qH r5 = (X.C55392qH) r5
            java.lang.String r0 = "archive"
            goto L_0x06d9
        L_0x053e:
            java.lang.Object r0 = r1.A00
            X.3Gp r0 = (X.C65203Gp) r0
            X.2qH r5 = r0.A0N
            monitor-enter(r5)
            X.34v r4 = r5.A02     // Catch:{ all -> 0x056e }
            r0 = 1
            X.4JH r3 = new X.4JH     // Catch:{ all -> 0x056e }
            r3.<init>(r0)     // Catch:{ all -> 0x056e }
            r2 = 0
            java.lang.String r1 = "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.lang.String r0 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.List r0 = r4.A08(r3, r0, r1, r2)     // Catch:{ all -> 0x056e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x056e }
        L_0x055a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x056e }
            if (r0 == 0) goto L_0x056c
            X.33W r1 = X.C18320x8.A0K(r2)     // Catch:{ all -> 0x056e }
            boolean r0 = r1 instanceof X.C837649r     // Catch:{ all -> 0x056e }
            if (r0 == 0) goto L_0x055a
            r5.A02(r1)     // Catch:{ all -> 0x056e }
            goto L_0x055a
        L_0x056c:
            monitor-exit(r5)     // Catch:{ all -> 0x056e }
            return
        L_0x056e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x056e }
            throw r0
        L_0x0571:
            java.lang.Object r4 = r1.A00
            X.3Fe r4 = (X.C64833Fe) r4
            java.lang.String r10 = "NonMessageDataRequestManager/dailyCheck invalid deviceId"
            X.2rl r1 = r4.A0A
            r0 = 70
            java.util.List r0 = r1.A04(r0)
            java.util.HashSet r9 = X.AnonymousClass002.A0K()
            java.util.Iterator r2 = r0.iterator()
        L_0x0587:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x059d
            java.lang.Object r1 = r2.next()
            X.1nN r1 = (X.C30891nN) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0587
            java.util.Set r0 = r1.A01
            r9.addAll(r0)
            goto L_0x0587
        L_0x059d:
            X.2wL r8 = r4.A0B
            X.C626936e.A00()
            java.util.HashSet r1 = X.AnonymousClass002.A0K()
            X.1RE r0 = r8.A00
            X.4GK r5 = r0.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x06a2 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x06a2 }
            java.lang.String r2 = "SELECT file_key, rmr_source, failure_count, response_device_id, last_fetch_timestamp FROM rmr_response_error"
            java.lang.String r0 = "RequestMediaReUploadResponseErrorStore.GET_ALL_RESPONSE"
            android.database.Cursor r2 = X.C56862sg.A01(r3, r2, r0)     // Catch:{ all -> 0x06a2 }
        L_0x05b9:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0696 }
            if (r0 == 0) goto L_0x05c7
            X.32I r0 = X.AnonymousClass32I.A00(r2)     // Catch:{ all -> 0x0696 }
            r1.add(r0)     // Catch:{ all -> 0x0696 }
            goto L_0x05b9
        L_0x05c7:
            r2.close()     // Catch:{ all -> 0x06a2 }
            r5.close()
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
            X.318 r0 = r4.A09
            X.6aS r6 = r0.A04()
            X.2sr r0 = r4.A00
            com.whatsapp.jid.PhoneUserJid r5 = X.C56972sr.A04(r0)
            int r3 = r0.A0D()
            X.2sH r0 = r4.A07
            long r21 = r0.A0H()
            java.util.Iterator r20 = r1.iterator()
        L_0x05eb:
            boolean r0 = r20.hasNext()
            r19 = 0
            if (r0 == 0) goto L_0x0678
            java.lang.Object r14 = r20.next()
            X.32I r14 = (X.AnonymousClass32I) r14
            java.lang.String r2 = r14.A04
            boolean r0 = r9.contains(r2)
            if (r0 == 0) goto L_0x060b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NonMessageDataRequestManager/dailyCheck request inFlight="
            X.C18260x0.A0s(r0, r2, r1)
            goto L_0x05eb
        L_0x060b:
            int r13 = r14.A03
            if (r13 == 0) goto L_0x061a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NonMessageDataRequestManager/dailyCheck invalid rmr source="
            X.C18260x0.A0x(r0, r1, r13)
            r19 = 1
        L_0x061a:
            int r12 = r14.A02     // Catch:{ 24P -> 0x0623 }
            X.32r r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 24P -> 0x0623 }
            com.whatsapp.jid.DeviceJid r11 = r0.A01(r5, r12)     // Catch:{ 24P -> 0x0623 }
            goto L_0x0633
        L_0x0623:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r10)
            int r12 = r14.A02
            r0.append(r12)
            X.C18280x3.A1C(r0, r1)
            r11 = 0
            r19 = 1
        L_0x0633:
            if (r12 == r3) goto L_0x063b
            boolean r0 = r6.contains(r11)
            if (r0 != 0) goto L_0x0644
        L_0x063b:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A0x(r10, r0, r12)
            r19 = 1
        L_0x0644:
            long r0 = r14.A01
            long r17 = r21 - r0
            r15 = 172800000(0xa4cb800, double:8.53745436E-316)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0673
            int r1 = r14.A00
            r0 = 3
            if (r1 > r0) goto L_0x0673
            if (r19 != 0) goto L_0x0673
            if (r11 == 0) goto L_0x0673
            r9.add(r2)
            boolean r0 = r7.containsKey(r11)
            if (r0 != 0) goto L_0x0668
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            r7.put(r11, r0)
        L_0x0668:
            java.lang.Object r0 = X.C18290x4.A0i(r11, r7)
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r2)
            goto L_0x05eb
        L_0x0673:
            r8.A00(r2, r13, r12)
            goto L_0x05eb
        L_0x0678:
            java.util.Iterator r3 = X.AnonymousClass001.A0u(r7)
        L_0x067c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0927
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r3)
            X.2cT r2 = r4.A04
            com.whatsapp.jid.DeviceJid r1 = X.AnonymousClass0x9.A0Q(r0)
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            r2.A00(r1, r0)
            goto L_0x067c
        L_0x0696:
            r1 = move-exception
            if (r2 == 0) goto L_0x06a1
            r2.close()     // Catch:{ all -> 0x069d }
            goto L_0x06a1
        L_0x069d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06a2 }
        L_0x06a1:
            throw r1     // Catch:{ all -> 0x06a2 }
        L_0x06a2:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x06a7 }
            throw r1
        L_0x06a7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x06ac:
            java.lang.Object r1 = r1.A00
            X.1VT r1 = (X.AnonymousClass1VT) r1
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable privacy setting relay all calls"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2qH r5 = r1.A06
            X.21t r0 = X.C373121t.PRIVACY_SETTING_RELAY_ALL_CALLS
            goto L_0x06d7
        L_0x06ba:
            java.lang.Object r1 = r1.A00
            X.1VT r1 = (X.AnonymousClass1VT) r1
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable fav sticker sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Gp r0 = r1.A05
            X.2qH r5 = r0.A0N
            java.lang.String r0 = "favoriteSticker"
            goto L_0x06d9
        L_0x06ca:
            java.lang.Object r1 = r1.A00
            X.1VT r1 = (X.AnonymousClass1VT) r1
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable external web beta sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2qH r5 = r1.A06
            X.21t r0 = X.C373121t.EXTERNAL_WEB_BETA
        L_0x06d7:
            java.lang.String r0 = r0.mutationName
        L_0x06d9:
            monitor-enter(r5)
            X.34v r4 = r5.A02     // Catch:{ all -> 0x06fe }
            X.3H7 r3 = new X.3H7     // Catch:{ all -> 0x06fe }
            r3.<init>(r0)     // Catch:{ all -> 0x06fe }
            r2 = 0
            java.lang.String r1 = "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.lang.String r0 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.List r0 = r4.A08(r3, r0, r1, r2)     // Catch:{ all -> 0x06fe }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x06fe }
        L_0x06ee:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x06fc
            X.33W r0 = X.C18320x8.A0K(r1)     // Catch:{ all -> 0x06fe }
            r5.A02(r0)     // Catch:{ all -> 0x06fe }
            goto L_0x06ee
        L_0x06fc:
            monitor-exit(r5)     // Catch:{ all -> 0x06fe }
            return
        L_0x06fe:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x06fe }
            throw r0
        L_0x0701:
            java.lang.Object r1 = r1.A00
            X.1VT r1 = (X.AnonymousClass1VT) r1
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable note to self, sync meContact"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Gp r3 = r1.A05
            X.2sr r4 = r3.A06
            boolean r0 = r4.A0Y()
            if (r0 != 0) goto L_0x0927
            monitor-enter(r3)
            X.3Mg r0 = r3.A0e     // Catch:{ all -> 0x0772 }
            boolean r0 = X.C66653Mg.A00(r0)     // Catch:{ all -> 0x0772 }
            if (r0 == 0) goto L_0x0770
            boolean r0 = X.C56972sr.A0C(r3)     // Catch:{ all -> 0x0772 }
            if (r0 != 0) goto L_0x0770
            X.2j3 r1 = r3.A0c     // Catch:{ all -> 0x0772 }
            java.lang.String r0 = "contact"
            X.2sc r0 = r1.A00(r0)     // Catch:{ all -> 0x0772 }
            if (r0 == 0) goto L_0x0770
            boolean r0 = r3.A0Q()     // Catch:{ all -> 0x0772 }
            if (r0 == 0) goto L_0x0770
            X.3Ex r2 = r3.A0Q     // Catch:{ all -> 0x0772 }
            X.2sr r0 = r2.A02     // Catch:{ all -> 0x0772 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)     // Catch:{ all -> 0x0772 }
            X.3ZH r1 = r2.A09(r0)     // Catch:{ all -> 0x0772 }
            if (r1 == 0) goto L_0x0770
            X.1vC r0 = r2.A05     // Catch:{ all -> 0x0772 }
            boolean r0 = r0.A0V(r1)     // Catch:{ all -> 0x0772 }
            if (r0 == 0) goto L_0x0770
            java.lang.String r0 = "sync-manager/reSyncMeContactIfAvailable sync meContact"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0772 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0772 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r4)     // Catch:{ all -> 0x0772 }
            r1.add(r0)     // Catch:{ all -> 0x0772 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0772 }
            android.util.Pair r0 = r3.A02(r1, r0)     // Catch:{ all -> 0x0772 }
            X.1vA r2 = r3.A0i     // Catch:{ all -> 0x0772 }
            java.lang.String r1 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x0772 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0772 }
            r2.A06(r1, r0)     // Catch:{ all -> 0x0772 }
            r3.A0E()     // Catch:{ all -> 0x0772 }
        L_0x0770:
            monitor-exit(r3)     // Catch:{ all -> 0x0772 }
            return
        L_0x0772:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0772 }
            throw r0
        L_0x0775:
            java.lang.Object r2 = r1.A00
            X.1VT r2 = (X.AnonymousClass1VT) r2
            X.3Gp r0 = r2.A05
            boolean r0 = r0.A0Q()
            if (r0 == 0) goto L_0x0927
            X.2s7 r0 = r2.A07
            X.8OQ r0 = r0.A00()
            X.6aS r3 = r0.keySet()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable the recent sticker, peer size="
            X.C18260x0.A1B(r0, r1, r3)
            java.util.Iterator r4 = r3.iterator()
        L_0x0798:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0927
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass0x7.A0R(r4)
            X.2RU r1 = new X.2RU
            r1.<init>(r0)
            r0 = 1
            r1.A03 = r0
            X.30s r5 = r2.A09
            r9 = 0
            com.whatsapp.jid.DeviceJid r7 = r1.A04
            X.2jp r6 = r1.A00
            boolean r3 = r1.A02
            boolean r1 = r1.A01
            X.2sr r0 = r5.A02
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x07c3
            java.lang.String r0 = "history-sync-send-methods/sendNonBlockingDataMessages no support for companionMode"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x0798
        L_0x07c3:
            X.1A0 r8 = X.AnonymousClass0x7.A0Z()     // Catch:{ Exception -> 0x07f3 }
            X.23J r0 = X.AnonymousClass23J.NON_BLOCKING_DATA     // Catch:{ Exception -> 0x07f3 }
            r8.A0D(r0)     // Catch:{ Exception -> 0x07f3 }
            r5.A09(r8)     // Catch:{ Exception -> 0x07f3 }
            if (r3 == 0) goto L_0x07d4
            r5.A07(r8)     // Catch:{ Exception -> 0x07f3 }
        L_0x07d4:
            if (r1 == 0) goto L_0x07d9
            r5.A08(r8)     // Catch:{ Exception -> 0x07f3 }
        L_0x07d9:
            r15 = 0
            r11 = 0
            r12 = 5
            r13 = 100
            r17 = -1
            r21 = r17
            r25 = r15
            r27 = r17
            r29 = r11
            r10 = r9
            r14 = r11
            r19 = r17
            r23 = r15
            r5.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r21, r23, r25, r27, r29)     // Catch:{ Exception -> 0x07f3 }
            goto L_0x0798
        L_0x07f3:
            r1 = move-exception
            java.lang.String r0 = "history-sync-send-methods/sendNonBlockingDataMessages: error"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0798
        L_0x07fa:
            java.lang.Object r3 = r1.A00
            com.whatsapp.companiondevice.sync.HistorySyncWorker r3 = (com.whatsapp.companiondevice.sync.HistorySyncWorker) r3
            r3.A0C()     // Catch:{ all -> 0x0814 }
            X.3cZ r0 = r3.A00     // Catch:{ all -> 0x0814 }
            if (r0 == 0) goto L_0x0808
            r0.run()     // Catch:{ all -> 0x0814 }
        L_0x0808:
            X.4Bd r1 = r3.A01
            if (r1 == 0) goto L_0x0927
            X.2qw r0 = r3.A07
            X.3XB r0 = r0.A00
            r0.A03(r1)
            return
        L_0x0814:
            r2 = move-exception
            X.4Bd r1 = r3.A01
            if (r1 == 0) goto L_0x0820
            X.2qw r0 = r3.A07
            X.3XB r0 = r0.A00
            r0.A03(r1)
        L_0x0820:
            throw r2
        L_0x0821:
            java.lang.Object r1 = r1.A00
            X.3Et r1 = (X.C64743Et) r1
            X.2qw r0 = r1.A0D
            X.2o9 r0 = r0.A00()
            if (r0 == 0) goto L_0x0927
            X.2Vn r0 = r1.A03
            r0.A00()
            return
        L_0x0833:
            java.lang.Object r0 = r1.A00
            com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker r0 = (com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker) r0
            r0.A0B()
            return
        L_0x083b:
            java.lang.Object r5 = r1.A00
            X.2S4 r5 = (X.AnonymousClass2S4) r5
            java.util.Set r0 = X.AnonymousClass33W.A09
            java.util.Iterator r4 = r0.iterator()
        L_0x0845:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x087c
            java.lang.String r3 = X.AnonymousClass001.A0m(r4)
            X.2ri r2 = r5.A04
            r0 = 0
            r2.A04(r3, r0)
            goto L_0x0845
        L_0x0857:
            java.lang.Object r5 = r1.A00
            X.2S4 r5 = (X.AnonymousClass2S4) r5
            java.util.Set r0 = X.AnonymousClass33W.A08
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r0)
            java.util.Set r0 = X.AnonymousClass33W.A09
            r1.removeAll(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x086a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0888
            java.lang.String r3 = X.AnonymousClass001.A0m(r4)
            X.2ri r2 = r5.A04
            r0 = 0
            r2.A04(r3, r0)
            goto L_0x086a
        L_0x087c:
            X.2q4 r0 = r5.A03
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C55262q4.A00(r0)
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            X.C18270x1.A0h(r1, r0, r2)
        L_0x0888:
            X.3Gp r0 = r5.A02
            r0.A0G()
            return
        L_0x088e:
            java.lang.Object r2 = r1.A00
            X.4Uq r2 = (X.AnonymousClass4Uq) r2
            X.08M r1 = r2.A01
            r0 = 0
            r1.A0H(r0)
            X.08M r1 = r2.A02
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0H(r0)
            return
        L_0x08a0:
            java.lang.Object r0 = r1.A00
            X.4Uq r0 = (X.AnonymousClass4Uq) r0
            X.2ZS r0 = r0.A04
            r0.A00()
            return
        L_0x08aa:
            java.lang.Object r8 = r1.A00
            X.3Tb r8 = (X.C68413Tb) r8
            X.3Ek r7 = r8.A04
            X.30l r4 = r8.A05
            android.content.SharedPreferences r0 = r4.A02()
            java.lang.String r5 = "syncd_dirty_reason"
            int r0 = X.C18280x3.A02(r0, r5)
            if (r0 == 0) goto L_0x0900
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x08c3:
            android.content.SharedPreferences r1 = r4.A02()
            java.lang.String r0 = "syncd_dirty"
            int r0 = X.C18310x6.A03(r1, r0)
            int r0 = r0 + -1
            long r2 = (long) r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncStatsManager/onDataDeletion reason :"
            X.C18260x0.A1P(r1, r0, r6)
            X.1XP r1 = new X.1XP
            r1.<init>()
            r1.A00 = r6
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A01 = r0
            X.C64663Ek.A05(r7, r1)
            X.1i1 r0 = r8.A03
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x08f0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0902
            java.lang.Object r0 = r1.next()
            X.4E2 r0 = (X.AnonymousClass4E2) r0
            r0.Bdq()
            goto L_0x08f0
        L_0x0900:
            r6 = 0
            goto L_0x08c3
        L_0x0902:
            android.content.SharedPreferences r0 = r4.A02()
            X.C18270x1.A0n(r0, r5)
            r0 = -1
            r4.A05(r0)
            return
        L_0x090e:
            java.lang.Object r0 = r1.A00
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0916:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0927
            java.lang.Object r0 = r1.next()
            X.4E2 r0 = (X.AnonymousClass4E2) r0
            r0.Bdr()
            goto L_0x0916
        L_0x0926:
            monitor-exit(r2)
        L_0x0927:
            return
        L_0x0928:
            java.lang.Object r1 = r1.A00
            X.3Tb r1 = (X.C68413Tb) r1
            r0 = 0
            r1.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69963Zi.run():void");
    }
}
