package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5Xd  reason: invalid class name and case insensitive filesystem */
public class C105975Xd {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C65203Gp A02;
    public final C44772Xk A03;
    public final C64773Ex A04;
    public final C29421in A05;
    public final AnonymousClass5ZU A06;
    public final C66413Li A07;
    public final C64223Cq A08;
    public final C620633i A09;
    public final C56612sH A0A;
    public final C53412n3 A0B;
    public final C55302q8 A0C;
    public final AnonymousClass1VX A0D;
    public final AnonymousClass2ML A0E;
    public final AnonymousClass4FS A0F;
    public final AnonymousClass2Z2 A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0260, code lost:
        if (r11 == false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0262, code lost:
        r7.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02fb, code lost:
        r0 = r1.getAsString("data3");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02ff, code lost:
        r8.putExtra(r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A00(android.app.Activity r15, android.graphics.Bitmap r16, X.C106705a1 r17, boolean r18) {
        /*
            if (r18 == 0) goto L_0x0064
            java.lang.String r1 = "android.intent.action.INSERT"
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r1, r0)
        L_0x000b:
            java.lang.String r1 = "finishActivityOnSaveCompleted"
            r0 = 1
            r8.putExtra(r1, r0)
            r12 = r17
            X.5Ot r0 = r12.A0A
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "name"
            r8.putExtra(r0, r1)
            android.content.res.Resources r2 = r15.getResources()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.List r0 = r12.A06
            java.lang.String r6 = "data3"
            java.lang.String r11 = "data2"
            java.lang.String r5 = "data1"
            java.lang.String r9 = "mimetype"
            if (r0 == 0) goto L_0x0070
            java.util.Iterator r10 = r0.iterator()
        L_0x0034:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0070
            X.7OD r4 = X.AnonymousClass4L0.A0R(r10)
            android.content.ContentValues r3 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            r3.put(r9, r0)
            java.lang.String r0 = r4.A02
            r3.put(r5, r0)
            int r0 = r4.A00
            X.C18270x1.A0b(r3, r11, r0)
            int r1 = r4.A00
            java.lang.String r0 = r4.A03
            java.lang.CharSequence r0 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(r2, r1, r0)
            java.lang.String r0 = r0.toString()
            r3.put(r6, r0)
            r7.add(r3)
            goto L_0x0034
        L_0x0064:
            java.lang.String r0 = "android.intent.action.INSERT_OR_EDIT"
            android.content.Intent r8 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "vnd.android.cursor.item/contact"
            r8.setType(r0)
            goto L_0x000b
        L_0x0070:
            java.util.List r0 = r12.A03
            java.lang.String r4 = "data4"
            if (r0 == 0) goto L_0x0112
            java.util.Iterator r13 = r0.iterator()
        L_0x007a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r3 = r13.next()
            X.5KP r3 = (X.AnonymousClass5KP) r3
            java.lang.Class r10 = r3.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r10 != r0) goto L_0x00b2
            android.content.ContentValues r10 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "vnd.android.cursor.item/email_v2"
            r10.put(r9, r0)
            java.lang.String r0 = r3.A02
            r10.put(r5, r0)
            int r0 = r3.A00
            X.C18270x1.A0b(r10, r11, r0)
            int r1 = r3.A00
            java.lang.String r0 = r3.A03
            java.lang.CharSequence r0 = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(r2, r1, r0)
        L_0x00a7:
            java.lang.String r0 = r0.toString()
            r10.put(r6, r0)
            r7.add(r10)
            goto L_0x007a
        L_0x00b2:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r10 != r0) goto L_0x00fc
            android.content.ContentValues r10 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "vnd.android.cursor.item/postal-address_v2"
            r10.put(r9, r0)
            X.5X7 r0 = r3.A04
            java.lang.String r0 = r0.A03
            java.lang.String r0 = X.AnonymousClass5X7.A00(r0)
            r10.put(r4, r0)
            X.5X7 r0 = r3.A04
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "data7"
            r10.put(r0, r1)
            X.5X7 r0 = r3.A04
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "data8"
            r10.put(r0, r1)
            X.5X7 r0 = r3.A04
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "data9"
            r10.put(r0, r1)
            X.5X7 r0 = r3.A04
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "data10"
            r10.put(r0, r1)
            int r0 = r3.A00
            X.C18270x1.A0b(r10, r11, r0)
            int r1 = r3.A00
            java.lang.String r0 = r3.A03
            java.lang.CharSequence r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(r2, r1, r0)
            goto L_0x00a7
        L_0x00fc:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Im> r0 = android.provider.ContactsContract.CommonDataKinds.Im.class
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r10 != r0) goto L_0x010f
            java.lang.String r0 = "sharecontactutil "
        L_0x0106:
            java.lang.String r0 = X.C18300x5.A0k(r3, r0, r1)
            X.C18260x0.A1K(r1, r0)
            goto L_0x007a
        L_0x010f:
            java.lang.String r0 = "sharecontactutil/type/unknown "
            goto L_0x0106
        L_0x0112:
            java.util.List r0 = r12.A05
            java.lang.String r3 = "data5"
            r10 = 0
            if (r0 == 0) goto L_0x0156
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0156
            java.util.List r0 = r12.A05
            java.lang.Object r13 = r0.get(r10)
            X.7Il r13 = (X.C148457Il) r13
            java.lang.String r1 = r13.A00
            java.lang.String r0 = " "
            int r14 = r1.lastIndexOf(r0)
            if (r14 <= 0) goto L_0x0135
            java.lang.String r1 = r1.substring(r10, r14)
        L_0x0135:
            android.content.ContentValues r2 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "vnd.android.cursor.item/organization"
            r2.put(r9, r0)
            r2.put(r5, r1)
            if (r14 <= 0) goto L_0x014e
            java.lang.String r1 = r13.A00
            int r0 = r14 + 1
            java.lang.String r0 = r1.substring(r0)
            r2.put(r3, r0)
        L_0x014e:
            java.lang.String r0 = r13.A01
            r2.put(r4, r0)
            r7.add(r2)
        L_0x0156:
            java.util.List r0 = r12.A07
            if (r0 == 0) goto L_0x0189
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0189
            java.util.List r0 = r12.A07
            java.util.Iterator r13 = r0.iterator()
        L_0x0166:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r2 = r13.next()
            X.7Im r2 = (X.C148467Im) r2
            android.content.ContentValues r1 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "vnd.android.cursor.item/website"
            r1.put(r9, r0)
            int r0 = r2.A00
            X.C18270x1.A0b(r1, r11, r0)
            java.lang.String r0 = r2.A01
            r1.put(r5, r0)
            r7.add(r1)
            goto L_0x0166
        L_0x0189:
            java.util.Map r0 = r12.A08
            if (r0 == 0) goto L_0x0218
            java.util.Iterator r15 = X.C18280x3.A0i(r0)
        L_0x0191:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0218
            java.lang.String r13 = X.AnonymousClass001.A0m(r15)
            java.lang.String r0 = "NICKNAME"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01b8
            android.content.ContentValues r1 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "vnd.android.cursor.item/nickname"
            r1.put(r9, r0)
            X.5T6 r0 = X.C106705a1.A00(r13, r12)
            java.lang.String r0 = r0.A02
            r1.put(r5, r0)
            r7.add(r1)
        L_0x01b8:
            java.lang.String r0 = "BDAY"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01d9
            android.content.ContentValues r1 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "vnd.android.cursor.item/contact_event"
            r1.put(r9, r0)
            r0 = 3
            X.C18270x1.A0b(r1, r11, r0)
            X.5T6 r0 = X.C106705a1.A00(r13, r12)
            java.lang.String r0 = r0.A02
            r1.put(r5, r0)
            r7.add(r1)
        L_0x01d9:
            java.util.HashMap r14 = X.C106705a1.A0E
            boolean r0 = r14.containsKey(r13)
            if (r0 == 0) goto L_0x0191
            X.5T6 r1 = X.C106705a1.A00(r13, r12)
            android.content.ContentValues r2 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "vnd.android.cursor.item/im"
            r2.put(r9, r0)
            java.lang.Object r0 = r14.get(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.put(r3, r0)
            X.5T6 r0 = X.C106705a1.A00(r13, r12)
            java.lang.String r0 = r0.A02
            r2.put(r5, r0)
            java.util.Set r1 = r1.A04
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0213
            java.lang.Object[] r0 = r1.toArray()
            r0 = r0[r10]
            java.lang.String r0 = (java.lang.String) r0
            r2.put(r11, r0)
        L_0x0213:
            r7.add(r2)
            goto L_0x0191
        L_0x0218:
            r2 = r16
            if (r16 == 0) goto L_0x0240
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 100
            r2.compress(r1, r0, r10)
            byte[] r2 = r10.toByteArray()
            android.content.ContentValues r1 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "vnd.android.cursor.item/photo"
            r1.put(r9, r0)
            java.lang.String r0 = "data15"
            r1.put(r0, r2)
            r7.add(r1)
            r10.close()     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0265
            r2 = 0
            java.lang.Object r1 = r7.get(r2)
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            java.lang.String r9 = r1.getAsString(r9)
            int r0 = r9.hashCode()
            r11 = 0
            r10 = -1
            switch(r0) {
                case -1569536764: goto L_0x0351;
                case -1328682538: goto L_0x0346;
                case -601229436: goto L_0x033b;
                case 684173810: goto L_0x0330;
                case 689862072: goto L_0x0325;
                case 905843021: goto L_0x031a;
                case 950831081: goto L_0x030f;
                case 2034973555: goto L_0x0304;
                default: goto L_0x025a;
            }
        L_0x025a:
            java.lang.String r9 = ", "
            switch(r10) {
                case 0: goto L_0x02f0;
                case 1: goto L_0x0260;
                case 2: goto L_0x02af;
                case 3: goto L_0x02a3;
                case 4: goto L_0x027c;
                case 5: goto L_0x0260;
                case 6: goto L_0x026b;
                case 7: goto L_0x0260;
                default: goto L_0x025f;
            }
        L_0x025f:
            r11 = 1
        L_0x0260:
            if (r11 == 0) goto L_0x0265
            r7.remove(r2)
        L_0x0265:
            java.lang.String r0 = "data"
            r8.putParcelableArrayListExtra(r0, r7)
            return r8
        L_0x026b:
            java.lang.String r4 = "im_protocol"
            java.lang.String r0 = r1.getAsString(r3)
            r8.putExtra(r4, r0)
            java.lang.String r3 = "im_handle"
            java.lang.String r0 = r1.getAsString(r5)
            goto L_0x02ff
        L_0x027c:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r1.getAsString(r5)
            r6.append(r0)
            java.lang.String r0 = r1.getAsString(r3)
            if (r0 == 0) goto L_0x0293
            r6.append(r9)
            r6.append(r0)
        L_0x0293:
            java.lang.String r3 = "company"
            java.lang.String r0 = r6.toString()
            r8.putExtra(r3, r0)
            java.lang.String r3 = "job_title"
            java.lang.String r0 = r1.getAsString(r4)
            goto L_0x02ff
        L_0x02a3:
            java.lang.String r3 = "phone"
            java.lang.String r0 = r1.getAsString(r5)
            r8.putExtra(r3, r0)
            java.lang.String r3 = "phone_type"
            goto L_0x02fb
        L_0x02af:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r1.getAsString(r4)
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "data7"
            java.lang.String r0 = r1.getAsString(r0)
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "data8"
            java.lang.String r0 = r1.getAsString(r0)
            X.AnonymousClass0x2.A1N(r3, r0)
            java.lang.String r0 = "data9"
            java.lang.String r0 = r1.getAsString(r0)
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "data10"
            java.lang.String r0 = r1.getAsString(r0)
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r3)
            java.lang.String r0 = "postal"
            r8.putExtra(r0, r3)
            java.lang.String r3 = "postal_type"
            goto L_0x02fb
        L_0x02f0:
            java.lang.String r3 = "email"
            java.lang.String r0 = r1.getAsString(r5)
            r8.putExtra(r3, r0)
            java.lang.String r3 = "email_type"
        L_0x02fb:
            java.lang.String r0 = r1.getAsString(r6)
        L_0x02ff:
            r8.putExtra(r3, r0)
            goto L_0x025f
        L_0x0304:
            java.lang.String r0 = "vnd.android.cursor.item/nickname"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x025a
            r10 = 7
            goto L_0x025a
        L_0x030f:
            java.lang.String r0 = "vnd.android.cursor.item/im"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x025a
            r10 = 6
            goto L_0x025a
        L_0x031a:
            java.lang.String r0 = "vnd.android.cursor.item/photo"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x025a
            r10 = 5
            goto L_0x025a
        L_0x0325:
            java.lang.String r0 = "vnd.android.cursor.item/organization"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x025a
            r10 = 4
            goto L_0x025a
        L_0x0330:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x025a
            r10 = 3
            goto L_0x025a
        L_0x033b:
            java.lang.String r0 = "vnd.android.cursor.item/postal-address_v2"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x025a
            r10 = 2
            goto L_0x025a
        L_0x0346:
            java.lang.String r0 = "vnd.android.cursor.item/contact_event"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x025a
            r10 = 1
            goto L_0x025a
        L_0x0351:
            java.lang.String r0 = "vnd.android.cursor.item/email_v2"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x025a
            r10 = 0
            goto L_0x025a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105975Xd.A00(android.app.Activity, android.graphics.Bitmap, X.5a1, boolean):android.content.Intent");
    }

    public void A01(Context context, UserJid userJid, String str, String str2) {
        C64773Ex r2 = this.A04;
        AnonymousClass3ZH A0A2 = r2.A0A(userJid);
        if (A0A2.A0S()) {
            this.A0G.A00 = AnonymousClass001.A0f();
        }
        if (str2 != null && C627336j.A0L(userJid) && this.A0E.A01.A0X(3790)) {
            C117715sN.A00(this.A0F, this, userJid, str2, 31);
        }
        AnonymousClass4FS r1 = this.A0F;
        C70203a7.A00(r1, this, userJid, 4);
        if (A0A2.A0u || TextUtils.isEmpty(str)) {
            if (!A0A2.A0Q() && !A0A2.A0z && !A0A2.A0u) {
                C70203a7.A00(r1, this, userJid, 5);
            }
            Intent A0N = C627736r.A0N(context, r2.A0A(userJid));
            AnonymousClass5VI.A00(A0N, "ShareContactUtil");
            context.startActivity(A0N);
            return;
        }
        context.startActivity(C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.conversation.conversationrow.ContactSyncActivity").putExtra("user_jid", C627336j.A07(userJid)).addFlags(335544320));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (r10 != null) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r22, java.lang.String r23, java.util.ArrayList r24, java.util.List r25) {
        /*
            r21 = this;
            r3 = r21
            X.1VX r1 = r3.A0D
            r0 = 449(0x1c1, float:6.29E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x002f
            r7 = r24
            int r1 = r7.size()
            r6 = r25
            int r0 = r6.size()
            if (r1 == r0) goto L_0x0030
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sharecontactutil/phones_jids_list_size_mismatch: "
            X.C18260x0.A19(r0, r1, r7)
            java.lang.String r0 = ", "
            X.AnonymousClass000.A1H(r0, r1, r6)
            java.lang.String r0 = r1.toString()
        L_0x002c:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x002f:
            return
        L_0x0030:
            X.2sr r0 = r3.A01
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "sharecontactutil/on-activity-result/companion should not be adding contacts"
            goto L_0x002c
        L_0x003b:
            X.2Xk r0 = r3.A03
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "sharecontactutil/on-activity-result/access to contacts denied"
            goto L_0x002c
        L_0x0046:
            r14 = 0
            r5 = 0
            r13 = 0
        L_0x0049:
            int r0 = r7.size()
            if (r5 >= r0) goto L_0x0106
            java.lang.String r9 = X.C86664Kz.A1M(r7, r5)
            java.lang.Object r8 = r6.get(r5)
            X.4uZ r8 = (X.C95814uZ) r8
            if (r8 == 0) goto L_0x00f8
            X.3Ex r0 = r3.A04
            X.1vC r0 = r0.A05
            java.util.ArrayList r4 = r0.A0D(r8)
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x00f8
            java.util.Iterator r12 = r4.iterator()
            r10 = 0
        L_0x006e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00fa
            X.3ZH r2 = X.C18310x6.A0R(r12)
            X.4uZ r0 = r2.A0H
            if (r0 == 0) goto L_0x006e
            X.2k5 r0 = r2.A0F
            if (r0 != 0) goto L_0x006e
            X.4uZ r0 = r2.A0H
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = r8.user
            boolean r0 = android.telephony.PhoneNumberUtils.compare(r9, r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sharecontactutil/unknown_contact_update:"
            r1.append(r0)
            X.4uZ r0 = r2.A0H
            X.C18260x0.A0o(r0, r1)
            X.33i r0 = r3.A09
            X.5UR r15 = r0.A0R()
            android.net.Uri r16 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String r1 = "raw_contact_id"
            java.lang.String[] r17 = new java.lang.String[]{r1}
            java.lang.String r18 = "data1 =? AND account_type =?"
            r0 = 2
            java.lang.String[] r10 = new java.lang.String[r0]
            r10[r14] = r9
            java.lang.String r11 = "com.whatsapp"
            r0 = 1
            r10[r0] = r11
            r20 = 0
            r19 = r10
            android.database.Cursor r10 = r15.A03(r16, r17, r18, r19, r20)
            if (r10 == 0) goto L_0x00cd
            boolean r0 = r10.moveToFirst()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r10, r1)     // Catch:{ all -> 0x0123 }
            goto L_0x00d1
        L_0x00cd:
            r0 = r23
            if (r10 == 0) goto L_0x00d4
        L_0x00d1:
            r10.close()
        L_0x00d4:
            long r0 = java.lang.Long.parseLong(r0)
            X.2k5 r10 = new X.2k5
            r10.<init>(r0, r9)
            r2.A0F = r10
            r0 = r22
            r2.A0P = r0
            r0 = 1
            r2.A10 = r0
            r10 = 1
            goto L_0x006e
        L_0x00e8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sharecontactutil/false_match: "
            r1.append(r0)
            X.4uZ r0 = r2.A0H
            X.C18270x1.A17(r0, r1)
            goto L_0x006e
        L_0x00f8:
            r13 = 1
            goto L_0x0102
        L_0x00fa:
            if (r10 == 0) goto L_0x0102
            X.4FS r1 = r3.A0F
            r0 = 6
            X.C70203a7.A00(r1, r3, r4, r0)
        L_0x0102:
            int r5 = r5 + 1
            goto L_0x0049
        L_0x0106:
            if (r13 == 0) goto L_0x002f
            java.lang.String r0 = "sharecontactutil/new_number/need_delta_sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.227 r0 = X.AnonymousClass227.A09
            X.2zU r1 = new X.2zU
            r1.<init>(r0)
            X.2xW r0 = X.C59812xW.A0C
            r1.A00 = r0
            X.2zz r2 = r1.A02()
            X.3Cq r1 = r3.A08
            r0 = 1
            r1.A03(r2, r0)
            return
        L_0x0123:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0128 }
            throw r1
        L_0x0128:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105975Xd.A02(java.lang.String, java.lang.String, java.util.ArrayList, java.util.List):void");
    }

    public C105975Xd(C69263Wi r2, C56972sr r3, C65203Gp r4, C44772Xk r5, C64773Ex r6, C29421in r7, AnonymousClass5ZU r8, C66413Li r9, C64223Cq r10, C620633i r11, C56612sH r12, C53412n3 r13, C55302q8 r14, AnonymousClass1VX r15, AnonymousClass2ML r16, AnonymousClass4FS r17, AnonymousClass2Z2 r18) {
        this.A0A = r12;
        this.A0D = r15;
        this.A00 = r2;
        this.A01 = r3;
        this.A0F = r17;
        this.A02 = r4;
        this.A0G = r18;
        this.A04 = r6;
        this.A09 = r11;
        this.A06 = r8;
        this.A05 = r7;
        this.A07 = r9;
        this.A08 = r10;
        this.A03 = r5;
        this.A0E = r16;
        this.A0B = r13;
        this.A0C = r14;
    }
}
