package X;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.2r9  reason: invalid class name and case insensitive filesystem */
public final class C55932r9 {
    public final C69263Wi A00;
    public final AnonymousClass4FS A01;
    public final C29161iN A02;
    public final C104745Se A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;
    public final C183538qC A0C;

    public final void A01(C624134x r6) {
        if (r6 instanceof C30721mu) {
            C106245Ye.A00("XFamilyCrosspostRequestSessionManager/handleNewAutoShareRecordCreation skip for audio status");
            return;
        }
        C106245Ye.A00("XFamilyCrosspostRequestSessionManager/handleNewAutoShareRecordCreation start new record creation");
        ((AnonymousClass30J) this.A0B.get()).A03((String) null, 0, r6.A1L);
    }

    public final void A02(C30481mW r4) {
        C162457s7.A0J(r4, 0);
        if (this.A03.A01.A0Y(C58422vE.A02, 4437)) {
            A01(r4);
            ((C49972hP) this.A0A.get()).A01(r4);
        }
    }

    public final void A00(Context context, C84984Em r8, String str, List list) {
        String str2;
        C108895dj r0;
        C106245Ye.A00("XFamilyCrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest started");
        C183538qC r4 = this.A0B;
        AnonymousClass30J r3 = (AnonymousClass30J) r4.get();
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0c, it);
        }
        Map A012 = r3.A01(A0c);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C53142mc r02 = (C53142mc) C18280x3.A0W(A012, C18300x5.A0T(it2).A1L);
            if (r02 != null) {
                r0 = r02.A02;
            } else {
                r0 = null;
            }
            A0s.add(r0);
        }
        if (this.A03.A01.A0Y(C58422vE.A02, 4437)) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (Object next : list) {
                if (next instanceof C30481mW) {
                    A0s2.add(next);
                }
            }
            if (!A0s2.isEmpty()) {
                C183538qC r42 = this.A0A;
                C49972hP r2 = (C49972hP) r42.get();
                Iterator it3 = A0s2.iterator();
                while (it3.hasNext()) {
                    r2.A00(context, (C30481mW) it3.next());
                }
                C49972hP r22 = (C49972hP) r42.get();
                Iterator it4 = A0s2.iterator();
                while (it4.hasNext()) {
                    r22.A01((C30481mW) it4.next());
                }
                str2 = "XFamilyCrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest with text status success";
                C106245Ye.A00(str2);
                ((C47152cn) this.A06.get()).A00(r8, str, list, A0s);
            }
        } else if (!A05(context, list)) {
            ArrayList A0c2 = C73783g4.A0c(list);
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                C624134x.A0Z(A0c2, it5);
            }
            AnonymousClass36X.A05(this.A00, this.A02, r4, A0c2);
            C106245Ye.A02("XFamilyCrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest status burning fails", (Throwable) null);
            C626936e.A0D(false, "XFamilyCrosspostRequestSessionManager/status burning fails");
            r8.BRz(-16, (Integer) null);
            return;
        }
        str2 = "XFamilyCrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest success";
        C106245Ye.A00(str2);
        ((C47152cn) this.A06.get()).A00(r8, str, list, A0s);
    }

    public final void A03(C54262oR r29, C52732lx r30, C53872no r31) {
        String str;
        File file;
        long j;
        int i;
        C135606kw r5;
        C106245Ye.A00("XFamilyCrosspostRequestSessionManager/handleMediaUploadAndCrosspost started");
        C52732lx r13 = r30;
        AnonymousClass2PN r3 = new AnonymousClass2PN(r29, this, r13);
        C43832Tq r11 = (C43832Tq) this.A07.get();
        C626936e.A00();
        C129586aY r2 = r13.A00;
        C46902cO r10 = new C46902cO(new AnonymousClass2PO(r3, r13, r11), r2.size());
        C172878Nf it = r2.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            C53142mc r0 = (C53142mc) C18280x3.A0W(r13.A02, A0T.A1L);
            if (r0 != null) {
                str = r0.A04;
            } else {
                str = null;
            }
            C49322gL r9 = new C49322gL(r13, r10, r11);
            boolean z = A0T instanceof C30481mW;
            if (z || (A0T instanceof C30471mV)) {
                String A002 = r11.A03.A00(str, true);
                if (A002 == null || A002.length() == 0) {
                    if (!z) {
                        AnonymousClass33C r02 = ((C30471mV) A0T).A01;
                        if (r02 == null) {
                            r9.A01((Integer) null, -8, A0T.A1L);
                        } else {
                            file = r02.A0F;
                        }
                    } else if (str == null || str.length() == 0) {
                        C626936e.A0D(false, "invalid mediaFilePath for textStatus");
                        j = A0T.A1L;
                        i = -7;
                    } else {
                        file = C64393Dh.A00(r11.A00, str);
                    }
                    if (file == null || !file.exists()) {
                        if (!A0T.A1N) {
                            C626936e.A0D(false, "media file does not exist");
                        }
                        j = A0T.A1L;
                        i = -9;
                    } else {
                        C633138t A012 = AnonymousClass36O.A01((C95814uZ) null, A0T.A1I, 8);
                        C162457s7.A0D(A012);
                        long j2 = A0T.A1L;
                        C157497iO r6 = new C157497iO(false, false, true);
                        Uri fromFile = Uri.fromFile(file);
                        if (A012 == C633138t.A0m) {
                            r5 = new C135606kw(r11.A02);
                        } else {
                            r5 = null;
                        }
                        C53872no r12 = r31;
                        byte[] bArr = r12.A00;
                        C626936e.A06(bArr);
                        AnonymousClass32J A003 = AnonymousClass32J.A00(fromFile, new AnonymousClass32B(bArr, 1), r5, r6, A012, (AnonymousClass330) null, (String) null, 0, true, false, true);
                        C620033c r22 = r11.A04;
                        byte[] bArr2 = new byte[24];
                        new SecureRandom().nextBytes(bArr2);
                        AnonymousClass3QO A022 = r22.A02(new AnonymousClass3GF(r12, bArr2), A003, true);
                        A022.A0W = "mms";
                        A022.A04(new C86204Jf(A022, r9, r11, 1, j2), (Executor) null);
                        r11.A0A.put(Long.valueOf(j2), A022);
                        r11.A05.BkM(new C70163a3(A022, 6, r11));
                    }
                } else {
                    r9.A00(A0T.A1L, A002);
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("invalid status type ");
                A0o.append(A0T);
                C18270x1.A0z(A0o);
                j = A0T.A1L;
                i = -6;
            }
            r9.A01((Integer) null, i, j);
        }
    }

    public final boolean A05(Context context, List list) {
        String name;
        boolean z = context instanceof Application;
        if (z) {
            C626936e.A0D(false, "XFamilyCrosspostRequestSessionManager/application context was passed for text status burning");
            C106245Ye.A02("XFamilyCrosspostRequestSessionManager/processTextStatusBurning application context was passed in for burning text status", (Throwable) null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (A0T instanceof C30481mW) {
                C45522a9 r1 = (C45522a9) this.A05.get();
                C30481mW r2 = (C30481mW) A0T;
                C162457s7.A0J(r2, 1);
                if (z) {
                    C626936e.A0D(false, "Application context was passed in for burning");
                } else {
                    File A002 = r1.A01.A00(r2, C100715Bz.A00(context, (AnonymousClass67B) null, r2));
                    if (!(A002 == null || (name = A002.getName()) == null)) {
                        long j = r2.A1L;
                        ContentValues A062 = AnonymousClass0x9.A06();
                        A062.put("media_path", name);
                        ((AnonymousClass30J) this.A0B.get()).A02(A062, C18280x3.A0j(j));
                        C106245Ye.A00(C624134x.A0C(A0T, "XFamilyCrosspostRequestSessionManager/text status burning succeed for message: ", AnonymousClass001.A0o()));
                    }
                }
                C106245Ye.A02(C624134x.A0C(A0T, "XFamilyCrosspostRequestSessionManager/text status burning failed for message: ", AnonymousClass001.A0o()), (Throwable) null);
                return false;
            }
        }
        return true;
    }

    public C55932r9(C69263Wi r1, AnonymousClass4FS r2, C29161iN r3, C104745Se r4, C183538qC r5, C183538qC r6, C183538qC r7, C183538qC r8, C183538qC r9, C183538qC r10, C183538qC r11, C183538qC r12, C183538qC r13) {
        C18260x0.A0f(r1, r2, r4, r3, r5);
        C18260x0.A0g(r6, r7, r8, r9, r10);
        C18260x0.A0Y(r11, r12, r13);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A0B = r5;
        this.A08 = r6;
        this.A05 = r7;
        this.A0C = r8;
        this.A06 = r9;
        this.A07 = r10;
        this.A04 = r11;
        this.A09 = r12;
        this.A0A = r13;
    }

    public final void A04(List list, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestSessionManager/handleNewStatusInPreviousAppSessionAutoShareCrosspost started for messages: ");
        List list2 = list;
        ArrayList A0d = C73783g4.A0d(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0d, it);
        }
        C106245Ye.A00(AnonymousClass000.A0R(A0d, A0o));
        String A022 = AnonymousClass36X.A02();
        C18270x1.A0j(((AnonymousClass2ZB) this.A09.get()).A00().edit(), "pref_debug_session_id", A022);
        ((C48582f8) this.A0C.get()).A00(A022);
        AnonymousClass30J r3 = (AnonymousClass30J) this.A0B.get();
        ArrayList A0d2 = C73783g4.A0d(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C624134x.A0Z(A0d2, it2);
        }
        ContentValues A062 = AnonymousClass0x9.A06();
        C18270x1.A0b(A062, "state", 1);
        A062.put("crossposting_session_id", A022);
        C54592oy r0 = r3.A01;
        r0.A01();
        r0.A02(A0d2, 1);
        r3.A02(A062, A0d2);
        ((C47152cn) this.A06.get()).A00(new AnonymousClass3YQ(new C36611zb(this, Boolean.valueOf(z), A022, list2, true), this, A022), A022, list, (List) null);
    }
}
