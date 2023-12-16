package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Ok  reason: invalid class name and case insensitive filesystem */
public final class C87204Ok extends BaseAdapter implements Filterable {
    public C372821q A00 = C372821q.SUBSCRIBED;
    public String A01;
    public ArrayList A02;
    public final LayoutInflater A03;
    public final Filter A04 = new C87264Ot(this);
    public final AnonymousClass5M2 A05;
    public final C56972sr A06;
    public final AnonymousClass64J A07;
    public final AnonymousClass5ZU A08;
    public final C105365Uq A09;
    public final C620733j A0A;
    public final AnonymousClass1VX A0B;
    public final NewsletterInfoActivity A0C;
    public final List A0D = AnonymousClass001.A0s();
    public final List A0E = AnonymousClass001.A0s();
    public final AnonymousClass66R A0F = C154517dI.A01(new C119855xe(this));
    public final AnonymousClass66R A0G = C154517dI.A01(new C119865xf(this));
    public final AnonymousClass66R A0H = C154517dI.A01(new C119875xg(this));

    public final void A00(String str) {
        this.A01 = str;
        if (str == null || str.length() == 0) {
            List list = this.A0D;
            List list2 = this.A0E;
            list2.clear();
            list2.addAll(list);
            ArrayList A032 = C107155an.A03(this.A0A, this.A01);
            C162457s7.A0D(A032);
            this.A02 = A032;
            notifyDataSetChanged();
            return;
        }
        getFilter().filter(str);
    }

    public int getCount() {
        return this.A0E.size();
    }

    public Filter getFilter() {
        return this.A04;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A0E.get(i);
    }

