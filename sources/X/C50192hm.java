package X;

import com.whatsapp.R;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistUnavailableBottomSheet;
import com.whatsapp.util.Log;

/* renamed from: X.2hm  reason: invalid class name and case insensitive filesystem */
public final class C50192hm {
    public final C69263Wi A00;
    public final C56722sS A01;
    public final AnonymousClass2PY A02;
    public final C54862pP A03;
    public final C55382qG A04;
    public final C59702xL A05;
    public final AnonymousClass4FV A06;
    public final C183538qC A07;

    public final void A00(C89654ea r11, AnonymousClass49M r12, C996357k r13, Integer num) {
        AnonymousClass4FV r2 = this.A06;
        AnonymousClass1ZN r1 = new AnonymousClass1ZN();
        r1.A00 = 52;
        Integer num2 = num;
        r1.A01 = num;
        r2.BhD(r1);
        C52802m4 r14 = this.A01.A01;
        C89654ea r5 = r11;
        if (!r14.A01()) {
            Log.d("bonsaionboarding/open/disabled");
            AnonymousClass1VX r22 = r14.A03;
            C58422vE r15 = C58422vE.A02;
            if (!r22.A0Y(r15, 5459) || !r22.A0Y(r15, 4165)) {
                return;
            }
        } else {
            AnonymousClass49M r6 = r12;
            C996357k r8 = r13;
            if (r14.A00()) {
                A01(r12, r13, num);
                return;
            } else if (r14.A03.A0Y(C58422vE.A02, 5459)) {
                AnonymousClass408 r4 = new AnonymousClass408(r5, r6, this, r8, num2);
                C59702xL r3 = this.A05;
                if (r3.A03.A01() == C372121j.IN_WAITLIST) {
                    this.A00.A0G(0, R.string.f11nameremoved);
                    r3.A01(new AnonymousClass3ER(r11, new AnonymousClass3ET(this, r4)));
                    return;
                }
                r4.invoke();
                return;
            }
        }
        Log.d("openCantWaitList/open/can't join");
        r11.Boo(new BonsaiWaitlistUnavailableBottomSheet());
    }

    public final void A01(AnonymousClass49M r7, C996357k r8, Integer num) {
        boolean A012;
        Log.d("bonsaionboarding/open/invoke, tos or ready");
        AnonymousClass401 r2 = new AnonymousClass401(r7, this, r8, num);
        C54862pP r5 = this.A03;
        int A022 = C18320x8.A02(r8, 0);
        if (A022 == 0) {
            A012 = r5.A01();
        } else if (A022 == 1) {
            A012 = r5.A00();
        } else {
            throw C73153f1.A00();
        }
        if (!A012) {
            this.A00.A0G(0, R.string.f11nameremoved);
            r5.A03.A00(new AnonymousClass4JA(r5, 0, new C79993xW(this, r2)), new long[]{20230902, 20230901});
            return;
        }
        r2.invoke();
    }

    public C50192hm(C69263Wi r1, C56722sS r2, AnonymousClass2PY r3, C54862pP r4, C55382qG r5, C59702xL r6, AnonymousClass4FV r7, C183538qC r8) {
        C18260x0.A0f(r1, r2, r7, r4, r5);
        C18260x0.A0W(r3, r8, r6);
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A07 = r8;
        this.A05 = r6;
    }
}
