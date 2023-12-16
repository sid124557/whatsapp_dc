package X;

import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.List;

/* renamed from: X.4Oj  reason: invalid class name and case insensitive filesystem */
public class C87194Oj extends BaseAdapter implements Filterable {
    public AnonymousClass5U2 A00 = new AnonymousClass5U2();
    public String A01;
    public List A02 = AnonymousClass001.A0s();
    public final Filter A03 = new C87284Ov(this);
    public final C64773Ex A04;
    public final C182338oF A05;
    public final C620733j A06;
    public final AnonymousClass1R1 A07;
    public final /* synthetic */ ConversationsFragment A08;

    public C87194Oj(C64773Ex r2, ConversationsFragment conversationsFragment, C182338oF r4, C620733j r5, AnonymousClass1R1 r6) {
        this.A08 = conversationsFragment;
        this.A04 = r2;
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r4;
    }

    public int getCount() {
        return this.A08.A34.size();
    }

    public Filter getFilter() {
        return this.A03;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A08.A34.get(i);
    }

    public long getItemId(int i) {
        return (long) this.A08.A34.get(i).hashCode();
    }

    public int getItemViewType(int i) {
        Object obj = this.A08.A34.get(i);
        if (obj instanceof AnonymousClass8G8) {
            return 1;
        }
        if (obj instanceof AnonymousClass8G7) {
            return 3;
        }
        return 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        r4.A00.BhD(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        if (r68 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        r1 = new android.util.DisplayMetrics();
        ((android.view.WindowManager) r2.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(r1);
        r4 = r1.heightPixels;
        r9 = X.C18280x3.A0D(r2).inflate(com.whatsapp.R.layout.f8nameremoved, r2, false);
        r0 = r4 / 3;
        r9.setPadding(r9.getPaddingLeft(), r0, r9.getPaddingRight(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a0, code lost:
        r2 = X.C18300x5.A0G(r9, com.whatsapp.R.id.no_filter_text);
        X.C18290x4.A1G(X.C06560Yg.A02(r9, com.whatsapp.R.id.to_view_all_chats), r8, 29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b3, code lost:
        switch(r7) {
            case -1730152220: goto L_0x00c4;
            case 72525144: goto L_0x00d0;
            case 1827283464: goto L_0x012c;
            default: goto L_0x00b6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b6, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Unexpected option: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c3, code lost:
        throw X.AnonymousClass000.A0F(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ca, code lost:
        if (r6.equals("CONTACTS_FILTER") == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cc, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d6, code lost:
        if (r6.equals("GROUP_FILTER") == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d8, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fd, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        r5.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0132, code lost:
        if (r6.equals("UNREAD_FILTER") == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0134, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0137, code lost:
        r2.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x022f, code lost:
        if (r2.equals(r8.A01) == false) goto L_0x0231;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r67, android.view.View r68, android.view.ViewGroup r69) {
        /*
            r66 = this;
            r2 = r69
            r9 = r68
            if (r69 == 0) goto L_0x0291
            r8 = r66
            com.whatsapp.conversationslist.ConversationsFragment r11 = r8.A08
            java.util.List r0 = r11.A34
            r10 = r67
            java.lang.Object r7 = r0.get(r10)
            X.659 r7 = (X.AnonymousClass659) r7
            if (r7 == 0) goto L_0x028b
            if (r68 == 0) goto L_0x0035
            java.lang.Object r0 = r9.getTag()
            boolean r0 = r0 instanceof com.whatsapp.conversationslist.ViewHolder
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r9.getTag()
            com.whatsapp.conversationslist.ViewHolder r1 = (com.whatsapp.conversationslist.ViewHolder) r1
            X.659 r0 = r1.A01
            boolean r0 = X.AnonymousClass75J.A00(r0, r7)
            if (r0 != 0) goto L_0x0035
            X.5ZN r0 = r1.A00
            if (r0 == 0) goto L_0x0035
            r0.A06()
        L_0x0035:
            boolean r0 = r7 instanceof X.AnonymousClass8G7
            r3 = 0
            if (r0 == 0) goto L_0x0105
            X.5PO r4 = r11.A1Z
            X.5U2 r0 = r11.A1N()
            long r0 = r0.A00
            X.8G7 r7 = (X.AnonymousClass8G7) r7
            java.lang.String r6 = r7.A00
            X.4sJ r5 = new X.4sJ
            r5.<init>()
            r7 = 46
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.A00 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r5.A03 = r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A04 = r0
            int r7 = r6.hashCode()
            r1 = 2
            switch(r7) {
                case -1730152220: goto L_0x00f3;
                case 72525144: goto L_0x00e9;
                case 1827283464: goto L_0x00dc;
                default: goto L_0x0067;
            }
        L_0x0067:
            X.4FV r0 = r4.A00
            r0.BhD(r5)
            if (r68 != 0) goto L_0x00a0
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r4 = r1.heightPixels
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r2)
            r0 = 2131624686(0x7f0e02ee, float:1.8876559E38)
            android.view.View r9 = r1.inflate(r0, r2, r3)
            int r2 = r9.getPaddingLeft()
            int r1 = r9.getPaddingRight()
            int r0 = r4 / 3
            r9.setPadding(r2, r0, r1, r0)
        L_0x00a0:
            r0 = 2131431834(0x7f0b119a, float:1.8485408E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r9, r0)
            r0 = 2131434323(0x7f0b1b53, float:1.8490457E38)
            android.view.View r1 = X.C06560Yg.A02(r9, r0)
            r0 = 29
            X.C18290x4.A1G(r1, r8, r0)
            switch(r7) {
                case -1730152220: goto L_0x00c4;
                case 72525144: goto L_0x00d0;
                case 1827283464: goto L_0x012c;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected option: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r6, r1)
            throw r0
        L_0x00c4:
            java.lang.String r0 = "CONTACTS_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00b6
            r0 = 2131891188(0x7f1213f4, float:1.941709E38)
            goto L_0x0137
        L_0x00d0:
            java.lang.String r0 = "GROUP_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00b6
            r0 = 2131891198(0x7f1213fe, float:1.941711E38)
            goto L_0x0137
        L_0x00dc:
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0101
        L_0x00e9:
            java.lang.String r0 = "GROUP_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0067
            r0 = 3
            goto L_0x00fd
        L_0x00f3:
            java.lang.String r0 = "CONTACTS_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0067
            r0 = 10
        L_0x00fd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0101:
            r5.A01 = r0
            goto L_0x0067
        L_0x0105:
            boolean r0 = r7 instanceof X.AnonymousClass8G8
            if (r0 == 0) goto L_0x013b
            if (r68 != 0) goto L_0x0116
            android.view.LayoutInflater r1 = X.C86634Kw.A0K(r11)
            r0 = 2131625307(0x7f0e055b, float:1.8877818E38)
            android.view.View r9 = r1.inflate(r0, r2, r3)
        L_0x0116:
            android.widget.TextView r1 = X.C86614Ku.A0I(r9)
            X.C106905aM.A04(r1)
            X.8G8 r7 = (X.AnonymousClass8G8) r7
            java.lang.String r0 = r7.A00
            r1.setText(r0)
            X.8oF r0 = r8.A05
            if (r0 == 0) goto L_0x013a
            r0.Bah(r10)
            return r9
        L_0x012c:
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00b6
            r0 = 2131891241(0x7f121429, float:1.9417196E38)
        L_0x0137:
            r2.setText(r0)
        L_0x013a:
            return r9
        L_0x013b:
            if (r68 != 0) goto L_0x0284
            r1 = 2131624692(0x7f0e02f4, float:1.887657E38)
            android.view.LayoutInflater r0 = X.C18280x3.A0D(r2)
            android.view.View r9 = X.AnonymousClass001.A0R(r0, r2, r1)
            android.content.Context r16 = r2.getContext()
            X.2oU r0 = r11.A1j
            r35 = r0
            X.2sH r0 = r11.A1i
            r34 = r0
            X.1VX r0 = r11.A24
            r46 = r0
            X.3Wi r0 = r11.A0i
            r65 = r0
            X.5Xz r0 = r11.A2N
            r51 = r0
            X.2sr r0 = r11.A0j
            r64 = r0
            X.4FS r0 = r11.A2u
            r59 = r0
            X.2sS r0 = r11.A0y
            r25 = r0
            X.2ss r0 = r11.A1o
            r40 = r0
            X.3LP r0 = r11.A25
            r47 = r0
            X.9Wq r0 = r11.A2X
            r54 = r0
            X.5UX r0 = r11.A18
            r27 = r0
            X.3Ex r0 = r8.A04
            r28 = r0
            X.2nK r0 = r11.A0d
            r63 = r0
            X.2cU r0 = r11.A1r
            r41 = r0
            X.33i r0 = r11.A1g
            r33 = r0
            X.5ZU r0 = r11.A1B
            r29 = r0
            X.33j r0 = r8.A06
            r37 = r0
            X.2rN r0 = r11.A2q
            r57 = r0
            X.9U4 r0 = r11.A2V
            r53 = r0
            X.2sq r0 = r11.A0w
            r62 = r0
            X.2rV r0 = r11.A1w
            r43 = r0
            X.5rC r0 = r11.A0O
            r61 = r0
            X.2lX r0 = r11.A2B
            r24 = r0
            X.2sW r0 = r11.A1m
            r23 = r0
            X.1R1 r0 = r8.A07
            r22 = r0
            X.33f r0 = r11.A20
            r21 = r0
            X.2R8 r0 = r11.A22
            r20 = r0
            X.33p r0 = r11.A1k
            r19 = r0
            X.2so r0 = r11.A13
            r18 = r0
            X.2rn r0 = r11.A1u
            r17 = r0
            X.99n r15 = r11.A2U
            X.35q r14 = r11.A0k
            r58 = 0
            X.5Uq r13 = r11.A1E
            X.5Mz r12 = r11.A1S
            X.5rC r6 = r11.A0M
            X.2hp r5 = r11.A2f
            X.2Sx r4 = r11.A2J
            X.2Gt r3 = r11.A2I
            X.8qC r2 = r11.A2z
            X.2sA r1 = r11.A1n
            com.whatsapp.conversationslist.ViewHolder r0 = new com.whatsapp.conversationslist.ViewHolder
            r26 = r18
            r30 = r13
            r31 = r12
            r32 = r11
            r36 = r19
            r38 = r23
            r39 = r1
            r42 = r17
            r44 = r21
            r45 = r20
            r48 = r24
            r49 = r3
            r50 = r4
            r52 = r15
            r55 = r5
            r56 = r22
            r60 = r2
            r15 = r0
            r17 = r9
            r18 = r61
            r19 = r6
            r20 = r63
            r21 = r65
            r22 = r64
            r23 = r14
            r24 = r62
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
        L_0x0216:
            r9.setTag(r0)
            X.08A r1 = r11.A0L
            r1.A00(r0)
            X.4uZ r1 = r7.B8o()
            java.lang.String r2 = X.C627336j.A07(r1)
            if (r2 == 0) goto L_0x0231
            java.lang.String r1 = r8.A01
            boolean r2 = r2.equals(r1)
            r1 = 1
            if (r2 != 0) goto L_0x0232
        L_0x0231:
            r1 = 0
        L_0x0232:
            android.view.View r2 = r0.A04
            int r1 = X.C86614Ku.A09(r1)
            r2.setVisibility(r1)
            X.4uZ r1 = r7.B8o()
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r1)
            com.whatsapp.status.viewmodels.StatusesViewModel r1 = r11.A2i
            if (r1 == 0) goto L_0x0282
            if (r2 == 0) goto L_0x0282
            X.5OF r14 = r1.A0D(r2)
        L_0x024d:
            r11.A1H()
            android.widget.ListView r1 = r11.A04
            int r2 = r1.getFirstVisiblePosition()
            r17 = 0
            boolean r1 = r11.A39
            if (r1 != 0) goto L_0x027b
            if (r2 != 0) goto L_0x0260
        L_0x025e:
            r17 = 1
        L_0x0260:
            boolean r1 = r11.A1p()
            if (r1 == 0) goto L_0x0276
            r15 = 10
        L_0x0268:
            X.8oF r1 = r8.A05
            r11 = r0
            r12 = r7
            r13 = r1
            r16 = r10
            r11.A0D(r12, r13, r14, r15, r16, r17)
            com.whatsapp.conversationslist.ConversationsFragment.A02(r9)
            return r9
        L_0x0276:
            int r15 = r11.A1K()
            goto L_0x0268
        L_0x027b:
            if (r2 != 0) goto L_0x0260
            int r1 = r11.A02
            if (r10 >= r1) goto L_0x0260
            goto L_0x025e
        L_0x0282:
            r14 = 0
            goto L_0x024d
        L_0x0284:
            java.lang.Object r0 = r9.getTag()
            com.whatsapp.conversationslist.ViewHolder r0 = (com.whatsapp.conversationslist.ViewHolder) r0
            goto L_0x0216
        L_0x028b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0291:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87194Oj.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 4;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isEmpty() {
        if (!super.isEmpty()) {
            return false;
        }
        ConversationsFragment conversationsFragment = this.A08;
        if ((conversationsFragment.A00 != 0 || conversationsFragment.A3D) && TextUtils.isEmpty(this.A00.A01)) {
            return false;
        }
        return true;
    }
}
