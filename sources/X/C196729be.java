package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9be  reason: invalid class name and case insensitive filesystem */
public abstract class C196729be implements C185468tj {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;

    public abstract View buildPaymentHelpSupportSection(Context context, C166587yw r2, String str);

    public List BAg() {
        boolean z = this instanceof C191009Ar;
        ArrayList A0s = AnonymousClass001.A0s();
        boolean isEmpty = TextUtils.isEmpty(this.A02);
        if (z) {
            if (!isEmpty) {
                AnonymousClass0x2.A1F("Payments fb txn id", this.A02, A0s);
            }
            if (!TextUtils.isEmpty(this.A01)) {
                AnonymousClass0x2.A1F("Payments return value", this.A01, A0s);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                AnonymousClass0x2.A1F("Payments status", this.A03, A0s);
            }
        } else {
            if (!isEmpty) {
                AnonymousClass0x2.A1F("Payments fb txn id", this.A02, A0s);
            }
            if (!TextUtils.isEmpty(this.A00)) {
                AnonymousClass0x2.A1F("Payments bank txn id", this.A00, A0s);
            }
            if (!TextUtils.isEmpty(this.A01)) {
                AnonymousClass0x2.A1F("Payments return value", this.A01, A0s);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                AnonymousClass0x2.A1F("Payments status", this.A03, A0s);
            }
        }
        ArrayList arrayList = this.A04;
        if (arrayList != null && !arrayList.isEmpty()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            for (int i = 0; i < arrayList.size(); i++) {
                A0o.append((String) arrayList.get(i));
                if (i < arrayList.size() - 1) {
                    A0o.append(", ");
                }
            }
            A0s.add(AnonymousClass0x9.A0C("Topic IDs", A0o.toString()));
        }
        return A0s;
    }

    public boolean BFU() {
        if (this instanceof C191009Ar) {
            return false;
        }
        return true;
    }

    public void Bms(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A04 = arrayList;
    }
}
