package X;

import android.app.Application;
import android.os.Handler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.4U1  reason: invalid class name */
public class AnonymousClass4U1 extends AnonymousClass08N implements C181938nb {
    public int A00;
    public C147097Cu A01 = new C147097Cu(this);
    public C109065e1 A02;
    public Runnable A03;
    public final Handler A04;
    public final AnonymousClass08J A05;
    public final AnonymousClass08M A06 = AnonymousClass08M.A01();
    public final AnonymousClass0XV A07;
    public final AnonymousClass5MC A08;
    public final C69263Wi A09;
    public final AnonymousClass5ML A0A;
    public final C103765Oi A0B;
    public final AnonymousClass7P9 A0C;
    public final AnonymousClass5QU A0D;
    public final AnonymousClass1VX A0E;
    public final C104795Sj A0F;
    public final AnonymousClass5ZI A0G;
    public final AnonymousClass5ZI A0H;
    public final AnonymousClass4UC A0I;
    public final String A0J;
    public final LinkedList A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4U1(Application application, AnonymousClass0XV r13, AnonymousClass7C5 r14, AnonymousClass5MC r15, C69263Wi r16, AnonymousClass5ML r17, C103765Oi r18, AnonymousClass5QU r19, AnonymousClass1VX r20, C104795Sj r21, String str, int i) {
        super(application);
        int i2 = i;
        AnonymousClass08J A0E2 = AnonymousClass4L0.A0E();
        this.A05 = A0E2;
        this.A0E = r20;
        this.A09 = r16;
        String str2 = str;
        this.A0J = str2;
        this.A07 = r13;
        C103765Oi r4 = r18;
        this.A0B = r4;
        this.A0D = r19;
        this.A04 = new Handler();
        this.A0K = AnonymousClass0x9.A18();
        this.A0I = AnonymousClass0x9.A0b();
        this.A0F = r21;
        C64333Db r0 = r14.A00.A04;
        AnonymousClass1VX A4B = C64333Db.A4B(r0);
        C107695bk r1 = r0.A00;
        AnonymousClass7P9 r5 = new AnonymousClass7P9((AnonymousClass5ML) r1.A1U.get(), (AnonymousClass2F5) r1.A1S.get(), A4B, (C104795Sj) r1.A1T.get(), str2);
        this.A0C = r5;
        this.A0A = r17;
        AnonymousClass6C6.A03(r5.A00, A0E2, this, 33);
        r4.A02 = this;
        r4.A01 = r5;
        if (!this.A0E.A0X(2806)) {
            i2 = 2;
        } else {
            AnonymousClass0XV r2 = this.A07;
            if (r2.A03.containsKey("arg_home_view_state")) {
                i2 = AnonymousClass001.A0K(r2.A04("arg_home_view_state"));
            }
        }
        this.A00 = i2;
        this.A08 = r15;
        AnonymousClass5ZI A002 = r15.A00(741488182);
        this.A0G = A002;
        this.A0H = r15.A00(741481818);
        A002.A08();
        A0D();
    }