    public int getItemViewType(int i) {
        Object obj = this.A0E.get(i);
        if (obj instanceof C115005nx) {
            return 0;
        }
        if (obj instanceof C114995nw) {
            return 1;
        }
        if (obj instanceof C115015ny) {
            return 2;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013b, code lost:
        if (r2 != r4) goto L_0x013d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r20, android.view.View r21, android.view.ViewGroup r22) {
        /*
            r19 = this;
            r3 = r21
            r0 = 2
            r5 = r22
            X.C162457s7.A0J(r5, r0)
            r6 = r19
            java.util.List r0 = r6.A0E
            r1 = r20
            java.lang.Object r2 = r0.get(r1)
            X.641 r2 = (X.AnonymousClass641) r2
            if (r21 != 0) goto L_0x0034
            int r4 = r6.getItemViewType(r1)
            r3 = 0
            if (r4 == 0) goto L_0x0059
            r0 = 1
            if (r4 == r0) goto L_0x004a
            r0 = 2
            if (r4 != r0) goto L_0x01c4
            android.view.LayoutInflater r1 = r6.A03
            r0 = 2131625539(0x7f0e0643, float:1.8878289E38)
            android.view.View r3 = X.C18310x6.A0I(r1, r5, r0, r3)
            X.4x2 r0 = new X.4x2
            r0.<init>(r3, r6)
        L_0x0031:
            r3.setTag(r0)
        L_0x0034:
            java.lang.Object r5 = r3.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterMembersListAdapter.ViewHolder"
            X.C162457s7.A0K(r5, r0)
            X.5Mc r5 = (X.C103245Mc) r5
            java.util.ArrayList r0 = r6.A02
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "filterTerms"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x004a:
            android.view.LayoutInflater r1 = r6.A03
            r0 = 2131625549(0x7f0e064d, float:1.887831E38)
            android.view.View r3 = X.C18310x6.A0I(r1, r5, r0, r3)
            X.4x1 r0 = new X.4x1
            r0.<init>(r3, r6)
            goto L_0x0031
        L_0x0059:
            android.view.LayoutInflater r1 = r6.A03
            r0 = 2131625550(0x7f0e064e, float:1.8878311E38)
            android.view.View r3 = X.C18310x6.A0I(r1, r5, r0, r3)
            X.4x3 r0 = new X.4x3
            r0.<init>(r3, r6)
            goto L_0x0031
        L_0x0068:
            boolean r0 = r5 instanceof X.C96834x2
            if (r0 == 0) goto L_0x0088
            X.4x2 r5 = (X.C96834x2) r5
            r8 = 0
            X.C162457s7.A0J(r2, r8)
            r7 = 1
            r5.A00 = r2
            X.5ny r2 = (X.C115015ny) r2
            java.lang.String r6 = r2.A00
            int r0 = r6.length()
            if (r0 != 0) goto L_0x01a1
            com.whatsapp.WaTextView r1 = r5.A00
            r0 = 2131893370(0x7f121c7a, float:1.9421515E38)
            r1.setText(r0)
        L_0x0087:
            return r3
        L_0x0088:
            boolean r0 = r5 instanceof X.C96844x3
            if (r0 == 0) goto L_0x01b2
            X.4x3 r5 = (X.C96844x3) r5
            r10 = 0
            X.C162457s7.A0J(r2, r10)
            r5.A00 = r2
            boolean r0 = r2 instanceof X.C115005nx
            X.C626936e.A0C(r0)
            X.5nx r2 = (X.C115005nx) r2
            X.5Ih r8 = r2.A00
            X.3ZH r9 = r8.A00
            X.4uZ r0 = r9.A0H
            X.4Ok r7 = r5.A05
            X.2sr r11 = r7.A06
            boolean r6 = r11.A0a(r0)
            X.5YB r4 = r5.A02
            r0 = 0
            com.whatsapp.TextEmojiLabel r2 = r4.A02
            r2.setText(r0)
            com.whatsapp.newsletter.NewsletterInfoActivity r12 = r7.A0C
            r1 = 2130969995(0x7f04058b, float:1.7548688E38)
            r0 = 2131101335(0x7f060697, float:1.7815077E38)
            X.AnonymousClass5Yj.A0B(r12, r2, r1, r0)
            com.whatsapp.TextEmojiLabel r2 = r5.A01
            r0 = 2131101333(0x7f060695, float:1.7815073E38)
            X.AnonymousClass0x2.A0q(r12, r2, r0)
            X.21q r1 = r8.A02
            r12 = r6
            X.5UY r0 = r5.A04
            r16 = r0
            android.view.View r13 = r16.A04()
            X.C162457s7.A0D(r13)
            X.66R r0 = r7.A0F
            r18 = r0
            boolean r0 = X.C18270x1.A1V(r18)
            r14 = 0
            if (r0 == 0) goto L_0x00ef
            r0 = 2
            X.21q[] r15 = new X.C372821q[r0]
            X.21q r0 = X.C372821q.ADMIN
            r15[r10] = r0
            r12 = 1
            X.21q r0 = X.C372821q.OWNER
            java.util.List r0 = X.AnonymousClass0x9.A19(r0, r15, r12)
            boolean r12 = r0.contains(r1)
        L_0x00ef:
            if (r12 != 0) goto L_0x00f3
            r14 = 8
        L_0x00f3:
            r13.setVisibility(r14)
            boolean r0 = X.C18270x1.A1V(r18)
            if (r0 == 0) goto L_0x010c
            X.21q r0 = X.C372821q.ADMIN
            if (r1 != r0) goto L_0x0192
            android.view.View r1 = r16.A04()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131890973(0x7f12131d, float:1.9416653E38)
        L_0x0109:
            r1.setText(r0)
        L_0x010c:
            if (r6 == 0) goto L_0x0161
            r4.A05()
            X.5Uq r4 = r7.A09
            X.1RR r1 = X.C86634Kw.A0V(r11)
            com.whatsapp.WaImageView r0 = r5.A03
            r4.A08(r0, r1)
            r0 = 2131891053(0x7f12136d, float:1.9416815E38)
            r2.setText(r0)
        L_0x0122:
            X.21q r0 = r7.A00
            X.21q r4 = X.C372821q.ADMIN
            boolean r0 = X.AnonymousClass000.A1Y(r0, r4)
            r6 = r6 & r0
            X.66R r0 = r7.A0G
            boolean r0 = X.C18270x1.A1V(r0)
            r6 = r6 & r0
            X.21q r2 = r7.A00
            X.21q r0 = X.C372821q.OWNER
            r1 = 1
            if (r2 == r0) goto L_0x013d
            r1 = 0
            r0 = 1
            if (r2 == r4) goto L_0x013e
        L_0x013d:
            r0 = 0
        L_0x013e:
            r1 = r1 | r0
            boolean r0 = X.C18270x1.A1V(r18)
            r1 = r1 & r0
            r6 = r6 | r1
            android.view.View r2 = r5.A00
            r2.setClickable(r6)
            if (r6 == 0) goto L_0x0087
            r1 = 1
            X.6Bd r0 = new X.6Bd
            r0.<init>(r8, r1, r7)
            r2.setOnCreateContextMenuListener(r0)
            r0 = 20
            X.C18300x5.A19(r2, r5, r0)
            r0 = 2131233591(0x7f080b37, float:1.8083324E38)
            r2.setBackgroundResource(r0)
            return r3
        L_0x0161:
            X.5ZU r1 = r7.A08
            r0 = 2
            X.7HU r13 = r1.A0B(r9, r0)
            X.C162457s7.A0D(r13)
            r11 = 0
            boolean r17 = r9.A0W()
            r14 = r9
            r15 = r11
            r16 = r0
            r12 = r4
            r12.A07(r13, r14, r15, r16, r17)
            X.5Uq r1 = r7.A09
            com.whatsapp.WaImageView r0 = r5.A03
            r1.A08(r0, r9)
            java.lang.String r0 = r9.A0X
            if (r0 == 0) goto L_0x018c
            r2.setVisibility(r10)
            java.lang.String r0 = r9.A0X
            r2.A0K(r11, r0)
            goto L_0x0122
        L_0x018c:
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x0122
        L_0x0192:
            X.21q r0 = X.C372821q.OWNER
            if (r1 != r0) goto L_0x010c
            android.view.View r1 = r16.A04()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131891103(0x7f12139f, float:1.9416917E38)
            goto L_0x0109
        L_0x01a1:
            com.whatsapp.WaTextView r4 = r5.A00
            X.4Ok r0 = r5.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = r0.A0C
            r1 = 2131893369(0x7f121c79, float:1.9421513E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r6
            X.AnonymousClass001.A0y(r2, r4, r0, r1)
            return r3
        L_0x01b2:
            X.4x1 r5 = (X.C96824x1) r5
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            r5.A00 = r2
            android.widget.LinearLayout r2 = r5.A00
            X.4Ok r1 = r5.A01
            r0 = 14
            X.C989653x.A00(r2, r1, r0)
            return r3
        L_0x01c4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown type: "
            java.lang.IllegalStateException r0 = X.C86604Kt.A0h(r0, r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87204Ok.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 3;
    }

    public C87204Ok(LayoutInflater layoutInflater, AnonymousClass5M2 r3, C56972sr r4, AnonymousClass64J r5, AnonymousClass5ZU r6, C105365Uq r7, C620733j r8, AnonymousClass1VX r9, NewsletterInfoActivity newsletterInfoActivity) {
        C18260x0.A0f(r9, r4, r8, r6, r5);
        C162457s7.A0J(r3, 6);
        this.A0B = r9;
        this.A06 = r4;
        this.A0A = r8;
        this.A08 = r6;
        this.A07 = r5;
        this.A05 = r3;
        this.A0C = newsletterInfoActivity;
        this.A03 = layoutInflater;
        this.A09 = r7;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
