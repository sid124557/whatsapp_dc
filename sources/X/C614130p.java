package X;

import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$combineResults$jobResult$1;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getAdHocParticipantsByRecency$recentCalls$1;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getLGCParticipantsByRecency$recentCalls$1;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getOneOnOneParticipantsByRecency$recentCalls$1;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$1;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$2;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$3;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$4;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$5;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByRecency$job$1;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByRecency$job$2;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByRecency$job$3;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByRecency$job$4;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByRecency$job$5;
import com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$runBlockingCancelable$1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: X.30p  reason: invalid class name and case insensitive filesystem */
public final class C614130p {
    public Collection A00 = C72023d3.A00;
    public boolean A01 = true;
    public final C55682qk A02;
    public final AnonymousClass2S1 A03;
    public final C64773Ex A04;
    public final C56762sW A05;
    public final C56152rV A06;
    public final C620533h A07;
    public final AnonymousClass66R A08 = C154517dI.A01(new C76963sd(this));
    public final AnonymousClass66R A09 = C154517dI.A01(new C76973se(this));
    public final AnonymousClass66R A0A = C154517dI.A01(new C76983sf(this));
    public final AnonymousClass66R A0B = C154517dI.A01(new C76993sg(this));
    public final AnonymousClass4C6 A0C;

    public C614130p(C55682qk r3, AnonymousClass2S1 r4, C64773Ex r5, C56762sW r6, C56152rV r7, C620533h r8, AnonymousClass4C6 r9) {
        C162457s7.A0J(r3, 1);
        C18260x0.A0e(r5, r7, r6, r8);
        C162457s7.A0J(r9, 6);
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = r8;
        this.A0C = r9;
        this.A03 = r4;
    }

