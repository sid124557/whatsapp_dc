package X;

import android.net.Uri;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.55W  reason: invalid class name */
public class AnonymousClass55W extends AnonymousClass5ZM {
    public final C64773Ex A00;
    public final C620633i A01;
    public final C54292oU A02;
    public final C620733j A03;
    public final C55832qz A04;
    public final AnonymousClass5TD A05;
    public final AnonymousClass5JZ A06;
    public final WeakReference A07;

    public AnonymousClass55W(C64773Ex r2, C620633i r3, C54292oU r4, C620733j r5, C55832qz r6, AnonymousClass5TD r7, AnonymousClass5JZ r8, ViewSharedContactArrayActivity viewSharedContactArrayActivity) {
        super(viewSharedContactArrayActivity, true);
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = AnonymousClass0x9.A14(viewSharedContactArrayActivity);
        this.A06 = r8;
    }

    public static void A00(Object obj, AbstractCollection abstractCollection, C106705a1 r4, int i, int i2) {
        abstractCollection.add(new AnonymousClass7NE(obj, r4.A0A.A08, i, i2));
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C106705a1 r2;
        List list;
        List list2;
        List A022;
        AnonymousClass5JZ r22 = this.A06;
        AnonymousClass2z0 r1 = r22.A01;
        if (r1 != null) {
            C624134x A052 = this.A04.A05(r1);
            if (A052 == null) {
                return null;
            }
            C54292oU r5 = this.A02;
            AnonymousClass5TD r12 = this.A05;
            C64773Ex r4 = this.A00;
            C620633i r3 = this.A01;
            C620733j r23 = this.A03;
            if (A052 instanceof C30421mQ) {
                C42032Mn A032 = new AnonymousClass5Y4(r4, r3, r5, r23).A03((C30421mQ) A052);
                if (A032 != null) {
                    return Collections.singletonList(A032);
                }
                return null;
            } else if (A052 instanceof C30411mP) {
                AnonymousClass5Y4 r13 = new AnonymousClass5Y4(r4, r3, r5, r23);
                C30411mP r7 = (C30411mP) A052;
                List list3 = r7.A02;
                if (list3 != null) {
                    return list3;
                }
                List A012 = r13.A01(r7.A1v());
                r7.A02 = A012;
                return A012;
            } else if (!AnonymousClass31H.A02(A052) || (A022 = C615731j.A02(A052, r12)) == null) {
                return null;
            } else {
                return new AnonymousClass5Y4(r4, r3, r5, r23).A01(A022);
            }
        } else {
            List list4 = r22.A03;
            if (list4 != null) {
                return new AnonymousClass5Y4(this.A00, this.A01, this.A02, this.A03).A01(list4);
            }
            Uri uri = r22.A00;
            if (uri != null) {
                try {
                    AnonymousClass5TD r14 = this.A05;
                    return r14.A00(r14.A01(uri)).A02;
                } catch (C143696zK | IOException e) {
                    Log.e((Throwable) new C376923q(e));
                    return null;
                }
            } else {
                List<AnonymousClass38X> list5 = r22.A02;
                if (list5 == null) {
                    return null;
                }
                ArrayList A0s = AnonymousClass001.A0s();
                for (AnonymousClass38X r15 : list5) {
                    UserJid A08 = AnonymousClass32Y.A08(r15.A01);
                    C624134x A002 = C55122pp.A00(this.A04, r15.A00);
                    if (!(A08 == null || A002 == null)) {
                        List A023 = C615731j.A02(A002, this.A05);
                        if (A023 == null) {
                            list2 = Collections.emptyList();
                        } else {
                            ArrayList A0s2 = AnonymousClass001.A0s();
                            Iterator it = A023.iterator();
                            while (it.hasNext()) {
                                String A0m = AnonymousClass001.A0m(it);
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("waid=");
                                if (A0m.contains(AnonymousClass000.A0X(A08.user, A0o))) {
                                    try {
                                        AnonymousClass5Y4 r0 = new AnonymousClass5Y4(this.A00, this.A01, this.A02, this.A03);
                                        r0.A05(A0m);
                                        r2 = r0.A04;
                                    } catch (C143696zK e2) {
                                        Log.e("Failed to get contact from VCard.", e2);
                                        r2 = null;
                                    }
                                    if (!(r2 == null || (list = r2.A06) == null)) {
                                        Iterator it2 = list.iterator();
                                        while (it2.hasNext()) {
                                            if (A08.equals(AnonymousClass4L0.A0R(it2).A01)) {
                                                A0s2.add(new C42032Mn(A0m, r2));
                                            }
                                        }
                                    }
                                }
                            }
                            list2 = A0s2;
                        }
                        A0s.addAll(list2);
                    }
                }
                return A0s;
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass0R8 A0R;
        int i;
        int i2;
        AnonymousClass3ZH A072;
        List<C42032Mn> list = (List) obj;
        ViewSharedContactArrayActivity viewSharedContactArrayActivity = (ViewSharedContactArrayActivity) this.A07.get();
        if (viewSharedContactArrayActivity != null) {
            viewSharedContactArrayActivity.BjL();
            if (list == null || list.isEmpty()) {
                Log.w("viewsharedcontactarrayactivity/oncreate/no vcards to display");
                viewSharedContactArrayActivity.A05.A0H(R.string.f11nameremoved, 0);
                viewSharedContactArrayActivity.finish();
                return;
            }
            HashSet A0K = AnonymousClass002.A0K();
            for (C42032Mn r0 : list) {
                C106705a1 r8 = r0.A01;
                String A032 = r8.A03();
                if (!A0K.contains(A032)) {
                    viewSharedContactArrayActivity.A0M.add(r8);
                    viewSharedContactArrayActivity.A0N.add(new SparseArray());
                    A0K.add(A032);
                } else if (r8.A06 != null) {
                    ArrayList arrayList = viewSharedContactArrayActivity.A0M;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C106705a1 r2 = (C106705a1) it.next();
                        if (r2.A03().equals(A032) && r2.A06 != null && r8.A06.size() > r2.A06.size()) {
                            arrayList.set(arrayList.indexOf(r2), r8);
                        }
                    }
                }
            }
            if (viewSharedContactArrayActivity.A0H == null) {
                Collections.sort(viewSharedContactArrayActivity.A0M, new C117755sR(viewSharedContactArrayActivity.A0A));
            }
            ImageView A0M = C86654Ky.A0M(viewSharedContactArrayActivity, R.id.send_btn);
            if (viewSharedContactArrayActivity.A0L) {
                A0M.setVisibility(0);
                C18270x1.A0d(viewSharedContactArrayActivity, A0M, viewSharedContactArrayActivity.A0A, R.drawable.input_send);
                int size = viewSharedContactArrayActivity.A0M.size();
                i = R.string.f11nameremoved;
                if (size == 1) {
                    i = R.string.f11nameremoved;
                }
                A0R = C86634Kw.A0R(viewSharedContactArrayActivity);
            } else {
                A0M.setVisibility(8);
                int size2 = list.size();
                A0R = C86634Kw.A0R(viewSharedContactArrayActivity);
                i = R.string.f11nameremoved;
                if (size2 == 1) {
                    i = R.string.f11nameremoved;
                }
            }
            A0R.A0B(i);
            RecyclerView recyclerView = (RecyclerView) viewSharedContactArrayActivity.findViewById(R.id.rvContacts);
            ArrayList arrayList2 = viewSharedContactArrayActivity.A0M;
            List list2 = viewSharedContactArrayActivity.A0H;
            ArrayList A0s = AnonymousClass001.A0s();
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                C106705a1 r13 = (C106705a1) arrayList2.get(i3);
                SparseArray sparseArray = (SparseArray) viewSharedContactArrayActivity.A0N.get(i3);
                A0s.add(new C147477El(r13));
                ArrayList A0s2 = AnonymousClass001.A0s();
                List list3 = r13.A06;
                if (list3 != null) {
                    Iterator it2 = list3.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        AnonymousClass7OD A0R2 = AnonymousClass4L0.A0R(it2);
                        if (A0R2.A01 == null) {
                            A0s2.add(A0R2);
                        } else {
                            A00(A0R2, A0s, r13, i3, i2);
                            ViewSharedContactArrayActivity.A0C(sparseArray, i2).A00 = A0R2;
                            i2++;
                        }
                    }
                } else {
                    i2 = 0;
                }
                List list4 = r13.A03;
                if (list4 != null) {
                    for (Object next : list4) {
                        A00(next, A0s, r13, i3, i2);
                        ViewSharedContactArrayActivity.A0C(sparseArray, i2).A00 = next;
                        i2++;
                    }
                }
                Iterator it3 = A0s2.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    A00(next2, A0s, r13, i3, i2);
                    ViewSharedContactArrayActivity.A0C(sparseArray, i2).A00 = next2;
                    i2++;
                }
                List list5 = r13.A07;
                if (list5 != null) {
                    for (Object next3 : list5) {
                        A00(next3, A0s, r13, i3, i2);
                        ViewSharedContactArrayActivity.A0C(sparseArray, i2).A00 = next3;
                        i2++;
                    }
                }
                C148447Ik r1 = r13.A09;
                if (r1.A01 != null) {
                    A00(r1, A0s, r13, i3, i2);
                    ViewSharedContactArrayActivity.A0C(sparseArray, i2).A00 = r13.A09;
                    i2++;
                }
                if (r13.A08 != null) {
                    ArrayList A0J = AnonymousClass002.A0J(r13.A08.keySet());
                    Collections.sort(A0J);
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    Iterator it4 = A0J.iterator();
                    while (it4.hasNext()) {
                        List<AnonymousClass5T6> list6 = (List) r13.A08.get(it4.next());
                        if (list6 != null) {
                            for (AnonymousClass5T6 r12 : list6) {
                                if (r12.A01.equals("URL")) {
                                    AnonymousClass0x2.A18(r12);
                                    Pattern pattern = viewSharedContactArrayActivity.A0I;
                                    if (pattern == null) {
                                        pattern = Pattern.compile("(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&amp;=]*)?");
                                        viewSharedContactArrayActivity.A0I = pattern;
                                    }
                                    if (C18280x3.A1X(r12.A02, pattern)) {
                                        A0s3.add(r12);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it5 = A0J.iterator();
                    while (it5.hasNext()) {
                        List<AnonymousClass5T6> list7 = (List) r13.A08.get(it5.next());
                        if (list7 != null) {
                            for (AnonymousClass5T6 r14 : list7) {
                                if (!r14.A01.equals("URL")) {
                                    AnonymousClass0x2.A18(r14);
                                    A0s3.add(r14);
                                }
                            }
                        }
                    }
                    Iterator it6 = A0s3.iterator();
                    while (it6.hasNext()) {
                        Object next4 = it6.next();
                        A00(next4, A0s, r13, i3, i2);
                        ViewSharedContactArrayActivity.A0C(sparseArray, i2).A00 = next4;
                        i2++;
                    }
                }
                if (list2 != null) {
                    AnonymousClass38X r15 = (AnonymousClass38X) list2.get(i3);
                    UserJid A08 = AnonymousClass32Y.A08(r15.A02);
                    if (!(A08 == null || (A072 = viewSharedContactArrayActivity.A03.A07(A08)) == null)) {
                        A0s.add(new AnonymousClass7NF(A072, A08, viewSharedContactArrayActivity, r15.A00));
                    }
                }
                A0s.add(new C147467Ek());
            }
            ((C147467Ek) A0s.get(AnonymousClass0x9.A03(A0s, 1))).A00 = true;
            recyclerView.setAdapter(new C87854Wj(viewSharedContactArrayActivity, A0s));
            C18320x8.A19(recyclerView, 1);
            C989753y.A00(A0M, viewSharedContactArrayActivity, 40);
        }
    }
}
