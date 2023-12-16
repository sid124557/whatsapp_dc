package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Go  reason: invalid class name and case insensitive filesystem */
public class C171308Go implements C184398rj {
    public FileStash A00;
    public final C22331Mq A01;
    public final C160047mw A02;

    public final synchronized void A00() {
        Throwable th;
        if (!C615631i.A02() && this.A00 == null) {
            C160047mw r9 = this.A02;
            C151107Tl r2 = new C151107Tl();
            r2.A00 = 12582912;
            r2.A04 = true;
            C126316Nj A002 = r2.A00();
            C150257Px r1 = new C150257Px();
            r1.A04 = "wa_stash__gif_preview_cache";
            r1.A05 = null;
            C126306Ni r0 = C126306Ni.A00;
            r1.A03 = r0;
            r1.A01 = A002;
            r1.A02 = null;
            boolean z = r1.A08;
            boolean z2 = r1.A09;
            C151357Ul r3 = r1.A00;
            List list = r1.A07;
            String str = r1.A06;
            C157277i2 r4 = new C157277i2("wa_stash__gif_preview_cache");
            r4.A00(r0);
            if (A002 == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Config for ");
                A0o.append("wa_stash__gif_preview_cache");
                th = AnonymousClass000.A0F(" didn't specify an eviction config. Is this what you want?", A0o);
            } else {
                r4.A00(new C126326Nk(A002, (C126296Nh) null, "wa_stash__gif_preview_cache"));
                C126266Ne r5 = r9.A00;
                C147687Fg r22 = new C147687Fg();
                if (str != null) {
                    Map map = r22.A01;
                    if (map == null) {
                        map = AnonymousClass001.A0t();
                        r22.A01 = map;
                    }
                    map.put("__subdir__", str);
                }
                if (r3 != null) {
                    Map map2 = r22.A01;
                    if (map2 == null) {
                        map2 = AnonymousClass001.A0t();
                        r22.A01 = map2;
                    }
                    map2.put("__scope__", (Object) null);
                    r22.A00 = r3;
                }
                File A003 = r5.A00(new AnonymousClass7JI(r22), 111);
                C180598lK r12 = r9.A01;
                FileStash r6 = new C1683184y(r12, A003);
                if (z) {
                    FileStash r23 = new C126246Nc(RealtimeSinceBootClock.A00, r6);
                    AnonymousClass8MF.A01(r9, r23, ((C180578lI) r12).B7T(C141406vW.IDLE), 14);
                    r6 = r23;
                }
                if (z2) {
                    th = C18320x8.A0m();
                } else {
                    List emptyList = Collections.emptyList();
                    if ((list != null && !list.isEmpty()) || !emptyList.isEmpty()) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        if (list != null) {
                            A0s.addAll(list);
                        }
                        A0s.addAll(emptyList);
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        Iterator it = A0s.iterator();
                        if (it.hasNext()) {
                            it.next();
                            th = AnonymousClass001.A0g("getClass");
                        } else {
                            r6 = new C126236Nb(r6, A0s2);
                        }
                    }
                    C160047mw.A00(r6, r4);
                    C1443671g.A00(r5.A00, r4, A003);
                    this.A00 = r6;
                }
            }
            throw th;
        }
    }

    public C171308Go(AnonymousClass2VE r2, C160047mw r3) {
        this.A02 = r3;
        this.A01 = r2.A00(256);
    }

    public AnonymousClass2OC B3u(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C627236i.A04(str));
        String A0X = AnonymousClass000.A0X(".gif", A0o);
        A00();
        C22331Mq r7 = this.A01;
        AnonymousClass2OC A0A = r7.A0A(A0X);
        if (A0A != null) {
            return A0A;
        }
        if (C615631i.A02()) {
            return null;
        }
        FileStash fileStash = this.A00;
        C626936e.A06(fileStash);
        File file = fileStash.getFile(A0X);
        if (file == null || file.length() <= 0) {
            return A0A;
        }
        AnonymousClass2OC r6 = new AnonymousClass2OC(file.getPath(), C107085af.A04(file), str);
        r7.A09(A0X, r6);
        return r6;
    }

    public void Bhn(AnonymousClass2OC r3, String str) {
        A00();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C627236i.A04(str));
        this.A01.A09(AnonymousClass000.A0X(".gif", A0o), r3);
    }
}
