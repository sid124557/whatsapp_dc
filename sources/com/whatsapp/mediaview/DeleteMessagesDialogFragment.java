package com.whatsapp.mediaview;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass2z0;
import X.AnonymousClass30N;
import X.AnonymousClass33p;
import X.AnonymousClass36Y;
import X.AnonymousClass3CU;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.AnonymousClass5ZW;
import X.AnonymousClass64F;
import X.AnonymousClass6AH;
import X.C106405Yw;
import X.C107395bF;
import X.C116985rC;
import X.C1228165x;
import X.C45042Yl;
import X.C47052cd;
import X.C48952fk;
import X.C50222hp;
import X.C52472lX;
import X.C53202mi;
import X.C55832qz;
import X.C56422rx;
import X.C56612sH;
import X.C56892sj;
import X.C56982ss;
import X.C620733j;
import X.C621033m;
import X.C624134x;
import X.C64773Ex;
import X.C66493Lq;
import X.C69263Wi;
import X.C835748y;
import X.C86614Ku;
import X.C95814uZ;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class DeleteMessagesDialogFragment extends Hilt_DeleteMessagesDialogFragment {
    public C116985rC A00;
    public C1228165x A01 = new AnonymousClass3CU(this);
    public AnonymousClass64F A02 = new AnonymousClass6AH(this, 3);
    public C69263Wi A03;
    public C621033m A04;
    public C64773Ex A05;
    public C56422rx A06;
    public AnonymousClass5ZU A07;
    public C48952fk A08;
    public C56612sH A09;
    public AnonymousClass33p A0A;
    public C56982ss A0B;
    public C56892sj A0C;
    public AnonymousClass36Y A0D;
    public AnonymousClass5Y0 A0E;
    public AnonymousClass4FV A0F;
    public AnonymousClass30N A0G;
    public C66493Lq A0H;
    public C52472lX A0I;
    public C53202mi A0J;
    public C47052cd A0K;
    public C50222hp A0L;
    public C45042Yl A0M;
    public C55832qz A0N;
    public AnonymousClass4FS A0O;

    public static DeleteMessagesDialogFragment A00(C95814uZ r6, List list) {
        DeleteMessagesDialogFragment deleteMessagesDialogFragment = new DeleteMessagesDialogFragment();
        Bundle A082 = AnonymousClass002.A08();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0s.add(C86614Ku.A0h(it));
        }
        C107395bF.A09(A082, A0s);
        if (r6 != null) {
            AnonymousClass0x2.A0v(A082, r6, "jid");
        }
        A082.putBoolean("is_revokable", true);
        deleteMessagesDialogFragment.A0u(A082);
        return deleteMessagesDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        List<AnonymousClass2z0> A042;
        Bundle bundle2 = this.A06;
        if (!(bundle2 == null || A1D() == null || (A042 = C107395bF.A04(bundle2)) == null)) {
            LinkedHashSet A17 = AnonymousClass0x9.A17();
            for (AnonymousClass2z0 A052 : A042) {
                C624134x A053 = this.A0N.A05(A052);
                if (A053 != null) {
                    A17.add(A053);
                }
            }
            C95814uZ A022 = C106405Yw.A02(bundle2, "jid");
            boolean z = bundle2.getBoolean("is_revokable");
            String A012 = AnonymousClass5ZW.A01(A1D(), this.A05, this.A07, A022, A17);
            Context A1D = A1D();
            C56612sH r28 = this.A09;
            AnonymousClass1VX r27 = this.A02;
            C69263Wi r26 = this.A03;
            AnonymousClass4FS r24 = this.A0O;
            AnonymousClass4FV r21 = this.A0F;
            AnonymousClass5Y0 r20 = this.A0E;
            C621033m r22 = this.A04;
            C64773Ex r23 = this.A05;
            AnonymousClass36Y r18 = this.A0D;
            AnonymousClass5ZU r25 = this.A07;
            C620733j r17 = this.A01;
            C48952fk r15 = this.A08;
            C52472lX r14 = this.A0I;
            C53202mi r13 = this.A0J;
            AnonymousClass30N r12 = this.A0G;
            C116985rC r9 = this.A00;
            C56422rx r8 = this.A06;
            AnonymousClass33p r7 = this.A0A;
            C56892sj r6 = this.A0C;
            C47052cd r5 = this.A0K;
            C1228165x r4 = this.A01;
            AnonymousClass64F r3 = this.A02;
            C50222hp r2 = this.A0L;
            C45042Yl r1 = this.A0M;
            C116985rC r172 = r9;
            Dialog A002 = AnonymousClass5ZW.A00(A1D, r172, r4, (C835748y) null, r3, r26, r22, r23, r8, r25, r15, r28, r7, r17, this.A0B, r6, r18, r20, r27, r21, r12, r14, r13, r5, r2, r1, r24, A012, A17, z);
            if (A002 != null) {
                return A002;
            }
        }
        A1L();
        return super.A1J(bundle);
    }
}
