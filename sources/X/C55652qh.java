package X;

import android.content.ContentProviderOperation;
import android.provider.ContactsContract;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: X.2qh  reason: invalid class name and case insensitive filesystem */
public class C55652qh {
    public String A00;
    public boolean A01;
    public boolean A02 = false;
    public final C55682qk A03;
    public final C69263Wi A04;
    public final C44772Xk A05;
    public final C104195Qa A06;
    public final C43852Ts A07;
    public final AnonymousClass5XZ A08;
    public final C105245Ud A09;
    public final AnonymousClass4E4 A0A;
    public final C59752xQ A0B;
    public final AnonymousClass7DW A0C;
    public final C620633i A0D;
    public final AnonymousClass5ZR A0E;
    public final AnonymousClass1VX A0F;
    public final AnonymousClass4FS A0G;
    public final Long A0H;
    public final Long A0I;

    public void A04() {
        this.A02 = true;
        if (!C106785aA.A04(this.A05, this.A0E)) {
            this.A0A.requestPermission();
        } else {
            this.A0G.BkV(new C69973Zj(this, 4), "Save to Phone");
        }
    }

    public final ContentProviderOperation.Builder A00(String str) {
        Long l = this.A0I;
        if (l == null || this.A02) {
            return ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", str);
        }
        ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI);
        String[] A1Z = AnonymousClass0x9.A1Z();
        AnonymousClass000.A16(String.valueOf(l), str, A1Z);
        return newUpdate.withSelection("raw_contact_id = ? AND mimetype = ?", A1Z);
    }

    public void A01() {
        if (C106785aA.A04(this.A05, this.A0E)) {
            if (this.A0I == null) {
                SwitchCompat switchCompat = this.A0C.A00;
                if (switchCompat.getVisibility() == 0) {
                    switchCompat.setChecked(true);
                    return;
                }
            }
            if (this.A02) {
                A04();
            } else {
                A02();
            }
        } else {
            this.A02 = false;
            this.A0C.A00.setChecked(false);
        }
    }

    public void A02() {
        C51602k5 r2;
        C105245Ud r3 = this.A09;
        if (!r3.A06()) {
            boolean A0Y = this.A0F.A0Y(C58422vE.A02, 5868);
            this.A01 = A0Y;
            if (!A0Y || this.A0C.A00.isChecked()) {
                A03();
                return;
            }
            String A012 = r3.A01();
            StringBuilder A0l = AnonymousClass000.A0l(A012);
            A0l.append("@");
            C95814uZ A0S = C18310x6.A0S(AnonymousClass000.A0X("s.whatsapp.net", A0l));
            Long l = this.A0I;
            if (l != null) {
                r2 = new C51602k5(l.longValue(), A012);
            } else {
                r2 = null;
            }
            this.A0B.A01(r2, A0S, this.A0H, A012, this.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r5.A03().isEmpty() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        X.C18270x1.A0Z(A00("vnd.android.cursor.item/phone_v2").withValue("data1", r7.A09.A02()), X.C18280x3.A0S(), "data2", r3);
        r1 = X.AnonymousClass5XZ.A00(X.C18290x4.A0m(r5.A03));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        if (r4 != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        r7.A0G.BkQ(new X.C70203a7(r7, 11, r3), "Saving Contact");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        r0 = A00("vnd.android.cursor.item/organization").withValue("data1", r1).build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        if (r0 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a1, code lost:
        r3.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b8, code lost:
        if (r5.A01().isEmpty() == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c5, code lost:
        if (r6 != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cf, code lost:
        if (r5.A03().isEmpty() != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d1, code lost:
        r2.withValue("data3", r5.A03());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00da, code lost:
        r0 = r2.build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00de, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e0, code lost:
        r3.add(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r7 = this;
            X.5ZR r1 = r7.A0E
            X.2Xk r0 = r7.A05
            boolean r0 = X.C106785aA.A04(r0, r1)
            if (r0 != 0) goto L_0x0010
            X.4E4 r0 = r7.A0A
            r0.requestPermission()
            return
        L_0x0010:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.2Ts r0 = r7.A07
            android.accounts.Account r1 = r0.A00
            if (r1 == 0) goto L_0x00e5
            java.lang.String r0 = "PHONE"
            java.lang.String r4 = r1.type
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00e5
            java.lang.String r2 = r1.name
        L_0x0026:
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r0)
            java.lang.String r0 = "account_type"
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r0, r4)
            java.lang.String r0 = "account_name"
            X.C18270x1.A0Z(r1, r2, r0, r3)
            java.lang.Long r4 = r7.A0I
            r6 = 1
            if (r4 != 0) goto L_0x00a5
            r6 = 0
            X.5XZ r5 = r7.A08
            java.lang.String r0 = r5.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = r5.A03()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a5
        L_0x0053:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r1 = r7.A00(r0)
            X.5Ud r0 = r7.A09
            java.lang.String r0 = r0.A02()
            java.lang.String r6 = "data1"
            android.content.ContentProviderOperation$Builder r2 = r1.withValue(r6, r0)
            java.lang.Integer r1 = X.C18280x3.A0S()
            java.lang.String r0 = "data2"
            X.C18270x1.A0Z(r2, r1, r0, r3)
            android.widget.EditText r0 = r5.A03
            java.lang.String r0 = X.C18290x4.A0m(r0)
            java.lang.String r1 = X.AnonymousClass5XZ.A00(r0)
            if (r4 != 0) goto L_0x0090
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0090
        L_0x0081:
            X.4FS r2 = r7.A0G
            r0 = 11
            X.3a7 r1 = new X.3a7
            r1.<init>(r7, r0, r3)
            java.lang.String r0 = "Saving Contact"
            r2.BkQ(r1, r0)
            return
        L_0x0090:
            java.lang.String r0 = "vnd.android.cursor.item/organization"
            android.content.ContentProviderOperation$Builder r0 = r7.A00(r0)
            android.content.ContentProviderOperation$Builder r0 = r0.withValue(r6, r1)
            android.content.ContentProviderOperation r0 = r0.build()
            if (r0 == 0) goto L_0x0081
            r3.add(r0)
            goto L_0x0081
        L_0x00a5:
            java.lang.String r0 = "vnd.android.cursor.item/name"
            android.content.ContentProviderOperation$Builder r2 = r7.A00(r0)
            if (r6 != 0) goto L_0x00ba
            X.5XZ r5 = r7.A08
            java.lang.String r0 = r5.A01()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c7
        L_0x00ba:
            X.5XZ r5 = r7.A08
            java.lang.String r1 = r5.A01()
            java.lang.String r0 = "data2"
            r2.withValue(r0, r1)
            if (r6 != 0) goto L_0x00d1
        L_0x00c7:
            java.lang.String r0 = r5.A03()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00da
        L_0x00d1:
            java.lang.String r1 = r5.A03()
            java.lang.String r0 = "data3"
            r2.withValue(r0, r1)
        L_0x00da:
            android.content.ContentProviderOperation r0 = r2.build()
            if (r0 == 0) goto L_0x0053
            r3.add(r0)
            goto L_0x0053
        L_0x00e5:
            r2 = 0
            r4 = r2
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55652qh.A03():void");
    }

    public C55652qh(C55682qk r3, C69263Wi r4, C44772Xk r5, C104195Qa r6, C43852Ts r7, AnonymousClass5XZ r8, C105245Ud r9, C44792Xm r10, AnonymousClass4E4 r11, C59752xQ r12, AnonymousClass7DW r13, C620633i r14, AnonymousClass5ZR r15, AnonymousClass1VX r16, AnonymousClass4FS r17, Long l, Long l2, String str) {
        this.A0F = r16;
        this.A04 = r4;
        this.A0G = r17;
        this.A03 = r3;
        this.A0D = r14;
        this.A05 = r5;
        this.A0E = r15;
        this.A0A = r11;
        this.A08 = r8;
        this.A09 = r9;
        this.A0C = r13;
        this.A07 = r7;
        this.A0B = r12;
        this.A06 = r6;
        this.A0I = l;
        this.A0H = l2;
        this.A00 = str;
        C109335eS r1 = new C109335eS(this, 22);
        r10.A00.setOnClickListener(r1);
        r10.A01.setOnClickListener(r1);
    }
}
