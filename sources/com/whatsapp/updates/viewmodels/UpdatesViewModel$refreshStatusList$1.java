package com.whatsapp.updates.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1RR;
import X.AnonymousClass1fY;
import X.AnonymousClass32Y;
import X.AnonymousClass4GR;
import X.AnonymousClass4IU;
import X.AnonymousClass5FF;
import X.AnonymousClass5JU;
import X.AnonymousClass5L1;
import X.AnonymousClass5R1;
import X.AnonymousClass5ZA;
import X.AnonymousClass8U8;
import X.AnonymousClass8UG;
import X.C100785Cg;
import X.C103295Mi;
import X.C103655Nv;
import X.C103685Ny;
import X.C105765Wh;
import X.C107695bk;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C56082rO;
import X.C56612sH;
import X.C56972sr;
import X.C57682u2;
import X.C59022wD;
import X.C624134x;
import X.C73723fy;
import X.C73753g1;
import X.C73793g5;
import X.C73813g7;
import X.C75003pT;
import X.C84814Du;
import X.C86664Kz;
import X.C95814uZ;
import X.C986252p;
import X.C986352q;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONException;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshStatusList$1", f = "UpdatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$refreshStatusList$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C103685Ny $myStatusState;
    public final /* synthetic */ boolean $shouldRankStatuses;
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$refreshStatusList$1(C103685Ny r2, UpdatesViewModel updatesViewModel, C84814Du r4, boolean z) {
        super(r4, 2);
        this.this$0 = updatesViewModel;
        this.$myStatusState = r2;
        this.$shouldRankStatuses = z;
    }

    public final Object A09(Object obj) {
        CharSequence charSequence;
        AbstractMap abstractMap;
        int i;
        int i2;
        String A01;
        if (this.label == 0) {
            C57682u2.A01(obj);
            UpdatesViewModel updatesViewModel = this.this$0;
            AnonymousClass5FF r1 = updatesViewModel.A0V;
            C103685Ny r10 = this.$myStatusState;
            C105765Wh r9 = updatesViewModel.A0h.A00;
            boolean z = updatesViewModel.A0E;
            boolean z2 = updatesViewModel.A0D;
            boolean z3 = updatesViewModel.A0C;
            boolean z4 = this.$shouldRankStatuses;
            C103655Nv APz = r1.A00.A01.A00.APz();
            C107695bk r2 = r1.A00.A01.A00;
            AnonymousClass5L1 r11 = new AnonymousClass5L1((C103295Mi) r2.ABB.get(), r9, (AnonymousClass5R1) r2.ABI.get(), APz, r10, z, z2, z3, z4);
            C103655Nv r7 = r11.A03;
            C103685Ny r8 = r11.A04;
            boolean z5 = r11.A06;
            C624134x A00 = r7.A02.A00(AnonymousClass1fY.A00);
            AnonymousClass1RR A012 = C56972sr.A01(r7.A00);
            if (A012 != null) {
                if (A00 != null) {
                    charSequence = r7.A03.A00(A00.A0K);
                } else {
                    charSequence = null;
                }
                C986352q r18 = new C986352q(A012, A00, r8, charSequence, z5);
                C105765Wh r112 = r11.A01;
                List list = r112.A02;
                C986252p r17 = null;
                if (r11.A08 || r11.A00.A00.A0X(56)) {
                    AnonymousClass5R1 r92 = r11.A02;
                    C162457s7.A0J(list, 0);
                    synchronized (r92) {
                        if (r92.A09.A0X(56)) {
                            Map map = r92.A00;
                            if (map == null || map.isEmpty()) {
                                AnonymousClass5JU r82 = r92.A0B;
                                C56612sH r14 = r82.A02;
                                long A0H = r14.A0H();
                                C56082rO r3 = r82.A03;
                                if (r3.A00("status_ranking_map_expiration", 0) >= A0H && (A01 = r3.A01("status_ranking_map")) != null) {
                                    try {
                                        JSONObject A1H = AnonymousClass0x9.A1H(A01);
                                        Iterator<String> keys = A1H.keys();
                                        abstractMap = AnonymousClass001.A0t();
                                        while (keys.hasNext()) {
                                            String A0m = AnonymousClass001.A0m(keys);
                                            C95814uZ A0S = C18310x6.A0S(A0m);
                                            if (A0S != null) {
                                                AnonymousClass0x2.A1I(A0S, abstractMap, A1H.getInt(A0m));
                                            }
                                        }
                                    } catch (JSONException unused) {
                                        Log.e("Unable to fetch the ranking map");
                                    }
                                    r92.A00 = abstractMap;
                                }
                                abstractMap = C18320x8.A0r();
                                r92.A00(r92.A06.A05(), abstractMap, r92.A04);
                                r92.A00(r92.A07.A01(C100785Cg.A00, false), abstractMap, r92.A02);
                                int i3 = r92.A03;
                                if (i3 != 0) {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet(r92.A0A.A0Q().keySet());
                                    ArrayList A0s = AnonymousClass001.A0s();
                                    Iterator it = linkedHashSet.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        C95814uZ r0 = (C95814uZ) next;
                                        C162457s7.A0H(r0);
                                        if (r0 instanceof UserJid) {
                                            A0s.add(next);
                                        }
                                    }
                                    Iterator it2 = A0s.iterator();
                                    while (it2.hasNext()) {
                                        UserJid A05 = AnonymousClass32Y.A05((Jid) it2.next());
                                        if (A05 != null) {
                                            Integer num = (Integer) abstractMap.get(A05);
                                            if (num != null) {
                                                i2 = num.intValue();
                                            } else {
                                                i2 = 0;
                                            }
                                            AnonymousClass0x2.A1I(A05, abstractMap, i2 + (r92.A05 * i3));
                                        }
                                    }
                                }
                                int i4 = r92.A01;
                                if (i4 != 0) {
                                    List A07 = r92.A08.A07();
                                    ArrayList A0s2 = AnonymousClass001.A0s();
                                    for (Object next2 : A07) {
                                        C95814uZ r02 = (C95814uZ) next2;
                                        C162457s7.A0H(r02);
                                        if (r02 instanceof UserJid) {
                                            A0s2.add(next2);
                                        }
                                    }
                                    Iterator it3 = A0s2.iterator();
                                    while (it3.hasNext()) {
                                        Object next3 = it3.next();
                                        C162457s7.A0H(next3);
                                        Integer num2 = (Integer) abstractMap.get(next3);
                                        if (num2 != null) {
                                            i = num2.intValue();
                                        } else {
                                            i = 0;
                                        }
                                        AnonymousClass0x2.A1I(next3, abstractMap, i + (r92.A05 * i4));
                                    }
                                }
                                C18260x0.A1P(AnonymousClass001.A0o(), "Generated new rank map: ", r92);
                                Map A0B = C73813g7.A0B(C73723fy.A0J(C73723fy.A0L(C73793g5.A06(abstractMap), new AnonymousClass4IU(37)), r82.A00));
                                LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass8UG.A0I(A0B.size()));
                                Iterator A16 = AnonymousClass0x9.A16(A0B);
                                while (A16.hasNext()) {
                                    Map.Entry A0w = AnonymousClass001.A0w(A16);
                                    linkedHashMap.put(((Jid) A0w.getKey()).getRawString(), A0w.getValue());
                                }
                                r3.A05("status_ranking_map", C18290x4.A0o(new JSONObject(linkedHashMap)));
                                r3.A04("status_ranking_map_expiration", r14.A0H() + r82.A01);
                                r92.A00 = abstractMap;
                            }
                            ArrayList A0J = AnonymousClass002.A0J(list);
                            C73753g1.A0a(A0J, r92.A0C);
                            list = new AnonymousClass8U8(A0J);
                        }
                    }
                }
                ArrayList A0s3 = AnonymousClass001.A0s();
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    C103655Nv.A00(C86664Kz.A19(it4), r7, A0s3, z5, false);
                }
                List list2 = r112.A03;
                ArrayList A0s4 = AnonymousClass001.A0s();
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    C103655Nv.A00(C86664Kz.A19(it5), r7, A0s4, z5, false);
                }
                List list3 = r112.A01;
                ArrayList A0s5 = AnonymousClass001.A0s();
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    C103655Nv.A00(C86664Kz.A19(it6), r7, A0s5, z5, true);
                }
                if (C18310x6.A1X(list3) && r11.A00.A00.A0X(5226)) {
                    r17 = C986252p.A00;
                }
                AnonymousClass5ZA r16 = new AnonymousClass5ZA(r17, r18, A0s3, A0s4, A0s5, r11.A07, false, r11.A05);
                UpdatesViewModel updatesViewModel2 = this.this$0;
                boolean z6 = this.$shouldRankStatuses;
                updatesViewModel2.A0Q.A0G(r16);
                Collection A1P = C86664Kz.A1P(updatesViewModel2.A0T);
                if (A1P == null || A1P.isEmpty()) {
                    updatesViewModel2.A0J();
                }
                if (!updatesViewModel2.A0L) {
                    updatesViewModel2.A0L = z6;
                }
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0e("Me contact cannot be null");
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new UpdatesViewModel$refreshStatusList$1(this.$myStatusState, this.this$0, r6, this.$shouldRankStatuses);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
