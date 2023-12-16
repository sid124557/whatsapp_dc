package X;

import android.content.SharedPreferences;

/* renamed from: X.5ld  reason: invalid class name and case insensitive filesystem */
public class C113565ld implements AnonymousClass4E8 {
    public final AnonymousClass5WX A00;

    public String BDW() {
        return "PrivacyHighlightDailyCron";
    }

    public void BQW() {
        AnonymousClass5WX r5 = this.A00;
        for (Integer num : AnonymousClass5WX.A02) {
            int intValue = num.intValue();
            AnonymousClass5WV r3 = r5.A01;
            SharedPreferences sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A01.A03("privacy_highlight");
                r3.A00 = sharedPreferences;
            }
            String str = "0,0,0";
            String string = sharedPreferences.getString(AnonymousClass5WV.A00(intValue), str);
            if (string != null) {
                str = string;
            }
            String[] A1b = C18320x8.A1b(str);
            if (A1b.length != 3) {
                break;
            }
            int parseInt = Integer.parseInt(A1b[0]);
            int parseInt2 = Integer.parseInt(A1b[1]);
            int parseInt3 = Integer.parseInt(A1b[2]);
            if (parseInt > 0 || parseInt2 > 0 || parseInt3 > 0) {
                C94754rr r1 = new C94754rr();
                r1.A00 = 0;
                r1.A04 = AnonymousClass0x9.A0m(parseInt);
                r1.A02 = AnonymousClass0x9.A0m(parseInt2);
                r1.A03 = AnonymousClass0x9.A0m(parseInt3);
                r1.A01 = num;
                r5.A00.BhD(r1);
            }
        }
        AnonymousClass5WV r2 = r5.A01;
        SharedPreferences sharedPreferences2 = r2.A00;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = r2.A01.A03("privacy_highlight");
            r2.A00 = sharedPreferences2;
        }
        sharedPreferences2.edit().clear().apply();
    }

    public /* synthetic */ void BQX() {
    }

    public C113565ld(AnonymousClass5WX r1) {
        this.A00 = r1;
    }
}
