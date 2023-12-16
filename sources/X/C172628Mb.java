package X;

import android.app.PendingIntent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.8Mb  reason: invalid class name and case insensitive filesystem */
public abstract class C172628Mb implements Runnable {
    public final /* synthetic */ C1693989d A00;

    public /* synthetic */ C172628Mb(C1693989d r1) {
        this.A00 = r1;
    }

    public final void run() {
        C187678xd r1;
        Set A15;
        C1693989d r4 = this.A00;
        Lock lock = r4.A0K;
        lock.lock();
        try {
            if (!Thread.interrupted()) {
                AnonymousClass6R6 r8 = (AnonymousClass6R6) this;
                if (r8.A02 != 0) {
                    C1693989d r9 = (C1693989d) r8.A00;
                    C1694389h r11 = r9.A0F;
                    C127086Qo r7 = r11.A05;
                    AnonymousClass7P4 r12 = r9.A0G;
                    if (r12 == null) {
                        A15 = Collections.emptySet();
                    } else {
                        A15 = AnonymousClass0x9.A15(r12.A05);
                        Map map = r12.A04;
                        Iterator A0i = C18280x3.A0i(map);
                        while (A0i.hasNext()) {
                            C148727Jm r2 = (C148727Jm) A0i.next();
                            if (!r11.A0A.containsKey(r2.A01)) {
                                map.get(r2);
                                throw AnonymousClass001.A0g("zaa");
                            }
                        }
                    }
                    r7.A03 = A15;
                    ArrayList arrayList = (ArrayList) r8.A01;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((C187688xe) arrayList.get(i)).BC3(r9.A04, r7.A03);
                    }
                } else {
                    C1693989d r5 = (C1693989d) r8.A00;
                    C157297i4 r72 = new C157297i4(r5.A0D);
                    ArrayList A0s = AnonymousClass001.A0s();
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    Map map2 = (Map) r8.A01;
                    Iterator A0i2 = C18280x3.A0i(map2);
                    while (A0i2.hasNext()) {
                        C187688xe r13 = (C187688xe) A0i2.next();
                        if (!r13.Bjr() || ((C1694789l) map2.get(r13)).A02) {
                            A0s2.add(r13);
                        } else {
                            A0s.add(r13);
                        }
                    }
                    int i2 = -1;
                    int i3 = 0;
                    if (A0s.isEmpty()) {
                        int size2 = A0s2.size();
                        while (true) {
                            if (i3 >= size2) {
                                break;
                            }
                            i2 = r72.A00(r5.A0B, (C187688xe) A0s2.get(i3));
                            i3++;
                            if (i2 == 0) {
                                break;
                            }
                        }
                        C127866Tp r14 = new C127866Tp(i2, (PendingIntent) null);
                        C1694389h r0 = r5.A0F;
                        AnonymousClass6C7.A10(r0.A06, new AnonymousClass6R9(r14, r8, r5), 1);
                    } else {
                        int size3 = A0s.size();
                        while (true) {
                            if (i3 < size3) {
                                i2 = r72.A00(r5.A0B, (C187688xe) A0s.get(i3));
                                i3++;
                                if (i2 != 0) {
                                    break;
                                }
                            } else if (i2 != 0) {
                            }
                        }
                        C127866Tp r142 = new C127866Tp(i2, (PendingIntent) null);
                        C1694389h r02 = r5.A0F;
                        AnonymousClass6C7.A10(r02.A06, new AnonymousClass6R9(r142, r8, r5), 1);
                    }
                    if (r5.A07 && (r1 = r5.A05) != null) {
                        C160847oP r15 = (C160847oP) r1;
                        r15.AzV(new C1694689k(r15));
                    }
                    Iterator A0i3 = C18280x3.A0i(map2);
                    while (A0i3.hasNext()) {
                        C187688xe r22 = (C187688xe) A0i3.next();
                        C180898lo r16 = (C180898lo) map2.get(r22);
                        if (!r22.Bjr() || r72.A00(r5.A0B, r22) == 0) {
                            r22.AzV(r16);
                        } else {
                            C1694389h r03 = r5.A0F;
                            AnonymousClass6C7.A10(r03.A06, new AnonymousClass6R8(r5, r16), 1);
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            AnonymousClass6C7.A10(r4.A0F.A06, e, 2);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
        lock.unlock();
    }
}
