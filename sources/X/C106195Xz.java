package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5Xz  reason: invalid class name and case insensitive filesystem */
public final class C106195Xz {
    public static final Pattern A0A = Pattern.compile("(@\\d+(?:(?:-\\d+)?@g\\.us)?)");
    public static final boolean A0B = Character.isDefined(8296);
    public static final boolean A0C = Character.isDefined(8297);
    public final C56972sr A00;
    public final C56942so A01;
    public final AnonymousClass67D A02;
    public final AnonymousClass33U A03;
    public final C64773Ex A04;
    public final AnonymousClass5ZU A05;
    public final C54292oU A06;
    public final C56982ss A07;
    public final C56892sj A08;
    public final C183538qC A09;

    public void A05(Context context, SpannableStringBuilder spannableStringBuilder, C95814uZ r9, List list) {
        C95814uZ r2 = r9;
        A06(spannableStringBuilder, new C114935nq(context, r2, this, C18290x4.A00(context), false), list);
    }

    public static void A00(C52882mC r3, Object obj, AbstractCollection abstractCollection) {
        GroupJid groupJid = r3.A02;
        if (!AnonymousClass75J.A00(obj, groupJid)) {
            abstractCollection.add(new AnonymousClass3ZM(groupJid, r3.A03));
        }
    }

    public AnonymousClass7HU A01(AnonymousClass3ZH r5, GroupJid groupJid) {
        String str;
        AnonymousClass5ZU r3 = this.A05;
        AnonymousClass7HU A0D = r3.A0D(r5, r3.A06(r5, groupJid), false, true);
        StringBuilder A0o = AnonymousClass001.A0o();
        String str2 = "";
        if (A0B) {
            str = "⁨";
        } else {
            str = str2;
        }
        A0o.append(str);
        A0o.append(A0D.A01);
        if (A0C) {
            str2 = "⁩";
        }
        return new AnonymousClass7HU(A0D.A00, AnonymousClass000.A0X(str2, A0o));
    }

    public CharSequence A02(Context context, C624134x r4, CharSequence charSequence) {
        List list = r4.A18;
        if (list == null || list.isEmpty()) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        C18290x4.A00(context);
        A06(valueOf, (C182748ov) null, list);
        return valueOf;
    }

