package X;

import android.content.ContentValues;

/* renamed from: X.3Kd  reason: invalid class name and case insensitive filesystem */
public class C66123Kd implements AnonymousClass4ED {
    public static void A00(C56862sg r5) {
        ContentValues A09 = C18280x3.A09();
        A09.put("prop_name", "wa_db_schema_version");
        A09.put("prop_value", "ConsumerBeta-af761063d31f045868212e4fddfee072");
        r5.A0B("wa_props", C57242tK.A00("WaDatabaseHelper", "setProp", "WADB_REPLACE_PROPS_STRING"), A09);
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0r = C54912pU.A0r(A00);
        boolean A0m = C54912pU.A0m(A00, AnonymousClass220.INTEGER, A0r);
        A00.A02 = "prop_name";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0d(A00, r1, A0r, A0m);
        C54912pU.A0A(A00, r1, "prop_value", A0r);
        r7.A0E("wa_props", A0r);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
