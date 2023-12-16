package X;

import android.content.Context;
import android.content.res.Resources;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5ZU  reason: invalid class name */
public class AnonymousClass5ZU {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C54292oU A02;
    public final C620733j A03;
    public final C56982ss A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass3LP A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;
    public final ConcurrentHashMap A0C = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A0D = AnonymousClass0x9.A1D();

    public static String A02(AnonymousClass5ZU r5, AnonymousClass3ZH r6) {
        AnonymousClass5ZU r3 = r5;
        if (!r5.A05.A0X(3010)) {
            return r5.A02.A00.getString(R.string.f11nameremoved);
        }
        C54292oU r4 = r5.A02;
        C28011fL r62 = (C28011fL) r6.A0I(C28011fL.class);
        Objects.requireNonNull(r62);
        return AnonymousClass33v.A00(r5.A01, (C64773Ex) r5.A08.get(), r3, r4, (C56892sj) r5.A0A.get(), r62);
    }

    public static boolean A04(AnonymousClass5ZU r1, AnonymousClass3ZH r2, List list) {
        return r1.A0f(r2, list, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r5.A0G == null) goto L_0x0008;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A06(X.AnonymousClass3ZH r5, X.C95814uZ r6) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto L_0x0008
            X.3ZH r1 = r5.A0G
            r0 = 1
            if (r1 != 0) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r6 == 0) goto L_0x0056
            if (r0 != 0) goto L_0x0056
            X.2ss r0 = r4.A04
            boolean r0 = r0.A0N(r6)
            if (r0 != 0) goto L_0x004d
            X.8qC r0 = r4.A09
            java.lang.Object r1 = r0.get()
            X.2K7 r1 = (X.AnonymousClass2K7) r1
            boolean r0 = X.C627336j.A0K(r6)
            if (r0 == 0) goto L_0x0056
            boolean r0 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0056
            X.2ss r0 = r1.A00
            boolean r0 = r0.A0N(r6)
            if (r0 != 0) goto L_0x004d
            X.2sj r0 = r1.A01
            X.1fL r6 = (X.C28011fL) r6
            X.33k r2 = X.C56892sj.A01(r0, r6)
            r1 = 3
            int r0 = r2.A00
            if (r1 != r0) goto L_0x004f
            java.util.Map r0 = r2.A08
            java.util.Collection r0 = r0.values()
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r0)
            int r1 = r0.size()
        L_0x004a:
            r0 = 3
            if (r1 < r0) goto L_0x0056
        L_0x004d:
            r0 = 7
            return r0
        L_0x004f:
            java.util.Map r0 = r2.A09
            int r1 = r0.size()
            goto L_0x004a
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZU.A06(X.3ZH, X.4uZ):int");
    }

    public AnonymousClass7HU A0C(AnonymousClass3ZH r4, int i, boolean z) {
        if (z || r4.A0F == null || TextUtils.isEmpty(r4.A0R) || r4.A0V()) {
            return A0D(r4, i, false, true);
        }
        return new AnonymousClass7HU(C998258i.GIVEN_NAME, r4.A0R);
    }

    public String A0H(AnonymousClass3ZH r3) {
        return A0R(r3, -1, false);
    }

    public String A0P(AnonymousClass3ZH r2, int i) {
        return A0C(r2, i, false).A01;
    }

    public String A0R(AnonymousClass3ZH r2, int i, boolean z) {
        return A0D(r2, i, z, true).A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if ((r12 instanceof X.AnonymousClass1fI) != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0U(X.C28011fL r12, int r13, boolean r14) {
        /*
            r11 = this;
            r5 = r11
            if (r14 == 0) goto L_0x005f
            java.util.concurrent.ConcurrentHashMap r2 = r11.A0D
        L_0x0005:
            java.lang.String r0 = X.C18320x8.A0e(r12, r2)
            if (r0 != 0) goto L_0x0078
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            X.8qC r3 = r11.A0A
            java.lang.Object r0 = r3.get()
            X.2sj r0 = (X.C56892sj) r0
            X.33k r1 = X.C56892sj.A01(r0, r12)
            java.lang.Object r0 = r3.get()
            X.2sj r0 = (X.C56892sj) r0
            boolean r0 = r0.A0B(r12)
            if (r0 == 0) goto L_0x005a
            java.util.Map r0 = r1.A08
            java.util.Collection r0 = r0.values()
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r0)
        L_0x0031:
            X.8Nf r4 = r0.iterator()
            r3 = 0
        L_0x0036:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r4.next()
            X.2zG r1 = (X.C60842zG) r1
            X.2sr r0 = r11.A01
            com.whatsapp.jid.UserJid r1 = r1.A03
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x004e
            r3 = 1
            goto L_0x0036
        L_0x004e:
            X.8qC r0 = r11.A08
            java.lang.Object r0 = r0.get()
            X.3Ex r0 = (X.C64773Ex) r0
            X.C86614Ku.A1P(r0, r1, r6)
            goto L_0x0036
        L_0x005a:
            X.6aS r0 = r1.A04()
            goto L_0x0031
        L_0x005f:
            java.util.concurrent.ConcurrentHashMap r2 = r11.A0C
            goto L_0x0005
        L_0x0062:
            r7 = -1
            if (r14 == 0) goto L_0x0067
            r7 = 10
        L_0x0067:
            if (r3 == 0) goto L_0x006e
            boolean r0 = r12 instanceof X.AnonymousClass1fI
            r9 = 1
            if (r0 == 0) goto L_0x006f
        L_0x006e:
            r9 = 0
        L_0x006f:
            r10 = 0
            r8 = r13
            java.lang.String r0 = r5.A0X(r6, r7, r8, r9, r10)
            r2.put(r12, r0)
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZU.A0U(X.1fL, int, boolean):java.lang.String");
    }

    public String A0V(Iterable iterable, int i) {
        HashSet A0K = AnonymousClass002.A0K();
        return A0X(A0K, i, -1, A0g(iterable, A0K), true);
    }

    public String A0W(Iterable iterable, int i) {
        HashSet A0K = AnonymousClass002.A0K();
        return A0X(A0K, -1, i, A0g(iterable, A0K), true);
    }

    public List A0Z(Iterable iterable, int i, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AnonymousClass7HU A0C2 = A0C(C18310x6.A0R(it), i, false);
            C998258i r2 = A0C2.A00;
            String str = A0C2.A01;
            if (str != null) {
                if (r2 == C998258i.PHONE_NUMBER) {
                    A0s3.add(str);
                } else if (r2 == C998258i.PUSH_NAME) {
                    A0s2.add(str);
                } else {
                    A0s.add(str);
                }
            }
        }
        C620733j r22 = this.A03;
        Collator A0w = C86614Ku.A0w(r22);
        A0w.setDecomposition(1);
        Collections.sort(A0s, A0w);
        Collator A0w2 = C86614Ku.A0w(r22);
        A0w2.setDecomposition(1);
        Collections.sort(A0s2, A0w2);
        Collections.sort(A0s3);
        A0s.addAll(A0s2);
        A0s.addAll(A0s3);
        if (z) {
            C86654Ky.A0w(this.A02.A00, A0s, R.string.f11nameremoved);
        }
        return A0s;
    }

    public static CharSequence A00(Context context, C620733j r3, AnonymousClass3ZH r4) {
        int i;
        Integer num = r4.A0L;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return r4.A0V;
        }
        switch (intValue) {
            case 1:
                i = R.string.f11nameremoved;
                break;
            case 2:
                i = R.string.f11nameremoved;
                break;
            case 3:
                i = R.string.f11nameremoved;
                break;
            case 4:
                i = R.string.f11nameremoved;
                break;
            case 5:
                i = R.string.f11nameremoved;
                break;
            case 6:
                i = R.string.f11nameremoved;
                break;
            case 7:
                i = R.string.f11nameremoved;
                break;
            case 8:
                i = R.string.f11nameremoved;
                break;
            case 9:
                i = R.string.f11nameremoved;
                break;
            case 10:
                i = R.string.f11nameremoved;
                break;
            case 11:
                i = R.string.f11nameremoved;
                break;
            case 12:
                i = R.string.f11nameremoved;
                break;
            case 13:
                i = R.string.f11nameremoved;
                break;
            case 14:
                i = R.string.f11nameremoved;
                break;
            case 15:
                i = R.string.f11nameremoved;
                break;
            case 16:
                i = R.string.f11nameremoved;
                break;
            case 17:
                i = R.string.f11nameremoved;
                break;
            case 18:
                i = R.string.f11nameremoved;
                break;
            case 19:
                i = R.string.f11nameremoved;
                break;
            case 20:
                i = R.string.f11nameremoved;
                break;
            default:
                return r3.A0C(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(intValue));
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            return context.getString(valueOf.intValue());
        }
        return r3.A0C(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(intValue));
    }

    public static boolean A05(AnonymousClass3ZH r2) {
        if ((r2.A0H instanceof AnonymousClass1fS) || !AnonymousClass3ZH.A0E(r2)) {
            return false;
        }
        if (!r2.A0R()) {
            return C18320x8.A1U(r2.A0b);
        }
        if (r2.A0P() || TextUtils.isEmpty(r2.A0L())) {
            return false;
        }
        return true;
    }

    public final int A08(AnonymousClass1fI r4) {
        C620833k A012 = C56892sj.A01((C56892sj) this.A0A.get(), r4);
        boolean A0O = A012.A0O(this.A01);
        int size = A012.A02().size();
        if (A0O) {
            return size - 1;
        }
        return size;
    }

    public int A09(C95814uZ r4) {
        int A0H = C86664Kz.A0H((C56892sj) this.A0A.get(), (C28011fL) r4);
        if (A0H != -1) {
            AnonymousClass2K7 r1 = (AnonymousClass2K7) this.A09.get();
            if (A0H >= 3 || r1.A00.A0N(r4)) {
                return 7;
            }
            return 1;
        }
        return 7;
    }

    public AnonymousClass7HU A0B(AnonymousClass3ZH r4, int i) {
        boolean A0W;
        String A0S;
        C95814uZ r1 = r4.A0H;
        if (r1 instanceof C95804uY) {
            AnonymousClass1RL r0 = (AnonymousClass1RL) C56982ss.A00(this.A04, r1);
            if (r0 != null) {
                A0W = r0.A0L();
            }
            return A0D(r4, i, false, true);
        }
        A0W = r4.A0W();
        if (A0W) {
            C95814uZ r2 = r4.A0H;
            if (r2 instanceof C95804uY) {
                AnonymousClass1RL r02 = (AnonymousClass1RL) this.A04.A0A(r2, false);
                if (r02 != null) {
                    A0S = r02.A0H;
                } else {
                    A0S = A0S(r4, false);
                }
            } else {
                A0S = A0S(r4, false);
            }
            return new AnonymousClass7HU(C998258i.VERIFIED_NAME, A0S);
        }
        return A0D(r4, i, false, true);
    }

    public AnonymousClass7HU A0E(AnonymousClass3ZH r9, boolean z) {
        String str;
        C998258i r0;
        String A0D2;
        String A0Y;
        C998258i r1;
        C998258i r02;
        int i;
        C95814uZ r2 = r9.A0H;
        if (r2 instanceof C135166kE) {
            A0D2 = this.A02.A00.getString(R.string.f11nameremoved);
            r02 = C998258i.MY_STATUS;
        } else {
            if (C155477ey.A00(r2)) {
                A0Y = r9.A0J();
            } else if (!r9.A0T() || !AnonymousClass75P.A00(this.A05)) {
                if (r9.A0V() || (A0c(r9) && r9.A0R() && ((i = r9.A08) == 2 || i == 3))) {
                    str = A0S(r9, z);
                    r0 = C998258i.VERIFIED_NAME;
                } else if (AnonymousClass3ZH.A0E(r9) || ((r9.A0H instanceof C27981fH) && r9.A0G == null)) {
                    if (r9.A0U()) {
                        A0D2 = this.A04.A0D(AnonymousClass3ZH.A01(r9));
                        if (TextUtils.isEmpty(A0D2) && this.A05.A0X(3010)) {
                            C28011fL r7 = (C28011fL) r9.A0I(C28011fL.class);
                            Objects.requireNonNull(r7);
                            A0D2 = AnonymousClass33v.A00(this.A01, (C64773Ex) this.A08.get(), this, this.A02, (C56892sj) this.A0A.get(), r7);
                        } else if (TextUtils.isEmpty(A0D2)) {
                            A0D2 = this.A02.A00.getString(R.string.f11nameremoved);
                        }
                    } else if (r9.A0H instanceof AnonymousClass1fS) {
                        A0Y = AnonymousClass0x2.A0Y(C54292oU.A00(this.A02), A08((AnonymousClass1fI) AnonymousClass3ZH.A05(r9, AnonymousClass1fI.class)), 0, R.plurals.f9nameremoved);
                        r1 = C998258i.RECIPIENTS_COUNT;
                        return new AnonymousClass7HU(r1, A0Y);
                    } else {
                        str = null;
                        if (r2 == null) {
                            A0D2 = null;
                        } else {
                            A0D2 = this.A04.A0D(r2);
                        }
                        if (TextUtils.isEmpty(A0D2)) {
                            r0 = C998258i.UNKNOWN;
                        }
                    }
                    r02 = C998258i.CHAT_SUBJECT;
                } else {
                    A0Y = r9.A0J();
                    r1 = C998258i.CONTACT_NAME;
                    return new AnonymousClass7HU(r1, A0Y);
                }
                return new AnonymousClass7HU(r0, str);
            } else {
                A0Y = A0S(r9, false);
            }
            r1 = C998258i.VERIFIED_NAME;
            return new AnonymousClass7HU(r1, A0Y);
        }
        return new AnonymousClass7HU(r02, A0D2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r5.A0G != null) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7HU A0F(X.AnonymousClass3ZH r5, boolean r6) {
        /*
            r4 = this;
            X.4uZ r2 = r5.A0H
            boolean r0 = r2 instanceof X.C27981fH
            if (r0 == 0) goto L_0x000b
            X.3ZH r1 = r5.A0G
            r0 = 1
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r3 = 0
            if (r0 == 0) goto L_0x0027
            X.33j r1 = r4.A03
            java.lang.String r0 = r5.A0J()
        L_0x0015:
            java.lang.String r2 = r1.A0I(r0)
        L_0x0019:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0039
            X.58i r0 = X.C998258i.UNKNOWN
            X.7HU r1 = new X.7HU
            r1.<init>(r0, r3)
            return r1
        L_0x0027:
            if (r6 == 0) goto L_0x0030
            X.33j r1 = r4.A03
            java.lang.String r0 = X.AnonymousClass36P.A02(r5)
            goto L_0x0015
        L_0x0030:
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = X.AnonymousClass36P.A05(r2)
            goto L_0x0019
        L_0x0037:
            r2 = r3
            goto L_0x0019
        L_0x0039:
            X.58i r0 = X.C998258i.PHONE_NUMBER
            X.7HU r1 = new X.7HU
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZU.A0F(X.3ZH, boolean):X.7HU");
    }

    public String A0G(C998258i r4, AnonymousClass3ZH r5, int i) {
        String str;
        C998258i r1;
        AnonymousClass7HU A0F;
        if (r4 == C998258i.PHONE_NUMBER) {
            str = A03(this, r5);
            r1 = C998258i.PUSH_NAME;
        } else if (r4 == C998258i.PUSH_NAME && i == 7) {
            A0F = A0F(r5, true);
            return A0F.A01;
        } else {
            str = null;
            r1 = C998258i.UNKNOWN;
        }
        A0F = new AnonymousClass7HU(r1, str);
        return A0F.A01;
    }

    public String A0I(AnonymousClass3ZH r4) {
        if (!(r4.A0H instanceof AnonymousClass1fS) || !AnonymousClass3ZH.A0E(r4)) {
            return A0H(r4);
        }
        return A0U((C28011fL) AnonymousClass3ZH.A05(r4, AnonymousClass1fI.class), -1, true);
    }

    public String A0J(AnonymousClass3ZH r8) {
        C95814uZ r3 = r8.A0H;
        C56972sr r6 = this.A01;
        if (r6.A0a(r3)) {
            if (!C86644Kx.A1Z(this.A05)) {
                return this.A02.A00.getString(R.string.f11nameremoved);
            }
            PhoneUserJid A042 = C56972sr.A04(r6);
            String A062 = AnonymousClass36P.A06(A042);
            if (C86664Kz.A1W(r6)) {
                C64773Ex r1 = (C64773Ex) this.A08.get();
                AnonymousClass3ZH A092 = r1.A09(C56972sr.A04(r1.A02));
                if (A092 != null) {
                    String A0H = A0H(A092);
                    A0a(r3, A042, A0H, "address book");
                    return A0H;
                }
            } else {
                String A0Z = C18280x3.A0Z(((C55262q4) this.A07.get()).A01(), "self_contact_name");
                if (A0Z != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("companion=");
                    A0o.append(r6.A0Y());
                    A0o.append("; deviceId=");
                    A0a(r3, A042, A0Z, AnonymousClass000.A0h(A0o, r6.A0D()));
                    return A0Z;
                }
            }
            A0a(r3, A042, A062, "phone number");
            return this.A03.A0I(A062);
        } else if (r8.A0F != null) {
            return A0H(r8);
        } else {
            return C86654Ky.A0m(this.A03, r8);
        }
    }

    public String A0K(AnonymousClass3ZH r3) {
        if (C56972sr.A08(this.A01, r3)) {
            return this.A02.A00.getString(R.string.f11nameremoved);
        }
        if (r3.A0F != null) {
            return A0H(r3);
        }
        if (!TextUtils.isEmpty(r3.A0b)) {
            return A03(this, r3);
        }
        return null;
    }

    public String A0L(AnonymousClass3ZH r6) {
        if (r6.A0H instanceof C135166kE) {
            return this.A02.A00.getString(R.string.f11nameremoved);
        }
        if (r6.A0V()) {
            return A0S(r6, false);
        }
        if (!AnonymousClass3ZH.A0E(r6)) {
            return r6.A0J();
        }
        if (!TextUtils.isEmpty(r6.A0N)) {
            return r6.A0N;
        }
        if (r6.A0U()) {
            String A0D2 = this.A04.A0D(AnonymousClass3ZH.A01(r6));
            if (TextUtils.isEmpty(A0D2)) {
                return A02(this, r6);
            }
            return A0D2;
        } else if (r6.A0H instanceof AnonymousClass1fS) {
            int A082 = A08((AnonymousClass1fI) AnonymousClass3ZH.A05(r6, AnonymousClass1fI.class));
            Resources A002 = C54292oU.A00(this.A02);
            Object[] objArr = new Object[1];
            C18270x1.A1Q(objArr, A082);
            return A002.getQuantityString(R.plurals.f9nameremoved, A082, objArr);
        } else {
            String A0D3 = this.A04.A0D(AnonymousClass3ZH.A01(r6));
            if (!TextUtils.isEmpty(A0D3)) {
                return A0D3;
            }
            TextUtils.isEmpty(A03(this, r6));
            return A0F(r6, true).A01;
        }
    }

    public String A0M(AnonymousClass3ZH r5) {
        String str;
        if (r5.A0H instanceof C135166kE) {
            return this.A02.A00.getString(R.string.f11nameremoved);
        }
        if (r5.A0V()) {
            return A0S(r5, false);
        }
        if (!AnonymousClass3ZH.A0E(r5)) {
            return r5.A0J();
        }
        if (r5.A0U()) {
            str = this.A04.A0D(AnonymousClass3ZH.A01(r5));
            if (TextUtils.isEmpty(str)) {
                return A02(this, r5);
            }
        } else if (r5.A0H instanceof AnonymousClass1fS) {
            int A082 = A08((AnonymousClass1fI) AnonymousClass3ZH.A05(r5, AnonymousClass1fI.class));
            Resources A002 = C54292oU.A00(this.A02);
            Object[] A0L = AnonymousClass002.A0L();
            C18270x1.A1Q(A0L, A082);
            return A002.getQuantityString(R.plurals.f9nameremoved, A082, A0L);
        } else {
            str = this.A04.A0D(AnonymousClass3ZH.A01(r5));
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(r5.A0b)) {
                    return A03(this, r5);
                }
                return C86654Ky.A0m(this.A03, r5);
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (X.AnonymousClass3ZH.A0E(r4) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0S(X.AnonymousClass3ZH r4, boolean r5) {
        /*
            r3 = this;
            X.4uZ r0 = r4.A0H
            boolean r0 = r0 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x0022
            int r1 = r4.A08
            r0 = 3
            if (r1 == r0) goto L_0x0016
            boolean r0 = r3.A0c(r4)
            r2 = 2
            if (r0 == 0) goto L_0x0027
            int r0 = r4.A08
            if (r0 != r2) goto L_0x0027
        L_0x0016:
            if (r5 != 0) goto L_0x0022
            X.2k5 r0 = r4.A0F
            if (r0 == 0) goto L_0x0022
            boolean r0 = X.AnonymousClass3ZH.A0E(r4)
            if (r0 == 0) goto L_0x003e
        L_0x0022:
            java.lang.String r0 = r4.A0L()
            return r0
        L_0x0027:
            boolean r0 = r4.A0T()
            if (r0 != 0) goto L_0x0022
            int r1 = r4.A08
            if (r1 == r2) goto L_0x0043
            r0 = 1
            if (r1 == r0) goto L_0x0043
            boolean r0 = r4.A0U()
            if (r0 == 0) goto L_0x004e
            boolean r0 = r4.A0j
            if (r0 == 0) goto L_0x004e
        L_0x003e:
            java.lang.String r0 = r4.A0J()
            return r0
        L_0x0043:
            X.2k5 r0 = r4.A0F
            if (r0 != 0) goto L_0x003e
            boolean r0 = X.AnonymousClass3ZH.A0E(r4)
            if (r0 != 0) goto L_0x004e
            goto L_0x003e
        L_0x004e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZU.A0S(X.3ZH, boolean):java.lang.String");
    }

    @Deprecated
    public String A0T(GroupJid groupJid) {
        if (groupJid == null) {
            return null;
        }
        return this.A04.A0D(groupJid);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        if (r1.lookingAt() != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        if (r2.equals(r1) != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r8.equals(r1) != false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(X.C95814uZ r10, com.whatsapp.jid.PhoneUserJid r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            if (r11 == 0) goto L_0x0101
            if (r12 == 0) goto L_0x0101
            X.8qC r1 = r9.A0B     // Catch:{ 6zC -> 0x0101 }
            java.lang.Object r0 = r1.get()     // Catch:{ 6zC -> 0x0101 }
            X.7rN r0 = (X.C162167rN) r0     // Catch:{ 6zC -> 0x0101 }
            r8 = 0
            X.8LC r0 = r0.A0F(r12, r8)     // Catch:{ 6zC -> 0x0101 }
            java.lang.Object r4 = r1.get()     // Catch:{ 6zC -> 0x0101 }
            X.7rN r4 = (X.C162167rN) r4     // Catch:{ 6zC -> 0x0101 }
            java.lang.String r3 = X.C162167rN.A01(r0)     // Catch:{ 6zC -> 0x0101 }
            int r2 = r0.countryCode_     // Catch:{ 6zC -> 0x0101 }
            java.util.Map r1 = r4.A02     // Catch:{ 6zC -> 0x0101 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ 6zC -> 0x0101 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ 6zC -> 0x0101 }
            if (r0 != 0) goto L_0x0030
            X.6ue r1 = X.C140866ue.INVALID_COUNTRY_CODE     // Catch:{ 6zC -> 0x0101 }
        L_0x002b:
            X.6ue r0 = X.C140866ue.IS_POSSIBLE     // Catch:{ 6zC -> 0x0101 }
            if (r1 != r0) goto L_0x0100
            goto L_0x0085
        L_0x0030:
            java.lang.String r1 = r4.A0G(r2)     // Catch:{ 6zC -> 0x0101 }
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)     // Catch:{ 6zC -> 0x0101 }
            if (r0 == 0) goto L_0x005a
            X.8Km r0 = r4.A0D(r2)     // Catch:{ 6zC -> 0x0101 }
        L_0x0040:
            X.C626936e.A06(r0)     // Catch:{ 6zC -> 0x0101 }
            X.8Kk r2 = r0.generalDesc_     // Catch:{ 6zC -> 0x0101 }
            boolean r0 = r2.hasNationalNumberPattern     // Catch:{ 6zC -> 0x0101 }
            if (r0 != 0) goto L_0x0064
            java.util.logging.Logger r2 = X.C162167rN.A0B     // Catch:{ 6zC -> 0x0101 }
            java.util.logging.Level r1 = java.util.logging.Level.FINER     // Catch:{ 6zC -> 0x0101 }
            java.lang.String r0 = "Checking if number is possible with incomplete metadata."
            r2.log(r1, r0)     // Catch:{ 6zC -> 0x0101 }
            int r1 = r3.length()     // Catch:{ 6zC -> 0x0101 }
            r0 = 2
            if (r1 < r0) goto L_0x007f
            goto L_0x005f
        L_0x005a:
            X.8Km r0 = r4.A0E(r1)     // Catch:{ 6zC -> 0x0101 }
            goto L_0x0040
        L_0x005f:
            r0 = 16
            if (r1 <= r0) goto L_0x0082
            goto L_0x007c
        L_0x0064:
            X.7RS r1 = r4.A00     // Catch:{ 6zC -> 0x0101 }
            java.lang.String r0 = r2.possibleNumberPattern_     // Catch:{ 6zC -> 0x0101 }
            java.util.regex.Pattern r0 = r1.A00(r0)     // Catch:{ 6zC -> 0x0101 }
            java.util.regex.Matcher r1 = r0.matcher(r3)     // Catch:{ 6zC -> 0x0101 }
            boolean r0 = r1.matches()     // Catch:{ 6zC -> 0x0101 }
            if (r0 != 0) goto L_0x0082
            boolean r0 = r1.lookingAt()     // Catch:{ 6zC -> 0x0101 }
            if (r0 == 0) goto L_0x007f
        L_0x007c:
            X.6ue r1 = X.C140866ue.TOO_LONG     // Catch:{ 6zC -> 0x0101 }
            goto L_0x002b
        L_0x007f:
            X.6ue r1 = X.C140866ue.TOO_SHORT     // Catch:{ 6zC -> 0x0101 }
            goto L_0x002b
        L_0x0082:
            X.6ue r1 = X.C140866ue.IS_POSSIBLE     // Catch:{ 6zC -> 0x0101 }
            goto L_0x002b
        L_0x0085:
            boolean r5 = r10 instanceof com.whatsapp.jid.PhoneUserJid
            java.lang.String r2 = X.AnonymousClass36P.A05(r10)
            java.lang.String r3 = X.AnonymousClass36P.A05(r11)
            java.lang.String r1 = X.C107195ar.A03(r12)
            r0 = 4
            if (r2 == 0) goto L_0x00fe
            java.lang.String r2 = X.C107575bX.A0B(r2, r0)
        L_0x009a:
            if (r3 == 0) goto L_0x00a0
            java.lang.String r8 = X.C107575bX.A0B(r3, r0)
        L_0x00a0:
            java.lang.String r1 = X.C107575bX.A0B(r1, r0)
            r7 = 1
            r4 = 0
            if (r2 == 0) goto L_0x00af
            boolean r0 = r2.equals(r1)
            r6 = 1
            if (r0 == 0) goto L_0x00b0
        L_0x00af:
            r6 = 0
        L_0x00b0:
            if (r8 == 0) goto L_0x00b9
            boolean r0 = r8.equals(r1)
            r3 = 1
            if (r0 == 0) goto L_0x00ba
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            if (r2 == 0) goto L_0x00fc
            if (r8 == 0) goto L_0x00fc
            boolean r0 = r2.equals(r8)
            if (r0 != 0) goto L_0x00fc
        L_0x00c4:
            if (r6 != 0) goto L_0x00ca
            if (r3 != 0) goto L_0x00ca
            if (r7 == 0) goto L_0x0101
        L_0x00ca:
            X.2qk r2 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactVsDisplay="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; jidVsDisplay="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; contactVsJid="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; contactIsPhone="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; context="
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r13, r1)
            java.lang.String r0 = "contactnames/wrong display name"
            r2.A0A(r0, r4, r1)
            return
        L_0x00fc:
            r7 = 0
            goto L_0x00c4
        L_0x00fe:
            r2 = r8
            goto L_0x009a
        L_0x0100:
            return
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZU.A0a(X.4uZ, com.whatsapp.jid.PhoneUserJid, java.lang.String, java.lang.String):void");
    }

    public void A0b(C28011fL r2) {
        this.A0C.remove(r2);
        this.A0D.remove(r2);
    }

    public boolean A0c(AnonymousClass3ZH r3) {
        AnonymousClass1VX r1;
        int i;
        String str = r3.A0T;
        if (str == null) {
            return false;
        }
        if (str.startsWith("smb:")) {
            r1 = this.A05;
            i = 2520;
        } else if (!str.startsWith("ent:")) {
            return false;
        } else {
            r1 = this.A05;
            i = 2519;
        }
        return C56952sp.A0J(r1, i);
    }

    public boolean A0d(AnonymousClass3ZH r4) {
        if (r4.A0F != null) {
            String A0J = r4.A0J();
            String A0L = r4.A0L();
            if (TextUtils.isEmpty(A0L) || TextUtils.isEmpty(A0J) || !C107575bX.A06(A0J).equals(C107575bX.A06(A0L))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r4.A0X(2630) == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0f(X.AnonymousClass3ZH r20, java.util.List r21, boolean r22) {
        /*
            r19 = this;
            r18 = 1
            r1 = r21
            if (r21 == 0) goto L_0x021a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x021a
            r2 = r20
            boolean r0 = X.AnonymousClass3ZH.A0E(r2)
            r8 = r19
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = r2.A0J()
            java.lang.String r6 = X.C106815aD.A03(r0)
        L_0x001e:
            X.4uZ r3 = X.C86604Kt.A0a(r2)
            java.lang.String r17 = X.AnonymousClass36P.A05(r3)
            X.2sr r7 = r8.A01
            boolean r0 = r7.A0a(r3)
            if (r0 == 0) goto L_0x003f
            X.1VX r4 = r8.A05
            boolean r0 = X.C86644Kx.A1Z(r4)
            if (r0 == 0) goto L_0x003f
            r0 = 2630(0xa46, float:3.685E-42)
            boolean r4 = r4.A0X(r0)
            r0 = 1
            if (r4 != 0) goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            r16 = 0
            if (r0 == 0) goto L_0x019c
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            X.2oU r0 = r8.A02
            android.content.Context r5 = r0.A00
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2130903064(0x7f030018, float:1.7412935E38)
            java.lang.String[] r11 = r4.getStringArray(r0)
            int r10 = r11.length
            r9 = 0
        L_0x0059:
            if (r9 >= r10) goto L_0x010c
            r4 = r11[r9]
            X.33j r0 = r8.A03
            java.util.Locale r0 = X.C620733j.A02(r0)
            java.lang.String r0 = r4.toLowerCase(r0)
            r12.add(r0)
            int r9 = r9 + 1
            goto L_0x0059
        L_0x006d:
            X.4uZ r0 = r2.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x0082
            java.lang.Class<X.1fI> r0 = X.AnonymousClass1fI.class
            com.whatsapp.jid.Jid r4 = X.AnonymousClass3ZH.A05(r2, r0)
            X.1fL r4 = (X.C28011fL) r4
            r3 = -1
            r0 = 0
            java.lang.String r6 = r8.A0U(r4, r3, r0)
            goto L_0x001e
        L_0x0082:
            boolean r0 = r2.A0U()
            if (r0 == 0) goto L_0x00f0
            X.1VX r3 = r8.A05
            r0 = 3010(0xbc2, float:4.218E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 == 0) goto L_0x00f0
            r0 = 6645(0x19f5, float:9.312E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 == 0) goto L_0x00d5
            X.2ss r3 = r8.A04
            java.lang.Class<X.1fL> r7 = X.C28011fL.class
            X.4uZ r0 = X.AnonymousClass3ZH.A02(r2, r7)
            java.lang.String r6 = r3.A0D(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x001e
            X.2oU r6 = r8.A02
            X.2sr r5 = r8.A01
            X.8qC r0 = r8.A08
            java.lang.Object r4 = r0.get()
            X.3Ex r4 = (X.C64773Ex) r4
            X.8qC r0 = r8.A0A
            java.lang.Object r3 = r0.get()
            X.2sj r3 = (X.C56892sj) r3
            com.whatsapp.jid.Jid r0 = r2.A0I(r7)
        L_0x00c4:
            X.C626936e.A06(r0)
            X.1fL r0 = (X.C28011fL) r0
            r9 = r5
            r10 = r4
            r11 = r8
            r12 = r6
            r13 = r3
            r14 = r0
            java.lang.String r6 = X.AnonymousClass33v.A00(r9, r10, r11, r12, r13, r14)
            goto L_0x001e
        L_0x00d5:
            X.2oU r6 = r8.A02
            X.2sr r5 = r8.A01
            X.8qC r0 = r8.A08
            java.lang.Object r4 = r0.get()
            X.3Ex r4 = (X.C64773Ex) r4
            X.8qC r0 = r8.A0A
            java.lang.Object r3 = r0.get()
            X.2sj r3 = (X.C56892sj) r3
            java.lang.Class<X.1fL> r0 = X.C28011fL.class
            com.whatsapp.jid.Jid r0 = r2.A0I(r0)
            goto L_0x00c4
        L_0x00f0:
            X.4uZ r0 = r2.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = r8.A0H(r2)
            boolean r0 = X.C107575bX.A0F(r0)
            if (r0 != 0) goto L_0x0106
            java.lang.String r6 = r8.A0H(r2)
            goto L_0x001e
        L_0x0106:
            java.lang.String r6 = X.AnonymousClass36P.A02(r2)
            goto L_0x001e
        L_0x010c:
            java.util.Iterator r10 = r12.iterator()
        L_0x0110:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.String r9 = X.AnonymousClass001.A0m(r10)
            java.util.Iterator r4 = r1.iterator()
        L_0x011e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = X.AnonymousClass001.A0m(r4)
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x011e
            return r18
        L_0x012f:
            java.util.Iterator r15 = r1.iterator()
        L_0x0133:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x019c
            java.lang.String r9 = X.AnonymousClass001.A0m(r15)
            X.1RR r4 = X.C56972sr.A01(r7)
            if (r4 == 0) goto L_0x0133
            X.33j r0 = r8.A03
            java.lang.String r0 = X.C100235Ac.A00(r5, r8, r0, r4)
            java.lang.String r14 = r4.A0R
            java.lang.String r13 = r4.A0Q
            java.lang.String r12 = r4.A0b
            java.lang.String r11 = r4.A0W
            java.lang.String r10 = r4.A0U
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x021a
            if (r14 == 0) goto L_0x016b
            java.lang.String r0 = r14.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x021a
        L_0x016b:
            if (r13 == 0) goto L_0x0177
            java.lang.String r0 = r13.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x021a
        L_0x0177:
            if (r12 == 0) goto L_0x0183
            java.lang.String r0 = r12.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x021a
        L_0x0183:
            if (r11 == 0) goto L_0x018f
            java.lang.String r0 = r11.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x021a
        L_0x018f:
            if (r10 == 0) goto L_0x0133
            java.lang.String r0 = r10.toLowerCase(r4)
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0133
            return r18
        L_0x019c:
            X.33j r5 = r8.A03
            r4 = r22
            boolean r0 = X.C107155an.A05(r5, r6, r1, r4)
            if (r0 != 0) goto L_0x021a
            boolean r0 = r2.A0R()
            if (r0 == 0) goto L_0x01c2
            boolean r0 = r2.A0P()
            if (r0 != 0) goto L_0x01b8
            boolean r0 = r2.A0T()
            if (r0 == 0) goto L_0x01c2
        L_0x01b8:
            java.lang.String r0 = r2.A0L()
            boolean r0 = X.C107155an.A05(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x021a
        L_0x01c2:
            boolean r0 = X.C86654Ky.A1Y(r2)
            if (r0 == 0) goto L_0x01d2
            java.lang.String r0 = r2.A0J()
            boolean r0 = X.C107155an.A05(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x021a
        L_0x01d2:
            java.lang.String r0 = r2.A0U
            boolean r0 = X.C107155an.A05(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x021a
            java.lang.String r0 = r2.A0O
            boolean r0 = X.C107155an.A05(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x021a
            java.lang.String r0 = r2.A0Z
            boolean r0 = X.C107155an.A05(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x021a
            X.4uZ r0 = r2.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x0214
            boolean r0 = r2.A0U()
            if (r0 != 0) goto L_0x0214
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L_0x0214
            java.util.Iterator r2 = r1.iterator()
        L_0x0200:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x021a
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            java.lang.String r0 = r3.user
            if (r22 == 0) goto L_0x0215
            boolean r0 = r0.contains(r1)
        L_0x0212:
            if (r0 != 0) goto L_0x0200
        L_0x0214:
            return r16
        L_0x0215:
            boolean r0 = r0.equals(r1)
            goto L_0x0212
        L_0x021a:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZU.A0f(X.3ZH, java.util.List, boolean):boolean");
    }

    public AnonymousClass5ZU(C55682qk r2, C56972sr r3, C54292oU r4, C620733j r5, C56982ss r6, AnonymousClass1VX r7, AnonymousClass3LP r8, C183538qC r9, C183538qC r10, C183538qC r11, C183538qC r12, C183538qC r13) {
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r6;
        this.A06 = r8;
        this.A08 = r9;
        this.A03 = r5;
        this.A0B = r10;
        this.A09 = r11;
        this.A0A = r12;
        this.A07 = r13;
    }

    public static String A01(C64773Ex r0, AnonymousClass5ZU r1, C95814uZ r2) {
        return r1.A0H(r0.A0A(r2));
    }

    public static String A03(AnonymousClass5ZU r1, AnonymousClass3ZH r2) {
        return r1.A0Q(r2, R.string.f11nameremoved);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r4.A0G == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A07(X.AnonymousClass3ZH r4, X.C95814uZ r5) {
        /*
            r3 = this;
            boolean r0 = X.C627336j.A0K(r5)
            if (r0 != 0) goto L_0x0008
            r0 = 2
            return r0
        L_0x0008:
            if (r4 == 0) goto L_0x000f
            X.3ZH r1 = r4.A0G
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r5 == 0) goto L_0x004f
            if (r0 != 0) goto L_0x004f
            X.8qC r0 = r3.A09
            java.lang.Object r1 = r0.get()
            X.2K7 r1 = (X.AnonymousClass2K7) r1
            boolean r0 = r5 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x004f
            X.2ss r0 = r1.A00
            boolean r0 = r0.A0N(r5)
            if (r0 != 0) goto L_0x0046
            X.2sj r0 = r1.A01
            X.1fL r5 = (X.C28011fL) r5
            X.33k r2 = X.C56892sj.A01(r0, r5)
            r1 = 3
            int r0 = r2.A00
            if (r1 != r0) goto L_0x0048
            java.util.Map r0 = r2.A08
            java.util.Collection r0 = r0.values()
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r0)
            int r1 = r0.size()
        L_0x0043:
            r0 = 3
            if (r1 < r0) goto L_0x004f
        L_0x0046:
            r0 = 7
            return r0
        L_0x0048:
            java.util.Map r0 = r2.A09
            int r1 = r0.size()
            goto L_0x0043
        L_0x004f:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZU.A07(X.3ZH, X.4uZ):int");
    }

    public int A0A(C95814uZ r2) {
        if (!C627336j.A0K(r2) || !(r2 instanceof GroupJid)) {
            return 2;
        }
        return A09(r2);
    }

    public AnonymousClass7HU A0D(AnonymousClass3ZH r4, int i, boolean z, boolean z2) {
        C998258i r0;
        AnonymousClass7HU A0E = A0E(r4, z);
        if (!TextUtils.isEmpty(A0E.A01)) {
            return A0E;
        }
        String A032 = A03(this, r4);
        if (!TextUtils.isEmpty(A032) && i == 7) {
            r0 = C998258i.PUSH_NAME;
        } else if (i != 8) {
            return A0F(r4, z2);
        } else {
            A032 = A0K(r4);
            r0 = C998258i.MY_GROUP_NAME;
        }
        return new AnonymousClass7HU(r0, A032);
    }

    public String A0N(AnonymousClass3ZH r2) {
        return A03(this, r2);
    }

    public String A0O(AnonymousClass3ZH r2) {
        if (!r2.A0R() && !TextUtils.isEmpty(r2.A0b)) {
            return r2.A0b;
        }
        if ((!r2.A0R() || r2.A0P() || TextUtils.isEmpty(r2.A0L())) && !C86624Kv.A1X(r2, this.A06)) {
            return null;
        }
        return r2.A0L();
    }

    public final String A0Q(AnonymousClass3ZH r3, int i) {
        String A0O = A0O(r3);
        if (A0O == null) {
            return "";
        }
        return C86604Kt.A0m(this.A02.A00, A0O, i);
    }

    public String A0X(Iterable iterable, int i, int i2, boolean z, boolean z2) {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        boolean A1W = AnonymousClass001.A1W(i);
        Iterator it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            i3++;
            if (!A1W || i3 <= i) {
                AnonymousClass7HU A0C2 = A0C(A0R, i2, z2);
                C998258i r4 = A0C2.A00;
                String str = A0C2.A01;
                if (str != null) {
                    if (r4 == C998258i.PHONE_NUMBER) {
                        A0s3.add(str);
                    } else if (r4 == C998258i.PUSH_NAME) {
                        A0s2.add(str);
                    } else {
                        A0s.add(str);
                    }
                }
            }
        }
        C620733j r42 = this.A03;
        Collator A0w = C86614Ku.A0w(r42);
        A0w.setDecomposition(1);
        Collections.sort(A0s, A0w);
        Collator A0w2 = C86614Ku.A0w(r42);
        A0w2.setDecomposition(1);
        Collections.sort(A0s2, A0w2);
        Collections.sort(A0s3);
        A0s.addAll(A0s2);
        A0s.addAll(A0s3);
        if (z) {
            i3++;
            C86654Ky.A0w(this.A02.A00, A0s, R.string.f11nameremoved);
        }
        if (i3 <= i || i < 0) {
            return AnonymousClass5VS.A00(r42, A0s, z2);
        }
        int size = A0s.size();
        Object[] objArr = new String[(size + 1)];
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i4] = A0s.get(i4);
        }
        return AnonymousClass5VS.A00(r42, AnonymousClass0x9.A1A(AnonymousClass0x2.A0Y(C54292oU.A00(this.A02), i3 - size, 0, R.plurals.f9nameremoved), objArr, size), z2);
    }

    public ArrayList A0Y(Context context, C108845de r9, List list) {
        int i;
        int i2;
        String A0Y;
        String A0H;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            AnonymousClass3ZH A0A2 = ((C64773Ex) this.A08.get()).A0A(A0P);
            if (this.A01.A0a(A0P) && C86644Kx.A1Z(this.A05)) {
                A0H = C100235Ac.A00(context, this, this.A03, A0A2);
            } else if (A0A2.A0H instanceof C135166kE) {
                z = true;
            } else {
                A0H = A0H(A0A2);
                if (A0H == null) {
                }
            }
            A0s.add(A0H);
        }
        if (z) {
            C162457s7.A0J(r9, 0);
            C162457s7.A0J(context, 1);
            int i3 = r9.A00;
            if (i3 == 0) {
                A0Y = context.getString(R.string.f11nameremoved);
            } else {
                Resources resources = context.getResources();
                if (i3 == 1) {
                    i = r9.A01.size();
                    i2 = R.plurals.f9nameremoved;
                } else if (i3 != 2) {
                    A0Y = "";
                    A0s.add(0, A0Y);
                } else {
                    i = r9.A02.size();
                    i2 = R.plurals.f9nameremoved;
                }
                A0Y = AnonymousClass0x2.A0Y(resources, i, 0, i2);
            }
            C162457s7.A0D(A0Y);
            A0s.add(0, A0Y);
        }
        return A0s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r5 == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        if (r1 != 1) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        if (r7.A0P() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0e(X.AnonymousClass3ZH r7, int r8) {
        /*
            r6 = this;
            boolean r5 = A05(r7)
            r1 = 1
            if (r8 == r1) goto L_0x000e
            r0 = 5
            if (r8 == r0) goto L_0x000e
            r0 = 7
            if (r8 == r0) goto L_0x000e
            r1 = 0
        L_0x000e:
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0015
            r2 = 1
            if (r5 != 0) goto L_0x0038
        L_0x0015:
            r2 = 0
            if (r5 != 0) goto L_0x0038
            int r1 = r7.A08
            r0 = 2
            if (r1 == r0) goto L_0x001f
            if (r1 != r3) goto L_0x003f
        L_0x001f:
            r1 = 1
        L_0x0020:
            X.4uZ r0 = r7.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x0037
            boolean r0 = X.AnonymousClass3ZH.A0E(r7)
            if (r0 == 0) goto L_0x0037
            if (r2 != 0) goto L_0x0037
            java.lang.String r0 = r7.A0L()
            if (r0 == 0) goto L_0x0036
            if (r1 == 0) goto L_0x0037
        L_0x0036:
            r4 = 1
        L_0x0037:
            return r4
        L_0x0038:
            boolean r0 = r7.A0P()
            if (r0 != 0) goto L_0x003f
            goto L_0x001f
        L_0x003f:
            r1 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZU.A0e(X.3ZH, int):boolean");
    }

    public final boolean A0g(Iterable iterable, Set set) {
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (this.A01.A0a(A0P)) {
                z = true;
            } else {
                set.add(((C64773Ex) this.A08.get()).A0A(A0P));
            }
        }
        return z;
    }
}
