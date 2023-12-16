package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.community.CommunitySubgroupsBottomSheet;

/* renamed from: X.4X0  reason: invalid class name */
public class AnonymousClass4X0 extends AnonymousClass0R6 {
    public final C27991fJ A00;
    public final /* synthetic */ CommunitySubgroupsBottomSheet A01;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i == 0) {
            return new C91664kg(this.A01.A0I().inflate(R.layout.f8nameremoved, viewGroup2, false), new C71553cI((Object) this, 38));
        }
        if (i2 == 1) {
            View A0R = AnonymousClass001.A0R(C18280x3.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved);
            CommunitySubgroupsBottomSheet communitySubgroupsBottomSheet = this.A01;
            C003203q A0R2 = communitySubgroupsBottomSheet.A0R();
            C54292oU r35 = communitySubgroupsBottomSheet.A0M;
            C56612sH r34 = communitySubgroupsBottomSheet.A0L;
            AnonymousClass1VX r46 = communitySubgroupsBottomSheet.A0Y;
            C69263Wi r65 = communitySubgroupsBottomSheet.A06;
            C106195Xz r51 = communitySubgroupsBottomSheet.A0d;
            C56972sr r64 = communitySubgroupsBottomSheet.A07;
            AnonymousClass4FS r11 = communitySubgroupsBottomSheet.A0k;
            C56722sS r63 = communitySubgroupsBottomSheet.A0A;
            C56982ss r40 = communitySubgroupsBottomSheet.A0R;
            AnonymousClass3LP r47 = communitySubgroupsBottomSheet.A0Z;
            C195219Wq r54 = communitySubgroupsBottomSheet.A0g;
            AnonymousClass5UX r62 = communitySubgroupsBottomSheet.A0F;
            C64773Ex r28 = communitySubgroupsBottomSheet.A0G;
            C53582nK r61 = communitySubgroupsBottomSheet.A03;
            C46962cU r41 = communitySubgroupsBottomSheet.A0S;
            C620633i r33 = communitySubgroupsBottomSheet.A0K;
            AnonymousClass5ZU r29 = communitySubgroupsBottomSheet.A0H;
            C620733j r37 = communitySubgroupsBottomSheet.A0O;
            C56072rN r27 = communitySubgroupsBottomSheet.A0j;
            AnonymousClass9U4 r26 = communitySubgroupsBottomSheet.A0f;
            C56962sq r25 = communitySubgroupsBottomSheet.A09;
            C56152rV r24 = communitySubgroupsBottomSheet.A0V;
            C116985rC r23 = communitySubgroupsBottomSheet.A02;
            C52472lX r22 = communitySubgroupsBottomSheet.A0a;
            C56762sW r21 = communitySubgroupsBottomSheet.A0P;
            AnonymousClass1R1 r20 = communitySubgroupsBottomSheet.A0i;
            C620333f r19 = communitySubgroupsBottomSheet.A0W;
            AnonymousClass2R8 r18 = communitySubgroupsBottomSheet.A0X;
            AnonymousClass33p r15 = communitySubgroupsBottomSheet.A0N;
            C56942so r14 = communitySubgroupsBottomSheet.A0B;
            C56322rn r13 = communitySubgroupsBottomSheet.A0U;
            C1907099n r10 = communitySubgroupsBottomSheet.A0e;
            C625735q r9 = communitySubgroupsBottomSheet.A08;
            C107075ae r58 = C107075ae.A00;
            C105365Uq r8 = communitySubgroupsBottomSheet.A0I;
            C103445Mz r7 = new C103445Mz(new C72173dI(r11, true));
            C116985rC r6 = communitySubgroupsBottomSheet.A01;
            C113445lR r5 = communitySubgroupsBottomSheet.A0D;
            C50222hp r4 = communitySubgroupsBottomSheet.A0h;
            C43642Sx r3 = communitySubgroupsBottomSheet.A0c;
            return new C91674kh(A0R2, A0R, r23, r6, r61, r65, r64, r9, r25, r63, r14, r62, r28, r29, r8, r7, r5, r33, r34, r35, r15, r37, r21, communitySubgroupsBottomSheet.A0Q, r40, r41, r13, r24, r19, r18, r46, r47, r22, communitySubgroupsBottomSheet.A0b, r3, r51, r10, r26, r54, r4, r20, r27, r58, r11, communitySubgroupsBottomSheet.A0l);
        } else if (i2 == 2) {
            return new C91684ki(this.A01.A0I().inflate(R.layout.f8nameremoved, viewGroup2, false), new C71553cI((Object) this, 37));
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("View type ");
            A0o.append(i2);
            throw AnonymousClass000.A0I(" not recognizable", A0o);
        }
    }

    public AnonymousClass4X0(CommunitySubgroupsBottomSheet communitySubgroupsBottomSheet, C27991fJ r2) {
        this.A01 = communitySubgroupsBottomSheet;
        this.A00 = r2;
    }

    public long A0B(int i) {
        CommunitySubgroupsBottomSheet communitySubgroupsBottomSheet = this.A01;
        int i2 = ((AnonymousClass7HP) communitySubgroupsBottomSheet.A00.A01(i)).A00;
        if (i2 != 1) {
            return (long) i2;
        }
        return (long) ((C52882mC) ((AnonymousClass7HP) communitySubgroupsBottomSheet.A00.A01(i)).A01).A02.hashCode();
    }

    public int A0G() {
        return this.A01.A00.A03;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        ((C125646Iv) r2).A07(((AnonymousClass7HP) this.A01.A00.A01(i)).A01, i);
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass7HP) this.A01.A00.A01(i)).A00;
    }
}
