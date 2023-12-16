package X;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.55o  reason: invalid class name and case insensitive filesystem */
public class C993955o extends AnonymousClass5ZM {
    public final int A00;
    public final C56962sq A01;
    public final C64773Ex A02;
    public final C56332ro A03;
    public final WeakReference A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long j;
        Cursor A032;
        String str;
        Cursor A033;
        Log.d("conversations/NuxLoadContactsTask: retrieving preferred contact list");
        AnonymousClass4MC r1 = this.A02;
        if (r1.isCancelled()) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        if (this.A07) {
            C64773Ex r0 = this.A02;
            boolean z = this.A06;
            AnonymousClass5UR A0R = r0.A05.A04.A0R();
            if (A0R == null) {
                Log.w("contact-mgr-db/wadbhelper/get-contact-nux-suggest-list cr=null");
            } else {
                if (z) {
                    str = "times_contacted!=0";
                } else {
                    str = null;
                }
                try {
                    A033 = A0R.A03(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"raw_contact_id"}, str, (String[]) null, "times_contacted DESC LIMIT 100");
                    if (A033 != null) {
                        int columnIndexOrThrow = A033.getColumnIndexOrThrow("raw_contact_id");
                        HashSet A0K = AnonymousClass002.A0K();
                        while (A033.moveToNext()) {
                            Long A0T = C18280x3.A0T(A033, columnIndexOrThrow);
                            if (A0K.add(A0T)) {
                                A0s.add(A0T);
                            }
                        }
                        A033.close();
                    }
                } catch (Exception e) {
                    Log.e("contact-mgr-db/unable to query the phone book for frequent contacts sorted by TIMES_CONTACTED", e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        if (r1.isCancelled()) {
            return null;
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (this.A06) {
            AnonymousClass5UR A0R2 = this.A02.A05.A04.A0R();
            if (A0R2 == null) {
                Log.w("contact-mgr-db/wadbhelper/get-contact-nux-suggest-list cr=null");
            } else {
                try {
                    A032 = A0R2.A03(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"raw_contact_id"}, "starred=1", (String[]) null, (String) null);
                    if (A032 != null) {
                        int columnIndexOrThrow2 = A032.getColumnIndexOrThrow("raw_contact_id");
                        HashSet A0K2 = AnonymousClass002.A0K();
                        while (A032.moveToNext()) {
                            Long A0T2 = C18280x3.A0T(A032, columnIndexOrThrow2);
                            if (A0K2.add(A0T2)) {
                                A0s2.add(A0T2);
                            }
                        }
                        A032.close();
                    }
                } catch (Exception e2) {
                    Log.e("contact-mgr-db/unable to query the phone book for favorited contacts", e2);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        if (r1.isCancelled()) {
            return null;
        }
        ArrayList A0s3 = AnonymousClass001.A0s();
        this.A02.A0b(A0s3);
        Iterator it = A0s3.iterator();
        while (it.hasNext()) {
            if (C627336j.A0L(C86604Kt.A0b(it))) {
                it.remove();
            }
        }
        A0G(A0s3);
        if (r1.isCancelled()) {
            return null;
        }
        ArrayList A0s4 = AnonymousClass001.A0s();
        int i = 0;
        if (A0s.isEmpty() && A0s2.isEmpty()) {
            Iterator it2 = A0s3.iterator();
            while (it2.hasNext()) {
                AnonymousClass3ZH A0R3 = C18310x6.A0R(it2);
                if (i >= this.A00) {
                    break;
                } else if (!this.A05 || this.A03.A07(A0R3)) {
                    A0s4.add(A0R3);
                    i++;
                }
            }
        } else {
            C10550i7 r2 = new C10550i7();
            Iterator it3 = A0s3.iterator();
            while (it3.hasNext()) {
                AnonymousClass3ZH A0R4 = C18310x6.A0R(it3);
                C51602k5 r02 = A0R4.A0F;
                if (r02 == null) {
                    j = 0;
                } else {
                    j = r02.A00;
                }
                r2.A0A(j, A0R4);
            }
            HashSet A0K3 = AnonymousClass002.A0K();
            Iterator it4 = A0s.iterator();
            while (it4.hasNext()) {
                Number number = (Number) it4.next();
                if (i >= this.A00) {
                    break;
                }
                AnonymousClass3ZH r12 = (AnonymousClass3ZH) r2.A05(number.longValue(), (Object) null);
                if (r12 != null && (!this.A05 || this.A03.A07(r12))) {
                    r12.A0n = true;
                    A0s4.add(r12);
                    A0K3.add(r12);
                    i++;
                }
            }
            Iterator it5 = A0s2.iterator();
            while (it5.hasNext()) {
                Number number2 = (Number) it5.next();
                if (i >= this.A00) {
                    break;
                }
                AnonymousClass3ZH r13 = (AnonymousClass3ZH) r2.A05(number2.longValue(), (Object) null);
                if (r13 != null && (!this.A05 || this.A03.A07(r13))) {
                    r13.A0m = true;
                    A0s4.add(r13);
                    A0K3.add(r13);
                    i++;
                }
            }
            Iterator it6 = A0s3.iterator();
            while (it6.hasNext()) {
                AnonymousClass3ZH A0R5 = C18310x6.A0R(it6);
                if (i >= this.A00) {
                    break;
                } else if ((!this.A05 || this.A03.A07(A0R5)) && A0K3.add(A0R5)) {
                    A0s4.add(A0R5);
                    i++;
                }
            }
        }
        Iterator it7 = A0s4.iterator();
        while (it7.hasNext()) {
            if (C627336j.A0L(C86604Kt.A0b(it7))) {
                it7.remove();
            }
        }
        A0G(A0s4);
        return AnonymousClass0x9.A0G(A0s4, A0s3);
        throw th;
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        ArrayList arrayList;
        ArrayList A0s;
        boolean z;
        C94104pu r3;
        int i;
        C94104pu r32;
        String quantityString;
        AnonymousClass0PJ r33 = (AnonymousClass0PJ) obj;
        C105295Ui r8 = (C105295Ui) this.A04.get();
        if (r8 != null) {
            r8.A00 = null;
            ConversationsFragment conversationsFragment = r8.A06;
            View view = conversationsFragment.A0B;
            C003203q A0Q = conversationsFragment.A0Q();
            if (view == null || A0Q == null || A0Q.isFinishing() || r33 == null) {
                Log.w("conversations/updateNuxView: NUX view cannot be updated");
                return;
            }
            Log.d("conversations/updateNuxView: Creating NUX view based on preferred contact list");
            ViewGroup A0J = C86644Kx.A0J(view, R.id.conversations_empty_nux);
            Object obj2 = r33.A00;
            if (obj2 == null) {
                arrayList = AnonymousClass001.A0s();
            } else {
                arrayList = (ArrayList) obj2;
            }
            Object obj3 = r33.A01;
            if (obj3 != null) {
                A0s = (ArrayList) obj3;
            } else {
                A0s = AnonymousClass001.A0s();
            }
            if (r8 instanceof C94224qQ) {
                C94224qQ r6 = (C94224qQ) r8;
                int size = arrayList.size();
                ArrayList A0s2 = AnonymousClass001.A0s();
                int i2 = size;
                for (int i3 = 0; i3 < size; i3++) {
                    AnonymousClass3ZH r14 = (AnonymousClass3ZH) arrayList.get(i3);
                    String escapeHtml = Html.escapeHtml(C18300x5.A0h(r6.A02, r14));
                    A0s2.add(escapeHtml);
                    ImageView A0F = AnonymousClass0x9.A0F(A0J, C94224qQ.A05[i3]);
                    r6.A03.A08(A0F, r14);
                    if (A0F != null) {
                        A0F.setVisibility(0);
                        A0F.setOnClickListener(r6.A00);
                        A0F.setContentDescription(escapeHtml);
                    }
                }
                while (true) {
                    int[] iArr = C94224qQ.A05;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    C86604Kt.A1A(A0J.findViewById(iArr[i2]));
                    i2++;
                }
                if (!r6.A01) {
                    int size2 = A0s.size() - Math.min(size, 3);
                    if (size2 > 0) {
                        if (size != 0) {
                            Resources resources = A0Q.getResources();
                            if (size == 1) {
                                Object[] objArr = new Object[2];
                                objArr[0] = A0s2.get(0);
                                AnonymousClass000.A1P(objArr, size2, 1);
                                quantityString = resources.getQuantityString(R.plurals.f9nameremoved, size2, objArr);
                            } else if (size != 2) {
                                Object[] objArr2 = new Object[4];
                                C18280x3.A1M(A0s2, objArr2);
                                objArr2[2] = A0s2.get(2);
                                AnonymousClass000.A1P(objArr2, size2, 3);
                                quantityString = resources.getQuantityString(R.plurals.f9nameremoved, size2, objArr2);
                            } else {
                                Object[] objArr3 = new Object[3];
                                C18280x3.A1M(A0s2, objArr3);
                                AnonymousClass000.A1P(objArr3, size2, 2);
                                quantityString = resources.getQuantityString(R.plurals.f9nameremoved, size2, objArr3);
                            }
                        }
                    } else if (size != 0) {
                        if (size == 1) {
                            quantityString = AnonymousClass002.A0F(A0Q, A0s2.get(0), new Object[1], 0, R.string.f11nameremoved);
                        } else if (size != 2) {
                            Object[] objArr4 = new Object[3];
                            C18280x3.A1M(A0s2, objArr4);
                            quantityString = AnonymousClass002.A0F(A0Q, A0s2.get(2), objArr4, 2, R.string.f11nameremoved);
                        } else {
                            Object[] objArr5 = new Object[2];
                            C18280x3.A1M(A0s2, objArr5);
                            quantityString = A0Q.getString(R.string.f11nameremoved, objArr5);
                        }
                    }
                    quantityString = AnonymousClass0x2.A0Y(A0Q.getResources(), size2, 0, R.plurals.f9nameremoved);
                } else {
                    Resources resources2 = A0Q.getResources();
                    int size3 = A0s.size();
                    Object[] objArr6 = new Object[1];
                    AnonymousClass000.A1P(objArr6, A0s.size(), 0);
                    quantityString = resources2.getQuantityString(R.plurals.f9nameremoved, size3, objArr6);
                }
                TextView A09 = AnonymousClass002.A09(A0J, R.id.prompt_text);
                if (A09 != null) {
                    C18280x3.A1E(quantityString, A09);
                    A09.setVisibility(0);
                    C18310x6.A18(A09, r6, 12);
                }
            } else {
                C94234qR r34 = (C94234qR) r8;
                if (r34 instanceof C94104pu) {
                    C94104pu r35 = (C94104pu) r34;
                    i = 1;
                    z = false;
                    r32 = r35;
                    if (!A0s.isEmpty()) {
                        AnonymousClass5UY r1 = r35.A09;
                        if (r1 != null) {
                            r1.A06(AnonymousClass001.A08(0));
                        }
                        r35.A05(A0Q, arrayList, A0s.size());
                        r3 = r35;
                        if (arrayList.size() > 1) {
                            r35.A02 = A0Q;
                            r35.A04 = A0s;
                            r35.A01 = A0J;
                            r35.A03 = arrayList;
                            AnonymousClass5JH r2 = new AnonymousClass5JH(r35, r35.A07, r35.A08, r35.A0A);
                            r2.A02.BkP(C117625sE.A00(r2, 24));
                        }
                        r3.A02(z);
                    }
                } else {
                    i = 1;
                    z = false;
                    r32 = r34;
                    if (!A0s.isEmpty()) {
                        AnonymousClass5UY r12 = r34.A09;
                        if (r12 != null) {
                            r12.A06(AnonymousClass001.A08(0));
                        }
                        r34.A05(A0Q, arrayList, A0s.size());
                        r3 = r34;
                        if (arrayList.size() > 1) {
                            r34.A04(A0J, A0Q, arrayList, A0s.size());
                        }
                        r3.A02(z);
                    }
                }
                AnonymousClass5UY r13 = r32.A09;
                r3 = r32;
                if (r13 != null) {
                    r13.A06(AnonymousClass001.A08(i));
                    ViewGroup viewGroup = (ViewGroup) r32.A09.A04();
                    r3 = r32;
                    if (viewGroup.getChildCount() == 0) {
                        ConversationsFragment conversationsFragment2 = r32.A06;
                        Context A1D = conversationsFragment2.A1D();
                        r3 = r32;
                        if (A1D != null) {
                            EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(A1D, z);
                            viewGroup.addView(emptyTellAFriendView);
                            emptyTellAFriendView.setInviteButtonClickListener(new C109475eg(conversationsFragment2, 45, A1D));
                            r3 = r32;
                        }
                    }
                }
                r3.A02(z);
            }
            r8.A01 = true;
        }
    }

    public C993955o(C56962sq r2, C64773Ex r3, C56332ro r4, C105295Ui r5, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A00 = i;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A02 = r3;
        this.A04 = AnonymousClass0x9.A14(r5);
        this.A03 = r4;
    }

    public final void A0G(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Jid A062 = AnonymousClass3ZH.A06(it);
            if (A062 != null && this.A01.A0d.contains(A062)) {
                it.remove();
            }
        }
    }
}
