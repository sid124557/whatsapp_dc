package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5z6  reason: invalid class name and case insensitive filesystem */
public final class C120745z6 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C104555Rk[] $delegateRepositories;
    public final /* synthetic */ C104555Rk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120745z6(C104555Rk r2, C104555Rk[] r3) {
        super(0);
        this.$delegateRepositories = r3;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A0r;
        Integer[] numArr;
        LinkedHashMap A0r2 = C18320x8.A0r();
        C104555Rk[] r3 = this.$delegateRepositories;
        C104555Rk r4 = this.this$0;
        for (C104555Rk r0 : r3) {
            if (r0 != null) {
                A0r2.putAll((Map) r0.A00.getValue());
            }
        }
        boolean z = r4 instanceof C93764pG;
        if (z) {
            A0r = C18320x8.A0r();
            AnonymousClass0x2.A1H(((C93764pG) r4).A00, A0r, 21);
        } else if (r4 instanceof C93784pI) {
            C93784pI r2 = (C93784pI) r4;
            A0r = C18320x8.A0r();
            AnonymousClass0x2.A1H(r2.A03, A0r, 13);
            if (r2.A00.A02()) {
                AnonymousClass0x2.A1H(r2.A04, A0r, 36);
            }
            AnonymousClass0x2.A1H(r2.A01, A0r, 21);
            AnonymousClass0x2.A1H(r2.A02, A0r, 14);
        } else if (r4 instanceof C93774pH) {
            C93774pH r22 = (C93774pH) r4;
            A0r = C18320x8.A0r();
            AnonymousClass0x2.A1H(r22.A00, A0r, 19);
            AnonymousClass0x2.A1H(r22.A01, A0r, 20);
        } else if (r4 instanceof C93714pB) {
            C93714pB r23 = (C93714pB) r4;
            A0r = C18320x8.A0r();
            C116985rC r1 = r23.A00;
            if (r1.A07()) {
                r1.A04();
                throw AnonymousClass001.A0g("provideMessageSelectionAction");
            }
            AnonymousClass4p5 r12 = r23.A03;
            AnonymousClass0x2.A1H(r12, A0r, r12.A01.getId());
            AnonymousClass4p3 r13 = r23.A01;
            AnonymousClass0x2.A1H(r13, A0r, r13.A01.getId());
            AnonymousClass4p6 r14 = r23.A04;
            AnonymousClass0x2.A1H(r14, A0r, r14.A01.getId());
            AnonymousClass4p4 r15 = r23.A02;
            AnonymousClass0x2.A1H(r15, A0r, r15.A01.getId());
        } else if (r4 instanceof C93724pC) {
            C93724pC r24 = (C93724pC) r4;
            A0r = C18320x8.A0r();
            AnonymousClass0x2.A1H(r24.A03, A0r, 9);
            AnonymousClass0x2.A1H(r24.A05, A0r, 1);
            AnonymousClass0x2.A1H(r24.A06, A0r, 15);
            AnonymousClass0x2.A1H(r24.A02, A0r, 28);
            AnonymousClass0x2.A1H(r24.A08, A0r, 26);
            AnonymousClass0x2.A1H(r24.A07, A0r, 31);
            AnonymousClass0x2.A1H(r24.A04, A0r, 12);
            AnonymousClass0x2.A1H(r24.A00, A0r, 34);
            AnonymousClass0x2.A1H(r24.A01, A0r, 35);
        } else if (r4 instanceof C93754pF) {
            A0r = C18320x8.A0r();
        } else if (r4 instanceof C93734pD) {
            C93734pD r25 = (C93734pD) r4;
            A0r = C18320x8.A0r();
            AnonymousClass0x2.A1H(r25.A02, A0r, 5);
            AnonymousClass0x2.A1H(r25.A0C, A0r, 2);
            AnonymousClass0x2.A1H(r25.A0A, A0r, 16);
            AnonymousClass0x2.A1H(r25.A0B, A0r, 6);
            AnonymousClass0x2.A1H(r25.A03, A0r, 21);
            AnonymousClass0x2.A1H(r25.A0F, A0r, 3);
            AnonymousClass0x2.A1H(r25.A04, A0r, 4);
            AnonymousClass0x2.A1H(r25.A06, A0r, 8);
            AnonymousClass0x2.A1H(r25.A09, A0r, 24);
            AnonymousClass0x2.A1H(r25.A0E, A0r, 25);
            AnonymousClass0x2.A1H(r25.A00, A0r, 10);
            AnonymousClass0x2.A1H(r25.A01, A0r, 7);
            AnonymousClass0x2.A1H(r25.A07, A0r, 19);
            AnonymousClass0x2.A1H(r25.A08, A0r, 11);
            AnonymousClass0x2.A1H(r25.A0D, A0r, 20);
            AnonymousClass0x2.A1H(r25.A05, A0r, 30);
        } else if (r4 instanceof C93744pE) {
            A0r = C18320x8.A0r();
        } else {
            AnonymousClass4pA r26 = (AnonymousClass4pA) r4;
            A0r = C18320x8.A0r();
            AnonymousClass0x2.A1H(r26.A00, A0r, 32);
            AnonymousClass0x2.A1H(r26.A01, A0r, 33);
        }
        A0r2.putAll(A0r);
        if (z) {
            numArr = ((C93764pG) r4).A01;
        } else if (r4 instanceof C93784pI) {
            numArr = ((C93784pI) r4).A05;
        } else if (r4 instanceof C93774pH) {
            numArr = ((C93774pH) r4).A02;
        } else if (r4 instanceof C93754pF) {
            numArr = ((C93754pF) r4).A00;
        } else if (r4 instanceof C93744pE) {
            numArr = ((C93744pE) r4).A00;
        } else {
            numArr = r4.A01;
        }
        C162457s7.A0J(numArr, 1);
        for (Integer remove : numArr) {
            A0r2.remove(remove);
        }
        return A0r2;
    }
}
