package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass11L;
import X.AnonymousClass1T4;
import X.AnonymousClass1T5;
import X.AnonymousClass20X;
import X.AnonymousClass2z0;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C30461mU;
import X.C30601mi;
import X.C372421m;
import X.C54292oU;
import X.C56972sr;
import X.C57682u2;
import X.C59022wD;
import X.C60572ym;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import X.C95814uZ;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoViewModel$updateResponseItems$1", f = "EventInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoViewModel$updateResponseItems$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C30461mU $message;
    public int label;
    public final /* synthetic */ AnonymousClass11L this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoViewModel$updateResponseItems$1(C30461mU r2, AnonymousClass11L r3, C84814Du r4) {
        super(r4, 2);
        this.$message = r2;
        this.this$0 = r3;
    }

    public final Object A09(Object obj) {
        Object value;
        ArrayList A0s;
        UserJid A0o;
        UserJid A0o2;
        if (this.label == 0) {
            C57682u2.A01(obj);
            ArrayList A0s2 = AnonymousClass001.A0s();
            C30461mU r1 = this.$message;
            if (r1.A1J.A02) {
                Set entrySet = this.this$0.A03.A00(r1).A00.entrySet();
                C162457s7.A0D(entrySet);
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    AnonymousClass0x7.A1J(A0s2, AnonymousClass001.A0w(it));
                }
            }
            AnonymousClass11L r9 = this.this$0;
            C85524Gp r8 = r9.A08;
            C30461mU r7 = this.$message;
            do {
                value = r8.getValue();
                A0s = AnonymousClass001.A0s();
                AnonymousClass2z0 r11 = r7.A1J;
                C95814uZ r4 = r11.A00;
                if (r4 != null) {
                    Iterable A1v = r7.A1v();
                    if (A1v == null) {
                        A1v = AnonymousClass001.A0s();
                    }
                    List<C30601mi> A0H = C73723fy.A0H(A1v, 16);
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    ArrayList A0s4 = AnonymousClass001.A0s();
                    LinkedHashSet A17 = AnonymousClass0x9.A17();
                    for (C30601mi r13 : A0H) {
                        if (r13.A1J.A02) {
                            A0o2 = C56972sr.A05(r9.A00);
                        } else {
                            A0o2 = r13.A0o();
                        }
                        if (A0o2 != null) {
                            C372421m r0 = r13.A01;
                            if (r0 != null) {
                                int ordinal = r0.ordinal();
                                if (ordinal == 1) {
                                    A0s3.add(new AnonymousClass1T5(AnonymousClass20X.NONE, r4, A0o2, Long.valueOf(r13.A0K)));
                                } else if (ordinal == 2) {
                                    A0s4.add(new AnonymousClass1T5(AnonymousClass20X.NONE, r4, A0o2, Long.valueOf(r13.A0K)));
                                }
                            }
                            A17.add(A0o2);
                        }
                    }
                    ArrayList A0s5 = AnonymousClass001.A0s();
                    if (r11.A02) {
                        A0o = C56972sr.A05(r9.A00);
                    } else {
                        A0o = r7.A0o();
                    }
                    if (A0o != null) {
                        Resources A00 = C54292oU.A00(r9.A01);
                        int size = A0s3.size() + 1;
                        Object[] objArr = new Object[1];
                        AnonymousClass000.A1L(objArr, A0s3.size() + 1);
                        String quantityString = A00.getQuantityString(R.plurals.f9nameremoved, size, objArr);
                        C162457s7.A0D(quantityString);
                        A0s5.add(new AnonymousClass1T4(quantityString));
                        A0s5.add(new AnonymousClass1T5(AnonymousClass20X.EVENT_CREATOR, r4, A0o, Long.valueOf(r7.A0K)));
                    }
                    A0s5.addAll(A0s3);
                    A0s.addAll(A0s5);
                    ArrayList A0s6 = AnonymousClass001.A0s();
                    if (!A0s4.isEmpty()) {
                        Resources A002 = C54292oU.A00(r9.A01);
                        int size2 = A0s4.size();
                        Object[] A0L = AnonymousClass002.A0L();
                        AnonymousClass000.A1L(A0L, A0s4.size());
                        String quantityString2 = A002.getQuantityString(R.plurals.f9nameremoved, size2, A0L);
                        C162457s7.A0D(quantityString2);
                        A0s6.add(new AnonymousClass1T4(quantityString2));
                        A0s6.addAll(A0s4);
                    }
                    A0s.addAll(A0s6);
                    ArrayList A0s7 = AnonymousClass001.A0s();
                    int size3 = A0s2.size() - A17.size();
                    if (!A0s2.isEmpty() && size3 > 0) {
                        Resources A003 = C54292oU.A00(r9.A01);
                        Object[] A0L2 = AnonymousClass002.A0L();
                        C18270x1.A1Q(A0L2, size3);
                        String quantityString3 = A003.getQuantityString(R.plurals.f9nameremoved, size3, A0L2);
                        C162457s7.A0D(quantityString3);
                        A0s7.add(new AnonymousClass1T4(quantityString3));
                        Iterator it2 = A0s2.iterator();
                        while (it2.hasNext()) {
                            UserJid A0T = C18310x6.A0T(it2);
                            if (!A17.contains(A0T)) {
                                A0s7.add(new AnonymousClass1T5(AnonymousClass20X.NONE, r4, A0T, (Long) null));
                            }
                        }
                    }
                    A0s.addAll(A0s7);
                }
            } while (!r8.AzD(value, new C60572ym(r7, A0s)));
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new EventInfoViewModel$updateResponseItems$1(this.$message, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
