package X;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* renamed from: X.2s8  reason: invalid class name and case insensitive filesystem */
public class C56532s8 {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass0PJ A03;
    public C95814uZ A04;
    public AnonymousClass2T7 A05;
    public C108795dZ A06;
    public Boolean A07 = null;
    public Boolean A08 = null;
    public CharSequence A09;
    public List A0A;
    public List A0B = null;
    public List A0C;
    public List A0D;
    public Map A0E;
    public boolean A0F = true;
    public boolean A0G = true;
    public final C620733j A0H;
    public final Object A0I = AnonymousClass002.A0D();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A01() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A08
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56532s8.A01():java.lang.Boolean");
    }

    public String A02() {
        if (this.A09 == null) {
            AnonymousClass0PJ r0 = this.A03;
            if (r0 == null) {
                return "";
            }
            Object obj = r0.A01;
            C626936e.A06(obj);
            if (((List) obj).isEmpty()) {
                return "";
            }
        }
        CharSequence charSequence = this.A09;
        if (charSequence == null) {
            return TextUtils.join(" ", A04());
        }
        return charSequence.toString();
    }

    public List A03() {
        AnonymousClass0PJ A002;
        List list;
        AnonymousClass0PJ r0 = this.A03;
        if (r0 != null && (list = (List) r0.A00) != null && !list.isEmpty()) {
            return list;
        }
        if (TextUtils.isEmpty(this.A09)) {
            A002 = AnonymousClass0x9.A0G(AnonymousClass001.A0s(), AnonymousClass001.A0s());
        } else {
            A002 = C107155an.A00(this.A0H, A02(), false);
        }
        this.A03 = A002;
        Object obj = A002.A00;
        C626936e.A06(obj);
        return (List) obj;
    }

    public List A04() {
        AnonymousClass0PJ A002;
        List list;
        AnonymousClass0PJ r0 = this.A03;
        if (r0 != null && (list = (List) r0.A01) != null && !list.isEmpty()) {
            return list;
        }
        if (TextUtils.isEmpty(this.A09)) {
            A002 = AnonymousClass0x9.A0G(AnonymousClass001.A0s(), AnonymousClass001.A0s());
        } else {
            A002 = C107155an.A00(this.A0H, A02(), false);
        }
        this.A03 = A002;
        Object obj = A002.A01;
        C626936e.A06(obj);
        return (List) obj;
    }

    public void A05(CharSequence charSequence) {
        this.A09 = charSequence;
        this.A03 = null;
    }

    public void A06(List list) {
        if (list == null) {
            list = AnonymousClass001.A0s();
        }
        if (this.A03 == null) {
            this.A03 = AnonymousClass0x9.A0G(AnonymousClass001.A0s(), list);
        }
        this.A09 = null;
    }

    public C56532s8(C620733j r2) {
        this.A0H = r2;
    }

    public static boolean A00(C56532s8 r0) {
        return !r0.A04().isEmpty();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(super.toString());
        A0o.append("\n\tnormal: \"");
        A0o.append(A02());
        A0o.append("\";\ttokens: ");
        A0o.append(A04());
        A0o.append("\n\tlabel: \"");
        Object obj = this.A0D;
        if (obj == null) {
            obj = AnonymousClass001.A0s();
        }
        A0o.append(obj);
        A0o.append("\";\tjid: ");
        A0o.append(this.A04);
        A0o.append("\";\tstarred: ");
        A0o.append(A01());
        A0o.append("\n\tpage: ");
        A0o.append(this.A00);
        A0o.append("; pageSize: ");
        A0o.append(this.A01);
        A0o.append("\n\tcontact filters:");
        A0o.append(this.A0A);
        A0o.append("\n\tcontact prefilters:");
        A0o.append(this.A0B);
        A0o.append("\n\tmapping: ");
        return AnonymousClass000.A0R(A03(), A0o);
    }
}