    public void A0C() {
        C103765Oi r1 = this.A0B;
        r1.A02 = null;
        r1.A01 = null;
        r1.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r3 = r7.A0F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(java.lang.String r8) {
        /*
            r7 = this;
            X.5ZI r0 = r7.A0H
            r0.A08()
            java.util.LinkedList r4 = r7.A0K
            monitor-enter(r4)
            java.lang.String r5 = r8.trim()     // Catch:{ all -> 0x0089 }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0089 }
            if (r6 != 0) goto L_0x0029
            X.5ML r1 = r7.A0A     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r7.A0J     // Catch:{ all -> 0x0089 }
            boolean r0 = r1.A00(r0)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0029
            X.5Sj r3 = r7.A0F     // Catch:{ all -> 0x0089 }
            java.lang.Integer r0 = r3.A00     // Catch:{ all -> 0x0089 }
            r2 = 3
            if (r0 == 0) goto L_0x002d
            int r0 = r0.intValue()     // Catch:{ all -> 0x0089 }
            if (r0 != r2) goto L_0x002d
        L_0x0029:
            r4.add(r5)     // Catch:{ all -> 0x0089 }
            goto L_0x003c
        L_0x002d:
            X.4sa r1 = new X.4sa     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0089 }
            r1.A01 = r0     // Catch:{ all -> 0x0089 }
            r3.A02(r1)     // Catch:{ all -> 0x0089 }
            goto L_0x0029
        L_0x003c:
            if (r6 == 0) goto L_0x004e
            r4.clear()     // Catch:{ all -> 0x004c }
            android.os.Handler r1 = r7.A04     // Catch:{ all -> 0x004c }
            java.lang.Runnable r0 = r7.A03     // Catch:{ all -> 0x004c }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x004c }
            r7.A0D()     // Catch:{ all -> 0x004c }
            goto L_0x0087
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x004e:
            int r1 = r5.length()     // Catch:{ all -> 0x0089 }
            r0 = 2
            if (r1 < r0) goto L_0x0087
            android.os.Handler r3 = r7.A04     // Catch:{ all -> 0x0089 }
            java.lang.Runnable r2 = r7.A03     // Catch:{ all -> 0x0089 }
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x0089 }
            java.lang.Runnable r0 = r7.A03     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0065
            r3.removeCallbacks(r0)     // Catch:{ all -> 0x0089 }
        L_0x0065:
            r0 = 13
            X.3bv r2 = new X.3bv     // Catch:{ all -> 0x0089 }
            r2.<init>(r0, r5, r7)     // Catch:{ all -> 0x0089 }
            r7.A03 = r2     // Catch:{ all -> 0x0089 }
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x0089 }
            X.08J r3 = r7.A05     // Catch:{ all -> 0x0089 }
            r0 = 1
            X.6lz[] r2 = new X.C136186lz[r0]     // Catch:{ all -> 0x0089 }
            X.6lX r1 = new X.6lX     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0089 }
            java.util.ArrayList r0 = X.C162197rQ.newArrayList((java.lang.Object[]) r2)     // Catch:{ all -> 0x0089 }
            r3.A0G(r0)     // Catch:{ all -> 0x0089 }
        L_0x0087:
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4U1.A0E(java.lang.String):void");
    }

    public final void A0F(List list) {
        if (this.A00 == 1 && this.A0E.A0X(2806)) {
            list.add(0, new C136036lk(this.A01));
        }
        this.A05.A0G(list);
    }

    public void Baa(C135976le r2) {
        if (r2 instanceof C132496fR) {
            A0E(((C132496fR) r2).A00);
        } else if (r2 instanceof C132486fQ) {
            A0D();
        }
    }

    public final void A0D() {
        int length;
        JSONArray optJSONArray;
        LinkedList A18 = AnonymousClass0x9.A18();
        AnonymousClass1VX r5 = this.A0C.A04;
        if (r5.A0X(2948) || r5.A0X(2270) || !((optJSONArray = r5.A0S(4313).optJSONArray("featured_categories_modules")) == null || optJSONArray.length() == 0)) {
            ArrayList A0s = AnonymousClass001.A0s();
            if (r5.A0X(2948)) {
                A0s.add(new C136186lz(55));
                A0s.add(new C135866lN());
            }
            JSONArray optJSONArray2 = r5.A0S(4313).optJSONArray("featured_categories_modules");
            if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                int i = 0;
                while (true) {
                    JSONArray optJSONArray3 = r5.A0S(4313).optJSONArray("featured_categories_modules");
                    if (optJSONArray3 == null) {
                        length = 0;
                    } else {
                        length = optJSONArray3.length();
                    }
                    if (i >= length) {
                        break;
                    }
                    A0s.add(new C136186lz(55));
                    A0s.add(new C135866lN());
                    i++;
                }
            }
            if (r5.A0X(2270)) {
                A0s.add(new C136186lz(55));
                A0s.add(new AnonymousClass6lX());
            }
            A0F(A0s);
            C103765Oi r1 = this.A0B;
            AnonymousClass5ZI A002 = this.A08.A00(741488182);
            r1.A00();
            C101525Fc r2 = r1.A04;
            C59722xN r10 = r1.A06.A00;
            C107485bO r9 = new C107485bO(r1, 0);
            C64333Db r22 = r2.A00.A01;
            C55682qk A012 = C64333Db.A01(r22);
            AnonymousClass4FS A8y = C64333Db.A8y(r22);
            C620733j A2t = C64333Db.A2t(r22);
            C54292oU A2q = C64333Db.A2q(r22);
            C107695bk r0 = r22.A00;
            C96174vv r23 = new C96174vv(A012, r0.AIq(), A2q, C86624Kv.A0R(r22), A2t, C64333Db.A4B(r22), r9, r10, A002, (AnonymousClass5GZ) r0.A2w.get(), A8y);
            r23.A08();
            r1.A03 = r23;
            return;
        }
        if (this.A0A.A00(this.A0J)) {
            C104795Sj r24 = this.A0F;
            C95074sa r12 = new C95074sa();
            r12.A01 = AnonymousClass001.A0f();
            r24.A02(r12);
        }
        A18.add(new C135876lO());
        A18.add(new C135886lP());
        this.A05.A0G(A18);
    }
}
