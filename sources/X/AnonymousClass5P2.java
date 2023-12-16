package X;

import com.whatsapp.Me;
import java.util.List;

/* renamed from: X.5P2  reason: invalid class name */
public final class AnonymousClass5P2 {
    public String A00;
    public final C113375lK A01;
    public final C989253t A02;
    public final AnonymousClass5OJ A03;
    public final C112365jc A04;
    public final C101715Fv A05;
    public final C106995aW A06;
    public final AnonymousClass5ZU A07;
    public final AnonymousClass314 A08;
    public final C66473Lo A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass65X A0B;
    public final AnonymousClass2ML A0C;

    public final AnonymousClass25E A00(String str, String str2) {
        C174218Tk r1;
        String str3;
        List list;
        C67183Oh r4 = new C67183Oh(this);
        C989253t r3 = this.A02;
        synchronized (r3) {
            r1 = r3.A01;
            str3 = str;
            list = (List) r1.get(str3);
        }
        if (list != null) {
            return new C22311Mo(list, false);
        }
        AnonymousClass5U8 r5 = this.A04.A02;
        if (r5.A00 == null) {
            r5.A00();
        }
        AnonymousClass5ZO r11 = r5.A00;
        C162457s7.A0D(r11);
        C101715Fv r9 = this.A05;
        String str4 = this.A00;
        AnonymousClass5OJ r0 = this.A03;
        String str5 = r0.A03;
        String str6 = str3;
        String str7 = str4;
        AnonymousClass5T9 r10 = new AnonymousClass5T9(r11, str6, str7, str2, str5, r0.A02, r0.A00(), this.A0A.A0X(6973));
        C64333Db r7 = r9.A00.A00.A01;
        AnonymousClass1VX A4B = C64333Db.A4B(r7);
        AnonymousClass33p A2s = C64333Db.A2s(r7);
        C183538qC A002 = C72343dZ.A00(r7.AaW);
        C107695bk r02 = r7.A00;
        AnonymousClass4C1 r6 = r02.A1n;
        AnonymousClass4C1 r52 = r02.A1o;
        new C95604tx(C64333Db.A07(r7), r10, A2s, A4B, (AnonymousClass28T) r7.AFc.get(), (AnonymousClass3FI) r7.AZM.get(), A002, r6, r52).Bh4(r4);
        AnonymousClass25E r53 = r4.A00;
        if (r53 instanceof C22311Mo) {
            List list2 = ((C22311Mo) r53).A00;
            synchronized (r3) {
                r1.put(str3, list2.subList(0, Math.min(20, list2.size())));
                for (AnonymousClass5T8 r2 : C73723fy.A0D(list2)) {
                    r3.A00.put(r2.A06, r2);
                }
            }
        }
        return r4.A00;
    }

    public AnonymousClass5P2(C113375lK r2, C989253t r3, AnonymousClass5OJ r4, C112365jc r5, C101715Fv r6, C106995aW r7, AnonymousClass5ZU r8, AnonymousClass314 r9, C66473Lo r10, AnonymousClass1VX r11, AnonymousClass5GZ r12, AnonymousClass65X r13, AnonymousClass2ML r14) {
        C18260x0.A0f(r11, r8, r7, r12, r9);
        C162457s7.A0J(r14, 7);
        C18260x0.A0X(r3, r13, r10);
        C162457s7.A0J(r4, 12);
        this.A0A = r11;
        this.A07 = r8;
        this.A06 = r7;
        this.A08 = r9;
        this.A01 = r2;
        this.A0C = r14;
        this.A02 = r3;
        this.A0B = r13;
        this.A09 = r10;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        C56972sr r0 = r12.A00.A00;
        r0.A0P();
        Me me = r0.A00;
        C626936e.A06(me);
        String A0w = AnonymousClass0x9.A0w(me);
        C162457s7.A0D(A0w);
        this.A00 = A0w;
    }
}
