package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.5cN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C108075cN implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C1228165x A03;
    public final /* synthetic */ AnonymousClass64F A04;
    public final /* synthetic */ C621033m A05;
    public final /* synthetic */ AnonymousClass33p A06;
    public final /* synthetic */ AnonymousClass36Y A07;
    public final /* synthetic */ AnonymousClass4FV A08;
    public final /* synthetic */ AnonymousClass30N A09;
    public final /* synthetic */ C95814uZ A0A;
    public final /* synthetic */ C47052cd A0B;
    public final /* synthetic */ C50222hp A0C;
    public final /* synthetic */ C45042Yl A0D;
    public final /* synthetic */ Integer A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ Set A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1228165x r7 = this.A03;
        boolean z = this.A0H;
        boolean z2 = this.A0I;
        AnonymousClass33p r9 = this.A06;
        int i2 = this.A01;
        Context context = this.A02;
        String str = this.A0F;
        C47052cd r5 = this.A0B;
        AnonymousClass4FV r25 = this.A08;
        AnonymousClass36Y r24 = this.A07;
        AnonymousClass30N r18 = this.A09;
        Set set = this.A0G;
        C50222hp r14 = this.A0C;
        C45042Yl r13 = this.A0D;
        C621033m r0 = this.A05;
        AnonymousClass64F r4 = this.A04;
        C95814uZ r3 = this.A0A;
        Integer num = this.A0E;
        int i3 = this.A00;
        r7.BZn();
        if (z != z2) {
            C18270x1.A0l(C18270x1.A03(r9), "pref_delete_media", z);
        }
        if (i2 >= 1) {
            C626936e.A06(str);
            String A0F2 = AnonymousClass002.A0F(context, str, new Object[1], 0, R.string.f11nameremoved);
            if (r5.A03 && r5.A00 == 3) {
                r5.A00 = 4;
                r5.A00(5);
            }
            Set set2 = set;
            int i4 = i3;
            boolean z3 = z;
            C50222hp r182 = r14;
            C45042Yl r19 = r13;
            AnonymousClass64F r11 = r4;
            C621033m r12 = r0;
            AnonymousClass36Y r132 = r24;
            AnonymousClass4FV r142 = r25;
            C1228165x r10 = r7;
            AnonymousClass5LL r92 = new AnonymousClass5LL(r10, r11, r12, r132, r142, r18, r3, r5, r182, r19, num, set2, i4, z3);
            C19340zH A002 = AnonymousClass5V0.A00(context);
            C1235268t A003 = C1235268t.A00(r92, 7);
            AnonymousClass69A r1 = new AnonymousClass69A(0);
            A002.A0Q(A0F2);
            A002.setPositiveButton(R.string.f11nameremoved, A003);
            A002.setNegativeButton(R.string.f11nameremoved, r1);
            A002.A0R(true);
            C18280x3.A0q(A002);
            return;
        }
        AnonymousClass5ZW.A02(r24, r25, r18, r14, r13, set, 1);
        r0.A0Z(set, z);
        if (r5.A03 && r5.A00 == 3) {
            r5.A00 = 5;
            r5.A00(3);
        }
        r4.BQn();
        if (num != null) {
            r7.Bbc(r3, num.intValue());
        }
    }

    public /* synthetic */ C108075cN(Context context, C1228165x r3, AnonymousClass64F r4, C621033m r5, AnonymousClass33p r6, AnonymousClass36Y r7, AnonymousClass4FV r8, AnonymousClass30N r9, C95814uZ r10, C47052cd r11, C50222hp r12, C45042Yl r13, Integer num, String str, Set set, int i, int i2, boolean z, boolean z2) {
        this.A03 = r3;
        this.A0H = z;
        this.A0I = z2;
        this.A06 = r6;
        this.A01 = i;
        this.A02 = context;
        this.A0F = str;
        this.A0B = r11;
        this.A08 = r8;
        this.A07 = r7;
        this.A09 = r9;
        this.A0G = set;
        this.A0C = r12;
        this.A0D = r13;
        this.A05 = r5;
        this.A04 = r4;
        this.A0A = r10;
        this.A0E = num;
        this.A00 = i2;
    }
}
