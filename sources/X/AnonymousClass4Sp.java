package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4Sp  reason: invalid class name */
public final class AnonymousClass4Sp extends C04550Os {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5AS A01;
    public final /* synthetic */ C1224964p A02;
    public final /* synthetic */ C102575Jj A03;
    public final /* synthetic */ C112635k3 A04;

    public void A01(int i, CharSequence charSequence) {
        C1225064q r4;
        AnonymousClass58T r1;
        AnonymousClass5S5 r3;
        C112635k3 r32;
        C162457s7.A0J(charSequence, 1);
        Log.i("ChatLockAuthActivity/error");
        if (i == 13) {
            r32 = this.A04;
            if (r32.A02.A03() && !(this.A01 instanceof C91594kQ)) {
                C102575Jj r12 = this.A03;
                ((C112625k2) r12.A04.A0E.get()).AxW(r12.A01, r12.A02, r12.A03, (C102575Jj) null, r12.A00);
                r32.A00 = null;
            }
        }
        C1224964p r33 = this.A02;
        int i2 = this.A00;
        C112595jz r34 = (C112595jz) r33;
        Log.i("ChatLockAuthCallbackBase/autherr");
        Integer[] numArr = new Integer[4];
        AnonymousClass000.A1L(numArr, 12);
        numArr[1] = 1;
        AnonymousClass000.A1N(numArr, 11);
        AnonymousClass000.A1O(numArr, 14);
        Integer valueOf = Integer.valueOf(i);
        if (C73703fw.A00(valueOf, numArr) >= 0) {
            r4 = r34.A01;
            r3 = new AnonymousClass5S5(AnonymousClass58T.ERROR_AUTH_NOT_SETUP, Integer.valueOf(i2), 1);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(' ');
            A0o.append(charSequence);
            String A0Y = AnonymousClass000.A0Y(" code ", A0o, i);
            if (i == 7) {
                A0Y = AnonymousClass000.A0P(A0Y, r34.A00.getString(R.string.f11nameremoved), AnonymousClass001.A0o());
            }
            C18260x0.A1Q(AnonymousClass001.A0o(), "Chatlock auth err ", A0Y);
            Integer[] numArr2 = new Integer[3];
            AnonymousClass000.A1L(numArr2, 5);
            AnonymousClass000.A1P(numArr2, 10, 1);
            AnonymousClass000.A1N(numArr2, 13);
            boolean A1U = AnonymousClass001.A1U(C73703fw.A00(valueOf, numArr2));
            r4 = r34.A01;
            if (A1U) {
                r1 = AnonymousClass58T.CANCELED;
            } else {
                r1 = AnonymousClass58T.ERROR;
            }
            r3 = new AnonymousClass5S5(r1, (Integer) null, (Integer) null);
        }
        r4.BaI(r3);
        r32 = this.A04;
        r32.A01.A02(this.A01, valueOf);
        r32.A00 = null;
    }

    public void A02(AnonymousClass0L0 r7) {
        C162457s7.A0J(r7, 0);
        Log.i("ChatLockAuthActivity/success");
        C112635k3 r4 = this.A04;
        AnonymousClass5UK r5 = r4.A01;
        AnonymousClass5AS r3 = this.A01;
        r5.A03(r3, Integer.valueOf(this.A00), AnonymousClass001.A0f(), 3);
        if (((r3 instanceof C91584kP) && !((C91584kP) r3).A01) || (r3 instanceof C91604kR)) {
            r5.A00.A00("folder_open_count");
        }
        ((C112595jz) this.A02).A01.BaI(new AnonymousClass5S5(AnonymousClass58T.SUCCESS, (Integer) null, (Integer) null));
        r4.A00 = null;
    }

    public AnonymousClass4Sp(AnonymousClass5AS r1, C1224964p r2, C102575Jj r3, C112635k3 r4, int i) {
        this.A04 = r4;
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
    }

    public void A00() {
        C112635k3 r5 = this.A04;
        if (r5.A04.A0X(5337)) {
            r5.A01.A03(this.A01, Integer.valueOf(this.A00), 1, 10);
        }
        r5.A01.A02(this.A01, (Integer) null);
        this.A02.BSk();
        r5.A00 = null;
    }
}
