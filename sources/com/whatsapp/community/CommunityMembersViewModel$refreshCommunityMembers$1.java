package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass34R;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.AnonymousClass5QZ;
import X.AnonymousClass8UG;
import X.C104485Rd;
import X.C162457s7;
import X.C18320x8;
import X.C27991fJ;
import X.C52882mC;
import X.C56892sj;
import X.C56972sr;
import X.C57682u2;
import X.C59022wD;
import X.C60842zG;
import X.C616131n;
import X.C620833k;
import X.C64623Eg;
import X.C73853gB;
import X.C75003pT;
import X.C84384Cd;
import X.C84814Du;
import X.C85524Gp;
import X.C95814uZ;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1", f = "CommunityMembersViewModel.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersViewModel$refreshCommunityMembers$1 extends C75003pT implements AnonymousClass4GR {
    public Object L$0;
    public int label;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersViewModel$refreshCommunityMembers$1(CommunityMembersViewModel communityMembersViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = communityMembersViewModel;
    }

    public final Object A09(Object obj) {
        CommunityMembersViewModel communityMembersViewModel;
        Object value;
        C27991fJ r8;
        LinkedHashMap linkedHashMap;
        Object value2;
        Object obj2;
        Object value3;
        Integer num;
        String str;
        int i;
        int i2;
        C27991fJ A03;
        Object obj3 = obj;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            C57682u2.A01(obj3);
            communityMembersViewModel = this.this$0;
            C84384Cd r4 = communityMembersViewModel.A07;
            C27991fJ r3 = communityMembersViewModel.A0K;
            C73853gB r2 = communityMembersViewModel.A0L;
            this.L$0 = communityMembersViewModel;
            this.label = 1;
            obj3 = C616131n.A00(this, r2, new CommunityMembersDirectory$getCommunityDirectory$4((C64623Eg) r4, r3, (C84814Du) null));
            if (obj3 == r6) {
                return r6;
            }
        } else if (i3 == 1) {
            communityMembersViewModel = (CommunityMembersViewModel) this.L$0;
            C57682u2.A01(obj3);
        } else {
            throw AnonymousClass001.A0d();
        }
        Map map = (Map) obj3;
        C85524Gp r11 = communityMembersViewModel.A0M;
        do {
            value = r11.getValue();
            Map map2 = (Map) value;
            C84384Cd r32 = communityMembersViewModel.A07;
            r8 = communityMembersViewModel.A0K;
            Collection<C60842zG> values = map.values();
            C64623Eg r33 = (C64623Eg) r32;
            C162457s7.A0J(values, 1);
            LinkedHashMap A0r = C18320x8.A0r();
            C52882mC A00 = r33.A02.A0H.A00(r8);
            if (!(A00 == null || (A03 = AnonymousClass34R.A03(A00.A02)) == null)) {
                C620833k A01 = C56892sj.A01(r33.A08, A03);
                for (C60842zG r0 : values) {
                    UserJid userJid = r0.A03;
                    C60842zG A05 = A01.A05(userJid);
                    if (A05 != null) {
                        C162457s7.A0C(userJid);
                        AnonymousClass0x2.A1I(userJid, A0r, A05.A01);
                    }
                }
            }
            linkedHashMap = new LinkedHashMap(AnonymousClass8UG.A0I(map.size()));
            Iterator A16 = AnonymousClass0x9.A16(map);
            while (A16.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A16);
                Object key = A0w.getKey();
                AnonymousClass3ZH A07 = communityMembersViewModel.A0A.A07((C95814uZ) A0w.getKey());
                if (communityMembersViewModel.A04.A0a((C95814uZ) A0w.getKey())) {
                    str = communityMembersViewModel.A06.A00();
                } else if (A07 == null || (str = A07.A0X) == null) {
                    str = "";
                }
                C162457s7.A0H(str);
                Number A0p = AnonymousClass0x9.A0p(A0w.getKey(), A0r);
                if (A0p != null) {
                    i = A0p.intValue();
                } else {
                    i = -1;
                }
                AnonymousClass5QZ r02 = (AnonymousClass5QZ) map2.get(A0w.getKey());
                if (r02 != null) {
                    i2 = r02.A02;
                } else {
                    i2 = 0;
                }
                linkedHashMap.put(key, new AnonymousClass5QZ(A07, (UserJid) A0w.getKey(), str, ((C60842zG) A0w.getValue()).A01, i, i2));
            }
        } while (!r11.AzD(value, linkedHashMap));
        C85524Gp r34 = communityMembersViewModel.A0O;
        do {
            value2 = r34.getValue();
            PhoneUserJid A04 = C56972sr.A04(communityMembersViewModel.A04);
            if (A04 != null) {
                obj2 = ((Map) r11.getValue()).get(A04);
            } else {
                obj2 = null;
            }
        } while (!r34.AzD(value2, obj2));
        C85524Gp r35 = communityMembersViewModel.A0N;
        do {
            value3 = r35.getValue();
            if (communityMembersViewModel.A0E.A0D(r8)) {
                num = Integer.valueOf(((Map) r11.getValue()).size());
            } else {
                num = null;
            }
        } while (!r35.AzD(value3, new C104485Rd(1, num)));
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CommunityMembersViewModel$refreshCommunityMembers$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CommunityMembersViewModel$refreshCommunityMembers$1(this.this$0, (C84814Du) obj2));
    }
}
