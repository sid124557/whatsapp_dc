package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2x1  reason: invalid class name and case insensitive filesystem */
public final class C59502x1 {
    public AnonymousClass2VK A00;
    public final C620433g A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass4FS A03;

    public final void A01(AnonymousClass4CI r8, String str, String str2) {
        AnonymousClass4CI r4 = r8;
        String str3 = str;
        if (str == null || C175738Zn.A0V(str) || str2 == null) {
            r8.BSu(C72043d5.A00());
            return;
        }
        if (str.equals(this.A02.A0c(str2))) {
            r8.onSuccess();
            return;
        }
        this.A03.BkM(new C71603cN(this, AnonymousClass32Y.A09(str2), r4, str3, 2));
    }

    public C59502x1(AnonymousClass2VK r1, C620433g r2, AnonymousClass33p r3, AnonymousClass4FS r4) {
        C18260x0.A0c(r1, r2, r4, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static final /* synthetic */ void A00(AnonymousClass4CI r3, C59502x1 r4, AnonymousClass2JY r5, UserJid userJid, String str, String str2) {
        String str3;
        int hashCode = str.hashCode();
        String str4 = "in_pin_code_invalid";
        if (hashCode != -1930003499) {
            if (hashCode != -1867169789) {
                if (hashCode == 688255102 && str.equals("unserviceable_location")) {
                    str4 = "in_pin_code_not_servicable";
                }
            } else if (str.equals("success")) {
                r3.onSuccess();
                if (r5 != null && (str3 = r5.A00) != null) {
                    AnonymousClass33p r42 = r4.A02;
                    C18260x0.A0F(C18270x1.A03(r42), "dc_user_postcode_", userJid.getRawString(), str2, AnonymousClass001.A0o());
                    C18260x0.A0F(C18270x1.A03(r42), "dc_location_name_", userJid.getRawString(), str3, AnonymousClass001.A0o());
                    return;
                }
                return;
            }
        }
        r3.BSu(C57692u3.A04("validation_errors", C57692u3.A04("in_pin_code", str4)));
    }
}
