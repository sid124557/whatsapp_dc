package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;

/* renamed from: X.4mL  reason: invalid class name and case insensitive filesystem */
public class C92254mL extends C89904fT {
    public final C187958y5 A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92254mL(X.C009707r r36, X.C116985rC r37, X.C116985rC r38, X.C116985rC r39, X.AnonymousClass5M8 r40, X.AnonymousClass5M9 r41, X.C101365Em r42, X.AnonymousClass4FU r43, X.C69263Wi r44, X.C56972sr r45, X.C66663Mh r46, X.C621033m r47, X.AnonymousClass5MG r48, X.AnonymousClass5TW r49, X.C29301ib r50, X.C46342bT r51, X.C29421in r52, X.AnonymousClass67A r53, X.C113905mB r54, X.AnonymousClass33p r55, X.C620733j r56, X.C56982ss r57, X.C66473Lo r58, X.AnonymousClass3ZH r59, X.C29041iB r60, X.AnonymousClass1VX r61, X.AnonymousClass3LP r62, X.C29241iV r63, X.AnonymousClass1fI r64, X.C50452iC r65, X.AnonymousClass1R1 r66, X.C50282hv r67, X.C187958y5 r68, X.AnonymousClass4FS r69) {
        /*
            r35 = this;
            r29 = r63
            r28 = r62
            r27 = r61
            r26 = r60
            r25 = r59
            r24 = r58
            r10 = r44
            r11 = r45
            r12 = r46
            r13 = r47
            r30 = r64
            r1 = r35
            r31 = r65
            r2 = r36
            r32 = r66
            r3 = r37
            r7 = r41
            r33 = r67
            r4 = r38
            r8 = r42
            r5 = r39
            r9 = r43
            r34 = r69
            r6 = r40
            r14 = r48
            r15 = r49
            r16 = r50
            r17 = r51
            r18 = r52
            r19 = r53
            r20 = r54
            r21 = r55
            r22 = r56
            r23 = r57
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r68
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92254mL.<init>(X.07r, X.5rC, X.5rC, X.5rC, X.5M8, X.5M9, X.5Em, X.4FU, X.3Wi, X.2sr, X.3Mh, X.33m, X.5MG, X.5TW, X.1ib, X.2bT, X.1in, X.67A, X.5mB, X.33p, X.33j, X.2ss, X.3Lo, X.3ZH, X.1iB, X.1VX, X.3LP, X.1iV, X.1fI, X.2iC, X.1R1, X.2hv, X.8y5, X.4FS):void");
    }

    public boolean BXQ(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 21) {
            C009707r r3 = this.A01;
            AnonymousClass0RN.A00(r3, C627736r.A0f(r3, this.A00.A0H, true), AnonymousClass5MG.A00(r3, r3.findViewById(R.id.transition_start), this.A0A));
        } else if (itemId != 22) {
            return super.BXQ(menuItem);
        } else {
            C116985rC r1 = this.A03;
            if (r1.A07()) {
                r1.A04();
                this.A04.A04();
                throw AnonymousClass001.A0g("getLabelBroadcastList");
            }
        }
        return true;
    }

    public boolean BYj(Menu menu) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("listconversationmenu/onprepareoptionsmenu ");
        C18260x0.A1G(A0o, menu.size());
        if (menu.size() == 0) {
            return false;
        }
        return super.BYj(menu);
    }
}
