package X;

import android.content.Context;
import android.view.LayoutInflater;
import java.util.Map;

/* renamed from: X.1Pu  reason: invalid class name and case insensitive filesystem */
public final class C22711Pu extends C19400zX {
    public Map A00 = C72043d5.A00();
    public final LayoutInflater A01;
    public final AnonymousClass1VX A02;
    public final C95804uY A03;
    public final AnonymousClass4GQ A04;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0087, code lost:
        if (r11.A0Y(r10, 6148) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0089, code lost:
        r8.setVisibility(0);
        r1 = X.AnonymousClass002.A0L();
        r1[0] = r7.getString(X.AnonymousClass28I.A00(r9.A02));
        X.AnonymousClass001.A0y(r7, r8, r1, com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a2, code lost:
        r2.findViewById(com.whatsapp.R.id.bullet).setVisibility(8);
        r2.findViewById(com.whatsapp.R.id.recipient_name).setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b6, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cf, code lost:
        r12.setOnClickListener(r1);
        r12.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d9, code lost:
        if (r9 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00dc, code lost:
        r8.setVisibility(8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r14, android.view.View r15, android.view.ViewGroup r16) {
        /*
            r13 = this;
            r0 = 2
            r4 = r16
            X.C162457s7.A0J(r4, r0)
            r3 = 0
            if (r15 != 0) goto L_0x00e0
            android.view.LayoutInflater r1 = r13.A01
            r0 = 2131625533(0x7f0e063d, float:1.8878277E38)
            android.view.View r2 = r1.inflate(r0, r4, r3)
        L_0x0012:
            r0 = 2131428711(0x7f0b0567, float:1.8479074E38)
            android.view.View r1 = r2.findViewById(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r0 = r1.getChildAt(r3)
            android.view.View r3 = super.getView(r14, r0, r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.conversation.conversationrow.ConversationRow"
            X.C162457s7.A0K(r3, r0)
            X.4oK r3 = (X.C93324oK) r3
            if (r15 != 0) goto L_0x0030
            r1.addView(r3)
        L_0x0030:
            r0 = 2131431724(0x7f0b112c, float:1.8485185E38)
            android.view.View r1 = r2.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            r0 = 2131231730(0x7f0803f2, float:1.807955E38)
            r1.setIcon((int) r0)
            r0 = 6
            X.C634339f.A00(r1, r3, r13, r0)
            X.34x r0 = r3.getFMessage()
            long r3 = r0.A1M
            r0 = 2131431785(0x7f0b1169, float:1.848531E38)
            android.widget.TextView r12 = X.AnonymousClass002.A09(r2, r0)
            r0 = 2131431808(0x7f0b1180, float:1.8485356E38)
            android.widget.TextView r8 = X.AnonymousClass002.A09(r2, r0)
            android.content.Context r7 = r2.getContext()
            java.util.Map r1 = r13.A00
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.Object r9 = r1.get(r0)
            X.1hG r9 = (X.C28531hG) r9
            X.1VX r11 = r13.A02
            r0 = 6321(0x18b1, float:8.858E-42)
            X.2vE r10 = X.C58422vE.A02
            boolean r0 = r11.A0Y(r10, r0)
            r5 = 8
            r6 = 0
            if (r0 == 0) goto L_0x00d6
            if (r9 == 0) goto L_0x00d6
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r9.A01
            int r0 = r0.ordinal()
            switch(r0) {
                case -1: goto L_0x00d6;
                case 0: goto L_0x00d6;
                case 1: goto L_0x00b7;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00b7;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00d6;
                default: goto L_0x0081;
            }
        L_0x0081:
            r0 = 6148(0x1804, float:8.615E-42)
            boolean r0 = r11.A0Y(r10, r0)
            if (r0 == 0) goto L_0x00dc
            r8.setVisibility(r6)
            r3 = 2131891150(0x7f1213ce, float:1.9417012E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory r0 = r9.A02
            int r0 = X.AnonymousClass28I.A00(r0)
            java.lang.String r0 = r7.getString(r0)
            r1[r6] = r0
            X.AnonymousClass001.A0y(r7, r8, r1, r3)
        L_0x00a2:
            r0 = 2131428218(0x7f0b037a, float:1.8478074E38)
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r5)
            r0 = 2131432905(0x7f0b15c9, float:1.848758E38)
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r5)
            return r2
        L_0x00b7:
            r0 = 2131893428(0x7f121cb4, float:1.9421632E38)
            r12.setText(r0)
            r0 = 4
            X.5el r1 = new X.5el
            r1.<init>(r7, r13, r9, r0)
            goto L_0x00cf
        L_0x00c4:
            r0 = 2131893158(0x7f121ba6, float:1.9421085E38)
            r12.setText(r0)
            X.39g r1 = new X.39g
            r1.<init>(r7, r13, r3)
        L_0x00cf:
            r12.setOnClickListener(r1)
            r12.setVisibility(r6)
            goto L_0x0081
        L_0x00d6:
            r12.setVisibility(r5)
            if (r9 == 0) goto L_0x00dc
            goto L_0x0081
        L_0x00dc:
            r8.setVisibility(r5)
            goto L_0x00a2
        L_0x00e0:
            r2 = r15
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22711Pu.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22711Pu(Context context, C56972sr r13, C64773Ex r14, C105365Uq r15, C105165Tv r16, AnonymousClass677 r17, AnonymousClass1VX r18, C95804uY r19, C55832qz r20, AnonymousClass543 r21, AnonymousClass4GQ r22) {
        super(context, r13, r14, r15, r16, r17, r20, r21);
        C95804uY r1 = r19;
        C162457s7.A0J(r1, 10);
        this.A02 = r18;
        this.A03 = r1;
        this.A04 = r22;
        LayoutInflater from = LayoutInflater.from(context);
        C162457s7.A0D(from);
        this.A01 = from;
    }
}
