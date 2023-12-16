package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7mv  reason: invalid class name and case insensitive filesystem */
public class C160037mv {
    public final C192559Ko A00;
    public final C160047mw A01;

    public static /* synthetic */ C202279lh A00(C160037mv r20, int i, long j, long j2) {
        C160047mw r7 = r20.A01;
        C150257Px r9 = new C150257Px();
        r9.A04 = "<override-ignore>";
        r9.A08 = false;
        long j3 = j << 20;
        C126316Nj r12 = new C126316Nj(j3, j3, j3, false, false);
        r9.A01 = r12;
        C126296Nh r6 = new C126296Nh(((long) ((int) 28)) * 86400, false);
        r9.A02 = r6;
        C126306Ni r1 = r9.A03;
        boolean z = r9.A09;
        boolean z2 = r9.A0A;
        String str = r9.A05;
        C151357Ul r3 = r9.A00;
        List list = r9.A07;
        String str2 = r9.A06;
        if (r1 == null) {
            C150257Px r13 = new C150257Px();
            r13.A04 = "<override-ignore>";
            r13.A05 = str;
            r13.A08 = false;
            r13.A09 = z;
            r13.A0A = z2;
            r13.A00 = r3;
            r13.A03 = null;
            r13.A01 = r12;
            r13.A02 = r6;
            r13.A07 = list;
            r13.A06 = str2;
            int i2 = i;
            r13.A04 = C159257lW.A00(i2);
            r13.A05 = null;
            r13.A03 = C126306Ni.A00;
            r13.A01 = r12;
            r13.A02 = r6;
            C150087Pc r8 = new C150087Pc(r13);
            String str3 = r8.A04;
            C157277i2 r5 = new C157277i2(str3);
            r5.A00(r8.A03);
            C126316Nj r2 = r8.A01;
            if (r2 == null && r8.A02 == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Config for ");
                A0o.append(str3);
                throw AnonymousClass000.A0F(" didn't specify an eviction config. Is this what you want?", A0o);
            }
            r5.A00(new C126326Nk(r2, r8.A02, str3));
            C126266Ne r62 = r7.A00;
            C147687Fg r32 = new C147687Fg();
            String str4 = r8.A05;
            if (str4 != null) {
                Map map = r32.A01;
                if (map == null) {
                    map = AnonymousClass001.A0t();
                    r32.A01 = map;
                }
                map.put("__subdir__", str4);
            }
            C151357Ul r22 = r8.A00;
            if (r22 != null) {
                Map map2 = r32.A01;
                if (map2 == null) {
                    map2 = AnonymousClass001.A0t();
                    r32.A01 = map2;
                }
                map2.put("__scope__", (Object) null);
                r32.A00 = r22;
            }
            File A002 = r62.A00(new AnonymousClass7JI(r32), i2);
            C180598lK r14 = r7.A01;
            FileStash r33 = new C1683184y(r14, A002);
            if (r8.A07) {
                FileStash r23 = new C126246Nc(RealtimeSinceBootClock.A00, r33);
                AnonymousClass8MF.A01(r7, r23, ((C180578lI) r14).B7T(C141406vW.IDLE), 14);
                r33 = r23;
            }
            if (r8.A08) {
                throw C18320x8.A0m();
            }
            List emptyList = Collections.emptyList();
            List list2 = r8.A06;
            if ((list2 != null && !list2.isEmpty()) || !emptyList.isEmpty()) {
                ArrayList A0s = AnonymousClass001.A0s();
                if (list2 != null) {
                    A0s.addAll(list2);
                }
                A0s.addAll(emptyList);
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator it = A0s.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("getClass");
                }
                r33 = new C126236Nb(r33, A0s2);
            }
            C160047mw.A00(r33, r5);
            C1443671g.A00(r62.A00, r5, A002);
            return new C195549Yi(r33, new AtomicReference(), j2);
        }
        throw AnonymousClass001.A0c("Cannot override cache name or UserScopeConfig. Use CacheLike.builderForOverrides().");
    }

    public C160037mv(C192559Ko r1, C160047mw r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
