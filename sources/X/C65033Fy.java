package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Fy  reason: invalid class name and case insensitive filesystem */
public final class C65033Fy implements AnonymousClass664 {
    public final AnonymousClass2YL A00;
    public final AnonymousClass2LC A01;
    public final AnonymousClass2YM A02;
    public final AnonymousClass1k9 A03;
    public final AnonymousClass1kA A04;

    public void BQV() {
        if (this.A00.A01.A0Y(C58422vE.A02, 3981)) {
            AnonymousClass1k9 r7 = this.A03;
            List A022 = r7.A02();
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : A022) {
                C54692p8 r12 = (C54692p8) next;
                AnonymousClass2LC r2 = this.A01;
                C162457s7.A0H(r12);
                C162457s7.A0J(r12, 0);
                if (r12.A02.ordinal() == 0) {
                    AnonymousClass2YL r22 = r2.A01;
                    int A002 = r22.A00("dc_days_delay", 7);
                    int A003 = r22.A00("dc_days_length", 2);
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    long millis = timeUnit.toMillis((long) A002);
                    if (System.currentTimeMillis() > r12.A00 + millis + timeUnit.toMillis((long) A003)) {
                        A0s.add(next);
                    }
                } else {
                    throw C73153f1.A00();
                }
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                r7.A03(((C54692p8) it.next()).A03);
            }
            AnonymousClass1kA r5 = this.A04;
            List A023 = r5.A02();
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (Object next2 : A023) {
                C53212mj r3 = (C53212mj) next2;
                AnonymousClass2YM r0 = this.A02;
                C18280x3.A12(r3);
                if (System.currentTimeMillis() > r3.A00 + TimeUnit.DAYS.toMillis((long) r0.A01.A00("survey_expiry_days", 30))) {
                    A0s2.add(next2);
                }
            }
            Iterator it2 = A0s2.iterator();
            while (it2.hasNext()) {
                r5.A03(((C53212mj) it2.next()).A02);
            }
        }
    }

    public C65033Fy(AnonymousClass2YL r1, AnonymousClass2LC r2, AnonymousClass2YM r3, AnonymousClass1k9 r4, AnonymousClass1kA r5) {
        C18260x0.A0e(r5, r3, r4, r2);
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public String BDW() {
        return "BizIntegritySurveyCleanupDailyCronJob";
    }
}