    public void A06(SpannableStringBuilder spannableStringBuilder, C182748ov r11, List list) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(spannableStringBuilder)) {
            HashMap A0t = AnonymousClass001.A0t();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZM r2 = (AnonymousClass3ZM) it.next();
                if (r2 != null) {
                    A0t.put(C624435a.A00(r2), AnonymousClass0x9.A0G(r2, (Object) null));
                }
            }
            Matcher matcher = A0A.matcher(spannableStringBuilder);
            int i = 0;
            while (matcher.find()) {
                String group = matcher.group();
                AnonymousClass0PJ r1 = (AnonymousClass0PJ) A0t.get(group);
                if (r1 != null) {
                    if (r1.A01 == null) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("@");
                        AnonymousClass3ZM r12 = (AnonymousClass3ZM) r1.A00;
                        r1 = AnonymousClass0x9.A0G(r12, AnonymousClass000.A0X(A03(r12), A0o));
                        A0t.put(group, r1);
                    }
                    Object obj = r1.A00;
                    if (obj == null) {
                        C626936e.A0D(false, "Mentions/null mention after map population");
                    } else {
                        int start = matcher.start() + i;
                        String str = (String) r1.A01;
                        int length = group.length();
                        spannableStringBuilder.replace(start, length + start, str);
                        int length2 = str.length();
                        i += length2 - length;
                        if (r11 != null) {
                            r11.BZw(spannableStringBuilder, (AnonymousClass3ZM) obj, start, length2 + start);
                        }
                    }
                }
            }
        }
    }

    public C106195Xz(C56972sr r1, C56942so r2, AnonymousClass67D r3, AnonymousClass33U r4, C64773Ex r5, AnonymousClass5ZU r6, C54292oU r7, C56982ss r8, C56892sj r9, C183538qC r10) {
        this.A00 = r1;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A05 = r6;
        this.A09 = r10;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A08 = r9;
    }

    public String A03(AnonymousClass3ZM r8) {
        String str;
        String A022;
        StringBuilder A0o = AnonymousClass001.A0o();
        String str2 = "";
        if (A0B) {
            str = "⁨";
        } else {
            str = str2;
        }
        A0o.append(str);
        C95814uZ r1 = r8.A00;
        if (!(r1 instanceof GroupJid) || (A022 = r8.A01) == null) {
            C64773Ex r0 = this.A04;
            AnonymousClass3ZH A082 = r0.A08(r1);
            if (A082 == null) {
                A082 = r0.A0A(r1);
            }
            if (A082.A0U()) {
                A022 = this.A05.A0H(A082);
                if (A022 == null) {
                    A022 = C54292oU.A00(this.A06).getString(R.string.f11nameremoved);
                }
            } else if (A082.A0V()) {
                A022 = this.A05.A0S(A082, false);
            } else if (!AnonymousClass3ZH.A0E(A082)) {
                A022 = A082.A0J();
            } else if (TextUtils.isEmpty(A082.A0b)) {
                A022 = AnonymousClass36P.A02(A082);
            } else if (!C56972sr.A08(this.A00, A082)) {
                C54292oU r3 = this.A06;
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = A082.A0b;
                A022 = C54292oU.A00(r3).getString(R.string.f11nameremoved, A0L);
            } else {
                A022 = A082.A0b;
            }
        }
        A0o.append(A022);
        if (A0C) {
            str2 = "⁩";
        }
        return AnonymousClass000.A0X(str2, A0o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f A[LOOP:2: B:24:0x0089->B:26:0x008f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5 A[LOOP:3: B:28:0x009f->B:30:0x00a5, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A04(com.whatsapp.jid.GroupJid r12) {
        /*
            r11 = this;
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.2so r2 = r11.A01
            X.1fJ r1 = X.AnonymousClass34R.A01(r12)
            if (r1 == 0) goto L_0x0071
            X.2rM r0 = r2.A0H
            r0.A04()
            java.util.Map r0 = r0.A03
            java.lang.Object r8 = r0.get(r1)
            X.1fJ r8 = (X.C27991fJ) r8
            if (r8 == 0) goto L_0x0071
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            X.2L1 r10 = r2.A0I
            X.2rM r9 = r10.A01
            r1 = 6
            X.4KD r0 = new X.4KD
            r0.<init>(r10, r1)
            java.util.Set r0 = r9.A02(r0, r8)
            java.util.Iterator r2 = r0.iterator()
            r5 = 0
        L_0x0036:
            boolean r0 = r2.hasNext()
            r3 = 3
            if (r0 == 0) goto L_0x004d
            java.lang.Object r1 = r2.next()
            X.2mC r1 = (X.C52882mC) r1
            int r0 = r1.A00
            if (r0 != r3) goto L_0x0049
            r5 = r1
            goto L_0x0036
        L_0x0049:
            r7.add(r1)
            goto L_0x0036
        L_0x004d:
            r1 = 5
            X.4KD r0 = new X.4KD
            r0.<init>(r10, r1)
            java.util.Set r0 = r9.A02(r0, r8)
            java.util.Iterator r2 = r0.iterator()
        L_0x005b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = r2.next()
            X.2mC r1 = (X.C52882mC) r1
            int r0 = r1.A00
            if (r0 != r3) goto L_0x006d
            r5 = r1
            goto L_0x005b
        L_0x006d:
            r6.add(r1)
            goto L_0x005b
        L_0x0071:
            X.5XV r2 = new X.5XV
            r2.<init>()
            goto L_0x007c
        L_0x0077:
            X.5XV r2 = new X.5XV
            r2.<init>(r5, r8, r7, r6)
        L_0x007c:
            X.2mC r0 = r2.A00
            if (r0 == 0) goto L_0x0083
            A00(r0, r12, r4)
        L_0x0083:
            java.util.List r0 = r2.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x0089:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r1.next()
            X.2mC r0 = (X.C52882mC) r0
            A00(r0, r12, r4)
            goto L_0x0089
        L_0x0099:
            java.util.List r0 = r2.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x009f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r1.next()
            X.2mC r0 = (X.C52882mC) r0
            A00(r0, r12, r4)
            goto L_0x009f
        L_0x00af:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106195Xz.A04(com.whatsapp.jid.GroupJid):java.util.List");
    }
}
