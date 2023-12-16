package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.2qW  reason: invalid class name and case insensitive filesystem */
public final class C55542qW {
    public final C69263Wi A00;
    public final AnonymousClass4FS A01;
    public final C29121iJ A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;

    public final void A01(C624134x r7, List list) {
        if (r7 instanceof C30721mu) {
            AnonymousClass356.A01("CrosspostRequestSessionManager/handleNewAutoShareRecordCreation skip for audio status");
            return;
        }
        AnonymousClass356.A01("CrosspostRequestSessionManager/handleNewAutoShareRecordCreation start new record creation");
        ((C55202py) this.A09.get()).A03((String) null, list, 0, r7.A1L);
    }

    public final void A00(Context context, C84954Ej r11, String str, List list, List list2, int i) {
        String str2;
        AnonymousClass356.A01("CrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest started");
        List list3 = list;
        List list4 = list2;
        List A032 = C626736a.A03((C55202py) C18300x5.A0b(this.A09), list, list2);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            if (next instanceof C30481mW) {
                A0s.add(next);
            }
        }
        if (A0s.isEmpty()) {
            str2 = "CrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest success";
        } else {
            C183538qC r3 = this.A07;
            C49962hO r2 = (C49962hO) r3.get();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                r2.A00(context, (C30481mW) it.next(), list2);
            }
            C49962hO r22 = (C49962hO) r3.get();
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                r22.A01((C30481mW) it2.next());
            }
            str2 = "CrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest with text status success";
        }
        AnonymousClass356.A01(str2);
        ((C47272cz) this.A03.get()).A00(r11, str, list3, A032, list4, i);
    }

    public final void A02(C54362ob r29, C53572nJ r30, C53862nn r31) {
        String str;
        File file;
        long j;
        int i;
        C135606kw r5;
        AnonymousClass356.A01("CrosspostRequestSessionManager/handleMediaUploadAndCrosspost started");
        C53572nJ r13 = r30;
        AnonymousClass2PE r3 = new AnonymousClass2PE(r29, this, r13);
        C43902Tx r11 = (C43902Tx) this.A04.get();
        C626936e.A00();
        C129586aY r2 = r13.A02;
        C46872cL r10 = new C46872cL(new AnonymousClass2PG(r3, r13, r11), r2.size());
        C172878Nf it = r2.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            Map map = r13.A05;
            C53342mw r0 = (C53342mw) C18280x3.A0W(map, A0T.A1L);
            String str2 = null;
            if (r0 != null) {
                str = r0.A01;
            } else {
                str = null;
            }
            C53342mw r02 = (C53342mw) C18280x3.A0W(map, A0T.A1L);
            if (r02 != null) {
                str2 = r02.A02;
            }
            C49302gJ r9 = new C49302gJ(r13, r10, r11);
            boolean z = A0T instanceof C30481mW;
            if (z || (A0T instanceof C30471mV)) {
                String A002 = r11.A04.A00(str, true);
                if (A002 == null || A002.length() == 0) {
                    if (!z) {
                        AnonymousClass33C r03 = ((C30471mV) A0T).A01;
                        if (r03 == null) {
                            j = A0T.A1L;
                            i = -8;
                        } else {
                            file = r03.A0F;
                        }
                    } else if (str2 == null || str2.length() == 0) {
                        C626936e.A0D(false, "invalid mediaFilePath for textStatus");
                        j = A0T.A1L;
                        i = -7;
                    } else {
                        file = C64393Dh.A00(r11.A01, str2);
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
                            r5 = new C135606kw(r11.A03);
                        } else {
                            r5 = null;
                        }
                        C53862nn r12 = r31;
                        byte[] bArr = r12.A00;
                        C626936e.A06(bArr);
                        AnonymousClass32J A003 = AnonymousClass32J.A00(fromFile, new AnonymousClass32B(bArr, 1), r5, r6, A012, (AnonymousClass330) null, (String) null, 0, true, false, true);
                        C620033c r22 = r11.A05;
                        byte[] bArr2 = new byte[24];
                        new SecureRandom().nextBytes(bArr2);
                        AnonymousClass3QO A022 = r22.A02(new AnonymousClass3GG(r12, r11, bArr2), A003, true);
                        A022.A0W = "mms";
                        A022.A04(new C86204Jf(A022, r9, r11, 0, j2), (Executor) null);
                        r11.A0B.put(Long.valueOf(j2), A022);
                        r11.A06.BkM(new C70153a2(r11, 36, A022));
                    }
                } else {
                    r9.A01(A0T.A1L, A002);
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("invalid status type ");
                A0o.append(A0T);
                C18270x1.A0z(A0o);
                j = A0T.A1L;
                i = -6;
            }
            r9.A00(i, j);
        }
    }

    public C55542qW(C69263Wi r1, AnonymousClass4FS r2, C29121iJ r3, C183538qC r4, C183538qC r5, C183538qC r6, C183538qC r7, C183538qC r8, C183538qC r9, C183538qC r10) {
        C18260x0.A0f(r1, r2, r3, r4, r5);
        C18260x0.A0g(r6, r7, r8, r9, r10);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A09 = r4;
        this.A06 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A08 = r8;
        this.A05 = r9;
        this.A07 = r10;
    }

    public final void A03(List list, List list2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestSessionManager/handleNewStatusInPreviousAppSessionAutoShareCrosspost started for messages: ");
        List list3 = list;
        ArrayList A0d = C73783g4.A0d(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0d, it);
        }
        AnonymousClass356.A01(AnonymousClass000.A0R(A0d, A0o));
        String A012 = C626736a.A01();
        ((C48612fB) this.A08.get()).A00(A012);
        ArrayList A0d2 = C73783g4.A0d(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C624134x.A0Z(A0d2, it2);
        }
        List list4 = list2;
        C626736a.A05(this.A00, this.A02, this.A09, A012, A0d2, list4);
        ((C47272cz) this.A03.get()).A00(new C69563Xn(new C34491vF((C103515Ng) this.A05.get()), this, A012, list), A012, list3, (List) null, list4, 10);
    }
}
