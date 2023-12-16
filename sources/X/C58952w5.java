package X;

import android.text.TextUtils;

/* renamed from: X.2w5  reason: invalid class name and case insensitive filesystem */
public class C58952w5 {
    public final C40282Ff A00;
    public final C54292oU A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass3OD A03;
    public final AnonymousClass3O8 A04;
    public final AnonymousClass3O9 A05;
    public final AnonymousClass2WU A06;
    public final AnonymousClass3OG A07;
    public final C67043Nt A08;
    public final AnonymousClass33Y A09;
    public final C44642Wx A0A;
    public final C53262mo A0B;
    public final C55942rA A0C;
    public final C183538qC A0D;

    public static boolean A00(C21801Df r3, String str) {
        if (r3.buttons_.size() != 1) {
            return false;
        }
        if ((((C21591Ck) r3.buttons_.get(0)).nativeFlowInfo_ != null || AnonymousClass1BB.DEFAULT_INSTANCE != null) && str.equals(C18310x6.A0U(r3, 0).name_) && !TextUtils.isEmpty(C18310x6.A0U(r3, 0).paramsJson_)) {
            return true;
        }
        return false;
    }

    public C58952w5(C40282Ff r1, C54292oU r2, AnonymousClass1VX r3, AnonymousClass3OD r4, AnonymousClass3O8 r5, AnonymousClass3O9 r6, AnonymousClass2WU r7, AnonymousClass3OG r8, C67043Nt r9, AnonymousClass33Y r10, C44642Wx r11, C53262mo r12, C55942rA r13, C183538qC r14) {
        this.A02 = r3;
        this.A01 = r2;
        this.A09 = r10;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = r4;
        this.A0A = r11;
        this.A0B = r12;
        this.A0D = r14;
        this.A0C = r13;
        this.A08 = r9;
        this.A07 = r8;
    }
}
