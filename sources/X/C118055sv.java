package X;

import android.os.Build;

/* renamed from: X.5sv  reason: invalid class name and case insensitive filesystem */
public final class C118055sv implements AnonymousClass4C1 {
    public final int A00;
    public final C88834as A01;
    public final C88844at A02;
    public final C88854au A03;
    public final C64333Db A04;

    public static C182348oG A02() {
        if (Build.VERSION.SDK_INT >= 24) {
            return new AnonymousClass8GC();
        }
        return new C113465lT();
    }

    public Object get() {
        switch (this.A00) {
            case 0:
                return new C45052Ym((AnonymousClass1VX) this.A04.A07.get(), (C66363Lb) this.A04.ARt.get());
            case 1:
                return new AnonymousClass7C3(this);
            case 2:
                return new AnonymousClass7C8(this);
            case 3:
                return new AnonymousClass7CH(this);
            case 4:
                return new AnonymousClass2V3(this);
            case 5:
                return new AnonymousClass7CM(this);
            case 6:
                return new AnonymousClass7CR(this);
            case 7:
                return new AnonymousClass7CS(this);
            case 8:
                return new AnonymousClass7CT(this);
            case 9:
                return new AnonymousClass7CU(this);
            case 10:
                return new C146827Bt(this);
            case 11:
                return new C146837Bu(this);
            case 12:
                return new C146847Bv(this);
            case 13:
                return new C146857Bw(this);
            case 14:
                return new C146867Bx(this);
            case 15:
                return new C146877By(this);
            case 16:
                return new C146887Bz(this);
            case 17:
                return new AnonymousClass7C0(this);
            case 18:
                return new AnonymousClass7C1(this);
            case 19:
                return new AnonymousClass7C2(this);
            case 20:
                return new AnonymousClass7C4(this);
            case 21:
                return new C101495Ez(this);
            case 22:
                return new AnonymousClass7C5(this);
            case 23:
                return new C39562Cl(this);
            case 24:
                return new C124066Av(this, 0);
            case 25:
                return new AnonymousClass5MB(this);
            case 26:
                return new AnonymousClass5F0(this);
            case 27:
                return new C124076Aw(this, 0);
            case 28:
                return new AnonymousClass7C6(this);
            case 29:
                return new AnonymousClass7C7(this);
            case 30:
                return new AnonymousClass7C9(this);
            case 31:
                return new AnonymousClass7CA(this);
            case 32:
                return new AnonymousClass7CB(this);
            case 33:
                return new AnonymousClass7CC(this);
            case 34:
                return new AnonymousClass7CD(this);
            case 35:
                return new AnonymousClass7CE(this);
            case 36:
                return new AnonymousClass7CF(this);
            case 37:
                return new AnonymousClass7CG(this);
            case 38:
                return new C39572Cm(this);
            case 39:
                return new C39582Cn(this);
            case 40:
                return new AnonymousClass5F1(this);
            case 41:
                return new AnonymousClass7CI(this);
            case 42:
                return new AnonymousClass7CJ(this);
            case 43:
                return new C39592Co(this);
            case 44:
                return new C39602Cp(this);
            case 45:
                return new C39612Cq(this);
            case 46:
                return new AnonymousClass7CK(this);
            case 47:
                return new C39622Cr(this);
            case 48:
                return new C39632Cs(this);
            case 49:
                return new C39642Ct(this);
            case 50:
                return new C39652Cu(this);
            case 51:
                return new C39662Cv(this);
            case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER:
                return new C39672Cw(this);
            case 53:
                return new C39682Cx(this);
            case 54:
                return A03();
            case 55:
                return new AnonymousClass7U5(C69783Yj.A00(this.A04.AdE), (C620733j) this.A04.AbU.get());
            case 56:
                return new C39692Cy(this);
            case AnonymousClass1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER:
                return new AnonymousClass7CL(this);
            case 58:
                return new C39702Cz(this);
            case 59:
                return new AnonymousClass2D0(this);
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                return new AnonymousClass2D1(this);
            case 61:
                return new AnonymousClass2D2(this);
            case 62:
                C94344qz A07 = this.A03.A7H();
                A04(A07);
                return A07;
            case 63:
                return new AnonymousClass2RP((C620733j) this.A04.AbU.get(), (AnonymousClass5Y0) this.A04.A8o.get(), (AnonymousClass33O) this.A04.AX1.get(), C69723Yd.A00(), C69713Yc.A00());
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER:
                return new AnonymousClass7CN(this);
            case AnonymousClass1EU.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER:
                return new AnonymousClass7CO(this);
            case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                return new AnonymousClass2D3(this);
            case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                return new AnonymousClass7CP(this);
            case 68:
                return new AnonymousClass7CQ(this);
            case AnonymousClass1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                return new AnonymousClass2D4(this);
            default:
                throw new AssertionError(this.A00);
        }
    }

    public C118055sv(C88834as r1, C88844at r2, C88854au r3, C64333Db r4, int i) {
        this.A04 = r4;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i;
    }

    public static C182348oG A03() {
        C182348oG A022 = A02();
        C615931l.A00(A022);
        return A022;
    }

    public static void A04(C94344qz r0) {
        C615931l.A00(r0);
    }
}
