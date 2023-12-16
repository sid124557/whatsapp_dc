package X;

import com.whatsapp.R;

/* renamed from: X.79e  reason: invalid class name and case insensitive filesystem */
public class C1462279e {
    public static final C149467Mo A00;
    public static final C149467Mo A01;
    public static final C149467Mo A02;
    public static final C149467Mo A03;
    public static final C149467Mo A04;
    public static final C149467Mo A05;
    public static final C149467Mo A06;
    public static final C149467Mo A07;
    public static final C149467Mo[] A08;
    public static final C149467Mo[] A09;

    static {
        C149467Mo A002 = A00(C155677fI.A05, R.id.emoji_people_btn, R.id.emoji_people_marker, R.string.f11nameremoved);
        A05 = A002;
        C149467Mo A003 = A00(C155677fI.A03, R.id.emoji_nature_btn, R.id.emoji_nature_marker, R.string.f11nameremoved);
        A03 = A003;
        C149467Mo A004 = A00(C155677fI.A02, R.id.emoji_food_btn, R.id.emoji_food_marker, R.string.f11nameremoved);
        A02 = A004;
        C149467Mo A005 = A00(C155677fI.A00, R.id.emoji_activity_btn, R.id.emoji_activity_marker, R.string.f11nameremoved);
        A00 = A005;
        C149467Mo A006 = A00(C155677fI.A07, R.id.emoji_travel_btn, R.id.emoji_travel_marker, R.string.f11nameremoved);
        A07 = A006;
        C149467Mo A007 = A00(C155677fI.A04, R.id.emoji_objects_btn, R.id.emoji_objects_marker, R.string.f11nameremoved);
        A04 = A007;
        C149467Mo A008 = A00(C155677fI.A06, R.id.emoji_symbols_btn, R.id.emoji_symbols_marker, R.string.f11nameremoved);
        A06 = A008;
        C149467Mo A009 = A00(C155677fI.A01, R.id.emoji_flags_btn, R.id.emoji_flags_marker, R.string.f11nameremoved);
        A01 = A009;
        C149467Mo[] r8 = new C149467Mo[8];
        r8[0] = A002;
        AnonymousClass000.A11(A003, A004, A005, A006, r8);
        AnonymousClass0x2.A1D(A007, A008, A009, r8);
        A08 = r8;
        C72333dY r7 = C155427er.A00;
        C149467Mo[] r6 = new C149467Mo[8];
        int i = 0;
        do {
            C149467Mo r0 = r8[i];
            r6[i] = new C149467Mo(new C118005sq(r0, r7), r0.A00, r0.A01, r0.A02);
            i++;
        } while (i < 8);
        A09 = r6;
    }

    public static C149467Mo A00(Object obj, int i, int i2, int i3) {
        return new C149467Mo(new AnonymousClass4KG(obj, 15), i, i2, i3);
    }
}