    public final Object A02(AnonymousClass4GR r6) {
        try {
            return C380725l.A00(C72553du.A00, new CallSuggestionsLoaderImpl$runBlockingCancelable$1((C84814Du) null, r6));
        } catch (C73463fX unused) {
            if (this.A01) {
                Log.e("FrequentlyAddedToCallStore job timed out");
                this.A02.A0A("FrequentlyCalledStore/fetch", false, "{ timeout }");
                this.A01 = false;
                return null;
            }
            return null;
        } catch (CancellationException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "FrequentlyAddedToCallStore job was cancelled; reason: ", e);
            return null;
        }
    }

    public final List A03() {
        C42672Pb r0 = (C42672Pb) A02(new CallSuggestionsLoaderImpl$getAdHocParticipantsByRecency$recentCalls$1(this, (C84814Du) null));
        if (r0 == null) {
            return C72023d3.A00;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass3ZF A092 : r0.A01) {
            A0s.addAll(A08(A092.A09()));
        }
        return A0s;
    }

    public final List A05() {
        C42672Pb r0 = (C42672Pb) A02(new CallSuggestionsLoaderImpl$getLGCParticipantsByRecency$recentCalls$1(this, (C84814Du) null));
        if (r0 == null) {
            return C72023d3.A00;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass3ZF r4 : r0.A02) {
            LinkedHashSet A17 = AnonymousClass0x9.A17();
            Iterator A012 = AnonymousClass3ZF.A01(r4);
            while (A012.hasNext()) {
                UserJid userJid = ((AnonymousClass3ZE) A012.next()).A02;
                if (r4.A0T(userJid)) {
                    C162457s7.A0C(userJid);
                    A17.add(userJid);
                }
            }
            List A082 = A08(A17);
            A09(AnonymousClass21M.LGC, A082);
            A0s.addAll(A082);
        }
        return A0s;
    }

    public final List A06() {
        C42672Pb r0 = (C42672Pb) A02(new CallSuggestionsLoaderImpl$getOneOnOneParticipantsByRecency$recentCalls$1(this, (C84814Du) null));
        if (r0 == null) {
            return C72023d3.A00;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass3ZF r02 : r0.A03) {
            Collection collection = this.A00;
            UserJid userJid = r02.A0E.A01;
            if (!collection.contains(userJid)) {
                C162457s7.A0D(userJid);
                A0s.add(userJid);
            }
        }
        return A0s;
    }

    public C60122y2 A01(Collection collection) {
        ArrayList arrayList;
        AnonymousClass4GR callSuggestionsLoaderImpl$getSuggestionsByRecency$job$1;
        AnonymousClass4GR callSuggestionsLoaderImpl$getSuggestionsByFrequency$job$1;
        this.A00 = collection;
        AnonymousClass2S1 r10 = this.A03;
        if (r10.A03.ordinal() != 1) {
            arrayList = AnonymousClass001.A0s();
            for (AnonymousClass21M ordinal : r10.A05) {
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 1) {
                    callSuggestionsLoaderImpl$getSuggestionsByFrequency$job$1 = new CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$1(this, (C84814Du) null);
                } else if (ordinal2 == 2) {
                    callSuggestionsLoaderImpl$getSuggestionsByFrequency$job$1 = new CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$2(this, (C84814Du) null);
                } else if (ordinal2 == 3) {
                    callSuggestionsLoaderImpl$getSuggestionsByFrequency$job$1 = new CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$3(this, (C84814Du) null);
                } else if (ordinal2 == 4) {
                    callSuggestionsLoaderImpl$getSuggestionsByFrequency$job$1 = new CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$4(this, (C84814Du) null);
                } else if (ordinal2 == 5) {
                    callSuggestionsLoaderImpl$getSuggestionsByFrequency$job$1 = new CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$5(this, (C84814Du) null);
                }
                arrayList.add(C616131n.A01(AnonymousClass2C4.A01, callSuggestionsLoaderImpl$getSuggestionsByFrequency$job$1, this.A0C, AnonymousClass20D.DEFAULT));
            }
        } else {
            arrayList = AnonymousClass001.A0s();
            for (AnonymousClass21M ordinal3 : r10.A05) {
                int ordinal4 = ordinal3.ordinal();
                if (ordinal4 == 1) {
                    callSuggestionsLoaderImpl$getSuggestionsByRecency$job$1 = new CallSuggestionsLoaderImpl$getSuggestionsByRecency$job$1(this, (C84814Du) null);
                } else if (ordinal4 == 2) {
                    callSuggestionsLoaderImpl$getSuggestionsByRecency$job$1 = new CallSuggestionsLoaderImpl$getSuggestionsByRecency$job$2(this, (C84814Du) null);
                } else if (ordinal4 == 3) {
                    callSuggestionsLoaderImpl$getSuggestionsByRecency$job$1 = new CallSuggestionsLoaderImpl$getSuggestionsByRecency$job$3(this, (C84814Du) null);
                } else if (ordinal4 == 4) {
                    callSuggestionsLoaderImpl$getSuggestionsByRecency$job$1 = new CallSuggestionsLoaderImpl$getSuggestionsByRecency$job$4(this, (C84814Du) null);
                } else if (ordinal4 == 5) {
                    callSuggestionsLoaderImpl$getSuggestionsByRecency$job$1 = new CallSuggestionsLoaderImpl$getSuggestionsByRecency$job$5(this, (C84814Du) null);
                }
                arrayList.add(C616131n.A01(AnonymousClass2C4.A01, callSuggestionsLoaderImpl$getSuggestionsByRecency$job$1, this.A0C, AnonymousClass20D.DEFAULT));
            }
        }
        C60122y2 r8 = new C60122y2(5, true);
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i = r10.A00;
            C51282jZ r5 = (C51282jZ) A02(new CallSuggestionsLoaderImpl$combineResults$jobResult$1((C84814Du) null, (C85464Gi) it.next()));
            if (r5 != null) {
                for (Object next : r5.A01) {
                    if (i <= 0) {
                        break;
                    }
                    AnonymousClass21M r14 = r5.A00;
                    C162457s7.A0J(next, 1);
                    List A0s = C18320x8.A0s(r14, r8.A01);
                    if (A0s != null) {
                        A0s.add(next);
                    }
                    List list = r8.A00;
                    if (list.size() < 5 || r8.A03.contains(next)) {
                        Map map = r8.A02;
                        C162457s7.A0J(map, 0);
                        AnonymousClass0x2.A1K(r14, map, C18310x6.A0B(C57692u3.A02(map, r14)) + 1);
                        if (r8.A03.add(next)) {
                            list.add(next);
                        }
                    }
                    if (A17.add(next)) {
                        i--;
                    }
                }
            }
        }
        return r8;
    }

    public final void A09(AnonymousClass21M r3, List list) {
        AnonymousClass2S1 r1 = this.A03;
        C162457s7.A0J(r3, 0);
        if (r1.A04.contains(r3) && list.size() > 1) {
            C73753g1.A0a(list, new AnonymousClass4IS((Object) this, 1));
        }
    }

    public static final List A00(List list) {
        HashSet A0K = AnonymousClass002.A0K();
        HashMap A0t = AnonymousClass001.A0t();
        Map A052 = C57692u3.A05(AnonymousClass001.A0t(), AnonymousClass44Z.A00);
        for (Object next : list) {
            if (A0K.add(next)) {
                AnonymousClass0x2.A1I(next, A0t, A0K.size());
            }
            C162457s7.A0J(A052, 0);
            C18280x3.A1D(next, A052, AnonymousClass001.A0K(C57692u3.A02(A052, next)) + 1);
        }
        return C73723fy.A0L(AnonymousClass002.A0J(A0K), new AnonymousClass4IR(A0t, 0, new AnonymousClass4IS(A052, 2)));
    }

    public final List A04() {
        C624134x A022;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0q = C18320x8.A0q(this.A08.getValue());
        while (A0q.hasNext()) {
            C620833k r7 = (C620833k) A0q.next();
            C162457s7.A0H(r7);
            int size = r7.A09.size();
            AnonymousClass2S1 r5 = this.A03;
            if (size <= 32 && (A022 = this.A06.A02(r7.A05, true)) != null && A022.A0K >= r5.A02) {
                C129526aS A023 = r7.A02();
                C162457s7.A0D(A023);
                List A082 = A08(A023);
                A09(AnonymousClass21M.GROUP_CHATS, A082);
                A0s.addAll(A082);
            }
        }
        return A0s;
    }

    public final List A07() {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A04.A05.A0U(A0s, 2, false, true, false);
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C95814uZ r1 = C18310x6.A0R(it).A0H;
            if (r1 != null && !C73723fy.A0U(this.A00, r1)) {
                A0s2.add(r1);
            }
        }
        return A0s2;
    }

    public final List A08(Set set) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (set.containsAll(this.A00)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                UserJid A0T = C18310x6.A0T(it);
                if (!this.A00.contains(A0T) && this.A04.A0l(A0T)) {
                    A0s.add(A0T);
                }
            }
        }
        return A0s;
    }
}
