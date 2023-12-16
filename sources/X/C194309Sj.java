package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: X.9Sj  reason: invalid class name and case insensitive filesystem */
public class C194309Sj {
    public String A00 = "PENDING";
    public final C69263Wi A01;
    public final C54292oU A02;
    public final C40602Ha A03;
    public final AnonymousClass9U5 A04;
    public final AnonymousClass9RH A05;
    public final C160757oG A06 = C160757oG.A00("PaymentsComplianceManager", "infra", "COMMON");

    public void A00(C203099n7 r18, String str, String str2, int i, int i2, int i3) {
        String str3;
        AnonymousClass36K A0I;
        C203099n7 r1 = r18;
        if (this.A00.equals("UNSUPPORTED")) {
            r1.BRQ(true);
            return;
        }
        C193699Pq r11 = new C193699Pq(this.A02.A00, this.A01, this.A03, this.A04, this.A05);
        AnonymousClass9R0 r12 = new AnonymousClass9R0(r1, this);
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "check-account-eligibility", A0s);
        AnonymousClass39V.A03("action-type", str, A0s);
        String str4 = str2;
        if (!TextUtils.isEmpty(str4)) {
            AnonymousClass39V.A03("credential_id", str4, A0s);
        }
        AnonymousClass39V[] A1Z = C18300x5.A1Z(A0s, 0);
        AnonymousClass9RH r7 = r11.A04;
        AnonymousClass9NH r13 = r7.A00;
        int i4 = i2;
        if (i2 < 0 || i4 > 11) {
            throw AnonymousClass000.A0G("Months are 0 indexed, invalid month: ", AnonymousClass001.A0o(), i4);
        }
        Calendar instance = Calendar.getInstance();
        int i5 = i;
        int i6 = i3;
        instance.set(i5, i4, i6);
        instance.setLenient(false);
        try {
            instance.getTime();
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(r13.A00.A0H());
            int i7 = instance2.get(1) - instance.get(1);
            int i8 = instance.get(2);
            int i9 = instance2.get(2);
            if (i8 > i9 || (i8 == i9 && instance.get(5) > instance2.get(5))) {
                i7--;
            }
            int i10 = 13;
            if (r7.A02.A04()) {
                i10 = 16;
            }
            if (i7 < i10) {
                str3 = "2";
            } else if (i7 < 18) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            if (str3.equals("0")) {
                AnonymousClass39V[] r72 = new AnonymousClass39V[4];
                AnonymousClass39V.A0B("state", "0", r72, 0);
                r72[1] = new AnonymousClass39V("day", i6);
                r72[2] = new AnonymousClass39V("month", i2 + 1);
                r72[3] = new AnonymousClass39V("year", i5);
                A0I = AnonymousClass36K.A0I("dob", r72);
            } else {
                AnonymousClass39V[] r0 = new AnonymousClass39V[1];
                AnonymousClass39V.A0B("state", str3, r0, 0);
                A0I = AnonymousClass36K.A0I("dob", r0);
            }
            r11.A03.A0G(new C203899oU(r11.A00, r11.A02, r11.A01, r11, r12, 19), new AnonymousClass36K(A0I, "account", A1Z), "get", 0);
        } catch (Exception unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Date format invalid. Year: ");
            A0o.append(i5);
            A0o.append(" Month: ");
            A0o.append(i4);
            throw AnonymousClass000.A0G(" Day: ", A0o, i6);
        }
    }

    public void A01(C203109n8 r14, String str, String str2) {
        if (this.A00.equals("UNSUPPORTED")) {
            r14.BWr(true);
            return;
        }
        Context context = this.A02.A00;
        C69263Wi r6 = this.A01;
        AnonymousClass9RH r9 = this.A05;
        C193699Pq r4 = new C193699Pq(context, r6, this.A03, this.A04, r9);
        AnonymousClass9Qz r5 = new AnonymousClass9Qz(r14, this);
        C626936e.A05(str);
        AnonymousClass39V[] r3 = new AnonymousClass39V[2];
        boolean A0F = AnonymousClass39V.A0F("action", "check-account-eligibility", r3);
        AnonymousClass39V[] r1 = new AnonymousClass39V[AnonymousClass39V.A0G("action-type", str2, r3)];
        AnonymousClass39V.A0B("full", str, r1, A0F ? 1 : 0);
        AnonymousClass36K r92 = new AnonymousClass36K(AnonymousClass36K.A0I(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r1), "account", r3);
        r4.A03.A0G(new C203899oU(r4.A00, r4.A02, r4.A01, r4, r5, 18), r92, "get", 0);
    }

    public C194309Sj(C69263Wi r4, C54292oU r5, C40602Ha r6, AnonymousClass9U5 r7, AnonymousClass9RH r8) {
        this.A02 = r5;
        this.A01 = r4;
        this.A05 = r8;
        this.A04 = r7;
        this.A03 = r6;
    }
}
