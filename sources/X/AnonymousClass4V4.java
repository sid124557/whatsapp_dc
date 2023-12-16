package X;

import android.text.format.Time;
import com.whatsapp.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4V4  reason: invalid class name */
public final class AnonymousClass4V4 extends C05550Ty {
    public AnonymousClass3ZH A00;
    public C141546vk A01 = C141546vk.BY_SOURCE;
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final AnonymousClass08M A04 = AnonymousClass08M.A01();
    public final C56942so A05;
    public final C64773Ex A06;
    public final AnonymousClass5ZU A07;
    public final C56612sH A08;
    public final C56982ss A09;
    public final C54442oj A0A;
    public final C56892sj A0B;
    public final AnonymousClass4FV A0C;
    public final AnonymousClass2RH A0D;
    public final C27991fJ A0E;
    public final AnonymousClass4UC A0F = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0G = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0H = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0I = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A0J;
    public final List A0K = AnonymousClass001.A0s();

    public static void A00(AbstractCollection abstractCollection, List list, Object[] objArr, int i) {
        abstractCollection.add(new AnonymousClass7YF(new C171378Gv(objArr, i), list));
    }

    public final void A0D(C171398Gx r6, boolean z) {
        C24881Zc r4 = new C24881Zc();
        C142636xW r0 = r6.A04;
        if (r0 != null) {
            int ordinal = r0.ordinal();
            int i = 5;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = 6;
                } else {
                    return;
                }
            }
            r4.A01 = Integer.valueOf(i);
            r4.A03 = C18310x6.A0f(this.A08.A0H(), r6.A01);
            r4.A02 = AnonymousClass0x9.A0m(r6.A00);
            r4.A00 = Boolean.valueOf(z);
            C27991fJ r1 = this.A0E;
            if (AnonymousClass34R.A06(r1.user)) {
                r4.A04 = r1.getRawString();
            }
            this.A0C.BhD(r4);
        }
    }

    public final void A0E(C141546vk r14) {
        AnonymousClass08M r1;
        int i;
        Object obj;
        int i2;
        Object[] objArr;
        this.A01 = r14;
        AnonymousClass3ZH r0 = this.A00;
        if (r0 == null || !r0.A13) {
            r1 = this.A03;
            i = R.string.f11nameremoved;
        } else {
            List<C171398Gx> list = this.A0K;
            if (list.isEmpty()) {
                r1 = this.A03;
                i = R.string.f11nameremoved;
            } else {
                if (r14.ordinal() != 1) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    A0s.add(C171408Gy.A00);
                    Integer num = null;
                    for (C171398Gx r7 : list) {
                        long j = r7.A05.A00;
                        Time time = new Time();
                        time.set(j);
                        int i3 = (int) ((j + (time.gmtoff * 1000)) / 86400000);
                        if (num != null) {
                            if (num.intValue() != i3) {
                                A0s.add(C171418Gz.A00);
                            } else {
                                A0s.add(r7);
                                num = Integer.valueOf(i3);
                            }
                        }
                        A0s.add(new C171368Gu(j));
                        A0s.add(r7);
                        num = Integer.valueOf(i3);
                    }
                    this.A02.A0G(A0s);
                } else {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    ArrayList A0s4 = AnonymousClass001.A0s();
                    ArrayList A0s5 = AnonymousClass001.A0s();
                    ArrayList A0s6 = AnonymousClass001.A0s();
                    C27991fJ A012 = this.A05.A01(this.A0E);
                    String A0D2 = this.A09.A0D(A012);
                    for (C171398Gx r12 : list) {
                        C53382n0 r3 = r12.A05;
                        String str = r3.A05;
                        if (C162457s7.A0P(str, "non_admin_add")) {
                            A0s5.add(r12);
                        } else if (r12.A07.A0Q()) {
                            A0s2.add(r12);
                        } else if (C162457s7.A0P(str, "linked_group_join")) {
                            C27991fJ r02 = r3.A02;
                            if (r02 == null || C162457s7.A0P(A012, r02)) {
                                A0s3.add(r12);
                            } else {
                                A0s4.add(r12);
                            }
                        } else {
                            A0s6.add(r12);
                        }
                    }
                    ArrayList A0s7 = AnonymousClass001.A0s();
                    A00(A0s7, A0s2, new Object[0], R.string.f11nameremoved);
                    A00(A0s7, A0s5, new Object[0], R.string.f11nameremoved);
                    if (A0D2 == null || A0D2.length() <= 0) {
                        i2 = R.string.f11nameremoved;
                        objArr = new Object[0];
                    } else {
                        i2 = R.string.f11nameremoved;
                        objArr = new Object[]{A0D2};
                    }
                    A00(A0s7, A0s3, objArr, i2);
                    A00(A0s7, A0s4, new Object[0], R.string.f11nameremoved);
                    A00(A0s7, A0s6, new Object[0], R.string.f11nameremoved);
                    AnonymousClass08M r6 = this.A02;
                    ArrayList A0s8 = AnonymousClass001.A0s();
                    A0s8.add(C171408Gy.A00);
                    Iterator it = A0s7.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        AnonymousClass7YF r2 = (AnonymousClass7YF) it.next();
                        List list2 = r2.A01;
                        if (C18310x6.A1X(list2)) {
                            if (!z) {
                                A0s8.add(C171418Gz.A00);
                            }
                            A0s8.add(r2.A00);
                            A0s8.addAll(list2);
                            z = false;
                        }
                    }
                    r6.A0G(A0s8);
                }
                r1 = this.A0I;
                obj = Boolean.TRUE;
                r1.A0G(obj);
            }
        }
        obj = Integer.valueOf(i);
        r1.A0G(obj);
    }

    public AnonymousClass4V4(C56942so r4, C64773Ex r5, AnonymousClass5ZU r6, C56612sH r7, C56982ss r8, C54442oj r9, C56892sj r10, AnonymousClass4FV r11, AnonymousClass2RH r12, C27991fJ r13, AnonymousClass4FS r14) {
        C18260x0.A0e(r7, r14, r8, r11);
        C18260x0.A0g(r5, r4, r6, r10, r9);
        this.A0E = r13;
        this.A08 = r7;
        this.A0J = r14;
        this.A09 = r8;
        this.A0C = r11;
        this.A06 = r5;
        this.A05 = r4;
        this.A07 = r6;
        this.A0B = r10;
        this.A0A = r9;
        this.A0D = r12;
        this.A0J.BkM(new C70003Zm(this, 10));
        C24881Zc r2 = new C24881Zc();
        r2.A01 = C18280x3.A0S();
        r2.A00 = Boolean.TRUE;
        r2.A03 = AnonymousClass0x2.A0T();
        C27991fJ r1 = this.A0E;
        if (AnonymousClass34R.A06(r1.user)) {
            r2.A04 = r1.getRawString();
        }
        this.A0C.BhD(r2);
    }
}
