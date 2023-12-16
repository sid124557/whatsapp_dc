package X;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.contact.contactform.ContactFormBottomSheetFragment;
import java.util.ArrayList;

/* renamed from: X.5Xw  reason: invalid class name and case insensitive filesystem */
public final class C106165Xw {
    public final C56972sr A00;
    public final AnonymousClass25U A01;
    public final C56982ss A02;
    public final AnonymousClass1VX A03;

    public static boolean A01(C106165Xw r1) {
        return r1.A03.A0X(913);
    }

    public final Intent A03(String str, String str2, boolean z, boolean z2) {
        Intent A09;
        C626936e.A0C(C86664Kz.A1W(this.A00));
        if (z) {
            A09 = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        } else {
            A09 = AnonymousClass0x9.A09("android.intent.action.INSERT_OR_EDIT");
            A09.setType("vnd.android.cursor.item/contact");
        }
        if (!TextUtils.isEmpty(str2)) {
            if (z2) {
                ArrayList A0s = AnonymousClass001.A0s();
                ContentValues A06 = AnonymousClass0x9.A06();
                A06.put("mimetype", "vnd.android.cursor.item/name");
                A06.put("data2", str2);
                A0s.add(A06);
                ContentValues A062 = AnonymousClass0x9.A06();
                A062.put("mimetype", "vnd.android.cursor.item/organization");
                A062.put("data1", str2);
                A0s.add(A062);
                A09.putParcelableArrayListExtra("data", A0s);
            } else {
                A09.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
            }
        }
        A09.putExtra("phone", str);
        A09.putExtra("phone_type", 2);
        A09.setFlags(524288);
        return A09;
    }

    public final String A05(AnonymousClass3ZH r3, C95814uZ r4) {
        if (r3 != null && r3.A0R()) {
            return r3.A0L();
        }
        if (!this.A03.A0X(945) || r3 == null) {
            return this.A02.A0D(r4);
        }
        return r3.A0b;
    }

    public C106165Xw(C56972sr r1, AnonymousClass25U r2, C56982ss r3, AnonymousClass1VX r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static Bundle A00(AnonymousClass3ZH r6) {
        Bundle A08 = AnonymousClass002.A08();
        C95814uZ r5 = r6.A0H;
        if (r5 != null) {
            A08.putString("contact_data_phone", AnonymousClass36P.A06(r5));
            A08.putString("contact_chat_jid", r5.getRawString());
            A08.putString("contact_data_first_name", r6.A0R);
            A08.putString("contact_data_last_name", r6.A0Q);
            A08.putLong("native_contact_sync_to_device", (long) r6.A07);
            A08.putBoolean("is_whatsapp_contact", r6.A0t);
            A08.putInt("contact_sync_policy", r6.A07);
            C51602k5 r0 = r6.A0F;
            if (r0 != null) {
                A08.putString("extra_contact_phone_number", r0.A01);
                A08.putLong("contact_id", r6.A0F.A00);
            }
            AnonymousClass0x2.A0v(A08, r5, "contact_chat_jid");
            A08.putBoolean("wa_only_contact", AnonymousClass001.A1T(r6.A07));
            A08.putLong("wa_contact_table_column_id", r6.A0F());
        }
        return A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r5.A0R() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent A02(X.AnonymousClass3ZH r5, X.C95814uZ r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r3 = X.AnonymousClass36P.A06(r6)
            java.lang.String r2 = r4.A05(r5, r6)
            if (r5 == 0) goto L_0x0011
            boolean r1 = r5.A0R()
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            android.content.Intent r0 = r4.A03(r3, r2, r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106165Xw.A02(X.3ZH, X.4uZ, boolean):android.content.Intent");
    }

    public Bundle A04(AnonymousClass3ZH r6) {
        Bundle A08 = AnonymousClass002.A08();
        C95814uZ r4 = r6.A0H;
        if (r4 != null) {
            A08.putString("contact_data_phone", AnonymousClass36P.A06(r4));
            String A0J = r6.A0J();
            String str = r6.A0R;
            if (!(A0J == null || str == null || !A0J.contains(str))) {
                A08.putString("contact_data_first_name", r6.A0R);
            }
            String A0J2 = r6.A0J();
            String str2 = r6.A0Q;
            if (!(A0J2 == null || str2 == null || !A0J2.contains(str2))) {
                A08.putString("contact_data_last_name", r6.A0Q);
            }
            A08.putString("contact_data_business_name", r6.A0O);
            C51602k5 r0 = r6.A0F;
            if (r0 != null) {
                A08.putLong("contact_id", r0.A00);
            }
            AnonymousClass0x2.A0v(A08, r4, "contact_chat_jid");
            A08.putBoolean("wa_only_contact", AnonymousClass001.A1T(r6.A07));
            A08.putLong("wa_contact_table_column_id", r6.A0F());
        }
        return A08;
    }

    public void A06(C08270df r4, AnonymousClass3ZH r5, C95814uZ r6) {
        String A05 = A05(r5, r6);
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("contact_data_first_name", A05);
        if (r5 != null && r5.A0R()) {
            A08.putString("contact_data_business_name", A05);
        }
        A08.putString("contact_data_phone", AnonymousClass36P.A06(r6));
        ContactFormBottomSheetFragment contactFormBottomSheetFragment = new ContactFormBottomSheetFragment();
        contactFormBottomSheetFragment.A0u(A08);
        AnonymousClass344.A01(contactFormBottomSheetFragment, r4);
    }

    public void A07(C08270df r5, AnonymousClass3ZH r6, C95814uZ r7) {
        String A05 = A05(r6, r7);
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("contact_data_lid", r7.user);
        A08.putString("contact_data_first_name", A05);
        if (r6 != null && r6.A0R()) {
            A08.putString("contact_data_business_name", A05);
        }
        ContactFormBottomSheetFragment contactFormBottomSheetFragment = new ContactFormBottomSheetFragment();
        contactFormBottomSheetFragment.A0u(A08);
        AnonymousClass344.A01(contactFormBottomSheetFragment, r5);
    }
}
