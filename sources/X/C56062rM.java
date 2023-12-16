package X;

import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2rM  reason: invalid class name and case insensitive filesystem */
public class C56062rM {
    public final C61092zh A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final Map A02 = AnonymousClass0x9.A1D();
    public final Map A03 = AnonymousClass0x9.A1D();
    public volatile boolean A04;

    public void A04() {
        Cursor A012;
        StringBuilder sb;
        int i;
        if (!this.A04) {
            synchronized (this.A01) {
                if (!this.A04) {
                    C61092zh r0 = this.A00;
                    HashMap A0t = AnonymousClass001.A0t();
                    AnonymousClass4GK A0B = r0.A00.get();
                    try {
                        A012 = C56862sg.A01(((AnonymousClass3H0) A0B).A03, "SELECT subgroup_raw_jid, subject, subject_ts, group_type, relationship.parent_raw_jid FROM subgroup_info INNER JOIN group_relationship relationship ON subgroup_raw_jid = relationship.subgroup_raw_id", "GET_ALL_SUBGROUPS");
                        while (A012.moveToNext()) {
                            String A0Z = AnonymousClass0x2.A0Z(A012, "parent_raw_jid");
                            Set set = (Set) A0t.get(A0Z);
                            if (set == null) {
                                set = AnonymousClass002.A0K();
                                A0t.put(A0Z, set);
                            }
                            C52882mC A002 = C61092zh.A00(A012);
                            if (A002 != null) {
                                set.add(A002);
                            }
                        }
                        A012.close();
                        A0B.close();
                        Iterator A0u = AnonymousClass001.A0u(A0t);
                        while (A0u.hasNext()) {
                            Map.Entry A0w = AnonymousClass001.A0w(A0u);
                            C27991fJ A042 = AnonymousClass34R.A04(C18310x6.A0q(A0w));
                            if (A042 == null) {
                                if (A0w.getValue() == null) {
                                    i = 0;
                                } else {
                                    i = ((Set) A0w.getValue()).size();
                                }
                                sb = AnonymousClass001.A0o();
                                sb.append("Cache initialized with an empty parent, ");
                                sb.append(i);
                                sb.append(" subgroups not loaded");
                            } else {
                                Map map = this.A02;
                                C58612vX r6 = (C58612vX) map.get(A042);
                                if (r6 == null) {
                                    r6 = new C58612vX();
                                    map.put(A042, r6);
                                }
                                Set set2 = (Set) A0w.getValue();
                                if (set2 == null) {
                                    sb = AnonymousClass001.A0o();
                                    sb.append("Parent without any subgroups, jid=");
                                    sb.append(A042);
                                } else {
                                    Iterator it = set2.iterator();
                                    while (it.hasNext()) {
                                        C52882mC A0O = AnonymousClass0x7.A0O(it);
                                        int i2 = A0O.A00;
                                        if (i2 == 3) {
                                            r6.A00 = A0O;
                                        } else if (i2 == 6) {
                                            r6.A01 = A0O;
                                        }
                                        this.A03.put(A0O.A02, A042);
                                    }
                                    r6.A02.addAll(set2);
                                }
                            }
                            C18280x3.A13(sb);
                        }
                        this.A04 = true;
                    } catch (Throwable th) {
                        try {
                            A0B.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            return;
        }
        return;
        throw th;
    }

    public C56062rM(C61092zh r2) {
        this.A00 = r2;
    }

    public C52882mC A00(C27991fJ r2) {
        A04();
        C58612vX r0 = (C58612vX) this.A02.get(r2);
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    public List A01() {
        A04();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0v = AnonymousClass001.A0v(this.A02);
        while (A0v.hasNext()) {
            C52882mC r0 = ((C58612vX) A0v.next()).A00;
            if (r0 != null) {
                A0s.add(r0.A02);
            }
        }
        return A0s;
    }

    public Set A02(C15800rx r4, C27991fJ r5) {
        Set A032 = A03(r5);
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            if (!r4.Bqd(it.next())) {
                it.remove();
            }
        }
        return A032;
    }

    public Set A03(C27991fJ r3) {
        A04();
        HashSet A0K = AnonymousClass002.A0K();
        C58612vX r0 = (C58612vX) this.A02.get(r3);
        if (r0 != null) {
            A0K.addAll(r0.A02);
        }
        return A0K;
    }

    public void A05(C52882mC r4, C27991fJ r5) {
        A04();
        if (this.A00.A04(r5, Collections.singletonList(r4))) {
            Map map = this.A02;
            C58612vX r2 = (C58612vX) map.get(r5);
            if (r2 == null) {
                r2 = new C58612vX();
                map.put(r5, r2);
            }
            r2.A02.add(r4);
            int i = r4.A00;
            if (i == 3) {
                r2.A00 = r4;
            } else if (i == 6) {
                r2.A01 = r4;
            }
            this.A03.put(r4.A02, r5);
        }
    }

    public void A06(GroupJid groupJid) {
        C27991fJ r3;
        C58612vX r2;
        Object A0t;
        A04();
        if (this.A00.A01(groupJid) == 1 && (r3 = (C27991fJ) this.A03.remove(groupJid)) != null && (r2 = (C58612vX) this.A02.get(r3)) != null) {
            ArrayList A0J = AnonymousClass002.A0J(A02(new AnonymousClass4KD(groupJid, 4), r3));
            if (!A0J.isEmpty() && (A0t = AnonymousClass0x9.A0t(A0J)) != null) {
                r2.A02.remove(A0t);
            }
        }
    }
}
