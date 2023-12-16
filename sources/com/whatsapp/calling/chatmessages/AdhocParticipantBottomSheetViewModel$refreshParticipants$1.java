package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass3ZE;
import X.AnonymousClass3ZF;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.AnonymousClass8UF;
import X.C106405Yw;
import X.C18280x3;
import X.C52832m7;
import X.C54292oU;
import X.C57682u2;
import X.C59022wD;
import X.C73723fy;
import X.C73783g4;
import X.C75003pT;
import X.C832246p;
import X.C84814Du;
import X.C85524Gp;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel$refreshParticipants$1", f = "AdhocParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheetViewModel$refreshParticipants$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheetViewModel$refreshParticipants$1(AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = adhocParticipantBottomSheetViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel = this.this$0;
            AnonymousClass3ZF A03 = adhocParticipantBottomSheetViewModel.A0A.A03(adhocParticipantBottomSheetViewModel.A0C);
            if (A03 != null) {
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel2 = this.this$0;
                adhocParticipantBottomSheetViewModel2.A02 = A03.A0L;
                adhocParticipantBottomSheetViewModel2.A00 = A03;
                C85524Gp r2 = adhocParticipantBottomSheetViewModel2.A0G;
                boolean A0M = A03.A0M();
                int i = R.string.f11nameremoved;
                if (A0M) {
                    i = R.string.f11nameremoved;
                }
                r2.setValue(Integer.valueOf(i));
                int size = A03.A08().size() - 1;
                C85524Gp r3 = adhocParticipantBottomSheetViewModel2.A0F;
                C54292oU r0 = adhocParticipantBottomSheetViewModel2.A09;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, size, 0);
                r3.setValue(C54292oU.A00(r0).getString(R.string.f11nameremoved, objArr));
                List A08 = A03.A08();
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel3 = this.this$0;
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : A08) {
                    if (!adhocParticipantBottomSheetViewModel3.A04.A0a(C106405Yw.A03(((AnonymousClass3ZE) next).A02))) {
                        A0s.add(next);
                    }
                }
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel4 = this.this$0;
                ArrayList A0c = C73783g4.A0c(A0s);
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    AnonymousClass3ZH A0A = adhocParticipantBottomSheetViewModel4.A07.A0A(((AnonymousClass3ZE) it.next()).A02);
                    String str = adhocParticipantBottomSheetViewModel4.A08.A0D(A0A, 7, false, true).A01;
                    if (str == null) {
                        str = "";
                    }
                    A0c.add(new C52832m7(A0A, str, true, true));
                }
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel5 = this.this$0;
                C85524Gp r8 = adhocParticipantBottomSheetViewModel5.A0I;
                List A0H = C73723fy.A0H(A0c, 1);
                ArrayList A0c2 = C73783g4.A0c(A0H);
                int i2 = 0;
                for (Object next2 : A0H) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        throw C18280x3.A0X();
                    }
                    C52832m7 r4 = (C52832m7) next2;
                    int i4 = adhocParticipantBottomSheetViewModel5.A03;
                    boolean z = true;
                    r4.A01 = AnonymousClass001.A1Y(i2, i4);
                    if (i2 >= i4) {
                        z = false;
                    }
                    r4.A00 = z;
                    A0c2.add(r4);
                    i2 = i3;
                }
                ((C832246p) r8).A04((Object) null, A0c2);
                C85524Gp r32 = adhocParticipantBottomSheetViewModel5.A0H;
                Iterable<C52832m7> iterable = (Iterable) adhocParticipantBottomSheetViewModel5.A0I.getValue();
                int i5 = 0;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (C52832m7 r02 : iterable) {
                        if (r02.A01 && (i5 = i5 + 1) < 0) {
                            AnonymousClass8UF.A0q();
                            throw AnonymousClass000.A0L();
                        }
                    }
                }
                ((C832246p) r32).A04((Object) null, AnonymousClass0x9.A0k(i5));
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AdhocParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AdhocParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, (C84814Du) obj2));
    }
}
