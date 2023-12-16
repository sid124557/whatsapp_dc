package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.3Qd  reason: invalid class name and case insensitive filesystem */
public class C67653Qd implements AnonymousClass4DA {
    public final C41672Ld A00;
    public final AnonymousClass33X A01;

    public boolean BFA(Message message, int i) {
        String str;
        int i2;
        int i3;
        String A0Y;
        if (i != 216) {
            return false;
        }
        List<C622234e> list = (List) message.obj;
        if (list != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (C622234e r2 : list) {
                int i4 = r2.A02;
                if (i4 == 2 || i4 == 1) {
                    A0s.add(r2);
                } else if (i4 == 0) {
                    A0s2.add(r2);
                }
            }
            if (A0s2.size() > 0) {
                A0s2.size();
                AnonymousClass33X r22 = this.A01;
                C18260x0.A1B("UserNoticeManager/onUserNoticeListReceived/serverUserNoticeList size: ", AnonymousClass001.A0o(), A0s2);
                C55772qt r7 = r22.A05;
                TreeMap A03 = r7.A03();
                ArrayList A0s3 = AnonymousClass001.A0s();
                Iterator it = A0s2.iterator();
                while (it.hasNext()) {
                    C622234e r11 = (C622234e) it.next();
                    C622234e r15 = (C622234e) C18290x4.A0j(A03, r11.A01);
                    if (r15 == null) {
                        A0Y = "UserNoticeManager/getUpdatedUserNoticeList/new notice";
                    } else {
                        int i5 = r15.A00;
                        int i6 = r11.A00;
                        if (i5 < i6) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("UserNoticeManager/getUpdatedUserNoticeList/client stage is stale. client stage: ");
                            A0o.append(i5);
                            A0Y = AnonymousClass000.A0Y(" sever stage: ", A0o, i6);
                        } else {
                            int i7 = r15.A03;
                            int i8 = r11.A03;
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            if (i7 < i8) {
                                A0o2.append("UserNoticeManager/getUpdatedUserNoticeList/new version available. client version: ");
                                A0o2.append(i7);
                                C18260x0.A0y(" sever version: ", A0o2, i8);
                                r15 = new C622234e(r15.A01, r15.A00, i8, r15.A04, 0);
                            } else {
                                A0o2.append("UserNoticeManager/getUpdatedUserNoticeList/server stage is same or stale. client stage: ");
                                A0o2.append(i5);
                                C18260x0.A0y(" sever stage: ", A0o2, i6);
                            }
                            A0s3.add(r15);
                        }
                    }
                    Log.i(A0Y);
                    A0s3.add(r11);
                }
                r7.A05(A0s3);
                C622234e A02 = r7.A02();
                TreeMap A032 = r7.A03();
                if (A032.isEmpty()) {
                    Log.i("UserNoticeManager/getUpdatedCurrentUserNotice/notice map empty");
                } else {
                    Log.i("UserNoticeManager/getUpdatedCurrentUserNotice/found metadata");
                    Map.Entry firstEntry = A032.firstEntry();
                    C626936e.A06(firstEntry);
                    C622234e r6 = (C622234e) firstEntry.getValue();
                    if (r6 != null) {
                        r7.A04(r6);
                        if (A02 != null && ((i2 = A02.A01) != (i3 = r6.A01) || A02.A03 < r6.A03)) {
                            StringBuilder A0o3 = AnonymousClass001.A0o();
                            A0o3.append("UserNoticeManager/deleteUserNoticeContentIfNecessary/notice mismatch: ");
                            boolean z = true;
                            A0o3.append(AnonymousClass001.A1X(i2, i3));
                            A0o3.append(" old version: ");
                            if (A02.A03 >= r6.A03) {
                                z = false;
                            }
                            C18260x0.A1V(A0o3, z);
                            r22.A04.A04(i2);
                        }
                        C623034m r72 = r22.A04;
                        int i9 = r6.A03;
                        int i10 = r6.A01;
                        int i11 = r6.A00;
                        int i12 = 0;
                        if (i11 != 0) {
                            i12 = 1;
                            if (i11 != 1) {
                                i12 = 2;
                                if (i11 != 2) {
                                    i12 = 3;
                                    if (i11 != 3) {
                                        i12 = 4;
                                        if (i11 != 4) {
                                            i12 = 5;
                                            if (i11 != 5) {
                                                i12 = -1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        StringBuilder A0o4 = AnonymousClass001.A0o();
                        A0o4.append("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/notice id ");
                        A0o4.append(i10);
                        A0o4.append(" version: ");
                        A0o4.append(i9);
                        C18260x0.A0y(" stage: ", A0o4, i12);
                        if (i12 == 5) {
                            str = "UserNoticeContentManager/fetchUserNoticeContentIfNecessary/end stage, skip fetch";
                        } else {
                            AnonymousClass1VX r1 = r72.A05;
                            if (AnonymousClass31f.A00(r1, i10)) {
                                str = "UserNoticeContentManager/fetchUserNoticeContentIfNecessary/green alert disabled";
                            } else {
                                if (!AnonymousClass31f.A01(r1, r6) && !r72.A09(new String[]{"content.json"}, i10)) {
                                    Log.i("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/content does not exist, fetch");
                                    r72.A05(i10);
                                }
                                r22.A08(r72.A03(r6), r6);
                            }
                        }
                        Log.i(str);
                        r22.A08(r72.A03(r6), r6);
                    }
                }
                r22.A03();
                r22.A06();
            }
            if (A0s.size() > 0) {
                A0s.size();
                C41672Ld r62 = this.A00;
                HashMap A0t = AnonymousClass001.A0t();
                Iterator it2 = A0s.iterator();
                while (it2.hasNext()) {
                    C622234e r23 = (C622234e) it2.next();
                    Integer valueOf = Integer.valueOf(r23.A02);
                    List list2 = (List) A0t.get(valueOf);
                    if (list2 == null) {
                        A0t.put(valueOf, C18300x5.A0s(r23));
                    } else {
                        list2.add(r23);
                    }
                }
                Iterator A0u = AnonymousClass001.A0u(A0t);
                while (A0u.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0u);
                    int A06 = C18280x3.A06(A0w);
                    List list3 = (List) A0w.getValue();
                    list3.size();
                    if (list3.size() > 0) {
                        r62.A01.execute(new C71713cY(r62, list3, A06, 9));
                    }
                }
            }
        }
        return true;
    }

    public C67653Qd(C41672Ld r1, AnonymousClass33X r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int[] B81() {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 216;
        return A0E;
    }
}
