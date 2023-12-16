package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.5WY  reason: invalid class name */
public class AnonymousClass5WY {
    public final C56972sr A00;
    public final AnonymousClass9U4 A01;
    public final C51072jE A02;

    public AnonymousClass5WY(C56972sr r1, AnonymousClass9U4 r2, C51072jE r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public Intent A00(Activity activity, Bundle bundle, C631938h r13, Integer num, String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        Intent A07;
        boolean A002 = AnonymousClass2BI.A00(str);
        String str3 = str2;
        if (z && !A002) {
            C56972sr r0 = this.A00;
            r0.A0P();
            if (r0.A00 != null && this.A02.A02()) {
                A07 = C18320x8.A07();
                A07.setClassName(activity.getPackageName(), "com.whatsapp.inappsupport.ui.ContactUsActivity");
                A07.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from", str);
                A07.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", str3);
                if (bundle != null) {
                    Bundle A08 = AnonymousClass002.A08();
                    String string = bundle.getString("com.whatsapp.support.DescribeProblemActivity.from");
                    String string2 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.serverstatus");
                    String string3 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.emailAddress");
                    String string4 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.description");
                    Parcelable parcelable = bundle.getParcelable("com.whatsapp.support.DescribeProblemActivity.suspendedEntityJid");
                    if (!TextUtils.isEmpty(string)) {
                        A08.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.from", string);
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        A08.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", string2);
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        A08.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.emailAddress", string3);
                    }
                    if (!TextUtils.isEmpty(string4)) {
                        A08.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.description", string4);
                    }
                    if (parcelable != null) {
                        A08.putParcelable("com.whatsapp.inappsupport.ui.ContactUsActivity.suspendedEntityJid", parcelable);
                    }
                    A07.putExtras(A08);
                }
                if (r13 != null) {
                    A07.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.supportUserContext", r13);
                }
                return A07;
            }
        }
        Class B5r = this.A01.A0G().B5r();
        if (!A002 || B5r == null) {
            A07 = C18320x8.A07();
            A07.setClassName(activity.getPackageName(), "com.whatsapp.support.DescribeProblemActivity");
            A07.putExtra("com.whatsapp.support.DescribeProblemActivity.from", str);
            A07.putExtra("com.whatsapp.support.DescribeProblemActivity.serverstatus", str3);
            if (num != null) {
                A07.putExtra("com.whatsapp.support.DescribeProblemActivity.type", num);
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList != null) {
                A07.putStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicIDs", arrayList3);
            }
            ArrayList arrayList4 = arrayList2;
            if (arrayList2 != null) {
                A07.putStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles", arrayList4);
            }
            if (bundle != null) {
                A07.putExtras(bundle);
                return A07;
            }
            return A07;
        }
        A07 = AnonymousClass0x9.A08(activity, B5r);
        if (bundle != null && bundle.containsKey("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId")) {
            A07.putExtra("extra_transaction_id", bundle.getString("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId"));
            return A07;
        }
        return A07;
    }
}
