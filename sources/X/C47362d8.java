package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2d8  reason: invalid class name and case insensitive filesystem */
public class C47362d8 {
    public C54322oX A00;
    public C33921tu A01;
    public final C45742aV A02;
    public final C69263Wi A03;
    public final C56512s6 A04;
    public final C61072zf A05;
    public final C622734j A06;
    public final C49952hM A07;
    public final C187958y5 A08;
    public final AnonymousClass4FS A09;

    public void A00(C89654ea r18, C631938h r19, C27991fJ r20, String str, String str2, String str3, String str4, ArrayList arrayList, List list, boolean z) {
        C33921tu r0 = this.A01;
        if (r0 != null && r0.A06() == 1) {
            this.A01.A0D(false);
        }
        C43272Rm r1 = new C43272Rm(r18, this, str2, str3, arrayList);
        C631938h r8 = r19;
        C27991fJ r9 = r20;
        C33921tu r4 = new C33921tu(this.A00.A00(), this.A04, this.A05, r8, r9, r1, this.A06, this.A07, str, str4, list, z);
        this.A01 = r4;
        AnonymousClass0x7.A1B(r4, this.A09);
    }

    public C47362d8(C45742aV r1, C69263Wi r2, C56512s6 r3, C61072zf r4, C54322oX r5, C622734j r6, C49952hM r7, C187958y5 r8, AnonymousClass4FS r9) {
        this.A03 = r2;
        this.A09 = r9;
        this.A02 = r1;
        this.A05 = r4;
        this.A08 = r8;
        this.A06 = r6;
        this.A04 = r3;
        this.A07 = r7;
        this.A00 = r5;
    }
}
